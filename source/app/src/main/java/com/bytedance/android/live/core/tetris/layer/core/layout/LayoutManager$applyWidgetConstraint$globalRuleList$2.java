package com.bytedance.android.live.core.tetris.layer.core.layout;

import com.bytedance.android.live.core.tetris.layer.view.ElementConstraint;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class LayoutManager$applyWidgetConstraint$globalRuleList$2 extends Lambda implements Function0<List<ElementConstraint.C4116c>> {
    public static final LayoutManager$applyWidgetConstraint$globalRuleList$2 INSTANCE = new LayoutManager$applyWidgetConstraint$globalRuleList$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(23703);
    }

    public LayoutManager$applyWidgetConstraint$globalRuleList$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List<com.bytedance.android.live.core.tetris.layer.view.ElementConstraint$c>] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ List<ElementConstraint.C4116c> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new ArrayList();
    }
}
