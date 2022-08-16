package com.bytedance.android.live.profit;

import android.os.SystemClock;
import androidx.core.view.MotionEventCompat;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.profit.api.PrivilegeApi;
import com.bytedance.android.live.profit.privilege.AbstractC5365a;
import com.bytedance.android.live.profit.privilege.model.C5366a;
import com.bytedance.android.live.profit.privilege.model.C5367b;
import com.bytedance.android.live.profit.privilege.model.C5369d;
import com.bytedance.android.live.profit.privilege.model.C5371f;
import com.bytedance.android.live.profit.privilege.model.C5372g;
import com.bytedance.android.live.profit.privilege.model.ScreenChatTabResponse;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.C5927dv;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import io.reactivex.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC414772bH;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C3VF;
import p003X.C426132tb;
import p003X.C458444Ba;
import p003X.C88306Kqq;
import p003X.C89718LWm;
import p003X.C91089Lud;
import p003X.C91092Lug;
import p003X.C91093Luh;
import p003X.QB4;

/* renamed from: com.bytedance.android.live.profit.g */
/* loaded from: classes5.dex */
public final class C5277g extends ViewModel {
    public static ChangeQuickRedirect LIZ;
    public final CompositeDisposable LIZIZ = new CompositeDisposable();
    public final long LIZJ;
    public final long LIZLLL;

    /* renamed from: LJ */
    public final long f26562LJ;
    public final C89718LWm<C5371f> LJFF;
    public final AbstractC414772bH<C5371f> LJI;
    public final C89718LWm<C5372g> LJII;
    public final AbstractC414772bH<C5372g> LJIIIIZZ;
    public final C5923dp LJIIIZ;
    public final DataCenter LJIIJ;

    static {
        Covode.recordClassIndex(33372);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZIZ.dispose();
    }

