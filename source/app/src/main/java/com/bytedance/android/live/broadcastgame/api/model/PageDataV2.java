package com.bytedance.android.live.broadcastgame.api.model;

import androidx.core.view.MotionEventCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.C106862S5w;
import p003X.C87838KjI;
import p003X.C87839KjJ;

/* loaded from: classes5.dex */
public final class PageDataV2 {
    public static ChangeQuickRedirect LIZ;
    public C87838KjI LIZIZ;
    public C87838KjI LIZJ;
    public String LIZLLL;

    /* renamed from: LJ */
    public C3362b f26017LJ;
    public boolean LJFF;
    public boolean LJI;
    public ReviewStatus LJII;
    public C87838KjI LJIIIIZZ;
    public C87838KjI LJIIIZ;
    public String LJIIJ;
    public boolean LJIIJJI;

    static {
        Covode.recordClassIndex(19157);
    }

    public PageDataV2() {
        this.LIZIZ = new C87838KjI(null, null, 3);
        this.LIZJ = new C87838KjI(null, null, 3);
        this.LIZLLL = "";
        this.LJI = true;
        this.LJII = ReviewStatus.REVIEW_PASS;
        this.LJIIIIZZ = new C87838KjI(null, null, 3);
        this.LJIIIZ = new C87838KjI(null, null, 3);
        this.LJIIJ = "";
    }

    /* loaded from: classes5.dex */
    public enum ReviewStatus {
        REVIEW_PASS(1),
        REVIEW_REJECT(2),
        REVIEW_UNKNOWN(0);
        
        public static final C87839KjJ Companion = new C87839KjJ((byte) 0);
        public static ChangeQuickRedirect changeQuickRedirect;
        public final Integer TYPE;

