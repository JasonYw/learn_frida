package com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C87626Kfs;

/* loaded from: classes5.dex */
public final class AnchorMiniAppPluginRuntime$requestAppStart$2 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function0 $fail;
    public final /* synthetic */ C87626Kfs this$0;

    static {
        Covode.recordClassIndex(21766);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorMiniAppPluginRuntime$requestAppStart$2(C87626Kfs c87626Kfs, Function0 function0) {
        super(1);
        this.this$0 = c87626Kfs;
        this.$fail = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
            this.$fail.mo30099invoke();
            C87626Kfs c87626Kfs = this.this$0;
            if (!PatchProxy.proxy(new Object[]{c87626Kfs, null, 1, null}, null, C87626Kfs.LIZ, true, 6).isSupported) {
                c87626Kfs.LIZIZ((String) null);
            }
        }
        return Unit.INSTANCE;
    }
}
