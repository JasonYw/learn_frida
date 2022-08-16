package com.byted.mgl.service.impl.platform;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.byted.mgl.service.api.common.MglStateListener;
import com.byted.mgl.service.api.common.MglTechType;
import com.byted.mgl.service.api.host.IMglHostAppService;
import com.byted.mgl.service.api.platform.MglOpenListener;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.minigame.bdpbase.core.BdpError;
import com.bytedance.minigame.bdpbase.core.BdpPluginConfig;
import com.bytedance.minigame.bdpbase.core.BdpPluginService;
import com.bytedance.minigame.bdpbase.core.IBdpPluginInstallListener;
import com.bytedance.minigame.bdpbase.core.IMglApp;
import com.bytedance.minigame.bdpbase.core.MglOpenParams;
import com.bytedance.minigame.bdpbase.manager.BdpManager;
import com.bytedance.minigame.bdpbase.schema.SchemaInfo;
import com.bytedance.minigame.serviceapi.defaults.monitor.BdpEnsureService;
import com.bytedance.minigame.serviceapi.defaults.thread.BdpThreadService;
import com.bytedance.minigame.serviceapi.hostimpl.router.BdpRouterService;
import com.minigame.miniapphost.util.TimeMeter;
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;
import p003X.C63808BFy;
import p003X.C64635Bev;
import p003X.RunnableC63791BFh;
import p003X.RunnableC63792BFi;

/* loaded from: classes26.dex */
public final class MglPlatformDelegate {
    public static ChangeQuickRedirect changeQuickRedirect;
    public volatile BdpPluginConfig triggerConfig;
    public volatile SchemaInfo triggerSchema;

    static {
        Covode.recordClassIndex(9817);
    }

