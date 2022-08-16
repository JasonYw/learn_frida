package com.bytedance.android.live.liveinteract.voicechat.p392b;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C409882Kg;
import p003X.C4574547f;
import p003X.C78828H5q;
import p003X.C79046HEa;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.b.a */
/* loaded from: classes3.dex */
public final class C4999a {
    public static ChangeQuickRedirect LIZ;
    public List<LinkPlayerInfo> LIZIZ = new ArrayList();
    public boolean LIZJ;
    public final boolean LIZLLL;

    /* renamed from: LJ */
    public boolean f26478LJ;

    static {
        Covode.recordClassIndex(30886);
    }

    public final void LIZ() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        HashMap hashMap = new HashMap();
        C78828H5q.LIZIZ(hashMap, (Integer) null, (Integer) null, 6, (Object) null);
        if (LIZ2 != null) {
            if (this.LIZLLL) {
                str = "anchor";
            } else {
                C79046HEa LIZ3 = C79046HEa.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                Integer num = (Integer) LIZ3.LJJIIZI;
                if (num != null && num.intValue() == 0) {
                    str = "user";
                } else {
                    str = "guest";
                }
            }
            hashMap.put("user_type", str);
        }
        C4574547f.LIZ().LIZ("livesdk_anchor_audience_connection_rechargeable_seat_show", hashMap, Room.class, C8668v.class);
    }

    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        long LIZIZ = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ();
        for (LinkPlayerInfo linkPlayerInfo : this.LIZIZ) {
            if (linkPlayerInfo.LIZ() != null) {
                User LIZ2 = linkPlayerInfo.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                if (LIZ2.getId() == LIZIZ) {
                    if (linkPlayerInfo.LJJIJIL) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void LIZ(List<LinkPlayerInfo> list) {
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        this.LIZIZ = list;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else {
            Iterator<LinkPlayerInfo> it = this.LIZIZ.iterator();
            while (true) {
                if (it.hasNext()) {
                    String LIZLLL = it.next().LIZLLL();
                    if (!TextUtils.isEmpty(LIZLLL)) {
                        if (TextUtils.equals(LIZLLL, "0")) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        }
        if (this.f26478LJ && !LIZIZ() && !this.LIZLLL && z && !this.LIZJ) {
            LIZ();
        }
        this.LIZJ = z;
    }

    public C4999a(boolean z, boolean z2) {
        this.LIZLLL = z;
        this.f26478LJ = z2;
    }
}
