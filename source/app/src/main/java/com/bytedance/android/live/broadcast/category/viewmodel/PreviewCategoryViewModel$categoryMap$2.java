package com.bytedance.android.live.broadcast.category.viewmodel;

import com.bytedance.android.live.broadcast.api.model.CategoryNode;
import com.bytedance.android.live.broadcast.api.model.CategoryScene;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class PreviewCategoryViewModel$categoryMap$2 extends Lambda implements Function0<NextLiveData<HashMap<CategoryScene, List<? extends CategoryNode>>>> {
    public static final PreviewCategoryViewModel$categoryMap$2 INSTANCE = new PreviewCategoryViewModel$categoryMap$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(15154);
    }

    public PreviewCategoryViewModel$categoryMap$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.ies.sdk.widgets.NextLiveData<java.util.HashMap<com.bytedance.android.live.broadcast.api.model.CategoryScene, java.util.List<? extends com.bytedance.android.live.broadcast.api.model.CategoryNode>>>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ NextLiveData<HashMap<CategoryScene, List<? extends CategoryNode>>> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        NextLiveData<HashMap<CategoryScene, List<? extends CategoryNode>>> nextLiveData = new NextLiveData<>();
        nextLiveData.setValue(new HashMap<>());
        return nextLiveData;
    }
}
