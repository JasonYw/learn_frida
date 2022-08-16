package com.android.ttcjpaysdk.thirdparty.front.counter.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.eventbus.AbstractC2126a;
import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.thirdparty.base.CJPayBaseActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import p003X.C116971W2r;
import p003X.C135563cD0;
import p003X.C76765GOh;
import p003X.GOY;

/* loaded from: classes17.dex */
public class CJPayIncomeLynxOpenAccountActivity extends CJPayBaseActivity {
    public static ChangeQuickRedirect LIZ;
    public FrameLayout LIZIZ;
    public AbstractC2126a LIZJ = new AbstractC2126a() { // from class: com.android.ttcjpaysdk.thirdparty.front.counter.activity.CJPayIncomeLynxOpenAccountActivity.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(8612);
        }

        @Override // com.android.ttcjpaysdk.base.eventbus.AbstractC2126a
        public final Class<? extends BaseEvent>[] listEvents() {
            return new Class[]{C135563cD0.class};
        }

        @Override // com.android.ttcjpaysdk.base.eventbus.AbstractC2126a
        public final void onEvent(BaseEvent baseEvent) {
            if (!PatchProxy.proxy(new Object[]{baseEvent}, this, LIZ, false, 1).isSupported && (baseEvent instanceof C135563cD0)) {
                String str = ((C135563cD0) baseEvent).LIZ;
                if ("0".equals(str)) {
                    C116971W2r.LIZIZ(CJPayIncomeLynxOpenAccountActivity.this, CJPayFrontStandardCounterActivity.LIZ(CJPayIncomeLynxOpenAccountActivity.this));
                    if (CJPayIncomeLynxOpenAccountActivity.this.LIZIZ != null) {
                        CJPayIncomeLynxOpenAccountActivity.this.LIZIZ.postDelayed(new Runnable() { // from class: com.android.ttcjpaysdk.thirdparty.front.counter.activity.CJPayIncomeLynxOpenAccountActivity.1.1
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(8613);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && CJPayIncomeLynxOpenAccountActivity.this != null && !CJPayIncomeLynxOpenAccountActivity.this.isFinishing()) {
                                    CJPayIncomeLynxOpenAccountActivity.this.finish();
                                }
                            }
                        }, 500L);
                    }
                } else if ("1".equals(str)) {
                    C2118a.LIZ().LIZ(104).LIZIZ();
                    CJPayIncomeLynxOpenAccountActivity.this.finish();
                } else {
                    C2118a.LIZ().LIZ(102).LIZIZ();
                    CJPayIncomeLynxOpenAccountActivity.this.finish();
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(8611);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public int getLayout() {
        return 2131690553;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
        EventManager.INSTANCE.unregister(this.LIZJ);
    }

    @Override // com.android.ttcjpaysdk.thirdparty.base.CJPayBaseActivity, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 11).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 10).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
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
        EventManager.INSTANCE.register(this.LIZJ);
        if (getIntent() != null) {
            str = getIntent().getStringExtra("schema");
        } else {
            str = "";
        }
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 4).isSupported && str != null) {
            if (C2118a.LIZ().f25443LJ != null) {
                C2118a.LIZ().f25443LJ.openScheme(this, str);
            } else if (C2118a.LIZ().LIZLLL != null) {
                C2118a.LIZ().LIZLLL.openScheme(str);
            }
        }
    }

    public static void LIZ(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, null, LIZ, true, 5).isSupported) {
            return;
        }
        Intent intent = new Intent(context, CJPayIncomeLynxOpenAccountActivity.class);
        intent.putExtra("schema", str);
        C116971W2r.LIZ(context, intent);
    }
}
