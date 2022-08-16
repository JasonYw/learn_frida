package com.android.ttcjpaysdk.bindcard.unionpay.bean;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayBindCardParamsBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayCardAddBean;
import com.android.ttcjpaysdk.thirdparty.data.CJPayFaceVerifyInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.ttm.player.MediaPlayer;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C135876cI3;

/* loaded from: classes17.dex */
public final class UnionPaySignInfo implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String action_page_type;
    public String additional_verify_type;
    public String display_desc;
    public String display_icon;
    public CJPayFaceVerifyInfo face_verify_info;
    public String identity_verify_order_no;
    public String signOrderNo;
    public String union_pay_sign_status;
    public String voucher_label;

    static {
        Covode.recordClassIndex(7336);
    }

    public UnionPaySignInfo() {
        this(null, null, null, null, null, null, null, null, null, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
    }

    public final String getAdditional_verify_type() {
        return this.additional_verify_type;
    }

    public final String getSmchId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return C135876cI3.LJIIJ();
    }

    public final boolean isSigned() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return Intrinsics.areEqual(this.union_pay_sign_status, "valid");
    }

    public final boolean getGoSetPwd() {
        CJPayBindCardParamsBean cJPayBindCardParamsBean;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], C135876cI3.f17973LJ, C135876cI3.LIZ, false, 7);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        CJPayCardAddBean cJPayCardAddBean = C135876cI3.LIZJ;
        if (cJPayCardAddBean == null || (cJPayBindCardParamsBean = cJPayCardAddBean.url_params) == null || cJPayBindCardParamsBean.isSetPwd()) {
            return false;
        }
        return true;
    }

    public final UnionPayPageType getPageType() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (UnionPayPageType) proxy.result;
        }
        String str = this.action_page_type;
        switch (str.hashCode()) {
            case -1513014117:
                if (str.equals("face_verify")) {
                    return UnionPayPageType.TYPE_FACE_VERIFY;
                }
                break;
            case -1135664540:
                if (str.equals("union_pay_sign")) {
                    return UnionPayPageType.TYPE_UNION_PAY_SIGN;
                }
                break;
            case -529964262:
                if (str.equals("identity_verify")) {
                    return UnionPayPageType.TYPE_IDENTITY_VERIFY;
                }
                break;
            case 57402406:
                if (str.equals("union_pay_card_list")) {
                    return UnionPayPageType.TYPE_UNION_CARD_LIST;
                }
                break;
        }
        return UnionPayPageType.TYPE_DEFAULT;
    }

    public final void setAdditional_verify_type(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.additional_verify_type = str;
    }

    public UnionPaySignInfo(String str, String str2, String str3, CJPayFaceVerifyInfo cJPayFaceVerifyInfo, String str4, String str5, String str6, String str7, String str8) {
        C106862S5w.LIZ(str, str2, str3, cJPayFaceVerifyInfo, str4, str5, str6, str7, str8);
        this.identity_verify_order_no = str;
        this.union_pay_sign_status = str2;
        this.action_page_type = str3;
        this.face_verify_info = cJPayFaceVerifyInfo;
        this.additional_verify_type = str4;
        this.display_icon = str5;
        this.display_desc = str6;
        this.voucher_label = str7;
        this.signOrderNo = str8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ UnionPaySignInfo(java.lang.String r27, java.lang.String r28, java.lang.String r29, com.android.ttcjpaysdk.thirdparty.data.CJPayFaceVerifyInfo r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
            r26 = this;
            r0 = r36
            r24 = r34
            r23 = r33
            r18 = r28
            r17 = r27
            r19 = r29
            r22 = r32
            r21 = r31
            r2 = r30
            r1 = r0 & 1
            java.lang.String r25 = ""
            if (r1 == 0) goto L1a
            r17 = r25
        L1a:
            r1 = r0 & 2
            if (r1 == 0) goto L20
            r18 = r25
        L20:
            r1 = r0 & 4
            if (r1 == 0) goto L26
            r19 = r25
        L26:
            r1 = r0 & 8
            if (r1 == 0) goto L3f
            com.android.ttcjpaysdk.thirdparty.data.CJPayFaceVerifyInfo r2 = new com.android.ttcjpaysdk.thirdparty.data.CJPayFaceVerifyInfo
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 4095(0xfff, float:5.738E-42)
            r16 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L3f:
            r1 = r0 & 16
            if (r1 == 0) goto L45
            r21 = r25
        L45:
            r1 = r0 & 32
            if (r1 == 0) goto L4b
            r22 = r25
        L4b:
            r1 = r0 & 64
            if (r1 == 0) goto L51
            r23 = r25
        L51:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L57
            r24 = r25
        L57:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L5d
            r25 = r35
        L5d:
            r16 = r26
            r20 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPaySignInfo.<init>(java.lang.String, java.lang.String, java.lang.String, com.android.ttcjpaysdk.thirdparty.data.CJPayFaceVerifyInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
