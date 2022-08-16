package com.bytedance.android.live.effect.view;

import android.content.DialogInterface;
import android.os.Message;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.effect.C4198d;
import com.bytedance.android.live.effect.api.AbstractC4169j;
import com.bytedance.android.live.effect.api.AbstractC4172k;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.api.l$d;
import com.bytedance.android.live.effect.api.n$a;
import com.bytedance.android.live.effect.base.C4181a;
import com.bytedance.android.live.effect.base.setting.LiveEffectSettingKeys;
import com.bytedance.android.live.effect.event.C4199a;
import com.bytedance.android.live.effect.m$b;
import com.bytedance.android.live.effect.n$c;
import com.bytedance.android.live.effect.p329a.a$a;
import com.bytedance.android.live.effect.sticker.p330a.C4209g;
import com.bytedance.android.live.effect.template.BeautifyTemplate;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.effectmanager.effect.model.Effect;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC4569445g;
import p003X.AbstractC86605KAt;
import p003X.AbstractC86611KAz;
import p003X.AbstractC86668KDe;
import p003X.C106862S5w;
import p003X.C17L;
import p003X.C17M;
import p003X.C64646Bf6;
import p003X.C86586KAa;
import p003X.C86604KAs;
import p003X.C86610KAy;
import p003X.C86676KDm;
import p003X.C86699KEj;
import p003X.C86727KFl;
import p003X.C87010KQi;
import p003X.DialogInterface$OnDismissListenerC86588KAc;
import p003X.K8T;
import p003X.KAT;
import p003X.KAV;
import p003X.KAW;
import p003X.KAZ;
import p003X.KE1;
import p003X.RunnableC86601KAp;

