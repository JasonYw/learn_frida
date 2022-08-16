package com.bytedance.android.live.broadcast.preview.viewmodel;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.preview.api.StartLiveVisibilityApi;
import com.bytedance.android.live.broadcast.preview.p277ui.chooseuser.viewbinder.C3192d;
import com.bytedance.android.live.broadcast.preview.p277ui.chooseuser.viewbinder.C3195i;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC426192th;
import p003X.AbstractC77321Ge3;
import p003X.C100839PnV;
import p003X.C2WC;
import p003X.C392771gt;
import p003X.C425332sJ;
import p003X.C77192Gby;
import p003X.C77284GdS;
import p003X.C77285GdT;
import p003X.C77286GdU;
import p003X.C77288GdW;
import p003X.C77312Gdu;
import p003X.C77313Gdv;
import p003X.C77316Gdy;
import p003X.C77331GeD;
import p003X.C81289I2h;
import p003X.C81909IQd;
import p003X.GZ0;
import p003X.GZ1;
import p003X.HNS;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.broadcast.preview.viewmodel.d */
/* loaded from: classes3.dex */
public final class C3207d extends C77331GeD<Object> {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public int LJIIJJI;
    public final String LIZJ = "StartLiveVisibilityContext[" + hashCode() + LoggerUtil.M_RIGHT_TAG;
    public final C81289I2h LJIILJJIL = C81909IQd.LIZ(this, new LinkedHashSet(), null, 2, null);
    public final C81289I2h LJIILL = C81909IQd.LIZ(this, new ArrayList(), null, 2, null);
    public final C81289I2h LJIILLIIL = C81909IQd.LIZ(this, 0, null, 2, null);
    public final C81289I2h LJIIZILJ = C81909IQd.LIZ(this, new ArrayList(), null, 2, null);
    public final C81289I2h LJIJ = C81909IQd.LIZ(this, 0, null, 2, null);
    public final Lazy LJIJI = LazyKt__LazyJVMKt.lazy(StartLiveVisibilityContext$currentUserId$2.INSTANCE);
    public final List<C3195i> LIZLLL = new ArrayList();

    /* renamed from: LJ */
    public final List<C3195i> f25923LJ = new ArrayList();
    public final List<C3195i> LJFF = new ArrayList();
    public final List<Object> LJI = new ArrayList();
    public final C77312Gdu LJII = new C77312Gdu();
    public final C77313Gdv LJIJJ = new C77313Gdv();
    public final C77316Gdy LJIJJLI = new C77316Gdy();
    public final List<C3209g> LJIIIIZZ = CollectionsKt__CollectionsKt.mutableListOf(new C3209g(1, this.LJII, this.LIZLLL, new StartLiveVisibilityContext$limitInfoLoadItemList$1(this), 2131587873), new C3209g(2, this.LJIJJ, this.f25923LJ, new StartLiveVisibilityContext$limitInfoLoadItemList$2(this), 2131587869), new C3209g(3, this.LJIJJLI, this.LJFF, new StartLiveVisibilityContext$limitInfoLoadItemList$3(this), 2131587871));
    public boolean LJIIIZ = true;
    public boolean LJIIJ = true;
    public final C81289I2h LJIL = HNS.LIZ(this, null, 1, null);
    public final C81289I2h LJJ = HNS.LIZ(this, null, 1, null);
    public final C81289I2h LJJI = HNS.LIZ(this, null, 1, null);
    public final C81289I2h LJJIFFI = HNS.LIZ(this, null, 1, null);
    public final C81289I2h LJJII = HNS.LIZ(this, null, 1, null);

    static {
        Covode.recordClassIndex(17478);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C3207d.class, "localSelectedUser", "getLocalSelectedUser()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(C3207d.class, "somePeopleCanList", "getSomePeopleCanList()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(C3207d.class, "somePeopleCanListTotalCount", "getSomePeopleCanListTotalCount()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl3);
        PropertyReference1Impl propertyReference1Impl4 = new PropertyReference1Impl(C3207d.class, "somePeopleCanNotList", "getSomePeopleCanNotList()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl4);
        PropertyReference1Impl propertyReference1Impl5 = new PropertyReference1Impl(C3207d.class, "somePeopleCanNotListTotalCount", "getSomePeopleCanNotListTotalCount()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl5);
        PropertyReference1Impl propertyReference1Impl6 = new PropertyReference1Impl(C3207d.class, "listFragmentScrollEvent", "getListFragmentScrollEvent()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl6);
        PropertyReference1Impl propertyReference1Impl7 = new PropertyReference1Impl(C3207d.class, "selectedUserChangeByListFragmentEvent", "getSelectedUserChangeByListFragmentEvent()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl7);
        PropertyReference1Impl propertyReference1Impl8 = new PropertyReference1Impl(C3207d.class, "headViewUnSelectUserOperation", "getHeadViewUnSelectUserOperation()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl8);
        PropertyReference1Impl propertyReference1Impl9 = new PropertyReference1Impl(C3207d.class, "listChooseCompleteOperation", "getListChooseCompleteOperation()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl9);
        PropertyReference1Impl propertyReference1Impl10 = new PropertyReference1Impl(C3207d.class, "listChooseReturnOperation", "getListChooseReturnOperation()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl10);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3, propertyReference1Impl4, propertyReference1Impl5, propertyReference1Impl6, propertyReference1Impl7, propertyReference1Impl8, propertyReference1Impl9, propertyReference1Impl10};
    }

    public final C2WC<Set<C3195i>> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIILJJIL.LIZ(this, LIZIZ[0]));
    }

    public final C2WC<List<User>> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIILL.LIZ(this, LIZIZ[1]));
    }

    public final C2WC<Integer> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIILLIIL.LIZ(this, LIZIZ[2]));
    }

    /* renamed from: LJ */
    public final C2WC<List<User>> m15890LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIZILJ.LIZ(this, LIZIZ[3]));
    }

