package android.p006ss.com.vboost;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* renamed from: android.ss.com.vboost.CustomRequest */
/* loaded from: classes19.dex */
public class CustomRequest {
    public Bundle bundle;
    public int cluster;
    public int level;
    public int priority;
    public boolean restore;
    public CustomScene scene;
    public int tid;
    public long timeout;
    public int type;

    static {
        Covode.recordClassIndex(30);
    }

    public CustomRequest() {
    }

    public CustomRequest(CapabilityType capabilityType, CustomScene customScene) {
        this.type = capabilityType.getIndex();
        this.scene = customScene;
    }

    public CustomRequest(CapabilityType capabilityType, FrequencyLevel frequencyLevel, long j) {
        this.type = capabilityType.getIndex();
        this.level = frequencyLevel.ordinal();
        this.timeout = j;
    }
}
