package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class AnchorGameMessageChannel$onLaunchFail$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $errorPrompt;
    public final /* synthetic */ Function2 $onResult;

    static {
        Covode.recordClassIndex(20249);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorGameMessageChannel$onLaunchFail$1(Function2 function2, String str) {
        super(0);
        this.$onResult = function2;
        this.$errorPrompt = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.$onResult.invoke(Boolean.FALSE, this.$errorPrompt);
        }
        return Unit.INSTANCE;
    }
}
