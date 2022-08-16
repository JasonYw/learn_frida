package com.bytedance.android.live.liveinteract.chatroom.chatroom.list;

import android.app.Activity;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.b$a;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.livehostapi.business.IHostSocial;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public abstract class g$a extends b$a<g$b> {
    static {
        Covode.recordClassIndex(26220);
    }

    public abstract void LIZ(int i, Activity activity);

    public abstract void LIZ(LinkPlayerInfo linkPlayerInfo);

    public abstract void LIZ(LinkPlayerInfo linkPlayerInfo, int i);

    public abstract void LIZ(List<? extends IHostSocial.InviteFriendsConfig.AbstractC5787a> list, Function2<? super List<? extends IHostSocial.InviteFriendsConfig.AbstractC5787a>, ? super Room, Unit> function2);

    public abstract void LIZ(boolean z);

    public abstract void LIZIZ();

    /* renamed from: LJ */
    public abstract void mo15752LJ();

    public abstract int LJFF();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g$a(g$b g_b) {
        super(g_b);
        C106862S5w.LIZ(g_b);
    }
}
