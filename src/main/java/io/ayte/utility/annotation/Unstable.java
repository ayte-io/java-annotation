package io.ayte.utility.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Marks specific symbol as most likely to be changed in near future.
 * Symbols marked with this annotation should not belong to public
 * releases.
 *
 * Example of proper usage:
 *
 * <code>
 *     {@literal}Unstable(reason = "It doesn't actually pipe X to Y, so it should be renamed")
 *     Sink pipe(Producer producer);
 * </code>
 */
@Retention(RetentionPolicy.SOURCE)
public @interface Unstable {
    String reason() default "";
}
