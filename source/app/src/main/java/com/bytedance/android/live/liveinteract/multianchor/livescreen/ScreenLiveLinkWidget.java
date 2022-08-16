package com.bytedance.android.live.liveinteract.multianchor.livescreen;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.linkpk.AbstractC4254a;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.chatroom.p340c.C4274a;
import com.bytedance.android.live.liveinteract.multianchor.livescreen.p372a.AbstractC4528a;
import com.bytedance.android.live.liveinteract.multianchor.livescreen.p373b.C4529a;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.multianchor.p368f.C4520a;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v;
import com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q;
import com.bytedance.android.livesdk.chatroom.model.interact.C6173m;
import com.bytedance.android.livesdk.config.C6894cp;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitor;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p1594ss.avframework.livestreamv2.core.Client;
import com.p1594ss.avframework.livestreamv2.core.LiveCore;
import com.p1594ss.avframework.livestreamv2.core.interact.model.Config;
import com.p1594ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.p1594ss.bytertc.engine.RTCEngine;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import p003X.AbstractC416582eC;
import p003X.AbstractC4569445g;
import p003X.AbstractC78050Gpo;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2IN;
import p003X.C2WC;
import p003X.C4574547f;
import p003X.C4580049i;
import p003X.C64868Big;
import p003X.C79199HJx;
import p003X.C79317HOl;
import p003X.C87308Kak;
import p003X.DialogC79361HQd;
import p003X.HMQ;
import p003X.HQ9;
import p003X.HQG;
import p003X.HQI;
import p003X.HQN;
import p003X.HQP;
import p003X.IOU;
import p003X.RunnableC79360HQc;
import p003X.RunnableC79369HQl;

/* loaded from: classes3.dex */
public final class ScreenLiveLinkWidget extends BaseEqualLinkWidget<AnchorLinkUser> implements Observer<KVData>, AbstractC4528a, AbstractC4569445g {
    public static ChangeQuickRedirect LIZIZ;
    public static final int LJIIJJI = SDKMonitor.SDK_VERSION;
    public static final int LJIIL = 0;
    public HQP LIZJ;
    public C4520a LIZLLL;

