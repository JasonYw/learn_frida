package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.model.CategoryNode;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget;
import com.bytedance.android.live.broadcast.widget.LiveSettingRoomIntroduceWidget;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C4574547f;
import p003X.C87308Kak;
import p003X.LK1;

/* loaded from: classes12.dex */
public final class LiveSettingRoomIntroduceWidget extends AbsRecyclablePreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LJFF;
    public static final /* synthetic */ KProperty[] LJI;
    public final Lazy LJII = LIZ(C3199v.class);
    public final Function0<Unit> LJIIIIZZ;
    public View LJIIIZ;
    public View LJIIJ;

    static {
        Covode.recordClassIndex(18359);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(LiveSettingRoomIntroduceWidget.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        LJI = new KProperty[]{propertyReference1Impl};
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "LiveSettingRoomIntroduceWidget";
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699863;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJFF, false, 7).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LJFF, false, 3).isSupported) {
            return;
        }
        super.onResume();
        C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7083cE;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        if (!c87308Kak.LIZ().booleanValue()) {
            View view = this.LJIIJ;
            if (view != null) {
                LK1.LIZJ(view);
                return;
            }
            return;
        }
        View view2 = this.LJIIJ;
        if (view2 != null) {
            LK1.LIZ(view2);
        }
    }

    public LiveSettingRoomIntroduceWidget(Function0<Unit> function0) {
        C106862S5w.LIZ(function0);
        this.LJIIIIZZ = function0;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LJFF, false, 2).isSupported) {
            return;
        }
        this.LJIIIZ = findViewById(2131188301);
        this.LJIIJ = findViewById(2131188294);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LJFF, false, 5).isSupported) {
            return;
        }
        View view = this.LJIIIZ;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: X.39K
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(18360);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object LIZ2;
                    Long l;
                    if (PatchProxy.proxy(new Object[]{view2}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    LiveSettingRoomIntroduceWidget liveSettingRoomIntroduceWidget = LiveSettingRoomIntroduceWidget.this;
                    if (!PatchProxy.proxy(new Object[0], liveSettingRoomIntroduceWidget, LiveSettingRoomIntroduceWidget.LJFF, false, 4).isSupported) {
                        liveSettingRoomIntroduceWidget.LJIIIIZZ.mo30099invoke();
                        if (liveSettingRoomIntroduceWidget.context instanceof FragmentActivity) {
                            LiveMode LIZ3 = liveSettingRoomIntroduceWidget.LIZIZ().LIZ().LIZ();
                            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], liveSettingRoomIntroduceWidget, LiveSettingRoomIntroduceWidget.LJFF, false, 1);
                            if (proxy.isSupported) {
                                LIZ2 = proxy.result;
                            } else {
                                LIZ2 = liveSettingRoomIntroduceWidget.LIZ(liveSettingRoomIntroduceWidget.LJII, liveSettingRoomIntroduceWidget, LiveSettingRoomIntroduceWidget.LJI[0]);
                            }
                            CategoryNode LIZ4 = ((C3199v) LIZ2).LJIILL().LIZ();
                            if (LIZ4 != null) {
                                l = LIZ4.categoryId;
                            } else {
                                l = null;
                            }
                            IBroadcastService iBroadcastService = (IBroadcastService) ServiceManager.getService(IBroadcastService.class);
                            Context context = liveSettingRoomIntroduceWidget.context;
                            if (context != null) {
                                iBroadcastService.openRoomIntroDialog((FragmentActivity) context, null, LIZ3, l);
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put("action_type", "click");
                                linkedHashMap.put("anchor_id", String.valueOf(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ()));
                                linkedHashMap.put("request_page", "live_start");
                                C4574547f.LIZ().LIZ("livesdk_room_detail_setting", linkedHashMap, new Object[0]);
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                    }
                }
            });
        }
        if (!PatchProxy.proxy(new Object[0], this, LJFF, false, 6).isSupported) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("action_type", "show");
            linkedHashMap.put("anchor_id", String.valueOf(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ()));
            linkedHashMap.put("request_page", "live_start");
            C4574547f.LIZ().LIZ("livesdk_room_detail_setting", linkedHashMap, new Object[0]);
        }
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
    }
}
