package com.bytedance.android.annie.api.monitor;

import android.os.Bundle;
import android.view.View;
import com.bytedance.android.annie.api.card.IHybridComponent;
import com.bytedance.android.annie.api.resource.AnnieResType;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.android.annie.api.monitor.a */
/* loaded from: classes8.dex */
public interface AbstractC2582a {
    static {
        Covode.recordClassIndex(10483);
    }

    void onAttachView(View view, IHybridComponent.HybridType hybridType, String str);

    void onBeforeCreateRenderData(View view);

    void onBeforeGlobalPropsInitialize();

    void onBeforeInitialPropsInitialize();

    void onBeforeJsbRegister();

    void onBeforeLoadRequest(String str, AnnieResType annieResType, IHybridComponent.HybridType hybridType, Map<String, Object> map);

    void onBeforeLynxEnvInitialize(boolean z);

    void onBeforeOpenContainer();

    void onCardLoadStart();

    void onContainerError(View view, int i, String str);

    void onContainerInitEnd();

    void onContainerInitStart();

    void onCreateRenderData(View view, Set<String> set);

    void onEngineLoadEnd();

    void onEngineLoadStart();

    boolean onFallback(int i, String str);

    void onGlobalPropsInitialized();

    void onInit(Bundle bundle);

    void onInitialPropsInitialized();

    void onInnerFallback(int i, String str);

    void onJsbRegistered();

    void onLoadFail(View view, String str, String str2);

    void onLoadStart(View view, boolean z);

    void onLoadSuccess(View view);

    void onLynxEnvInitialized();

    void onPrepareComponentEnd();

    void onPrepareComponentStart();

    void onPrepareInitDataEnd();

    void onPrepareInitDataStart(String str, String str2, boolean z);

    void onPrepareTemplateEnd(boolean z);

    void onPrepareTemplateEnd(boolean z, String str);

    void onPrepareTemplateStart();

    void onRelease();
}
