package com.android.ttcjpaysdk.facelive.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.eventbus.AbstractC2126a;
import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.framework.BaseActivity;
import com.android.ttcjpaysdk.thirdparty.data.CJPayFaceVerifyInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C135100c5X;
import p003X.C135296c8h;
import p003X.C135385cA8;
import p003X.C135389cAC;
import p003X.C135391cAE;
import p003X.C135510cC9;
import p003X.C135511cCA;
import p003X.C135517cCG;
import p003X.C135522cCL;
import p003X.C135535cCY;
import p003X.C135536cCZ;
import p003X.C136058cKz;
import p003X.C76765GOh;
import p003X.C9H6;
import p003X.GOY;

/* loaded from: classes17.dex */
public final class CJPayFaceLiveSignActivity extends BaseActivity implements AbstractC2126a {
    public static ChangeQuickRedirect LIZ;

    /* renamed from: LJ */
    public static final C135535cCY f25493LJ = new C135535cCY((byte) 0);
    public FrameLayout LIZIZ;
    public final C135510cC9 LIZJ = new C135510cC9();
    public CJPayFaceVerifyInfo LIZLLL;
    public C135389cAC LJFF;

    static {
        Covode.recordClassIndex(7421);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public final int getLayout() {
        return 2131690549;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // com.android.ttcjpaysdk.base.eventbus.AbstractC2126a
    public final Class<? extends BaseEvent>[] listEvents() {
        return new Class[]{C135536cCZ.class};
    }

    @Override // android.app.Activity
    public final void finish() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        super.finish();
        C136058cKz.LIZIZ(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onBackPressed();
        EventManager.INSTANCE.notify(new C135517cCG());
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
        EventManager.INSTANCE.unregister(this);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 17).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 16).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
                    GOY.LIZLLL(this);
                    super.onStop();
                }
                if (EnterTransitionCrashOptimizer.getContext() != null) {
                    int i = Build.VERSION.SDK_INT;
                    try {
                        getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                    } catch (Throwable unused) {
                    }
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.android.ttcjpaysdk.base.eventbus.AbstractC2126a
    public final void onEvent(BaseEvent baseEvent) {
        if (PatchProxy.proxy(new Object[]{baseEvent}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(baseEvent);
        if (!(baseEvent instanceof C135536cCZ)) {
            baseEvent = null;
        }
        if (baseEvent != null) {
            C9H6.LIZ((Activity) this);
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 1).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 3).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 2).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
        C76765GOh.LIZ((Activity) this);
        setContentView(2131690549);
        EventManager.INSTANCE.register(this);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported && (intent = getIntent()) != null) {
            Serializable serializableExtra = intent.getSerializableExtra("key_face_content");
            if (!(serializableExtra instanceof CJPayFaceVerifyInfo)) {
                serializableExtra = null;
            }
            this.LIZLLL = (CJPayFaceVerifyInfo) serializableExtra;
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            View findViewById = findViewById(2131188354);
            Intrinsics.checkNotNullExpressionValue(findViewById, "");
            this.LIZIZ = (FrameLayout) findViewById;
            Intrinsics.checkNotNullExpressionValue(findViewById(2131188355), "");
            FrameLayout frameLayout = this.LIZIZ;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            this.LJFF = new C135389cAC(frameLayout);
            FrameLayout frameLayout2 = this.LIZIZ;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            C76765GOh.LIZ(this, frameLayout2);
            FrameLayout frameLayout3 = this.LIZIZ;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            frameLayout3.setBackgroundColor(C116971W2r.LIZ(getResources(), 2131623992));
            FrameLayout frameLayout4 = this.LIZIZ;
            if (frameLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            setStatusBar(frameLayout4);
            if (this.LIZLLL != null) {
                C135389cAC c135389cAC = this.LJFF;
                if (c135389cAC == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                CJPayFaceVerifyInfo cJPayFaceVerifyInfo = this.LIZLLL;
                Intrinsics.checkNotNull(cJPayFaceVerifyInfo);
                if (!PatchProxy.proxy(new Object[]{cJPayFaceVerifyInfo}, c135389cAC, C135389cAC.LIZ, false, 1).isSupported) {
                    C106862S5w.LIZ(cJPayFaceVerifyInfo);
                    String string = c135389cAC.mContext.getString(2131561619, cJPayFaceVerifyInfo.name_mask);
                    TextView textView = c135389cAC.LIZIZ;
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    textView.setText(C135100c5X.LIZ(string, StringsKt__StringsKt.indexOf$default((CharSequence) string, " ", 0, false, 6, (Object) null), StringsKt__StringsKt.lastIndexOf$default((CharSequence) string, " ", 0, false, 6, (Object) null)));
                    String string2 = c135389cAC.mContext.getString(2131561618, "《" + cJPayFaceVerifyInfo.agreement_desc + (char) 12299);
                    TextView textView2 = c135389cAC.LIZJ;
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    textView2.setText(C135100c5X.LIZ(string2, StringsKt__StringsKt.indexOf$default((CharSequence) string2, "《", 0, false, 6, (Object) null), StringsKt__StringsKt.indexOf$default((CharSequence) string2, "》", 0, false, 6, (Object) null) + 1, C135296c8h.LIZ(c135389cAC.mContext)));
                    c135389cAC.LIZJ.setOnClickListener(new C135511cCA(cJPayFaceVerifyInfo, c135389cAC));
                    C135385cA8 c135385cA8 = c135389cAC.f17920LJ;
                    CJPayFaceLiveSignWrapper$setData$$inlined$with$lambda$2 cJPayFaceLiveSignWrapper$setData$$inlined$with$lambda$2 = new CJPayFaceLiveSignWrapper$setData$$inlined$with$lambda$2(c135389cAC);
                    if (!PatchProxy.proxy(new Object[]{cJPayFaceLiveSignWrapper$setData$$inlined$with$lambda$2}, c135385cA8, C135385cA8.LIZ, false, 2).isSupported) {
                        C106862S5w.LIZ(cJPayFaceLiveSignWrapper$setData$$inlined$with$lambda$2);
                        c135385cA8.LIZLLL = cJPayFaceLiveSignWrapper$setData$$inlined$with$lambda$2;
                    }
                    c135389cAC.LIZLLL.getCheckBox().setOnCheckedChangeListener(new C135391cAE(c135389cAC));
                }
            }
            C135389cAC c135389cAC2 = this.LJFF;
            if (c135389cAC2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            CJPayFaceLiveSignActivity$initView$2 cJPayFaceLiveSignActivity$initView$2 = new CJPayFaceLiveSignActivity$initView$2(this);
            if (!PatchProxy.proxy(new Object[]{cJPayFaceLiveSignActivity$initView$2}, c135389cAC2, C135389cAC.LIZ, false, 2).isSupported) {
                C106862S5w.LIZ(cJPayFaceLiveSignActivity$initView$2);
                c135389cAC2.LJII = cJPayFaceLiveSignActivity$initView$2;
            }
        }
        C135522cCL.LIZ(C135522cCL.LIZLLL, this, "wallet_alivecheck_firstasignment_guide_imp", null, 4, null);
    }
}
