package com.bytedance.android.live.browser;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.annie.api.AnnieHelper;
import com.bytedance.android.annie.api.card.HybridCard;
import com.bytedance.android.annie.api.container.HybridDialog;
import com.bytedance.android.annie.api.container.HybridFragment;
import com.bytedance.android.annie.api.monitor.CommonLifecycle;
import com.bytedance.android.annie.card.base.AbstractC2599d;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.jsbridge.AbstractC3885b;
import com.bytedance.android.live.browser.jsbridge.AbstractC3940c;
import com.bytedance.android.live.browser.jsbridge.AbstractC3972f;
import com.bytedance.android.live.browser.jsbridge.AbstractC3973g;
import com.bytedance.android.live.browser.jsbridge.event.C3952am;
import com.bytedance.android.live.browser.p301b.C3877b;
import com.bytedance.android.live.browser.p301b.C3878i;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.monitor.LiveTracingMonitor;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.live.lynx.p396a.AbstractC5152b;
import com.bytedance.android.live.schema.p437vo.BaseHybridParamVo;
import com.bytedance.android.live.schema.p437vo.WebHybridParamVo;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveInitSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.jsb.IExternalBrowserService;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitor;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.web.jsbridge2.AbstractC13046b;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC100890PoK;
import p003X.AbstractC100934Pp2;
import p003X.AbstractC101016PqM;
import p003X.AbstractC101024PqU;
import p003X.AbstractC101303Puz;
import p003X.AbstractC4316636a;
import p003X.AbstractC90724Lok;
import p003X.C100006Pa4;
import p003X.C100929Pox;
import p003X.C100942PpA;
import p003X.C101004PqA;
import p003X.C101005PqB;
import p003X.C101006PqC;
import p003X.C101007PqD;
import p003X.C101008PqE;
import p003X.C101009PqF;
import p003X.C101011PqH;
import p003X.C101012PqI;
import p003X.C101014PqK;
import p003X.C101015PqL;
import p003X.C101092Pra;
import p003X.C101093Prb;
import p003X.C101538Pym;
import p003X.C101539Pyn;
import p003X.C101540Pyo;
import p003X.C106862S5w;
import p003X.C109391T5d;
import p003X.C147929fQx;
import p003X.C3JU;
import p003X.C3M9;
import p003X.C88392KsE;
import p003X.C90746Lp6;
import p003X.C99781PRn;
import p003X.C99825PTf;
import p003X.C99868PUw;
import p003X.FZM;
import p003X.HN8;
import p003X.LK5;
import p003X.LX5;
import p003X.P0H;
import p003X.P32;
import p003X.PQS;
import p003X.PQV;
import p003X.PQZ;
import p003X.S5C;

/* loaded from: classes8.dex */
public class BrowserServiceImpl implements IBrowserService {
    public static final C100942PpA Companion;
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final AbstractC101024PqU diComponent;
    public AbstractC3884j h5Service;
    public boolean isUseV2;
    public AbstractC4051k jsBridgeService;
    public AbstractC4052l lynxService;
    public AbstractC3972f prefetchProcessor;
    public final C101538Pym redirectSchemaProcessor = new C101538Pym();
    public HN8<AbstractC3973g> stateObservingService;

    public final AbstractC3972f getPrefetchProcessor() {
        return this.prefetchProcessor;
    }

