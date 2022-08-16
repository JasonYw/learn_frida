package com.android.ttcjpaysdk.fastpay.activity;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.eventbus.AbstractC2126a;
import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayVerifyFastPayParamsCallBack;
import com.android.ttcjpaysdk.base.service.ICJPayVerifyFastPayService;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.fastpay.data.ShareData;
import com.android.ttcjpaysdk.fastpay.data.p151a.C2261d;
import com.android.ttcjpaysdk.fastpay.data.p151a.C2262e;
import com.android.ttcjpaysdk.fastpay.data.p151a.C2264m;
import com.android.ttcjpaysdk.fastpay.p149b.C2259a;
import com.android.ttcjpaysdk.fastpay.p150c.C2260a;
import com.android.ttcjpaysdk.fastpay.p152e.AbstractC2265a;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import com.umeng.commonsdk.vchannel.C33968a;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractActivityC136021cKO;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C135388cAB;
import p003X.C136216cNX;
import p003X.C136218cNZ;
import p003X.C136962cZZ;
import p003X.C136991ca2;
import p003X.C136992ca3;
import p003X.C136993ca4;
import p003X.C136994ca5;
import p003X.C136995ca6;
import p003X.C136996ca7;
import p003X.C136998ca9;
import p003X.C137001caC;
import p003X.C137003caE;
import p003X.C137004caF;
import p003X.C137005caG;
import p003X.C137007caI;
import p003X.C137012caN;
import p003X.C6H;
import p003X.C76765GOh;
import p003X.GOY;
import p003X.RunnableC136999caA;
import p003X.RunnableC137006caH;
import p003X.RunnableC137008caJ;
import p003X.RunnableC137010caL;
import p003X.View$OnClickListenerC137009caK;
import p003X.animation.Animation$AnimationListenerC136997ca8;

/* loaded from: classes17.dex */
public final class FastPayActivity extends AbstractActivityC136021cKO<C2260a> implements AbstractC2126a, AbstractC2265a {
    public static ChangeQuickRedirect LIZ;
    public static final C136994ca5 LJIIIZ = new C136994ca5((byte) 0);
    public C136993ca4 LIZIZ;
    public ICJPayVerifyFastPayService LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public boolean f25494LJ;
    public boolean LJFF;
    public C137001caC LJI;
    public C137005caG LJII;
    public int LJIIJ;
    public long LJIIL;
    public int LJIILIIL;
    public Handler LJIILJJIL;
    public boolean LJIILL;
    public HashMap LJIJ;
    public String LJIIJJI = "bytepay";
    public int LJIIIIZZ = 1;
    public final ICJPayVerifyFastPayParamsCallBack LJIILLIIL = C136962cZZ.LIZIZ.LIZ(LIZIZ());
    public final C136995ca6 LJIIZILJ = new C136995ca6(this);

