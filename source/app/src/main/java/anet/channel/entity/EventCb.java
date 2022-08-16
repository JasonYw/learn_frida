package anet.channel.entity;

import anet.channel.Session;
import com.bytedance.covode.number.Covode;

/* loaded from: classes20.dex */
public interface EventCb {
    static {
        Covode.recordClassIndex(2199);
    }

    void onEvent(Session session, int i, C0503b c0503b);
}
