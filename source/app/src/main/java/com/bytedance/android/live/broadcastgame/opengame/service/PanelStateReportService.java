package com.bytedance.android.live.broadcastgame.opengame.service;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.broadcastgame.api.openplatform.PluginType;
import com.bytedance.android.live.broadcastgame.opengame.message.ReviewApi;
import com.bytedance.android.live.broadcastgame.opengame.network.C3599x;
import com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.broadcastgame.opengame.service.PanelStateReportService;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3718b;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C387291Vj;
import p003X.C387561Wk;
import p003X.C390511dF;
import p003X.C87549Ked;

/* loaded from: classes.dex */
public final class PanelStateReportService implements AbstractC3663l, AbstractC3718b {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZLLL;
    public C3682x LJI;
    public final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(new PanelStateReportService$appId$2(this));
    public final Lazy LIZJ = LazyKt__LazyJVMKt.lazy(new PanelStateReportService$roomId$2(this));

    /* renamed from: LJ */
    public final Lazy f26086LJ = LazyKt__LazyJVMKt.lazy(new PanelStateReportService$panelState$2(this));
    public PanelStateReportService$lifecycleObserver$1 LJFF = new AbstractC4569445g() { // from class: com.bytedance.android.live.broadcastgame.opengame.service.PanelStateReportService$lifecycleObserver$1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(21016);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 3).isSupported) {
                return;
            }
            if (event == Lifecycle.Event.ON_STOP) {
                onStop();
            } else if (event != Lifecycle.Event.ON_RESUME) {
            } else {
                onResume();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResume() {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported && PanelStateReportService.this.LIZLLL) {
                PanelStateReportService panelStateReportService = PanelStateReportService.this;
                panelStateReportService.LIZLLL = false;
                panelStateReportService.LIZJ();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public final void onStop() {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && PanelStateReportService.this.LIZ().LIZ()) {
                PanelStateReportService panelStateReportService = PanelStateReportService.this;
                panelStateReportService.LIZLLL = true;
                panelStateReportService.LJIIIIZZ();
            }
        }
    };

    static {
        Covode.recordClassIndex(21010);
    }

    public final PanelState LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (PanelState) (proxy.isSupported ? proxy.result : this.f26086LJ.mo27335getValue());
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZLLL() {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    /* renamed from: LJ */
    public final void mo15832LJ() {
    }

    public final C3682x LJIILJJIL() {
        return this.LJI;
    }

    /* loaded from: classes.dex */
    public static final class PanelState {
        public static ChangeQuickRedirect LIZ;
        public final String LIZIZ;
        public final long LIZJ;
        public EnumC35364PanelState LIZLLL = EnumC35364PanelState.Hide;

        /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.PanelStateReportService$PanelState$PanelState  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC35364PanelState {
            Show,
            Hide;
            
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(21012);
            }

            public static EnumC35364PanelState valueOf(String str) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
                return (EnumC35364PanelState) (proxy.isSupported ? proxy.result : Enum.valueOf(EnumC35364PanelState.class, str));
            }

            /* renamed from: values  reason: to resolve conflict with enum method */
            public static EnumC35364PanelState[] valuesCustom() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
                return (EnumC35364PanelState[]) (proxy.isSupported ? proxy.result : values().clone());
            }
        }

        static {
            Covode.recordClassIndex(21011);
        }

        public final boolean LIZ() {
            if (this.LIZLLL == EnumC35364PanelState.Show) {
                return true;
            }
            return false;
        }

        private final boolean LIZIZ(EnumC35364PanelState enumC35364PanelState) {
            if (this.LIZLLL == enumC35364PanelState) {
                return false;
            }
            this.LIZLLL = enumC35364PanelState;
            return true;
        }

        public final Disposable LIZ(final EnumC35364PanelState enumC35364PanelState) {
            Observable<C5176i<Object>> reportPanelShow;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{enumC35364PanelState}, this, LIZ, false, 3);
            if (proxy.isSupported) {
                return (Disposable) proxy.result;
            }
            if (StringsKt__StringsJVMKt.isBlank(this.LIZIZ) || this.LIZJ <= 0 || !LIZIZ(enumC35364PanelState)) {
                return null;
            }
            int i = C390511dF.LIZ[enumC35364PanelState.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    reportPanelShow = ((ReviewApi) C3599x.LIZJ.LIZ().LIZ(ReviewApi.class)).reportPanelHide(this.LIZIZ, this.LIZJ);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                reportPanelShow = ((ReviewApi) C3599x.LIZJ.LIZ().LIZ(ReviewApi.class)).reportPanelShow(this.LIZIZ, this.LIZJ);
            }
            return reportPanelShow.subscribe(C387561Wk.LIZ, new Consumer<Throwable>() { // from class: X.169
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(21014);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Throwable th) {
                    Throwable th2 = th;
                    if (!PatchProxy.proxy(new Object[]{th2}, this, LIZ, false, 1).isSupported) {
                        ALogger.m15801d("ReportHelper", "report: " + PanelStateReportService.PanelState.EnumC35364PanelState.this + LoggerUtil.BLANK_TAG + th2.getMessage());
                    }
                }
            });
        }

        public PanelState(String str, long j) {
            C106862S5w.LIZ(str);
            this.LIZIZ = str;
            this.LIZJ = j;
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        C387291Vj.LIZ(this);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        LJIIIIZZ();
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        LJIIIIZZ();
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        C387291Vj.LIZJ(this);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            return;
        }
        C387291Vj.LIZLLL(this);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            return;
        }
        C387291Vj.m25034LJ(this);
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        PanelState LIZ2 = LIZ();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], LIZ2, PanelState.LIZ, false, 1);
        if (proxy.isSupported) {
            Object obj = proxy.result;
        } else {
            LIZ2.LIZ(PanelState.EnumC35364PanelState.Show);
        }
    }

    public final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        PanelState LIZ2 = LIZ();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], LIZ2, PanelState.LIZ, false, 2);
        if (proxy.isSupported) {
            Object obj = proxy.result;
        } else {
            LIZ2.LIZ(PanelState.EnumC35364PanelState.Hide);
        }
    }

    public final boolean LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return LIZ().LIZ();
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        if (LJIILJJIL().LJIILJJIL() == PluginType.LYNX || LJIILJJIL().LJIILJJIL() == PluginType.SONIC_GAME) {
            Context context = LJIILJJIL().LIZLLL;
            if (!PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 9).isSupported && (context instanceof AppCompatActivity) && context != null) {
                ((ComponentActivity) context).mo29786getLifecycle().removeObserver(this.LJFF);
            }
        }
        LJIIIIZZ();
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        if (LJIILJJIL().LJIILJJIL() == PluginType.LYNX || LJIILJJIL().LJIILJJIL() == PluginType.SONIC_GAME) {
            Context context = LJIILJJIL().LIZLLL;
            if (!PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 8).isSupported && (context instanceof AppCompatActivity) && context != null) {
                ((ComponentActivity) context).mo29786getLifecycle().addObserver(this.LJFF);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.bytedance.android.live.broadcastgame.opengame.service.PanelStateReportService$lifecycleObserver$1] */
    public PanelStateReportService(C3682x c3682x) {
        C106862S5w.LIZ(c3682x);
        new C87549Ked();
        this.LJI = c3682x;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 10).isSupported) {
            return;
        }
        LIZJ();
    }
}
