package com.bytedance.android.live.broadcastgame.opengame;

import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.broadcastgame.api.openplatform.PluginType;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3657d;
import com.bytedance.android.live.broadcastgame.opengame.runtime.LaunchMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import java.util.Map;
import kotlin.Deprecated;
import p003X.C106862S5w;
import p003X.C87609Kfb;
import p003X.C87675Kgf;
import p003X.C87679Kgj;
import p003X.C87907KkP;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.p */
/* loaded from: classes5.dex */
public final class C3607p {
    public static ChangeQuickRedirect LIZ;
    public static final C87675Kgf LJIILJJIL = new C87675Kgf((byte) 0);
    public boolean LIZLLL;

    /* renamed from: LJ */
    public boolean f26076LJ;
    public volatile boolean LJFF;
    public long LJI;
    public String LJII;
    public String LJIIIIZZ;
    public Map<String, ? extends Object> LJIIIZ;
    public String LJIIL;
    public PluginType LJIILIIL;
    public C3657d LJIIJ = null;
    public File LJIIJJI = null;
    public long LIZIZ = -1;
    public String LIZJ = "";

    static {
        Covode.recordClassIndex(20741);
    }

    @Deprecated(message = "废弃，不要使用该方法获取启动状态")
    public final int LJFF() {
        return LJIILJJIL.LIZ(this.LJIIL);
    }

    public final String LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C3384q LIZ2 = LIZ();
        if (LIZ2 != null) {
            return LIZ2.LJFF;
        }
        return null;
    }

    public final C3384q LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (C3384q) proxy.result;
        }
        Object obj = this.LJIIIZ.get("game");
        if (!(obj instanceof C3384q)) {
            obj = null;
        }
        return (C3384q) obj;
    }

    public final String LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Object obj = this.LJIIIZ.get("OPEN_APP_NAME");
        if (!(obj instanceof String)) {
            obj = null;
        }
        return (String) obj;
    }

    public final int LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        Object obj = this.LJIIIZ.get("business_type");
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: LJ */
    public final String m15846LJ() {
        String LIZLLL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C3384q LIZ2 = LIZ();
        if (LIZ2 == null || (LIZLLL = LIZ2.LIZLLL()) == null) {
            return "";
        }
        return LIZLLL;
    }

    public final LaunchMode LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (LaunchMode) proxy.result;
        }
        if (!C87679Kgj.LIZ(this.LJIIL) && !C87907KkP.LIZLLL.LIZ(this.LJIIL)) {
            if (C87609Kfb.LIZ(this.LJIIL)) {
                return LaunchMode.FROM_PREVIEW;
            }
            return LaunchMode.FROM_PANEL;
        }
        return LaunchMode.FROM_DEBUG;
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LIZJ = str;
    }

    public final String LIZ(boolean z) {
        String LIZJ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (z) {
            LIZJ = LIZIZ();
            if (LIZJ == null) {
                return "";
            }
        } else {
            LIZJ = LIZJ();
            if (LIZJ == null) {
                return "";
            }
        }
        return LIZJ;
    }

    public final int LIZIZ(boolean z) {
        C3383p LJFF;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (z) {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
            if (proxy2.isSupported) {
                return ((Integer) proxy2.result).intValue();
            }
            C3384q LIZ2 = LIZ();
            if (LIZ2 == null || (LJFF = LIZ2.LJFF()) == null) {
                return 0;
            }
            return LJFF.LIZJ;
        }
        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy3.isSupported) {
            return ((Integer) proxy3.result).intValue();
        }
        Object obj = this.LJIIIZ.get("game_type");
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public C3607p(long j, String str, String str2, Map<String, ? extends Object> map, C3657d c3657d, File file, String str3, boolean z, PluginType pluginType) {
        C106862S5w.LIZ(str, str2, map, str3, pluginType);
        this.LJI = j;
        this.LJII = str;
        this.LJIIIIZZ = str2;
        this.LJIIIZ = map;
        this.LJIIL = str3;
        this.LJIILIIL = pluginType;
    }
}
