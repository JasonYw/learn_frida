package com.bytedance.android.live.core.tetris.layer.view;

import com.bytedance.android.live.core.tetris.layer.core.layout.C4111d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class LayerManager$layoutManager$2 extends Lambda implements Function0<C4111d> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LayerManager this$0;

    static {
        Covode.recordClassIndex(23740);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayerManager$layoutManager$2(LayerManager layerManager) {
        super(0);
        this.this$0 = layerManager;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.android.live.core.tetris.layer.core.layout.d] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4111d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4111d(this.this$0.LIZ());
    }
}
