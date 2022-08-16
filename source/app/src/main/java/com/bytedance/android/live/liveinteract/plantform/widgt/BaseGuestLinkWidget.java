package com.bytedance.android.live.liveinteract.plantform.widgt;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.monitor.LiveTracingMonitor;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.linkpk.AbstractC4254a;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.BaseLinkWidget;
import com.bytedance.android.live.liveinteract.api.chatroom.model.LinkApplyType;
import com.bytedance.android.live.liveinteract.api.p338b.AbstractC4264a;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.multianchor.model.MicDress;
import com.bytedance.android.live.liveinteract.plantform.C4759a;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.live.liveinteract.plantform.api.LinkAudienceApi;
import com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k;
import com.bytedance.android.live.liveinteract.plantform.core.AbstractC4804q;
import com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r;
import com.bytedance.android.live.liveinteract.plantform.core.C4806x;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4761ab;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4770d;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i;
import com.bytedance.android.live.liveinteract.plantform.p385a.r$c;
import com.bytedance.android.live.liveinteract.plantform.permission.model.C4825a;
import com.bytedance.android.live.liveinteract.plantform.permission.model.C4826b;
import com.bytedance.android.live.liveinteract.plantform.permission.model.OperateType;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.event.C5984am;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6069p;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q;
import com.bytedance.android.livesdk.chatroom.model.C6094ae;
import com.bytedance.android.livesdk.chatroom.model.C6095af;
import com.bytedance.android.livesdk.chatroom.model.C6119b;
import com.bytedance.android.livesdk.chatroom.model.interact.C6160b;
import com.bytedance.android.livesdk.config.C6860br;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.C8854es;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.android.livesdk.message.model.LinkMicGuideMessage;
import com.bytedance.android.livesdk.message.model.ReplyType;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.live.datacontext.C13491f;
import com.p1594ss.avframework.livestreamv2.core.ILayerControl;
import com.p1594ss.avframework.livestreamv2.core.LiveCore;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import p003X.AbstractC4569445g;
import p003X.AbstractC78050Gpo;
import p003X.AbstractC78986HBs;
import p003X.AbstractC80546Hoy;
import p003X.AbstractC81278I1w;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C3812017y;
import p003X.C3812117z;
import p003X.C409882Kg;
import p003X.C422242nK;
import p003X.C440943cO;
import p003X.C77874Gmy;
import p003X.C77955GoH;
import p003X.C78574GyG;
import p003X.C78985HBr;
import p003X.C78999HCf;
import p003X.C79007HCn;
import p003X.C79046HEa;
import p003X.C79060HEo;
import p003X.C79071HEz;
import p003X.C79107HGj;
import p003X.C79110HGm;
import p003X.C79169HIt;
import p003X.C79242HLo;
import p003X.C80517HoV;
import p003X.C81980ISw;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.H1S;
import p003X.H6F;
import p003X.HB3;
import p003X.HDN;
import p003X.HDP;
import p003X.HEJ;
import p003X.HH8;
import p003X.HHA;
import p003X.HK9;
import p003X.HNG;
import p003X.IQV;
import p003X.IQX;
import p003X.KDS;

/* loaded from: classes3.dex */
public abstract class BaseGuestLinkWidget<T extends r$c> extends BaseLinkWidget implements AbstractC4770d, AbstractC4799k, AbstractC4804q, AbstractC4805r, AbstractC4569445g {
    public static ChangeQuickRedirect LJIILIIL;
    public long LIZIZ;
    public boolean LIZJ;
    public AbstractC4254a LJFF;
    public Room LJIILJJIL;
    public C78999HCf LJIILL;
    public AbstractC6070q LJIILLIIL;
    public HHA LJIIZILJ;
    public boolean LJIJI;
    public long LJIJJLI;
    public C81980ISw LJJ;
    public String LJIJ = "";
    public String LJIJJ = "leave_normally";
    public String LJIL = "";
    public CompositeDisposable LIZLLL = new CompositeDisposable();

    /* renamed from: LJ */
    public final Lazy f26431LJ = LazyKt__LazyJVMKt.lazy(new BaseGuestLinkWidget$surfaceViewByLazy$2(this));

    static {
        Covode.recordClassIndex(29568);
    }

