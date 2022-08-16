package com.bytedance.android.live.effect.sticker.p331ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.api.l$a;
import com.bytedance.android.live.effect.base.setting.LiveEffectSettingKeys;
import com.bytedance.android.live.effect.sticker.p331ui.C4214d;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.common.utility.Lists;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p1594ss.android.ugc.effectmanager.effect.model.Effect;
import com.p1594ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p003X.C116971W2r;
import p003X.C86676KDm;
import p003X.C86738KFw;
import p003X.C88440Kt0;
import p003X.KEQ;
import p003X.KIO;
import p003X.KIR;
import p003X.KIS;
import p003X.M0Q;

/* renamed from: com.bytedance.android.live.effect.sticker.ui.d */
/* loaded from: classes5.dex */
public final class C4214d extends RecyclerView.Adapter implements l$a {
    public static ChangeQuickRedirect LIZ;
    public final KEQ LIZIZ;
    public KIS LIZJ;
    public Sticker LIZLLL;
    public Sticker LJFF;
    public Sticker LJII;
    public final LiveEffectContextFactory.Type LJIIIZ;
    public EffectCategoryResponse LJIIJ;
    public boolean LJI = LiveEffectSettingKeys.LIVE_ENABLE_VCD_EFFECT.getValue().booleanValue();
    public boolean LJIIIIZZ = false;

    /* renamed from: LJ */
    public List<Sticker> f26234LJ = new ArrayList();

