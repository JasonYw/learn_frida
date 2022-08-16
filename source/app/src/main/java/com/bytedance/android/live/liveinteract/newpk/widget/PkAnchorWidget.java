package com.bytedance.android.live.liveinteract.newpk.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.api.LinkPKApi;
import com.bytedance.android.live.liveinteract.multianchor.pklaunch.C4566a;
import com.bytedance.android.live.liveinteract.newpk.p379vm.C4688b;
import com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4762ac;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4781u;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.android.livesdk.log.model.C8657j;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.message.model.LinkMicBattleInviteMessage;
import com.bytedance.android.livesdkapi.depend.model.live.BattleRivalTag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import com.heytap.mcssdk.constant.C15151a;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.AbstractC78050Gpo;
import p003X.AbstractC80293Hkt;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C4574547f;
import p003X.C458614Br;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.H3F;
import p003X.HSO;
import p003X.HSP;
import p003X.HSQ;
import p003X.HSS;
import p003X.HSU;
import p003X.HSW;
import p003X.HSX;
import p003X.HTW;
import p003X.IQV;
import p003X.QB4;

/* loaded from: classes3.dex */
public final class PkAnchorWidget extends PkBaseWidget<C4688b> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public C9078n LIZIZ;
    public H3F LIZJ;
    public boolean LIZLLL;
    public HSP LJJIIJ;
    public PkActivityWidget LJJIIJZLJL;

    static {
        Covode.recordClassIndex(28751);
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.PkBaseWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 18).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.PkBaseWidget
    public final Pair<C4688b, Disposable> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (Pair) proxy.result;
        }
        return IQV.LIZ((Function0) new PkAnchorWidget$createPkDataContext$1(this));
    }

    public final void LIZJ() {
        C9078n c9078n;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        HSO hso = this.LJIILLIIL;
        if (hso != null) {
            hso.LIZ(true);
        }
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        if (((IInteractService) service).getPkService().LIZIZ()) {
            C88440Kt0.LIZ(2131584341);
            return;
        }
        LIZLLL().LJJJJLL = true;
        HTW m15721LJ = m15721LJ();
        if (m15721LJ != null) {
            m15721LJ.LIZ();
        }
        HSO hso2 = this.LJIILLIIL;
        if (hso2 != null) {
            hso2.LIZIZ = true;
        }
        C9078n c9078n2 = this.LIZIZ;
        if (c9078n2 != null && c9078n2.LJIILIIL() && (c9078n = this.LIZIZ) != null) {
            c9078n.dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.PkBaseWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        this.LJJIIJ = new HSP(this.LJIILJJIL, true, this.LJIILIIL);
        QB4.LIZ(LIZLLL().LIZ().LIZIZ().subscribe(new HSS(this)), this.LJIIL);
        QB4.LIZ(LIZLLL().LIZIZ().LIZIZ().subscribe(new HSX(this)), this.LJIIL);
        QB4.LIZ(LIZLLL().LIZJ().LIZIZ().subscribe(new HSW(this)), this.LJIIL);
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("data_pk_match_state", 5);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            enableSubWidgetManager();
            this.LJJIIJZLJL = new PkActivityWidget(LIZLLL(), this.LJIILLIIL);
            WidgetManager widgetManager = this.subWidgetManager;
            if (widgetManager != null) {
                widgetManager.load(this.LJJIIJZLJL);
            }
        }
    }

    public final void LIZIZ() {
        HSO hso;
        String str;
        C9078n c9078n;
        int i = 0;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported || this.LJIILIIL.LJJJLZIJ) {
            return;
        }
        this.LJIILIIL.LJJIII = true;
        if (Intrinsics.areEqual(LIZLLL().LJIIIZ.getValue(), AbstractC4256d.C4260d.LIZIZ)) {
            if (this.LJIILIIL.LJJIIZ) {
                i = 11;
            }
            LIZLLL().LIZ(true, i);
        } else {
            if (Intrinsics.areEqual(LIZLLL().LJIIIZ.getValue(), AbstractC4256d.C4259c.LIZIZ) && (hso = this.LJIILLIIL) != null) {
                C4688b LIZLLL = LIZLLL();
                if (!PatchProxy.proxy(new Object[]{LIZLLL}, hso, HSO.LIZ, false, 10).isSupported) {
                    C8657j c8657j = new C8657j();
                    if (LinkCrossRoomDataHolder.LJII().LJIJJLI == 0) {
                        c8657j.LIZ(LinkCrossRoomDataHolder.LJII().LJII);
                    }
                    HashMap hashMap = new HashMap();
                    if (LIZLLL != null) {
                        if (LIZLLL.LJIIIZ().LIZ().booleanValue()) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        hashMap.put("is_with_audience", str);
                        long longValue = LIZLLL.LJIIJ().LIZ().longValue();
                        if (longValue == 0 && LIZLLL.LJIIIZ().LIZ().booleanValue()) {
                            longValue = (System.currentTimeMillis() - LIZLLL.LJIIIIZZ().LIZ().longValue()) / 1000;
                        }
                        hashMap.put("audience_time", String.valueOf(longValue));
                    }
                    C4574547f LIZ2 = C4574547f.LIZ();
                    c8657j.LIZLLL("disconnect");
                    c8657j.LIZ(String.valueOf((System.currentTimeMillis() - LIZLLL.LJJJ) / 1000));
                    LIZ2.LIZ("punish_end", hashMap, c8657j, hso.f6814LJ.LJIIIZ(), Room.class);
                }
            }
            AbstractC4762ac LIZ3 = AbstractC4762ac.LIZ.LIZ();
            if (LIZ3 != null) {
                LIZ3.LIZ("finish_pk");
            }
            C88440Kt0.LIZ(2131584162);
        }
        C9078n c9078n2 = this.LIZIZ;
        if (c9078n2 != null && c9078n2.LJIILIIL() && (c9078n = this.LIZIZ) != null) {
            c9078n.dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.PkBaseWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        AbstractC4781u LIZ2;
        String str;
        int i;
        int i2;
        String str2;
        String str3;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        HSP hsp = this.LJJIIJ;
        if (hsp == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!PatchProxy.proxy(new Object[0], hsp, HSP.LIZ, false, 2).isSupported) {
            C8657j c8657j = new C8657j();
            if (hsp.LIZLLL.LJIIJJI > 0 && hsp.LIZLLL.LJIJJLI == 0) {
                c8657j.LIZ(LinkCrossRoomDataHolder.LJII().LJII);
            }
            if (hsp.LIZJ) {
                HashMap hashMap = new HashMap();
                String str4 = "on";
                if (!AbstractC80293Hkt.f6992aT.LIZ().booleanValue()) {
                    str = "off";
                } else {
                    str = str4;
                }
                hashMap.put("gift_guest_switch_type", str);
                if (LinkCrossRoomDataHolder.LJII().LJJIFFI > 0 && System.currentTimeMillis() - hsp.LIZLLL.LJJIFFI > 0 && System.currentTimeMillis() - hsp.LIZLLL.LJJIFFI < C15151a.f30809f) {
                    c8657j.LIZ(String.valueOf((System.currentTimeMillis() - hsp.LIZLLL.LJJIFFI) / 1000));
                } else {
                    ALogger.m15800e("connection_time_error", LinkCrossRoomDataHolder.LJII().LJJIFFI + " " + System.currentTimeMillis());
                }
                hashMap.put("pk_description", "routine");
                hashMap.put("pk_activity_type", "");
                BattleRivalTag.LIZ(hsp.LIZLLL.LJJJIL, hashMap);
                C4574547f LIZ3 = C4574547f.LIZ();
                String str5 = "room_close";
                c8657j.LIZLLL(str5);
                C8668v c8668v = new C8668v();
                c8668v.LIZIZ("live");
                c8668v.LJFF("other");
                LIZ3.LIZ("connection_over", hashMap, c8657j, c8668v, hsp.LIZLLL.LJIIIZ(), hsp.LIZIZ);
                PkDataContext pkDataContext = (PkDataContext) IQV.LIZ("PkDataContext", PkDataContext.class);
                String str6 = "1";
                if (pkDataContext != null) {
                    if (pkDataContext.LJIIIZ.getValue() instanceof AbstractC4256d.C4260d) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("end_anchor_type", "passive");
                        if (LinkCrossRoomDataHolder.LJII().LJIIJJI > 0 && LinkCrossRoomDataHolder.LJII().LJIJJLI == 0) {
                            c8657j.LIZ(LinkCrossRoomDataHolder.LJII().LJII);
                        }
                        if (pkDataContext.LJIILIIL.getValue() != null) {
                            i = pkDataContext.LJIILIIL.getValue().LIZIZ;
                        } else {
                            i = 0;
                        }
                        if (pkDataContext.LJIILL.getValue() != null) {
                            i2 = pkDataContext.LJIILL.getValue().LIZIZ;
                        } else {
                            i2 = 0;
                        }
                        hashMap2.put("total_diamond", String.valueOf(i + i2));
                        hashMap2.put("invitor_diamond", String.valueOf(i));
                        hashMap2.put("right_user_diamond", String.valueOf(i2));
                        if (!AbstractC80293Hkt.f6991aS.LIZ().booleanValue()) {
                            str4 = "off";
                        }
                        hashMap2.put("gift_guest_switch_type", str4);
                        hashMap2.put("is_cutoff", str6);
                        if (!LinkCrossRoomDataHolder.LJII().LJLIIL) {
                            str2 = "0";
                        } else {
                            str2 = str6;
                        }
                        hashMap2.put("is_transform", str2);
                        hashMap2.put("pk_type", "0");
                        hashMap2.put("pk_anchor_cnt", "2");
                        hashMap2.put("connection_anchor_cnt", "2");
                        hashMap2.put("guest_in", "0");
                        if (!pkDataContext.LJJJI) {
                            str3 = "0";
                        } else {
                            str3 = str6;
                        }
                        hashMap2.put("is_top_smash", str3);
                        hashMap2.put("pk_mode", "normal");
                        if (AbstractC78050Gpo.LIZ() != null) {
                            hashMap2.put("audience_num", String.valueOf(AbstractC78050Gpo.LIZ().LIZIZ()));
                        }
                        if (!pkDataContext.LJI().LIZ().booleanValue()) {
                            str6 = "0";
                        }
                        hashMap2.put("is_with_audience", str6);
                        long longValue = pkDataContext.LJII().LIZ().longValue();
                        if (longValue == 0 && pkDataContext.LJI().LIZ().booleanValue()) {
                            longValue = (System.currentTimeMillis() - pkDataContext.LJIIIIZZ().LIZ().longValue()) / 1000;
                        }
                        hashMap2.put("audience_time", String.valueOf(longValue));
                        BattleRivalTag.LIZ(hsp.LIZLLL.LJJJIL, hashMap2);
                        C4574547f LIZ4 = C4574547f.LIZ();
                        Object[] objArr = new Object[4];
                        C8668v c8668v2 = new C8668v();
                        c8668v2.LIZ("live_detail");
                        c8668v2.LIZIZ("live");
                        c8668v2.LJFF("other");
                        objArr[0] = c8668v2;
                        if (!hsp.LIZLLL.LJJIII) {
                            str5 = "disconnect";
                        }
                        c8657j.LIZLLL(str5);
                        c8657j.LIZ(String.valueOf((System.currentTimeMillis() - pkDataContext.LJJIZ) / 1000));
                        objArr[1] = c8657j;
                        objArr[2] = hsp.LIZLLL.LJIIIZ();
                        objArr[3] = Room.class;
                        LIZ4.LIZ("livesdk_pk_end", hashMap2, objArr);
                    } else if (pkDataContext.LJIIIZ.getValue() instanceof AbstractC4256d.C4259c) {
                        HashMap hashMap3 = new HashMap();
                        if (!pkDataContext.LJIIIZ().LIZ().booleanValue()) {
                            str6 = "0";
                        }
                        hashMap3.put("is_with_audience", str6);
                        long longValue2 = pkDataContext.LJIIJ().LIZ().longValue();
                        if (longValue2 == 0 && pkDataContext.LJIIIZ().LIZ().booleanValue()) {
                            longValue2 = (System.currentTimeMillis() - pkDataContext.LJIIIIZZ().LIZ().longValue()) / 1000;
                        }
                        hashMap3.put("audience_time", String.valueOf(longValue2));
                        C4574547f LIZ5 = C4574547f.LIZ();
                        Object[] objArr2 = new Object[3];
                        if (!hsp.LIZLLL.LJJIII) {
                            str5 = "disconnect";
                        }
                        c8657j.LIZLLL(str5);
                        c8657j.LIZ(String.valueOf((System.currentTimeMillis() - pkDataContext.LJJJ) / 1000));
                        objArr2[0] = c8657j;
                        objArr2[1] = hsp.LIZLLL.LJIIIZ();
                        objArr2[2] = Room.class;
                        LIZ5.LIZ("punish_end", hashMap3, objArr2);
                    }
                }
            }
        }
        super.onDestroy();
        if (!this.LIZLLL && (LIZ2 = C4566a.LIZJ.LIZ()) != null) {
            LIZ2.LIZIZ();
        }
    }

    public final void LIZ(int i) {
        C9078n c9078n;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        HSO hso = this.LJIILLIIL;
        if (hso != null) {
            hso.LIZ(false);
        }
        C4688b LIZLLL = LIZLLL();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, LIZLLL, C4688b.LIZ, false, 9).isSupported && !LIZLLL.LIZLLL && !Intrinsics.areEqual(LIZLLL.LJIIIZ.getValue(), AbstractC4256d.C4257a.LIZIZ)) {
            LIZLLL.LJII.LJJI = true;
            LIZLLL.LJII.LJIJJLI = 0;
            LIZLLL.LIZLLL = true;
            long currentTimeMillis = System.currentTimeMillis();
            QB4.LIZ(((LinkPKApi) C88306Kqq.LIZ().LIZ(LinkPKApi.class)).battleInvite(LIZLLL.LJII.LIZLLL, Intrinsics.areEqual(LIZLLL.LJIIIZ.getValue(), AbstractC4256d.C4258b.LIZIZ), i, "", 0L).compose(C100839PnV.LIZJ()).subscribe(new HSQ(LIZLLL, currentTimeMillis, i), new HSU<>(LIZLLL, currentTimeMillis)), LIZLLL.LJJLIIIJJI);
        }
        C9078n c9078n2 = this.LIZIZ;
        if (c9078n2 != null && c9078n2.LJIILIIL() && (c9078n = this.LIZIZ) != null) {
            c9078n.dismiss();
        }
    }

    public final void LIZ(boolean z, int i) {
        if (PatchProxy.proxy(new Object[]{(byte) 1, Integer.valueOf(i)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        LIZLLL().LIZ(true, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkAnchorWidget(long j, long j2, C458614Br c458614Br) {
        super(j, j2, c458614Br);
        C106862S5w.LIZ(c458614Br);
    }

    public static /* synthetic */ void LIZ(PkAnchorWidget pkAnchorWidget, int i, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{pkAnchorWidget, 0, 1, null}, null, LIZ, true, 8).isSupported) {
            return;
        }
        pkAnchorWidget.LIZ(LinkMicBattleInviteMessage.BattleInviteType.BattleInviteType_Again.ordinal());
    }
}
