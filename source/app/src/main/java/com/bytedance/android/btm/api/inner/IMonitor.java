package com.bytedance.android.btm.api.inner;

import com.bytedance.covode.number.Covode;
import kotlin.jvm.functions.Function0;

/* loaded from: classes18.dex */
public interface IMonitor {
    static {
        Covode.recordClassIndex(11313);
    }

    void check(boolean z, Function0<? extends Object> function0);
}
