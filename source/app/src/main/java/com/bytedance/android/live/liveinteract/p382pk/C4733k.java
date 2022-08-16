package com.bytedance.android.live.liveinteract.p382pk;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.linkpk.AbstractC4261e;
import com.bytedance.android.live.liveinteract.multianchor.p368f.C4520a;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC426192th;
import p003X.AbstractC79306HOa;
import p003X.AbstractC79338HPg;
import p003X.C106862S5w;
import p003X.C77204GcA;
import p003X.C79309HOd;
import p003X.C79311HOf;
import p003X.C79524HWk;
import p003X.C81289I2h;
import p003X.HNS;
import p003X.HP3;
import p003X.QB4;

/* renamed from: com.bytedance.android.live.liveinteract.pk.k */
/* loaded from: classes3.dex */
public final class C4733k extends C79309HOd implements AbstractC79338HPg {
    public static ChangeQuickRedirect LJIIZILJ;
    public static final /* synthetic */ KProperty[] LJIJ;
    public C4520a LJIJI;
    public C8874fl LJIJJ;
    public AbstractC79306HOa LJIJJLI;
    public int LJIL;
    public int LJJ;
    public long LJJI;
    public long LJJIFFI;
    public User LJJII;
    public Room LJJIII;
    public final C79311HOf LJJIIZ;
    public final MutableLiveData<AbstractC4261e> LJJIIJ = new MutableLiveData<>();
    public final MutableLiveData<C8874fl> LJJIIJZLJL = new MutableLiveData<>();
    public final C81289I2h LJJIIZI = HNS.LIZ(this, null, 1, null);
    public final C81289I2h LJJIJ = HNS.LIZ(this, PkLinkBizDataContext$loadPkWidgetEvent$2.INSTANCE);

    static {
        Covode.recordClassIndex(29020);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C4733k.class, "dismissDialogEvent", "getDismissDialogEvent()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(C4733k.class, "loadPkWidgetEvent", "getLoadPkWidgetEvent()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl2);
        LJIJ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2};
    }

    public final AbstractC426192th<Boolean> LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIZILJ, false, 1);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJJIIZI.LIZ(this, LJIJ[0]));
    }

    public final AbstractC426192th<Boolean> LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIZILJ, false, 2);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJJIJ.LIZ(this, LJIJ[1]));
    }

    public final LiveData<AbstractC4261e> LJIIIZ() {
        return this.LJJIIJ;
    }

    @Override // p003X.C79309HOd, p003X.AbstractC79338HPg
    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LJIIZILJ, false, 8).isSupported) {
            return;
        }
        super.LJFF();
        this.LJJIIJ.setValue(C79524HWk.LIZIZ);
        this.LJIL = 0;
        this.LJJ = 0;
        this.LJJI = 0L;
        this.LJJIFFI = 0L;
        this.LJJII = null;
        this.LJJIII = null;
    }

    @Override // p003X.AbstractC79338HPg
    public final C77204GcA LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIZILJ, false, 4);
        if (proxy.isSupported) {
            return (C77204GcA) proxy.result;
        }
        return new C77204GcA(this.LJJI, this.LJJIFFI, this.LJJII, this.LJJIII);
    }

    public final int LIZ(Integer num) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{num}, this, LJIIZILJ, false, 11);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (num != null) {
            if (num.intValue() == 2) {
                return 2131584445;
            }
            if (num.intValue() == 3) {
                return 2131584444;
            }
            if (num.intValue() == 4) {
                return 2131584443;
            }
            if (num.intValue() == 5) {
                return 2131584445;
            }
            if (num.intValue() == 6) {
                return 2131584442;
            }
            if (num.intValue() == 7) {
                return 2131584447;
            }
            return 2131584441;
        }
        return 2131584441;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
        if (r0.LIZIZ() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0167, code lost:
        if (r7 == r0.ownerUserId) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZIZ(com.bytedance.android.livesdk.message.model.C8874fl r13) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.p382pk.C4733k.LIZIZ(com.bytedance.android.livesdk.message.model.fl):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4733k(DataCenter dataCenter, Context context) {
        super(dataCenter);
        C106862S5w.LIZ(dataCenter, context);
        this.LJJIIZ = new C79311HOf(this, context, dataCenter);
        QB4.LIZ(LLLLIIIILLL().subscribe(new HP3(this)), this.LJFF);
        LIZ().LIZ(this.LJJIIZ);
        this.LJIJI = new C4520a(dataCenter, 1);
        C4520a c4520a = this.LJIJI;
        if (c4520a != null) {
            c4520a.LIZIZ();
        }
        this.LJJIIJ.setValue(C79524HWk.LIZIZ);
    }
}
