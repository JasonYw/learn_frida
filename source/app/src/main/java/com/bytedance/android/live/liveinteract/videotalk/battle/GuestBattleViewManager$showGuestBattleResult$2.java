package com.bytedance.android.live.liveinteract.videotalk.battle;

import android.net.Uri;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.C4377t;
import com.bytedance.android.livesdk.chatroom.model.interact.C6166j;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C4313534v;
import p003X.C80302Hl2;
import p003X.C80312HlC;
import p003X.C80318HlI;
import p003X.C80900Hug;

/* loaded from: classes3.dex */
public final class GuestBattleViewManager$showGuestBattleResult$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80318HlI this$0;

    static {
        Covode.recordClassIndex(29866);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuestBattleViewManager$showGuestBattleResult$2(C80318HlI c80318HlI) {
        super(0);
        this.this$0 = c80318HlI;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        Boolean bool;
        C4377t c4377t;
        Uri parse;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && !C80302Hl2.LIZ() && this.this$0.LJIIIZ != null) {
            C6166j.C6167a c6167a = this.this$0.LJIIIZ;
            if (c6167a != null) {
                bool = Boolean.valueOf(c6167a.LJIIJJI);
            } else {
                bool = null;
            }
            Intrinsics.checkNotNull(bool);
            if (bool.booleanValue() && (c4377t = this.this$0.LJIILJJIL) != null) {
                C6166j.C6167a c6167a2 = this.this$0.LJIIIZ;
                Intrinsics.checkNotNull(c6167a2);
                long j = c6167a2.LIZIZ;
                C6166j.C6167a c6167a3 = this.this$0.LJIIIZ;
                Intrinsics.checkNotNull(c6167a3);
                int i = c6167a3.LJIIL;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], C80312HlC.LIZIZ, C80312HlC.LIZ, false, 14);
                if (proxy.isSupported) {
                    parse = (Uri) proxy.result;
                } else {
                    parse = Uri.parse(C4313534v.LIZ("obj/live-android/shenglishike.webp"));
                    Intrinsics.checkNotNullExpressionValue(parse, "");
                }
                c4377t.LIZIZ(new C80900Hug(j, 3, i, parse, null, 16));
            }
        }
        return Unit.INSTANCE;
    }
}
