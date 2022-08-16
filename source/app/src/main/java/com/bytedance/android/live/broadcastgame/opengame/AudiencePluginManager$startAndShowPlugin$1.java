package com.bytedance.android.live.broadcastgame.opengame;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87733Khb;

/* loaded from: classes5.dex */
public final class AudiencePluginManager$startAndShowPlugin$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $appId;
    public final /* synthetic */ Map $showParams;
    public final /* synthetic */ String $startSource;
    public final /* synthetic */ C87733Khb this$0;

    static {
        Covode.recordClassIndex(19901);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudiencePluginManager$startAndShowPlugin$1(C87733Khb c87733Khb, String str, String str2, Map map) {
        super(0);
        this.this$0 = c87733Khb;
        this.$appId = str;
        this.$startSource = str2;
        this.$showParams = map;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        LIZ();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, r3) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ() {
        /*
            r4 = this;
            r3 = 0
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcastgame.opengame.AudiencePluginManager$startAndShowPlugin$1.changeQuickRedirect
            r0 = 1
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r4, r1, r3, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto Lf
            return
        Lf:
            X.Kil r2 = p003X.C87805Kil.LIZIZ
            X.Khb r0 = r4.this$0
            X.Khk r0 = r0.LIZIZ
            r3 = 0
            if (r0 == 0) goto L81
            long r0 = r0.LIZJ
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L1e:
            X.Khb r0 = r4.this$0
            X.Khk r0 = r0.LIZIZ
            if (r0 == 0) goto L7f
            java.lang.String r0 = r0.LJFF
        L26:
            r2.LIZIZ(r1, r0)
            X.Khb r0 = r4.this$0
            X.KhI r0 = r0.LIZJ
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.LIZJ
            X.Khb r0 = r4.this$0
            com.bytedance.android.live.broadcastgame.opengame.message.am r0 = r0.LIZLLL
            if (r0 == 0) goto L7d
            java.lang.String r1 = r0.LJI
        L37:
            java.lang.String r0 = "collect_path_start"
            r2.put(r1, r0)
            X.Khb r0 = r4.this$0
            com.bytedance.android.live.broadcastgame.opengame.runtime.m r0 = r0.LJII
            if (r0 == 0) goto L5c
            com.bytedance.android.live.broadcastgame.opengame.p r0 = r0.LJIIJ()
            if (r0 == 0) goto L5c
            com.bytedance.android.live.broadcastgame.opengame.runtime.d r0 = r0.LJIIJ
            if (r0 == 0) goto L5c
            java.lang.String r1 = r4.$appId
            X.Khb r0 = r4.this$0
            com.bytedance.android.live.broadcastgame.opengame.message.am r0 = r0.LIZLLL
            if (r0 == 0) goto L56
            java.lang.String r3 = r0.LJI
        L56:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r0 != 0) goto L83
        L5c:
            java.lang.String r1 = r4.$startSource
            java.lang.String r0 = "from_debug"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L83
            X.Khb r0 = r4.this$0
            com.bytedance.android.live.broadcastgame.opengame.message.am r1 = r0.LIZLLL
            if (r1 == 0) goto L71
            X.Khb r0 = r4.this$0
            r0.LIZ(r1)
        L71:
            X.KkT r2 = p003X.C87911KkT.LIZIZ
            java.lang.String r1 = p003X.C87720KhO.LIZ()
            java.lang.String r0 = "startFromAnchor"
            r2.LIZ(r1, r0)
            return
        L7d:
            r1 = r3
            goto L37
        L7f:
            r0 = r3
            goto L26
        L81:
            r1 = r3
            goto L1e
        L83:
            X.Khb r2 = r4.this$0
            java.lang.String r1 = r4.$appId
            java.util.Map r0 = r4.$showParams
            r2.LIZIZ(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.opengame.AudiencePluginManager$startAndShowPlugin$1.LIZ():void");
    }
}
