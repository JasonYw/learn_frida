package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder.C4343l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder.l */
/* loaded from: classes3.dex */
public final class C4343l extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final TextView LIZIZ;
    public final ImageView LIZJ;
    public AbstractC4344a LIZLLL;

    /* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder.l$a */
    /* loaded from: classes3.dex */
    public interface AbstractC4344a {
        static {
            Covode.recordClassIndex(26124);
        }

        void LJIIJ();
    }

    static {
        Covode.recordClassIndex(26123);
    }

    public C4343l(View view, AbstractC4344a abstractC4344a) {
        super(view);
        this.LIZIZ = (TextView) view.findViewById(2131174300);
        this.LIZJ = (ImageView) view.findViewById(2131174299);
        this.LIZLLL = abstractC4344a;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: X.Hec
            public static ChangeQuickRedirect LIZ;
            public final C4343l LIZIZ;

            static {
                Covode.recordClassIndex(26125);
            }

            {
                this.LIZIZ = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (PatchProxy.proxy(new Object[]{view2}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                C4343l c4343l = this.LIZIZ;
                if (PatchProxy.proxy(new Object[]{view2}, c4343l, C4343l.LIZ, false, 2).isSupported) {
                    return;
                }
                c4343l.LIZLLL.LJIIJ();
            }
        });
    }
}
