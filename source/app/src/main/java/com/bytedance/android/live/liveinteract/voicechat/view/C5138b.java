package com.bytedance.android.live.liveinteract.voicechat.view;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.view.b */
/* loaded from: classes12.dex */
public final class C5138b extends RecyclerView.ItemDecoration {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(31869);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != 1) {
            if (childAdapterPosition != 2) {
                if (childAdapterPosition != 5) {
                    if (childAdapterPosition != 6) {
                        return;
                    }
                }
            }
            rect.left = LK5.LIZ(6.0f);
            return;
        }
        rect.right = LK5.LIZ(6.0f);
    }
}
