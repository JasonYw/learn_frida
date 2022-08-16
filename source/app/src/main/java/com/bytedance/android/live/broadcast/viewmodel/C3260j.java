package com.bytedance.android.live.broadcast.viewmodel;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.broadcast.api.BroadcastStarGraphApi;
import com.bytedance.android.live.broadcast.api.model.C2912i;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler;
import com.bytedance.android.livesdkapi.depend.model.live.LiveRoomMode;
import com.bytedance.android.livesdkapi.util.url.UrlBuilder;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C16A;
import p003X.C16B;
import p003X.C387541Wi;
import p003X.C410112Ld;
import p003X.C77949GoB;
import p003X.C77950GoC;
import p003X.C77951GoD;
import p003X.C77952GoE;
import p003X.QB4;

/* renamed from: com.bytedance.android.live.broadcast.viewmodel.j */
/* loaded from: classes3.dex */
public final class C3260j extends ViewModel {
    public static ChangeQuickRedirect LIZ;
    public static final C410112Ld LJIIIZ = new C410112Ld((byte) 0);
    public final MutableLiveData<C2912i> LIZIZ;
    public final MutableLiveData<Throwable> LIZJ;
    public final MutableLiveData<Boolean> LIZLLL;

    /* renamed from: LJ */
    public final MutableLiveData<Boolean> f25958LJ;
    public final MutableLiveData<Boolean> LJFF;
    public final MutableLiveData<String> LJI;
    public final MutableLiveData<String> LJII;
    public final boolean LJIIIIZZ;
    public final Lazy LJIIJ;
    public final BroadcastStarGraphApi LJIIJJI;

    static {
        Covode.recordClassIndex(18163);
    }

    private final CompositeDisposable LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (CompositeDisposable) (proxy.isSupported ? proxy.result : this.LJIIJ.mo27335getValue());
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onCleared();
        LIZ().clear();
    }

    private final Observable<C2912i> LIZIZ(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        Observable<C2912i> map = this.LJIIJJI.getAnchorStarStatusRequest(j, LiveRoomMode.Screenshot.value).compose(C100839PnV.LIZJ()).map(C77952GoE.LIZIZ);
        Intrinsics.checkNotNullExpressionValue(map, "");
        return map;
    }

    public final void LIZ(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        QB4.LIZ(LIZIZ(j).subscribe(new C77949GoB(this), new C77951GoD(this)), LIZ());
    }

    public C3260j(BroadcastStarGraphApi broadcastStarGraphApi, boolean z) {
        C106862S5w.LIZ(broadcastStarGraphApi);
        this.LJIIJJI = broadcastStarGraphApi;
        this.LJIIIIZZ = z;
        this.LJIIJ = LazyKt__LazyJVMKt.lazy(StarGraphViewModel$compositeDisposable$2.INSTANCE);
        this.LIZIZ = new MutableLiveData<>();
        this.LIZJ = new MutableLiveData<>();
        this.LIZLLL = new MutableLiveData<>();
        this.f25958LJ = new MutableLiveData<>();
        this.LJFF = new MutableLiveData<>();
        this.LJI = new MutableLiveData<>();
        this.LJII = new MutableLiveData<>();
    }

    public final void LIZ(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, this, LIZ, false, 10).isSupported) {
            return;
        }
        ALogger.m15797i("StarGraphViewModel", C0002O.m25086C("schema: ", str));
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(new UrlBuilder(str).build());
            ILiveActionHandler iLiveActionHandler = (ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class);
            if (iLiveActionHandler != null) {
                iLiveActionHandler.handle(context, parse);
                return;
            }
            return;
        }
        ALogger.m15800e("StarGraphViewModel", "url is empty");
    }

    public /* synthetic */ C3260j(BroadcastStarGraphApi broadcastStarGraphApi, boolean z, int i) {
        this(broadcastStarGraphApi, false);
    }

    public final void LIZ(long j, int i, List<String> list) {
        int i2;
        if (PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), list}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        BroadcastStarGraphApi broadcastStarGraphApi = this.LJIIJJI;
        C2912i value = this.LIZIZ.getValue();
        if (value != null) {
            i2 = value.LIZIZ;
        } else {
            i2 = 0;
        }
        LIZ().add(broadcastStarGraphApi.setAnchorStarOpenRequest(j, i, i2, list, LiveRoomMode.Screenshot.value).compose(C100839PnV.LIZJ()).subscribe(C387541Wi.LIZ, C16A.LIZIZ));
    }

    public final void LIZ(Context context, long j, boolean z) {
        if (PatchProxy.proxy(new Object[]{context, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(context);
        QB4.LIZ(LIZIZ(j).subscribe(new C77950GoC(this, context, z, j), C16B.LIZIZ), LIZ());
    }
}
