package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder;

import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder.C4346o;
import com.bytedance.android.livesdk.chatroom.interact.model.C6057l;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.BattleRivalTag;
import com.bytedance.android.livesdkapi.depend.model.live.C9508f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder.k */
/* loaded from: classes3.dex */
public final class C4324k {
    public static ChangeQuickRedirect LIZ;
    public C6057l LIZIZ;
    public Room LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public int f26275LJ;
    public RivalExtraInfo LJFF;
    public long LJI;
    public List<? extends BattleRivalTag> LJII;
    public C4346o.AbstractC4347a LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public C9508f LJIILIIL;
    public boolean LJIILJJIL;
    public int LJIILL;
    public String LJIIIIZZ = "";
    public String LJIIL = "";
    public boolean LJIILLIIL = true;

    static {
        Covode.recordClassIndex(26052);
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJIIIIZZ = str;
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJIIL = str;
    }
}
