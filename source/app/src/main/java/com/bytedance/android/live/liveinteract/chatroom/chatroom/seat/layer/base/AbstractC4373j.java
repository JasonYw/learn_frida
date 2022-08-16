package com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.livesdkapi.depend.model.live.audio.VoiceLiveTheme;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.j */
/* loaded from: classes3.dex */
public interface AbstractC4373j {
    static {
        Covode.recordClassIndex(26325);
    }

    void LIZ(Context context);

    void LIZ(VoiceLiveTheme voiceLiveTheme);

    void LIZ(List<LinkPlayerInfo> list, int i);

    void LIZ(List<LinkPlayerInfo> list, int i, Bundle bundle);

    void LIZIZ(Context context);

    void LJFF();

    View LJI();
}