        public static ReviewStatus valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (ReviewStatus) (proxy.isSupported ? proxy.result : Enum.valueOf(ReviewStatus.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ReviewStatus[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (ReviewStatus[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(19158);
        }

        ReviewStatus(Integer num) {
            this.TYPE = num;
        }
    }

    public final PageDataV2 LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (PageDataV2) proxy.result;
        }
        PageDataV2 pageDataV2 = new PageDataV2();
        pageDataV2.LIZIZ = new C87838KjI(this.LIZIZ);
        pageDataV2.LIZJ = new C87838KjI(this.LIZJ);
        pageDataV2.LJIIIZ = new C87838KjI(this.LIZJ);
        pageDataV2.LJIIJ = this.LJIIJ;
        pageDataV2.LIZLLL = this.LIZLLL;
        pageDataV2.f26017LJ = this.f26017LJ;
        pageDataV2.LJFF = this.LJFF;
        pageDataV2.LIZIZ.LIZ(this.LIZIZ);
        pageDataV2.LJI = this.LJI;
        pageDataV2.LJII = this.LJII;
        pageDataV2.LJIIIIZZ = this.LJIIIIZZ;
        pageDataV2.LJIIJJI = this.LJIIJJI;
        return pageDataV2;
    }

    public final String LIZIZ() {
        String str;
        String str2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (!StringsKt__StringsJVMKt.isBlank(this.LIZLLL)) {
            return this.LIZLLL;
        }
        if (!StringsKt__StringsJVMKt.isBlank(this.LJIIJ)) {
            return this.LJIIJ;
        }
        C3362b c3362b = this.f26017LJ;
        String str3 = null;
        if (c3362b != null && (str2 = c3362b.LIZJ) != null && (!StringsKt__StringsJVMKt.isBlank(str2))) {
            C3362b c3362b2 = this.f26017LJ;
            if (c3362b2 != null) {
                str3 = c3362b2.LIZJ;
            }
            Intrinsics.checkNotNull(str3);
            return str3;
        }
        C3362b c3362b3 = this.f26017LJ;
        if (c3362b3 != null && (str = c3362b3.LIZLLL) != null && (!StringsKt__StringsJVMKt.isBlank(str))) {
            C3362b c3362b4 = this.f26017LJ;
            if (c3362b4 != null) {
                str3 = c3362b4.LIZLLL;
            }
            Intrinsics.checkNotNull(str3);
            return str3;
        }
        return "小程序";
    }

    public final void LIZ(C87838KjI c87838KjI) {
        if (PatchProxy.proxy(new Object[]{c87838KjI}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(c87838KjI);
        this.LIZJ = c87838KjI;
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJIIJ = str;
    }

    public final void LIZ(ReviewStatus reviewStatus) {
        if (PatchProxy.proxy(new Object[]{reviewStatus}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(reviewStatus);
        this.LJII = reviewStatus;
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LIZLLL = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
        if (r7 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
        r0 = r14.f26016LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
        if (r0 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
        r8 = r0.f8581LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (r8 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
        r0 = r14.f26016LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
        if (r0 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
        r9 = r0.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
        if (r9 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
        r0 = r14.f26016LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
        if (r0 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
        r4 = r0.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
        if (r4 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a2, code lost:
        r0 = r14.f26016LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a4, code lost:
        if (r0 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
        r5 = r0.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a8, code lost:
        if (r5 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
        r0 = r14.f26016LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00af, code lost:
        if (r0 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b1, code lost:
        r0 = r0.LJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
        if (r0 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b5, code lost:
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b6, code lost:
        r13.f26017LJ = new com.bytedance.android.live.broadcastgame.api.model.PageDataV2.C3362b(r4, r5, r6, r7, r8, r9, r10, null, 128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00be, code lost:
        if (r14 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c0, code lost:
        r0 = r14.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c2, code lost:
        r13.LJFF = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c4, code lost:
        if (r14 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c6, code lost:
        r0 = r14.LJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c8, code lost:
        r13.LJI = r0;
        r3 = com.bytedance.android.live.broadcastgame.api.model.PageDataV2.ReviewStatus.Companion;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cc, code lost:
        if (r14 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ce, code lost:
        r0 = r14.LJII;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d0, code lost:
        if (r0 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d2, code lost:
        r0 = r0.TYPE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d4, code lost:
        if (r0 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d6, code lost:
        r1 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00da, code lost:
        r13.LJII = r3.LIZ(r1);
        r4 = r13.LJIIIIZZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e4, code lost:
        if (r14 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e6, code lost:
        r0 = r14.LJIIIIZZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e8, code lost:
        if (r0 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ea, code lost:
        r1 = r0.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ec, code lost:
        r0 = r14.LJIIIIZZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ee, code lost:
        if (r0 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f0, code lost:
        r2 = r0.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f2, code lost:
        r4.LIZ(new p003X.C87838KjI(r1, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f8, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f9, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fa, code lost:
        if (r14 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00fd, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ff, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00aa, code lost:
        r5 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ab, code lost:
        if (r14 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x009f, code lost:
        r4 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00a0, code lost:
        if (r14 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0094, code lost:
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0095, code lost:
        if (r14 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0089, code lost:
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x008a, code lost:
        if (r14 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x007f, code lost:
        if (r14 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0074, code lost:
        if (r14 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0102, code lost:
        if (r14 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x010a, code lost:
        if (r14 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PageDataV2(com.bytedance.android.live.broadcastgame.api.model.PageData r14) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.api.model.PageDataV2.<init>(com.bytedance.android.live.broadcastgame.api.model.PageData):void");
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.api.model.PageDataV2$b */
    /* loaded from: classes5.dex */
    public static final class C3362b {
        public static ChangeQuickRedirect LIZ;
        @SerializedName("startPageUrl")
        public String LIZIZ;
        @SerializedName("title")
        public String LIZJ;
        @SerializedName("appName")
        public String LIZLLL;
        @SerializedName("appIcon")

        /* renamed from: LJ */
        public String f26018LJ;
        @SerializedName("schema")
        public String LJFF;
        @SerializedName("snapshotPath")
        public String LJI;
        @SerializedName("cardInfo")
        public String LJII;
        @SerializedName("homePath")
        public String LJIIIIZZ;

        static {
            Covode.recordClassIndex(19161);
        }

        public C3362b() {
            this(null, null, null, null, null, null, null, null, MotionEventCompat.ACTION_MASK);
        }

        public C3362b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            C106862S5w.LIZ(str, str2, str3, str4, str5, str6, str7, str8);
            this.LIZIZ = str;
            this.LIZJ = str2;
            this.LIZLLL = str3;
            this.f26018LJ = str4;
            this.LJFF = str5;
            this.LJI = str6;
            this.LJII = str7;
            this.LJIIIIZZ = str8;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ C3362b(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19) {
            /*
                r10 = this;
                r1 = r19
                r8 = r17
                r3 = r12
                r2 = r11
                r4 = r13
                r5 = r14
                r6 = r15
                r7 = r16
                r0 = r1 & 1
                java.lang.String r9 = ""
                if (r0 == 0) goto L12
                r2 = r9
            L12:
                r0 = r1 & 2
                if (r0 == 0) goto L17
                r3 = r9
            L17:
                r0 = r1 & 4
                if (r0 == 0) goto L1c
                r4 = r9
            L1c:
                r0 = r1 & 8
                if (r0 == 0) goto L21
                r5 = r9
            L21:
                r0 = r1 & 16
                if (r0 == 0) goto L26
                r6 = r9
            L26:
                r0 = r1 & 32
                if (r0 == 0) goto L2b
                r7 = r9
            L2b:
                r0 = r1 & 64
                if (r0 == 0) goto L30
                r8 = r9
            L30:
                r0 = r1 & 128(0x80, float:1.794E-43)
                if (r0 != 0) goto L36
                r9 = r18
            L36:
                r1 = r10
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.api.model.PageDataV2.C3362b.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
        }
    }
}
