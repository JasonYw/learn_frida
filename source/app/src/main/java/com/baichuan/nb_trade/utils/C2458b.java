package com.baichuan.nb_trade.utils;

import android.text.TextUtils;
import com.baichuan.nb_trade.model.ConfigDO;
import com.bytedance.covode.number.Covode;
import p003X.C75658FsK;
import p003X.V4I;
import p003X.V4K;

/* renamed from: com.baichuan.nb_trade.utils.b */
/* loaded from: classes13.dex */
public final class C2458b {
    public static volatile C2458b LIZ;

    static {
        Covode.recordClassIndex(9489);
    }

    public static synchronized C2458b LIZ() {
        C2458b c2458b;
        synchronized (C2458b.class) {
            if (LIZ == null) {
                LIZ = new C2458b();
            }
            c2458b = LIZ;
        }
        return c2458b;
    }

    public static Object LIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            return C75658FsK.LIZ(V4K.f13706LJ, str);
        }
        return null;
    }

    public static void LIZ(String str, Object obj, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            V4I.LIZ().LIZIZ = (ConfigDO) obj;
            C75658FsK.LIZ(V4K.f13706LJ, obj, str);
        }
    }
}
