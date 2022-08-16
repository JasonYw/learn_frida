package com.bytedance.android.live.broadcast.p274n;

import com.bytedance.android.live.broadcast.api.model.ScheduledSettingInfo;
import com.bytedance.android.live.broadcast.widget.ForenoticeTimeSelectWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.p1116b.AbstractC12277a;
import io.reactivex.disposables.CompositeDisposable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p003X.C2RA;
import p003X.C89397LKd;

/* renamed from: com.bytedance.android.live.broadcast.n.a */
/* loaded from: classes5.dex */
public final class C3166a extends C2RA<AbstractC3167a> {
    public static ChangeQuickRedirect LIZ;
    public String LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public String f25911LJ;
    public String LJFF;
    public String LJII;
    public int LJIIIIZZ;
    public String LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public ScheduledSettingInfo LJIILJJIL;
    public boolean LJIILL;
    public final CompositeDisposable LIZIZ = new CompositeDisposable();
    public final int[] LJI = new int[ForenoticeTimeSelectWidget.LJFF.length];

    /* renamed from: com.bytedance.android.live.broadcast.n.a$a */
    /* loaded from: classes5.dex */
    public interface AbstractC3167a extends AbstractC12277a {
        static {
            Covode.recordClassIndex(17024);
        }

        void LIZ(Throwable th);

        void LIZLLL();

        /* renamed from: LJ */
        void mo15896LJ();

        void LJFF();
    }

    static {
        Covode.recordClassIndex(17023);
    }

    @Override // p003X.C2RA
    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        super.LIZJ();
        this.LIZIZ.clear();
        LIZ();
    }

    public final void LIZ() {
        this.f25911LJ = null;
        this.LJFF = null;
        int length = this.LJI.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            this.LJI[i2] = 0;
            i++;
            i2++;
        }
        this.LIZLLL = false;
        this.LJII = null;
        this.LJIIIIZZ = 0;
        this.LJIIIZ = null;
        this.LJIIJ = false;
        this.LJIIJJI = false;
        this.LJIIL = false;
        this.LJIILIIL = false;
        this.LJIILJJIL = null;
    }

    public final Pair<Integer, Integer> LIZIZ() {
        int i;
        int i2 = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (Pair) proxy.result;
        }
        try {
            String format = new SimpleDateFormat("HHmm", Locale.CHINA).format(new Date());
            Intrinsics.checkNotNullExpressionValue(format, "");
            String substring = format.substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(substring, "");
            int parseInt = Integer.parseInt(substring);
            String substring2 = format.substring(2, 4);
            Intrinsics.checkNotNullExpressionValue(substring2, "");
            int parseInt2 = Integer.parseInt(substring2);
            if (parseInt2 % 10 >= 5) {
                i = (parseInt2 / 10) + 1;
            } else {
                i = parseInt2 / 10;
            }
            if (i >= C89397LKd.LIZ().length) {
                parseInt++;
                i = 0;
            }
            if (parseInt < C89397LKd.LIZIZ().length) {
                i2 = parseInt;
            }
            return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i));
        } catch (Exception unused) {
            return new Pair<>(0, 0);
        }
    }
}
