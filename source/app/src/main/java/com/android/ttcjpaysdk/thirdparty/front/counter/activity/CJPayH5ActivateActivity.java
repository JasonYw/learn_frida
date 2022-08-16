package com.android.ttcjpaysdk.thirdparty.front.counter.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.eventbus.AbstractC2126a;
import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogBuilder;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogUtils;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayH5Service;
import com.android.ttcjpaysdk.base.service.bean.H5SchemeParamBuilder;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.thirdparty.base.CJPayBaseActivity;
import com.android.ttcjpaysdk.thirdparty.counter.activity.CJPayCheckoutCounterActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import com.umeng.analytics.pro.C33764r;
import java.net.URLDecoder;
import java.util.HashMap;
import p003X.AbstractView$OnClickListenerC137362cg2;
import p003X.C116971W2r;
import p003X.C136428cQx;
import p003X.C136429cQy;
import p003X.C76765GOh;
import p003X.GOY;

/* loaded from: classes17.dex */
public class CJPayH5ActivateActivity extends CJPayBaseActivity {
    public static ChangeQuickRedirect LIZ;
    public FrameLayout LIZIZ;
    public boolean LIZJ;
    public AbstractC2126a LIZLLL = new AbstractC2126a() { // from class: com.android.ttcjpaysdk.thirdparty.front.counter.activity.CJPayH5ActivateActivity.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(8608);
        }

        @Override // com.android.ttcjpaysdk.base.eventbus.AbstractC2126a
        public final Class<? extends BaseEvent>[] listEvents() {
            return new Class[]{C136429cQy.class};
        }

