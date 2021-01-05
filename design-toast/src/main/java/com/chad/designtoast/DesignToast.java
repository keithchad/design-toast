package com.chad.designtoast;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;

public class DesignToast extends Toast {
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */

    public static final int TYPE_INFO = 0;
    public static final int TYPE_SUCCESS = 1;
    public static final int TYPE_WARNING = 2;
    public static final int TYPE_ERROR = 3;

    public static int LENGTH_LONG = Toast.LENGTH_LONG;
    public static int LENGTH_SHORT = Toast.LENGTH_SHORT;

    private final Context context;
    private View view;
    private int type;

    public DesignToast(Context context) {
        super(context);
        this.context = context;
    }

    public static DesignToast makeText(Context context, String message) {
        return makeText(context, message, LENGTH_SHORT, TYPE_INFO);
    }

    public static DesignToast makeText(Context context, String message, int duration) {
        return makeText(context, message, duration, TYPE_INFO);
    }

    public static DesignToast makeText(Context context, String message, int duration, int type) {
        DesignToast designToast = new DesignToast(context);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.custom_toast_container, null);

        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        TextView text = (TextView) view.findViewById(R.id.text);

        switch (type) {
            case TYPE_SUCCESS:
                icon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_check_circle_white_24dp));
                view.setBackground(ContextCompat.getDrawable(context, R.drawable.custom_toast_success_background));
                break;
            case TYPE_WARNING:
                icon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_warning_white_24dp));
                view.setBackground(ContextCompat.getDrawable(context, R.drawable.custom_toast_warn_background));
                break;
            case TYPE_ERROR:
                icon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_error_white_24dp));
                view.setBackground(ContextCompat.getDrawable(context, R.drawable.custom_toast_error_background));
                break;
            default:
                icon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_info_white_24dp));
                view.setBackground(ContextCompat.getDrawable(context, R.drawable.custom_toast_info_background));
                break;
        }

        text.setText(message);
        designToast.setDuration(duration);
        designToast.setView(view);

        designToast.view = view;
        designToast.type = type;
        return designToast;
    }

    @Override
    public void setText(@StringRes int resId) {
        setText(context.getString(resId));
    }

    @Override
    public void setText(CharSequence s) {
        if (view == null) {
            throw new RuntimeException("This Toast was not created with Toast.makeText()");
        }
        TextView tv = (TextView) view.findViewById(R.id.text);
        if (tv == null) {
            throw new RuntimeException("This Toast was not created with Toast.makeText()");
        }
        tv.setText(s);
    }

    /**
     * Set the icon resource id to display in the toast.
     * @param iconId    the resource id.
     */
    public void setIcon(@DrawableRes int iconId) {
        setIcon(ContextCompat.getDrawable(context, iconId));
    }

    /**
     * Set the icon to display in the toast.
     * @param icon  the drawable to set as icon.
     */
    public void setIcon(Drawable icon) {
        if (view == null) {
            throw new RuntimeException("This Toast was not created with Toast.makeText()");
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.icon);
        if (imageView == null) {
            throw new RuntimeException("This Toast was not created with Toast.makeText()");
        }
        imageView.setImageDrawable(icon);
    }

    /**
     * Set the type of the Toast.
     * @param type  the type to set.
     */
    public void setType(int type) {
        type = type;
    }

    /**
     * @return  the type of Toast which is actual used.
     */
    public int getType() {
        return type;
    }
}
