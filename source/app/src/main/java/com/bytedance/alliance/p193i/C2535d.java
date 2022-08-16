package com.bytedance.alliance.p193i;

import android.content.Context;
import android.os.Message;
import com.bytedance.alliance.bean.C2528b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import p002O.C0002O;
import p003X.G1U;
import p003X.GKY;
import p003X.GM4;

/* renamed from: com.bytedance.alliance.i.d */
/* loaded from: classes2.dex */
public final class C2535d extends GKY {
    public static ChangeQuickRedirect LIZLLL;

    /* renamed from: LJ */
    public GM4 f25597LJ;
    public C2528b LJFF;

    static {
        Covode.recordClassIndex(9999);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZLLL, false, 1).isSupported) {
            return;
        }
        try {
            this.LIZJ.removeMessages(1);
            long currentTimeMillis = System.currentTimeMillis();
            if (this.LJFF.LJI > currentTimeMillis) {
                this.LJFF.LJI = currentTimeMillis - TimeUnit.SECONDS.toMillis(this.LJFF.LJFF);
                if (this.f25597LJ != null) {
                    this.f25597LJ.LIZ(this.LJFF);
                }
            }
            long millis = this.LJFF.LJI + TimeUnit.SECONDS.toMillis(this.LJFF.LJFF);
            if (currentTimeMillis <= millis) {
                long j = millis - currentTimeMillis;
                G1U.LIZ("BDAlliance", C0002O.m25084C("RadicalStrategy ", this.LJFF.f25593LJ, " next wakeup time = ", DateFormat.getDateTimeInstance().format(new Date(currentTimeMillis + j))));
                this.LIZJ.sendEmptyMessageDelayed(1, j);
                return;
            }
            this.LIZJ.sendEmptyMessage(1);
        } catch (Throwable unused) {
        }
    }

    @Override // p003X.GKY
    public final void LIZ(Message message) {
        if (!PatchProxy.proxy(new Object[]{message}, this, LIZLLL, false, 3).isSupported && message != null && message.what == 1) {
            LIZ(this.LJFF, 1);
            this.LJFF.LJI = System.currentTimeMillis();
            if (!PatchProxy.proxy(new Object[0], this, LIZLLL, false, 2).isSupported) {
                try {
                    this.LIZJ.removeMessages(1);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (this.LJFF.LJI > currentTimeMillis) {
                        this.LJFF.LJI = currentTimeMillis - TimeUnit.SECONDS.toMillis(this.LJFF.LJFF);
                        if (this.f25597LJ != null) {
                            this.f25597LJ.LIZ(this.LJFF);
                        }
                    }
                    long millis = TimeUnit.SECONDS.toMillis(this.LJFF.LJFF);
                    G1U.LIZ("BDAlliance", C0002O.m25084C("RadicalStrategy ", this.LJFF.f25593LJ, " next wakeup time = ", DateFormat.getDateTimeInstance().format(new Date(currentTimeMillis + millis))));
                    this.LIZJ.sendEmptyMessageDelayed(1, millis);
                } catch (Throwable unused) {
                }
            }
            GM4 gm4 = this.f25597LJ;
            if (gm4 != null) {
                gm4.LIZ(this.LJFF);
            }
        }
    }

    public C2535d(Context context, String str, C2528b c2528b, String str2, String str3, GM4 gm4) {
        super(context, str, str2, str3);
        this.LJFF = c2528b;
        this.f25597LJ = gm4;
    }
}
