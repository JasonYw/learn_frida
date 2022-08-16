package com.bytedance.android.live.core.tetris.layer.core.descriptor;

import com.bytedance.covode.number.Covode;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import p003X.C106862S5w;
import p003X.C2QY;

/* renamed from: com.bytedance.android.live.core.tetris.layer.core.descriptor.c */
/* loaded from: classes12.dex */
public class C4100c {
    public final String LIZ;
    public static final C2QY LIZLLL = new C2QY((byte) 0);
    public static final C4100c LIZIZ = new C4100c(LoggerUtil.UNKNOWN);
    public static final C4100c LIZJ = new C4100c("parent");

    public String toString() {
        return this.LIZ;
    }

    static {
        Covode.recordClassIndex(23660);
    }

    public C4100c(String str) {
        C106862S5w.LIZ(str);
        this.LIZ = str;
    }
}
