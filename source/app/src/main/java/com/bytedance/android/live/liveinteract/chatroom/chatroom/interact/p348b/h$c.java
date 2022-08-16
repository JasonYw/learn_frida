package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b;

import com.bytedance.android.livesdk.chatroom.interact.model.C6051an;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.BattleRivalTag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.b.h$c */
/* loaded from: classes3.dex */
public abstract class h$c extends b$a<h$d> {
    static {
        Covode.recordClassIndex(25684);
    }

    public abstract void LIZ(int i, boolean z, boolean z2, int i2, String str, int i3);

    public abstract void LIZ(long j, long j2, Room room);

    public abstract void LIZ(C6051an c6051an);

    public abstract void LIZ(Room room, long j, String str, int i, int i2, RivalExtraInfo rivalExtraInfo, int i3, String str2, List<BattleRivalTag> list);

    public abstract void LIZ(boolean z);

    public h$c(h$d h_d) {
        super(h_d);
    }
}
