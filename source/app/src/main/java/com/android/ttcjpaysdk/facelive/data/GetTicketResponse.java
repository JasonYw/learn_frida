package com.android.ttcjpaysdk.facelive.data;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class GetTicketResponse implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String agreement_desc;
    public String agreement_url;
    public String code;
    public String face_scene;
    public boolean is_signed;
    public String live_route;
    public String member_biz_order_no;
    public String msg;
    public String name_mask;
    public String protocol_check_box;
    public String scene;
    public String ticket;

    static {
        Covode.recordClassIndex(7418);
    }

    public GetTicketResponse() {
        this(null, null, null, false, null, null, null, null, null, null, null, null, 4095, null);
    }

    public final boolean hasSrc() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return TextUtils.equals(this.scene, "cj_live_check");
    }

    public final boolean isAILab() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return Intrinsics.areEqual(this.live_route, "AILABFIA");
    }

    public final boolean isNeedCheckBox() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return Intrinsics.areEqual("1", this.protocol_check_box);
    }

    public final boolean isResponseOK() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return Intrinsics.areEqual(this.code, "MP000000");
    }

    public GetTicketResponse(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        C106862S5w.LIZ(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
        this.code = str;
        this.msg = str2;
        this.ticket = str3;
        this.is_signed = z;
        this.agreement_url = str4;
        this.agreement_desc = str5;
        this.protocol_check_box = str6;
        this.name_mask = str7;
        this.scene = str8;
        this.member_biz_order_no = str9;
        this.live_route = str10;
        this.face_scene = str11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ GetTicketResponse(java.lang.String r15, java.lang.String r16, java.lang.String r17, boolean r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
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
            r5 = 0
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
            if (r0 == 0) goto L3d
            java.lang.String r8 = "1"
        L3d:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L42
            r9 = r13
        L42:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L47
            r10 = r13
        L47:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L4c
            r11 = r13
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
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.facelive.data.GetTicketResponse.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
