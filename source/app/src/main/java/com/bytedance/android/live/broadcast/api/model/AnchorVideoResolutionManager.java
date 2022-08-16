package com.bytedance.android.live.broadcast.api.model;

import android.app.Dialog;
import android.content.Context;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.p518ui.C6327cp;
import com.bytedance.android.livesdk.config.LiveAnchorResolution;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import p002O.C0002O;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2VQ;
import p003X.C3VF;
import p003X.C4574547f;
import p003X.C86665KDb;
import p003X.C87308Kak;
import p003X.DialogC428462xM;
import p003X.KA6;
import p003X.LK1;

/* loaded from: classes5.dex */
public final class AnchorVideoResolutionManager {
    public static ChangeQuickRedirect LIZ;
    public static WeakReference<Dialog> LIZJ;
    public static Disposable LIZLLL;

    /* renamed from: LJ */
    public static Disposable f25774LJ;
    public static final AnchorVideoResolutionManager LJIIIZ = new AnchorVideoResolutionManager();
    public static List<RoomCreateInfo.C2896g.C2897a> LIZIZ = CollectionsKt__CollectionsKt.emptyList();
    public static String LJIIJ = "";
    public static String LJFF = "";
    public static final NextLiveData<String> LJI = new NextLiveData<>();
    public static String LJII = "";
    public static LiveMode LJIIIIZZ = LiveMode.VIDEO;
    public static WeakReference<RoomCreateInfo> LJIIJJI = new WeakReference<>(null);

    /* loaded from: classes5.dex */
    public interface ResolutionApi {
        static {
            Covode.recordClassIndex(14481);
        }

        @FormUrlEncoded
        @POST("/webcast/room/change_resolution/")
        Observable<C5176i<AnchorResolutionInfo>> changeResolution(@FieldMap Map<String, String> map);

        @FormUrlEncoded
        @POST("/webcast/room/recommend_resolution/")
        Observable<C5176i<AnchorResolutionInfo>> queryRecommendResolution(@FieldMap Map<String, String> map);
    }

    public static String LIZ() {
        return LJFF;
    }

