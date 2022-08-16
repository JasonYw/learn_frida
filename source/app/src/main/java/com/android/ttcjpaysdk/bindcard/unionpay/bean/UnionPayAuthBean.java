package com.android.ttcjpaysdk.bindcard.unionpay.bean;

import androidx.core.view.MotionEventCompat;
import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayCardProtocolBean;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayProtocolGroupContentsBean;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class UnionPayAuthBean implements CJPayObject, Serializable {
    public String authorization_icon_url;
    public String guide_message;
    public String id_code_mask;
    public String mobile_mask;
    public String name_mask;
    public CJPayProtocolGroupContentsBean protocol_bean;
    public HashMap<String, String> protocol_group_names;
    public ArrayList<CJPayCardProtocolBean> protocol_list;

    static {
        Covode.recordClassIndex(7329);
    }

    public UnionPayAuthBean() {
        this(null, null, null, null, null, null, null, null, MotionEventCompat.ACTION_MASK, null);
    }

    public UnionPayAuthBean(String str, String str2, String str3, String str4, ArrayList<CJPayCardProtocolBean> arrayList, HashMap<String, String> hashMap, String str5, CJPayProtocolGroupContentsBean cJPayProtocolGroupContentsBean) {
        C106862S5w.LIZ(str, str2, str3, str4, arrayList, hashMap, str5, cJPayProtocolGroupContentsBean);
        this.authorization_icon_url = str;
        this.name_mask = str2;
        this.id_code_mask = str3;
        this.mobile_mask = str4;
        this.protocol_list = arrayList;
        this.protocol_group_names = hashMap;
        this.guide_message = str5;
        this.protocol_bean = cJPayProtocolGroupContentsBean;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ UnionPayAuthBean(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.util.ArrayList r15, java.util.HashMap r16, java.lang.String r17, com.android.ttcjpaysdk.base.p135ui.data.CJPayProtocolGroupContentsBean r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r1 = r19
            r9 = r18
            r3 = r12
            r2 = r11
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r0 = r1 & 1
            java.lang.String r8 = ""
            if (r0 == 0) goto L12
            r2 = r8
        L12:
            r0 = r1 & 2
            if (r0 == 0) goto L17
            r3 = r8
        L17:
            r0 = r1 & 4
            if (r0 == 0) goto L1c
            r4 = r8
        L1c:
            r0 = r1 & 8
            if (r0 == 0) goto L21
            r5 = r8
        L21:
            r0 = r1 & 16
            if (r0 == 0) goto L2a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L2a:
            r0 = r1 & 32
            if (r0 == 0) goto L33
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
        L33:
            r0 = r1 & 64
            if (r0 != 0) goto L39
            r8 = r17
        L39:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L42
            com.android.ttcjpaysdk.base.ui.data.CJPayProtocolGroupContentsBean r9 = new com.android.ttcjpaysdk.base.ui.data.CJPayProtocolGroupContentsBean
            r9.<init>()
        L42:
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPayAuthBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.util.HashMap, java.lang.String, com.android.ttcjpaysdk.base.ui.data.CJPayProtocolGroupContentsBean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
