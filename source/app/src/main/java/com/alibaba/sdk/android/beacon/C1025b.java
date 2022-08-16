package com.alibaba.sdk.android.beacon;

import com.alibaba.sdk.android.beacon.Beacon;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.alibaba.sdk.android.beacon.b */
/* loaded from: classes19.dex */
public final class C1025b {

    /* renamed from: a */
    public final List<Beacon.Config> f21519a = new ArrayList();

    static {
        Covode.recordClassIndex(4426);
    }

    public C1025b(Beacon beacon) {
    }

    /* renamed from: a */
    public final List<Beacon.Config> m19995a() {
        return Collections.unmodifiableList(this.f21519a);
    }
}
