package anet.channel.monitor;

import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public interface INetworkQualityChangeListener {
    static {
        Covode.recordClassIndex(2223);
    }

    void onNetworkQualityChanged(NetworkSpeed networkSpeed);
}
