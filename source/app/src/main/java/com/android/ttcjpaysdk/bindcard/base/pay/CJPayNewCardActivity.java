package com.android.ttcjpaysdk.bindcard.base.pay;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.android.ttcjpaysdk.base.eventbus.AbstractC2126a;
import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayNewCardCallback;
import com.android.ttcjpaysdk.base.service.ICJPayVerifyQueryService;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.bindcard.base.C2208b;
import com.android.ttcjpaysdk.bindcard.base.a$c;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayNewCardBean;
import com.android.ttcjpaysdk.bindcard.base.p140a.C2199b;
import com.android.ttcjpaysdk.bindcard.base.p141b.C2210b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractActivityC135987cJq;
import p003X.AbstractC135757cG8;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C135465cBQ;
import p003X.C135517cCG;
import p003X.C135536cCZ;
import p003X.C135549cCm;
import p003X.C135734cFl;
import p003X.C135753cG4;
import p003X.C135754cG5;
import p003X.C135755cG6;
import p003X.C135761cGC;
import p003X.C135766cGH;
import p003X.C135767cGI;
import p003X.C135768cGJ;
import p003X.C135876cI3;
import p003X.C136058cKz;
import p003X.GOY;

/* loaded from: classes17.dex */
public final class CJPayNewCardActivity extends AbstractActivityC135987cJq<C2210b, C2199b> implements AbstractC2126a, a$c {
    public static ChangeQuickRedirect LIZ;
    public ICJPayVerifyQueryService LIZLLL;

    /* renamed from: LJ */
    public long f25471LJ;
    public HashMap LJI;
    public String LIZIZ = "";
    public HashSet<String> LIZJ = new HashSet<>();
    public final C135753cG4 LJFF = new C135753cG4(this);

