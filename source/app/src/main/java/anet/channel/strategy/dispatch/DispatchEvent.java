package anet.channel.strategy.dispatch;

import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public class DispatchEvent {
    public final int eventType;
    public final Object extraObject;

    static {
        Covode.recordClassIndex(2318);
    }

    public DispatchEvent(int i, Object obj) {
        this.eventType = i;
        this.extraObject = obj;
    }
}
