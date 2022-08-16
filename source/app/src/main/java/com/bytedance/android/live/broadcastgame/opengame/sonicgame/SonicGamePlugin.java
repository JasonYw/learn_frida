package com.bytedance.android.live.broadcastgame.opengame.sonicgame;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcastgame.opengame.network.C3531a;
import com.bytedance.android.live.broadcastgame.opengame.openapi.C3604ae;
import com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d;
import com.bytedance.android.live.broadcastgame.opengame.panel.FullScreenOpenPanel;
import com.bytedance.android.live.broadcastgame.opengame.panel.PanelType;
import com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3661j;
import com.bytedance.android.live.broadcastgame.opengame.runtime.BootInfoService;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3657d;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3658f;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostApp;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.config.C6966ev;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bdp.live.livecontainer.base.schema.LiveSchemaInfo;
import com.bytedance.bdp.live.livecontainer.sonicgame.AbstractC11524d;
import com.bytedance.bdp.live.livecontainer.sonicgame.C11526j;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import io.reactivex.Observable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC87834KjE;
import p003X.AbstractC87953Kl9;
import p003X.AbstractC87957KlD;
import p003X.AbstractC87959KlF;
import p003X.AbstractC87969KlP;
import p003X.AbstractC87976KlW;
import p003X.AnonymousClass425;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C87681Kgl;
import p003X.C87711KhF;
import p003X.C87825Kj5;
import p003X.C87954KlA;
import p003X.C87955KlB;
import p003X.C87956KlC;
import p003X.C87967KlN;
import p003X.C87968KlO;
import p003X.C87995Klp;
import p003X.C88009Km3;
import p003X.C88331KrF;

/* loaded from: classes5.dex */
public final class SonicGamePlugin extends AbstractC87953Kl9 implements AbstractC87976KlW {
    public static ChangeQuickRedirect LIZ;
    public AbstractC87969KlP LIZIZ;
    public String LIZJ;
    public SonicState LIZLLL;

    /* renamed from: LJ */
    public C87956KlC f26094LJ;
    public final List<Class<Object>> LJII;
    public AbstractC3609d LJIIIIZZ;
    public final C3682x LJIIIZ;
    public volatile AbstractC87976KlW LJIIJJI;
    public final Lazy LJIIJ = LazyKt__LazyJVMKt.lazy(new SonicGamePlugin$pluginLauncher$2(this));
    public String LJFF = "com.bytedance.android.ttlivesdk.live.LiveBgBroadcastActivity";
    public String LJI = "com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity";
    public final C87954KlA LJIIL = new C87954KlA(this);

