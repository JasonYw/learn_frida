package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import p003X.C106862S5w;
import p003X.C4574547f;

/* loaded from: classes5.dex */
public final class TrackMiniGameCardService implements AbstractC3719c {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(new TrackMiniGameCardService$commonParams$2(this));
    public C3682x LIZJ;

    static {
        Covode.recordClassIndex(21073);
    }

    public final Map<String, String> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (Map) (proxy.isSupported ? proxy.result : this.LIZIZ.mo27335getValue());
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c
    public final void LIZIZ() {
        boolean z = PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported;
    }

    public final C3682x LIZJ() {
        return this.LIZJ;
    }

    public TrackMiniGameCardService(C3682x c3682x) {
        C106862S5w.LIZ(c3682x);
        this.LIZJ = c3682x;
    }

    public final void LIZ(boolean z) {
        String str;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C4574547f LIZ2 = C4574547f.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ());
        LIZ(linkedHashMap);
        if (z) {
            str = "cancel";
        } else {
            str = "confirm";
        }
        linkedHashMap.put("button", str);
        LIZ2.LIZ("livesdk_anchor_send_ad", linkedHashMap, Room.class, C8668v.class);
    }

    public final void LIZIZ(boolean z) {
        String str;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C4574547f LIZ2 = C4574547f.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ());
        LIZ(linkedHashMap);
        if (z) {
            str = "cancel";
        } else {
            str = "confirm";
        }
        linkedHashMap.put("button", str);
        LIZ2.LIZ("livesdk_anchor_close_ad", linkedHashMap, Room.class, C8668v.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
        if (r1 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(java.util.Map<java.lang.String, java.lang.String> r14) {
        /*
            r13 = this;
            r0 = 1
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r2 = 0
            r3[r2] = r14
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcastgame.opengame.service.TrackMiniGameCardService.LIZ
            r0 = 2
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r13, r1, r2, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L12
            return
        L12:
            java.lang.Class<com.bytedance.android.live.user.IUserService> r0 = com.bytedance.android.live.user.IUserService.class
            com.bytedance.android.live.base.IService r0 = com.bytedance.android.live.utility.ServiceManager.getService(r0)
            com.bytedance.android.live.user.IUserService r0 = (com.bytedance.android.live.user.IUserService) r0
            X.3VF r0 = r0.user()
            com.bytedance.android.live.base.model.user.IUser r0 = r0.LIZ()
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            long r5 = r0.getId()
            X.2Kg r7 = com.bytedance.android.livesdk.chatroom.C5923dp.LJIIJ
            com.bytedance.android.live.broadcastgame.opengame.runtime.x r0 = r13.LIZJ()
            com.bytedance.ies.sdk.widgets.DataCenter r8 = r0.f26082LJ
            r9 = 0
            r11 = 2
            r12 = 0
            com.bytedance.android.livesdk.chatroom.dp r0 = p003X.C409882Kg.LIZ(r7, r8, r9, r11, r12)
            if (r0 == 0) goto L6d
            X.2WC r0 = r0.LIZ()
            if (r0 == 0) goto L6d
            java.lang.Object r4 = r0.LIZ()
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r4
            if (r4 == 0) goto L55
            long r0 = r4.getRoomId()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            if (r1 != 0) goto L56
        L55:
            r1 = r3
        L56:
            java.lang.String r0 = "room_id"
            r14.put(r0, r1)
            com.bytedance.android.live.broadcastgame.opengame.runtime.x r0 = r13.LIZJ()
            boolean r0 = r0.LJIIJ
            java.lang.String r2 = "anchor_id"
            if (r0 == 0) goto L6f
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r14.put(r2, r0)
            return
        L6d:
            r4 = 0
            goto L55
        L6f:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "user_id"
            r14.put(r0, r1)
            if (r4 == 0) goto L82
            long r0 = r4.ownerUserId
            java.lang.String r0 = java.lang.String.valueOf(r0)
            if (r0 != 0) goto L83
        L82:
            r0 = r3
        L83:
            r14.put(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.opengame.service.TrackMiniGameCardService.LIZ(java.util.Map):void");
    }
}
