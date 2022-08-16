package com.bytedance.android.live.liveinteract.multianchor.viewholder;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multianchor.viewholder.C4571a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC79948HfK;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.viewholder.a */
/* loaded from: classes3.dex */
public final class C4571a extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final TextView LIZIZ;

    static {
        Covode.recordClassIndex(28428);
    }

    public C4571a(View view, final AbstractC79948HfK abstractC79948HfK) {
        super(view);
        this.LIZIZ = (TextView) view.findViewById(2131194080);
        view.setOnClickListener(new View.OnClickListener(abstractC79948HfK) { // from class: X.HfG
            public static ChangeQuickRedirect LIZ;
            public final AbstractC79948HfK LIZIZ;

            static {
                Covode.recordClassIndex(28433);
            }

            {
                this.LIZIZ = abstractC79948HfK;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (PatchProxy.proxy(new Object[]{view2}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                AbstractC79948HfK abstractC79948HfK2 = this.LIZIZ;
                if (PatchProxy.proxy(new Object[]{abstractC79948HfK2, view2}, null, C4571a.LIZ, true, 2).isSupported) {
                    return;
                }
                abstractC79948HfK2.mo23728LJ();
            }
        });
    }
}
