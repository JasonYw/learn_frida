package com.bytedance.android.live.broadcast.gamedetailv2.widget;

import com.bytedance.android.live.broadcast.gamedetailv2.data.C3121e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class GameDetailLynxWidget$onUpdate$2 extends Lambda implements Function1<C3121e, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3139b $props;
    public final /* synthetic */ GameDetailLynxWidget this$0;

    static {
        Covode.recordClassIndex(16763);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailLynxWidget$onUpdate$2(GameDetailLynxWidget gameDetailLynxWidget, C3139b c3139b) {
        super(1);
        this.this$0 = gameDetailLynxWidget;
        this.$props = c3139b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0080, code lost:
        if (r11 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0082, code lost:
        r11 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
        if (r3 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
        r12 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
        if (r3 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
        r13 = java.lang.String.valueOf(r3.LJIIIIZZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
        if (r13 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
        if (r3 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
        r14 = r3.LJI;
        r15 = r3.LJII;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
        if (r15 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
        if (r3 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
        r1 = r3.LJIIIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
        if (r1 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
        r0 = r3.LJIIJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
        r0 = p003X.C89043L6n.LIZ(r9, r10, r11, r12, r13, r14, r15, r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
        if (r3 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
        r15 = "{}";
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
        r13 = "0";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
        r12 = r3.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
        if (r12 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007c, code lost:
        if (r3 != null) goto L14;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ kotlin.Unit invoke(com.bytedance.android.live.broadcast.gamedetailv2.data.C3121e r19) {
        /*
            r18 = this;
            r4 = r19
            com.bytedance.android.live.broadcast.gamedetailv2.data.e r4 = (com.bytedance.android.live.broadcast.gamedetailv2.data.C3121e) r4
            r7 = 1
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r8 = 0
            r1[r8] = r4
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.broadcast.gamedetailv2.widget.GameDetailLynxWidget$onUpdate$2.changeQuickRedirect
            r5 = r18
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r1, r5, r0, r8, r7)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L6e
            p003X.C106862S5w.LIZ(r4)
            com.bytedance.android.live.core.setting.SettingKey<java.util.Map<java.lang.String, java.lang.String>> r0 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_DYNAMIC_DETAIL_LYNX_CONFIG
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.lang.Object r1 = r0.getValue()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = r4.LIZIZ
            java.lang.Object r9 = r1.get(r0)
            java.lang.String r9 = (java.lang.String) r9
            com.bytedance.android.live.broadcast.gamedetailv2.widget.b r3 = r5.$props
            r6 = 2
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r8] = r9
            r1[r7] = r3
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = p003X.C89043L6n.LIZ
            r14 = 0
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r14, r0, r7, r6)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L71
            java.lang.Object r0 = r1.result
            java.lang.String r0 = (java.lang.String) r0
        L46:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri r0 = r0.build()
            java.lang.String r3 = r0.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            com.bytedance.android.live.broadcast.gamedetailv2.widget.GameDetailLynxWidget r0 = r5.this$0
            com.bytedance.android.live.broadcast.hybrid.uielement.GameDetailLynxCard r2 = r0.LIZIZ
            if (r2 == 0) goto L6e
            java.lang.String r1 = r4.LIZJ
            java.lang.String r0 = "gameDetailInfo"
            kotlin.Pair r0 = kotlin.TuplesKt.m137to(r0, r1)
            java.util.Map r0 = kotlin.collections.MapsKt__MapsJVMKt.mapOf(r0)
            r2.LIZ(r3, r0)
        L6e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L71:
            if (r9 != 0) goto L75
            r0 = r2
            goto L46
        L75:
            if (r3 == 0) goto L7b
            java.lang.String r10 = r3.LIZLLL
            if (r10 != 0) goto L7e
        L7b:
            r10 = r2
            if (r3 == 0) goto L82
        L7e:
            java.lang.String r11 = r3.f25902LJ
            if (r11 != 0) goto L85
        L82:
            r11 = r2
            if (r3 == 0) goto L89
        L85:
            java.lang.String r12 = r3.LJFF
            if (r12 != 0) goto L8c
        L89:
            r12 = r2
            if (r3 == 0) goto L94
        L8c:
            int r0 = r3.LJIIIIZZ
            java.lang.String r13 = java.lang.String.valueOf(r0)
            if (r13 != 0) goto L96
        L94:
            java.lang.String r13 = "0"
        L96:
            if (r3 == 0) goto L9e
            java.lang.String r14 = r3.LJI
            java.lang.String r15 = r3.LJII
            if (r15 != 0) goto La0
        L9e:
            java.lang.String r15 = "{}"
        La0:
            if (r3 == 0) goto La6
            java.lang.String r1 = r3.LJIIIZ
            if (r1 != 0) goto La9
        La6:
            r1 = r2
            if (r3 == 0) goto Lad
        La9:
            java.lang.String r0 = r3.LJIIJ
            if (r0 != 0) goto Lae
        Lad:
            r0 = r2
        Lae:
            r16 = r1
            r17 = r0
            java.lang.String r0 = p003X.C89043L6n.LIZ(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.gamedetailv2.widget.GameDetailLynxWidget$onUpdate$2.invoke(java.lang.Object):java.lang.Object");
    }
}
