package com.alipay.sdk.p082m.p101j;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p107m.C1328a;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.alipay.sdk.p082m.p121u.C1399n;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.alipay.sdk.m.j.d */
/* loaded from: classes2.dex */
public class C1297d {

    /* renamed from: b */
    public static AbstractC1298a f22179b;

    /* renamed from: com.alipay.sdk.m.j.d$a */
    /* loaded from: classes2.dex */
    public interface AbstractC1298a {
        static {
            Covode.recordClassIndex(4798);
        }

        /* renamed from: a */
        void mo18706a(boolean z, JSONObject jSONObject, String str);
    }

    static {
        Covode.recordClassIndex(4797);
    }

    /* renamed from: a */
    public static boolean m19226a(C1376a c1376a, Context context) {
        return C1399n.m18805a(c1376a, context, (List<C1328a.C1330b>) Collections.singletonList(new C1328a.C1330b("com.taobao.taobao", 0, "")), false);
    }

    /* renamed from: a */
    public static boolean m19228a(C1376a c1376a, int i, int i2, Intent intent) {
        if (i != 1010 || intent == null) {
            return false;
        }
        AbstractC1298a abstractC1298a = f22179b;
        if (abstractC1298a == null) {
            return true;
        }
        f22179b = null;
        if (i2 != -1) {
            if (i2 != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                C1301a.m19211b(c1376a, "biz", "TbUnknown", sb.toString());
                return true;
            }
            C1301a.m19216a(c1376a, "biz", "TbCancel", intent.toUri(1));
            abstractC1298a.mo18706a(false, null, "CANCELED");
            return true;
        }
        C1301a.m19216a(c1376a, "biz", "TbOk", intent.toUri(1));
        abstractC1298a.mo18706a(true, C1399n.m18813a(intent), "OK");
        return true;
    }

    /* renamed from: a */
    public static boolean m19227a(C1376a c1376a, Activity activity, int i, String str, String str2, AbstractC1298a abstractC1298a) {
        try {
            C1301a.m19217a(c1376a, "biz", "TbStart");
            activity.startActivityForResult(new Intent(str2, Uri.parse(str)), i);
            f22179b = abstractC1298a;
            return true;
        } catch (Throwable th) {
            abstractC1298a.mo18706a(false, null, "UNKNOWN_ERROR");
            C1301a.m19215a(c1376a, "biz", "TbActFail", th);
            return false;
        }
    }
}
