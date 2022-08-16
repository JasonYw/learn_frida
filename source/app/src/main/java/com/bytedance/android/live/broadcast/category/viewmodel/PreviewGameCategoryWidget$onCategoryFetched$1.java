package com.bytedance.android.live.broadcast.category.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final /* synthetic */ class PreviewGameCategoryWidget$onCategoryFetched$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(15181);
    }

    public PreviewGameCategoryWidget$onCategoryFetched$1(PreviewGameCategoryWidget previewGameCategoryWidget) {
        super(0, previewGameCategoryWidget, PreviewGameCategoryWidget.class, "autoLaunchGameCategoryDialog", "autoLaunchGameCategoryDialog()V", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
        if (r0 == false) goto L9;
     */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ kotlin.Unit mo30099invoke() {
        /*
            r6 = this;
            r5 = 0
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcast.category.viewmodel.PreviewGameCategoryWidget$onCategoryFetched$1.changeQuickRedirect
            r0 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r6, r1, r5, r0)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L5a
            java.lang.Object r4 = r6.receiver
            com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget r4 = (com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget) r4
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcast.category.viewmodel.PreviewGameCategoryWidget.f25800LJ
            r0 = 6
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r4, r1, r5, r0)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L5a
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget.LIZ
            r0 = 8
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r3, r4, r1, r5, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L86
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L39:
            if (r0 != 0) goto L5a
        L3b:
            com.bytedance.android.live.broadcast.preview.v r0 = r4.LIZJ()
            X.2WC r0 = r0.LJIILL()
            java.lang.Object r0 = r0.LIZ()
            com.bytedance.android.live.broadcast.api.model.CategoryNode r0 = (com.bytedance.android.live.broadcast.api.model.CategoryNode) r0
            if (r0 != 0) goto L5d
            com.bytedance.android.live.broadcast.preview.o r0 = r4.LIZLLL()
            if (r0 == 0) goto L5a
            com.bytedance.ies.sdk.widgets.NextLiveData r0 = r0.LIZIZ()
            if (r0 == 0) goto L5a
            r0.postValue(r2)
        L5a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L5d:
            boolean r0 = r0.isRemoved
            if (r0 == 0) goto L76
            com.bytedance.android.live.broadcast.preview.o r0 = r4.LIZLLL()
            if (r0 == 0) goto L5a
            com.bytedance.ies.sdk.widgets.NextLiveData r1 = r0.LIZIZ()
            if (r1 == 0) goto L5a
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.postValue(r0)
            goto L5a
        L76:
            com.bytedance.android.live.broadcast.preview.o r0 = r4.LIZLLL()
            if (r0 == 0) goto L5a
            com.bytedance.ies.sdk.widgets.NextLiveData r0 = r0.LIZIZ()
            if (r0 == 0) goto L5a
            r0.postValue(r2)
            goto L5a
        L86:
            X.KMv r0 = r4.LIZJ
            if (r0 == 0) goto L3b
            X.KMv r0 = r4.LIZJ
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            boolean r0 = r0.LJIILIIL()
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.category.viewmodel.PreviewGameCategoryWidget$onCategoryFetched$1.mo30099invoke():java.lang.Object");
    }
}
