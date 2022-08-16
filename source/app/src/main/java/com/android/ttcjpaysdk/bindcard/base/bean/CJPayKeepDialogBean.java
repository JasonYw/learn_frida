package com.android.ttcjpaysdk.bindcard.base.bean;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.ttm.player.MediaPlayer;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.util.List;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p002O.C0002O;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class CJPayKeepDialogBean implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String color;
    public String default_checked;
    public String icon_urls;
    public String input_affect_window;
    public String msg;
    public String pic_msg;
    public String pic_title;
    public String pic_url;
    public String title;

    static {
        Covode.recordClassIndex(7027);
    }

    public CJPayKeepDialogBean() {
        this(null, null, null, null, null, null, null, null, null, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
    }

    public final String getColor() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (StringsKt__StringsJVMKt.startsWith$default(this.color, "#", false, 2, null)) {
            return this.color;
        }
        return C0002O.m25086C("#", this.color);
    }

    public final List<String> getIconUrls() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        return StringsKt__StringsKt.split$default((CharSequence) this.icon_urls, new String[]{Constants.ACCEPT_TIME_SEPARATOR_SP}, false, 0, 6, (Object) null);
    }

    public CJPayKeepDialogBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        C106862S5w.LIZ(str, str2, str3, str4, str5, str6, str7, str8, str9);
        this.title = str;
        this.icon_urls = str2;
        this.msg = str3;
        this.color = str4;
        this.pic_title = str5;
        this.pic_msg = str6;
        this.pic_url = str7;
        this.default_checked = str8;
        this.input_affect_window = str9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ CJPayKeepDialogBean(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r11 = this;
            r10 = r20
            r1 = r21
            r8 = r18
            r3 = r13
            r2 = r12
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r0 = r1 & 1
            java.lang.String r9 = ""
            if (r0 == 0) goto L15
            r2 = r9
        L15:
            r0 = r1 & 2
            if (r0 == 0) goto L1a
            r3 = r9
        L1a:
            r0 = r1 & 4
            if (r0 == 0) goto L1f
            r4 = r9
        L1f:
            r0 = r1 & 8
            if (r0 == 0) goto L24
            r5 = r9
        L24:
            r0 = r1 & 16
            if (r0 == 0) goto L29
            r6 = r9
        L29:
            r0 = r1 & 32
            if (r0 == 0) goto L2e
            r7 = r9
        L2e:
            r0 = r1 & 64
            if (r0 == 0) goto L33
            r8 = r9
        L33:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L39
            r9 = r19
        L39:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L3f
            java.lang.String r10 = "Y"
        L3f:
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.bindcard.base.bean.CJPayKeepDialogBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
