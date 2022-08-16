package com.byted.mgl.service.impl.platform;

import android.content.Context;
import android.os.Looper;
import com.byted.mgl.service.api.common.MglStateListener;
import com.byted.mgl.service.api.common.MglTechType;
import com.byted.mgl.service.api.host.IMglHostAppService;
import com.byted.mgl.service.api.internal.AMglInvCallerService;
import com.byted.mgl.service.api.platform.AMglPlatformService;
import com.byted.mgl.service.api.platform.MglOpenListener;
import com.byted.mgl.service.api.platform.MglPreloadListener;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.minigame.bdpbase.core.BdpError;
import com.bytedance.minigame.bdpbase.core.BdpPluginConfig;
import com.bytedance.minigame.bdpbase.core.IMglApp;
import com.bytedance.minigame.bdpbase.core.MglOpenParams;
import com.bytedance.minigame.bdpbase.manager.BdpManager;
import com.bytedance.minigame.bdpbase.schema.SchemaInfo;
import com.bytedance.minigame.bdpbase.util.MiniGameAppInfoUtil;
import com.bytedance.minigame.serviceapi.defaults.monitor.BdpEnsureService;
import com.bytedance.minigame.serviceapi.defaults.thread.BdpThreadService;
import com.bytedance.minigame.serviceapi.hostimpl.hostmethod.BdpHostMethod;
import com.bytedance.minigame.serviceapi.hostimpl.hostmethod.BdpHostMethodManager;
import com.minigame.miniapphost.entity.PreLoadAppEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.C64635Bev;

/* loaded from: classes26.dex */
public class MglPlatformServiceImpl implements AMglPlatformService {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final MglPlatformDelegate mDelegate = new MglPlatformDelegate();

    static {
        Covode.recordClassIndex(9819);
    }

    @Override // com.byted.mgl.service.api.platform.AMglPlatformService
    public void open(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        open(str, null, null);
    }

