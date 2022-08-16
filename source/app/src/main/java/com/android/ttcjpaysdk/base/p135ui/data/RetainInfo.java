package com.android.ttcjpaysdk.base.p135ui.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.android.ttcjpaysdk.base.ui.data.RetainInfo */
/* loaded from: classes17.dex */
public class RetainInfo implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String choice_pwd_check_way;
    public String choice_pwd_check_way_title;
    public FeatureInfo feature_info;
    public String forget_pwd_verify_type;
    public String retain_button_text;
    public String retain_msg_bonus;
    public ArrayList<RetainMessageInfo> retain_msg_bonus_list;
    public String retain_msg_text;
    public ArrayList<RetainMessageInfo> retain_msg_text_list;
    public String retain_plan;
    public String retain_type;
    public boolean show_choice_pwd_check_way;
    public boolean show_retain_window;
    public String style;
    public String title;
    public String type;

    static {
        Covode.recordClassIndex(6648);
    }

    public RetainInfo() {
        this(null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, 65535, null);
    }

    public final boolean isFeatureStyle() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return Intrinsics.areEqual("feature", this.type);
    }

    public final boolean isNewStyle() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return "2.0".equals(this.style);
    }

    public RetainInfo(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, boolean z2, String str8, String str9, String str10, ArrayList<RetainMessageInfo> arrayList, ArrayList<RetainMessageInfo> arrayList2, String str11, FeatureInfo featureInfo) {
        C106862S5w.LIZ(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList, arrayList2, str11);
        this.title = str;
        this.retain_msg_bonus = str2;
        this.retain_msg_text = str3;
        this.retain_type = str4;
        this.show_retain_window = z;
        this.retain_plan = str5;
        this.choice_pwd_check_way = str6;
        this.choice_pwd_check_way_title = str7;
        this.show_choice_pwd_check_way = z2;
        this.retain_button_text = str8;
        this.forget_pwd_verify_type = str9;
        this.style = str10;
        this.retain_msg_text_list = arrayList;
        this.retain_msg_bonus_list = arrayList2;
        this.type = str11;
        this.feature_info = featureInfo;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ RetainInfo(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, boolean r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.util.ArrayList r31, java.util.ArrayList r32, java.lang.String r33, com.android.ttcjpaysdk.base.p135ui.data.FeatureInfo r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            r18 = this;
            r1 = r35
            r14 = r31
            r13 = r30
            r12 = r29
            r11 = r28
            r17 = r34
            r9 = r26
            r8 = r25
            r3 = r20
            r15 = r32
            r6 = r23
            r2 = r19
            r4 = r21
            r7 = r24
            r5 = r22
            r0 = r1 & 1
            java.lang.String r16 = ""
            if (r0 == 0) goto L26
            r2 = r16
        L26:
            r0 = r1 & 2
            if (r0 == 0) goto L2c
            r3 = r16
        L2c:
            r0 = r1 & 4
            if (r0 == 0) goto L32
            r4 = r16
        L32:
            r0 = r1 & 8
            if (r0 == 0) goto L38
            java.lang.String r5 = "2"
        L38:
            r0 = r1 & 16
            r10 = 0
            if (r0 == 0) goto L3e
            r6 = 0
        L3e:
            r0 = r1 & 32
            if (r0 == 0) goto L44
            r7 = r16
        L44:
            r0 = r1 & 64
            if (r0 == 0) goto L4a
            r8 = r16
        L4a:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L50
            r9 = r16
        L50:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L56
            r10 = r27
        L56:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L5c
            r11 = r16
        L5c:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L62
            r12 = r16
        L62:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L68
            r13 = r16
        L68:
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L71
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L71:
            r0 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L7a
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L7a:
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 != 0) goto L80
            r16 = r33
        L80:
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L88
            r17 = 0
        L88:
            r1 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.base.p135ui.data.RetainInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.lang.String, com.android.ttcjpaysdk.base.ui.data.FeatureInfo, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
