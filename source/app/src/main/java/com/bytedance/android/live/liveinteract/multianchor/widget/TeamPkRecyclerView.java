package com.bytedance.android.live.liveinteract.multianchor.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.liveinteract.p382pk.p384ui.PkItemExposeRecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class TeamPkRecyclerView extends PkItemExposeRecyclerView {
    public static ChangeQuickRedirect LIZ;
    public final Paint LIZJ = new Paint();

    static {
        Covode.recordClassIndex(28479);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamPkRecyclerView(Context context) {
        super(context);
        C106862S5w.LIZ(context);
        this.LIZJ.setColor(0);
        this.LIZJ.setShadowLayer(LK5.LIZ(20.0f), 0.0f, LK5.LIZ(4.0f), LK5.LIZIZ(2131629007));
        setLayerType(1, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        View view;
        int i = 0;
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onDraw(canvas);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            view = (View) proxy.result;
        } else {
            int childCount = getChildCount();
            while (true) {
                if (i < childCount) {
                    view = getChildAt(i);
                    Intrinsics.checkNotNullExpressionValue(view, "");
                    if (view.getId() == 2131192995) {
                        break;
                    }
                    i++;
                } else {
                    view = null;
                    break;
                }
            }
        }
        if (canvas != null && view != null) {
            int save = canvas.save();
            float LIZLLL = LK5.LIZLLL(2131429317) + LK5.LIZLLL(2131429316);
            float y = view.getY() - LIZLLL;
            float f = LIZLLL + y;
            canvas.clipRect(0.0f, f, getWidth(), getHeight() + y);
            canvas.drawRect(0.0f, y, getWidth(), f, this.LIZJ);
            canvas.restoreToCount(save);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamPkRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106862S5w.LIZ(context);
        this.LIZJ.setColor(0);
        this.LIZJ.setShadowLayer(LK5.LIZ(20.0f), 0.0f, LK5.LIZ(4.0f), LK5.LIZIZ(2131629007));
        setLayerType(1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamPkRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        this.LIZJ.setColor(0);
        this.LIZJ.setShadowLayer(LK5.LIZ(20.0f), 0.0f, LK5.LIZ(4.0f), LK5.LIZIZ(2131629007));
        setLayerType(1, null);
    }
}
