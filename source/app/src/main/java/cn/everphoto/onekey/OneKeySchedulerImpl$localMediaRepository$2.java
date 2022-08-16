package cn.everphoto.onekey;

import cn.everphoto.core.localmedia.AbstractC0776b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C116381Vrb;

/* loaded from: classes13.dex */
public final class OneKeySchedulerImpl$localMediaRepository$2 extends Lambda implements Function0<AbstractC0776b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C116381Vrb this$0;

    static {
        Covode.recordClassIndex(3634);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneKeySchedulerImpl$localMediaRepository$2(C116381Vrb c116381Vrb) {
        super(0);
        this.this$0 = c116381Vrb;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [cn.everphoto.core.localmedia.b, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AbstractC0776b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        this.this$0.LJIIIIZZ.LIZ();
        return this.this$0.LJIIIIZZ;
    }
}
