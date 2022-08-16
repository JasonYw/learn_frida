package com.bytedance.android.live.broadcast.category.p261ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.model.CategoryNode;
import com.bytedance.android.live.broadcast.api.model.CategoryScene;
import com.bytedance.android.live.broadcast.category.viewmodel.C2970a;
import com.bytedance.android.live.core.p317e.C4070a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.scalpel.scenemanager.core.AbstractC13971f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import me.drakeet.multitype.C35036d;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C77347GeT;
import p003X.IYS;
import p003X.KOO;
import p003X.KOQ;
import p003X.KOR;
import p003X.KOS;
import p003X.KOT;
import p003X.KOV;

/* renamed from: com.bytedance.android.live.broadcast.category.ui.g */
/* loaded from: classes5.dex */
public final class C2967g extends C4070a implements AbstractC13971f {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ = C77347GeT.LIZ(PreviewCategorySearchFragment$previewWidgetContext$2.INSTANCE);
    public final Lazy LIZJ = C77347GeT.LIZ(new PreviewCategorySearchFragment$mCategoryScene$2(this));
    public final Lazy LIZLLL = C77347GeT.LIZ(new PreviewCategorySearchFragment$mCategoryViewModel$2(this));

    /* renamed from: LJ */
    public final Lazy f25795LJ = C77347GeT.LIZ(new PreviewCategorySearchFragment$mAdapter$2(this));
    public HashMap LJFF;

    static {
        Covode.recordClassIndex(15120);
    }

    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 14);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJFF == null) {
            this.LJFF = new HashMap();
        }
        View view = (View) this.LJFF.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.LJFF.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final CategoryScene LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (CategoryScene) (proxy.isSupported ? proxy.result : this.LIZJ.mo27335getValue());
    }

    public final C2970a LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (C2970a) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    public final C35036d LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (C35036d) (proxy.isSupported ? proxy.result : this.f25795LJ.mo27335getValue());
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneFullName() {
        return "com/bytedance/android/live/broadcast/category/ui/PreviewCategorySearchFragment";
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneSimpleName() {
        return "PreviewCategorySearchFragment";
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        HashMap hashMap;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        EditText editText = (EditText) LIZ(2131188916);
        Intrinsics.checkNotNullExpressionValue(editText, "");
        LIZIZ(editText);
        super.onDestroyView();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported && (hashMap = this.LJFF) != null) {
            hashMap.clear();
        }
    }

    public final void LIZ(EditText editText) {
        if (PatchProxy.proxy(new Object[]{editText}, this, LIZ, false, 12).isSupported) {
            return;
        }
        IYS.LIZ(getContext(), editText);
    }

    public final void LIZIZ(EditText editText) {
        if (PatchProxy.proxy(new Object[]{editText}, this, LIZ, false, 13).isSupported) {
            return;
        }
        IYS.LIZIZ(getContext(), editText);
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        super.onViewCreated(view, bundle);
        ((TextView) LIZ(2131188884)).setOnClickListener(new KOQ(this));
        ((ImageView) LIZ(2131188976)).setOnClickListener(new KOR(this));
        ((ConstraintLayout) LIZ(2131165300)).setOnClickListener(new KOS(this));
        ((EditText) LIZ(2131188916)).setOnClickListener(new KOT(this));
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            RecyclerView recyclerView = (RecyclerView) LIZ(2131189017);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setOverScrollMode(2);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            RecyclerView recyclerView2 = (RecyclerView) LIZ(2131189017);
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
            recyclerView2.setLayoutManager(gridLayoutManager);
            RecyclerView recyclerView3 = (RecyclerView) LIZ(2131189017);
            Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
            recyclerView3.setAdapter(LIZJ());
            gridLayoutManager.setSpanSizeLookup(new KOV());
        }
        ((EditText) LIZ(2131188916)).addTextChangedListener(new KOO(this));
        ((EditText) LIZ(2131188916)).requestFocus();
        EditText editText = (EditText) LIZ(2131188916);
        Intrinsics.checkNotNullExpressionValue(editText, "");
        LIZ(editText);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(layoutInflater);
        return C116971W2r.LIZ(layoutInflater, 2131698411, viewGroup, false);
    }

    public final void LIZ(String str, ArrayList<CategoryNode> arrayList, List<? extends CategoryNode> list) {
        if (!PatchProxy.proxy(new Object[]{str, arrayList, list}, this, LIZ, false, 10).isSupported && !TextUtils.isEmpty(str) && list != null && !list.isEmpty()) {
            for (CategoryNode categoryNode : list) {
                List<CategoryNode> list2 = categoryNode.subCategories;
                if (list2 != null && (!list2.isEmpty())) {
                    LIZ(str, arrayList, categoryNode.subCategories);
                } else {
                    String str2 = categoryNode.title;
                    if (str2 != null && StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) str, false, 2, (Object) null)) {
                        arrayList.add(categoryNode);
                    }
                }
            }
        }
    }
}
