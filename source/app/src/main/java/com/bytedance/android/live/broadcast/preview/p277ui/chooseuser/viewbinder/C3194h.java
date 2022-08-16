package com.bytedance.android.live.broadcast.preview.p277ui.chooseuser.viewbinder;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.chooseuser.viewbinder.h */
/* loaded from: classes3.dex */
public final class C3194h extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ;
    public final Lazy LIZJ;
    public final Lazy LIZLLL;

    /* renamed from: LJ */
    public final Lazy f25919LJ;

    static {
        Covode.recordClassIndex(17424);
    }

    public final ImageView LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (ImageView) (proxy.isSupported ? proxy.result : this.f25919LJ.mo27335getValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3194h(View view) {
        super(view);
        C106862S5w.LIZ(view);
        this.LIZIZ = LazyKt__LazyJVMKt.lazy(new UserViewHolder$ivAvatar$2(view));
        this.LIZJ = LazyKt__LazyJVMKt.lazy(new UserViewHolder$tvUserTitle$2(view));
        this.LIZLLL = LazyKt__LazyJVMKt.lazy(new UserViewHolder$tvRelationLabel$2(view));
        LazyKt__LazyJVMKt.lazy(new UserViewHolder$tvUserSubTitle$2(view));
        this.f25919LJ = LazyKt__LazyJVMKt.lazy(new UserViewHolder$ivUserCheckBox$2(view));
    }
}
