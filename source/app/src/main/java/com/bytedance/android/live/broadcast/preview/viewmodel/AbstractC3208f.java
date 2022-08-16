package com.bytedance.android.live.broadcast.preview.viewmodel;

import com.bytedance.android.live.broadcast.preview.p277ui.chooseuser.viewbinder.C3195i;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.List;
import p003X.AbstractC77321Ge3;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.preview.viewmodel.f */
/* loaded from: classes3.dex */
public abstract class AbstractC3208f {
    public static ChangeQuickRedirect LIZIZ;
    public long LIZJ;

    /* renamed from: LJ */
    public boolean f25924LJ;
    public Integer LJFF;
    public boolean LIZLLL = true;
    public List<C3195i> LJI = new ArrayList();
    public CompositeDisposable LJII = new CompositeDisposable();

    static {
        Covode.recordClassIndex(17485);
    }

    public abstract void LIZ(int i, AbstractC77321Ge3<C3195i> abstractC77321Ge3, AbstractC77321Ge3<C3195i> abstractC77321Ge32);

    public final void LIZIZ(AbstractC77321Ge3<C3195i> abstractC77321Ge3) {
        if (PatchProxy.proxy(new Object[]{abstractC77321Ge3}, this, LIZIZ, false, 6).isSupported) {
            return;
        }
        if (!this.LIZLLL) {
            if (abstractC77321Ge3 != null) {
                abstractC77321Ge3.LIZ(new ArrayList(), this.LIZLLL);
                return;
            }
            return;
        }
        LIZ(this, 1, null, abstractC77321Ge3, 2, null);
    }

    public final void LIZ(AbstractC77321Ge3<C3195i> abstractC77321Ge3) {
        if (PatchProxy.proxy(new Object[]{abstractC77321Ge3}, this, LIZIZ, false, 5).isSupported) {
            return;
        }
        if (true ^ this.LJI.isEmpty()) {
            if (abstractC77321Ge3 != null) {
                abstractC77321Ge3.LIZ(this.LJI, this.LIZLLL);
            }
        } else if (!this.f25924LJ) {
            LIZ(this, 0, abstractC77321Ge3, null, 4, null);
        } else if (abstractC77321Ge3 != null) {
            abstractC77321Ge3.LIZ(null, this.LIZLLL);
        }
    }

    public final void LIZ(int i, List<C3195i> list) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), list}, this, LIZIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        if (i == 0) {
            this.LJI.clear();
        }
        this.LJI.addAll(list);
    }

    public static /* synthetic */ void LIZ(AbstractC3208f abstractC3208f, int i, AbstractC77321Ge3 abstractC77321Ge3, AbstractC77321Ge3 abstractC77321Ge32, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{abstractC3208f, Integer.valueOf(i), abstractC77321Ge3, abstractC77321Ge32, Integer.valueOf(i2), null}, null, LIZIZ, true, 3).isSupported) {
            return;
        }
        if ((i2 & 2) != 0) {
            abstractC77321Ge3 = null;
        }
        if ((i2 & 4) != 0) {
            abstractC77321Ge32 = null;
        }
        abstractC3208f.LIZ(i, abstractC77321Ge3, abstractC77321Ge32);
    }
}
