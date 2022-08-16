package com.bytedance.android.live.p238ai.api;

import com.bytedance.covode.number.Covode;
import p003X.PZI;

/* renamed from: com.bytedance.android.live.ai.api.d */
/* loaded from: classes8.dex */
public class C2790d {
    public static final PZI LIZJ = new PZI((byte) 0);
    public final boolean LIZ;
    public final boolean LIZIZ;

    static {
        Covode.recordClassIndex(13833);
    }

    public C2790d() {
        this(false, false, null, 0, null, 31);
    }

    public C2790d(boolean z, boolean z2, String str, int i, String str2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }

    public /* synthetic */ C2790d(boolean z, boolean z2, String str, int i, String str2, int i2) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) == 0 ? z2 : false, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? -9999 : i, (i2 & 16) != 0 ? "infer failed" : str2);
    }
}
