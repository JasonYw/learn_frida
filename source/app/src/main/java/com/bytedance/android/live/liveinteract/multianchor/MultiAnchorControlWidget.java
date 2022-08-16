package com.bytedance.android.live.liveinteract.multianchor;

import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.exception.ApiException;
import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.tetris.widgets.LiveWidget;
import com.bytedance.android.live.linkpk.AbstractC4254a;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.p338b.d$a;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.multianchor.p367e.C4518a;
import com.bytedance.android.live.liveinteract.multianchor.p368f.C4520a;
import com.bytedance.android.live.liveinteract.multianchor.presenter.AbstractC4567h;
import com.bytedance.android.live.liveinteract.plantform.api.LinkAnchorApi;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.live.liveinteract.plantform.core.AbstractC4800l;
import com.bytedance.android.live.liveinteract.plantform.model.C4809b;
import com.bytedance.android.live.liveinteract.plantform.model.C4810d;
import com.bytedance.android.live.liveinteract.plantform.model.C4811e;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v;
import com.bytedance.android.live.liveinteract.plantform.p385a.c$a;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.interact.model.C6068x;
import com.bytedance.android.livesdk.chatroom.model.interact.C6175o;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.message.model.AbstractC9021r;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.android.livesdkapi.depend.live.ILiveRoomService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9533c;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9545r;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9553z;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.live.datacontext.C13491f;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.p1594ss.ttm.player.MediaPlayer;
import io.reactivex.disposables.Disposable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC416582eC;
import p003X.AbstractC4569445g;
import p003X.AbstractC78050Gpo;
import p003X.AbstractC79343HPl;
import p003X.AbstractC79344HPm;
import p003X.AbstractC79346HPo;
import p003X.AbstractC90419Ljp;
import p003X.C106862S5w;
import p003X.C2IN;
import p003X.C2WC;
import p003X.C3810917n;
import p003X.C439993ar;
import p003X.C440943cO;
import p003X.C4574547f;
import p003X.C79112HGo;
import p003X.C79169HIt;
import p003X.C79220HKs;
import p003X.C79284HNe;
import p003X.C79313HOh;
import p003X.C79314HOi;
import p003X.C79315HOj;
import p003X.C79317HOl;
import p003X.C79339HPh;
import p003X.C79340HPi;
import p003X.C79345HPn;
import p003X.C79352HPu;
import p003X.C79353HPv;
import p003X.C79413HSd;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.HNG;
import p003X.HNI;
import p003X.HP0;
import p003X.HP6;
import p003X.HPG;
import p003X.HPZ;
import p003X.IQM;
import p003X.IQV;
import p003X.IQX;
import p003X.KDS;
import p003X.LK5;
import p003X.View$OnClickListenerC79301HNv;

