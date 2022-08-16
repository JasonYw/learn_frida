package cn.everphoto.core.cvinfo.cache;

import cn.everphoto.core.localmedia.AbstractC0776b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C116361VrH;

/* loaded from: classes13.dex */
public final class AssetCVInfoRepositoryImpl$localMediaRepository$2 extends Lambda implements Function0<AbstractC0776b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C116361VrH this$0;

    static {
        Covode.recordClassIndex(3538);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetCVInfoRepositoryImpl$localMediaRepository$2(C116361VrH c116361VrH) {
        super(0);
        this.this$0 = c116361VrH;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [cn.everphoto.core.localmedia.b, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AbstractC0776b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        this.this$0.LIZLLL.LIZ();
        return this.this$0.LIZLLL;
    }
}
