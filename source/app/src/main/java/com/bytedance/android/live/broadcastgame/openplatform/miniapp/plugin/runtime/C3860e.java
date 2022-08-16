package com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.runtime;

import android.content.Context;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.broadcastgame.api.openplatform.PluginType;
import com.bytedance.android.live.broadcastgame.opengame.AbstractC3497h;
import com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3665n;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import p003X.AbstractC87645KgB;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.runtime.e */
/* loaded from: classes5.dex */
public final class C3860e extends AbstractC87645KgB {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ = true;

    static {
        Covode.recordClassIndex(21790);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3664m
    public final void LJII() {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3664m
    public final String LJIIIIZZ() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3664m
    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported || this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        LJIILL().onHide();
    }

    @Override // p003X.AbstractC87645KgB
    public final C3682x LIZIZ(Map<String, ? extends Object> map) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (C3682x) proxy.result;
        }
        C106862S5w.LIZ(map);
        return new C3682x(this.LJIIL, this.LJIILIIL, this.LJIILLIIL, this, null, LJIILJJIL(), map, this.LJIILL, true, null, 512);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3664m
    public final void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        LJIILL().onFail(str);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3664m
    public final void LIZJ(Map<String, String> map) {
        if (!PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 2).isSupported && this.LIZIZ) {
            this.LIZIZ = false;
            LJIILL().onStart();
            LJIILL().onShow(map);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3664m
    public final void LIZ(String str, boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        LJIILL().onStop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3860e(Context context, DataCenter dataCenter, long j, boolean z, AbstractC3497h abstractC3497h) {
        super(context, null, -1L, false, null);
        C106862S5w.LIZ(context);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3664m
    public final void LIZ(String str, PluginType pluginType, Map<String, ? extends Object> map, boolean z, AbstractC3665n abstractC3665n) {
        if (PatchProxy.proxy(new Object[]{str, pluginType, map, Byte.valueOf(z ? (byte) 1 : (byte) 0), abstractC3665n}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, pluginType, map);
        Object obj = map.get("game");
        Map<String, String> map2 = null;
        Object obj2 = null;
        if (!(obj instanceof C3384q)) {
            obj = null;
        }
        C3384q c3384q = (C3384q) obj;
        if (c3384q == null) {
            return;
        }
        LIZ(c3384q);
        C3383p LJFF = LJIILLIIL().LJFF();
        if (LJFF != null) {
            LIZ(LJFF.LIZLLL, LJFF.LJLIIIL, LJFF.LJLILLLLZI, str, pluginType, map, z);
        }
        this.LJIIIZ = abstractC3665n;
        LJIILL().onLaunch();
        if (z) {
            Object obj3 = map.get("enter_position");
            if (obj3 != null) {
                if (obj3 instanceof String) {
                    obj2 = obj3;
                }
                if (obj2 == null) {
                    obj2 = "";
                }
                map2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m137to("enter_position", obj2));
            }
            LIZJ(map2);
        }
    }
}
