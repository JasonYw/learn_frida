package com.android.ttcjpaysdk.base.p130f;

import android.os.CountDownTimer;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC136238cNt;

/* renamed from: com.android.ttcjpaysdk.base.f.a */
/* loaded from: classes17.dex */
public final class CountDownTimerC2127a extends CountDownTimer {
    public static ChangeQuickRedirect LIZ;
    public AbstractC136238cNt LIZIZ;

    static {
        Covode.recordClassIndex(6016);
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        AbstractC136238cNt abstractC136238cNt;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported && (abstractC136238cNt = this.LIZIZ) != null) {
            abstractC136238cNt.LIZ();
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        AbstractC136238cNt abstractC136238cNt;
        if (!PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 1).isSupported && (abstractC136238cNt = this.LIZIZ) != null) {
            abstractC136238cNt.LIZ(j);
        }
    }

    public CountDownTimerC2127a(long j, long j2) {
        super(j, j2);
    }
}
