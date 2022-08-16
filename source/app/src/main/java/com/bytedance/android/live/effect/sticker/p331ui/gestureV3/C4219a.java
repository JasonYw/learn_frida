package com.bytedance.android.live.effect.sticker.p331ui.gestureV3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.api.l$a;
import com.bytedance.android.live.effect.sticker.p331ui.gestureV3.C4219a;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.common.utility.Lists;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p1594ss.android.ugc.effectmanager.effect.listener.AbstractC29868m;
import com.p1594ss.android.ugc.effectmanager.effect.model.Effect;
import com.p1594ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.List;
import p003X.C116971W2r;
import p003X.C86676KDm;
import p003X.C86738KFw;
import p003X.C88440Kt0;
import p003X.KEQ;
import p003X.KH9;
import p003X.KIS;
import p003X.M0Q;

/* renamed from: com.bytedance.android.live.effect.sticker.ui.gestureV3.a */
/* loaded from: classes5.dex */
public final class C4219a extends RecyclerView.Adapter<C4220a> implements l$a {
    public static ChangeQuickRedirect LIZ;
    public final KEQ LIZIZ;
    public KIS LIZJ;
    public Sticker LIZLLL;

    /* renamed from: LJ */
    public Sticker f26239LJ;
    public final LiveEffectContextFactory.Type LJFF;
    public List<Sticker> LJI = new ArrayList();

    static {
        Covode.recordClassIndex(24702);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (Lists.isEmpty(this.LJI)) {
            return 0;
        }
        return this.LJI.size();
    }

    public C4219a(LiveEffectContextFactory.Type type) {
        this.LJFF = type;
        this.LIZIZ = C4173o.LIZ(type).LJIIIIZZ().LIZ();
    }

