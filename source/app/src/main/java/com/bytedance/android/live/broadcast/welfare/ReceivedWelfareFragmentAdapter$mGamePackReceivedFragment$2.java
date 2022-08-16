package com.bytedance.android.live.broadcast.welfare;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C89368LJa;
import p003X.LJZ;

/* loaded from: classes5.dex */
public final class ReceivedWelfareFragmentAdapter$mGamePackReceivedFragment$2 extends Lambda implements Function0<Fragment> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Context $mContext;

    static {
        Covode.recordClassIndex(18174);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceivedWelfareFragmentAdapter$mGamePackReceivedFragment$2(Context context) {
        super(0);
        this.$mContext = context;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [androidx.fragment.app.Fragment, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Fragment mo30099invoke() {
        Room room;
        boolean z;
        Long l;
        C2WC<Boolean> LIZJ;
        Boolean LIZ;
        C2WC<Room> LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (this.$mContext != null) {
            C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            Long l2 = null;
            if (LIZ3 != null && (LIZ2 = LIZ3.LIZ()) != null) {
                room = LIZ2.LIZ();
            } else {
                room = null;
            }
            C5923dp LIZ4 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            if (LIZ4 != null && (LIZJ = LIZ4.LIZJ()) != null && (LIZ = LIZJ.LIZ()) != null) {
                z = LIZ.booleanValue();
            } else {
                z = true;
            }
            LJZ ljz = C89368LJa.LJII;
            Context context = this.$mContext;
            if (room != null) {
                l = Long.valueOf(room.getId());
            } else {
                l = null;
            }
            String valueOf = String.valueOf(l);
            if (room != null) {
                l2 = Long.valueOf(room.ownerUserId);
            }
            byte b = z ? (byte) 1 : (byte) 0;
            byte b2 = z ? (byte) 1 : (byte) 0;
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{context, valueOf, l2, Byte.valueOf(b)}, ljz, LJZ.LIZ, false, 1);
            if (proxy2.isSupported) {
                return (C89368LJa) proxy2.result;
            }
            C106862S5w.LIZ(context);
            C89368LJa c89368LJa = new C89368LJa();
            c89368LJa.LIZIZ = context;
            c89368LJa.LIZJ = valueOf;
            c89368LJa.LIZLLL = l2;
            c89368LJa.f8856LJ = z;
            return c89368LJa;
        }
        return new Fragment();
    }
}
