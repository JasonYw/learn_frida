package com.bytedance.android.live.liveinteract.chatroom.chatroom.list;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.b$b;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.model.C4366b;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.model.PlayerInfoListData;
import com.bytedance.android.livehostapi.business.IHostSocial;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class g$b extends b$b<g$a> {
    public static ChangeQuickRedirect LIZ;
    public HashMap LIZIZ;

    static {
        Covode.recordClassIndex(26221);
    }

    public abstract void LIZ(User user);

    public abstract void LIZ(C4366b c4366b);

    public abstract void LIZ(PlayerInfoListData playerInfoListData);

    public abstract void LIZ(Throwable th);

    public abstract void LIZ(List<? extends IHostSocial.InviteFriendsConfig.AbstractC5787a> list);

    public abstract void LIZIZ(List<? extends LinkPlayerInfo> list);

    /* renamed from: LJ */
    public void mo15751LJ() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported && (hashMap = this.LIZIZ) != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onDestroyView();
        mo15751LJ();
    }
}
