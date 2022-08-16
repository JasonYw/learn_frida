package com.bytedance.android.live.liveinteract.plantform.core;

import com.bytedance.android.live.liveinteract.plantform.model.C4809b;
import com.bytedance.android.live.liveinteract.plantform.model.C4810d;
import com.bytedance.android.live.liveinteract.plantform.model.C4811e;
import com.bytedance.android.livesdk.chatroom.interact.model.C6068x;
import com.bytedance.android.livesdk.chatroom.model.interact.C6175o;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import p003X.HPZ;

/* renamed from: com.bytedance.android.live.liveinteract.plantform.core.l */
/* loaded from: classes3.dex */
public interface AbstractC4800l {
    static {
        Covode.recordClassIndex(29297);
    }

    void LIZ(int i, int i2);

    void LIZ(int i, int i2, int i3, String str, Room room);

    void LIZ(int i, int i2, C4810d c4810d);

    void LIZ(int i, long j, long j2, String str, int i2, long j3, C4809b c4809b);

    void LIZ(int i, C6175o c6175o, int i2, long j, int i3, C4811e c4811e);

    void LIZ(int i, C8874fl c8874fl);

    void LIZ(int i, Room room, int i2);

    void LIZ(int i, Room room, C6068x c6068x, int i2, long j, int i3, HPZ hpz);

    void LIZ(int i, Throwable th);

    void LIZ(int i, Throwable th, long j, HPZ hpz);

    void LIZ(int i, Throwable th, long j, C4809b c4809b);

    void LIZ(int i, Throwable th, long j, C4811e c4811e);

    void LIZ(long j, long j2, int i, int i2, String str, Room room, String str2, int i3, String str3, long j3, String str4, int i4);

    void LIZ(long j, long j2, int i, String str, long j3, Room room, String str2);

    void LIZIZ(int i);

    void LIZIZ(int i, C8874fl c8874fl);

    void LIZIZ(int i, Throwable th);

    void LIZJ(int i, C8874fl c8874fl);

    void LIZLLL(int i, C8874fl c8874fl);
}
