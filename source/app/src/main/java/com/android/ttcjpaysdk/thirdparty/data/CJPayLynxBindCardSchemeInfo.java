package com.android.ttcjpaysdk.thirdparty.data;

import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C136992ca3;

/* loaded from: classes17.dex */
public final class CJPayLynxBindCardSchemeInfo implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String app_id;
    public String jh_app_id;
    public String jh_merchant_id;
    public String merchant_id;
    public String source;
    public String tea_source;
    public String url;

    static {
        Covode.recordClassIndex(8336);
    }

    public CJPayLynxBindCardSchemeInfo() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final String buildScheme() {
        boolean z;
        CJPayLynxBindCardSchemeInfo cJPayLynxBindCardSchemeInfo;
        boolean z2;
        String str;
        String str2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (this.url.length() > 0 && this.source.length() > 0 && this.tea_source.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cJPayLynxBindCardSchemeInfo = this;
        } else {
            cJPayLynxBindCardSchemeInfo = null;
        }
        if (cJPayLynxBindCardSchemeInfo != null) {
            if (2 == CJPayHostInfo.serverType) {
                z2 = true;
                str = "1200003766";
            } else {
                z2 = false;
                C136992ca3 LIZ = C136992ca3.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ, "");
                str = LIZ.LJIIL().jh_merchant_id;
            }
            this.jh_merchant_id = str;
            if (z2) {
                str2 = "800037665481";
            } else {
                C136992ca3 LIZ2 = C136992ca3.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                str2 = LIZ2.LJIIL().jh_app_id;
            }
            this.jh_app_id = str2;
            String str3 = this.merchant_id;
            if (str3.length() <= 0 || str3 == null) {
                str3 = "800010000160013";
            }
            this.merchant_id = str3;
            String str4 = this.app_id;
            if (str4.length() <= 0 || str4 == null) {
                str4 = "NA202008272032554177543173";
            }
            this.app_id = str4;
            new StringBuilder();
            String str5 = this.url;
            String str6 = "?";
            if (StringsKt__StringsKt.contains$default((CharSequence) this.url, (CharSequence) str6, false, 2, (Object) null)) {
                str6 = "&";
            }
            String m25080C = C0002O.m25080C(str5, str6, "merchant_id=", this.merchant_id, "&app_id=", this.app_id, "&jh_merchant_id=", this.jh_merchant_id, "&jh_app_id=", this.jh_app_id, "&source=", this.source, "&tea_source=", this.tea_source);
            if (m25080C != null) {
                return m25080C;
            }
        }
        return "";
    }

    public CJPayLynxBindCardSchemeInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C106862S5w.LIZ(str, str2, str3, str4, str5, str6, str7);
        this.url = str;
        this.merchant_id = str2;
        this.app_id = str3;
        this.jh_merchant_id = str4;
        this.jh_app_id = str5;
        this.source = str6;
        this.tea_source = str7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ CJPayLynxBindCardSchemeInfo(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.thirdparty.data.CJPayLynxBindCardSchemeInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
