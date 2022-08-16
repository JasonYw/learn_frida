package com.android.ttcjpaysdk.base.theme.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import p003X.C135264c8B;
import p003X.C135268c8F;
import p003X.C135343c9S;

/* loaded from: classes17.dex */
public class CJPayCustomButton extends AppCompatTextView {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Context mContext;
    public GradientDrawable mGradientDrawable;
    public int mStartBackgroundColor = CastProtectorUtils.parseColor("#FE2C55");
    public int mEndBackgroundColor = CastProtectorUtils.parseColor("#FE2C55");
    public int mTextColor = CastProtectorUtils.parseColor("#ffffff");
    public int mDisableTextColor = CastProtectorUtils.parseColor("#ffffff");
    public int mCorner = 5;
    public float mDisableAlpha = 0.5f;
    public int mDisableStartBgColor = -1;
    public int mDisableEndBgColor = -1;

    static {
        Covode.recordClassIndex(6585);
    }

    private void initColor() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        try {
            C135264c8B c135264c8B = C135343c9S.LIZ().LIZJ().LIZJ;
            this.mStartBackgroundColor = Color.parseColor(c135264c8B.LIZ);
            this.mEndBackgroundColor = Color.parseColor(c135264c8B.LIZIZ);
        } catch (Exception unused) {
        }
        try {
            this.mTextColor = Color.parseColor(C135343c9S.LIZ().LIZJ().LIZJ.f17898LJ);
        } catch (Exception unused2) {
        }
        try {
            this.mCorner = Integer.parseInt(C135343c9S.LIZ().LIZJ().LIZJ.LJFF);
        } catch (Exception unused3) {
        }
        try {
            C135264c8B c135264c8B2 = C135343c9S.LIZ().LIZJ().LIZJ;
            this.mDisableStartBgColor = Color.parseColor(c135264c8B2.LIZJ);
            this.mDisableEndBgColor = Color.parseColor(c135264c8B2.LIZLLL);
        } catch (Exception unused4) {
        }
        try {
            this.mDisableAlpha = (float) C135343c9S.LIZ().LIZJ().LIZJ.LJI;
        } catch (Exception unused5) {
        }
        try {
            this.mDisableTextColor = getColorWithAlpha(this.mDisableAlpha, this.mTextColor);
        } catch (Exception unused6) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C135268c8F.LIZ(this, 0.75f);
        super.onDraw(canvas);
    }

    public CJPayCustomButton(Context context) {
        super(context);
        initView(context);
    }

    private void initView(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        this.mContext = context;
        initColor();
        setTextColor(this.mTextColor);
        this.mGradientDrawable = createDrawable(this.mStartBackgroundColor, this.mEndBackgroundColor, this.mCorner);
        int i = Build.VERSION.SDK_INT;
        setBackground(this.mGradientDrawable);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        super.setEnabled(z);
        if (z) {
            this.mGradientDrawable = createDrawable(this.mStartBackgroundColor, this.mEndBackgroundColor, this.mCorner);
            setTextColor(this.mTextColor);
        } else {
            setTextColor(this.mDisableTextColor);
            if (this.mDisableStartBgColor == -1 && this.mDisableEndBgColor == -1) {
                this.mGradientDrawable = createDrawable(getColorWithAlpha(this.mDisableAlpha, this.mStartBackgroundColor), getColorWithAlpha(this.mDisableAlpha, this.mEndBackgroundColor), this.mCorner);
            } else {
                this.mGradientDrawable = createDrawable(this.mDisableStartBgColor, this.mDisableEndBgColor, this.mCorner);
            }
        }
        int i = Build.VERSION.SDK_INT;
        setBackground(this.mGradientDrawable);
    }

    private int getColorWithAlpha(float f, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Float.valueOf(f), Integer.valueOf(i)}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return (Math.min((int) MotionEventCompat.ACTION_MASK, Math.max(0, (int) (f * 255.0f))) << 24) + (i & ViewCompat.MEASURED_SIZE_MASK);
    }

    public CJPayCustomButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    private GradientDrawable createDrawable(int i, int i2, int i3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (GradientDrawable) proxy.result;
        }
        float dipToPX = CJPayBasicUtils.dipToPX(this.mContext, i3);
        float[] fArr = {dipToPX, dipToPX, dipToPX, dipToPX, dipToPX, dipToPX, dipToPX, dipToPX};
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{i, i2});
        gradientDrawable.setCornerRadii(fArr);
        return gradientDrawable;
    }

    public CJPayCustomButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }
}
