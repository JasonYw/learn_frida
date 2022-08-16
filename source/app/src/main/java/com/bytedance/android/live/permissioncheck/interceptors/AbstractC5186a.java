package com.bytedance.android.live.permissioncheck.interceptors;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.permissioncheck.p407c.C5184a;
import com.bytedance.android.live.permissioncheck.p407c.C5185b;
import com.bytedance.android.livehostapi.foundation.depend.AbstractC5826c;
import com.bytedance.android.livesdk.C8030j;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import p003X.AbstractC413402Xu;
import p003X.AbstractC91281Lxj;
import p003X.AnonymousClass425;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C77347GeT;
import p003X.IN2;
import p003X.LHQ;

/* renamed from: com.bytedance.android.live.permissioncheck.interceptors.a */
/* loaded from: classes3.dex */
public abstract class AbstractC5186a implements AbstractC91281Lxj {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    /* renamed from: LJ */
    public boolean f26532LJ;
    public C5185b LJII;
    public CompositeDisposable LJIIIIZZ;
    public C5184a LIZLLL = new C5184a(Boolean.FALSE, 0, 2);
    public String LJFF = "";
    public String LJI = "";
    public final Lazy LJIIIZ = C77347GeT.LIZ(new BaseInterceptor$backgroundMonitorListener$2(this));

    static {
        Covode.recordClassIndex(32811);
    }

