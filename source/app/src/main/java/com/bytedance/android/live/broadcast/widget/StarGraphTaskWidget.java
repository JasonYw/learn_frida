package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcast.viewmodel.C3260j;
import com.bytedance.android.live.broadcast.widget.StarGraphTaskWidget;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ExtendedToolbarButton;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.dynamic.C6514m;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.reddot.C9225a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C3VF;
import p003X.C413202Xa;
import p003X.C415302c8;

/* loaded from: classes12.dex */
public final class StarGraphTaskWidget extends LiveRecyclableWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final Lazy LIZJ = LazyKt__LazyJVMKt.lazy(StarGraphTaskWidget$viewModel$2.INSTANCE);

    static {
        Covode.recordClassIndex(18787);
    }

    public final C3260j LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (C3260j) (proxy.isSupported ? proxy.result : this.LIZJ.mo27335getValue());
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
    }

    public final Room LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (Room) proxy.result;
        }
        return (Room) this.dataCenter.get("data_room", (String) null);
    }

    public final long LIZ() {
        C3VF user;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
        if (iUserService != null && (user = iUserService.user()) != null) {
            return user.LIZIZ();
        }
        return -1L;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C415302c8 LIZIZ = C413202Xa.LIZIZ();
        ExtendedToolbarButton extended = ToolbarButton.STAR_GRAPH.extended();
        Intrinsics.checkNotNullExpressionValue(extended, "");
        final StarGraphTaskWidget$onInit$1 starGraphTaskWidget$onInit$1 = new StarGraphTaskWidget$onInit$1(this);
        final StarGraphTaskWidget$onInit$2 starGraphTaskWidget$onInit$2 = new StarGraphTaskWidget$onInit$2(this);
        LIZIZ.LIZ(extended, new AbstractC6524y.AbstractView$OnClickListenerC6525b(starGraphTaskWidget$onInit$1, starGraphTaskWidget$onInit$2) { // from class: X.2Jv
            public static ChangeQuickRedirect LIZ;
            public final Function0<Unit> LIZIZ;
            public final Function0<Boolean> LIZJ;

            static {
                Covode.recordClassIndex(18788);
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZ(C2TD c2td) {
                boolean z = PatchProxy.proxy(new Object[]{c2td}, this, LIZ, false, 7).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZ(View view, DataCenter dataCenter) {
                boolean z = PatchProxy.proxy(new Object[]{view, dataCenter}, this, LIZ, false, 3).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZ(C6514m c6514m) {
                boolean z = PatchProxy.proxy(new Object[]{c6514m}, this, LIZ, false, 5).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZ(boolean z) {
                boolean z2 = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final C9225a LIZIZ() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
                if (proxy.isSupported) {
                    return (C9225a) proxy.result;
                }
                return null;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZIZ(View view, DataCenter dataCenter) {
                boolean z = PatchProxy.proxy(new Object[]{view, dataCenter}, this, LIZ, false, 4).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZIZ(C6514m c6514m) {
                boolean z = PatchProxy.proxy(new Object[]{c6514m}, this, LIZ, false, 9).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final boolean aK_() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
                if (proxy.isSupported) {
                    return ((Boolean) proxy.result).booleanValue();
                }
                return this.LIZJ.mo30099invoke().booleanValue();
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                this.LIZIZ.mo30099invoke();
            }

            {
                C106862S5w.LIZ(starGraphTaskWidget$onInit$1, starGraphTaskWidget$onInit$2);
                this.LIZIZ = starGraphTaskWidget$onInit$1;
                this.LIZJ = starGraphTaskWidget$onInit$2;
            }
        });
        LIZJ().f25958LJ.observe(this, new Observer<Boolean>() { // from class: X.2Jw
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18790);
            }

            @Override // androidx.lifecycle.Observer
            public final /* synthetic */ void onChanged(Boolean bool) {
                if (!PatchProxy.proxy(new Object[]{bool}, this, LIZ, false, 1).isSupported) {
                    ALogger.m15797i("StarGraphTaskWidget", "CMD_TOOLBAR_STAR_GRAPH_VISIBLE=" + bool);
                    StarGraphTaskWidget.this.dataCenter.put("cmd_toolbar_star_graph_visible", Boolean.valueOf(Intrinsics.areEqual(bool, Boolean.TRUE)));
                }
            }
        });
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Long l;
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 6).isSupported) {
            return;
        }
        StringBuilder sb = new StringBuilder("room mode: ");
        Room LIZIZ = LIZIZ();
        LiveMode liveMode = null;
        if (LIZIZ != null) {
            l = Long.valueOf(LIZIZ.getLiveRoomMode());
        } else {
            l = null;
        }
        sb.append(l);
        sb.append(", setting: ");
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_PREVIEW_STAR_TASK_ENTER_POINT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        sb.append(settingKey.getValue());
        ALogger.m15797i("StarGraphTaskWidget", sb.toString());
        Room LIZIZ2 = LIZIZ();
        if (LIZIZ2 != null) {
            liveMode = LIZIZ2.getStreamType();
        }
        if (liveMode == LiveMode.SCREEN_RECORD) {
            SettingKey<Boolean> settingKey2 = LiveSettingKeys.LIVE_PREVIEW_STAR_TASK_ENTER_POINT;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            Boolean value = settingKey2.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                LIZJ().LIZ(LIZ());
            }
        }
    }
}