    static {
        Covode.recordClassIndex(7046);
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported && (hashMap = this.LJI) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 15);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJI == null) {
            this.LJI = new HashMap();
        }
        View view = (View) this.LJI.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJI.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final void bindViews() {
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final int getLayoutId() {
        return 2131690559;
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initActions() {
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void next() {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final /* synthetic */ C2124b getModel() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (C2208b) proxy.result;
        }
        return new C2208b();
    }

    @Override // com.android.ttcjpaysdk.base.eventbus.AbstractC2126a
    public final Class<? extends BaseEvent>[] listEvents() {
        return new Class[]{C135754cG5.class, C135768cGJ.class, C135517cCG.class, C135549cCm.class, C135536cCZ.class};
    }

    private final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        ICJPayNewCardCallback LIZIZ = C135876cI3.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.showLoading(false);
        }
        EventManager.INSTANCE.notifyNow(new C135767cGI());
        finish();
        C136058cKz.LIZIZ(this);
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initData() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported && getIntent() != null) {
            try {
                LIZ(C135465cBQ.LIZ(this.LIZIZ));
            } catch (Exception unused) {
                AbstractC135757cG8 LIZ2 = C135766cGH.LIZ.LIZ(this, "");
                if (LIZ2 != null) {
                    LIZ2.LIZ(new CJPayNewCardBean(), null);
                }
            }
        }
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initViews() {
        View layoutRootView;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported && (layoutRootView = getLayoutRootView()) != null) {
            getContext();
            layoutRootView.setBackgroundColor(C116971W2r.LIZ(getResources(), 2131623991));
        }
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
        ICJPayVerifyQueryService iCJPayVerifyQueryService = this.LIZLLL;
        if (iCJPayVerifyQueryService != null) {
            iCJPayVerifyQueryService.release();
        }
        EventManager.INSTANCE.unregister(this);
    }

    public final String LIZ() {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String str = "";
        HashSet<String> hashSet = this.LIZJ;
        if (hashSet != null) {
            for (Object obj : hashSet) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                String str2 = (String) obj;
                if (i == 0) {
                    str = str + str2;
                } else {
                    str = str + ',' + str2;
                }
                i = i2;
            }
        }
        return str;
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 22).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 21).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported) {
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

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LIZJ.add(str);
    }

    private final void LIZ(JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 7).isSupported) {
            return;
        }
        ICJPayNewCardCallback LIZIZ = C135876cI3.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.showLoading(true);
        }
        C2210b c2210b = (C2210b) this.mBasePresenter;
        if (c2210b != null) {
            c2210b.LIZ(jSONObject);
        }
        this.f25471LJ = System.currentTimeMillis();
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 2).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 4).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 3).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
        EventManager.INSTANCE.register(this);
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final void onEvent(BaseEvent baseEvent) {
        boolean areEqual;
        if (PatchProxy.proxy(new Object[]{baseEvent}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(baseEvent);
        if (baseEvent instanceof C135754cG5) {
            C135754cG5 c135754cG5 = (C135754cG5) baseEvent;
            if (c135754cG5.isFromBindCard()) {
                JSONObject jSONObject = new JSONObject(C135465cBQ.LIZ(this.LIZIZ), new String[]{"sign_no", "pwd_token", "process_info"});
                jSONObject.put("faceParams", c135754cG5.getFaceCheckParamsForCashDesk());
                LIZ(jSONObject);
            }
        } else if (baseEvent instanceof C135768cGJ) {
            LIZ(C135465cBQ.LIZ(this.LIZIZ));
        } else if (baseEvent instanceof C135517cCG) {
            LIZIZ();
        } else if (baseEvent instanceof C135549cCm) {
            C135549cCm c135549cCm = (C135549cCm) baseEvent;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], c135549cCm, C135549cCm.LIZ, false, 1);
            if (proxy.isSupported) {
                areEqual = ((Boolean) proxy.result).booleanValue();
            } else {
                areEqual = Intrinsics.areEqual("pay_new_card", c135549cCm.LIZIZ);
            }
            if (!areEqual) {
                baseEvent = null;
            }
            if (baseEvent != null) {
                LIZIZ();
            }
        } else if (baseEvent instanceof C135536cCZ) {
            finish();
            C136058cKz.LIZIZ(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [boolean, int] */
    @Override // com.android.ttcjpaysdk.bindcard.base.a$c
    public final void LIZ(CJPayNewCardBean cJPayNewCardBean) {
        C2199b c2199b;
        L l;
        if (PatchProxy.proxy(new Object[]{cJPayNewCardBean}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C2199b c2199b2 = this.mvpLogger;
        if (c2199b2 != null) {
            c2199b2.LIZ(System.currentTimeMillis() - this.f25471LJ, true);
        }
        this.f25471LJ = 0L;
        ICJPayNewCardCallback LIZIZ = C135876cI3.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.showLoading(false);
        }
        if (cJPayNewCardBean == null) {
            AbstractC135757cG8 LIZ2 = C135766cGH.LIZ.LIZ(this, "");
            if (LIZ2 != null) {
                LIZ2.LIZ(new CJPayNewCardBean(), null);
                return;
            }
            return;
        }
        String str = "0";
        if (cJPayNewCardBean.exts != null && !TextUtils.isEmpty(cJPayNewCardBean.exts.pay_after_use_open_status) && (l = this.mvpLogger) != 0) {
            String str2 = cJPayNewCardBean.code;
            String str3 = cJPayNewCardBean.msg;
            ?? areEqual = Intrinsics.areEqual("success", cJPayNewCardBean.exts.pay_after_use_open_status);
            String str4 = cJPayNewCardBean.exts.activity_id;
            String str5 = cJPayNewCardBean.exts.bill_page_display_text;
            if (!PatchProxy.proxy(new Object[]{str2, str3, Integer.valueOf(areEqual == true ? 1 : 0), str4, str5}, l, C2199b.LIZ, false, 2).isSupported) {
                try {
                    JSONObject LIZ3 = CJPayParamsUtils.LIZ(C135876cI3.LJI(), C135876cI3.LJII());
                    LIZ3.put("error_code", str2);
                    LIZ3.put(PushMessageHelper.ERROR_MESSAGE, str3);
                    LIZ3.put("result", (int) areEqual);
                    LIZ3.put("open_source", "支付中");
                    LIZ3.put("activity_id", str4);
                    LIZ3.put("activity_label", str5);
                    LIZ3.put("is_bankcard", str);
                    C135734cFl.LIZ("wallet_cashier_payafteruse_open_result", LIZ3);
                } catch (Throwable unused) {
                }
            }
        }
        if (!Intrinsics.areEqual(cJPayNewCardBean.code, "MP000000") && !Intrinsics.areEqual(cJPayNewCardBean.code, "CD000000")) {
            C135761cGC c135761cGC = C135766cGH.LIZ;
            String str6 = cJPayNewCardBean.code;
            Intrinsics.checkNotNullExpressionValue(str6, "");
            AbstractC135757cG8 LIZ4 = c135761cGC.LIZ(this, str6);
            if (LIZ4 != null) {
                LIZ4.LIZ(cJPayNewCardBean, null);
            }
        } else {
            this.LIZLLL = (ICJPayVerifyQueryService) CJPayServiceManager.getInstance().getIService(ICJPayVerifyQueryService.class);
            ICJPayVerifyQueryService iCJPayVerifyQueryService = this.LIZLLL;
            if (iCJPayVerifyQueryService != null) {
                iCJPayVerifyQueryService.initVerifyQuery(this.LJFF, new C135755cG6(this, cJPayNewCardBean));
            }
            ICJPayVerifyQueryService iCJPayVerifyQueryService2 = this.LIZLLL;
            if (iCJPayVerifyQueryService2 != null) {
                iCJPayVerifyQueryService2.start();
            }
        }
        if (C135465cBQ.LIZ(this.LIZIZ).has("faceParams") && (c2199b = this.mvpLogger) != null) {
            if (cJPayNewCardBean.face_verify_info.hasSrc()) {
                str = "1";
            }
            c2199b.LIZ(this, str, CJPayJsonParser.toJsonObject(cJPayNewCardBean));
        }
    }

    @Override // com.android.ttcjpaysdk.bindcard.base.a$c
    public final void LIZ(String str, String str2) {
        C2199b c2199b;
        String str3;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 13).isSupported) {
            return;
        }
        C2199b c2199b2 = this.mvpLogger;
        if (c2199b2 != null) {
            c2199b2.LIZ(System.currentTimeMillis() - this.f25471LJ, false);
        }
        this.f25471LJ = 0L;
        ICJPayNewCardCallback LIZIZ = C135876cI3.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.showLoading(false);
        }
        AbstractC135757cG8 LIZ2 = C135766cGH.LIZ.LIZ(this, "");
        String str4 = null;
        if (LIZ2 != null) {
            LIZ2.LIZ(new CJPayNewCardBean(), null);
        }
        JSONObject LIZ3 = C135465cBQ.LIZ(this.LIZIZ);
        if (LIZ3.has("faceParams") && (c2199b = this.mvpLogger) != null) {
            JSONObject optJSONObject = LIZ3.optJSONObject("faceParams");
            if (optJSONObject != null) {
                str4 = optJSONObject.optString("face_scene");
            }
            if (TextUtils.equals(str4, "cj_live_check")) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            c2199b.LIZ(this, str3, new JSONObject());
        }
    }
}
