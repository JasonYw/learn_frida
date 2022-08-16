package cn.everphoto.onekey;

import cn.everphoto.core.cvinfo.cache.AbstractC0770c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C116381Vrb;

/* loaded from: classes13.dex */
public final class OneKeySchedulerImpl$assetCVInfoRepository$2 extends Lambda implements Function0<AbstractC0770c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C116381Vrb this$0;

    static {
        Covode.recordClassIndex(3633);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneKeySchedulerImpl$assetCVInfoRepository$2(C116381Vrb c116381Vrb) {
        super(0);
        this.this$0 = c116381Vrb;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, cn.everphoto.core.cvinfo.cache.c] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AbstractC0770c mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        this.this$0.LJIIIZ.LIZ();
        return this.this$0.LJIIIZ;
    }
}