    private final SurfaceView LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILIIL, false, 5);
        return (SurfaceView) (proxy.isSupported ? proxy.result : this.f26431LJ.mo27335getValue());
    }

    public abstract AbstractC78986HBs<T> LIZ();

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public void LIZ(long j, long j2) {
    }

    public void LIZ(C6119b c6119b, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{c6119b, Integer.valueOf(i), Integer.valueOf(i2)}, this, LJIILIIL, false, 19).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6119b);
    }

    public void LIZ(LinkMicGuideMessage linkMicGuideMessage) {
        if (PatchProxy.proxy(new Object[]{linkMicGuideMessage}, this, LJIILIIL, false, 22).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkMicGuideMessage);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, int i, int i2) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{str, bool}, this, LJIILIIL, false, 49).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    public void LIZ(String str, Throwable th) {
        if (PatchProxy.proxy(new Object[]{str, th}, this, LJIILIIL, false, 21).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    public abstract AbstractC6070q LIZIZ(String str);

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public void LIZIZ(String str, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{str, bool}, this, LJIILIIL, false, 48).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    public abstract int LIZJ();

    public void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LJIILIIL, false, 20).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    public void LIZJ(Throwable th) {
    }

    public void LIZLLL(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LJIILIIL, false, 44).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
    }

    public void LIZLLL(Throwable th) {
    }

    @Override // p003X.AbstractC78977HBj
    /* renamed from: LJ */
    public final void mo15695LJ(Throwable th) {
    }

    public void LJIJ() {
    }

    @Override // p003X.AbstractC78977HBj
    public final void aj_() {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: d_ */
    public final void mo15658d_(String str) {
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJIILIIL, false, 53).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4770d
    public final HHA LJIJI() {
        return this.LJIIZILJ;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4770d
    public final AbstractC6070q LJIJJ() {
        return this.LJIILLIIL;
    }

    public AbstractC4254a LJJIIJ() {
        return this.LJFF;
    }

    public void LIZ(C8874fl c8874fl) {
        if (PatchProxy.proxy(new Object[]{c8874fl}, this, LJIILIIL, false, 25).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8874fl);
        HNG.LIZ("server_sys_kickout", new HashMap(), LJJIIJ());
        this.LJIJJ = "sys_kick_out";
        LIZLLL("sys_kick_out");
    }

    public void LIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LJIILIIL, false, 29).isSupported) {
            return;
        }
        if (!(th instanceof ApiServerException)) {
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_TURN_ON_OPT_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                this.LJIJJ = "join_channel_fail";
                LIZLLL("join_channel_fail");
            }
        }
        C79107HGj.LIZ("join channel failed", th != null ? th.getMessage() : null);
        HNG.LIZ("join_fail", th);
    }

    public void LIZ(C6095af c6095af) {
        if (PatchProxy.proxy(new Object[]{c6095af}, this, LJIILIIL, false, 30).isSupported) {
            return;
        }
        ak_();
    }

    public void LIZ(String str, long j) {
        if (PatchProxy.proxy(new Object[]{str, new Long(j)}, this, LJIILIIL, false, 34).isSupported) {
            return;
        }
        LIZ().LIZ(str);
    }

    public void LIZ(String str, SurfaceView surfaceView, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, surfaceView, Integer.valueOf(i), Integer.valueOf(i2)}, this, LJIILIIL, false, 36).isSupported) {
            return;
        }
        long j = C79046HEa.LIZ().f6716LJ;
        if (TextUtils.equals(str, LJJIIJ().LIZ()) && j > 0) {
            C79046HEa.LIZ().f6716LJ = 0L;
        }
        if (!TextUtils.equals(str, LJJIIJ().LIZ()) || this.LIZIZ <= 0) {
            return;
        }
        HH8.LIZIZ(LIZIZ(), System.currentTimeMillis() - this.LIZIZ);
        this.LIZIZ = 0L;
    }

    public void LIZ(String str, TextureView textureView, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, textureView, Integer.valueOf(i), Integer.valueOf(i2)}, this, LJIILIIL, false, 37).isSupported) {
            return;
        }
        long j = C79046HEa.LIZ().f6716LJ;
        if (TextUtils.equals(str, LJJIIJ().LIZ()) && j > 0) {
            C79046HEa.LIZ().f6716LJ = 0L;
        }
        if (!TextUtils.equals(str, LJJIIJ().LIZ()) || this.LIZIZ <= 0) {
            return;
        }
        HH8.LIZIZ(LIZIZ(), System.currentTimeMillis() - this.LIZIZ);
        this.LIZIZ = 0L;
    }

    public void LIZ(String str, ILayerControl.ILayer iLayer, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, iLayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, LJIILIIL, false, 38).isSupported) {
            return;
        }
        long j = C79046HEa.LIZ().f6716LJ;
        if (TextUtils.equals(str, LJJIIJ().LIZ()) && j > 0) {
            C79046HEa.LIZ().f6716LJ = 0L;
        }
        if (!TextUtils.equals(str, LJJIIJ().LIZ()) || this.LIZIZ <= 0) {
            return;
        }
        HH8.LIZIZ(LIZIZ(), System.currentTimeMillis() - this.LIZIZ);
        this.LIZIZ = 0L;
    }

    public void LIZ(String[] strArr, boolean[] zArr, int[] iArr) {
        LinkPlayerInfo LIZ;
        ImageModel imageModel;
        List<String> urls;
        if (PatchProxy.proxy(new Object[]{strArr, zArr, iArr}, this, LJIILIIL, false, 40).isSupported || strArr == null || zArr == null) {
            return;
        }
        int length = strArr.length;
        String LIZIZ = LJJIIJ().LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.toString();
        } else {
            LIZIZ = "0";
        }
        for (int i = 0; i < length; i++) {
            if (TextUtils.equals(strArr[i], LIZIZ) && zArr[i]) {
                AbstractC78986HBs<T> LIZ2 = LIZ();
                String str = null;
                if (!(LIZ2 instanceof C4806x)) {
                    LIZ2 = null;
                }
                C4806x c4806x = (C4806x) LIZ2;
                if (c4806x != null && (LIZ = c4806x.LIZ(0L, LIZIZ)) != null && LIZ.LIZIZ()) {
                    AbstractC6070q abstractC6070q = this.LJIILLIIL;
                    if (!(abstractC6070q instanceof AbstractC6069p)) {
                        abstractC6070q = null;
                    }
                    AbstractC6069p abstractC6069p = (AbstractC6069p) abstractC6070q;
                    if (abstractC6069p == null) {
                        return;
                    }
                    MicDress.VoiceWave voiceWave = LIZ.LJJIJL.LIZIZ;
                    String str2 = (voiceWave == null || (imageModel = voiceWave.LIZLLL) == null || (urls = imageModel.getUrls()) == null) ? null : (String) CollectionsKt___CollectionsKt.getOrNull(urls, 0);
                    MicDress.VoiceWave voiceWave2 = LIZ.LJJIJL.LIZIZ;
                    if (voiceWave2 != null) {
                        str = voiceWave2.LIZIZ;
                    }
                    abstractC6069p.LIZ(str2, str);
                    return;
                }
                AbstractC6070q abstractC6070q2 = this.LJIILLIIL;
                if (!(abstractC6070q2 instanceof AbstractC6069p)) {
                    abstractC6070q2 = null;
                }
                AbstractC6069p abstractC6069p2 = (AbstractC6069p) abstractC6070q2;
                if (abstractC6069p2 == null) {
                    return;
                }
                abstractC6069p2.mo15548A_();
                return;
            }
        }
    }

    public void LIZ(C6160b c6160b, int i) {
        C78999HCf c78999HCf;
        if (PatchProxy.proxy(new Object[]{c6160b, Integer.valueOf(i)}, this, LJIILIIL, false, 45).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6160b);
        if (i != ReplyType.Agree.ordinal() || (c78999HCf = this.LJIILL) == null) {
            return;
        }
        c78999HCf.LIZ();
    }

    public final Room LJJIIJZLJL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILIIL, false, 1);
        if (proxy.isSupported) {
            return (Room) proxy.result;
        }
        Room room = this.LJIILJJIL;
        if (room == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return room;
    }

    public final SurfaceView LJJIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILIIL, false, 50);
        if (proxy.isSupported) {
            return (SurfaceView) proxy.result;
        }
        return LIZLLL();
    }

    /* renamed from: W_ */
    public void mo15659W_() {
        if (PatchProxy.proxy(new Object[0], this, LJIILIIL, false, 35).isSupported) {
            return;
        }
        C78999HCf c78999HCf = this.LJIILL;
        if (c78999HCf != null) {
            c78999HCf.LIZ(this.LJIJJ);
        }
        this.LJIILLIIL = null;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LJIILIIL, false, 8).isSupported) {
            return;
        }
        super.onPause();
        this.LIZJ = true;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LJIILIIL, false, 7).isSupported) {
            return;
        }
        super.onResume();
        this.LIZJ = false;
    }

    public void ak_() {
        if (PatchProxy.proxy(new Object[0], this, LJIILIIL, false, 32).isSupported) {
            return;
        }
        if (this.dataCenter != null) {
            this.dataCenter.put("cmd_interact_state_change", new C5984am(4));
        }
        C79046HEa.LIZ().LIZ((Integer) 0);
    }

    /* renamed from: V_ */
    public void mo15660V_() {
        if (PatchProxy.proxy(new Object[0], this, LJIILIIL, false, 33).isSupported) {
            return;
        }
        C77874Gmy.LIZ(false);
        LinkCrossRoomDataHolder.LJII().LJJIFFI = System.currentTimeMillis();
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("cmd_interact_state_change", new C5984am(3));
        }
        C79046HEa.LIZ().LIZ((Integer) 2);
        C78999HCf c78999HCf = this.LJIILL;
        if (c78999HCf != null) {
            String str = this.LJIJ;
            if (!PatchProxy.proxy(new Object[]{str}, c78999HCf, C78999HCf.LIZ, false, 15).isSupported) {
                C106862S5w.LIZ(str);
                c78999HCf.LIZJ.add(((LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class)).notifyJoinRtc(c78999HCf.LIZLLL.getId(), str).compose(C100839PnV.LIZJ()).subscribe(new C79060HEo(str), C79071HEz.LIZIZ));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        AbstractC4774i LIZ;
        AbstractC4774i LIZ2;
        if (PatchProxy.proxy(new Object[0], this, LJIILIIL, false, 9).isSupported) {
            return;
        }
        LIZ().LIZIZ();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIILIIL, false, 10);
        if (!proxy.isSupported ? (LIZ = AbstractC78050Gpo.LIZ()) == null || !C79169HIt.LIZIZ(LIZ.LJJIFFI(), 4) : !((Boolean) proxy.result).booleanValue()) {
            HHA hha = this.LJIIZILJ;
            if (hha != null) {
                hha.LIZLLL();
            }
            this.LJIIZILJ = null;
            this.LIZLLL.dispose();
        }
        C78999HCf c78999HCf = this.LJIILL;
        if (c78999HCf != null && !PatchProxy.proxy(new Object[0], c78999HCf, C78999HCf.LIZ, false, 4).isSupported) {
            IMessageManager iMessageManager = c78999HCf.LIZIZ;
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(c78999HCf);
            }
            if (!c78999HCf.LIZJ.isDisposed()) {
                c78999HCf.LIZJ.dispose();
            }
            C79046HEa LIZ3 = C79046HEa.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
            Integer num = (Integer) LIZ3.LJJIIZI;
            if (num != null && 2 == num.intValue()) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c78999HCf, C78999HCf.LIZ, false, 5);
                if (!proxy2.isSupported ? (LIZ2 = AbstractC78050Gpo.LIZ()) == null || !C79169HIt.LIZIZ(LIZ2.LJJIFFI(), 4) : !((Boolean) proxy2.result).booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    HDP.LIZ("live_end");
                    ((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).leave(c78999HCf.LIZLLL.getId(), "live_end").compose(C100839PnV.LIZJ()).subscribe(new HEJ(currentTimeMillis), new C78985HBr<>(currentTimeMillis));
                }
            }
            c78999HCf.f6668LJ.clear();
        }
        super.onDestroy();
        C81980ISw c81980ISw = this.LJJ;
        if (c81980ISw != null) {
            c81980ISw.LIZJ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        HHA hha;
        if (PatchProxy.proxy(new Object[0], this, LJIILIIL, false, 6).isSupported) {
            return;
        }
        super.onCreate();
        Object obj = this.dataCenter.get("data_room", (String) new Room());
        Intrinsics.checkNotNullExpressionValue(obj, "");
        this.LJIILJJIL = (Room) obj;
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        this.LJIILL = new C78999HCf(dataCenter, LJJIIJ());
        AbstractC4761ab LIZ = AbstractC4761ab.LIZ.LIZ();
        AbstractC6070q abstractC6070q = null;
        if (LIZ != null) {
            hha = LIZ.LJIILIIL();
        } else {
            hha = null;
        }
        this.LJIIZILJ = hha;
        HHA hha2 = this.LJIIZILJ;
        if (hha2 != null && hha2.LJI) {
            AbstractC4761ab LIZ2 = AbstractC4761ab.LIZ.LIZ();
            if (LIZ2 != null) {
                abstractC6070q = LIZ2.LJIILJJIL();
            }
            this.LJIILLIIL = abstractC6070q;
            HHA hha3 = this.LJIIZILJ;
            if (hha3 != null) {
                hha3.LIZ(LJJIIJ());
            }
            HHA hha4 = this.LJIIZILJ;
            if (hha4 != null) {
                hha4.LIZ(this);
            }
            C79046HEa.LIZ().LIZ((Integer) 2);
        } else {
            Room room = this.LJIILJJIL;
            if (room == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            this.LJIIZILJ = new HHA(room, LJJIIJ(), this, false);
            C79046HEa.LIZ().LIZ((Integer) 0);
        }
        LIZ().LIZ();
        C78999HCf c78999HCf = this.LJIILL;
        if (c78999HCf != null && !PatchProxy.proxy(new Object[0], c78999HCf, C78999HCf.LIZ, false, 1).isSupported) {
            IMessageManager iMessageManager = c78999HCf.LIZIZ;
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(MessageType.LINK_MIC.LIZ(), c78999HCf);
            }
            IMessageManager iMessageManager2 = c78999HCf.LIZIZ;
            if (iMessageManager2 != null) {
                iMessageManager2.addMessageListener(MessageType.LINK_MIC_GUIDE_MESSAGE.LIZ(), c78999HCf);
            }
            IMessageManager iMessageManager3 = c78999HCf.LIZIZ;
            if (iMessageManager3 != null) {
                iMessageManager3.addMessageListener(MessageType.LINKER.LIZ(), c78999HCf);
            }
            IMessageManager iMessageManager4 = c78999HCf.LIZIZ;
            if (iMessageManager4 != null) {
                iMessageManager4.addMessageListener(MessageType.LINK_SETTING_NOTIFY_MESSAGE.LIZ(), c78999HCf);
            }
            IMessageManager iMessageManager5 = c78999HCf.LIZIZ;
            if (iMessageManager5 != null) {
                iMessageManager5.addMessageListener(MessageType.CONTROL.LIZ(), c78999HCf);
            }
        }
        C78999HCf c78999HCf2 = this.LJIILL;
        if (c78999HCf2 != null) {
            c78999HCf2.LIZ(this);
        }
        C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, this.dataCenter, 0L, 2, null);
        if (LIZ3 != null) {
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "");
            this.LJJ = new C81980ISw(context, LIZ3, this.LJIIZILJ, this);
        }
        Pair LIZ4 = IQV.LIZ((Function0) BaseGuestLinkWidget$onCreate$pair$1.INSTANCE);
        ((C4759a) LIZ4.getFirst()).LIZ().LIZIZ(this);
        IQX.LIZ((C13491f) LIZ4.getFirst(), "guest_rtc_linker_service");
        this.LIZLLL.add((Disposable) LIZ4.getSecond());
    }

    public void LIZIZ(C8874fl c8874fl) {
        if (PatchProxy.proxy(new Object[]{c8874fl}, this, LJIILIIL, false, 52).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8874fl);
        HB3.LIZ(this, c8874fl);
    }

    /* renamed from: LJ */
    public void mo15668LJ(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LJIILIIL, false, 24).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        this.LJIJJ = "kick_out";
        LIZLLL("kick_out");
    }

    public final void LJFF(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LJIILIIL, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJIJJ = str;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: f_ */
    public void mo15657f_(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LJIILIIL, false, 47).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        C79107HGj.LIZ("onUserJoined");
    }

    public BaseGuestLinkWidget(AbstractC4254a abstractC4254a) {
        C106862S5w.LIZ(abstractC4254a);
        this.LJFF = abstractC4254a;
    }

    public void LIZJ(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LJIILIIL, false, 26).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        this.LIZIZ = c8854es.baseMessage.LIZIZ;
        this.LJIJJLI = c8854es.baseMessage.LIZIZ;
        this.LJIL = "apply";
        C78999HCf c78999HCf = this.LJIILL;
        if (c78999HCf != null) {
            c78999HCf.LIZ();
        }
    }

    public void LIZLLL(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LJIILIIL, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        HHA hha = this.LJIIZILJ;
        if (hha != null && hha.LJI) {
            this.LJIJJ = str;
            HHA hha2 = this.LJIIZILJ;
            if (hha2 != null) {
                hha2.LIZ();
            }
            C81980ISw c81980ISw = this.LJJ;
            if (c81980ISw != null) {
                c81980ISw.LIZJ();
            }
        } else {
            C78999HCf c78999HCf = this.LJIILL;
            if (c78999HCf != null) {
                c78999HCf.LIZ(str);
            }
        }
        AbstractC6070q abstractC6070q = this.LJIILLIIL;
        if (!(abstractC6070q instanceof AbstractC6069p)) {
            abstractC6070q = null;
        }
        AbstractC6069p abstractC6069p = (AbstractC6069p) abstractC6070q;
        if (abstractC6069p != null) {
            abstractC6069p.LJFF();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LJFF(C8874fl c8874fl) {
        if (PatchProxy.proxy(new Object[]{c8874fl}, this, LJIILIIL, false, 23).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8874fl);
        if (c8874fl.LJJIIJ != null) {
            C78574GyG c78574GyG = C78574GyG.LIZIZ;
            long messageId = c8874fl.getMessageId();
            if (!PatchProxy.proxy(new Object[]{new Long(messageId)}, c78574GyG, C78574GyG.LIZ, false, 4).isSupported) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("msg_id", Long.valueOf(messageId));
                HH8.LIZ("low_balance_for_paid_link", (Map) linkedHashMap, false, 4, (Object) null);
            }
            C78999HCf c78999HCf = this.LJIILL;
            if (c78999HCf != null) {
                c78999HCf.LIZIZ("low_balance_for_paid_link");
            }
            C88440Kt0.LIZ(c8874fl.LJJIIJ.LIZ);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: e_ */
    public final void mo15661e_(String str) {
        String str2;
        int i = 1;
        if (PatchProxy.proxy(new Object[]{str}, this, LJIILIIL, false, 39).isSupported) {
            return;
        }
        C81980ISw c81980ISw = this.LJJ;
        if (c81980ISw != null) {
            c81980ISw.LIZIZ();
        }
        if (TextUtils.equals(str, LJJIIJ().LIZ()) && this.LJIJJLI > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.LJIJJLI;
            int LIZIZ = LIZIZ();
            String str3 = this.LJIL;
            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(LIZIZ), new Long(currentTimeMillis), str3, null, 8, null}, null, C79110HGm.LIZ, true, 71).isSupported) {
                LiveTracingMonitor.EventModule LIZ = C79110HGm.LIZ();
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(LIZIZ), new Long(currentTimeMillis), str3, LIZ}, null, C79110HGm.LIZ, true, 70).isSupported) {
                    C106862S5w.LIZ(LIZ);
                    JSONObject jSONObject = new JSONObject();
                    C440943cO.LIZ(jSONObject, "duration", currentTimeMillis);
                    if (str3 == null) {
                        str2 = "";
                    } else {
                        str2 = str3;
                    }
                    C440943cO.LIZ(jSONObject, "join_channel_type", str2);
                    if (str3 != null && str3.length() > 0) {
                        if (!Intrinsics.areEqual(str3, "apply")) {
                            i = 2;
                        }
                        LIZIZ += i * 1000;
                    }
                    C79110HGm.LIZJ.LIZ(LIZ, "interaction_mode_audience_connection_success", LIZIZ, "", jSONObject, true);
                }
            }
            this.LJIJJLI = 0L;
            this.LJIL = "";
        }
    }

    public void LIZIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LJIILIIL, false, 31).isSupported) {
            return;
        }
        ak_();
    }

    public void LIZ(C5176i<C6094ae> c5176i) {
        String str;
        String str2;
        AbstractC5436a liveStream;
        AbstractC6070q abstractC6070q;
        LiveCore liveCore;
        List<AnchorLinkUser> list;
        String str3;
        AbstractC6070q abstractC6070q2;
        boolean z = false;
        if (PatchProxy.proxy(new Object[]{c5176i}, this, LJIILIIL, false, 27).isSupported) {
            return;
        }
        C106862S5w.LIZ(c5176i);
        C81980ISw c81980ISw = this.LJJ;
        if (c81980ISw != null) {
            c81980ISw.LIZ();
        }
        HDP.LIZIZ.LIZIZ();
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_SAFE_CREATE_LIVE_CORE_CLIENT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            C6094ae c6094ae = c5176i.LIZJ;
            if (c6094ae != null) {
                str3 = c6094ae.f26866LJ;
            } else {
                str3 = null;
            }
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str3}, this, LJIILIIL, false, 28);
            if (proxy.isSupported) {
                abstractC6070q2 = (AbstractC6070q) proxy.result;
            } else {
                if (this.LJIILLIIL == null) {
                    this.LJIILLIIL = LIZIZ(str3);
                }
                abstractC6070q2 = this.LJIILLIIL;
            }
            this.LJIILLIIL = abstractC6070q2;
        } else {
            C6094ae c6094ae2 = c5176i.LIZJ;
            if (c6094ae2 != null) {
                str = c6094ae2.f26866LJ;
            } else {
                str = null;
            }
            this.LJIILLIIL = LIZIZ(str);
        }
        C6094ae c6094ae3 = c5176i.LIZJ;
        if (c6094ae3 != null && (list = c6094ae3.LJI) != null) {
            for (AnchorLinkUser anchorLinkUser : list) {
                Intrinsics.checkNotNullExpressionValue(anchorLinkUser, "");
                User LIZ = anchorLinkUser.LIZ();
                if (LIZ != null && LIZ.getId() == C79242HLo.LIZ() && anchorLinkUser.LJII == 1) {
                    C79007HCn LJII = C79007HCn.LJII();
                    Intrinsics.checkNotNullExpressionValue(LJII, "");
                    LJII.LJIILLIIL = true;
                }
            }
        }
        C79007HCn.LJII().LJIIZILJ = this.LIZJ;
        if (C79242HLo.LJIIIZ() && (abstractC6070q = this.LJIILLIIL) != null && (liveCore = abstractC6070q.getLiveCore()) != null) {
            liveCore.setDisplay(LIZLLL());
        }
        AbstractC6070q abstractC6070q3 = this.LJIILLIIL;
        if (abstractC6070q3 != null && (liveStream = abstractC6070q3.getLiveStream()) != null) {
            liveStream.LJIIIIZZ();
        }
        C422242nK.LIZ(this.context, LJJIIJ().LJFF());
        HHA hha = this.LJIIZILJ;
        if (hha != null) {
            HHA.LIZ(hha, this.LJIILLIIL, this, false, false, 12, null);
        }
        C6094ae c6094ae4 = c5176i.LIZJ;
        if (c6094ae4 == null || (str2 = c6094ae4.LIZJ) == null) {
            str2 = "";
        }
        this.LJIJ = str2;
        C6094ae c6094ae5 = c5176i.LIZJ;
        if (c6094ae5 != null) {
            z = c6094ae5.LJIIJ;
        }
        this.LJIJI = z;
        C6094ae c6094ae6 = c5176i.LIZJ;
        if (c6094ae6 != null && c6094ae6.LJI != null) {
            SettingKey<C6860br> settingKey2 = LiveSettingKeys.LIST_USER_VERSION_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            if (settingKey2.getValue().LJI) {
                AbstractC78986HBs<T> LIZ2 = LIZ();
                if (!(LIZ2 instanceof C4806x)) {
                    LIZ2 = null;
                }
                C4806x c4806x = (C4806x) LIZ2;
                if (c4806x != null) {
                    C6094ae c6094ae7 = c5176i.LIZJ;
                    Intrinsics.checkNotNullExpressionValue(c6094ae7, "");
                    c4806x.LIZ(c6094ae7);
                }
            }
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(7);
        LinkAudienceApi linkAudienceApi = (LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class);
        String jSONArray2 = jSONArray.toString();
        Room room = this.LJIILJJIL;
        if (room == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        ((KDS) linkAudienceApi.getAudienceSettings(jSONArray2, room.getId()).compose(C100839PnV.LIZJ()).m149as(autoDispose())).LIZ(C77955GoH.LIZIZ, C3812017y.LIZIZ);
        LinkAudienceApi linkAudienceApi2 = (LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class);
        Room room2 = this.LJIILJJIL;
        if (room2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        ((AbstractC81278I1w) linkAudienceApi2.fetchInteractEntrances(room2.getId(), 0L).compose(C100839PnV.LIZJ()).m151as(autoDispose())).LIZ(new H1S(this), C3812117z.LIZIZ);
    }

    public void LIZ(int i, HK9 hk9) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), hk9}, this, LJIILIIL, false, 17).isSupported) {
            return;
        }
        hk9.LIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZIZ(long j, Exception exc) {
        C78999HCf c78999HCf;
        if (!PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LJIILIIL, false, 42).isSupported && (c78999HCf = this.LJIILL) != null) {
            c78999HCf.LIZ("leave_on_rtc_error");
        }
    }

    public void LIZJ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LJIILIIL, false, 43).isSupported) {
            return;
        }
        HHA hha = this.LJIIZILJ;
        if (hha != null) {
            hha.LIZ();
        }
        C81980ISw c81980ISw = this.LJJ;
        if (c81980ISw != null) {
            c81980ISw.LIZJ();
        }
    }

    public void LIZ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LJIILIIL, false, 41).isSupported) {
            return;
        }
        C77874Gmy.LIZ(false);
        C78999HCf c78999HCf = this.LJIILL;
        if (c78999HCf != null) {
            c78999HCf.LIZ("leave_on_rtc_error");
        }
    }

    public final void LIZ(OperateType operateType, int i, AbstractC80546Hoy<C4826b> abstractC80546Hoy) {
        if (PatchProxy.proxy(new Object[]{operateType, Integer.valueOf(i), abstractC80546Hoy}, this, LJIILIIL, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(operateType, abstractC80546Hoy);
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        int LIZJ = LIZJ();
        Room room = this.LJIILJJIL;
        if (room == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C80517HoV.LIZ().LIZ(new C4825a(context, LIZJ, operateType, i, room, 0L, null, null, 224), abstractC80546Hoy);
    }

    public static /* synthetic */ AbstractC6070q LIZ(BaseGuestLinkWidget baseGuestLinkWidget, String str, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{baseGuestLinkWidget, null, 1, null}, null, LJIILIIL, true, 18);
        if (proxy.isSupported) {
            return (AbstractC6070q) proxy.result;
        }
        return baseGuestLinkWidget.LIZIZ("");
    }

    public void LIZIZ(long j, String str, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2)}, this, LJIILIIL, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (i == ReplyType.Reject.ordinal()) {
            C78999HCf c78999HCf = this.LJIILL;
            if (c78999HCf != null) {
                c78999HCf.LIZ(j, str, i, i2);
                return;
            }
            return;
        }
        LIZ(OperateType.REPLY, i2, new HDN(this, i2, j, str, i));
    }

    public void LIZ(int i, int i2, int i3, LinkApplyType linkApplyType, String str, Integer num, Integer num2, Integer num3, boolean z, boolean z2, int i4, AbstractC4264a abstractC4264a) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), linkApplyType, str, num, num2, num3, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i4), abstractC4264a}, this, LJIILIIL, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkApplyType, str);
        LIZ(OperateType.APPLY, i, new H6F(this, i, i2, i3, linkApplyType, str, num, num2, z, z2, i4));
    }

    public static /* synthetic */ void LIZ(BaseGuestLinkWidget baseGuestLinkWidget, int i, int i2, int i3, LinkApplyType linkApplyType, String str, Integer num, Integer num2, Integer num3, boolean z, boolean z2, int i4, AbstractC4264a abstractC4264a, int i5, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        byte b3 = z2 ? (byte) 1 : (byte) 0;
        byte b4 = z2 ? (byte) 1 : (byte) 0;
        AbstractC4264a abstractC4264a2 = null;
        if (PatchProxy.proxy(new Object[]{baseGuestLinkWidget, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), linkApplyType, str, num, num2, num3, Byte.valueOf(b), Byte.valueOf(b3), Integer.valueOf(i4), abstractC4264a, Integer.valueOf(i5), null}, null, LJIILIIL, true, 15).isSupported) {
            return;
        }
        if ((i5 & 8) != 0) {
            linkApplyType = LinkApplyType.NORMAL;
        }
        if ((i5 & 32) != 0) {
            num = null;
        }
        if ((i5 & 64) != 0) {
            num2 = null;
        }
        if ((i5 & 128) != 0) {
            num3 = null;
        }
        if ((i5 & 256) != 0) {
            z = false;
        }
        if ((i5 & 512) != 0) {
            z2 = false;
        }
        if ((i5 & AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END) != 0) {
            i4 = 0;
        }
        if ((i5 & AccessibilityEventCompat.TYPE_WINDOW_CONTENT_CHANGED) == 0) {
            abstractC4264a2 = abstractC4264a;
        }
        baseGuestLinkWidget.LIZ(i, i2, i3, linkApplyType, str, num, num2, num3, z, z2, i4, abstractC4264a2);
    }
}
