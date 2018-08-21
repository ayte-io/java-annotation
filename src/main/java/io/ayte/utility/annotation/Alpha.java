package io.ayte.utility.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks API as alpha, i.e. with very high risk to change in next
 * releases.
 */
@Target({
        ElementType.TYPE,
        ElementType.ANNOTATION_TYPE,
        ElementType.METHOD,
        ElementType.CONSTRUCTOR,
        ElementType.PACKAGE
})
@Retention(RetentionPolicy.RUNTIME)
public @interface Alpha {}
