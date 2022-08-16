package com.bytedance.android.latch.internal;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.latch.internal.util.LatchException;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.AbstractC34975j;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.json.JSONObject;
import p003X.AbstractC137661ckr;
import p003X.C106862S5w;
import p003X.C137651ckh;
import p003X.C137652cki;
import p003X.C520566hW;
import p003X.C73879FBh;
import p003X.FCU;
import p003X.FCV;

/* renamed from: com.bytedance.android.latch.internal.c */
/* loaded from: classes17.dex */
public final class C2763c extends AbstractC137661ckr {
    public static ChangeQuickRedirect LIZ;
    public final BehaviorSubject<JSONObject> LIZJ;

    /* renamed from: LJ */
    public final PublishSubject<JSONObject> f25720LJ;
    public final Function0<Unit> LJFF;
    public final Function0<Unit> LJI;
    public final Function1<LatchException, Unit> LJII;
    public final AbstractC2765d LJIIIZ;
    public final Function0<a$a> LJIIJ;
    public final CompositeDisposable LIZIZ = new CompositeDisposable();
    public final AtomicInteger LIZLLL = new AtomicInteger(0);
    public final Set<C2764a> LJIIIIZZ = Collections.newSetFromMap(new ConcurrentHashMap());

    static {
        Covode.recordClassIndex(13731);
    }

    /* renamed from: com.bytedance.android.latch.internal.c$a */
    /* loaded from: classes28.dex */
    public static final class C2764a {
        public static ChangeQuickRedirect LIZ;
        public final String LIZIZ;
        public final C2764a LIZJ;

        /* renamed from: LJ */
        public static final FCU f25721LJ = new FCU((byte) 0);
        public static final C2764a LIZLLL = new C2764a("__root", null, 2);

        static {
            Covode.recordClassIndex(13732);
        }

        public final Sequence<C2764a> LIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
            if (proxy.isSupported) {
                return (Sequence) proxy.result;
            }
            return C520566hW.sequence(new LatchStateHolder$JsonPath$walkBottomUp$1(this, null));
        }

        public C2764a(String str, C2764a c2764a) {
            C106862S5w.LIZ(str);
            this.LIZIZ = str;
            this.LIZJ = c2764a;
        }

        public /* synthetic */ C2764a(String str, C2764a c2764a, int i) {
            this(str, null);
        }
    }

    public final Set<C2764a> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (Set) proxy.result;
        }
        Set<C2764a> set = this.LJIIIIZZ;
        Intrinsics.checkExpressionValueIsNotNull(set, "");
        return set;
    }

    @Override // p003X.AbstractC137661ckr
    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LIZIZ.dispose();
    }

    public final AbstractC34975j<JSONObject> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (AbstractC34975j) proxy.result;
        }
        a$a mo30099invoke = this.LJIIJ.mo30099invoke();
        if (mo30099invoke instanceof C137652cki) {
            AbstractC34975j<JSONObject> LIZ2 = AbstractC34975j.LIZ((Throwable) new LatchException(-1003, "Script content still loading", null, 4));
            Intrinsics.checkExpressionValueIsNotNull(LIZ2, "");
            return LIZ2;
        } else if (mo30099invoke instanceof C137651ckh) {
            AbstractC34975j<JSONObject> LIZ3 = AbstractC34975j.LIZ((Throwable) ((C137651ckh) mo30099invoke).LIZ);
            Intrinsics.checkExpressionValueIsNotNull(LIZ3, "");
            return LIZ3;
        } else {
            AbstractC34975j<JSONObject> firstElement = this.LIZJ.firstElement();
            Intrinsics.checkExpressionValueIsNotNull(firstElement, "");
            return firstElement;
        }
    }

    private final String LIZIZ(JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String string = jSONObject.getString(C2521l.LJIIIZ);
        Intrinsics.checkExpressionValueIsNotNull(string, "");
        return string;
    }

    public final void LIZ(Object obj) {
        if (!PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 8).isSupported && (obj instanceof JSONObject)) {
            LIZ(FCU.LIZ(), (JSONObject) obj);
        }
    }

    public final boolean LIZ(JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return Intrinsics.areEqual(jSONObject.optString("__type"), "jsb");
    }

    public final boolean LIZ(C2764a c2764a, JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c2764a, jSONObject}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!LIZ(jSONObject)) {
            return false;
        }
        this.LIZLLL.incrementAndGet();
        this.LJIIIIZZ.add(c2764a);
        C73879FBh.LIZ(this.LJIIIZ.LIZ(LIZIZ(jSONObject)).LIZLLL(new FCV(this, c2764a)), this.LIZIZ);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2763c(AbstractC2765d abstractC2765d, Function0<Unit> function0, Function0<Unit> function02, Function1<? super LatchException, Unit> function1, Function0<? extends a$a> function03) {
        C106862S5w.LIZ(abstractC2765d, function0, function02, function1, function03);
        this.LJIIIZ = abstractC2765d;
        this.LJFF = function0;
        this.LJI = function02;
        this.LJII = function1;
        this.LJIIJ = function03;
        BehaviorSubject<JSONObject> create = BehaviorSubject.create();
        Intrinsics.checkExpressionValueIsNotNull(create, "");
        this.LIZJ = create;
        PublishSubject<JSONObject> create2 = PublishSubject.create();
        Intrinsics.checkExpressionValueIsNotNull(create2, "");
        this.f25720LJ = create2;
    }
}
