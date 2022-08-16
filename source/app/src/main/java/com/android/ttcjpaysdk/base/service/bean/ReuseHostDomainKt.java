package com.android.ttcjpaysdk.base.service.bean;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import org.json.JSONArray;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class ReuseHostDomainKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6551);
    }

    public static final void toStringList(JSONArray jSONArray, ArrayList<String> arrayList) {
        if (PatchProxy.proxy(new Object[]{jSONArray, arrayList}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(jSONArray, arrayList);
        try {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArray.optString(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
