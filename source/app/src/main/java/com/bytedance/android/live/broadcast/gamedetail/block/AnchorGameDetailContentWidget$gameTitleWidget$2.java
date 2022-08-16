package com.bytedance.android.live.broadcast.gamedetail.block;

import com.bytedance.android.live.broadcast.gamedetail.block.widget.GameTitleBarWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class AnchorGameDetailContentWidget$gameTitleWidget$2 extends Lambda implements Function0<GameTitleBarWidget> {
    public static final AnchorGameDetailContentWidget$gameTitleWidget$2 INSTANCE = new AnchorGameDetailContentWidget$gameTitleWidget$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16150);
    }

    public AnchorGameDetailContentWidget$gameTitleWidget$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.broadcast.gamedetail.block.widget.GameTitleBarWidget] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ GameTitleBarWidget mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new GameTitleBarWidget(true);
    }
}
