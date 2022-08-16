package com.bef.effectsdk;

import android.content.res.AssetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes10.dex */
public final class AssetResourceFinder implements ResourceFinder {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AssetManager mAssetManager;
    public final String mDir;

    static {
        Covode.recordClassIndex(9502);
    }

    public static native long nativeCreateAssetResourceFinder(long j, AssetManager assetManager, String str);

    public static native void nativeReleaseAssetResourceFinder(long j);

    @Override // com.bef.effectsdk.ResourceFinder
    public final synchronized long createNativeResourceFinder(long j) {
        MethodCollector.m14708i(593);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            long longValue = ((Long) proxy.result).longValue();
            MethodCollector.m14707o(593);
            return longValue;
        }
        long nativeCreateAssetResourceFinder = nativeCreateAssetResourceFinder(j, this.mAssetManager, this.mDir);
        MethodCollector.m14707o(593);
        return nativeCreateAssetResourceFinder;
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public final synchronized void release(long j) {
        MethodCollector.m14708i(594);
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 2).isSupported) {
            MethodCollector.m14707o(594);
            return;
        }
        nativeReleaseAssetResourceFinder(j);
        MethodCollector.m14707o(594);
    }

    public AssetResourceFinder(AssetManager assetManager, String str) {
        this.mAssetManager = assetManager;
        this.mDir = str;
    }
}
