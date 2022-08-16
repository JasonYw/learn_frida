package com.bytedance.android.live.effect.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.effect.C4202f;
import com.bytedance.android.live.effect.api.AbstractC4169j;
import com.bytedance.android.live.effect.api.AbstractC4172k;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.base.C4181a;
import com.bytedance.android.live.effect.base.setting.LiveEffectSettingKeys;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.p329a.a$a;
import com.bytedance.android.live.effect.template.BeautifyTemplate;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.livehostapi.business.depend.AbstractC5793k;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.avframework.livestreamv2.filter.IAudioFilterManager;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC4569445g;
import p003X.AbstractC86595KAj;
import p003X.AbstractC86605KAt;
import p003X.AbstractC86668KDe;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C144769ebr;
import p003X.C144772ebu;
import p003X.C17J;
import p003X.C17K;
import p003X.C86465K5j;
import p003X.C86587KAb;
import p003X.C86589KAd;
import p003X.C86590KAe;
import p003X.C86593KAh;
import p003X.C86597KAl;
import p003X.C86598KAm;
import p003X.C86599KAn;
import p003X.C86602KAq;
import p003X.C86603KAr;
import p003X.C86604KAs;
import p003X.C86676KDm;
import p003X.C86722KFg;
import p003X.C87010KQi;
import p003X.DialogInterface$OnDismissListenerC86464K5i;
import p003X.DialogInterface$OnDismissListenerC86591KAf;
import p003X.DialogInterface$OnDismissListenerC86596KAk;
import p003X.K3E;
import p003X.K7D;
import p003X.KAQ;
import p003X.KAX;
import p003X.KCS;
import p003X.KCT;
import p003X.KDP;
import p003X.KE1;
import p003X.KEB;
import p003X.KFQ;
import p003X.KG3;
import p003X.KGD;
import p003X.KGJ;
import p003X.KHM;
import p003X.KHN;
import p003X.KIA;
import p003X.KIT;
import p003X.LK5;
import p003X.RunnableC86600KAo;

