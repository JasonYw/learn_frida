package com.bytedance.android.live.broadcast.bgbroadcast.game.window.adapter;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.game.window.adapter.h */
/* loaded from: classes5.dex */
public final class C2946h extends RecyclerView.ViewHolder {
    public HSImageView LIZ;
    public TextView LIZIZ;
    public TextView LIZJ;
    public FrameLayout LIZLLL;

    /* renamed from: LJ */
    public ProgressBar f25788LJ;

    static {
        Covode.recordClassIndex(14876);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2946h(View view) {
        super(view);
        C106862S5w.LIZ(view);
        this.LIZ = (HSImageView) view.findViewById(2131179015);
        this.LIZIZ = (TextView) view.findViewById(2131194204);
        this.LIZJ = (TextView) view.findViewById(2131193619);
        this.LIZLLL = (FrameLayout) view.findViewById(2131175232);
        this.f25788LJ = (ProgressBar) view.findViewById(2131186667);
    }
}
