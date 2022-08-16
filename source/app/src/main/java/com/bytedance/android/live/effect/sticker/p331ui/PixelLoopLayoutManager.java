package com.bytedance.android.live.effect.sticker.p331ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.effect.sticker.ui.PixelLoopLayoutManager */
/* loaded from: classes5.dex */
public final class PixelLoopLayoutManager extends LinearLayoutManager {
    public static ChangeQuickRedirect LIZ;
    public final int LIZIZ;

    static {
        Covode.recordClassIndex(24636);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{rect, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        super.setMeasuredDimension(rect, View.MeasureSpec.makeMeasureSpec(this.LIZIZ, Integer.MIN_VALUE), i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PixelLoopLayoutManager(Context context, int i, boolean z, int i2) {
        super(context, 0, false);
        C106862S5w.LIZ(context);
        this.LIZIZ = i2;
    }
}
