package bytekn.foundation.encryption;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes20.dex */
public final class MD5$Companion$1 extends Lambda implements Function0<C0618g> {
    public static final MD5$Companion$1 INSTANCE = new MD5$Companion$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(2622);
    }

    public MD5$Companion$1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [bytekn.foundation.encryption.g, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C0618g mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C0618g();
    }
}