    private final void LIZ(List<C5366a> list) {
        C5367b LJIIIZ;
        C2WC<Boolean> LJFF;
        boolean z = false;
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 11).isSupported || list.isEmpty()) {
            return;
        }
        AbstractC5365a m24858LJ = C458444Ba.m24858LJ();
        if (m24858LJ != null && (LJIIIZ = m24858LJ.LJIIIZ()) != null) {
            List<Long> list2 = LJIIIZ.LIZ;
            HashMap hashMap = new HashMap();
            for (Long l : list2) {
                hashMap.put(Long.valueOf(l.longValue()), Boolean.TRUE);
            }
            for (C5366a c5366a : list) {
                if (c5366a.f26574LJ + 518400 >= System.currentTimeMillis() / 1000 && !hashMap.containsKey(Long.valueOf(c5366a.LIZ))) {
                    c5366a.LJIIIIZZ = true;
                    z = true;
                }
            }
            AbstractC5365a m24858LJ2 = C458444Ba.m24858LJ();
            if (m24858LJ2 != null && (LJFF = m24858LJ2.LJFF()) != null) {
                LJFF.LIZ(Boolean.valueOf(z));
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C5366a c5366a2 : list) {
            arrayList.add(Long.valueOf(c5366a2.LIZ));
        }
        AbstractC5365a m24858LJ3 = C458444Ba.m24858LJ();
        if (m24858LJ3 != null) {
            m24858LJ3.LIZ(new C5367b(arrayList, 0L, 2));
        }
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        ALogger.m15801d("PrivilegeRepository", "try to query subscribe info.");
        if (!this.LJIIIZ.LJJIJIL() && !C426132tb.LIZ(this.LJIIIZ.LIZ().LIZ(), null, 2, null)) {
            QB4.LIZ(QB4.LIZIZ(((PrivilegeApi) C88306Kqq.LIZ().LIZ(PrivilegeApi.class)).querySubscribeInfo(this.LIZJ, this.LIZLLL, str)).map(C91089Lud.LIZIZ).subscribe(new C91093Luh(this, SystemClock.uptimeMillis(), str), new C91092Lug(this, str)), this.LIZIZ);
            return;
        }
        ALogger.m15801d("PrivilegeRepository", "query condition not passed: " + this.LJIIIZ.LJJIJIL() + " || " + C426132tb.LIZ(this.LJIIIZ.LIZ().LIZ(), null, 2, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(List<? extends ScreenChatTabResponse.TabItem> list, int i) {
        ScreenChatTabResponse.TabItem tabItem;
        if (PatchProxy.proxy(new Object[]{list, Integer.valueOf(i)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        ArrayList<ScreenChatTabResponse.TabItem> arrayList = new ArrayList();
        int i2 = -1;
        arrayList.addAll(list);
        boolean z = false;
        for (ScreenChatTabResponse.TabItem tabItem2 : arrayList) {
            if (tabItem2.style == 0) {
                i2 = arrayList.indexOf(tabItem2);
                z = true;
            }
        }
        if (z) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            if (proxy.isSupported) {
                tabItem = proxy.result;
            } else {
                ScreenChatTabResponse.TabItem tabItem3 = new ScreenChatTabResponse.TabItem();
                tabItem3.status = 0;
                tabItem3.style = 20;
                tabItem = tabItem3;
            }
            arrayList.add(i2, tabItem);
            i2++;
        }
        this.LJFF.LIZ(new C5371f(arrayList, false, z, i2, i, null, 34));
    }

    public C5277g(C5923dp c5923dp, DataCenter dataCenter) {
        long j;
        C3VF user;
        C106862S5w.LIZ(c5923dp, dataCenter);
        this.LJIIIZ = c5923dp;
        this.LJIIJ = dataCenter;
        this.LIZJ = this.LJIIIZ.LIZ().LIZ().getRoomId();
        this.LIZLLL = this.LJIIIZ.LIZ().LIZ().ownerUserId;
        IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
        if (iUserService != null && (user = iUserService.user()) != null) {
            j = user.LIZIZ();
        } else {
            j = 0;
        }
        this.f26562LJ = j;
        this.LJFF = new C89718LWm<>(new C5371f(null, false, false, 0, 0, null, 63), (Function2) null, 2);
        C89718LWm<C5371f> c89718LWm = this.LJFF;
        c89718LWm.LIZIZ();
        this.LJI = c89718LWm;
        this.LJII = new C89718LWm<>(new C5372g(null, 0, false, null, false, false, null, false, MotionEventCompat.ACTION_MASK), (Function2) null, 2);
        C89718LWm<C5372g> c89718LWm2 = this.LJII;
        c89718LWm2.LIZIZ();
        this.LJIIIIZZ = c89718LWm2;
    }

    public final void LIZ(C5369d c5369d, String str) {
        boolean z;
        boolean z2;
        String str2;
        if (PatchProxy.proxy(new Object[]{c5369d, str}, this, LIZ, false, 10).isSupported) {
            return;
        }
        List<C5366a> list = c5369d.LIZJ;
        if (list == null) {
            list = new ArrayList<>();
        }
        if (c5369d.LIZ == 2) {
            z = true;
        } else {
            z = false;
        }
        C5927dv LIZ2 = C5927dv.LJII.LIZ();
        if ((LIZ2 == null || !LIZ2.LJIL()) && !this.LJIIIZ.LJJIJL()) {
            z2 = false;
        } else {
            z2 = true;
        }
        for (C5366a c5366a : list) {
            c5366a.LJII = z;
        }
        if (c5369d.LIZLLL && Intrinsics.areEqual("emoji", str)) {
            LIZ(list);
        }
        int i = c5369d.LJI;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    str2 = "null";
                } else {
                    str2 = "expired";
                }
            } else {
                str2 = "activated";
            }
        } else {
            str2 = "nonactivated";
        }
        this.LJII.LIZ(new C5372g(list, c5369d.LIZ, c5369d.LIZLLL, str2, c5369d.f26576LJ, c5369d.LJFF, c5369d.LJII, z2));
    }
}
