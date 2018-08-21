package io.ayte.utility.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks API as beta or 'probably stable with no guarantees'.
 */
@Target({
        ElementType.TYPE,
        ElementType.ANNOTATION_TYPE,
        ElementType.METHOD,
        ElementType.CONSTRUCTOR,
        ElementType.PACKAGE
})
@Retention(RetentionPolicy.RUNTIME)
public @interface Beta {}
