package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class StartLiveRootView extends ConstraintLayout {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(18794);
    }

    public StartLiveRootView(Context context) {
        this(context, null, 0, 6, null);
    }

    public StartLiveRootView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r1 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() == false) goto L10;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            r4 = 1
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r3 = 0
            r1[r3] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.broadcast.widget.StartLiveRootView.LIZ
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r6, r0, r3, r4)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L19
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L19:
            X.KJp r5 = p003X.C86835KJp.LIZLLL
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r3] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = p003X.C86835KJp.LIZ
            r0 = 4
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r5, r1, r3, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L56
        L34:
            boolean r0 = super.dispatchKeyEvent(r7)
            if (r0 != 0) goto L56
            return r3
        L3b:
            java.util.ArrayList<com.bytedance.android.live.broadcast.widget.b> r0 = p003X.C86835KJp.LIZIZ
            java.util.Iterator r2 = r0.iterator()
        L41:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.KQm r0 = (p003X.AbstractC87014KQm) r0
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto L41
            if (r1 == 0) goto L34
        L56:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.StartLiveRootView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r1 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() == false) goto L10;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r4 = 1
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r3 = 0
            r2[r3] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcast.widget.StartLiveRootView.LIZ
            r0 = 2
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r6, r1, r3, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1a:
            X.KJp r5 = p003X.C86835KJp.LIZLLL
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r3] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = p003X.C86835KJp.LIZ
            r0 = 5
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r5, r1, r3, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L57
        L35:
            boolean r0 = super.dispatchTouchEvent(r7)
            if (r0 != 0) goto L57
            return r3
        L3c:
            java.util.ArrayList<com.bytedance.android.live.broadcast.widget.c> r0 = p003X.C86835KJp.LIZJ
            java.util.Iterator r2 = r0.iterator()
        L42:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.KQm r0 = (p003X.AbstractC87014KQm) r0
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto L42
            if (r1 == 0) goto L35
        L57:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.StartLiveRootView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
    }

    public /* synthetic */ StartLiveRootView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