/* loaded from: classes5.dex */
public final class EffectLiveBroadcastActivityProxy extends LiveEffectActivityProxy implements MessageCenter.Listener, WeakHandler.IHandler, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public AbstractC5436a LIZIZ;
    public AbstractC86595KAj LIZJ;

    /* renamed from: LJ */
    public KAQ f26244LJ;
    public KHM LJFF;
    public KHN LJI;
    public boolean LJIIIIZZ;
    public KE1 LJIIIZ;
    public C144769ebr LJIIJ;
    public C4202f LJIIJJI;
    public Sticker LJIIL;
    public long LJIILIIL;
    public Disposable LJIILJJIL;
    public boolean LJIIZILJ;
    public Function0<Unit> LJIJ;
    public IAudioFilterManager LJJI;
    public boolean LJJIFFI;
    public C9078n LJJIII;
    public KFQ LJJIIJ;
    public C9078n LJJIIJZLJL;
    public Disposable LJJIIZ;
    public Disposable LJJIIZI;
    public Sticker LJJIJ;
    public long LJJIJIIJI;
    public long LJJIJIL;
    public boolean LJJIJLIJ;
    public final WeakHandler LIZLLL = new WeakHandler(this);
    public final Lazy LJJII = LazyKt__LazyJVMKt.lazy(EffectLiveBroadcastActivityProxy$compositeDisposable$2.INSTANCE);
    public final ArrayList<Long> LJII = new ArrayList<>();
    public String LJJIJIIJIL = "0";
    public Map<Long, Long> LJJIJL = new LinkedHashMap();
    public final ArrayList<String> LJIILL = new ArrayList<>();
    public final HashMap<String, Runnable> LJIILLIIL = new HashMap<>();
    public final a$a LJJIL = new C86593KAh(this);
    public final AbstractC4169j.AbstractC4171b LJIJI = new C86589KAd(this);
    public final AbstractC4169j.AbstractC4170a LJIJJ = new KAX(this);
    public final KCT LJIJJLI = new KCS();

    static {
        Covode.recordClassIndex(24794);
    }

    private CompositeDisposable LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (CompositeDisposable) (proxy.isSupported ? proxy.result : this.LJJII.mo27335getValue());
    }

    public final void onEvent(C86603KAr c86603KAr) {
    }

    @Override // com.bytedance.android.live.effect.view.LiveEffectActivityProxy, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 46).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LIZ(IAudioFilterManager iAudioFilterManager) {
        if (PatchProxy.proxy(new Object[]{iAudioFilterManager}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(iAudioFilterManager);
        this.LJJI = iAudioFilterManager;
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 25).isSupported) {
            return;
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_ANCHOR_USE_NEW_STICKER_DIALOG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            KHN khn = this.LJI;
            if (khn != null && khn.LJIILIIL()) {
                return;
            }
            KHN khn2 = this.LJI;
            if (khn2 != null) {
                FragmentActivity fragmentActivity = this.LJJ;
                Intrinsics.checkNotNullExpressionValue(fragmentActivity, "");
                khn2.showNow(fragmentActivity.getSupportFragmentManager(), "LiveStickerComposerDialogV2");
            }
        } else {
            if (this.LJFF == null) {
                this.LJFF = new KHM(this.LJJ, LiveEffectContextFactory.Type.DEFAULT);
                KHM khm = this.LJFF;
                if (khm != null) {
                    khm.LJIIL = 1;
                }
                KHM khm2 = this.LJFF;
                if (khm2 != null) {
                    C116971W2r.LIZ(khm2, DialogInterface$OnDismissListenerC86596KAk.LIZ);
                }
            }
            KHM khm3 = this.LJFF;
            if (khm3 != null && khm3.isShowing()) {
                return;
            }
            KHM khm4 = this.LJFF;
            if (khm4 != null) {
                C116971W2r.LIZJ(khm4);
            }
        }
        if (!z) {
            return;
        }
        AbstractC86605KAt LIZIZ = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("event_page", "live_take_detail");
        hashMap.put("event_type", "click");
        hashMap.put("event_belong", "live_take");
        hashMap.put("content_type", "normal_type");
        LIZIZ.LIZ("pm_live_sticker_click", hashMap);
    }

    public final void LIZ(Sticker sticker, boolean z) {
        if (PatchProxy.proxy(new Object[]{sticker, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 33).isSupported) {
            return;
        }
        Sticker sticker2 = this.LJJIJ;
        if (sticker2 != null) {
            if (!z || (!Intrinsics.areEqual(sticker2, sticker))) {
                long currentTimeMillis = (System.currentTimeMillis() - this.LJJIJIIJI) / 1000;
                if (currentTimeMillis != 0) {
                    AbstractC86605KAt LIZIZ = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ();
                    HashMap<String, String> hashMap = new HashMap<>();
                    Sticker sticker3 = this.LJJIJ;
                    hashMap.put("makeup_id", String.valueOf(sticker3 != null ? Long.valueOf(sticker3.getId()) : null));
                    hashMap.put("use_time", String.valueOf(currentTimeMillis));
                    LIZIZ.LIZ("livesdk_makeup_use_time", hashMap);
                }
                this.LJJIJ = null;
                this.LJJIJIIJI = 0L;
            }
            this.LJJIJ = sticker;
            this.LJJIJIIJI = System.currentTimeMillis();
        }
        if (!z) {
            return;
        }
        this.LJJIJ = sticker;
        this.LJJIJIIJI = System.currentTimeMillis();
    }

    public final void LIZ(String str, float f) {
        if (!PatchProxy.proxy(new Object[]{str, Float.valueOf(f)}, this, LIZ, false, 36).isSupported && AbstractC86668KDe.LIZ.LIZ(LiveEffectContextFactory.Type.DEFAULT).booleanValue()) {
            if (this.LJIILLIIL.containsKey(str)) {
                this.LIZLLL.removeCallbacks(this.LJIILLIIL.remove(str));
                ALogger.m15801d("EffectLiveBroadcastActivityProxy", C0002O.m25085C("sendBeautyUseLog: RunnableMap contains ", str, ", clear"));
            }
            if (f == 0.0f) {
                return;
            }
            RunnableC86600KAo runnableC86600KAo = new RunnableC86600KAo(this, str, f);
            this.LJIILLIIL.put(str, runnableC86600KAo);
            ALogger.m15801d("EffectLiveBroadcastActivityProxy", C0002O.m25086C("sendBeautyUseLog: add runnable for ", str));
            WeakHandler weakHandler = this.LIZLLL;
            SettingKey<Long> settingKey = LiveEffectSettingKeys.LIVE_FACE_STICKER_EFFECTIVELY_USE_TIME;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            weakHandler.postDelayed(runnableC86600KAo, settingKey.getValue().longValue() * 1000);
        }
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        KFQ kfq = this.LJJIIJ;
        if (kfq != null) {
            kfq.dismiss();
        }
        C9078n c9078n = this.LJJIII;
        if (c9078n != null) {
            c9078n.dismiss();
        }
    }

    public final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 41).isSupported) {
            return;
        }
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ().LIZ("live_gesture_use_success", new HashMap<>());
    }

    @Override // com.bytedance.android.live.effect.view.LiveEffectActivityProxy
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onDestroy();
        MessageCenter.removeListener(this);
        LJIIJ().clear();
        AbstractC86668KDe.LJIIJJI.LIZ(LiveEffectContextFactory.Type.DEFAULT, 0);
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJIIIIZZ();
        KE1 ke1 = this.LJIIIZ;
        if (ke1 != null) {
            ke1.LJIIL();
        }
    }

    public final void LIZ() {
        IAudioFilterManager iAudioFilterManager;
        KGJ LJII;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported && (iAudioFilterManager = this.LJJI) != null && !this.LJJIFFI && (LJII = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJII()) != null) {
            LJII.LIZ(iAudioFilterManager);
            KGJ.LIZ(LJII, null, null, 3, null);
            this.LJJIFFI = true;
        }
    }

    /* renamed from: LJ */
    public final void m15782LJ() {
        KGJ LJII;
        KGD kgd;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported && (LJII = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJII()) != null) {
            C86597KAl c86597KAl = KGD.f8402LJ;
            LiveEffectContextFactory.Type type = LiveEffectContextFactory.Type.DEFAULT;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{LJII, type}, c86597KAl, C86597KAl.LIZ, false, 1);
            if (proxy.isSupported) {
                kgd = (KGD) proxy.result;
            } else {
                C106862S5w.LIZ(LJII, type);
                kgd = new KGD();
                kgd.LIZJ = LJII;
                kgd.LIZIZ = type;
            }
            this.LJJIIJZLJL = kgd;
            C9078n c9078n = this.LJJIIJZLJL;
            if (c9078n != null) {
                FragmentActivity fragmentActivity = this.LJJ;
                Intrinsics.checkNotNullExpressionValue(fragmentActivity, "");
                c9078n.show(fragmentActivity.getSupportFragmentManager(), "soundEffectDialogTag");
            }
        }
    }

    public final void LJII() {
        Disposable disposable;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 38).isSupported) {
            return;
        }
        Disposable disposable2 = this.LJJIIZ;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.LJJIIZ) != null) {
            disposable.dispose();
        }
        this.LJJIIZ = Observable.timer(30L, TimeUnit.SECONDS).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C86465K5j(this), C17J.LIZ);
    }

    private final void LJIIJJI() {
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 42).isSupported) {
            return;
        }
        String str3 = null;
        if (!Intrinsics.areEqual(this.LJJIJIIJIL, "0")) {
            String str4 = this.LJJIJIIJIL;
            KE1 ke1 = this.LJIIIZ;
            if (ke1 != null) {
                str2 = ke1.m23498LJ();
            } else {
                str2 = null;
            }
            if (!Intrinsics.areEqual(str4, str2)) {
                long currentTimeMillis = (System.currentTimeMillis() - this.LJJIJIL) / 1000;
                if (currentTimeMillis != 0) {
                    AbstractC86605KAt LIZIZ = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ();
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("filter_id", this.LJJIJIIJIL);
                    hashMap.put("use_time", String.valueOf(currentTimeMillis));
                    hashMap.put("event_page", "live_take_detail");
                    LIZIZ.LIZ("livesdk_filter_use_time", hashMap);
                }
            }
        }
        String str5 = this.LJJIJIIJIL;
        KE1 ke12 = this.LJIIIZ;
        if (ke12 != null) {
            str3 = ke12.m23498LJ();
        }
        if (!Intrinsics.areEqual(str5, str3)) {
            this.LJJIJIL = System.currentTimeMillis();
            KE1 ke13 = this.LJIIIZ;
            if (ke13 == null || (str = ke13.m23498LJ()) == null) {
                str = "0";
            }
            this.LJJIJIIJIL = str;
        }
    }

    public final void LIZLLL() {
        KFQ kfq;
        Dialog dialog;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            return;
        }
        AbstractC86605KAt LIZIZ = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("event_page", "live_take_detail");
        hashMap.put("event_type", "click");
        hashMap.put("event_belong", "live_take");
        LIZIZ.LIZ("live_take_filter_click", hashMap);
        KFQ kfq2 = this.LJJIIJ;
        if (kfq2 != null && kfq2.getDialog() != null && (kfq = this.LJJIIJ) != null && (dialog = kfq.getDialog()) != null && dialog.isShowing()) {
            return;
        }
        a$a a_a = this.LJJIL;
        KEB LJI = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJI();
        Intrinsics.checkNotNullExpressionValue(LJI, "");
        List<FilterModel> list = LJI.LIZIZ;
        LiveEffectContextFactory.Type type = LiveEffectContextFactory.Type.DEFAULT;
        KFQ kfq3 = new KFQ();
        kfq3.LIZLLL = a_a;
        kfq3.f8396LJ = list;
        kfq3.LIZJ = type;
        Bundle bundle = new Bundle();
        bundle.putBoolean("bundle_full_screen", false);
        kfq3.setArguments(bundle);
        kfq3.LIZIZ = false;
        this.LJJIIJ = kfq3;
        KFQ kfq4 = this.LJJIIJ;
        if (kfq4 != null) {
            FragmentActivity fragmentActivity = this.LJJ;
            Intrinsics.checkNotNullExpressionValue(fragmentActivity, "");
            kfq4.show(fragmentActivity.getSupportFragmentManager(), "filterDialogTag");
        }
    }

    public final void LJFF() {
        Disposable disposable;
        C86722KFg c86722KFg;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            return;
        }
        if (this.f26244LJ == null) {
            Boolean value = LiveEffectSettingKeys.LIVE_ENABLE_VCD_EFFECT.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                C86598KAm c86598KAm = C86722KFg.f8400LJ;
                LiveEffectContextFactory.Type type = LiveEffectContextFactory.Type.DEFAULT;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{type}, c86598KAm, C86598KAm.LIZ, false, 1);
                if (proxy.isSupported) {
                    c86722KFg = (C86722KFg) proxy.result;
                } else {
                    C106862S5w.LIZ(type);
                    c86722KFg = new C86722KFg();
                    c86722KFg.LIZJ = type;
                }
                this.f26244LJ = c86722KFg;
            } else {
                Boolean value2 = LiveEffectSettingKeys.LIVE_ENABLE_NEW_GESTURE_DIALOG.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "");
                value2.booleanValue();
                this.f26244LJ = KIA.LJIIIIZZ.LIZ(LiveEffectContextFactory.Type.DEFAULT);
            }
            KAQ kaq = this.f26244LJ;
            if (kaq != null) {
                kaq.setOnDismissListener(new DialogInterface$OnDismissListenerC86464K5i(this));
            }
        }
        KAQ kaq2 = this.f26244LJ;
        if (kaq2 != null && kaq2.isShowing()) {
            return;
        }
        KAQ kaq3 = this.f26244LJ;
        if (kaq3 != null) {
            FragmentActivity fragmentActivity = this.LJJ;
            Intrinsics.checkNotNullExpressionValue(fragmentActivity, "");
            kaq3.show(fragmentActivity.getSupportFragmentManager(), KIT.class.getSimpleName());
        }
        Disposable disposable2 = this.LJJIIZ;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.LJJIIZ) != null) {
            disposable.dispose();
        }
        AbstractC86605KAt LIZIZ = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("event_page", "live_take_detail");
        hashMap.put("event_belong", "live_take");
        LIZIZ.LIZ("anchor_more_function_click_gesture", hashMap);
    }

    public final void LJI() {
        Sticker sticker;
        String str;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 32).isSupported && (sticker = this.LJIIL) != null) {
            long elapsedRealtime = (SystemClock.elapsedRealtime() - this.LJIILIIL) / 1000;
            AbstractC86605KAt LIZIZ = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ();
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("event_page", "live_take_detail");
            hashMap.put("event_belong", "live_take");
            hashMap.put("event_type", "click");
            hashMap.put("sticker_id", String.valueOf(sticker.getId()));
            hashMap.put("use_time", String.valueOf(elapsedRealtime));
            if (sticker.isVideoUsedSticker()) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("is_video_sticker", str);
            LIZIZ.LIZ("live_sticker_use_time", hashMap);
            C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ().LJII().LIZ(sticker.getId(), Long.valueOf(elapsedRealtime));
            this.LJIIL = null;
        }
    }

    @Override // com.bytedance.android.live.effect.view.LiveEffectActivityProxy
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onCreate();
        LIZ(C86602KAq.class);
        LIZ(C86603KAr.class);
        LIZ(K3E.class);
        LIZ(C144772ebu.class);
        Context LJIIJ = LK5.LJIIJ();
        Intrinsics.checkNotNullExpressionValue(LJIIJ, "");
        this.LJIIJJI = new C4202f(LJIIJ);
        MessageCenter.addListener(this);
        SettingKey<Boolean> settingKey = LiveEffectSettingKeys.LIVE_ENABLE_VCD_EFFECT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            AbstractC86668KDe.f8372LJ.LIZ(LiveEffectContextFactory.Type.DEFAULT, new HashMap());
        }
        SettingKey<Boolean> settingKey2 = LiveEffectSettingKeys.LIVE_STICKER_FAVORITE_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
        Boolean value2 = settingKey2.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        if (value2.booleanValue()) {
            AbstractC86668KDe.LJIIJJI.LIZ(LiveEffectContextFactory.Type.DEFAULT, 1);
        } else {
            AbstractC86668KDe.LJIIJJI.LIZ(LiveEffectContextFactory.Type.DEFAULT, 0);
        }
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ().LJII().LIZ();
    }

    public final void LIZIZ() {
        Disposable disposable;
        String str;
        String str2;
        Disposable disposable2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        Disposable disposable3 = this.LJJIIZ;
        if (disposable3 != null && !disposable3.isDisposed() && (disposable2 = this.LJJIIZ) != null) {
            disposable2.dispose();
        }
        Disposable disposable4 = this.LJJIIZI;
        if ((disposable4 == null || !disposable4.isDisposed()) && (disposable = this.LJJIIZI) != null) {
            disposable.dispose();
        }
        LIZ((Sticker) null, false);
        LJIIJJI();
        LIZJ(null, false);
        for (Runnable runnable : this.LJIILLIIL.values()) {
            this.LIZLLL.removeCallbacks(runnable);
        }
        AbstractC86605KAt LIZIZ = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("event_page", "anchor_live_ending");
        hashMap.put("event_belong", "live_take");
        hashMap.put("event_type", "other");
        String str3 = "use";
        if (!this.LJIIIIZZ) {
            str = "unused";
        } else {
            str = str3;
        }
        hashMap.put("use_status", str);
        LIZIZ.LIZ("pm_live_gesture_use", hashMap);
        this.LJIIIIZZ = false;
        AbstractC86605KAt LIZIZ2 = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ();
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("event_page", "anchor_live_ending");
        if (!this.LJIIZILJ) {
            str2 = "unused";
        } else {
            str2 = str3;
        }
        hashMap2.put("use_status", str2);
        LIZIZ2.LIZ("livesdk_live_beauty_use", hashMap2);
        this.LJIIZILJ = false;
        AbstractC86605KAt LIZIZ3 = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ();
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("event_page", "anchor_live_ending");
        hashMap3.put("event_type", "other");
        hashMap3.put("event_belong", "live_take");
        if (!this.LJJIJLIJ) {
            str3 = "unused";
        }
        hashMap3.put("use_status", str3);
        LIZIZ3.LIZ("pm_live_filter_use", hashMap3);
        this.LJJIJLIJ = false;
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJIIIIZZ();
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZIZ(this.LJIJI);
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZIZ(this.LJIJJ);
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZJ(C86676KDm.LIZLLL);
        LiveEffectContextFactory.Type type = LiveEffectContextFactory.Type.DEFAULT;
        if (!PatchProxy.proxy(new Object[]{type}, null, C86599KAn.LIZ, true, 2).isSupported) {
            C106862S5w.LIZ(type);
            HashMap<String, String> hashMap4 = new HashMap<>();
            hashMap4.put("is_default", String.valueOf(C86599KAn.LIZIZ ? 1 : 0));
            C4173o.LJIIJ.LIZ(type).LIZIZ().LIZ("livesdk_beauty_is_default", hashMap4);
        }
        this.LIZLLL.post(K7D.LIZIZ);
        KAQ kaq = this.f26244LJ;
        if (kaq != null) {
            kaq.dismissAllowingStateLoss();
        }
        this.f26244LJ = null;
        KHM khm = this.LJFF;
        if (khm != null) {
            C116971W2r.LIZ(khm);
        }
        KHN khn = this.LJI;
        if (khn != null) {
            khn.dismiss();
        }
        this.LJFF = null;
        this.LJI = null;
        LJI();
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ().LJII().LIZIZ();
    }

    public final void LIZ(AbstractC86595KAj abstractC86595KAj) {
        if (PatchProxy.proxy(new Object[]{abstractC86595KAj}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC86595KAj);
        this.LIZJ = abstractC86595KAj;
    }

    public final void onEvent(C86602KAq c86602KAq) {
        if (PatchProxy.proxy(new Object[]{c86602KAq}, this, LIZ, false, 13).isSupported || c86602KAq == null) {
            return;
        }
        LIZ(c86602KAq.LIZ);
    }

    private final void LIZ(Class<?> cls) {
        if (PatchProxy.proxy(new Object[]{cls}, this, LIZ, false, 11).isSupported) {
            return;
        }
        LJIIJ().add(C87010KQi.LIZ().LIZ((Class) cls).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C86590KAe(this)));
    }

    private void LIZJ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 17).isSupported) {
            return;
        }
        KE1 LJFF = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJFF();
        Intrinsics.checkNotNullExpressionValue(LJFF, "");
        String LJFF2 = LJFF.LJFF();
        Intrinsics.checkNotNullExpressionValue(LJFF2, "");
        AbstractC86595KAj abstractC86595KAj = this.LIZJ;
        if (abstractC86595KAj != null) {
            abstractC86595KAj.LIZ(LJFF2, z);
        }
    }

    public final void onEvent(C144772ebu c144772ebu) {
        C144769ebr c144769ebr;
        if (!PatchProxy.proxy(new Object[]{c144772ebu}, this, LIZ, false, 15).isSupported && (c144769ebr = this.LJIIJ) != null) {
            c144769ebr.onEvent(c144772ebu);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectLiveBroadcastActivityProxy(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        C106862S5w.LIZ(fragmentActivity);
        LJIIIZ();
    }

    public final void LIZIZ(boolean z) {
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 39).isSupported) {
            return;
        }
        LJIIJJI();
        this.LIZLLL.removeMessages(100);
        Message message = new Message();
        message.what = 100;
        KE1 LJFF = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJFF();
        Intrinsics.checkNotNullExpressionValue(LJFF, "");
        if (LJFF.LIZLLL() != 0) {
            KE1 ke1 = this.LJIIIZ;
            if (ke1 != null) {
                str2 = ke1.m23498LJ();
            } else {
                str2 = null;
            }
            message.obj = str2;
        } else {
            message.obj = "filter_none";
        }
        Bundle bundle = new Bundle();
        if (z) {
            str = "click";
        } else {
            str = "draw";
        }
        bundle.putString("action_type", str);
        message.setData(bundle);
        WeakHandler weakHandler = this.LIZLLL;
        SettingKey<Long> settingKey = LiveEffectSettingKeys.LIVE_FILTER_EFFECTIVELY_USE_TIME;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        weakHandler.sendMessageDelayed(message, settingKey.getValue().longValue() * 1000);
    }

    public final void onEvent(K3E k3e) {
        if (PatchProxy.proxy(new Object[]{k3e}, this, LIZ, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(k3e);
        if (k3e.LIZ == 1) {
            C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJFF().LIZIZ("live_take_detail", new HashMap<>());
            LIZJ(true);
            LIZIZ(false);
        } else if (k3e.LIZ == 2) {
            C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJFF().LIZ("live_take_detail", new HashMap<>());
            LIZJ(false);
            LIZIZ(false);
        } else if (k3e.LIZ == 3) {
            LIZIZ(true);
            return;
        }
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJFF();
        KE1.LIZ(LiveEffectContextFactory.Type.DEFAULT);
    }

    public final void LIZ(int i) {
        String str;
        boolean z = false;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 16).isSupported) {
            return;
        }
        KE1 LJFF = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJFF();
        Intrinsics.checkNotNullExpressionValue(LJFF, "");
        int LIZLLL = LJFF.LIZLLL();
        LJFF.LIZ(i);
        if (LIZLLL != i) {
            if (i < LIZLLL) {
                z = true;
            }
            LIZJ(z);
        }
        KEB LJI = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJI();
        Intrinsics.checkNotNullExpressionValue(LJI, "");
        List<FilterModel> list = LJI.LIZIZ;
        if (i >= list.size()) {
            str = "";
        } else {
            FilterModel filterModel = list.get(i);
            Intrinsics.checkNotNullExpressionValue(filterModel, "");
            str = filterModel.getFilterId();
            Intrinsics.checkNotNullExpressionValue(str, "");
        }
        if (!StringUtils.isEmpty(str) && (true ^ Intrinsics.areEqual(str, "0"))) {
            AbstractC86595KAj abstractC86595KAj = this.LIZJ;
            if (abstractC86595KAj != null) {
                abstractC86595KAj.LIZ(str);
            }
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("action_type", "click");
            hashMap.put("filter_id", str);
            hashMap.put("event_type", "click");
            hashMap.put("event_belong", "live_take");
            hashMap.put("event_page", "live_take_detail");
            C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ().LIZ("live_take_filter_select", hashMap);
        }
        KE1.LIZ(LiveEffectContextFactory.Type.DEFAULT);
        C87010KQi.LIZ().LIZ(new K3E(3));
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Bundle data;
        if (!PatchProxy.proxy(new Object[]{message}, this, LIZ, false, 45).isSupported && message != null && message.what == 100 && (message.obj instanceof String) && (data = message.getData()) != null && data.containsKey("action_type")) {
            Object obj = message.obj;
            if (!(obj instanceof String)) {
                obj = null;
            }
            String string = message.getData().getString("action_type");
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (!PatchProxy.proxy(new Object[]{obj, string}, this, LIZ, false, 40).isSupported) {
                AbstractC86605KAt LIZIZ = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ();
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("event_page", "live_take_detail");
                hashMap.put("event_type", "click");
                hashMap.put("event_belong", "live_take");
                hashMap.put("action_type", string);
                if (obj == null) {
                    obj = "";
                }
                hashMap.put("filter_id", obj);
                LIZIZ.LIZ("live_take_filter_effective_use", hashMap);
            }
            this.LJJIJLIJ = true;
        }
    }

    public final void LIZ(AbstractC5436a abstractC5436a) {
        if (PatchProxy.proxy(new Object[]{abstractC5436a}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC5436a);
        this.LIZIZ = abstractC5436a;
    }

    public final void LIZ(AbstractC5793k abstractC5793k) {
        if (PatchProxy.proxy(new Object[]{abstractC5793k}, this, LIZ, false, 28).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC5793k);
        if (this.LJI == null) {
            this.LJI = KHN.LJIILL.LIZ(LiveEffectContextFactory.Type.DEFAULT, 1);
            KHN khn = this.LJI;
            if (khn != null) {
                khn.LIZ(abstractC5793k);
            }
        }
    }

    public final void LIZIZ(Sticker sticker, boolean z) {
        Disposable disposable;
        if (PatchProxy.proxy(new Object[]{sticker, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 34).isSupported) {
            return;
        }
        Disposable disposable2 = this.LJJIIZI;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.LJJIIZI) != null) {
            disposable.dispose();
        }
        if (z && sticker != null && sticker.getEffect() != null && C86604KAs.LIZIZ(sticker.getEffect(), sticker, LiveEffectContextFactory.Type.DEFAULT) && AbstractC86668KDe.LJIIIZ.LIZ(LiveEffectContextFactory.Type.DEFAULT).booleanValue()) {
            Long value = LiveEffectSettingKeys.LIVE_FACE_STICKER_EFFECTIVELY_USE_TIME.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            this.LJJIIZI = Observable.timer(value.longValue(), TimeUnit.SECONDS).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C86587KAb(sticker), C17K.LIZIZ);
        }
    }

    public final void LIZ(BeautifyTemplate beautifyTemplate, Function0<Unit> function0) {
        if (PatchProxy.proxy(new Object[]{beautifyTemplate, function0}, this, LIZ, false, 19).isSupported) {
            return;
        }
        C106862S5w.LIZ(beautifyTemplate, function0);
        this.LJIJ = function0;
        AbstractC86605KAt LIZIZ = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("event_page", "live_take_detail");
        LIZIZ.LIZ("livesdk_anchor_beauty_click", hashMap);
        AbstractC4172k LJIIIIZZ = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ();
        FragmentActivity fragmentActivity = this.LJJ;
        a$a a_a = this.LJJIL;
        beautifyTemplate.LIZ(new C4181a(System.currentTimeMillis(), 1));
        this.LJJIII = LJIIIIZZ.LIZ(fragmentActivity, a_a, beautifyTemplate, "live_take_detail");
        C86604KAs.LIZ(LiveEffectContextFactory.Type.DEFAULT);
        C9078n c9078n = this.LJJIII;
        if (c9078n != null) {
            c9078n.setOnDismissListener(new DialogInterface$OnDismissListenerC86591KAf(this));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.livesdk.LiveDialogFragment");
    }

    public final void LIZJ(Sticker sticker, boolean z) {
        long j;
        if (PatchProxy.proxy(new Object[]{sticker, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 43).isSupported) {
            return;
        }
        if (sticker == null) {
            for (Map.Entry<Long, Long> entry : this.LJJIJL.entrySet()) {
                long currentTimeMillis = (System.currentTimeMillis() - entry.getValue().longValue()) / 1000;
                if (currentTimeMillis > 0) {
                    AbstractC86605KAt LIZIZ = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ();
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("filter_id", String.valueOf(entry.getKey().longValue()));
                    hashMap.put("use_time", String.valueOf(currentTimeMillis));
                    hashMap.put("event_page", "live_take_detail");
                    LIZIZ.LIZ("livesdk_gesture_use_time", hashMap);
                }
            }
            this.LJJIJL.clear();
        } else if (!z) {
            if (this.LJJIJL.containsKey(Long.valueOf(sticker.getId()))) {
                long currentTimeMillis2 = System.currentTimeMillis();
                Long l = this.LJJIJL.get(Long.valueOf(sticker.getId()));
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                long j2 = (currentTimeMillis2 - j) / 1000;
                if (j2 > 0) {
                    AbstractC86605KAt LIZIZ2 = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ();
                    HashMap<String, String> hashMap2 = new HashMap<>();
                    hashMap2.put("filter_id", String.valueOf(sticker.getId()));
                    hashMap2.put("use_time", String.valueOf(j2));
                    hashMap2.put("event_page", "live_take_detail");
                    LIZIZ2.LIZ("livesdk_gesture_use_time", hashMap2);
                }
                this.LJJIJL.remove(Long.valueOf(sticker.getId()));
            }
        } else if (!this.LJJIJL.containsKey(Long.valueOf(sticker.getId()))) {
            this.LJJIJL.put(Long.valueOf(sticker.getId()), Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, this, LIZ, false, 29).isSupported || i != 51 || this.LJIIJJI == null) {
            return;
        }
        for (Sticker sticker : C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZIZ(C86676KDm.LIZLLL)) {
            if (sticker.getGame()) {
                new StringBuilder();
                if (StringUtils.equal(C0002O.m25086C(sticker.getUnzipPath(), "/"), str)) {
                    C4202f c4202f = this.LJIIJJI;
                    if (c4202f != null) {
                        String effectId = sticker.getEffectId();
                        EffectLiveBroadcastActivityProxy$onMessageReceived$1 effectLiveBroadcastActivityProxy$onMessageReceived$1 = new EffectLiveBroadcastActivityProxy$onMessageReceived$1(this);
                        if (!PatchProxy.proxy(new Object[]{effectId, effectLiveBroadcastActivityProxy$onMessageReceived$1}, c4202f, C4202f.LIZ, false, 3).isSupported) {
                            C106862S5w.LIZ(effectId, effectLiveBroadcastActivityProxy$onMessageReceived$1);
                            Single.create(new KG3(c4202f, effectId)).compose(C100839PnV.LIZJ()).subscribe(new KDP(effectLiveBroadcastActivityProxy$onMessageReceived$1));
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
