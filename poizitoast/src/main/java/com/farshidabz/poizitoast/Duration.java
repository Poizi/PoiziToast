package com.farshidabz.poizitoast;

import android.support.annotation.IntDef;
import android.support.annotation.IntRange;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.LENGTH_SHORT;

/**
 * Created by FarshidAbz.
 * Since 2/21/2017.
 */

@IntDef({LENGTH_SHORT, LENGTH_LONG})
@IntRange(from = 1)
@Retention(RetentionPolicy.SOURCE)
@interface Duration {}