    private AbstractC5826c.C5827a LJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (AbstractC5826c.C5827a) (proxy.isSupported ? proxy.result : this.LJIIIZ.mo27335getValue());
    }

    public String LIZIZ() {
        return "";
    }

    public final boolean LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        LIZ(this.LIZLLL);
        Object obj = this.LIZLLL.LIZIZ;
        if (obj != null) {
            return ((Boolean) obj).booleanValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
    }

    public final String LIZLLL() {
        ComponentName componentName;
        String className;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Context LIZ2 = LHQ.LIZ(AnonymousClass425.LIZ(), false, 2, null);
        if (!(LIZ2 instanceof Activity)) {
            LIZ2 = null;
        }
        Activity activity = (Activity) LIZ2;
        if (activity == null || (componentName = activity.getComponentName()) == null || (className = componentName.getClassName()) == null) {
            return "null";
        }
        return className;
    }

    /* renamed from: LJ */
    public final Activity m15621LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (Activity) proxy.result;
        }
        Context LIZ2 = LHQ.LIZ(AnonymousClass425.LIZ(), false, 2, null);
        if (!(LIZ2 instanceof Activity)) {
            LIZ2 = null;
        }
        return (Activity) LIZ2;
    }

    public final boolean LJIIIIZZ() {
        AbstractC413402Xu<Boolean> m15622LJ;
        Boolean LIZIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 18);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C5185b c5185b = this.LJII;
        if (c5185b == null || (m15622LJ = c5185b.m15622LJ()) == null || (LIZIZ = m15622LJ.LIZIZ()) == null) {
            return false;
        }
        return LIZIZ.booleanValue();
    }

    public final boolean LJIJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 34);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return NotificationManagerCompat.from(AnonymousClass425.LIZ()).areNotificationsEnabled();
    }

    public final boolean LJIJJ() {
        C2WC<Boolean> LJIJ;
        Boolean LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 35);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C5185b c5185b = this.LJII;
        if (c5185b == null || (LJIJ = c5185b.LJIJ()) == null || (LIZ2 = LJIJ.LIZ()) == null) {
            return false;
        }
        return LIZ2.booleanValue();
    }

    public final LiveMode LJFF() {
        C5184a c5184a;
        Object obj;
        C2WC<C5184a> LIZ2;
        C5184a LIZ3;
        C2WC<C5184a> LIZ4;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 14);
        if (proxy.isSupported) {
            return (LiveMode) proxy.result;
        }
        C5185b c5185b = this.LJII;
        if (c5185b != null && (LIZ4 = c5185b.LIZ()) != null) {
            c5184a = LIZ4.LIZ();
        } else {
            c5184a = null;
        }
        LIZ(c5184a);
        C5185b c5185b2 = this.LJII;
        if (c5185b2 != null && (LIZ2 = c5185b2.LIZ()) != null && (LIZ3 = LIZ2.LIZ()) != null) {
            obj = LIZ3.LIZIZ;
        } else {
            obj = null;
        }
        if (!(obj instanceof LiveMode)) {
            obj = null;
        }
        LiveMode liveMode = (LiveMode) obj;
        if (liveMode == null) {
            return LiveMode.VIDEO;
        }
        return liveMode;
    }

    public final boolean LJI() {
        C5184a c5184a;
        Object obj;
        C2WC<C5184a> LJIIJJI;
        C5184a LIZ2;
        C2WC<C5184a> LJIIJJI2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C5185b c5185b = this.LJII;
        if (c5185b != null && (LJIIJJI2 = c5185b.LJIIJJI()) != null) {
            c5184a = LJIIJJI2.LIZ();
        } else {
            c5184a = null;
        }
        LIZ(c5184a);
        C5185b c5185b2 = this.LJII;
        if (c5185b2 != null && (LJIIJJI = c5185b2.LJIIJJI()) != null && (LIZ2 = LJIIJJI.LIZ()) != null) {
            obj = LIZ2.LIZIZ;
        } else {
            obj = null;
        }
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int LJII() {
        C5184a c5184a;
        Object obj;
        C2WC<C5184a> LJIIJ;
        C5184a LIZ2;
        C2WC<C5184a> LJIIJ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 17);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C5185b c5185b = this.LJII;
        if (c5185b != null && (LJIIJ2 = c5185b.LJIIJ()) != null) {
            c5184a = LJIIJ2.LIZ();
        } else {
            c5184a = null;
        }
        LIZ(c5184a);
        C5185b c5185b2 = this.LJII;
        if (c5185b2 != null && (LJIIJ = c5185b2.LJIIJ()) != null && (LIZ2 = LJIIJ.LIZ()) != null) {
            obj = LIZ2.LIZIZ;
        } else {
            obj = null;
        }
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final boolean LJIIIZ() {
        C5184a c5184a;
        Object obj;
        C2WC<C5184a> LJIIIZ;
        C5184a LIZ2;
        C2WC<C5184a> LJIIIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C5185b c5185b = this.LJII;
        if (c5185b != null && (LJIIIZ2 = c5185b.LJIIIZ()) != null) {
            c5184a = LJIIIZ2.LIZ();
        } else {
            c5184a = null;
        }
        LIZ(c5184a);
        C5185b c5185b2 = this.LJII;
        if (c5185b2 != null && (LJIIIZ = c5185b2.LJIIIZ()) != null && (LIZ2 = LJIIIZ.LIZ()) != null) {
            obj = LIZ2.LIZIZ;
        } else {
            obj = null;
        }
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean LJIIJ() {
        C5184a c5184a;
        Object obj;
        C2WC<C5184a> LJI;
        C5184a LIZ2;
        C2WC<C5184a> LJI2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 21);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C5185b c5185b = this.LJII;
        if (c5185b != null && (LJI2 = c5185b.LJI()) != null) {
            c5184a = LJI2.LIZ();
        } else {
            c5184a = null;
        }
        LIZ(c5184a);
        C5185b c5185b2 = this.LJII;
        if (c5185b2 != null && (LJI = c5185b2.LJI()) != null && (LIZ2 = LJI.LIZ()) != null) {
            obj = LIZ2.LIZIZ;
        } else {
            obj = null;
        }
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean LJIIJJI() {
        C5184a c5184a;
        Object obj;
        C2WC<C5184a> LJII;
        C5184a LIZ2;
        C2WC<C5184a> LJII2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 22);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C5185b c5185b = this.LJII;
        if (c5185b != null && (LJII2 = c5185b.LJII()) != null) {
            c5184a = LJII2.LIZ();
        } else {
            c5184a = null;
        }
        LIZ(c5184a);
        C5185b c5185b2 = this.LJII;
        if (c5185b2 != null && (LJII = c5185b2.LJII()) != null && (LIZ2 = LJII.LIZ()) != null) {
            obj = LIZ2.LIZIZ;
        } else {
            obj = null;
        }
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean LJIIL() {
        C5184a c5184a;
        Object obj;
        C2WC<C5184a> LJIIIIZZ;
        C5184a LIZ2;
        C2WC<C5184a> LJIIIIZZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 23);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C5185b c5185b = this.LJII;
        if (c5185b != null && (LJIIIIZZ2 = c5185b.LJIIIIZZ()) != null) {
            c5184a = LJIIIIZZ2.LIZ();
        } else {
            c5184a = null;
        }
        LIZ(c5184a);
        C5185b c5185b2 = this.LJII;
        if (c5185b2 != null && (LJIIIIZZ = c5185b2.LJIIIIZZ()) != null && (LIZ2 = LJIIIIZZ.LIZ()) != null) {
            obj = LIZ2.LIZIZ;
        } else {
            obj = null;
        }
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean LJIILIIL() {
        C5184a c5184a;
        Object obj;
        C2WC<C5184a> LJIIZILJ;
        C5184a LIZ2;
        C2WC<C5184a> LJIIZILJ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 24);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C5185b c5185b = this.LJII;
        if (c5185b != null && (LJIIZILJ2 = c5185b.LJIIZILJ()) != null) {
            c5184a = LJIIZILJ2.LIZ();
        } else {
            c5184a = null;
        }
        LIZ(c5184a);
        C5185b c5185b2 = this.LJII;
        if (c5185b2 != null && (LJIIZILJ = c5185b2.LJIIZILJ()) != null && (LIZ2 = LJIIZILJ.LIZ()) != null) {
            obj = LIZ2.LIZIZ;
        } else {
            obj = null;
        }
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean LJIILJJIL() {
        C5184a c5184a;
        Object obj;
        C2WC<C5184a> LJIILLIIL;
        C5184a LIZ2;
        C2WC<C5184a> LJIILLIIL2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 25);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C5185b c5185b = this.LJII;
        if (c5185b != null && (LJIILLIIL2 = c5185b.LJIILLIIL()) != null) {
            c5184a = LJIILLIIL2.LIZ();
        } else {
            c5184a = null;
        }
        LIZ(c5184a);
        C5185b c5185b2 = this.LJII;
        if (c5185b2 != null && (LJIILLIIL = c5185b2.LJIILLIIL()) != null && (LIZ2 = LJIILLIIL.LIZ()) != null) {
            obj = LIZ2.LIZIZ;
        } else {
            obj = null;
        }
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean LJIILL() {
        C5184a c5184a;
        Object obj;
        C2WC<C5184a> LJIILL;
        C5184a LIZ2;
        C2WC<C5184a> LJIILL2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 26);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C5185b c5185b = this.LJII;
        if (c5185b != null && (LJIILL2 = c5185b.LJIILL()) != null) {
            c5184a = LJIILL2.LIZ();
        } else {
            c5184a = null;
        }
        LIZ(c5184a);
        C5185b c5185b2 = this.LJII;
        if (c5185b2 != null && (LJIILL = c5185b2.LJIILL()) != null && (LIZ2 = LJIILL.LIZ()) != null) {
            obj = LIZ2.LIZIZ;
        } else {
            obj = null;
        }
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean LJIILLIIL() {
        C5184a c5184a;
        Object obj;
        C2WC<C5184a> LJIILJJIL;
        C5184a LIZ2;
        C2WC<C5184a> LJIILJJIL2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 27);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C5185b c5185b = this.LJII;
        if (c5185b != null && (LJIILJJIL2 = c5185b.LJIILJJIL()) != null) {
            c5184a = LJIILJJIL2.LIZ();
        } else {
            c5184a = null;
        }
        LIZ(c5184a);
        C5185b c5185b2 = this.LJII;
        if (c5185b2 != null && (LJIILJJIL = c5185b2.LJIILJJIL()) != null && (LIZ2 = LJIILJJIL.LIZ()) != null) {
            obj = LIZ2.LIZIZ;
        } else {
            obj = null;
        }
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean LJIIZILJ() {
        C5184a c5184a;
        Object obj;
        C2WC<C5184a> LJIILIIL;
        C5184a LIZ2;
        C2WC<C5184a> LJIILIIL2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 31);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C5185b c5185b = this.LJII;
        if (c5185b != null && (LJIILIIL2 = c5185b.LJIILIIL()) != null) {
            c5184a = LJIILIIL2.LIZ();
        } else {
            c5184a = null;
        }
        LIZ(c5184a);
        C5185b c5185b2 = this.LJII;
        if (c5185b2 != null && (LJIILIIL = c5185b2.LJIILIIL()) != null && (LIZ2 = LJIILIIL.LIZ()) != null) {
            obj = LIZ2.LIZIZ;
        } else {
            obj = null;
        }
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean LJIJ() {
        C5184a c5184a;
        Object obj;
        C2WC<C5184a> LJIIL;
        C5184a LIZ2;
        C2WC<C5184a> LJIIL2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 32);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C5185b c5185b = this.LJII;
        if (c5185b != null && (LJIIL2 = c5185b.LJIIL()) != null) {
            c5184a = LJIIL2.LIZ();
        } else {
            c5184a = null;
        }
        LIZ(c5184a);
        C5185b c5185b2 = this.LJII;
        if (c5185b2 != null && (LJIIL = c5185b2.LJIIL()) != null && (LIZ2 = LJIIL.LIZ()) != null) {
            obj = LIZ2.LIZIZ;
        } else {
            obj = null;
        }
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean LIZ() {
        C2WC<Boolean> LIZIZ;
        Observable<Boolean> LIZIZ2;
        Disposable subscribe;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C8030j.LIZLLL.LIZ().LIZ(LJIL());
        C5185b c5185b = this.LJII;
        if (c5185b != null && (LIZIZ = c5185b.LIZIZ()) != null && (LIZIZ2 = LIZIZ.LIZIZ()) != null && (subscribe = LIZIZ2.subscribe(new IN2(this))) != null) {
            LIZ(subscribe);
            return true;
        }
        return true;
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJFF = str;
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJI = str;
    }

    private final Boolean LIZ(Disposable disposable) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 41);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        CompositeDisposable compositeDisposable = this.LJIIIIZZ;
        if (compositeDisposable != null) {
            return Boolean.valueOf(compositeDisposable.add(disposable));
        }
        return null;
    }

    private void LIZ(C5184a c5184a) {
        long j;
        if (PatchProxy.proxy(new Object[]{c5184a}, this, LIZ, false, 8).isSupported) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (c5184a != null) {
            j = c5184a.LIZJ;
        } else {
            j = 0;
        }
        long j2 = currentTimeMillis - j;
        SettingKey<Long> settingKey = LiveConfigSettingKeys.LIVE_CHECK_PERMISSION_TIME_DELAY_RELEASE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Long value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (j2 <= value.longValue()) {
            this.f26532LJ = true;
        }
    }

    public final boolean LIZJ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 37);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(str);
        SettingKey<List<String>> settingKey = LiveConfigSettingKeys.LIVE_CHECK_PERMISSION_PAGE_WHITE_LIST;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        for (String str2 : settingKey.getValue()) {
            Intrinsics.checkNotNullExpressionValue(str2, "");
            if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) str2, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }
}
