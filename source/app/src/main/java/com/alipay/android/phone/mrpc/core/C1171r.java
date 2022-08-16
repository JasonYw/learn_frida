package com.alipay.android.phone.mrpc.core;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.alipay.android.phone.mrpc.core.r */
/* loaded from: classes2.dex */
public final class C1171r {
    static {
        Covode.recordClassIndex(4642);
    }

    /* renamed from: a */
    public static void m19601a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
