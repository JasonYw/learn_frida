package com.bytedance.android.live.profit;

import android.content.Context;
import com.bytedance.android.live.profit.privilege.AbstractC5365a;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC412992Wf;
import p003X.C91085LuZ;

/* loaded from: classes5.dex */
public final class PrivilegeModule$providePrivilege$1 extends Lambda implements Function0<AbstractC5365a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ DataCenter $dataCenter;
    public final /* synthetic */ C5923dp $roomContext;

    static {
        Covode.recordClassIndex(33217);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivilegeModule$providePrivilege$1(Context context, C5923dp c5923dp, DataCenter dataCenter) {
        super(0);
        this.$context = context;
        this.$roomContext = c5923dp;
        this.$dataCenter = dataCenter;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [com.bytedance.android.live.profit.privilege.a, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AbstractC5365a mo30099invoke() {
        Object LIZ;
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C91085LuZ c91085LuZ = new C91085LuZ();
        C5278h c5278h = new C5278h(this.$context, this.$roomContext, null, 4);
        C5277g c5277g = new C5277g(this.$roomContext, this.$dataCenter);
        C5249c c5249c = new C5249c(c5277g);
        if (this.$roomContext.LIZ().LIZ().ownerUserId != ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ()) {
            z = false;
        }
        if (!this.$roomContext.LJJIJIL() && !this.$roomContext.LJIILJJIL().LIZIZ().booleanValue()) {
            C5250d c5250d = new C5250d();
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c91085LuZ, C91085LuZ.LIZ, false, 19);
            if (proxy2.isSupported) {
                LIZ = proxy2.result;
            } else {
                LIZ = c91085LuZ.LIZJ.LIZ(c91085LuZ, C91085LuZ.LIZIZ[8]);
            }
            ((AbstractC412992Wf) LIZ).LIZIZ(c5250d);
        }
        c91085LuZ.LJIILIIL().LIZIZ(c5278h);
        c91085LuZ.LJIIJJI().LIZIZ(c5277g);
        c91085LuZ.LJIIL().LIZIZ(c5249c);
        c91085LuZ.LIZLLL().LIZIZ(Boolean.valueOf(z));
        return c91085LuZ;
    }
}
