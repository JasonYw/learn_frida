package com.android.ttcjpaysdk.base.theme.widget;

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
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;
import p003X.C135343c9S;
import p003X.F4Q;

/* loaded from: classes28.dex */
public class CJPaySquareCheckBox extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public F4Q LIZJ;
    public int LIZLLL = CastProtectorUtils.parseColor("#FE2C55");

    /* renamed from: LJ */
    public CheckBox f25455LJ;
    public View LJFF;
    public FrameLayout LJI;

    static {
        Covode.recordClassIndex(6590);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setOnCheckedChangeListener(F4Q f4q) {
        this.LIZJ = f4q;
    }

    public CJPaySquareCheckBox(Context context) {
        super(context);
        MethodCollector.m14708i(401);
        LIZ(context);
        MethodCollector.m14707o(401);
    }

    public void setChecked(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.f25455LJ.setChecked(z);
        if (z) {
            this.LJI.setBackgroundColor(this.LIZLLL);
        } else {
            this.LJI.setBackgroundColor(CastProtectorUtils.parseColor("#00000000"));
        }
        this.LIZIZ = z;
    }

    private void LIZ(Context context) {
        MethodCollector.m14708i(BdpDebugHttpRequest.HTTP_NOT_FOUND);
        if (PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(BdpDebugHttpRequest.HTTP_NOT_FOUND);
            return;
        }
        try {
            this.LIZLLL = Color.parseColor(C135343c9S.LIZ().LIZJ().LIZIZ.LIZ);
        } catch (Exception unused) {
        }
        this.LJFF = LayoutInflater.from(context).inflate(2131690585, this);
        this.f25455LJ = (CheckBox) this.LJFF.findViewById(2131169775);
        this.LJI = (FrameLayout) this.LJFF.findViewById(2131169776);
        this.LJFF.setOnClickListener(new View.OnClickListener() { // from class: com.android.ttcjpaysdk.base.theme.widget.CJPaySquareCheckBox.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(6591);
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
        MethodCollector.m14707o(BdpDebugHttpRequest.HTTP_NOT_FOUND);
    }

    public CJPaySquareCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(402);
        LIZ(context);
        MethodCollector.m14707o(402);
    }

    public CJPaySquareCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(403);
        LIZ(context);
        MethodCollector.m14707o(403);
    }
}
