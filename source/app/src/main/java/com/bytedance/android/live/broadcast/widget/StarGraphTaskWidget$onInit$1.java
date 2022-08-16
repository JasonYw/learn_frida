package com.bytedance.android.live.broadcast.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class StarGraphTaskWidget$onInit$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ StarGraphTaskWidget this$0;

    static {
        Covode.recordClassIndex(18791);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarGraphTaskWidget$onInit$1(StarGraphTaskWidget starGraphTaskWidget) {
        super(0);
        this.this$0 = starGraphTaskWidget;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0074, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
        if (r1.LIZ == 2) goto L18;
     */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ kotlin.Unit mo30099invoke() {
        /*
            r8 = this;
            r3 = 0
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.broadcast.widget.StarGraphTaskWidget$onInit$1.changeQuickRedirect
            r6 = 1
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r1, r8, r0, r3, r6)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L8b
            com.bytedance.android.live.broadcast.widget.StarGraphTaskWidget r5 = r8.this$0
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcast.widget.StarGraphTaskWidget.LIZ
            r0 = 5
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r5, r1, r3, r0)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L8b
            X.47f r4 = p003X.C4574547f.LIZ()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            long r0 = r5.LIZ()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "anchor_id"
            r2.put(r0, r1)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r5.LIZIZ()
            java.lang.String r7 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r7)
            java.lang.String r1 = r0.getIdStr()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r7)
            java.lang.String r0 = "room_id"
            r2.put(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = "livesdk_xingtu_task_icon_click"
            r4.LIZ(r0, r2, r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.LIZIZ
            boolean r0 = r0.get()
            if (r0 != 0) goto L76
            X.2Ld r4 = com.bytedance.android.live.broadcast.viewmodel.C3260j.LJIIIZ
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r5.dataCenter
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r3] = r2
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = p003X.C410112Ld.LIZ
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r4, r0, r3, r6)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La6
        L76:
            com.bytedance.android.live.broadcast.viewmodel.j r4 = r5.LIZJ()
            android.content.Context r2 = r5.context
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            long r0 = r5.LIZ()
            r4.LIZ(r2, r0, r6)
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.LIZIZ
            r0.set(r3)
        L8b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L8e:
            p003X.C106862S5w.LIZ(r2)
            r1 = 0
            java.lang.String r0 = "data_broadcast_pause_state"
            java.lang.Object r1 = r2.get(r0, r1)
            X.2W3 r1 = (p003X.C2W3) r1
            if (r1 == 0) goto La6
            int r0 = r1.LIZ
            if (r0 == r6) goto L76
            int r1 = r1.LIZ
            r0 = 2
            if (r1 != r0) goto La6
            goto L76
        La6:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.LIZIZ
            r0.set(r6)
            com.bytedance.android.livesdk.widget.v$a r2 = new com.bytedance.android.livesdk.widget.v$a
            android.content.Context r1 = r5.getContext()
            r0 = 4
            r2.<init>(r1, r0)
            r0 = 2131587796(0x7f0d72d4, float:1.8801737E38)
            com.bytedance.android.livesdk.widget.v$a r2 = r2.LIZLLL(r0)
            r1 = 2131587795(0x7f0d72d3, float:1.8801735E38)
            X.2Lc r0 = p003X.DialogInterface$OnClickListenerC410102Lc.LIZIZ
            com.bytedance.android.livesdk.widget.v$a r0 = r2.LIZIZ(r3, r1, r0)
            r0.LIZJ()
            goto L8b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.StarGraphTaskWidget$onInit$1.mo30099invoke():java.lang.Object");
    }
}
