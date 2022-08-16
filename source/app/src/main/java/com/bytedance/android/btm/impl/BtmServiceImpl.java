package com.bytedance.android.btm.impl;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmHostDependManager;
import com.bytedance.android.btm.api.BtmLaunchApi;
import com.bytedance.android.btm.api.BtmPageClass;
import com.bytedance.android.btm.api.BtmPageInstance;
import com.bytedance.android.btm.api.BtmPageLifecycle;
import com.bytedance.android.btm.api.HybridContainerClass;
import com.bytedance.android.btm.api.IAcrossProcessCallback;
import com.bytedance.android.btm.api.ICreateBtmChainCallback;
import com.bytedance.android.btm.api.ICreateBtmIdCallback;
import com.bytedance.android.btm.api.PageProp;
import com.bytedance.android.btm.api.depend.ISettingDepend;
import com.bytedance.android.btm.api.inner.ALogger;
import com.bytedance.android.btm.api.inner.EmptyServiceImpl;
import com.bytedance.android.btm.api.inner.IAppLog;
import com.bytedance.android.btm.api.inner.IBtmService;
import com.bytedance.android.btm.api.inner.IMonitor;
import com.bytedance.android.btm.api.inner.Logger;
import com.bytedance.android.btm.api.model.BtmItem;
import com.bytedance.android.btm.api.model.EventModelV1;
import com.bytedance.android.btm.api.model.EventModelV3;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.btm.api.util.BtmPageUtils;
import com.bytedance.android.btm.impl.page.model.C2654b;
import com.bytedance.android.btm.impl.page.model.C2655d;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.android.btm.impl.page.model.PageInfoStack;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC142402dzg;
import p003X.C106862S5w;
import p003X.C141387djB;
import p003X.C142182dw8;
import p003X.C142316dyI;
import p003X.C142319dyL;
import p003X.C142328dyU;
import p003X.C142330dyW;
import p003X.C142331dyX;
import p003X.C142333dyZ;
import p003X.C142334dya;
import p003X.C142335dyb;
import p003X.C142336dyc;
import p003X.C142337dyd;
import p003X.C142338dye;
import p003X.C142340dyg;
import p003X.C142342dyi;
import p003X.C142344dyk;
import p003X.C142345dyl;
import p003X.C142347dyn;
import p003X.C142349dyp;
import p003X.C142350dyq;
import p003X.C142351dyr;
import p003X.C142353dyt;
import p003X.C142354dyu;
import p003X.C142357dyx;
import p003X.C142358dyy;
import p003X.C142362dz2;
import p003X.C142363dz3;
import p003X.C142365dz5;
import p003X.C142366dz6;
import p003X.C142368dz8;
import p003X.C142369dz9;
import p003X.C142370dzA;
import p003X.C142373dzD;
import p003X.C142385dzP;
import p003X.C142391dzV;
import p003X.C142401dzf;
import p003X.C142403dzh;
import p003X.C142413dzr;
import p003X.RunnableC142183dw9;
import p003X.RunnableC142326dyS;
import p003X.RunnableC142327dyT;
import p003X.RunnableC142361dz1;

