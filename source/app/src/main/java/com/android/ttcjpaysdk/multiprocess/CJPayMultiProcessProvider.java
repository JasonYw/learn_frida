package com.android.ttcjpaysdk.multiprocess;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.service.ICJPayMultiProcessService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONObject;
import p003X.C116971W2r;

/* loaded from: classes17.dex */
public class CJPayMultiProcessProvider implements ICJPayMultiProcessService {
    public static ChangeQuickRedirect LIZ;
    public CJPaySubProcessReceiver LIZIZ = new CJPaySubProcessReceiver();

    static {
        Covode.recordClassIndex(7872);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public String getPackageName() {
        return null;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayMultiProcessService
    public void stop(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 3).isSupported) {
            return;
        }
        try {
            CJPaySubProcessReceiver cJPaySubProcessReceiver = this.LIZIZ;
            if (!PatchProxy.proxy(new Object[]{context, cJPaySubProcessReceiver}, null, CJPaySubProcessReceiver.LIZ, true, 5).isSupported && context != null) {
                C116971W2r.LIZ(context, cJPaySubProcessReceiver);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayMultiProcessService
    public void pay(Context context, JSONObject jSONObject, String str, int i, String str2, String str3, String str4) {
        if (PatchProxy.proxy(new Object[]{context, jSONObject, str, Integer.valueOf(i), str2, str3, str4}, this, LIZ, false, 2).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 1).isSupported) {
            CJPaySubProcessReceiver cJPaySubProcessReceiver = this.LIZIZ;
            if (!PatchProxy.proxy(new Object[]{context, cJPaySubProcessReceiver}, null, CJPaySubProcessReceiver.LIZ, true, 4).isSupported && context != null) {
                C116971W2r.LIZ(context, cJPaySubProcessReceiver, new IntentFilter("CJ_PAY_SUB_PROCESS_ACTION"), "cjpay.multi.process.permission", (Handler) null);
            }
        }
        CJPayHostInfo LIZ2 = CJPayHostInfo.LIZ(jSONObject);
        if (!PatchProxy.proxy(new Object[]{context, LIZ2, str, Integer.valueOf(i), str2, str3, str4}, null, CJPayMainProcessActivity.LIZ, true, 1).isSupported) {
            Intent intent = new Intent(context, CJPayMainProcessActivity.class);
            intent.putExtra(PushConstants.MZ_PUSH_MESSAGE_METHOD, "pay");
            intent.putExtra("host_info", LIZ2);
            intent.putExtra("sdk_info", str);
            intent.putExtra("service", i);
            intent.putExtra("subWay", str2);
            intent.putExtra("referer", str3);
            intent.putExtra("ext", str4);
            C116971W2r.LIZ(context, intent);
        }
    }
}
