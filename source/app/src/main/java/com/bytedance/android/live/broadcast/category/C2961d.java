package com.bytedance.android.live.broadcast.category;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.broadcast.api.model.CategoryNode;
import com.bytedance.android.live.broadcast.api.model.CategoryScene;
import com.bytedance.android.live.broadcast.category.viewmodel.C2970a;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC81278I1w;
import p003X.C106862S5w;
import p003X.C148062fT6;
import p003X.C77347GeT;
import p003X.C86901KMd;
import p003X.C87308Kak;
import p003X.KM9;
import p003X.KN8;

/* renamed from: com.bytedance.android.live.broadcast.category.d */
/* loaded from: classes5.dex */
public final class C2961d {
    public static ChangeQuickRedirect LIZ;
    public final Context LIZIZ;
    public final CategoryScene LIZJ;
    public final Lazy LIZLLL = C77347GeT.LIZ(new LiveTagDataHandler$mCategoryViewModel$2(this));

    /* renamed from: LJ */
    public final C86901KMd f25794LJ = new C86901KMd(this);
    public final Widget LJFF;

    static {
        Covode.recordClassIndex(15074);
    }

    public final C2970a LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C2970a) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        List<CategoryNode> value = LIZ().LJIIJ().getValue();
        if (value == null || !(!value.isEmpty())) {
            return false;
        }
        CategoryNode categoryNode = value.get(0);
        if (categoryNode.isOtherCategory) {
            return false;
        }
        LIZ().LJIILJJIL().setValue(Boolean.FALSE);
        LIZ().LJIIIZ().postValue(categoryNode);
        return true;
    }

    public final void LIZ(HashMap<CategoryScene, List<CategoryNode>> hashMap) {
        List<CategoryNode> list;
        if (!PatchProxy.proxy(new Object[]{hashMap}, this, LIZ, false, 5).isSupported && !PatchProxy.proxy(new Object[]{hashMap, null}, this, LIZ, false, 6).isSupported && hashMap != null && (list = hashMap.get(this.LIZJ)) != null) {
            list.isEmpty();
        }
    }

    public final void LIZ(CategoryNode categoryNode) {
        if (PatchProxy.proxy(new Object[]{categoryNode}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(categoryNode);
        List<CategoryNode> value = LIZ().LJIIJ().getValue();
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
        C87308Kak<String> c87308Kak = AbstractC80293Hkt.LJJIFFI;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        c87308Kak.LIZ(GsonProtectorUtils.toJson(KM9.LIZ(), arrayList));
        LIZ().LJIIJ().postValue(arrayList);
    }

    public final void LIZ(CategoryScene categoryScene) {
        Observable<C5176i<List<CategoryNode>>> allCategory;
        Observable<C5176i<List<CategoryNode>>> observeOn;
        AbstractC81278I1w abstractC81278I1w;
        if (PatchProxy.proxy(new Object[]{categoryScene}, this, LIZ, false, 4).isSupported || categoryScene != this.LIZJ) {
            return;
        }
        Context context = this.LIZIZ;
        if (context != null) {
            if (NetworkUtils.isNetworkAvailable((FragmentActivity) context) && (allCategory = KN8.LIZJ().LIZ().LIZ().getAllCategory(3)) != null && (observeOn = allCategory.observeOn(AndroidSchedulers.mainThread())) != null && (abstractC81278I1w = (AbstractC81278I1w) observeOn.m151as(C148062fT6.LIZ(this.LJFF))) != null) {
                abstractC81278I1w.LIZ(this.f25794LJ);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public final CategoryNode LIZ(long j, List<? extends CategoryNode> list) {
        CategoryNode next;
        loop0: while (true) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), list}, this, LIZ, false, 7);
            if (proxy.isSupported) {
                return (CategoryNode) proxy.result;
            }
            if (j != 0 && list != null && !list.isEmpty()) {
                Iterator<? extends CategoryNode> it = list.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    List<CategoryNode> list2 = next.subCategories;
                    if (list2 == null || !(!list2.isEmpty())) {
                        Long l = next.categoryId;
                        if (l != null && l.longValue() == j) {
                            return next;
                        }
                    }
                }
                break loop0;
            }
            break;
            list = next.subCategories;
        }
    }

    public C2961d(Context context, Widget widget, CategoryScene categoryScene) {
        C106862S5w.LIZ(context, widget, categoryScene);
        this.LIZIZ = context;
        this.LJFF = widget;
        this.LIZJ = categoryScene;
    }
}
