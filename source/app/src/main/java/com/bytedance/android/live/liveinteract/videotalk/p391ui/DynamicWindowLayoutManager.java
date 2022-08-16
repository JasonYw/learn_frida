package com.bytedance.android.live.liveinteract.videotalk.p391ui;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.ui.DynamicWindowLayoutManager */
/* loaded from: classes3.dex */
public final class DynamicWindowLayoutManager extends RecyclerView.LayoutManager {
    public static ChangeQuickRedirect LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    static {
        Covode.recordClassIndex(30448);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (RecyclerView.LayoutParams) proxy.result;
        }
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public DynamicWindowLayoutManager(int i, int i2) {
        this.LIZIZ = i;
        this.LIZJ = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0091, code lost:
        continue;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r21, androidx.recyclerview.widget.RecyclerView.State r22) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.p391ui.DynamicWindowLayoutManager.onLayoutChildren(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):void");
    }
}
