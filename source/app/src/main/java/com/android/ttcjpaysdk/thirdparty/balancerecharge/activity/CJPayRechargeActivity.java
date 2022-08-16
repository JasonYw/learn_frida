package com.android.ttcjpaysdk.thirdparty.balancerecharge.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.p135ui.SwipeToFinishView;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogBuilder;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogUtils;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayFrontCardListCallBack;
import com.android.ttcjpaysdk.base.service.ICJPayFrontCardListService;
import com.android.ttcjpaysdk.thirdparty.balance.p159d.C2297a;
import com.android.ttcjpaysdk.thirdparty.balancerecharge.p162a.C2301a;
import com.android.ttcjpaysdk.thirdparty.balancerecharge.p162a.C2302b;
import com.android.ttcjpaysdk.thirdparty.data.C2342n;
import com.android.ttcjpaysdk.thirdparty.data.CJPayCard;
import com.android.ttcjpaysdk.thirdparty.data.CJPayPayTypeInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayProcessInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayQuickPay;
import com.android.ttcjpaysdk.thirdparty.data.CJPayTradeConfirmResponseBean;
import com.android.ttcjpaysdk.thirdparty.verify.p176a.AbstractC2393c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;
import p003X.AbstractActivityC136332cPP;
import p003X.AbstractC136469cRc;
import p003X.AbstractC136473cRg;
import p003X.C135465cBQ;
import p003X.C135775cGQ;
import p003X.C136246cO1;
import p003X.C136271cOQ;
import p003X.C136273cOS;
import p003X.C136278cOX;
import p003X.C136294cOn;
import p003X.C136450cRJ;
import p003X.DialogC137460chc;
import p003X.GOY;
import p003X.View$OnClickListenerC136286cOf;

/* loaded from: classes17.dex */
public final class CJPayRechargeActivity extends AbstractActivityC136332cPP {
    public static ChangeQuickRedirect LJI;
    public final Lazy LJII = LazyKt__LazyJVMKt.lazy(new CJPayRechargeActivity$rechargeFragment$2(this));
    public final Lazy LJIIIIZZ = LazyKt__LazyJVMKt.lazy(CJPayRechargeActivity$rechargeResultFragment$2.INSTANCE);
    public final ICJPayFrontCardListCallBack LJIIIZ = new C136273cOS(this);
    public HashMap LJIIJ;

    static {
        Covode.recordClassIndex(8029);
    }

