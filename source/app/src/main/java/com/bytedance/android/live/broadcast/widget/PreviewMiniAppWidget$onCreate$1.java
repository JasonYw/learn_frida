package com.bytedance.android.live.broadcast.widget;

import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.api.model.PermissionResult;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C2VQ;
import p003X.C4574547f;
import p003X.C87793KiZ;

/* loaded from: classes12.dex */
public final class PreviewMiniAppWidget$onCreate$1 extends Lambda implements Function1<PermissionResult, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewMiniAppWidget this$0;

    static {
        Covode.recordClassIndex(18617);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewMiniAppWidget$onCreate$1(PreviewMiniAppWidget previewMiniAppWidget) {
        super(1);
        this.this$0 = previewMiniAppWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(PermissionResult permissionResult) {
        PermissionResult permissionResult2 = permissionResult;
        if (!PatchProxy.proxy(new Object[]{permissionResult2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(permissionResult2);
            if (permissionResult2.hasMiniAppPermission()) {
                this.this$0.LJIILJJIL();
                PreviewMiniAppWidget previewMiniAppWidget = this.this$0;
                if (!PatchProxy.proxy(new Object[0], previewMiniAppWidget, PreviewMiniAppWidget.LIZ, false, 8).isSupported) {
                    ViewGroup viewGroup = previewMiniAppWidget.containerView;
                    Intrinsics.checkNotNullExpressionValue(viewGroup, "");
                    if (viewGroup.getVisibility() == 0) {
                        C87793KiZ c87793KiZ = C87793KiZ.LIZIZ;
                        String LIZ = C2VQ.LIZ(previewMiniAppWidget.LJIIJJI().LIZ().LIZ());
                        if (!PatchProxy.proxy(new Object[]{LIZ}, c87793KiZ, C87793KiZ.LIZ, false, 15).isSupported) {
                            C106862S5w.LIZ(LIZ);
                            C4574547f.LIZ().LIZ("livesdk_live_takepage_function_icon_show", MapsKt__MapsKt.mutableMapOf(TuplesKt.m137to("live_type", LIZ), TuplesKt.m137to("event_page", "live_take_page")), new Object[0]);
                        }
                    }
                }
            } else {
                this.this$0.LJIILL();
            }
        }
        return Unit.INSTANCE;
    }
}
