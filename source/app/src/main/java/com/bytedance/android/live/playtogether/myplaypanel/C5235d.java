package com.bytedance.android.live.playtogether.myplaypanel;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.LT5;
import p003X.LT7;

/* renamed from: com.bytedance.android.live.playtogether.myplaypanel.d */
/* loaded from: classes5.dex */
public final class C5235d extends RecyclerView.ViewHolder implements LifecycleOwner {
    public static ChangeQuickRedirect LIZ;
    public final HSImageView LIZIZ;
    public final TextView LIZJ;
    public final HSImageView LIZLLL;

    /* renamed from: LJ */
    public final TextView f26545LJ;
    public final TextView LJFF;
    public final TextView LJI;
    public final LifecycleRegistry LJII = new LifecycleRegistry(this);
    public final LT5 LJIIIIZZ;

    static {
        Covode.recordClassIndex(33020);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* renamed from: getLifecycle */
    public final Lifecycle mo29786getLifecycle() {
        return this.LJII;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5235d(LT7 lt7, View view) {
        super(view);
        C106862S5w.LIZ(lt7, view);
        this.LIZIZ = (HSImageView) view.findViewById(2131184596);
        this.LIZJ = (TextView) view.findViewById(2131184597);
        this.LIZLLL = (HSImageView) view.findViewById(2131184601);
        this.f26545LJ = (TextView) view.findViewById(2131184600);
        this.LJFF = (TextView) view.findViewById(2131184602);
        this.LJI = (TextView) view.findViewById(2131184598);
        this.LJIIIIZZ = new LT5(this, lt7, view);
    }
}
