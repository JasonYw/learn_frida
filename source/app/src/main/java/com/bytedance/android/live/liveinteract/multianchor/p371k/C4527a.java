package com.bytedance.android.live.liveinteract.multianchor.p371k;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder.C4324k;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder.C4329y;
import com.bytedance.android.live.liveinteract.multianchor.constant.PlayMode;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.multianchor.p368f.C4520a;
import com.bytedance.android.live.liveinteract.multianchor.p370j.C4522f;
import com.bytedance.android.live.liveinteract.multianchor.pklaunch.C4566a;
import com.bytedance.android.live.liveinteract.multianchor.widget.TeamPkMatchView;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4781u;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.interact.model.C6047ai;
import com.bytedance.android.livesdk.chatroom.interact.model.C6057l;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413392Xt;
import p003X.AbstractC78050Gpo;
import p003X.AbstractC79672Has;
import p003X.AbstractC79686Hb6;
import p003X.AbstractC79740Hby;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C78916H9a;
import p003X.C79169HIt;
import p003X.C79571HYf;
import p003X.C79592HZa;
import p003X.C79668Hao;
import p003X.C79681Hb1;
import p003X.C79683Hb3;
import p003X.HZJ;
import p003X.HZO;
import p003X.HZP;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.k.a */
/* loaded from: classes3.dex */
public final class C4527a extends ViewModel implements AbstractC79672Has {
    public static ChangeQuickRedirect LIZ;

    /* renamed from: LJ */
    public final PublishSubject<String> f26343LJ;
    public final PublishSubject<String> LJFF;
    public final PublishSubject<String> LJI;
    public final PublishSubject<Boolean> LJIIIIZZ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public String LJIILIIL;
    public List<? extends AnchorLinkUser> LJIIZILJ;
    public final AbstractC79740Hby LIZIZ = new HZP(this);
    public final AbstractC79686Hb6 LIZJ = new C79681Hb1(this);
    public final NextLiveData<PlayMode> LIZLLL = new NextLiveData<>();
    public final NextLiveData<Float> LJII = new NextLiveData<>();
    public final MutableLiveData<List<?>> LJIIIZ = new MutableLiveData<>();
    public final MutableLiveData<List<?>> LJIIJ = new MutableLiveData<>();
    public boolean LJIILL = true;
    public final C79668Hao LJIILJJIL = new C79668Hao();
    public final CompositeDisposable LJIILLIIL = new CompositeDisposable();

    static {
        Covode.recordClassIndex(28080);
    }

