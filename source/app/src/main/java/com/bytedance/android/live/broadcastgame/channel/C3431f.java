package com.bytedance.android.live.broadcastgame.channel;

import android.os.Looper;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C7HK;
import p003X.KZN;
import p003X.KZO;
import p003X.LK1;

/* renamed from: com.bytedance.android.live.broadcastgame.channel.f */
/* loaded from: classes5.dex */
public final class C3431f {
    public static ChangeQuickRedirect LIZ;
    public Function1<? super Long, Unit> LIZIZ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public Disposable f26041LJ;
    public long LIZJ = System.currentTimeMillis();
    public boolean LJFF = true;
    public long LJI = 1000;

    static {
        Covode.recordClassIndex(19489);
    }

    private final boolean LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LJFF || System.currentTimeMillis() - this.LIZJ >= this.LJI * 2) {
            return false;
        }
        return true;
    }

    private final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        ALogger.m15797i("AAM.ContinuousTimeTicker", C0002O.m25083C("[", this.LIZLLL, "]@{", Integer.valueOf(hashCode()), "} start"));
        this.LJFF = false;
        this.f26041LJ = C7HK.LIZIZ.LIZ(0L, this.LJI, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new KZN(this), new KZO(this));
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            ALogger.m15797i("AAM.ContinuousTimeTicker", "[" + this.LIZLLL + "]@{" + hashCode() + "} stop, isStop: " + this.LJFF);
            this.LJFF = true;
            this.LIZIZ = null;
            Disposable disposable = this.f26041LJ;
            if (disposable != null) {
                disposable.dispose();
                return;
            }
            return;
        }
        ALogger.m15800e("AAM.ContinuousTimeTicker", "[" + this.LIZLLL + "] only invoke by main thread");
        LK1.LIZ(0L, false, false, new ContinuousTimeTicker$stop$1(this), 7, null);
    }

    public C3431f(String str) {
        C106862S5w.LIZ(str);
        this.LIZLLL = str;
    }

    public final void LIZ(long j, Function1<? super Long, Unit> function1) {
        if (PatchProxy.proxy(new Object[]{new Long(j), function1}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(function1);
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            ALogger.m15797i("AAM.ContinuousTimeTicker", "[" + this.LIZLLL + "]@{" + hashCode() + "} continuous with: " + j + " | " + this.LJI);
            if (j == 0) {
                j = 1000;
            }
            if (LIZJ() && j != this.LJI) {
                LIZ();
            }
            this.LJI = j;
            this.LIZIZ = function1;
            if (!LIZJ()) {
                LIZIZ();
                return;
            }
            return;
        }
        ALogger.m15800e("AAM.ContinuousTimeTicker", "[" + this.LIZLLL + "] only invoke by main thread");
        LK1.LIZ(0L, false, false, new ContinuousTimeTicker$changeMessage$1(this, j, function1), 7, null);
    }
}
