package com.bytedance.android.live.broadcastgame.opengame.panel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class FullScreenOpenPanel$token$2 extends Lambda implements Function0<Integer> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ FullScreenOpenPanel this$0;

    static {
        Covode.recordClassIndex(20769);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenOpenPanel$token$2(FullScreenOpenPanel fullScreenOpenPanel) {
        super(0);
        this.this$0 = fullScreenOpenPanel;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Integer mo30099invoke() {
        int intExtra;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            intExtra = ((Integer) proxy.result).intValue();
        } else {
            intExtra = this.this$0.getIntent().getIntExtra("token", 0);
        }
        return Integer.valueOf(intExtra);
    }
}