    @Override // p003X.AbstractC79672Has
    public final void LIZ(List<? extends AnchorLinkUser> list, List<? extends AnchorLinkUser> list2, List<? extends User> list3, Long l, C6047ai c6047ai, Map<Long, Long> map, boolean z) {
        if (PatchProxy.proxy(new Object[]{list, list2, list3, l, c6047ai, map, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 18).isSupported) {
            return;
        }
        C106862S5w.LIZ(list, list2, list3, map);
        PlayMode value = this.LIZLLL.getValue();
        PlayMode playMode = PlayMode.TEAM_PK;
        boolean z2 = playMode != value;
        this.LIZLLL.setValue(playMode);
        this.LJIIZILJ = list;
        LIZ(list2);
        if (z2 || z) {
            if (!PatchProxy.proxy(new Object[]{c6047ai, list, list3, l, map}, this, LIZ, false, 3).isSupported) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C4522f(list, map, list3, l));
                if (c6047ai == null) {
                    this.LJIIJ.setValue(arrayList);
                } else {
                    arrayList.addAll(LIZ(list, list3, c6047ai));
                    this.LJIIJ.setValue(arrayList);
                }
            }
            if (!z2) {
                return;
            }
            m15727LJ();
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        List<?> value2 = (PlayMode.TEAM_PK == PlayMode.TEAM_PK ? this.LJIIJ : this.LJIIIZ).getValue();
        Object obj = null;
        if (value2 != null && !value2.isEmpty()) {
            Iterator<?> it = value2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next instanceof C4522f) {
                    obj = next;
                    break;
                }
            }
        }
        C4522f c4522f = (C4522f) obj;
        if (c4522f == null) {
            return;
        }
        c4522f.LIZ(list, map, list3, l);
        arrayList2.add(c4522f);
        if (c6047ai != null) {
            arrayList2.addAll(LIZ(list, list3, c6047ai));
        }
        this.LJIIJ.setValue(arrayList2);
    }

    @Override // p003X.AbstractC79672Has
    public final void LIZ() {
        List<?> value;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported && (value = this.LJIIJ.getValue()) != null) {
            this.LJIIJ.setValue(value);
        }
    }

    public final void LIZJ() {
        AbstractC4781u LIZ2;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported && (LIZ2 = C4566a.LIZJ.LIZ()) != null) {
            LIZ2.LIZIZ();
        }
    }

    public final List<AnchorLinkUser> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        List list = this.LJIIZILJ;
        if (list == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return list;
    }

    /* renamed from: LJ */
    private final void m15727LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        PlayMode value = this.LIZLLL.getValue();
        if (value == PlayMode.PERSONAL_PK) {
            this.f26343LJ.onNext("");
        } else if (value == PlayMode.TEAM_PK) {
            this.LJFF.onNext("");
        }
    }

    public final int LIZIZ() {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC4774i LIZ2 = AbstractC78050Gpo.LIZ();
        if (LIZ2 != null) {
            i = LIZ2.LJJIFFI();
        }
        if (C79169HIt.LIZIZ(i, 4)) {
            return 1;
        }
        return 7;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onCleared();
        this.LJIILLIIL.dispose();
        C79668Hao c79668Hao = this.LJIILJJIL;
        if (!PatchProxy.proxy(new Object[0], c79668Hao, C79668Hao.LIZ, false, 3).isSupported) {
            C79592HZa c79592HZa = c79668Hao.LIZIZ;
            if (!PatchProxy.proxy(new Object[0], c79592HZa, C79592HZa.LIZ, false, 7).isSupported) {
                C4520a c4520a = c79592HZa.LIZIZ;
                if (c4520a != null) {
                    c4520a.LIZIZ(c79592HZa.LIZLLL);
                }
                C4520a c4520a2 = c79592HZa.LIZJ;
                if (c4520a2 != null) {
                    c4520a2.LIZIZ(c79592HZa.f6858LJ);
                }
                c79592HZa.LJFF = null;
            }
            C79683Hb3 c79683Hb3 = c79668Hao.LIZJ;
            if (!PatchProxy.proxy(new Object[0], c79683Hb3, C79683Hb3.LIZ, false, 1).isSupported) {
                c79683Hb3.LIZ();
            }
            HZJ hzj = c79668Hao.LIZLLL;
            if (!PatchProxy.proxy(new Object[0], hzj, HZJ.LIZ, false, 2).isSupported) {
                Disposable disposable = hzj.f6855LJ;
                if (disposable != null) {
                    disposable.dispose();
                }
                hzj.f6855LJ = null;
                hzj.LIZLLL = null;
            }
            HZO hzo = c79668Hao.f6873LJ;
            if (!PatchProxy.proxy(new Object[0], hzo, HZO.LIZ, false, 2).isSupported) {
                Disposable disposable2 = hzo.LIZLLL;
                if (disposable2 != null) {
                    disposable2.dispose();
                }
                hzo.LIZLLL = null;
                hzo.LIZJ = null;
            }
            C78916H9a c78916H9a = c79668Hao.LJFF;
            if (!PatchProxy.proxy(new Object[0], c78916H9a, C78916H9a.LIZ, false, 2).isSupported) {
                c78916H9a.LIZIZ = null;
                IMessageManager iMessageManager = c78916H9a.LIZJ;
                if (iMessageManager != null) {
                    iMessageManager.removeMessageListener(c78916H9a);
                }
            }
            c79668Hao.LJIILIIL = null;
        }
    }

    public C4527a() {
        AbstractC413392Xt<IMessageManager> LJIILLIIL;
        Room room;
        C2WC<Room> LIZ2;
        Room room2;
        C2WC<Room> LIZ3;
        PublishSubject<String> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "");
        this.f26343LJ = create;
        PublishSubject<String> create2 = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create2, "");
        this.LJFF = create2;
        PublishSubject<String> create3 = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create3, "");
        this.LJI = create3;
        PublishSubject<Boolean> create4 = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create4, "");
        this.LJIIIIZZ = create4;
        IMessageManager iMessageManager = null;
        this.LIZLLL.setValue(null);
        C79668Hao c79668Hao = this.LJIILJJIL;
        if (!PatchProxy.proxy(new Object[]{this}, c79668Hao, C79668Hao.LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(this);
            c79668Hao.LJIILIIL = this;
            C79592HZa c79592HZa = c79668Hao.LIZIZ;
            if (!PatchProxy.proxy(new Object[]{c79668Hao}, c79592HZa, C79592HZa.LIZ, false, 5).isSupported) {
                C106862S5w.LIZ(c79668Hao);
                c79592HZa.LJFF = c79668Hao;
                C4520a c4520a = c79592HZa.LIZIZ;
                if (c4520a != null) {
                    c4520a.LIZ(c79592HZa.LIZLLL);
                }
                C4520a c4520a2 = c79592HZa.LIZJ;
                if (c4520a2 != null) {
                    c4520a2.LIZ(c79592HZa.f6858LJ);
                }
            }
            HZJ hzj = c79668Hao.LIZLLL;
            if (!PatchProxy.proxy(new Object[]{c79668Hao}, hzj, HZJ.LIZ, false, 1).isSupported) {
                C106862S5w.LIZ(c79668Hao);
                hzj.LIZLLL = c79668Hao;
                C5923dp LIZ4 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                if (LIZ4 != null && (LIZ3 = LIZ4.LIZ()) != null) {
                    room2 = LIZ3.LIZ();
                } else {
                    room2 = null;
                }
                hzj.LJFF = room2;
            }
            HZO hzo = c79668Hao.f6873LJ;
            if (!PatchProxy.proxy(new Object[]{c79668Hao}, hzo, HZO.LIZ, false, 1).isSupported) {
                C106862S5w.LIZ(c79668Hao);
                hzo.LIZJ = c79668Hao;
                C5923dp LIZ5 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                if (LIZ5 != null && (LIZ2 = LIZ5.LIZ()) != null) {
                    room = LIZ2.LIZ();
                } else {
                    room = null;
                }
                hzo.LIZIZ = room;
            }
            C78916H9a c78916H9a = c79668Hao.LJFF;
            if (!PatchProxy.proxy(new Object[]{c79668Hao}, c78916H9a, C78916H9a.LIZ, false, 1).isSupported) {
                C106862S5w.LIZ(c79668Hao);
                c78916H9a.LIZIZ = c79668Hao;
                C5923dp LIZ6 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                if (LIZ6 != null && (LJIILLIIL = LIZ6.LJIILLIIL()) != null) {
                    iMessageManager = LJIILLIIL.LIZIZ();
                }
                c78916H9a.LIZJ = iMessageManager;
                IMessageManager iMessageManager2 = c78916H9a.LIZJ;
                if (iMessageManager2 != null) {
                    iMessageManager2.addMessageListener(MessageType.LINKER.LIZ(), c78916H9a);
                }
            }
        }
    }

    private final void LIZ(List<? extends AnchorLinkUser> list) {
        boolean z = false;
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 14).isSupported) {
            return;
        }
        boolean z2 = false;
        for (AnchorLinkUser anchorLinkUser : list) {
            if (anchorLinkUser.LJIIJ == 4) {
                z = true;
            } else {
                z2 = true;
            }
        }
        this.LJIIJJI = z;
        this.LJIIL = z2;
    }

    @Override // p003X.AbstractC79672Has
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 23).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJI.onNext(str);
    }

    private final boolean LIZJ(List<? extends User> list, Long l) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, l}, this, LIZ, false, 7);
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

    private final AnchorLinkUser LIZIZ(List<? extends AnchorLinkUser> list, Long l) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, l}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (AnchorLinkUser) proxy.result;
        }
        if (list == null) {
            return null;
        }
        for (AnchorLinkUser anchorLinkUser : list) {
            User user = anchorLinkUser.LIZIZ;
            Intrinsics.checkNotNullExpressionValue(user, "");
            long id = user.getId();
            if (l != null && id == l.longValue()) {
                return anchorLinkUser;
            }
        }
        return null;
    }

    @Override // p003X.AbstractC79672Has
    public final void LIZ(List<? extends User> list, Long l) {
        MutableLiveData<List<?>> mutableLiveData;
        List<C4324k> arrayList;
        Long l2;
        boolean z;
        Room room;
        MutableLiveData<List<?>> mutableLiveData2;
        Object obj;
        boolean z2;
        if (PatchProxy.proxy(new Object[]{list, l}, this, LIZ, false, 22).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        PlayMode value = this.LIZLLL.getValue();
        if (value == null) {
            return;
        }
        if (value == PlayMode.TEAM_PK) {
            mutableLiveData = this.LJIIJ;
        } else {
            mutableLiveData = this.LJIIIZ;
        }
        List<?> value2 = mutableLiveData.getValue();
        if (value2 == null) {
            return;
        }
        if (value == PlayMode.TEAM_PK) {
            if (PlayMode.TEAM_PK == PlayMode.TEAM_PK) {
                mutableLiveData2 = this.LJIIJ;
            } else {
                mutableLiveData2 = this.LJIIIZ;
            }
            List<?> value3 = mutableLiveData2.getValue();
            if (value3 != null && !value3.isEmpty()) {
                Iterator<?> it = value3.iterator();
                while (it.hasNext()) {
                    obj = it.next();
                    if (obj instanceof C4522f) {
                        break;
                    }
                }
            }
            obj = null;
            C4522f c4522f = (C4522f) obj;
            if (c4522f != null && !PatchProxy.proxy(new Object[]{list, l}, c4522f, C4522f.LIZ, false, 7).isSupported) {
                C106862S5w.LIZ(list);
                for (TeamPkMatchView.C4581a c4581a : CollectionsKt___CollectionsKt.plus((Collection) c4522f.LIZIZ, (Iterable) c4522f.LIZJ)) {
                    c4581a.f26378LJ = c4522f.LIZ(list, Long.valueOf(c4581a.LJII.getId()));
                    if (c4522f.LIZ(l)) {
                        long id = c4581a.LJII.getId();
                        if (l != null && l.longValue() == id) {
                            z2 = true;
                            c4581a.LJFF = z2;
                        }
                    }
                    z2 = false;
                    c4581a.LJFF = z2;
                }
            }
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{value2}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            arrayList = (List) proxy.result;
        } else {
            arrayList = new ArrayList();
            if (!value2.isEmpty()) {
                for (Object obj2 : value2) {
                    if (obj2 instanceof C4324k) {
                        arrayList.add(obj2);
                    }
                }
            }
        }
        for (C4324k c4324k : arrayList) {
            C6057l c6057l = c4324k.LIZIZ;
            if (c6057l != null && (room = c6057l.LIZIZ) != null) {
                l2 = Long.valueOf(room.ownerUserId);
            } else {
                l2 = null;
            }
            AnchorLinkUser LIZIZ = LIZIZ(this.LJIIZILJ, l2);
            if (LIZIZ != null && LIZIZ.f26348LJ != 2) {
                if (LIZIZ.LJIIJ != 4 && LIZJ(list, l2)) {
                    z = true;
                } else {
                    z = false;
                }
                c4324k.LJIILJJIL = z;
            }
        }
        int i = C79571HYf.LIZ[value.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.LJIIJ.setValue(value2);
                return;
            }
            return;
        }
        this.LJIIIZ.setValue(value2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<java.lang.Object> LIZ(java.util.List<? extends com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser> r18, java.util.List<? extends com.bytedance.android.live.base.model.user.User> r19, com.bytedance.android.livesdk.chatroom.interact.model.C6047ai r20) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multianchor.p371k.C4527a.LIZ(java.util.List, java.util.List, com.bytedance.android.livesdk.chatroom.interact.model.ai):java.util.List");
    }

    @Override // p003X.AbstractC79672Has
    public final void LIZ(List<? extends AnchorLinkUser> list, List<? extends AnchorLinkUser> list2, List<? extends User> list3, Long l, C6047ai c6047ai) {
        if (PatchProxy.proxy(new Object[]{list, list2, list3, l, c6047ai}, this, LIZ, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(list, list2, list3);
        PlayMode value = this.LIZLLL.getValue();
        PlayMode playMode = PlayMode.PERSONAL_PK;
        this.LIZLLL.setValue(playMode);
        this.LJIIZILJ = list;
        LIZ(list2);
        if (!PatchProxy.proxy(new Object[]{c6047ai, list, list3}, this, LIZ, false, 2).isSupported) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C4329y(list));
            if (c6047ai == null) {
                this.LJIIIZ.setValue(arrayList);
            } else {
                arrayList.addAll(LIZ(list, list3, c6047ai));
                this.LJIIIZ.setValue(arrayList);
            }
        }
        if (playMode != value) {
            m15727LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    @Override // p003X.AbstractC79672Has
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZIZ(java.util.List<? extends com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser> r5, java.util.List<? extends com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser> r6, java.util.List<? extends com.bytedance.android.live.base.model.user.User> r7, java.lang.Long r8, com.bytedance.android.livesdk.chatroom.interact.model.C6047ai r9) {
        /*
            r4 = this;
            r0 = 5
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r2 = 0
            r3[r2] = r5
            r0 = 1
            r3[r0] = r6
            r0 = 2
            r3[r0] = r7
            r0 = 3
            r3[r0] = r8
            r0 = 4
            r3[r0] = r9
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.multianchor.p371k.C4527a.LIZ
            r0 = 20
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r4, r1, r2, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L1f
            return
        L1f:
            p003X.C106862S5w.LIZ(r5, r6, r7)
            com.bytedance.android.live.liveinteract.multianchor.constant.PlayMode r1 = com.bytedance.android.live.liveinteract.multianchor.constant.PlayMode.PERSONAL_PK
            com.bytedance.ies.sdk.widgets.NextLiveData<com.bytedance.android.live.liveinteract.multianchor.constant.PlayMode> r0 = r4.LIZLLL
            java.lang.Object r0 = r0.getValue()
            if (r1 != r0) goto L76
            if (r9 == 0) goto L76
            com.bytedance.android.live.liveinteract.multianchor.constant.PlayMode r0 = com.bytedance.android.live.liveinteract.multianchor.constant.PlayMode.TEAM_PK
            if (r1 != r0) goto L5e
            androidx.lifecycle.MutableLiveData<java.util.List<?>> r0 = r4.LJIIJ
        L34:
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            r3 = 0
            if (r1 == 0) goto L58
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L58
            java.util.Iterator r2 = r1.iterator()
        L47:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r1 = r2.next()
            if (r1 == 0) goto L57
            boolean r0 = r1 instanceof com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder.C4329y
            if (r0 == 0) goto L47
        L57:
            r3 = r1
        L58:
            if (r3 != 0) goto L61
            r4.LIZ(r5, r6, r7, r8, r9)
            return
        L5e:
            androidx.lifecycle.MutableLiveData<java.util.List<?>> r0 = r4.LJIIIZ
            goto L34
        L61:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r3)
            java.util.List r0 = r4.LIZ(r5, r7, r9)
            r1.addAll(r0)
            androidx.lifecycle.MutableLiveData<java.util.List<?>> r0 = r4.LJIIIZ
            r0.setValue(r1)
            return
        L76:
            r4.LIZ(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multianchor.p371k.C4527a.LIZIZ(java.util.List, java.util.List, java.util.List, java.lang.Long, com.bytedance.android.livesdk.chatroom.interact.model.ai):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    @Override // p003X.AbstractC79672Has
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(java.util.List<? extends com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser> r15, java.util.List<? extends com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser> r16, java.util.List<? extends com.bytedance.android.live.base.model.user.User> r17, java.lang.Long r18, com.bytedance.android.livesdk.chatroom.interact.model.C6047ai r19, java.util.Map<java.lang.Long, java.lang.Long> r20) {
        /*
            r14 = this;
            r4 = r14
            r0 = 6
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r2 = 0
            r5 = r15
            r3[r2] = r5
            r0 = 1
            r6 = r16
            r3[r0] = r6
            r0 = 2
            r7 = r17
            r3[r0] = r7
            r0 = 3
            r8 = r18
            r3[r0] = r8
            r0 = 4
            r9 = r19
            r3[r0] = r9
            r0 = 5
            r10 = r20
            r3[r0] = r10
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.multianchor.p371k.C4527a.LIZ
            r0 = 21
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r14, r1, r2, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L2e
            return
        L2e:
            p003X.C106862S5w.LIZ(r5, r6, r7, r10)
            com.bytedance.android.live.liveinteract.multianchor.constant.PlayMode r1 = com.bytedance.android.live.liveinteract.multianchor.constant.PlayMode.TEAM_PK
            com.bytedance.ies.sdk.widgets.NextLiveData<com.bytedance.android.live.liveinteract.multianchor.constant.PlayMode> r0 = r4.LIZLLL
            java.lang.Object r0 = r0.getValue()
            if (r1 != r0) goto L8a
            if (r9 == 0) goto L8a
            com.bytedance.android.live.liveinteract.multianchor.constant.PlayMode r0 = com.bytedance.android.live.liveinteract.multianchor.constant.PlayMode.TEAM_PK
            if (r1 != r0) goto L72
            androidx.lifecycle.MutableLiveData<java.util.List<?>> r0 = r4.LJIIJ
        L43:
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            r3 = 0
            if (r1 == 0) goto L67
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L67
            java.util.Iterator r2 = r1.iterator()
        L56:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r1 = r2.next()
            if (r1 == 0) goto L66
            boolean r0 = r1 instanceof com.bytedance.android.live.liveinteract.multianchor.p370j.C4522f
            if (r0 == 0) goto L56
        L66:
            r3 = r1
        L67:
            if (r3 != 0) goto L75
            r11 = 0
            r12 = 64
            r13 = 0
            r4 = r14
            p003X.C79680Hb0.LIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L72:
            androidx.lifecycle.MutableLiveData<java.util.List<?>> r0 = r4.LJIIIZ
            goto L43
        L75:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r3)
            java.util.List r0 = r14.LIZ(r5, r7, r9)
            r1.addAll(r0)
            androidx.lifecycle.MutableLiveData<java.util.List<?>> r0 = r4.LJIIJ
            r0.setValue(r1)
            return
        L8a:
            r11 = 0
            r12 = 64
            r13 = 0
            r4 = r14
            p003X.C79680Hb0.LIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multianchor.p371k.C4527a.LIZ(java.util.List, java.util.List, java.util.List, java.lang.Long, com.bytedance.android.livesdk.chatroom.interact.model.ai, java.util.Map):void");
    }
}
