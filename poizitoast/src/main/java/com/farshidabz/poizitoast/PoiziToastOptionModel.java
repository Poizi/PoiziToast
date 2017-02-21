package com.farshidabz.poizitoast;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.ColorInt;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by FarshidAbz.
 * Since 2/21/2017.
 */

class PoiziToastOptionModel {
    private
    @ColorInt
    int DEFAULT_TEXT_COLOR = Color.parseColor("#FFFFFF");

    @ColorInt
    private
    int ERROR_COLOR = Color.parseColor("#e73d3d");

    private
    @ColorInt
    int INFO_COLOR = Color.parseColor("#0076FF");

    private
    @ColorInt
    int SUCCESS_COLOR = Color.parseColor("#37BC9B");

    private
    @ColorInt
    int WARNING_COLOR = Color.parseColor("#E08A1E");

    private int gravity;
    private int backgroundColor;
    private int icon;
    private int textColor;
    private int duration;

    private Typeface textTypeFace;
    private String message;
    private int textSize;

    private int toastKind;

    public int getToastKind() {
        return toastKind;
    }

    void setGravity(int gravity) {
        this.gravity = gravity;
    }

    void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    void setIcon(int icon) {
        this.icon = icon;
    }

    void setTextColor(int textColor) {
        this.textColor = textColor;
    }

    void setDuration(@Duration int duration) {
        this.duration = duration;
    }

    void setTextTypeFace(Typeface textTypeFace) {
        this.textTypeFace = textTypeFace;
    }

    void setMessage(String message) {
        this.message = message;
    }

    void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    private int getDefaultTextColor() {
        return DEFAULT_TEXT_COLOR;
    }

    public int getGravity() {
        if (gravity != 0)
            return gravity;
        return Gravity.BOTTOM;
    }

    int getBackgroundColor() {
        if (backgroundColor != 0)
            return backgroundColor;
        else {
            switch (toastKind) {
                case ToastKind.NORMAL_TOAST:
                    return 0;
                case ToastKind.INFO_TOAST:
                    return INFO_COLOR;
                case ToastKind.ERROR_TOAST:
                    return ERROR_COLOR;
                case ToastKind.SUCCESS_TOAST:
                    return SUCCESS_COLOR;
                case ToastKind.WARNING_TOAST:
                    return WARNING_COLOR;
                default:
                    return 0;
            }
        }
    }

    public int getIcon() {
        return icon;
    }

    public int getTextColor() {
        if (textColor != 0)
            return textColor;
        else
            return getDefaultTextColor();
    }

    public
    @Duration
    int getDuration() {
        if (duration != 0)
            return duration;
        return Toast.LENGTH_SHORT;
    }

    int getTextSize() {
        if (textSize != 0)
            return textSize;
        return 14;
    }

    void setToastKind(int toastKind) {
        this.toastKind = toastKind;
    }

    Typeface getTextTypeFace() {
        if (textTypeFace != null)
            return textTypeFace;
        return null;
    }

    String getMessage() {
        return message;
    }
}
