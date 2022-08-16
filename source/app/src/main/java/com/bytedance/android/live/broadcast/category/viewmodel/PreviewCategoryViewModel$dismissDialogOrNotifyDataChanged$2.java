package com.bytedance.android.live.broadcast.category.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes28.dex */
public final class PreviewCategoryViewModel$dismissDialogOrNotifyDataChanged$2 extends Lambda implements Function0<NextLiveData<Boolean>> {
    public static final PreviewCategoryViewModel$dismissDialogOrNotifyDataChanged$2 INSTANCE = new PreviewCategoryViewModel$dismissDialogOrNotifyDataChanged$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(15156);
    }

    public PreviewCategoryViewModel$dismissDialogOrNotifyDataChanged$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.ies.sdk.widgets.NextLiveData<java.lang.Boolean>] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ NextLiveData<Boolean> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new NextLiveData<>();
    }
}
