package com.bytedance.android.annie.lynx.resource;

import com.bytedance.android.annie.api.card.IHybridComponent;
import com.bytedance.android.annie.api.resource.AnnieResType;
import com.bytedance.android.annie.service.resource.C2646h;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.provider.AbsTemplateProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC99696POg;
import p003X.C106862S5w;
import p003X.C99149P3f;
import p003X.PP6;
import p003X.PPA;

/* loaded from: classes7.dex */
public final class LynxTemplateProvider$useGeckoLoader$1$1 extends Lambda implements Function1<C2646h, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PP6 this$0;

    static {
        Covode.recordClassIndex(10830);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxTemplateProvider$useGeckoLoader$1$1(PP6 pp6) {
        super(1);
        this.this$0 = pp6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C2646h c2646h) {
        final C2646h c2646h2 = c2646h;
        if (!PatchProxy.proxy(new Object[]{c2646h2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c2646h2);
            this.this$0.LIZIZ.requestMap.remove(this.this$0.LIZJ);
            if (!this.this$0.LIZIZ.isRelease) {
                final byte[] LIZJ = c2646h2.LIZJ();
                AbstractC99696POg abstractC99696POg = this.this$0.LIZIZ.interceptor;
                if (abstractC99696POg != null) {
                    abstractC99696POg.LIZIZ(this.this$0.LIZJ, AnnieResType.LYNX_TEMPLATE, IHybridComponent.HybridType.LYNX, c2646h2.LIZ());
                }
                PPA ppa = this.this$0.LIZIZ.loadTemplateCallback;
                if (ppa != null) {
                    ppa.LIZ(c2646h2.LIZLLL, c2646h2.f25634LJ, c2646h2.LJI);
                }
                if (LIZJ != null) {
                    C99149P3f.LIZ().post(new Runnable() { // from class: com.bytedance.android.annie.lynx.resource.LynxTemplateProvider$useGeckoLoader$1$1.1
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(10831);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AbsTemplateProvider.Callback callback;
                            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && (callback = LynxTemplateProvider$useGeckoLoader$1$1.this.this$0.LIZLLL) != null) {
                                callback.onSuccess(LIZJ);
                            }
                        }
                    });
                } else {
                    C99149P3f.LIZ().post(new Runnable() { // from class: com.bytedance.android.annie.lynx.resource.LynxTemplateProvider$useGeckoLoader$1$1.2
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(10832);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AbsTemplateProvider.Callback callback;
                            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && (callback = LynxTemplateProvider$useGeckoLoader$1$1.this.this$0.LIZLLL) != null) {
                                callback.onFailed(c2646h2.LIZJ);
                            }
                        }
                    });
                }
            }
        }
        return Unit.INSTANCE;
    }
}
