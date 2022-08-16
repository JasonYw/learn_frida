package com.bytedance.android.annie.api.monitor;

import android.os.Bundle;
import android.view.View;
import com.bytedance.android.annie.api.card.IHybridComponent;
import com.bytedance.android.annie.api.resource.AnnieResType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import java.util.Set;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public class CommonLifecycle implements AbstractC2582a {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10482);
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onAttachView(View view, IHybridComponent.HybridType hybridType, String str) {
        if (PatchProxy.proxy(new Object[]{view, hybridType, str}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(view, hybridType);
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onBeforeCreateRenderData(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onBeforeGlobalPropsInitialize() {
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onBeforeInitialPropsInitialize() {
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onBeforeJsbRegister() {
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onBeforeLoadRequest(String str, AnnieResType annieResType, IHybridComponent.HybridType hybridType, Map<String, Object> map) {
        if (PatchProxy.proxy(new Object[]{str, annieResType, hybridType, map}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, annieResType, hybridType);
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onBeforeLynxEnvInitialize(boolean z) {
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onBeforeOpenContainer() {
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onCardLoadStart() {
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onContainerError(View view, int i, String str) {
        if (PatchProxy.proxy(new Object[]{view, Integer.valueOf(i), str}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onContainerInitEnd() {
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onContainerInitStart() {
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onCreateRenderData(View view, Set<String> set) {
        if (PatchProxy.proxy(new Object[]{view, set}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(view, set);
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onEngineLoadEnd() {
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onEngineLoadStart() {
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public boolean onFallback(int i, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(str);
        return false;
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onGlobalPropsInitialized() {
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onInit(Bundle bundle) {
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onInitialPropsInitialized() {
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onInnerFallback(int i, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onJsbRegistered() {
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onLoadFail(View view, String str, String str2) {
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onLoadStart(View view, boolean z) {
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onLoadSuccess(View view) {
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onLynxEnvInitialized() {
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onPrepareComponentEnd() {
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onPrepareComponentStart() {
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onPrepareInitDataEnd() {
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onPrepareInitDataStart(String str, String str2, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onPrepareTemplateEnd(boolean z) {
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onPrepareTemplateEnd(boolean z, String str) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onPrepareTemplateStart() {
    }

    @Override // com.bytedance.android.annie.api.monitor.AbstractC2582a
    public void onRelease() {
    }
}