    public final void LIZ(String str, String str2) {
        List split$default;
        List split$default2;
        C3VF user;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 22).isSupported) {
            return;
        }
        C4574547f LIZ2 = C4574547f.LIZ();
        Pair[] pairArr = new Pair[7];
        pairArr[0] = TuplesKt.m137to("live_type", LJIIIIZZ.name());
        IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
        Object obj = null;
        pairArr[1] = TuplesKt.m137to("anchor_id", (iUserService == null || (user = iUserService.user()) == null) ? null : String.valueOf(user.LIZIZ()));
        pairArr[2] = TuplesKt.m137to("event_page", "live_take_detail");
        pairArr[3] = TuplesKt.m137to("show_type", "toast");
        pairArr[4] = TuplesKt.m137to("definition", str2);
        String value = LJI.getValue();
        pairArr[5] = TuplesKt.m137to("old_resolution", (value == null || (split$default2 = StringsKt__StringsKt.split$default((CharSequence) value, new String[]{" "}, false, 0, 6, (Object) null)) == null) ? null : split$default2.get(0));
        if (str2 != null && (split$default = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{" "}, false, 0, 6, (Object) null)) != null) {
            obj = split$default.get(0);
        }
        pairArr[6] = TuplesKt.m137to("new_resolution", obj);
        LIZ2.LIZ(str, MapsKt__MapsKt.mapOf(pairArr), Room.class);
    }

    static {
        Covode.recordClassIndex(14480);
    }

    public final String LIZIZ() {
        List split$default;
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String value = LJI.getValue();
        if (value == null || (split$default = StringsKt__StringsKt.split$default((CharSequence) value, new String[]{" "}, false, 0, 6, (Object) null)) == null || (str = (String) split$default.get(0)) == null) {
            return "";
        }
        return str;
    }

    public final boolean LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        SettingKey<LiveAnchorResolution> settingKey = LiveConfigSettingKeys.LIVE_ANCHOR_CLARITY_DICT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (!settingKey.getValue().getLive_anchor_guide_clarity_open() || !LK1.LIZ(LJIIIIZZ, LiveMode.VIDEO, LiveMode.SCREEN_RECORD)) {
            return false;
        }
        return true;
    }

    public final Pair<Integer, Integer> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
        if (proxy.isSupported) {
            return (Pair) proxy.result;
        }
        if (Intrinsics.areEqual(LJFF, "uhd")) {
            return new Pair<>(1080, 1920);
        }
        return new Pair<>(720, 1280);
    }

    public final void LIZ(RoomCreateInfo roomCreateInfo) {
        if (!PatchProxy.proxy(new Object[]{roomCreateInfo}, this, LIZ, false, 7).isSupported && roomCreateInfo != null) {
            LJIIJJI = new WeakReference<>(roomCreateInfo);
        }
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        LJII = str;
    }

    /* renamed from: LJ */
    public final void m15916LJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 29).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        ALogger.m15801d("anchor_resolution", str);
    }

    public final RoomCreateInfo.C2896g.C2897a LIZJ(String str) {
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 14);
        if (proxy.isSupported) {
            return (RoomCreateInfo.C2896g.C2897a) proxy.result;
        }
        Iterator<T> it = LIZIZ.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((RoomCreateInfo.C2896g.C2897a) obj).LIZIZ, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (RoomCreateInfo.C2896g.C2897a) obj;
    }

    private final String LIZIZ(LiveMode liveMode) {
        boolean z;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{liveMode}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C87308Kak<Map<String, String>> c87308Kak = AbstractC80293Hkt.f7111cg;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        String str = c87308Kak.LIZ().get(liveMode.name());
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            List<RoomCreateInfo.C2896g.C2897a> list = LIZIZ;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (RoomCreateInfo.C2896g.C2897a c2897a : list) {
                    if (Intrinsics.areEqual(c2897a.LIZIZ, str)) {
                        if (Intrinsics.areEqual(str, "uhd")) {
                            SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_ANCHOR_CLARITY_1080_OPEN;
                            Intrinsics.checkNotNullExpressionValue(settingKey, "");
                            if (settingKey.getValue().booleanValue()) {
                                List<RoomCreateInfo.C2896g.C2897a> list2 = LIZIZ;
                                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                    for (RoomCreateInfo.C2896g.C2897a c2897a2 : list2) {
                                        if (Intrinsics.areEqual(c2897a2.LIZIZ, "uhd")) {
                                            m15916LJ(C0002O.m25086C("use last select resolution : ", str));
                                            return str;
                                        }
                                    }
                                }
                            }
                            m15916LJ(C0002O.m25086C("use default select resolution : ", LJIIJ));
                            return LJIIJ;
                        }
                        m15916LJ(C0002O.m25086C("use last select resolution : ", str));
                        return str;
                    }
                }
            }
        }
        m15916LJ(C0002O.m25086C("use default select resolution : ", LJIIJ));
        return LJIIJ;
    }

    public final void LIZLLL(String str) {
        String str2;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 28).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[]{str}, null, KA6.LIZ, true, 1).isSupported) {
            C106862S5w.LIZ(str);
            if (true ^ Intrinsics.areEqual(str, KA6.LIZIZ)) {
                int hashCode = str.hashCode();
                if (hashCode != 3324) {
                    if (hashCode != 3448) {
                        if (hashCode != 3665) {
                            if (hashCode == 115761 && str.equals("uhd")) {
                                str2 = "1080P";
                                C86665KDb.LIZ("ttlive_report_video_resolution", "room", null, null, 12, null).LIZ(str2).LIZ().LIZ();
                                KA6.LIZIZ = str;
                            }
                        } else if (str.equals("sd")) {
                            str2 = "540P";
                            C86665KDb.LIZ("ttlive_report_video_resolution", "room", null, null, 12, null).LIZ(str2).LIZ().LIZ();
                            KA6.LIZIZ = str;
                        }
                    } else if (str.equals("ld")) {
                        str2 = "480P";
                        C86665KDb.LIZ("ttlive_report_video_resolution", "room", null, null, 12, null).LIZ(str2).LIZ().LIZ();
                        KA6.LIZIZ = str;
                    }
                } else if (str.equals("hd")) {
                    str2 = "720P";
                    C86665KDb.LIZ("ttlive_report_video_resolution", "room", null, null, 12, null).LIZ(str2).LIZ().LIZ();
                    KA6.LIZIZ = str;
                }
            }
        }
        C87308Kak<Map<String, String>> c87308Kak = AbstractC80293Hkt.f7111cg;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        C87308Kak<Map<String, String>> c87308Kak2 = AbstractC80293Hkt.f7111cg;
        Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
        Map<String, String> LIZ2 = c87308Kak2.LIZ();
        Map<String, String> map = LIZ2;
        Intrinsics.checkNotNullExpressionValue(map, "");
        map.put(LJIIIIZZ.name(), str);
        c87308Kak.LIZ(LIZ2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
        if (r6 == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> LIZ(com.p1594ss.avframework.livestreamv2.LiveStreamBuilder r8) {
        /*
            r7 = this;
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r6 = 0
            r2[r6] = r8
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager.LIZ
            r0 = 19
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r7, r1, r6, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L17
            java.lang.Object r0 = r1.result
            kotlin.Pair r0 = (kotlin.Pair) r0
            return r0
        L17:
            java.lang.String r0 = com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager.LJII
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L38
            r1.<init>(r0)     // Catch: java.lang.Exception -> L38
            java.lang.String r0 = "PushBase"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch: java.lang.Exception -> L38
            if (r1 == 0) goto L35
            java.lang.String r0 = "maxBitrate"
            int r0 = r1.optInt(r0, r6)     // Catch: java.lang.Exception -> L38
            int r5 = r0 / 1000
            java.lang.String r0 = "fps"
            int r4 = r1.optInt(r0, r6)     // Catch: java.lang.Exception -> L39
            goto L3a
        L35:
            r4 = 0
            r5 = 0
            goto L3a
        L38:
            r5 = 0
        L39:
            r4 = 0
        L3a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "current maxKbps: "
            r0.<init>(r3)
            r0.append(r5)
            java.lang.String r2 = ", fps: "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r7.m15916LJ(r0)
            if (r5 > 0) goto L5e
            if (r8 == 0) goto L5e
            int r0 = r8.getVideoMaxBitrate()
            int r5 = r0 / 1000
            r6 = 1
        L5e:
            if (r4 > 0) goto L8d
            if (r8 == 0) goto L8d
            int r4 = r8.getVideoFps()
        L66:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r5)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r0 = ", after fallback"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.m15916LJ(r0)
        L80:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            kotlin.Pair r0 = kotlin.TuplesKt.m137to(r1, r0)
            return r0
        L8d:
            if (r6 == 0) goto L80
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager.LIZ(com.ss.avframework.livestreamv2.LiveStreamBuilder):kotlin.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.bytedance.android.livesdkapi.depend.model.live.LiveMode r8) {
        /*
            r7 = this;
            r5 = 1
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r6 = 0
            r2[r6] = r8
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager.LIZ
            r0 = 6
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r7, r1, r6, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L12
            return
        L12:
            if (r8 != 0) goto L1a
            java.lang.String r0 = "loadResolutionList live mode is null"
            r7.m15916LJ(r0)
            return
        L1a:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r6] = r8
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager.LIZ
            r4 = 3
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r1, r7, r0, r6, r4)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L32
            com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager.LJIIIIZZ = r8
            java.lang.String r0 = r7.LIZIZ(r8)
            r7.LIZ(r0)
        L32:
            boolean r0 = r7.LIZJ()
            if (r0 != 0) goto L3e
            java.lang.String r0 = "loadResolutionList function disable"
            r7.m15916LJ(r0)
            return
        L3e:
            java.lang.String r1 = "loadResolutionList : live mode -> "
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager.LJIIIIZZ
            java.lang.String r0 = r0.name()
            java.lang.String r0 = p002O.C0002O.m25086C(r1, r0)
            r7.m15916LJ(r0)
            java.lang.ref.WeakReference<com.bytedance.android.live.broadcast.api.model.RoomCreateInfo> r0 = com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager.LJIIJJI
            java.lang.Object r2 = r0.get()
            com.bytedance.android.live.broadcast.api.model.RoomCreateInfo r2 = (com.bytedance.android.live.broadcast.api.model.RoomCreateInfo) r2
            if (r2 == 0) goto L98
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r3 = com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager.LJIIIIZZ
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r6] = r3
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.broadcast.api.model.RoomCreateInfo.LIZ
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r2, r0, r6, r5)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L99
            java.lang.Object r4 = r1.result
            com.bytedance.android.live.broadcast.api.model.RoomCreateInfo$g r4 = (com.bytedance.android.live.broadcast.api.model.RoomCreateInfo.C2896g) r4
        L6b:
            if (r4 == 0) goto L98
            com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager r3 = com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager.LJIIIZ
            java.lang.String r2 = "load "
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager.LJIIIIZZ
            java.lang.String r1 = r0.name()
            java.lang.String r0 = " push stream info"
            java.lang.String r0 = p002O.C0002O.m25085C(r2, r1, r0)
            r3.m15916LJ(r0)
            java.util.List<com.bytedance.android.live.broadcast.api.model.RoomCreateInfo$g$a> r1 = r4.LIZIZ
            com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager$loadStartPreviewResolutionListByLiveMode$1$1$1 r0 = com.bytedance.android.live.broadcast.api.model.C2892x190531ac.INSTANCE
            kotlin.collections.CollectionsKt__MutableCollectionsKt.removeAll(r1, r0)
            com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager.LIZIZ = r1
            java.lang.String r0 = r4.LIZ
            com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager.LJIIJ = r0
            com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager r1 = com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager.LJIIIZ
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager.LJIIIIZZ
            java.lang.String r0 = r1.LIZIZ(r0)
            r1.LIZ(r0)
        L98:
            return
        L99:
            if (r3 == 0) goto Ld0
            int[] r1 = p003X.C410962Ok.LIZ
            int r0 = r3.ordinal()
            r1 = r1[r0]
            if (r1 == r5) goto Lcb
            r0 = 2
            if (r1 == r0) goto Lc6
            if (r1 == r4) goto Lc1
            r0 = 4
            if (r1 != r0) goto Ld0
            com.bytedance.android.live.broadcast.api.model.RoomCreateInfo$LiveTabEnum r0 = com.bytedance.android.live.broadcast.api.model.RoomCreateInfo.LiveTabEnum.ThirdPartyTab
            int r0 = r0.value
        Lb1:
            java.util.Map<java.lang.Long, com.bytedance.android.live.broadcast.api.model.RoomCreateInfo$g> r2 = r2.LJIILLIIL
            if (r2 == 0) goto L98
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r4 = r2.get(r0)
            com.bytedance.android.live.broadcast.api.model.RoomCreateInfo$g r4 = (com.bytedance.android.live.broadcast.api.model.RoomCreateInfo.C2896g) r4
            goto L6b
        Lc1:
            com.bytedance.android.live.broadcast.api.model.RoomCreateInfo$LiveTabEnum r0 = com.bytedance.android.live.broadcast.api.model.RoomCreateInfo.LiveTabEnum.ScreenShotTab
            int r0 = r0.value
            goto Lb1
        Lc6:
            com.bytedance.android.live.broadcast.api.model.RoomCreateInfo$LiveTabEnum r0 = com.bytedance.android.live.broadcast.api.model.RoomCreateInfo.LiveTabEnum.AudioTab
            int r0 = r0.value
            goto Lb1
        Lcb:
            com.bytedance.android.live.broadcast.api.model.RoomCreateInfo$LiveTabEnum r0 = com.bytedance.android.live.broadcast.api.model.RoomCreateInfo.LiveTabEnum.NormalTab
            int r0 = r0.value
            goto Lb1
        Ld0:
            r0 = -1
            goto Lb1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager.LIZ(com.bytedance.android.livesdkapi.depend.model.live.LiveMode):void");
    }

    public final void LIZ(String str) {
        Object obj;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        LJFF = str;
        Iterator<T> it = LIZIZ.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((RoomCreateInfo.C2896g.C2897a) obj).LIZIZ, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        RoomCreateInfo.C2896g.C2897a c2897a = (RoomCreateInfo.C2896g.C2897a) obj;
        if (c2897a != null) {
            LJI.setValue(c2897a.LIZ);
            AnchorVideoResolutionManager anchorVideoResolutionManager = LJIIIZ;
            new StringBuilder();
            anchorVideoResolutionManager.m15916LJ(C0002O.m25085C(LJIIIIZZ.name(), " update currentResolutionText : ", LJI.getValue()));
        }
    }

    @JvmStatic
    public static final void LIZ(String str, Room room) {
        String str2;
        StreamUrlExtra streamUrlExtra;
        if (PatchProxy.proxy(new Object[]{str, room}, null, LIZ, true, 26).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (room == null) {
            return;
        }
        C4574547f LIZ2 = C4574547f.LIZ();
        Pair[] pairArr = new Pair[6];
        pairArr[0] = TuplesKt.m137to("definition", LJI.getValue());
        pairArr[1] = TuplesKt.m137to("definition_reason", str);
        StreamUrl streamUrl = room.getStreamUrl();
        if (streamUrl != null && (streamUrlExtra = streamUrl.extra) != null && streamUrlExtra.enableH265) {
            str2 = "265";
        } else {
            str2 = "264";
        }
        pairArr[2] = TuplesKt.m137to("encoding_format", str2);
        pairArr[3] = TuplesKt.m137to("live_type", C2VQ.LIZ(room.getStreamType()));
        pairArr[4] = TuplesKt.m137to("is_anchor", "1");
        pairArr[5] = TuplesKt.m137to("anchor_id", String.valueOf(room.ownerUserId));
        LIZ2.LIZ("performance_definition_monitor", MapsKt__MapsKt.mapOf(pairArr), Room.class);
    }

    @JvmStatic
    public static final void LIZ(Context context, Room room, boolean z) {
        String str;
        if (PatchProxy.proxy(new Object[]{context, room, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, null, LIZ, true, 9).isSupported) {
            return;
        }
        if (!LIZIZ.isEmpty() && context != null) {
            List<RoomCreateInfo.C2896g.C2897a> list = LIZIZ;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (RoomCreateInfo.C2896g.C2897a c2897a : list) {
                boolean areEqual = Intrinsics.areEqual(c2897a.LIZIZ, LJFF);
                String str2 = c2897a.LIZ;
                if (areEqual) {
                    str = "selected";
                } else {
                    str = "unselected";
                }
                arrayList.add(new C6327cp(str2, str));
            }
            C116971W2r.LIZJ(new DialogC428462xM(context, arrayList, new AnchorVideoResolutionManager$showResolutionPicker$1(room, z, context)));
            return;
        }
        LJIIIZ.m15916LJ("showResolutionPicker failed");
    }
}
