package com.bytedance.android.live.linkpk;

import com.bytedance.android.live.base.IService;
import com.bytedance.android.livesdk.log.model.C8656i;
import com.bytedance.covode.number.Covode;

/* loaded from: classes12.dex */
public interface ILinkPkService extends IService {
    static {
        Covode.recordClassIndex(25053);
    }

    C8656i getLinkCrossRoomLog();
}
