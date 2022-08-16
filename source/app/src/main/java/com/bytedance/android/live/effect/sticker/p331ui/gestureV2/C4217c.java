package com.bytedance.android.live.effect.sticker.p331ui.gestureV2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.common.utility.Lists;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.effectmanager.effect.listener.AbstractC29868m;
import com.p1594ss.android.ugc.effectmanager.effect.model.Effect;
import com.p1594ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.KIF;
import p003X.KIG;
import p003X.KIJ;
import p003X.M0Q;

/* renamed from: com.bytedance.android.live.effect.sticker.ui.gestureV2.c */
/* loaded from: classes5.dex */
public final class C4217c extends RecyclerView.Adapter<C4218a> {
    public static ChangeQuickRedirect LIZ;
    public List<EffectCategoryResponse> LIZIZ;
    public int LIZJ;
    public KIJ LIZLLL;

    /* renamed from: LJ */
    public boolean f26237LJ = true;
    public final HashMap<String, Boolean> LJFF = new HashMap<>();
    public final Context LJI;
    public final LiveEffectContextFactory.Type LJII;

    static {
        Covode.recordClassIndex(24695);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        List<EffectCategoryResponse> list = this.LIZIZ;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public C4217c(Context context, LiveEffectContextFactory.Type type) {
        C106862S5w.LIZ(type);
        this.LJI = context;
        this.LJII = type;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ C4218a onCreateViewHolder(ViewGroup viewGroup, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewGroup, Integer.valueOf(i)}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (C4218a) proxy.result;
        }
        C106862S5w.LIZ(viewGroup);
        View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(this.LJI), 2131699093, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        return new C4218a(this, LIZ2);
    }

    /* renamed from: com.bytedance.android.live.effect.sticker.ui.gestureV2.c$a */
    /* loaded from: classes5.dex */
    public final class C4218a extends RecyclerView.ViewHolder {
        public final ImageView LIZ;
        public final View LIZIZ;
        public final View LIZJ;
        public final View LIZLLL;

        /* renamed from: LJ */
        public final View f26238LJ;

        static {
            Covode.recordClassIndex(24696);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4218a(C4217c c4217c, View view) {
            super(view);
            C106862S5w.LIZ(view);
            View findViewById = view.findViewById(2131167533);
            Intrinsics.checkNotNullExpressionValue(findViewById, "");
            this.LIZ = (ImageView) findViewById;
            View findViewById2 = view.findViewById(2131165326);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "");
            this.LIZIZ = findViewById2;
            View findViewById3 = view.findViewById(2131189243);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "");
            this.LIZJ = findViewById3;
            View findViewById4 = view.findViewById(2131168549);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "");
            this.LIZLLL = findViewById4;
            View findViewById5 = view.findViewById(2131187551);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "");
            this.f26238LJ = findViewById5;
        }
    }

    private final void LIZ(Effect effect, AbstractC29868m abstractC29868m) {
        if (PatchProxy.proxy(new Object[]{effect, abstractC29868m}, this, LIZ, false, 8).isSupported) {
            return;
        }
        List<String> tags = effect.getTags();
        if (tags != null && !tags.isEmpty() && tags.contains("new")) {
            C4173o.LJIIJ.LIZ(this.LJII).LJIIIIZZ().LIZ().LIZ(effect.getId(), effect.getTagsUpdatedAt(), abstractC29868m);
        } else {
            abstractC29868m.LIZIZ();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(C4218a c4218a, int i) {
        EffectCategoryResponse effectCategoryResponse;
        C4218a c4218a2 = c4218a;
        if (!PatchProxy.proxy(new Object[]{c4218a2, Integer.valueOf(i)}, this, LIZ, false, 6).isSupported) {
            C106862S5w.LIZ(c4218a2);
            if (this.LIZJ == i) {
                c4218a2.LIZIZ.setVisibility(0);
            } else {
                c4218a2.LIZIZ.setVisibility(4);
            }
            int i2 = this.LIZJ;
            if (i != i2 && i + 1 != i2) {
                c4218a2.LIZLLL.setVisibility(0);
            } else {
                c4218a2.LIZLLL.setVisibility(8);
            }
            List<EffectCategoryResponse> list = this.LIZIZ;
            if (list != null && (effectCategoryResponse = list.get(i)) != null) {
                ImageModel imageModel = new ImageModel();
                ArrayList arrayList = new ArrayList();
                if (this.LIZJ == i) {
                    String icon_selected_url = effectCategoryResponse.getIcon_selected_url();
                    if (icon_selected_url != null && !StringsKt__StringsJVMKt.isBlank(icon_selected_url)) {
                        arrayList.add(icon_selected_url);
                    }
                } else {
                    String icon_normal_url = effectCategoryResponse.getIcon_normal_url();
                    if (icon_normal_url != null && !StringsKt__StringsJVMKt.isBlank(icon_normal_url)) {
                        arrayList.add(icon_normal_url);
                    }
                }
                if (Lists.isEmpty(arrayList)) {
                    c4218a2.LIZ.setImageResource(2130855738);
                } else {
                    imageModel.setUrls(arrayList);
                    M0Q.LIZ(c4218a2.LIZ, imageModel);
                }
                if (this.LJFF.containsKey(effectCategoryResponse.getId()) && Intrinsics.areEqual(this.LJFF.get(effectCategoryResponse.getId()), Boolean.TRUE)) {
                    c4218a2.LIZJ.setVisibility(0);
                } else {
                    c4218a2.LIZJ.setVisibility(8);
                }
                if (this.LIZJ != i) {
                    c4218a2.LIZJ.setAlpha(0.4f);
                } else {
                    c4218a2.LIZJ.setAlpha(1.0f);
                }
                c4218a2.f26238LJ.setVisibility(8);
                LIZ(c4218a2, effectCategoryResponse, 0);
                c4218a2.itemView.setOnClickListener(new KIF(this, c4218a2));
            }
        }
    }

    public final void LIZ(boolean z, int i) {
        int i2;
        List<EffectCategoryResponse> list;
        EffectCategoryResponse effectCategoryResponse;
        String id;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        List<EffectCategoryResponse> list2 = this.LIZIZ;
        if (list2 != null) {
            i2 = list2.size();
        } else {
            i2 = -1;
        }
        if (i2 >= i && (list = this.LIZIZ) != null && (effectCategoryResponse = list.get(i)) != null && (id = effectCategoryResponse.getId()) != null) {
            this.LJFF.put(id, Boolean.valueOf(z));
            notifyItemChanged(i);
        }
    }

    public final void LIZ(C4218a c4218a, EffectCategoryResponse effectCategoryResponse, int i) {
        if (PatchProxy.proxy(new Object[]{c4218a, effectCategoryResponse, Integer.valueOf(i)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        if (i < effectCategoryResponse.getTotalEffects().size() && i != 30) {
            LIZ(effectCategoryResponse.getTotalEffects().get(i), new KIG(this, c4218a, effectCategoryResponse, i));
        } else {
            c4218a.f26238LJ.setVisibility(8);
        }
    }
}
