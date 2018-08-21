package io.ayte.utility.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Symbols marked with this annotation belong to public API, and end
 * users are encouraged to use them.
 */
@Retention(RetentionPolicy.SOURCE)
@Target({
        ElementType.TYPE,
        ElementType.ANNOTATION_TYPE,
        ElementType.METHOD
})
public @interface Api {}
