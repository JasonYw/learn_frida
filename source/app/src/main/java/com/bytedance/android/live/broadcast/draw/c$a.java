package com.bytedance.android.live.broadcast.draw;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.C87080KTa;

/* loaded from: classes5.dex */
public final class c$a extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public ImageView LIZIZ;
    public final /* synthetic */ C87080KTa LIZJ;

    static {
        Covode.recordClassIndex(15655);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c$a(C87080KTa c87080KTa, View view) {
        super(view);
        C106862S5w.LIZ(view);
        this.LIZJ = c87080KTa;
        this.LIZIZ = (ImageView) view.findViewById(2131172958);
    }
}
