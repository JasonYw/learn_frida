package com.bytedance.android.live.liveinteract.digitavatar;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.digitavatar.i */
/* loaded from: classes3.dex */
public final class C4383i {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public AvatarGender LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public String f26308LJ;
    public boolean LJFF;
    public long LJI;

    static {
        Covode.recordClassIndex(26643);
    }

    public C4383i() {
        this(false, null, false, null, false, 0L, 63);
    }

    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        String str = this.f26308LJ;
        if (str == null || str.length() == 0 || !(!Intrinsics.areEqual("{}", this.f26308LJ))) {
            return false;
        }
        return true;
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "defaultAvatar:" + this.LIZIZ + ", gender=" + this.LIZJ + ", audited=" + this.LJFF + " auditOk=" + this.LIZLLL + ",avatarData=" + this.f26308LJ + ", auditId=" + this.LJI;
    }

    public C4383i(boolean z, AvatarGender avatarGender, boolean z2, String str, boolean z3, long j) {
        C106862S5w.LIZ(avatarGender);
        this.LIZIZ = z;
        this.LIZJ = avatarGender;
        this.LIZLLL = z2;
        this.f26308LJ = str;
        this.LJFF = z3;
        this.LJI = j;
    }

    public /* synthetic */ C4383i(boolean z, AvatarGender avatarGender, boolean z2, String str, boolean z3, long j, int i) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? AvatarGender.Male : avatarGender, false, (i & 8) != 0 ? null : str, false, 0L);
    }
}
