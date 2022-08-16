package com.bytedance.android.live.liveinteract.videotalk.p388c;

import com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C79072HFa;
import p003X.C79073HFb;
import p003X.C79074HFc;
import p003X.C79076HFe;
import p003X.C79077HFf;
import p003X.C79400HRq;
import p003X.HFZ;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.c.d */
/* loaded from: classes3.dex */
public abstract class AbstractC4912d {
    public static ChangeQuickRedirect LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    /* renamed from: LJ */
    public final int f26441LJ;
    public final String LJFF;
    public final Class<? extends AbstractC4964m> LJI;

    static {
        Covode.recordClassIndex(29997);
    }

    public final boolean LIZ() {
        if (this.LIZIZ == 12) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ() {
        if (this.LIZIZ == 9) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ() {
        C5923dp LIZ2;
        C2WC<Room> LIZ3;
        Room LIZ4;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LIZIZ != 16 || (LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null)) == null || (LIZ3 = LIZ2.LIZ()) == null || (LIZ4 = LIZ3.LIZ()) == null || LIZ4.isLiveTypeAudio()) {
            return false;
        }
        return true;
    }

    public final boolean LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!Intrinsics.areEqual(this, C79073HFb.LJII) && !Intrinsics.areEqual(this, C79076HFe.LJII) && !Intrinsics.areEqual(this, HFZ.LJII)) {
            return false;
        }
        return true;
    }

    /* renamed from: LJ */
    public final boolean m15688LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!Intrinsics.areEqual(this, C79074HFc.LJII) && !Intrinsics.areEqual(this, C79077HFf.LJII)) {
            return false;
        }
        return true;
    }

    public final boolean LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return !Intrinsics.areEqual(this, C79072HFa.LJII);
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return this.LJFF + "(scene=" + this.LIZIZ + ",uiLayout=" + this.LIZJ + ",seiVer=" + this.LIZLLL + LoggerUtil.S_RIGHT_TAG;
    }

    public final boolean LIZ(C79400HRq c79400HRq, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c79400HRq, Integer.valueOf(i)}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(c79400HRq);
        if (this.LIZLLL == c79400HRq.LIZJ) {
            if (this.f26441LJ == c79400HRq.LIZLLL && this.LIZLLL == 12 && (i == 9 || this.LIZJ == 9)) {
                if (i != this.LIZJ) {
                    return false;
                }
                return true;
            } else if (this.f26441LJ == c79400HRq.LIZLLL || this.f26441LJ == -2) {
                return true;
            }
        }
        return false;
    }

    public AbstractC4912d(int i, int i2, int i3, int i4, int i5, String str, Class<? extends AbstractC4964m> cls) {
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.f26441LJ = i4;
        this.LJFF = str;
        this.LJI = cls;
    }

    public /* synthetic */ AbstractC4912d(int i, int i2, int i3, int i4, int i5, String str, Class cls, byte b) {
        this(i, i2, i3, i4, i5, str, cls);
    }

    public /* synthetic */ AbstractC4912d(int i, int i2, int i3, int i4, int i5, String str, Class cls, int i6) {
        this(i, i2, i3, 0, i5, str, cls);
    }
}
