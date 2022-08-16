package com.bytedance.android.live.liveinteract.multianchor.p370j;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.multianchor.widget.TeamPkMatchView;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.j.f */
/* loaded from: classes3.dex */
public final class C4522f {
    public static ChangeQuickRedirect LIZ;
    public final List<TeamPkMatchView.C4581a> LIZIZ = new ArrayList();
    public final List<TeamPkMatchView.C4581a> LIZJ = new ArrayList();
    public final Long LIZLLL;

    static {
        Covode.recordClassIndex(28066);
    }

    private final void LIZIZ(List<TeamPkMatchView.C4581a> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 5).isSupported || list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).LJIIIIZZ) {
                if (i != 0) {
                    Collections.swap(list, 0, i);
                    return;
                }
                return;
            }
        }
    }

    private final boolean LIZJ(Long l) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{l}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (l != null && l.longValue() != 0) {
            return true;
        }
        return false;
    }

    public final boolean LIZ(Long l) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{l}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (l != null && l.longValue() != 0) {
            return true;
        }
        return false;
    }

    private final boolean LIZ(List<? extends AnchorLinkUser> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        long LIZIZ = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ();
        for (AnchorLinkUser anchorLinkUser : list) {
            User LIZ2 = anchorLinkUser.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            if (LIZ2.getId() == LIZIZ) {
                return true;
            }
        }
        return false;
    }

    private final boolean LIZIZ(Long l) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{l}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!LIZJ(l)) {
            return true;
        }
        return false;
    }

    private final Pair<List<AnchorLinkUser>, List<AnchorLinkUser>> LIZ(List<? extends AnchorLinkUser> list, Map<Long, Long> map) {
        Long l;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, map}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (Pair) proxy.result;
        }
        HashMap hashMap = new HashMap();
        for (AnchorLinkUser anchorLinkUser : list) {
            User LIZ2 = anchorLinkUser.LIZ();
            if (LIZ2 != null && (l = map.get(Long.valueOf(LIZ2.getId()))) != null) {
                long longValue = l.longValue();
                if (longValue != 0) {
                    ArrayList arrayList = (ArrayList) hashMap.get(Long.valueOf(longValue));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(Long.valueOf(longValue), arrayList);
                    }
                    arrayList.add(anchorLinkUser);
                }
            }
        }
        if (hashMap.entrySet().size() == 1) {
            return TuplesKt.m137to(CollectionsKt___CollectionsKt.toList(hashMap.values()).get(0), CollectionsKt__CollectionsKt.emptyList());
        }
        if (hashMap.entrySet().size() == 2) {
            return TuplesKt.m137to(CollectionsKt___CollectionsKt.toList(hashMap.values()).get(0), CollectionsKt___CollectionsKt.toList(hashMap.values()).get(1));
        }
        return TuplesKt.m137to(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
    }

    public final boolean LIZ(List<? extends User> list, Long l) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, l}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (l != null) {
            l.longValue();
            Iterator<? extends User> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getId() == l.longValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<com.bytedance.android.live.liveinteract.multianchor.widget.TeamPkMatchView.C4581a> LIZ(java.util.List<? extends com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser> r28, java.util.List<? extends com.bytedance.android.live.base.model.user.User> r29, java.lang.Long r30) {
        /*
            r27 = this;
            r6 = r27
            r0 = 3
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r2 = 0
            r3[r2] = r28
            r1 = 1
            r8 = r29
            r3[r1] = r8
            r5 = 2
            r7 = r30
            r3[r5] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.liveinteract.multianchor.p370j.C4522f.LIZ
            com.bytedance.hotfix.PatchProxyResult r2 = com.bytedance.hotfix.PatchProxy.proxy(r3, r6, r0, r2, r1)
            boolean r0 = r2.isSupported
            if (r0 == 0) goto L21
            java.lang.Object r0 = r2.result
            java.util.List r0 = (java.util.List) r0
            return r0
        L21:
            java.lang.Class<com.bytedance.android.live.user.IUserService> r0 = com.bytedance.android.live.user.IUserService.class
            com.bytedance.android.live.base.IService r0 = com.bytedance.android.live.utility.ServiceManager.getService(r0)
            com.bytedance.android.live.user.IUserService r0 = (com.bytedance.android.live.user.IUserService) r0
            X.3VF r0 = r0.user()
            long r15 = r0.LIZIZ()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r14 = r28.iterator()
        L3a:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto Lb7
            java.lang.Object r9 = r14.next()
            com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser r9 = (com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser) r9
            com.bytedance.android.live.base.model.user.User r25 = r9.LIZ()
            if (r25 == 0) goto L3a
            int r0 = r25.getGender()
            if (r0 == r1) goto Lb4
            if (r0 == r5) goto Lb1
            com.bytedance.android.live.liveinteract.multianchor.widget.TeamPkMatchView$Gender r20 = com.bytedance.android.live.liveinteract.multianchor.widget.TeamPkMatchView.Gender.UNKNOWN
        L56:
            com.bytedance.android.live.liveinteract.multianchor.widget.TeamPkMatchView$a r17 = new com.bytedance.android.live.liveinteract.multianchor.widget.TeamPkMatchView$a
            com.bytedance.android.live.base.model.ImageModel r3 = r25.getAvatarThumb()
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            java.lang.String r2 = r25.getNickName()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            int r1 = r9.LJIIJ
            long r10 = r25.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            boolean r22 = r6.LIZ(r8, r0)
            boolean r0 = r6.LIZ(r7)
            if (r0 == 0) goto Lae
            long r12 = r25.getId()
            if (r7 == 0) goto Lae
            long r10 = r7.longValue()
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 != 0) goto Lae
            r23 = 1
        L8c:
            int r9 = r9.f26348LJ
            long r10 = r25.getId()
            int r0 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r0 != 0) goto Lab
            r26 = 1
        L98:
            r0 = r17
            r21 = r1
            r24 = r9
            r18 = r3
            r19 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4.add(r0)
            r0 = 0
            r1 = 1
            goto L3a
        Lab:
            r26 = 0
            goto L98
        Lae:
            r23 = 0
            goto L8c
        Lb1:
            com.bytedance.android.live.liveinteract.multianchor.widget.TeamPkMatchView$Gender r20 = com.bytedance.android.live.liveinteract.multianchor.widget.TeamPkMatchView.Gender.FEMALE
            goto L56
        Lb4:
            com.bytedance.android.live.liveinteract.multianchor.widget.TeamPkMatchView$Gender r20 = com.bytedance.android.live.liveinteract.multianchor.widget.TeamPkMatchView.Gender.MALE
            goto L56
        Lb7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multianchor.p370j.C4522f.LIZ(java.util.List, java.util.List, java.lang.Long):java.util.List");
    }

    public C4522f(List<? extends AnchorLinkUser> list, Map<Long, Long> map, List<? extends User> list2, Long l) {
        C106862S5w.LIZ(list, map, list2);
        Long l2 = null;
        if (list.size() <= 4) {
            Pair<List<AnchorLinkUser>, List<AnchorLinkUser>> LIZ2 = LIZ(list, map);
            List<AnchorLinkUser> component1 = LIZ2.component1();
            List<AnchorLinkUser> component2 = LIZ2.component2();
            if (!LIZ(component2)) {
                component1 = component2;
                component2 = component1;
            }
            Pair m137to = TuplesKt.m137to(LIZ(component2, list2, l), LIZ(component1, list2, l));
            List<TeamPkMatchView.C4581a> list3 = (List) m137to.component1();
            List<TeamPkMatchView.C4581a> list4 = (List) m137to.component2();
            LIZIZ(list3);
            LIZIZ(list4);
            this.LIZIZ.clear();
            this.LIZIZ.addAll(list3);
            this.LIZJ.clear();
            this.LIZJ.addAll(list4);
            this.LIZLLL = list3.isEmpty() ^ true ? map.get(Long.valueOf(list3.get(0).LJII.getId())) : l2;
            return;
        }
        this.LIZLLL = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
        if (r0 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(java.util.List<? extends com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser> r12, java.util.Map<java.lang.Long, java.lang.Long> r13, java.util.List<? extends com.bytedance.android.live.base.model.user.User> r14, java.lang.Long r15) {
        /*
            r11 = this;
            r0 = 4
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r8 = 0
            r2[r8] = r12
            r10 = 1
            r2[r10] = r13
            r9 = 2
            r2[r9] = r14
            r4 = 3
            r2[r4] = r15
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.multianchor.p370j.C4522f.LIZ
            r0 = 6
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r11, r1, r8, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L1b
            return
        L1b:
            p003X.C106862S5w.LIZ(r12, r13, r14)
            kotlin.Pair r0 = r11.LIZ(r12, r13)
            java.lang.Object r2 = r0.component1()
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r0.component2()
            java.util.List r3 = (java.util.List) r3
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ r10
            r5 = 0
            if (r0 == 0) goto Le5
            java.lang.Object r0 = r2.get(r8)
            com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser r0 = (com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser) r0
            com.bytedance.android.live.base.model.user.User r0 = r0.LIZ()
            if (r0 == 0) goto Le2
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L4a:
            java.lang.Object r6 = r13.get(r0)
            java.lang.Long r6 = (java.lang.Long) r6
        L50:
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ r10
            if (r0 == 0) goto L71
            java.lang.Object r0 = r3.get(r8)
            com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser r0 = (com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser) r0
            com.bytedance.android.live.base.model.user.User r0 = r0.LIZ()
            if (r0 == 0) goto L6b
            long r0 = r0.getId()
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
        L6b:
            java.lang.Object r5 = r13.get(r5)
            java.lang.Long r5 = (java.lang.Long) r5
        L71:
            java.lang.Long r7 = r11.LIZLLL
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r8] = r7
            r4[r10] = r6
            r4[r9] = r5
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.multianchor.p370j.C4522f.LIZ
            r0 = 9
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r4, r11, r1, r8, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto Lbe
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L8f:
            if (r0 == 0) goto Ld0
        L91:
            java.util.List r1 = r11.LIZ(r3, r14, r15)
            java.util.List r0 = r11.LIZ(r2, r14, r15)
            kotlin.Pair r0 = kotlin.TuplesKt.m137to(r1, r0)
            java.lang.Object r2 = r0.component1()
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r0.component2()
            java.util.List r1 = (java.util.List) r1
            java.util.List<com.bytedance.android.live.liveinteract.multianchor.widget.TeamPkMatchView$a> r0 = r11.LIZIZ
            r0.clear()
            java.util.List<com.bytedance.android.live.liveinteract.multianchor.widget.TeamPkMatchView$a> r0 = r11.LIZIZ
            r0.addAll(r2)
            java.util.List<com.bytedance.android.live.liveinteract.multianchor.widget.TeamPkMatchView$a> r0 = r11.LIZJ
            r0.clear()
            java.util.List<com.bytedance.android.live.liveinteract.multianchor.widget.TeamPkMatchView$a> r0 = r11.LIZJ
            r0.addAll(r1)
            return
        Lbe:
            boolean r0 = r11.LIZIZ(r7)
            if (r0 != 0) goto Ld0
            boolean r0 = r11.LIZIZ(r6)
            if (r0 == 0) goto Ld4
            boolean r0 = r11.LIZIZ(r5)
            if (r0 == 0) goto Ld4
        Ld0:
            r0 = r2
            r2 = r3
            r3 = r0
            goto L91
        Ld4:
            if (r6 == 0) goto Ldd
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r6)
            r0 = r0 ^ 1
            goto L8f
        Ldd:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r5)
            goto L8f
        Le2:
            r0 = r5
            goto L4a
        Le5:
            r6 = r5
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multianchor.p370j.C4522f.LIZ(java.util.List, java.util.Map, java.util.List, java.lang.Long):void");
    }
}
