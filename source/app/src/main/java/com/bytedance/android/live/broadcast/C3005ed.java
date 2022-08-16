package com.bytedance.android.live.broadcast;

import com.bytedance.android.live.broadcast.C3005ed;
import com.bytedance.android.live.broadcast.effect.api.LiveBroadcastEffectApi;
import com.bytedance.android.live.broadcast.model.C3164k;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.network.response.C5171b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p003X.AbstractC86592KAg;
import p003X.C425332sJ;
import p003X.C86648KCk;
import p003X.K8Q;
import p003X.KM9;

/* renamed from: com.bytedance.android.live.broadcast.ed */
/* loaded from: classes5.dex */
public final class C3005ed implements AbstractC86592KAg {
    public static ChangeQuickRedirect LIZ;
    public Disposable LIZIZ;
    public String LIZJ;
    public AbstractC2928aq LIZLLL;

    /* renamed from: LJ */
    public Disposable f25823LJ;
    public CompositeDisposable LJFF = new CompositeDisposable();

    static {
        Covode.recordClassIndex(15729);
    }

    public void LIZ(Disposable disposable) {
        if (!PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 12).isSupported && disposable != null && !disposable.isDisposed()) {
            disposable.dispose();
        }
    }

    public C3005ed() {
        K8Q.LIZ().mo23504LJ().LIZ(this);
    }

    @Override // p003X.AbstractC86592KAg
    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LJFF = new CompositeDisposable();
    }

    @Override // p003X.AbstractC86592KAg
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        LIZ(this.f25823LJ);
        LIZ(this.LIZIZ);
        this.LJFF.dispose();
    }

    @Override // p003X.AbstractC86592KAg
    public final void LIZIZ(long j) {
        if (!PatchProxy.proxy(new Object[]{-1L}, this, LIZ, false, 10).isSupported && !PatchProxy.proxy(new Object[]{new Long(-1L), 3, null}, this, LIZ, false, 6).isSupported) {
            LIZ(2, -1L, 3, null);
        }
    }

    @Override // p003X.AbstractC86592KAg
    public final void LIZ(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        LIZ(j, 1, (Long) null);
    }

    @Override // p003X.AbstractC86592KAg
    public final void LIZ(long j, Long l) {
        if (PatchProxy.proxy(new Object[]{new Long(j), l}, this, LIZ, false, 9).isSupported) {
            return;
        }
        LIZ(j, 2, l);
    }

    @Override // p003X.AbstractC86592KAg
    public final void LIZ(long j, boolean z) {
        String str;
        if (PatchProxy.proxy(new Object[]{new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        if (z) {
            str = this.LIZJ;
        } else {
            str = "";
        }
        LIZ(j, str, z);
    }

    private void LIZ(long j, int i, Long l) {
        if (PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), l}, this, LIZ, false, 5).isSupported) {
            return;
        }
        LIZ(1, j, i, l);
    }

    public final void LIZ(final long j, String str, final boolean z) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        this.f25823LJ = ((LiveBroadcastEffectApi) C425332sJ.LIZIZ.LIZ(LiveBroadcastEffectApi.class)).sendStickerStatus(j, str, z).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer(this, z, j) { // from class: X.KCf
            public static ChangeQuickRedirect LIZ;
            public final C3005ed LIZIZ;
            public final boolean LIZJ;
            public final long LIZLLL;

            static {
                Covode.recordClassIndex(15730);
            }

            {
                this.LIZIZ = this;
                this.LIZJ = z;
                this.LIZLLL = j;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                final C3005ed c3005ed = this.LIZIZ;
                boolean z2 = this.LIZJ;
                final long j2 = this.LIZLLL;
                C5171b c5171b = (C5171b) obj;
                if (PatchProxy.proxy(new Object[]{Byte.valueOf(z2 ? (byte) 1 : (byte) 0), new Long(j2), c5171b}, c3005ed, C3005ed.LIZ, false, 18).isSupported || c5171b == null || c5171b.LIZJ == 0) {
                    return;
                }
                if (!z2) {
                    C3164k c3164k = (C3164k) c5171b.LIZJ;
                    c3005ed.LIZJ = c3164k.LIZ;
                    int i = c3164k.LIZIZ;
                    if (PatchProxy.proxy(new Object[]{new Long(j2), Integer.valueOf(i)}, c3005ed, C3005ed.LIZ, false, 4).isSupported) {
                        return;
                    }
                    int max = Math.max(i, 2);
                    if (c3005ed.LIZIZ != null && !c3005ed.LIZIZ.isDisposed()) {
                        c3005ed.LIZIZ.dispose();
                    }
                    c3005ed.LIZIZ = Observable.timer(max, TimeUnit.SECONDS).compose(C100839PnV.LIZJ()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer(c3005ed, j2) { // from class: X.KCj
                        public static ChangeQuickRedirect LIZ;
                        public final C3005ed LIZIZ;
                        public final long LIZJ;

                        static {
                            Covode.recordClassIndex(15752);
                        }

                        {
                            this.LIZIZ = c3005ed;
                            this.LIZJ = j2;
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj2) {
                            if (PatchProxy.proxy(new Object[]{obj2}, this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            C3005ed c3005ed2 = this.LIZIZ;
                            long j3 = this.LIZJ;
                            if (PatchProxy.proxy(new Object[]{new Long(j3), obj2}, c3005ed2, C3005ed.LIZ, false, 16).isSupported) {
                                return;
                            }
                            c3005ed2.LIZ(j3, c3005ed2.LIZJ, false);
                        }
                    });
                    return;
                }
                c3005ed.LIZ(c3005ed.LIZIZ);
            }
        }, C86648KCk.LIZIZ);
    }

    private void LIZ(final int i, final long j, int i2, Long l) {
        String str;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), new Long(j), Integer.valueOf(i2), l}, this, LIZ, false, 7).isSupported) {
            return;
        }
        if (this.LIZLLL != null) {
            if (l != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("property_duration", l);
                str = GsonProtectorUtils.toJson(KM9.LIZ(), hashMap);
            } else {
                str = "";
            }
            this.LIZLLL.LIZ(i, j, i2, str).subscribe(new Consumer(i, j) { // from class: X.KCg
                public static ChangeQuickRedirect LIZ;
                public final int LIZIZ;
                public final long LIZJ;

                static {
                    Covode.recordClassIndex(15753);
                }

                {
                    this.LIZIZ = i;
                    this.LIZJ = j;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    int i3 = this.LIZIZ;
                    long j2 = this.LIZJ;
                    if (PatchProxy.proxy(new Object[]{Integer.valueOf(i3), new Long(j2), obj}, null, C3005ed.LIZ, true, 15).isSupported) {
                        return;
                    }
                    if (obj != null) {
                        ALogger.m15801d("StickerStatusReportUtil", "reportEvent response success, itemType: " + i3 + "stickerId: " + j2);
                        return;
                    }
                    ALogger.m15800e("StickerStatusReportUtil", "reportEvent response null, itemType: " + i3 + "stickerId: " + j2);
                }
            }, new Consumer(i, j) { // from class: X.KCh
                public static ChangeQuickRedirect LIZ;
                public final int LIZIZ;
                public final long LIZJ;

                static {
                    Covode.recordClassIndex(15754);
                }

                {
                    this.LIZIZ = i;
                    this.LIZJ = j;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    int i3 = this.LIZIZ;
                    long j2 = this.LIZJ;
                    Throwable th = (Throwable) obj;
                    if (PatchProxy.proxy(new Object[]{Integer.valueOf(i3), new Long(j2), th}, null, C3005ed.LIZ, true, 14).isSupported) {
                        return;
                    }
                    ALogger.m15799e("StickerStatusReportUtil", "reportEvent response error, itemType: " + i3 + "stickerId: " + j2, th);
                }
            }, new Action(i, j) { // from class: X.KCi
                public static ChangeQuickRedirect LIZ;
                public final int LIZIZ;
                public final long LIZJ;

                static {
                    Covode.recordClassIndex(15755);
                }

                {
                    this.LIZIZ = i;
                    this.LIZJ = j;
                }

                @Override // io.reactivex.functions.Action
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    int i3 = this.LIZIZ;
                    long j2 = this.LIZJ;
                    if (PatchProxy.proxy(new Object[]{Integer.valueOf(i3), new Long(j2)}, null, C3005ed.LIZ, true, 13).isSupported) {
                        return;
                    }
                    ALogger.m15800e("StickerStatusReportUtil", "reportEvent response onComplete, itemType: " + i3 + "stickerId: " + j2);
                }
            });
            return;
        }
        ALogger.m15800e("StickerStatusReportUtil", "reportEvent: null common service, itemType: " + i + "stickerId: " + j);
    }
}
