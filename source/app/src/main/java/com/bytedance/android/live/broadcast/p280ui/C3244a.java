package com.bytedance.android.live.broadcast.p280ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.ui.a */
/* loaded from: classes12.dex */
public final class C3244a extends RecyclerView.ItemDecoration {
    public static ChangeQuickRedirect LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    static {
        Covode.recordClassIndex(17968);
    }

    public C3244a(int i, int i2) {
        this.LIZIZ = i;
        this.LIZJ = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(rect, view, recyclerView, state);
        if (recyclerView.getChildAdapterPosition(view) % 2 == 0) {
            rect.right = this.LIZJ;
        } else {
            rect.left = this.LIZJ;
        }
        rect.bottom = this.LIZIZ;
    }
}
