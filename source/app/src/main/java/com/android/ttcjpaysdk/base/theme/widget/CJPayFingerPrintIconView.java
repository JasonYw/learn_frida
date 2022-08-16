package com.android.ttcjpaysdk.base.theme.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitor;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import p003X.C135343c9S;

/* loaded from: classes28.dex */
public class CJPayFingerPrintIconView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public View LIZIZ;
    public ImageView LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public boolean f25453LJ;
    public int LJFF;
    public int LJI;

    static {
        Covode.recordClassIndex(6587);
    }

    private void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        this.LIZJ.getLayoutParams().width = this.LJI;
        this.LIZJ.getLayoutParams().height = this.LJI;
        if (this.f25453LJ) {
            this.LIZIZ.setVisibility(0);
            this.LIZIZ.getLayoutParams().height = this.LJFF;
            this.LIZIZ.getLayoutParams().width = this.LJFF;
            this.LIZJ.setImageResource(2130840361);
        } else {
            this.LIZIZ.setVisibility(8);
            this.LIZJ.setImageResource(2130840362);
        }
        try {
            this.LIZLLL = Color.parseColor(C135343c9S.LIZ().LIZJ().LIZJ.LIZ);
        } catch (Exception unused) {
        }
        this.LIZJ.setBackgroundColor(this.LIZLLL);
    }

    public CJPayFingerPrintIconView(Context context) {
        super(context);
        MethodCollector.m14708i(397);
        this.LIZLLL = CastProtectorUtils.parseColor("#FE2C55");
        this.f25453LJ = false;
        this.LJFF = CJPayBasicUtils.dipToPX(getContext(), 88.0f);
        this.LJI = CJPayBasicUtils.dipToPX(getContext(), 60.0f);
        LIZ(context, null);
        MethodCollector.m14707o(397);
    }

    public CJPayFingerPrintIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dipToPX;
        MethodCollector.m14708i(398);
        this.LIZLLL = CastProtectorUtils.parseColor("#FE2C55");
        this.f25453LJ = false;
        this.LJFF = CJPayBasicUtils.dipToPX(getContext(), 88.0f);
        this.LJI = CJPayBasicUtils.dipToPX(getContext(), 60.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130772070, 2130772071, 2130772102});
        this.f25453LJ = obtainStyledAttributes.getBoolean(2, false);
        this.LJFF = (int) obtainStyledAttributes.getDimension(0, CJPayBasicUtils.dipToPX(getContext(), 88.0f));
        if (this.f25453LJ) {
            dipToPX = CJPayBasicUtils.dipToPX(getContext(), 54.0f);
        } else {
            dipToPX = CJPayBasicUtils.dipToPX(getContext(), 60.0f);
        }
        this.LJI = (int) obtainStyledAttributes.getDimension(1, dipToPX);
        LIZ(context, attributeSet);
        MethodCollector.m14707o(398);
    }

    private void LIZ(Context context, AttributeSet attributeSet) {
        MethodCollector.m14708i(SDKMonitor.SDK_VERSION);
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(SDKMonitor.SDK_VERSION);
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(2131690734, this);
        this.LIZIZ = inflate.findViewById(2131169833);
        this.LIZJ = (ImageView) inflate.findViewById(2131169832);
        LIZ();
        MethodCollector.m14707o(SDKMonitor.SDK_VERSION);
    }

    public final void LIZ(boolean z, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{(byte) 1, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.f25453LJ = true;
        this.LJFF = i;
        this.LJI = i2;
        LIZ();
    }

    public CJPayFingerPrintIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int dipToPX;
        MethodCollector.m14708i(399);
        this.LIZLLL = CastProtectorUtils.parseColor("#FE2C55");
        this.f25453LJ = false;
        this.LJFF = CJPayBasicUtils.dipToPX(getContext(), 88.0f);
        this.LJI = CJPayBasicUtils.dipToPX(getContext(), 60.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130772070, 2130772071, 2130772102});
        this.f25453LJ = obtainStyledAttributes.getBoolean(2, false);
        this.LJFF = (int) obtainStyledAttributes.getDimension(0, CJPayBasicUtils.dipToPX(getContext(), 88.0f));
        if (this.f25453LJ) {
            dipToPX = CJPayBasicUtils.dipToPX(getContext(), 54.0f);
        } else {
            dipToPX = CJPayBasicUtils.dipToPX(getContext(), 60.0f);
        }
        this.LJI = (int) obtainStyledAttributes.getDimension(1, dipToPX);
        LIZ(context, attributeSet);
        MethodCollector.m14707o(399);
    }
}
