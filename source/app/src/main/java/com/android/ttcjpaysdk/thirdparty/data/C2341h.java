package com.android.ttcjpaysdk.thirdparty.data;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C106862S5w;

/* renamed from: com.android.ttcjpaysdk.thirdparty.data.h */
/* loaded from: classes17.dex */
public final class C2341h implements CJPayObject {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String face_app_id;
    public String face_scene;
    public String face_sdk_data;
    public String face_veri_ticket;
    public String scene;

    static {
        Covode.recordClassIndex(8392);
    }

    public C2341h() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean hasSrc() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return TextUtils.equals(this.scene, "cj_live_check");
    }

    public final JSONObject toJson() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("face_veri_ticket", this.face_veri_ticket);
            jSONObject.put("face_sdk_data", this.face_sdk_data);
            jSONObject.put("face_app_id", this.face_app_id);
            jSONObject.put("face_scene", this.scene);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public C2341h(String str, String str2, String str3, String str4, String str5) {
        C106862S5w.LIZ(str, str2, str3, str4, str5);
        this.face_veri_ticket = str;
        this.face_sdk_data = str2;
        this.face_app_id = str3;
        this.scene = str4;
        this.face_scene = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C2341h(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r4 = r10
            r3 = r9
            r1 = r7
            r2 = r8
            r0 = r12 & 1
            java.lang.String r5 = ""
            if (r0 == 0) goto Lb
            r1 = r5
        Lb:
            r0 = r12 & 2
            if (r0 == 0) goto L10
            r2 = r5
        L10:
            r0 = r12 & 4
            if (r0 == 0) goto L15
            r3 = r5
        L15:
            r0 = r12 & 8
            if (r0 == 0) goto L1a
            r4 = r5
        L1a:
            r0 = r12 & 16
            if (r0 != 0) goto L1f
            r5 = r11
        L1f:
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.thirdparty.data.C2341h.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
