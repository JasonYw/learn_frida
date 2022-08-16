package com.android.ttcjpaysdk.thirdparty.verify.provider;

import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.service.ICJPayVerifyQueryCallBack;
import com.android.ttcjpaysdk.base.service.ICJPayVerifyQueryParams;
import com.android.ttcjpaysdk.base.service.ICJPayVerifyQueryService;
import com.android.ttcjpaysdk.thirdparty.data.CJPayProcessInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayRiskInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;
import p003X.AbstractC136408cQd;
import p003X.AbstractC136410cQf;
import p003X.C136406cQb;

/* loaded from: classes17.dex */
public class CJPayVerifyQueryProvider implements ICJPayVerifyQueryService {
    public static ChangeQuickRedirect LIZ;
    public C136406cQb LIZIZ;

    static {
        Covode.recordClassIndex(8974);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public String getPackageName() {
        return null;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayVerifyQueryService
    public void release() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        C136406cQb c136406cQb = this.LIZIZ;
        if (c136406cQb != null) {
            c136406cQb.LIZIZ();
        }
        this.LIZIZ = null;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayVerifyQueryService
    public void start() {
        C136406cQb c136406cQb;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported && (c136406cQb = this.LIZIZ) != null) {
            c136406cQb.LIZ();
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayVerifyQueryService
    public void initVerifyQuery(final ICJPayVerifyQueryParams iCJPayVerifyQueryParams, final ICJPayVerifyQueryCallBack iCJPayVerifyQueryCallBack) {
        if (PatchProxy.proxy(new Object[]{iCJPayVerifyQueryParams, iCJPayVerifyQueryCallBack}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZIZ = new C136406cQb(new AbstractC136408cQd(this) { // from class: com.android.ttcjpaysdk.thirdparty.verify.provider.CJPayVerifyQueryProvider.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(8975);
            }

            @Override // p003X.AbstractC136408cQd
            public final int LIZ() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
                if (proxy.isSupported) {
                    return ((Integer) proxy.result).intValue();
                }
                return iCJPayVerifyQueryParams.getQueryResultTimes();
            }

            @Override // p003X.AbstractC136408cQd
            public final String LIZJ() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
                if (proxy.isSupported) {
                    return (String) proxy.result;
                }
                return iCJPayVerifyQueryParams.getAppId();
            }

            @Override // p003X.AbstractC136408cQd
            public final String LIZLLL() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
                if (proxy.isSupported) {
                    return (String) proxy.result;
                }
                return iCJPayVerifyQueryParams.getMerchantId();
            }

            @Override // p003X.AbstractC136408cQd
            /* renamed from: LJ */
            public final String mo16027LJ() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
                if (proxy.isSupported) {
                    return (String) proxy.result;
                }
                return iCJPayVerifyQueryParams.getTradeNo();
            }

            @Override // p003X.AbstractC136408cQd
            public final CJPayProcessInfo LIZIZ() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
                if (proxy.isSupported) {
                    return (CJPayProcessInfo) proxy.result;
                }
                return (CJPayProcessInfo) CJPayJsonParser.fromJson(iCJPayVerifyQueryParams.getProcessInfo(), CJPayProcessInfo.class);
            }

            @Override // p003X.AbstractC136408cQd
            public final CJPayRiskInfo LIZ(boolean z) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{(byte) 1}, this, LIZ, false, 3);
                if (proxy.isSupported) {
                    return (CJPayRiskInfo) proxy.result;
                }
                return (CJPayRiskInfo) CJPayJsonParser.fromJson(iCJPayVerifyQueryParams.getHttpRiskInfo(true), CJPayRiskInfo.class);
            }
        }, new AbstractC136410cQf(this) { // from class: com.android.ttcjpaysdk.thirdparty.verify.provider.CJPayVerifyQueryProvider.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(8976);
            }

            @Override // p003X.AbstractC136410cQf
            public final void LIZ(JSONObject jSONObject) {
                if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                iCJPayVerifyQueryCallBack.onResult(jSONObject);
            }
        });
    }
}
