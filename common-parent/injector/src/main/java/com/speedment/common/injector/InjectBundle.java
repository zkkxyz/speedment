/*
 *
 * Copyright (c) 2006-2019, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.common.injector;

import java.util.stream.Stream;

import static java.util.Objects.requireNonNull;

/**
 * An InjectBundle can be used to represent a collection of classes to be injected.
 *
 * @author Per Minborg
 */
@FunctionalInterface
public interface InjectBundle {

    /**
     * Returns a Stream of classes that are to be provided to an Injector.
     *
     * @return a Stream of classes that are to be provided to an Injector
     */
    Stream<Class<?>> injectables();

    static InjectBundle empty() {
        return Stream::empty;
    }

    static InjectBundle of(Class<?>... classes) {
        requireNonNull(classes);
        return () -> Stream.of(classes);
    }

    default InjectBundle withBundle(InjectBundle next) {
        requireNonNull(next);
        return () -> Stream.concat(injectables(), next.injectables());
    }

    default InjectBundle withComponent(Class<?> nextClass) {
        requireNonNull(nextClass);
        return withBundle(of(nextClass));
    }
}
