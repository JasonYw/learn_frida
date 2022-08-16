package com.bytedance.android.live.effect.sticker.p331ui.gestureV3;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.common.utility.Lists;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.KH5;
import p003X.KH6;
import p003X.KIS;
import p003X.M0Q;

/* renamed from: com.bytedance.android.live.effect.sticker.ui.gestureV3.e */
/* loaded from: classes5.dex */
public final class C4221e extends RecyclerView.Adapter<C4222a> {
    public static ChangeQuickRedirect LIZ;
    public KIS LIZIZ;
    public List<EffectCategoryResponse> LIZJ;
    public Context LJFF;
    public final LiveEffectContextFactory.Type LJII;
    public final SparseArray<C4219a> LJI = new SparseArray<>();
    public final Map<Integer, RecyclerView> LIZLLL = new HashMap();

    /* renamed from: LJ */
    public final HashMap<Integer, Integer[]> f26241LJ = new HashMap<>();

    static {
        Covode.recordClassIndex(24714);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<EffectCategoryResponse> list;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (Lists.isEmpty(this.LIZJ) || (list = this.LIZJ) == null) {
            return 0;
        }
        return list.size();
    }

    public C4221e(LiveEffectContextFactory.Type type) {
        C106862S5w.LIZ(type);
        this.LJII = type;
    }

    /* renamed from: com.bytedance.android.live.effect.sticker.ui.gestureV3.e$a */
    /* loaded from: classes5.dex */
    public final class C4222a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(24715);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4222a(C4221e c4221e, View view) {
            super(view);
            C106862S5w.LIZ(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ C4222a onCreateViewHolder(ViewGroup viewGroup, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewGroup, Integer.valueOf(i)}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C4222a) proxy.result;
        }
        C106862S5w.LIZ(viewGroup);
        this.LJFF = viewGroup.getContext();
        View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(viewGroup.getContext()), 2131699090, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        return new C4222a(this, LIZ2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(C4222a c4222a, int i) {
        EffectCategoryResponse effectCategoryResponse;
        C4222a c4222a2 = c4222a;
        if (!PatchProxy.proxy(new Object[]{c4222a2, Integer.valueOf(i)}, this, LIZ, false, 3).isSupported) {
            C106862S5w.LIZ(c4222a2);
            List<EffectCategoryResponse> list = this.LIZJ;
            if (list != null && (effectCategoryResponse = list.get(c4222a2.getAdapterPosition())) != null) {
                ImageModel imageModel = new ImageModel();
                ArrayList arrayList = new ArrayList();
                String icon_selected_url = effectCategoryResponse.getIcon_selected_url();
                if (icon_selected_url != null && !StringsKt__StringsJVMKt.isBlank(icon_selected_url)) {
                    arrayList.add(icon_selected_url);
                }
                if (Lists.isEmpty(arrayList)) {
                    View view = c4222a2.itemView;
                    Intrinsics.checkNotNullExpressionValue(view, "");
                    ((ImageView) view.findViewById(2131167631)).setImageResource(2130855738);
                } else {
                    imageModel.setUrls(arrayList);
                    View view2 = c4222a2.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    M0Q.LIZ((ImageView) view2.findViewById(2131167631), imageModel);
                }
                View view3 = c4222a2.itemView;
                Intrinsics.checkNotNullExpressionValue(view3, "");
                RecyclerView recyclerView = (RecyclerView) view3.findViewById(2131170214);
                Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                recyclerView.setLayoutManager(new LinearLayoutManager(this.LJFF, 0, false));
                if (this.LJI.get(c4222a2.getAdapterPosition()) == null) {
                    C4219a c4219a = new C4219a(this.LJII);
                    c4219a.LIZJ = new KH6(this, c4222a2);
                    View view4 = c4222a2.itemView;
                    Intrinsics.checkNotNullExpressionValue(view4, "");
                    ((RecyclerView) view4.findViewById(2131170214)).addOnScrollListener(new KH5(this, c4222a2));
                    this.LJI.put(c4222a2.getAdapterPosition(), c4219a);
                }
                C4219a c4219a2 = this.LJI.get(c4222a2.getAdapterPosition());
                View view5 = c4222a2.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "");
                RecyclerView recyclerView2 = (RecyclerView) view5.findViewById(2131170214);
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                if (recyclerView2.mo25798getAdapter() == null) {
                    View view6 = c4222a2.itemView;
                    Intrinsics.checkNotNullExpressionValue(view6, "");
                    RecyclerView recyclerView3 = (RecyclerView) view6.findViewById(2131170214);
                    Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
                    recyclerView3.setAdapter(c4219a2);
                    View view7 = c4222a2.itemView;
                    Intrinsics.checkNotNullExpressionValue(view7, "");
                    RecyclerView recyclerView4 = (RecyclerView) view7.findViewById(2131170214);
                    Intrinsics.checkNotNullExpressionValue(recyclerView4, "");
                    RecyclerView.Adapter mo25798getAdapter = recyclerView4.mo25798getAdapter();
                    if (mo25798getAdapter != null) {
                        ((C4219a) mo25798getAdapter).LIZ(effectCategoryResponse);
                        Map<Integer, RecyclerView> map = this.LIZLLL;
                        Integer valueOf = Integer.valueOf(c4222a2.getAdapterPosition());
                        View view8 = c4222a2.itemView;
                        Intrinsics.checkNotNullExpressionValue(view8, "");
                        View findViewById = view8.findViewById(2131170214);
                        Intrinsics.checkNotNullExpressionValue(findViewById, "");
                        map.put(valueOf, findViewById);
                        Integer[] numArr = this.f26241LJ.get(Integer.valueOf(c4222a2.getAdapterPosition()));
                        if (numArr != null && numArr.length == 2) {
                            View view9 = c4222a2.itemView;
                            Intrinsics.checkNotNullExpressionValue(view9, "");
                            RecyclerView recyclerView5 = (RecyclerView) view9.findViewById(2131170214);
                            Intrinsics.checkNotNullExpressionValue(recyclerView5, "");
                            RecyclerView.LayoutManager mo25799getLayoutManager = recyclerView5.mo25799getLayoutManager();
                            if (!(mo25799getLayoutManager instanceof LinearLayoutManager)) {
                                mo25799getLayoutManager = null;
                            }
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mo25799getLayoutManager;
                            if (linearLayoutManager != null) {
                                linearLayoutManager.scrollToPositionWithOffset(numArr[0].intValue(), numArr[1].intValue());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.effect.sticker.ui.gestureV3.LiveGestureMagicAdapterVCD");
                }
            }
        }
    }
}
