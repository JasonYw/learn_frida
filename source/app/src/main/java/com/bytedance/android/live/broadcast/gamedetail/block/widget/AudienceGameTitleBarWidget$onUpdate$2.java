package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class AudienceGameTitleBarWidget$onUpdate$2 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AudienceGameTitleBarWidget this$0;

    static {
        Covode.recordClassIndex(16348);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceGameTitleBarWidget$onUpdate$2(AudienceGameTitleBarWidget audienceGameTitleBarWidget) {
        super(1);
        this.this$0 = audienceGameTitleBarWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        View view = this.this$0.contentView;
                        Intrinsics.checkNotNullExpressionValue(view, "");
                        view.setVisibility(0);
                        LinearLayout linearLayout = this.this$0.LIZJ;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(0);
                        }
                        ImageView imageView = this.this$0.LIZLLL;
                        if (imageView != null) {
                            imageView.setVisibility(8);
                        }
                        LinearLayout linearLayout2 = this.this$0.LIZJ;
                        if (linearLayout2 != null) {
                            linearLayout2.setBackgroundColor(LK5.LIZIZ(2131626090));
                        }
                        ObjectAnimator objectAnimator = this.this$0.LJII;
                        if (objectAnimator != null) {
                            objectAnimator.start();
                        }
                        AudienceGameTitleBarWidget.LIZ(this.this$0, null, Boolean.TRUE, 1, null);
                    }
                } else {
                    View view2 = this.this$0.contentView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    view2.setVisibility(0);
                    LinearLayout linearLayout3 = this.this$0.LIZJ;
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(8);
                    }
                    if (this.this$0.LIZIZ) {
                        ImageView imageView2 = this.this$0.LIZLLL;
                        if (imageView2 != null) {
                            imageView2.setVisibility(0);
                        }
                    } else {
                        ImageView imageView3 = this.this$0.LIZLLL;
                        if (imageView3 != null) {
                            imageView3.setVisibility(8);
                        }
                    }
                    LinearLayout linearLayout4 = this.this$0.LIZJ;
                    if (linearLayout4 != null) {
                        linearLayout4.setBackgroundColor(LK5.LIZIZ(2131623937));
                    }
                    this.this$0.LIZ(Boolean.TRUE, Boolean.FALSE);
                }
            } else {
                View view3 = this.this$0.contentView;
                Intrinsics.checkNotNullExpressionValue(view3, "");
                view3.setVisibility(8);
                AudienceGameTitleBarWidget.LIZ(this.this$0, Boolean.FALSE, null, 2, null);
            }
        }
        return Unit.INSTANCE;
    }
}
