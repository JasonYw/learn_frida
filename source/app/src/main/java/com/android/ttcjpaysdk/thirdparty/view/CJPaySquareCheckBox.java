package com.android.ttcjpaysdk.thirdparty.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import p003X.C116971W2r;
import p003X.C135343c9S;
import p003X.F4P;

/* loaded from: classes28.dex */
public class CJPaySquareCheckBox extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public F4P LIZJ;
    public int LIZLLL = CastProtectorUtils.parseColor("#FE2C55");

    /* renamed from: LJ */
    public CheckBox f25549LJ;
    public View LJFF;
    public FrameLayout LJI;

    static {
        Covode.recordClassIndex(9236);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setOnCheckedChangeListener(F4P f4p) {
        this.LIZJ = f4p;
    }

    public CJPaySquareCheckBox(Context context) {
        super(context);
        MethodCollector.m14708i(568);
        LIZ(context);
        MethodCollector.m14707o(568);
    }

    public void setChecked(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.f25549LJ.setChecked(z);
        if (z) {
            this.LJI.setBackgroundColor(this.LIZLLL);
        } else {
            this.LJI.setBackgroundColor(C116971W2r.LIZ(getContext(), 2131623991));
        }
        this.LIZIZ = z;
    }

    private void LIZ(Context context) {
        MethodCollector.m14708i(571);
        if (PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(571);
            return;
        }
        try {
            this.LIZLLL = Color.parseColor(C135343c9S.LIZ().LIZJ().LIZIZ.LIZ);
        } catch (Exception unused) {
        }
        this.LJFF = LayoutInflater.from(context).inflate(2131690585, this);
        this.f25549LJ = (CheckBox) this.LJFF.findViewById(2131169775);
        this.LJI = (FrameLayout) this.LJFF.findViewById(2131169776);
        this.LJFF.setOnClickListener(new View.OnClickListener() { // from class: com.android.ttcjpaysdk.thirdparty.view.CJPaySquareCheckBox.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(9237);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                if (CJPaySquareCheckBox.this.LIZJ != null) {
                    CJPaySquareCheckBox.this.LIZJ.LIZ(!CJPaySquareCheckBox.this.LIZIZ);
                }
                CJPaySquareCheckBox cJPaySquareCheckBox = CJPaySquareCheckBox.this;
                cJPaySquareCheckBox.setChecked(true ^ cJPaySquareCheckBox.LIZIZ);
            }
        });
        int dipToPX = CJPayBasicUtils.dipToPX(context, 8.0f);
        this.LJFF.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.LJFF.setPadding(dipToPX, dipToPX, dipToPX, dipToPX);
        setChecked(false);
        MethodCollector.m14707o(571);
    }

    public CJPaySquareCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(569);
        LIZ(context);
        MethodCollector.m14707o(569);
    }

    public CJPaySquareCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(570);
        LIZ(context);
        MethodCollector.m14707o(570);
    }
}
