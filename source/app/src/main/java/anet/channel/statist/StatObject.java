package anet.channel.statist;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes13.dex */
public abstract class StatObject implements Serializable {
    static {
        Covode.recordClassIndex(2280);
    }

    public boolean beforeCommit() {
        return true;
    }
}
