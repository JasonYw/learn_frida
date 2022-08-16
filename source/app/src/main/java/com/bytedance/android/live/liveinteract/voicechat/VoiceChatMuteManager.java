package com.bytedance.android.live.liveinteract.voicechat;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.base.exception.ApiException;
import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.live.liveinteract.plantform.core.C4806x;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.livesdk.config.C6860br;
import com.bytedance.android.livesdk.config.C6963er;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.heytap.mcssdk.constant.C15151a;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC4569445g;
import p003X.AbstractC78720H1m;
import p003X.AbstractC79093HFv;
import p003X.C106862S5w;
import p003X.C79007HCn;
import p003X.C79017HCx;
import p003X.C79024HDe;
import p003X.C79025HDf;
import p003X.C79037HDr;
import p003X.C79045HDz;
import p003X.C79242HLo;
import p003X.C88306Kqq;
import p003X.H3J;
import p003X.HD2;
import p003X.HD3;
import p003X.HD5;
import p003X.HD6;
import p003X.HDP;
import p003X.HEE;
import p003X.HGD;
import p003X.HGG;
import p003X.HGH;
import p003X.HGI;
import p003X.HGJ;
import p003X.HH8;

/* loaded from: classes3.dex */
public final class VoiceChatMuteManager implements AbstractC78720H1m, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LJI;
    public final C6963er LJIIJ;
    public final Boolean LJIIJJI;
    public final C4806x LJIIL;
    public final DataCenter LJIILIIL;
    public final AbstractC4998a LJIILJJIL;
    public final boolean LJIILLIIL;
    public final HEE LJIIZILJ;
    public int LJIJ;
    public final Room LJIJI;
    public final boolean LJIJJ;
    public final LifecycleOwner LJIJJLI;
    public final String LIZLLL = "VoiceChatMuteManager";

    /* renamed from: LJ */
    public final CopyOnWriteArrayList<AbstractC4989a> f26472LJ = new CopyOnWriteArrayList<>();
    public final CompositeDisposable LJIILL = new CompositeDisposable();
    public final MutableLiveData<Boolean> LJFF = new MutableLiveData<>();
    public long LJII = System.currentTimeMillis();
    public long LJIIIIZZ = System.currentTimeMillis();
    public long LJIIIZ = System.currentTimeMillis();

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.VoiceChatMuteManager$a */
    /* loaded from: classes3.dex */
    public interface AbstractC4989a {
        static {
            Covode.recordClassIndex(30817);
        }

        void LIZ(long j);

        void LIZ(long j, Throwable th);

        void LIZIZ(long j);

        void LIZIZ(long j, Throwable th);
    }

    static {
        Covode.recordClassIndex(30816);
    }

    public static boolean LIZJ(long j) {
        return j > 12000 && j < C15151a.f30809f;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 36).isSupported) {
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event != Lifecycle.Event.ON_PAUSE) {
        } else {
            onPause();
        }
    }

    @Override // p003X.AbstractC78720H1m
    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        return proxy.isSupported ? ((Boolean) proxy.result).booleanValue() : this.LJIILJJIL.LIZJ();
    }

    @Override // p003X.AbstractC78720H1m
    public final void LIZ(boolean z, AbstractC79093HFv abstractC79093HFv) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), abstractC79093HFv}, this, LIZ, false, 14).isSupported) {
            return;
        }
        if (z) {
            long LIZ2 = C79242HLo.LIZ();
            if (PatchProxy.proxy(new Object[]{new Long(LIZ2)}, this, LIZ, false, 30).isSupported || this.LIZJ) {
                return;
            }
            this.LIZJ = true;
            this.LJII = System.currentTimeMillis();
            HDP.LIZIZ(LIZ2);
            this.LJIILL.add(((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).unSilence(this.LJIJI.getId(), LIZ2, true).subscribeOn(Schedulers.m138io()).flatMap(HGD.LIZIZ).observeOn(AndroidSchedulers.mainThread()).subscribe(new HD5(this, LIZ2), new C79037HDr(this, LIZ2)));
            return;
        }
        LIZIZ(this, C79242HLo.LIZ(), true, false, null, abstractC79093HFv, 12, null);
    }

    @Override // p003X.AbstractC78720H1m
    public final boolean LIZ(boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 17);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        LinkPlayerInfo LIZIZ = this.LJIIL.LIZIZ(C79242HLo.LIZ(), C79007HCn.LJII().LIZLLL);
        return this.LJIJJ || !z || !(LIZIZ == null || LIZIZ.LJIIL == 2);
    }

    public final boolean LIZIZ() {
        if (!this.LIZIZ && !this.LIZJ) {
            return false;
        }
        return true;
    }

    public final boolean LJIIIIZZ() {
        if (this.LJIILLIIL && this.LJIIL.LJIIJJI > 0) {
            return true;
        }
        return false;
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LJFF.setValue(Boolean.FALSE);
        this.LJIJJLI.mo29786getLifecycle().addObserver(this);
        this.LJIIL.LIZ(this.LJIIZILJ);
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJIILL.clear();
        this.f26472LJ.clear();
        this.LJIJJLI.mo29786getLifecycle().removeObserver(this);
        this.LJIIL.LIZIZ(this.LJIIZILJ);
    }

    /* renamed from: LJ */
    public final boolean m15663LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Boolean value = this.LJFF.getValue();
        if (value == null) {
            return false;
        }
        return value.booleanValue();
    }

    public final int LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 18);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        LinkPlayerInfo LIZIZ = this.LJIIL.LIZIZ(C79242HLo.LIZ(), C79007HCn.LJII().LIZLLL);
        if (LIZIZ != null) {
            return LIZIZ.LJIIL;
        }
        return -1;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        new StringBuilder();
        ALogger.m15797i("voice_chat", C0002O.m25086C(this.LIZLLL, " onPause"));
        this.LJI = true;
        this.LJIIIZ = System.currentTimeMillis();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        new StringBuilder();
        ALogger.m15797i("voice_chat", C0002O.m25086C(this.LIZLLL, " onResume"));
        this.LJI = false;
        this.LJIIIZ = System.currentTimeMillis();
    }

    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 31).isSupported) {
            return;
        }
        long LIZ2 = C79242HLo.LIZ();
        this.LJII = System.currentTimeMillis();
        HDP.LIZ(LIZ2);
        this.LJIILL.add(((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).silence(this.LJIJI.getId(), LIZ2, 0, true).subscribeOn(Schedulers.m138io()).flatMap(HGH.LIZIZ).observeOn(AndroidSchedulers.mainThread()).subscribe(new HD6(this, LIZ2), new C79045HDz(this, LIZ2)));
    }

    public final void LJII() {
        Boolean LIZLLL;
        String str;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 32).isSupported && !LIZIZ() && LIZ() && LJIIIIZZ() && (LIZLLL = this.LJIILJJIL.LIZLLL()) != null && LIZLLL.booleanValue()) {
            this.LJIJ++;
            long currentTimeMillis = System.currentTimeMillis();
            long LJIIL = currentTimeMillis - this.LJIIL.LJIIL();
            long j = currentTimeMillis - this.LJII;
            long j2 = currentTimeMillis - this.LJIIIIZZ;
            long j3 = currentTimeMillis - this.LJIIIZ;
            C4806x.C4807a c4807a = this.LJIIL.LJIIJ;
            if (c4807a == null || (str = c4807a.toString()) == null) {
                str = "";
            }
            if (this.LJIJ < 3) {
                HH8.LIZIZ.LIZ(false, str, LJIIL, j, j2, j3);
                return;
            }
            HH8.LIZIZ.LIZ(true, str, LJIIL, j, j2, j3);
            if (this.LJIIJ.LIZJ && !this.LIZIZ) {
                this.LJIJ = 0;
                this.LIZIZ = true;
                this.LJII = System.currentTimeMillis();
                long currentTimeMillis2 = System.currentTimeMillis();
                HDP.LIZ(C79242HLo.LIZ());
                this.LJIILL.add(((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).silence(this.LJIJI.getId(), C79242HLo.LIZ(), 0).subscribeOn(Schedulers.m138io()).flatMap(HGG.LIZIZ).observeOn(AndroidSchedulers.mainThread()).subscribe(new HD2(this, currentTimeMillis2, "auto silence when mute"), new H3J(this, currentTimeMillis2, "auto silence when mute")));
            }
        }
    }

    @Override // p003X.AbstractC78720H1m
    public final void LIZ(AbstractC4989a abstractC4989a) {
        if (PatchProxy.proxy(new Object[]{abstractC4989a}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC4989a);
        this.f26472LJ.add(abstractC4989a);
    }

    @Override // p003X.AbstractC78720H1m
    public final void LIZIZ(AbstractC4989a abstractC4989a) {
        if (PatchProxy.proxy(new Object[]{abstractC4989a}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC4989a);
        this.f26472LJ.remove(abstractC4989a);
    }

    @Override // p003X.AbstractC78720H1m
    public final void LIZ(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 15).isSupported) {
            return;
        }
        LIZ(this, j, false, false, null, null, 28, null);
    }

    @Override // p003X.AbstractC78720H1m
    public final void LIZIZ(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 16).isSupported) {
            return;
        }
        LIZIZ(this, j, false, false, null, null, 28, null);
    }

    @Override // p003X.AbstractC78720H1m
    public final void LIZ(AbstractC79093HFv abstractC79093HFv) {
        if (PatchProxy.proxy(new Object[]{abstractC79093HFv}, this, LIZ, false, 13).isSupported) {
            return;
        }
        boolean z = this.LJIJJ;
        LIZ(this, C79242HLo.LIZ(), true, false, null, abstractC79093HFv, 12, null);
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 22).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJFF.setValue(Boolean.FALSE);
        ALogger.m15797i("voice_chat", C0002O.m25086C("autoUnMuteSelf ", str));
        LIZIZ(this, C79242HLo.LIZ(), true, false, str, null, 20, null);
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 19).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJFF.setValue(Boolean.TRUE);
        ALogger.m15797i("voice_chat", C0002O.m25086C("autoMuteSelf ", str));
        LIZ(this, C79242HLo.LIZ(), true, true, str, null, 16, null);
    }

    public final void LIZIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        this.LJII = System.currentTimeMillis();
        this.LJFF.postValue(Boolean.valueOf(z));
    }

    public final void LIZ(Throwable th) {
        String str;
        if (PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 33).isSupported) {
            return;
        }
        C106862S5w.LIZ(th);
        if (!(th instanceof ApiServerException)) {
            return;
        }
        int i = ((ApiException) th).mErrorCode;
        if (i == 4004031 || i == 4004054) {
            int LJFF = LJFF();
            Boolean LIZLLL = this.LJIILJJIL.LIZLLL();
            if (LJFF != 0 && Intrinsics.areEqual(LIZLLL, Boolean.FALSE)) {
                if (i == 4004054) {
                    str = "unsilence failed not allowed";
                } else {
                    str = "silence failed already mute";
                }
                if (this.LJIIJ.LIZ) {
                    this.LJIILJJIL.LIZ(true, str);
                    this.LJIILIIL.put("data_self_is_silenced", Boolean.TRUE);
                    this.LJFF.postValue(Boolean.TRUE);
                }
                HH8.LIZIZ.LIZ(str, i, LJFF);
            }
        }
    }

    private final void LIZ(long j, boolean z, boolean z2, String str, AbstractC79093HFv abstractC79093HFv) {
        if (PatchProxy.proxy(new Object[]{new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str, abstractC79093HFv}, this, LIZ, false, 25).isSupported || this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        this.LJII = System.currentTimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        HDP.LIZ(j);
        this.LJIILL.add(((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).silence(this.LJIJI.getId(), j, z2 ? 1 : 0).subscribeOn(Schedulers.m138io()).flatMap(HGI.LIZIZ).observeOn(AndroidSchedulers.mainThread()).subscribe(new C79017HCx(this, j, str, currentTimeMillis, z2, z, abstractC79093HFv), new C79025HDf(this, j, currentTimeMillis, str, z2, abstractC79093HFv)));
    }

    private final void LIZIZ(long j, boolean z, boolean z2, String str, AbstractC79093HFv abstractC79093HFv) {
        if (PatchProxy.proxy(new Object[]{new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str, abstractC79093HFv}, this, LIZ, false, 28).isSupported || this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        this.LJII = System.currentTimeMillis();
        HDP.LIZIZ(j);
        this.LJIILL.add(((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).unSilence(this.LJIJI.getId(), j).subscribeOn(Schedulers.m138io()).flatMap(HGJ.LIZIZ).observeOn(AndroidSchedulers.mainThread()).subscribe(new HD3(this, j, str, z2, z, abstractC79093HFv), new C79024HDe(this, j, str, z2, abstractC79093HFv)));
    }

    public VoiceChatMuteManager(Room room, boolean z, C4806x c4806x, DataCenter dataCenter, AbstractC4998a abstractC4998a, LifecycleOwner lifecycleOwner) {
        boolean z2;
        C106862S5w.LIZ(room, c4806x, dataCenter, abstractC4998a, lifecycleOwner);
        this.LJIJI = room;
        this.LJIJJ = z;
        this.LJIIL = c4806x;
        this.LJIILIIL = dataCenter;
        this.LJIILJJIL = abstractC4998a;
        this.LJIJJLI = lifecycleOwner;
        SettingKey<C6963er> settingKey = LiveConfigSettingKeys.LINK_MUTE_FALLBACK_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        this.LJIIJ = settingKey.getValue();
        SettingKey<Boolean> settingKey2 = LiveConfigSettingKeys.LINK_ENABLE_RESET_MUTE_WHEN_INCONSISTENT;
        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
        this.LJIIJJI = settingKey2.getValue();
        SettingKey<C6860br> settingKey3 = LiveSettingKeys.LIST_USER_VERSION_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey3, "");
        if (settingKey3.getValue().LIZ) {
            SettingKey<Boolean> settingKey4 = LiveSettingKeys.LIVE_INTERACT_API_LIST_USER_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey4, "");
            Boolean value = settingKey4.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                z2 = true;
                this.LJIILLIIL = z2;
                this.LJIIZILJ = new HEE(this);
            }
        }
        z2 = false;
        this.LJIILLIIL = z2;
        this.LJIIZILJ = new HEE(this);
    }

    public static /* synthetic */ void LIZ(VoiceChatMuteManager voiceChatMuteManager, long j, boolean z, boolean z2, String str, AbstractC79093HFv abstractC79093HFv, int i, Object obj) {
        boolean z3 = z2;
        String str2 = str;
        byte b = z3 ? (byte) 1 : (byte) 0;
        byte b2 = z3 ? (byte) 1 : (byte) 0;
        AbstractC79093HFv abstractC79093HFv2 = null;
        if (PatchProxy.proxy(new Object[]{voiceChatMuteManager, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(b), str2, abstractC79093HFv, Integer.valueOf(i), null}, null, LIZ, true, 26).isSupported) {
            return;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            str2 = "";
        }
        if ((i & 16) == 0) {
            abstractC79093HFv2 = abstractC79093HFv;
        }
        voiceChatMuteManager.LIZ(j, z, z3, str2, abstractC79093HFv2);
    }

    public static /* synthetic */ void LIZIZ(VoiceChatMuteManager voiceChatMuteManager, long j, boolean z, boolean z2, String str, AbstractC79093HFv abstractC79093HFv, int i, Object obj) {
        String str2 = str;
        AbstractC79093HFv abstractC79093HFv2 = null;
        if (PatchProxy.proxy(new Object[]{voiceChatMuteManager, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 0, str2, abstractC79093HFv, Integer.valueOf(i), null}, null, LIZ, true, 29).isSupported) {
            return;
        }
        if ((i & 8) != 0) {
            str2 = "";
        }
        if ((i & 16) == 0) {
            abstractC79093HFv2 = abstractC79093HFv;
        }
        voiceChatMuteManager.LIZIZ(j, z, false, str2, abstractC79093HFv2);
    }
}
