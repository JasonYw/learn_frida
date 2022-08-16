package com.bytedance.android.live.permissioncheck.p406b;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import p003X.AnonymousClass425;

/* renamed from: com.bytedance.android.live.permissioncheck.b.a */
/* loaded from: classes5.dex */
public abstract class AbstractC5183a {
    public boolean LIZ;

    static {
        Covode.recordClassIndex(32803);
    }

    public abstract void LIZ(Context context);

    public AbstractC5183a() {
        Application LIZ = AnonymousClass425.LIZ();
        if (LIZ != null) {
            LIZ(LIZ);
        }
    }
}
