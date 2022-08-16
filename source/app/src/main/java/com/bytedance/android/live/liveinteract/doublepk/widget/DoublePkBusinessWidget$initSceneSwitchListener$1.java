package com.bytedance.android.live.liveinteract.doublepk.widget;

import com.bytedance.android.livesdk.chatroom.p517u.C6307m;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class DoublePkBusinessWidget$initSceneSwitchListener$1 extends FunctionReferenceImpl implements Function1<C6307m, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(26850);
    }

    public DoublePkBusinessWidget$initSceneSwitchListener$1(DoublePkBusinessWidget doublePkBusinessWidget) {
        super(1, doublePkBusinessWidget, DoublePkBusinessWidget.class, "onSceneWithPlayModeChanged", "onSceneWithPlayModeChanged(Lcom/bytedance/android/livesdk/chatroom/viewmodel/SwitchSceneWithPlayModeEvent;)V", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, r0) == false) goto L22;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ kotlin.Unit invoke(com.bytedance.android.livesdk.chatroom.p517u.C6307m r7) {
        /*
            r6 = this;
            com.bytedance.android.livesdk.chatroom.u.m r7 = (com.bytedance.android.livesdk.chatroom.p517u.C6307m) r7
            r3 = 1
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r4 = 0
            r1[r4] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.liveinteract.doublepk.widget.DoublePkBusinessWidget$initSceneSwitchListener$1.changeQuickRedirect
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r1, r6, r0, r4, r3)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L93
            p003X.C106862S5w.LIZ(r7)
            java.lang.Object r2 = r6.receiver
            com.bytedance.android.live.liveinteract.doublepk.widget.DoublePkBusinessWidget r2 = (com.bytedance.android.live.liveinteract.doublepk.widget.DoublePkBusinessWidget) r2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r4] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.doublepk.widget.DoublePkBusinessWidget.LIZ
            r0 = 7
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r2, r1, r4, r0)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L93
            com.bytedance.android.livesdk.chatroom.u.m r5 = r2.LIZLLL
            r2.LIZLLL = r7
            r3 = 0
            if (r5 == 0) goto Lad
            int r0 = r5.LIZIZ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L35:
            com.bytedance.android.livesdk.chatroom.u.m r0 = r2.LIZLLL
            if (r0 == 0) goto Lab
            int r0 = r0.LIZIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L3f:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L5d
            if (r5 == 0) goto La9
            int r0 = r5.LIZLLL
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L4d:
            com.bytedance.android.livesdk.chatroom.u.m r0 = r2.LIZLLL
            if (r0 == 0) goto La7
            int r0 = r0.LIZLLL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L57:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L93
        L5d:
            X.GiO r0 = com.bytedance.android.live.liveinteract.doublepk.core.C4398a.LIZJ
            com.bytedance.android.live.liveinteract.doublepk.core.a r0 = r0.LIZ()
            if (r0 == 0) goto La5
            X.2WD r0 = r0.LIZLLL()
            if (r0 == 0) goto La5
            java.lang.Object r0 = r0.LIZ()
        L6f:
            java.lang.String r1 = "DoublePk_DoublePkBusinessWidget"
            if (r0 != 0) goto L96
            com.bytedance.android.livesdk.chatroom.u.m r0 = r2.LIZLLL
            boolean r0 = com.bytedance.android.live.liveinteract.doublepk.widget.DoublePkBusinessWidget.LIZ(r0)
            if (r0 == 0) goto L96
            boolean r0 = r2.f26314LJ
            if (r0 == 0) goto L96
            boolean r0 = r2.LIZ()
            if (r0 == 0) goto L96
            java.lang.String r0 = "loadPkViewWidget while switch_scene"
            com.bytedance.android.live.core.log.ALogger.m15801d(r1, r0)
            r2.f26314LJ = r4
            com.bytedance.android.livesdk.chatroom.model.interact.n r0 = r2.LJFF
            r2.LIZ(r0)
            r2.LJFF = r3
        L93:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L96:
            boolean r0 = com.bytedance.android.live.liveinteract.doublepk.widget.DoublePkBusinessWidget.LIZ(r5)
            if (r0 == 0) goto L93
            java.lang.String r0 = "unloadPkViewWidget last UILayout is 2*4"
            com.bytedance.android.live.core.log.ALogger.m15801d(r1, r0)
            r2.m15739LJ()
            goto L93
        La5:
            r0 = r3
            goto L6f
        La7:
            r0 = r3
            goto L57
        La9:
            r1 = r3
            goto L4d
        Lab:
            r0 = r3
            goto L3f
        Lad:
            r1 = r3
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.doublepk.widget.DoublePkBusinessWidget$initSceneSwitchListener$1.invoke(java.lang.Object):java.lang.Object");
    }
}