/* loaded from: classes18.dex */
public final class BtmServiceImpl implements IBtmService {
    public static final BtmServiceImpl INSTANCE = new BtmServiceImpl();
    public static ChangeQuickRedirect changeQuickRedirect;
    public static AbstractC142402dzg saveCacheCallback;

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final void onRegisterHybridContainer(HybridContainerClass hybridContainerClass) {
        if (PatchProxy.proxy(new Object[]{hybridContainerClass}, this, changeQuickRedirect, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(hybridContainerClass);
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final void onRegisterPage(BtmPageClass btmPageClass) {
        if (PatchProxy.proxy(new Object[]{btmPageClass}, this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(btmPageClass);
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final BtmLaunchApi getLaunchApi() {
        return C142331dyX.LIZIZ;
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final IMonitor getMonitor() {
        return C142330dyW.LIZIZ;
    }

    public final AbstractC142402dzg getSaveCacheCallback() {
        return saveCacheCallback;
    }

    static {
        Covode.recordClassIndex(11365);
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final IAppLog getAppLog() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return (IAppLog) proxy.result;
        }
        return C142319dyL.LIZJ.LIZLLL();
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final BtmPageLifecycle getPageLifecycle() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return (BtmPageLifecycle) proxy.result;
        }
        if (C142370dzA.LIZ().LIZLLL.LIZJ) {
            return C142349dyp.LIZIZ;
        }
        return C142354dyu.LIZIZ;
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final Activity getTopActivity() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17);
        if (proxy.isSupported) {
            return (Activity) proxy.result;
        }
        C142369dz9<Activity> LIZ = C142345dyl.LIZ();
        if (LIZ != null) {
            return (Activity) LIZ.get();
        }
        return null;
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final boolean judgeTopActivity() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (C142370dzA.LIZ().LIZJ.LIZ != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final void onLowMemory() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19).isSupported && C142345dyl.LIZIZ()) {
            C142319dyL.LIZJ.LIZJ().LIZJ();
            C141387djB.LIZJ.LIZJ();
        }
    }

    public final void handleBtmPageShow() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20).isSupported && C142370dzA.LIZ().LIZLLL.LIZ == 1) {
            if (!PatchProxy.proxy(new Object[0], C142353dyt.LIZJ, C142391dzV.LIZ, false, 1).isSupported) {
                C142353dyt.LIZIZ = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler(new C142353dyt());
            }
            C142333dyZ.LIZLLL.LIZIZ("crash");
            C142333dyZ.LIZLLL.LIZ("crash");
            C142333dyZ.LIZLLL.LIZIZ("kill");
            C142333dyZ.LIZLLL.LIZ("kill");
            C142333dyZ.LIZJ = true;
        }
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final void init() {
        ISettingDepend settingDepend;
        String setting;
        Object mo27335getValue;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        Logger.INSTANCE.setLogWriter(C142413dzr.LIZIZ);
        ALogger.INSTANCE.setALogWriter(C142403dzh.LIZIZ);
        C142319dyL c142319dyL = C142319dyL.LIZJ;
        if (!PatchProxy.proxy(new Object[0], c142319dyL, C142319dyL.LIZ, false, 2).isSupported) {
            c142319dyL.LIZIZ();
        }
        C142370dzA c142370dzA = C142370dzA.LIZLLL;
        if (!PatchProxy.proxy(new Object[0], c142370dzA, C142370dzA.LIZ, false, 3).isSupported && (settingDepend = BtmHostDependManager.INSTANCE.getSettingDepend()) != null && (setting = settingDepend.getSetting()) != null) {
            try {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], c142370dzA, C142370dzA.LIZ, false, 4);
                if (proxy.isSupported) {
                    mo27335getValue = proxy.result;
                } else {
                    mo27335getValue = C142370dzA.LIZJ.mo27335getValue();
                }
                Object fromJson = ((Gson) mo27335getValue).fromJson(setting, (Class<Object>) C142373dzD.class);
                Intrinsics.checkNotNullExpressionValue(fromJson, "");
                C142370dzA.LIZIZ = (C142373dzD) fromJson;
            } catch (Exception unused) {
                C142330dyW.LIZ(C142330dyW.LIZIZ, 1005, "", null, false, false, null, 60, null);
            }
        }
        Application app = BtmHostDependManager.INSTANCE.getApp();
        if (app != null) {
            app.registerActivityLifecycleCallbacks(C142345dyl.LIZIZ);
        }
        if (C142370dzA.LIZ().LIZLLL.LIZJ) {
            Application app2 = BtmHostDependManager.INSTANCE.getApp();
            if (app2 != null) {
                app2.registerActivityLifecycleCallbacks(C142336dyc.LIZIZ);
            }
            C142335dyb c142335dyb = C142335dyb.LIZJ;
            C142331dyX c142331dyX = C142331dyX.LIZIZ;
            if (!PatchProxy.proxy(new Object[]{c142331dyX}, c142335dyb, C142335dyb.LIZ, false, 7).isSupported) {
                C106862S5w.LIZ(c142331dyX);
                C142335dyb.LIZIZ.add(c142331dyX);
            }
            C142345dyl.LIZIZ.LIZ(C142362dz2.LIZIZ);
        } else {
            Application app3 = BtmHostDependManager.INSTANCE.getApp();
            if (app3 != null) {
                app3.registerActivityLifecycleCallbacks(C142337dyd.LIZIZ);
            }
            C142334dya c142334dya = C142334dya.LIZJ;
            C142331dyX c142331dyX2 = C142331dyX.LIZIZ;
            if (!PatchProxy.proxy(new Object[]{c142331dyX2}, c142334dya, C142334dya.LIZ, false, 15).isSupported) {
                C106862S5w.LIZ(c142331dyX2);
                C142334dya.LIZIZ.add(c142331dyX2);
            }
        }
        C142351dyr.LIZIZ.LIZ((Runnable) RunnableC142361dz1.LIZIZ, true);
    }

    public final void setSaveCacheCallback(AbstractC142402dzg abstractC142402dzg) {
        saveCacheCallback = abstractC142402dzg;
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final JSONObject createBtmChain(BtmItem btmItem) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{btmItem}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        C106862S5w.LIZ(btmItem);
        Logger.INSTANCE.api("NA", new BtmServiceImpl$createBtmChain$1(btmItem));
        if (C142370dzA.LIZ().LIZ != 1) {
            return EmptyServiceImpl.INSTANCE.createBtmChain(btmItem);
        }
        return C142182dw8.LIZIZ.LIZ(btmItem);
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final String createBtmId(BtmItem btmItem) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{btmItem}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(btmItem);
        Logger.INSTANCE.api("NA", new BtmServiceImpl$createBtmId$1(btmItem));
        if (C142370dzA.LIZ().LIZ != 1) {
            return EmptyServiceImpl.INSTANCE.createBtmId(btmItem);
        }
        return C142328dyU.LIZIZ.LIZ(btmItem);
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final String findBtmByPage(Object obj) {
        PageInfoStack LIZJ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C142338dye c142338dye = C142338dye.LIZIZ;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj}, c142338dye, C142338dye.LIZ, false, 1);
        if (proxy2.isSupported) {
            return (String) proxy2.result;
        }
        if (obj == null || (LIZJ = c142338dye.LIZJ(obj)) == null) {
            return null;
        }
        return LIZJ.LIZ();
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final String getPageId(PageFinder pageFinder) {
        PageInfo LJFF;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pageFinder}, this, changeQuickRedirect, false, 21);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Object LIZ = C142340dyg.LIZIZ.LIZ(pageFinder);
        if (LIZ == null || (LJFF = C142338dye.LIZIZ.LJFF(LIZ)) == null) {
            return null;
        }
        return LJFF.pageId;
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final EventModelV3 addBtmEventParam(EventModelV3 eventModelV3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{eventModelV3}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return (EventModelV3) proxy.result;
        }
        C106862S5w.LIZ(eventModelV3);
        if (C142370dzA.LIZ().LIZ != 1) {
            return EmptyServiceImpl.INSTANCE.addBtmEventParam(eventModelV3);
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{eventModelV3}, C142316dyI.LIZIZ, C142316dyI.LIZ, false, 2);
        if (proxy2.isSupported) {
            return (EventModelV3) proxy2.result;
        }
        C106862S5w.LIZ(eventModelV3);
        JSONObject params = eventModelV3.getParams();
        if (params != null && params.has("btm_id")) {
            C142316dyI.LIZIZ.LIZ(eventModelV3.getEvent(), params);
            C142385dzP.LIZIZ.LIZ(eventModelV3);
        }
        return eventModelV3;
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final void onUnregisterPage(BtmPageInstance btmPageInstance) {
        if (PatchProxy.proxy(new Object[]{btmPageInstance}, this, changeQuickRedirect, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(btmPageInstance);
        if (!PatchProxy.proxy(new Object[]{btmPageInstance}, C142401dzf.LIZIZ, C142401dzf.LIZ, false, 2).isSupported) {
            C106862S5w.LIZ(btmPageInstance);
            Object obj = btmPageInstance.getPageRef().get();
            if (obj != null) {
                if ((obj instanceof Dialog) && !C142370dzA.LIZ().LIZLLL.LIZJ && !PatchProxy.proxy(new Object[]{obj}, C142366dz6.LIZJ, C142366dz6.LIZ, false, 2).isSupported) {
                    C106862S5w.LIZ(obj);
                    C142366dz6.LIZIZ.remove(new C142369dz9(obj));
                }
                if (obj instanceof View) {
                    C142338dye.m21529LJ().remove(new C142369dz9(obj));
                }
                C142338dye.LIZ().remove(new C142369dz9(obj));
            }
        }
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final EventModelV1 addBtmEventParam(EventModelV1 eventModelV1) {
        String label;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{eventModelV1}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (EventModelV1) proxy.result;
        }
        C106862S5w.LIZ(eventModelV1);
        if (C142370dzA.LIZ().LIZ != 1) {
            return EmptyServiceImpl.INSTANCE.addBtmEventParam(eventModelV1);
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{eventModelV1}, C142316dyI.LIZIZ, C142316dyI.LIZ, false, 1);
        if (proxy2.isSupported) {
            return (EventModelV1) proxy2.result;
        }
        C106862S5w.LIZ(eventModelV1);
        JSONObject ext_json = eventModelV1.getExt_json();
        if (ext_json != null) {
            if (ext_json.has("btm_id")) {
                if (Intrinsics.areEqual(eventModelV1.getCategory(), "event_v3")) {
                    label = eventModelV1.getTag();
                } else {
                    label = eventModelV1.getLabel();
                }
                C142316dyI.LIZIZ.LIZ(label, ext_json);
                C142385dzP.LIZIZ.LIZ(eventModelV1);
            } else {
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{ext_json}, C142316dyI.LIZIZ, C142316dyI.LIZ, false, 3);
                if (!proxy3.isSupported ? ext_json.has("btm") || ext_json.has("btm_pre") || ext_json.has("btm_ppre") : ((Boolean) proxy3.result).booleanValue()) {
                    if (eventModelV1.getFrom_lancet()) {
                        C142385dzP.LIZIZ.LIZ(eventModelV1);
                        return eventModelV1;
                    }
                }
            }
        }
        return eventModelV1;
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final void onRegisterPage(BtmPageInstance btmPageInstance) {
        View decorView;
        if (PatchProxy.proxy(new Object[]{btmPageInstance}, this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(btmPageInstance);
        if (!PatchProxy.proxy(new Object[]{btmPageInstance}, C142401dzf.LIZIZ, C142401dzf.LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(btmPageInstance);
            Object obj = btmPageInstance.getPageRef().get();
            if (obj != null) {
                boolean z = obj instanceof Dialog;
                if (z) {
                    if (!C142370dzA.LIZ().LIZLLL.LIZJ && !PatchProxy.proxy(new Object[]{obj}, C142366dz6.LIZJ, C142366dz6.LIZ, false, 1).isSupported) {
                        C106862S5w.LIZ(obj);
                        C142366dz6.LIZIZ.add(new C142369dz9<>(obj));
                    }
                    Window window = ((Dialog) obj).getWindow();
                    if (window != null && (decorView = window.getDecorView()) != null) {
                        C142338dye.LIZLLL().put(new C142369dz9<>(decorView), new C142369dz9<>(obj));
                    }
                } else if (obj instanceof View) {
                    C142338dye.m21529LJ().add(new C142369dz9<>(obj));
                }
                if (C142370dzA.LIZ().LIZLLL.LIZJ) {
                    C142358dyy c142358dyy = C142358dyy.LIZIZ;
                    PageProp prop = btmPageInstance.getProp();
                    if (!PatchProxy.proxy(new Object[]{obj, null, prop}, c142358dyy, C142358dyy.LIZ, false, 1).isSupported) {
                        C106862S5w.LIZ(obj);
                        if (obj instanceof Activity) {
                            C142344dyk.LIZIZ.LIZ((Activity) obj, (Bundle) null, prop);
                        } else if (obj instanceof Fragment) {
                            C142342dyi.LIZIZ.LIZ((Fragment) obj, (Bundle) null, prop);
                        } else if (z) {
                            C142363dz3 c142363dz3 = C142363dz3.LIZIZ;
                            Dialog dialog = (Dialog) obj;
                            if (!PatchProxy.proxy(new Object[]{dialog, null, prop}, c142363dz3, C142363dz3.LIZ, false, 1).isSupported) {
                                C106862S5w.LIZ(dialog);
                                if (C142338dye.LIZIZ.LIZLLL(dialog) == null) {
                                    if (prop == null) {
                                        prop = BtmPageUtils.INSTANCE.getPageProp(dialog);
                                    }
                                    C142335dyb c142335dyb = C142335dyb.LIZJ;
                                    Intrinsics.checkNotNull(prop);
                                    c142335dyb.LIZ(dialog, prop, null);
                                    if (!PatchProxy.proxy(new Object[]{dialog, (byte) 1, (byte) 0}, c142363dz3, C142363dz3.LIZ, false, 2).isSupported) {
                                        C106862S5w.LIZ(dialog);
                                        C2654b c2654b = new C2654b(dialog);
                                        c2654b.LJFF = true;
                                        c2654b.LJI = false;
                                        Activity LIZ = C142368dz8.LIZIZ.LIZ(dialog);
                                        if (LIZ != null) {
                                            C2655d LIZ2 = C142357dyx.LIZJ.LIZ(LIZ);
                                            if (LIZ2 == null) {
                                                LIZ2 = new C2655d(LIZ);
                                                LIZ2.LIZJ.LJFF = false;
                                                LIZ2.LIZJ.LJI = false;
                                                C142357dyx.LIZJ.LIZ(LIZ2);
                                            }
                                            c2654b.LIZ(LIZ2.LIZJ);
                                        }
                                    }
                                }
                            }
                        } else if (obj instanceof View) {
                            C142350dyq.LIZIZ.LIZ((View) obj, (Bundle) null, prop);
                        }
                    }
                    C142365dz5.LIZIZ.LIZ(obj);
                }
            }
        }
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final void createBtmChainAsync(BtmItem btmItem, ICreateBtmChainCallback iCreateBtmChainCallback) {
        if (PatchProxy.proxy(new Object[]{btmItem, iCreateBtmChainCallback}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(btmItem, iCreateBtmChainCallback);
        if (C142370dzA.LIZ().LIZ != 1) {
            EmptyServiceImpl.INSTANCE.createBtmChainAsync(btmItem, iCreateBtmChainCallback);
        } else {
            C142351dyr.LIZIZ.LIZ((Runnable) new RunnableC142183dw9(btmItem, iCreateBtmChainCallback), true);
        }
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final void createBtmIdAcrossProcess(BtmItem btmItem, IAcrossProcessCallback iAcrossProcessCallback) {
        if (PatchProxy.proxy(new Object[]{btmItem, iAcrossProcessCallback}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(btmItem, iAcrossProcessCallback);
        if (C142370dzA.LIZ().LIZ != 1) {
            EmptyServiceImpl.INSTANCE.createBtmIdAcrossProcess(btmItem, iAcrossProcessCallback);
        } else {
            C142351dyr.LIZIZ.LIZ((Runnable) new RunnableC142327dyT(btmItem, iAcrossProcessCallback), true);
        }
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final void createBtmIdAsync(BtmItem btmItem, ICreateBtmIdCallback iCreateBtmIdCallback) {
        if (PatchProxy.proxy(new Object[]{btmItem, iCreateBtmIdCallback}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(btmItem, iCreateBtmIdCallback);
        if (C142370dzA.LIZ().LIZ != 1) {
            EmptyServiceImpl.INSTANCE.createBtmIdAsync(btmItem, iCreateBtmIdCallback);
        } else {
            C142351dyr.LIZIZ.LIZ((Runnable) new RunnableC142326dyS(btmItem, iCreateBtmIdCallback), true);
        }
    }

    @Override // com.bytedance.android.btm.api.inner.IBtmService
    public final boolean registerBtmPage(View view, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, str}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(view, str);
        if (C142370dzA.LIZ().LIZ != 1) {
            return EmptyServiceImpl.INSTANCE.registerBtmPage(view, str);
        }
        return C142347dyn.LIZIZ.LIZ(view, str);
    }
}
