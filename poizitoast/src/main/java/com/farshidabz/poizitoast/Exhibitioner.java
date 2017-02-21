package com.farshidabz.poizitoast;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by FarshidAbz.
 * Since 2/21/2017.
 */

public class Exhibitioner {
    private Context context;
    private PoiziToastOptionModel poiziToastOptionModel;

    Exhibitioner(Context context, PoiziToastOptionModel poiziToastOptionModel) {
        this.context = context;
        this.poiziToastOptionModel = poiziToastOptionModel;
    }

    public void show() {
        final Toast toast = new Toast(context);
        final View toastLayout = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(R.layout.poizi_toast_layout, null);

        ImageView imgToastIcon = (ImageView) toastLayout.findViewById(R.id.imgToastIcon);
        TextView tvToastText = (TextView) toastLayout.findViewById(R.id.tvToastText);
        LinearLayout llPoiziToastRoot = (LinearLayout) toastLayout.findViewById(R.id.llPoiziToastRoot);

        initLlPoiziToastRoot(llPoiziToastRoot);
        initToastText(tvToastText);
        initToastIcon(imgToastIcon);

        toast.setView(toastLayout);

        toast.setDuration(poiziToastOptionModel.getDuration());

        setGravity(toast);

        toast.show();
    }

    private void setGravity(Toast toast) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        toast.setGravity(poiziToastOptionModel.getGravity(),
                0, Math.round(64 * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT)));
    }

    private void initLlPoiziToastRoot(LinearLayout llPoiziToastRoot) {
        Drawable drawableFrame;
        if (poiziToastOptionModel.getBackgroundColor() == 0) {
            drawableFrame = PoiziToastUtils.getDrawable(context, R.drawable.toast_frame);
        } else {
            drawableFrame = PoiziToastUtils.tint9PatchDrawableFrame(context, poiziToastOptionModel.getBackgroundColor());
        }

        PoiziToastUtils.setBackground(llPoiziToastRoot, drawableFrame);
    }

    private void initToastIcon(ImageView imgToastIcon) {
        if (poiziToastOptionModel.getIcon() <= 0) {
            imgToastIcon.setVisibility(View.GONE);
        } else {
            imgToastIcon.setImageResource(poiziToastOptionModel.getIcon());
        }
    }

    private void initToastText(TextView tvToastText) {
        tvToastText.setText(poiziToastOptionModel.getMessage());
        tvToastText.setTextColor(poiziToastOptionModel.getTextColor());
        tvToastText.setTypeface(poiziToastOptionModel.getTextTypeFace());
        tvToastText.setTextSize(TypedValue.COMPLEX_UNIT_SP, poiziToastOptionModel.getTextSize());
    }
}
