package com.bytedance.android.live.liveinteract.voicechat.match;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.chatroom.model.C6192s;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import p003X.C100839PnV;
import p003X.C18H;
import p003X.C536537Hj;
import p003X.H7X;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.match.g */
/* loaded from: classes3.dex */
public final class C5075g {
    public static ChangeQuickRedirect LIZ;
    public final MutableLiveData<Boolean> LIZLLL;

    /* renamed from: LJ */
    public final MutableLiveData<Integer> f26494LJ;
    public MutableLiveData<Boolean> LJFF;
    public final MutableLiveData<Boolean> LJI;
    public long LJIIIIZZ;
    public Disposable LJIIIZ;
    public Disposable LJIIJJI;
    public final String LIZIZ = "CityMatchViewModel";
    public final MutableLiveData<C6192s> LIZJ = new MutableLiveData<>();
    public boolean LJII = true;
    public final long LJIIJ = 3;

    static {
        Covode.recordClassIndex(31587);
    }

    private void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        this.LIZJ.setValue(null);
        this.LIZLLL.setValue(Boolean.FALSE);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        this.LIZLLL.setValue(Boolean.FALSE);
        Disposable disposable = this.LJIIJJI;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.LJIIIZ;
        if (disposable2 != null) {
            disposable2.dispose();
        }
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        Disposable disposable = this.LJIIJJI;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.LJIIIZ;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        LIZJ();
    }

    public C5075g() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(Boolean.FALSE);
        this.LIZLLL = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(0);
        this.f26494LJ = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        mutableLiveData3.setValue(Boolean.FALSE);
        this.LJFF = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>();
        mutableLiveData4.setValue(Boolean.FALSE);
        this.LJI = mutableLiveData4;
    }

    public final void LIZ(boolean z, int i, int i2, int i3) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LJI.setValue(Boolean.valueOf(z));
        this.f26494LJ.setValue(Integer.valueOf(i));
        this.LIZLLL.setValue(Boolean.TRUE);
        Disposable disposable = this.LJIIJJI;
        if (disposable != null) {
            disposable.dispose();
        }
        this.LJII = true;
        this.LJIIIIZZ = System.currentTimeMillis();
        this.LJIIJJI = C536537Hj.LIZ(1L, this.LJIIJ, TimeUnit.SECONDS).compose(C100839PnV.LIZJ()).subscribe(new H7X(this, i, z, i2, i3), C18H.LIZ);
    }
}
