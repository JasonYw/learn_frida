package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class PreviewCompanionPermissionWidget$onCreate$3 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewCompanionPermissionWidget this$0;

    static {
        Covode.recordClassIndex(18469);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewCompanionPermissionWidget$onCreate$3(PreviewCompanionPermissionWidget previewCompanionPermissionWidget) {
        super(1);
        this.this$0 = previewCompanionPermissionWidget;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
        if (r0.LIZ == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
        if (r0 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
        r6.this$0.LIZJ();
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ kotlin.Unit invoke(android.view.View r7) {
        /*
            r6 = this;
            r2 = 1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r4 = 0
            r1[r4] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.broadcast.widget.PreviewCompanionPermissionWidget$onCreate$3.changeQuickRedirect
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r1, r6, r0, r4, r2)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L4b
            p003X.C106862S5w.LIZ(r7)
            com.bytedance.android.live.broadcast.widget.PreviewCompanionPermissionWidget r3 = r6.this$0
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcast.widget.PreviewCompanionPermissionWidget.LIZ
            r0 = 9
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r3, r1, r4, r0)
            boolean r0 = r1.isSupported
            java.lang.String r5 = ""
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L2d:
            if (r0 == 0) goto L74
        L2f:
            com.bytedance.android.live.broadcast.widget.PreviewCompanionPermissionWidget r0 = r6.this$0
            r0.LIZJ()
        L34:
            X.47f r3 = p003X.C4574547f.LIZ()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r1 = "live_type"
            java.lang.String r0 = "third_party"
            r2.put(r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "livesdk_live_application_click"
            r3.LIZ(r0, r2, r1)
        L4b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L4e:
            com.bytedance.android.live.core.setting.SettingKey<java.lang.Boolean> r0 = com.bytedance.android.livesdk.config.LiveSettingKeys.PC_LIVE_CERTIFICATION_EXEMPTION_ENABLE
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            java.lang.Object r0 = r0.getValue()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6b
            com.bytedance.android.live.base.model.e.a r0 = r3.f25983LJ
            if (r0 == 0) goto L74
            boolean r0 = r0.LIZ
            if (r0 != 0) goto L74
            goto L2f
        L6b:
            com.bytedance.android.live.base.model.e.b r0 = r3.LIZLLL
            if (r0 == 0) goto L74
            boolean r0 = r0.LIZ()
            goto L2d
        L74:
            com.bytedance.android.live.broadcast.widget.PreviewCompanionPermissionWidget r1 = r6.this$0
            com.bytedance.android.live.broadcast.widget.PreviewCompanionPermissionWidget$onCreate$3$1 r0 = new com.bytedance.android.live.broadcast.widget.PreviewCompanionPermissionWidget$onCreate$3$1
            r0.<init>()
            r1.LJFF = r0
            X.KDy r3 = p003X.C86688KDy.LIZIZ
            com.bytedance.android.live.broadcast.widget.PreviewCompanionPermissionWidget r0 = r6.this$0
            android.content.Context r2 = r0.context
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            com.bytedance.android.live.broadcast.widget.PreviewCompanionPermissionWidget r0 = r6.this$0
            com.bytedance.android.live.base.model.e.b r1 = r0.LIZLLL
            com.bytedance.android.live.broadcast.widget.PreviewCompanionPermissionWidget r0 = r6.this$0
            X.Krg r0 = r0.LJFF
            java.lang.Object r0 = p003X.C64646Bf6.LIZ(r0)
            X.Krg r0 = (p003X.AbstractC88358Krg) r0
            r3.LIZ(r2, r1, r0)
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.PreviewCompanionPermissionWidget$onCreate$3.invoke(java.lang.Object):java.lang.Object");
    }
}
