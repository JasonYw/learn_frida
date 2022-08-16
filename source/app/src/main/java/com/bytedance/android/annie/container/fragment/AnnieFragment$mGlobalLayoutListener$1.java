package com.bytedance.android.annie.container.fragment;

import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class AnnieFragment$mGlobalLayoutListener$1 extends Lambda implements Function0<ViewTreeObserver$OnGlobalLayoutListenerC26051> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2606a this$0;

    static {
        Covode.recordClassIndex(10749);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnieFragment$mGlobalLayoutListener$1(C2606a c2606a) {
        super(0);
        this.this$0 = c2606a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1$1] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC26051 mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(10750);
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onGlobalLayout() {
                /*
                    r4 = this;
                    r2 = 0
                    java.lang.Object[] r3 = new java.lang.Object[r2]
                    com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1.ViewTreeObserver$OnGlobalLayoutListenerC26051.LIZ
                    r1 = 1
                    com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r4, r0, r2, r1)
                    boolean r0 = r0.isSupported
                    if (r0 == 0) goto Lf
                    return
                Lf:
                    com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1 r0 = com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1.this
                    com.bytedance.android.annie.container.fragment.a r0 = r0.this$0
                    androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
                    if (r0 == 0) goto L64
                    android.content.res.Resources r0 = r0.getResources()
                    if (r0 == 0) goto L64
                    android.content.res.Configuration r0 = r0.getConfiguration()
                    if (r0 == 0) goto L64
                    int r3 = r0.orientation
                    r0 = 2
                    if (r3 != r0) goto L64
                    r3 = 1
                L2b:
                    r0 = 0
                    if (r3 == 0) goto L55
                    com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1 r0 = com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1.this
                    com.bytedance.android.annie.container.fragment.a r0 = r0.this$0
                    android.view.View r0 = r0.getView()
                    if (r0 == 0) goto L46
                    int r0 = r0.getWidth()
                L3c:
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    if (r0 == 0) goto L46
                    int r2 = r0.intValue()
                L46:
                    com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1 r0 = com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1.this
                    com.bytedance.android.annie.container.fragment.a r0 = r0.this$0
                    int r0 = r0.preLength
                    if (r0 != 0) goto L66
                    com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1 r0 = com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1.this
                    com.bytedance.android.annie.container.fragment.a r0 = r0.this$0
                    r0.preLength = r2
                    return
                L55:
                    com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1 r0 = com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1.this
                    com.bytedance.android.annie.container.fragment.a r0 = r0.this$0
                    android.view.View r0 = r0.getView()
                    if (r0 == 0) goto L46
                    int r0 = r0.getHeight()
                    goto L3c
                L64:
                    r3 = 0
                    goto L2b
                L66:
                    com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1 r0 = com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1.this
                    com.bytedance.android.annie.container.fragment.a r0 = r0.this$0
                    int r0 = r0.preLength
                    if (r0 == r2) goto L93
                    com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1 r0 = com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1.this
                    com.bytedance.android.annie.container.fragment.a r0 = r0.this$0
                    r0.profileShown = r1
                    com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1 r0 = com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1.this
                    com.bytedance.android.annie.container.fragment.a r0 = r0.this$0
                    X.PUg r0 = r0.mLoadingSubFragmentProxy
                    if (r0 == 0) goto L7f
                    r0.LIZJ()
                L7f:
                    com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1 r0 = com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1.this
                    com.bytedance.android.annie.container.fragment.a r0 = r0.this$0
                    android.view.View r0 = r0.getView()
                    if (r0 == 0) goto L93
                    android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
                    if (r1 == 0) goto L93
                    r0 = r4
                    r1.removeOnGlobalLayoutListener(r0)
                L93:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.annie.container.fragment.AnnieFragment$mGlobalLayoutListener$1.ViewTreeObserver$OnGlobalLayoutListenerC26051.onGlobalLayout():void");
            }
        };
    }
}
