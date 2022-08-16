package com.byted.mgl.service.api.host;

import android.app.Application;
import com.byted.mgl.service.api.common.MglTechType;
import com.bytedance.covode.number.Covode;
import com.bytedance.minigame.bdpbase.service.IBdpService;
import com.bytedance.minigame.serviceapi.hostimpl.info.BdpHostInfo;
import org.json.JSONObject;

/* loaded from: classes26.dex */
public interface IMglHostAppService extends IBdpService {
    static {
        Covode.recordClassIndex(9788);
    }

    Application getHostApplication();

    BdpHostInfo getHostInfo();

    String getMglPluginPkg(MglTechType mglTechType);

    JSONObject getSpecialConfig();
}
