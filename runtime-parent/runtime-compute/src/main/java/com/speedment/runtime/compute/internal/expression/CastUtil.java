package com.speedment.runtime.compute.internal.expression;

import com.speedment.runtime.compute.*;
import com.speedment.runtime.compute.expression.Expression;
import com.speedment.runtime.compute.expression.UnaryExpression;

import static java.util.Objects.requireNonNull;

/**
 * Utility class for creating expression that casts the result of another
 * expression into some type, preserving as much metadata as possible.
 *
 * @author Emil Forslund
 * @since  3.1.0
 */
public final class CastUtil {
    
    ////////////////////////////////////////////////////////////////////////////
    //                               ToDouble                                 //
    ////////////////////////////////////////////////////////////////////////////

    /**
     * Returns an expression that wraps the specified expression and casts the
     * result from it into a {@code double}.
     *
     * @param original  the original expression
     * @param <T>       the input type
     * @return          the new {@link ToDouble} expression
     */
    public static <T> ToDouble<T> castToDouble(ToByte<T> original) {
        class ByteToDouble extends CastToDouble<T, ToByte<T>> {
            private ByteToDouble(ToByte<T> tToByte) {
                super(tToByte);
            }

            @Override
            public double applyAsDouble(T object) {
                return inner.applyAsByte(object);
            }
        }

        return new ByteToDouble(original);
    }

    /**
     * Returns an expression that wraps the specified expression and casts the
     * result from it into a {@code double}.
     *
     * @param original  the original expression
     * @param <T>       the input type
     * @return          the new {@link ToDouble} expression
     */
    public static <T> ToDouble<T> castToDouble(ToShort<T> original) {
        class ShortToDouble extends CastToDouble<T, ToShort<T>> {
            private ShortToDouble(ToShort<T> tToShort) {
                super(tToShort);
            }

            @Override
            public double applyAsDouble(T object) {
                return inner.applyAsShort(object);
            }
        }

        return new ShortToDouble(original);
    }

    /**
     * Returns an expression that wraps the specified expression and casts the
     * result from it into a {@code double}.
     *
     * @param original  the original expression
     * @param <T>       the input type
     * @return          the new {@link ToDouble} expression
     */
    public static <T> ToDouble<T> castToDouble(ToInt<T> original) {
        class IntToDouble extends CastToDouble<T, ToInt<T>> {
            private IntToDouble(ToInt<T> tToInt) {
                super(tToInt);
            }

            @Override
            public double applyAsDouble(T object) {
                return inner.applyAsInt(object);
            }
        }

        return new IntToDouble(original);
    }

    /**
     * Returns an expression that wraps the specified expression and casts the
     * result from it into a {@code double}.
     *
     * @param original  the original expression
     * @param <T>       the input type
     * @return          the new {@link ToDouble} expression
     */
    public static <T> ToDouble<T> castToDouble(ToLong<T> original) {
        class LongToDouble extends CastToDouble<T, ToLong<T>> {
            private LongToDouble(ToLong<T> tToLong) {
                super(tToLong);
            }

            @Override
            public double applyAsDouble(T object) {
                return inner.applyAsLong(object);
            }
        }

        return new LongToDouble(original);
    }

    /**
     * Returns an expression that wraps the specified expression and casts the
     * result from it into a {@code double}.
     *
     * @param original  the original expression
     * @param <T>       the input type
     * @return          the new {@link ToDouble} expression
     */
    public static <T> ToDouble<T> castToDouble(ToFloat<T> original) {
        class FloatToDouble extends CastToDouble<T, ToFloat<T>> {
            private FloatToDouble(ToFloat<T> tToFloat) {
                super(tToFloat);
            }

            @Override
            public double applyAsDouble(T object) {
                return inner.applyAsFloat(object);
            }
        }

        return new FloatToDouble(original);
    }

