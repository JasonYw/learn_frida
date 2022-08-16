package com.bytedance.android.live.broadcast.category.viewmodel;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.android.live.broadcast.api.model.CategoryNode;
import com.bytedance.android.live.broadcast.api.model.CategoryScene;
import com.bytedance.android.live.broadcast.preview.C3181o;
import com.bytedance.android.livesdk.model.XTCategory;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C86907KMj;
import p003X.C86911KMn;
import p003X.C87308Kak;
import p003X.KM9;

/* loaded from: classes5.dex */
public final class PreviewVideoCategoryWidget extends PreviewCategoryWidget implements AbstractC4569445g {

    /* renamed from: LJ */
    public static ChangeQuickRedirect f25802LJ;

    static {
        Covode.recordClassIndex(15188);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewVideoCategoryWidget";
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a230";
    }

    @Override // com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget, com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, f25802LJ, false, 7).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public PreviewVideoCategoryWidget() {
        super(CategoryScene.VIDEO);
    }

    @Override // com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget
    public final void LJFF() {
        List<CategoryNode> value;
        if (!PatchProxy.proxy(new Object[0], this, f25802LJ, false, 4).isSupported && (value = LIZIZ().LJIIJ().getValue()) != null && (!value.isEmpty())) {
            LIZIZ().LJIIIZ().postValue(value.get(0));
        }
    }

    @Override // com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget, com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        Object mo27335getValue;
        if (PatchProxy.proxy(new Object[0], this, f25802LJ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        LIZIZ().LJIIIZ().observe(this, new C86907KMj(this));
        C3181o LIZLLL = LIZLLL();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], LIZLLL, C3181o.LIZ, false, 2);
        if (proxy.isSupported) {
            mo27335getValue = proxy.result;
        } else {
            mo27335getValue = LIZLLL.LIZJ.mo27335getValue();
        }
        ((LiveData) mo27335getValue).observe(this, new C86911KMn(this));
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LIZ(LiveMode liveMode) {
        List<CategoryNode> list;
        if (PatchProxy.proxy(new Object[]{liveMode}, this, f25802LJ, false, 5).isSupported) {
            return;
        }
        super.LIZ(liveMode);
        if (liveMode != LiveMode.SCREEN_RECORD) {
            HashMap<CategoryScene, List<CategoryNode>> value = LIZIZ().m15906LJ().getValue();
            if (value == null || (list = value.get(this.LIZLLL)) == null || list.isEmpty()) {
                LIZ(CategoryScene.VIDEO);
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget
    public final void LIZ(CategoryNode categoryNode) {
        if (PatchProxy.proxy(new Object[]{categoryNode}, this, f25802LJ, false, 6).isSupported) {
            return;
        }
        super.LIZ(categoryNode);
        if (categoryNode == null) {
            return;
        }
        if (!PatchProxy.proxy(new Object[]{categoryNode}, this, f25802LJ, false, 2).isSupported) {
            List<CategoryNode> value = LIZIZ().LJIIJ().getValue();
            ArrayList arrayList = new ArrayList();
            arrayList.add(categoryNode);
            if (value != null) {
                Iterator<T> it = value.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    CategoryNode categoryNode2 = (CategoryNode) it.next();
                    if (!Intrinsics.areEqual(categoryNode2.categoryId, categoryNode.categoryId)) {
                        arrayList.add(categoryNode2);
                        break;
                    }
                }
            }
            C87308Kak<String> c87308Kak = AbstractC80293Hkt.LJJIFFI;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            c87308Kak.LIZ(GsonProtectorUtils.toJson(KM9.LIZ(), arrayList));
            LIZIZ().LJIIJ().postValue(arrayList);
        }
        XTCategory LIZ = LIZJ().LJIIJJI().LIZ();
        if (LIZ != null) {
            LIZ.mCategoryId = String.valueOf(categoryNode.categoryId.longValue());
            LIZ.mCategoryName = categoryNode.title;
        }
        LIZJ().LJIIJJI().LIZ(LIZ);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    @Override // com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget
    public final void LIZ(HashMap<CategoryScene, List<CategoryNode>> hashMap) {
        List<CategoryNode> list;
        List<CategoryNode> value;
        if (!PatchProxy.proxy(new Object[]{hashMap}, this, f25802LJ, false, 3).isSupported && hashMap != null && (list = hashMap.get(this.LIZLLL)) != null && !list.isEmpty() && (value = LIZIZ().LJIIJ().getValue()) != null && (!value.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (CategoryNode categoryNode : value) {
                Long l = categoryNode.categoryId;
                if (l != null) {
                    CategoryNode LIZ = LIZ(l.longValue(), list);
                    if (LIZ == null) {
                        categoryNode.isRemoved = true;
                        arrayList.add(categoryNode);
                    } else if (!LIZ.canChoose) {
                        arrayList.add(LIZ);
                    } else {
                        arrayList.add(categoryNode);
                    }
                    z = true;
                }
            }
            if (z) {
                C87308Kak<String> c87308Kak = AbstractC80293Hkt.LJJIFFI;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                c87308Kak.LIZ(GsonProtectorUtils.toJson(KM9.LIZ(), arrayList));
                LIZIZ().LJIIJ().postValue(arrayList);
                LIZIZ().LJIIIZ().postValue(arrayList.get(0));
            }
        }
    }
}
