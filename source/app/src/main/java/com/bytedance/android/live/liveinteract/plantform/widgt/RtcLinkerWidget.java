package com.bytedance.android.live.liveinteract.plantform.widgt;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4763ad;
import com.bytedance.android.live.liveinteract.videotalk.C4910c;
import com.bytedance.android.live.pushstream.p420g.AbstractC5442a;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import com.p1594ss.avframework.livestreamv2.core.Client;
import com.p1594ss.avframework.livestreamv2.core.LiveCore;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.HashSet;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C79199HJx;
import p003X.HE2;
import p003X.IQV;
import p003X.IQX;

/* loaded from: classes3.dex */
public final class RtcLinkerWidget extends RoomWidget implements AbstractC4763ad, AbstractC4569445g {
    public static ChangeQuickRedirect LIZIZ;
    public C79199HJx LIZJ;
    public Room LIZLLL;

    /* renamed from: LJ */
    public CompositeDisposable f26434LJ = new CompositeDisposable();

    static {
        Covode.recordClassIndex(29586);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 4).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4763ad
    public final C79199HJx LIZ() {
        return this.LIZJ;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        Room room;
        C2WC<Room> LIZ;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LIZ = LJJJI.LIZ()) != null) {
            room = LIZ.LIZ();
        } else {
            room = null;
        }
        this.LIZLLL = room;
        Object obj = this.dataCenter.get("data_is_anchor", (String) Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        ((Boolean) obj).booleanValue();
        Room room2 = this.LIZLLL;
        if (room2 != null) {
            LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII, "");
            this.LIZJ = new C79199HJx(room2, LJII);
        }
        Pair LIZ2 = IQV.LIZ((Function0) RtcLinkerWidget$onCreate$pair$1.INSTANCE);
        ((C4910c) LIZ2.getFirst()).LIZ().LIZIZ(this);
        IQX.LIZ((C13491f) LIZ2.getFirst(), "rtc_linker_service");
        this.f26434LJ.add((Disposable) LIZ2.getSecond());
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        LiveCore liveCore;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 2).isSupported) {
            return;
        }
        super.onDestroy();
        this.f26434LJ.dispose();
        C79199HJx c79199HJx = this.LIZJ;
        if (c79199HJx != null && !PatchProxy.proxy(new Object[0], c79199HJx, C79199HJx.LIZ, false, 25).isSupported) {
            c79199HJx.LJIIIZ = false;
            Client client = c79199HJx.LIZIZ;
            if (client != null) {
                client.stopForwardStreamToRooms();
            }
            Client client2 = c79199HJx.LIZIZ;
            if (client2 != null) {
                client2.stop();
            }
            Client client3 = c79199HJx.LIZIZ;
            if (client3 != null) {
                client3.dispose();
            }
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.RESET_LIVE_CORE_PARAMS_LEAVE_CHANNEL;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue() && (liveCore = c79199HJx.LIZJ) != null) {
                liveCore.resetSdkParams();
            }
            Disposable disposable = c79199HJx.f6742LJ;
            if (disposable != null) {
                disposable.dispose();
            }
            c79199HJx.LJIILIIL.clear();
            c79199HJx.LJIIL.clear();
            HashSet<String> hashSet = c79199HJx.LJIIJJI;
            if (hashSet != null) {
                hashSet.clear();
            }
            AbstractC5442a LIZ = c79199HJx.LIZ();
            if (LIZ != null) {
                LIZ.LIZ();
            }
            c79199HJx.LJFF.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4763ad
    public final void LIZ(HE2 he2) {
        if (PatchProxy.proxy(new Object[]{he2}, this, LIZIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(he2);
        C79199HJx c79199HJx = this.LIZJ;
        if (c79199HJx != null) {
            c79199HJx.LJII = he2;
        }
        if (he2.LIZIZ == null) {
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.SHOW_LINK_CROSS_ROOM_RESET_STACKTRACE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                ALogger.m15794w("ttlive_pk", "RtcLinkerWidget.setManagerData", new IllegalStateException());
            }
        }
    }
}
