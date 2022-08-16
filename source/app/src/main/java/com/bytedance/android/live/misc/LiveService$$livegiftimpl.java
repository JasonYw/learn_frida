package com.bytedance.android.live.misc;

import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.gift.IRoomStateService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.AbstractC5925ds;
import com.bytedance.android.livesdk.gift.platform.core.GiftService;
import com.bytedance.android.livesdk.gift.platform.core.download.RoomStateService;
import com.bytedance.android.livesdk.gift.platform.core.p609d.AbstractC7460a;
import com.bytedance.android.livesdk.gift.platform.core.p609d.AbstractC7474c;
import com.bytedance.android.livesdk.gift.platform.core.p609d.p610a.C7461a;
import com.bytedance.android.livesdk.gift.platform.core.p609d.p610a.C7462b;
import com.bytedance.android.livesdk.gift.platform.core.p609d.p610a.C7463c;
import com.bytedance.android.livesdk.gift.platform.core.p609d.p610a.C7464d;
import com.bytedance.android.livesdk.gift.platform.core.p609d.p610a.C7465e;
import com.bytedance.android.livesdk.gift.platform.core.p609d.p610a.C7466f;
import com.bytedance.android.livesdk.gift.platform.core.p609d.p610a.C7467g;
import com.bytedance.android.livesdk.gift.platform.core.p609d.p610a.C7468i;
import com.bytedance.android.livesdk.gift.platform.core.p609d.p610a.C7469j;
import com.bytedance.android.livesdk.gift.platform.core.p609d.p610a.C7470l;
import com.bytedance.android.livesdk.gift.platform.core.p609d.p610a.C7471m;
import com.bytedance.android.livesdk.gift.platform.core.p609d.p610a.C7472n;
import com.bytedance.android.livesdk.gift.platform.core.p609d.p610a.C7473o;
import com.bytedance.android.livesdkapi.depend.live.ILiveGiftService;
import com.bytedance.android.scope.generated.aweme_2F_livegift_2D_impl.__RunInScopeImpl$registerScopeServicesInModule$1;
import com.bytedance.android.scope.generated.aweme_2F_livegift_2D_impl.__RunInScopeImpl$registerScopeServicesInModule$10;
import com.bytedance.android.scope.generated.aweme_2F_livegift_2D_impl.__RunInScopeImpl$registerScopeServicesInModule$11;
import com.bytedance.android.scope.generated.aweme_2F_livegift_2D_impl.__RunInScopeImpl$registerScopeServicesInModule$12;
import com.bytedance.android.scope.generated.aweme_2F_livegift_2D_impl.__RunInScopeImpl$registerScopeServicesInModule$13;
import com.bytedance.android.scope.generated.aweme_2F_livegift_2D_impl.__RunInScopeImpl$registerScopeServicesInModule$2;
import com.bytedance.android.scope.generated.aweme_2F_livegift_2D_impl.__RunInScopeImpl$registerScopeServicesInModule$3;
import com.bytedance.android.scope.generated.aweme_2F_livegift_2D_impl.__RunInScopeImpl$registerScopeServicesInModule$4;
import com.bytedance.android.scope.generated.aweme_2F_livegift_2D_impl.__RunInScopeImpl$registerScopeServicesInModule$5;
import com.bytedance.android.scope.generated.aweme_2F_livegift_2D_impl.__RunInScopeImpl$registerScopeServicesInModule$6;
import com.bytedance.android.scope.generated.aweme_2F_livegift_2D_impl.__RunInScopeImpl$registerScopeServicesInModule$7;
import com.bytedance.android.scope.generated.aweme_2F_livegift_2D_impl.__RunInScopeImpl$registerScopeServicesInModule$8;
import com.bytedance.android.scope.generated.aweme_2F_livegift_2D_impl.__RunInScopeImpl$registerScopeServicesInModule$9;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import p003X.AbstractC89896LbO;
import p003X.AbstractC90419Ljp;
import p003X.C101736Q4s;
import p003X.C101797Q7b;
import p003X.C444573iF;
import p003X.C89984Lco;
import p003X.C90418Ljo;
import p003X.C90609Lmt;