    /* renamed from: LJ */
    public HQI f26344LJ;
    public HMQ LJFF;
    public long LJII;
    public final AbstractC6070q LJIIJ;
    public long LJIILIIL;
    public DialogC79361HQd LJIILJJIL;
    public Runnable LJIILL;
    public long LJIILLIIL;
    public Disposable LJJIFFI;
    public Configuration LJJII;
    public String LJI = "";
    public String LJIIIIZZ = "";
    public int LJIIIZ = 1;
    public final HQN LJJI = new HQN(this);

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget
    public final int LIZIZ() {
        return 14;
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final void LIZIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZIZ, false, 25).isSupported) {
            return;
        }
        AbstractC416582eC.LIZ(this, th);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final String LJJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 24);
        return proxy.isSupported ? (String) proxy.result : AbstractC416582eC.LIZ(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699385;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "";
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 26).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget
    /* renamed from: LJ */
    public final HQG mo15702LJ() {
        return this.LIZLLL;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget
    public final AbstractC6070q LJFF() {
        return this.LJIIJ;
    }

    static {
        Covode.recordClassIndex(28087);
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 8).isSupported) {
            return;
        }
        LJIIIIZZ();
        LJIIJ();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget, com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    /* renamed from: Z_ */
    public final void mo15698Z_() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 17).isSupported) {
            return;
        }
        super.mo15698Z_();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onPause() {
        C4520a c4520a;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 10).isSupported) {
            return;
        }
        if (this.LJIJJLI && (c4520a = this.LIZLLL) != null) {
            c4520a.LJI();
        }
        super.onPause();
    }

    private void LJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 22).isSupported) {
            return;
        }
        if (this.LJIILJJIL == null) {
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "");
            DialogC79361HQd dialogC79361HQd = new DialogC79361HQd(context);
            dialogC79361HQd.LIZ(new RunnableC79360HQc(this, dialogC79361HQd));
            dialogC79361HQd.LIZIZ(new RunnableC79369HQl(dialogC79361HQd));
            this.LJIILJJIL = dialogC79361HQd;
        }
        DialogC79361HQd dialogC79361HQd2 = this.LJIILJJIL;
        if (dialogC79361HQd2 != null && !dialogC79361HQd2.isShowing()) {
            C116971W2r.LIZJ(dialogC79361HQd2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String LIZLLL() {
        /*
            r8 = this;
            r3 = 0
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.multianchor.livescreen.ScreenLiveLinkWidget.LIZIZ
            r0 = 6
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r8, r1, r3, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L13
            java.lang.Object r0 = r1.result
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L13:
            com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder r0 = com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder.LJII()
            boolean r0 = r0.LJIIJ
            if (r0 == 0) goto L56
            com.bytedance.android.live.liveinteract.multianchor.f.a r1 = r8.LIZLLL
            r0 = 0
            if (r1 == 0) goto L55
            java.util.List r1 = r1.LJIIJ()
            if (r1 == 0) goto L55
            java.util.Iterator r7 = r1.iterator()
        L2a:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L55
            java.lang.Object r6 = r7.next()
            com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser r6 = (com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser) r6
            com.bytedance.android.live.base.model.user.User r1 = r6.LIZ()
            if (r1 == 0) goto L4b
            long r4 = r1.getId()
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r8.LJIIIZ()
            long r2 = r1.ownerUserId
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L4b
            goto L2a
        L4b:
            com.bytedance.android.live.liveinteract.multianchor.model.ListUserContent r1 = r6.LJIJI
            if (r1 == 0) goto L55
            com.bytedance.android.live.liveinteract.multianchor.model.ListUserLinkmicContent r1 = r1.LIZJ
            if (r1 == 0) goto L55
            java.lang.String r0 = r1.f26351LJ
        L55:
            return r0
        L56:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r8.LJIIIZ()
            com.bytedance.android.livesdkapi.depend.model.live.GameCategoryInfo r0 = r0.gameCategoryInfo
            java.lang.String r0 = r0.LIZIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multianchor.livescreen.ScreenLiveLinkWidget.LIZLLL():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String LJI() {
        /*
            r8 = this;
            r3 = 0
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.multianchor.livescreen.ScreenLiveLinkWidget.LIZIZ
            r0 = 7
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r8, r1, r3, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L13
            java.lang.Object r0 = r1.result
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L13:
            com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder r0 = com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder.LJII()
            boolean r0 = r0.LJIIJ
            if (r0 == 0) goto L24
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r8.LJIIIZ()
            com.bytedance.android.livesdkapi.depend.model.live.GameCategoryInfo r0 = r0.gameCategoryInfo
            java.lang.String r0 = r0.LIZIZ
            return r0
        L24:
            com.bytedance.android.live.liveinteract.multianchor.f.a r1 = r8.LIZLLL
            r0 = 0
            if (r1 == 0) goto L5e
            java.util.List r1 = r1.LJIIJ()
            if (r1 == 0) goto L5e
            java.util.Iterator r7 = r1.iterator()
        L33:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r6 = r7.next()
            com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser r6 = (com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser) r6
            com.bytedance.android.live.base.model.user.User r1 = r6.LIZ()
            if (r1 == 0) goto L54
            long r4 = r1.getId()
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r8.LJIIIZ()
            long r2 = r1.ownerUserId
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L54
            goto L33
        L54:
            com.bytedance.android.live.liveinteract.multianchor.model.ListUserContent r1 = r6.LJIJI
            if (r1 == 0) goto L5e
            com.bytedance.android.live.liveinteract.multianchor.model.ListUserLinkmicContent r1 = r1.LIZJ
            if (r1 == 0) goto L5e
            java.lang.String r0 = r1.f26351LJ
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multianchor.livescreen.ScreenLiveLinkWidget.LJI():java.lang.String");
    }

    private final void LJIIIIZZ() {
        int i;
        List<AnchorLinkUser> LIZLLL;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 9).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("channel_id", String.valueOf(LinkCrossRoomDataHolder.LJII().LIZLLL));
        hashMap.put("room_status", "connection");
        C4520a c4520a = this.LIZLLL;
        if (c4520a != null && (LIZLLL = c4520a.LIZLLL()) != null) {
            i = LIZLLL.size();
        } else {
            i = 0;
        }
        hashMap.put("anchor_cnt", String.valueOf(i));
        C4574547f.LIZ().LIZ("livesdk_interact_icon_click", hashMap, LJIIIZ());
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        C4520a c4520a;
        String str;
        String str2;
        String str3;
        MethodCollector.m14708i(1914);
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 12).isSupported) {
            MethodCollector.m14707o(1914);
            return;
        }
        super.onDestroy();
        C4520a c4520a2 = this.LIZLLL;
        if (c4520a2 != null) {
            c4520a2.LJIIJJI();
        }
        Disposable disposable = this.LJJIFFI;
        if (disposable != null) {
            disposable.dispose();
        }
        C79199HJx c79199HJx = this.LJIJJ;
        if (c79199HJx != null && c79199HJx.LJIIIIZZ) {
            c79199HJx.LJIIIIZZ();
        }
        if (!this.LJIL) {
            BaseEqualLinkWidget.LIZ(this, "unusual_leave", false, 2, null);
        }
        if (this.LJJ.mo15779LJ() > 0 && this.LJIJJLI) {
            HashMap hashMap = new HashMap();
            C5923dp LIZ = C5923dp.LJIIJ.LIZ(this.dataCenter, 0L);
            if (LIZ != null) {
                str = LIZ.LLFF().LIZ();
            } else {
                str = "connection_panel";
            }
            hashMap.put("enter_from", str);
            long currentTimeMillis = (System.currentTimeMillis() - this.LJIILIIL) / 1000;
            C4520a c4520a3 = this.LIZLLL;
            if (c4520a3 != null) {
                Intrinsics.checkNotNull(c4520a3);
                hashMap.put("anchor_connect_status", String.valueOf(c4520a3.LJIIL()));
            }
            hashMap.put("diamond", String.valueOf(LinkCrossRoomDataHolder.LJII().LJJLJLI));
            hashMap.put("connection_time", String.valueOf(currentTimeMillis));
            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f6992aT;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            Boolean LIZ2 = c87308Kak.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            if (LIZ2.booleanValue()) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            hashMap.put("gift_guest_switch_type", str2);
            hashMap.put("end_type", "room_close");
            hashMap.put("pk_id", String.valueOf(LinkCrossRoomDataHolder.LJII().f26249LJ));
            if (LinkCrossRoomDataHolder.LJII().LJJIIJZLJL) {
                str3 = C64868Big.LIZLLL;
            } else {
                str3 = "passive";
            }
            hashMap.put("end_reason", str3);
            hashMap.put("connection_anchor_cnt", String.valueOf(this.LJIIIZ));
            C4574547f LIZ3 = C4574547f.LIZ();
            C8668v c8668v = new C8668v();
            c8668v.LIZIZ("live");
            c8668v.LJFF("other");
            LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII, "");
            LIZ3.LIZ("connection_over", hashMap, c8668v, LJII.LJIIIIZZ(), Room.class);
        }
        HMQ hmq = this.LJFF;
        if (hmq == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hmq.LIZJ();
        if (!this.LJIJJLI) {
            if (this.LJIILLIIL != 0) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("watch_connection_duration", String.valueOf((System.currentTimeMillis() - this.LJIILLIIL) / 1000));
                hashMap2.put("connection_type", "anchor");
                hashMap2.put("anchor_cnt", String.valueOf(this.LJIIIZ));
                hashMap2.put("anchor_connect_status", String.valueOf(this.LJIIIZ));
                C4574547f LIZ4 = C4574547f.LIZ();
                LinkCrossRoomDataHolder LJII2 = LinkCrossRoomDataHolder.LJII();
                Intrinsics.checkNotNullExpressionValue(LJII2, "");
                LIZ4.LIZ("livesdk_connection_watch_duration", hashMap2, LJII2.LJIIIZ(), Room.class);
            }
            LinkCrossRoomDataHolder.LJII().LJI();
        }
        if (this.LJJ.mo15779LJ() == 0 && (c4520a = this.LIZLLL) != null) {
            c4520a.LJFF();
        }
        C4520a c4520a4 = this.LIZLLL;
        if (c4520a4 != null) {
            c4520a4.LIZIZ(this.LJJI);
        }
        HQI hqi = this.f26344LJ;
        if (hqi != null && !PatchProxy.proxy(new Object[0], hqi, HQI.LIZ, false, 14).isSupported) {
            hqi.f6798LJ.put("data_first_frame_sei", "");
            hqi.LIZIZ.clear();
            hqi.LIZLLL.removeAllViews();
            LinkCrossRoomDataHolder.LJII().LJJLIL = null;
            hqi.f6798LJ.put("cmd_interact_player_view_change", new C4274a(false, 0));
        }
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("cmd_update_sticker_visible", Boolean.TRUE);
        }
        DataCenter dataCenter2 = this.dataCenter;
        if (dataCenter2 != null) {
            dataCenter2.removeObserver(this);
            MethodCollector.m14707o(1914);
            return;
        }
        MethodCollector.m14707o(1914);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        C4520a c4520a;
        String str;
        C2WC<Room> LIZ;
        Room LIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 5).isSupported) {
            return;
        }
        super.onCreate();
        this.LJFF = new HMQ();
        HMQ hmq = this.LJFF;
        if (hmq == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hmq.LIZ((AbstractC4528a) this);
        HQ9 hq9 = this.LJIJI;
        if (hq9 != null) {
            hq9.LIZ(this.LJJ.mo15779LJ(), 0);
        }
        AbstractC4782v LIZ3 = AbstractC4782v.LJIIL.LIZ();
        Object obj = null;
        if (LIZ3 != null) {
            c4520a = LIZ3.LJFF();
        } else {
            c4520a = null;
        }
        this.LIZLLL = c4520a;
        C4520a c4520a2 = this.LIZLLL;
        if (c4520a2 != null) {
            c4520a2.LIZ(this.LJJI);
        }
        this.dataCenter.observe("data_pk_renderview_width", this);
        this.LIZJ = new HQP(this.LJJ.LIZIZ());
        View view = this.contentView;
        if (view != null) {
            DataCenter dataCenter = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter, "");
            this.f26344LJ = new HQI((RelativeLayout) view, dataCenter, this.LIZLLL, this.LJIJJLI, this);
            HQI hqi = this.f26344LJ;
            if (hqi != null && !PatchProxy.proxy(new Object[0], hqi, HQI.LIZ, false, 1).isSupported) {
                hqi.LIZJ = (Room) hqi.f6798LJ.get("data_room", (String) new Room());
                DataCenter dataCenter2 = hqi.f6798LJ;
                if (dataCenter2 != null) {
                    obj = dataCenter2.get("data_first_frame_sei", "");
                }
                if (obj instanceof String) {
                    SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_PK_LOAD_OPT_ENABLE;
                    Intrinsics.checkNotNullExpressionValue(settingKey, "");
                    Boolean value = settingKey.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "");
                    if (value.booleanValue()) {
                        String str2 = (String) obj;
                        if (!TextUtils.isEmpty(str2)) {
                            hqi.LIZ(str2);
                        }
                    }
                }
                if (C4580049i.LIZIZ && C4580049i.LIZJ && !hqi.LJI && C4580049i.LIZIZ()) {
                    UIUtils.updateLayoutMargin(hqi.LIZLLL, -3, -C4580049i.LIZ(hqi.LIZLLL.getContext()), -3, -3);
                }
            }
            HQI hqi2 = this.f26344LJ;
            if (hqi2 != null && !TextUtils.isEmpty(this.LJI)) {
                hqi2.LIZ(this.LJI);
            }
            if (!this.LJIJJLI) {
                C4520a c4520a3 = this.LIZLLL;
                if (c4520a3 != null) {
                    c4520a3.LIZ(2, "multi_anchor_link_widget_create");
                }
                C4520a c4520a4 = this.LIZLLL;
                if (c4520a4 != null) {
                    c4520a4.LJIIL();
                }
                this.LJIILLIIL = System.currentTimeMillis();
            } else {
                HQI hqi3 = this.f26344LJ;
                if (hqi3 != null) {
                    hqi3.LIZ(this.LJJ.LIZIZ(), true);
                }
                this.LJIILIIL = System.currentTimeMillis();
                HashMap hashMap = new HashMap();
                C5923dp LIZ4 = C5923dp.LJIIJ.LIZ(this.dataCenter, 0L);
                if (LIZ4 != null) {
                    str = LIZ4.LLFF().LIZ();
                } else {
                    str = "connection_panel";
                }
                hashMap.put("enter_from", str);
                C4520a c4520a5 = this.LIZLLL;
                if (c4520a5 != null) {
                    int LJIIL2 = c4520a5.LJIIL() + 1;
                    hashMap.put("anchor_connect_status", String.valueOf(LJIIL2));
                    hashMap.put("connection_anchor_cnt", String.valueOf(LJIIL2));
                }
                hashMap.put("invitee_id", String.valueOf(LinkCrossRoomDataHolder.LJII().LJJJLIIL));
                hashMap.put("invitee_list", LinkCrossRoomDataHolder.LJII().LJJJLL);
                hashMap.put("channel_id", String.valueOf(LinkCrossRoomDataHolder.LJII().LIZLLL));
                hashMap.put("anchor_connection_type", LinkCrossRoomDataHolder.LJII().LJJLJ);
                IService service = ServiceManager.getService(IInteractService.class);
                Intrinsics.checkNotNullExpressionValue(service, "");
                hashMap.put("connection_type", ((IInteractService) service).getLinkConnectionType());
                hashMap.put("is_game_room", "yes");
                hashMap.put("inviter_game_name", LJI());
                hashMap.put("invitee_game_name", LIZLLL());
                hashMap.put("is_transform", "0");
                hashMap.put("from_room_status", "live");
                if (LIZ4 != null && (LIZ = LIZ4.LIZ()) != null && (LIZ2 = LIZ.LIZ()) != null) {
                    hashMap.put("audience_num", String.valueOf(LIZ2.getUserCount()));
                }
                C4574547f LIZ5 = C4574547f.LIZ();
                LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
                Intrinsics.checkNotNullExpressionValue(LJII, "");
                LIZ5.LIZ("livesdk_connection_success", hashMap, LJII.LJIIIIZZ(), Room.class, C8668v.class);
                LinkCrossRoomDataHolder.LJII().LJJIIJZLJL = false;
            }
            DataCenter dataCenter3 = this.dataCenter;
            if (dataCenter3 != null) {
                dataCenter3.put("cmd_update_sticker_visible", Boolean.FALSE);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 13).isSupported) {
            return;
        }
        this.LJI = str;
        HQI hqi = this.f26344LJ;
        if (hqi != null) {
            hqi.LIZ(str);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.proxy(new Object[]{configuration}, this, LIZIZ, false, 11).isSupported) {
            return;
        }
        super.onConfigurationChanged(configuration);
        this.LJJII = configuration;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget
    public final void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 21).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        DialogC79361HQd dialogC79361HQd = this.LJIILJJIL;
        if (dialogC79361HQd != null && dialogC79361HQd.isShowing()) {
            C116971W2r.LIZ(dialogC79361HQd);
        }
        AbstractC4774i LIZ = AbstractC78050Gpo.LIZ();
        if (LIZ != null) {
            LIZ.LIZLLL(128);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZIZ, false, 4).isSupported && kVData2 != null) {
            String key = kVData2.getKey();
            if (key.hashCode() == 1797384049) {
                key.equals("data_pk_renderview_width");
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.AbstractC4585d
    public final void LIZ(InteractConfig interactConfig) {
        String str;
        Config.VideoQuality videoQuality;
        LiveCore liveCore;
        if (PatchProxy.proxy(new Object[]{interactConfig}, this, LIZIZ, false, 14).isSupported) {
            return;
        }
        HQP hqp = this.LIZJ;
        if (hqp != null) {
            hqp.LIZJ = interactConfig;
        }
        interactConfig.setStreamMixer(this.LIZJ);
        interactConfig.setBackgroundColor("#1F212C");
        StreamUrl streamUrl = LJIIIZ().getStreamUrl();
        LiveCore.Builder builder = null;
        if (streamUrl != null) {
            str = streamUrl.LIZ();
        } else {
            str = null;
        }
        interactConfig.setMixStreamRtmpUrl(str);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 16);
        if (proxy.isSupported) {
            videoQuality = (Config.VideoQuality) proxy.result;
        } else {
            videoQuality = new Config.VideoQuality(272, 480, 15, 500);
        }
        interactConfig.setVideoQuality(videoQuality);
        interactConfig.setCharacter(Config.Character.ANCHOR);
        interactConfig.setSeiVersion(14);
        interactConfig.setType(Config.Type.VIDEO);
        interactConfig.setInteractMode(Config.InteractMode.GAME_AUDIO);
        interactConfig.setVolumeCallbackInterval(300);
        C79199HJx c79199HJx = this.LJIJJ;
        if (c79199HJx != null && (liveCore = c79199HJx.LIZJ) != null) {
            builder = liveCore.getBuilder();
        }
        if (builder != null) {
            interactConfig.setVideoQuality(new Config.VideoQuality(builder.getVideoWidth(), builder.getVideoHeight(), builder.getVideoFps(), builder.getVideoBitrate() / 1000));
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.ANCHOR_SEI_UPDATE_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            interactConfig.setUpdateTalkSeiAB(true);
            interactConfig.setUpdateTalkSeiInterval(1000);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZIZ(String str) {
        RTCEngine rtcEngine;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (!TextUtils.isEmpty(str)) {
            C79199HJx c79199HJx = this.LJIJJ;
            if (c79199HJx != null && !PatchProxy.proxy(new Object[]{str, (byte) 1}, c79199HJx, C79199HJx.LIZ, false, 22).isSupported) {
                C106862S5w.LIZ(str);
                Client client = c79199HJx.LIZIZ;
                if (client != null) {
                    client.muteRemoteVideoStream(str, true);
                }
            }
            HQI hqi = this.f26344LJ;
            if (hqi != null) {
                hqi.LIZ(str, false);
            }
            SettingKey<C6894cp> settingKey = LiveConfigSettingKeys.LIVE_SCREENCAST_LINK_MIC_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            int min = Math.min(Math.max(settingKey.getValue().LIZIZ, LJIIL), LJIIJJI);
            C79199HJx c79199HJx2 = this.LJIJJ;
            if (c79199HJx2 != null && !PatchProxy.proxy(new Object[]{str, Integer.valueOf(min)}, c79199HJx2, C79199HJx.LIZ, false, 24).isSupported) {
                C106862S5w.LIZ(str);
                Client client2 = c79199HJx2.LIZIZ;
                if (client2 != null && (rtcEngine = client2.getRtcEngine()) != null) {
                    rtcEngine.setRemoteAudioPlaybackVolume(str, min);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenLiveLinkWidget(AbstractC6070q abstractC6070q, AbstractC4254a abstractC4254a) {
        super(abstractC4254a);
        C106862S5w.LIZ(abstractC4254a);
        this.LJIIJ = abstractC6070q;
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.livescreen.p372a.AbstractC4528a
    public final void LIZ(Runnable runnable, String str) {
        if (PatchProxy.proxy(new Object[]{runnable, str}, this, LIZIZ, false, 19).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (this.LJIJJLI && this.LJJ.mo15779LJ() > 0) {
            this.LJIILL = runnable;
            BaseEqualLinkWidget.LIZ(this, str, false, 2, null);
            this.LJII = this.LJJ.mo15779LJ();
            String str2 = LinkCrossRoomDataHolder.LJII().LJJJLL;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            this.LJIIIIZZ = str2;
            return;
        }
        AbstractC4774i LIZ = AbstractC78050Gpo.LIZ();
        if (LIZ != null) {
            LIZ.LIZLLL(128);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4769b
    public final void LIZ(C5176i<C6173m> c5176i, boolean z) {
        String str;
        String str2;
        String str3;
        Integer num;
        if (PatchProxy.proxy(new Object[]{c5176i, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 23).isSupported) {
            return;
        }
        long currentTimeMillis = (System.currentTimeMillis() - this.LJIILIIL) / 1000;
        HashMap hashMap = new HashMap();
        C5923dp LIZ = C5923dp.LJIIJ.LIZ(this.dataCenter, 0L);
        if (LIZ != null) {
            str = LIZ.LLFF().LIZ();
        } else {
            str = "connection_panel";
        }
        hashMap.put("enter_from", str);
        if (AbstractC4782v.LJIIL.LIZ() != null) {
            C4520a c4520a = this.LIZLLL;
            if (c4520a != null) {
                num = Integer.valueOf(c4520a.LJIIL());
            } else {
                num = null;
            }
            hashMap.put("anchor_connect_status", String.valueOf(num));
        }
        hashMap.put("channel_id", String.valueOf(this.LJII));
        hashMap.put("connection_time", String.valueOf(currentTimeMillis));
        C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f6992aT;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Boolean LIZ2 = c87308Kak.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        if (LIZ2.booleanValue()) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        hashMap.put("gift_guest_switch_type", str2);
        hashMap.put("diamond", String.valueOf(LinkCrossRoomDataHolder.LJII().LJJLJLI));
        hashMap.put("end_type", "disconnect");
        hashMap.put("invitee_list", this.LJIIIIZZ);
        if (LinkCrossRoomDataHolder.LJII().LJJIIJZLJL) {
            str3 = C64868Big.LIZLLL;
        } else {
            str3 = "passive";
        }
        hashMap.put("end_reason", str3);
        hashMap.put("connection_anchor_cnt", String.valueOf(this.LJIIIZ));
        hashMap.put("is_npk", "0");
        hashMap.put("pk_cnt", "0");
        hashMap.put("pk_n_cnt", "0");
        hashMap.put("room_status", "connection");
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        hashMap.put("connection_type", ((IInteractService) service).getLinkConnectionType());
        hashMap.put("is_game_room", "yes");
        hashMap.put("inviter_game_name", LJI());
        hashMap.put("invitee_game_name", LIZLLL());
        C4574547f LIZ3 = C4574547f.LIZ();
        LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        LIZ3.LIZ("livesdk_connection_over", hashMap, LJII.LJIIIIZZ(), Room.class);
        this.LJJ.LJI();
        Runnable runnable = this.LJIILL;
        if (runnable != null) {
            runnable.run();
        }
        this.LJIILL = null;
        super.LIZ(c5176i, z);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget, com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZ(String str, long j) {
        String str2;
        AnchorLinkUser LIZ;
        AbstractC4782v LIZ2;
        C79317HOl LIZJ;
        if (PatchProxy.proxy(new Object[]{str, new Long(j)}, this, LIZIZ, false, 18).isSupported) {
            return;
        }
        super.LIZ(str, j);
        if (j != 0) {
            str2 = "rtc_offline_callback_1";
        } else {
            str2 = "rtc_offline_callback_0";
        }
        try {
            HQI hqi = this.f26344LJ;
            if (hqi != null && !PatchProxy.proxy(new Object[]{str}, hqi, HQI.LIZ, false, 4).isSupported) {
                ALogger.m15797i("ttlive_anchor", "onUserLeave interactId=" + str + ", current windows size " + hqi.LIZIZ.size());
                C4529a LIZ3 = hqi.LIZ(0L, str);
                ArrayList<C4529a> arrayList = hqi.LIZIZ;
                if (arrayList != null) {
                    TypeIntrinsics.asMutableCollection(arrayList).remove(LIZ3);
                    hqi.LIZ();
                    hqi.LIZJ();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                }
            }
            C4520a c4520a = this.LIZLLL;
            if (c4520a != null && (LIZ = c4520a.LIZ(0L, str)) != null && (LIZ2 = AbstractC4782v.LJIIL.LIZ()) != null && (LIZJ = LIZ2.LIZJ()) != null) {
                long mo15779LJ = this.LJJ.mo15779LJ();
                User LIZ4 = LIZ.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                long id = LIZ4.getId();
                User LIZ5 = LIZ.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                LIZJ.LIZ(mo15779LJ, id, LIZ5.getSecUid(), str2);
            }
        } catch (Exception e) {
            C2IN.LIZIZ().LIZ("ttlive_anchor", e);
        }
        DialogC79361HQd dialogC79361HQd = this.LJIILJJIL;
        if (dialogC79361HQd != null && dialogC79361HQd.isShowing()) {
            DialogC79361HQd dialogC79361HQd2 = this.LJIILJJIL;
            if (dialogC79361HQd2 != null) {
                C116971W2r.LIZ(dialogC79361HQd2);
            }
            this.LJIILJJIL = null;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget, com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZ(String[] strArr, boolean[] zArr, int[] iArr) {
        int i;
        if (PatchProxy.proxy(new Object[]{strArr, zArr, iArr}, this, LIZIZ, false, 20).isSupported) {
            return;
        }
        super.LIZ(strArr, zArr, iArr);
        if (strArr == null || iArr == null || strArr.length != iArr.length) {
            return;
        }
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (zArr != null && zArr[i2]) {
                i = iArr[i2];
            } else {
                i = 0;
            }
            HQI hqi = this.f26344LJ;
            if (hqi != null) {
                String str = strArr[i2];
                int LIZ = IOU.LIZ(i, true);
                if (!PatchProxy.proxy(new Object[]{str, Integer.valueOf(LIZ)}, hqi, HQI.LIZ, false, 15).isSupported) {
                    C106862S5w.LIZ(str);
                    C4529a LIZ2 = hqi.LIZ(0L, str);
                    if (LIZ2 != null) {
                        LIZ2.LIZ(LIZ);
                    }
                }
            }
            HQP hqp = this.LIZJ;
            if (hqp != null) {
                String str2 = strArr[i2];
                int LIZ3 = IOU.LIZ(i, true);
                if (!PatchProxy.proxy(new Object[]{str2, Integer.valueOf(LIZ3)}, hqp, HQP.LIZ, false, 2).isSupported) {
                    C106862S5w.LIZ(str2);
                    hqp.LIZIZ.put(str2, Integer.valueOf(LIZ3));
                }
            }
        }
    }
}