    public final void open(MglTechType mglTechType, SchemaInfo schemaInfo, MglOpenParams mglOpenParams, MglOpenListener mglOpenListener) {
        if (PatchProxy.proxy(new Object[]{mglTechType, schemaInfo, mglOpenParams, mglOpenListener}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C64635Bev.LIZ("Platform", "try open schema: " + schemaInfo);
        if (mglOpenParams == null) {
            mglOpenParams = new MglOpenParams();
        }
        mglOpenParams.setAppStatusListener(mglOpenListener);
        mglOpenParams.put("bdp_open_start_time", Long.valueOf(TimeMeter.currentMillis()));
        String schema = schemaInfo.toSchema();
        if (!PatchProxy.proxy(new Object[]{schemaInfo, schema}, null, C63808BFy.LIZ, true, 1).isSupported) {
            ((BdpThreadService) BdpManager.getInst().getService(BdpThreadService.class)).executeCPU(new RunnableC63791BFh(schemaInfo, schema));
        }
        if (!schemaInfo.isGame()) {
            ((BdpRouterService) BdpManager.getInst().getService(BdpRouterService.class)).openSchema(((IMglHostAppService) BdpManager.getInst().getService(IMglHostAppService.class)).getHostApplication(), schemaInfo.toSchema());
            return;
        }
        IMglApp findSupportBdpApp = BdpManager.getInst().findSupportBdpApp(mglTechType.toInt());
        if (findSupportBdpApp != null) {
            findSupportBdpApp.open(schemaInfo.toSchema(), mglOpenParams, mglOpenListener);
            return;
        }
        if (mglOpenListener != null) {
            mglOpenListener.onAppError(new BdpError(-10101, "app handle module not found"));
        }
        C64635Bev.LIZIZ("Platform", "app module not found,schema is: " + schemaInfo);
        ((BdpEnsureService) BdpManager.getInst().getService(BdpEnsureService.class)).ensureNotReachHere("MglExpMonitor_open");
    }

    public final void preparePlugin(MglTechType mglTechType, Context context, final boolean z, final MglStateListener mglStateListener) {
        String str;
        if (PatchProxy.proxy(new Object[]{mglTechType, context, Byte.valueOf(z ? (byte) 1 : (byte) 0), mglStateListener}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        final String mglPluginPkg = ((IMglHostAppService) BdpManager.getInst().getService(IMglHostAppService.class)).getMglPluginPkg(mglTechType);
        BdpPluginService bdpPluginService = (BdpPluginService) BdpManager.getInst().getService(BdpPluginService.class);
        String str2 = "";
        if (this.triggerSchema != null) {
            str2 = this.triggerSchema.getEnterFrom();
            str = this.triggerSchema.getEnterMethod();
        } else {
            str = str2;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "microgame_enter_from";
        }
        if (TextUtils.isEmpty(str)) {
            str = "microgame_enter_method";
        }
        boolean isPluginReady = bdpPluginService.isPluginReady(mglPluginPkg, str2, str);
        if (!TextUtils.isEmpty(mglPluginPkg) && !isPluginReady) {
            if (context == null) {
                context = ((IMglHostAppService) BdpManager.getInst().getService(IMglHostAppService.class)).getHostApplication();
            }
            final TimeMeter newAndStart = TimeMeter.newAndStart();
            BdpPluginConfig.Builder builder = new BdpPluginConfig.Builder();
            BdpPluginConfig bdpPluginConfig = this.triggerConfig;
            if (this.triggerSchema != null) {
                builder.enterFrom(this.triggerSchema.getEnterFrom());
                builder.enterMethod(this.triggerSchema.getEnterMethod());
            }
            if (bdpPluginConfig != null) {
                if (bdpPluginConfig.getContext() != null) {
                    builder.setContext(bdpPluginConfig.getContext());
                    builder.setShowDialog(bdpPluginConfig.isShowDialog());
                } else {
                    builder.setContext(context);
                    builder.setShowDialog(context instanceof Activity);
                }
            } else {
                builder.setContext(context);
                builder.setShowDialog(context instanceof Activity);
            }
            builder.setPackageName(mglPluginPkg);
            builder.setListener(new IBdpPluginInstallListener() { // from class: com.byted.mgl.service.impl.platform.MglPlatformDelegate.1
                public static ChangeQuickRedirect changeQuickRedirect;

                static {
                    Covode.recordClassIndex(9818);
                }

                @Override // com.bytedance.minigame.bdpbase.core.IBdpPluginInstallListener
                public void onDownloadProgressUpdate(long j, long j2) {
                }

                @Override // com.bytedance.minigame.bdpbase.core.IBdpPluginInstallListener
                public void onSuccess() {
                    boolean z2 = false;
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                        return;
                    }
                    BdpManager.getInst().addPluginBdpRuntimeProvider(mglPluginPkg);
                    if (mglStateListener != null) {
                        long j = -1;
                        if (MglPlatformDelegate.this.triggerConfig != null) {
                            z2 = MglPlatformDelegate.this.triggerConfig.isPluginReady();
                            j = MglPlatformDelegate.this.triggerConfig.preparePluginCost();
                        }
                        mglStateListener.onSucceed(z2, j);
                    }
                    C63808BFy.LIZ(MglPlatformDelegate.this.triggerSchema, "success", Long.valueOf(newAndStart.stop()));
                    MglPlatformDelegate mglPlatformDelegate = MglPlatformDelegate.this;
                    mglPlatformDelegate.triggerConfig = null;
                    mglPlatformDelegate.triggerSchema = null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.bytedance.minigame.bdpbase.core.IBdpPluginInstallListener
                public void onFailed(boolean z2) {
                    int i;
                    if (PatchProxy.proxy(new Object[]{Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 2).isSupported) {
                        return;
                    }
                    MglStateListener mglStateListener2 = mglStateListener;
                    if (mglStateListener2 != null) {
                        if (z2 != 0) {
                            i = BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS;
                        } else {
                            i = 100;
                        }
                        mglStateListener2.onFailed(new BdpError(i, "plugin install failed"));
                    }
                    C63808BFy.LIZ(MglPlatformDelegate.this.triggerSchema, "fail", Long.valueOf(newAndStart.stop()));
                    if (z) {
                        SchemaInfo schemaInfo = MglPlatformDelegate.this.triggerSchema;
                        BdpPluginConfig bdpPluginConfig2 = MglPlatformDelegate.this.triggerConfig;
                        long stop = newAndStart.stop();
                        if (!PatchProxy.proxy(new Object[]{schemaInfo, bdpPluginConfig2, new Long(stop), Byte.valueOf((byte) z2)}, null, C63808BFy.LIZ, true, 3).isSupported) {
                            ((BdpThreadService) BdpManager.getInst().getService(BdpThreadService.class)).executeCPU(new RunnableC63792BFi(schemaInfo, z2, stop));
                        }
                    }
                    MglPlatformDelegate mglPlatformDelegate = MglPlatformDelegate.this;
                    mglPlatformDelegate.triggerConfig = null;
                    mglPlatformDelegate.triggerSchema = null;
                }
            });
            bdpPluginService.install(builder.build());
            C63808BFy.LIZ(this.triggerSchema, "start", null);
            return;
        }
        BdpManager.getInst().addPluginBdpRuntimeProvider(mglPluginPkg);
        if (mglStateListener != null) {
            long j = -1;
            if (this.triggerConfig != null) {
                if (!isPluginReady && !this.triggerConfig.isPluginReady()) {
                    isPluginReady = false;
                } else {
                    isPluginReady = true;
                }
                j = this.triggerConfig.preparePluginCost();
            }
            mglStateListener.onSucceed(isPluginReady, j);
        }
        this.triggerConfig = null;
        this.triggerSchema = null;
    }
}