    /**
     * Returns an expression that wraps the specified expression and casts the
     * result from it into a {@code double}.
     *
     * @param original  the original expression
     * @param <T>       the input type
     * @return          the new {@link ToDouble} expression
     */
    public static <T> ToDouble<T> castToDouble(ToBoolean<T> original) {
        class BooleanToDouble extends CastToDouble<T, ToBoolean<T>> {
            private BooleanToDouble(ToBoolean<T> tToBoolean) {
                super(tToBoolean);
            }

            @Override
            public double applyAsDouble(T object) {
                return inner.applyAsBoolean(object) ? 1 : 0;
            }
        }

        return new BooleanToDouble(original);
    }

    /**
     * Returns an expression that wraps the specified expression and casts the
     * result from it into a {@code double}.
     *
     * @param original  the original expression
     * @param <T>       the input type
     * @return          the new {@link ToDouble} expression
     */
    public static <T> ToDouble<T> castToDouble(ToChar<T> original) {
        class CharToDouble extends CastToDouble<T, ToChar<T>> {
            private CharToDouble(ToChar<T> tToChar) {
                super(tToChar);
            }

            @Override
            public double applyAsDouble(T object) {
                return inner.applyAsChar(object);
            }
        }

        return new CharToDouble(original);
    }

    ////////////////////////////////////////////////////////////////////////////
    //                                  ToInt                                 //
    ////////////////////////////////////////////////////////////////////////////

    /**
     * Returns an expression that wraps the specified expression and casts the
     * result from it into a {@code int}.
     *
     * @param original  the original expression
     * @param <T>       the input type
     * @return          the new {@link ToInt} expression
     */
    public static <T> ToInt<T> castToInt(ToByte<T> original) {
        class ByteToInt extends CastToInt<T, ToByte<T>> {
            private ByteToInt(ToByte<T> tToByte) {
                super(tToByte);
            }

            @Override
            public int applyAsInt(T object) {
                return inner.applyAsByte(object);
            }
        }

        return new ByteToInt(original);
    }

    /**
     * Returns an expression that wraps the specified expression and casts the
     * result from it into a {@code int}.
     *
     * @param original  the original expression
     * @param <T>       the input type
     * @return          the new {@link ToInt} expression
     */
    public static <T> ToInt<T> castToInt(ToShort<T> original) {
        class ShortToInt extends CastToInt<T, ToShort<T>> {
            private ShortToInt(ToShort<T> tToShort) {
                super(tToShort);
            }

            @Override
            public int applyAsInt(T object) {
                return inner.applyAsShort(object);
            }
        }

        return new ShortToInt(original);
    }

    /**
     * Returns an expression that wraps the specified expression and casts the
     * result from it into a {@code int}.
     *
     * @param original  the original expression
     * @param <T>       the input type
     * @return          the new {@link ToInt} expression
     */
    public static <T> ToInt<T> castToInt(ToLong<T> original) {
        class LongToInt extends CastToInt<T, ToLong<T>> {
            private LongToInt(ToLong<T> tToLong) {
                super(tToLong);
            }

            @Override
            public int applyAsInt(T object) {
                return (int) inner.applyAsLong(object);
            }
        }

        return new LongToInt(original);
    }

    /**
     * Returns an expression that wraps the specified expression and casts the
     * result from it into a {@code int}.
     *
     * @param original  the original expression
     * @param <T>       the input type
     * @return          the new {@link ToInt} expression
     */
    public static <T> ToInt<T> castToInt(ToFloat<T> original) {
        class FloatToInt extends CastToInt<T, ToFloat<T>> {
            private FloatToInt(ToFloat<T> tToFloat) {
                super(tToFloat);
            }

            @Override
            public int applyAsInt(T object) {
                return (int) inner.applyAsFloat(object);
            }
        }

        return new FloatToInt(original);
    }

