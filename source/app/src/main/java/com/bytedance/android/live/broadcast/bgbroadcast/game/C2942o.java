package com.bytedance.android.live.broadcast.bgbroadcast.game;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.live.broadcast.bgbroadcast.game.window.AbstractC2948d;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC88823KzB;
import p003X.C106862S5w;
import p003X.C88794Kyi;
import p003X.C88795Kyj;
import p003X.C88796Kyk;
import p003X.C88797Kyl;
import p003X.C88798Kym;
import p003X.C88799Kyn;
import p003X.C88804Kys;
import p003X.C88824KzC;
import p003X.C88856Kzi;
import p003X.LK1;
import p003X.LK5;
import p003X.RunnableC88793Kyh;
import p003X.RunnableC88820Kz8;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.game.o */
/* loaded from: classes5.dex */
public final class C2942o {
    public static ChangeQuickRedirect LIZ;

    /* renamed from: LJ */
    public final int f25786LJ;
    public final int LJFF;
    public long LJIILIIL;
    public final Handler LJIILLIIL = new Handler(Looper.getMainLooper());
    public final int LIZIZ = LK5.LIZ(10.0f);
    public final int LIZJ = this.LIZIZ + UIUtils.getStatusBarHeight(LK5.LJIIJ());
    public final int LIZLLL = this.LIZIZ;
    public final int LJIIZILJ = LK1.LIZLLL(6);
    public final List<AbstractC2936ak> LJI = new ArrayList();
    public final LinkedHashMap<String, AbstractC2948d> LJII = new LinkedHashMap<>();
    public C88799Kyn LJIIIIZZ = new C88799Kyn(this, "default");
    public final C88799Kyn LJIIIZ = new C88796Kyk(this, "initState");
    public final C88799Kyn LJIIJ = new C88798Kym(this, "hiddenState");
    public final C88799Kyn LJIIJJI = new C88797Kyl(this, "floatingState");
    public final C88799Kyn LJIIL = new C88804Kys(this, "destroyState");
    public final C88799Kyn LJIILJJIL = new C88795Kyj(this, "snappedState");
    public final C88799Kyn LJIILL = new C88794Kyi(this, "draggingState");

    static {
        Covode.recordClassIndex(14823);
    }

    public final void LIZ(String str, AbstractC2948d abstractC2948d) {
        if (PatchProxy.proxy(new Object[]{str, abstractC2948d}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, abstractC2948d);
        if (this.LJII.containsKey(str)) {
            return;
        }
        this.LJII.put(str, abstractC2948d);
        abstractC2948d.mo15911l_();
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        AbstractC2948d remove = this.LJII.remove(str);
        if (remove == null) {
            return;
        }
        C88856Kzi LIZIZ = remove.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.LIZLLL();
        }
        remove.LJII();
        if (!(remove instanceof AbstractC2936ak)) {
            return;
        }
        this.LJI.remove(remove);
    }

