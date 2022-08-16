package cn.ever.cloud.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* loaded from: classes23.dex */
public final class CtxUtil {
    public static final CtxUtil INSTANCE = new CtxUtil();
    public static Context sAppContext;

    public final Context appContext() {
        return sAppContext;
    }

    static {
        Covode.recordClassIndex(3421);
    }

    public final void setAppContext(Context context) {
        sAppContext = context;
    }
}
