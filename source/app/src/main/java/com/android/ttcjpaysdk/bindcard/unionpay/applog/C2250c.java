package com.android.ttcjpaysdk.bindcard.unionpay.applog;

import android.text.TextUtils;
import com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPayBankBean;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C135544cCh;

/* renamed from: com.android.ttcjpaysdk.bindcard.unionpay.applog.c */
/* loaded from: classes17.dex */
public final class C2250c extends C135544cCh {
    public static ChangeQuickRedirect LIZIZ;

    static {
        Covode.recordClassIndex(7323);
    }

    public final void LIZ(ArrayList<UnionPayBankBean> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, LIZIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(arrayList);
        try {
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<UnionPayBankBean> it = arrayList.iterator();
            while (it.hasNext()) {
                UnionPayBankBean next = it.next();
                if (Intrinsics.areEqual(next.status, "1")) {
                    stringBuffer.append(next.bank_name);
                    stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
            }
            String stringBuffer2 = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(stringBuffer2, "");
            if (!TextUtils.isEmpty(stringBuffer2)) {
                stringBuffer2 = stringBuffer2.substring(0, stringBuffer2.length() - 1);
                Intrinsics.checkNotNullExpressionValue(stringBuffer2, "");
            }
            LIZ("wallet_ysf_bcard_list_show", MapsKt__MapsKt.hashMapOf(TuplesKt.m137to("ysf_bank_list", stringBuffer2)));
        } catch (Exception unused) {
        }
    }

    public final void LIZ(String str, String str2, String str3, String str4) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, LIZIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2, str3, str4);
        LIZ("wallet_ysf_bcard_click", MapsKt__MapsKt.hashMapOf(TuplesKt.m137to("button_name", str), TuplesKt.m137to("result", str2), TuplesKt.m137to("error_code", str3), TuplesKt.m137to(PushMessageHelper.ERROR_MESSAGE, str4)));
    }

    public static /* synthetic */ void LIZ(C2250c c2250c, String str, String str2, String str3, String str4, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{c2250c, str, str2, null, null, Integer.valueOf(i), null}, null, LIZIZ, true, 4).isSupported) {
            return;
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        c2250c.LIZ(str, str2, str3, str4);
    }
}
