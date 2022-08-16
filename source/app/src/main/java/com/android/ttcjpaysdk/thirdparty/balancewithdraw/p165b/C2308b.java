package com.android.ttcjpaysdk.thirdparty.balancewithdraw.p165b;

import android.text.TextUtils;
import com.android.ttcjpaysdk.thirdparty.balance.data.CJPayBalanceTradeInfo;
import com.android.ttcjpaysdk.thirdparty.balance.data.CJPayBalanceTradeQueryResponseBean;
import com.android.ttcjpaysdk.thirdparty.balance.p159d.C2297a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;
import p003X.C135465cBQ;
import p003X.C136246cO1;
import p003X.C136293cOm;
import p003X.C136294cOn;

/* renamed from: com.android.ttcjpaysdk.thirdparty.balancewithdraw.b.b */
/* loaded from: classes17.dex */
public final class C2308b extends C2297a {
    public static ChangeQuickRedirect LIZIZ;

    static {
        Covode.recordClassIndex(8068);
    }

    public final JSONObject LIZ(long j, String str, String str2, String str3, int i, int i2, String str4) {
        String str5;
        CJPayBalanceTradeInfo cJPayBalanceTradeInfo;
        int i3 = 1;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2), str4}, this, LIZIZ, false, 10);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject LIZ = LIZ(j);
        C136293cOm c136293cOm = C136294cOn.LIZIZ;
        CJPayBalanceTradeQueryResponseBean cJPayBalanceTradeQueryResponseBean = C136246cO1.LIZLLL;
        if (cJPayBalanceTradeQueryResponseBean == null || (cJPayBalanceTradeInfo = cJPayBalanceTradeQueryResponseBean.trade_info) == null || (str5 = cJPayBalanceTradeInfo.trade_status) == null) {
            str5 = "";
        }
        C135465cBQ.LIZ(LIZ, "status", c136293cOm.LIZJ(str5));
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        C135465cBQ.LIZ(LIZ, "banner_url", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        C135465cBQ.LIZ(LIZ, "banner_no", str2);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        C135465cBQ.LIZ(LIZ, "place_no", str3);
        if (i != 1) {
            i3 = 0;
        }
        C135465cBQ.LIZ(LIZ, "is_first", Integer.valueOf(i3));
        C135465cBQ.LIZ(LIZ, "frame_order", Integer.valueOf(i));
        C135465cBQ.LIZ(LIZ, "frame_num", Integer.valueOf(i2));
        if (TextUtils.isEmpty(str4)) {
            str4 = "";
        }
        C135465cBQ.LIZ(LIZ, "jump_url", str4);
        return LIZ(LIZ);
    }
}
