package com.bytedance.android.live.liveinteract.voicechat.emoji;

import android.graphics.PointF;
import com.bytedance.covode.number.Covode;

/* loaded from: classes3.dex */
public final class EPointF extends PointF {
    public int LIZ;

    static {
        Covode.recordClassIndex(31120);
    }

    public EPointF() {
    }

    public final boolean LIZ() {
        if (this.LIZ == 2) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ() {
        if (this.LIZ == 3) {
            return true;
        }
        return false;
    }

    public EPointF(float f, float f2) {
        super(f, f2);
    }

    public EPointF(float f, float f2, int i) {
        super(f, f2);
        this.LIZ = i;
    }
}