    static {
        Covode.recordClassIndex(24666);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (Lists.isEmpty(this.f26234LJ)) {
            return 0;
        }
        if (this.f26234LJ.size() <= 3 && !LiveEffectSettingKeys.LIVE_ENABLE_VCD_EFFECT.getValue().booleanValue()) {
            return this.f26234LJ.size() + 1;
        }
        return this.f26234LJ.size();
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        this.LJIIIIZZ = true;
        EffectCategoryResponse effectCategoryResponse = this.LJIIJ;
        if (effectCategoryResponse == null || Lists.isEmpty(effectCategoryResponse.getTotalEffects()) || this.LJI) {
            return;
        }
        this.LJI = true;
        Sticker sticker = this.LJII;
        if (sticker == null) {
            for (Sticker sticker2 : this.f26234LJ) {
                Iterator<Sticker> it = C4173o.LIZ(this.LJIIIZ).LJII().LIZIZ(C86676KDm.LIZJ).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().equals(sticker2)) {
                        this.LIZLLL = sticker2;
                        break;
                    }
                }
                if (this.LIZLLL != null) {
                    break;
                }
            }
            if (this.LIZLLL == null) {
                this.LIZLLL = C86738KFw.LIZIZ(this.LJIIJ.getTotalEffects().get(0));
            }
        } else {
            this.LIZLLL = sticker;
        }
        if (!this.LIZIZ.LIZ(this.LIZLLL)) {
            this.LJFF = this.LIZLLL;
            this.LIZIZ.LIZ(C86676KDm.LIZJ, this.LIZLLL, this);
        } else {
            KIS kis = this.LIZJ;
            if (kis != null) {
                kis.LIZ(Boolean.TRUE, this.LIZLLL);
            }
        }
        KIS kis2 = this.LIZJ;
        if (kis2 != null) {
            kis2.LIZ(Boolean.TRUE, this.LIZLLL);
        }
        notifyDataSetChanged();
    }

    public int LIZ(Sticker sticker) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sticker}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        for (int i = 0; i < this.f26234LJ.size(); i++) {
            if (Sticker.equals(sticker, this.f26234LJ.get(i))) {
                this.f26234LJ.set(i, sticker);
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (LiveEffectSettingKeys.LIVE_ENABLE_VCD_EFFECT.getValue().booleanValue() || i < this.f26234LJ.size()) {
            return 1;
        }
        return 2;
    }

    public final void LIZ(EffectCategoryResponse effectCategoryResponse) {
        if (!PatchProxy.proxy(new Object[]{effectCategoryResponse}, this, LIZ, false, 1).isSupported && effectCategoryResponse != null && !Lists.isEmpty(effectCategoryResponse.getTotalEffects())) {
            this.LJIIJ = effectCategoryResponse;
            this.f26234LJ.clear();
            for (Effect effect : effectCategoryResponse.getTotalEffects()) {
                Sticker LIZIZ = C86738KFw.LIZIZ(effect);
                LIZIZ.setDownloaded(this.LIZIZ.LIZ(LIZIZ));
                this.f26234LJ.add(LIZIZ);
            }
            if (this.LJIIIIZZ) {
                LIZ();
                this.LJIIIIZZ = false;
            }
            notifyDataSetChanged();
        }
    }

    public C4214d(KEQ keq, LiveEffectContextFactory.Type type) {
        this.LIZIZ = keq;
        this.LJIIIZ = type;
    }

    @Override // com.bytedance.android.live.effect.api.l$a
    public final void LIZ(String str, Sticker sticker) {
        if (!PatchProxy.proxy(new Object[]{str, sticker}, this, LIZ, false, 8).isSupported && LIZ(sticker) >= 0) {
            notifyDataSetChanged();
        }
    }

    @Override // com.bytedance.android.live.effect.api.l$a
    public final void LIZIZ(String str, Sticker sticker) {
        KIS kis;
        int indexOf;
        if (PatchProxy.proxy(new Object[]{str, sticker}, this, LIZ, false, 10).isSupported) {
            return;
        }
        if (this.LJI && sticker.getId() == this.LJFF.getId() && (kis = this.LIZJ) != null) {
            kis.LIZ(Boolean.FALSE, this.LIZLLL);
            Sticker sticker2 = this.LIZLLL;
            this.LIZLLL = sticker;
            if (sticker2 != null && this.f26234LJ.contains(sticker2) && (indexOf = this.f26234LJ.indexOf(sticker2)) >= 0) {
                notifyItemChanged(indexOf);
            }
            this.LIZJ.LIZ(Boolean.TRUE, this.LIZLLL);
        }
        int LIZ2 = LIZ(sticker);
        if (LIZ2 >= 0) {
            notifyItemChanged(LIZ2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        int i2;
        int i3 = 0;
        if (!PatchProxy.proxy(new Object[]{viewHolder, Integer.valueOf(i)}, this, LIZ, false, 3).isSupported && getItemViewType(i) == 1) {
            KIO kio = (KIO) viewHolder;
            Sticker sticker = this.f26234LJ.get(i);
            M0Q.LIZ(kio.LIZ, sticker.getIcon().LIZ());
            kio.LIZIZ.setVisibility(8);
            Sticker sticker2 = this.LIZLLL;
            if (sticker2 != null && sticker2.getId() == sticker.getId()) {
                kio.LIZIZ.setVisibility(0);
            }
            ProgressBar progressBar = kio.LIZLLL;
            if (sticker.isDownloading()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            progressBar.setVisibility(i2);
            View view = kio.LIZJ;
            if (sticker.isDownloaded()) {
                i3 = 8;
            }
            view.setVisibility(i3);
            kio.itemView.setOnClickListener(new View.OnClickListener(this, i) { // from class: X.KIN
                public static ChangeQuickRedirect LIZ;
                public final C4214d LIZIZ;
                public final int LIZJ;

                static {
                    Covode.recordClassIndex(24669);
                }

                {
                    this.LIZIZ = this;
                    this.LIZJ = i;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int indexOf;
                    if (PatchProxy.proxy(new Object[]{view2}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    C4214d c4214d = this.LIZIZ;
                    int i4 = this.LIZJ;
                    if (PatchProxy.proxy(new Object[]{Integer.valueOf(i4), view2}, c4214d, C4214d.LIZ, false, 12).isSupported || !c4214d.LJI) {
                        return;
                    }
                    Sticker sticker3 = c4214d.f26234LJ.get(i4);
                    if (c4214d.LIZLLL != null && c4214d.LIZLLL.equals(sticker3)) {
                        c4214d.LIZLLL = null;
                        if (c4214d.LIZJ != null) {
                            c4214d.LIZJ.LIZ(Boolean.FALSE, c4214d.LIZLLL);
                        }
                        c4214d.notifyItemChanged(i4);
                        return;
                    }
                    if (!c4214d.LIZIZ.LIZ(sticker3)) {
                        c4214d.LJFF = sticker3;
                        c4214d.LIZIZ.LIZ(C86676KDm.LIZJ, sticker3, c4214d);
                    } else {
                        if (c4214d.LIZLLL != null && c4214d.LIZLLL.getId() != sticker3.getId() && c4214d.LIZJ != null) {
                            c4214d.LIZJ.LIZ(Boolean.FALSE, c4214d.LIZLLL);
                        }
                        Sticker sticker4 = c4214d.LIZLLL;
                        c4214d.LIZLLL = sticker3;
                        if (sticker4 != null && c4214d.f26234LJ.contains(sticker4) && (indexOf = c4214d.f26234LJ.indexOf(sticker4)) >= 0) {
                            c4214d.notifyItemChanged(indexOf);
                        }
                        if (c4214d.LIZJ != null) {
                            c4214d.LIZJ.LIZ(Boolean.TRUE, c4214d.LIZLLL);
                        }
                    }
                    c4214d.LIZ(sticker3);
                    c4214d.notifyItemChanged(i4);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewGroup, Integer.valueOf(i)}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (RecyclerView.ViewHolder) proxy.result;
        }
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (LiveEffectSettingKeys.LIVE_ENABLE_VCD_EFFECT.getValue().booleanValue()) {
            return new KIO(this, C116971W2r.LIZ(from, 2131699092, viewGroup, false));
        }
        if (i == 2) {
            return new KIR(this, C116971W2r.LIZ(from, 2131699091, viewGroup, false));
        }
        return new KIO(this, C116971W2r.LIZ(from, 2131699088, viewGroup, false));
    }

    @Override // com.bytedance.android.live.effect.api.l$a
    public final void LIZ(String str, Sticker sticker, ExceptionResult exceptionResult) {
        if (PatchProxy.proxy(new Object[]{str, sticker, exceptionResult}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C88440Kt0.LIZ(2131583063);
        int LIZ2 = LIZ(sticker);
        if (LIZ2 >= 0) {
            notifyItemChanged(LIZ2);
        }
    }
}
