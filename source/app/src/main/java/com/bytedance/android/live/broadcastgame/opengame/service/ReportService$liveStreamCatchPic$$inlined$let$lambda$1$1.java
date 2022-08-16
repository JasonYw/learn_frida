package com.bytedance.android.live.broadcastgame.opengame.service;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C88075Kn7;

/* loaded from: classes5.dex */
public final class ReportService$liveStreamCatchPic$$inlined$let$lambda$1$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Bitmap $bitmap;
    public final /* synthetic */ C88075Kn7 this$0;

    static {
        Covode.recordClassIndex(21033);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportService$liveStreamCatchPic$$inlined$let$lambda$1$1(C88075Kn7 c88075Kn7, Bitmap bitmap) {
        super(0);
        this.this$0 = c88075Kn7;
        this.$bitmap = bitmap;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            Function1 function1 = this.this$0.LIZJ;
            Bitmap bitmap = this.$bitmap;
            Intrinsics.checkNotNullExpressionValue(bitmap, "");
            function1.invoke(bitmap);
        }
        return Unit.INSTANCE;
    }
}