    public final C2WC<Integer> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIJ.LIZ(this, LIZIZ[4]));
    }

    public final long LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        return proxy.isSupported ? ((Long) proxy.result).longValue() : ((Number) this.LJIJI.mo27335getValue()).longValue();
    }

    public final AbstractC426192th<Unit> LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 38);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJIL.LIZ(this, LIZIZ[5]));
    }

    public final AbstractC426192th<Unit> LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 39);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJJ.LIZ(this, LIZIZ[6]));
    }

    public final AbstractC426192th<C3195i> LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 40);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJJI.LIZ(this, LIZIZ[7]));
    }

    public final AbstractC426192th<Unit> LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 41);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJJIFFI.LIZ(this, LIZIZ[8]));
    }

    public final AbstractC426192th<Unit> LJIILJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 42);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJJII.LIZ(this, LIZIZ[9]));
    }

    public final void LIZ(C3195i c3195i) {
        Object obj;
        if (PatchProxy.proxy(new Object[]{c3195i}, this, LIZ, false, 3).isSupported) {
            return;
        }
        Iterator<T> it = LIZIZ().LIZ().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(obj, c3195i)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            LIZIZ().LIZ().remove(obj);
        } else if (c3195i == null) {
        } else {
            LIZIZ().LIZ().add(c3195i);
        }
    }

    public final void LIZ(boolean z) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 21).isSupported && this.LJIIJ != z) {
            String str = this.LIZJ;
            ALogger.m15801d(str, "change mCurrentHasMore from [" + this.LJIIJ + "] to [" + z + LoggerUtil.M_RIGHT_TAG);
            this.LJIIJ = z;
        }
    }

    public final StartLiveVisibilityApi LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (StartLiveVisibilityApi) proxy.result;
        }
        return (StartLiveVisibilityApi) C425332sJ.LIZIZ.LIZ(StartLiveVisibilityApi.class);
    }

    private final List<C3195i> LJIJJLI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        List<Object> list = this.LJI;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C3195i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        Disposable subscribe = C77288GdW.LIZ(LIZ(), 0, 500, 77, null, 8, null).compose(C100839PnV.LIZJ()).subscribe(new C77285GdT(this), new GZ0(this));
        Intrinsics.checkNotNullExpressionValue(subscribe, "");
        LIZ(subscribe);
    }

    public final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        Disposable subscribe = C77288GdW.LIZ(LIZ(), 0, 500, 79, null, 8, null).compose(C100839PnV.LIZJ()).subscribe(new C77284GdS(this), new GZ1(this));
        Intrinsics.checkNotNullExpressionValue(subscribe, "");
        LIZ(subscribe);
    }

    public final boolean LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 19);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return LJIJJLI().isEmpty();
    }

    private final void LJIL() {
        Object obj;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 31).isSupported) {
            return;
        }
        Iterator<T> it = this.LJIIIIZZ.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C3209g) obj).LIZIZ == this.LJIIJJI) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C3209g c3209g = (C3209g) obj;
        if (c3209g == null) {
            String str = this.LIZJ;
            ALogger.m15800e(str, "loadMoreAllUserList: mCurrentLoadType = " + this.LJIIJJI + " and can not get loadItem");
            return;
        }
        int indexOf = this.LJIIIIZZ.indexOf(c3209g);
        int size = this.LJIIIIZZ.size();
        if (this.LJIIIZ) {
            c3209g.LIZJ.LIZ(LIZIZ(this, new StartLiveVisibilityContext$loadMoreAllUserList$1(this, c3209g), null, null, 6, null));
        } else {
            c3209g.LIZJ.LIZIZ(LIZIZ(this, new StartLiveVisibilityContext$loadMoreAllUserList$2(this, c3209g, indexOf, size), null, null, 6, null));
        }
    }

    private final void LIZLLL(int i) {
        Object obj;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 28).isSupported) {
            return;
        }
        Iterator<T> it = this.LJIIIIZZ.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C3209g) obj).LIZIZ == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C3209g c3209g = (C3209g) obj;
        if (c3209g != null) {
            c3209g.LIZJ.LIZ(LIZ(this, new C3202xc260e2ef(c3209g, this, i), null, null, 6, null));
            return;
        }
        String str = this.LIZJ;
        ALogger.m15800e(str, "refreshOneLimitList: can not find limitItem for " + i);
    }

    /* renamed from: LJ */
    private final void m15889LJ(int i) {
        Object obj;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 30).isSupported) {
            return;
        }
        Iterator<T> it = this.LJIIIIZZ.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C3209g) obj).LIZIZ == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C3209g c3209g = (C3209g) obj;
        if (c3209g != null) {
            c3209g.LIZJ.LIZIZ(LIZIZ(this, new C3201x66a41c79(c3209g, this, i), null, null, 6, null));
            return;
        }
        String str = this.LIZJ;
        ALogger.m15800e(str, "loadMoreOneLimitList: can not find limitItem for " + i);
    }

    public final boolean LIZJ(int i) {
        Object obj;
        AbstractC3208f abstractC3208f;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 32);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (i != 0) {
            Iterator<T> it = this.LJIIIIZZ.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((C3209g) obj).LIZIZ == i) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C3209g c3209g = (C3209g) obj;
            if (c3209g == null || (abstractC3208f = c3209g.LIZJ) == null) {
                return false;
            }
            return abstractC3208f.LIZLLL;
        }
        return this.LJIIJ;
    }

    private final void LIZ(Set<C3195i> set) {
        if (PatchProxy.proxy(new Object[]{set}, this, LIZ, false, 27).isSupported) {
            return;
        }
        this.LJI.clear();
        if (set != null && (!set.isEmpty())) {
            for (Object obj : set) {
                this.LJI.add(obj);
            }
            if (!LJIIIZ()) {
                List<Object> list = this.LJI;
                String LIZ2 = LK5.LIZ(2131587902);
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                list.add(0, new C3192d(LIZ2));
            }
        }
        LIZ(true);
        C3209g c3209g = this.LJIIIIZZ.get(0);
        c3209g.LIZJ.LIZ(LIZ(this, new StartLiveVisibilityContext$refreshAllUserList$2(this, c3209g), null, null, 6, null));
    }

    public final void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 29).isSupported) {
            return;
        }
        String str = this.LIZJ;
        ALogger.m15801d(str, "loadMoreLimitList:start load for " + i);
        if (i != 0) {
            m15889LJ(i);
        } else {
            LJIL();
        }
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 22).isSupported) {
            return;
        }
        String str = this.LIZJ;
        ALogger.m15801d(str, "set mCurrentLoadType form [" + this.LJIIJJI + "](" + C392771gt.LIZ(this.LJIIJJI) + ") to [" + i + "](" + C392771gt.LIZ(i) + LoggerUtil.S_RIGHT_TAG);
        this.LJIIJJI = i;
    }

    public final Observer<C5176i<Object>> LIZ(String str, Function0<Unit> function0) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, function0}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (Observer) proxy.result;
        }
        return new C77192Gby(this, str, function0);
    }

    public final void LIZ(int i, Set<C3195i> set) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), set}, this, LIZ, false, 26).isSupported) {
            return;
        }
        String str = this.LIZJ;
        ALogger.m15801d(str, "refreshLimitList:start refresh for " + i);
        if (i != 0) {
            LIZLLL(i);
        } else {
            LIZ(set);
        }
    }

    private final AbstractC77321Ge3<C3195i> LIZ(Function2<? super List<C3195i>, ? super Boolean, Unit> function2, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{function2, function0, function1}, this, LIZ, false, 34);
        if (proxy.isSupported) {
            return (AbstractC77321Ge3) proxy.result;
        }
        return C77286GdU.LIZ(new StartLiveVisibilityContext$refreshListener$1(this, function0), function2, new StartLiveVisibilityContext$refreshListener$2(this, function1));
    }

    private final AbstractC77321Ge3<C3195i> LIZIZ(Function2<? super List<C3195i>, ? super Boolean, Unit> function2, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{function2, function0, function1}, this, LIZ, false, 36);
        if (proxy.isSupported) {
            return (AbstractC77321Ge3) proxy.result;
        }
        return C77286GdU.LIZ(new StartLiveVisibilityContext$loadMoreListener$1(this, function0), function2, new StartLiveVisibilityContext$loadMoreListener$2(this, function1));
    }

    public static /* synthetic */ AbstractC77321Ge3 LIZ(C3207d c3207d, Function2 function2, Function0 function0, Function1 function1, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3207d, function2, null, null, 6, null}, null, LIZ, true, 35);
        if (proxy.isSupported) {
            return (AbstractC77321Ge3) proxy.result;
        }
        return c3207d.LIZ(function2, null, null);
    }

    public static /* synthetic */ AbstractC77321Ge3 LIZIZ(C3207d c3207d, Function2 function2, Function0 function0, Function1 function1, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3207d, function2, null, null, 6, null}, null, LIZ, true, 37);
        if (proxy.isSupported) {
            return (AbstractC77321Ge3) proxy.result;
        }
        return c3207d.LIZIZ(function2, null, null);
    }
}
