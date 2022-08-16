package com.bytedance.android.live.broadcast.widget;

import android.net.Uri;
import android.view.View;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C87308Kak;

/* loaded from: classes3.dex */
public final class PreviewAllStarGraphTaskWidget$onCreate$2 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewAllStarGraphTaskWidget this$0;

    static {
        Covode.recordClassIndex(18413);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewAllStarGraphTaskWidget$onCreate$2(PreviewAllStarGraphTaskWidget previewAllStarGraphTaskWidget) {
        super(1);
        this.this$0 = previewAllStarGraphTaskWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        ILiveActionHandler iLiveActionHandler;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            String str = this.this$0.LIZIZ;
            if (str != null) {
                this.this$0.LIZ(false);
                C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7239fb;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                c87308Kak.LIZ(Boolean.TRUE);
                if (str.length() > 0 && (iLiveActionHandler = (ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class)) != null) {
                    iLiveActionHandler.handle(this.this$0.context, Uri.parse(str));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