/* loaded from: classes3.dex */
public final class MultiAnchorControlWidget extends LiveWidget implements AbstractC79343HPl, AbstractC4567h, AbstractC4782v, AbstractC79344HPm, AbstractC4800l, AbstractC79346HPo, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public C79317HOl LIZIZ;
    public C79317HOl LIZJ;
    public Disposable LIZLLL;

    /* renamed from: LJ */
    public boolean f26338LJ;
    public Room LJFF;
    public C4520a LJI;
    public C4520a LJII;
    public HNI LJIIIIZZ;
    public C79220HKs LJIIJ;
    public C79340HPi LJIILL;
    public final C79314HOi LJIILIIL = new C79314HOi();
    public LinkCrossRoomDataHolder LJIIIZ = LinkCrossRoomDataHolder.LJII();
    public C4518a LJIILJJIL = new C4518a(null, 0, null, false, false, false, 0, null, null, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME);
    public c$a LJIIJJI = new HPG(this);

    static {
        Covode.recordClassIndex(27815);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4800l
    public final void LIZ(int i, int i2) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4800l
    public final void LIZ(int i, int i2, int i3, String str, Room room) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, room}, this, LIZ, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, room);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final void LIZIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 58).isSupported) {
            return;
        }
        AbstractC416582eC.LIZ(this, th);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final String LJJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 57);
        return proxy.isSupported ? (String) proxy.result : AbstractC416582eC.LIZ(this);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a207";
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 59).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v
    public final C4518a LIZ() {
        return this.LJIILJJIL;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v
    public final C79317HOl LIZLLL() {
        return this.LIZJ;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v
    public final C4520a LJFF() {
        return this.LJII;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4800l
    public final void LIZ(int i, Room room, C6068x c6068x, int i2, long j, int i3, HPZ hpz) {
        C4520a LIZJ;
        User owner;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), room, c6068x, Integer.valueOf(i2), new Long(j), Integer.valueOf(i3), hpz}, this, LIZ, false, 18).isSupported) {
            return;
        }
        C106862S5w.LIZ(room, c6068x, hpz);
        C79313HOh c79313HOh = C79313HOh.f6779LJ;
        long currentTimeMillis = System.currentTimeMillis() - j;
        long j2 = this.LJIIIZ.LIZLLL;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), room, c6068x, Integer.valueOf(i2), Integer.valueOf(i3), new Long(currentTimeMillis), hpz, new Long(j2)}, c79313HOh, C79313HOh.LIZLLL, false, 20).isSupported) {
            C106862S5w.LIZ(room, c6068x, hpz);
            JSONObject jSONObject = new JSONObject();
            C440943cO.LIZ(jSONObject, "target_room", room.getId());
            C440943cO.LIZ(jSONObject, "invite_type", i2);
            C440943cO.LIZ(jSONObject, "match_type", hpz.LIZIZ);
            C440943cO.LIZ(jSONObject, "invite_source", hpz.LIZLLL);
            C440943cO.LIZ(jSONObject, "req_scene", i);
            C440943cO.LIZ(jSONObject, "request_type", i3);
            C440943cO.LIZ(jSONObject, "invite_channel_id", c6068x.LIZ);
            if (j2 == 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String jSONObject2 = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
                linkedHashMap.put("extra_str", jSONObject2);
                HNG.LIZ("anchor_invite_success_invalid_channel_id", (Map<String, Object>) linkedHashMap, (AbstractC4254a) LinkCrossRoomDataHolder.LJII(), false);
            }
            c79313HOh.LIZ("anchor_invite_success", currentTimeMillis, jSONObject);
        }
        if (this.LJIIIZ.LIZLLL <= 0) {
            return;
        }
        if (c6068x.LIZJ == 2 && (owner = room.getOwner()) != null) {
            C88440Kt0.LIZ(LK5.LIZ(2131581952, owner.getNickName()));
        }
        User owner2 = room.getOwner();
        if (owner2 != null && (LIZJ = LIZJ(i)) != null) {
            LIZJ.LIZ(owner2);
        }
        if (hpz.LIZ()) {
            ALogger.m15800e("ttlive_anchor_link", "inviteMultiAnchor success " + hpz);
        } else if (i != 14) {
        } else {
            this.LJIIIZ.LJIIJ = true;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4800l
    public final void LIZ(int i, Room room, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), room, Integer.valueOf(i2)}, this, LIZ, false, 19).isSupported) {
            return;
        }
        C106862S5w.LIZ(room);
        C79313HOh c79313HOh = C79313HOh.f6779LJ;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), room}, c79313HOh, C79313HOh.LIZLLL, false, 18).isSupported) {
            return;
        }
        C106862S5w.LIZ(room);
        JSONObject jSONObject = new JSONObject();
        C440943cO.LIZ(jSONObject, "req_scene", i);
        C440943cO.LIZ(jSONObject, "target_room", room.getId());
        c79313HOh.LIZ("anchor_apply_success", jSONObject);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4800l
    public final void LIZ(int i, Throwable th, long j, HPZ hpz) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), th, new Long(j), hpz}, this, LIZ, false, 20).isSupported) {
            return;
        }
        C106862S5w.LIZ(hpz);
        C79313HOh.f6779LJ.LIZ(i, hpz, th, System.currentTimeMillis() - j);
        if ((!(th instanceof ApiServerException) ? null : th) == null) {
            return;
        }
        int i2 = ((ApiException) th).mErrorCode;
        if (i2 == 31012) {
            ((KDS) ((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).getLatestBanRecord(14L).m149as(autoDisposeWithTransformer())).LIZ(new C79284HNe(new WeakReference(getContext())), C3810917n.LIZ);
        } else if (i2 == 4004129) {
            HashMap hashMap = new HashMap();
            hashMap.put("connection_type", "anchor");
            hashMap.put("control_user", "inviter");
            C4574547f.LIZ().LIZ("livesdk_connection_anchor_control_toast_show", hashMap, Room.class, C8668v.class);
        } else if (i2 != 4004130) {
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("connection_type", "anchor");
            hashMap2.put("control_user", "invitee");
            C4574547f.LIZ().LIZ("livesdk_connection_anchor_control_toast_show", hashMap2, Room.class, C8668v.class);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4800l
    public final void LIZ(int i, Throwable th) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), th}, this, LIZ, false, 21).isSupported) {
            return;
        }
        C79313HOh c79313HOh = C79313HOh.f6779LJ;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), th}, c79313HOh, C79313HOh.LIZLLL, false, 19).isSupported) {
            JSONObject jSONObject = new JSONObject();
            C440943cO.LIZ(jSONObject, "req_scene", i);
            C79313HOh.LIZ(c79313HOh, "anchor_apply_failed", th, jSONObject, null, 8, null);
        }
        ApiServerException apiServerException = (ApiServerException) (!(th instanceof ApiServerException) ? null : th);
        if (apiServerException == null) {
            return;
        }
        int i2 = ((ApiException) th).mErrorCode;
        if (i2 == 4004129) {
            HashMap hashMap = new HashMap();
            hashMap.put("connection_type", "anchor");
            hashMap.put("control_user", "inviter");
            C4574547f.LIZ().LIZ("livesdk_connection_anchor_control_toast_show", hashMap, Room.class, C8668v.class);
        } else if (i2 == 4004130) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("connection_type", "anchor");
            hashMap2.put("control_user", "invitee");
            C4574547f.LIZ().LIZ("livesdk_connection_anchor_control_toast_show", hashMap2, Room.class, C8668v.class);
        }
        C88440Kt0.LIZ(apiServerException.mPrompt);
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x0285, code lost:
        if (r0 == false) goto L161;
     */
    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4800l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(int r27, com.bytedance.android.livesdk.message.model.C8874fl r28) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multianchor.MultiAnchorControlWidget.LIZ(int, com.bytedance.android.livesdk.message.model.fl):void");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4800l
    public final void LIZ(int i, Throwable th, long j, C4811e c4811e) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), th, new Long(j), c4811e}, this, LIZ, false, 34).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4811e);
        C79313HOh c79313HOh = C79313HOh.f6779LJ;
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), c4811e, new Long(currentTimeMillis), th}, c79313HOh, C79313HOh.LIZLLL, false, 23).isSupported) {
            C106862S5w.LIZ(c4811e);
            JSONObject jSONObject = new JSONObject();
            C440943cO.LIZ(jSONObject, "req_scene", i);
            C440943cO.LIZ(jSONObject, "reply_params", c4811e.toString());
            c79313HOh.LIZ("anchor_reply_failed", th, jSONObject, Long.valueOf(currentTimeMillis));
        }
        if (c4811e.f26420LJ) {
            return;
        }
        this.LJIIIZ.LJI();
    }

    public final boolean LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 37);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        int i2 = i != 14 ? 64 : 128;
        AbstractC4774i LIZ2 = AbstractC78050Gpo.LIZ();
        if (LIZ2 == null) {
            return false;
        }
        return LIZ2.mo15716LJ(i2);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4800l
    public final void LIZ(int i, Throwable th, long j, C4809b c4809b) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), th, new Long(j), c4809b}, this, LIZ, false, 38).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4809b);
        C79313HOh c79313HOh = C79313HOh.f6779LJ;
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (PatchProxy.proxy(new Object[]{th, new Long(currentTimeMillis)}, c79313HOh, C79313HOh.LIZLLL, false, 27).isSupported) {
            return;
        }
        c79313HOh.LIZ("anchor_cancel_invite_failed", th, new JSONObject(), Long.valueOf(currentTimeMillis));
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4800l
    public final void LIZ(long j, long j2, int i, int i2, String str, Room room, String str2, int i3, String str3, long j3, String str4, int i4) {
        C79317HOl LIZJ;
        if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), str, room, str2, Integer.valueOf(i3), str3, new Long(j3), str4, Integer.valueOf(i4)}, this, LIZ, false, 40).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, room, str3, str4);
        ALogger.m15800e("ttlive_anchor_link", "link onInviteTimeOut, " + j2 + LoggerUtil.BLANK_TAG + room.getOwnerUserId() + " inviteSource=" + i4);
        if (this.LJIIIZ.LIZLLL == 0 || i4 == 2 || i4 == 1 || !AbstractC78050Gpo.LIZ().mo15716LJ(64)) {
            return;
        }
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        if (((IInteractService) service).getMultiAnchorService().LIZ(room.getOwnerUserId()) || (LIZJ = LIZJ()) == null) {
            return;
        }
        LIZJ.LIZ(this.LJIIIZ.LIZLLL, j2, room.getOwnerUserId(), str, 0, "invite_apply_timeout");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4800l
    public final void LIZ(long j, long j2, int i, String str, long j3, Room room, String str2) {
        C79317HOl LIZJ;
        if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), Integer.valueOf(i), str, new Long(j3), room, str2}, this, LIZ, false, 41).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, room, str2);
        if (this.LJIIIZ.LIZLLL == 0 || AbstractC78050Gpo.LIZ().mo15716LJ(64) || (LIZJ = LIZJ()) == null) {
            return;
        }
        LIZJ.LIZ(this.LJIIIZ.LIZLLL, j2, room.getOwnerUserId(), str, 1, "invite_apply_timeout");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
        if (r0.booleanValue() != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5  */
    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(int r6, java.lang.Runnable r7, boolean r8, java.lang.String r9, boolean r10) {
        /*
            r5 = this;
            r0 = 5
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2 = 0
            r3[r2] = r0
            r0 = 1
            r3[r0] = r7
            java.lang.Byte r1 = java.lang.Byte.valueOf(r8)
            r0 = 2
            r3[r0] = r1
            r0 = 3
            r3[r0] = r9
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r0 = 4
            r3[r0] = r1
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.multianchor.MultiAnchorControlWidget.LIZ
            r0 = 47
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r5, r1, r2, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L2b
            return
        L2b:
            p003X.C106862S5w.LIZ(r9)
            com.bytedance.android.live.liveinteract.plantform.a.i r4 = p003X.AbstractC78050Gpo.LIZ()
            java.lang.String r2 = ""
            if (r4 == 0) goto L53
            r0 = 14
            r3 = 0
            if (r6 != r0) goto L85
            r1 = 128(0x80, float:1.794E-43)
            boolean r0 = r4.mo15716LJ(r1)
            if (r0 == 0) goto La1
            com.bytedance.android.live.core.tetris.widgets.LiveWidget r1 = r4.LJFF(r1)
            boolean r0 = r1 instanceof com.bytedance.android.live.liveinteract.multianchor.livescreen.ScreenLiveLinkWidget
            if (r0 != 0) goto L4c
            r1 = r3
        L4c:
            com.bytedance.android.live.liveinteract.multianchor.livescreen.ScreenLiveLinkWidget r1 = (com.bytedance.android.live.liveinteract.multianchor.livescreen.ScreenLiveLinkWidget) r1
            if (r1 == 0) goto L53
            r1.LIZ(r7, r9)
        L53:
            if (r7 != 0) goto L7c
            if (r10 == 0) goto L6b
            com.bytedance.android.live.core.setting.SettingKey<java.lang.Boolean> r0 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.MULTI_ANCHOR_LEAVE_LINK_REFACTOR_DISABLE
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.lang.Object r0 = r0.getValue()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L79
        L6b:
            com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder r0 = r5.LJIIIZ
            r0.LJI()
            com.bytedance.android.live.liveinteract.multianchor.f.a r0 = r5.LIZJ(r6)
            if (r0 == 0) goto L79
            r0.LJFF()
        L79:
            r5.LJIIJ()
        L7c:
            if (r8 == 0) goto L84
            r5.LJIIJ()
            r5.LJIIIZ()
        L84:
            return
        L85:
            r0 = 7
            if (r6 != r0) goto La1
            r1 = 64
            boolean r0 = r4.mo15716LJ(r1)
            if (r0 == 0) goto La1
            com.bytedance.android.live.core.tetris.widgets.LiveWidget r1 = r4.LJFF(r1)
            boolean r0 = r1 instanceof com.bytedance.android.live.liveinteract.multianchor.MultiAnchorLinkWidget
            if (r0 != 0) goto L99
            r1 = r3
        L99:
            com.bytedance.android.live.liveinteract.multianchor.MultiAnchorLinkWidget r1 = (com.bytedance.android.live.liveinteract.multianchor.MultiAnchorLinkWidget) r1
            if (r1 == 0) goto L53
            r1.LIZ(r7, r9, r10)
            goto L53
        La1:
            X.HNI r0 = r5.LJIIIIZZ
            if (r0 != 0) goto La8
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        La8:
            r0.LIZ(r9)
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multianchor.MultiAnchorControlWidget.LIZ(int, java.lang.Runnable, boolean, java.lang.String, boolean):void");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v
    public final void LIZ(d$a d_a) {
        if (PatchProxy.proxy(new Object[]{d_a}, this, LIZ, false, 48).isSupported) {
            return;
        }
        ConcurrentHashMap<Integer, d$a> concurrentHashMap = this.LJIILIIL.LIZIZ;
        if (d_a == null) {
            if (!concurrentHashMap.contains(1)) {
                return;
            }
            concurrentHashMap.remove(1);
            return;
        }
        concurrentHashMap.put(1, d_a);
    }

    @Override // p003X.AbstractC79344HPm
    public final boolean LIZ(int i, AbstractC9021r abstractC9021r) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), abstractC9021r}, this, LIZ, false, 53);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(abstractC9021r);
        if (abstractC9021r instanceof C8874fl) {
            if (i == 7) {
                C8874fl c8874fl = (C8874fl) abstractC9021r;
                return c8874fl.LIZLLL == 7 || c8874fl.LIZLLL == 2;
            } else if (((C8874fl) abstractC9021r).LIZLLL == i) {
                return true;
            }
        }
        return false;
    }

    @Override // p003X.AbstractC79346HPo
    public final void LIZ(Boolean bool, long j, long j2, int i, long j3, String str) {
        if (PatchProxy.proxy(new Object[]{bool, new Long(j), new Long(j2), Integer.valueOf(i), new Long(j3), str}, this, LIZ, false, 54).isSupported) {
            return;
        }
        this.LJIILIIL.LIZ(bool, j, j2, i, j3, str);
    }

    @Override // p003X.AbstractC79343HPl
    public final void LIZ(C79339HPh c79339HPh, int i, int i2) {
        C79340HPi c79340HPi;
        if (PatchProxy.proxy(new Object[]{c79339HPh, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 55).isSupported) {
            return;
        }
        C106862S5w.LIZ(c79339HPh);
        if (!Intrinsics.areEqual(this.LJIILL, c79339HPh) || (c79340HPi = this.LJIILL) == null) {
            return;
        }
        this.LJIILIIL.LIZ(c79340HPi.LIZIZ, c79340HPi.LIZ, c79340HPi.LIZJ, c79340HPi.LIZLLL, i, i2);
    }

    private final void LJIIIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported) {
            return;
        }
        C79340HPi c79340HPi = this.LJIILL;
        if (c79340HPi != null) {
            c79340HPi.LIZ();
        }
        this.LJIILL = null;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v
    public final C79317HOl LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 45);
        if (proxy.isSupported) {
            return (C79317HOl) proxy.result;
        }
        C79317HOl c79317HOl = this.LIZIZ;
        if (c79317HOl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c79317HOl;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v
    /* renamed from: LJ */
    public final C4520a mo15709LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 46);
        if (proxy.isSupported) {
            return (C4520a) proxy.result;
        }
        C4520a c4520a = this.LJI;
        if (c4520a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c4520a;
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.presenter.AbstractC4567h
    public final void LJI() {
        AbstractC4774i LIZ2;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 49).isSupported && (LIZ2 = AbstractC78050Gpo.LIZ()) != null) {
            LIZ2.LIZJ(64);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.presenter.AbstractC4567h
    public final void LJII() {
        AbstractC4774i LIZ2;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 51).isSupported && (LIZ2 = AbstractC78050Gpo.LIZ()) != null) {
            LIZ2.LIZJ(128);
        }
    }

    public final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 56).isSupported) {
            return;
        }
        LIZ(C4518a.LJIIJ.LIZ());
    }

    private final void LJIIJ() {
        C79220HKs LJJII;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 44).isSupported) {
            return;
        }
        AbstractC4774i LIZ2 = AbstractC78050Gpo.LIZ();
        if (LIZ2 != null && (LJJII = LIZ2.LJJII()) != null && LJJII.LJIILIIL()) {
            LJJII.dismiss();
        }
        C79220HKs c79220HKs = this.LJIIJ;
        if (c79220HKs != null && c79220HKs.LJIILIIL()) {
            c79220HKs.dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v
    public final void LIZIZ() {
        LiveWidget liveWidget;
        long j;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        AbstractC4774i LIZ2 = AbstractC78050Gpo.LIZ();
        if (LIZ2 != null) {
            liveWidget = LIZ2.LJFF(64);
        } else {
            liveWidget = null;
        }
        if (!(liveWidget instanceof MultiAnchorLinkWidget)) {
            liveWidget = null;
        }
        MultiAnchorLinkWidget multiAnchorLinkWidget = (MultiAnchorLinkWidget) liveWidget;
        if (multiAnchorLinkWidget != null && !PatchProxy.proxy(new Object[0], multiAnchorLinkWidget, MultiAnchorLinkWidget.LIZIZ, false, 33).isSupported) {
            C79353HPv c79353HPv = multiAnchorLinkWidget.LJI;
            if (c79353HPv == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else if (PatchProxy.proxy(new Object[0], c79353HPv, C79353HPv.LIZ, false, 3).isSupported) {
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                LinkAnchorApi linkAnchorApi = (LinkAnchorApi) C88306Kqq.LIZ().LIZ(LinkAnchorApi.class);
                long j2 = LinkCrossRoomDataHolder.LJII().LIZLLL;
                Room room = c79353HPv.LIZJ;
                if (room != null) {
                    j = room.getRoomId();
                } else {
                    j = 0;
                }
                ((KDS) linkAnchorApi.switchScene(j2, j, 7, 1).m149as(c79353HPv.LJIIJJI())).LIZ(new C79352HPu(c79353HPv, currentTimeMillis), new HP0(currentTimeMillis));
            }
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        d$a d_a = this.LJIILIIL.LIZIZ.get(0);
        if (d_a != null) {
            d_a.LJIIJ();
        }
        LJIIJ();
        super.onDestroy();
        HNI hni = this.LJIIIIZZ;
        if (hni == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hni.LIZJ();
        C79317HOl c79317HOl = this.LIZIZ;
        if (c79317HOl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c79317HOl.LIZIZ();
        C79317HOl c79317HOl2 = this.LIZJ;
        if (c79317HOl2 != null) {
            c79317HOl2.LIZIZ();
        }
        C4520a c4520a = this.LJI;
        if (c4520a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            c4520a.LIZJ();
        }
        C4520a c4520a2 = this.LJII;
        if (c4520a2 != null) {
            c4520a2.LIZJ();
        }
        Disposable disposable = this.LIZLLL;
        if (disposable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            disposable.dispose();
        }
        C79314HOi c79314HOi = this.LJIILIIL;
        if (!PatchProxy.proxy(new Object[0], c79314HOi, C79314HOi.LIZ, false, 3).isSupported) {
            c79314HOi.LIZ();
            C4520a c4520a3 = c79314HOi.LIZJ;
            if (c4520a3 != null) {
                c4520a3.LIZIZ(c79314HOi.LJI);
            }
            C4520a c4520a4 = c79314HOi.LIZLLL;
            if (c4520a4 != null) {
                c4520a4.LIZIZ(c79314HOi.LJI);
            }
        }
        this.LJIILIIL.LIZIZ.clear();
        LJIIIZ();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        C2WC<Boolean> LLLFF;
        C4520a c4520a;
        C4520a c4520a2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        super.onCreate();
        Object obj = this.dataCenter.get("data_is_anchor", (String) Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        this.f26338LJ = ((Boolean) obj).booleanValue();
        Object obj2 = this.dataCenter.get("data_room", (String) new Room());
        Intrinsics.checkNotNullExpressionValue(obj2, "");
        this.LJFF = (Room) obj2;
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJIIIZ;
        Intrinsics.checkNotNullExpressionValue(linkCrossRoomDataHolder, "");
        this.LIZIZ = new C79317HOl(dataCenter, linkCrossRoomDataHolder, this, 7);
        C79317HOl c79317HOl = this.LIZIZ;
        if (c79317HOl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c79317HOl.LIZ();
        C79317HOl c79317HOl2 = this.LIZIZ;
        if (c79317HOl2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c79317HOl2.LIZ(this);
        C79317HOl c79317HOl3 = this.LIZIZ;
        if (c79317HOl3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c79317HOl3.LJI = this;
        DataCenter dataCenter2 = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter2, "");
        LinkCrossRoomDataHolder linkCrossRoomDataHolder2 = this.LJIIIZ;
        Intrinsics.checkNotNullExpressionValue(linkCrossRoomDataHolder2, "");
        this.LIZJ = new C79317HOl(dataCenter2, linkCrossRoomDataHolder2, this, 14);
        C79317HOl c79317HOl4 = this.LIZJ;
        if (c79317HOl4 != null) {
            c79317HOl4.LIZ();
        }
        C79317HOl c79317HOl5 = this.LIZJ;
        if (c79317HOl5 != null) {
            c79317HOl5.LIZ(this);
        }
        C79317HOl c79317HOl6 = this.LIZJ;
        if (c79317HOl6 != null) {
            c79317HOl6.LJI = this;
        }
        DataCenter dataCenter3 = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter3, "");
        this.LJI = new C4520a(dataCenter3, 7);
        C4520a c4520a3 = this.LJI;
        if (c4520a3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c4520a3.LIZIZ();
        C4520a c4520a4 = this.LJI;
        if (c4520a4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c4520a4.LIZ(this.LJIIJJI);
        DataCenter dataCenter4 = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter4, "");
        this.LJII = new C4520a(dataCenter4, 14);
        C4520a c4520a5 = this.LJII;
        if (c4520a5 != null) {
            c4520a5.LIZIZ();
        }
        C4520a c4520a6 = this.LJII;
        if (c4520a6 != null) {
            c4520a6.LIZ(this.LJIIJJI);
        }
        Room room = this.LJFF;
        if (room == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        this.LJIIIIZZ = new HNI(room);
        HNI hni = this.LJIIIIZZ;
        if (hni == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hni.LIZ((AbstractC4567h) this);
        Pair LIZ2 = IQV.LIZ((Function0) MultiAnchorControlWidget$onCreate$pair$1.INSTANCE);
        ((C4519f) LIZ2.getFirst()).LIZ().LIZIZ(this);
        IQX.LIZ((C13491f) LIZ2.getFirst(), "IMultiAnchorService");
        this.LIZLLL = (Disposable) LIZ2.getSecond();
        ((AbstractC90419Ljp) ServiceManager.getService(AbstractC90419Ljp.class)).syncMultiAnchorList();
        C79314HOi c79314HOi = this.LJIILIIL;
        if (!PatchProxy.proxy(new Object[0], c79314HOi, C79314HOi.LIZ, false, 2).isSupported) {
            AbstractC4782v LIZ3 = AbstractC4782v.LJIIL.LIZ();
            if (LIZ3 != null) {
                c4520a = LIZ3.mo15709LJ();
            } else {
                c4520a = null;
            }
            c79314HOi.LIZJ = c4520a;
            C4520a c4520a7 = c79314HOi.LIZJ;
            if (c4520a7 != null) {
                c4520a7.LIZ(c79314HOi.LJI);
            }
            AbstractC4782v LIZ4 = AbstractC4782v.LJIIL.LIZ();
            if (LIZ4 != null) {
                c4520a2 = LIZ4.LJFF();
            } else {
                c4520a2 = null;
            }
            c79314HOi.LIZLLL = c4520a2;
            C4520a c4520a8 = c79314HOi.LIZLLL;
            if (c4520a8 != null) {
                c4520a8.LIZ(c79314HOi.LJII);
            }
            if (c79314HOi.LIZJ == null || c79314HOi.LIZLLL == null) {
                HashMap hashMap = new HashMap();
                hashMap.put("event_name", "MULTI_ANCHOR_BE_INVITED_LISTENER_WRAPPER_INIT_FAILED");
                hashMap.put("detail", "UserCenter null");
                C2IN LIZIZ = C2IN.LIZIZ();
                if (!PatchProxy.proxy(new Object[]{"ttlive_anchor", hashMap}, LIZIZ, IQM.LIZ, false, 20).isSupported && !TextUtils.isEmpty("ttlive_anchor")) {
                    ALogger.m15795w("ttlive_anchor", LIZIZ.LIZ("ttlive_anchor", LIZIZ.LIZ(hashMap), (JSONObject) null));
                }
            }
        }
        this.LJIILIIL.LIZIZ.put(0, new C79315HOj(this));
        C5923dp c5923dp = (C5923dp) IQV.LIZ(C5923dp.class);
        if (c5923dp != null && (LLLFF = c5923dp.LLLFF()) != null) {
            LLLFF.LIZ(Boolean.TRUE);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v
    public final void LIZ(C4518a c4518a) {
        if (PatchProxy.proxy(new Object[]{c4518a}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4518a);
        this.LJIILJJIL = c4518a;
    }

    private final C4520a LIZJ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 29);
        if (proxy.isSupported) {
            return (C4520a) proxy.result;
        }
        if (i == 14) {
            AbstractC4782v LIZ2 = AbstractC4782v.LJIIL.LIZ();
            if (LIZ2 == null) {
                return null;
            }
            return LIZ2.LJFF();
        }
        AbstractC4782v LIZ3 = AbstractC4782v.LJIIL.LIZ();
        if (LIZ3 == null) {
            return null;
        }
        return LIZ3.mo15709LJ();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4800l
    public final void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 39).isSupported) {
            return;
        }
        C79313HOh c79313HOh = C79313HOh.f6779LJ;
        if (!PatchProxy.proxy(new Object[0], c79313HOh, C79313HOh.LIZLLL, false, 28).isSupported) {
            c79313HOh.LIZ("anchor_kick_out_success", new JSONObject());
        }
    }

    private final void LIZ(C8874fl c8874fl) {
        FragmentManager supportFragmentManager;
        if (PatchProxy.proxy(new Object[]{c8874fl}, this, LIZ, false, 23).isSupported) {
            return;
        }
        this.LJIIJ = C79220HKs.LIZ(this.dataCenter, this).m23760LJ();
        View$OnClickListenerC79301HNv LIZ2 = View$OnClickListenerC79301HNv.LIZ(this.LJIIJ, this.dataCenter, c8874fl);
        C79220HKs c79220HKs = this.LJIIJ;
        if (c79220HKs != null) {
            c79220HKs.LIZJ = LIZ2;
        }
        FragmentActivity LIZIZ = C439993ar.LIZIZ(this.context);
        if (LIZIZ != null && (supportFragmentManager = LIZIZ.getSupportFragmentManager()) != null) {
            C79220HKs c79220HKs2 = this.LJIIJ;
            if (c79220HKs2 != null) {
                c79220HKs2.show(supportFragmentManager, "LinkDialog");
            }
            LIZ(true, c8874fl);
        }
    }

    private final void LIZIZ(C8874fl c8874fl) {
        HP6 hp6;
        HP6 hp62;
        if (PatchProxy.proxy(new Object[]{c8874fl}, this, LIZ, false, 26).isSupported) {
            return;
        }
        C79314HOi c79314HOi = this.LJIILIIL;
        long j = c8874fl.LIZJ;
        Room room = this.LJFF;
        if (room == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        long id = room.getId();
        if (!PatchProxy.proxy(new Object[]{new Long(j), new Long(id)}, c79314HOi, C79314HOi.LIZ, false, 5).isSupported && (hp6 = c79314HOi.LJFF) != null && hp6.LIZJ == j && (hp62 = c79314HOi.LJFF) != null && hp62.LIZLLL == id) {
            c79314HOi.LIZ();
            c79314HOi.LIZIZ();
            for (Map.Entry<Integer, d$a> entry : c79314HOi.LIZIZ.entrySet()) {
                entry.getValue().LIZ(j, id);
            }
        }
    }

    private final void LIZ(boolean z, C8874fl c8874fl) {
        int i;
        String str;
        C9533c.C9534a c9534a;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c8874fl}, this, LIZ, false, 25).isSupported || c8874fl.LIZLLL != 14) {
            return;
        }
        if (c8874fl.LIZ() != null) {
            i = c8874fl.LIZ().LIZJ;
        } else {
            i = 0;
        }
        C79314HOi c79314HOi = this.LJIILIIL;
        int i2 = c8874fl.LIZLLL;
        long j = c8874fl.LIZJ;
        Room room = this.LJFF;
        if (room == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        long id = room.getId();
        long j2 = c8874fl.f27901LJ.LIZ;
        String str2 = c8874fl.f27901LJ.LJFF;
        C9533c LIZ2 = c8874fl.LIZ();
        String str3 = null;
        if (LIZ2 != null && (c9534a = LIZ2.LJIILJJIL) != null) {
            str = c9534a.LIZ;
        } else {
            str = null;
        }
        C9533c LIZ3 = c8874fl.LIZ();
        if (LIZ3 != null) {
            str3 = LIZ3.LIZIZ;
        }
        c79314HOi.LIZ(i2, z, 10, j, id, i, j2, str2, str, str3);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4800l
    public final void LIZLLL(int i, C8874fl c8874fl) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c8874fl}, this, LIZ, false, 31).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8874fl);
        C79313HOh c79313HOh = C79313HOh.f6779LJ;
        if (!PatchProxy.proxy(new Object[]{c8874fl}, c79313HOh, C79313HOh.LIZLLL, false, 17).isSupported) {
            C106862S5w.LIZ(c8874fl);
            JSONObject jSONObject = new JSONObject();
            C9545r c9545r = c8874fl.LJIIJ;
            if (c9545r != null) {
                C440943cO.LIZ(jSONObject, "invite_source", c9545r.LIZLLL);
            }
            c79313HOh.LIZ(c8874fl, jSONObject);
            c79313HOh.LIZ("receive_cancel_msg", jSONObject);
        }
        if (i != 7 && i != 14 && i != 2) {
            return;
        }
        C9545r c9545r2 = c8874fl.LJIIJ;
        if (c9545r2 != null && c9545r2.LIZLLL == 2) {
            ALogger.m15800e("ttlive_anchor_link", "receive MultiAnchorReply, dismissLinkDialog");
            LJIIJ();
        } else if ((this.LJIIIZ.LIZLLL != 0 && this.LJIIIZ.LIZLLL != c8874fl.LIZJ) || !this.f26338LJ) {
        } else {
            int i2 = c8874fl.LIZIZ;
            if (i2 == 9) {
                AbstractC4774i LIZ2 = AbstractC78050Gpo.LIZ();
                if (LIZ2 != null && !C79169HIt.LIZIZ(LIZ2.LJJIFFI(), 64)) {
                    LIZ(i, (Runnable) null, false, "receive_link_message_9", false);
                }
                C88440Kt0.LIZ(2131581980, 1);
                LIZIZ(c8874fl);
            } else if (i2 == 14) {
                C88440Kt0.LIZ(2131581954, 1);
            }
            LJIIJ();
            LJIIIZ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4800l
    public final void LIZIZ(int i, Throwable th) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), th}, this, LIZ, false, 35).isSupported) {
            return;
        }
        C79313HOh c79313HOh = C79313HOh.f6779LJ;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), th}, c79313HOh, C79313HOh.LIZLLL, false, 25).isSupported) {
            JSONObject jSONObject = new JSONObject();
            C440943cO.LIZ(jSONObject, "req_scene", i);
            C79313HOh.LIZ(c79313HOh, "anchor_permit_failed", th, jSONObject, null, 8, null);
        }
        C4520a LIZJ = LIZJ(i);
        if (LIZJ != null) {
            LIZJ.LIZ((Long) null);
        }
        C4520a LIZJ2 = LIZJ(i);
        if (LIZJ2 != null) {
            LIZJ2.LIZ(4, "permit_failed");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4800l
    public final void LIZJ(int i, C8874fl c8874fl) {
        FragmentManager supportFragmentManager;
        C79220HKs c79220HKs;
        C4520a c4520a;
        C79317HOl LIZJ;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c8874fl}, this, LIZ, false, 27).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8874fl);
        C79313HOh c79313HOh = C79313HOh.f6779LJ;
        if (!PatchProxy.proxy(new Object[]{c8874fl}, c79313HOh, C79313HOh.LIZLLL, false, 16).isSupported) {
            C106862S5w.LIZ(c8874fl);
            JSONObject jSONObject = new JSONObject();
            c79313HOh.LIZ(c8874fl, jSONObject);
            C9553z c9553z = c8874fl.f27901LJ;
            if (c9553z != null) {
                C440943cO.LIZ(jSONObject, "from_user", c9553z.LIZ);
                C440943cO.LIZ(jSONObject, "from_room", c9553z.LIZIZ);
            }
            c79313HOh.LIZ("receive_apply_msg", jSONObject);
        }
        if (!this.f26338LJ) {
            return;
        }
        if ((c8874fl.LIZLLL != 7 && c8874fl.LIZLLL != 2) || c8874fl.f27901LJ == null) {
            return;
        }
        if (c8874fl.f27901LJ != null && c8874fl.f27901LJ.LJIIL != null) {
            this.LJIIIZ.LJLJJI.put(c8874fl.f27901LJ.LIZ, c8874fl.f27901LJ.LJIIL);
        }
        C79220HKs c79220HKs2 = null;
        long j = 0;
        if (this.LJIIIZ.LIZLLL != 0 && this.LJIIIZ.LIZLLL != c8874fl.LIZJ) {
            AbstractC4782v LIZ2 = AbstractC4782v.LJIIL.LIZ();
            if (LIZ2 != null) {
                c4520a = LIZ2.mo15709LJ();
            } else {
                c4520a = null;
            }
            Intrinsics.checkNotNull(c4520a);
            String str = "";
            for (AnchorLinkUser anchorLinkUser : c4520a.LJIIJ()) {
                User LIZ3 = anchorLinkUser.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                if (LIZ3.getId() == c8874fl.f27901LJ.LIZ) {
                    User LIZ4 = anchorLinkUser.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                    str = LIZ4.getSecUid();
                    Intrinsics.checkNotNullExpressionValue(str, "");
                }
            }
            IService service = ServiceManager.getService(IRoomService.class);
            Intrinsics.checkNotNullExpressionValue(service, "");
            Room currentRoom = ((ILiveRoomService) service).getCurrentRoom();
            if (currentRoom != null && (LIZJ = LIZJ()) != null) {
                LIZJ.LIZ(c8874fl.LIZJ, 2, currentRoom.getId(), c8874fl.f27901LJ.LIZ, str);
            }
        }
        this.LJIIIZ.LJIILJJIL = c8874fl.f27901LJ.f28180LJ;
        this.LJIIIZ.LIZLLL = c8874fl.LIZJ;
        C4520a LIZJ2 = LIZJ(i);
        if (LIZJ2 != null) {
            LIZJ2.LIZ(Long.valueOf(c8874fl.f27901LJ.LIZ));
        }
        IService service2 = ServiceManager.getService(IRoomService.class);
        Intrinsics.checkNotNullExpressionValue(service2, "");
        Room currentRoom2 = ((ILiveRoomService) service2).getCurrentRoom();
        if (currentRoom2 != null) {
            LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJIIIZ;
            User owner = currentRoom2.getOwner();
            if (owner != null) {
                j = owner.getId();
            }
            linkCrossRoomDataHolder.LJJJLIIL = j;
        }
        C9533c LIZ5 = c8874fl.LIZ();
        if (LIZ5 != null) {
            int i2 = LIZ5.LIZJ;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 9) {
                        this.LJIIIZ.LJJJLL = "campaign";
                    }
                } else {
                    this.LJIIIZ.LJJJLL = "recommend";
                }
            } else {
                this.LJIIIZ.LJJJLL = "mutual_follow";
            }
        }
        AbstractC4774i LIZ6 = AbstractC78050Gpo.LIZ();
        if (LIZ6 != null) {
            c79220HKs2 = LIZ6.LJJII();
        }
        this.LJIIJ = c79220HKs2;
        C79220HKs c79220HKs3 = this.LJIIJ;
        if (c79220HKs3 != null && c79220HKs3.LJIILIIL()) {
            c79220HKs3.dismiss();
        }
        LJIIIZ();
        this.LJIIJ = C79220HKs.LIZ(this.dataCenter, this).m23760LJ();
        View$OnClickListenerC79301HNv LIZ7 = View$OnClickListenerC79301HNv.LIZ(this.LJIIJ, this.dataCenter, c8874fl);
        C79220HKs c79220HKs4 = this.LJIIJ;
        if (c79220HKs4 != null) {
            c79220HKs4.LIZJ = LIZ7;
        }
        FragmentActivity LIZIZ = C439993ar.LIZIZ(this.context);
        if (LIZIZ != null && (supportFragmentManager = LIZIZ.getSupportFragmentManager()) != null && (c79220HKs = this.LJIIJ) != null) {
            c79220HKs.show(supportFragmentManager, "LinkDialog");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x0511, code lost:
        if (r4 != 102) goto L211;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05cd  */
    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4800l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZIZ(int r29, com.bytedance.android.livesdk.message.model.C8874fl r30) {
        /*
            Method dump skipped, instructions count: 1489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multianchor.MultiAnchorControlWidget.LIZIZ(int, com.bytedance.android.livesdk.message.model.fl):void");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4800l
    public final void LIZ(int i, int i2, C4810d c4810d) {
        C79112HGo c79112HGo;
        HashMap<Long, String> hashMap;
        Long l;
        C4520a LIZJ;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), c4810d}, this, LIZ, false, 33).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4810d);
        C79313HOh c79313HOh = C79313HOh.f6779LJ;
        if (!PatchProxy.proxy(new Object[]{c4810d}, c79313HOh, C79313HOh.LIZLLL, false, 24).isSupported) {
            C106862S5w.LIZ(c4810d);
            JSONObject jSONObject = new JSONObject();
            C440943cO.LIZ(jSONObject, "resp_link_id", c4810d.LJIIL);
            c79313HOh.LIZ("anchor_permit_success", jSONObject);
        }
        long j = c4810d.LJII;
        C4520a LIZJ2 = LIZJ(i);
        if (LIZJ2 != null && (l = LIZJ2.LJIIIIZZ) != null && j == l.longValue() && (LIZJ = LIZJ(i)) != null) {
            LIZJ.LIZ((Long) null);
        }
        if (i2 == 1 && (c79112HGo = c4810d.LJIILIIL) != null && c79112HGo.LIZIZ && (hashMap = c79112HGo.LIZJ) != null && !hashMap.isEmpty()) {
            LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII, "");
            LJII.LIZ(c79112HGo);
        }
        C4520a LIZJ3 = LIZJ(i);
        if (LIZJ3 != null) {
            LIZJ3.LIZ(4, "permit_success");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4800l
    public final void LIZ(int i, C6175o c6175o, int i2, long j, int i3, C4811e c4811e) {
        C4518a c4518a;
        String str;
        int i4;
        HashMap<Long, String> hashMap;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c6175o, Integer.valueOf(i2), new Long(j), Integer.valueOf(i3), c4811e}, this, LIZ, false, 32).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6175o, c4811e);
        C79313HOh c79313HOh = C79313HOh.f6779LJ;
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), c4811e, c6175o, new Long(currentTimeMillis)}, c79313HOh, C79313HOh.LIZLLL, false, 22).isSupported) {
            C106862S5w.LIZ(c4811e, c6175o);
            JSONObject jSONObject = new JSONObject();
            C440943cO.LIZ(jSONObject, "reply_params", c4811e.toString());
            C440943cO.LIZ(jSONObject, "reply_status", i2);
            C440943cO.LIZ(jSONObject, "request_type", i3);
            C440943cO.LIZ(jSONObject, "reply_link_id", c6175o.LJI);
            C440943cO.LIZ(jSONObject, "rtc_ext_info", c6175o.LJFF);
            c79313HOh.LIZ("anchor_reply_success", currentTimeMillis, jSONObject);
        }
        if (i2 == 4) {
            return;
        }
        if (c4811e.f26420LJ) {
            ALogger.m15800e("ttlive_anchor_link", "replyMultiAnchor success " + i2 + LoggerUtil.BLANK_TAG + c4811e);
            return;
        }
        if (i2 == 1) {
            C79112HGo c79112HGo = c6175o.LJIIJ;
            if (c79112HGo != null && c79112HGo.LIZIZ && (hashMap = c79112HGo.LIZJ) != null && !hashMap.isEmpty()) {
                LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
                Intrinsics.checkNotNullExpressionValue(LJII, "");
                LJII.LIZ(c6175o.LJIIJ);
            }
            if (LinkCrossRoomDataHolder.LJII().LJJIIJ) {
                if (!PatchProxy.proxy(new Object[0], C79413HSd.LIZIZ, C79413HSd.LIZ, false, 24).isSupported) {
                    HashMap hashMap2 = new HashMap();
                    int i5 = LinkCrossRoomDataHolder.LJII().LJLJJL;
                    if (i5 == 1) {
                        hashMap2.put("battle_mode", "individual_pk");
                    } else if (i5 == 2) {
                        hashMap2.put("battle_mode", "team_pk");
                    }
                    C4574547f LIZ2 = C4574547f.LIZ();
                    LinkCrossRoomDataHolder LJII2 = LinkCrossRoomDataHolder.LJII();
                    Intrinsics.checkNotNullExpressionValue(LJII2, "");
                    LIZ2.LIZ("livesdk_npk_invite_success", hashMap2, new C8668v(), Room.class, LJII2.LJIIIZ(), Room.class);
                }
                C88440Kt0.LIZ(2131586402);
                LinkCrossRoomDataHolder.LJII().LJJIIJ = false;
            }
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c6175o, c4811e}, C4518a.LJIIJ, C79345HPn.LIZ, false, 4);
            if (proxy.isSupported) {
                c4518a = (C4518a) proxy.result;
            } else {
                C106862S5w.LIZ(c6175o, c4811e);
                int i6 = c4811e.LIZIZ;
                String str2 = LinkCrossRoomDataHolder.LJII().LJJJLL;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                boolean z = c4811e.f26420LJ;
                if (c4811e.LIZLLL > 0) {
                    str = "pk_banner";
                } else {
                    str = "link_banner";
                }
                c4518a = new C4518a("replyAgreeApi", i6, str2, false, false, z, 3, null, str, 152);
            }
            LIZ(c4518a);
            AbstractC4774i LIZ3 = AbstractC78050Gpo.LIZ();
            if (LIZ3 != null) {
                if (i == 14) {
                    i4 = 128;
                } else {
                    i4 = 64;
                }
                LIZ3.LIZJ(i4);
            }
        } else {
            this.LJIIIZ.LJI();
            C4520a LIZJ = LIZJ(i);
            if (LIZJ != null) {
                LIZJ.LJFF();
            }
            if (i2 == 4) {
                return;
            }
        }
        LJIIJ();
        LJIIIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4800l
    public final void LIZ(int i, long j, long j2, String str, int i2, long j3, C4809b c4809b) {
        List<User> list;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), new Long(j), new Long(j2), str, Integer.valueOf(i2), new Long(j3), c4809b}, this, LIZ, false, 36).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, c4809b);
        C79313HOh c79313HOh = C79313HOh.f6779LJ;
        long currentTimeMillis = System.currentTimeMillis() - j3;
        if (!PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), Integer.valueOf(i2), new Long(currentTimeMillis)}, c79313HOh, C79313HOh.LIZLLL, false, 26).isSupported) {
            JSONObject jSONObject = new JSONObject();
            C440943cO.LIZ(jSONObject, "req_channel_id", j);
            C440943cO.LIZ(jSONObject, "to_room_id", j2);
            C440943cO.LIZ(jSONObject, "cancel_type", i2);
            c79313HOh.LIZ("anchor_cancel_invite_success", currentTimeMillis, jSONObject);
        }
        C4520a LIZJ = LIZJ(i);
        if (LIZJ != null) {
            List<User> LJIIIIZZ = LIZJ.LJIIIIZZ();
            if (LJIIIIZZ != null) {
                Iterator<User> it = LJIIIIZZ.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    User next = it.next();
                    if (TextUtils.equals(next.getSecUid(), str)) {
                        LIZJ.LIZIZ(next);
                        break;
                    }
                }
            }
            List<User> LJIIIZ = LIZJ.LJIIIZ();
            if (LJIIIZ != null) {
                Iterator<User> it2 = LJIIIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    User next2 = it2.next();
                    if (TextUtils.equals(next2.getSecUid(), str)) {
                        LIZJ.LIZLLL(next2);
                        break;
                    }
                }
            }
        }
        if (j == this.LJIIIZ.LIZLLL && !LIZ(i)) {
            if (LIZJ != null) {
                list = LIZJ.LJIIIIZZ();
            } else {
                list = null;
            }
            if ((list == null || list.isEmpty()) && !c4809b.LIZ()) {
                this.LJIIIZ.LJI();
                if (LIZJ != null) {
                    LIZJ.LJFF();
                    LIZJ.LIZ(4, "cancel_success_callback");
                }
                return;
            }
        }
        if (LIZJ == null) {
            return;
        }
        LIZJ.LIZ(4, "cancel_success_callback");
    }
}
