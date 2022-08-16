package com.bytedance.android.live.broadcast.category.viewmodel;

import com.bytedance.android.live.broadcast.api.model.CategoryScene;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class PreviewCategoryViewModel$onSelectEvent$2 extends Lambda implements Function0<NextLiveData<CategoryScene>> {
    public static final PreviewCategoryViewModel$onSelectEvent$2 INSTANCE = new PreviewCategoryViewModel$onSelectEvent$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(15163);
    }

    public PreviewCategoryViewModel$onSelectEvent$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.ies.sdk.widgets.NextLiveData<com.bytedance.android.live.broadcast.api.model.CategoryScene>] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ NextLiveData<CategoryScene> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new NextLiveData<>();
    }
}
