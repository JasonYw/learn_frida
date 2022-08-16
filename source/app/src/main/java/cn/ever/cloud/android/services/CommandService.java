package cn.ever.cloud.android.services;

import cn.ever.cloud.android.p039a.AbstractC0680b;
import cn.ever.cloud.network.api.AbstractC0729a;
import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* loaded from: classes20.dex */
public final class CommandService {
    public final AbstractC0729a apiClient;
    public final AbstractC0680b assetRepository;

    static {
        Covode.recordClassIndex(2992);
    }

    public CommandService(AbstractC0680b abstractC0680b, AbstractC0729a abstractC0729a) {
        C106862S5w.LIZ(abstractC0680b, abstractC0729a);
        this.assetRepository = abstractC0680b;
        this.apiClient = abstractC0729a;
    }
}
