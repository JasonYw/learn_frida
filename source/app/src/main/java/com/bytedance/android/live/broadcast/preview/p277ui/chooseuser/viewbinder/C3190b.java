package com.bytedance.android.live.broadcast.preview.p277ui.chooseuser.viewbinder;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.preview.p277ui.common.LimitListLoadingView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.chooseuser.viewbinder.b */
/* loaded from: classes3.dex */
public final class C3190b extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ;
    public final Lazy LIZJ;
    public final Lazy LIZLLL;

    static {
        Covode.recordClassIndex(17417);
    }

    public final TextView LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (TextView) (proxy.isSupported ? proxy.result : this.LIZIZ.mo27335getValue());
    }

    public final TextView LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (TextView) (proxy.isSupported ? proxy.result : this.LIZJ.mo27335getValue());
    }

    public final LimitListLoadingView LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (LimitListLoadingView) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3190b(View view) {
        super(view);
        C106862S5w.LIZ(view);
        this.LIZIZ = LazyKt__LazyJVMKt.lazy(new StatusViewHolder$noMoreHint$2(view));
        this.LIZJ = LazyKt__LazyJVMKt.lazy(new StatusViewHolder$errorHint$2(view));
        this.LIZLLL = LazyKt__LazyJVMKt.lazy(new StatusViewHolder$loadingHint$2(view));
    }
}
