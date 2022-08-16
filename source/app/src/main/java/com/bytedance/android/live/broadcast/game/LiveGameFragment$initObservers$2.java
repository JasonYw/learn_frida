package com.bytedance.android.live.broadcast.game;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C100639PkH;

/* loaded from: classes8.dex */
public final class LiveGameFragment$initObservers$2 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C100639PkH this$0;

    static {
        Covode.recordClassIndex(15973);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveGameFragment$initObservers$2(C100639PkH c100639PkH) {
        super(1);
        this.this$0 = c100639PkH;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
        if (r4 == false) goto L8;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Boolean r6) {
        /*
            r5 = this;
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            r2 = 1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r4)
            r3 = 0
            r1[r3] = r0
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.broadcast.game.LiveGameFragment$initObservers$2.changeQuickRedirect
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r1, r5, r0, r3, r2)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L29
            X.PkH r0 = r5.this$0
            int r0 = r0.LJII
            if (r0 != r2) goto L2c
            if (r4 == 0) goto L64
            X.PkH r1 = r5.this$0
            com.bytedance.android.livesdk.chatroom.ui.DouyinLoadingLayout r0 = r1.LJIIIIZZ
            r1.LIZ(r0, r2)
        L29:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L2c:
            X.PkH r0 = r5.this$0
            int r1 = r0.LJII
            r0 = 3
            if (r1 != r0) goto L61
            if (r4 == 0) goto L3d
            X.PkH r1 = r5.this$0
            com.bytedance.android.livesdk.chatroom.ui.DouyinLoadingLayout r0 = r1.LJIIIZ
            r1.LIZ(r0, r2)
            goto L29
        L3d:
            X.PkH r1 = r5.this$0
            com.bytedance.android.livesdk.chatroom.ui.DouyinLoadingLayout r0 = r1.LJIIIZ
            r1.LIZ(r0, r3)
            X.PkH r0 = r5.this$0
            com.bytedance.android.live.broadcast.game.f r0 = r0.LIZ()
            boolean r0 = r0.LJFF
            if (r0 != 0) goto L6b
            X.PkH r0 = r5.this$0
            android.content.Context r0 = r0.getContext()
            boolean r0 = com.p1594ss.android.common.util.NetworkUtils.isNetworkAvailable(r0)
            if (r0 != 0) goto L6b
            r0 = 2131582739(0x7f0d5f13, float:1.879148E38)
            p003X.C88440Kt0.LIZ(r0)
            goto L6b
        L61:
            if (r4 != 0) goto L29
            goto L6b
        L64:
            X.PkH r1 = r5.this$0
            com.bytedance.android.livesdk.chatroom.ui.DouyinLoadingLayout r0 = r1.LJIIIIZZ
            r1.LIZ(r0, r3)
        L6b:
            X.PkH r0 = r5.this$0
            com.bytedance.android.livesdk.chatroom.ui.pullrefresh.DoubleBallSwipeRefreshLayout r0 = r0.LJIIJ
            if (r0 == 0) goto L29
            boolean r0 = r0.LIZIZ()
            if (r0 != r2) goto L29
            X.PkH r0 = r5.this$0
            com.bytedance.android.livesdk.chatroom.ui.pullrefresh.DoubleBallSwipeRefreshLayout r3 = r0.LJIIJ
            if (r3 == 0) goto L29
            com.bytedance.android.live.broadcast.game.LiveGameFragment$initObservers$2$1 r2 = new com.bytedance.android.live.broadcast.game.LiveGameFragment$initObservers$2$1
            r2.<init>()
            r0 = 200(0xc8, double:9.9E-322)
            r3.postDelayed(r2, r0)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.game.LiveGameFragment$initObservers$2.invoke(java.lang.Object):java.lang.Object");
    }
}
