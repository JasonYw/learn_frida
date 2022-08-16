package com.android.ttcjpaysdk.thirdparty.fingerprint;

import android.app.Activity;
import android.content.Context;
import com.android.ttcjpaysdk.base.service.ICJPayFingerprintEnableCallback;
import com.android.ttcjpaysdk.base.service.ICJPayFingerprintService;
import com.android.ttcjpaysdk.base.service.IFingerprintGuideCallback;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import javax.crypto.Cipher;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C136968cZf;

/* loaded from: classes17.dex */
public final class CJPayFingerprintGuideHelper$onAuthSucceeded$1 extends Lambda implements Function1<Activity, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ Cipher $cipher;
    public final /* synthetic */ DialogC2355b $fingerprintDialog;
    public final /* synthetic */ JSONObject $hostInfo;
    public final /* synthetic */ IFingerprintGuideCallback $onFingerprintGuideCallback;
    public final /* synthetic */ JSONObject $processInfo;
    public final /* synthetic */ String $tradeNo;
    public final /* synthetic */ String $uid;
    public final /* synthetic */ C136968cZf this$0;

    static {
        Covode.recordClassIndex(8405);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayFingerprintGuideHelper$onAuthSucceeded$1(C136968cZf c136968cZf, IFingerprintGuideCallback iFingerprintGuideCallback, DialogC2355b dialogC2355b, Cipher cipher, JSONObject jSONObject, String str, JSONObject jSONObject2, String str2, Activity activity) {
        super(1);
        this.this$0 = c136968cZf;
        this.$onFingerprintGuideCallback = iFingerprintGuideCallback;
        this.$fingerprintDialog = dialogC2355b;
        this.$cipher = cipher;
        this.$processInfo = jSONObject;
        this.$uid = str;
        this.$hostInfo = jSONObject2;
        this.$tradeNo = str2;
        this.$activity = activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Activity activity) {
        if (!PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(activity);
            IFingerprintGuideCallback iFingerprintGuideCallback = this.$onFingerprintGuideCallback;
            if (iFingerprintGuideCallback != null) {
                iFingerprintGuideCallback.onAuthSucceededEvent();
            }
            if (this.$fingerprintDialog.isShowing()) {
                C116971W2r.LIZ(this.$fingerprintDialog);
            }
            ICJPayFingerprintService iCJPayFingerprintService = this.this$0.LIZLLL;
            if (iCJPayFingerprintService != null) {
                iCJPayFingerprintService.enableFingerprintWithoutPwd(this.$cipher, this.$processInfo, this.$uid, this.$hostInfo, this.$tradeNo, new ICJPayFingerprintEnableCallback() { // from class: com.android.ttcjpaysdk.thirdparty.fingerprint.CJPayFingerprintGuideHelper$onAuthSucceeded$1.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(8406);
                    }

                    @Override // com.android.ttcjpaysdk.base.service.ICJPayFingerprintEnableCallback
                    public final void onEnableSucceeded() {
                        Context context;
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        IFingerprintGuideCallback iFingerprintGuideCallback2 = CJPayFingerprintGuideHelper$onAuthSucceeded$1.this.$onFingerprintGuideCallback;
                        if (iFingerprintGuideCallback2 != null) {
                            iFingerprintGuideCallback2.onEnableSucceededEvent();
                        }
                        Activity activity2 = CJPayFingerprintGuideHelper$onAuthSucceeded$1.this.$activity;
                        if (activity2 != null) {
                            context = activity2.getApplicationContext();
                        } else {
                            context = null;
                        }
                        CJPayBasicUtils.displayToast(context, 2131561642);
                    }

                    @Override // com.android.ttcjpaysdk.base.service.ICJPayFingerprintEnableCallback
                    public final void onEnableFailed(String str, String str2, JSONObject jSONObject) {
                        Context context;
                        Context context2;
                        if (PatchProxy.proxy(new Object[]{str, str2, jSONObject}, this, LIZ, false, 2).isSupported) {
                            return;
                        }
                        IFingerprintGuideCallback iFingerprintGuideCallback2 = CJPayFingerprintGuideHelper$onAuthSucceeded$1.this.$onFingerprintGuideCallback;
                        if (iFingerprintGuideCallback2 != null) {
                            iFingerprintGuideCallback2.onEnableFailedEvent(str);
                        }
                        Activity activity2 = CJPayFingerprintGuideHelper$onAuthSucceeded$1.this.$activity;
                        Context context3 = null;
                        if (activity2 != null) {
                            context = activity2.getApplicationContext();
                        } else {
                            context = null;
                        }
                        if (!CJPayBasicUtils.isNetworkAvailable(context)) {
                            Activity activity3 = CJPayFingerprintGuideHelper$onAuthSucceeded$1.this.$activity;
                            if (activity3 != null) {
                                context3 = activity3.getApplicationContext();
                            }
                            CJPayBasicUtils.displayToast(context3, 2131558456);
                            return;
                        }
                        Activity activity4 = CJPayFingerprintGuideHelper$onAuthSucceeded$1.this.$activity;
                        if (activity4 != null) {
                            context2 = activity4.getApplicationContext();
                        } else {
                            context2 = null;
                        }
                        if (str == null) {
                            Activity activity5 = CJPayFingerprintGuideHelper$onAuthSucceeded$1.this.$activity;
                            if (activity5 != null) {
                                str = activity5.getString(2131561640);
                            } else {
                                str = null;
                            }
                        }
                        CJPayBasicUtils.displayToast(context2, str);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }
}
