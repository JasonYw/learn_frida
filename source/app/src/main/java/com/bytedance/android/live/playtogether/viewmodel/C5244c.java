package com.bytedance.android.live.playtogether.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.message.model.C8913hd;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.playtogether.viewmodel.c */
/* loaded from: classes.dex */
public final class C5244c extends ViewModel {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(PlayTeamMemberViewModel$member$2.INSTANCE);
    public final Lazy LIZJ = LazyKt__LazyJVMKt.lazy(PlayTeamMemberViewModel$status$2.INSTANCE);
    public final Lazy LIZLLL = LazyKt__LazyJVMKt.lazy(PlayTeamMemberViewModel$interval$2.INSTANCE);

    /* renamed from: LJ */
    public final Lazy f26551LJ = LazyKt__LazyJVMKt.lazy(PlayTeamMemberViewModel$intervalFinish$2.INSTANCE);
    public final Lazy LJFF = LazyKt__LazyJVMKt.lazy(PlayTeamMemberViewModel$limitInvited$2.INSTANCE);

    static {
        Covode.recordClassIndex(33199);
    }

    public final MutableLiveData<C8913hd> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (MutableLiveData) (proxy.isSupported ? proxy.result : this.LIZIZ.mo27335getValue());
    }

    public final MutableLiveData<Integer> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (MutableLiveData) (proxy.isSupported ? proxy.result : this.LIZJ.mo27335getValue());
    }

    public final MutableLiveData<Long> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (MutableLiveData) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    public final MutableLiveData<Boolean> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (MutableLiveData) (proxy.isSupported ? proxy.result : this.f26551LJ.mo27335getValue());
    }

    /* renamed from: LJ */
    public final MutableLiveData<Boolean> m15620LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (MutableLiveData) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    public final void LIZ(C8913hd c8913hd) {
        if (PatchProxy.proxy(new Object[]{c8913hd}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8913hd);
        LIZ().setValue(c8913hd);
        LIZIZ().setValue(Integer.valueOf(c8913hd.LIZIZ));
    }
}