/* loaded from: classes5.dex */
public final class EffectLivePreviewActivityProxy extends LiveEffectActivityProxy implements m$b, WeakHandler.IHandler, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public C4198d LIZIZ;
    public Effect LIZJ;
    public AbstractC86611KAz LIZLLL;

    /* renamed from: LJ */
    public DialogInterface.OnDismissListener f26245LJ;
    public Disposable LJFF;
    public KE1 LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIJ;
    public Disposable LJIIL;
    public Disposable LJIILIIL;
    public Sticker LJIILL;
    public long LJIILLIIL;
    public long LJIJ;
    public final WeakHandler LJIIJJI = new WeakHandler(this);
    public final Lazy LJIILJJIL = LazyKt__LazyJVMKt.lazy(EffectLivePreviewActivityProxy$compositeDisposable$2.INSTANCE);
    public String LJIIZILJ = "0";
    public final ArrayList<String> LJI = new ArrayList<>();
    public final HashMap<String, Runnable> LJIJI = new HashMap<>();
    public final Lazy LJIIIZ = LazyKt__LazyJVMKt.lazy(EffectLivePreviewActivityProxy$liveEffectSQLHelper$2.INSTANCE);
    public final Lazy LJIJJ = LazyKt__LazyJVMKt.lazy(new EffectLivePreviewActivityProxy$stickerPreloadListener$2(this));
    public final Lazy LJIJJLI = LazyKt__LazyJVMKt.lazy(new EffectLivePreviewActivityProxy$onItemClickListener$2(this));
    public final Lazy LJJI = LazyKt__LazyJVMKt.lazy(new EffectLivePreviewActivityProxy$mRemoteFilterGetListener$2(this));
    public final KAV LJJIFFI = new KAV(this);
    public final AbstractC4169j.AbstractC4170a LJJII = new KAW(this);

    static {
        Covode.recordClassIndex(24819);
    }

    private final CompositeDisposable LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (CompositeDisposable) (proxy.isSupported ? proxy.result : this.LJIILJJIL.mo27335getValue());
    }

    private final m$b LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (m$b) (proxy.isSupported ? proxy.result : this.LJJI.mo27335getValue());
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    @Override // com.bytedance.android.live.effect.view.LiveEffectActivityProxy, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 27).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    private final void LIZJ() {
        Disposable disposable;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        Disposable disposable2 = this.LJIIL;
        if ((disposable2 == null || !disposable2.isDisposed()) && (disposable = this.LJIIL) != null) {
            disposable.dispose();
        }
        LIZJ(null, false);
        for (Runnable runnable : this.LJIJI.values()) {
            this.LJIIJJI.removeCallbacks(runnable);
        }
        KE1 ke1 = this.LJII;
        if (ke1 != null) {
            ke1.LJIIL();
        }
        LIZ().clear();
    }

    @Override // com.bytedance.android.live.effect.view.LiveEffectActivityProxy
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onDestroy();
        if (!this.LJIIJ) {
            C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZJ(C86676KDm.LIZLLL);
            C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJIIIIZZ();
            C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZLLL();
            LIZJ();
        } else {
            this.LJIIJ = false;
        }
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJI().LIZIZ(LIZIZ());
    }

    private final void LIZLLL() {
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported) {
            return;
        }
        String str3 = null;
        if (!Intrinsics.areEqual(this.LJIIZILJ, "0")) {
            String str4 = this.LJIIZILJ;
            KE1 ke1 = this.LJII;
            if (ke1 != null) {
                str2 = ke1.m23498LJ();
            } else {
                str2 = null;
            }
            if (!Intrinsics.areEqual(str4, str2)) {
                long currentTimeMillis = (System.currentTimeMillis() - this.LJIJ) / 1000;
                if (currentTimeMillis != 0) {
                    AbstractC86605KAt LIZIZ = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ();
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("filter_id", this.LJIIZILJ);
                    hashMap.put("use_time", String.valueOf(currentTimeMillis));
                    hashMap.put("event_page", "live_take_page");
                    LIZIZ.LIZ("livesdk_filter_use_time", hashMap);
                }
            }
        }
        String str5 = this.LJIIZILJ;
        KE1 ke12 = this.LJII;
        if (ke12 != null) {
            str3 = ke12.m23498LJ();
        }
        if (!Intrinsics.areEqual(str5, str3)) {
            this.LJIJ = System.currentTimeMillis();
            KE1 ke13 = this.LJII;
            if (ke13 == null || (str = ke13.m23498LJ()) == null) {
                str = "0";
            }
            this.LJIIZILJ = str;
        }
    }

    @Override // com.bytedance.android.live.effect.view.LiveEffectActivityProxy
    public final void onCreate() {
        Object mo27335getValue;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJFF();
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJI().LIZ(LIZIZ());
        super.onCreate();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            ALogger.m15801d("EffectLivePreviewActivityProxy", "COMPOSER INIT : initializing config");
            C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ().LJI().LIZ(1, 0);
            AbstractC4169j LJII = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII();
            n$a n_a = new n$a();
            n_a.LIZ(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{C86676KDm.LIZJ, C86676KDm.LJI, "beauty", C86676KDm.LIZLLL, C86676KDm.LJIIIZ}));
            n_a.LIZIZ(CollectionsKt__CollectionsJVMKt.listOf("effect_gift"));
            AbstractC86611KAz abstractC86611KAz = this.LIZLLL;
            if (abstractC86611KAz == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            n_a.LIZ(new C86610KAy(abstractC86611KAz, LiveEffectContextFactory.Type.DEFAULT));
            n_a.LJFF = false;
            KAT LIZ2 = n_a.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            LJII.LIZ(LIZ2);
        }
        SettingKey<Boolean> settingKey = LiveEffectSettingKeys.LIVE_STICKER_FAVORITE_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            AbstractC86668KDe.LJIIJJI.LIZ(LiveEffectContextFactory.Type.DEFAULT, 1);
        } else {
            AbstractC86668KDe.LJIIJJI.LIZ(LiveEffectContextFactory.Type.DEFAULT, 0);
        }
        SettingKey<Boolean> settingKey2 = LiveEffectSettingKeys.LIVE_STICKER_FAVORITE_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
        Boolean value2 = settingKey2.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        if (value2.booleanValue()) {
            C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LIZ().LIZLLL(C86676KDm.LIZLLL);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
                Map<String, Long> LIZ3 = AbstractC86668KDe.LJIILL.LIZ(LiveEffectContextFactory.Type.DEFAULT);
                Iterator<Map.Entry<String, Long>> it = LIZ3.entrySet().iterator();
                while (it.hasNext()) {
                    Long value3 = it.next().getValue();
                    Intrinsics.checkNotNullExpressionValue(value3, "");
                    Date date = new Date(value3.longValue());
                    Date date2 = new Date(System.currentTimeMillis());
                    if (date.getYear() != date2.getYear() || date.getMonth() != date2.getMonth() || date.getDay() != date2.getDay()) {
                        it.remove();
                    }
                }
                AbstractC86668KDe.LJIILL.LIZ(LiveEffectContextFactory.Type.DEFAULT, LIZ3);
            }
            C4209g LIZ4 = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LIZ();
            String str = C86676KDm.LIZLLL;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
            if (proxy.isSupported) {
                mo27335getValue = proxy.result;
            } else {
                mo27335getValue = this.LJIJJ.mo27335getValue();
            }
            LIZ4.LIZ(str, (l$d) C64646Bf6.LIZ(mo27335getValue));
        }
        C86699KEj.LIZ(C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LIZIZ(), (n$c) null, (String) null, new C4181a(0L, 0, 3), 3, (Object) null);
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LIZJ().LIZ();
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().mo15785LJ().LIZ(new C4181a(0L, 0, 3));
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZ(this.LJJIFFI);
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZ(this.LJJII);
        if (this.LJII == null) {
            this.LJII = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJFF();
            KE1 ke1 = this.LJII;
            if (ke1 != null && ke1.LIZLLL() > 0) {
                LIZJ(false);
            }
        }
        LIZ().add(C87010KQi.LIZ().LIZ(C4199a.class).subscribe(new K8T(this)));
    }

    public static final /* synthetic */ AbstractC86611KAz LIZ(EffectLivePreviewActivityProxy effectLivePreviewActivityProxy) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{effectLivePreviewActivityProxy}, null, LIZ, true, 26);
        if (proxy.isSupported) {
            return (AbstractC86611KAz) proxy.result;
        }
        AbstractC86611KAz abstractC86611KAz = effectLivePreviewActivityProxy.LIZLLL;
        if (abstractC86611KAz == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC86611KAz;
    }

    @Override // com.bytedance.android.live.effect.m$b
    public final void LIZIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 18).isSupported) {
            return;
        }
        AbstractC86611KAz abstractC86611KAz = this.LIZLLL;
        if (abstractC86611KAz == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (abstractC86611KAz.LIZ()) {
            AbstractC86611KAz abstractC86611KAz2 = this.LIZLLL;
            if (abstractC86611KAz2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            Integer LIZ2 = AbstractC86668KDe.LIZIZ.LIZ(LiveEffectContextFactory.Type.DEFAULT);
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            abstractC86611KAz2.LIZ(LIZ2.intValue());
        }
    }

    public final void LIZJ(boolean z) {
        Disposable disposable;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 23).isSupported) {
            return;
        }
        LIZLLL();
        Disposable disposable2 = this.LJIILIIL;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.LJIILIIL) != null) {
            disposable.dispose();
        }
        SettingKey<Long> settingKey = LiveEffectSettingKeys.LIVE_FILTER_EFFECTIVELY_USE_TIME;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Long value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        this.LJIILIIL = Observable.timer(value.longValue(), TimeUnit.SECONDS).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new KAZ(this, z), C17L.LIZ);
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        if (z) {
            C86604KAs.LIZ("live_take_detail", true, LiveEffectContextFactory.Type.DEFAULT, (Function2) null, 8, (Object) null);
            C86604KAs.LIZ("live_take_detail", "click", LiveEffectContextFactory.Type.DEFAULT, null, true, null, 32, null);
        }
        this.LJIIJ = true;
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJIIIIZZ();
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZLLL();
        LIZJ();
        if (z) {
            KE1.LIZ(LiveEffectContextFactory.Type.DEFAULT);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectLivePreviewActivityProxy(FragmentActivity fragmentActivity, AbstractC86611KAz abstractC86611KAz) {
        super(fragmentActivity);
        C106862S5w.LIZ(fragmentActivity, abstractC86611KAz);
        this.LIZLLL = abstractC86611KAz;
        LJIIIZ();
    }

    public final void LIZ(String str, float f) {
        if (PatchProxy.proxy(new Object[]{str, Float.valueOf(f)}, this, LIZ, false, 20).isSupported || !AbstractC86668KDe.LIZ.LIZ(LiveEffectContextFactory.Type.DEFAULT).booleanValue()) {
            return;
        }
        if (this.LJIJI.containsKey(str)) {
            this.LJIIJJI.removeCallbacks(this.LJIJI.remove(str));
            ALogger.m15801d("EffectLivePreviewActivityProxy", C0002O.m25085C("sendBeautyUseLog: RunnableMap contains ", str, ", clear"));
        }
        if (f == 0.0f) {
            return;
        }
        RunnableC86601KAp runnableC86601KAp = new RunnableC86601KAp(this, str, f);
        this.LJIJI.put(str, runnableC86601KAp);
        ALogger.m15801d("EffectLivePreviewActivityProxy", C0002O.m25086C("sendBeautyUseLog: add runnable for ", str));
        WeakHandler weakHandler = this.LJIIJJI;
        SettingKey<Long> settingKey = LiveEffectSettingKeys.LIVE_FACE_STICKER_EFFECTIVELY_USE_TIME;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        weakHandler.postDelayed(runnableC86601KAp, settingKey.getValue().longValue() * 1000);
    }

    private final void LIZJ(Sticker sticker, boolean z) {
        Sticker sticker2;
        Long l;
        if (PatchProxy.proxy(new Object[]{sticker, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 22).isSupported) {
            return;
        }
        if (this.LJIILL != null) {
            if (!z || (!Intrinsics.areEqual(sticker2, sticker))) {
                long currentTimeMillis = (System.currentTimeMillis() - this.LJIILLIIL) / 1000;
                if (currentTimeMillis != 0) {
                    AbstractC86605KAt LIZIZ = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ();
                    HashMap<String, String> hashMap = new HashMap<>();
                    Sticker sticker3 = this.LJIILL;
                    if (sticker3 != null) {
                        l = Long.valueOf(sticker3.getId());
                    } else {
                        l = null;
                    }
                    hashMap.put("makeup_id", String.valueOf(l));
                    hashMap.put("use_time", String.valueOf(currentTimeMillis));
                    hashMap.put("event_page", "live_take_page");
                    LIZIZ.LIZ("livesdk_makeup_use_time", hashMap);
                }
                this.LJIILL = null;
                this.LJIILLIIL = 0L;
            }
            this.LJIILL = sticker;
            this.LJIILLIIL = System.currentTimeMillis();
        }
        if (!z) {
            return;
        }
        this.LJIILL = sticker;
        this.LJIILLIIL = System.currentTimeMillis();
    }

    public final void LIZ(DialogInterface.OnDismissListener onDismissListener, BeautifyTemplate beautifyTemplate) {
        Object mo27335getValue;
        if (PatchProxy.proxy(new Object[]{onDismissListener, beautifyTemplate}, this, LIZ, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(onDismissListener, beautifyTemplate);
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ().LIZ("takepage_beauty_icon_click", new HashMap<>());
        AbstractC86605KAt LIZIZ = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZIZ();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("event_page", "live_take_page");
        LIZIZ.LIZ("livesdk_anchor_beauty_click", hashMap);
        this.f26245LJ = onDismissListener;
        C86604KAs.LIZ(LiveEffectContextFactory.Type.DEFAULT);
        AbstractC4172k LJIIIIZZ = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ();
        FragmentActivity fragmentActivity = this.LJJ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            mo27335getValue = proxy.result;
        } else {
            mo27335getValue = this.LJIJJLI.mo27335getValue();
        }
        beautifyTemplate.LIZ(new C4181a(System.currentTimeMillis(), 0));
        this.LIZIZ = LJIIIIZZ.LIZ(fragmentActivity, (a$a) mo27335getValue, beautifyTemplate, "live_take_page");
        C4198d c4198d = this.LIZIZ;
        if (c4198d != null) {
            c4198d.setOnDismissListener(new DialogInterface$OnDismissListenerC86588KAc(this));
        }
    }

    public final void LIZIZ(Sticker sticker, boolean z) {
        Disposable disposable;
        if (PatchProxy.proxy(new Object[]{sticker, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 21).isSupported) {
            return;
        }
        LIZJ(sticker, z);
        Disposable disposable2 = this.LJIIL;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.LJIIL) != null) {
            disposable.dispose();
        }
        if (z && sticker != null && sticker.getEffect() != null && C86604KAs.LIZIZ(sticker.getEffect(), sticker, LiveEffectContextFactory.Type.DEFAULT) && AbstractC86668KDe.LJIIIZ.LIZ(LiveEffectContextFactory.Type.DEFAULT).booleanValue()) {
            Long value = LiveEffectSettingKeys.LIVE_FACE_STICKER_EFFECTIVELY_USE_TIME.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            this.LJIIL = Observable.timer(value.longValue(), TimeUnit.SECONDS).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C86586KAa(sticker), C17M.LIZIZ);
        }
    }

    public final void LIZ(Sticker sticker, boolean z) {
        Sticker.C9471b smallItemConfig;
        if (PatchProxy.proxy(new Object[]{sticker, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 19).isSupported) {
            return;
        }
        if ((sticker.getSmallItemConfig() == null && (sticker = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LIZIZ().LIZIZ(sticker)) == null) || sticker.getSmallItemConfig() == null || (smallItemConfig = sticker.getSmallItemConfig()) == null) {
            return;
        }
        String str = smallItemConfig.LIZJ;
        if (z) {
            Float LIZIZ = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZIZ(sticker.getEffectId(), smallItemConfig.LIZJ);
            if (LIZIZ == null) {
                LIZIZ = Float.valueOf(C86727KFl.LIZ(smallItemConfig, smallItemConfig.LIZIZ));
            }
            LIZ(str, LIZIZ.floatValue());
        } else if (!this.LJI.contains(str) && this.LJIJI.containsKey(str)) {
            this.LJIIJJI.removeCallbacks(this.LJIJI.remove(str));
        }
    }
}
