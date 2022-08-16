package com.android.ttcjpaysdk.base.theme.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import p003X.C135343c9S;

/* loaded from: classes17.dex */
public class CJPayCircleCheckBox extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    public CheckBox LIZJ;
    public View LIZLLL;

    /* renamed from: LJ */
    public boolean f25451LJ;
    public boolean LJFF;
    public Drawable LJI;
    public Drawable LJII;

    static {
        Covode.recordClassIndex(6584);
    }

    public CheckBox getCheckBox() {
        return this.LIZJ;
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        if (this.LIZJ.isChecked()) {
            setChecked(false);
        } else {
            setChecked(true);
        }
    }

    public void setIESNewStyle(boolean z) {
        this.LJFF = z;
    }

    public void setWithCircleWhenUnchecked(boolean z) {
        this.f25451LJ = z;
    }

    public CJPayCircleCheckBox(Context context) {
        super(context);
        MethodCollector.m14708i(393);
        this.LIZIZ = CastProtectorUtils.parseColor("#FE2C55");
        this.f25451LJ = false;
        this.LJFF = false;
        LIZ(context);
        MethodCollector.m14707o(393);
    }

    private void LIZ(Context context) {
        MethodCollector.m14708i(396);
        if (PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(396);
            return;
        }
        try {
            this.LIZIZ = Color.parseColor(C135343c9S.LIZ().LIZJ().LIZIZ.LIZ);
        } catch (Exception unused) {
        }
        this.LIZLLL = LayoutInflater.from(context).inflate(2131690584, this);
        this.LIZJ = (CheckBox) this.LIZLLL.findViewById(2131169775);
        this.LIZJ.setClickable(false);
        this.LIZLLL.setBackgroundColor(this.LIZIZ);
        setChecked(true);
        MethodCollector.m14707o(396);
    }

    public void setChecked(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LIZJ.setChecked(z);
        if (z) {
            this.LIZLLL.setBackgroundColor(this.LIZIZ);
            if (this.f25451LJ) {
                Drawable drawable = this.LJI;
                if (drawable != null) {
                    this.LIZJ.setBackgroundDrawable(drawable);
                    return;
                } else if (this.LJFF) {
                    this.LIZJ.setBackgroundResource(2130840346);
                    return;
                } else {
                    this.LIZJ.setBackgroundResource(2130840345);
                    return;
                }
            }
            return;
        }
        if (this.f25451LJ) {
            Drawable drawable2 = this.LJII;
            if (drawable2 != null) {
                this.LIZJ.setBackgroundDrawable(drawable2);
            } else if (this.LJFF) {
                this.LIZJ.setBackgroundResource(2130840344);
            } else {
                this.LIZJ.setBackgroundResource(2130840342);
            }
        }
        this.LIZLLL.setBackgroundColor(CastProtectorUtils.parseColor("#00000000"));
    }

    public CJPayCircleCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(394);
        this.LIZIZ = CastProtectorUtils.parseColor("#FE2C55");
        this.f25451LJ = false;
        this.LJFF = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130772068, 2130772100, 2130772101});
        this.LJI = obtainStyledAttributes.getDrawable(0);
        this.LJII = obtainStyledAttributes.getDrawable(1);
        this.f25451LJ = obtainStyledAttributes.getBoolean(2, false);
        LIZ(context);
        MethodCollector.m14707o(394);
    }

    public CJPayCircleCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(395);
        this.LIZIZ = CastProtectorUtils.parseColor("#FE2C55");
        this.f25451LJ = false;
        this.LJFF = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130772068, 2130772100, 2130772101});
        this.LJI = obtainStyledAttributes.getDrawable(0);
        this.LJII = obtainStyledAttributes.getDrawable(1);
        this.f25451LJ = obtainStyledAttributes.getBoolean(2, false);
        LIZ(context);
        MethodCollector.m14707o(395);
    }
}
