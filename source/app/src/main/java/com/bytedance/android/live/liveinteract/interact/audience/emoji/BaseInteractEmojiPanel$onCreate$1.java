package com.bytedance.android.live.liveinteract.interact.audience.emoji;

import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C4574547f;
import p003X.C78301Gtr;
import p003X.H1V;
import p003X.H2V;

/* loaded from: classes3.dex */
public final class BaseInteractEmojiPanel$onCreate$1 extends Lambda implements Function1<IUser, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ H1V this$0;

    static {
        Covode.recordClassIndex(27159);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseInteractEmojiPanel$onCreate$1(H1V h1v) {
        super(1);
        this.this$0 = h1v;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(IUser iUser) {
        IUser iUser2 = iUser;
        if (!PatchProxy.proxy(new Object[]{iUser2}, this, changeQuickRedirect, false, 1).isSupported) {
            long j = 0;
            if (iUser2 == null || iUser2.getId() != 0) {
                this.this$0.LJI = User.from(iUser2);
                this.this$0.LJIIJJI.LIZLLL = this.this$0.LJI;
                C78301Gtr c78301Gtr = C78301Gtr.LIZIZ;
                User user = this.this$0.LJI;
                if (user != null) {
                    j = user.getId();
                }
                if (!PatchProxy.proxy(new Object[]{new Long(j)}, c78301Gtr, C78301Gtr.LIZ, false, 26).isSupported) {
                    HashMap<String, String> LIZ = c78301Gtr.LIZ();
                    LIZ.put("user_id", String.valueOf(j));
                    LIZ.put("function_type", "audience");
                    LIZ.put("live_type", "video_live");
                    c78301Gtr.LIZ(LIZ);
                    C4574547f.LIZ().LIZ("livesdk_toaudience_interation_panel_show", LIZ, Room.class);
                }
                H2V h2v = this.this$0.LJIIIIZZ;
                if (h2v != null) {
                    h2v.LIZ(this.this$0.LIZIZ());
                }
            }
        }
        return Unit.INSTANCE;
    }
}
