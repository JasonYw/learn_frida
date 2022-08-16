package com.bytedance.android.live.effect.sticker.p331ui.gestureV2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.C2844m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.api.l$a;
import com.bytedance.android.live.effect.sticker.p330a.C4209g;
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
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C86738KFw;
import p003X.C88440Kt0;
import p003X.KEQ;
import p003X.KI5;
import p003X.KI8;
import p003X.KI9;
import p003X.M0Q;

/* renamed from: com.bytedance.android.live.effect.sticker.ui.gestureV2.b */
/* loaded from: classes5.dex */
public final class C4215b extends RecyclerView.Adapter<C4216a> implements l$a {
    public static ChangeQuickRedirect LIZ;
    public final KEQ LIZIZ;
    public KI9 LIZJ;
    public Sticker LIZLLL;
    public Sticker LJFF;
    public final LiveEffectContextFactory.Type LJII;
    public boolean LJI = true;

    /* renamed from: LJ */
    public final List<Sticker> f26235LJ = new ArrayList();

    static {
        Covode.recordClassIndex(24688);
    }

    public final boolean LIZ(Sticker sticker, List<Sticker> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sticker, list}, this, LIZ, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Sticker) next).equals(sticker)) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (Lists.isEmpty(this.f26235LJ)) {
            return 0;
        }
        return this.f26235LJ.size();
    }

    public C4215b(LiveEffectContextFactory.Type type) {
        C106862S5w.LIZ(type);
        this.LJII = type;
        C4209g LIZ2 = C4173o.LJIIJ.LIZ(this.LJII).LJIIIIZZ().LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        this.LIZIZ = LIZ2;
    }

    public final int LIZIZ(Sticker sticker) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sticker}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int size = this.f26235LJ.size();
        for (int i = 0; i < size; i++) {
            if (Sticker.Companion.LIZ(sticker, this.f26235LJ.get(i))) {
                this.f26235LJ.set(i, sticker);
                return i;
            }
        }
        return -1;
    }

    public final void LIZ(Sticker sticker) {
        if (PatchProxy.proxy(new Object[]{sticker}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(sticker);
        if (Sticker.Companion.LIZ(this.LIZLLL, sticker)) {
            return;
        }
        Sticker sticker2 = this.LIZLLL;
        if (sticker2 != null) {
            List<Sticker> list = this.f26235LJ;
            Intrinsics.checkNotNull(sticker2);
            notifyItemChanged(LIZ(list, sticker2));
        }
        int LIZ2 = LIZ(this.f26235LJ, sticker);
        this.LIZLLL = this.f26235LJ.get(LIZ2);
        notifyItemChanged(LIZ2);
    }

    public final void LIZ(EffectCategoryResponse effectCategoryResponse) {
        if (!PatchProxy.proxy(new Object[]{effectCategoryResponse}, this, LIZ, false, 1).isSupported && effectCategoryResponse != null && !Lists.isEmpty(effectCategoryResponse.getTotalEffects())) {
            this.f26235LJ.clear();
            for (Effect effect : effectCategoryResponse.getTotalEffects()) {
                Sticker LIZIZ = C86738KFw.LIZIZ(effect);
                LIZIZ.setDownloaded(this.LIZIZ.LIZ(LIZIZ));
                this.f26235LJ.add(LIZIZ);
            }
            Sticker sticker = this.LIZLLL;
            if (sticker != null) {
                Intrinsics.checkNotNull(sticker);
                if (!LIZ(sticker, this.f26235LJ)) {
                    this.LIZLLL = null;
                }
            }
            notifyDataSetChanged();
        }
    }

    public final int LIZ(List<Sticker> list, Sticker sticker) {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, sticker}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        for (Sticker sticker2 : list) {
            if (Sticker.Companion.LIZ(sticker2, sticker)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ C4216a onCreateViewHolder(ViewGroup viewGroup, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewGroup, Integer.valueOf(i)}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (C4216a) proxy.result;
        }
        C106862S5w.LIZ(viewGroup);
        View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(viewGroup.getContext()), 2131699087, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        return new C4216a(this, LIZ2);
    }

    /* renamed from: com.bytedance.android.live.effect.sticker.ui.gestureV2.b$a */
    /* loaded from: classes5.dex */
    public final class C4216a extends RecyclerView.ViewHolder {
        public final ImageView LIZ;
        public final View LIZIZ;
        public final View LIZJ;
        public final ProgressBar LIZLLL;

        /* renamed from: LJ */
        public final View f26236LJ;

        static {
            Covode.recordClassIndex(24689);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4216a(C4215b c4215b, View view) {
            super(view);
            C106862S5w.LIZ(view);
            View findViewById = view.findViewById(2131167631);
            Intrinsics.checkNotNullExpressionValue(findViewById, "");
            this.LIZ = (ImageView) findViewById;
            View findViewById2 = view.findViewById(2131165326);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "");
            this.LIZIZ = findViewById2;
            View findViewById3 = view.findViewById(2131172867);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "");
            this.LIZJ = findViewById3;
            View findViewById4 = view.findViewById(2131168840);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "");
            this.LIZLLL = (ProgressBar) findViewById4;
            View findViewById5 = view.findViewById(2131187551);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "");
            this.f26236LJ = findViewById5;
        }
    }

    @Override // com.bytedance.android.live.effect.api.l$a
    public final void LIZIZ(String str, Sticker sticker) {
        long j;
        int LIZ2;
        if (PatchProxy.proxy(new Object[]{str, sticker}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, sticker);
        if (this.LJI) {
            long id = sticker.getId();
            Sticker sticker2 = this.LJFF;
            if (sticker2 != null) {
                j = sticker2.getId();
            } else {
                j = -1;
            }
            if (id == j) {
                KI9 ki9 = this.LIZJ;
                if (ki9 != null) {
                    ki9.LIZ(false, this.LIZLLL);
                }
                Sticker sticker3 = this.LIZLLL;
                this.LIZLLL = sticker;
                if (sticker3 != null && LIZ(sticker3, this.f26235LJ) && (LIZ2 = LIZ(this.f26235LJ, sticker3)) >= 0) {
                    notifyItemChanged(LIZ2);
                }
                KI9 ki92 = this.LIZJ;
                if (ki92 != null) {
                    ki92.LIZ(true, this.LIZLLL);
                }
            }
        }
        int LIZIZ = LIZIZ(sticker);
        if (LIZIZ >= 0) {
            notifyItemChanged(LIZIZ);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(C4216a c4216a, int i) {
        int i2;
        ImageModel LIZ2;
        C4216a c4216a2 = c4216a;
        int i3 = 0;
        if (!PatchProxy.proxy(new Object[]{c4216a2, Integer.valueOf(i)}, this, LIZ, false, 5).isSupported) {
            C106862S5w.LIZ(c4216a2);
            Sticker sticker = this.f26235LJ.get(i);
            C2844m icon = sticker.getIcon();
            if (icon != null && (LIZ2 = icon.LIZ()) != null) {
                M0Q.LIZ(c4216a2.LIZ, LIZ2);
            }
            c4216a2.LIZIZ.setVisibility(8);
            if (Sticker.Companion.LIZ(this.LIZLLL, sticker)) {
                c4216a2.LIZIZ.setVisibility(0);
            }
            ProgressBar progressBar = c4216a2.LIZLLL;
            if (sticker.isDownloading()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            progressBar.setVisibility(i2);
            View view = c4216a2.LIZJ;
            if (sticker.isDownloaded()) {
                i3 = 8;
            }
            view.setVisibility(i3);
            LIZ(sticker, new KI8(c4216a2));
            c4216a2.itemView.setOnClickListener(new KI5(this, c4216a2, sticker));
        }
    }

    public final void LIZ(Sticker sticker, AbstractC29868m abstractC29868m) {
        if (PatchProxy.proxy(new Object[]{sticker, abstractC29868m}, this, LIZ, false, 13).isSupported) {
            return;
        }
        if (sticker != null && !Lists.isEmpty(sticker.getTags())) {
            List<String> tags = sticker.getTags();
            Intrinsics.checkNotNull(tags);
            if (tags.contains("new")) {
                this.LIZIZ.LIZ(sticker.getRealId(), sticker.getTagsUpdatedAt(), abstractC29868m);
                return;
            }
        }
        abstractC29868m.LIZIZ();
    }

    @Override // com.bytedance.android.live.effect.api.l$a
    public final void LIZ(String str, Sticker sticker) {
        if (PatchProxy.proxy(new Object[]{str, sticker}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, sticker);
        if (LIZIZ(sticker) >= 0) {
            notifyDataSetChanged();
        }
    }

    @Override // com.bytedance.android.live.effect.api.l$a
    public final void LIZ(String str, Sticker sticker, ExceptionResult exceptionResult) {
        if (PatchProxy.proxy(new Object[]{str, sticker, exceptionResult}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, sticker, exceptionResult);
        C88440Kt0.LIZ(2131583063);
        int LIZIZ = LIZIZ(sticker);
        if (LIZIZ >= 0) {
            notifyItemChanged(LIZIZ);
        }
    }
}
