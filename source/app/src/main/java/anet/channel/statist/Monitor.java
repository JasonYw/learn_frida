package anet.channel.statist;

import com.bytedance.covode.number.Covode;

/* loaded from: classes13.dex */
public @interface Monitor {
    static {
        Covode.recordClassIndex(2270);
    }

    String module();

    String monitorPoint();
}
