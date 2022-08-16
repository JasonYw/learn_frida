package anet.channel.entity;

import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public enum ENV {
    ONLINE(0),
    PREPARE(1),
    TEST(2);
    
    public int envMode;

    public final int getEnvMode() {
        return this.envMode;
    }

    static {
        Covode.recordClassIndex(2198);
    }

    public final void setEnvMode(int i) {
        this.envMode = i;
    }

    public static ENV valueOf(int i) {
        if (i != 1) {
            if (i != 2) {
                return ONLINE;
            }
            return TEST;
        }
        return PREPARE;
    }

    ENV(int i) {
        this.envMode = i;
    }
}
