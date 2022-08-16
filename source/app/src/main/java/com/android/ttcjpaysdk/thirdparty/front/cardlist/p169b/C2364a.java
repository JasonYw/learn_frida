package com.android.ttcjpaysdk.thirdparty.front.cardlist.p169b;

import com.android.ttcjpaysdk.thirdparty.data.C2340b;
import com.android.ttcjpaysdk.thirdparty.data.CJPayUserAgreement;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.android.ttcjpaysdk.thirdparty.front.cardlist.b.a */
/* loaded from: classes17.dex */
public final class C2364a {
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;

    /* renamed from: LJ */
    public String f25527LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public boolean LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public int LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public C2340b LJIJJLI;
    public C2340b LJIL;
    public String LJJI;
    public String LJJIFFI;
    public ArrayList<CJPayUserAgreement> LJJ = new ArrayList<>();
    public String LJJII = "";
    public String LJJIII = "";
    public String LJJIIJ = "";

    static {
        Covode.recordClassIndex(8501);
    }

    public final boolean LIZ() {
        if (this.LJIILL == 2) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return "1".equals(this.LIZJ);
    }

    public final JSONObject LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("icon_url", this.LIZIZ);
            jSONObject.put("status", this.LIZJ);
            jSONObject.put("title", this.LIZLLL);
            jSONObject.put("sub_title", this.f25527LJ);
            jSONObject.put("sub_title_icon", this.LJFF);
            jSONObject.put("mark", this.LJI);
            jSONObject.put("bank_card_id", this.LJII);
            jSONObject.put("bank_name", this.LJIIIIZZ);
            jSONObject.put("card_no_mask", this.LJIIIZ);
            jSONObject.put("isChecked", this.LJIIJ);
            jSONObject.put("paymentType", this.LJIIJJI);
            jSONObject.put("need_pwd", this.LJIIL);
            jSONObject.put("need_send_sms", this.LJIILIIL);
            jSONObject.put("mobile_mask", this.LJIILJJIL);
            jSONObject.put("card_level", this.LJIILL);
            jSONObject.put("tt_mark", this.LJIILLIIL);
            jSONObject.put("tt_title", this.LJIIZILJ);
            jSONObject.put("tt_sub_title", this.LJIJ);
            jSONObject.put("tt_sub_title_icon", this.LJIJI);
            jSONObject.put("tt_icon_url", this.LJIJJ);
            jSONObject.put("account", this.LJJI);
            jSONObject.put("card_type_name", this.LJJIFFI);
            jSONObject.put("perday_limit", this.LJJII);
            jSONObject.put("perpay_limit", this.LJJIII);
            jSONObject.put("withdraw_msg", this.LJJIIJ);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
