package com.bytedance.android.annie.lynx.resource;

import com.bytedance.android.annie.api.card.IHybridComponent;
import com.bytedance.android.annie.api.resource.AnnieResType;
import com.bytedance.android.annie.service.resource.C2646h;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.provider.LynxResourceCallback;
import com.lynx.tasm.provider.LynxResourceResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC99696POg;
import p003X.C106862S5w;
import p003X.RunnableC99693POd;

/* loaded from: classes7.dex */
public final class LynxExternalJSProvider$request$1$2 extends Lambda implements Function1<C2646h, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ RunnableC99693POd this$0;

    static {
        Covode.recordClassIndex(10829);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxExternalJSProvider$request$1$2(RunnableC99693POd runnableC99693POd) {
        super(1);
        this.this$0 = runnableC99693POd;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C2646h c2646h) {
        C2646h c2646h2 = c2646h;
        if (!PatchProxy.proxy(new Object[]{c2646h2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c2646h2);
            this.this$0.LIZIZ.requestMap.remove(this.this$0.LIZJ.getUrl());
            if (!this.this$0.LIZIZ.isRelease) {
                byte[] LIZJ = c2646h2.LIZJ();
                AbstractC99696POg abstractC99696POg = this.this$0.LIZIZ.interceptor;
                if (abstractC99696POg != null) {
                    String url = this.this$0.LIZJ.getUrl();
                    Intrinsics.checkNotNullExpressionValue(url, "");
                    abstractC99696POg.LIZIZ(url, AnnieResType.LYNX_CHILD_RESOURCE, IHybridComponent.HybridType.LYNX, c2646h2.LIZ());
                }
                if (LIZJ != null) {
                    this.this$0.LIZLLL.onResponse(LynxResourceResponse.success(LIZJ));
                } else {
                    LynxResourceCallback lynxResourceCallback = this.this$0.LIZLLL;
                    LynxResourceResponse failed = LynxResourceResponse.failed(-1, new Throwable(c2646h2.LIZJ));
                    if (failed != null) {
                        lynxResourceCallback.onResponse(failed);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.lynx.tasm.provider.LynxResourceResponse<kotlin.ByteArray>");
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
