package com.bytedance.android.live.broadcastgame.opengame.runtime;

import com.bytedance.android.live.broadcastgame.opengame.cloud.C3484a;
import com.bytedance.android.live.broadcastgame.opengame.cloud.C3486e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC87670Kga;
import p003X.C88260Kq6;

/* loaded from: classes5.dex */
public final class OpenApiSupportPluginRuntime$cloudExecutor$2 extends Lambda implements Function0<C3484a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC87670Kga this$0;

    static {
        Covode.recordClassIndex(20888);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenApiSupportPluginRuntime$cloudExecutor$2(AbstractC87670Kga abstractC87670Kga) {
        super(0);
        this.this$0 = abstractC87670Kga;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.bytedance.android.live.broadcastgame.opengame.cloud.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.bytedance.android.live.broadcastgame.opengame.cloud.a, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3484a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        AbstractC87670Kga abstractC87670Kga = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], abstractC87670Kga, AbstractC87670Kga.LJIJ, false, 2);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        C3484a c3484a = new C3484a(abstractC87670Kga.LJIILJJIL().LJII);
        File file = abstractC87670Kga.LJIILJJIL().LJIIJJI;
        if (file != null) {
            long LIZ = C88260Kq6.LIZIZ.LIZ(file);
            C3486e LIZ2 = c3484a.LIZ();
            if (1 <= LIZ && 60000 >= LIZ) {
                LIZ2.LIZIZ = LIZ;
            } else {
                LIZ2.LIZIZ = 60000L;
                return c3484a;
            }
        }
        return c3484a;
    }
}
