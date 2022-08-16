package com.bytedance.android.live.broadcastgame.openplatform.miniapp;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.bytedance.android.live.broadcastgame.opengame.view.AutoAnimationTextView;
import com.bytedance.bdp.live.livecontainer.miniapp.PageStatus;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.LK1;

/* loaded from: classes5.dex */
public final class MockMiniApp$onCreate$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ MockMiniApp this$0;

    static {
        Covode.recordClassIndex(21483);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MockMiniApp$onCreate$2(MockMiniApp mockMiniApp) {
        super(0);
        this.this$0 = mockMiniApp;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && !this.this$0.isFinishing()) {
            PageStatus pageStatus = this.this$0.LIZIZ().getPageStatus();
            if (pageStatus == PageStatus.CANCEL_EXPLAIN) {
                float[] fArr = {LK1.LIZJ(8), LK1.LIZJ(8), LK1.LIZJ(8), LK1.LIZJ(8), LK1.LIZJ(8), LK1.LIZJ(8), LK1.LIZJ(8), LK1.LIZJ(8)};
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, new RectF(0.0f, 0.0f, 0.0f, 0.0f), fArr));
                Paint paint = shapeDrawable.getPaint();
                Intrinsics.checkNotNullExpressionValue(paint, "");
                paint.setColor(-7829368);
                AutoAnimationTextView autoAnimationTextView = (AutoAnimationTextView) this.this$0.LIZ(2131183386);
                Intrinsics.checkNotNullExpressionValue(autoAnimationTextView, "");
                int height = autoAnimationTextView.getHeight();
                AutoAnimationTextView autoAnimationTextView2 = (AutoAnimationTextView) this.this$0.LIZ(2131183386);
                Intrinsics.checkNotNullExpressionValue(autoAnimationTextView2, "");
                shapeDrawable.setBounds(new Rect(0, 0, height, autoAnimationTextView2.getBottom()));
                AutoAnimationTextView autoAnimationTextView3 = (AutoAnimationTextView) this.this$0.LIZ(2131183386);
                Intrinsics.checkNotNullExpressionValue(autoAnimationTextView3, "");
                autoAnimationTextView3.setBackground(shapeDrawable);
            } else if (pageStatus == PageStatus.START_EXPLAIN || pageStatus == PageStatus.ADD) {
                float[] fArr2 = {LK1.LIZJ(8), LK1.LIZJ(8), LK1.LIZJ(8), LK1.LIZJ(8), LK1.LIZJ(8), LK1.LIZJ(8), LK1.LIZJ(8), LK1.LIZJ(8)};
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr2, new RectF(0.0f, 0.0f, 0.0f, 0.0f), fArr2));
                Paint paint2 = shapeDrawable2.getPaint();
                Intrinsics.checkNotNullExpressionValue(paint2, "");
                paint2.setColor(-65536);
                AutoAnimationTextView autoAnimationTextView4 = (AutoAnimationTextView) this.this$0.LIZ(2131183386);
                Intrinsics.checkNotNullExpressionValue(autoAnimationTextView4, "");
                int height2 = autoAnimationTextView4.getHeight();
                AutoAnimationTextView autoAnimationTextView5 = (AutoAnimationTextView) this.this$0.LIZ(2131183386);
                Intrinsics.checkNotNullExpressionValue(autoAnimationTextView5, "");
                shapeDrawable2.setBounds(new Rect(0, 0, height2, autoAnimationTextView5.getBottom()));
                AutoAnimationTextView autoAnimationTextView6 = (AutoAnimationTextView) this.this$0.LIZ(2131183386);
                Intrinsics.checkNotNullExpressionValue(autoAnimationTextView6, "");
                autoAnimationTextView6.setBackground(shapeDrawable2);
            }
        }
        return Unit.INSTANCE;
    }
}
