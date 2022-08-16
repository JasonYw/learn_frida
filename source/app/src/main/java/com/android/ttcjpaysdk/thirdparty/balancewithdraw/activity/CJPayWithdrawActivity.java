package com.android.ttcjpaysdk.thirdparty.balancewithdraw.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.thirdparty.balance.p159d.C2297a;
import com.android.ttcjpaysdk.thirdparty.balancewithdraw.p164a.C2305a;
import com.android.ttcjpaysdk.thirdparty.balancewithdraw.p164a.C2306b;
import com.android.ttcjpaysdk.thirdparty.data.CJPayTradeConfirmResponseBean;
import com.android.ttcjpaysdk.thirdparty.verify.p176a.AbstractC2393c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractActivityC136332cPP;
import p003X.AbstractC136469cRc;
import p003X.AbstractC136473cRg;
import p003X.C136235cNq;
import p003X.C136275cOU;
import p003X.C136279cOY;
import p003X.C136283cOc;
import p003X.C136288cOh;
import p003X.C136289cOi;
import p003X.C136450cRJ;
import p003X.DialogC137460chc;
import p003X.GOY;
import p003X.View$OnClickListenerC135772cGN;

/* loaded from: classes17.dex */
public final class CJPayWithdrawActivity extends AbstractActivityC136332cPP {
    public static ChangeQuickRedirect LJI;
    public final Lazy LJII = LazyKt__LazyJVMKt.lazy(new CJPayWithdrawActivity$withdrawFragment$2(this));
    public final Lazy LJIIIIZZ = LazyKt__LazyJVMKt.lazy(CJPayWithdrawActivity$withdrawResultFragment$2.INSTANCE);
    public HashMap LJIIIZ;

    static {
        Covode.recordClassIndex(8057);
    }

