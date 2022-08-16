package com.android.ttcjpaysdk.thirdparty.fingerprint;

import android.app.Activity;
import com.android.ttcjpaysdk.base.service.ICJPayFingerprintService;
import com.android.ttcjpaysdk.base.service.IFingerprintGuideCallback;
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
import p003X.C136971cZi;

/* loaded from: classes17.dex */
public final class CJPayFingerprintGuideHelper$onAuthSucceeded$2 extends Lambda implements Function1<Activity, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ Cipher $cipher;
    public final /* synthetic */ DialogC2355b $fingerprintDialog;
    public final /* synthetic */ JSONObject $hostInfo;
    public final /* synthetic */ String $key;
    public final /* synthetic */ String $memberBizOrderNo;
    public final /* synthetic */ IFingerprintGuideCallback $onFingerprintGuideCallback;
    public final /* synthetic */ String $uid;
    public final /* synthetic */ C136968cZf this$0;

    static {
        Covode.recordClassIndex(8407);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayFingerprintGuideHelper$onAuthSucceeded$2(C136968cZf c136968cZf, IFingerprintGuideCallback iFingerprintGuideCallback, DialogC2355b dialogC2355b, Activity activity, Cipher cipher, String str, String str2, JSONObject jSONObject, String str3) {
        super(1);
        this.this$0 = c136968cZf;
        this.$onFingerprintGuideCallback = iFingerprintGuideCallback;
        this.$fingerprintDialog = dialogC2355b;
        this.$activity = activity;
        this.$cipher = cipher;
        this.$key = str;
        this.$uid = str2;
        this.$hostInfo = jSONObject;
        this.$memberBizOrderNo = str3;
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
            C136971cZi c136971cZi = new C136971cZi(this);
            ICJPayFingerprintService iCJPayFingerprintService = this.this$0.LIZLLL;
            if (iCJPayFingerprintService != null) {
                iCJPayFingerprintService.enableFingerprintWithoutPwdInPaymentManager(this.$cipher, this.$key, this.$uid, this.$hostInfo, this.$memberBizOrderNo, c136971cZi);
            }
        }
        return Unit.INSTANCE;
    }
}
