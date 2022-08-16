package com.android.ttcjpaysdk.thirdparty.verify.provider;

import android.content.Context;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.service.ICJPayVerifyFastPayParamsCallBack;
import com.android.ttcjpaysdk.base.service.ICJPayVerifyFastPayResultCallBack;
import com.android.ttcjpaysdk.base.service.ICJPayVerifyFastPayService;
import com.android.ttcjpaysdk.thirdparty.data.CJPayProcessInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayRiskInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayTradeConfirmBizContentParams;
import com.android.ttcjpaysdk.thirdparty.verify.p176a.AbstractC2392a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC136395cQQ;
import p003X.C136335cPS;
import p003X.C136450cRJ;
import p003X.C136546cSr;
import p003X.C136577cTM;
import p003X.C136579cTO;
import p003X.C136580cTP;
import p003X.C136586cTV;
import p003X.C136587cTW;
import p003X.C136588cTX;
import p003X.C136649cUW;
import p003X.C136657cUe;
import p003X.C136658cUf;

/* loaded from: classes17.dex */
public class CJPayVerifyFastPayProvider implements ICJPayVerifyFastPayService {
    public static ChangeQuickRedirect LIZ;
    public C136450cRJ LIZIZ;
    public C136546cSr LIZJ;

    static {
        Covode.recordClassIndex(8945);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public String getPackageName() {
        return null;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayVerifyFastPayService
    public boolean hasShownKeepDialog() {
        C136450cRJ c136450cRJ = this.LIZIZ;
        if (c136450cRJ != null) {
            return c136450cRJ.LJIL;
        }
        return true;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayVerifyFastPayService
    public String getCheckList() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C136450cRJ c136450cRJ = this.LIZIZ;
        if (c136450cRJ != null) {
            return c136450cRJ.LJFF();
        }
        return "";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayVerifyFastPayService
    public boolean isEmpty() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C136450cRJ c136450cRJ = this.LIZIZ;
        if (c136450cRJ == null) {
            return false;
        }
        return c136450cRJ.LIZLLL();
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayVerifyFastPayService
    public boolean onBackPressed() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C136450cRJ c136450cRJ = this.LIZIZ;
        if (c136450cRJ == null) {
            return false;
        }
        return c136450cRJ.LIZJ();
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayVerifyFastPayService
    public void release() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        C136450cRJ c136450cRJ = this.LIZIZ;
        if (c136450cRJ != null) {
            c136450cRJ.m21733LJ();
        }
        this.LIZIZ = null;
        this.LIZJ = null;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayVerifyFastPayService
    public void setHashShownKeepDialog() {
        C136450cRJ c136450cRJ;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported && (c136450cRJ = this.LIZIZ) != null) {
            c136450cRJ.LJII();
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayVerifyFastPayService
    public boolean whenBackPressedExit() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C136450cRJ c136450cRJ = this.LIZIZ;
        if (c136450cRJ == null) {
            return false;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c136450cRJ, C136450cRJ.LIZ, false, 7);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        AbstractC2392a LIZ2 = c136450cRJ.LIZIZ.LIZ();
        if (LIZ2 == null) {
            return false;
        }
        return LIZ2.LJIIIZ();
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayVerifyFastPayService
    public void setPayMethod(String str) {
        C136450cRJ c136450cRJ = this.LIZIZ;
        if (c136450cRJ != null) {
            c136450cRJ.LJJ = str;
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayVerifyFastPayService
    public void start(String str, int i, int i2, boolean z) {
        C136450cRJ c136450cRJ;
        if (!PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4).isSupported && (c136450cRJ = this.LIZIZ) != null) {
            c136450cRJ.LIZ(str, i, i2, z);
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayVerifyFastPayService
    public void initVerifyComponents(Context context, int i, final ICJPayVerifyFastPayParamsCallBack iCJPayVerifyFastPayParamsCallBack, ICJPayVerifyFastPayResultCallBack iCJPayVerifyFastPayResultCallBack) {
        if (PatchProxy.proxy(new Object[]{context, Integer.valueOf(i), iCJPayVerifyFastPayParamsCallBack, iCJPayVerifyFastPayResultCallBack}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZJ = new C136546cSr();
        C136546cSr c136546cSr = this.LIZJ;
        c136546cSr.LJIILLIIL = true;
        c136546cSr.LJI = new AbstractC136395cQQ(this) { // from class: com.android.ttcjpaysdk.thirdparty.verify.provider.CJPayVerifyFastPayProvider.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(8946);
            }

            @Override // p003X.AbstractC136395cQQ
            public final C136335cPS LIZIZ() {
                return null;
            }

            @Override // p003X.AbstractC136395cQQ
            public final String LIZLLL() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
                if (proxy.isSupported) {
                    return (String) proxy.result;
                }
                return iCJPayVerifyFastPayParamsCallBack.getAppId();
            }

            @Override // p003X.AbstractC136395cQQ
            /* renamed from: LJ */
            public final String mo16028LJ() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
                if (proxy.isSupported) {
                    return (String) proxy.result;
                }
                return iCJPayVerifyFastPayParamsCallBack.getMerchantId();
            }

            @Override // p003X.AbstractC136395cQQ
            public final CJPayProcessInfo LIZJ() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
                if (proxy.isSupported) {
                    return (CJPayProcessInfo) proxy.result;
                }
                return (CJPayProcessInfo) CJPayJsonParser.fromJson(iCJPayVerifyFastPayParamsCallBack.getProcessInfo(), CJPayProcessInfo.class);
            }

            @Override // p003X.AbstractC136395cQQ
            public final CJPayTradeConfirmBizContentParams LIZ() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
                if (proxy.isSupported) {
                    return (CJPayTradeConfirmBizContentParams) proxy.result;
                }
                return (CJPayTradeConfirmBizContentParams) CJPayJsonParser.fromJson(iCJPayVerifyFastPayParamsCallBack.getTradeConfirmParams(), CJPayTradeConfirmBizContentParams.class);
            }

            @Override // p003X.AbstractC136395cQQ
            public final CJPayRiskInfo LIZ(boolean z) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{(byte) 0}, this, LIZ, false, 3);
                if (proxy.isSupported) {
                    return (CJPayRiskInfo) proxy.result;
                }
                return (CJPayRiskInfo) CJPayJsonParser.fromJson(iCJPayVerifyFastPayParamsCallBack.getHttpRiskInfo(false), CJPayRiskInfo.class);
            }
        };
        this.LIZJ.LJIIIIZZ = new C136657cUe(this, iCJPayVerifyFastPayParamsCallBack);
        this.LIZJ.LJIIIZ = new C136658cUf(this, iCJPayVerifyFastPayParamsCallBack);
        this.LIZJ.LJIIJ = new C136588cTX(this, iCJPayVerifyFastPayParamsCallBack);
        this.LIZJ.LJIIJJI = new C136586cTV(this, iCJPayVerifyFastPayParamsCallBack);
        this.LIZJ.LJII = new C136579cTO(this, iCJPayVerifyFastPayParamsCallBack);
        this.LIZJ.LJIILJJIL = new C136649cUW(this, iCJPayVerifyFastPayParamsCallBack);
        this.LIZJ.LJIILL = new C136580cTP(this, iCJPayVerifyFastPayParamsCallBack);
        this.LIZJ.LJIIZILJ = new C136587cTW(this, iCJPayVerifyFastPayParamsCallBack);
        this.LIZIZ = new C136450cRJ(context, i, this.LIZJ);
        this.LIZIZ.f18039LJ = new C136577cTM(this, iCJPayVerifyFastPayResultCallBack);
    }
}
