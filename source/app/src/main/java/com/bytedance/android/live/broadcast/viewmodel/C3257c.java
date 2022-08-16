package com.bytedance.android.live.broadcast.viewmodel;

import com.bytedance.android.live.base.exception.ApiException;
import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcast.api.LivePrivilegeSettingApi;
import com.bytedance.android.live.broadcast.api.model.PermissionResult;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.model.AbstractC3155a;
import com.bytedance.android.live.broadcast.model.PreInitState;
import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.android.live.broadcast.preview.api.StartLiveApi;
import com.bytedance.android.live.broadcast.viewmodel.C3257c;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C3OY;
import p003X.C425332sJ;
import p003X.C436343Oa;
import p003X.C81289I2h;
import p003X.C81909IQd;
import p003X.C86665KDb;
import p003X.C86748KGg;
import p003X.C88306Kqq;
import p003X.C91219Lwj;

/* renamed from: com.bytedance.android.live.broadcast.viewmodel.c */
/* loaded from: classes12.dex */
public final class C3257c extends AbstractC3155a {
    public static ChangeQuickRedirect LIZLLL;

    /* renamed from: LJ */
    public static final /* synthetic */ KProperty[] f25957LJ;
    public static final C436343Oa LJIIIIZZ = new C436343Oa((byte) 0);
    public C3180k LJI;
    public final List<C3256b> LJFF = new ArrayList();
    public final C81289I2h LJIIIZ = C81909IQd.LIZ(this, PreInitState.DISABLE, null, 2, null);
    public final C81289I2h LJIIJ = C81909IQd.LIZ(this, new RoomCreateInfo(), null, 2, null);
    public final C81289I2h LJIIJJI = C81909IQd.LIZ(this, PreInitState.DISABLE, null, 2, null);
    public final C81289I2h LJIIL = C81909IQd.LIZ(this, new PermissionResult(), null, 2, null);
    public final Map<String, C3256b> LJII = MapsKt__MapsKt.mapOf(TuplesKt.m137to("roomCreateInfo", new C3256b("roomCreateInfo", LIZLLL(), new PreInitFragmentContext$preInitDataMap$1(this), new PreInitFragmentContext$preInitDataMap$2(this))), TuplesKt.m137to("userPermission", new C3256b("userPermission", LJFF(), new PreInitFragmentContext$preInitDataMap$3(this), new PreInitFragmentContext$preInitDataMap$4(this))));