/* loaded from: classes8.dex */
public class LiveService$$livegiftimpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        if (ReDexClinitStringAb.abTest >= 4) {
            Covode.recordClassIndex(32501);
        } else {
            Covode.recordClassIndex(32501);
        }
    }

    public static void registerService() {
        IService giftService;
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        if (C90609Lmt.LIZ()) {
            giftService = new C90418Ljo();
        } else {
            giftService = new GiftService();
        }
        ServiceManager.registerService(AbstractC89896LbO.class, giftService);
        ServiceManager.registerService(ILiveGiftService.class, giftService);
        ServiceManager.registerService(AbstractC90419Ljp.class, giftService);
        ServiceManager.registerService(IRoomStateService.class, new RoomStateService());
        if (C90609Lmt.LIZ() && !PatchProxy.proxy(new Object[0], null, C89984Lco.LIZ, true, 33).isSupported && !PatchProxy.proxy(new Object[0], null, C101736Q4s.LIZ, true, 1).isSupported) {
            C444573iF.LIZ(C101797Q7b.LIZJ, AbstractC7474c.class, C7470l.class, null, __RunInScopeImpl$registerScopeServicesInModule$1.INSTANCE, null, 20, null);
            C444573iF.LIZ(C101797Q7b.LIZJ, AbstractC7474c.class, C7462b.class, null, __RunInScopeImpl$registerScopeServicesInModule$2.INSTANCE, null, 20, null);
            C444573iF.LIZ(C101797Q7b.LIZJ, AbstractC7474c.class, C7466f.class, null, __RunInScopeImpl$registerScopeServicesInModule$3.INSTANCE, null, 20, null);
            C444573iF.LIZ(C101797Q7b.LIZJ, AbstractC7474c.class, C7464d.class, null, __RunInScopeImpl$registerScopeServicesInModule$4.INSTANCE, null, 20, null);
            C444573iF.LIZ(C101797Q7b.LIZJ, AbstractC7474c.class, C7471m.class, null, __RunInScopeImpl$registerScopeServicesInModule$5.INSTANCE, null, 20, null);
            C444573iF.LIZ(C101797Q7b.LIZJ, AbstractC7474c.class, C7472n.class, null, __RunInScopeImpl$registerScopeServicesInModule$6.INSTANCE, null, 20, null);
            C444573iF.LIZ(C101797Q7b.LIZJ, AbstractC7474c.class, C7465e.class, null, __RunInScopeImpl$registerScopeServicesInModule$7.INSTANCE, null, 20, null);
            C444573iF.LIZ(C101797Q7b.LIZJ, AbstractC7474c.class, C7461a.class, null, __RunInScopeImpl$registerScopeServicesInModule$8.INSTANCE, null, 20, null);
            C444573iF.LIZ(C101797Q7b.LIZJ, AbstractC7474c.class, C7467g.class, null, __RunInScopeImpl$registerScopeServicesInModule$9.INSTANCE, null, 20, null);
            C444573iF.LIZ(C101797Q7b.LIZJ, AbstractC7460a.class, C7468i.class, null, __RunInScopeImpl$registerScopeServicesInModule$10.INSTANCE, null, 20, null);
            C444573iF.LIZ(C101797Q7b.LIZJ, AbstractC7474c.class, C7463c.class, null, __RunInScopeImpl$registerScopeServicesInModule$11.INSTANCE, null, 20, null);
            C444573iF.LIZ(C101797Q7b.LIZJ, AbstractC5925ds.class, C7469j.class, null, __RunInScopeImpl$registerScopeServicesInModule$12.INSTANCE, null, 20, null);
            C444573iF.LIZ(C101797Q7b.LIZJ, AbstractC7474c.class, C7473o.class, null, __RunInScopeImpl$registerScopeServicesInModule$13.INSTANCE, null, 20, null);
        }
    }
}
