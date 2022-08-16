package com.bytedance.android.live.broadcast.api;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.covode.number.Covode;

/* loaded from: classes8.dex */
public interface IXTBroadcastService {
    static {
        Covode.recordClassIndex(14398);
    }

    LiveActivityProxy createXTBroadcastBeforeActivityProxy(FragmentActivity fragmentActivity);

    LiveActivityProxy createXTBroadcastResDownloadActivityProxy(FragmentActivity fragmentActivity);
}