    static {
        Covode.recordClassIndex(7447);
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 39).isSupported && (hashMap = this.LJIJ) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 38);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIJ == null) {
            this.LJIJ = new HashMap();
        }
        View view = (View) this.LJIJ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJIJ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final void adjustViews() {
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final void bindViews() {
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final int getLayoutId() {
        return 2131690550;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 43).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 42).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 41).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    public final void LIZ(C137001caC c137001caC, boolean z) {
        char c;
        C136993ca4 c136993ca4;
        if (PatchProxy.proxy(new Object[]{c137001caC, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 16).isSupported) {
            return;
        }
        C137005caG c137005caG = new C137005caG();
        int size = c137001caC.pay_info.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (!Intrinsics.areEqual("reduce", c137001caC.pay_info.get(i).type_mark) || TextUtils.isEmpty(c137001caC.pay_info.get(i).half_screen_desc)) {
                    i++;
                } else {
                    c137005caG.half_screen_desc = c137001caC.pay_info.get(i).half_screen_desc;
                    break;
                }
            } else {
                break;
            }
        }
        if (c137001caC.pay_info.size() > 0) {
            c137005caG.pay_type_show_name = c137001caC.pay_info.get(0).pay_type_show_name;
        }
        c137005caG.real_amount = c137001caC.trade_info.pay_amount;
        c137005caG.reduce_amount = c137001caC.trade_info.reduce_amount;
        c137005caG.remain_time_s = c137001caC.result_page_show_conf.remain_time;
        this.LJII = c137005caG;
        if (z && (c136993ca4 = this.LIZIZ) != null) {
            c136993ca4.LIZ(C6H.LIZ(470.0f, this));
        }
        C136993ca4 c136993ca42 = this.LIZIZ;
        if (c136993ca42 != null && !PatchProxy.proxy(new Object[]{c137005caG}, c136993ca42, C136993ca4.LIZ, false, 3).isSupported) {
            C106862S5w.LIZ(c137005caG);
            C136993ca4.LIZ(c136993ca42, null, 1, null);
            Context context = c136993ca42.mContext;
            Intrinsics.checkNotNullExpressionValue(context, "");
            String string = context.getResources().getString(2131561985);
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (!PatchProxy.proxy(new Object[]{2130840381, 2131624881, string}, c136993ca42, C136993ca4.LIZ, false, 10).isSupported) {
                c136993ca42.LIZJ.setVisibility(0);
                c136993ca42.LJIIJ.setVisibility(0);
                c136993ca42.LJIIL.setImageResource(2130840381);
                FrameLayout frameLayout = c136993ca42.LJIIJJI;
                Context context2 = c136993ca42.mContext;
                Intrinsics.checkNotNullExpressionValue(context2, "");
                frameLayout.setBackgroundColor(C116971W2r.LIZ(context2.getResources(), 2131624881));
                c136993ca42.LJIILIIL.setText(string);
            }
            C136992ca3 LIZ2 = C136992ca3.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            if (LIZ2.LJIIIIZZ().show_new_loading) {
                c136993ca42.LJIIL.setImageResource(2130840325);
                Drawable drawable = c136993ca42.LJIIL.getDrawable();
                if (drawable == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                }
                ((AnimationDrawable) drawable).start();
            } else {
                c136993ca42.LJIIL.setImageResource(2130840381);
                FrameLayout frameLayout2 = c136993ca42.LJIIJJI;
                Context context3 = c136993ca42.mContext;
                Intrinsics.checkNotNullExpressionValue(context3, "");
                frameLayout2.setBackgroundColor(C116971W2r.LIZ(context3.getResources(), 2131624881));
            }
            if (!PatchProxy.proxy(new Object[]{c137005caG}, c136993ca42, C136993ca4.LIZ, false, 4).isSupported) {
                c136993ca42.LJI.setText(c137005caG.pay_type_show_name);
                c136993ca42.LJII.setText(c137005caG.half_screen_desc);
                String str = c137005caG.half_screen_desc;
                Intrinsics.checkNotNullExpressionValue(str, "");
                if (str.length() == 0) {
                    c136993ca42.LJII.setVisibility(8);
                } else {
                    c136993ca42.LJII.setVisibility(0);
                }
                c136993ca42.LJIIIIZZ.setText(CJPayBasicUtils.getValueStr(c137005caG.real_amount));
                if (c137005caG.remain_time_s > 0) {
                    c136993ca42.LJIILL.postDelayed(new RunnableC137010caL(c136993ca42), c137005caG.remain_time_s * 1000);
                }
            }
        }
        this.LIZLLL = true;
        if (!c137001caC.voucher_details.isEmpty()) {
            C2264m c2264m = c137001caC.voucher_details.get(0);
            Intrinsics.checkNotNullExpressionValue(c2264m, "");
            C2264m c2264m2 = c2264m;
            String LIZ3 = LIZ();
            String str2 = c137005caG.pay_type_show_name;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            c = 3;
            LIZ(1, "极速", LIZ3, str2, c137005caG.real_amount, c137005caG.reduce_amount, LIZ(c2264m2.voucher_no, !Intrinsics.areEqual(c2264m2.voucher_type, "discount_voucher") ? 1 : 0, c2264m2.front_bank_code, c2264m2.used_amount, c2264m2.label));
        } else {
            c = 3;
            String LIZ4 = LIZ();
            String str3 = c137005caG.pay_type_show_name;
            Intrinsics.checkNotNullExpressionValue(str3, "");
            LIZ(1, "极速", LIZ4, str3, c137005caG.real_amount, c137005caG.reduce_amount, "");
        }
        String str4 = c137005caG.pay_type_show_name;
        Intrinsics.checkNotNullExpressionValue(str4, "");
        long j = c137005caG.real_amount;
        long j2 = c137005caG.reduce_amount;
        Object[] objArr = new Object[4];
        objArr[0] = 1;
        objArr[1] = str4;
        objArr[2] = new Long(j);
        objArr[c] = new Long(j2);
        if (PatchProxy.proxy(objArr, this, LIZ, false, 33).isSupported) {
            return;
        }
        try {
            JSONObject LIZIZ = LIZIZ();
            LIZIZ.put("result", 1);
            LIZIZ.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, str4);
            LIZIZ.put("real_amount", j);
            LIZIZ.put("reduce_amount", j2);
            C2118a.LIZ().LIZ("wallet_cashier_fastpay_finish_page_imp", LIZIZ);
        } catch (Exception unused) {
        }
    }

    public final String LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 19);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        ICJPayVerifyFastPayService iCJPayVerifyFastPayService = this.LIZJ;
        if (TextUtils.isEmpty(iCJPayVerifyFastPayService != null ? iCJPayVerifyFastPayService.getCheckList() : null)) {
            return "无";
        }
        ICJPayVerifyFastPayService iCJPayVerifyFastPayService2 = this.LIZJ;
        if (iCJPayVerifyFastPayService2 == null) {
            return null;
        }
        return iCJPayVerifyFastPayService2.getCheckList();
    }

    @Override // com.android.ttcjpaysdk.fastpay.p152e.AbstractC2265a
    public final void LIZ(String str, String str2) {
        if (!PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 23).isSupported && !this.f25494LJ) {
            this.LJFF = true;
            CJPayBasicUtils.displayToast(this, str2);
            LIZ(this, false, 1, (Object) null);
        }
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 24).isSupported) {
            return;
        }
        C136993ca4 c136993ca4 = this.LIZIZ;
        if (c136993ca4 != null && !PatchProxy.proxy(new Object[]{str}, c136993ca4, C136993ca4.LIZ, false, 7).isSupported) {
            c136993ca4.LIZLLL.setVisibility(0);
            c136993ca4.f18119LJ.setVisibility(8);
            c136993ca4.LJFF.setVisibility(0);
            c136993ca4.LJIIIZ.setVisibility(0);
            c136993ca4.LJIIIZ.setText(str);
        }
        Handler handler = this.LJIILJJIL;
        if (handler == null) {
            return;
        }
        handler.postDelayed(new RunnableC137008caJ(this), 2000L);
    }

    @Override // com.android.ttcjpaysdk.fastpay.p152e.AbstractC2265a
    public final void LIZ(C2262e c2262e) {
        C136991ca2 c136991ca2;
        String optString;
        ICJPayVerifyFastPayService iCJPayVerifyFastPayService;
        String str;
        String str2;
        String str3;
        C136991ca2 c136991ca22;
        String str4;
        if (!PatchProxy.proxy(new Object[]{c2262e}, this, LIZ, false, 25).isSupported && !this.f25494LJ) {
            this.LJFF = true;
            ShareData.LIZLLL = c2262e;
            String str5 = "";
            String str6 = null;
            if (c2262e != null) {
                if (c2262e.isResponseOk()) {
                    String str7 = c2262e.data.trade_info.status;
                    if (str7 != null) {
                        int hashCode = str7.hashCode();
                        if (hashCode == -1149187101) {
                            if (str7.equals("SUCCESS")) {
                                this.LJI = (C137001caC) CJPayJsonParser.fromJson(c2262e.data.trade_info.douyin_trade_info, C137001caC.class);
                                C137001caC c137001caC = this.LJI;
                                if (c137001caC != null) {
                                    LIZ(c137001caC, false);
                                }
                                long currentTimeMillis = System.currentTimeMillis() - this.LJIIL;
                                String str8 = c2262e.code;
                                Intrinsics.checkNotNullExpressionValue(str8, str5);
                                C136991ca2 c136991ca23 = c2262e.error;
                                if (c136991ca23 != null && (str4 = c136991ca23.msg) != null) {
                                    str5 = str4;
                                }
                                LIZ(currentTimeMillis, 1, str8, str5);
                                return;
                            }
                        } else if (hashCode == 907287315 && str7.equals("PROCESSING")) {
                            C2260a c2260a = (C2260a) this.mBasePresenter;
                            if (c2260a == null) {
                                return;
                            }
                            c2260a.LIZ(ShareData.LIZIZ(), ShareData.LIZLLL());
                            return;
                        }
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - this.LJIIL;
                    String str9 = c2262e.code;
                    Intrinsics.checkNotNullExpressionValue(str9, str5);
                    C136991ca2 c136991ca24 = c2262e.error;
                    if (c136991ca24 == null || (str3 = c136991ca24.msg) == null) {
                        str3 = str5;
                    }
                    LIZ(currentTimeMillis2, 0, str9, str3);
                    String LIZ2 = LIZ();
                    String str10 = c2262e.data.trade_info.douyin_trade_info_struct.pay_type_show_name;
                    Intrinsics.checkNotNullExpressionValue(str10, str5);
                    LIZ(0, "极速", LIZ2, str10, c2262e.data.trade_info.real_amount, c2262e.data.trade_info.amount - c2262e.data.trade_info.real_amount, "");
                    C136991ca2 c136991ca25 = c2262e.error;
                    if (TextUtils.isEmpty(c136991ca25 != null ? c136991ca25.msg : null) && (c136991ca22 = c2262e.error) != null) {
                        getContext();
                        c136991ca22.msg = getString(2131561633);
                    }
                    C136991ca2 c136991ca26 = c2262e.error;
                    if (c136991ca26 != null) {
                        str6 = c136991ca26.msg;
                    }
                    LIZ(str6);
                    return;
                }
                String str11 = c2262e.code;
                if (str11 != null) {
                    switch (str11.hashCode()) {
                        case 1979748994:
                            if (str11.equals("CA3007")) {
                                this.LJIIIIZZ = 2;
                                C136991ca2 c136991ca27 = c2262e.error;
                                if (c136991ca27 != null) {
                                    str6 = c136991ca27.msg;
                                }
                                LIZ(str6);
                                long currentTimeMillis3 = System.currentTimeMillis() - this.LJIIL;
                                String str12 = c2262e.code;
                                if (str12 == null) {
                                    str12 = str5;
                                }
                                C136991ca2 c136991ca28 = c2262e.error;
                                if (c136991ca28 != null && (str2 = c136991ca28.msg) != null) {
                                    str5 = str2;
                                }
                                LIZ(currentTimeMillis3, 0, str12, str5);
                                LIZ(0, "极速", LIZ(), "", 0L, 0L, "");
                                return;
                            }
                            break;
                        case 1979748995:
                            if (str11.equals("CA3008")) {
                                this.LJIIIIZZ = 1;
                                C136991ca2 c136991ca29 = c2262e.error;
                                if (c136991ca29 != null) {
                                    str6 = c136991ca29.msg;
                                }
                                LIZ(str6);
                                long currentTimeMillis4 = System.currentTimeMillis() - this.LJIIL;
                                String str13 = c2262e.code;
                                if (str13 == null) {
                                    str13 = str5;
                                }
                                C136991ca2 c136991ca210 = c2262e.error;
                                if (c136991ca210 != null && (str = c136991ca210.msg) != null) {
                                    str5 = str;
                                }
                                LIZ(currentTimeMillis4, 0, str13, str5);
                                LIZ(0, "极速", LIZ(), "", 0L, 0L, "");
                                return;
                            }
                            break;
                        case 1979748996:
                            if (str11.equals("CA3009")) {
                                C136993ca4 c136993ca4 = this.LIZIZ;
                                if (c136993ca4 != null) {
                                    C136993ca4.LIZ(c136993ca4, null, 1, null);
                                }
                                try {
                                    JSONObject m16053LJ = ShareData.LJFF.m16053LJ();
                                    if (m16053LJ != null && (optString = m16053LJ.optString(C2521l.LJIIJ)) != null && optString.length() > 0 && !PatchProxy.proxy(new Object[]{optString}, this, LIZ, false, 20).isSupported && (iCJPayVerifyFastPayService = this.LIZJ) != null) {
                                        iCJPayVerifyFastPayService.start(optString, 2, 2, false);
                                        return;
                                    }
                                    return;
                                } catch (Exception unused) {
                                    return;
                                }
                            }
                            break;
                    }
                }
                if (c2262e != null && (c136991ca2 = c2262e.error) != null) {
                    str6 = c136991ca2.msg;
                }
            }
            LIZ(str6);
        }
    }

    @Override // com.android.ttcjpaysdk.fastpay.p152e.AbstractC2265a
    public final void LIZ(C2261d c2261d) {
        C136998ca9 c136998ca9;
        String str;
        String str2;
        C137003caE c137003caE;
        C136998ca9 c136998ca92;
        if (!PatchProxy.proxy(new Object[]{c2261d}, this, LIZ, false, 30).isSupported && !PatchProxy.proxy(new Object[]{c2261d}, this, LIZ, false, 26).isSupported) {
            String str3 = null;
            if (c2261d != null && c2261d.isResponseOk()) {
                C137003caE c137003caE2 = c2261d.data;
                if (c137003caE2 != null && (c136998ca9 = c137003caE2.trade_info) != null && (str = c136998ca9.status) != null && str.hashCode() == -1149187101 && str.equals("SUCCESS")) {
                    C2262e LIZLLL = ShareData.LIZLLL();
                    if (LIZLLL != null && (c137003caE = LIZLLL.data) != null && (c136998ca92 = c137003caE.trade_info) != null) {
                        str3 = c136998ca92.douyin_trade_info;
                    }
                    this.LJI = (C137001caC) CJPayJsonParser.fromJson(str3, C137001caC.class);
                    C137001caC c137001caC = this.LJI;
                    if (c137001caC != null) {
                        LIZ(c137001caC, false);
                    }
                    long currentTimeMillis = System.currentTimeMillis() - this.LJIIL;
                    String str4 = c2261d.code;
                    String str5 = "";
                    Intrinsics.checkNotNullExpressionValue(str4, str5);
                    C136991ca2 c136991ca2 = c2261d.error;
                    if (c136991ca2 != null && (str2 = c136991ca2.msg) != null) {
                        str5 = str2;
                    }
                    LIZ(currentTimeMillis, 1, str4, str5);
                    return;
                }
                LIZ(this, (String) null, 1, (Object) null);
                return;
            }
            LIZ(this, (String) null, 1, (Object) null);
        }
    }

    public final void LIZ(int i, String str, String str2, String str3, long j, long j2, String str4) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2, str3, new Long(j), new Long(j2), str4}, this, LIZ, false, 32).isSupported) {
            return;
        }
        try {
            JSONObject LIZIZ = LIZIZ();
            LIZIZ.put("result", i);
            LIZIZ.put("check_type", str);
            LIZIZ.put("risk_type", str2);
            LIZIZ.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, str3);
            LIZIZ.put("real_amount", j);
            LIZIZ.put("reduce_amount", j2);
            LIZIZ.put("activity_info", str4);
            C2118a.LIZ().LIZ("wallet_cashier_fastpay_result", LIZIZ);
        } catch (Exception unused) {
        }
    }

    @Override // com.android.ttcjpaysdk.base.eventbus.AbstractC2126a
    public final Class<? extends BaseEvent>[] listEvents() {
        return new Class[]{C137004caF.class, C137012caN.class};
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final /* synthetic */ C2124b getModel() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 22);
        if (proxy.isSupported) {
            return (C2259a) proxy.result;
        }
        return new C2259a();
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
        EventManager.INSTANCE.unregister(this);
    }

    private final void LIZJ() {
        Handler handler;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        C2260a c2260a = (C2260a) this.mBasePresenter;
        if (c2260a != null) {
            Map<String, String> LIZIZ = ShareData.LIZIZ();
            String str = this.LJIIJJI;
            if (str == null) {
                str = "bytepay";
            }
            c2260a.LIZ(LIZIZ, str);
        }
        C136992ca3 LIZ2 = C136992ca3.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        if (LIZ2.LIZLLL() > 0 && (handler = this.LJIILJJIL) != null) {
            RunnableC137006caH runnableC137006caH = new RunnableC137006caH(this);
            C136992ca3 LIZ3 = C136992ca3.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
            handler.postDelayed(runnableC137006caH, LIZ3.LIZLLL() * 1000);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Boolean bool;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        ICJPayVerifyFastPayService iCJPayVerifyFastPayService = this.LIZJ;
        if (iCJPayVerifyFastPayService != null) {
            bool = Boolean.valueOf(iCJPayVerifyFastPayService.whenBackPressedExit());
        } else {
            bool = null;
        }
        ICJPayVerifyFastPayService iCJPayVerifyFastPayService2 = this.LIZJ;
        if (iCJPayVerifyFastPayService2 != null && iCJPayVerifyFastPayService2.onBackPressed()) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                LIZ(this, false, 1, (Object) null);
                return;
            }
            return;
        }
        C136993ca4 c136993ca4 = this.LIZIZ;
        if (c136993ca4 != null) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], c136993ca4, C136993ca4.LIZ, false, 11);
            if (proxy.isSupported) {
                if (((Boolean) proxy.result).booleanValue()) {
                    return;
                }
            } else if (c136993ca4.LIZLLL.getVisibility() == 0) {
                return;
            }
            LIZ(this, false, 1, (Object) null);
        }
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 46).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 45).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 44).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 47).isSupported) {
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

    public final JSONObject LIZIZ() {
        String str;
        String str2;
        String str3;
        C2262e LIZLLL;
        C137003caE c137003caE;
        C136998ca9 c136998ca9;
        String str4;
        C137003caE c137003caE2;
        C136998ca9 c136998ca92;
        Long valueOf;
        C137003caE c137003caE3;
        C136998ca9 c136998ca93;
        C137007caI c137007caI;
        C137003caE c137003caE4;
        C136998ca9 c136998ca94;
        C137007caI c137007caI2;
        C137003caE c137003caE5;
        C136998ca9 c136998ca95;
        C136998ca9 c136998ca96;
        C137001caC c137001caC;
        C137003caE c137003caE6;
        C136998ca9 c136998ca97;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 35);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        Map<String, String> LIZIZ = ShareData.LIZIZ();
        Integer num = null;
        if (LIZIZ != null) {
            str = LIZIZ.get("merchant_id");
        } else {
            str = null;
        }
        Map<String, String> LIZIZ2 = ShareData.LIZIZ();
        if (LIZIZ2 != null) {
            str2 = LIZIZ2.get(Constants.APP_ID);
        } else {
            str2 = null;
        }
        JSONObject LIZ2 = CJPayParamsUtils.LIZ(str, str2);
        C2262e LIZLLL2 = ShareData.LIZLLL();
        if (LIZLLL2 != null && (c137003caE6 = LIZLLL2.data) != null && (c136998ca97 = c137003caE6.trade_info) != null) {
            str3 = c136998ca97.trade_no;
        } else {
            str3 = null;
        }
        if (!TextUtils.isEmpty(str3) ? !((LIZLLL = ShareData.LIZLLL()) == null || (c137003caE = LIZLLL.data) == null || (c136998ca9 = c137003caE.trade_info) == null) : !((c137001caC = this.LJI) == null || (c136998ca9 = c137001caC.trade_info) == null)) {
            str4 = c136998ca9.trade_no;
        } else {
            str4 = null;
        }
        C2262e LIZLLL3 = ShareData.LIZLLL();
        if (LIZLLL3 != null && (c137003caE5 = LIZLLL3.data) != null && (c136998ca95 = c137003caE5.trade_info) != null && c136998ca95.amount == 0) {
            C137001caC c137001caC2 = this.LJI;
            if (c137001caC2 != null && (c136998ca96 = c137001caC2.trade_info) != null) {
                valueOf = Long.valueOf(c136998ca96.amount);
            }
            valueOf = null;
        } else {
            C2262e LIZLLL4 = ShareData.LIZLLL();
            if (LIZLLL4 != null && (c137003caE2 = LIZLLL4.data) != null && (c136998ca92 = c137003caE2.trade_info) != null) {
                valueOf = Long.valueOf(c136998ca92.amount);
            }
            valueOf = null;
        }
        LIZ2.put("identity_type", 1);
        LIZ2.put("trade_no", str4);
        LIZ2.put("is_new_user", 0);
        LIZ2.put("amount", valueOf);
        LIZ2.put("order_type", "fast_pay");
        C2262e LIZLLL5 = ShareData.LIZLLL();
        if (LIZLLL5 == null || (c137003caE4 = LIZLLL5.data) == null || (c136998ca94 = c137003caE4.trade_info) == null || (c137007caI2 = c136998ca94.stat_info) == null || c137007caI2.scene != -1) {
            C2262e LIZLLL6 = ShareData.LIZLLL();
            if (LIZLLL6 != null && (c137003caE3 = LIZLLL6.data) != null && (c136998ca93 = c137003caE3.trade_info) != null && (c137007caI = c136998ca93.stat_info) != null) {
                num = Integer.valueOf(c137007caI.scene);
            }
            LIZ2.put("dy_charge_scene", num);
        }
        LIZ(LIZ2);
        return LIZ2;
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final void onEvent(BaseEvent baseEvent) {
        if (PatchProxy.proxy(new Object[]{baseEvent}, this, LIZ, false, 37).isSupported) {
            return;
        }
        C106862S5w.LIZ(baseEvent);
        super.onEvent(baseEvent);
        if (baseEvent instanceof C137012caN) {
            if (!isFinishing()) {
                LIZ(true);
            }
        } else if (baseEvent instanceof C137004caF) {
            ShareData.LIZ(((C137004caF) baseEvent).LIZ);
            if (!isFinishing()) {
                LIZJ();
            }
        }
    }

    private final void LIZIZ(String str) {
        View view;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 27).isSupported) {
            return;
        }
        this.LJIILIIL++;
        int i = this.LJIILIIL;
        C136992ca3 LIZ2 = C136992ca3.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        if (i >= LIZ2.m21716LJ()) {
            if (TextUtils.isEmpty(str)) {
                str = getString(2131561633);
            }
            LIZ(str);
            return;
        }
        C136993ca4 c136993ca4 = this.LIZIZ;
        if (c136993ca4 != null && (view = c136993ca4.mRootView) != null) {
            view.postDelayed(new RunnableC136999caA(this), 100L);
        }
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        View view;
        View view2;
        MethodCollector.m14708i(463);
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(463);
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
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
                View findViewById = findViewById(2131170063);
                Intrinsics.checkNotNullExpressionValue(findViewById, "");
                C76765GOh.LIZ((Activity) this);
                C76765GOh.LIZ(this, findViewById);
            }
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
                this.f25494LJ = false;
                this.LJIIJ = getIntent().getIntExtra("PARAM_HEIGHT", C6H.LIZ(470.0f, this));
                int LIZ2 = C6H.LIZ(356.0f, this);
                if (this.LJIIJ < LIZ2) {
                    this.LJIIJ = LIZ2;
                }
                View findViewById2 = findViewById(2131169830);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "");
                C136993ca4 c136993ca4 = new C136993ca4(findViewById2);
                c136993ca4.LJIILJJIL = new C136996ca7(this);
                int i = this.LJIIJ;
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, c136993ca4, C136993ca4.LIZ, false, 1).isSupported) {
                    c136993ca4.LIZ(i);
                    new C136218cNZ(c136993ca4.LIZLLL);
                    TextView textView = c136993ca4.LIZIZ;
                    C136216cNX c136216cNX = C135388cAB.LIZ;
                    Context context = c136993ca4.mContext;
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    textView.setText(c136216cNX.LIZLLL(context.getResources().getString(2131561844)));
                    c136993ca4.LIZIZ.setVisibility(0);
                    c136993ca4.LIZJ.setVisibility(8);
                    c136993ca4.LIZJ.setImageResource(2130840406);
                    c136993ca4.LIZJ.setOnClickListener(new View$OnClickListenerC137009caK(c136993ca4));
                }
                c136993ca4.LIZ();
                this.LIZIZ = c136993ca4;
            }
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
                this.LIZJ = (ICJPayVerifyFastPayService) CJPayServiceManager.getInstance().getIService(ICJPayVerifyFastPayService.class);
                ICJPayVerifyFastPayService iCJPayVerifyFastPayService = this.LIZJ;
                if (iCJPayVerifyFastPayService != null) {
                    iCJPayVerifyFastPayService.initVerifyComponents(this, 2131170064, this.LJIILLIIL, this.LJIIZILJ);
                }
            }
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
                this.LJIILJJIL = new Handler();
                this.LJIIJJI = getIntent().getStringExtra("PARAM_PT_CODE");
                this.LJIILL = getIntent().getBooleanExtra("PARAM_WITHOUT_SEND_REQUEST", false);
                if (!this.LJIILL) {
                    LIZJ();
                }
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this, 2130968808);
            C136993ca4 c136993ca42 = this.LIZIZ;
            if (c136993ca42 != null && (view2 = c136993ca42.mRootView) != null) {
                view2.setAnimation(loadAnimation);
            }
            C136993ca4 c136993ca43 = this.LIZIZ;
            if (c136993ca43 != null && (view = c136993ca43.mRootView) != null) {
                view.startAnimation(loadAnimation);
            }
        }
        this.LJIIL = System.currentTimeMillis();
        EventManager.INSTANCE.register(this);
        MethodCollector.m14707o(463);
    }

    private final void LIZ(JSONObject jSONObject) {
        C137003caE c137003caE;
        JSONObject jSONObject2;
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 36).isSupported) {
            return;
        }
        try {
            C2262e LIZLLL = ShareData.LIZLLL();
            if (LIZLLL != null && (c137003caE = LIZLLL.data) != null && (jSONObject2 = c137003caE.fe_metrics) != null) {
                Iterator<String> keys = jSONObject2.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "");
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject2.get(next);
                    if (obj == null) {
                        obj = "";
                    }
                    jSONObject.put(next, obj);
                }
            }
        } catch (Exception unused) {
        }
    }

    private void LIZ(boolean z) {
        View view;
        View view2;
        MethodCollector.m14708i(464);
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 11).isSupported) {
            MethodCollector.m14707o(464);
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this, 2130968775);
        C136993ca4 c136993ca4 = this.LIZIZ;
        if (c136993ca4 != null && (view2 = c136993ca4.mRootView) != null) {
            view2.setAnimation(loadAnimation);
        }
        C136993ca4 c136993ca42 = this.LIZIZ;
        if (c136993ca42 != null && (view = c136993ca42.mRootView) != null) {
            view.startAnimation(loadAnimation);
        }
        Intrinsics.checkNotNullExpressionValue(loadAnimation, "");
        loadAnimation.setFillAfter(true);
        loadAnimation.setAnimationListener(new animation.Animation$AnimationListenerC136997ca8(this, z));
        Handler handler = this.LJIILJJIL;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            MethodCollector.m14707o(464);
            return;
        }
        MethodCollector.m14707o(464);
    }

    @Override // com.android.ttcjpaysdk.fastpay.p152e.AbstractC2265a
    public final void LIZIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 29).isSupported) {
            return;
        }
        LIZ(this, (String) null, 1, (Object) null);
    }

    public static /* synthetic */ void LIZ(FastPayActivity fastPayActivity, String str, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{fastPayActivity, null, 1, null}, null, LIZ, true, 28).isSupported) {
            return;
        }
        fastPayActivity.LIZIZ("");
    }

    private final void LIZ(long j, int i, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), str, str2}, this, LIZ, false, 31).isSupported) {
            return;
        }
        try {
            JSONObject LIZIZ = LIZIZ();
            LIZIZ.put("loading_time", j);
            LIZIZ.put("result", i);
            LIZIZ.put("error_code", str);
            LIZIZ.put(PushMessageHelper.ERROR_MESSAGE, str2);
            C2118a.LIZ().LIZ("wallet_cashier_fastpay_loading_time", LIZIZ);
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void LIZ(FastPayActivity fastPayActivity, boolean z, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{fastPayActivity, (byte) 0, 1, null}, null, LIZ, true, 12).isSupported) {
            return;
        }
        fastPayActivity.LIZ(false);
    }

    private final String LIZ(String str, int i, String str2, long j, String str3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), str2, new Long(j), str3}, this, LIZ, false, 18);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C33968a.f42937f, str);
            jSONObject.put("type", i);
            jSONObject.put("front_bank_code", str2);
            jSONObject.put("reduce", j);
            jSONObject.put("label", str3);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
