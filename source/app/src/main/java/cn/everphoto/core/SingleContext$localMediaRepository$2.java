package cn.everphoto.core;

import cn.everphoto.core.localmedia.C0775a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes23.dex */
public final class SingleContext$localMediaRepository$2 extends Lambda implements Function0<C0775a> {
    public static final SingleContext$localMediaRepository$2 INSTANCE = new SingleContext$localMediaRepository$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3521);
    }

    public SingleContext$localMediaRepository$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [cn.everphoto.core.localmedia.a, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C0775a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C0775a();
    }
}
