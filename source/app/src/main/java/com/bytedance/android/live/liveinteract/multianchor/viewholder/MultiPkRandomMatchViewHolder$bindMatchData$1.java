package com.bytedance.android.live.liveinteract.multianchor.viewholder;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.interact.model.C6053g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class MultiPkRandomMatchViewHolder$bindMatchData$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C6053g $matchInfo;
    public final /* synthetic */ C4572aa this$0;

    static {
        Covode.recordClassIndex(28426);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiPkRandomMatchViewHolder$bindMatchData$1(C4572aa c4572aa, C6053g c6053g) {
        super(1);
        this.this$0 = c4572aa;
        this.$matchInfo = c6053g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
        if (r0 == null) goto L25;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ kotlin.Unit invoke(android.view.View r8) {
        /*
            r7 = this;
            r6 = 1
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r5 = 0
            r1[r5] = r8
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.liveinteract.multianchor.viewholder.MultiPkRandomMatchViewHolder$bindMatchData$1.changeQuickRedirect
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r1, r7, r0, r5, r6)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L5d
            p003X.C106862S5w.LIZ(r8)
            com.bytedance.android.live.liveinteract.multianchor.viewholder.aa r0 = r7.this$0
            boolean r0 = r0.LIZJ()
            if (r0 == 0) goto L60
            X.HSe r4 = p003X.C79414HSe.LIZIZ
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = p003X.C79414HSe.LIZ
            r0 = 3
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r4, r1, r5, r0)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L50
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.lang.String r1 = r4.LIZLLL()
            java.lang.String r0 = "speedup_status"
            r3.put(r0, r1)
            java.lang.String r1 = r4.LIZJ()
            java.lang.String r0 = "anchor_type"
            r3.put(r0, r1)
            X.47f r2 = p003X.C4574547f.LIZ()
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r0 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r1[r5] = r0
            java.lang.String r0 = "livesdk_random_npk_matching_cancel"
            r2.LIZ(r0, r3, r1)
        L50:
            com.bytedance.android.live.liveinteract.multianchor.viewholder.aa r0 = r7.this$0
            com.bytedance.android.live.liveinteract.multianchor.match.a r1 = r0.LIZ()
            if (r1 == 0) goto L5d
            java.lang.String r0 = "clickBtn"
            r1.LIZ(r5, r0)
        L5d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L60:
            X.HcK r0 = com.bytedance.android.live.liveinteract.randompkcheck.C4832a.LIZJ
            boolean r0 = r0.LIZIZ()
            r3 = 0
            if (r0 != 0) goto L8d
            X.Hcc r2 = p003X.C79785Hch.f6881LJ
            com.bytedance.android.live.linkpk.RandomMatchCheckSource r1 = com.bytedance.android.live.linkpk.RandomMatchCheckSource.MultiPKUserListFragment
            r0 = 2
            X.Hch r2 = p003X.C79780Hcc.LIZ(r2, r1, r3, r0, r3)
            com.bytedance.android.live.liveinteract.multianchor.viewholder.aa r0 = r7.this$0
            android.view.View r1 = r0.itemView
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            android.content.Context r0 = r1.getContext()
            if (r0 == 0) goto Lcb
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            androidx.fragment.app.FragmentManager r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = "random_pk_check_fragment"
            r2.show(r1, r0)
            goto L5d
        L8d:
            com.bytedance.android.live.liveinteract.multianchor.viewholder.aa r0 = r7.this$0
            com.bytedance.android.live.liveinteract.multianchor.match.a r4 = r0.LIZ()
            if (r4 == 0) goto Lb0
            com.bytedance.android.live.liveinteract.multianchor.viewholder.aa r3 = r7.this$0
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.multianchor.viewholder.C4572aa.LIZ
            r0 = 8
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r3, r1, r5, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto Lb8
            java.lang.Object r0 = r1.result
            com.bytedance.android.livesdk.chatroom.interact.model.g r0 = (com.bytedance.android.livesdk.chatroom.interact.model.C6053g) r0
        La9:
            if (r0 != 0) goto Lad
        Lab:
            com.bytedance.android.livesdk.chatroom.interact.model.g r0 = r7.$matchInfo
        Lad:
            r4.LIZ(r0)
        Lb0:
            X.HQJ r1 = p003X.HQJ.LIZIZ
            java.lang.String r0 = "pk_banner"
            r1.LIZ(r0)
            goto L5d
        Lb8:
            com.bytedance.android.live.liveinteract.multianchor.match.e r0 = r3.LIZIZ()
            if (r0 == 0) goto Lab
            X.2WD r0 = r0.LIZLLL()
            if (r0 == 0) goto Lab
            java.lang.Object r0 = r0.LIZ()
            com.bytedance.android.livesdk.chatroom.interact.model.g r0 = (com.bytedance.android.livesdk.chatroom.interact.model.C6053g) r0
            goto La9
        Lcb:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multianchor.viewholder.MultiPkRandomMatchViewHolder$bindMatchData$1.invoke(java.lang.Object):java.lang.Object");
    }
}