    private final C2302b LJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJI, false, 2);
        return (C2302b) (proxy.isSupported ? proxy.result : this.LJIIIIZZ.mo27335getValue());
    }

    @Override // p003X.AbstractActivityC135564cD1
    public final String LJIILIIL() {
        return "recharge";
    }

    public final C2301a LJIILL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJI, false, 1);
        return (C2301a) (proxy.isSupported ? proxy.result : this.LJII.mo27335getValue());
    }

    @Override // p003X.AbstractActivityC136332cPP, p003X.AbstractActivityC135564cD1, p003X.AbstractActivityC135991cJu, p003X.AbstractActivityC136021cKO
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LJI, false, 21).isSupported && (hashMap = this.LJIIJ) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.AbstractActivityC136332cPP, p003X.AbstractActivityC135564cD1, p003X.AbstractActivityC135991cJu, p003X.AbstractActivityC136021cKO
    public final View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LJI, false, 20);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIIJ == null) {
            this.LJIIJ = new HashMap();
        }
        View view = (View) this.LJIIJ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJIIJ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // p003X.AbstractActivityC136332cPP, p003X.AbstractActivityC135991cJu, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 32).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 27).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 26).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 25).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // p003X.AbstractActivityC136332cPP
    /* renamed from: LJ */
    public final void mo16042LJ() {
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 9).isSupported) {
            return;
        }
        LIZ((Fragment) LJIJ(), true);
    }

    @Override // p003X.AbstractActivityC136332cPP
    public final AbstractC136473cRg LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJI, false, 12);
        if (proxy.isSupported) {
            return (AbstractC136473cRg) proxy.result;
        }
        return new C136278cOX(this);
    }

    @Override // p003X.AbstractActivityC136332cPP
    public final AbstractC136469cRc LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJI, false, 13);
        if (proxy.isSupported) {
            return (AbstractC136469cRc) proxy.result;
        }
        return new C136271cOQ(this);
    }

    @Override // p003X.AbstractActivityC135564cD1
    public final void LJIIL() {
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 3).isSupported) {
            return;
        }
        LIZ((Fragment) LJIILL(), false);
    }

    public final void LJIILLIIL() {
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 5).isSupported) {
            return;
        }
        LJIILL().LJIIIZ();
    }

    public final void LJIIZILJ() {
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 6).isSupported) {
            return;
        }
        LJIILL().LJIIIIZZ();
    }

    @Override // p003X.AbstractActivityC136332cPP
    public final boolean LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJI, false, 16);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!LJIILL().getIsQueryConnecting() && !LJIJ().getIsQueryConnecting()) {
            return false;
        }
        return true;
    }

    @Override // p003X.AbstractActivityC136332cPP, p003X.AbstractActivityC135564cD1, p003X.AbstractActivityC135991cJu, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LJI, false, 30).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LJI, true, 29).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LJI, true, 28).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LJI, false, 31).isSupported) {
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
    public final void LJII() {
        int i;
        int i2;
        CJPayPayTypeInfo cJPayPayTypeInfo;
        CJPayQuickPay cJPayQuickPay;
        ArrayList<CJPayCard> arrayList;
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 14).isSupported) {
            return;
        }
        C2342n c2342n = C136246cO1.LIZJ;
        if (c2342n != null && (cJPayPayTypeInfo = c2342n.paytype_info) != null && (cJPayQuickPay = cJPayPayTypeInfo.quick_pay) != null && (arrayList = cJPayQuickPay.cards) != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        C2297a c2297a = this.LJFF;
        if (c2297a != null) {
            if (i > 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            String LIZJ = LIZJ();
            long LIZIZ = C136294cOn.LIZIZ.LIZIZ(C136246cO1.LJFF);
            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i2), LIZJ, new Long(LIZIZ)}, c2297a, C2297a.LIZ, false, 1).isSupported) {
                C2118a LIZ = C2118a.LIZ();
                JSONObject jSONObject = new JSONObject();
                C135465cBQ.LIZ(jSONObject, "is_bankcard", Integer.valueOf(i2));
                C135465cBQ.LIZ(jSONObject, "amount", Long.valueOf(LIZIZ));
                C135465cBQ.LIZ(jSONObject, "bank_name", LIZJ);
                LIZ.LIZ("wallet_change_cashier_click", c2297a.LIZ(jSONObject));
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
        if (PatchProxy.proxy(new Object[]{bundle}, this, LJI, false, 22).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LJI, true, 24).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LJI, true, 23).isSupported) {
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
    public final void LIZ(CJPayTradeConfirmResponseBean cJPayTradeConfirmResponseBean) {
        String str;
        String str2;
        JSONObject jSONObject;
        CJPayPayTypeInfo cJPayPayTypeInfo;
        FragmentActivity activity;
        if (!PatchProxy.proxy(new Object[]{cJPayTradeConfirmResponseBean}, this, LJI, false, 10).isSupported && cJPayTradeConfirmResponseBean != null && (str = cJPayTradeConfirmResponseBean.code) != null) {
            int hashCode = str.hashCode();
            JSONObject jSONObject2 = null;
            if (hashCode != -1849928834) {
                if (hashCode == -1849928830 && str.equals("CD005006")) {
                    CJPayButtonInfo cJPayButtonInfo = cJPayTradeConfirmResponseBean.button_info;
                    if (!PatchProxy.proxy(new Object[]{cJPayButtonInfo}, this, LJI, false, 15).isSupported && cJPayButtonInfo != null) {
                        CJPayButtonInfo cJPayButtonInfo2 = (CJPayButtonInfo) CJPayJsonParser.fromJson(cJPayButtonInfo.toJson().toString(), CJPayButtonInfo.class);
                        if (!PatchProxy.proxy(new Object[]{cJPayButtonInfo2}, this, LJI, false, 8).isSupported) {
                            C2301a LJIILL = LJIILL();
                            if (!PatchProxy.proxy(new Object[]{cJPayButtonInfo2}, LJIILL, C2301a.LJIIJ, false, 5).isSupported && cJPayButtonInfo2 != null && (activity = LJIILL.getActivity()) != null && !activity.isFinishing()) {
                                FragmentActivity activity2 = LJIILL.getActivity();
                                if (!(activity2 instanceof CJPayRechargeActivity)) {
                                    activity2 = null;
                                }
                                CJPayRechargeActivity cJPayRechargeActivity = (CJPayRechargeActivity) activity2;
                                if (cJPayRechargeActivity != null && !PatchProxy.proxy(new Object[]{cJPayButtonInfo2}, cJPayRechargeActivity, LJI, false, 19).isSupported) {
                                    View$OnClickListenerC136286cOf view$OnClickListenerC136286cOf = new View$OnClickListenerC136286cOf(cJPayRechargeActivity, cJPayButtonInfo2);
                                    CJPayDialogBuilder defaultBuilder = CJPayDialogUtils.getDefaultBuilder(cJPayRechargeActivity);
                                    defaultBuilder.setLeftBtnListener(C135775cGQ.LIZ.LIZ(cJPayButtonInfo2.left_button_action, cJPayRechargeActivity.mCommonDialog, cJPayRechargeActivity, view$OnClickListenerC136286cOf));
                                    defaultBuilder.setRightBtnListener(C135775cGQ.LIZ.LIZ(cJPayButtonInfo2.right_button_action, cJPayRechargeActivity.mCommonDialog, cJPayRechargeActivity, view$OnClickListenerC136286cOf));
                                    defaultBuilder.setSingleBtnListener(C135775cGQ.LIZ.LIZ(cJPayButtonInfo2.action, cJPayRechargeActivity.mCommonDialog, cJPayRechargeActivity, view$OnClickListenerC136286cOf));
                                    defaultBuilder.setButtonInfo(cJPayButtonInfo2);
                                    cJPayRechargeActivity.showCommonDialog(defaultBuilder);
                                }
                            }
                        }
                        onBackPressed();
                    }
                }
            } else if (!str.equals("CD005002") || PatchProxy.proxy(new Object[]{cJPayTradeConfirmResponseBean}, this, LJI, false, 18).isSupported) {
            } else {
                C136450cRJ c136450cRJ = ((AbstractActivityC136332cPP) this).LIZIZ;
                if (c136450cRJ != null) {
                    c136450cRJ.LIZ(C136450cRJ.LJIILIIL, C136450cRJ.LJIJ, C136450cRJ.LJIJJ, true);
                }
                SwipeToFinishView swipeToFinishView = this.mSwipeToFinishView;
                if (swipeToFinishView != null) {
                    swipeToFinishView.setEnableSwipe(false);
                }
                CJPayCard cJPayCard = C136246cO1.f18003LJ;
                if (cJPayCard != null) {
                    String str3 = cJPayCard.bank_card_id;
                    if (!PatchProxy.proxy(new Object[]{str3}, null, C136246cO1.LIZ, true, 1).isSupported && str3 != null && (true ^ StringsKt__StringsJVMKt.isBlank(str3))) {
                        if (C136246cO1.LJI == null) {
                            C136246cO1.LJI = new ArrayList<>();
                        }
                        ArrayList<String> arrayList = C136246cO1.LJI;
                        if (arrayList != null) {
                            arrayList.add(0, str3);
                        }
                    }
                }
                ICJPayFrontCardListService iCJPayFrontCardListService = (ICJPayFrontCardListService) CJPayServiceManager.getInstance().getIService(ICJPayFrontCardListService.class);
                if (iCJPayFrontCardListService == null) {
                    return;
                }
                String LIZ = C136294cOn.LIZIZ.LIZ(C136246cO1.LJFF);
                String str4 = "";
                if (LIZ == null) {
                    LIZ = str4;
                }
                CJPayCard cJPayCard2 = C136246cO1.f18003LJ;
                if (cJPayCard2 == null || (str2 = cJPayCard2.bank_card_id) == null) {
                    str2 = str4;
                }
                String str5 = cJPayTradeConfirmResponseBean.msg;
                if (str5 != null) {
                    str4 = str5;
                }
                ArrayList<String> arrayList2 = C136246cO1.LJI;
                ICJPayFrontCardListCallBack iCJPayFrontCardListCallBack = this.LJIIIZ;
                CJPayProcessInfo cJPayProcessInfo = cJPayTradeConfirmResponseBean.process_info;
                if (cJPayProcessInfo != null) {
                    jSONObject = cJPayProcessInfo.toJson();
                } else {
                    jSONObject = null;
                }
                C2342n c2342n = C136246cO1.LIZJ;
                if (c2342n != null && (cJPayPayTypeInfo = c2342n.paytype_info) != null) {
                    jSONObject2 = cJPayPayTypeInfo.toJson();
                }
                iCJPayFrontCardListService.startCJPayFrontCardListMethodActivity(this, 1, 3, LIZ, str2, str4, arrayList2, iCJPayFrontCardListCallBack, jSONObject, jSONObject2, CJPayHostInfo.Companion.LIZIZ(C136246cO1.LIZIZ));
            }
        }
    }

    @Override // p003X.AbstractActivityC136332cPP
    public final void LIZ(CJPayTradeConfirmResponseBean cJPayTradeConfirmResponseBean, AbstractC2393c abstractC2393c) {
        if (!PatchProxy.proxy(new Object[]{cJPayTradeConfirmResponseBean, abstractC2393c}, this, LJI, false, 11).isSupported && cJPayTradeConfirmResponseBean != null && abstractC2393c != null) {
            abstractC2393c.LIZIZ(cJPayTradeConfirmResponseBean);
        }
    }

    @Override // p003X.AbstractActivityC136332cPP
    public final void LIZ(boolean z, boolean z2, boolean z3) {
        if (PatchProxy.proxy(new Object[]{(byte) 0, (byte) 0, (byte) 0}, this, LJI, false, 7).isSupported) {
            return;
        }
        LJIILL().LIZ(false, false, false);
    }

    @Override // p003X.AbstractActivityC136332cPP
    public final View.OnClickListener LIZ(int i, DialogC137460chc dialogC137460chc, Activity activity, View.OnClickListener onClickListener) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), dialogC137460chc, activity, onClickListener}, this, LJI, false, 17);
        if (proxy.isSupported) {
            return (View.OnClickListener) proxy.result;
        }
        return C135775cGQ.LIZ.LIZ(i, dialogC137460chc, activity, onClickListener);
    }
}
