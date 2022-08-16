package com.bytedance.android.live.liveinteract.bid.p344ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.bid.ui.a$b */
/* loaded from: classes3.dex */
public final class a$b extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZLLL = LazyKt__LazyJVMKt.lazy(new BidHistoryUserViewBinder$BidHistoryUserViewHolder$userAvatar$2(this));
    public final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(new BidHistoryUserViewBinder$BidHistoryUserViewHolder$userNameTv$2(this));
    public final Lazy LIZJ = LazyKt__LazyJVMKt.lazy(new BidHistoryUserViewBinder$BidHistoryUserViewHolder$priceTv$2(this));

    /* renamed from: LJ */
    public final Lazy f26261LJ = LazyKt__LazyJVMKt.lazy(new BidHistoryUserViewBinder$BidHistoryUserViewHolder$verticalBar$2(this));

    static {
        Covode.recordClassIndex(25262);
    }

    public final HSImageView LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (HSImageView) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    public final View LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (View) (proxy.isSupported ? proxy.result : this.f26261LJ.mo27335getValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a$b(View view) {
        super(view);
        C106862S5w.LIZ(view);
    }
}
