package com.bytedance.android.live.liveinteract.digitavatar.ktvavatar;

import com.bytedance.android.live.liveinteract.digitavatar.C4382d;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC413402Xu;
import p003X.AbstractC80293Hkt;
import p003X.C2WC;
import p003X.C79242HLo;
import p003X.C87308Kak;

/* loaded from: classes3.dex */
public final class KtvDigitAvatarWidget$onCreate$pair$1 extends Lambda implements Function0<C4382d> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KtvDigitAvatarWidget this$0;

    static {
        Covode.recordClassIndex(26666);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KtvDigitAvatarWidget$onCreate$pair$1(KtvDigitAvatarWidget ktvDigitAvatarWidget) {
        super(0);
        this.this$0 = ktvDigitAvatarWidget;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, com.bytedance.android.live.liveinteract.digitavatar.d] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4382d mo30099invoke() {
        KtvSingMode ktvSingMode;
        Room room;
        C2WC<Room> LIZ;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C4382d c4382d = new C4382d();
        C2WC<KtvSingMode> LIZ2 = c4382d.LIZ();
        C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.f7148dQ;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Integer LIZ3 = c87308Kak.LIZ();
        int i = KtvSingMode.DIGIT_AVATAR.type;
        if (LIZ3 != null && LIZ3.intValue() == i) {
            ktvSingMode = KtvSingMode.DIGIT_AVATAR;
        } else {
            int i2 = KtvSingMode.VIDEO.type;
            if (LIZ3 != null && LIZ3.intValue() == i2) {
                C5923dp LJJJI = this.this$0.LJJJI();
                if (LJJJI != null && (LJIILJJIL = LJJJI.LJIILJJIL()) != null && LJIILJJIL.LIZIZ().booleanValue()) {
                    z = true;
                }
                C5923dp LJJJI2 = this.this$0.LJJJI();
                if (LJJJI2 != null && (LIZ = LJJJI2.LIZ()) != null) {
                    room = LIZ.LIZ();
                } else {
                    room = null;
                }
                if (C79242HLo.LIZ(z, room, 1)) {
                    ktvSingMode = KtvSingMode.VIDEO;
                } else {
                    ktvSingMode = KtvSingMode.AUDIO;
                }
            } else {
                ktvSingMode = KtvSingMode.AUDIO;
            }
        }
        LIZ2.LIZ(ktvSingMode);
        c4382d.LJIILJJIL();
        return c4382d;
    }
}
