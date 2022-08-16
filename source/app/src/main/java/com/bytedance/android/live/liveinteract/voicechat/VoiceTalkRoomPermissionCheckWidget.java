package com.bytedance.android.live.liveinteract.voicechat;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.permissioncheck.p407c.C5185b;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.p517u.AbstractC6303g;
import com.bytedance.android.livesdk.chatroom.p517u.C6306l;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.ktvapi.IKtvService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413392Xt;
import p003X.AbstractC4569445g;
import p003X.AbstractC78986HBs;
import p003X.C2WC;
import p003X.C78886H7w;
import p003X.C78887H7x;

/* loaded from: classes3.dex */
public final class VoiceTalkRoomPermissionCheckWidget extends RoomWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public final CompositeDisposable LIZIZ = new CompositeDisposable();
    public AbstractC5436a LIZJ;
    public Room LIZLLL;

    /* renamed from: LJ */
    public boolean f26477LJ;
    public AbstractC78986HBs<LinkPlayerInfo> LJFF;

    static {
        Covode.recordClassIndex(30846);
    }

    private final void LIZIZ() {
        boolean z = PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported;
    }

    public final C5185b LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (C5185b) proxy.result;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 11).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onPause();
        if (this.f26477LJ) {
            LIZIZ();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onResume();
        if (!this.f26477LJ) {
            LIZIZ();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onDestroy();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_CHECK_PERMISSION_ENABLED;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            value.booleanValue();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        C2WC<Boolean> currentIsSinger;
        Observable<Boolean> LIZIZ;
        Disposable subscribe;
        AbstractC413392Xt<AbstractC6303g> LJJLL;
        AbstractC6303g LIZIZ2;
        Observable<C6306l> LIZIZ3;
        Disposable subscribe2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        Room room = this.LIZLLL;
        if (room != null) {
            boolean z = PatchProxy.proxy(new Object[]{this.LJFF, Byte.valueOf(this.f26477LJ ? (byte) 1 : (byte) 0), room, this.LIZJ, LIZ()}, this, LIZ, false, 10).isSupported;
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJJLL = LJJJI.LJJLL()) != null && (LIZIZ2 = LJJLL.LIZIZ()) != null && (LIZIZ3 = LIZIZ2.LIZIZ()) != null && (subscribe2 = LIZIZ3.subscribe(new C78886H7w(this))) != null) {
            this.LIZIZ.add(subscribe2);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported && (currentIsSinger = ((IKtvService) ServiceManager.getService(IKtvService.class)).getCurrentIsSinger()) != null && (LIZIZ = currentIsSinger.LIZIZ()) != null && (subscribe = LIZIZ.subscribe(new C78887H7x(this))) != null) {
            this.LIZIZ.add(subscribe);
        }
    }
}
