package com.android.ttcjpaysdk.thirdparty.fingerprint.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes17.dex */
public final class CJPayFingerprintVerifyLiveDetectBean implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String code;
    public String face_content;
    public String face_recognition_type;
    public String msg;
    public String name_mask;
    public String ret_status;
    public String status;

    static {
        Covode.recordClassIndex(8477);
    }

    public CJPayFingerprintVerifyLiveDetectBean() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final boolean isNeedRetry() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return Intrinsics.areEqual("MP060005", this.code);
    }

    public final boolean isVerifySuccess() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return Intrinsics.areEqual("MP000000", this.code);
    }

    public final boolean isResponseOK() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!Intrinsics.areEqual("MP000000", this.code) && !Intrinsics.areEqual("CD000000", this.code)) {
            return false;
        }
        return true;
    }

    public CJPayFingerprintVerifyLiveDetectBean(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.status = str;
        this.code = str2;
        this.msg = str3;
        this.ret_status = str4;
        this.face_content = str5;
        this.face_recognition_type = str6;
        this.name_mask = str7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ CJPayFingerprintVerifyLiveDetectBean(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r6 = r14
            r5 = r13
            r4 = r12
            r3 = r11
            r1 = r9
            r2 = r10
            r0 = r16 & 1
            java.lang.String r7 = ""
            if (r0 == 0) goto Ld
            r1 = r7
        Ld:
            r0 = r16 & 2
            if (r0 == 0) goto L12
            r2 = r7
        L12:
            r0 = r16 & 4
            if (r0 == 0) goto L17
            r3 = r7
        L17:
            r0 = r16 & 8
            if (r0 == 0) goto L1c
            r4 = r7
        L1c:
            r0 = r16 & 16
            if (r0 == 0) goto L21
            r5 = r7
        L21:
            r0 = r16 & 32
            if (r0 == 0) goto L26
            r6 = r7
        L26:
            r0 = r16 & 64
            if (r0 != 0) goto L2b
            r7 = r15
        L2b:
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.thirdparty.fingerprint.data.CJPayFingerprintVerifyLiveDetectBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
