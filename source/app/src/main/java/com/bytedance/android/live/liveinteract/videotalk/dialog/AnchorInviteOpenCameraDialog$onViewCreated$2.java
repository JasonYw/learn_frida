package com.bytedance.android.live.liveinteract.videotalk.dialog;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C421072lR;

/* loaded from: classes3.dex */
public final class AnchorInviteOpenCameraDialog$onViewCreated$2 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C421072lR this$0;

    static {
        Covode.recordClassIndex(30017);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorInviteOpenCameraDialog$onViewCreated$2(C421072lR c421072lR) {
        super(1);
        this.this$0 = c421072lR;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
        if (r0.LJIIIZ() != true) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() == false) goto L7;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ kotlin.Unit invoke(android.view.View r7) {
        /*
            r6 = this;
            r3 = 1
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r5 = 0
            r1[r5] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.liveinteract.videotalk.dialog.AnchorInviteOpenCameraDialog$onViewCreated$2.changeQuickRedirect
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r1, r6, r0, r5, r3)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L3a
            p003X.C106862S5w.LIZ(r7)
            X.2lR r4 = r6.this$0
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = p003X.C421072lR.LIZ
            r0 = 6
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r4, r1, r5, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L5a
        L2c:
            X.2lR r0 = r6.this$0
            r0.dismiss()
            X.2lR r0 = r6.this$0
            X.2lU r0 = r0.LIZLLL
            if (r0 == 0) goto L3a
            r0.LIZIZ()
        L3a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L3d:
            X.HEa r1 = p003X.C79046HEa.LIZ()
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            boolean r0 = r1.LIZJ()
            if (r0 != 0) goto L5a
            X.Gy9 r0 = com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah.LIZIZ
            com.bytedance.android.live.liveinteract.plantform.a.ah r0 = r0.LIZ()
            if (r0 == 0) goto L2c
            boolean r0 = r0.LJIIIZ()
            if (r0 != r3) goto L2c
        L5a:
            int r1 = p003X.C79242HLo.LJIIJ()
            X.Gy9 r0 = com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah.LIZIZ
            com.bytedance.android.live.liveinteract.plantform.a.ah r0 = r0.LIZ()
            if (r0 == 0) goto L90
            boolean r0 = p003X.C77562Ghw.LIZ(r1)
            if (r0 == 0) goto L90
            X.Gy9 r0 = com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah.LIZIZ
            com.bytedance.android.live.liveinteract.plantform.a.ah r0 = r0.LIZ()
            if (r0 == 0) goto L8e
            com.bytedance.android.live.broadcast.api.g.g r2 = r0.LJIILLIIL()
        L78:
            X.Gy9 r0 = com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah.LIZIZ
            com.bytedance.android.live.liveinteract.plantform.a.ah r1 = r0.LIZ()
            if (r1 == 0) goto L88
            com.bytedance.android.live.liveinteract.videotalk.dialog.AnchorInviteOpenCameraDialog$onViewCreated$2$1 r0 = new com.bytedance.android.live.liveinteract.videotalk.dialog.AnchorInviteOpenCameraDialog$onViewCreated$2$1
            r0.<init>()
            r1.LIZ(r3, r0)
        L88:
            X.2lR r0 = r6.this$0
            r0.dismiss()
            goto L3a
        L8e:
            r2 = 0
            goto L78
        L90:
            X.2lR r0 = r6.this$0
            X.2lU r0 = r0.LIZLLL
            if (r0 == 0) goto L88
            r0.LIZIZ()
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.dialog.AnchorInviteOpenCameraDialog$onViewCreated$2.invoke(java.lang.Object):java.lang.Object");
    }
}
