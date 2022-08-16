package com.bytedance.android.live.liveinteract.plantform.widgt;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.linkpk.AbstractC4254a;
import com.bytedance.android.live.liveinteract.api.BaseLinkWidget;
import com.bytedance.android.live.liveinteract.api.chatroom.p339b.C4271i;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.newpk.AbstractC4584c;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.live.liveinteract.plantform.core.AbstractC4802n;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4763ad;
import com.bytedance.android.live.liveinteract.plantform.p385a.r$c;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.event.C5984am;
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
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC4569445g;
import p003X.AbstractC78986HBs;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C422242nK;
import p003X.C440943cO;
import p003X.C78968HBa;
import p003X.C78979HBl;
import p003X.C79007HCn;
import p003X.C79046HEa;
import p003X.C79065HEt;
import p003X.C79107HGj;
import p003X.C79109HGl;
import p003X.C79199HJx;
import p003X.C87010KQi;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.C88469KtT;
import p003X.HBR;
import p003X.HBW;
import p003X.HGZ;
import p003X.HH8;

/* loaded from: classes3.dex */
public abstract class BasePkInteractAnchorWidget<T extends r$c> extends BaseLinkWidget implements AbstractC4584c, AbstractC4802n, AbstractC4569445g {

    /* renamed from: LJ */
    public static ChangeQuickRedirect f26433LJ;
    public HGZ LIZIZ;
    public long LIZJ;
    public Room LJFF;
    public HBW LJI;
    public C79199HJx LJII;
    public int LJIIIIZZ;
    public AbstractC4254a LJIIIZ;
    public C79065HEt LJIIJ;
    public ArrayList<User> LIZLLL = new ArrayList<>();
    public LongSparseArray<Long> LJIIJJI = new LongSparseArray<>();
    public LongSparseArray<Long> LJIIL = new LongSparseArray<>();
    public String LJIILIIL = "";
    public String LJIILJJIL = "";

    static {
        Covode.recordClassIndex(29579);
    }

    public void LIZ(long j) {
    }

    public void LIZ(long j, C6068x c6068x) {
        if (PatchProxy.proxy(new Object[]{new Long(j), c6068x}, this, f26433LJ, false, 27).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6068x);
    }

    public void LIZ(long j, Throwable th) {
    }

    @Override // p003X.AbstractC78977HBj
    public final void LIZ(C6095af c6095af) {
    }

    public void LIZ(String str, ILayerControl.ILayer iLayer, int i, int i2) {
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZ(String str, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{str, bool}, this, f26433LJ, false, 19).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZ(String str, ByteBuffer byteBuffer) {
    }

    @Override // p003X.AbstractC78977HBj
    public final void LIZ(Throwable th) {
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZ(String[] strArr, boolean[] zArr, int[] iArr) {
    }

    public void LIZIZ(long j, Throwable th) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4801m
    public final void LIZIZ(LinkMicGuideMessage linkMicGuideMessage) {
        if (PatchProxy.proxy(new Object[]{linkMicGuideMessage}, this, f26433LJ, false, 30).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkMicGuideMessage);
    }

    public void LIZIZ(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, f26433LJ, false, 29).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, f26433LJ, false, 18).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    public void LIZIZ(String str, SurfaceView surfaceView, int i, int i2) {
    }

    public void LIZIZ(String str, TextureView textureView, int i, int i2) {
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZIZ(String str, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{str, bool}, this, f26433LJ, false, 20).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // p003X.AbstractC78977HBj
    public final void LIZIZ(Throwable th) {
    }

    public abstract AbstractC78986HBs<T> LIZJ();

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4801m
    /* renamed from: LJ */
    public final void mo15700LJ(long j, Throwable th) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4801m
    /* renamed from: X_ */
    public final void mo15699X_() {
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, f26433LJ, false, 33).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public void LIZ(String str, long j) {
        if (PatchProxy.proxy(new Object[]{str, new Long(j)}, this, f26433LJ, false, 12).isSupported) {
            return;
        }
        long j2 = 0;
        T LIZ = LIZJ().LIZ(0L, str);
        if (j == 1) {
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LINK_INTERACT_AUDIENCE_OPT_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                if (LIZ != null) {
                    User LIZ2 = LIZ.LIZ();
                    if (LIZ2 != null) {
                        HBW hbw = this.LJI;
                        if (hbw == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        hbw.LIZ(LIZ2.getId(), LIZ2.getSecUid(), "rtc_user_lost");
                    }
                    User LIZ3 = LIZ.LIZ();
                    if (LIZ3 != null) {
                        j2 = LIZ3.getId();
                    }
                }
                HH8.LIZJ(j2);
            }
        }
        LIZJ().LIZ(str);
    }

    public void LIZ(String str, SurfaceView surfaceView, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, surfaceView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f26433LJ, false, 13).isSupported) {
            return;
        }
        LIZJ(str);
    }

