package com.bytedance.android.live.lynx.components;

import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C101231Ptp;

/* loaded from: classes8.dex */
public final class LiveLynxFragment$mGlobalLayoutListener$1 extends Lambda implements Function0<ViewTreeObserver$OnGlobalLayoutListenerC51531> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C101231Ptp this$0;

    static {
        Covode.recordClassIndex(32183);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveLynxFragment$mGlobalLayoutListener$1(C101231Ptp c101231Ptp) {
        super(0);
        this.this$0 = c101231Ptp;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.android.live.lynx.components.LiveLynxFragment$mGlobalLayoutListener$1$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.lynx.components.LiveLynxFragment$mGlobalLayoutListener$1$1, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC51531 mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.android.live.lynx.components.LiveLynxFragment$mGlobalLayoutListener$1.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(32184);
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
                    com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.lynx.components.LiveLynxFragment$mGlobalLayoutListener$1.ViewTreeObserver$OnGlobalLayoutListenerC51531.LIZ
                    r1 = 1
                    com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r4, r0, r2, r1)
                    boolean r0 = r0.isSupported
                    if (r0 == 0) goto Lf
                    return
                Lf:
                    com.bytedance.android.live.lynx.components.LiveLynxFragment$mGlobalLayoutListener$1 r0 = com.bytedance.android.live.lynx.components.LiveLynxFragment$mGlobalLayoutListener$1.this
                    X.Ptp r0 = r0.this$0
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
                    com.bytedance.android.live.lynx.components.LiveLynxFragment$mGlobalLayoutListener$1 r0 = com.bytedance.android.live.lynx.components.LiveLynxFragment$mGlobalLayoutListener$1.this
                    X.Ptp r0 = r0.this$0
                    android.view.View r0 = r0.getView()
                    if (r0 == 0) goto L46
                    int r0 = r0.getWidth()
                L3c:
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    if (r0 == 0) goto L46
                    int r2 = r0.intValue()
                L46:
                    com.bytedance.android.live.lynx.components.LiveLynxFragment$mGlobalLayoutListener$1 r0 = com.bytedance.android.live.lynx.components.LiveLynxFragment$mGlobalLayoutListener$1.this
                    X.Ptp r0 = r0.this$0
                    int r0 = r0.LJJIIZ
                    if (r0 != 0) goto L66
                    com.bytedance.android.live.lynx.components.LiveLynxFragment$mGlobalLayoutListener$1 r0 = com.bytedance.android.live.lynx.components.LiveLynxFragment$mGlobalLayoutListener$1.this
                    X.Ptp r0 = r0.this$0
                    r0.LJJIIZ = r2
                    return
                L55:
                    com.bytedance.android.live.lynx.components.LiveLynxFragment$mGlobalLayoutListener$1 r0 = com.bytedance.android.live.lynx.components.LiveLynxFragment$mGlobalLayoutListener$1.this
                    X.Ptp r0 = r0.this$0
                    android.view.View r0 = r0.getView()
                    if (r0 == 0) goto L46
                    int r0 = r0.getHeight()
                    goto L3c
                L64:
                    r3 = 0
                    goto L2b
                L66:
                    com.bytedance.android.live.lynx.components.LiveLynxFragment$mGlobalLayoutListener$1 r0 = com.bytedance.android.live.lynx.components.LiveLynxFragment$mGlobalLayoutListener$1.this
                    X.Ptp r0 = r0.this$0
                    int r0 = r0.LJJIIZ
                    if (r0 == r2) goto L95
                    com.bytedance.android.live.lynx.components.LiveLynxFragment$mGlobalLayoutListener$1 r0 = com.bytedance.android.live.lynx.components.LiveLynxFragment$mGlobalLayoutListener$1.this
                    X.Ptp r0 = r0.this$0
                    r0.LJJIIZI = r1
                    com.bytedance.android.live.lynx.components.LiveLynxFragment$mGlobalLayoutListener$1 r0 = com.bytedance.android.live.lynx.components.LiveLynxFragment$mGlobalLayoutListener$1.this
                    X.Ptp r0 = r0.this$0
                    android.view.View r1 = r0.LJJIII
                    if (r1 == 0) goto L81
                    r0 = 8
                    r1.setVisibility(r0)
                L81:
                    com.bytedance.android.live.lynx.components.LiveLynxFragment$mGlobalLayoutListener$1 r0 = com.bytedance.android.live.lynx.components.LiveLynxFragment$mGlobalLayoutListener$1.this
                    X.Ptp r0 = r0.this$0
                    android.view.View r0 = r0.getView()
                    if (r0 == 0) goto L95
                    android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
                    if (r1 == 0) goto L95
                    r0 = r4
                    r1.removeOnGlobalLayoutListener(r0)
                L95:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.lynx.components.LiveLynxFragment$mGlobalLayoutListener$1.ViewTreeObserver$OnGlobalLayoutListenerC51531.onGlobalLayout():void");
            }
        };
    }
}
