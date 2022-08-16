package com.bytedance.android.live.broadcast.floatview;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.common.util.UriUtil;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.interfaces.DraweeController;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class BroadcastFloatWindowWidget$silenceMicController$2 extends Lambda implements Function0<DraweeController> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ BroadcastFloatWindowWidget this$0;

    static {
        Covode.recordClassIndex(15872);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastFloatWindowWidget$silenceMicController$2(BroadcastFloatWindowWidget broadcastFloatWindowWidget) {
        super(0);
        this.this$0 = broadcastFloatWindowWidget;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.facebook.drawee.interfaces.DraweeController, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.drawee.interfaces.DraweeController, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ DraweeController mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{2130855472}, this.this$0, BroadcastFloatWindowWidget.LIZ, false, 24);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        AbstractDraweeController mo27965build = Fresco.newDraweeControllerBuilder().mo27962setUri(UriUtil.getUriForResourceId(2130855472)).setAutoPlayAnimations(false).mo27965build();
        Intrinsics.checkNotNullExpressionValue(mo27965build, "");
        return mo27965build;
    }
}
