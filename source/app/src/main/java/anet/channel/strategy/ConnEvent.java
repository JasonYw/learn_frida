package anet.channel.strategy;

import com.bytedance.covode.number.Covode;

/* loaded from: classes20.dex */
public class ConnEvent {
    public long connTime = Long.MAX_VALUE;
    public boolean isAccs;
    public boolean isSuccess;

    static {
        Covode.recordClassIndex(2290);
    }

    public String toString() {
        if (this.isSuccess) {
            return "ConnEvent#Success";
        }
        return "ConnEvent#Fail";
    }
}
