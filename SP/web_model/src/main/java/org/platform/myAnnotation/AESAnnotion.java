package org.platform.myAnnotation;

import java.lang.annotation.*;

/**
 * Created by liuzhongshuai on 16/5/27.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AESAnnotion {
    public String type() default "AES";
}
