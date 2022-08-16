package com.android.ttcjpaysdk.bindcard.unionpay.applog;

import com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPaySignBean;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import p003X.C106862S5w;
import p003X.C135544cCh;

/* renamed from: com.android.ttcjpaysdk.bindcard.unionpay.applog.b */
/* loaded from: classes17.dex */
public final class C2249b extends C135544cCh {
    public static ChangeQuickRedirect LIZIZ;

    static {
        Covode.recordClassIndex(7322);
    }

    public final void LIZ(String str, String str2, UnionPaySignBean unionPaySignBean) {
        Pair[] pairArr;
        String str3;
        char c = 3;
        if (PatchProxy.proxy(new Object[]{str, str2, unionPaySignBean}, this, LIZIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        int hashCode = str2.hashCode();
        String str4 = PushMessageHelper.ERROR_MESSAGE;
        if (hashCode != 0) {
            if (hashCode != 49) {
                if (hashCode == 50 && str2.equals("2")) {
                    pairArr = new Pair[4];
                    pairArr[0] = TuplesKt.m137to("button_name", str);
                    pairArr[1] = TuplesKt.m137to("result", str2);
                    if (unionPaySignBean == null || (str3 = unionPaySignBean.code) == null) {
                        str3 = "";
                    }
                    pairArr[2] = TuplesKt.m137to("error_code", str3);
                    if (unionPaySignBean == null || (str = unionPaySignBean.msg) == null) {
                        str = "";
                    }
                } else {
                    return;
                }
            } else if (!str2.equals("1")) {
                return;
            } else {
                pairArr = new Pair[2];
                pairArr[0] = TuplesKt.m137to("button_name", str);
                str = str2;
                str4 = "result";
                c = 1;
            }
        } else if (!str2.equals("")) {
            return;
        } else {
            pairArr = new Pair[1];
            str4 = "button_name";
            c = 0;
        }
        pairArr[c] = TuplesKt.m137to(str4, str);
        LIZ("wallet_ysf_auth_page_click", MapsKt__MapsKt.hashMapOf(pairArr));
    }

    public static /* synthetic */ void LIZ(C2249b c2249b, String str, String str2, UnionPaySignBean unionPaySignBean, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{c2249b, str, str2, null, 4, null}, null, LIZIZ, true, 3).isSupported) {
            return;
        }
        c2249b.LIZ(str, str2, null);
    }
}
