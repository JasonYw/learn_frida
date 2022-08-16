package com.android.ttcjpaysdk.thirdparty.balance.p161f;

import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.network.CJPayNetworkManager;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.thirdparty.balance.p160e.C2298a;
import com.android.ttcjpaysdk.thirdparty.balance.view.AbstractC2300c;
import com.android.ttcjpaysdk.thirdparty.data.C2342n;
import com.android.ttcjpaysdk.thirdparty.data.CJPayProcessInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayTradeQueryBizContentParams;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;
import p003X.C106862S5w;
import p003X.C135543cCg;
import p003X.C136246cO1;
import p003X.C136316cP9;
import p003X.C136317cPA;
import p003X.C136340cPX;

/* renamed from: com.android.ttcjpaysdk.thirdparty.balance.f.a */
/* loaded from: classes17.dex */
public final class C2299a extends C135543cCg<C2298a, AbstractC2300c> {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(7986);
    }

    public final void LIZ() {
        M m;
        String str;
        String str2;
        HashMap<String, String> hashMap;
        String str3;
        CJPayProcessInfo cJPayProcessInfo;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported && (m = this.mModel) != 0) {
            C136316cP9 c136316cP9 = new C136316cP9(this);
            if (!PatchProxy.proxy(new Object[]{c136316cP9}, m, C2298a.LIZIZ, false, 2).isSupported) {
                C106862S5w.LIZ(c136316cP9);
                CJPayTradeQueryBizContentParams cJPayTradeQueryBizContentParams = new CJPayTradeQueryBizContentParams();
                CJPayProcessInfo cJPayProcessInfo2 = new CJPayProcessInfo();
                C2342n c2342n = C136246cO1.LIZJ;
                String str4 = "";
                if (c2342n == null || (cJPayProcessInfo = c2342n.process_info) == null || (str = cJPayProcessInfo.process_id) == null) {
                    str = str4;
                }
                cJPayProcessInfo2.process_id = str;
                cJPayTradeQueryBizContentParams.LIZJ = cJPayProcessInfo2;
                cJPayTradeQueryBizContentParams.f25523LJ = C136340cPX.LIZIZ.LIZ();
                String LIZ2 = CJPayParamsUtils.LIZ("bytepay.cashdesk.trade_query", CJPayParamsUtils.HostAPI.BDPAY);
                String LIZ3 = cJPayTradeQueryBizContentParams.LIZ();
                CJPayHostInfo cJPayHostInfo = C136246cO1.LIZIZ;
                if (cJPayHostInfo == null || (str2 = cJPayHostInfo.appId) == null) {
                    str2 = str4;
                }
                CJPayHostInfo cJPayHostInfo2 = C136246cO1.LIZIZ;
                if (cJPayHostInfo2 != null && (str3 = cJPayHostInfo2.merchantId) != null) {
                    str4 = str3;
                }
                Map<String, String> LIZ4 = CJPayParamsUtils.LIZ("bytepay.cashdesk.trade_query", LIZ3, str2, str4);
                CJPayHostInfo cJPayHostInfo3 = C136246cO1.LIZIZ;
                if (cJPayHostInfo3 != null) {
                    hashMap = cJPayHostInfo3.extraHeaderMap;
                } else {
                    hashMap = null;
                }
                m.LIZ(CJPayNetworkManager.postForm(LIZ2, LIZ4, CJPayParamsUtils.LIZ(LIZ2, "bytepay.cashdesk.trade_query", hashMap), c136316cP9));
            }
        }
    }

    public final void LIZ(String str, boolean z, boolean z2, boolean z3) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        C2298a c2298a = (C2298a) this.mModel;
        if (c2298a != null) {
            c2298a.LIZ(str, new C136317cPA(this, z, z2, z3));
        }
    }
}
