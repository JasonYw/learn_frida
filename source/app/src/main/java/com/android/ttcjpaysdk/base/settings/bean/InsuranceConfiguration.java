package com.android.ttcjpaysdk.base.settings.bean;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class InsuranceConfiguration implements CJPayObject, Serializable {
    public String dark_amount_keyboard_icon;
    public String dark_icon;
    public String keyboard_denoise_icon;
    public String keyboard_icon;
    public String light_amount_keyboard_icon;
    public String light_icon;
    public boolean show;

    static {
        Covode.recordClassIndex(6571);
    }

    public InsuranceConfiguration() {
        this(false, null, null, null, null, null, null, 127, null);
    }

    public InsuranceConfiguration(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        C106862S5w.LIZ(str, str2, str3, str4, str5, str6);
        this.show = z;
        this.light_icon = str;
        this.dark_icon = str2;
        this.keyboard_icon = str3;
        this.keyboard_denoise_icon = str4;
        this.light_amount_keyboard_icon = str5;
        this.dark_amount_keyboard_icon = str6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ InsuranceConfiguration(boolean r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r6 = r14
            r5 = r13
            r4 = r12
            r3 = r11
            r1 = r9
            r2 = r10
            r0 = r16 & 1
            if (r0 == 0) goto Lb
            r1 = 0
        Lb:
            r0 = r16 & 2
            java.lang.String r7 = ""
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
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.base.settings.bean.InsuranceConfiguration.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