    /**
     * Returns an expression that wraps the specified expression and casts the
     * result from it into a {@code int}.
     *
     * @param original  the original expression
     * @param <T>       the input type
     * @return          the new {@link ToInt} expression
     */
    public static <T> ToInt<T> castToInt(ToDouble<T> original) {
        class DoubleToInt extends CastToInt<T, ToDouble<T>> {
            private DoubleToInt(ToDouble<T> tToDouble) {
                super(tToDouble);
            }

            @Override
            public int applyAsInt(T object) {
                return (int) inner.applyAsDouble(object);
            }
        }

        return new DoubleToInt(original);
    }

    /**
     * Returns an expression that wraps the specified expression and casts the
     * result from it into a {@code int}.
     *
     * @param original  the original expression
     * @param <T>       the input type
     * @return          the new {@link ToInt} expression
     */
    public static <T> ToInt<T> castToInt(ToBoolean<T> original) {
        class BooleanToInt extends CastToInt<T, ToBoolean<T>> {
            private BooleanToInt(ToBoolean<T> tToBoolean) {
                super(tToBoolean);
            }

            @Override
            public int applyAsInt(T object) {
                return inner.applyAsBoolean(object) ? 1 : 0;
            }
        }

        return new BooleanToInt(original);
    }

    /**
     * Returns an expression that wraps the specified expression and casts the
     * result from it into a {@code int}.
     *
     * @param original  the original expression
     * @param <T>       the input type
     * @return          the new {@link ToInt} expression
     */
    public static <T> ToInt<T> castToInt(ToChar<T> original) {
        class CharToInt extends CastToInt<T, ToChar<T>> {
            private CharToInt(ToChar<T> tToChar) {
                super(tToChar);
            }

            @Override
            public int applyAsInt(T object) {
                return inner.applyAsChar(object);
            }
        }

        return new CharToInt(original);
    }

    ////////////////////////////////////////////////////////////////////////////
    //                                 ToLong                                 //
    ////////////////////////////////////////////////////////////////////////////

    /**
     * Returns an expression that wraps the specified expression and casts the
     * result from it into a {@code long}.
     *
     * @param original  the original expression
     * @param <T>       the input type
     * @return          the new {@link ToLong} expression
     */
    public static <T> ToLong<T> castToLong(ToByte<T> original) {
        class ByteToLong extends CastToLong<T, ToByte<T>> {
            private ByteToLong(ToByte<T> tToByte) {
                super(tToByte);
            }

            @Override
            public long applyAsLong(T object) {
                return inner.applyAsByte(object);
            }
        }

        return new ByteToLong(original);
    }

    /**
     * Returns an expression that wraps the specified expression and casts the
     * result from it into a {@code long}.
     *
     * @param original  the original expression
     * @param <T>       the input type
     * @return          the new {@link ToLong} expression
     */
    public static <T> ToLong<T> castToLong(ToShort<T> original) {
        class ShortToLong extends CastToLong<T, ToShort<T>> {
            private ShortToLong(ToShort<T> tToShort) {
                super(tToShort);
            }

            @Override
            public long applyAsLong(T object) {
                return inner.applyAsShort(object);
            }
        }

        return new ShortToLong(original);
    }

    /**
     * Returns an expression that wraps the specified expression and casts the
     * result from it into a {@code long}.
     *
     * @param original  the original expression
     * @param <T>       the input type
     * @return          the new {@link ToLong} expression
     */
    public static <T> ToLong<T> castToLong(ToInt<T> original) {
        class IntToLong extends CastToLong<T, ToInt<T>> {
            private IntToLong(ToInt<T> tToInt) {
                super(tToInt);
            }

            @Override
            public long applyAsLong(T object) {
                return inner.applyAsInt(object);
            }
        }

        return new IntToLong(original);
    }

    /**
     * Returns an expression that wraps the specified expression and casts the
     * result from it into a {@code long}.
     *
     * @param original  the original expression
     * @param <T>       the input type
     * @return          the new {@link ToLong} expression
     */
    public static <T> ToLong<T> castToLong(ToFloat<T> original) {
        class FloatToLong extends CastToLong<T, ToFloat<T>> {
            private FloatToLong(ToFloat<T> tToFloat) {
                super(tToFloat);
            }

            @Override
            public long applyAsLong(T object) {
                return (long) inner.applyAsFloat(object);
            }
        }

        return new FloatToLong(original);
    }

