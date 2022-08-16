package com.android.ttcjpaysdk.thirdparty.verify.provider;

import android.content.Context;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayFingerprintService;
import com.android.ttcjpaysdk.base.service.ICJPayVerifyCardSignCallBack;
import com.android.ttcjpaysdk.base.service.ICJPayVerifyFingerprintCallBack;
import com.android.ttcjpaysdk.base.service.ICJPayVerifyOneStepPaymentCallBack;
import com.android.ttcjpaysdk.base.service.ICJPayVerifyParamsCallBack;
import com.android.ttcjpaysdk.base.service.ICJPayVerifyResultCallBack;
import com.android.ttcjpaysdk.base.service.ICJPayVerifyService;
import com.android.ttcjpaysdk.thirdparty.data.CJPayProcessInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayRiskInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayTradeConfirmBizContentParams;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC136395cQQ;
import p003X.C136335cPS;
import p003X.C136450cRJ;
import p003X.C136546cSr;
import p003X.C136775cWY;
import p003X.C136808cX5;
import p003X.C136821cXI;
import p003X.C136827cXO;
import p003X.C136828cXP;
import p003X.C136829cXQ;
import p003X.C136830cXR;
import p003X.C136847cXi;
import p003X.C136858cXt;
import p003X.C136881cYG;
import p003X.C136912cYl;
import p003X.C136913cYm;
import p003X.C136914cYn;
import p003X.C136930cZ3;
import p003X.C136931cZ4;
import p003X.C136932cZ5;

/* loaded from: classes17.dex */
public class CJPayVerifyProvider implements ICJPayVerifyService {
    public static ChangeQuickRedirect LIZ;
    public C136450cRJ LIZIZ;
    public C136546cSr LIZJ;

