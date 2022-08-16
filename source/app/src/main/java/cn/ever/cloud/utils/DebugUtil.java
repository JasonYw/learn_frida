package cn.ever.cloud.utils;

import com.bytedance.covode.number.Covode;

/* loaded from: classes23.dex */
public final class DebugUtil {
    public static final DebugUtil INSTANCE = new DebugUtil();

    public final boolean debug() {
        return false;
    }

    static {
        Covode.recordClassIndex(3422);
    }
}
