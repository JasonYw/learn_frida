package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class AudienceBottomBarWidget$onUpdate$2 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AudienceBottomBarWidget this$0;

    static {
        Covode.recordClassIndex(16319);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceBottomBarWidget$onUpdate$2(AudienceBottomBarWidget audienceBottomBarWidget) {
        super(1);
        this.this$0 = audienceBottomBarWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        int i;
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            View view = this.this$0.contentView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            int i2 = 8;
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            ViewGroup viewGroup = this.this$0.containerView;
            Intrinsics.checkNotNullExpressionValue(viewGroup, "");
            if (booleanValue) {
                i2 = 0;
            }
            viewGroup.setVisibility(i2);
        }
        return Unit.INSTANCE;
    }
}