    /* loaded from: classes5.dex */
    public enum SonicState {
        RESUME,
        PAUSE,
        DESTROY;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21097);
        }

        public static SonicState valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (SonicState) (proxy.isSupported ? proxy.result : Enum.valueOf(SonicState.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static SonicState[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (SonicState[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(21096);
    }

    public final AbstractC87959KlF<C11526j, AbstractC11524d> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (AbstractC87959KlF) (proxy.isSupported ? proxy.result : this.LJIIJ.mo27335getValue());
    }

    @Override // p003X.AbstractC87976KlW
    public final void LIZ() {
        AbstractC87976KlW m15839LJ;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported && (m15839LJ = m15839LJ()) != null) {
            m15839LJ.LIZ();
        }
    }

    @Override // p003X.AbstractC87976KlW
    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        AbstractC87976KlW m15839LJ = m15839LJ();
        if (m15839LJ != null) {
            m15839LJ.LIZJ();
        }
        this.LJIIJJI = null;
    }

    @Override // p003X.AbstractC87953Kl9, com.bytedance.android.live.broadcastgame.opengame.service.SimplePanelStateDispatchService.AbstractC3712a
    public final void onPanelRealHide() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onPanelRealHide();
        LIZ(this, SonicState.PAUSE, false, 2, null);
    }

    @Override // p003X.AbstractC87953Kl9, com.bytedance.android.live.broadcastgame.opengame.service.SimplePanelStateDispatchService.AbstractC3712a
    public final void onPanelRealShow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onPanelRealShow();
        LIZ(this, SonicState.RESUME, false, 2, null);
    }

    /* renamed from: LJ */
    private final AbstractC87976KlW m15839LJ() {
        C87995Klp c87995Klp;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (AbstractC87976KlW) proxy.result;
        }
        if (this.LJIIJJI != null) {
            return this.LJIIJJI;
        }
        if (LIZIZ() != null) {
            c87995Klp = new C87995Klp(this.LJIIIZ, LIZIZ(), new C87968KlO(this));
        } else {
            c87995Klp = null;
        }
        this.LJIIJJI = c87995Klp;
        return this.LJIIJJI;
    }

    @Override // p003X.AbstractC87830KjA, com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3659g
    public final Observable<Bitmap> captureView() {
        ViewGroup viewGroup;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        C88331KrF c88331KrF = C88331KrF.LIZIZ;
        AbstractC3609d abstractC3609d = this.LJIIIIZZ;
        Window window = null;
        if (abstractC3609d != null) {
            viewGroup = abstractC3609d.LIZJ();
        } else {
            viewGroup = null;
        }
        AbstractC3609d abstractC3609d2 = this.LJIIIIZZ;
        if (abstractC3609d2 != null) {
            window = abstractC3609d2.LIZLLL();
        }
        return c88331KrF.LIZ(viewGroup, window);
    }

    @Override // p003X.AbstractC87953Kl9
    public final boolean initPanelOnLaunch() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        SettingKey<C6966ev> settingKey = LiveSettingKeys.LIVE_OPEN_PLATFORM_PANEL_IML_SWITCH;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (settingKey.getValue().LIZ == 2) {
            return false;
        }
        return true;
    }

    @Override // p003X.AbstractC87953Kl9, p003X.AbstractC87830KjA, com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3659g
    public final void onHide() {
        DataCenter dataCenter;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        if (this.LJIIIZ.LJIIIIZZ.LJFF && (dataCenter = this.LJIIIZ.f26082LJ) != null) {
            dataCenter.put("cast_game_panel_height_change", 0);
        }
        super.onHide();
        LIZ(this, SonicState.PAUSE, false, 2, null);
    }

    @Override // p003X.AbstractC87953Kl9, p003X.AbstractC87830KjA, com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3659g
    public final void onStop() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        LIZJ();
        this.LJIIIZ.LIZJ = null;
        AnonymousClass425.LIZ().unregisterActivityLifecycleCallbacks(this.LJIIL);
        this.LJIIIIZZ = null;
        super.onStop();
        LIZ(this, SonicState.DESTROY, false, 2, null);
        this.f26094LJ.LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
        if (r1 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZLLL() {
        /*
            r6 = this;
            r3 = 0
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcastgame.opengame.sonicgame.SonicGamePlugin.LIZ
            r0 = 12
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r6, r1, r3, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L10
            return
        L10:
            com.bytedance.android.live.broadcastgame.opengame.runtime.x r1 = r6.LJIIIZ
            java.lang.String r0 = "game_config"
            java.lang.Object r1 = r1.LIZIZ(r0)
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            r5 = 1
            r4 = 0
            if (r1 == 0) goto L2e
            java.lang.String r0 = "liveOpenConfig"
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch: org.json.JSONException -> L39
            if (r1 == 0) goto L2e
            java.lang.String r0 = "panelMoreBtnColor"
            java.lang.String r1 = r1.getString(r0)     // Catch: org.json.JSONException -> L39
            if (r1 != 0) goto L30
        L2e:
            java.lang.String r1 = ""
        L30:
            com.bytedance.android.live.broadcastgame.opengame.sonicgame.SonicGamePlugin$initSonicContext$1 r0 = new com.bytedance.android.live.broadcastgame.opengame.sonicgame.SonicGamePlugin$initSonicContext$1     // Catch: org.json.JSONException -> L39
            r0.<init>(r1)     // Catch: org.json.JSONException -> L39
            p003X.AbstractC87953Kl9.withPanel$default(r6, r4, r0, r5, r4)     // Catch: org.json.JSONException -> L39
            goto L43
        L39:
            r3 = move-exception
            X.KkT r2 = p003X.C87911KkT.LIZIZ
            java.lang.String r1 = "BaseLiveGameWithPanel"
            java.lang.String r0 = "小游戏插件更多按钮主题色解析失败"
            r2.LIZ(r3, r1, r0)
        L43:
            com.bytedance.android.live.broadcastgame.opengame.sonicgame.SonicGamePlugin$initSonicContext$2 r0 = new com.bytedance.android.live.broadcastgame.opengame.sonicgame.SonicGamePlugin$initSonicContext$2
            r0.<init>(r6)
            p003X.AbstractC87953Kl9.withPanel$default(r6, r4, r0, r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.opengame.sonicgame.SonicGamePlugin.LIZLLL():void");
    }

    @Override // p003X.AbstractC87953Kl9, p003X.AbstractC87830KjA, com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3659g
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onStart();
        AbstractC87834KjE abstractC87834KjE = this.openApi;
        if (abstractC87834KjE != null) {
            abstractC87834KjE.LIZ(this.f26094LJ, new C3604ae(this.LJIIIZ.LJIIIIZZ.LJII, this.LJIIIZ.LJIIIIZZ(), this.LJIIIZ.LIZLLL, this.launchMode, this.LJIIIZ.LJIIIIZZ.LJI, this.LJIIIZ.LJIIIIZZ.LIZ(this.isAnchor)));
        }
        AnonymousClass425.LIZ().registerActivityLifecycleCallbacks(this.LJIIL);
        LIZLLL();
    }

    @Override // p003X.AbstractC87953Kl9
    public final AbstractC87957KlD createOpenPanelFactory() {
        C3658f c3658f;
        List<C3531a.C3532a> list;
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 14);
        if (proxy.isSupported) {
            return (AbstractC87957KlD) proxy.result;
        }
        SettingKey<C6966ev> settingKey = LiveSettingKeys.LIVE_OPEN_PLATFORM_PANEL_IML_SWITCH;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        int i = settingKey.getValue().LIZ;
        if (i != 1) {
            if (i != 2) {
                return LIZ(false);
            }
            BootInfoService bootInfoService = (BootInfoService) this.LJIIIZ.LIZ((Class<AbstractC3719c>) BootInfoService.class);
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], bootInfoService, BootInfoService.LIZ, false, 6);
            if (proxy2.isSupported) {
                z = ((Boolean) proxy2.result).booleanValue();
            } else {
                C3657d LIZ2 = bootInfoService.LIZ();
                if (LIZ2 != null && (c3658f = LIZ2.LIZJ) != null && (list = c3658f.LIZIZ) != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (Intrinsics.areEqual(((C3531a.C3532a) it.next()).LIZ, "switchScreen")) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            return LIZ(z);
        }
        return LIZ(true);
    }

    private final AbstractC87957KlD LIZ(boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 15);
        if (proxy.isSupported) {
            return (AbstractC87957KlD) proxy.result;
        }
        if (z) {
            return new C87711KhF(this);
        }
        return new C88009Km3(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SonicGamePlugin(C3682x c3682x) {
        super(c3682x);
        C106862S5w.LIZ(c3682x);
        this.LJIIIZ = c3682x;
        this.f26094LJ = new C87956KlC(this.LJIIIZ.LIZLLL);
        IService service = ServiceManager.getService(IHostApp.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        this.LJII = ((IHostApp) service).getAllLiveActivity();
    }

    @Override // p003X.AbstractC87953Kl9, p003X.AbstractC87830KjA, com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3659g
    public final void onShow(Map<String, String> map) {
        DataCenter dataCenter;
        Integer num;
        if (PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onShow(map);
        if (this.LJIIIZ.LJIIIIZZ.LJFF && (dataCenter = this.LJIIIZ.f26082LJ) != null) {
            PanelType LJIILLIIL = this.LJIIIZ.LJIILLIIL();
            if (LJIILLIIL != null) {
                num = Integer.valueOf(LJIILLIIL.height);
            } else {
                num = null;
            }
            dataCenter.put("cast_game_panel_height_change", num);
        }
        withPanel(new SonicGamePlugin$onShow$1(this, map), new SonicGamePlugin$onShow$2(this));
    }

    @Override // p003X.AbstractC87953Kl9
    public final void onPanelCreate(AbstractC3609d abstractC3609d) {
        Long l;
        String str;
        C2WC<Room> LIZ2;
        Room LIZ3;
        if (PatchProxy.proxy(new Object[]{abstractC3609d}, this, LIZ, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC3609d);
        this.LJIIIZ.LIZJ = abstractC3609d;
        this.LJIIIIZZ = abstractC3609d;
        IUser LIZ4 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ4, "");
        long id = LIZ4.getId();
        C5923dp LIZ5 = C409882Kg.LIZ(C5923dp.LJIIJ, this.LJIIIZ.f26082LJ, 0L, 2, null);
        FullScreenOpenPanel fullScreenOpenPanel = null;
        if (LIZ5 != null && (LIZ2 = LIZ5.LIZ()) != null && (LIZ3 = LIZ2.LIZ()) != null) {
            l = Long.valueOf(LIZ3.ownerUserId);
        } else {
            l = null;
        }
        AbstractC3609d abstractC3609d2 = this.LJIIIIZZ;
        if (abstractC3609d2 instanceof FullScreenOpenPanel) {
            fullScreenOpenPanel = abstractC3609d2;
        }
        FullScreenOpenPanel fullScreenOpenPanel2 = fullScreenOpenPanel;
        if (fullScreenOpenPanel2 != null) {
            long j = this.LJIIIZ.LJIIIIZZ.LJI;
            String LIZ6 = this.LJIIIZ.LJIIIIZZ.LIZ(this.isAnchor);
            String LIZLLL = ((BootInfoService) this.LJIIIZ.LIZ((Class<AbstractC3719c>) BootInfoService.class)).LIZLLL();
            C3682x c3682x = this.LJIIIZ;
            if (!PatchProxy.proxy(new Object[]{l, new Long(id), new Long(j), LIZ6, LIZLLL, c3682x}, fullScreenOpenPanel2, FullScreenOpenPanel.LIZ, false, 15).isSupported) {
                C106862S5w.LIZ(LIZ6, LIZLLL);
                if (l == null || (str = String.valueOf(l.longValue())) == null) {
                    str = "";
                }
                fullScreenOpenPanel2.LJIIIIZZ = str;
                fullScreenOpenPanel2.LJIIIZ = String.valueOf(id);
                fullScreenOpenPanel2.LJIIJ = String.valueOf(j);
                fullScreenOpenPanel2.LJIIJJI = LIZ6;
                fullScreenOpenPanel2.LJIIL = LIZLLL;
                fullScreenOpenPanel2.LJIILIIL = c3682x;
            }
        }
        abstractC3609d.registerListener(new C87955KlB(this));
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3659g
    public final <T> void sendEvent(String str, T t) {
        if (PatchProxy.proxy(new Object[]{str, t}, this, LIZ, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, t);
        this.f26094LJ.LIZ(str, (String) t);
    }

    public final void LIZ(SonicState sonicState, boolean z) {
        SonicState sonicState2;
        if (PatchProxy.proxy(new Object[]{sonicState, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 18).isSupported) {
            return;
        }
        if (!z && (this.LIZIZ == null || (sonicState2 = this.LIZLLL) == sonicState || sonicState2 == SonicState.DESTROY)) {
            return;
        }
        int i = C87967KlN.LIZ[sonicState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    AbstractC87969KlP abstractC87969KlP = this.LIZIZ;
                    if (abstractC87969KlP != null) {
                        C87825Kj5.LIZ(abstractC87969KlP, false, 1, null);
                    }
                    this.LIZIZ = null;
                }
            } else {
                AbstractC87969KlP abstractC87969KlP2 = this.LIZIZ;
                if (abstractC87969KlP2 != null) {
                    abstractC87969KlP2.LIZIZ();
                }
            }
        } else {
            AbstractC87969KlP abstractC87969KlP3 = this.LIZIZ;
            if (abstractC87969KlP3 != null) {
                abstractC87969KlP3.LIZ();
            }
        }
        this.LIZLLL = sonicState;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3659g
    public final void downloadResource(Context context, String str, AbstractC3661j abstractC3661j) {
        if (PatchProxy.proxy(new Object[]{context, str, abstractC3661j}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(context, str);
        this.LIZJ = str;
        LiveSchemaInfo LIZ2 = LiveSchemaInfo.LJII.LIZ(str);
        if (LIZ2 == null) {
            if (abstractC3661j != null) {
                abstractC3661j.LIZ(null, "schema error", "Download");
                return;
            }
            return;
        }
        AbstractC87959KlF<C11526j, AbstractC11524d> LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.LIZIZ(LIZ2, null, new C87681Kgl(this, abstractC3661j));
        }
    }

    public static /* synthetic */ void LIZ(SonicGamePlugin sonicGamePlugin, SonicState sonicState, boolean z, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{sonicGamePlugin, sonicState, (byte) 0, 2, null}, null, LIZ, true, 19).isSupported) {
            return;
        }
        sonicGamePlugin.LIZ(sonicState, false);
    }
}
