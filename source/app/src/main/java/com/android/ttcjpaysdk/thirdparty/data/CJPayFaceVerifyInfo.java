package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class CJPayFaceVerifyInfo implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String agreement_desc;
    public String agreement_url;
    public String button_desc;
    public String face_content;
    public String face_scene;
    public String name_mask;
    public boolean need_live_detection;
    public String show_style;
    public String smch_id;
    public String uid;
    public String verify_channel;
    public String verify_type;

    static {
        Covode.recordClassIndex(8332);
    }

    public CJPayFaceVerifyInfo() {
        this(null, null, null, null, null, null, null, false, null, null, null, null, 4095, null);
    }

    public final boolean hasSrc() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return Intrinsics.areEqual(this.verify_type, "1");
    }

    public final JSONObject toJSON() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("verify_type", this.verify_type);
        jSONObject.put("face_content", this.face_content);
        jSONObject.put("agreement_url", this.agreement_url);
        jSONObject.put("agreement_desc", this.agreement_desc);
        jSONObject.put("name_mask", this.name_mask);
        jSONObject.put("uid", this.uid);
        return jSONObject;
    }

    public final CJPayFaceVerifyInfo parseJSON(JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (CJPayFaceVerifyInfo) proxy.result;
        }
        if (jSONObject != null) {
            String optString = jSONObject.optString("verify_type");
            if (optString == null) {
                optString = "";
            }
            this.verify_type = optString;
            String optString2 = jSONObject.optString("face_content");
            if (optString2 == null) {
                optString2 = "";
            }
            this.face_content = optString2;
            String optString3 = jSONObject.optString("agreement_url");
            if (optString3 == null) {
                optString3 = "";
            }
            this.agreement_url = optString3;
            String optString4 = jSONObject.optString("agreement_desc");
            if (optString4 == null) {
                optString4 = "";
            }
            this.agreement_desc = optString4;
            String optString5 = jSONObject.optString("name_mask");
            if (optString5 == null) {
                optString5 = "";
            }
            this.name_mask = optString5;
            String optString6 = jSONObject.optString("uid");
            if (optString6 == null) {
                optString6 = "";
            }
            this.uid = optString6;
        }
        return this;
    }

    public final CJPayFaceVerifyInfo setNameAndUId(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (CJPayFaceVerifyInfo) proxy.result;
        }
        C106862S5w.LIZ(str, str2);
        this.name_mask = str;
        this.uid = str2;
        return this;
    }

    public CJPayFaceVerifyInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, String str11) {
        C106862S5w.LIZ(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
        this.verify_type = str;
        this.face_content = str2;
        this.agreement_url = str3;
        this.agreement_desc = str4;
        this.name_mask = str5;
        this.uid = str6;
        this.smch_id = str7;
        this.need_live_detection = z;
        this.verify_channel = str8;
        this.show_style = str9;
        this.button_desc = str10;
        this.face_scene = str11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ CJPayFaceVerifyInfo(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, boolean r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r14 = this;
            r12 = r25
            r11 = r24
            r10 = r23
            r9 = r22
            r1 = r27
            r8 = r21
            r3 = r16
            r2 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r0 = r1 & 1
            java.lang.String r13 = ""
            if (r0 == 0) goto L1e
            r2 = r13
        L1e:
            r0 = r1 & 2
            if (r0 == 0) goto L23
            r3 = r13
        L23:
            r0 = r1 & 4
            if (r0 == 0) goto L28
            r4 = r13
        L28:
            r0 = r1 & 8
            if (r0 == 0) goto L2d
            r5 = r13
        L2d:
            r0 = r1 & 16
            if (r0 == 0) goto L32
            r6 = r13
        L32:
            r0 = r1 & 32
            if (r0 == 0) goto L37
            r7 = r13
        L37:
            r0 = r1 & 64
            if (r0 == 0) goto L3c
            r8 = r13
        L3c:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L41
            r9 = 0
        L41:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L46
            r10 = r13
        L46:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L4c
            java.lang.String r11 = "0"
        L4c:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L51
            r12 = r13
        L51:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L57
            r13 = r26
        L57:
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.thirdparty.data.CJPayFaceVerifyInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
