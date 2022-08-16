package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class PreviewAllStarGraphTaskWidget$onCreate$1 extends Lambda implements Function1<RoomCreateInfo, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewAllStarGraphTaskWidget this$0;

    static {
        Covode.recordClassIndex(18412);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewAllStarGraphTaskWidget$onCreate$1(PreviewAllStarGraphTaskWidget previewAllStarGraphTaskWidget) {
        super(1);
        this.this$0 = previewAllStarGraphTaskWidget;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0072, code lost:
        if (r1 == com.bytedance.android.livesdkapi.depend.model.live.LiveMode.VIDEO) goto L38;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ kotlin.Unit invoke(com.bytedance.android.live.broadcast.api.model.RoomCreateInfo r7) {
        /*
            r6 = this;
            com.bytedance.android.live.broadcast.api.model.RoomCreateInfo r7 = (com.bytedance.android.live.broadcast.api.model.RoomCreateInfo) r7
            r4 = 1
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r5 = 0
            r1[r5] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.broadcast.widget.PreviewAllStarGraphTaskWidget$onCreate$1.changeQuickRedirect
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r1, r6, r0, r5, r4)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L77
            com.bytedance.android.live.broadcast.widget.PreviewAllStarGraphTaskWidget r3 = r6.this$0
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r5] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcast.widget.PreviewAllStarGraphTaskWidget.LIZ
            r0 = 3
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r3, r1, r5, r0)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L77
            r1 = 0
            if (r7 == 0) goto L82
            X.Gya r0 = r7.LJJJJIZL
            if (r0 == 0) goto L82
            java.lang.String r0 = r0.LIZIZ
        L2c:
            r3.LIZIZ = r0
            if (r7 == 0) goto L7e
            X.Gya r0 = r7.LJJJJIZL
            if (r0 == 0) goto L7e
            boolean r0 = r0.LIZ
            if (r0 != r4) goto L7e
            com.bytedance.android.live.broadcast.preview.k r0 = r3.LJIIJJI()
            if (r0 == 0) goto L7c
            X.2WC r0 = r0.LIZ()
            if (r0 == 0) goto L7c
            java.lang.Object r2 = r0.LIZ()
        L48:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.SCREEN_RECORD
            if (r2 == r0) goto L74
            com.bytedance.android.live.broadcast.preview.k r0 = r3.LJIIJJI()
            if (r0 == 0) goto L7a
            X.2WC r0 = r0.LIZ()
            if (r0 == 0) goto L7a
            java.lang.Object r2 = r0.LIZ()
        L5c:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.AUDIO
            if (r2 == r0) goto L74
            com.bytedance.android.live.broadcast.preview.k r0 = r3.LJIIJJI()
            if (r0 == 0) goto L70
            X.2WC r0 = r0.LIZ()
            if (r0 == 0) goto L70
            java.lang.Object r1 = r0.LIZ()
        L70:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.VIDEO
            if (r1 != r0) goto L7e
        L74:
            r3.LJIILJJIL()
        L77:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L7a:
            r2 = r1
            goto L5c
        L7c:
            r2 = r1
            goto L48
        L7e:
            r3.LJIILL()
            goto L77
        L82:
            r0 = r1
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.PreviewAllStarGraphTaskWidget$onCreate$1.invoke(java.lang.Object):java.lang.Object");
    }
}
