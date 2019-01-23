package ua.lviv.lgs.minimum;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface CarModels {
	String value() default "";
}
