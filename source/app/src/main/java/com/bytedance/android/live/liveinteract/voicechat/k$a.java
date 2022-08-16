package com.bytedance.android.live.liveinteract.voicechat;

import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw;
import com.bytedance.android.livesdk.message.model.LinkMicGuideMessage;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes3.dex */
public interface k$a extends AbstractC6416aw {
    static {
        Covode.recordClassIndex(31413);
    }

    void LIZ(long j, Throwable th);

    void LIZ(List<AnchorLinkUser> list, long j, String str);

    boolean LIZ(int i, LinkMicGuideMessage.C8701a c8701a);

    void LIZIZ(long j, Throwable th);

    void LIZJ(long j, String str);

    void LIZLLL(String str);

    void LJIL();

    void LJJ();
}
