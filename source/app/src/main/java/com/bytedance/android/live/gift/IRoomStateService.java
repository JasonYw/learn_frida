package com.bytedance.android.live.gift;

import android.content.Context;
import com.bytedance.android.live.base.IService;
import com.bytedance.covode.number.Covode;

/* loaded from: classes5.dex */
public interface IRoomStateService extends IService {
    static {
        Covode.recordClassIndex(24956);
    }

    void onEnterRoom(Context context);

    void onExitRoom();

    void registRoomStateListner(AbstractC4243j abstractC4243j);

    void unregistRoomStateListner(AbstractC4243j abstractC4243j);
}