    public int LIZ(Sticker sticker) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sticker}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        for (int i = 0; i < this.LJI.size(); i++) {
            if (Sticker.equals(sticker, this.LJI.get(i))) {
                this.LJI.set(i, sticker);
                return i;
            }
        }
        return -1;
    }

    public final void LIZ(EffectCategoryResponse effectCategoryResponse) {
        if (!PatchProxy.proxy(new Object[]{effectCategoryResponse}, this, LIZ, false, 1).isSupported && effectCategoryResponse != null && !Lists.isEmpty(effectCategoryResponse.getTotalEffects())) {
            this.LJI.clear();
            boolean equals = "heartb".equals(effectCategoryResponse.getKey());
            for (Effect effect : effectCategoryResponse.getTotalEffects()) {
                Sticker LIZIZ = C86738KFw.LIZIZ(effect);
                LIZIZ.setDownloaded(this.LIZIZ.LIZ(LIZIZ));
                LIZIZ.setDoubleHandGesture(equals);
                this.LJI.add(LIZIZ);
            }
            if (this.LIZLLL == null) {
                for (Sticker sticker : C4173o.LIZ(this.LJFF).LJII().LIZIZ(C86676KDm.LIZJ)) {
                    for (Sticker sticker2 : this.LJI) {
                        if (Sticker.equals(sticker, sticker2)) {
                            this.LIZLLL = sticker2;
                        }
                    }
                }
            }
            notifyDataSetChanged();
        }
    }

    @Override // com.bytedance.android.live.effect.api.l$a
    public final void LIZ(String str, Sticker sticker) {
        if (!PatchProxy.proxy(new Object[]{str, sticker}, this, LIZ, false, 5).isSupported && LIZ(sticker) >= 0) {
            notifyDataSetChanged();
        }
    }

    /* renamed from: com.bytedance.android.live.effect.sticker.ui.gestureV3.a$a */
    /* loaded from: classes5.dex */
    public class C4220a extends RecyclerView.ViewHolder {
        public final ImageView LIZ;
        public final View LIZIZ;
        public final View LIZJ;
        public final ProgressBar LIZLLL;

        /* renamed from: LJ */
        public final View f26240LJ;

        static {
            Covode.recordClassIndex(24705);
        }

        public C4220a(C4219a c4219a, View view) {
            super(view);
            this.LIZ = (ImageView) view.findViewById(2131167631);
            this.LIZIZ = view.findViewById(2131165326);
            this.LIZJ = view.findViewById(2131172867);
            this.LIZLLL = (ProgressBar) view.findViewById(2131168840);
            this.f26240LJ = view.findViewById(2131187551);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bytedance.android.live.effect.sticker.ui.gestureV3.a$a] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ C4220a onCreateViewHolder(ViewGroup viewGroup, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewGroup, Integer.valueOf(i)}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (RecyclerView.ViewHolder) proxy.result;
        }
        return new C4220a(this, C116971W2r.LIZ(LayoutInflater.from(viewGroup.getContext()), 2131699092, viewGroup, false));
    }

    public void LIZ(Sticker sticker, AbstractC29868m abstractC29868m) {
        if (PatchProxy.proxy(new Object[]{sticker, abstractC29868m}, this, LIZ, false, 9).isSupported) {
            return;
        }
        if (sticker != null && !Lists.isEmpty(sticker.getTags()) && sticker.getTags().contains("new")) {
            this.LIZIZ.LIZ(sticker.getRealId(), sticker.getTagsUpdatedAt(), abstractC29868m);
        } else {
            abstractC29868m.LIZIZ();
        }
    }

    @Override // com.bytedance.android.live.effect.api.l$a
    public final void LIZIZ(String str, Sticker sticker) {
        KIS kis;
        if (PatchProxy.proxy(new Object[]{str, sticker}, this, LIZ, false, 7).isSupported) {
            return;
        }
        if (sticker.getId() == this.f26239LJ.getId() && (kis = this.LIZJ) != null) {
            kis.LIZ(Boolean.FALSE, this.LIZLLL);
            this.LIZLLL = sticker;
            this.LIZJ.LIZ(Boolean.TRUE, this.LIZLLL);
        }
        if (LIZ(sticker) >= 0) {
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(C4220a c4220a, int i) {
        int i2;
        final C4220a c4220a2 = c4220a;
        int i3 = 0;
        if (!PatchProxy.proxy(new Object[]{c4220a2, Integer.valueOf(i)}, this, LIZ, false, 3).isSupported) {
            final Sticker sticker = this.LJI.get(i);
            M0Q.LIZ(c4220a2.LIZ, sticker.getIcon().LIZ());
            Sticker sticker2 = this.LIZLLL;
            if (sticker2 != null && Sticker.equals(sticker2, sticker)) {
                c4220a2.LIZIZ.setVisibility(0);
            } else {
                c4220a2.LIZIZ.setVisibility(8);
            }
            ProgressBar progressBar = c4220a2.LIZLLL;
            if (sticker.isDownloading()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            progressBar.setVisibility(i2);
            View view = c4220a2.LIZJ;
            if (sticker.isDownloaded() || sticker.isDownloading()) {
                i3 = 8;
            }
            view.setVisibility(i3);
            LIZ(sticker, new KH9(this, c4220a2));
            c4220a2.itemView.setOnClickListener(new View.OnClickListener(this, sticker, c4220a2) { // from class: X.KH7
                public static ChangeQuickRedirect LIZ;
                public final C4219a LIZIZ;
                public final Sticker LIZJ;
                public final C4219a.C4220a LIZLLL;

                static {
                    Covode.recordClassIndex(24706);
                }

                {
                    this.LIZIZ = this;
                    this.LIZJ = sticker;
                    this.LIZLLL = c4220a2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    if (PatchProxy.proxy(new Object[]{view2}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    final C4219a c4219a = this.LIZIZ;
                    final Sticker sticker3 = this.LIZJ;
                    final C4219a.C4220a c4220a3 = this.LIZLLL;
                    if (PatchProxy.proxy(new Object[]{sticker3, c4220a3, view2}, c4219a, C4219a.LIZ, false, 10).isSupported) {
                        return;
                    }
                    c4219a.LIZIZ.LIZ(sticker3.getRealId(), sticker3.getTagsUpdatedAt(), new AbstractC86120Jwg(c4219a, sticker3, c4220a3) { // from class: X.KH8
                        public static ChangeQuickRedirect LIZ;
                        public final C4219a LIZIZ;
                        public final Sticker LIZJ;
                        public final C4219a.C4220a LIZLLL;

                        static {
                            Covode.recordClassIndex(24707);
                        }

                        {
                            this.LIZIZ = c4219a;
                            this.LIZJ = sticker3;
                            this.LIZLLL = c4220a3;
                        }

                        @Override // p003X.AbstractC86120Jwg
                        public final void LIZ() {
                            if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            C4219a c4219a2 = this.LIZIZ;
                            Sticker sticker4 = this.LIZJ;
                            C4219a.C4220a c4220a4 = this.LIZLLL;
                            if (PatchProxy.proxy(new Object[]{sticker4, c4220a4}, c4219a2, C4219a.LIZ, false, 11).isSupported) {
                                return;
                            }
                            c4219a2.LIZ(sticker4, new KHA(c4219a2, c4220a4));
                        }
                    });
                    if (c4219a.LIZLLL != null && c4219a.LIZLLL.equals(sticker3)) {
                        if (c4219a.LIZJ != null) {
                            c4219a.LIZJ.LIZ(Boolean.FALSE, c4219a.LIZLLL);
                        }
                        c4219a.LIZLLL = null;
                        c4219a.notifyDataSetChanged();
                        return;
                    }
                    if (!c4219a.LIZIZ.LIZ(sticker3)) {
                        c4219a.f26239LJ = sticker3;
                        c4219a.LIZIZ.LIZ(C86676KDm.LIZJ, sticker3, c4219a);
                    } else {
                        if (c4219a.LIZLLL != null && c4219a.LIZLLL.getId() != sticker3.getId() && c4219a.LIZJ != null) {
                            c4219a.LIZJ.LIZ(Boolean.FALSE, c4219a.LIZLLL);
                        }
                        c4219a.LIZLLL = sticker3;
                        if (c4219a.LIZJ != null) {
                            c4219a.LIZJ.LIZ(Boolean.TRUE, c4219a.LIZLLL);
                        }
                    }
                    c4219a.LIZ(sticker3);
                    c4219a.notifyDataSetChanged();
                }
            });
        }
    }

    @Override // com.bytedance.android.live.effect.api.l$a
    public final void LIZ(String str, Sticker sticker, ExceptionResult exceptionResult) {
        if (PatchProxy.proxy(new Object[]{str, sticker, exceptionResult}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C88440Kt0.LIZ(2131583063);
        if (LIZ(sticker) >= 0) {
            notifyDataSetChanged();
        }
    }
}
