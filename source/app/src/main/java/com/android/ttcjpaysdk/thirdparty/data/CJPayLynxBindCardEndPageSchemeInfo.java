package com.android.ttcjpaysdk.thirdparty.data;

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
public final class CJPayLynxBindCardEndPageSchemeInfo implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String app_id;
    public String bankName;
    public String bankType;
    public boolean isAuth;
    public boolean isSetPwd;
    public String memberBizOrderNo;
    public String merchant_id;
    public String source;
    public String tea_source;
    public String url;

    static {
        Covode.recordClassIndex(8335);
    }

    public CJPayLynxBindCardEndPageSchemeInfo() {
        this(null, null, null, null, null, null, null, null, false, false, 1023, null);
    }

    public final String buildScheme() {
        boolean z;
        CJPayLynxBindCardEndPageSchemeInfo cJPayLynxBindCardEndPageSchemeInfo;
        int i;
        int i2 = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (this.url.length() > 0 && this.bankName.length() > 0 && this.bankType.length() > 0 && this.memberBizOrderNo.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cJPayLynxBindCardEndPageSchemeInfo = this;
        } else {
            cJPayLynxBindCardEndPageSchemeInfo = null;
        }
        if (cJPayLynxBindCardEndPageSchemeInfo != null) {
            String str = this.merchant_id;
            if (str.length() <= 0 || str == null) {
                str = "800010000160013";
            }
            this.merchant_id = str;
            String str2 = this.app_id;
            if (str2.length() <= 0 || str2 == null) {
                str2 = "NA202008272032554177543173";
            }
            this.app_id = str2;
            C136992ca3 LIZ = C136992ca3.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            this.source = LIZ.LJIIL().source;
            C136992ca3 LIZ2 = C136992ca3.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            this.tea_source = LIZ2.LJIIL().tea_sourch_ntv;
            new StringBuilder();
            String str3 = this.url;
            String str4 = "?";
            if (StringsKt__StringsKt.contains$default((CharSequence) this.url, (CharSequence) str4, false, 2, (Object) null)) {
                str4 = "&";
            }
            String str5 = this.merchant_id;
            String str6 = this.app_id;
            String str7 = this.source;
            String str8 = this.tea_source;
            String str9 = this.bankName;
            String str10 = this.bankType;
            String str11 = this.memberBizOrderNo;
            if (this.isAuth) {
                i = 1;
            } else {
                i = 0;
            }
            Integer valueOf = Integer.valueOf(i);
            if (this.isSetPwd) {
                i2 = 1;
            }
            String m25080C = C0002O.m25080C(str3, str4, "merchant_id=", str5, "&app_id=", str6, "&source=", str7, "&tea_source=", str8, "&bank_name=", str9, "&bank_type=", str10, "&member_biz_order_no=", str11, "&is_authed=", valueOf, "&is_set_pwd=", Integer.valueOf(i2), "&quickbind=1");
            if (m25080C != null) {
                return m25080C;
            }
        }
        return "";
    }

    public CJPayLynxBindCardEndPageSchemeInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2) {
        C106862S5w.LIZ(str, str2, str3, str4, str5, str6, str7, str8);
        this.url = str;
        this.merchant_id = str2;
        this.app_id = str3;
        this.bankName = str4;
        this.bankType = str5;
        this.memberBizOrderNo = str6;
        this.source = str7;
        this.tea_source = str8;
        this.isAuth = z;
        this.isSetPwd = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ CJPayLynxBindCardEndPageSchemeInfo(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21, boolean r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r12 = this;
            r10 = r21
            r1 = r23
            r8 = r19
            r3 = r14
            r2 = r13
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0 = r1 & 1
            java.lang.String r9 = ""
            if (r0 == 0) goto L16
            r2 = r9
        L16:
            r0 = r1 & 2
            if (r0 == 0) goto L1b
            r3 = r9
        L1b:
            r0 = r1 & 4
            if (r0 == 0) goto L20
            r4 = r9
        L20:
            r0 = r1 & 8
            if (r0 == 0) goto L25
            r5 = r9
        L25:
            r0 = r1 & 16
            if (r0 == 0) goto L2a
            r6 = r9
        L2a:
            r0 = r1 & 32
            if (r0 == 0) goto L2f
            r7 = r9
        L2f:
            r0 = r1 & 64
            if (r0 == 0) goto L34
            r8 = r9
        L34:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L3a
            r9 = r20
        L3a:
            r0 = r1 & 256(0x100, float:3.59E-43)
            r11 = 0
            if (r0 == 0) goto L40
            r10 = 0
        L40:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L46
            r11 = r22
        L46:
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.thirdparty.data.CJPayLynxBindCardEndPageSchemeInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
