package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.base.model.user.i */
/* loaded from: classes12.dex */
public final class C2855i {
    public IUser.Status LIZ;
    public IUser LIZIZ;

    static {
        Covode.recordClassIndex(14276);
    }

    public final boolean LIZ() {
        if (this.LIZ == IUser.Status.Login) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ() {
        if (this.LIZ == IUser.Status.Logout) {
            return true;
        }
        return false;
    }

    public C2855i(IUser.Status status, IUser iUser) {
        this.LIZ = status;
        this.LIZIZ = iUser;
    }
}
