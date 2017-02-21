package com.farshidabz.poizitoast;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by FarshidAbz.
 * Since 2/21/2017.
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.PARAMETER)
@interface Gravity {
    int TOP() default 48;

    int BOTTOM() default 80;
}
