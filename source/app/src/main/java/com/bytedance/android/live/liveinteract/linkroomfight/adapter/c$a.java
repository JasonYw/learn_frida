package com.bytedance.android.live.liveinteract.linkroomfight.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.C78337GuR;
import p003X.View$OnClickListenerC78338GuS;
import p003X.View$OnClickListenerC78339GuT;

/* loaded from: classes3.dex */
public final class c$a extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final /* synthetic */ C78337GuR LIZIZ;

    static {
        Covode.recordClassIndex(27523);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c$a(C78337GuR c78337GuR, View view) {
        super(view);
        C106862S5w.LIZ(view);
        this.LIZIZ = c78337GuR;
        ((ImageView) view.findViewById(2131179073)).setOnClickListener(new View$OnClickListenerC78338GuS(this));
        ((TextView) view.findViewById(2131194342)).setOnClickListener(new View$OnClickListenerC78339GuT(this));
    }
}
