package com.bytedance.android.live.broadcast.category;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.broadcast.api.model.CategoryNode;
import com.bytedance.android.live.broadcast.api.model.CategoryScene;
import com.bytedance.android.live.broadcast.category.viewmodel.C2970a;
import com.bytedance.android.live.broadcast.preview.AbstractC3178e;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC81278I1w;
import p003X.C106862S5w;
import p003X.C148062fT6;
import p003X.C77347GeT;
import p003X.C81280I1y;
import p003X.C81895IPp;
import p003X.C86899KMb;
import p003X.C87308Kak;
import p003X.KM9;
import p003X.KMY;
import p003X.KN8;

/* renamed from: com.bytedance.android.live.broadcast.category.a */
/* loaded from: classes5.dex */
public final class C2959a {
    public static ChangeQuickRedirect LIZ;
    public static final C86899KMb LIZLLL = new C86899KMb((byte) 0);
    public final Context LIZIZ;
    public final CategoryScene LIZJ;

    /* renamed from: LJ */
    public final Lazy f25793LJ = C77347GeT.LIZ(new GameCategoryDataHandler$mCategoryViewModel$2(this));
    public final KMY LJFF = new KMY(this);
    public final Widget LJI;

    static {
        Covode.recordClassIndex(15063);
    }

    public final C2970a LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C2970a) (proxy.isSupported ? proxy.result : this.f25793LJ.mo27335getValue());
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    public final void LIZ(HashMap<CategoryScene, List<CategoryNode>> hashMap, Function0<Unit> function0) {
        List<CategoryNode> list;
        List<CategoryNode> value;
        if (PatchProxy.proxy(new Object[]{hashMap, function0}, this, LIZ, false, 6).isSupported || hashMap == null || (list = hashMap.get(this.LIZJ)) == null || list.isEmpty() || (value = LIZ().LJII().getValue()) == null) {
            return;
        }
        if (!value.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (CategoryNode categoryNode : value) {
                Long l = categoryNode.categoryId;
                if (l != null) {
                    CategoryNode LIZ2 = LIZ(l.longValue(), list);
                    if (LIZ2 == null) {
                        categoryNode.isRemoved = true;
                        arrayList.add(categoryNode);
                    } else {
                        arrayList.add(LIZ2);
                    }
                    z = true;
                }
            }
            if (z) {
                C87308Kak<String> c87308Kak = AbstractC80293Hkt.LJJI;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                c87308Kak.LIZ(GsonProtectorUtils.toJson(KM9.LIZ(), arrayList));
                LIZ().LJII().postValue(arrayList);
                LIZ().LJFF().postValue(arrayList.get(0));
            }
        }
        LIZ(list, function0);
    }

    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        List<CategoryNode> value = LIZ().LJII().getValue();
        if (value == null || !(!value.isEmpty())) {
            return false;
        }
        CategoryNode categoryNode = value.get(0);
        if (categoryNode.isOtherCategory && LIZLLL.LIZ()) {
            return false;
        }
        LIZ().LJIILJJIL().setValue(Boolean.FALSE);
        LIZ().LJFF().postValue(categoryNode);
        return true;
    }

    private final HashMap<Long, CategoryNode> LIZIZ(List<? extends CategoryNode> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (HashMap) proxy.result;
        }
        HashMap<Long, CategoryNode> hashMap = new HashMap<>();
        if (list == null) {
            return hashMap;
        }
        for (CategoryNode categoryNode : list) {
            Long l = categoryNode.categoryId;
            Intrinsics.checkNotNullExpressionValue(l, "");
            hashMap.put(l, categoryNode);
            for (CategoryNode categoryNode2 : categoryNode.subCategories) {
                Long l2 = categoryNode2.categoryId;
                Intrinsics.checkNotNullExpressionValue(l2, "");
                hashMap.put(l2, categoryNode2);
            }
        }
        return hashMap;
    }

    private final boolean LIZ(List<? extends CategoryNode> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        HashMap<Long, CategoryNode> LIZIZ = LIZIZ(LIZ().LJIIIIZZ().getValue());
        boolean z = false;
        for (CategoryNode categoryNode : list) {
            if (LIZIZ.isEmpty()) {
                break;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<CategoryNode> it = categoryNode.subCategories.iterator();
            while (it.hasNext()) {
                CategoryNode next = it.next();
                if (LIZIZ.get(next.categoryId) == null) {
                    next.isNewCategory = true;
                    categoryNode.isNewCategory = true;
                    it.remove();
                    arrayList.add(next);
                    z = true;
                }
            }
            if (!arrayList.isEmpty()) {
                categoryNode.subCategories.addAll(0, arrayList);
            }
        }
        return z;
    }

    public final void LIZ(CategoryNode categoryNode) {
        if (PatchProxy.proxy(new Object[]{categoryNode}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(categoryNode);
        List<CategoryNode> value = LIZ().LJII().getValue();
        ArrayList arrayList = new ArrayList();
        arrayList.add(categoryNode);
        int i = !categoryNode.isOtherCategory ? 1 : 0;
        if (value != null) {
            for (CategoryNode categoryNode2 : value) {
                if (!Intrinsics.areEqual(categoryNode2.categoryId, categoryNode.categoryId)) {
                    arrayList.add(categoryNode2);
                    if (!categoryNode2.isOtherCategory) {
                        i++;
                    }
                    if (i >= 2) {
                        break;
                    }
                }
            }
        }
        C87308Kak<String> c87308Kak = AbstractC80293Hkt.LJJI;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        c87308Kak.LIZ(GsonProtectorUtils.toJson(KM9.LIZ(), arrayList));
        LIZ().LJII().postValue(arrayList);
    }

    public final void LIZ(CategoryScene categoryScene) {
        Observable<C5176i<List<CategoryNode>>> observeOn;
        AbstractC81278I1w abstractC81278I1w;
        if (PatchProxy.proxy(new Object[]{categoryScene}, this, LIZ, false, 4).isSupported || categoryScene != this.LIZJ) {
            return;
        }
        Context context = this.LIZIZ;
        if (context != null) {
            if (!NetworkUtils.isNetworkAvailable((FragmentActivity) context)) {
                return;
            }
            AbstractC3178e abstractC3178e = (AbstractC3178e) KN8.LIZJ().LIZIZ().LIZ(AbstractC3178e.class);
            if (abstractC3178e != null) {
                abstractC3178e.LIZIZ();
            }
            Observable<C5176i<List<CategoryNode>>> allCategory = KN8.LIZJ().LIZ().LIZ().getAllCategory(2);
            if (allCategory != null && (observeOn = allCategory.observeOn(AndroidSchedulers.mainThread())) != null && (abstractC81278I1w = (AbstractC81278I1w) observeOn.m151as(C148062fT6.LIZ(this.LJI))) != null) {
                abstractC81278I1w.LIZ(this.LJFF);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    private final void LIZ(List<? extends CategoryNode> list, Function0<Unit> function0) {
        if (!PatchProxy.proxy(new Object[]{list, function0}, this, LIZ, false, 7).isSupported && LIZLLL.LIZ()) {
            if (LIZ(list) && function0 != null) {
                function0.mo30099invoke();
            }
            Single.create(new C81895IPp(this, list)).subscribeOn(Schedulers.m138io()).subscribe(new C81280I1y());
        }
    }

    public final CategoryNode LIZ(long j, List<? extends CategoryNode> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), list}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (CategoryNode) proxy.result;
        }
        if (j != 0 && list != null && !list.isEmpty()) {
            for (CategoryNode categoryNode : list) {
                List<CategoryNode> list2 = categoryNode.subCategories;
                if (list2 != null && (!list2.isEmpty())) {
                    CategoryNode LIZ2 = LIZ(j, categoryNode.subCategories);
                    if (LIZ2 != null) {
                        return LIZ2;
                    }
                } else {
                    Long l = categoryNode.categoryId;
                    if (l != null && l.longValue() == j) {
                        return categoryNode;
                    }
                }
            }
        }
        return null;
    }

    public C2959a(Context context, Widget widget, CategoryScene categoryScene) {
        C106862S5w.LIZ(context, widget, categoryScene);
        this.LIZIZ = context;
        this.LJI = widget;
        this.LIZJ = categoryScene;
    }
}
