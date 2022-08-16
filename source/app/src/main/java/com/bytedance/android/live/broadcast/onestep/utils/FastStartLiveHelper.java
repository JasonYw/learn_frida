package com.bytedance.android.live.broadcast.onestep.utils;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.broadcast.AbstractC2872ao;
import com.bytedance.android.live.broadcast.api.AbstractC2879d;
import com.bytedance.android.live.broadcast.api.model.PreviewSourceParam;
import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsStartLiveWidget;
import com.bytedance.android.live.broadcast.viewmodel.C3257c;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.user.C9284h;
import com.bytedance.android.livesdkapi.config.FastStartLiveConfig;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC4569445g;
import p003X.AbstractC536287Gk;
import p003X.C106862S5w;
import p003X.C134529bwK;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C3VF;
import p003X.C4574547f;
import p003X.C77347GeT;
import p003X.C86556K8w;
import p003X.KJ8;
import p003X.KJK;
import p003X.KJL;
import p003X.KJM;
import p003X.KJP;
import p003X.KJQ;
import p003X.KJR;
import p003X.KJS;
import p003X.LK5;
import p003X.QFD;

/* loaded from: classes5.dex */
public final class FastStartLiveHelper implements KJS, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final String[] LJIILJJIL = {"android.permission.RECORD_AUDIO", "android.permission.CAMERA"};
    public static final String[] LJIILL = {"android.permission.RECORD_AUDIO"};
    public final AbstractC536287Gk<Pair<FastStartLiveConfig, AbstractC2879d>> LIZIZ;
    public FastStartLiveConfig LIZLLL;

    /* renamed from: LJ */
    public AbstractC2879d f25912LJ;
    public AbsStartLiveWidget LJFF;
    public boolean LJI;
    public boolean LJII;
    public C3199v LJIIIIZZ;
    public C3180k LJIIIZ;
    public final KJR LJIIJ;
    public Disposable LJIIJJI;
    public WidgetManager LJIIL;
    public final FragmentActivity LJIILIIL;
    public final Lazy LJIIZILJ;
    public final TokenCert LJIJ;
    public final CompositeDisposable LIZJ = new CompositeDisposable();
    public final CompositeDisposable LJIILLIIL = new CompositeDisposable();

    public final C3257c LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (C3257c) (proxy.isSupported ? proxy.result : this.LJIIZILJ.mo27335getValue());
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 24).isSupported) {
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event != Lifecycle.Event.ON_DESTROY) {
        } else {
            onDestroy();
        }
    }

    public final boolean LIZ(Disposable disposable) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 1);
        return proxy.isSupported ? ((Boolean) proxy.result).booleanValue() : this.LIZJ.add(disposable);
    }

    static {
        Covode.recordClassIndex(17049);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported && this.LJII) {
            LIZIZ();
            this.LJII = false;
        }
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        FastStartLiveConfig fastStartLiveConfig = this.LIZLLL;
        if (fastStartLiveConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (fastStartLiveConfig.isTransparentPageForSchema && !this.LJIILIIL.isFinishing()) {
            this.LJIILIIL.finish();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            return;
        }
        LIZ().LIZJ.dispose();
        if (!this.LIZJ.isDisposed()) {
            this.LIZJ.dispose();
        }
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        LIZ("login");
        LIZ(this.f25912LJ, "requestPermission");
        FastStartLiveConfig fastStartLiveConfig = this.LIZLLL;
        if (fastStartLiveConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        String[] LIZ2 = LIZ(fastStartLiveConfig);
        C134529bwK.LIZ(this.LJIILIIL).LIZ(new KJK(this, LIZ2), new KJQ(this), this.LJIJ, (String[]) Arrays.copyOf(LIZ2, LIZ2.length));
    }

    /* renamed from: LJ */
    public final String m15895LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        FastStartLiveConfig fastStartLiveConfig = this.LIZLLL;
        if (fastStartLiveConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (fastStartLiveConfig.liveMode == LiveMode.ACQUAINTANCE) {
            String string = this.LJIILIIL.getResources().getString(2131582806);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        String string2 = this.LJIILIIL.getResources().getString(2131582805);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    @Override // p003X.KJS
    public final int LJFF() {
        Integer num;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 22);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_PREVIEW_ENABLE_SOURCEPARAM_OPT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            PreviewSourceParam LIZIZ = this.LJIIIIZZ.LJIJ().LIZIZ();
            if (LIZIZ == null || (num = LIZIZ.scene) == null) {
                return 0;
            }
            return num.intValue();
        }
        return KJ8.LIZIZ.LIZIZ(this.LJIIIIZZ.LJIIZILJ().LIZ());
    }

    public final void LIZLLL() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        AbstractC2879d abstractC2879d = this.f25912LJ;
        LIZ(abstractC2879d, "realFastStartLive isEntering=" + this.LJI);
        this.LJI = true;
        FastStartLiveConfig fastStartLiveConfig = this.LIZLLL;
        if (fastStartLiveConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (fastStartLiveConfig.sourcePrams != null) {
            C2WC<String> LJIIZILJ = this.LJIIIIZZ.LJIIZILJ();
            FastStartLiveConfig fastStartLiveConfig2 = this.LIZLLL;
            if (fastStartLiveConfig2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LJIIZILJ.LIZ(String.valueOf(fastStartLiveConfig2.sourcePrams));
            this.LJIIIIZZ.LJIJ().LIZIZ(PreviewSourceParam.Companion.LIZ(this.LJIIIIZZ.LJIIZILJ().LIZ()));
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_PREVIEW_ENABLE_SOURCEPARAM_OPT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            PreviewSourceParam LIZIZ = this.LJIIIIZZ.LJIJ().LIZIZ();
            if (LIZIZ != null) {
                C2WC<LiveMode> LIZ2 = this.LJIIIZ.LIZ();
                FastStartLiveConfig fastStartLiveConfig3 = this.LIZLLL;
                if (fastStartLiveConfig3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                LiveMode liveMode = fastStartLiveConfig3.liveMode;
                if (liveMode == null) {
                    liveMode = KJ8.LIZIZ.LIZLLL(LIZIZ.liveType);
                }
                LIZ2.LIZ(liveMode);
                if (this.LJIIIZ.LIZ().LIZ() == LiveMode.VIDEO) {
                    C2WC<Integer> LJJIJIIJI = this.LJIIIIZZ.LJJIJIIJI();
                    Integer num = LIZIZ.scene;
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = 0;
                    }
                    LJJIJIIJI.LIZ(Integer.valueOf(i2));
                } else {
                    C2WC<Integer> LJJIJ = this.LJIIIIZZ.LJJIJ();
                    Integer num2 = LIZIZ.scene;
                    if (num2 != null) {
                        i = num2.intValue();
                    } else {
                        i = 0;
                    }
                    LJJIJ.LIZ(Integer.valueOf(i));
                }
                C2WC<Integer> LJJIL = this.LJIIIIZZ.LJJIL();
                Integer num3 = LIZIZ.propsActivityType;
                if (num3 != null) {
                    i3 = num3.intValue();
                }
                LJJIL.LIZ(Integer.valueOf(i3));
                this.LJIIIIZZ.LJJIJIIJIL().LIZ(LIZIZ.playMode);
            }
        } else {
            C2WC<LiveMode> LIZ3 = this.LJIIIZ.LIZ();
            FastStartLiveConfig fastStartLiveConfig4 = this.LIZLLL;
            if (fastStartLiveConfig4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LiveMode liveMode2 = fastStartLiveConfig4.liveMode;
            if (liveMode2 == null) {
                liveMode2 = KJ8.LIZIZ.LIZ(this.LJIIIIZZ.LJIIZILJ().LIZ());
            }
            LIZ3.LIZ(liveMode2);
            int LIZIZ2 = KJ8.LIZIZ.LIZIZ(this.LJIIIIZZ.LJIIZILJ().LIZ());
            if (this.LJIIIZ.LIZ().LIZ() == LiveMode.VIDEO) {
                this.LJIIIIZZ.LJJIJIIJI().LIZ(Integer.valueOf(LIZIZ2));
            } else {
                this.LJIIIIZZ.LJJIJ().LIZ(Integer.valueOf(LIZIZ2));
            }
            this.LJIIIIZZ.LJJIL().LIZ(Integer.valueOf(KJ8.LIZIZ.LIZJ(this.LJIIIIZZ.LJIIZILJ().LIZ())));
            C2WD<ArrayList<Integer>> LJJIJIIJIL = this.LJIIIIZZ.LJJIJIIJIL();
            FastStartLiveConfig fastStartLiveConfig5 = this.LIZLLL;
            if (fastStartLiveConfig5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LJJIJIIJIL.LIZ(fastStartLiveConfig5.LIZ());
        }
        FragmentActivity fragmentActivity = this.LJIILIIL;
        FastStartLiveConfig fastStartLiveConfig6 = this.LIZLLL;
        if (fastStartLiveConfig6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        LIZ(fragmentActivity, fastStartLiveConfig6);
        AbsStartLiveWidget absStartLiveWidget = this.LJFF;
        if (absStartLiveWidget != null) {
            absStartLiveWidget.LIZIZ();
        }
        LIZ("onStartLiveBtnClick");
        LIZ(this.f25912LJ, "onStartLiveBtnClick");
    }

    public static String[] LIZ(FastStartLiveConfig fastStartLiveConfig) {
        String[] strArr = fastStartLiveConfig.targetPermissions;
        if (strArr != null) {
            return strArr;
        }
        if (fastStartLiveConfig.liveMode != LiveMode.AUDIO && fastStartLiveConfig.liveMode != LiveMode.ACQUAINTANCE) {
            return LJIILJJIL;
        }
        return LJIILL;
    }

    public FastStartLiveHelper(FragmentActivity fragmentActivity) {
        C106862S5w.LIZ(fragmentActivity);
        this.LJIILIIL = fragmentActivity;
        PublishSubject create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "");
        this.LIZIZ = create;
        this.LJIILIIL.mo29786getLifecycle().addObserver(this);
        Disposable subscribe = this.LIZIZ.throttleFirst(1000L, TimeUnit.MILLISECONDS).subscribe(new Consumer<Pair<? extends FastStartLiveConfig, ? extends AbstractC2879d>>() { // from class: com.bytedance.android.live.broadcast.onestep.utils.FastStartLiveHelper.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(17050);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Pair<? extends FastStartLiveConfig, ? extends AbstractC2879d> pair) {
                Pair<? extends FastStartLiveConfig, ? extends AbstractC2879d> pair2 = pair;
                if (!PatchProxy.proxy(new Object[]{pair2}, this, LIZ, false, 1).isSupported) {
                    FastStartLiveHelper fastStartLiveHelper = FastStartLiveHelper.this;
                    FastStartLiveConfig first = pair2.getFirst();
                    AbstractC2879d second = pair2.getSecond();
                    FragmentActivity fragmentActivity2 = FastStartLiveHelper.this.LJIILIIL;
                    if (!PatchProxy.proxy(new Object[]{first, second, fragmentActivity2}, fastStartLiveHelper, FastStartLiveHelper.LIZ, false, 5).isSupported) {
                        fastStartLiveHelper.LJIIIZ = new C3180k();
                        fastStartLiveHelper.LJIIIZ.LJJLIIIJILLIZJL();
                        fastStartLiveHelper.LJIIIIZZ = new C3199v();
                        fastStartLiveHelper.LJIIIIZZ.LJJLIIIJILLIZJL();
                        if (first.liveMode == null) {
                            first.liveMode = KJ8.LIZIZ.LIZ(first.sourcePrams);
                        }
                        KJR kjr = fastStartLiveHelper.LJIIJ;
                        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{first}, kjr, KJR.LIZ, false, 1);
                        if (proxy.isSupported) {
                            if (((Boolean) proxy.result).booleanValue()) {
                                return;
                            }
                        } else {
                            C106862S5w.LIZ(first);
                            if (first.liveMode == LiveMode.AUDIO && kjr.LIZIZ.LJFF() == 9) {
                                SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_VOICE_CHAT_ROOM_SUPPORT_KTV_ROOM;
                                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                                if (!settingKey.getValue().booleanValue()) {
                                    return;
                                }
                            }
                        }
                        fastStartLiveHelper.LIZLLL = first;
                        fastStartLiveHelper.f25912LJ = second;
                        fastStartLiveHelper.LIZ("fastStartLive");
                        fastStartLiveHelper.LIZ(second, "fastStartLive isEntering=" + fastStartLiveHelper.LJI);
                        if (((IUserService) ServiceManager.getService(IUserService.class)).user().LIZLLL()) {
                            fastStartLiveHelper.LIZIZ();
                            return;
                        }
                        KJP kjp = new KJP(fastStartLiveHelper, second);
                        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{fragmentActivity2, kjp}, fastStartLiveHelper, FastStartLiveHelper.LIZ, false, 16);
                        if (proxy2.isSupported) {
                            ((Boolean) proxy2.result).booleanValue();
                        } else if (fragmentActivity2 != null) {
                            C3VF user = ((IUserService) ServiceManager.getService(IUserService.class)).user();
                            if (!user.LIZLLL()) {
                                QFD LIZ2 = C9284h.LIZ();
                                LIZ2.LIZ(LK5.LIZ(2131586200));
                                LIZ2.LIZ(-1);
                                user.LIZ(fragmentActivity2, LIZ2.LIZ()).subscribe(kjp);
                            }
                        }
                    }
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "");
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{subscribe}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            ((Boolean) proxy.result).booleanValue();
        } else {
            this.LJIILLIIL.add(subscribe);
        }
        this.LJIIIIZZ = new C3199v();
        this.LJIIIZ = new C3180k();
        this.LJIIJ = new KJR(this);
        this.LJIIZILJ = C77347GeT.LIZ(FastStartLiveHelper$preInitFragmentContext$2.INSTANCE);
        this.LJIJ = TokenCert.Companion.with("bpea-live_fast_start_live_permission");
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 20).isSupported) {
            return;
        }
        LIZ(str, 0);
    }

    private final void LIZ(FragmentActivity fragmentActivity, FastStartLiveConfig fastStartLiveConfig) {
        if (PatchProxy.proxy(new Object[]{fragmentActivity, fastStartLiveConfig}, this, LIZ, false, 11).isSupported) {
            return;
        }
        if (this.LJIIL == null) {
            this.LJIIL = WidgetManager.m14493of(fragmentActivity, fragmentActivity.findViewById(16908290));
        }
        LIZ(this.f25912LJ, "loadWidget");
        AbsStartLiveWidget absStartLiveWidget = this.LJFF;
        AbsStartLiveWidget absStartLiveWidget2 = null;
        if (absStartLiveWidget != null) {
            WidgetManager widgetManager = this.LJIIL;
            if (widgetManager != null) {
                widgetManager.unload(absStartLiveWidget);
            }
            this.LJFF = null;
            this.LIZJ.clear();
        }
        AbstractC2872ao abstractC2872ao = new C86556K8w().LIZ;
        if (abstractC2872ao != null) {
            absStartLiveWidget2 = abstractC2872ao.LIZ(this.LJIIL, fastStartLiveConfig, this.LJIIIZ);
        }
        this.LJFF = absStartLiveWidget2;
        WidgetManager widgetManager2 = this.LJIIL;
        if (widgetManager2 != null) {
            widgetManager2.load(this.LJFF);
        }
        LIZ(this.LJIIIZ.LIZ(new FastStartLiveHelper$loadWidget$1(this)));
        Disposable subscribe = this.LJIIIIZZ.LJJIII().LIZIZ().subscribe(new KJL(this));
        Intrinsics.checkNotNullExpressionValue(subscribe, "");
        LIZ(subscribe);
        Disposable subscribe2 = this.LJIIIIZZ.LJJIIJ().LIZIZ().subscribe(new KJM(this));
        Intrinsics.checkNotNullExpressionValue(subscribe2, "");
        LIZ(subscribe2);
    }

    public final void LIZ(AbstractC2879d abstractC2879d, String str) {
        if (PatchProxy.proxy(new Object[]{abstractC2879d, str}, this, LIZ, false, 18).isSupported) {
            return;
        }
        ALogger.m15800e("FastStartLiveHelper", str);
        if (abstractC2879d != null) {
            abstractC2879d.LIZ(str);
        }
    }

    public final void LIZ(String str, int i) {
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, this, LIZ, false, 21).isSupported) {
            return;
        }
        FastStartLiveConfig fastStartLiveConfig = this.LIZLLL;
        if (fastStartLiveConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        Map<String, String> m23492LJ = KJ8.m23492LJ(fastStartLiveConfig.sourcePrams);
        if (m23492LJ != null) {
            m23492LJ.put("step", str);
            m23492LJ.put("errorCode", String.valueOf(i));
            C4574547f.LIZ().LIZ("livesdk_fast_start_live_progress", m23492LJ, new Object[0]);
        }
    }

    public final void LIZ(int i, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2}, this, LIZ, false, 17).isSupported) {
            return;
        }
        AbstractC2879d abstractC2879d = this.f25912LJ;
        if (abstractC2879d != null) {
            abstractC2879d.LIZ(i, str);
        }
        LIZ(this.f25912LJ, C0002O.m25086C("onEnterBroadcastFail ", str2));
        this.LJI = false;
    }
}
