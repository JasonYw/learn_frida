package anet.channel;

import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* loaded from: classes10.dex */
public interface ISessionListener {
    static {
        Covode.recordClassIndex(2134);
    }

    void onConnectionChanged(Intent intent);
}
