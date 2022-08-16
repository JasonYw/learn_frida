package com.bytedance.android.live.liveinteract.plantform.widgt;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.monitor.LiveTracingMonitor;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.linkpk.AbstractC4254a;
import com.bytedance.android.live.liveinteract.api.BaseLinkWidget;
import com.bytedance.android.live.liveinteract.api.chatroom.p339b.C4271i;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.live.liveinteract.plantform.api.LinkAudienceApi;
import com.bytedance.android.live.liveinteract.plantform.core.AbstractC4798i;
import com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i;
import com.bytedance.android.live.liveinteract.plantform.p385a.r$c;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.event.C5984am;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q;
import com.bytedance.android.livesdk.chatroom.interact.model.C6068x;
import com.bytedance.android.livesdk.chatroom.model.C6094ae;
import com.bytedance.android.livesdk.chatroom.model.C6095af;
import com.bytedance.android.livesdk.config.C6860br;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.C8854es;
import com.bytedance.android.livesdk.message.model.LinkMicGuideMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p1594ss.avframework.livestreamv2.core.ILayerControl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import p003X.AbstractC4569445g;
import p003X.AbstractC78050Gpo;
import p003X.AbstractC78986HBs;
import p003X.AbstractC81278I1w;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C3811817w;
import p003X.C3811917x;
import p003X.C422242nK;
import p003X.C440943cO;
import p003X.C77954GoG;
import p003X.C78969HBb;
import p003X.C78980HBm;
import p003X.C79007HCn;
import p003X.C79046HEa;
import p003X.C79065HEt;
import p003X.C79107HGj;
import p003X.C79110HGm;
import p003X.C79169HIt;
import p003X.C79242HLo;
import p003X.C87010KQi;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.C88469KtT;
import p003X.H1R;
import p003X.HBQ;
import p003X.HBX;
import p003X.HDP;
import p003X.HGZ;
import p003X.HH8;
import p003X.HHA;
import p003X.KDS;

/* loaded from: classes3.dex */
public abstract class BaseAnchorLinkWidget<T extends r$c> extends BaseLinkWidget implements AbstractC4798i, AbstractC4805r, AbstractC4569445g {
    public static ChangeQuickRedirect LJI;
    public HGZ LIZIZ;
    public long LIZJ;

    /* renamed from: LJ */
    public C79065HEt f26430LJ;
    public Room LJII;
    public HBX LJIIIIZZ;
    public HHA LJIIIZ;
    public int LJIIJ;
    public AbstractC4254a LJIIJJI;
    public ArrayList<User> LIZLLL = new ArrayList<>();
    public HashMap<Long, Long> LJFF = new HashMap<>();
    public LongSparseArray<Long> LJIIL = new LongSparseArray<>();
    public String LJIILIIL = "";

    static {
        Covode.recordClassIndex(29562);
    }

    public void LIZ(long j) {
    }

    public void LIZ(long j, C6068x c6068x) {
        if (PatchProxy.proxy(new Object[]{new Long(j), c6068x}, this, LJI, false, 34).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6068x);
    }

    public void LIZ(long j, Throwable th) {
    }

