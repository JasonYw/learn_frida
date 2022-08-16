package com.bytedance.android.live.broadcastgame.openplatform.behavior;

import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class ToolbarOpenPlatformBehavior$onEvent$2 extends Lambda implements Function1<C3383p, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Object $event;

    static {
        Covode.recordClassIndex(21280);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarOpenPlatformBehavior$onEvent$2(Object obj) {
        super(1);
        this.$event = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (r0.longValue() == r3) goto L4;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Boolean invoke(com.bytedance.android.live.broadcastgame.api.model.C3383p r8) {
        /*
            r7 = this;
            com.bytedance.android.live.broadcastgame.api.model.p r8 = (com.bytedance.android.live.broadcastgame.api.model.C3383p) r8
            r5 = 1
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r6 = 0
            r1[r6] = r8
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.broadcastgame.openplatform.behavior.ToolbarOpenPlatformBehavior$onEvent$2.changeQuickRedirect
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r7, r0, r6, r5)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
        L1a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L1f:
            p003X.C106862S5w.LIZ(r8)
            java.lang.Object r0 = r7.$event
            com.bytedance.android.livesdk.chatroom.event.bb r0 = (com.bytedance.android.livesdk.chatroom.event.C5992bb) r0
            java.lang.Long r0 = r0.LIZIZ
            if (r0 == 0) goto L34
            long r3 = r0.longValue()
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L47
        L34:
            java.lang.Object r0 = r7.$event
            com.bytedance.android.livesdk.chatroom.event.bb r0 = (com.bytedance.android.livesdk.chatroom.event.C5992bb) r0
            java.lang.Long r0 = r0.LIZIZ
            long r3 = r8.LIZLLL
            if (r0 == 0) goto L47
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L47
            goto L1a
        L47:
            java.lang.Object r0 = r7.$event
            com.bytedance.android.livesdk.chatroom.event.bb r0 = (com.bytedance.android.livesdk.chatroom.event.C5992bb) r0
            java.lang.String r0 = r0.LIZJ
            if (r0 == 0) goto L60
            java.lang.Object r0 = r7.$event
            com.bytedance.android.livesdk.chatroom.event.bb r0 = (com.bytedance.android.livesdk.chatroom.event.C5992bb) r0
            java.lang.String r3 = r0.LIZJ
            java.lang.String r2 = r8.LJLIIIL
            r1 = 2
            r0 = 0
            boolean r0 = kotlin.text.StringsKt__StringsJVMKt.equals$default(r3, r2, r6, r1, r0)
            if (r0 == 0) goto L60
            goto L1a
        L60:
            r5 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.openplatform.behavior.ToolbarOpenPlatformBehavior$onEvent$2.invoke(java.lang.Object):java.lang.Object");
    }
}