    static {
        Covode.recordClassIndex(8956);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public String getPackageName() {
        return null;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayVerifyService
    public boolean isRelease() {
        if (this.LIZIZ == null) {
            return true;
        }
        return false;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayVerifyService
    public String getCheckList() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C136450cRJ c136450cRJ = this.LIZIZ;
        if (c136450cRJ != null) {
            return c136450cRJ.LJFF();
        }
        return "";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayVerifyService
    public boolean onBackPressed() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C136450cRJ c136450cRJ = this.LIZIZ;
        if (c136450cRJ == null) {
            return false;
        }
        return c136450cRJ.LIZJ();
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayVerifyService
    public void release() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        C136450cRJ c136450cRJ = this.LIZIZ;
        if (c136450cRJ != null) {
            c136450cRJ.m21733LJ();
        }
        this.LIZIZ = null;
        this.LIZJ = null;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayVerifyService
    public void stop() {
        C136450cRJ c136450cRJ;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported && (c136450cRJ = this.LIZIZ) != null) {
            c136450cRJ.LIZIZ();
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayVerifyService
    public void setPayMethod(String str) {
        C136450cRJ c136450cRJ = this.LIZIZ;
        if (c136450cRJ != null) {
            c136450cRJ.LJJ = str;
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayVerifyService
    public boolean isLocalEnableFingerprint(Context context, String str, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        ICJPayFingerprintService iCJPayFingerprintService = (ICJPayFingerprintService) CJPayServiceManager.getInstance().getIService(ICJPayFingerprintService.class);
        if (iCJPayFingerprintService == null) {
            return false;
        }
        return iCJPayFingerprintService.isLocalEnableFingerprint(context, str, true);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayVerifyService
    public void start(int i, int i2, int i3, boolean z) {
        C136450cRJ c136450cRJ;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 5).isSupported && (c136450cRJ = this.LIZIZ) != null) {
            c136450cRJ.LIZ(i, i2, i3, z);
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayVerifyService
    public void initVerifyComponents(Context context, int i, final ICJPayVerifyParamsCallBack iCJPayVerifyParamsCallBack, ICJPayVerifyResultCallBack iCJPayVerifyResultCallBack, ICJPayVerifyCardSignCallBack iCJPayVerifyCardSignCallBack, ICJPayVerifyFingerprintCallBack iCJPayVerifyFingerprintCallBack, ICJPayVerifyOneStepPaymentCallBack iCJPayVerifyOneStepPaymentCallBack) {
        if (PatchProxy.proxy(new Object[]{context, Integer.valueOf(i), iCJPayVerifyParamsCallBack, iCJPayVerifyResultCallBack, iCJPayVerifyCardSignCallBack, iCJPayVerifyFingerprintCallBack, iCJPayVerifyOneStepPaymentCallBack}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZJ = new C136546cSr();
        this.LIZJ.LJI = new AbstractC136395cQQ(this) { // from class: com.android.ttcjpaysdk.thirdparty.verify.provider.CJPayVerifyProvider.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(8957);
            }

            @Override // p003X.AbstractC136395cQQ
            public final String LIZLLL() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
                if (proxy.isSupported) {
                    return (String) proxy.result;
                }
                return iCJPayVerifyParamsCallBack.getAppId();
            }

            @Override // p003X.AbstractC136395cQQ
            /* renamed from: LJ */
            public final String mo16028LJ() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
                if (proxy.isSupported) {
                    return (String) proxy.result;
                }
                return iCJPayVerifyParamsCallBack.getMerchantId();
            }

            @Override // p003X.AbstractC136395cQQ
            public final C136335cPS LIZIZ() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
                if (proxy.isSupported) {
                    return (C136335cPS) proxy.result;
                }
                return (C136335cPS) CJPayJsonParser.fromJson(iCJPayVerifyParamsCallBack.getCardSignBizContentParams(), C136335cPS.class);
            }

            @Override // p003X.AbstractC136395cQQ
            public final CJPayProcessInfo LIZJ() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
                if (proxy.isSupported) {
                    return (CJPayProcessInfo) proxy.result;
                }
                return (CJPayProcessInfo) CJPayJsonParser.fromJson(iCJPayVerifyParamsCallBack.getProcessInfo(), CJPayProcessInfo.class);
            }

            @Override // p003X.AbstractC136395cQQ
            public final CJPayTradeConfirmBizContentParams LIZ() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
                if (proxy.isSupported) {
                    return (CJPayTradeConfirmBizContentParams) proxy.result;
                }
                return (CJPayTradeConfirmBizContentParams) CJPayJsonParser.fromJson(iCJPayVerifyParamsCallBack.getTradeConfirmParams(), CJPayTradeConfirmBizContentParams.class);
            }

            @Override // p003X.AbstractC136395cQQ
            public final CJPayRiskInfo LIZ(boolean z) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{(byte) 0}, this, LIZ, false, 4);
                if (proxy.isSupported) {
                    return (CJPayRiskInfo) proxy.result;
                }
                return (CJPayRiskInfo) CJPayJsonParser.fromJson(iCJPayVerifyParamsCallBack.getHttpRiskInfo(false), CJPayRiskInfo.class);
            }
        };
        this.LIZJ.LJIIIIZZ = new C136912cYl(this, iCJPayVerifyParamsCallBack);
        this.LIZJ.LJIIIZ = new C136913cYm(this, iCJPayVerifyParamsCallBack);
        this.LIZJ.LJIIJ = new C136858cXt(this, iCJPayVerifyParamsCallBack);
        this.LIZJ.LJIIJJI = new C136847cXi(this, iCJPayVerifyParamsCallBack);
        this.LIZJ.LJII = new C136827cXO(this, iCJPayVerifyParamsCallBack);
        this.LIZJ.LJIILJJIL = new C136881cYG(this, iCJPayVerifyParamsCallBack);
        this.LIZJ.LJIIL = new C136828cXP(this, iCJPayVerifyParamsCallBack);
        this.LIZJ.LJIILL = new C136829cXQ(this, iCJPayVerifyParamsCallBack);
        this.LIZJ.LJIJ = new C136808cX5(this, iCJPayVerifyParamsCallBack);
        this.LIZJ.LJIILIIL = new C136821cXI(this, iCJPayVerifyParamsCallBack);
        this.LIZJ.LJIJJLI = new C136830cXR(this, iCJPayVerifyParamsCallBack);
        this.LIZIZ = new C136450cRJ(context, i, this.LIZJ);
        this.LIZIZ.LIZLLL = new C136775cWY(this, iCJPayVerifyResultCallBack);
        this.LIZIZ.LJFF = new C136930cZ3(this, iCJPayVerifyCardSignCallBack);
        this.LIZIZ.LJI = new C136931cZ4(this, iCJPayVerifyOneStepPaymentCallBack);
        this.LIZIZ.LJII = new C136932cZ5(this, iCJPayVerifyFingerprintCallBack);
        this.LIZIZ.LJIIIZ = new C136914cYn(this, iCJPayVerifyParamsCallBack);
    }
}
