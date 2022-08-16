package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.widget.UrgeBubbleWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class StartLiveFragment$urgeBubbleWidget$2 extends Lambda implements Function0<UrgeBubbleWidget> {
    public static final StartLiveFragment$urgeBubbleWidget$2 INSTANCE = new StartLiveFragment$urgeBubbleWidget$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(17192);
    }

    public StartLiveFragment$urgeBubbleWidget$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.broadcast.widget.UrgeBubbleWidget] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ UrgeBubbleWidget mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new UrgeBubbleWidget();
    }
}
