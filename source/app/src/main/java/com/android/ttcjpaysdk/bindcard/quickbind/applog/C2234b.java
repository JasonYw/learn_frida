package com.android.ttcjpaysdk.bindcard.quickbind.applog;

import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.thirdparty.data.CJPayVoucherInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.HashMap;
import org.json.JSONObject;
import p003X.AbstractC135545cCi;
import p003X.C135734cFl;
import p003X.C136000cK3;

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.applog.b */
/* loaded from: classes17.dex */
public final class C2234b implements AbstractC135545cCi {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public int f25481LJ;
    public CJPayHostInfo LJFF;
    public HashMap<String, CJPayVoucherInfo> LJI;
    public String LIZIZ = "";
    public String LIZJ = "";
    public String LJII = "";

    static {
        Covode.recordClassIndex(7230);
    }

    public final void LIZ() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        try {
            String str2 = "";
            if (this.LJFF == null) {
                str = str2;
            } else {
                str = this.LJFF.merchantId;
            }
            if (this.LJFF != null) {
                str2 = this.LJFF.appId;
            }
            C135734cFl.LIZ("wallet_addbcard_captcha_nosms_imp", CJPayParamsUtils.LIZ(str, str2), LIZJ());
        } catch (Exception unused) {
        }
    }

    public final void LIZIZ() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        try {
            String str2 = "";
            if (this.LJFF == null) {
                str = str2;
            } else {
                str = this.LJFF.merchantId;
            }
            if (this.LJFF != null) {
                str2 = this.LJFF.appId;
            }
            C135734cFl.LIZ("wallet_addbcard_captcha_input", CJPayParamsUtils.LIZ(str, str2), LIZJ());
        } catch (Exception unused) {
        }
    }

    public JSONObject LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject LIZLLL = C135734cFl.LIZLLL();
        try {
            LIZLLL.put("bank_type", this.LIZIZ);
            LIZLLL.put("bank_name", this.LIZJ);
            if (this.LIZLLL) {
                LIZLLL.put("is_alivecheck", 1);
            } else {
                LIZLLL.put("is_alivecheck", 0);
            }
            LIZLLL.put("is_onestep", this.f25481LJ);
            LIZLLL.put("activity_info", C136000cK3.LIZIZ.LIZ(this.LJI, this.LJII));
        } catch (Exception unused) {
        }
        return LIZLLL;
    }

    public final void LIZIZ(String str) {
        String str2;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 5).isSupported) {
            return;
        }
        try {
            String str3 = "";
            if (this.LJFF == null) {
                str2 = str3;
            } else {
                str2 = this.LJFF.merchantId;
            }
            if (this.LJFF != null) {
                str3 = this.LJFF.appId;
            }
            JSONObject LIZ2 = CJPayParamsUtils.LIZ(str2, str3);
            JSONObject LIZJ = LIZJ();
            LIZJ.put("button_name", str);
            C135734cFl.LIZ("wallet_addbcard_captcha_keep_pop_click", LIZ2, LIZJ);
        } catch (Exception unused) {
        }
    }

    public final void LIZ(String str) {
        String str2;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 3).isSupported) {
            return;
        }
        try {
            String str3 = "";
            if (this.LJFF == null) {
                str2 = str3;
            } else {
                str2 = this.LJFF.merchantId;
            }
            if (this.LJFF != null) {
                str3 = this.LJFF.appId;
            }
            JSONObject LIZ2 = CJPayParamsUtils.LIZ(str2, str3);
            JSONObject LIZJ = LIZJ();
            LIZJ.put("button_name", str);
            C135734cFl.LIZ("wallet_addbcard_captcha_click", LIZ2, LIZJ);
        } catch (Exception unused) {
        }
    }

    public final void LIZ(long j, String str, String str2, String str3) {
        String str4;
        if (PatchProxy.proxy(new Object[]{new Long(j), str, str2, str3}, this, LIZ, false, 8).isSupported) {
            return;
        }
        try {
            String str5 = "";
            if (this.LJFF == null) {
                str4 = str5;
            } else {
                str4 = this.LJFF.merchantId;
            }
            if (this.LJFF != null) {
                str5 = this.LJFF.appId;
            }
            JSONObject LIZ2 = CJPayParamsUtils.LIZ(str4, str5);
            JSONObject LIZJ = LIZJ();
            LIZJ.put("loading_time", j);
            LIZJ.put("captcha_result", str);
            LIZJ.put("error_code", str2);
            LIZJ.put(PushMessageHelper.ERROR_MESSAGE, str3);
            C135734cFl.LIZ("wallet_addbcard_captcha_submit_result", LIZ2, LIZJ);
        } catch (Exception unused) {
        }
    }
}
