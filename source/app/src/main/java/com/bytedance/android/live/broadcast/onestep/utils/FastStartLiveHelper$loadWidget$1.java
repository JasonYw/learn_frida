package com.bytedance.android.live.broadcast.onestep.utils;

import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class FastStartLiveHelper$loadWidget$1 extends Lambda implements Function1<RoomCreateInfo, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ FastStartLiveHelper this$0;

    static {
        Covode.recordClassIndex(17057);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastStartLiveHelper$loadWidget$1(FastStartLiveHelper fastStartLiveHelper) {
        super(1);
        this.this$0 = fastStartLiveHelper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
        if (r1 != 0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ kotlin.Unit invoke(com.bytedance.android.live.broadcast.api.model.RoomCreateInfo r10) {
        /*
            r9 = this;
            com.bytedance.android.live.broadcast.api.model.RoomCreateInfo r10 = (com.bytedance.android.live.broadcast.api.model.RoomCreateInfo) r10
            r2 = 1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r8 = 0
            r1[r8] = r10
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.broadcast.onestep.utils.FastStartLiveHelper$loadWidget$1.changeQuickRedirect
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r1, r9, r0, r8, r2)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L9e
            com.bytedance.android.live.broadcast.onestep.utils.FastStartLiveHelper r4 = r9.this$0
            com.bytedance.android.live.broadcast.preview.v r7 = r4.LJIIIIZZ
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r8] = r10
            r3[r2] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcast.onestep.utils.FastStartLiveHelper.LIZ
            r0 = 13
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r4, r1, r8, r0)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L9e
            if (r10 == 0) goto L9e
            com.bytedance.android.live.core.setting.SettingKey<java.lang.Boolean> r0 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_CHECK_COMPUTER_LIVE_CAPABILITY
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.lang.Object r0 = r0.getValue()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4c
            com.bytedance.android.live.broadcast.api.model.r r1 = r10.LJJIIJ
            if (r1 == 0) goto L4c
            X.2WC r0 = r7.m15891LJ()
            r0.LIZ(r1)
        L4c:
            java.lang.String r1 = r10.f25775LJ
            if (r1 == 0) goto L57
            X.2WC r0 = r7.LJII()
            r0.LIZ(r1)
        L57:
            X.KJ8 r6 = p003X.KJ8.LIZIZ
            com.bytedance.android.live.base.model.ImageModel r5 = r10.LIZJ
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r8] = r5
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = p003X.KJ8.LIZ
            r0 = 8
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r6, r1, r8, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto La1
            java.lang.Object r1 = r1.result
            if (r1 == 0) goto L76
        L6f:
            X.2WC r0 = r7.LJIIIIZZ()
            r0.LIZ(r1)
        L76:
            X.2WC r2 = r7.LJIJI()
            long r0 = r10.LJIILJJIL
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.LIZ(r0)
            com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager r0 = com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager.LJIIIZ
            boolean r0 = r0.LIZJ()
            if (r0 == 0) goto L9e
            com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager r0 = com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager.LJIIIZ
            r0.LIZ(r10)
            com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager r1 = com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager.LJIIIZ
            com.bytedance.android.livesdkapi.config.FastStartLiveConfig r0 = r4.LIZLLL
            if (r0 != 0) goto L99
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L99:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = r0.liveMode
            r1.LIZ(r0)
        L9e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        La1:
            if (r5 == 0) goto L76
            com.bytedance.android.live.base.model.user.e r1 = new com.bytedance.android.live.base.model.user.e
            r1.<init>()
            java.lang.String r0 = r5.mUri
            r1.LIZ = r0
            java.util.List<java.lang.String> r0 = r5.mUrls
            r1.LIZIZ = r0
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.onestep.utils.FastStartLiveHelper$loadWidget$1.invoke(java.lang.Object):java.lang.Object");
    }
}
