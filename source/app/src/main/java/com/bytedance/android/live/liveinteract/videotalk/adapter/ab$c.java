package com.bytedance.android.live.liveinteract.videotalk.adapter;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.livesdk.message.model.C8851ep;
import com.bytedance.covode.number.Covode;

/* loaded from: classes3.dex */
public interface ab$c {
    static {
        Covode.recordClassIndex(29676);
    }

    void LIZ(int i, LinkPlayerInfo linkPlayerInfo);

    void LIZ(int i, boolean z);

    void LIZ(User user, boolean z);

    void LIZ(LinkPlayerInfo linkPlayerInfo);

    void LIZ(C8851ep c8851ep);

    void LIZ(String str, boolean z);

    void LIZIZ(LinkPlayerInfo linkPlayerInfo);
}
