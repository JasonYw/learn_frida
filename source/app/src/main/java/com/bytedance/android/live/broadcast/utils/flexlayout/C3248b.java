package com.bytedance.android.live.broadcast.utils.flexlayout;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.utils.flexlayout.b */
/* loaded from: classes19.dex */
public final class C3248b {
    public static ChangeQuickRedirect LIZ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILL;
    public int LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public int LIZIZ = Integer.MAX_VALUE;
    public int LIZJ = Integer.MAX_VALUE;
    public int LIZLLL = Integer.MIN_VALUE;

    /* renamed from: LJ */
    public int f25950LJ = Integer.MIN_VALUE;
    public List<Integer> LJIILJJIL = new ArrayList();

    static {
        Covode.recordClassIndex(18028);
    }

    public final int LIZ() {
        return this.LJIIIIZZ - this.LJIIIZ;
    }

    public final void LIZ(View view, int i, int i2, int i3, int i4) {
        if (PatchProxy.proxy(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.LIZIZ = Math.min(this.LIZIZ, (view.getLeft() - flexItem.LJIIL()) - i);
        this.LIZJ = Math.min(this.LIZJ, (view.getTop() - flexItem.LJIILIIL()) - i2);
        this.LIZLLL = Math.max(this.LIZLLL, view.getRight() + flexItem.LJIILJJIL() + i3);
        this.f25950LJ = Math.max(this.f25950LJ, view.getBottom() + flexItem.LJIILL() + i4);
    }
}
