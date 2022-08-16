package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.core.tetris.widgets.LiveWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.KK6;

/* loaded from: classes5.dex */
public final class StartLiveFragment$selectLiveTypeWidget$2 extends Lambda implements Function0<LiveWidget> {
    public static final StartLiveFragment$selectLiveTypeWidget$2 INSTANCE = new StartLiveFragment$selectLiveTypeWidget$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(17189);
    }

    public StartLiveFragment$selectLiveTypeWidget$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.core.tetris.widgets.LiveWidget] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ LiveWidget mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return KK6.LIZIZ();
    }
}