    public void LIZ(String str, TextureView textureView, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, textureView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f26433LJ, false, 14).isSupported) {
            return;
        }
        LIZJ(str);
    }

    public final Room LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, f26433LJ, false, 1);
        if (proxy.isSupported) {
            return (Room) proxy.result;
        }
        Room room = this.LJFF;
        if (room == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return room;
    }

    public final HBW LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, f26433LJ, false, 3);
        if (proxy.isSupported) {
            return (HBW) proxy.result;
        }
        HBW hbw = this.LJI;
        if (hbw == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return hbw;
    }

    /* renamed from: Z_ */
    public void mo15698Z_() {
        if (PatchProxy.proxy(new Object[0], this, f26433LJ, false, 11).isSupported) {
            return;
        }
        C79107HGj.LIZ("start engine success");
        Iterator<User> it = this.LIZLLL.iterator();
        while (it.hasNext()) {
            User next = it.next();
            HBW hbw = this.LJI;
            if (hbw == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            Intrinsics.checkNotNullExpressionValue(next, "");
            hbw.LIZ(next.getId(), next.getSecUid());
        }
        this.LIZLLL.clear();
    }

    @Override // p003X.AbstractC78977HBj
    public final void aj_() {
        if (!PatchProxy.proxy(new Object[0], this, f26433LJ, false, 25).isSupported && !PatchProxy.proxy(new Object[0], this, f26433LJ, false, 22).isSupported && TextUtils.equals(this.LJIILJJIL, "stop_normally")) {
            C79046HEa.LIZ().LIZ((Integer) 0);
            if (this.dataCenter != null) {
                this.dataCenter.put("cmd_interact_state_change", new C5984am(8));
            }
            C87010KQi.LIZ().LIZ(new C4271i(1));
            C87010KQi.LIZ().LIZ(new C5984am(15));
            this.LJIILJJIL = "";
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        C79199HJx c79199HJx;
        if (PatchProxy.proxy(new Object[0], this, f26433LJ, false, 5).isSupported) {
            return;
        }
        super.onCreate();
        Object obj = this.dataCenter.get("data_room", (String) new Room());
        Intrinsics.checkNotNullExpressionValue(obj, "");
        this.LJFF = (Room) obj;
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        this.LJI = new HBW(dataCenter, this.LJIIIZ);
        HBW hbw = this.LJI;
        if (hbw == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hbw.LIZ();
        AbstractC4763ad LIZ = AbstractC4763ad.LIZ.LIZ();
        if (LIZ != null) {
            c79199HJx = LIZ.LIZ();
        } else {
            c79199HJx = null;
        }
        this.LJII = c79199HJx;
        this.LJIIIIZZ = 1;
        LIZJ().LIZ();
        HBW hbw2 = this.LJI;
        if (hbw2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hbw2.LIZ(this);
        this.LJIIJ = new C79065HEt(this.LJII);
        DataCenter dataCenter2 = this.dataCenter;
        if (dataCenter2 != null) {
            dataCenter2.observeForever("data_interact_anchor_param_change", this.LJIIJ);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, f26433LJ, false, 6).isSupported) {
            return;
        }
        super.onDestroy();
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.removeObserver(this.LJIIJ);
        }
        LIZJ().LIZIZ();
        HBW hbw = this.LJI;
        if (hbw == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hbw.LIZIZ(this);
        HBW hbw2 = this.LJI;
        if (hbw2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hbw2.LIZLLL();
        this.LJIILJJIL = "";
        C79007HCn.LJII().LIZ(Boolean.FALSE);
    }

    @Override // p003X.AbstractC78977HBj
    /* renamed from: LJ */
    public final void mo15695LJ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, f26433LJ, false, 26).isSupported) {
            return;
        }
        C88469KtT.LIZ(this.context, th);
    }

    public BasePkInteractAnchorWidget(AbstractC4254a abstractC4254a) {
        C106862S5w.LIZ(abstractC4254a);
        this.LJIIIZ = abstractC4254a;
    }

    private final void LIZJ(String str) {
        User LIZIZ;
        if (!PatchProxy.proxy(new Object[]{str}, this, f26433LJ, false, 16).isSupported && (LIZIZ = LIZJ().LIZIZ(str)) != null) {
            long id = LIZIZ.getId();
            long currentTimeMillis = System.currentTimeMillis();
            Long l = this.LJIIJJI.get(id);
            if (l != null) {
                long longValue = l.longValue();
                if (longValue > 0) {
                    HH8.LIZ(LIZIZ(), currentTimeMillis - longValue);
                }
                this.LJIIJJI.remove(id);
            }
            this.LIZJ = id;
            C79007HCn.LJII().LJIIL.LIZ(this.LIZJ);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    /* renamed from: g_ */
    public final void mo15697g_(String str) {
        User LIZIZ;
        int i = 1;
        if (!PatchProxy.proxy(new Object[]{str}, this, f26433LJ, false, 17).isSupported && (LIZIZ = LIZJ().LIZIZ(str)) != null) {
            long id = LIZIZ.getId();
            long currentTimeMillis = System.currentTimeMillis();
            Long l = this.LJIIL.get(id);
            if (l != null) {
                long longValue = l.longValue();
                if (longValue > 0) {
                    long j = currentTimeMillis - longValue;
                    int LIZIZ2 = LIZIZ();
                    String str2 = this.LJIILIIL;
                    if (!PatchProxy.proxy(new Object[]{Integer.valueOf(LIZIZ2), new Long(j), str2}, null, C79109HGl.LIZ, true, 30).isSupported) {
                        int i2 = LIZIZ2 + 10;
                        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.INETRACT_GUEST_FRAME_OPT;
                        Intrinsics.checkNotNullExpressionValue(settingKey, "");
                        Boolean value = settingKey.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "");
                        if (value.booleanValue()) {
                            i2 += 100;
                        }
                        if (str2 != null && str2.length() > 0) {
                            if (!Intrinsics.areEqual(str2, "apply")) {
                                i = 2;
                            }
                            i2 += i * 1000;
                        }
                        JSONObject jSONObject = new JSONObject();
                        if (str2 == null) {
                            str2 = "";
                        }
                        C440943cO.LIZ(jSONObject, "join_channel_type", str2);
                        C440943cO.LIZ(jSONObject, "stats", i2);
                        C440943cO.LIZ(jSONObject, "duration", j);
                        C79109HGl.LIZJ.LIZ("interaction_mode_anchor_connection_success", jSONObject);
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
        if (PatchProxy.proxy(new Object[]{user}, this, f26433LJ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(user);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, f26433LJ, false, 31);
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
            C79199HJx c79199HJx = this.LJII;
            if (c79199HJx != null && !c79199HJx.LJIIIIZZ) {
                long currentTimeMillis = System.currentTimeMillis();
                this.LJIIJJI.put(user.getId(), Long.valueOf(currentTimeMillis));
                this.LJIIL.put(user.getId(), Long.valueOf(currentTimeMillis));
                this.LJIILIIL = "apply";
                HBW hbw = this.LJI;
                if (hbw == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                hbw.LIZIZ();
            }
            HBW hbw2 = this.LJI;
            if (hbw2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            hbw2.LIZ(user.getId(), user.getSecUid());
            return;
        }
        C79199HJx c79199HJx2 = this.LJII;
        if (c79199HJx2 != null && !c79199HJx2.LJIIIIZZ) {
            long currentTimeMillis2 = System.currentTimeMillis();
            this.LJIIJJI.put(user.getId(), Long.valueOf(currentTimeMillis2));
            this.LJIIL.put(user.getId(), Long.valueOf(currentTimeMillis2));
            this.LJIILIIL = "apply";
            if (!PatchProxy.proxy(new Object[]{user}, this, f26433LJ, false, 9).isSupported) {
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
            HBW hbw3 = this.LJI;
            if (hbw3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            hbw3.LIZIZ();
            return;
        }
        this.LJIIL.put(user.getId(), Long.valueOf(System.currentTimeMillis()));
        this.LJIILIIL = "apply";
        HBW hbw4 = this.LJI;
        if (hbw4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hbw4.LIZ(user.getId(), user.getSecUid());
    }

    @Override // p003X.AbstractC78977HBj
    public final void LIZ(C5176i<C6094ae> c5176i) {
        List<AnchorLinkUser> list;
        if (PatchProxy.proxy(new Object[]{c5176i}, this, f26433LJ, false, 24).isSupported) {
            return;
        }
        C106862S5w.LIZ(c5176i);
        this.dataCenter.put("cmd_interact_state_change", new C5984am(7));
        C422242nK.LIZ(this.context, this.LJIIIZ.LJFF());
        C6094ae c6094ae = c5176i.LIZJ;
        if (c6094ae != null && (list = c6094ae.LJI) != null) {
            SettingKey<C6860br> settingKey = LiveSettingKeys.LIST_USER_VERSION_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            if (settingKey.getValue().LJI) {
                LIZJ().LIZ(list, c5176i.LIZJ.LJFF, "joinChannel");
            }
        }
    }

    public void LIZ(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, f26433LJ, false, 28).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        if (c8854es.LJIILJJIL == 1) {
            C79199HJx c79199HJx = this.LJII;
            if (c79199HJx != null && !c79199HJx.LJIIIIZZ) {
                HBW hbw = this.LJI;
                if (hbw == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                hbw.LIZIZ();
            }
            C79199HJx c79199HJx2 = this.LJII;
            if (c79199HJx2 != null) {
                c79199HJx2.LIZ(this);
            }
        } else if (!TextUtils.isEmpty(c8854es.LJIILL)) {
            C88440Kt0.LIZ(c8854es.LJIILL);
        } else {
            C88440Kt0.LIZ(2131585451);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZ(long j, long j2) {
        HGZ hgz;
        if (!PatchProxy.proxy(new Object[]{new Long(j), new Long(j2)}, this, f26433LJ, false, 10).isSupported && (hgz = this.LIZIZ) != null) {
            hgz.LIZ(j, j2);
        }
    }

    public void LIZIZ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, f26433LJ, false, 23).isSupported) {
            return;
        }
        LIZ(this.LJIIIIZZ, "stop_on_rtc_error");
    }

    public void LIZ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, f26433LJ, false, 21).isSupported) {
            return;
        }
        ALogger.m15798e("ttlive_link", exc);
        this.LIZLLL.clear();
        HBW hbw = this.LJI;
        if (hbw == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hbw.LIZJ();
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("cmd_interact_state_change", new C5984am(8));
        }
    }

    public final void LIZ(int i, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, f26433LJ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJIILJJIL = str;
        HBW hbw = this.LJI;
        if (hbw == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, hbw, HBR.LIZ, false, 9).isSupported) {
            C106862S5w.LIZ(str);
            if (!hbw.LJIIIIZZ) {
                hbw.LJIIIIZZ = true;
                long currentTimeMillis = System.currentTimeMillis();
                hbw.LIZIZ.add(((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).finishV1(hbw.LIZJ.getId(), i, str).compose(C100839PnV.LIZJ()).subscribe(new C78968HBa(hbw, currentTimeMillis, str), new C78979HBl<>(hbw, currentTimeMillis, str)));
            }
        }
        this.LIZLLL.clear();
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZIZ(String str, ILayerControl.ILayer iLayer, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, iLayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, f26433LJ, false, 15).isSupported) {
            return;
        }
        LIZJ(str);
    }
}
