package com.bytedance.android.live.pcdn.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.reflect.Constructor;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import p003X.C116971W2r;
import p003X.C90946LsK;

/* loaded from: classes5.dex */
public final class PCDNManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static IPCDNDownloader defaultDownloader;
    public static final PCDNManager INSTANCE = new PCDNManager();
    public static final C90946LsK emptyDownloader = new C90946LsK();

    static {
        Covode.recordClassIndex(32753);
    }

    public final IPCDNDownloader getDownloader() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (IPCDNDownloader) proxy.result;
        }
        IPCDNDownloader iPCDNDownloader = defaultDownloader;
        if (iPCDNDownloader != null) {
            return iPCDNDownloader;
        }
        initDownloader();
        if (defaultDownloader != null) {
            PCDNLogger.INSTANCE.mo15624w("PCDNManager", "getDownloader: defaultDownloader !=null");
            IPCDNDownloader iPCDNDownloader2 = defaultDownloader;
            if (iPCDNDownloader2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.android.live.pcdn.api.IPCDNDownloader");
            }
            return iPCDNDownloader2;
        }
        PCDNLogger.INSTANCE.mo15624w("PCDNManager", "getDownloader: defaultDownloader == null, use emptyDownloader");
        return emptyDownloader;
    }

    private final void initDownloader() {
        IPCDNDownloader iPCDNDownloader;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        try {
            Constructor constructor = C116971W2r.LIZ("com.bytedance.android.live.pcdn.impl.PCDNDownloader").getConstructor(new Class[0]);
            Intrinsics.checkExpressionValueIsNotNull(constructor, "");
            Object newInstance = constructor.newInstance(new Object[0]);
            Intrinsics.checkExpressionValueIsNotNull(newInstance, "");
            if (newInstance instanceof IPCDNDownloader) {
                PCDNLogger.INSTANCE.mo15626i("PCDNManager", "initDownloader: obj is PCDNDownloader ");
                iPCDNDownloader = (IPCDNDownloader) newInstance;
            } else {
                PCDNLogger.INSTANCE.mo15624w("PCDNManager", "initDownloader: obj not is PCDNDownloader");
                iPCDNDownloader = null;
            }
            defaultDownloader = iPCDNDownloader;
        } catch (Throwable th) {
            PCDNLogger.INSTANCE.mo15627e("PCDNManager", "initDownloader failed", th);
        }
    }
}
