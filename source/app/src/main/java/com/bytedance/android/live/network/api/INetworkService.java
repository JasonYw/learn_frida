package com.bytedance.android.live.network.api;

import android.view.View;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livehostapi.foundation.IHostNetwork;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* loaded from: classes12.dex */
public interface INetworkService extends IService, IHostNetwork {
    static {
        Covode.recordClassIndex(32615);
    }

    <T> AbstractC10531b<T> getProtoDecoder(Class<T> cls);

    void injectProtoDecoders(Map<Class, AbstractC10531b> map);

    void loadNinePatchDrawable(ImageModel imageModel, View view, boolean z, Runnable runnable);

    void putCommonParams(Map<String, String> map);

    void setEnsureProtoDecodersInjected(Runnable runnable);
}
