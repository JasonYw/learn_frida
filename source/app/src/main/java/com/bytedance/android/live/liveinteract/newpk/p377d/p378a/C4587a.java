package com.bytedance.android.live.liveinteract.newpk.p377d.p378a;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.liveinteract.newpk.p377d.AbstractC4586a;
import com.bytedance.android.livesdk.chatroom.AbstractC5925ds;
import com.bytedance.android.scope.AbstractC9790g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.HS0;
import p003X.HS1;
import p003X.HS2;
import p003X.HUQ;
import p003X.PWI;
import p003X.PYI;

/* renamed from: com.bytedance.android.live.liveinteract.newpk.d.a.a */
/* loaded from: classes3.dex */
public final class C4587a implements AbstractC9790g {
    public static ChangeQuickRedirect LIZ;
    public AbstractC4586a LIZIZ;
    public final Observer<AbstractC4256d> LIZJ = new HS1(this);
    public final Observer<User> LIZLLL = new HS2(this);

    /* renamed from: LJ */
    public final Observer<Long> f26379LJ = new HS0(this);
    public final AbstractC5925ds LJFF;

    static {
        Covode.recordClassIndex(28502);
    }

    @Override // com.bytedance.android.scope.AbstractC9790g
    public final void aX_() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        AbstractC4586a abstractC4586a = this.LIZIZ;
        if (abstractC4586a != null) {
            PWI.LIZJ(abstractC4586a);
        }
        this.LIZIZ = null;
    }

    @Override // com.bytedance.android.scope.AbstractC9790g
    public final void aW_() {
        AbstractC4586a pyi;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        AbstractC5925ds abstractC5925ds = this.LJFF;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC5925ds}, null, HUQ.LIZ, true, 1);
        if (proxy.isSupported) {
            pyi = (AbstractC4586a) proxy.result;
        } else {
            C106862S5w.LIZ(abstractC5925ds);
            pyi = new PYI(abstractC5925ds, new MutableLiveData(), new MutableLiveData(), new MutableLiveData());
            PWI.LIZIZ(pyi);
        }
        this.LIZIZ = pyi;
    }

    public C4587a(AbstractC5925ds abstractC5925ds) {
        C106862S5w.LIZ(abstractC5925ds);
        this.LJFF = abstractC5925ds;
    }
}
