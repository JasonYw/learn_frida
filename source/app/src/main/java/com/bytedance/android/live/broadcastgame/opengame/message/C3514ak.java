package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.message.ak */
/* loaded from: classes5.dex */
public final class C3514ak {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("title")
    public final String LIZIZ;
    @SerializedName("screen_shot_uri")
    public final String LIZJ;
    @SerializedName("start_page_url")
    public String LIZLLL;
    @SerializedName("customized_cover_uri")

    /* renamed from: LJ */
    public final String f26061LJ;
    @SerializedName("status")
    public int LJFF;
    @SerializedName("card_content")
    public final String LJI;
    @SerializedName("customized_title")
    public final String LJII;

    static {
        Covode.recordClassIndex(20273);
    }

    public C3514ak() {
        this(null, null, null, null, 0, null, null, 127);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.f26061LJ, Integer.valueOf(this.LJFF), this.LJI, this.LJII};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3514ak) {
            return C106862S5w.LIZ(((C3514ak) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("MiniCardInfo:%s,%s,%s,%s,%s,%s,%s", LIZ());
    }

    public C3514ak(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        C106862S5w.LIZ(str, str2, str3, str4, str5, str6);
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.f26061LJ = str4;
        this.LJFF = i;
        this.LJI = str5;
        this.LJII = str6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C3514ak(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, java.lang.String r14, java.lang.String r15, int r16) {
        /*
            r8 = this;
            r4 = r12
            r6 = r14
            r3 = r11
            r1 = r9
            r5 = r13
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
            if (r0 == 0) goto L22
            r0 = 0
            r5 = 0
        L22:
            r0 = r16 & 32
            if (r0 == 0) goto L27
            r6 = r7
        L27:
            r0 = r16 & 64
            if (r0 != 0) goto L2c
            r7 = r15
        L2c:
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.opengame.message.C3514ak.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int):void");
    }
}
