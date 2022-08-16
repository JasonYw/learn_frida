package com.bytedance.android.live.liveinteract.chatroom.chatroom.widget;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder.c$a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder.p$a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder.q$a;
import com.bytedance.android.live.liveinteract.p382pk.p384ui.PkItemExposeRecyclerView;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.model.interact.C6148ae;
import com.bytedance.android.livesdk.chatroom.p518ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.log.model.C8657j;
import com.bytedance.android.livesdkapi.depend.live.ILiveRoomService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;
import me.drakeet.multitype.C35036d;
import p003X.AbstractC4569445g;
import p003X.AbstractC79943HfF;
import p003X.C106862S5w;
import p003X.C4574547f;
import p003X.C78113Gqp;
import p003X.C79584HYs;
import p003X.C79891HeP;
import p003X.C79919Her;
import p003X.C79922Heu;
import p003X.C79924Hew;
import p003X.C79931Hf3;
import p003X.C79932Hf4;
import p003X.C79933Hf5;
import p003X.C79967Hfd;
import p003X.C79969Hff;

/* loaded from: classes3.dex */
public final class PKRivalsPanelListWidget extends LiveRecyclableWidget implements AbstractC79943HfF, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public PkItemExposeRecyclerView LIZIZ;
    public C35036d LIZJ;
    public LinkedList<Object> LIZLLL;

    /* renamed from: LJ */
    public final C79919Her f26300LJ;
    public final String LJFF;
    public final boolean LJI;
    public C79891HeP LJII;

    static {
        Covode.recordClassIndex(26497);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699886;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 13).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        this.f26300LJ.LIZ(this);
        this.dataCenter.put("cmd_pk_rival_list_panel_unload", Boolean.TRUE);
    }

    public static final /* synthetic */ LinkedList LIZ(PKRivalsPanelListWidget pKRivalsPanelListWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pKRivalsPanelListWidget}, null, LIZ, true, 10);
        if (proxy.isSupported) {
            return (LinkedList) proxy.result;
        }
        LinkedList<Object> linkedList = pKRivalsPanelListWidget.LIZLLL;
        if (linkedList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return linkedList;
    }

    public static final /* synthetic */ PkItemExposeRecyclerView LIZIZ(PKRivalsPanelListWidget pKRivalsPanelListWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pKRivalsPanelListWidget}, null, LIZ, true, 11);
        if (proxy.isSupported) {
            return (PkItemExposeRecyclerView) proxy.result;
        }
        PkItemExposeRecyclerView pkItemExposeRecyclerView = pKRivalsPanelListWidget.LIZIZ;
        if (pkItemExposeRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return pkItemExposeRecyclerView;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 5).isSupported) {
            return;
        }
        this.f26300LJ.LJIILLIIL.observe(this, new C79931Hf3(this));
        this.f26300LJ.LJII.observe(this, new C79924Hew(this));
        this.f26300LJ.LJIIZILJ.observe(this, new C79932Hf4(this));
        this.f26300LJ.LJIIIZ.observe(this, new C79933Hf5(this));
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 4).isSupported) {
            return;
        }
        View findViewById = findViewById(2131169151);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = (PkItemExposeRecyclerView) findViewById;
        this.LJII = new C79891HeP();
        this.LIZJ = new C35036d();
        this.LIZLLL = new LinkedList<>();
        C35036d c35036d = this.LIZJ;
        if (c35036d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C79891HeP c79891HeP = this.LJII;
        if (c79891HeP == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        c35036d.LIZ(q$a.class, new C79969Hff(c79891HeP, this, dataCenter));
        C35036d c35036d2 = this.LIZJ;
        if (c35036d2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C79891HeP c79891HeP2 = this.LJII;
        if (c79891HeP2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        DataCenter dataCenter2 = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter2, "");
        c35036d2.LIZ(c$a.class, new C79967Hfd(c79891HeP2, this, dataCenter2));
        C35036d c35036d3 = this.LIZJ;
        if (c35036d3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c35036d3.LIZ(p$a.class, new C78113Gqp());
        PkItemExposeRecyclerView pkItemExposeRecyclerView = this.LIZIZ;
        if (pkItemExposeRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        pkItemExposeRecyclerView.setInviteIconPanelType("search");
        PkItemExposeRecyclerView pkItemExposeRecyclerView2 = this.LIZIZ;
        if (pkItemExposeRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C35036d c35036d4 = this.LIZJ;
        if (c35036d4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        pkItemExposeRecyclerView2.setAdapter(c35036d4);
        PkItemExposeRecyclerView pkItemExposeRecyclerView3 = this.LIZIZ;
        if (pkItemExposeRecyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        pkItemExposeRecyclerView3.setLayoutManager(new SSLinearLayoutManager(this.context, 1, false));
        PkItemExposeRecyclerView pkItemExposeRecyclerView4 = this.LIZIZ;
        if (pkItemExposeRecyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        pkItemExposeRecyclerView4.setItemViewCacheSize(8);
        PkItemExposeRecyclerView pkItemExposeRecyclerView5 = this.LIZIZ;
        if (pkItemExposeRecyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        pkItemExposeRecyclerView5.setItemAnimator(null);
        PkItemExposeRecyclerView pkItemExposeRecyclerView6 = this.LIZIZ;
        if (pkItemExposeRecyclerView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        pkItemExposeRecyclerView6.addOnScrollListener(new C79922Heu(this));
    }

    @Override // p003X.AbstractC79943HfF
    public final void LIZ(C6148ae c6148ae, int i) {
        if (PatchProxy.proxy(new Object[]{c6148ae, Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.f26300LJ.LIZ(c6148ae, i);
        this.dataCenter.put("data_pk_match_state", 0);
    }

    @Override // p003X.AbstractC79943HfF
    public final void LIZ(int i, C6148ae c6148ae) {
        long j;
        String str;
        Long l;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c6148ae}, this, LIZ, false, 1).isSupported) {
            return;
        }
        IService service = ServiceManager.getService(IRoomService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        Room currentRoom = ((ILiveRoomService) service).getCurrentRoom();
        if (currentRoom == null || !C79584HYs.LIZ(2, i, currentRoom.ownerUserId, 0) || !C79584HYs.LIZ(String.valueOf(currentRoom.ownerUserId), 2, i)) {
            return;
        }
        LinkCrossRoomDataHolder.LJII().LJII = i;
        LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
        if (c6148ae != null) {
            j = c6148ae.LIZ;
        } else {
            j = 0;
        }
        LJII.LJJJLIIL = j;
        this.f26300LJ.LIZ(currentRoom.getId(), i, c6148ae, this.LJFF);
        HashMap hashMap = new HashMap();
        hashMap.put("is_oncemore", "0");
        hashMap.put("invitee_list", "search");
        hashMap.put("is_recommend_list", "0");
        if (this.LJFF.length() > 0) {
            str = PushConstants.INTENT_ACTIVITY_NAME;
        } else {
            str = "routine";
        }
        hashMap.put("pk_description", str);
        hashMap.put("pk_activity_type", this.LJFF);
        if (this.LJI) {
            hashMap.put("anchor_connection_type", "invite");
            hashMap.put("connection_type", "manual_link");
            hashMap.put("source", "link_banner");
        } else {
            hashMap.put("source", "pk_banner");
        }
        if (c6148ae != null) {
            l = Long.valueOf(c6148ae.LIZ);
        } else {
            l = null;
        }
        hashMap.put("invitee_id", String.valueOf(l));
        C4574547f LIZ2 = C4574547f.LIZ();
        C8657j c8657j = new C8657j();
        c8657j.LIZ(300);
        LinkCrossRoomDataHolder LJII2 = LinkCrossRoomDataHolder.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII2, "");
        LIZ2.LIZ("connection_invite", hashMap, c8657j, LJII2.LJIIIZ(), Room.class);
    }

    @Override // p003X.AbstractC79943HfF
    public final void LIZIZ(int i, C6148ae c6148ae) {
        long j;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), c6148ae}, this, LIZ, false, 3).isSupported && c6148ae != null && c6148ae.LJIIJJI != null && c6148ae.LJIIJJI.linkMap != null) {
            LinkCrossRoomDataHolder.LJII().LJII = i;
            LinkCrossRoomDataHolder.LJII().LJJJLIIL = c6148ae.LIZ;
            Long l = c6148ae.LJIIJJI.linkMap.get("7");
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            this.f26300LJ.LIZ(j, i, c6148ae);
            HashMap hashMap = new HashMap();
            hashMap.put("is_oncemore", "0");
            hashMap.put("invitee_list", "search");
            hashMap.put("is_recommend_list", "0");
            hashMap.put("anchor_connection_type", "apply");
            hashMap.put("connection_type", "manual_link");
            hashMap.put("source", "link_banner");
            C4574547f LIZ2 = C4574547f.LIZ();
            C8657j c8657j = new C8657j();
            c8657j.LIZ(300);
            LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII, "");
            LIZ2.LIZ("connection_invite", hashMap, c8657j, LJII.LJIIIZ(), Room.class);
        }
    }

    public PKRivalsPanelListWidget(C79919Her c79919Her, String str, boolean z) {
        C106862S5w.LIZ(c79919Her, str);
        this.f26300LJ = c79919Her;
        this.LJFF = str;
        this.LJI = z;
    }
}
