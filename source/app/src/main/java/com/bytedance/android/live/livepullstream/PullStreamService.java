package com.bytedance.android.live.livepullstream;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.monitor.LiveTracingMonitor;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostPlugin;
import com.bytedance.android.livehostapi.foundation.depend.PluginType;
import com.bytedance.android.livesdk.config.LiveInitSettingKeys;
import com.bytedance.android.livesdkapi.roomplayer.AbstractC9685d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC408932Gp;
import p003X.AbstractC91058Lu8;
import p003X.AnonymousClass425;
import p003X.C109169SyZ;
import p003X.C146357f1b;
import p003X.C146358f1c;
import p003X.C48M;
import p003X.PWX;
import p003X.VAA;

/* loaded from: classes19.dex */
public class PullStreamService implements IPullStreamService {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32103);
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public PWX getLivePlayerOptimizer() {
        return C48M.LIZIZ;
    }

    public PullStreamService() {
        ServiceManager.registerService(IPullStreamService.class, this);
        if (!PatchProxy.proxy(new Object[]{this}, null, C146358f1c.LIZ, true, 1).isSupported && LiveInitSettingKeys.get_LIVE_ENABLE_PULL_STREAM_SO_PLUGIN()) {
            ALogger.m15801d("pull-stream-plugin-load", "setupLibraryLoader for douyin!");
            C109169SyZ.LIZIZ = new C146357f1b(this);
        }
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public void tryInstallPullStreamPlugin() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        if (!LiveInitSettingKeys.get_LIVE_ENABLE_PULL_STREAM_SO_PLUGIN()) {
            ALogger.m15801d("pull-stream-plugin-load", "live_enable_pull_stream_so_plugin: false ! tryInstallPullStreamPlugin failed");
        } else if (PluginType.PullSo.LIZIZ()) {
        } else {
            ALogger.m15801d("pull-stream-plugin-load", "start install pull stream so !");
            IHostPlugin iHostPlugin = (IHostPlugin) ServiceManager.getService(IHostPlugin.class);
            if (iHostPlugin == null) {
                ALogger.m15801d("pull-stream-plugin-load", "null IHostPlugin");
                return;
            }
            Application LIZ = AnonymousClass425.LIZ();
            if (LIZ == null) {
                ALogger.m15801d("pull-stream-plugin-load", "null context");
            } else {
                iHostPlugin.check(LIZ, PluginType.PullSo, "", new AbstractC91058Lu8() { // from class: com.bytedance.android.live.livepullstream.PullStreamService.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(32104);
                    }

                    @Override // p003X.AbstractC91058Lu8
                    public final void LIZ(String str) {
                        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        PullStreamService.this.monitorSoLoad(str, "plugin_install_success", true);
                        ALogger.m15801d("pull-stream-plugin-load", "pull stream so plugin install success!");
                    }

                    @Override // p003X.AbstractC91058Lu8
                    public final void LIZIZ(String str) {
                        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported) {
                            return;
                        }
                        PullStreamService.this.monitorSoLoad(str, "plugin_install_failed", false);
                        ALogger.m15801d("pull-stream-plugin-load", "pull stream so plugin install failed!");
                    }
                }, false);
            }
        }
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public int loadLibrary(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (!LiveInitSettingKeys.get_LIVE_ENABLE_PULL_STREAM_SO_PLUGIN()) {
            ALogger.m15801d("pull-stream-plugin-load", "live_enable_pull_stream_so_plugin: false ! load $soName failed");
            return -1;
        }
        ALogger.m15801d("pull-stream-plugin-load", "loadLibrary " + str + " so");
        IHostPlugin iHostPlugin = (IHostPlugin) ServiceManager.getService(IHostPlugin.class);
        if (iHostPlugin == null) {
            monitorSoLoad(str, "null_host_plugin", false);
            ALogger.m15801d("pull-stream-plugin-load", "null IHostPlugin");
            return -1;
        }
        Application LIZ = AnonymousClass425.LIZ();
        if (LIZ == null) {
            monitorSoLoad(str, "null_context", false);
            ALogger.m15801d("pull-stream-plugin-load", "null context");
            return -1;
        } else if (PluginType.PullSo.LIZIZ()) {
            ALogger.m15801d("pull-stream-plugin-load", "start load " + str + " so , current is full pkg : " + iHostPlugin.isFull());
            try {
                if (iHostPlugin.loadLibrary(0, LIZ, PluginType.PullSo.LIZ(), str, null)) {
                    monitorSoLoad(str, "load_success", true);
                    ALogger.m15801d("pull-stream-plugin-load", "load " + str + " so success!");
                    return 0;
                }
                ALogger.m15801d("pull-stream-plugin-load", "load " + str + " so failed!");
                monitorSoLoad(str, "load_failed", false);
                return -1;
            } catch (Throwable th) {
                monitorSoLoad(str, "load_exception", false);
                ALogger.m15801d("pull-stream-plugin-load", "load " + str + " so failed! " + th.getMessage());
                return -1;
            }
        } else {
            ALogger.m15801d("pull-stream-plugin-load", "load " + str + " failed! plugin not install");
            return -1;
        }
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public AbstractC408932Gp getLiveStatusErrorView(Context context, AbstractC9685d abstractC9685d) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, abstractC9685d}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (AbstractC408932Gp) proxy.result;
        }
        return new VAA(context, abstractC9685d);
    }

    @Override // p003X.AbstractC102354QSm
    public boolean prePullStream(long j, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), bundle}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C48M.LIZIZ.LIZ(j, bundle);
    }

    public boolean loadPluginLibrary(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        ALogger.m15801d("pull-stream-plugin-load", "loadPluginLibrary!");
        IHostPlugin iHostPlugin = (IHostPlugin) ServiceManager.getService(IHostPlugin.class);
        if (iHostPlugin == null) {
            monitorSoLoad(str, "null_host_plugin", false);
            ALogger.m15801d("pull-stream-plugin-load", "null IHostPlugin");
            return false;
        }
        Application LIZ = AnonymousClass425.LIZ();
        if (LIZ == null) {
            monitorSoLoad(str, "null_context", false);
            ALogger.m15801d("pull-stream-plugin-load", "null context");
            return false;
        }
        try {
            if (iHostPlugin.loadLibrary(4, LIZ, str2, str, null)) {
                monitorSoLoad(str, "load_success", true);
                ALogger.m15801d("pull-stream-plugin-load", C0002O.m25085C("load ", str, " so success!"));
                return true;
            }
            ALogger.m15801d("pull-stream-plugin-load", C0002O.m25085C("load ", str, " so failed!"));
            monitorSoLoad(str, "load_failed", false);
            return false;
        } catch (Throwable th) {
            monitorSoLoad(str, "load_exception", false);
            ALogger.m15801d("pull-stream-plugin-load", C0002O.m25084C("load ", str, " so failed! ", th.getMessage()));
            return false;
        }
    }

    @Override // p003X.AbstractC102354QSm
    public boolean preCreateSurface(Context context, long j, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, new Long(j), bundle}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C48M.LIZIZ.LIZ(context, j, bundle);
    }

    public void monitorSoLoad(String str, String str2, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("result", z);
            jSONObject2.put("desc", str2);
            LiveTracingMonitor.LIZ("ttlive_pull_stream_so_load", LiveTracingMonitor.EventModule.PULL_STREAM, LiveTracingMonitor.EventType.BUSSINESS_API_CALL, jSONObject, jSONObject2, (JSONObject) null);
        } catch (JSONException e) {
            ALogger.m15801d("pull-stream-plugin-load", C0002O.m25086C("report so load log failed ", e.getMessage()));
        }
    }
}
