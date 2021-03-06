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
package com.speedment.common.codegen.constant;

import com.speedment.common.codegen.model.Import;
import com.speedment.common.codegen.model.JavadocTag;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import static java.util.Objects.requireNonNull;

/**
 *
 * @author Emil Forslund
 */
public enum DefaultJavadocTag implements JavadocTag {
    
    PARAM      ("param"),
    AUTHOR     ("author"),
    DEPRECATED ("deprecated"),
    RETURN     ("return"),
    SEE        ("see"),
    THROWS     ("throws"),
    SINCE      ("since"),
    VERSION    ("version");
    
    private final String name;
    
    /**
     * Constructs the JavadocTag based on the name.
     * 
     * @param name  the name
     */
    DefaultJavadocTag(String name) {
        this.name = requireNonNull(name);
    }
    
    /**
     * {@inheritDoc}
     * <p>
     * Since this is a constant, the model will first be copied and the
     * operation will then be performed on the copy.
     */
    @Override
    public JavadocTag setName(String name) {
        return copy().setName(requireNonNull(name));
    }

    /**
     * {@inheritDoc}
     * <p>
     * Since this is a constant, the model will first be copied and the
     * operation will then be performed on the copy.
     */
    @Override
    public JavadocTag setValue(String value) {
        return copy().setValue(value);
    }

    /**
     * {@inheritDoc}
     * <p>
     * Since this is a constant, the model will first be copied and the
     * operation will then be performed on the copy.
     */
    @Override
    public JavadocTag setText(String text) {
        return copy().setText(text);
    }
    
    /**
     * {@inheritDoc}
     * <p>
     * Since this is a constant, the model will first be copied and the
     * operation will then be performed on the copy.
     */
    @Override
    public JavadocTag call(Consumer<JavadocTag> procedure) {
        final JavadocTag copy = copy();
        requireNonNull(procedure).accept(copy);
        return copy;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Optional<String> getValue() {
        return Optional.empty();
    }

    @Override
    public Optional<String> getText() {
        return Optional.empty();
    }

    @Override
    public List<Import> getImports() {
        return Collections.emptyList();
    }

    @Override
    public JavadocTag copy() {
        return JavadocTag.of(name);
    }
}