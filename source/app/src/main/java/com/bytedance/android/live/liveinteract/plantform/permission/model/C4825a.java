package com.bytedance.android.live.liveinteract.plantform.permission.model;

import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.plantform.permission.model.a */
/* loaded from: classes3.dex */
public final class C4825a {
    public final Context LIZ;
    public final int LIZIZ;
    public final OperateType LIZJ;
    public final int LIZLLL;

    /* renamed from: LJ */
    public final Room f26428LJ;
    public long LJFF;
    public String LJI;

    static {
        Covode.recordClassIndex(29494);
    }

    public C4825a(Context context, int i, OperateType operateType, int i2, Room room) {
        this(context, 8, operateType, i2, room, 0L, null, null, 224);
    }

    public C4825a(Context context, int i, OperateType operateType, int i2, Room room, long j, String str, String str2) {
        C106862S5w.LIZ(context, operateType, room);
        this.LIZ = context;
        this.LIZIZ = i;
        this.LIZJ = operateType;
        this.LIZLLL = i2;
        this.f26428LJ = room;
        this.LJFF = j;
        this.LJI = str;
    }

    public /* synthetic */ C4825a(Context context, int i, OperateType operateType, int i2, Room room, long j, String str, String str2, int i3) {
        this(context, i, operateType, i2, room, (i3 & 32) != 0 ? 0L : j, null, null);
    }
}