    static {
        Covode.recordClassIndex(18130);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C3257c.class, "roomCreateInfoInitFlag", "getRoomCreateInfoInitFlag()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(C3257c.class, "roomCreateInfo", "getRoomCreateInfo()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(C3257c.class, "userPermissionInitFlag", "getUserPermissionInitFlag()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl3);
        PropertyReference1Impl propertyReference1Impl4 = new PropertyReference1Impl(C3257c.class, "userPermission", "getUserPermission()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl4);
        f25957LJ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3, propertyReference1Impl4};
    }

    public final C2WC<PreInitState> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZLLL, false, 1);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIIZ.LIZ(this, f25957LJ[0]));
    }

    /* renamed from: LJ */
    public final C2WC<RoomCreateInfo> m15876LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZLLL, false, 2);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIJ.LIZ(this, f25957LJ[1]));
    }

    public final C2WC<PreInitState> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZLLL, false, 3);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIJJI.LIZ(this, f25957LJ[2]));
    }

    public final C2WC<PermissionResult> LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZLLL, false, 4);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIL.LIZ(this, f25957LJ[3]));
    }

    private final boolean LJIIIIZZ() {
        if (this.LJI != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.model.AbstractC3155a
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZLLL, false, 17).isSupported) {
            return;
        }
        PreInitState LIZ = LIZLLL().LIZ();
        if (LIZ == PreInitState.DISABLE || LIZ == PreInitState.ERROR) {
            LIZ(true);
        }
    }

    @Override // com.bytedance.android.live.broadcast.model.AbstractC3155a
    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZLLL, false, 18).isSupported) {
            return;
        }
        PreInitState LIZ = LJFF().LIZ();
        if (LIZ == PreInitState.DISABLE || LIZ == PreInitState.ERROR) {
            LIZIZ(true);
        }
    }

    public final void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZLLL, false, 8).isSupported || LIZ().LIZ() == PreInitState.DISABLE) {
            return;
        }
        PreInitState preInitState = PreInitState.COMPLETE;
        for (C3256b c3256b : this.LJFF) {
            ALogger.m15801d("PreInitFragmentContext", "refreshContextState:" + c3256b.LIZIZ + LoggerUtil.TWO_POINT_TAG + c3256b.LIZJ.LIZ().name());
            if (c3256b.LIZJ.LIZ() == PreInitState.WAITING) {
                ALogger.m15801d("PreInitFragmentContext", "start do fetchAction for " + c3256b.LIZIZ);
                c3256b.LIZLLL.invoke(Boolean.FALSE);
            }
            if (c3256b.LIZJ.LIZ() == PreInitState.COMPLETE && LJIIIIZZ()) {
                ALogger.m15801d("PreInitFragmentContext", "start do syncAction for " + c3256b.LIZIZ);
                c3256b.f25956LJ.mo30099invoke();
            }
            if (c3256b.LIZJ.LIZ() == PreInitState.ERROR) {
                ALogger.m15800e("PreInitFragmentContext", "----state ERROR for " + c3256b.LIZIZ + "----");
            }
            preInitState = preInitState.LIZ(c3256b.LIZJ.LIZ());
        }
        LIZ().LIZ(preInitState);
        ALogger.m15801d("PreInitFragmentContext", "refreshContextState,now global state:" + LIZ().LIZ().name());
    }

    @Override // com.bytedance.android.live.broadcast.model.AbstractC3155a
    public final void LIZ(C3180k c3180k) {
        if (PatchProxy.proxy(new Object[]{c3180k}, this, LIZLLL, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3180k);
        ALogger.m15801d("PreInitFragmentContext", "bindWidgetContext");
        this.LJI = c3180k;
        LJII();
    }

    public final void LIZIZ(final boolean z) {
        String str;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZLLL, false, 14).isSupported) {
            return;
        }
        if (TTLiveSDKContext.getHostService() != null) {
            C88306Kqq LIZ = C88306Kqq.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            if (LIZ.LIZIZ != null) {
                ALogger.m15801d("PreInitFragmentContext", "start calling userPermission function");
                LJFF().LIZ(PreInitState.LOADING);
                StartLiveApi startLiveApi = (StartLiveApi) C425332sJ.LIZIZ.LIZ(StartLiveApi.class);
                IUser LIZ2 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                String secUid = LIZ2.getSecUid();
                SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_MINIAPP_ENTRANCE_PERMISSION;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue()) {
                    str = "open";
                } else {
                    str = "white_list";
                }
                Disposable subscribe = startLiveApi.getUserPermissionWithId(secUid, str).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<C5176i<PermissionResult>>() { // from class: X.3OU
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(18136);
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final /* synthetic */ void accept(C5176i<PermissionResult> c5176i) {
                        C2WC<PermissionResult> LJI;
                        boolean z2;
                        boolean z3;
                        boolean z4;
                        boolean z5;
                        boolean z6;
                        int giftSettingSwitch;
                        boolean z7;
                        C5176i<PermissionResult> c5176i2 = c5176i;
                        boolean z8 = true;
                        if (!PatchProxy.proxy(new Object[]{c5176i2}, this, LIZ, false, 1).isSupported) {
                            C3257c c3257c = C3257c.this;
                            PermissionResult permissionResult = c5176i2.LIZJ;
                            Intrinsics.checkNotNullExpressionValue(permissionResult, "");
                            PermissionResult permissionResult2 = permissionResult;
                            if (!PatchProxy.proxy(new Object[]{permissionResult2}, c3257c, C3257c.LIZLLL, false, 16).isSupported) {
                                if (permissionResult2.getRecord() == 1) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.LLLLZLL;
                                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                                c87308Kak.LIZ(Boolean.valueOf(z2));
                                if (z2) {
                                    C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.f7260k;
                                    Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                                    Boolean LIZ3 = c87308Kak2.LIZ();
                                    Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                                    if (LIZ3.booleanValue()) {
                                        C87308Kak<Boolean> c87308Kak3 = AbstractC80293Hkt.f7260k;
                                        Intrinsics.checkNotNullExpressionValue(c87308Kak3, "");
                                        c87308Kak3.LIZ(Boolean.FALSE);
                                        C87308Kak<Boolean> c87308Kak4 = AbstractC80293Hkt.f7259j;
                                        Intrinsics.checkNotNullExpressionValue(c87308Kak4, "");
                                        c87308Kak4.LIZ(Boolean.TRUE);
                                    }
                                } else {
                                    C87308Kak<Boolean> c87308Kak5 = AbstractC80293Hkt.f7259j;
                                    Intrinsics.checkNotNullExpressionValue(c87308Kak5, "");
                                    c87308Kak5.LIZ(Boolean.FALSE);
                                }
                                if (permissionResult2.getPlayBack() != 1 && permissionResult2.getHighlight() != 1) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                C87308Kak<Boolean> c87308Kak6 = AbstractC80293Hkt.LLLLZLLIL;
                                Intrinsics.checkNotNullExpressionValue(c87308Kak6, "");
                                c87308Kak6.LIZ(Boolean.valueOf(z3));
                                C87308Kak<Boolean> c87308Kak7 = AbstractC80293Hkt.LLLZ;
                                Intrinsics.checkNotNullExpressionValue(c87308Kak7, "");
                                c87308Kak7.LIZ(Boolean.valueOf(z3));
                                C87308Kak<Boolean> c87308Kak8 = AbstractC80293Hkt.LLLZI;
                                Intrinsics.checkNotNullExpressionValue(c87308Kak8, "");
                                if (permissionResult2.getPlayBack() == 1) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                c87308Kak8.LIZ(Boolean.valueOf(z4));
                                C87308Kak<Boolean> c87308Kak9 = AbstractC80293Hkt.LLLZZIL;
                                Intrinsics.checkNotNullExpressionValue(c87308Kak9, "");
                                c87308Kak9.LIZ(Boolean.valueOf(z3));
                                C87308Kak<Boolean> c87308Kak10 = AbstractC80293Hkt.LLLZLL;
                                Intrinsics.checkNotNullExpressionValue(c87308Kak10, "");
                                c87308Kak10.LIZ(Boolean.valueOf(permissionResult2.commerceReplay));
                                C87308Kak<Boolean> c87308Kak11 = AbstractC80293Hkt.LLLZZ;
                                Intrinsics.checkNotNullExpressionValue(c87308Kak11, "");
                                c87308Kak11.LIZ(Boolean.valueOf(permissionResult2.commerceRequestExplain));
                                if (permissionResult2.getPlayBack() == 1) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                C87308Kak<Boolean> c87308Kak12 = AbstractC80293Hkt.LLLLZLLLI;
                                Intrinsics.checkNotNullExpressionValue(c87308Kak12, "");
                                c87308Kak12.LIZ(Boolean.valueOf(z5));
                                if (permissionResult2.groupChat == 1) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                C87308Kak<Boolean> c87308Kak13 = AbstractC80293Hkt.LLZIL;
                                Intrinsics.checkNotNullExpressionValue(c87308Kak13, "");
                                c87308Kak13.LIZ(Boolean.valueOf(z6));
                                if (z6) {
                                    C87308Kak<Boolean> c87308Kak14 = AbstractC80293Hkt.LLZILL;
                                    Intrinsics.checkNotNullExpressionValue(c87308Kak14, "");
                                    Boolean LIZ4 = c87308Kak14.LIZ();
                                    Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                                    if (LIZ4.booleanValue()) {
                                        C87308Kak<Boolean> c87308Kak15 = AbstractC80293Hkt.LLZILL;
                                        Intrinsics.checkNotNullExpressionValue(c87308Kak15, "");
                                        c87308Kak15.LIZ(Boolean.FALSE);
                                        C87308Kak<Boolean> c87308Kak16 = AbstractC80293Hkt.LLZIL;
                                        Intrinsics.checkNotNullExpressionValue(c87308Kak16, "");
                                        c87308Kak16.LIZ(Boolean.TRUE);
                                    }
                                } else {
                                    C87308Kak<Boolean> c87308Kak17 = AbstractC80293Hkt.LLZIL;
                                    Intrinsics.checkNotNullExpressionValue(c87308Kak17, "");
                                    c87308Kak17.LIZ(Boolean.FALSE);
                                }
                                C87308Kak<Integer> c87308Kak18 = AbstractC80293Hkt.LLZL;
                                Intrinsics.checkNotNullExpressionValue(c87308Kak18, "");
                                SettingKey<Integer> settingKey2 = LiveConfigSettingKeys.LIVE_ALLOW_GIFT_SETTING_NEED_LOCALIZATION;
                                Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                                Integer value2 = settingKey2.getValue();
                                if (value2 != null && value2.intValue() == 0 && permissionResult2.getGiftSettingSwitch() == 1) {
                                    giftSettingSwitch = 3;
                                } else {
                                    giftSettingSwitch = permissionResult2.getGiftSettingSwitch();
                                }
                                c87308Kak18.LIZ(Integer.valueOf(giftSettingSwitch));
                                C87308Kak<Boolean> c87308Kak19 = AbstractC80293Hkt.LLZLI;
                                Intrinsics.checkNotNullExpressionValue(c87308Kak19, "");
                                Boolean LIZ5 = c87308Kak19.LIZ();
                                SettingKey<Integer> settingKey3 = LiveConfigSettingKeys.LIVE_ALLOW_GIFT_SETTING_NEED_LOCALIZATION;
                                Intrinsics.checkNotNullExpressionValue(settingKey3, "");
                                Integer value3 = settingKey3.getValue();
                                if (value3 != null && value3.intValue() == 2) {
                                    C87308Kak<Boolean> c87308Kak20 = AbstractC80293Hkt.LLZLI;
                                    Intrinsics.checkNotNullExpressionValue(c87308Kak20, "");
                                    c87308Kak20.LIZ(Boolean.TRUE);
                                }
                                C87308Kak<Boolean> c87308Kak21 = AbstractC80293Hkt.LLZZLLIL;
                                Intrinsics.checkNotNullExpressionValue(c87308Kak21, "");
                                if (permissionResult2.canBuyVIP == 1) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                c87308Kak21.LIZ(Boolean.valueOf(z7));
                                C87308Kak<Boolean> c87308Kak22 = AbstractC80293Hkt.LLZZZIL;
                                Intrinsics.checkNotNullExpressionValue(c87308Kak22, "");
                                c87308Kak22.LIZ(Boolean.TRUE);
                                IUser LIZ6 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
                                Intrinsics.checkNotNullExpressionValue(LIZ6, "");
                                if (LIZ6.isEnableShowCommerceSale()) {
                                    SettingKey<Boolean> settingKey4 = LiveConfigSettingKeys.LIVE_ANCHOR_ENABLE_SAVE_GIFT_STATUS;
                                    Intrinsics.checkNotNullExpressionValue(settingKey4, "");
                                    if (Intrinsics.areEqual(settingKey4.getValue(), Boolean.TRUE)) {
                                        C87308Kak<Boolean> c87308Kak23 = AbstractC80293Hkt.LLZLI;
                                        Intrinsics.checkNotNullExpressionValue(c87308Kak23, "");
                                        c87308Kak23.LIZ(LIZ5);
                                    }
                                }
                                ((LivePrivilegeSettingApi) C88306Kqq.LIZ().LIZ(LivePrivilegeSettingApi.class)).getPrivilegeBarrageSetting().compose(C100839PnV.LIZJ()).subscribe(C420402kM.LIZIZ, C420412kN.LIZIZ);
                            }
                            C2WC<PermissionResult> LJI2 = C3257c.this.LJI();
                            PermissionResult permissionResult3 = c5176i2.LIZJ;
                            Intrinsics.checkNotNullExpressionValue(permissionResult3, "");
                            LJI2.LIZ(permissionResult3);
                            C3257c.this.LJFF().LIZ(PreInitState.COMPLETE);
                            C3OY.LIZ(c5176i2.f26526LJ, c5176i2.LIZJ.toString());
                            C86665KDb.LIZ(C86665KDb.LIZ("ttlive_fetch_preview_user_permission", "preview", null, null, 12, null), 0).LIZ().LIZ();
                            C86665KDb.LIZ(C86748KGg.LIZ("ttlive_fetch_preview_user_permission", null, null, "preview", 6, null), 0).LIZ("log_id", (Object) c5176i2.f26526LJ).LIZ().LIZ();
                            if (z) {
                                C3180k c3180k = C3257c.this.LJI;
                                if (c3180k != null && (LJI = c3180k.LJI()) != null) {
                                    LJI.LIZ(C3257c.this.LJI().LIZ());
                                }
                                StringBuilder sb = new StringBuilder("force set userPermission:");
                                if (C3257c.this.LJI != null) {
                                    z8 = false;
                                }
                                sb.append(z8);
                                ALogger.m15801d("PreInitFragmentContext", sb.toString());
                            }
                        }
                    }
                }, new Consumer<Throwable>() { // from class: X.3OX
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(18137);
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final /* synthetic */ void accept(Throwable th) {
                        String str2;
                        int i;
                        Throwable th2 = th;
                        if (!PatchProxy.proxy(new Object[]{th2}, this, LIZ, false, 1).isSupported) {
                            C3257c.this.LJI().LIZ(new PermissionResult());
                            C3257c.this.LJFF().LIZ(PreInitState.ERROR);
                            if (!(th2 instanceof ApiServerException)) {
                                str2 = "";
                                i = 1;
                            } else {
                                ApiException apiException = (ApiException) th2;
                                str2 = String.valueOf(apiException.mErrorCode);
                                i = apiException.mErrorCode;
                            }
                            C3OY c3oy = C3OY.LIZIZ;
                            Integer valueOf = Integer.valueOf(i);
                            String message = th2.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            c3oy.LIZ(valueOf, message);
                            C91219Lwj LIZ3 = C86665KDb.LIZ("ttlive_fetch_preview_user_permission", "preview", null, null, 12, null).LIZ(str2).LIZ("errMsg", (Object) th2.toString());
                            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                            C86665KDb.LIZ(LIZ3, 1).LIZ().LIZ();
                            C91219Lwj LIZ4 = C86748KGg.LIZ("ttlive_fetch_preview_user_permission", "preview", null, null, 12, null).LIZ("err_msg", (Object) th2.toString());
                            Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                            C86665KDb.LIZ(LIZ4, i).LIZ().LIZ();
                        }
                    }
                });
                if (subscribe != null) {
                    LIZ(subscribe);
                    return;
                }
                return;
            }
        }
        LJI().LIZ(new PermissionResult());
        LJFF().LIZ(PreInitState.ERROR);
        C3OY.LIZIZ.LIZ((Integer) 1, "网络请求库初始化失败");
        C91219Lwj LIZ3 = C86665KDb.LIZ("ttlive_fetch_preview_user_permission", "preview", null, null, 12, null).LIZ("");
        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
        C86665KDb.LIZ(LIZ3, 1).LIZ().LIZ();
        C86665KDb.LIZ(C86748KGg.LIZ("ttlive_fetch_preview_user_permission", "preview", null, null, 12, null), -1).LIZ().LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0101, code lost:
        if (r0.longValue() == 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(final boolean r14) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.viewmodel.C3257c.LIZ(boolean):void");
    }
}
