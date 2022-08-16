package com.android.ttcjpaysdk.thirdparty.balancewithdraw.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService;
import com.android.ttcjpaysdk.base.service.bean.NormalBindCardBean;
import com.android.ttcjpaysdk.thirdparty.data.C2342n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.util.HashMap;
import java.util.Map;
import p003X.AbstractActivityC135574cDB;
import p003X.C116971W2r;
import p003X.C135565cD2;
import p003X.C135567cD4;
import p003X.C136246cO1;
import p003X.GOY;

/* loaded from: classes17.dex */
public final class CJPayWithdrawTransitionActivity extends AbstractActivityC135574cDB {
    public static ChangeQuickRedirect LIZIZ;
    public final C135567cD4 LJI = new C135567cD4(this);
    public HashMap LJII;

    static {
        Covode.recordClassIndex(8063);
    }

    @Override // p003X.AbstractActivityC135564cD1
    public final String LJIILIIL() {
        return "withdraw";
    }

    @Override // p003X.AbstractActivityC135574cDB, p003X.AbstractActivityC135564cD1, p003X.AbstractActivityC135991cJu, p003X.AbstractActivityC136021cKO
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 5).isSupported && (hashMap = this.LJII) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.AbstractActivityC135574cDB, p003X.AbstractActivityC135564cD1, p003X.AbstractActivityC135991cJu, p003X.AbstractActivityC136021cKO
    public final View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 4);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJII == null) {
            this.LJII = new HashMap();
        }
        View view = (View) this.LJII.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJII.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // p003X.AbstractActivityC135991cJu, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 16).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 11).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 10).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 9).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // p003X.AbstractActivityC135574cDB, p003X.AbstractActivityC135564cD1, p003X.AbstractActivityC135991cJu, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 14).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZIZ, true, 13).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZIZ, true, 12).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 15).isSupported) {
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

    @Override // p003X.AbstractActivityC135574cDB
    public final void LIZIZ() {
        C2342n c2342n;
        C2342n c2342n2;
        ICJPayNormalBindCardService iCJPayNormalBindCardService;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1).isSupported && (c2342n = C136246cO1.LIZJ) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (c2342n.isAuth()) {
                LIZ(currentTimeMillis);
                EventManager.INSTANCE.notify(new C135565cD2());
            } else if (c2342n.user_info.need_auth_guide) {
                if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 3).isSupported || (c2342n2 = C136246cO1.LIZJ) == null || (iCJPayNormalBindCardService = (ICJPayNormalBindCardService) CJPayServiceManager.getInstance().getIService(ICJPayNormalBindCardService.class)) == null) {
                    return;
                }
                ICJPayNormalBindCardService.BindCardType bindCardType = ICJPayNormalBindCardService.BindCardType.TYPE_BALANCE;
                NormalBindCardBean normalBindCardBean = new NormalBindCardBean();
                normalBindCardBean.setProcessInfo(c2342n2.process_info.toJson());
                normalBindCardBean.setTotalAmount("");
                normalBindCardBean.setType(ICJPayNormalBindCardService.SourceType.WithDrawMain);
                normalBindCardBean.setHostInfoJSON(CJPayHostInfo.Companion.LIZIZ(C136246cO1.LIZIZ));
                normalBindCardBean.setBindCardWithPay(Boolean.FALSE);
                normalBindCardBean.setBindSourceType(7);
                normalBindCardBean.setFront(true);
                iCJPayNormalBindCardService.startBindCardProcess(this, bindCardType, normalBindCardBean, this.LJI);
            } else {
                LIZ(currentTimeMillis);
            }
        }
    }

    private final void LIZ(long j) {
        int i;
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZIZ, false, 2).isSupported) {
            return;
        }
        C2118a.LIZ().LIZ(110).LIZIZ();
        Intent intent = new Intent(this, CJPayWithdrawActivity.class);
        if (j != 0) {
            intent.putExtra("CJPayKeyWithdrawStartTimeParams", j);
        }
        C116971W2r.LIZIZ(this, intent);
        Map<String, Integer> map = CJPayHostInfo.animationResourceMap;
        if (map != null) {
            if ((!map.isEmpty()) && map.containsKey("TTCJPayKeyActivityAddInAnimationResource")) {
                Integer num = map.get("TTCJPayKeyActivityAddInAnimationResource");
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                overridePendingTransition(i, 0);
            }
        } else {
            overridePendingTransition(2130968809, 0);
        }
        LIZ();
    }

    @Override // p003X.AbstractActivityC135564cD1, p003X.AbstractActivityC135991cJu, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZIZ, false, 6).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZIZ, true, 8).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZIZ, true, 7).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
    }
}
