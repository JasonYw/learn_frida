package com.bytedance.android.live.liveinteract.videotalk.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.p255g.AbstractC2885g;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.permissioncheck.p407c.C5185b;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.p517u.AbstractC6302f;
import com.bytedance.android.livesdk.chatroom.p517u.C6307m;
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
import p003X.C81827IMz;
import p003X.H8U;
import p003X.H8V;
import p003X.QB4;

/* loaded from: classes3.dex */
public final class VideoTalkRoomPermissionCheckWidget extends RoomWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public C81827IMz LIZIZ;
    public AbstractC5436a LIZJ;
    public Room LIZLLL;

    /* renamed from: LJ */
    public boolean f26464LJ;
    public AbstractC78986HBs<LinkPlayerInfo> LJFF;
    public final CompositeDisposable LJI = new CompositeDisposable();

    static {
        Covode.recordClassIndex(30733);
    }

    private final void LIZJ() {
        boolean z = PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported;
    }

    public final C5185b LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (C5185b) proxy.result;
        }
        return null;
    }

    public final void LIZ(AbstractC2885g abstractC2885g) {
        boolean z = PatchProxy.proxy(new Object[]{abstractC2885g}, this, LIZ, false, 7).isSupported;
    }

    public final void LIZIZ() {
        boolean z = PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported;
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 16).isSupported) {
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
        if (this.f26464LJ) {
            LIZJ();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onResume();
        if (!this.f26464LJ) {
            LIZJ();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onDestroy();
        if (!this.f26464LJ) {
            boolean z = PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported;
        }
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
        C5923dp LJJJI;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ2;
        Observable<C6307m> mo15536LJ;
        Disposable subscribe2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        Room room = this.LIZLLL;
        if (room != null) {
            AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs = this.LJFF;
            boolean z = this.f26464LJ;
            AbstractC5436a abstractC5436a = this.LIZJ;
            C5185b LIZ2 = LIZ();
            if (!PatchProxy.proxy(new Object[]{abstractC78986HBs, Byte.valueOf(z ? (byte) 1 : (byte) 0), room, abstractC5436a, LIZ2}, this, LIZ, false, 15).isSupported && (LJJJI = LJJJI()) != null && (LJJZZIII = LJJJI.LJJZZIII()) != null && (LIZIZ2 = LJJZZIII.LIZIZ()) != null && (mo15536LJ = LIZIZ2.mo15536LJ()) != null && (subscribe2 = mo15536LJ.subscribe(new H8V(this, LIZ2, abstractC78986HBs, z, room, abstractC5436a))) != null) {
                this.LJI.add(subscribe2);
            }
        }
        if (this.f26464LJ) {
            boolean z2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported;
        } else {
            boolean z3 = PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported;
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported && (currentIsSinger = ((IKtvService) ServiceManager.getService(IKtvService.class)).getCurrentIsSinger()) != null && (LIZIZ = currentIsSinger.LIZIZ()) != null && (subscribe = LIZIZ.subscribe(new H8U(this))) != null) {
            QB4.LIZ(subscribe, this.LJI);
        }
    }
}
