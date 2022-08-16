package com.bytedance.android.live.network;

import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC141103deW;

/* renamed from: com.bytedance.android.live.network.MonitorTimeCostCallAdapterFactory$get$$inlined$filterIsInstance$1 */
/* loaded from: classes22.dex */
public final class C5166xf043963c extends Lambda implements Function1<Object, Boolean> {
    public static final C5166xf043963c INSTANCE;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(32606);
        INSTANCE = new C5166xf043963c();
    }

    public C5166xf043963c() {
        super(1);
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(32606);
        INSTANCE = new C5166xf043963c();
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(Object obj) {
        return Boolean.valueOf(obj instanceof AbstractC141103deW);
    }
}