    private final C2306b LJIILLIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJI, false, 2);
        return (C2306b) (proxy.isSupported ? proxy.result : this.LJIIIIZZ.mo27335getValue());
    }

    @Override // p003X.AbstractActivityC136332cPP
    public final void LIZ(CJPayTradeConfirmResponseBean cJPayTradeConfirmResponseBean) {
    }

    @Override // p003X.AbstractActivityC136332cPP
    public final void LJII() {
    }

    @Override // p003X.AbstractActivityC135564cD1
    public final String LJIILIIL() {
        return "withdraw";
    }

    public final C2305a LJIILL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJI, false, 1);
        return (C2305a) (proxy.isSupported ? proxy.result : this.LJII.mo27335getValue());
    }

    @Override // p003X.AbstractActivityC136332cPP, p003X.AbstractActivityC135564cD1, p003X.AbstractActivityC135991cJu, p003X.AbstractActivityC136021cKO
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LJI, false, 15).isSupported && (hashMap = this.LJIIIZ) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.AbstractActivityC136332cPP, p003X.AbstractActivityC135564cD1, p003X.AbstractActivityC135991cJu, p003X.AbstractActivityC136021cKO
    public final View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LJI, false, 14);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIIIZ == null) {
            this.LJIIIZ = new HashMap();
        }
        View view = (View) this.LJIIIZ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJIIIZ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // p003X.AbstractActivityC136332cPP, p003X.AbstractActivityC135991cJu, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 26).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 21).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 20).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 19).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // p003X.AbstractActivityC136332cPP
    /* renamed from: LJ */
    public final void mo16042LJ() {
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 5).isSupported) {
            return;
        }
        LIZ((Fragment) LJIILLIIL(), true);
    }

    @Override // p003X.AbstractActivityC136332cPP
    public final AbstractC136473cRg LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJI, false, 7);
        if (proxy.isSupported) {
            return (AbstractC136473cRg) proxy.result;
        }
        return new C136279cOY(this);
    }

    @Override // p003X.AbstractActivityC136332cPP
    public final AbstractC136469cRc LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJI, false, 8);
        if (proxy.isSupported) {
            return (AbstractC136469cRc) proxy.result;
        }
        return new C136275cOU(this);
    }

    @Override // p003X.AbstractActivityC135564cD1
    public final void LJIIL() {
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 9).isSupported) {
            return;
        }
        LIZ((Fragment) LJIILL(), false);
    }

    @Override // p003X.AbstractActivityC135991cJu, p003X.AbstractActivityC136021cKO, android.app.Activity
    public final void finish() {
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 10).isSupported) {
            return;
        }
        C136235cNq.LIZ().LIZ("CJPayBalanceTimerLimitErrorParams");
        super.finish();
    }

    @Override // p003X.AbstractActivityC136332cPP
    public final boolean LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJI, false, 11);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!LJIILL().getIsQueryConnecting() && !LJIILLIIL().getIsQueryConnecting()) {
            return false;
        }
        return true;
    }

    @Override // p003X.AbstractActivityC136332cPP, p003X.AbstractActivityC135564cD1, p003X.AbstractActivityC135991cJu, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LJI, false, 24).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LJI, true, 23).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LJI, true, 22).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LJI, false, 25).isSupported) {
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

    @Override // p003X.AbstractActivityC136332cPP
    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LJI, false, 4).isSupported) {
            return;
        }
        LJIILL().LIZ(i);
    }

    @Override // p003X.AbstractActivityC135564cD1, p003X.AbstractActivityC135991cJu, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LJI, false, 16).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LJI, true, 18).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LJI, true, 17).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
    }

    @Override // p003X.AbstractActivityC136332cPP
    public final void LIZ(CJPayTradeConfirmResponseBean cJPayTradeConfirmResponseBean, AbstractC2393c abstractC2393c) {
        if (PatchProxy.proxy(new Object[]{cJPayTradeConfirmResponseBean, abstractC2393c}, this, LJI, false, 6).isSupported) {
            return;
        }
        C136450cRJ c136450cRJ = ((AbstractActivityC136332cPP) this).LIZIZ;
        if (c136450cRJ != null) {
            c136450cRJ.LIZIZ();
        }
        if (!PatchProxy.proxy(new Object[]{cJPayTradeConfirmResponseBean}, this, LJI, false, 13).isSupported && cJPayTradeConfirmResponseBean != null && cJPayTradeConfirmResponseBean.code.length() >= 8) {
            getContext();
            CJPayBasicUtils.displayToast(this, cJPayTradeConfirmResponseBean.msg);
            C2297a c2297a = this.LJFF;
            if (c2297a != null) {
                c2297a.LIZ();
            }
            C136235cNq LIZ = C136235cNq.LIZ();
            String str = cJPayTradeConfirmResponseBean.code;
            Intrinsics.checkNotNullExpressionValue(str, "");
            String substring = str.substring(6, 8);
            Intrinsics.checkNotNullExpressionValue(substring, "");
            LIZ.LIZ("CJPayBalanceTimerLimitErrorParams", Long.parseLong(substring) * 1000, 1000L, new C136283cOc(this));
        }
    }

    @Override // p003X.AbstractActivityC136332cPP
    public final void LIZ(boolean z, boolean z2, boolean z3) {
        if (PatchProxy.proxy(new Object[]{(byte) 0, (byte) 0, (byte) 0}, this, LJI, false, 3).isSupported) {
            return;
        }
        LJIILL().LIZ(false, false, false);
    }

    @Override // p003X.AbstractActivityC136332cPP
    public final View.OnClickListener LIZ(int i, DialogC137460chc dialogC137460chc, Activity activity, View.OnClickListener onClickListener) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), dialogC137460chc, activity, onClickListener}, this, LJI, false, 12);
        if (proxy.isSupported) {
            return (View.OnClickListener) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{Integer.valueOf(i), dialogC137460chc, activity, onClickListener}, C136288cOh.LIZ, C136289cOi.LIZ, false, 1);
        if (proxy2.isSupported) {
            return (View.OnClickListener) proxy2.result;
        }
        return new View$OnClickListenerC135772cGN(onClickListener, dialogC137460chc, i, activity);
    }
}
