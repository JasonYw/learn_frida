package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder.ai */
/* loaded from: classes12.dex */
public final class C4335ai extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ;
    public final Lazy LIZJ;

    static {
        Covode.recordClassIndex(26101);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4335ai(View view) {
        super(view);
        C106862S5w.LIZ(view);
        this.LIZIZ = LazyKt__LazyJVMKt.lazy(new RadioRoomApplyTitleViewHolder$currentOrder$2(view));
        this.LIZJ = LazyKt__LazyJVMKt.lazy(new RadioRoomApplyTitleViewHolder$tvSortType$2(view));
    }
}
