package anet.channel.monitor;

import com.bytedance.covode.number.Covode;

/* loaded from: classes25.dex */
public enum NetworkSpeed {
    Slow("弱网络", 1),
    Fast("强网络", 5);
    

    /* renamed from: a */
    public final String f20538a;

    /* renamed from: b */
    public final int f20539b;

    public final int getCode() {
        return this.f20539b;
    }

    public final String getDesc() {
        return this.f20538a;
    }

    static {
        Covode.recordClassIndex(2224);
    }

    public static NetworkSpeed valueOfCode(int i) {
        if (i == 1) {
            return Slow;
        }
        return Fast;
    }

    NetworkSpeed(String str, int i) {
        this.f20538a = str;
        this.f20539b = i;
    }
}
