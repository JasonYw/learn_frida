package com.bytedance.android.live.liveinteract.voicechat.dialog;

import android.view.View;
import com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e;
import com.bytedance.android.livesdk.message.model.C8854es;
import com.bytedance.android.livesdk.message.model.ReplyType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C78828H5q;
import p003X.C78958HAq;

/* loaded from: classes3.dex */
public final class AudioTalkBeInvitedDialog$onViewCreated$6 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C78958HAq this$0;

    static {
        Covode.recordClassIndex(30972);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioTalkBeInvitedDialog$onViewCreated$6(C78958HAq c78958HAq) {
        super(1);
        this.this$0 = c78958HAq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        C8854es c8854es;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            Room room = this.this$0.f6640LJ;
            if (room != null && (c8854es = this.this$0.LJFF) != null) {
                AbstractC5015e LIZ = AbstractC5015e.LIZIZ.LIZ();
                if (LIZ != null) {
                    long id = room.getId();
                    String str = c8854es.LJJIFFI;
                    if (str == null) {
                        str = "";
                    }
                    LIZ.LIZ(id, str, ReplyType.Reject.ordinal());
                }
                C78828H5q.LIZ("oneself", Boolean.valueOf(this.this$0.LJIIIIZZ), this.this$0.LJIIIZ);
            }
        }
        return Unit.INSTANCE;
    }
}