    /**
     * Returns an expression that wraps the specified expression and casts the
     * result from it into a {@code long}.
     *
     * @param original  the original expression
     * @param <T>       the input type
     * @return          the new {@link ToLong} expression
     */
    public static <T> ToLong<T> castToLong(ToDouble<T> original) {
        class DoubleToLong extends CastToLong<T, ToDouble<T>> {
            private DoubleToLong(ToDouble<T> tToDouble) {
                super(tToDouble);
            }

            @Override
            public long applyAsLong(T object) {
                return (long) inner.applyAsDouble(object);
            }
        }

        return new DoubleToLong(original);
    }

    /**
     * Returns an expression that wraps the specified expression and casts the
     * result from it into a {@code long}.
     *
     * @param original  the original expression
     * @param <T>       the input type
     * @return          the new {@link ToLong} expression
     */
    public static <T> ToLong<T> castToLong(ToBoolean<T> original) {
        class BooleanToLong extends CastToLong<T, ToBoolean<T>> {
            private BooleanToLong(ToBoolean<T> tToBoolean) {
                super(tToBoolean);
            }

            @Override
            public long applyAsLong(T object) {
                return inner.applyAsBoolean(object) ? 1 : 0;
            }
        }

        return new BooleanToLong(original);
    }

    /**
     * Returns an expression that wraps the specified expression and casts the
     * result from it into a {@code long}.
     *
     * @param original  the original expression
     * @param <T>       the input type
     * @return          the new {@link ToLong} expression
     */
    public static <T> ToLong<T> castToLong(ToChar<T> original) {
        class CharToLong extends CastToLong<T, ToChar<T>> {
            private CharToLong(ToChar<T> tToChar) {
                super(tToChar);
            }

            @Override
            public long applyAsLong(T object) {
                return inner.applyAsChar(object);
            }
        }

        return new CharToLong(original);
    }

    ////////////////////////////////////////////////////////////////////////////
    //                                Internal                                //
    ////////////////////////////////////////////////////////////////////////////

    /**
     * Internal abstract implementation of the cast operation that casts to a
     * {@code double}.
     *
     * @param <T>      the input type
     * @param <INNER>  the inner expression type
     */
    private abstract static class CastToDouble<T, INNER extends Expression>
        extends AbstractCase<INNER> implements ToDouble<T> {
        CastToDouble(INNER inner) {
            super(inner);
        }
    }

    /**
     * Internal abstract implementation of the cast operation that casts to an
     * {@code int}.
     *
     * @param <T>      the input type
     * @param <INNER>  the inner expression type
     */
    private abstract static class CastToInt<T, INNER extends Expression>
        extends AbstractCase<INNER> implements ToInt<T> {
        CastToInt(INNER inner) {
            super(inner);
        }
    }

    /**
     * Internal abstract implementation of the cast operation that casts to a
     * {@code long}.
     *
     * @param <T>      the input type
     * @param <INNER>  the inner expression type
     */
    private abstract static class CastToLong<T, INNER extends Expression>
    extends AbstractCase<INNER> implements ToLong<T> {
        CastToLong(INNER inner) {
            super(inner);
        }
    }

    /**
     * Internal abstract implementation of the cast operation.
     *
     * @param <INNER>  the inner expression type
     */
    private abstract static class AbstractCase<INNER extends Expression>
    implements UnaryExpression<INNER> {

        final INNER inner;

        AbstractCase(INNER inner) {
            this.inner = requireNonNull(inner);
        }

        @Override
        public final INNER getInner() {
            return inner;
        }

        @Override
        public final Operator getOperator() {
            return Operator.CAST;
        }
    }

    /**
     * Utility classes should not be instantiated.
     */
    private CastUtil() {}
}
