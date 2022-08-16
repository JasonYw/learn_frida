package com.bytedance.android.live.broadcastgame.opengame.debug;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcastgame.api.model.C3380j;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.broadcastgame.api.model.C3389y;
import com.bytedance.android.live.broadcastgame.api.model.InteractID;
import com.bytedance.android.live.broadcastgame.api.model.z$c;
import com.bytedance.android.live.broadcastgame.api.openplatform.AbstractC3398b;
import com.bytedance.android.live.broadcastgame.api.openplatform.PluginType;
import com.bytedance.android.live.broadcastgame.opengame.AbstractC3497h;
import com.bytedance.android.live.broadcastgame.opengame.LogLevel;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.IHostBusiness;
import com.bytedance.android.livesdk.message.model.C8819do;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.InteractOpenExtra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.xiaomi.mipush.sdk.Constants;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC449173pf;
import p003X.AbstractC87170KWm;
import p003X.AbstractC87650KgG;
import p003X.AbstractC87926Kki;
import p003X.AbstractC87937Kkt;
import p003X.C106862S5w;
import p003X.C2WD;
import p003X.C64859BiX;
import p003X.C65860Byg;
import p003X.C87010KQi;
import p003X.C87549Ked;
import p003X.C87901KkJ;
import p003X.C87904KkM;
import p003X.C87907KkP;
import p003X.C87909KkR;
import p003X.C87911KkT;
import p003X.C87914KkW;
import p003X.C87919Kkb;
import p003X.C88440Kt0;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class OpenPlatformLiveGameDebugManager extends OpenPlatformBaseDebugger implements AbstractC87937Kkt, AbstractC87650KgG, OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZJ;
    public Room LIZLLL;
    public IMessageManager LJFF;
    public C87909KkR lynxDebugBridge;
    public final /* synthetic */ C87549Ked LJI = new C87549Ked();

    /* renamed from: LJ */
    public String f26053LJ = "tt-test_version";
    public PluginType LIZIZ = PluginType.LYNX;

    static {
        Covode.recordClassIndex(20074);
    }

    private void LIZ(Disposable disposable) {
        if (PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 19).isSupported) {
            return;
        }
        C106862S5w.LIZ(disposable);
        this.LJI.LIZ(disposable);
    }

    @Override // p003X.AbstractC87937Kkt
    public final PluginType LIZIZ() {
        return this.LIZIZ;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.debug.OpenPlatformBaseDebugger, com.bytedance.android.live.broadcastgame.opengame.AbstractC3497h
    public final void releaseDebug() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        super.releaseDebug();
        IMessageManager iMessageManager = this.LJFF;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.LJFF = null;
        this.LIZLLL = null;
    }

    @Override // p003X.AbstractC87650KgG
    public final void LIZ() {
        C87909KkR c87909KkR;
        AbstractC87926Kki abstractC87926Kki;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported && (c87909KkR = this.lynxDebugBridge) != null && !PatchProxy.proxy(new Object[0], c87909KkR, C87909KkR.LIZ, false, 3).isSupported && (abstractC87926Kki = c87909KkR.LIZIZ) != null) {
            abstractC87926Kki.LIZ();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.debug.OpenPlatformBaseDebugger, com.bytedance.android.live.broadcastgame.opengame.AbstractC3497h
    public final void stopDebug() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.stopDebug();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            this.LJI.LIZ();
        }
        C87010KQi.LIZ().LIZ(new C3389y(false, null, 2));
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.debug.OpenPlatformBaseDebugger
    public final boolean onScanFail(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C88440Kt0.LIZ(2131586597);
        return true;
    }

    public final String LIZIZ(String str) {
        boolean z;
        Integer num;
        PluginType LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 16);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "");
        String encodedQuery = parse.getEncodedQuery();
        if (encodedQuery == null || encodedQuery.length() == 0) {
            return "";
        }
        String queryParameter = Uri.parse(str).getQueryParameter("tech_type");
        if (queryParameter != null) {
            num = Integer.valueOf(Integer.parseInt(queryParameter));
        } else {
            num = null;
        }
        C87904KkM c87904KkM = PluginType.Companion;
        if (num == null || (LIZ2 = c87904KkM.LIZ(Integer.valueOf(num.intValue()))) == null || C87919Kkb.LIZ[LIZ2.ordinal()] != 1) {
            return "";
        }
        return C0002O.m25086C("sslocal://microapp?", encodedQuery);
    }

    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Room room;
        if (!PatchProxy.proxy(new Object[]{iMessage}, this, LIZ, false, 3).isSupported && iMessage != null && (iMessage instanceof C8819do) && (room = this.LIZLLL) != null) {
            long id = room.getId();
            C8819do c8819do = (C8819do) iMessage;
            String str = c8819do.LIZLLL;
            Intrinsics.checkNotNullExpressionValue(str, "");
            int i = c8819do.LIZJ;
            String str2 = c8819do.f27884LJ;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            Long l = c8819do.LJFF;
            Intrinsics.checkNotNullExpressionValue(l, "");
            if (LIZ(id, str, i, str2, l.longValue())) {
                String str3 = c8819do.LIZLLL;
                Intrinsics.checkNotNullExpressionValue(str3, "");
                setAppId(str3);
                setGameId(c8819do.LIZIZ);
                createDebugFloatBall();
                AbstractC3497h.AbstractC3498a initCallback = getInitCallback();
                if (initCallback != null) {
                    initCallback.LIZ();
                }
                setInitCallback(null);
                return;
            }
            AbstractC3497h.AbstractC3498a initCallback2 = getInitCallback();
            if (initCallback2 == null) {
                return;
            }
            initCallback2.LIZ(new Throwable("Lynx Debug 初始化失败，原因：校验失败"));
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.debug.OpenPlatformBaseDebugger
    public final boolean onScanSuccess(String str) {
        boolean z;
        int LIZ2;
        String str2 = str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str2}, this, LIZ, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!PatchProxy.proxy(new Object[]{str2}, C87911KkT.LIZIZ, C87911KkT.LIZ, false, 6).isSupported) {
            str2 = str2;
            ALogger.m15801d("OpenPlatformLog", C0002O.m25086C("扫描成功, schema: ", str2));
        }
        String str3 = str2;
        if (str3 != null && str3.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C88440Kt0.LIZ(LK5.LIZ(2131586595));
            return false;
        } else if (PluginType.Companion.LIZ(str3) == PluginType.LYNX) {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str3}, this, LIZ, false, 14);
            if (proxy2.isSupported) {
                return ((Boolean) proxy2.result).booleanValue();
            }
            PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{this, str3, (byte) 0, 2, null}, null, LIZ, true, 11);
            if (proxy3.isSupported) {
                LIZ2 = ((Integer) proxy3.result).intValue();
            } else {
                LIZ2 = LIZ(str3, false);
            }
            if (LIZ2 == 1) {
                C3384q c3384q = new C3384q(1, "test", CollectionsKt__CollectionsKt.emptyList(), 1L, 1L, CollectionsKt__CollectionsKt.emptyList(), C0002O.m25081C("{\"game_id\":", Long.valueOf(getGameId()), ",\"game_type\":1,\"group_type\":1,\"need_game_desc\":false,\"rank\":10,\"show_anchor_float_entrance\":true,\"show_audience_float_entrance\":true,\"app_id\":\"", getAppId(), "\",\"app_version\":\"", this.f26053LJ, "\"}"));
                c3384q.LIZJ.LIZIZ = true;
                C3383p LJFF = c3384q.LJFF();
                if (LJFF != null) {
                    Map<String, ? extends Object> mutableMapOf = MapsKt__MapsKt.mutableMapOf(TuplesKt.m137to("is_debug", Boolean.TRUE), TuplesKt.m137to("game", c3384q), TuplesKt.m137to("app_version", this.f26053LJ), TuplesKt.m137to(Constants.APP_ID, getAppId()), TuplesKt.m137to("game_id", Long.valueOf(getGameId())));
                    AbstractC3398b pluginManager = getPluginManager();
                    if (pluginManager != null) {
                        pluginManager.LIZ(LJFF.LIZLLL, LJFF.LJLIIIL, str3, mutableMapOf, true, true);
                    }
                }
                return false;
            } else if (LIZ2 != 101) {
                if (LIZ2 == 102) {
                    C88440Kt0.LIZ(2131586594);
                }
                return true;
            } else {
                C88440Kt0.LIZ(2131586595);
                return true;
            }
        } else if (PluginType.Companion.LIZ(str3) == PluginType.SONIC_GAME) {
            LIZ(str3);
            return false;
        } else {
            C87907KkP.LIZLLL.LIZ(str3, new C87914KkW(this));
            return false;
        }
    }

    public final void LIZ(String str) {
        C2WD<z$c> LJJI;
        Observable<AbstractC449173pf<z$c>> LIZIZ;
        Disposable subscribe;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 15).isSupported) {
            return;
        }
        int LIZ2 = LIZ(str, true);
        if (LIZ2 == 1) {
            String m25081C = C0002O.m25081C("{\"game_id\":", Long.valueOf(getGameId()), ",\"game_type\":1,\"group_type\":1,\"need_game_desc\":false,\"rank\":10,\"show_anchor_float_entrance\":true,\"show_audience_float_entrance\":true,\"app_id\":\"", getAppId(), "\",\"app_version\":\"", this.f26053LJ, "\"}");
            C3384q c3384q = new C3384q(InteractID.SonicMiniGame.value, "调试", CollectionsKt__CollectionsKt.emptyList(), 1L, 1L, CollectionsKt__CollectionsKt.emptyList(), m25081C);
            c3384q.LIZJ.LIZIZ = true;
            C3383p LJFF = c3384q.LJFF();
            if (LJFF != null) {
                Map<String, ? extends Object> mutableMapOf = MapsKt__MapsKt.mutableMapOf(TuplesKt.m137to("is_debug", Boolean.TRUE), TuplesKt.m137to("game", c3384q), TuplesKt.m137to("app_version", this.f26053LJ), TuplesKt.m137to(Constants.APP_ID, getAppId()), TuplesKt.m137to("game_id", Long.valueOf(getGameId())));
                AbstractC3398b pluginManager = getPluginManager();
                if (pluginManager != null) {
                    pluginManager.LIZ(LJFF.LIZLLL, LJFF.LJLIIIL, str, mutableMapOf, true, true);
                }
                int i = InteractID.SonicMiniGame.value;
                ImageModel imageModel = new ImageModel();
                imageModel.setUrls(CollectionsKt__CollectionsKt.emptyList());
                C3380j c3380j = new C3380j(i, "调试", "当前直播间本地调试", imageModel, 1L, m25081C, null, 64);
                c3380j.LIZJ.LIZIZ = true;
                C87010KQi.LIZ().LIZ(new C3389y(true, c3380j));
                AbstractC87170KWm LIZ3 = AbstractC87170KWm.LJI.LIZ();
                if (LIZ3 != null && (LJJI = LIZ3.LJJI()) != null && (LIZIZ = LJJI.LIZIZ()) != null && (subscribe = LIZIZ.subscribe(C87901KkJ.LIZIZ)) != null) {
                    LIZ(subscribe);
                }
            }
        } else if (LIZ2 != 101) {
            if (LIZ2 != 102) {
                return;
            }
            C88440Kt0.LIZ(2131586594);
        } else {
            C88440Kt0.LIZ(2131586595);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() != true) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d4, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, "latest") != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0047, code lost:
        if (r9 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int LIZ(java.lang.String r8, boolean r9) {
        /*
            r7 = this;
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r6 = 0
            r2[r6] = r8
            java.lang.Byte r0 = java.lang.Byte.valueOf(r9)
            r5 = 1
            r2[r5] = r0
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcastgame.opengame.debug.OpenPlatformLiveGameDebugManager.LIZ
            r0 = 10
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r7, r1, r6, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L22
            java.lang.Object r0 = r1.result
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L22:
            android.net.Uri r4 = android.net.Uri.parse(r8)
            r0 = 102(0x66, float:1.43E-43)
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r3 = ""
            if (r4 == 0) goto L47
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r6] = r4
            r1 = 0
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = p003X.C87927Kkj.LIZ
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r1, r0, r5, r5)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L83
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == r5) goto L49
        L47:
            if (r9 == 0) goto L7e
        L49:
            java.lang.String r0 = "app_id"
            java.lang.String r1 = r4.getQueryParameter(r0)
            if (r8 == 0) goto L7e
            java.lang.String r0 = r7.getAppId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            r0 = r0 ^ r5
            if (r0 == 0) goto L79
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r3)
            r0 = r0 ^ r5
            if (r0 == 0) goto L79
            java.lang.String r0 = r7.getAppId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L79
            r2 = 1
            java.lang.String r1 = "可以调试"
        L70:
            X.KkT r0 = p003X.C87911KkT.LIZIZ
            if (r2 != r5) goto L75
            r6 = 1
        L75:
            r0.LIZ(r6, r1)
            return r2
        L79:
            r2 = 102(0x66, float:1.43E-43)
            java.lang.String r1 = "二维码 appid 与房间的调试 appid 不匹配"
            goto L70
        L7e:
            r2 = 101(0x65, float:1.42E-43)
            java.lang.String r1 = "二维码不合法"
            goto L70
        L83:
            p003X.C106862S5w.LIZ(r4)
            java.lang.String r1 = r4.getScheme()
            java.lang.String r0 = "livegame"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L9e
            java.lang.String r1 = r4.getHost()
            java.lang.String r0 = "remote_debug_livegame"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L49
        L9e:
            java.lang.String r1 = r4.getScheme()
            java.lang.String r0 = "sslocal"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L47
            java.lang.String r1 = r4.getHost()
            java.lang.String r0 = "microgame"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L47
            java.lang.String r2 = "version_type"
            java.lang.String r1 = r4.getQueryParameter(r2)
            if (r1 != 0) goto Lbf
            r1 = r3
        Lbf:
            java.lang.String r0 = "preview"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L49
            java.lang.String r1 = r4.getQueryParameter(r2)
            if (r1 != 0) goto Lce
            r1 = r3
        Lce:
            java.lang.String r0 = "latest"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L47
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.opengame.debug.OpenPlatformLiveGameDebugManager.LIZ(java.lang.String, boolean):int");
    }

    @Override // p003X.AbstractC87650KgG
    public final void LIZ(Uri uri, Function3<? super String, ? super String, ? super String, Unit> function3) {
        C87909KkR c87909KkR;
        if (PatchProxy.proxy(new Object[]{uri, function3}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(uri, function3);
        String queryParameter = uri.getQueryParameter(PushConstants.WEB_URL);
        String queryParameter2 = uri.getQueryParameter("room");
        if (queryParameter != null && queryParameter2 != null && (c87909KkR = this.lynxDebugBridge) != null) {
            Context context = getContextWeakRef().get();
            if (!PatchProxy.proxy(new Object[]{context, queryParameter, queryParameter2, function3}, c87909KkR, C87909KkR.LIZ, false, 1).isSupported) {
                C106862S5w.LIZ(queryParameter, queryParameter2, function3);
                c87909KkR.f8591LJ = queryParameter2;
                c87909KkR.LIZJ = function3;
                if (c87909KkR.LIZLLL) {
                    c87909KkR.LIZLLL = false;
                    AbstractC87926Kki abstractC87926Kki = c87909KkR.LIZIZ;
                    if (abstractC87926Kki != null) {
                        abstractC87926Kki.LIZ();
                    }
                }
                if (context != null) {
                    c87909KkR.LIZIZ = ((IHostBusiness) ServiceManager.getService(IHostBusiness.class)).connectWebsocket(context, queryParameter, c87909KkR, 0L);
                }
            }
        }
    }

    @Override // p003X.AbstractC87650KgG
    public final void LIZ(String str, LogLevel logLevel) {
        String str2;
        if (PatchProxy.proxy(new Object[]{str, logLevel}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, logLevel);
        C87909KkR c87909KkR = this.lynxDebugBridge;
        if (c87909KkR != null && !PatchProxy.proxy(new Object[]{str, logLevel}, c87909KkR, C87909KkR.LIZ, false, 2).isSupported) {
            C106862S5w.LIZ(str, logLevel);
            Pair[] pairArr = new Pair[3];
            pairArr[0] = TuplesKt.m137to("log", str);
            String name = logLevel.name();
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            if (name != null) {
                String lowerCase = name.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                pairArr[1] = TuplesKt.m137to("level", lowerCase);
                if (c87909KkR.LJFF) {
                    str2 = "anchor";
                } else {
                    str2 = "audience";
                }
                pairArr[2] = TuplesKt.m137to(C64859BiX.LIZLLL, str2);
                c87909KkR.LIZ("log", null, MapsKt__MapsKt.mutableMapOf(pairArr));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    private final boolean LIZ(long j, String str, int i, String str2, long j2) {
        boolean z;
        String str3;
        boolean z2 = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str, Integer.valueOf(i), str2, new Long(j2)}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (j2 != 6 && j2 != 9) {
            z = false;
        } else {
            z = true;
        }
        new StringBuilder();
        String m25084C = C0002O.m25084C(String.valueOf(j), str, String.valueOf(i), C65860Byg.LIZIZ.LIZ());
        if (z && C65860Byg.LIZIZ.LIZ(m25084C, C65860Byg.LIZIZ.LIZIZ(), str2)) {
            str3 = "可以展示调试悬浮球";
        } else {
            z2 = false;
            str3 = "无法展示调试悬浮求，签名校验失败，";
        }
        C87911KkT.LIZIZ.LIZIZ(z2, str3);
        return z2;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.debug.OpenPlatformBaseDebugger, com.bytedance.android.live.broadcastgame.opengame.AbstractC3497h
    public final void initDebug(Context context, DataCenter dataCenter, ViewGroup viewGroup, AbstractC3398b abstractC3398b, Map<String, ? extends Object> map, AbstractC3497h.AbstractC3498a abstractC3498a) {
        long j;
        long j2;
        Map<String, String> map2;
        String str;
        Map<String, String> map3;
        String str2;
        Map<String, String> map4;
        String str3;
        Map<String, String> map5;
        String str4;
        Map<String, String> map6;
        String str5;
        OpenPlatformLiveGameDebugManager openPlatformLiveGameDebugManager = this;
        if (PatchProxy.proxy(new Object[]{context, dataCenter, viewGroup, abstractC3398b, map, abstractC3498a}, openPlatformLiveGameDebugManager, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(context, dataCenter, viewGroup, abstractC3398b, map, abstractC3498a);
        super.initDebug(context, dataCenter, viewGroup, abstractC3398b, map, abstractC3498a);
        Object obj = dataCenter.get("data_is_anchor", (String) Boolean.FALSE);
        String str6 = "";
        Intrinsics.checkNotNullExpressionValue(obj, str6);
        openPlatformLiveGameDebugManager.LIZJ = ((Boolean) obj).booleanValue();
        openPlatformLiveGameDebugManager.LIZLLL = (Room) dataCenter.get("data_room", (String) null);
        if (!openPlatformLiveGameDebugManager.LIZJ) {
            Room room = openPlatformLiveGameDebugManager.LIZLLL;
            if (room != null) {
                InteractOpenExtra interactOpenExtra = room.interactOpenExtra;
                if (interactOpenExtra != null && (map6 = interactOpenExtra.LIZIZ) != null && (str5 = map6.get(Constants.APP_ID)) != null) {
                    str6 = str5;
                }
                openPlatformLiveGameDebugManager.setAppId(str6);
                InteractOpenExtra interactOpenExtra2 = room.interactOpenExtra;
                if (interactOpenExtra2 != null && (map5 = interactOpenExtra2.LIZIZ) != null && (str4 = map5.get("debug_game_id")) != null) {
                    j = Long.parseLong(str4);
                } else {
                    j = 0;
                }
                openPlatformLiveGameDebugManager.setGameId(j);
                InteractOpenExtra interactOpenExtra3 = room.interactOpenExtra;
                if (interactOpenExtra3 != null && (map4 = interactOpenExtra3.LIZIZ) != null && (str3 = map4.get("app_kind")) != null) {
                    j2 = Long.parseLong(str3);
                } else {
                    j2 = -1;
                }
                long id = room.getId();
                String appId = openPlatformLiveGameDebugManager.getAppId();
                InteractOpenExtra interactOpenExtra4 = room.interactOpenExtra;
                if (interactOpenExtra4 != null && (map2 = interactOpenExtra4.LIZIZ) != null && (str = map2.get("develop")) != null) {
                    int parseInt = Integer.parseInt(str);
                    InteractOpenExtra interactOpenExtra5 = room.interactOpenExtra;
                    if (interactOpenExtra5 != null && (map3 = interactOpenExtra5.LIZIZ) != null && (str2 = map3.get("sign")) != null) {
                        openPlatformLiveGameDebugManager = openPlatformLiveGameDebugManager;
                        if (openPlatformLiveGameDebugManager.LIZ(id, appId, parseInt, str2, j2)) {
                            openPlatformLiveGameDebugManager.createDebugFloatBall();
                            AbstractC3497h.AbstractC3498a initCallback = openPlatformLiveGameDebugManager.getInitCallback();
                            if (initCallback != null) {
                                initCallback.LIZ();
                            }
                            openPlatformLiveGameDebugManager.setInitCallback(null);
                        } else {
                            AbstractC3497h.AbstractC3498a initCallback2 = openPlatformLiveGameDebugManager.getInitCallback();
                            if (initCallback2 != null) {
                                initCallback2.LIZ(new Throwable("Lynx Debug 初始化失败，原因：校验失败"));
                            }
                        }
                    }
                }
            }
        } else {
            openPlatformLiveGameDebugManager.LJFF = (IMessageManager) dataCenter.get("data_message_manager", (String) null);
            IMessageManager iMessageManager = openPlatformLiveGameDebugManager.LJFF;
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(MessageType.INTERACT_OPEN_DEVELOP_MESSAGE.LIZ(), openPlatformLiveGameDebugManager);
            }
        }
        openPlatformLiveGameDebugManager.lynxDebugBridge = new C87909KkR(openPlatformLiveGameDebugManager.LIZJ);
    }
}
