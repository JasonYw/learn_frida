package com.bytedance.android.live.broadcastgame.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bef.effectsdk.view.BEFView;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.broadcastgame.api.model.InteractID;
import com.bytedance.android.live.broadcastgame.effectgame.EffectGameEngine;
import com.bytedance.android.live.broadcastgame.effectgame.base.AbstractC3466a;
import com.bytedance.android.live.broadcastgame.effectgame.base.AbstractC3468j;
import com.bytedance.android.live.broadcastgame.effectgame.base.f$b;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p1594ss.avframework.livestreamv2.filter.IFilterManager;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.AbstractC4569445g;
import p003X.AbstractC87117KUl;
import p003X.C106862S5w;
import p003X.C3BK;
import p003X.C443233g5;
import p003X.C448033np;
import p003X.C4574547f;
import p003X.C64646Bf6;
import p003X.C87079KSz;
import p003X.C87106KUa;
import p003X.C87107KUb;
import p003X.C87108KUc;
import p003X.C87110KUe;
import p003X.C87116KUk;
import p003X.C87125KUt;
import p003X.C88440Kt0;
import p003X.KUX;
import p003X.KUY;
import p003X.KUZ;
import p003X.KV2;
import p003X.KVC;

/* loaded from: classes5.dex */
public final class LiveGameControlWidget extends LiveRecyclableWidget implements Observer<KVData>, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public C3384q LIZIZ;
    public boolean LIZJ;
    public Map<String, ? extends Object> LIZLLL;

    /* renamed from: LJ */
    public KV2 f26119LJ;
    public AbstractC3468j LJFF;
    public f$b LJI;
    public AbstractC87117KUl LJII;
    public final Observer<AbstractC4256d> LJIIIIZZ = new C87108KUc(this);
    public final AbstractC5436a LJIIIZ;
    public final long LJIIJ;
    public final FragmentManager LJIIJJI;

    static {
        Covode.recordClassIndex(21840);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131700387;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a139";
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 24).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d6, code lost:
        if (r19 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(java.util.List<com.bytedance.android.live.broadcastgame.api.model.C3384q> r21, long r22, java.util.List<com.bytedance.android.live.broadcastgame.api.model.C3384q> r24, java.util.Map<com.bytedance.android.live.broadcastgame.api.model.C3384q, com.p1594ss.android.ugc.effectmanager.common.task.ExceptionResult> r25, int r26) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.widget.LiveGameControlWidget.LIZ(java.util.List, long, java.util.List, java.util.Map, int):void");
    }

    public final void LIZ(List<C3384q> list, Sticker sticker) {
        if (PatchProxy.proxy(new Object[]{list, sticker}, this, LIZ, false, 16).isSupported) {
            return;
        }
        ArrayList<C3384q> arrayList = new ArrayList();
        for (Object obj : list) {
            C3383p LJFF = ((C3384q) obj).LJFF();
            if ((LJFF != null ? LJFF.LJJIJIIJI : 0L) == sticker.getId()) {
                arrayList.add(obj);
            }
        }
        for (C3384q c3384q : arrayList) {
            C3383p LJFF2 = c3384q.LJFF();
            if (LJFF2 != null) {
                LJFF2.LIZIZ = sticker;
            }
            C3383p LJFF3 = c3384q.LJFF();
            if (LJFF3 != null) {
                C87110KUe.LIZIZ.LIZ(sticker, LJFF3);
            }
        }
    }

    private final C87107KUb LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (C87107KUb) proxy.result;
        }
        return new C87107KUb(this);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        KV2 kv2 = this.f26119LJ;
        if (kv2 != null) {
            kv2.LIZ();
        }
        AbstractC3468j abstractC3468j = this.LJFF;
        if (abstractC3468j != null) {
            abstractC3468j.mo15850LJ();
        }
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        C3BK pkService = ((IInteractService) service).getPkService();
        if (pkService != null) {
            pkService.LIZIZ(this.LJIIIIZZ);
        }
    }

    private final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC3468j abstractC3468j = this.LJFF;
        if (abstractC3468j == null || !abstractC3468j.LIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onPause() {
        BEFView bEFView;
        AbstractC3468j abstractC3468j;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onPause();
        if (LIZ() && (abstractC3468j = this.LJFF) != null) {
            abstractC3468j.LIZLLL();
        }
        KV2 kv2 = this.f26119LJ;
        if (kv2 != null && !PatchProxy.proxy(new Object[0], kv2, KV2.LIZ, false, 4).isSupported) {
            C87125KUt c87125KUt = kv2.LJIIIZ;
            if (!PatchProxy.proxy(new Object[0], c87125KUt, C87125KUt.LIZ, false, 6).isSupported && (bEFView = c87125KUt.LIZIZ) != null) {
                bEFView.onPause();
            }
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        AbstractC3468j abstractC3468j;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onResume();
        if (LIZ() && (abstractC3468j = this.LJFF) != null) {
            abstractC3468j.LIZJ();
        }
        KV2 kv2 = this.f26119LJ;
        if (kv2 != null && !PatchProxy.proxy(new Object[0], kv2, KV2.LIZ, false, 3).isSupported) {
            C87125KUt c87125KUt = kv2.LJIIIZ;
            if (!PatchProxy.proxy(new Object[0], c87125KUt, C87125KUt.LIZ, false, 7).isSupported) {
                BEFView bEFView = c87125KUt.LIZIZ;
                if (bEFView != null) {
                    bEFView.onResume();
                }
                BEFView bEFView2 = c87125KUt.LIZIZ;
                if (bEFView2 != null) {
                    IFilterManager LJIIJ = c87125KUt.LJFF.LJIIJ();
                    Intrinsics.checkNotNullExpressionValue(LJIIJ, "");
                    bEFView2.attachEffect(LJIIJ.getEffectNativeHandler());
                }
            }
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        DataCenter dataCenter;
        if (!PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 3).isSupported && (dataCenter = this.dataCenter) != null) {
            dataCenter.observe("data_broadcast_game_list", this);
            dataCenter.observe("cmd_broadcast_game_click", this);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 4).isSupported) {
            return;
        }
        this.f26119LJ = new KV2(this.dataCenter, this.context, this.LJIIIZ, this.containerView);
        DataCenter dataCenter = this.dataCenter;
        List<C3384q> list = null;
        if (dataCenter != null) {
            list = (List) dataCenter.get("data_broadcast_game_list", (String) null);
        }
        LIZ(list);
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        C3BK pkService = ((IInteractService) service).getPkService();
        if (pkService != null) {
            pkService.LIZ(this.LJIIIIZZ);
        }
    }

    private final void LIZ(List<C3384q> list) {
        String str;
        KV2 kv2;
        long j;
        KV2 kv22;
        if (!PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 12).isSupported && list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((C3384q) obj).f26027LJ == InteractID.EffectGame.value) {
                    arrayList.add(obj);
                }
            }
            ArrayList<C3384q> arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            for (C3384q c3384q : arrayList2) {
                if (this.dataCenter != null && (kv2 = this.f26119LJ) != null) {
                    Room room = (Room) this.dataCenter.get("data_room");
                    if (room != null) {
                        j = room.ownerUserId;
                    } else {
                        j = 0;
                    }
                    if (kv2.LIZ(c3384q, j) && (kv22 = this.f26119LJ) != null) {
                        kv22.LIZJ(c3384q);
                    }
                }
                C3383p LJFF = c3384q.LJFF();
                if (LJFF == null || (str = String.valueOf(LJFF.LJJIJIIJI)) == null) {
                    str = "";
                }
                arrayList3.add(str);
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                if (!TextUtils.isEmpty((String) obj2)) {
                    arrayList4.add(obj2);
                }
            }
            LIZ(arrayList4, list);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        String key;
        KUX kux;
        Map<String, ? extends Object> map;
        C3383p LJFF;
        Sticker sticker;
        String str;
        String str2;
        long j;
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 8).isSupported) {
            Integer num = null;
            if (kVData2 != null && (key = kVData2.getKey()) != null) {
                int hashCode = key.hashCode();
                if (hashCode != -1802015048) {
                    if (hashCode != -550251746 || !key.equals("cmd_broadcast_game_click") || (kux = (KUX) kVData2.getData(null)) == null) {
                        return;
                    }
                    C87079KSz c87079KSz = kux.LIZIZ;
                    if (c87079KSz != null) {
                        map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m137to("game_invite_info", c87079KSz));
                    } else {
                        map = null;
                    }
                    C3384q c3384q = kux.LIZ;
                    if (!PatchProxy.proxy(new Object[]{c3384q, map}, this, LIZ, false, 9).isSupported) {
                        if (c3384q != null) {
                            num = Integer.valueOf(c3384q.f26027LJ);
                        }
                        int i = InteractID.EffectGame.value;
                        if (num != null && num.intValue() == i && !PatchProxy.proxy(new Object[]{c3384q, map}, this, LIZ, false, 10).isSupported && c3384q.LJFF() != null) {
                            this.LIZIZ = c3384q;
                            this.LIZLLL = map;
                            C3383p LJFF2 = c3384q.LJFF();
                            if (LJFF2 != null && (sticker = LJFF2.LIZIZ) != null) {
                                if (sticker.isDownloaded()) {
                                    C87116KUk gameInfo = sticker.getGameInfo();
                                    PatchProxyResult proxy = PatchProxy.proxy(new Object[0], gameInfo, C87116KUk.LIZ, false, 4);
                                    if (!proxy.isSupported ? (str = gameInfo.LIZIZ) == null || StringsKt__StringsJVMKt.isBlank(str) || ((str2 = gameInfo.LJI) != null && !StringsKt__StringsJVMKt.isBlank(str2) && new File(gameInfo.LJI).exists()) : ((Boolean) proxy.result).booleanValue()) {
                                        C3383p LJFF3 = c3384q.LJFF();
                                        if (LJFF3 != null) {
                                            j = LJFF3.LIZLLL;
                                        } else {
                                            j = 0;
                                        }
                                        LIZ(sticker, map, j);
                                        return;
                                    }
                                }
                                LIZ(c3384q, sticker, false, LIZIZ());
                                return;
                            }
                            C87107KUb LIZIZ = LIZIZ();
                            if (PatchProxy.proxy(new Object[]{c3384q, LIZIZ}, this, LIZ, false, 17).isSupported || (LJFF = c3384q.LJFF()) == null) {
                                return;
                            }
                            this.LJII = new C87106KUa(this, c3384q, LJFF, LIZIZ);
                            C87110KUe c87110KUe = C87110KUe.LIZIZ;
                            String valueOf = String.valueOf(LJFF.LJJIJIIJI);
                            AbstractC87117KUl abstractC87117KUl = this.LJII;
                            if (abstractC87117KUl == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                            }
                            Object LIZ2 = C64646Bf6.LIZ(abstractC87117KUl);
                            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                            c87110KUe.LIZ(valueOf, (AbstractC87117KUl) LIZ2);
                        }
                    }
                } else if (key.equals("data_broadcast_game_list")) {
                    LIZ((List) kVData2.getData());
                }
            }
        }
    }

    private final void LIZ(List<String> list, List<C3384q> list2) {
        if (PatchProxy.proxy(new Object[]{list, list2}, this, LIZ, false, 13).isSupported) {
            return;
        }
        this.LJI = new KUY(this, list2);
        C87110KUe c87110KUe = C87110KUe.LIZIZ;
        f$b f_b = this.LJI;
        if (f_b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        Object LIZ2 = C64646Bf6.LIZ(f_b);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        c87110KUe.LIZ(list, (f$b) LIZ2);
    }

    public LiveGameControlWidget(AbstractC5436a abstractC5436a, long j, FragmentManager fragmentManager) {
        C106862S5w.LIZ(abstractC5436a, fragmentManager);
        this.LJIIIZ = abstractC5436a;
        this.LJIIJ = j;
        this.LJIIJJI = fragmentManager;
    }

    public final void LIZ(C3384q c3384q, long j, boolean z) {
        String str;
        long j2;
        if (PatchProxy.proxy(new Object[]{c3384q, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 23).isSupported) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (!z) {
            str = "0";
        } else {
            str = "1";
        }
        C4574547f LIZ2 = C4574547f.LIZ();
        Pair[] pairArr = new Pair[4];
        pairArr[0] = TuplesKt.m137to("game_name", c3384q.LJFF);
        C3383p LJFF = c3384q.LJFF();
        if (LJFF != null) {
            j2 = LJFF.LIZLLL;
        } else {
            j2 = 0;
        }
        pairArr[1] = TuplesKt.m137to("game_id", String.valueOf(j2));
        pairArr[2] = TuplesKt.m137to("duration", String.valueOf(currentTimeMillis));
        pairArr[3] = TuplesKt.m137to("status", str);
        LIZ2.LIZ("livesdk_live_game_loading_duration", MapsKt__MapsKt.mapOf(pairArr), Room.class);
    }

    public final void LIZ(Sticker sticker, Map<String, ? extends Object> map, long j) {
        if (!PatchProxy.proxy(new Object[]{sticker, map, new Long(j)}, this, LIZ, false, 11).isSupported && !LIZ() && this.LIZIZ != null) {
            C443233g5 c443233g5 = C443233g5.LIZIZ;
            C3384q c3384q = this.LIZIZ;
            Intrinsics.checkNotNull(c3384q);
            if (c443233g5.LIZ(c3384q) && this.LIZJ) {
                C88440Kt0.LIZ(2131585271);
                return;
            }
            if (this.LJFF == null) {
                Context context = this.context;
                Intrinsics.checkNotNullExpressionValue(context, "");
                long j2 = this.LJIIJ;
                FragmentManager fragmentManager = this.LJIIJJI;
                Context context2 = this.context;
                Intrinsics.checkNotNullExpressionValue(context2, "");
                ViewGroup viewGroup = this.containerView;
                Intrinsics.checkNotNullExpressionValue(viewGroup, "");
                C3384q c3384q2 = this.LIZIZ;
                Intrinsics.checkNotNull(c3384q2);
                KVC kvc = new KVC(context2, viewGroup, c3384q2);
                AbstractC5436a abstractC5436a = this.LJIIIZ;
                DataCenter dataCenter = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter, "");
                this.LJFF = new EffectGameEngine(context, j2, fragmentManager, kvc, abstractC5436a, dataCenter);
            }
            if (C448033np.LIZ(this.LIZIZ)) {
                KV2 kv2 = this.f26119LJ;
                if (kv2 != null) {
                    C3384q c3384q3 = this.LIZIZ;
                    Intrinsics.checkNotNull(c3384q3);
                    kv2.LIZ(sticker, c3384q3, map, 0);
                    return;
                }
                return;
            }
            AbstractC3468j abstractC3468j = this.LJFF;
            if (abstractC3468j != null) {
                C3384q c3384q4 = this.LIZIZ;
                Intrinsics.checkNotNull(c3384q4);
                abstractC3468j.LIZ(sticker, c3384q4, map);
            }
        }
    }

    public final void LIZ(C3384q c3384q, Sticker sticker, boolean z, AbstractC3466a abstractC3466a) {
        if (PatchProxy.proxy(new Object[]{c3384q, sticker, Byte.valueOf(z ? (byte) 1 : (byte) 0), abstractC3466a}, this, LIZ, false, 21).isSupported) {
            return;
        }
        C87110KUe.LIZIZ.LIZ(sticker, 1, new KUZ(this, abstractC3466a, c3384q));
    }
}
