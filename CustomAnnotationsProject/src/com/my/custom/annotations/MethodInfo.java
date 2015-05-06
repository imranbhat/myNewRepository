package com.my.custom.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
 
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String author() default "Imran";
    String date();
    int revision() default 1;
    String comments();
    String myMetaData() default "Default Meta Data";
    //just adding a comment
}
	

