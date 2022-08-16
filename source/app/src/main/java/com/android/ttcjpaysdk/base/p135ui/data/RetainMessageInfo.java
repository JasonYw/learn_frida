package com.android.ttcjpaysdk.base.p135ui.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p003X.C106862S5w;

/* renamed from: com.android.ttcjpaysdk.base.ui.data.RetainMessageInfo */
/* loaded from: classes17.dex */
public final class RetainMessageInfo implements CJPayObject, Serializable {
    public String left_msg;
    public int left_msg_type;
    public String right_msg;
    public String top_left_msg;
    public int voucher_type;

    static {
        Covode.recordClassIndex(6650);
    }

    public RetainMessageInfo() {
        this(null, 0, null, null, 0, 31, null);
    }

    public RetainMessageInfo(String str, int i, String str2, String str3, int i2) {
        C106862S5w.LIZ(str, str2, str3);
        this.left_msg = str;
        this.left_msg_type = i;
        this.right_msg = str2;
        this.top_left_msg = str3;
        this.voucher_type = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ RetainMessageInfo(java.lang.String r8, int r9, java.lang.String r10, java.lang.String r11, int r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r7 = this;
            r6 = r12
            r4 = r10
            r2 = r8
            r3 = r9
            r0 = r13 & 1
            java.lang.String r5 = ""
            if (r0 == 0) goto Lb
            r2 = r5
        Lb:
            r1 = r13 & 2
            r0 = 0
            if (r1 == 0) goto L11
            r3 = 0
        L11:
            r0 = r13 & 4
            if (r0 == 0) goto L16
            r4 = r5
        L16:
            r0 = r13 & 8
            if (r0 != 0) goto L1b
            r5 = r11
        L1b:
            r0 = r13 & 16
            if (r0 == 0) goto L20
            r6 = 0
        L20:
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.base.p135ui.data.RetainMessageInfo.<init>(java.lang.String, int, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
