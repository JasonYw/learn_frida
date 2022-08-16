package com.android.ttcjpaysdk.base.p135ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.imageloader.C2153b;
import com.android.ttcjpaysdk.base.settings.bean.InsuranceConfiguration;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C135267c8E;
import p003X.C135343c9S;
import p003X.C136992ca3;

/* renamed from: com.android.ttcjpaysdk.base.ui.widget.InsuranceTipsView */
/* loaded from: classes17.dex */
public final class InsuranceTipsView extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public ImageView LIZIZ;
    public LinearLayout LIZJ;
    public TextView LIZLLL;

    /* renamed from: LJ */
    public InsuranceConfiguration f25459LJ;
    public boolean LJFF;
    public int LJI;

    static {
        Covode.recordClassIndex(6693);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InsuranceTipsView(Context context) {
        this(context, null);
        C106862S5w.LIZ(context);
    }

    public final void setVisibility(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        setVisibility(0);
        this.LIZJ.setVisibility(0);
        if (z) {
            this.LIZIZ.setVisibility(0);
            this.LIZLLL.setVisibility(8);
        } else if (this.LJFF) {
            this.LIZIZ.setVisibility(8);
            this.LIZLLL.setVisibility(0);
        } else {
            setVisibility(8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InsuranceTipsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C106862S5w.LIZ(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsuranceTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(433);
        C136992ca3 LIZ2 = C136992ca3.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        InsuranceConfiguration LJII = LIZ2.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        this.f25459LJ = LJII;
        this.LJI = -1;
        View.inflate(getContext(), 2131690739, this);
        View findViewById = findViewById(2131188341);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZJ = (LinearLayout) findViewById;
        View findViewById2 = findViewById(2131179193);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZIZ = (ImageView) findViewById2;
        View findViewById3 = findViewById(2131195582);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LIZLLL = (TextView) findViewById3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130774419, 2130774734});
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "");
        this.LJFF = obtainStyledAttributes.getBoolean(0, false);
        this.LJI = obtainStyledAttributes.getInt(1, -1);
        obtainStyledAttributes.recycle();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            if (this.f25459LJ.show) {
                int i2 = this.LJI;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (C135343c9S.LIZ().LIZ(getContext())) {
                            str = this.f25459LJ.light_icon;
                        } else {
                            str = this.f25459LJ.dark_icon;
                        }
                    } else {
                        str = this.f25459LJ.dark_icon;
                    }
                } else {
                    str = this.f25459LJ.light_icon;
                }
                C2153b LIZ3 = C2153b.LJI.LIZ();
                if (LIZ3 != null) {
                    LIZ3.LIZ(str, new C135267c8E(this));
                    MethodCollector.m14707o(433);
                    return;
                }
                MethodCollector.m14707o(433);
                return;
            }
            setVisibility(false);
        }
        MethodCollector.m14707o(433);
    }
}
