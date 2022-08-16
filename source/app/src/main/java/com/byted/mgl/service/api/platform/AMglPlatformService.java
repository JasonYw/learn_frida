package com.byted.mgl.service.api.platform;

import android.content.Context;
import com.byted.mgl.service.api.common.MglStateListener;
import com.byted.mgl.service.api.common.MglTechType;
import com.bytedance.covode.number.Covode;
import com.bytedance.minigame.bdpbase.core.MglOpenParams;
import com.bytedance.minigame.bdpbase.service.IBdpService;
import com.bytedance.minigame.serviceapi.hostimpl.hostmethod.BdpHostMethod;
import com.minigame.miniapphost.entity.PreLoadAppEntity;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes26.dex */
public interface AMglPlatformService extends IBdpService {
    static {
        Covode.recordClassIndex(9794);
    }

    void dispatchHostEvent(String str, JSONObject jSONObject);

    void open(String str);

    void open(String str, MglOpenParams mglOpenParams, MglOpenListener mglOpenListener);

    void preload(List<PreLoadAppEntity> list, Map<String, String> map, MglPreloadListener mglPreloadListener);

    void prepare(MglTechType mglTechType, Context context, MglStateListener mglStateListener);

    void preparePlugin(MglTechType mglTechType, Context context, MglStateListener mglStateListener);

    void preparePlugin(MglTechType mglTechType, Context context, boolean z, MglStateListener mglStateListener);

    void registerHostMethod(BdpHostMethod bdpHostMethod);
}
