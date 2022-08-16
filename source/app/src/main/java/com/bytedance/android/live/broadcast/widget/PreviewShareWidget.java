package com.bytedance.android.live.broadcast.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.broadcast.widget.PreviewShareWidget;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.network.response.C5171b;
import com.bytedance.android.live.room.api.ILiveShareService;
import com.bytedance.android.live.room.api.share.model.LiveShareType;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.depend.share.AbstractC5817b;
import com.bytedance.android.livehostapi.business.depend.share.C5819h;
import com.bytedance.android.livehostapi.business.depend.share.ShareScene;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC445813kF;
import p003X.AbstractC4569445g;
import p003X.C148062fT6;
import p003X.C3VF;
import p003X.KDS;
import p003X.KK6;

@AbstractC445813kF(LIZ = "SHARE")
/* loaded from: classes12.dex */
public final class PreviewShareWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public final Lazy LIZJ = LIZ(C3199v.class);

    static {
        Covode.recordClassIndex(18676);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewShareWidget.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        LIZIZ = new KProperty[]{propertyReference1Impl};
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewShareWidget";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        LJIILJJIL();
        View view = this.contentView;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: X.3Bf
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(18681);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object LIZ2;
                    C5819h.C5820a c5820a;
                    if (PatchProxy.proxy(new Object[]{view2}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    PreviewShareWidget previewShareWidget = PreviewShareWidget.this;
                    if (!PatchProxy.proxy(new Object[0], previewShareWidget, PreviewShareWidget.LIZ, false, 5).isSupported) {
                        final LiveMode LIZ3 = previewShareWidget.LJIIJJI().LIZ().LIZ();
                        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], previewShareWidget, PreviewShareWidget.LIZ, false, 1);
                        if (proxy.isSupported) {
                            LIZ2 = proxy.result;
                        } else {
                            LIZ2 = previewShareWidget.LIZ(previewShareWidget.LIZJ, previewShareWidget, PreviewShareWidget.LIZIZ[0]);
                        }
                        String LIZ4 = ((C3199v) LIZ2).LJII().LIZ();
                        final IUser LIZ5 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
                        Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                        User from = User.from(LIZ5);
                        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{from}, null, C5819h.LIZ, true, 4);
                        if (proxy2.isSupported) {
                            c5820a = (C5819h.C5820a) proxy2.result;
                        } else {
                            c5820a = new C5819h.C5820a(from, (byte) 0);
                        }
                        c5820a.LIZ(new AbstractC124394YxY() { // from class: X.3Bj
                            static {
                                Covode.recordClassIndex(18680);
                            }

                            @Override // p003X.AbstractC124394YxY
                            public final void LIZ() {
                            }

                            @Override // p003X.AbstractC124394YxY
                            public final void LIZIZ() {
                            }
                        });
                        c5820a.LIZ(LIZ4);
                        c5820a.LIZLLL("");
                        c5820a.LIZIZ(true);
                        c5820a.LJJIJIL = ShareScene.PRE_LIVE;
                        c5820a.LIZJ = 0L;
                        if (!PatchProxy.proxy(new Object[]{c5820a, "click", LIZ5}, C422732o7.LIZIZ, C422732o7.LIZ, false, 1).isSupported && LIZ5.isEnableShowCommerceSale()) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
                            hashMap.put("enter_from", "live");
                            hashMap.put("author_id", String.valueOf(LIZ5.getId()));
                            hashMap.put("user_id", String.valueOf(LIZ5.getId()));
                            hashMap.put("share_content", "live");
                            hashMap.put("share_action_type", "click");
                            C4574547f.LIZ().LIZIZ("ecom_share_button_click", hashMap, new C8668v(), Room.class);
                            Bundle LIZIZ2 = c5820a.LIZIZ();
                            if (LIZIZ2 != null) {
                                hashMap.put("is_ec_shopping", "1");
                                String LIZ6 = C3BY.LIZ(hashMap);
                                if (LIZ6 != null) {
                                    LIZIZ2.putString("ecom_share_track_params", LIZ6);
                                }
                            }
                        }
                        ILiveShareService iLiveShareService = (ILiveShareService) ServiceManager.getService(ILiveShareService.class);
                        C423292p1 c423292p1 = new C423292p1(null, null, null, null, null, null, null, null, null, null, null, 2047);
                        C5819h LIZ7 = c5820a.LIZ();
                        Intrinsics.checkNotNullExpressionValue(LIZ7, "");
                        C423292p1 LIZ8 = c423292p1.LIZ(LIZ7);
                        Context context = previewShareWidget.context;
                        if (context != null) {
                            LIZ8.LIZ((Activity) context);
                            iLiveShareService.share(LIZ8.LIZ(), previewShareWidget.LIZ(), LiveShareType.SHARE_DIALOG, new AbstractC5817b() { // from class: X.3Bg
                                public static ChangeQuickRedirect LIZ;

                                static {
                                    Covode.recordClassIndex(18679);
                                }

                                @Override // com.bytedance.android.livehostapi.business.depend.share.AbstractC5817b
                                public final void LIZ(Throwable th) {
                                    if (PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 2).isSupported) {
                                        return;
                                    }
                                    C106862S5w.LIZ(th);
                                }

                                @Override // com.bytedance.android.livehostapi.business.depend.share.AbstractC5817b
                                public final boolean LIZ(C5819h c5819h) {
                                    PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{c5819h}, this, LIZ, false, 3);
                                    if (proxy3.isSupported) {
                                        return ((Boolean) proxy3.result).booleanValue();
                                    }
                                    C106862S5w.LIZ(c5819h);
                                    return false;
                                }

                                @Override // com.bytedance.android.livehostapi.business.depend.share.AbstractC5817b
                                public final void LIZ(String str, String str2) {
                                    if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 1).isSupported) {
                                        return;
                                    }
                                    C106862S5w.LIZ(str, str2);
                                    HashMap hashMap2 = new HashMap();
                                    hashMap2.put("streaming_type", "general");
                                    hashMap2.put("anchor_id", String.valueOf(IUser.this.getId()));
                                    hashMap2.put("live_type", C442873fV.LIZ.LIZIZ(LIZ3));
                                    hashMap2.put("user_type", "anchor");
                                    hashMap2.put("share_platform", str);
                                    C4574547f LIZ9 = C4574547f.LIZ();
                                    C8668v c8668v = new C8668v();
                                    c8668v.LIZ("live_take_page");
                                    c8668v.LIZIZ("live");
                                    LIZ9.LIZ("share", hashMap2, c8668v);
                                }
                            });
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("request_page", "live_take_page");
                            hashMap2.put("streaming_type", "general");
                            hashMap2.put("anchor_id", String.valueOf(LIZ5.getId()));
                            hashMap2.put("live_type", C442873fV.LIZ.LIZIZ(LIZ3));
                            hashMap2.put("user_type", "anchor");
                            C4574547f LIZ9 = C4574547f.LIZ();
                            C8668v c8668v = new C8668v();
                            c8668v.LIZ("live_take_page");
                            c8668v.LIZIZ("event_belong");
                            LIZ9.LIZ("share_icon_click", hashMap2, c8668v);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                    }
                }
            });
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (KK6.LIZ()) {
            return 2131698450;
        }
        return 2131698449;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        C3VF user;
        IUser LIZ2;
        Long valueOf;
        C3VF user2;
        IUser LIZ3;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onCreate();
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_PREVIEW_SHARE_WIDGET_SERCET;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (!settingKey.getValue().booleanValue()) {
            IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
            if (iUserService != null && (user2 = iUserService.user()) != null && (LIZ3 = user2.LIZ()) != null && LIZ3.getSecret() == 1) {
                LJIILL();
                return;
            } else {
                LIZIZ();
                return;
            }
        }
        IUserService iUserService2 = (IUserService) ServiceManager.getService(IUserService.class);
        if (iUserService2 != null && (user = iUserService2.user()) != null && (LIZ2 = user.LIZ()) != null && (valueOf = Long.valueOf(LIZ2.getId())) != null) {
            ((KDS) ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ(valueOf.longValue()).observeOn(AndroidSchedulers.mainThread()).m149as(C148062fT6.LIZ(this))).LIZ(new Consumer<C5171b<User, User.C2848a>>() { // from class: X.3Bh
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(18677);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(C5171b<User, User.C2848a> c5171b) {
                    User user3;
                    C5171b<User, User.C2848a> c5171b2 = c5171b;
                    if (!PatchProxy.proxy(new Object[]{c5171b2}, this, LIZ, false, 1).isSupported) {
                        if (c5171b2 != null && (user3 = c5171b2.LIZJ) != null && user3.getSecret() == 1) {
                            PreviewShareWidget.this.LJIILL();
                        } else {
                            PreviewShareWidget.this.LIZIZ();
                        }
                    }
                }
            }, new Consumer<Throwable>() { // from class: X.3Bi
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(18678);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Throwable th) {
                    Throwable th2 = th;
                    if (!PatchProxy.proxy(new Object[]{th2}, this, LIZ, false, 1).isSupported) {
                        PreviewShareWidget.this.LIZIZ();
                        ALogger.m15799e(PreviewShareWidget.this.LIZ(), th2.toString(), th2);
                    }
                }
            });
        } else {
            LIZIZ();
        }
    }
}
