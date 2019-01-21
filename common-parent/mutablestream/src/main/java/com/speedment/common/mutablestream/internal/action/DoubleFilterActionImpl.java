/**
 *
 * Copyright (c) 2006-2018, Speedment, Inc. All Rights Reserved.
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
package com.speedment.common.mutablestream.internal.action;

import com.speedment.common.mutablestream.HasNext;
import com.speedment.common.mutablestream.action.Action;
import com.speedment.common.mutablestream.action.DoubleFilterAction;
import java.util.function.DoublePredicate;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import static java.util.Objects.requireNonNull;

/**
 *
 * @author  Emil Forslund
 * @since   1.0.0
 */
public final class DoubleFilterActionImpl extends AbstractAction<Double, DoubleStream, Double, DoubleStream> implements DoubleFilterAction {

    private final DoublePredicate predicate;
    
    public DoubleFilterActionImpl(HasNext<Double, DoubleStream> previous, DoublePredicate predicate) {
        super(previous);
        this.predicate = requireNonNull(predicate);
    }
    
    @Override
    public DoublePredicate getPredicate() {
        return predicate;
    }
    
    @Override
    public <Q, QS extends BaseStream<Q, QS>> HasNext<Q, QS> append(Action<Double, DoubleStream, Q, QS> next) {
        return next;
    }
    
    @Override
    public DoubleStream build(boolean parallel) {
        return previous().build(parallel).filter(predicate);
    }
}