    public final AbstractC3884j getH5Service() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (AbstractC3884j) proxy.result;
        }
        AbstractC3884j abstractC3884j = this.h5Service;
        if (abstractC3884j == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC3884j;
    }

    public final AbstractC4051k getJsBridgeService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (AbstractC4051k) proxy.result;
        }
        AbstractC4051k abstractC4051k = this.jsBridgeService;
        if (abstractC4051k == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC4051k;
    }

    public final AbstractC4052l getLynxService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (AbstractC4052l) proxy.result;
        }
        AbstractC4052l abstractC4052l = this.lynxService;
        if (abstractC4052l == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC4052l;
    }

    public final HN8<AbstractC3973g> getStateObservingService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (HN8) proxy.result;
        }
        HN8<AbstractC3973g> hn8 = this.stateObservingService;
        if (hn8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return hn8;
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public void initPrefetch() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15).isSupported) {
            return;
        }
        AbstractC3972f abstractC3972f = this.prefetchProcessor;
        if (abstractC3972f != null) {
            abstractC3972f.LIZ();
        }
        C99781PRn.LIZIZ.LIZ();
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public AbstractC101303Puz webViewMonitorHelper() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32);
        if (proxy.isSupported) {
            return (AbstractC101303Puz) proxy.result;
        }
        return C147929fQx.LIZIZ.LIZJ();
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public void idleInit() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38).isSupported) {
            return;
        }
        if (this.isUseV2) {
            AbstractC3884j abstractC3884j = this.h5Service;
            if (abstractC3884j == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            abstractC3884j.LIZLLL();
            return;
        }
        AbstractC3884j abstractC3884j2 = this.h5Service;
        if (abstractC3884j2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC3884j2.LIZJ();
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public void initRedirectProcessor() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 56).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], this.redirectSchemaProcessor, C101538Pym.LIZ, false, 1).isSupported) {
            C101540Pyo.LJFF.LIZ();
        }
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public <T extends LiveRecyclableWidget> Class<T> provideBridgeSupportWidgetClass() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29);
        if (proxy.isSupported) {
            return (Class) proxy.result;
        }
        AbstractC4051k abstractC4051k = this.jsBridgeService;
        if (abstractC4051k == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC4051k.LIZIZ();
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public <T extends LiveRecyclableWidget> Class<T> provideTestWidgetClass() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28);
        if (proxy.isSupported) {
            return (Class) proxy.result;
        }
        AbstractC4052l abstractC4052l = this.lynxService;
        if (abstractC4052l == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC4052l.LIZIZ();
    }

    static {
        AbstractC101024PqU c101093Prb;
        if (ReDexClinitStringAb.abTest >= 2) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(21874);
        Companion = new C100942PpA((byte) 0);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, C101093Prb.LIZ, true, 2);
        if (proxy.isSupported) {
            c101093Prb = (AbstractC101024PqU) proxy.result;
        } else {
            C101006PqC c101006PqC = new C101006PqC((byte) 0);
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c101006PqC, C101006PqC.LIZ, false, 1);
            if (proxy2.isSupported) {
                c101093Prb = (AbstractC101024PqU) proxy2.result;
            } else {
                if (c101006PqC.LIZIZ == null) {
                    c101006PqC.LIZIZ = new C3878i();
                }
                if (c101006PqC.LIZJ == null) {
                    c101006PqC.LIZJ = new C3877b();
                }
                if (c101006PqC.LIZLLL == null) {
                    c101006PqC.LIZLLL = new C101012PqI();
                }
                if (c101006PqC.f10804LJ == null) {
                    c101006PqC.f10804LJ = new C101011PqH();
                }
                c101093Prb = new C101093Prb(c101006PqC, (byte) 0);
            }
        }
        Intrinsics.checkNotNullExpressionValue(c101093Prb, "");
        diComponent = c101093Prb;
    }

    private static void clinit$r$fake() {
        AbstractC101024PqU c101093Prb;
        Covode.recordClassIndex(21874);
        Companion = new C100942PpA((byte) 0);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, C101093Prb.LIZ, true, 2);
        if (proxy.isSupported) {
            c101093Prb = (AbstractC101024PqU) proxy.result;
        } else {
            C101006PqC c101006PqC = new C101006PqC((byte) 0);
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c101006PqC, C101006PqC.LIZ, false, 1);
            if (proxy2.isSupported) {
                c101093Prb = (AbstractC101024PqU) proxy2.result;
            } else {
                if (c101006PqC.LIZIZ == null) {
                    c101006PqC.LIZIZ = new C3878i();
                }
                if (c101006PqC.LIZJ == null) {
                    c101006PqC.LIZJ = new C3877b();
                }
                if (c101006PqC.LIZLLL == null) {
                    c101006PqC.LIZLLL = new C101012PqI();
                }
                if (c101006PqC.f10804LJ == null) {
                    c101006PqC.f10804LJ = new C101011PqH();
                }
                c101093Prb = new C101093Prb(c101006PqC, (byte) 0);
            }
        }
        Intrinsics.checkNotNullExpressionValue(c101093Prb, "");
        diComponent = c101093Prb;
    }

    public BrowserServiceImpl() {
        C90746Lp6<Boolean> c90746Lp6 = AbstractC90724Lok.LJIJ;
        Intrinsics.checkNotNullExpressionValue(c90746Lp6, "");
        Boolean LIZ = c90746Lp6.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        this.isUseV2 = LIZ.booleanValue();
        C101007PqD c101007PqD = C101007PqD.LIZJ;
        C38721 c38721 = C38721.LIZIZ;
        if (!PatchProxy.proxy(new Object[]{AbstractC4052l.class, c38721}, c101007PqD, C101007PqD.LIZ, false, 4).isSupported) {
            C106862S5w.LIZ(AbstractC4052l.class, c38721);
            C101007PqD.LIZIZ.put(AbstractC4052l.class, c38721);
        }
        ServiceManager.registerService(IExternalBrowserService.class, new ExternalBrowserService());
        diComponent.LIZ(this);
        if (this.jsBridgeService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (this.isUseV2) {
            AbstractC3884j abstractC3884j = this.h5Service;
            if (abstractC3884j == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            abstractC3884j.LIZLLL();
        } else {
            AbstractC3884j abstractC3884j2 = this.h5Service;
            if (abstractC3884j2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            abstractC3884j2.LIZJ();
        }
        ServiceManager.registerService(IBrowserService.class, this);
        if (LiveInitSettingKeys.get_LIVE_ENABLE_JSB_INIT_OPT()) {
            C99781PRn c99781PRn = C99781PRn.LIZIZ;
            AbstractC4051k abstractC4051k = this.jsBridgeService;
            if (abstractC4051k == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            AbstractC4052l abstractC4052l = this.lynxService;
            if (abstractC4052l == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            AbstractC3884j abstractC3884j3 = this.h5Service;
            if (abstractC3884j3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!PatchProxy.proxy(new Object[]{abstractC4051k, abstractC4052l, abstractC3884j3}, c99781PRn, C99781PRn.LIZ, false, 3).isSupported) {
                C106862S5w.LIZ(abstractC4051k, abstractC3884j3);
                c99781PRn.LIZ(abstractC4051k, abstractC4052l, abstractC3884j3);
                if (!PatchProxy.proxy(new Object[0], PQV.LIZLLL, PQV.LIZ, false, 4).isSupported && PQV.LIZIZ == null) {
                    Observable.fromCallable(PQS.LIZIZ).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(PQZ.LIZIZ, Functions.LIZIZ());
                }
            }
        }
    }

    public final void setPrefetchProcessor(AbstractC3972f abstractC3972f) {
        this.prefetchProcessor = abstractC3972f;
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public void prefetch(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        AbstractC3972f abstractC3972f = this.prefetchProcessor;
        if (abstractC3972f != null) {
            abstractC3972f.LIZ(str);
        }
    }

    public final void setH5Service(AbstractC3884j abstractC3884j) {
        if (PatchProxy.proxy(new Object[]{abstractC3884j}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC3884j);
        this.h5Service = abstractC3884j;
    }

    public final void setJsBridgeService(AbstractC4051k abstractC4051k) {
        if (PatchProxy.proxy(new Object[]{abstractC4051k}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC4051k);
        this.jsBridgeService = abstractC4051k;
    }

    public final void setLynxService(AbstractC4052l abstractC4052l) {
        if (PatchProxy.proxy(new Object[]{abstractC4052l}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC4052l);
        this.lynxService = abstractC4052l;
    }

    public final void setStateObservingService(HN8<AbstractC3973g> hn8) {
        if (PatchProxy.proxy(new Object[]{hn8}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(hn8);
        this.stateObservingService = hn8;
    }

    public final CommonLifecycle wrapCommonLifecycle(CommonLifecycle commonLifecycle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{commonLifecycle}, this, changeQuickRedirect, false, 52);
        if (proxy.isSupported) {
            return (CommonLifecycle) proxy.result;
        }
        return new C99868PUw(this, commonLifecycle);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public String appendCommonParams(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(str);
        AbstractC3884j abstractC3884j = this.h5Service;
        if (abstractC3884j == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC3884j.LIZ(str);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public AbstractC100934Pp2 buildHostWebDialog(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 20);
        if (proxy.isSupported) {
            return (AbstractC100934Pp2) proxy.result;
        }
        C106862S5w.LIZ(str);
        return new C101092Pra(str).LIZ(BaseHybridParamVo.HybridType.HOST_H5);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public AbstractC100934Pp2 buildWebDialog(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 19);
        if (proxy.isSupported) {
            return (AbstractC100934Pp2) proxy.result;
        }
        C106862S5w.LIZ(str);
        AbstractC3972f abstractC3972f = this.prefetchProcessor;
        if (abstractC3972f != null) {
            abstractC3972f.LIZ(str);
        }
        return new C101092Pra(str).LIZ(BaseHybridParamVo.HybridType.H5);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public boolean enableDynamicWebOffline(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 39);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(context);
        return C101015PqL.LIZIZ.LIZ(context);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public String filterRequestUrl(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(str);
        String LIZ = C88392KsE.LIZ(str);
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        return LIZ;
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public Map<String, Object> getCacheByScheme(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 17);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(str);
        AbstractC3972f abstractC3972f = this.prefetchProcessor;
        if (abstractC3972f != null) {
            return abstractC3972f.LIZIZ(str);
        }
        return null;
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public JSONObject getCacheJsonByScheme(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 18);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        C106862S5w.LIZ(str);
        AbstractC3972f abstractC3972f = this.prefetchProcessor;
        if (abstractC3972f != null) {
            return abstractC3972f.LIZJ(str);
        }
        return null;
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public AbstractC3973g.AbstractC3975c getStateByKey(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 55);
        if (proxy.isSupported) {
            return (AbstractC3973g.AbstractC3975c) proxy.result;
        }
        C106862S5w.LIZ(str);
        HN8<AbstractC3973g> hn8 = this.stateObservingService;
        if (hn8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return hn8.mo28680get().LIZ().get(str);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public Observable<Unit> registerExternalMethodFactory(AbstractC3885b abstractC3885b) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC3885b}, this, changeQuickRedirect, false, 33);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        C106862S5w.LIZ(abstractC3885b);
        AbstractC4051k abstractC4051k = this.jsBridgeService;
        if (abstractC4051k == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC4051k.LIZ(abstractC3885b);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public Observable<C3952am> registerJsEventSubscriber(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        C106862S5w.LIZ(str);
        AbstractC4051k abstractC4051k = this.jsBridgeService;
        if (abstractC4051k == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC4051k.LIZ(str);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public <T> void registerStaticState(Function1<? super DataCenter, ? extends AbstractC101016PqM<? extends T>> function1) {
        if (PatchProxy.proxy(new Object[]{function1}, this, changeQuickRedirect, false, 50).isSupported) {
            return;
        }
        C106862S5w.LIZ(function1);
        HN8<AbstractC3973g> hn8 = this.stateObservingService;
        if (hn8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hn8.mo28680get().LIZ(function1);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public void tryInitEnvIfNeeded(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 30).isSupported) {
            return;
        }
        C106862S5w.LIZ(context);
        AbstractC4052l abstractC4052l = this.lynxService;
        if (abstractC4052l == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC4052l.LIZ(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.browser.IBrowserService
    public void addXBridgeList(ArrayList<Class<? extends Object>> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 40).isSupported) {
            return;
        }
        C106862S5w.LIZ(arrayList);
        if (!PatchProxy.proxy(new Object[]{arrayList}, P0H.LIZJ, P0H.LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(arrayList);
            for (Object obj : arrayList) {
                if (!P0H.LIZIZ.contains(obj)) {
                    P0H.LIZIZ.add(obj);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public void dismissAllWebDialogs(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        AbstractC3884j abstractC3884j = this.h5Service;
        if (abstractC3884j == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC3884j.LIZIZ();
        if (!C101014PqK.LIZIZ.getValue().booleanValue()) {
            C99825PTf.LIZ(activity);
        } else if (!PatchProxy.proxy(new Object[]{null, 1, null}, null, C99825PTf.LIZ, true, 19).isSupported) {
            C99825PTf.LIZ((Activity) null);
        }
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public P32 createBrowserFragment(Bundle bundle) {
        Bundle bundle2;
        WebHybridParamVo LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 25);
        if (proxy.isSupported) {
            return (P32) proxy.result;
        }
        C106862S5w.LIZ(bundle);
        BaseHybridParamVo baseHybridParamVo = null;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{bundle}, null, C100929Pox.LIZ, true, 17);
        if (proxy2.isSupported) {
            bundle2 = (Bundle) proxy2.result;
        } else {
            if (bundle != null && bundle.get("hybrid_web_vo") == null) {
                ALogger.m15797i("tag_hybrid_parse", "HybridParamHelper->checkFullScreenVo: webHybridParamVo is null");
                String string = bundle.getString(PushConstants.WEB_URL);
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{string, null, bundle, (byte) 0, 10, null}, null, C100929Pox.LIZ, true, 8);
                if (proxy3.isSupported) {
                    LIZ = (WebHybridParamVo) proxy3.result;
                } else {
                    LIZ = C100929Pox.LIZ(string, (Uri) null, bundle, false);
                }
                bundle.putParcelable("hybrid_web_vo", LIZ);
                if (LIZ != null) {
                    baseHybridParamVo = LIZ.LJIIIZ;
                }
                bundle.putParcelable("hybrid_pop_vo", baseHybridParamVo);
            }
            bundle2 = bundle;
        }
        Boolean value = LiveSettingKeys.LIVE_ENABLE_USE_ANNIE_FOR_CREATE_BROWSER_FRAGMENT.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (bundle.getBoolean("use_annie", value.booleanValue())) {
            return new C101004PqA(bundle2);
        }
        String string2 = bundle.getString(PushConstants.WEB_URL);
        if (string2 == null) {
            string2 = "";
        }
        useOldContainerSchemaMonitor(string2, "createBrowserFragment");
        AbstractC3884j abstractC3884j = this.h5Service;
        if (abstractC3884j == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC3884j.LIZ(bundle);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public AbstractC100934Pp2 generateWebDialogBuilder(String str) {
        AbstractC100934Pp2 buildWebDialog;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9 = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23);
        if (proxy.isSupported) {
            return (AbstractC100934Pp2) proxy.result;
        }
        C106862S5w.LIZ(str);
        try {
            Uri parse = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(parse, "");
            String host = parse.getHost();
            String queryParameter = parse.getQueryParameter(PushConstants.WEB_URL);
            if (queryParameter == null) {
                return null;
            }
            if (Intrinsics.areEqual(host, "webcast_lynxview")) {
                buildWebDialog = buildLynxDialog(queryParameter, parse.getQueryParameter("fallback_url"), null);
            } else {
                buildWebDialog = buildWebDialog(queryParameter);
            }
            S5C.LIZ(parse, "type", "bottom");
            if (Intrinsics.areEqual(S5C.LIZ(parse, "gravity", "bottom"), "bottom")) {
                buildWebDialog.LIZ(S5C.LIZ(parse, "radius", 8), S5C.LIZ(parse, "radius", 8), 0, 0);
                buildWebDialog.LJI(80);
            } else {
                buildWebDialog.LJFF(S5C.LIZ(parse, "radius", 8));
                buildWebDialog.LJI(17);
            }
            buildWebDialog.LIZLLL(S5C.LIZ(parse, C109391T5d.LJFF, (int) SDKMonitor.SDK_VERSION));
            buildWebDialog.LIZJ(S5C.LIZ(parse, "width", (int) LK5.LJFF(LK5.LIZJ())));
            buildWebDialog.mo22951LJ(S5C.LIZ(parse, "margin", 0));
            buildWebDialog.LIZ(S5C.LIZ(parse, "height_percent", 0));
            buildWebDialog.LIZIZ(S5C.LIZ(parse, "width_percent", 0));
            buildWebDialog.LJIIIZ(S5C.LIZ(parse, "rate_height", -1));
            if (S5C.LIZ(parse, "pull_down_indicator_not_show", 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            buildWebDialog.LJIIJ(z);
            buildWebDialog.LJIIJ(S5C.LIZ(parse, "pull_down_height", 0));
            if (S5C.LIZ(parse, "show_back", 0) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            buildWebDialog.LJII(z2);
            if (S5C.LIZ(parse, "show_close", 0) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            buildWebDialog.LJI(z3);
            if (S5C.LIZ(parse, "pull_down_close", 0) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            buildWebDialog.LJIIIIZZ(z4);
            if (S5C.LIZ(parse, "landscape_custom_height", 0) == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            buildWebDialog.LIZIZ(z5);
            if (S5C.LIZ(parse, "landscape_custom_width", 0) == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            buildWebDialog.LIZJ(z6);
            buildWebDialog.LJIIIIZZ(S5C.LIZ(parse, "lynx_thread", 0));
            if (S5C.LIZ(parse, "window_floating", 1) == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            buildWebDialog.LJIIJJI(z7);
            if (S5C.LIZ(parse, "abandon_coordinate", 0) == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            buildWebDialog.LJIIL(z8);
            if (S5C.LIZ(parse, "enable_lynx_bg", 0) != 1) {
                z9 = false;
            }
            buildWebDialog.LJIILIIL(z9);
            return buildWebDialog.LIZJ(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public AbstractC100890PoK buildFullScreenWebPage(Context context, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 24);
        if (proxy.isSupported) {
            return (AbstractC100890PoK) proxy.result;
        }
        C106862S5w.LIZ(context, str);
        C100006Pa4.LIZ();
        AbstractC3884j abstractC3884j = this.h5Service;
        if (abstractC3884j == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC3884j.LIZ(context, str);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public AbstractC3940c createJsBridgeManager(Activity activity, AbstractC13046b abstractC13046b) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{activity, abstractC13046b}, this, changeQuickRedirect, false, 37);
        if (proxy.isSupported) {
            return (AbstractC3940c) proxy.result;
        }
        C106862S5w.LIZ(activity, abstractC13046b);
        AbstractC4051k abstractC4051k = this.jsBridgeService;
        if (abstractC4051k == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC4051k.LIZ(activity, abstractC13046b, 1);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public Fragment createLynxFragment(Context context, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, bundle}, this, changeQuickRedirect, false, 26);
        if (proxy.isSupported) {
            return (Fragment) proxy.result;
        }
        C106862S5w.LIZ(context, bundle);
        return createLynxFragment(context, bundle, null);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public <T> void registerOrNotifyState(AbstractC4316636a<T> abstractC4316636a, T t) {
        if (PatchProxy.proxy(new Object[]{abstractC4316636a, t}, this, changeQuickRedirect, false, 49).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC4316636a);
        HN8<AbstractC3973g> hn8 = this.stateObservingService;
        if (hn8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hn8.mo28680get().LIZ(abstractC4316636a, t);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public <T> void sendEventToAllJsBridges(String str, T t) {
        if (PatchProxy.proxy(new Object[]{str, t}, this, changeQuickRedirect, false, 31).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        AbstractC4051k abstractC4051k = this.jsBridgeService;
        if (abstractC4051k == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC4051k.LIZ(str, (String) t);
    }

    public final void useOldContainerSchemaMonitor(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 53).isSupported) {
            return;
        }
        Uri parse = Uri.parse(str);
        JSONObject jSONObject = new JSONObject();
        new StringBuilder();
        jSONObject.put("path", C0002O.m25085C(parse.getHost(), "/", parse.getPath()));
        jSONObject.put("tag", str2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(PushConstants.WEB_URL, str);
        LiveTracingMonitor.LIZ("ttlive_hybrid_use_old_container", LiveTracingMonitor.EventModule.hybrid, LiveTracingMonitor.EventType.BUSSINESS_API_CALL, 0, "", jSONObject, null, jSONObject2);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public HybridFragment getHybridFragment(Context context, Uri uri, CommonLifecycle commonLifecycle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, uri, commonLifecycle}, this, changeQuickRedirect, false, 47);
        if (proxy.isSupported) {
            return (HybridFragment) proxy.result;
        }
        C106862S5w.LIZ(context, uri);
        return getHybridFragment(context, uri, commonLifecycle, null);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public HybridDialog showHybridDialog(Context context, Uri uri, CommonLifecycle commonLifecycle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, uri, commonLifecycle}, this, changeQuickRedirect, false, 41);
        if (proxy.isSupported) {
            return (HybridDialog) proxy.result;
        }
        C106862S5w.LIZ(context, uri);
        return showHybridDialog(context, uri, commonLifecycle, null, null);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public AbstractC100934Pp2 buildLynxDialog(String str, String str2, JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, jSONObject}, this, changeQuickRedirect, false, 22);
        if (proxy.isSupported) {
            return (AbstractC100934Pp2) proxy.result;
        }
        C106862S5w.LIZ(str);
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_LYNX_ADD_COMMON_PARAM;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            AbstractC3884j abstractC3884j = this.h5Service;
            if (abstractC3884j == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            str = abstractC3884j.LIZ(str);
        }
        AbstractC3972f abstractC3972f = this.prefetchProcessor;
        if (abstractC3972f != null) {
            abstractC3972f.LIZ(str);
        }
        return new C101092Pra(str, str2, jSONObject).LIZ(BaseHybridParamVo.HybridType.LYNX);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public C3JU createWebViewRecord(Activity activity, IBrowserService.AbstractC3873d abstractC3873d, C3M9 c3m9) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{activity, abstractC3873d, c3m9}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return (C3JU) proxy.result;
        }
        C106862S5w.LIZ(activity);
        AbstractC3884j abstractC3884j = this.h5Service;
        if (abstractC3884j == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C101008PqE c101008PqE = new C101008PqE(this, abstractC3873d);
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{abstractC3884j, activity, c101008PqE, c3m9, null, 8, null}, null, C101009PqF.LIZ, true, 1);
        if (proxy2.isSupported) {
            return (C3JU) proxy2.result;
        }
        return abstractC3884j.LIZ(activity, c101008PqE, c3m9, "");
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public HybridCard getHybridCard(Context context, Uri uri, CommonLifecycle commonLifecycle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, uri, commonLifecycle}, this, changeQuickRedirect, false, 44);
        if (proxy.isSupported) {
            return (HybridCard) proxy.result;
        }
        C106862S5w.LIZ(context, uri);
        return getHybridCard(context, uri, commonLifecycle, (Bundle) null);
    }

    /* renamed from: com.bytedance.android.live.browser.BrowserServiceImpl$1 */
    /* loaded from: classes2.dex */
    public static final class C38721 implements InvocationHandler {
        public static ChangeQuickRedirect LIZ;
        public static final C38721 LIZIZ;

        static {
            if (ReDexClinitStringAb.abTest >= 5) {
                clinit$r$fake();
                return;
            }
            Covode.recordClassIndex(21875);
            LIZIZ = new C38721();
        }

        private static void clinit$r$fake() {
            Covode.recordClassIndex(21875);
            LIZIZ = new C38721();
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, method, objArr}, this, LIZ, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            StringBuilder sb = new StringBuilder("Dynamic proxy : ");
            Intrinsics.checkNotNullExpressionValue(method, "");
            sb.append(method.getName());
            sb.append(", args: ");
            sb.append(objArr);
            ALogger.m15795w("Brick", sb.toString());
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{method}, null, FZM.LIZ, true, 1);
            if (proxy2.isSupported) {
                return proxy2.result;
            }
            Class<?> returnType = method.getReturnType();
            if (returnType != Boolean.TYPE && returnType != Boolean.class) {
                if (returnType != Character.TYPE && returnType != Character.class) {
                    if (returnType != Byte.TYPE && returnType != Byte.class) {
                        if (returnType != Short.TYPE && returnType != Short.class) {
                            if (returnType != Integer.TYPE && returnType != Integer.class) {
                                if (returnType != Long.TYPE && returnType != Long.class) {
                                    if (returnType != Float.TYPE && returnType != Float.class) {
                                        if (returnType != Double.TYPE && returnType != Double.class) {
                                            return null;
                                        }
                                        return FZM.LIZIZ;
                                    }
                                    return FZM.LIZJ;
                                }
                                return 0L;
                            }
                            return 0;
                        }
                        return (short) 0;
                    }
                    return (byte) 0;
                }
                return (char) 0;
            }
            return Boolean.FALSE;
        }
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public Fragment createLynxFragment(Context context, Bundle bundle, C4053p c4053p) {
        Uri createH5SchemeByUrl;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, bundle, c4053p}, this, changeQuickRedirect, false, 27);
        if (proxy.isSupported) {
            return (Fragment) proxy.result;
        }
        C106862S5w.LIZ(context, bundle);
        Boolean value = LiveSettingKeys.LIVE_ENABLE_USE_ANNIE_FOR_CREATE_BROWSER_FRAGMENT.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (bundle.getBoolean("use_annie", value.booleanValue())) {
            BaseHybridParamVo baseHybridParamVo = (BaseHybridParamVo) bundle.getParcelable("hybrid_pop_vo");
            if (baseHybridParamVo != null && !TextUtils.isEmpty(baseHybridParamVo.LJJIJIIJIL)) {
                createH5SchemeByUrl = Uri.parse(baseHybridParamVo.LJJIJIIJIL);
                Intrinsics.checkNotNullExpressionValue(createH5SchemeByUrl, "");
            } else {
                String string = bundle.getString("origin_scheme");
                if (string != null && string.length() > 0) {
                    createH5SchemeByUrl = Uri.parse(string);
                } else {
                    String string2 = bundle.getString(PushConstants.WEB_URL);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    createH5SchemeByUrl = AnnieHelper.createH5SchemeByUrl(string2);
                }
                Intrinsics.checkNotNullExpressionValue(createH5SchemeByUrl, "");
            }
            return ((IBrowserService) ServiceManager.getService(IBrowserService.class)).getHybridFragment(context, createH5SchemeByUrl, null, bundle);
        }
        String string3 = bundle.getString(PushConstants.WEB_URL, "");
        if (string3 != null && string3 != null && !StringsKt__StringsJVMKt.isBlank(string3)) {
            AbstractC3972f abstractC3972f = this.prefetchProcessor;
            if (abstractC3972f != null) {
                abstractC3972f.LIZ(string3);
            }
            useOldContainerSchemaMonitor(string3, "createLynxFragment2");
        }
        AbstractC4052l abstractC4052l = this.lynxService;
        if (abstractC4052l == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC4052l.LIZ(context, bundle, c4053p);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public void addHybridDebugTool(Context context, ViewGroup viewGroup, String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{context, viewGroup, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(viewGroup, str);
        AbstractC4052l abstractC4052l = this.lynxService;
        if (abstractC4052l == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC4052l.LIZ(context, viewGroup, str, z);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public C3JU createWebViewRecord(Activity activity, String str, IBrowserService.AbstractC3873d abstractC3873d, C3M9 c3m9) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{activity, str, abstractC3873d, c3m9}, this, changeQuickRedirect, false, 21);
        if (proxy.isSupported) {
            return (C3JU) proxy.result;
        }
        C106862S5w.LIZ(activity, str);
        AbstractC3972f abstractC3972f = this.prefetchProcessor;
        if (abstractC3972f != null) {
            abstractC3972f.LIZ(str);
        }
        useOldContainerSchemaMonitor(str, "createWebViewRecord1");
        return createWebViewRecord(activity, abstractC3873d, c3m9);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public HybridCard getHybridCard(Context context, Uri uri, int i, CommonLifecycle commonLifecycle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, uri, Integer.valueOf(i), commonLifecycle}, this, changeQuickRedirect, false, 45);
        if (proxy.isSupported) {
            return (HybridCard) proxy.result;
        }
        C106862S5w.LIZ(context, uri);
        Bundle bundle = new Bundle();
        bundle.putInt("preset_width_px", i);
        return getHybridCard(context, uri, commonLifecycle, bundle);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public HybridDialog showHybridDialogWithListener(Context context, Uri uri, CommonLifecycle commonLifecycle, DialogInterface.OnDismissListener onDismissListener) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, uri, commonLifecycle, onDismissListener}, this, changeQuickRedirect, false, 42);
        if (proxy.isSupported) {
            return (HybridDialog) proxy.result;
        }
        C106862S5w.LIZ(context, uri);
        return showHybridDialog(context, uri, commonLifecycle, null, onDismissListener);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public HybridFragment getHybridFragment(Context context, Uri uri, CommonLifecycle commonLifecycle, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, uri, commonLifecycle, bundle}, this, changeQuickRedirect, false, 48);
        if (proxy.isSupported) {
            return (HybridFragment) proxy.result;
        }
        C106862S5w.LIZ(context, uri);
        C99781PRn c99781PRn = C99781PRn.LIZIZ;
        AbstractC4051k abstractC4051k = this.jsBridgeService;
        if (abstractC4051k == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        AbstractC4052l abstractC4052l = this.lynxService;
        if (abstractC4052l == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        AbstractC3884j abstractC3884j = this.h5Service;
        if (abstractC3884j == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C99781PRn.LIZ(c99781PRn, abstractC4051k, abstractC4052l, abstractC3884j, false, 8, null);
        return C99825PTf.LIZJ(context, uri, wrapCommonLifecycle(commonLifecycle), bundle);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public HybridCard getHybridCard(Context context, Uri uri, CommonLifecycle commonLifecycle, Bundle bundle) {
        Bundle bundle2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, uri, commonLifecycle, bundle}, this, changeQuickRedirect, false, 46);
        if (proxy.isSupported) {
            return (HybridCard) proxy.result;
        }
        C106862S5w.LIZ(context, uri);
        if (!PatchProxy.proxy(new Object[0], null, C100006Pa4.LIZ, true, 3).isSupported) {
            C100006Pa4.LIZIZ.LIZIZ();
            C100006Pa4.LIZIZ.LIZJ();
        }
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putLong("open_time", System.currentTimeMillis());
        C99781PRn c99781PRn = C99781PRn.LIZIZ;
        AbstractC4051k abstractC4051k = this.jsBridgeService;
        if (abstractC4051k == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        AbstractC4052l abstractC4052l = this.lynxService;
        if (abstractC4052l == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        AbstractC3884j abstractC3884j = this.h5Service;
        if (abstractC3884j == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C99781PRn.LIZ(c99781PRn, abstractC4051k, abstractC4052l, abstractC3884j, false, 8, null);
        return C99825PTf.LIZIZ(context, uri, wrapCommonLifecycle(commonLifecycle), bundle2);
    }

    public final void prefetchMonitor(View view, Set<String> set, long j, long j2) {
        if (PatchProxy.proxy(new Object[]{view, set, new Long(j), new Long(j2)}, this, changeQuickRedirect, false, 54).isSupported) {
            return;
        }
        C106862S5w.LIZ(set);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state_keys", set.toString());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("duration", j);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("duration", j2);
        AbstractC4052l abstractC4052l = this.lynxService;
        if (abstractC4052l == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC4052l.LIZ().LIZ(view, "prefetch_to_render_monitor", "", jSONObject, jSONObject2, (JSONObject) null, (JSONObject) null, true);
        AbstractC4052l abstractC4052l2 = this.lynxService;
        if (abstractC4052l2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC4052l2.LIZ().LIZ(view, "create_initial_props_monitor", "", jSONObject, jSONObject3, (JSONObject) null, (JSONObject) null, true);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public AbstractC5152b createOpenLynxComponent(Context context, int i, LynxThreadStrategy lynxThreadStrategy, C4053p c4053p, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, Integer.valueOf(i), lynxThreadStrategy, c4053p, str}, this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return (AbstractC5152b) proxy.result;
        }
        C106862S5w.LIZ(context, lynxThreadStrategy);
        AbstractC4052l abstractC4052l = this.lynxService;
        if (abstractC4052l == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC4052l.LIZ(context, Integer.valueOf(i), lynxThreadStrategy, c4053p, str);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public void reportLynxFetchJsbError(View view, String str, String str2, int i, String str3) {
        if (PatchProxy.proxy(new Object[]{view, str, str2, Integer.valueOf(i), str3}, this, changeQuickRedirect, false, 51).isSupported) {
            return;
        }
        C106862S5w.LIZ(view, str, str2);
        AbstractC4052l abstractC4052l = this.lynxService;
        if (abstractC4052l == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            abstractC4052l.LIZ(view, str, str2, i, str3);
        }
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public Observable<String> redirectSchemeByKey(String str, String str2, String str3, String str4, String str5) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 57);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        C106862S5w.LIZ(str, str5);
        C101538Pym c101538Pym = this.redirectSchemaProcessor;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, c101538Pym, C101538Pym.LIZ, false, 2);
        if (proxy2.isSupported) {
            return (Observable) proxy2.result;
        }
        C106862S5w.LIZ(str, str5);
        Observable<String> create = Observable.create(new C101539Pyn(c101538Pym, str, str4, str5, str2, str3));
        Intrinsics.checkNotNullExpressionValue(create, "");
        return create;
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public HybridDialog showHybridDialog(Context context, Uri uri, CommonLifecycle commonLifecycle, Bundle bundle, DialogInterface.OnDismissListener onDismissListener) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, uri, commonLifecycle, bundle, onDismissListener}, this, changeQuickRedirect, false, 43);
        if (proxy.isSupported) {
            return (HybridDialog) proxy.result;
        }
        C106862S5w.LIZ(context, uri);
        if (!PatchProxy.proxy(new Object[0], null, C100006Pa4.LIZ, true, 2).isSupported) {
            C100006Pa4.LIZIZ.LIZIZ();
            C100006Pa4.LIZIZ.LIZJ();
        }
        C99781PRn c99781PRn = C99781PRn.LIZIZ;
        AbstractC4051k abstractC4051k = this.jsBridgeService;
        if (abstractC4051k == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        AbstractC4052l abstractC4052l = this.lynxService;
        if (abstractC4052l == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        AbstractC3884j abstractC3884j = this.h5Service;
        if (abstractC3884j == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C99781PRn.LIZ(c99781PRn, abstractC4051k, abstractC4052l, abstractC3884j, false, 8, null);
        HybridDialog LIZ = C99825PTf.LIZ(context, uri, wrapCommonLifecycle(commonLifecycle), bundle);
        if (LIZ == null) {
            return null;
        }
        LIZ.registerActionListener(new C101005PqB(LIZ, uri, onDismissListener));
        return LIZ;
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public LX5 createLynxComponent(Activity activity, int i, String str, boolean z, LynxThreadStrategy lynxThreadStrategy, C4053p c4053p, AbstractC2599d abstractC2599d) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{activity, Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0), lynxThreadStrategy, c4053p, abstractC2599d}, this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return (LX5) proxy.result;
        }
        C106862S5w.LIZ(activity, str, lynxThreadStrategy);
        useOldContainerSchemaMonitor(str, "createLynxComponent");
        return createLynxComponent(activity, i, str, lynxThreadStrategy, "", c4053p, abstractC2599d, false);
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public LX5 createLynxComponent(Activity activity, int i, String str, LynxThreadStrategy lynxThreadStrategy, String str2, C4053p c4053p, AbstractC2599d abstractC2599d, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{activity, Integer.valueOf(i), str, lynxThreadStrategy, str2, c4053p, abstractC2599d, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return (LX5) proxy.result;
        }
        C106862S5w.LIZ(activity, str, lynxThreadStrategy, str2);
        useOldContainerSchemaMonitor(str, "createLynxComponent2");
        AbstractC3972f abstractC3972f = this.prefetchProcessor;
        if (abstractC3972f != null) {
            abstractC3972f.LIZ(str);
        }
        AbstractC4052l abstractC4052l = this.lynxService;
        if (abstractC4052l == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC4052l.LIZ(activity, Integer.valueOf(i), str, lynxThreadStrategy, str2, c4053p, abstractC2599d, z);
    }
}
