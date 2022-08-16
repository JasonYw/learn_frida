package com.bytedance.android.live.broadcast.category.p261ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.model.CategoryScene;
import com.bytedance.android.live.broadcast.category.viewmodel.C2970a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import p003X.C106862S5w;
import p003X.C77347GeT;

/* renamed from: com.bytedance.android.live.broadcast.category.ui.b */
/* loaded from: classes5.dex */
public final class C2964b extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ = C77347GeT.LIZ(new CategoryViewHolder$selected$2(this));
    public final C2970a LIZJ;
    public final CategoryScene LIZLLL;

    static {
        Covode.recordClassIndex(15097);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2964b(C2970a c2970a, CategoryScene categoryScene, View view) {
        super(view);
        C106862S5w.LIZ(c2970a, categoryScene, view);
        this.LIZJ = c2970a;
        this.LIZLLL = categoryScene;
    }
}
