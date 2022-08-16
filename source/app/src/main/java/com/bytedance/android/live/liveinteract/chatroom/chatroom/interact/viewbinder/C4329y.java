package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder.y */
/* loaded from: classes3.dex */
public final class C4329y {
    public final List<AnchorLinkUser> LIZ;

    static {
        Covode.recordClassIndex(26074);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4329y(List<? extends AnchorLinkUser> list) {
        C106862S5w.LIZ(list);
        this.LIZ = list;
        long LIZIZ = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ();
        int size = this.LIZ.size();
        for (int i = 0; i < size; i++) {
            User LIZ = this.LIZ.get(i).LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            if (LIZ.getId() == LIZIZ) {
                if (i != 0 && (!this.LIZ.isEmpty())) {
                    Collections.swap(this.LIZ, 0, i);
                    return;
                }
                return;
            }
        }
    }
}
