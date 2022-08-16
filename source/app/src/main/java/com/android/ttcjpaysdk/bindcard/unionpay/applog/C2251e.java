package com.android.ttcjpaysdk.bindcard.unionpay.applog;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import p003X.C135544cCh;

/* renamed from: com.android.ttcjpaysdk.bindcard.unionpay.applog.e */
/* loaded from: classes17.dex */
public final class C2251e extends C135544cCh {
    public static ChangeQuickRedirect LIZIZ;
    public final String LIZJ = "wallet_two_elements_identified_page_imp";
    public final String LIZLLL = "wallet_two_elements_identified_page_name_input";

    /* renamed from: LJ */
    public final String f25490LJ = "wallet_two_elements_identified_page_idnumber_input";
    public final String LJFF = "wallet_two_elements_identified_page_agreement_click";
    public final String LJI = "wallet_two_elements_identified_page_next_click";
    public final String LJII = "wallet_addbcard_onestepbind_alivecheck";

    static {
        Covode.recordClassIndex(7325);
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 9).isSupported) {
            return;
        }
        LIZ(this.LJII, MapsKt__MapsKt.hashMapOf(TuplesKt.m137to("is_alivecheck", Integer.valueOf(z ? 1 : 0))));
    }

    public final void LIZ(int i, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2}, this, LIZIZ, false, 5).isSupported) {
            return;
        }
        HashMap<String, Object> hashMapOf = MapsKt__MapsKt.hashMapOf(TuplesKt.m137to("result", Integer.valueOf(i)), TuplesKt.m137to("button_name", 1), TuplesKt.m137to("is_onestep", 1), TuplesKt.m137to("needidentify", 1), TuplesKt.m137to("haspass", 0), TuplesKt.m137to("show_onestep", 0));
        if (str != null) {
            hashMapOf.put("error_code", str);
        }
        if (str2 != null) {
            hashMapOf.put("error_msg", str2);
        }
        LIZ(this.LJI, hashMapOf);
    }
}
