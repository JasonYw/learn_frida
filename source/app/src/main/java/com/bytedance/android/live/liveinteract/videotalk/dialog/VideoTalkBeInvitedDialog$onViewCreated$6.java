package com.bytedance.android.live.liveinteract.videotalk.dialog;

import android.view.View;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah;
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
import p003X.C78964HAw;

/* loaded from: classes3.dex */
public final class VideoTalkBeInvitedDialog$onViewCreated$6 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C78964HAw this$0;

    static {
        Covode.recordClassIndex(30020);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTalkBeInvitedDialog$onViewCreated$6(C78964HAw c78964HAw) {
        super(1);
        this.this$0 = c78964HAw;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        C8854es c8854es;
        String str;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            Room room = this.this$0.f6641LJ;
            if (room != null && (c8854es = this.this$0.LJFF) != null && (str = c8854es.LJJIFFI) != null) {
                AbstractC4767ah LIZ = AbstractC4767ah.LIZIZ.LIZ();
                if (LIZ != null) {
                    LIZ.LIZ(room.getId(), str, ReplyType.Reject.ordinal(), 2);
                }
                C78828H5q.LIZ("oneself", (Boolean) null, this.this$0.LJII, 2, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }
}
