package com.bytedance.android.live.core.tetris.layer.view;

import com.bytedance.android.live.core.tetris.layer.core.layout.C4109b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class LayerManager$globalElementCenter$2 extends Lambda implements Function0<C4109b> {
    public static final LayerManager$globalElementCenter$2 INSTANCE = new LayerManager$globalElementCenter$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(23739);
    }

    public LayerManager$globalElementCenter$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.core.tetris.layer.core.layout.b, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4109b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4109b();
    }
}
