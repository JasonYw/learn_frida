package com.android.ttcjpaysdk.multiprocess;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.CJPayPerformance;
import com.android.ttcjpaysdk.base.framework.BaseActivity;
import com.android.ttcjpaysdk.ttcjpayapi.IH5PayCallback;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayObserver;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayResult;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;
import p003X.GOY;

/* loaded from: classes17.dex */
public class CJPayMainProcessActivity extends BaseActivity {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(7869);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity
    public int getLayout() {
        return 2131690651;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        TTCJPayUtils.getInstance().setObserver(null);
        super.onDestroy();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 12).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 11).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
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
        Intent intent;
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
        initTranslucentStatusBar();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && (intent = getIntent()) != null && "pay".equals(intent.getStringExtra(PushConstants.MZ_PUSH_MESSAGE_METHOD)) && !PatchProxy.proxy(new Object[]{intent}, this, LIZ, false, 6).isSupported) {
            Serializable serializableExtra = intent.getSerializableExtra("host_info");
            String stringExtra = intent.getStringExtra("sdk_info");
            int intExtra = intent.getIntExtra("service", 0);
            String stringExtra2 = intent.getStringExtra("subWay");
            String stringExtra3 = intent.getStringExtra("referer");
            String stringExtra4 = intent.getStringExtra("ext");
            if (serializableExtra != null) {
                CJPayHostInfo cJPayHostInfo = (CJPayHostInfo) serializableExtra;
                cJPayHostInfo.LIZ(this);
                TTCJPayUtils tTCJPayUtils = TTCJPayUtils.getInstance();
                tTCJPayUtils.setHostInfo(cJPayHostInfo);
                tTCJPayUtils.setObserver(new TTCJPayObserver() { // from class: com.android.ttcjpaysdk.multiprocess.CJPayMainProcessActivity.2
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(7871);
                    }

                    @Override // com.android.ttcjpaysdk.ttcjpayapi.TTCJPayObserver
                    public final void onMonitor(String str, int i, JSONObject jSONObject) {
                    }

                    @Override // com.android.ttcjpaysdk.ttcjpayapi.TTCJPayObserver
                    public final void onWebViewInit(WeakReference<WebView> weakReference) {
                    }

                    @Override // com.android.ttcjpaysdk.ttcjpayapi.TTCJPayObserver
                    public final void onPayCallback(TTCJPayResult tTCJPayResult) {
                        if (PatchProxy.proxy(new Object[]{tTCJPayResult}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        CJPayMainProcessActivity cJPayMainProcessActivity = CJPayMainProcessActivity.this;
                        if (!PatchProxy.proxy(new Object[]{cJPayMainProcessActivity, tTCJPayResult}, null, CJPaySubProcessReceiver.LIZ, true, 6).isSupported) {
                            Intent intent2 = new Intent("CJ_PAY_SUB_PROCESS_ACTION");
                            intent2.putExtra("multi_process_result_type", "PAY_RESULT");
                            intent2.putExtra("multi_process_pay_result", tTCJPayResult);
                            cJPayMainProcessActivity.sendBroadcast(intent2);
                        }
                        if (tTCJPayResult.getCode() != 110) {
                            CJPayMainProcessActivity.this.finish();
                        }
                    }

                    @Override // com.android.ttcjpaysdk.ttcjpayapi.TTCJPayObserver
                    public final void onEvent(String str, Map<String, String> map) {
                        if (!PatchProxy.proxy(new Object[]{str, map}, this, LIZ, false, 2).isSupported && CJPayPerformance.LIZ().LIZIZ()) {
                            CJPayPerformance.LIZ().LIZ(str, new JSONObject(map));
                        }
                    }
                }).pay(stringExtra, intExtra, stringExtra2, stringExtra3, stringExtra4, new IH5PayCallback() { // from class: com.android.ttcjpaysdk.multiprocess.CJPayMainProcessActivity.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(7870);
                    }

                    @Override // com.android.ttcjpaysdk.ttcjpayapi.IH5PayCallback
                    public final void onResult(int i, String str) {
                        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        CJPayMainProcessActivity cJPayMainProcessActivity = CJPayMainProcessActivity.this;
                        if (!PatchProxy.proxy(new Object[]{cJPayMainProcessActivity, Integer.valueOf(i), str}, null, CJPaySubProcessReceiver.LIZ, true, 7).isSupported) {
                            Intent intent2 = new Intent("CJ_PAY_SUB_PROCESS_ACTION");
                            intent2.putExtra("multi_process_result_type", "H5_RESULT");
                            intent2.putExtra("multi_process_h5_code_result", i);
                            intent2.putExtra("multi_process_h5_msg_result", str);
                            cJPayMainProcessActivity.sendBroadcast(intent2);
                        }
                        CJPayMainProcessActivity.this.finish();
                    }
                });
            }
        }
    }
}
