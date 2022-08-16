package cn.ever.cloud.android;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.K8J;

/* loaded from: classes23.dex */
public final class DummyMediaUploadCompleterImpl_Factory implements K8J<DummyMediaUploadCompleterImpl> {
    public static final DummyMediaUploadCompleterImpl_Factory INSTANCE = new DummyMediaUploadCompleterImpl_Factory();
    public static ChangeQuickRedirect changeQuickRedirect;

    public static DummyMediaUploadCompleterImpl_Factory create() {
        return INSTANCE;
    }

    static {
        Covode.recordClassIndex(2740);
    }

    public static DummyMediaUploadCompleterImpl newDummyMediaUploadCompleterImpl() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (DummyMediaUploadCompleterImpl) proxy.result;
        }
        return new DummyMediaUploadCompleterImpl();
    }

    public static DummyMediaUploadCompleterImpl provideInstance() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (DummyMediaUploadCompleterImpl) proxy.result;
        }
        return new DummyMediaUploadCompleterImpl();
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final DummyMediaUploadCompleterImpl mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (DummyMediaUploadCompleterImpl) proxy.result;
        }
        return provideInstance();
    }
}
