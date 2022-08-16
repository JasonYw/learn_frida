package com.bytedance.android.latch.internal;

import com.bytedance.android.latch.internal.jsb.module.LynxLatchModule;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.jsbridge.LynxModule;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC137655ckl;
import p003X.AbstractC99730PPo;
import p003X.T6X;

/* loaded from: classes10.dex */
public final class BaseLatchProcess$lynxModuleCreation$2 extends Lambda implements Function0<C27611> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC137655ckl this$0;

    static {
        Covode.recordClassIndex(13705);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseLatchProcess$lynxModuleCreation$2(AbstractC137655ckl abstractC137655ckl) {
        super(0);
        this.this$0 = abstractC137655ckl;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.android.latch.internal.BaseLatchProcess$lynxModuleCreation$2$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.latch.internal.BaseLatchProcess$lynxModuleCreation$2$1] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C27611 mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new AbstractC99730PPo() { // from class: com.bytedance.android.latch.internal.BaseLatchProcess$lynxModuleCreation$2.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(13706);
            }

            @Override // p003X.AbstractC99730PPo
            public final String LIZ() {
                return "latch";
            }

            @Override // p003X.AbstractC99730PPo
            public final Class<? extends LynxModule> LIZIZ() {
                return LynxLatchModule.class;
            }

            @Override // p003X.AbstractC99730PPo
            public final Object LIZJ() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                return new T6X(BaseLatchProcess$lynxModuleCreation$2.this.this$0.LIZLLL, new BaseLatchProcess$lynxModuleCreation$2$1$params$1(BaseLatchProcess$lynxModuleCreation$2.this.this$0));
            }
        };
    }
}
