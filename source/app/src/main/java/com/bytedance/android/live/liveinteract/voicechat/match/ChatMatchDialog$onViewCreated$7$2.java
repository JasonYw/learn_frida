package com.bytedance.android.live.liveinteract.voicechat.match;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.H7N;

/* loaded from: classes3.dex */
public final class ChatMatchDialog$onViewCreated$7$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ H7N this$0;

    static {
        Covode.recordClassIndex(31461);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMatchDialog$onViewCreated$7$2(H7N h7n) {
        super(0);
        this.this$0 = h7n;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        C5074d c5074d;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (c5074d = this.this$0.LIZIZ.f6601LJ) != null) {
            Room room = this.this$0.LIZIZ.LIZLLL;
            if (!PatchProxy.proxy(new Object[]{c5074d, room, 0, 2, null}, null, C5074d.LIZ, true, 9).isSupported) {
                c5074d.LIZ(room, 0);
            }
        }
        return Unit.INSTANCE;
    }
}
