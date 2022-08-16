package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class bf$a extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final View LIZIZ;
    public final Lazy LIZJ = LazyKt__LazyJVMKt.lazy(new PreviewToolAreaAdapter$ViewHolder$mRootView$2(this));

    static {
        Covode.recordClassIndex(18925);
    }

    public final ToolItemFrameLayout LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (ToolItemFrameLayout) (proxy.isSupported ? proxy.result : this.LIZJ.mo27335getValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf$a(View view) {
        super(view);
        C106862S5w.LIZ(view);
        this.LIZIZ = view;
    }
}
