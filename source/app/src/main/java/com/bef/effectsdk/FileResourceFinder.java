package com.bef.effectsdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes10.dex */
public final class FileResourceFinder implements ResourceFinder {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String mDir;

    static {
        Covode.recordClassIndex(9516);
    }

    public static native long nativeCreateFileResourceFinder(long j, String str);

    @Override // com.bef.effectsdk.ResourceFinder
    public final void release(long j) {
    }

    public FileResourceFinder(String str) {
        this.mDir = str;
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public final long createNativeResourceFinder(long j) {
        MethodCollector.m14708i(618);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            long longValue = ((Long) proxy.result).longValue();
            MethodCollector.m14707o(618);
            return longValue;
        }
        long nativeCreateFileResourceFinder = nativeCreateFileResourceFinder(j, this.mDir);
        MethodCollector.m14707o(618);
        return nativeCreateFileResourceFinder;
    }
}
