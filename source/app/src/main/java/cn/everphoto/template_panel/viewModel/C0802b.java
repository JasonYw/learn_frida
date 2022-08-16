package cn.everphoto.template_panel.viewModel;

import android.view.SurfaceView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import cn.everphoto.template_panel.model.C0791d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC83316IsY;
import p003X.AbstractC83327Isj;
import p003X.C106862S5w;
import p003X.C83350It6;
import p003X.C84S;

/* renamed from: cn.everphoto.template_panel.viewModel.b */
/* loaded from: classes24.dex */
public final class C0802b extends ViewModel {
    public static ChangeQuickRedirect LIZ;
    public C84S LIZIZ;
    public C83350It6 LIZJ;
    public AbstractC83327Isj LIZLLL;

    /* renamed from: LJ */
    public AbstractC83316IsY f21078LJ;
    public SurfaceView LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final MutableLiveData<Pair<Boolean, Long>> LJIIIZ = new MutableLiveData<>();
    public final LiveData<Pair<Boolean, Long>> LJIIJ = this.LJIIIZ;
    public final MutableLiveData<Boolean> LJIIJJI = new MutableLiveData<>();
    public final LiveData<Boolean> LJIIL = this.LJIIJJI;
    public final MutableLiveData<Pair<Boolean, Boolean>> LJIL = new MutableLiveData<>();
    public final LiveData<Pair<Boolean, Boolean>> LJIILIIL = this.LJIL;
    public final MutableLiveData<Boolean> LJJ = new MutableLiveData<>();
    public final LiveData<Boolean> LJIILJJIL = this.LJJ;
    public final MutableLiveData<Pair<Boolean, Long>> LJJI = new MutableLiveData<>();
    public final LiveData<Pair<Boolean, Long>> LJIILL = this.LJJI;
    public final MutableLiveData<Boolean> LJIILLIIL = new MutableLiveData<>();
    public final LiveData<Boolean> LJIIZILJ = this.LJIILLIIL;
    public final MutableLiveData<Long> LJIJ = new MutableLiveData<>();
    public final LiveData<Long> LJIJI = this.LJIJ;
    public final MutableLiveData<C0791d> LJJIFFI = new MutableLiveData<>();
    public final LiveData<C0791d> LJIJJ = this.LJJIFFI;
    public final MutableLiveData<Boolean> LJJII = new MutableLiveData<>();
    public final LiveData<Boolean> LJIJJLI = this.LJJII;

    static {
        Covode.recordClassIndex(3851);
    }

    public final void LIZ(boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 10).isSupported) {
            return;
        }
        this.LJIL.setValue(TuplesKt.m137to(Boolean.valueOf(z), Boolean.valueOf(z2)));
    }

    public final C84S LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C84S) proxy.result;
        }
        C84S c84s = this.LIZIZ;
        if (c84s == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c84s;
    }

    public final C83350It6 LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (C83350It6) proxy.result;
        }
        C83350It6 c83350It6 = this.LIZJ;
        if (c83350It6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c83350It6;
    }

    public final AbstractC83327Isj LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (AbstractC83327Isj) proxy.result;
        }
        AbstractC83327Isj abstractC83327Isj = this.LIZLLL;
        if (abstractC83327Isj == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC83327Isj;
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        this.LJJ.setValue(Boolean.TRUE);
    }

    /* renamed from: LJ */
    public final void m20548LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            return;
        }
        this.LJJII.setValue(Boolean.TRUE);
    }

    public final void LIZ(C84S c84s) {
        if (PatchProxy.proxy(new Object[]{c84s}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(c84s);
        this.LIZIZ = c84s;
    }

    public final void LIZ(C83350It6 c83350It6) {
        if (PatchProxy.proxy(new Object[]{c83350It6}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(c83350It6);
        this.LIZJ = c83350It6;
    }

    public final void LIZ(C0791d c0791d) {
        if (PatchProxy.proxy(new Object[]{c0791d}, this, LIZ, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(c0791d);
        this.LJJIFFI.setValue(c0791d);
    }

    public final void LIZ(boolean z, long j) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)}, this, LIZ, false, 13).isSupported) {
            return;
        }
        this.LJJI.setValue(new Pair<>(Boolean.valueOf(z), Long.valueOf(j)));
    }

    public static /* synthetic */ void LIZ(C0802b c0802b, boolean z, long j, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{c0802b, (byte) 1, 0L, 2, null}, null, LIZ, true, 14).isSupported) {
            return;
        }
        c0802b.LIZ(true, 300L);
    }

    public static /* synthetic */ void LIZ(C0802b c0802b, boolean z, boolean z2, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{c0802b, Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 0, 2, null}, null, LIZ, true, 11).isSupported) {
            return;
        }
        c0802b.LIZ(z, false);
    }
}
