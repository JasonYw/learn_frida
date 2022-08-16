package com.byted.mgl.service.impl.host;

import android.app.Application;
import android.os.SystemClock;
import android.util.SparseArray;
import com.byted.mgl.service.api.common.MglTechType;
import com.byted.mgl.service.api.host.IMglHostAppService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.minigame.serviceapi.hostimpl.info.BdpHostInfo;
import org.json.JSONObject;

/* loaded from: classes26.dex */
public class MglHostAppServiceImpl implements IMglHostAppService {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final long mStartUpTime = SystemClock.elapsedRealtime();

    static {
        Covode.recordClassIndex(9815);
    }

    @Override // com.byted.mgl.service.api.host.IMglHostAppService
    public Application getHostApplication() {
        return null;
    }

    @Override // com.byted.mgl.service.api.host.IMglHostAppService
    public String getMglPluginPkg(MglTechType mglTechType) {
        return null;
    }

    @Override // com.byted.mgl.service.api.host.IMglHostAppService
    public JSONObject getSpecialConfig() {
        return null;
    }

    @Override // com.byted.mgl.service.api.host.IMglHostAppService
    public BdpHostInfo getHostInfo() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (BdpHostInfo) proxy.result;
        }
        return new BdpHostInfo() { // from class: com.byted.mgl.service.impl.host.MglHostAppServiceImpl.1
            static {
                Covode.recordClassIndex(9816);
            }

            @Override // com.bytedance.minigame.serviceapi.hostimpl.info.BdpHostInfo
            public SparseArray<String> extraInfo() {
                return null;
            }

            @Override // com.bytedance.minigame.serviceapi.hostimpl.info.BdpHostInfo
            public String getAppId() {
                return "";
            }

            @Override // com.bytedance.minigame.serviceapi.hostimpl.info.BdpHostInfo
            public String getAppName() {
                return "";
            }

            @Override // com.bytedance.minigame.serviceapi.hostimpl.info.BdpHostInfo
            public String getChannel() {
                return "";
            }

            @Override // com.bytedance.minigame.serviceapi.hostimpl.info.BdpHostInfo
            public String getDeviceId() {
                return "";
            }

            @Override // com.bytedance.minigame.serviceapi.hostimpl.info.BdpHostInfo
            public String getDevicePlatform() {
                return "";
            }

            @Override // com.bytedance.minigame.serviceapi.hostimpl.info.BdpHostInfo
            public String getFeedbackKey() {
                return "";
            }

            @Override // com.bytedance.minigame.serviceapi.hostimpl.info.BdpHostInfo
            public String getFileProvider() {
                return null;
            }

            @Override // com.bytedance.minigame.serviceapi.hostimpl.info.BdpHostInfo
            public String getHostAbi() {
                return "";
            }

            @Override // com.bytedance.minigame.serviceapi.hostimpl.info.BdpHostInfo
            public String getInstallId() {
                return "";
            }

            @Override // com.bytedance.minigame.serviceapi.hostimpl.info.BdpHostInfo
            public String getOsVersion() {
                return "";
            }

            @Override // com.bytedance.minigame.serviceapi.hostimpl.info.BdpHostInfo
            public String getPluginVersion() {
                return "";
            }

            @Override // com.bytedance.minigame.serviceapi.hostimpl.info.BdpHostInfo
            public String getShortcutClassName() {
                return "";
            }

            @Override // com.bytedance.minigame.serviceapi.hostimpl.info.BdpHostInfo
            public String getUaName() {
                return "";
            }

            @Override // com.bytedance.minigame.serviceapi.hostimpl.info.BdpHostInfo
            public String getUpdateVersionCode() {
                return "";
            }

            @Override // com.bytedance.minigame.serviceapi.hostimpl.info.BdpHostInfo
            public String getVersionCode() {
                return "";
            }

            @Override // com.bytedance.minigame.serviceapi.hostimpl.info.BdpHostInfo
            public String getVersionName() {
                return "";
            }

            @Override // com.bytedance.minigame.serviceapi.hostimpl.info.BdpHostInfo
            public boolean isDebugMode() {
                return true;
            }

            @Override // com.bytedance.minigame.serviceapi.hostimpl.info.BdpHostInfo
            public long getHostStartUpElapsedRealtime() {
                return MglHostAppServiceImpl.this.mStartUpTime;
            }
        };
    }
}
