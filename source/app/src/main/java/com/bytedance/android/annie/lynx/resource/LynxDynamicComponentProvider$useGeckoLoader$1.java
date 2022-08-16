package com.bytedance.android.annie.lynx.resource;

import com.bytedance.android.annie.api.card.IHybridComponent;
import com.bytedance.android.annie.api.resource.AnnieResType;
import com.bytedance.android.annie.service.resource.C2646h;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.component.DynamicComponentFetcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC99696POg;
import p003X.C106862S5w;
import p003X.C99695POf;

/* loaded from: classes7.dex */
public final class LynxDynamicComponentProvider$useGeckoLoader$1 extends Lambda implements Function1<C2646h, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DynamicComponentFetcher.LoadedHandler $handler;
    public final /* synthetic */ String $url;
    public final /* synthetic */ C99695POf this$0;

    static {
        Covode.recordClassIndex(10828);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxDynamicComponentProvider$useGeckoLoader$1(C99695POf c99695POf, String str, DynamicComponentFetcher.LoadedHandler loadedHandler) {
        super(1);
        this.this$0 = c99695POf;
        this.$url = str;
        this.$handler = loadedHandler;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C2646h c2646h) {
        C2646h c2646h2 = c2646h;
        if (!PatchProxy.proxy(new Object[]{c2646h2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c2646h2);
            this.this$0.requestMap.remove(this.$url);
            if (!this.this$0.isRelease) {
                byte[] LIZJ = c2646h2.LIZJ();
                AbstractC99696POg abstractC99696POg = this.this$0.interceptor;
                if (abstractC99696POg != null) {
                    abstractC99696POg.LIZIZ(this.$url, AnnieResType.LYNX_CHILD_RESOURCE, IHybridComponent.HybridType.LYNX, c2646h2.LIZ());
                }
                if (LIZJ != null) {
                    DynamicComponentFetcher.LoadedHandler loadedHandler = this.$handler;
                    if (loadedHandler != null) {
                        loadedHandler.onComponentLoaded(LIZJ, null);
                    }
                } else {
                    DynamicComponentFetcher.LoadedHandler loadedHandler2 = this.$handler;
                    if (loadedHandler2 != null) {
                        loadedHandler2.onComponentLoaded(null, new Throwable(c2646h2.LIZJ));
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
