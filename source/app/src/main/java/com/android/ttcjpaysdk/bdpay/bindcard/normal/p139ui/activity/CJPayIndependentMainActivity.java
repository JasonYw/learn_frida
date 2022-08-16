package com.android.ttcjpaysdk.bdpay.bindcard.normal.p139ui.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.android.ttcjpaysdk.base.framework.BaseActivity;
import com.android.ttcjpaysdk.base.framework.mvp.nothing.LoggerNothing;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.p135ui.widget.CJPayTextLoadingView;
import com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService;
import com.android.ttcjpaysdk.base.service.bean.NormalBindCardBean;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.p138b.C2189a;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.presenter.C2192d;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.view.AbstractC2197d;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayCardAddBean;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractActivityC135987cJq;
import p003X.C106862S5w;
import p003X.C135542cCf;
import p003X.C135731cFi;
import p003X.C136058cKz;
import p003X.GOY;

/* renamed from: com.android.ttcjpaysdk.bdpay.bindcard.normal.ui.activity.CJPayIndependentMainActivity */
/* loaded from: classes17.dex */
public final class CJPayIndependentMainActivity extends AbstractActivityC135987cJq<C2192d, LoggerNothing> implements AbstractC2197d {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZJ;

    /* renamed from: LJ */
    public CJPayTextLoadingView f25465LJ;
    public HashMap LJFF;
    public String LIZIZ = "";
    public String LIZLLL = "";

    static {
        Covode.recordClassIndex(6880);
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported && (hashMap = this.LJFF) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 21);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJFF == null) {
            this.LJFF = new HashMap();
        }
        View view = (View) this.LJFF.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJFF.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final void bindViews() {
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final int getLayoutId() {
        return 2131690564;
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initActions() {
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initData() {
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void next() {
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 30).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 25).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    public final void LIZ(boolean z) {
        CJPayTextLoadingView cJPayTextLoadingView;
        int i = 0;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 9).isSupported && (cJPayTextLoadingView = this.f25465LJ) != null) {
            if (!z) {
                i = 8;
            }
            cJPayTextLoadingView.setVisibility(i);
        }
    }

    @Override // com.android.ttcjpaysdk.bdpay.bindcard.normal.view.e$c
    public final void LIZ(CJPayCardAddBean cJPayCardAddBean) {
        if (!PatchProxy.proxy(new Object[]{cJPayCardAddBean}, this, LIZ, false, 17).isSupported && !PatchProxy.proxy(new Object[]{this, cJPayCardAddBean}, null, C135542cCf.LIZ, true, 11).isSupported) {
            C135731cFi.LIZ(this, cJPayCardAddBean);
        }
    }

    @Override // com.android.ttcjpaysdk.bdpay.bindcard.normal.view.e$c
    public final void LIZ(String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, LIZ, false, 19).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2, str3);
        if (PatchProxy.proxy(new Object[]{this, str, str2, str3}, null, C135542cCf.LIZ, true, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2, str3);
        C135731cFi.LIZ(this, str, str2, str3);
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, android.app.Activity
    public final void finish() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.finish();
        C136058cKz.LIZIZ(this);
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final /* synthetic */ C2124b getModel() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (C2189a) proxy.result;
        }
        return new C2189a();
    }

    private final String LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.LIZIZ)) {
                jSONObject.put("bind_card_info", new JSONObject(this.LIZIZ));
            }
        } catch (Exception unused) {
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
        return jSONObject2;
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initViews() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        findViewById(2131170063);
        this.f25465LJ = (CJPayTextLoadingView) findViewById(2131169742);
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 28).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 27).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 26).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 29).isSupported) {
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

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C2192d c2192d;
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 1).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        initData();
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
        getWindow().setSoftInputMode(3);
        setHalfTranslucent();
        setStatusBarColor("#00000000");
        LIZ(true);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && (c2192d = (C2192d) this.mBasePresenter) != null) {
            c2192d.LIZ(this, "payment_manage", this.LIZLLL, LIZ());
        }
    }

    @Override // com.android.ttcjpaysdk.bdpay.bindcard.normal.view.e$c
    public final String LIZ(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{this, str, str2}, null, C135542cCf.LIZ, true, 15);
        if (proxy2.isSupported) {
            return (String) proxy2.result;
        }
        return C135731cFi.LIZ(this, str, str2);
    }

    @Override // com.android.ttcjpaysdk.bdpay.bindcard.normal.view.e$c
    public final void LIZ(Activity activity, String str) {
        if (PatchProxy.proxy(new Object[]{activity, str}, this, LIZ, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (!PatchProxy.proxy(new Object[]{this, activity, str}, null, C135542cCf.LIZ, true, 8).isSupported) {
            C106862S5w.LIZ(str);
            C135731cFi.LIZ(this, activity, str);
        }
    }

    @Override // com.android.ttcjpaysdk.bdpay.bindcard.normal.view.e$c
    public final void LIZ(Activity activity, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{activity, jSONObject}, this, LIZ, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(activity, jSONObject);
        if (!PatchProxy.proxy(new Object[]{this, activity, jSONObject}, null, C135542cCf.LIZ, true, 2).isSupported) {
            C106862S5w.LIZ(activity, jSONObject);
            if (!PatchProxy.proxy(new Object[]{this, activity, jSONObject, null, 4, null}, null, C135542cCf.LIZ, true, 4).isSupported) {
                C135542cCf.LIZ(this, activity, jSONObject, (NormalBindCardBean) null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.ttcjpaysdk.bdpay.bindcard.normal.view.e$c
    public final void LIZ(Activity activity, ICJPayNormalBindCardService.SourceType sourceType, boolean z) {
        if (PatchProxy.proxy(new Object[]{activity, sourceType, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(sourceType);
        if (!PatchProxy.proxy(new Object[]{this, activity, sourceType, Byte.valueOf((byte) z)}, null, C135542cCf.LIZ, true, 9).isSupported) {
            C106862S5w.LIZ(sourceType);
            C135731cFi.LIZ(this, activity, sourceType, z);
        }
    }

    @Override // com.android.ttcjpaysdk.bdpay.bindcard.normal.view.e$c
    public final void LIZ(BaseActivity baseActivity, JSONObject jSONObject, NormalBindCardBean normalBindCardBean) {
        if (PatchProxy.proxy(new Object[]{baseActivity, jSONObject, normalBindCardBean}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(baseActivity, jSONObject);
        if (!PatchProxy.proxy(new Object[]{this, baseActivity, jSONObject, normalBindCardBean}, null, C135542cCf.LIZ, true, 1).isSupported) {
            C106862S5w.LIZ(baseActivity, jSONObject);
            C135542cCf.LIZ(this, baseActivity, jSONObject, normalBindCardBean);
        }
    }
}