    @Override // p003X.AbstractC78977HBj
    public final void LIZ(C6095af c6095af) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, int i, int i2) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{str, bool}, this, LJI, false, 25).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // p003X.AbstractC78977HBj
    public void LIZ(Throwable th) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public void LIZ(String[] strArr, boolean[] zArr, int[] iArr) {
    }

    public void LIZIZ(long j, Throwable th) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4797h
    public final void LIZIZ(LinkMicGuideMessage linkMicGuideMessage) {
        if (PatchProxy.proxy(new Object[]{linkMicGuideMessage}, this, LJI, false, 37).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkMicGuideMessage);
    }

    public void LIZIZ(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LJI, false, 36).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public void LIZIZ(String str, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{str, bool}, this, LJI, false, 24).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // p003X.AbstractC78977HBj
    public final void LIZIZ(Throwable th) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4797h
    public void LIZJ(long j, Throwable th) {
    }

    /* renamed from: LJ */
    public abstract int mo15674LJ();

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4797h
    /* renamed from: LJ */
    public void mo15670LJ(long j) {
    }

    public abstract AbstractC78986HBs<T> LJFF();

    public abstract AbstractC6070q LJII();

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: d_ */
    public final void mo15658d_(String str) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: f_ */
    public void mo15657f_(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LJI, false, 23).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJI, false, 41).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public void LIZ(String str, long j) {
        if (PatchProxy.proxy(new Object[]{str, new Long(j)}, this, LJI, false, 17).isSupported) {
            return;
        }
        if (j == 1) {
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LINK_INTERACT_AUDIENCE_OPT_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                long j2 = 0;
                T LIZ = LJFF().LIZ(0L, str);
                if (LIZ != null) {
                    User LIZ2 = LIZ.LIZ();
                    if (LIZ2 != null) {
                        HBX hbx = this.LJIIIIZZ;
                        if (hbx == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        hbx.LIZ(LIZ2.getId(), LIZ2.getSecUid(), "rtc_user_lost");
                    }
                    User LIZ3 = LIZ.LIZ();
                    if (LIZ3 != null) {
                        j2 = LIZ3.getId();
                    }
                }
                HH8.LIZJ(j2);
            }
        }
        LJFF().LIZ(str);
    }

    public void LIZ(String str, SurfaceView surfaceView, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, surfaceView, Integer.valueOf(i), Integer.valueOf(i2)}, this, LJI, false, 18).isSupported) {
            return;
        }
        LIZLLL(str);
    }

    public void LIZ(String str, TextureView textureView, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, textureView, Integer.valueOf(i), Integer.valueOf(i2)}, this, LJI, false, 19).isSupported) {
            return;
        }
        LIZLLL(str);
    }

    public void LIZ(String str, ILayerControl.ILayer iLayer, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, iLayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, LJI, false, 20).isSupported) {
            return;
        }
        LIZLLL(str);
    }

    public final Room LJIJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJI, false, 1);
        if (proxy.isSupported) {
            return (Room) proxy.result;
        }
        Room room = this.LJII;
        if (room == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return room;
    }

    public final HBX LJIJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJI, false, 3);
        if (proxy.isSupported) {
            return (HBX) proxy.result;
        }
        HBX hbx = this.LJIIIIZZ;
        if (hbx == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return hbx;
    }

    public final HHA LJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJI, false, 5);
        if (proxy.isSupported) {
            return (HHA) proxy.result;
        }
        HHA hha = this.LJIIIZ;
        if (hha == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return hha;
    }

    public final void LJJ() {
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 9).isSupported) {
            return;
        }
        this.LIZLLL.clear();
    }

    /* renamed from: W_ */
    public void mo15659W_() {
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 27).isSupported) {
            return;
        }
        C79046HEa.LIZ().LIZ((Integer) 0);
        if (this.dataCenter != null) {
            this.dataCenter.put("cmd_interact_state_change", new C5984am(8));
        }
        C87010KQi.LIZ().LIZ(new C4271i(1));
    }

    /* renamed from: V_ */
    public void mo15660V_() {
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 16).isSupported) {
            return;
        }
        C79107HGj.LIZ("start engine success");
        Iterator<User> it = this.LIZLLL.iterator();
        while (it.hasNext()) {
            User next = it.next();
            HBX hbx = this.LJIIIIZZ;
            if (hbx == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            Intrinsics.checkNotNullExpressionValue(next, "");
            hbx.LIZ(next.getId(), next.getSecUid());
        }
        this.LIZLLL.clear();
    }

    @Override // p003X.AbstractC78977HBj
    public final void aj_() {
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 31).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], this, LJI, false, 32).isSupported && C79242HLo.LJIILLIIL() && C79242HLo.LJJIIJZLJL() && C79242HLo.LJJIIZ()) {
            HHA hha = this.LJIIIZ;
            if (hha == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            hha.LIZ(true, "force_open_video_talk_anchor_mic");
        }
        HHA hha2 = this.LJIIIZ;
        if (hha2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (hha2.LJI) {
            HHA hha3 = this.LJIIIZ;
            if (hha3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            hha3.LIZ();
            return;
        }
        mo15659W_();
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 7).isSupported) {
            return;
        }
        super.onCreate();
        Object obj = this.dataCenter.get("data_room", (String) new Room());
        Intrinsics.checkNotNullExpressionValue(obj, "");
        this.LJII = (Room) obj;
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        this.LJIIIIZZ = new HBX(dataCenter, this.LJIIJJI);
        HBX hbx = this.LJIIIIZZ;
        if (hbx == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hbx.LIZ();
        Room room = this.LJII;
        if (room == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        this.LJIIIZ = new HHA(room, this.LJIIJJI, null, true);
        this.LJIIJ = mo15674LJ();
        LJFF().LIZ();
        HBX hbx2 = this.LJIIIIZZ;
        if (hbx2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hbx2.LIZ(this);
        HHA hha = this.LJIIIZ;
        if (hha == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        this.f26430LJ = new C79065HEt(hha);
        DataCenter dataCenter2 = this.dataCenter;
        if (dataCenter2 != null) {
            dataCenter2.observeForever("data_interact_anchor_param_change", this.f26430LJ);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        AbstractC4774i LIZ;
        if (PatchProxy.proxy(new Object[0], this, LJI, false, 10).isSupported) {
            return;
        }
        super.onDestroy();
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.removeObserver(this.f26430LJ);
        }
        LJFF().LIZIZ();
        HBX hbx = this.LJIIIIZZ;
        if (hbx == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hbx.LIZIZ(this);
        HBX hbx2 = this.LJIIIIZZ;
        if (hbx2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hbx2.LIZLLL();
        HHA hha = this.LJIIIZ;
        if (hha == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (hha.LJI) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJI, false, 11);
            if (!proxy.isSupported ? (LIZ = AbstractC78050Gpo.LIZ()) == null || !C79169HIt.LIZIZ(LIZ.LJJIFFI(), 4) : !((Boolean) proxy.result).booleanValue()) {
                HHA hha2 = this.LJIIIZ;
                if (hha2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                hha2.LIZ();
            }
        }
        HHA hha3 = this.LJIIIZ;
        if (hha3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hha3.LJFF();
        C79007HCn.LJII().LIZ(Boolean.FALSE);
    }

    @Override // p003X.AbstractC78977HBj
    /* renamed from: LJ */
    public final void mo15695LJ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LJI, false, 33).isSupported) {
            return;
        }
        C88469KtT.LIZ(this.context, th);
    }

    public BaseAnchorLinkWidget(AbstractC4254a abstractC4254a) {
        C106862S5w.LIZ(abstractC4254a);
        this.LJIIJJI = abstractC4254a;
    }

    private final void LIZLLL(String str) {
        User LIZIZ;
        if (!PatchProxy.proxy(new Object[]{str}, this, LJI, false, 21).isSupported && (LIZIZ = LJFF().LIZIZ(str)) != null) {
            long id = LIZIZ.getId();
            long currentTimeMillis = System.currentTimeMillis();
            Long l = this.LJFF.get(Long.valueOf(id));
            if (l != null) {
                if (l.longValue() > 0) {
                    HH8.LIZ(LIZIZ(), currentTimeMillis - l.longValue());
                }
                this.LJFF.remove(Long.valueOf(id));
            }
            this.LIZJ = id;
            C79007HCn.LJII().LJIIL.LIZ(this.LIZJ);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4797h
    public final void LJFF(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LJI, false, 38).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        HHA hha = this.LJIIIZ;
        if (hha == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!hha.LJI) {
            HBX hbx = this.LJIIIIZZ;
            if (hbx == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            hbx.LIZIZ();
        }
        if (this.LJIIL.indexOfKey(c8854es.LJJI) < 0) {
            this.LJIIL.put(c8854es.LJJI, Long.valueOf(System.currentTimeMillis()));
        }
        HH8.LIZ(c8854es.getMessageId());
        C79110HGm.LIZIZ(c8854es.getMessageId(), (LiveTracingMonitor.EventModule) null, 2, (Object) null);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: e_ */
    public final void mo15661e_(String str) {
        User LIZIZ;
        String str2;
        int i = 1;
        if (!PatchProxy.proxy(new Object[]{str}, this, LJI, false, 22).isSupported && (LIZIZ = LJFF().LIZIZ(str)) != null) {
            long id = LIZIZ.getId();
            long currentTimeMillis = System.currentTimeMillis();
            Long l = this.LJIIL.get(id);
            if (l != null) {
                long longValue = l.longValue();
                if (longValue > 0) {
                    long j = currentTimeMillis - longValue;
                    int LIZIZ2 = LIZIZ();
                    String str3 = this.LJIILIIL;
                    if (!PatchProxy.proxy(new Object[]{Integer.valueOf(LIZIZ2), new Long(j), str3, null, 8, null}, null, C79110HGm.LIZ, true, 68).isSupported) {
                        LiveTracingMonitor.EventModule LIZ = C79110HGm.LIZ();
                        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(LIZIZ2), new Long(j), str3, LIZ}, null, C79110HGm.LIZ, true, 67).isSupported) {
                            C106862S5w.LIZ(LIZ);
                            JSONObject jSONObject = new JSONObject();
                            C440943cO.LIZ(jSONObject, "duration", j);
                            if (str3 == null) {
                                str2 = "";
                            } else {
                                str2 = str3;
                            }
                            C440943cO.LIZ(jSONObject, "join_channel_type", str2);
                            int i2 = LIZIZ2 + 10;
                            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.INETRACT_GUEST_FRAME_OPT;
                            Intrinsics.checkNotNullExpressionValue(settingKey, "");
                            Boolean value = settingKey.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "");
                            if (value.booleanValue()) {
                                i2 += 100;
                            }
                            if (str3 != null && str3.length() > 0) {
                                if (!Intrinsics.areEqual(str3, "apply")) {
                                    i = 2;
                                }
                                i2 += i * 1000;
                            }
                            C79110HGm.LIZJ.LIZ(LIZ, "interaction_mode_anchor_connection_success", i2, "", jSONObject, true);
                        }
                    }
                }
                this.LJIIL.remove(id);
                this.LJIILIIL = "";
            }
        }
    }

    public void LIZ(User user) {
        boolean booleanValue;
        Object obj;
        if (PatchProxy.proxy(new Object[]{user}, this, LJI, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(user);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJI, false, 39);
        if (proxy.isSupported) {
            booleanValue = ((Boolean) proxy.result).booleanValue();
        } else {
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.INETRACT_GUEST_FRAME_OPT;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            booleanValue = value.booleanValue();
        }
        if (booleanValue) {
            HHA hha = this.LJIIIZ;
            if (hha == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!hha.LJI) {
                long currentTimeMillis = System.currentTimeMillis();
                this.LJFF.put(Long.valueOf(user.getId()), Long.valueOf(currentTimeMillis));
                this.LJIIL.put(user.getId(), Long.valueOf(currentTimeMillis));
                this.LJIILIIL = "apply";
                HBX hbx = this.LJIIIIZZ;
                if (hbx == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                hbx.LIZIZ();
            }
            HBX hbx2 = this.LJIIIIZZ;
            if (hbx2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            hbx2.LIZ(user.getId(), user.getSecUid());
            return;
        }
        HHA hha2 = this.LJIIIZ;
        if (hha2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!hha2.LJI) {
            long currentTimeMillis2 = System.currentTimeMillis();
            this.LJFF.put(Long.valueOf(user.getId()), Long.valueOf(currentTimeMillis2));
            this.LJIIL.put(user.getId(), Long.valueOf(currentTimeMillis2));
            this.LJIILIIL = "apply";
            if (!PatchProxy.proxy(new Object[]{user}, this, LJI, false, 14).isSupported) {
                Iterator<T> it = this.LIZLLL.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        User user2 = (User) obj;
                        if (user2.getId() == user.getId() && Intrinsics.areEqual(user2.getSecUid(), user.getSecUid())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                User user3 = (User) obj;
                if (user3 != null) {
                    ALogger.m15800e("ttlive_link", "user already in permitting list " + user3.getId());
                } else {
                    this.LIZLLL.add(user);
                }
            }
            HBX hbx3 = this.LJIIIIZZ;
            if (hbx3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            hbx3.LIZIZ();
            return;
        }
        this.LJIIL.put(user.getId(), Long.valueOf(System.currentTimeMillis()));
        this.LJIILIIL = "apply";
        HBX hbx4 = this.LJIIIIZZ;
        if (hbx4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hbx4.LIZ(user.getId(), user.getSecUid());
    }

    @Override // p003X.AbstractC78977HBj
    public void LIZ(C5176i<C6094ae> c5176i) {
        List<AnchorLinkUser> list;
        if (PatchProxy.proxy(new Object[]{c5176i}, this, LJI, false, 30).isSupported) {
            return;
        }
        C106862S5w.LIZ(c5176i);
        this.dataCenter.put("cmd_interact_state_change", new C5984am(7));
        C422242nK.LIZ(this.context, this.LJIIJJI.LJFF());
        HDP.LIZIZ.LIZIZ();
        HHA hha = this.LJIIIZ;
        if (hha == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        HHA.LIZ(hha, LJII(), this, false, false, 12, null);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(7);
        LinkAudienceApi linkAudienceApi = (LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class);
        String jSONArray2 = jSONArray.toString();
        Room room = this.LJII;
        if (room == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        ((KDS) linkAudienceApi.getAudienceSettings(jSONArray2, room.getId()).compose(C100839PnV.LIZJ()).m149as(autoDispose())).LIZ(C77954GoG.LIZIZ, C3811817w.LIZIZ);
        LinkAudienceApi linkAudienceApi2 = (LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class);
        Room room2 = this.LJII;
        if (room2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        ((AbstractC81278I1w) linkAudienceApi2.fetchInteractEntrances(room2.getId(), 0L).compose(C100839PnV.LIZJ()).m151as(autoDispose())).LIZ(new H1R(this), C3811917x.LIZIZ);
        C6094ae c6094ae = c5176i.LIZJ;
        if (c6094ae != null && (list = c6094ae.LJI) != null) {
            SettingKey<C6860br> settingKey = LiveSettingKeys.LIST_USER_VERSION_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            if (settingKey.getValue().LJI) {
                LJFF().LIZ(list, c5176i.LIZJ.LJFF, "joinChannel");
            }
        }
    }

    public void LIZ(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LJI, false, 35).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        if (c8854es.LJIILJJIL == 1) {
            HHA hha = this.LJIIIZ;
            if (hha == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!hha.LJI) {
                HBX hbx = this.LJIIIIZZ;
                if (hbx == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                hbx.LIZIZ();
            }
        } else if (!TextUtils.isEmpty(c8854es.LJIILL)) {
            C88440Kt0.LIZ(c8854es.LJIILL);
        } else {
            C88440Kt0.LIZ(2131585451);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(long j, long j2) {
        HGZ hgz;
        if (!PatchProxy.proxy(new Object[]{new Long(j), new Long(j2)}, this, LJI, false, 15).isSupported && (hgz = this.LIZIZ) != null) {
            hgz.LIZ(j, j2);
        }
    }

    public void LIZJ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LJI, false, 29).isSupported) {
            return;
        }
        LIZ(this.LJIIJ, "stop_on_rtc_error");
    }

    public final void LIZ(int i, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, LJI, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        HBX hbx = this.LJIIIIZZ;
        if (hbx == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, hbx, HBQ.LIZ, false, 9).isSupported) {
            C106862S5w.LIZ(str);
            if (!hbx.LJIIIIZZ) {
                hbx.LJIIIIZZ = true;
                long currentTimeMillis = System.currentTimeMillis();
                hbx.LIZIZ.add(((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).finishV1(hbx.LIZJ.getId(), i, str).compose(C100839PnV.LIZJ()).subscribe(new C78969HBb(hbx, currentTimeMillis, str), new C78980HBm<>(hbx, currentTimeMillis, str)));
            }
        }
        this.LIZLLL.clear();
    }

    public void LIZIZ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LJI, false, 28).isSupported) {
            return;
        }
        C79046HEa.LIZ().LIZ((Integer) 0);
        this.dataCenter.put("cmd_interact_state_change", new C5984am(8));
        C87010KQi.LIZ().LIZ(new C4271i(1));
    }

    public void LIZ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LJI, false, 26).isSupported) {
            return;
        }
        ALogger.m15798e("ttlive_link", exc);
        this.LIZLLL.clear();
        HBX hbx = this.LJIIIIZZ;
        if (hbx == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hbx.LIZJ();
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("cmd_interact_state_change", new C5984am(8));
        }
    }
}
