package com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C87626Kfs;

/* loaded from: classes5.dex */
public final class AnchorMiniAppPluginRuntime$start$2 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87626Kfs this$0;

    static {
        Covode.recordClassIndex(21769);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorMiniAppPluginRuntime$start$2(C87626Kfs c87626Kfs) {
        super(1);
        this.this$0 = c87626Kfs;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ(str2);
        }
        return Unit.INSTANCE;
    }
}
