package com.bytedance.android.live.core.room.startup;

import com.bytedance.covode.number.Covode;
import p002O.C0002O;
import p003X.AbstractC147779fOX;
import p003X.C106862S5w;
import p003X.C135217c7Q;

/* renamed from: com.bytedance.android.live.core.room.startup.c */
/* loaded from: classes20.dex */
public final class C4088c {
    public boolean LIZ;
    public boolean LIZIZ;
    public AbstractC147779fOX LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final String f26182LJ;
    public final String LJFF;

    static {
        Covode.recordClassIndex(23598);
    }

    public C4088c() {
        this(null, 1);
    }

    public C4088c(String str) {
        C106862S5w.LIZ(str);
        this.LJFF = str;
        this.LIZ = true;
        this.LIZIZ = false;
        this.LIZJ = new C135217c7Q(this.LIZ);
        this.LIZLLL = C0002O.m25086C("ROOM_TASK_LOGGER_RoomTaskManager_", this.LJFF);
        this.f26182LJ = C0002O.m25086C("ROOM_TASK_LOGGER_AbsRoomTask_", this.LJFF);
    }

    public /* synthetic */ C4088c(String str, int i) {
        this("");
    }
}
