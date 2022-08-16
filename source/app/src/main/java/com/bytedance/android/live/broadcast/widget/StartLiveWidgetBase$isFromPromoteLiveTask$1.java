package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.api.model.PreviewSourceParam;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes5.dex */
public final class StartLiveWidgetBase$isFromPromoteLiveTask$1 extends Lambda implements Function1<PreviewSourceParam, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.ObjectRef $taskId;

    static {
        Covode.recordClassIndex(18834);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveWidgetBase$isFromPromoteLiveTask$1(Ref.ObjectRef objectRef) {
        super(1);
        this.$taskId = objectRef;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r0 == null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ kotlin.Unit invoke(com.bytedance.android.live.broadcast.api.model.PreviewSourceParam r6) {
        /*
            r5 = this;
            com.bytedance.android.live.broadcast.api.model.PreviewSourceParam r6 = (com.bytedance.android.live.broadcast.api.model.PreviewSourceParam) r6
            r3 = 1
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r1 = 0
            r2[r1] = r6
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase$isFromPromoteLiveTask$1.changeQuickRedirect
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r5, r0, r1, r3)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L38
            p003X.C106862S5w.LIZ(r6)
            kotlin.jvm.internal.Ref$ObjectRef r4 = r5.$taskId
            com.bytedance.android.live.broadcast.api.model.v r0 = r6.LIZ()
            if (r0 == 0) goto L3b
            java.lang.String r3 = ""
            java.util.Map<java.lang.String, com.bytedance.android.live.broadcast.api.model.w> r1 = r0.LIZIZ
            java.lang.String r0 = "commerce"
            java.lang.Object r2 = r1.get(r0)
            com.bytedance.android.live.broadcast.api.model.w r2 = (com.bytedance.android.live.broadcast.api.model.C2920w) r2
            if (r2 == 0) goto L35
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "task_id"
            java.lang.Object r0 = r2.LIZ(r0, r1, r3)
            if (r0 != 0) goto L36
        L35:
            r0 = r3
        L36:
            r4.element = r0
        L38:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L3b:
            r0 = 0
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase$isFromPromoteLiveTask$1.invoke(java.lang.Object):java.lang.Object");
    }
}
