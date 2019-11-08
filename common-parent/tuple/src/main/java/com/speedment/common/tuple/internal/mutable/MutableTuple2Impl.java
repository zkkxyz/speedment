/**
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
package com.speedment.common.tuple.internal.mutable;

import com.speedment.common.tuple.MutableTuple;
import com.speedment.common.tuple.internal.AbstractMutableTuple;
import com.speedment.common.tuple.mutable.MutableTuple2;

import java.util.Optional;

/**
 * An implementation class of a {@link MutableTuple2}.
 * <p>
 * Generated by com.speedment.sources.pattern.tuple.TupleImplPattern
 * 
 * @param <T0> type of element 0
 * @param <T1> type of element 1
 * 
 * @author Per Minborg
 */
public final class MutableTuple2Impl<T0, T1> 
extends AbstractMutableTuple 
implements MutableTuple2<T0, T1> {
    
    /**
     * Constructs a {@link MutableTuple} of type {@link MutableTuple2}.
     */
    public MutableTuple2Impl() {
        super(MutableTuple2Impl.class, 2);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Optional<T0> get0() {
        return Optional.ofNullable((T0) values[0]);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public Optional<T1> get1() {
        return Optional.ofNullable((T1) values[1]);
    }
    
    @Override
    public void set0(T0 t0) {
        values[0] = t0;
    }
    
    @Override
    public void set1(T1 t1) {
        values[1] = t1;
    }
}