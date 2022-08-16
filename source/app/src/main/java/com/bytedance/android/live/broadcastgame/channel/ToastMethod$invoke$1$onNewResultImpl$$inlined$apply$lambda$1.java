package com.bytedance.android.live.broadcastgame.channel;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C88442Kt2;
import p003X.IUH;

/* loaded from: classes3.dex */
public final class ToastMethod$invoke$1$onNewResultImpl$$inlined$apply$lambda$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Bitmap $bitmap$inlined;
    public final /* synthetic */ IUH this$0;

    static {
        Covode.recordClassIndex(19383);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastMethod$invoke$1$onNewResultImpl$$inlined$apply$lambda$1(IUH iuh, Bitmap bitmap) {
        super(0);
        this.this$0 = iuh;
        this.$bitmap$inlined = bitmap;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        Bitmap copy;
        MethodCollector.m14708i(1402);
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (copy = this.$bitmap$inlined.copy(Bitmap.Config.ARGB_8888, true)) != null) {
            C88442Kt2 c88442Kt2 = C88442Kt2.LIZIZ;
            Context context = this.this$0.LIZIZ.LIZIZ;
            String str = this.this$0.LIZJ;
            Intrinsics.checkNotNullExpressionValue(str, "");
            c88442Kt2.LIZ(context, str, (Drawable) new BitmapDrawable(copy), 0, true);
        }
        Unit unit = Unit.INSTANCE;
        MethodCollector.m14707o(1402);
        return unit;
    }
}
