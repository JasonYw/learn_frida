package com.bytedance.android.live.effect.sticker.p331ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.KIM;

/* renamed from: com.bytedance.android.live.effect.sticker.ui.j$a */
/* loaded from: classes12.dex */
public class j$a extends RecyclerView.ViewHolder {
    public ImageView LIZ;
    public RecyclerView LIZIZ;

    static {
        Covode.recordClassIndex(24721);
    }

    public j$a(KIM kim, View view) {
        super(view);
        this.LIZ = (ImageView) view.findViewById(2131167631);
        this.LIZIZ = (RecyclerView) view.findViewById(2131170214);
        this.LIZIZ.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        this.LIZIZ.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: X.3dM
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(24665);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.State state) {
                if (PatchProxy.proxy(new Object[]{rect, view2, recyclerView, state}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                super.getItemOffsets(rect, view2, recyclerView, state);
                if (recyclerView.getChildAdapterPosition(view2) == 0) {
                    rect.set(0, 0, LK5.LIZ(8.0f), 0);
                } else {
                    rect.set(LK5.LIZ(8.0f), 0, LK5.LIZ(8.0f), 0);
                }
            }
        });
    }
}