    @Override // com.byted.mgl.service.api.platform.AMglPlatformService
    public void registerHostMethod(BdpHostMethod bdpHostMethod) {
        if (PatchProxy.proxy(new Object[]{bdpHostMethod}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        BdpHostMethodManager.getInstance().registerHostMethod(bdpHostMethod);
    }

    @Override // com.byted.mgl.service.api.platform.AMglPlatformService
    public void dispatchHostEvent(String str, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{str, jSONObject}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        ((AMglInvCallerService) BdpManager.getInst().getService(AMglInvCallerService.class)).dispatchHostEvent(str, jSONObject);
    }

    @Override // com.byted.mgl.service.api.platform.AMglPlatformService
    public void prepare(final MglTechType mglTechType, final Context context, final MglStateListener mglStateListener) {
        if (PatchProxy.proxy(new Object[]{mglTechType, context, mglStateListener}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        preparePlugin(mglTechType, context, new MglStateListener() { // from class: com.byted.mgl.service.impl.platform.MglPlatformServiceImpl.2
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(9821);
            }

            @Override // com.byted.mgl.service.api.common.MglStateListener
            public void onFailed(BdpError bdpError) {
                MglStateListener mglStateListener2;
                if (!PatchProxy.proxy(new Object[]{bdpError}, this, changeQuickRedirect, false, 2).isSupported && (mglStateListener2 = mglStateListener) != null) {
                    mglStateListener2.onFailed(new BdpError(100, "plugin install failed"));
                }
            }

            @Override // com.byted.mgl.service.api.common.MglStateListener
            public void onSucceed(boolean z, long j) {
                if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)}, this, changeQuickRedirect, false, 1).isSupported) {
                    return;
                }
                IMglApp findSupportBdpApp = BdpManager.getInst().findSupportBdpApp(mglTechType.toInt());
                if (findSupportBdpApp != null) {
                    findSupportBdpApp.prepare(mglTechType, context, mglStateListener);
                    return;
                }
                MglStateListener mglStateListener2 = mglStateListener;
                if (mglStateListener2 != null) {
                    mglStateListener2.onFailed(new BdpError(-1, "app handle module not found"));
                }
                C64635Bev.LIZIZ("Platform", "app module not found, tech type is" + mglTechType.toInt());
                ((BdpEnsureService) BdpManager.getInst().getService(BdpEnsureService.class)).ensureNotReachHere("MglExpMonitor_prepare");
            }
        });
    }

    @Override // com.byted.mgl.service.api.platform.AMglPlatformService
    public void preparePlugin(MglTechType mglTechType, Context context, MglStateListener mglStateListener) {
        if (PatchProxy.proxy(new Object[]{mglTechType, context, mglStateListener}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        preparePlugin(mglTechType, context, false, mglStateListener);
    }

    @Override // com.byted.mgl.service.api.platform.AMglPlatformService
    public void open(String str, final MglOpenParams mglOpenParams, final MglOpenListener mglOpenListener) {
        if (PatchProxy.proxy(new Object[]{str, mglOpenParams, mglOpenListener}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        final SchemaInfo parse = SchemaInfo.parse(str);
        if (parse == null) {
            if (mglOpenListener != null) {
                mglOpenListener.onAppError(new BdpError(-1, C0002O.m25086C("parse schema failed:", str)));
                return;
            }
            return;
        }
        MiniGameAppInfoUtil.getInstance().setSchemaInfo(parse);
        this.mDelegate.triggerSchema = parse;
        BdpPluginConfig.Builder builder = new BdpPluginConfig.Builder();
        builder.setShowDialog(true);
        builder.enterFrom(parse.getEnterFrom());
        builder.enterMethod(parse.getEnterMethod());
        if (mglOpenParams != null) {
            builder.setContext(mglOpenParams.getPluginInstallContext());
        }
        final MglTechType parse2 = MglTechType.parse(str, mglOpenParams);
        builder.preparePlugin(((IMglHostAppService) BdpManager.getInst().getService(IMglHostAppService.class)).getMglPluginPkg(parse2));
        this.mDelegate.triggerConfig = builder.build();
        preparePlugin(parse2, null, true, new MglStateListener() { // from class: com.byted.mgl.service.impl.platform.MglPlatformServiceImpl.4
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(9823);
            }

            @Override // com.byted.mgl.service.api.common.MglStateListener
            public void onFailed(BdpError bdpError) {
                MglOpenListener mglOpenListener2;
                if (!PatchProxy.proxy(new Object[]{bdpError}, this, changeQuickRedirect, false, 2).isSupported && (mglOpenListener2 = mglOpenListener) != null) {
                    mglOpenListener2.onAppError(new BdpError(100, "plugin install failed"));
                }
            }

            @Override // com.byted.mgl.service.api.common.MglStateListener
            public void onSucceed(boolean z, long j) {
                MglOpenParams mglOpenParams2;
                if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)}, this, changeQuickRedirect, false, 1).isSupported) {
                    return;
                }
                MglOpenParams mglOpenParams3 = mglOpenParams;
                if (mglOpenParams3 == null) {
                    mglOpenParams3 = new MglOpenParams();
                }
                mglOpenParams3.put("plugin_ready_before_prepare", Boolean.valueOf(z));
                mglOpenParams3.put("prepare_plugin_cost", Long.valueOf(j));
                MglOpenListener mglOpenListener2 = mglOpenListener;
                if (mglOpenListener2 != null && (mglOpenParams3 = mglOpenListener2.onPluginInstalled(mglOpenParams)) != null && (mglOpenParams2 = mglOpenParams) != null) {
                    mglOpenParams3.putAll(mglOpenParams2);
                }
                MglPlatformServiceImpl.this.mDelegate.open(parse2, parse, mglOpenParams3, mglOpenListener);
            }
        });
    }

    @Override // com.byted.mgl.service.api.platform.AMglPlatformService
    public void preload(List<PreLoadAppEntity> list, final Map<String, String> map, final MglPreloadListener mglPreloadListener) {
        if (PatchProxy.proxy(new Object[]{list, map, mglPreloadListener}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        if (list != null && !list.isEmpty()) {
            HashMap hashMap = new HashMap();
            for (PreLoadAppEntity preLoadAppEntity : list) {
                MglTechType parse = MglTechType.parse(preLoadAppEntity.getSchemaInfo());
                if (parse == MglTechType.UNKNOWN) {
                    parse = MglTechType.MINI_GAME;
                }
                List list2 = (List) hashMap.get(parse);
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap.put(parse, list2);
                }
                list2.add(preLoadAppEntity);
            }
            for (final Map.Entry entry : hashMap.entrySet()) {
                preparePlugin((MglTechType) entry.getKey(), null, new MglStateListener() { // from class: com.byted.mgl.service.impl.platform.MglPlatformServiceImpl.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    static {
                        Covode.recordClassIndex(9822);
                    }

                    @Override // com.byted.mgl.service.api.common.MglStateListener
                    public void onFailed(BdpError bdpError) {
                        MglPreloadListener mglPreloadListener2;
                        if (!PatchProxy.proxy(new Object[]{bdpError}, this, changeQuickRedirect, false, 2).isSupported && (mglPreloadListener2 = mglPreloadListener) != null) {
                            mglPreloadListener2.onFailed(null, "plugin install failed");
                        }
                    }

                    @Override // com.byted.mgl.service.api.common.MglStateListener
                    public void onSucceed(boolean z, long j) {
                        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)}, this, changeQuickRedirect, false, 1).isSupported) {
                            return;
                        }
                        MglTechType mglTechType = (MglTechType) entry.getKey();
                        List<PreLoadAppEntity> list3 = (List) entry.getValue();
                        IMglApp findSupportBdpApp = BdpManager.getInst().findSupportBdpApp(mglTechType.toInt());
                        if (findSupportBdpApp != null) {
                            findSupportBdpApp.preload(list3, map, mglPreloadListener);
                            return;
                        }
                        MglPreloadListener mglPreloadListener2 = mglPreloadListener;
                        if (mglPreloadListener2 != null) {
                            mglPreloadListener2.onFailed(null, "app handle module not found");
                        }
                        C64635Bev.LIZIZ("Platform", "app module not found, tech type is" + mglTechType.toInt());
                        ((BdpEnsureService) BdpManager.getInst().getService(BdpEnsureService.class)).ensureNotReachHere("MglExpMonitor_preload");
                    }
                });
            }
            return;
        }
        prepare(MglTechType.MINI_GAME, null, null);
        if (mglPreloadListener != null) {
            mglPreloadListener.onFailed(null, "empty reload app list");
        }
    }

    @Override // com.byted.mgl.service.api.platform.AMglPlatformService
    public void preparePlugin(final MglTechType mglTechType, final Context context, final boolean z, final MglStateListener mglStateListener) {
        if (PatchProxy.proxy(new Object[]{mglTechType, context, Byte.valueOf(z ? (byte) 1 : (byte) 0), mglStateListener}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ((BdpThreadService) BdpManager.getInst().getService(BdpThreadService.class)).executeCPU(new Runnable() { // from class: com.byted.mgl.service.impl.platform.MglPlatformServiceImpl.1
                public static ChangeQuickRedirect changeQuickRedirect;

                static {
                    Covode.recordClassIndex(9820);
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                        return;
                    }
                    MglPlatformServiceImpl.this.mDelegate.preparePlugin(mglTechType, context, z, mglStateListener);
                }
            });
        } else {
            this.mDelegate.preparePlugin(mglTechType, context, z, mglStateListener);
        }
    }
}