        @Override // com.android.ttcjpaysdk.base.eventbus.AbstractC2126a
        public final void onEvent(BaseEvent baseEvent) {
            Intent LIZ2;
            if (!PatchProxy.proxy(new Object[]{baseEvent}, this, LIZ, false, 1).isSupported && (baseEvent instanceof C136429cQy)) {
                C136429cQy c136429cQy = (C136429cQy) baseEvent;
                String str = c136429cQy.LIZLLL;
                final HashMap hashMap = new HashMap();
                if (TextUtils.equals(c136429cQy.LIZ, "0")) {
                    if (CJPayCheckoutCounterActivity.LJIIIZ != null) {
                        String str2 = c136429cQy.LIZIZ;
                        int i = -1;
                        if (!str2.isEmpty()) {
                            try {
                                i = Integer.parseInt(str2);
                            } catch (Exception unused) {
                            }
                        }
                        if (!str2.isEmpty() && i < CJPayCheckoutCounterActivity.LJIIIZ.pay_info.real_trade_amount_raw) {
                            CJPayDialogBuilder defaultBuilder = CJPayDialogUtils.getDefaultBuilder(CJPayH5ActivateActivity.this);
                            defaultBuilder.setTitle(CJPayH5ActivateActivity.this.getString(2131561631));
                            defaultBuilder.setSingleBtnStr(CJPayH5ActivateActivity.this.getString(2131561629));
                            defaultBuilder.setSingleBtnListener(new AbstractView$OnClickListenerC137362cg2() { // from class: com.android.ttcjpaysdk.thirdparty.front.counter.activity.CJPayH5ActivateActivity.1.1
                                public static ChangeQuickRedirect LIZ;

                                static {
                                    Covode.recordClassIndex(8609);
                                }

                                @Override // p003X.AbstractView$OnClickListenerC137362cg2
                                public final void doClick(View view) {
                                    if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                                        return;
                                    }
                                    CJPayH5ActivateActivity.this.dismissCommonDialog();
                                    hashMap.put("fail_desc", CJPayH5ActivateActivity.this.getString(2131561580));
                                    C2118a.LIZ().LIZ(102).LIZ(hashMap).LIZIZ();
                                    CJPayH5ActivateActivity.this.finish();
                                }
                            });
                            CJPayH5ActivateActivity.this.showDialogIfNotNull(defaultBuilder);
                            return;
                        }
                        String str3 = c136429cQy.LIZJ;
                        if (str3.isEmpty()) {
                            str3 = CJPayH5ActivateActivity.this.getString(2131561630);
                        }
                        CJPayBasicUtils.displayToast(CJPayH5ActivateActivity.this, str3);
                        if (!C136428cQx.LIZ()) {
                            LIZ2 = CJPayFrontETCounterActivity.LIZ(CJPayH5ActivateActivity.this);
                        } else {
                            LIZ2 = CJPayFrontStandardCounterActivity.LIZ(CJPayH5ActivateActivity.this);
                        }
                        LIZ2.putExtra("param_is_from_insufficient_balance", CJPayH5ActivateActivity.this.LIZJ);
                        C116971W2r.LIZIZ(CJPayH5ActivateActivity.this, LIZ2);
                        if (CJPayH5ActivateActivity.this.LIZIZ != null) {
                            CJPayH5ActivateActivity.this.LIZIZ.postDelayed(new Runnable() { // from class: com.android.ttcjpaysdk.thirdparty.front.counter.activity.CJPayH5ActivateActivity.1.2
                                public static ChangeQuickRedirect LIZ;

                                static {
                                    Covode.recordClassIndex(8610);
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && CJPayH5ActivateActivity.this != null && !CJPayH5ActivateActivity.this.isFinishing()) {
                                        CJPayH5ActivateActivity.this.finish();
                                    }
                                }
                            }, 500L);
                        }
                    }
                } else if (TextUtils.equals(c136429cQy.LIZ, C33764r.f42396f)) {
                    if (str.isEmpty()) {
                        str = CJPayH5ActivateActivity.this.getString(2131561574);
                    }
                    hashMap.put("fail_desc", str);
                    C2118a.LIZ().LIZ(102).LIZ(hashMap).LIZIZ();
                    CJPayH5ActivateActivity.this.finish();
                } else if (TextUtils.equals(c136429cQy.LIZ, "-2")) {
                    C2118a.LIZ().LIZ(104).LIZIZ();
                    CJPayH5ActivateActivity.this.finish();
                } else {
                    if (str.isEmpty()) {
                        str = CJPayH5ActivateActivity.this.getString(2131561578);
                    }
                    hashMap.put("fail_desc", str);
                    C2118a.LIZ().LIZ(103).LIZ(hashMap).LIZIZ();
                    CJPayH5ActivateActivity.this.finish();
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(8607);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public int getLayout() {
        return 2131690553;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
        EventManager.INSTANCE.unregister(this.LIZLLL);
    }

    @Override // com.android.ttcjpaysdk.thirdparty.base.CJPayBaseActivity, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 14).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 13).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
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

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        boolean z;
        Object obj;
        ICJPayH5Service iCJPayH5Service;
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
        this.LIZIZ = (FrameLayout) findViewById(2131169622);
        C76765GOh.LIZ((Activity) this);
        EventManager.INSTANCE.register(this.LIZLLL);
        Object obj2 = "";
        if (getIntent() != null) {
            str = getIntent().getStringExtra("activateUrl");
        } else {
            str = obj2;
        }
        if (getIntent() != null) {
            z = getIntent().getBooleanExtra("param_is_from_insufficient_balance", false);
        } else {
            z = false;
        }
        this.LIZJ = z;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 4).isSupported) {
            Uri parse = Uri.parse(str);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{parse, "cj_page_type"}, this, LIZ, false, 5);
            if (proxy.isSupported) {
                obj = proxy.result;
            } else {
                obj = obj2;
                if (!TextUtils.isEmpty(parse.getQueryParameter("cj_page_type"))) {
                    obj = URLDecoder.decode(parse.getQueryParameter("cj_page_type"));
                }
            }
            if ("lynx".equals(obj)) {
                if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 6).isSupported && str != null) {
                    if (C2118a.LIZ().f25443LJ != null) {
                        C2118a.LIZ().f25443LJ.openScheme(this, str);
                    } else if (C2118a.LIZ().LIZLLL != null) {
                        C2118a.LIZ().LIZLLL.openScheme(str);
                    }
                }
            } else if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 7).isSupported || (iCJPayH5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class)) == null) {
            } else {
                H5SchemeParamBuilder h5SchemeParamBuilder = new H5SchemeParamBuilder();
                h5SchemeParamBuilder.setContext(this);
                h5SchemeParamBuilder.setUrl(str);
                h5SchemeParamBuilder.setHostInfo(CJPayHostInfo.LIZIZ(CJPayCheckoutCounterActivity.LJIIJ));
                iCJPayH5Service.startH5ByScheme(h5SchemeParamBuilder);
            }
        }
    }

    public static void LIZ(Context context, String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, null, LIZ, true, 8).isSupported) {
            return;
        }
        Intent intent = new Intent(context, CJPayH5ActivateActivity.class);
        intent.putExtra("activateUrl", str);
        intent.putExtra("param_is_from_insufficient_balance", z);
        C116971W2r.LIZ(context, intent);
    }
}
