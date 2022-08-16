package com.android.ttcjpaysdk.base.settings.bean;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.List;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class BrandPromotion implements CJPayObject, Serializable {
    public String add_card_h1;
    public String add_card_title;
    public String cashier_title;
    public List<String> douyin_loading_url;
    public String full_set_password_title;
    public String full_set_password_title_again;
    public String full_verify_password_title;
    public String half_input_password_title;
    public String loading_gif;
    public String one_key_quick_cashier_title;
    public boolean password_keyboard_show_account_insurance;
    public boolean show_new_loading;

    static {
        Covode.recordClassIndex(6565);
    }

    public BrandPromotion() {
        this(false, null, null, null, null, null, null, null, null, null, false, null, 4095, null);
    }

    public BrandPromotion(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2, List<String> list) {
        C106862S5w.LIZ(str, str2, str3, str4, str5, str6, str7, str8, str9, list);
        this.show_new_loading = z;
        this.loading_gif = str;
        this.half_input_password_title = str2;
        this.full_verify_password_title = str3;
        this.full_set_password_title = str4;
        this.full_set_password_title_again = str5;
        this.cashier_title = str6;
        this.one_key_quick_cashier_title = str7;
        this.add_card_title = str8;
        this.add_card_h1 = str9;
        this.password_keyboard_show_account_insurance = z2;
        this.douyin_loading_url = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ BrandPromotion(boolean r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, boolean r25, java.util.List r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r14 = this;
            r1 = r27
            r13 = r26
            r9 = r22
            r8 = r21
            r3 = r16
            r10 = r23
            r2 = r15
            r5 = r18
            r4 = r17
            r6 = r19
            r7 = r20
            r0 = r1 & 1
            r12 = 0
            if (r0 == 0) goto L1b
            r2 = 0
        L1b:
            r0 = r1 & 2
            java.lang.String r11 = ""
            if (r0 == 0) goto L22
            r3 = r11
        L22:
            r0 = r1 & 4
            if (r0 == 0) goto L27
            r4 = r11
        L27:
            r0 = r1 & 8
            if (r0 == 0) goto L2c
            r5 = r11
        L2c:
            r0 = r1 & 16
            if (r0 == 0) goto L31
            r6 = r11
        L31:
            r0 = r1 & 32
            if (r0 == 0) goto L36
            r7 = r11
        L36:
            r0 = r1 & 64
            if (r0 == 0) goto L3b
            r8 = r11
        L3b:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L40
            r9 = r11
        L40:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L45
            r10 = r11
        L45:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L4b
            r11 = r24
        L4b:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 != 0) goto L51
            r12 = r25
        L51:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L5a
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L5a:
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.base.settings.bean.BrandPromotion.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
