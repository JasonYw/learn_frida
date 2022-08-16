package com.bytedance.android.live.broadcastgame.api.p286d;

import com.bytedance.android.live.broadcastgame.api.model.C3380j;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6508ci;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ExtendedToolbarButton;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C3E3;
import p003X.C413202Xa;
import p003X.C415302c8;

/* renamed from: com.bytedance.android.live.broadcastgame.api.d.o */
/* loaded from: classes12.dex */
public final class C3355o extends ExtendedToolbarButton.C6484c {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZJ;

    /* renamed from: LJ */
    public String f26015LJ;
    public C3380j LJFF;
    public boolean LIZIZ = true;
    public int LIZLLL = 1;

    static {
        Covode.recordClassIndex(19083);
    }

    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        C415302c8 LIZIZ = C413202Xa.LIZIZ();
        if (!(LIZIZ instanceof C6508ci)) {
            LIZIZ = null;
        }
        if (LIZIZ == null) {
            return false;
        }
        return LIZIZ.LIZLLL(this);
    }

    public final boolean LIZ() {
        AbstractC6524y.AbstractView$OnClickListenerC6525b LJFF;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        if (this.LJJI) {
            if (C3E3.LIZ(this.LJJ)) {
                return false;
            }
            return true;
        }
        C415302c8 LIZIZ = C413202Xa.LIZIZ();
        if (!(LIZIZ instanceof C6508ci)) {
            LIZIZ = null;
        }
        if (LIZIZ == null || (LJFF = LIZIZ.LJFF(this)) == null || !LJFF.aK_()) {
            return false;
        }
        return true;
    }

    public final String LIZ(boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String str = this.LJJ;
        if (z && str.length() >= 5) {
            new StringBuilder();
            String substring = str.substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(substring, "");
            return C0002O.m25086C(substring, "...");
        }
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3355o(List<String> list, String str, boolean z, String str2, String str3, C3380j c3380j) {
        super(list, str, z, str2);
        C106862S5w.LIZ(list, str, str2, str3, c3380j);
        this.f26015LJ = str3;
        this.LJFF = c3380j;
        this.LJIILLIIL = 2130857594;
    }
}
