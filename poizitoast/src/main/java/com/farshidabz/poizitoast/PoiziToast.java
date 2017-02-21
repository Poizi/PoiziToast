package com.farshidabz.poizitoast;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;

/**
 * Created by FarshidAbz.
 * Since 2/21/2017.
 */

public class PoiziToast {
    private static Context context;
    private static PoiziToast poiziToast;
    private Exhibitioner exhibitioner;

    private PoiziToastOptionModel poiziToastOptionModel;

    private PoiziToast(Context context) {
        if (poiziToast == null) {
            poiziToast = this;
        }

        PoiziToast.context = context;

        poiziToastOptionModel = new PoiziToastOptionModel();
        exhibitioner = new Exhibitioner(context, poiziToastOptionModel);
    }

    public static PoiziToast with(Context context) {
        poiziToast = null;
        new PoiziToast(context);
        return poiziToast;
    }

    public Exhibitioner normal(String message, @Duration int duration) {
        poiziToastOptionModel.setMessage(message);
        poiziToastOptionModel.setDuration(duration);
        poiziToastOptionModel.setToastKind(ToastKind.NORMAL_TOAST);
        return exhibitioner;
    }

    public Exhibitioner info(String message, @Duration int duration) {
        poiziToastOptionModel.setMessage(message);
        poiziToastOptionModel.setDuration(duration);
        poiziToastOptionModel.setToastKind(ToastKind.INFO_TOAST);
        return exhibitioner;
    }

    public Exhibitioner error(String message, @Duration int duration) {
        poiziToastOptionModel.setMessage(message);
        poiziToastOptionModel.setDuration(duration);
        poiziToastOptionModel.setToastKind(ToastKind.ERROR_TOAST);
        return exhibitioner;
    }

    public Exhibitioner success(String message, @Duration int duration) {
        poiziToastOptionModel.setMessage(message);
        poiziToastOptionModel.setDuration(duration);
        poiziToastOptionModel.setToastKind(ToastKind.SUCCESS_TOAST);
        return exhibitioner;
    }

    public Exhibitioner warning(String message, @Duration int duration) {
        poiziToastOptionModel.setMessage(message);
        poiziToastOptionModel.setDuration(duration);
        poiziToastOptionModel.setToastKind(ToastKind.WARNING_TOAST);
        return exhibitioner;
    }

    public Exhibitioner makeToast(String message, @Duration int duration) {
        poiziToastOptionModel.setMessage(message);
        poiziToastOptionModel.setDuration(duration);
        return exhibitioner;
    }

    public PoiziToast setTextTypeFace(Typeface textTypeFace) {
        poiziToastOptionModel.setTextTypeFace(textTypeFace);
        return poiziToast;
    }

    public PoiziToast setBackgroundColor(@ColorInt int backgroundColor) {
        poiziToastOptionModel.setBackgroundColor(backgroundColor);
        return poiziToast;
    }

    public PoiziToast setGravity(@com.farshidabz.poizitoast.Gravity int gravity) {
        poiziToastOptionModel.setGravity(gravity);
        return poiziToast;
    }

    public PoiziToast setTextSize(int textSize) {
        poiziToastOptionModel.setTextSize(textSize);
        return poiziToast;
    }

    public PoiziToast setTextColor(@ColorRes int textColor) {
        poiziToastOptionModel.setTextColor(textColor);
        return poiziToast;
    }

    public PoiziToast setIcon(@DrawableRes int icon) {
        poiziToastOptionModel.setIcon(icon);
        return poiziToast;
    }
}