    public final boolean LIZ(AbstractC2936ak abstractC2936ak) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC2936ak}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(abstractC2936ak);
        return this.LJI.add(abstractC2936ak);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f8, code lost:
        if (r6 != false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(boolean r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.bgbroadcast.game.C2942o.LIZ(boolean, int, int):void");
    }

    public final void LIZ(String str, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{str, bool}, this, LIZ, false, 18).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (!this.LJII.containsKey(str)) {
            return;
        }
        AbstractC2948d abstractC2948d = this.LJII.get(str);
        if (abstractC2948d != null && abstractC2948d.LJI()) {
            return;
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            m15912LJ();
            AbstractC2948d abstractC2948d2 = this.LJII.get(str);
            if (abstractC2948d2 == null) {
                return;
            }
            abstractC2948d2.mo15910m_();
            return;
        }
        for (Map.Entry<String, AbstractC2948d> entry : this.LJII.entrySet()) {
            if (TextUtils.equals(entry.getKey(), str)) {
                break;
            } else if (entry.getValue().LJI()) {
                return;
            }
        }
        m15912LJ();
        AbstractC2948d abstractC2948d3 = this.LJII.get(str);
        if (abstractC2948d3 == null) {
            return;
        }
        abstractC2948d3.mo15910m_();
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        for (Map.Entry<String, AbstractC2948d> entry : this.LJII.entrySet()) {
            C88856Kzi LIZIZ = entry.getValue().LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.LIZLLL();
            }
        }
        this.LJII.clear();
    }

    public final int LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC2948d abstractC2948d = this.LJII.get("control_view");
        if (abstractC2948d == null) {
            return 0;
        }
        return abstractC2948d.LJIIIZ() + this.LJIIZILJ;
    }

    public final boolean LIZLLL() {
        int i;
        C88856Kzi LIZIZ;
        C88824KzC c88824KzC;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC2948d abstractC2948d = this.LJII.get("control_view");
        if (abstractC2948d != null && (LIZIZ = abstractC2948d.LIZIZ()) != null && (c88824KzC = LIZIZ.LIZIZ) != null) {
            i = c88824KzC.LIZLLL();
        } else {
            i = 0;
        }
        if (i >= this.LIZLLL) {
            return false;
        }
        return true;
    }

    /* renamed from: LJ */
    private final void m15912LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        for (Map.Entry<String, AbstractC2948d> entry : this.LJII.entrySet()) {
            String key = entry.getKey();
            int hashCode = key.hashCode();
            if (hashCode != -1622908857) {
                if (hashCode == 1349587470 && key.equals("tray_view")) {
                }
                entry.getValue().LJFF();
            } else if (key.equals("control_view")) {
                AbstractC2948d abstractC2948d = this.LJII.get(entry.getKey());
                if (!(abstractC2948d instanceof AbstractC88823KzB)) {
                    abstractC2948d = null;
                }
                AbstractC88823KzB abstractC88823KzB = (AbstractC88823KzB) abstractC2948d;
                if (abstractC88823KzB != null) {
                    abstractC88823KzB.LIZIZ(false);
                }
            } else {
                entry.getValue().LJFF();
            }
        }
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        for (Map.Entry<String, AbstractC2948d> entry : this.LJII.entrySet()) {
            if (!TextUtils.equals(entry.getKey(), "control_view") && !TextUtils.equals(entry.getKey(), "tray_view")) {
                LIZ(entry.getValue().LIZIZ(), LIZIZ(), this.LJFF);
            }
        }
    }

    public final void LIZ(Command command) {
        if (PatchProxy.proxy(new Object[]{command}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(command);
        if (Intrinsics.areEqual(this.LJIIIIZZ, this.LJIIL)) {
            ALogger.m15800e("GameUiStateMachine", "stateMachine is destroy, cmd=" + command);
            return;
        }
        C88799Kyn c88799Kyn = this.LJIIIIZZ;
        command.currentState = c88799Kyn;
        c88799Kyn.LIZ(command);
    }

    public final void LIZ(C88856Kzi c88856Kzi, boolean z) {
        if (PatchProxy.proxy(new Object[]{c88856Kzi, (byte) 1}, this, LIZ, false, 10).isSupported) {
            return;
        }
        this.LJIILLIIL.postDelayed(new RunnableC88793Kyh(this, c88856Kzi), 0L);
    }

    public final void LIZ(C88856Kzi c88856Kzi, int i, int i2) {
        AbstractC2948d abstractC2948d;
        C88856Kzi LIZIZ;
        if (!PatchProxy.proxy(new Object[]{c88856Kzi, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 14).isSupported && (abstractC2948d = this.LJII.get("control_view")) != null && (LIZIZ = abstractC2948d.LIZIZ()) != null && LIZIZ.m23443LJ() && c88856Kzi != null && c88856Kzi.m23443LJ()) {
            C88824KzC c88824KzC = LIZIZ.LIZIZ;
            Intrinsics.checkNotNullExpressionValue(c88824KzC, "");
            float LIZLLL = c88824KzC.LIZLLL();
            C88824KzC c88824KzC2 = LIZIZ.LIZIZ;
            Intrinsics.checkNotNullExpressionValue(c88824KzC2, "");
            float mo23445LJ = c88824KzC2.mo23445LJ();
            c88856Kzi.LIZIZ.LIZ((int) (LIZLLL + i));
            c88856Kzi.LIZIZ.LIZIZ((int) (mo23445LJ + i2));
        }
    }

    public final void LIZ(C88856Kzi c88856Kzi, C88856Kzi c88856Kzi2, int i, int i2) {
        if (!PatchProxy.proxy(new Object[]{c88856Kzi, c88856Kzi2, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 15).isSupported && c88856Kzi != null && c88856Kzi.m23443LJ() && c88856Kzi2 != null && c88856Kzi2.m23443LJ()) {
            C88824KzC c88824KzC = c88856Kzi.LIZIZ;
            Intrinsics.checkNotNullExpressionValue(c88824KzC, "");
            float LIZLLL = c88824KzC.LIZLLL();
            C88824KzC c88824KzC2 = c88856Kzi.LIZIZ;
            Intrinsics.checkNotNullExpressionValue(c88824KzC2, "");
            float mo23445LJ = c88824KzC2.mo23445LJ();
            c88856Kzi2.LIZIZ.LIZ((int) (LIZLLL + i));
            c88856Kzi2.LIZIZ.LIZIZ((int) (mo23445LJ + i2));
        }
    }

    public static /* synthetic */ void LIZ(C2942o c2942o, C88799Kyn c88799Kyn, Command command, boolean z, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{c2942o, c88799Kyn, command, (byte) 0, Integer.valueOf(i), null}, null, LIZ, true, 9).isSupported) {
            return;
        }
        if ((i & 2) != 0) {
            command = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        if (!PatchProxy.proxy(new Object[]{c88799Kyn, command, Byte.valueOf(b)}, c2942o, LIZ, false, 8).isSupported) {
            GameUiStateMachine$transitionToState$action$1 gameUiStateMachine$transitionToState$action$1 = new GameUiStateMachine$transitionToState$action$1(c2942o, c88799Kyn, command);
            if (z) {
                c2942o.LJIILLIIL.post(new RunnableC88820Kz8(gameUiStateMachine$transitionToState$action$1));
            } else {
                gameUiStateMachine$transitionToState$action$1.mo30099invoke();
            }
        }
    }
}
