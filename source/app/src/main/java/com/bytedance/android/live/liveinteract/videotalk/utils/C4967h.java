package com.bytedance.android.live.liveinteract.videotalk.utils;

import android.text.TextUtils;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C409882Kg;
import p003X.C4574547f;
import p003X.C79046HEa;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.utils.h */
/* loaded from: classes3.dex */
public final class C4967h {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    /* renamed from: LJ */
    public List<? extends LinkPlayerInfo> f26460LJ = new ArrayList();
    public boolean LJFF;
    public boolean LJI;

    static {
        Covode.recordClassIndex(30631);
    }

    public final void LIZIZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported && this.LIZLLL) {
            this.LJFF = false;
            this.LJI = LIZLLL();
        }
    }

    public final void LIZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported && this.LIZLLL) {
            this.LJFF = true;
            this.LJI = LIZLLL();
            if (this.LJI) {
                LIZJ();
            }
        }
    }

    private final void LIZJ() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        HashMap hashMap = new HashMap();
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        String currentFunctionType = ((IInteractService) service).getCurrentFunctionType();
        Intrinsics.checkNotNullExpressionValue(currentFunctionType, "");
        hashMap.put("function_type", currentFunctionType);
        if (LIZ2 != null) {
            if (this.LIZJ) {
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
        C4574547f.LIZ().LIZ("livesdk_anchor_audience_connection_rechargeable_seat_show", hashMap, Room.class);
    }

    private final boolean LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.LJFF) {
            return false;
        }
        if (this.LIZIZ) {
            if (this.f26460LJ.isEmpty()) {
                return true;
            }
            LinkPlayerInfo linkPlayerInfo = this.f26460LJ.get(0);
            String LIZLLL = linkPlayerInfo.LIZLLL();
            if (!TextUtils.isEmpty(LIZLLL) && !TextUtils.equals(LIZLLL, "0")) {
                return false;
            }
            if (linkPlayerInfo.LIZ() != null && linkPlayerInfo.LJJIJIL) {
                return false;
            }
            return true;
        }
        for (LinkPlayerInfo linkPlayerInfo2 : this.f26460LJ) {
            String LIZLLL2 = linkPlayerInfo2.LIZLLL();
            if (TextUtils.isEmpty(LIZLLL2) || TextUtils.equals(LIZLLL2, "0")) {
                if (linkPlayerInfo2.LIZ() == null || !linkPlayerInfo2.LJJIJIL) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void LIZ(List<? extends LinkPlayerInfo> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        this.f26460LJ = list;
        boolean z = this.LJI;
        boolean LIZLLL = LIZLLL();
        if (LIZLLL != z) {
            if (LIZLLL) {
                LIZJ();
            }
            this.LJI = LIZLLL;
        }
    }

    public C4967h(boolean z, boolean z2) {
        this.LIZJ = z;
        this.LIZLLL = z2;
    }
}
