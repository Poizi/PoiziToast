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
@interface ToastKind {
    int NORMAL_TOAST = 0;
    int INFO_TOAST = 1;
    int ERROR_TOAST = 2;
    int SUCCESS_TOAST = 3;
    int WARNING_TOAST = 4;
}