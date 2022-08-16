package com.bytedance.android.live.broadcast.preview.p277ui.chooseuser.viewbinder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.chooseuser.viewbinder.f */
/* loaded from: classes3.dex */
public final class C3193f extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ;

    static {
        Covode.recordClassIndex(17421);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3193f(View view) {
        super(view);
        C106862S5w.LIZ(view);
        this.LIZIZ = LazyKt__LazyJVMKt.lazy(new UserTypeTitleViewHolder$userTypeTitle$2(view));
    }
}
