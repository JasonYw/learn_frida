package com.bytedance.android.live.liveinteract.linkroomfight.adapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.linkroomfight.adapter.b$b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.C474644pe;

/* loaded from: classes22.dex */
public final class b$b extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final /* synthetic */ C474644pe LIZIZ;

    static {
        Covode.recordClassIndex(27520);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b$b(C474644pe c474644pe, View view) {
        super(view);
        C106862S5w.LIZ(view);
        this.LIZIZ = c474644pe;
        view.setOnClickListener(new View.OnClickListener() { // from class: X.4pf
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(27521);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (!PatchProxy.proxy(new Object[]{view2}, this, LIZ, false, 1).isSupported && b$b.this.getAdapterPosition() >= 0 && b$b.this.getAdapterPosition() < b$b.this.LIZIZ.LIZJ.size()) {
                    b$b.this.LIZIZ.LIZ(b$b.this.getAdapterPosition());
                    if (b$b.this.LIZIZ.LIZLLL != null) {
                        b$b.this.getAdapterPosition();
                        b$b.this.LIZIZ.LIZJ.get(b$b.this.getAdapterPosition()).intValue();
                    }
                }
            }
        });
    }
}
