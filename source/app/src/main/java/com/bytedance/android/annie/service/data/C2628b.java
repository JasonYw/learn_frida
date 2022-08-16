package com.bytedance.android.annie.service.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC101043Pqn;
import p003X.C101048Pqs;
import p003X.C101054Pqy;
import p003X.C106862S5w;
import p003X.C99783PRp;
import p003X.PS7;
import p003X.PTL;

/* renamed from: com.bytedance.android.annie.service.data.b */
/* loaded from: classes8.dex */
public final class C2628b {
    public static ChangeQuickRedirect LIZ;
    public static final C2628b LIZLLL = new C2628b();
    public static final Map<String, AbstractC101043Pqn<?>> LIZIZ = new ConcurrentHashMap();
    public static final Map<Character, Integer> LIZJ = new ConcurrentHashMap();

    public static Map<String, AbstractC101043Pqn<?>> LIZ() {
        return LIZIZ;
    }

    static {
        Covode.recordClassIndex(11033);
    }

    public final AbstractC101043Pqn<?> LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (AbstractC101043Pqn) proxy.result;
        }
        C106862S5w.LIZ(str);
        return LIZIZ.get(str);
    }

    public final synchronized <T> Observable<Unit> LIZ(PTL<T> ptl) {
        MethodCollector.m14708i(939);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ptl}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            Observable<Unit> observable = (Observable) proxy.result;
            MethodCollector.m14707o(939);
            return observable;
        }
        C106862S5w.LIZ(ptl);
        Observable observable2 = (Observable<T>) Observable.empty().doOnSubscribe(new C101048Pqs(ptl)).doOnDispose(new C101054Pqy(ptl));
        Intrinsics.checkNotNullExpressionValue(observable2, "");
        MethodCollector.m14707o(939);
        return observable2;
    }

    public final <T> void LIZ(AbstractC101043Pqn<T> abstractC101043Pqn) {
        if (PatchProxy.proxy(new Object[]{abstractC101043Pqn}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC101043Pqn);
        PS7 LJI = C99783PRp.LJI();
        LJI.LIZ("register data provider, key:" + abstractC101043Pqn.mo22952h_() + ", split: " + abstractC101043Pqn.LIZIZ() + ", hashcode: " + abstractC101043Pqn.hashCode() + ", hasExist: " + LIZIZ.containsKey(abstractC101043Pqn.mo22952h_()));
        LIZIZ.put(abstractC101043Pqn.mo22952h_(), abstractC101043Pqn);
        Integer num = LIZJ.get(Character.valueOf(abstractC101043Pqn.LIZIZ()));
        if (num != null) {
            LIZJ.put(Character.valueOf(abstractC101043Pqn.LIZIZ()), Integer.valueOf(num.intValue() + 1));
        } else {
            LIZJ.put(Character.valueOf(abstractC101043Pqn.LIZIZ()), 1);
        }
    }

    public final synchronized <T> void LIZIZ(AbstractC101043Pqn<T> abstractC101043Pqn) {
        MethodCollector.m14708i(940);
        if (PatchProxy.proxy(new Object[]{abstractC101043Pqn}, this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(940);
            return;
        }
        C106862S5w.LIZ(abstractC101043Pqn);
        PS7 LJI = C99783PRp.LJI();
        LJI.LIZ("unregister data provider, key:" + abstractC101043Pqn.mo22952h_() + ", split: " + abstractC101043Pqn.LIZIZ() + ", hashcode: " + abstractC101043Pqn.hashCode() + ", hasExist: " + LIZIZ.containsKey(abstractC101043Pqn.mo22952h_()));
        if (Intrinsics.areEqual(LIZIZ.get(abstractC101043Pqn.mo22952h_()), abstractC101043Pqn)) {
            LIZIZ.remove(abstractC101043Pqn.mo22952h_());
        }
        Integer num = LIZJ.get(Character.valueOf(abstractC101043Pqn.LIZIZ()));
        if (num != null) {
            int intValue = num.intValue();
            if (intValue > 1) {
                LIZJ.put(Character.valueOf(abstractC101043Pqn.LIZIZ()), Integer.valueOf(intValue - 1));
            } else {
                LIZJ.remove(Character.valueOf(abstractC101043Pqn.LIZIZ()));
                MethodCollector.m14707o(940);
                return;
            }
        }
        MethodCollector.m14707o(940);
    }
}
