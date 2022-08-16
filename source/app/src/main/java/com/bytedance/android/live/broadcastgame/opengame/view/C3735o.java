package com.bytedance.android.live.broadcastgame.opengame.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.View$OnClickListenerC87992Klm;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.view.o */
/* loaded from: classes5.dex */
public class C3735o extends RecyclerView.Adapter<C3737q> {
    public static ChangeQuickRedirect LIZIZ;
    public final DialogC3738r LIZJ;
    public final List<C3736p> LIZLLL;

    static {
        Covode.recordClassIndex(21215);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return this.LIZLLL.size();
    }

    public final void LIZ(List<C3736p> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        this.LIZLLL.clear();
        this.LIZLLL.addAll(list);
        notifyDataSetChanged();
    }

    public C3735o(DialogC3738r dialogC3738r, List<C3736p> list) {
        C106862S5w.LIZ(dialogC3738r, list);
        this.LIZJ = dialogC3738r;
        this.LIZLLL = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* synthetic */ C3737q onCreateViewHolder(ViewGroup viewGroup, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewGroup, Integer.valueOf(i)}, this, LIZIZ, false, 1);
        if (proxy.isSupported) {
            return (C3737q) proxy.result;
        }
        C106862S5w.LIZ(viewGroup);
        View LIZ = C116971W2r.LIZ(LayoutInflater.from(viewGroup.getContext()), 2131700079, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        return new C3737q(LIZ);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: LIZ */
    public void onBindViewHolder(C3737q c3737q, int i) {
        if (PatchProxy.proxy(new Object[]{c3737q, Integer.valueOf(i)}, this, LIZIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3737q);
        C3736p c3736p = this.LIZLLL.get(i);
        if (c3736p.LIZIZ == 8) {
            c3737q.LIZ.setTextColor(CastProtectorUtils.parseColor("#FE2C55"));
        } else {
            c3737q.LIZ.setTextColor(CastProtectorUtils.parseColor("#000000"));
        }
        c3737q.LIZ.setText(c3736p.LIZJ);
        c3737q.LIZIZ.setImageResource(c3736p.LIZLLL);
        c3737q.itemView.setOnClickListener(new View$OnClickListenerC87992Klm(this, c3736p));
    }
}
