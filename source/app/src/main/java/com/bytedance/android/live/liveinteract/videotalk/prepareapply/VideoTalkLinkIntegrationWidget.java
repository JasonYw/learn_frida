package com.bytedance.android.live.liveinteract.videotalk.prepareapply;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.tetris.widgets.LiveWidget;
import com.bytedance.android.live.liveinteract.plantform.permission.model.C4825a;
import com.bytedance.android.live.liveinteract.plantform.permission.model.OperateType;
import com.bytedance.android.live.liveinteract.voicechat.match.ChatMatchWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C9605p;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C80517HoV;
import p003X.DialogC77423Gfh;
import p003X.H7P;

/* loaded from: classes3.dex */
public final class VideoTalkLinkIntegrationWidget extends LiveWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public ChatMatchWidget LIZIZ;
    public final CompositeDisposable LIZJ = new CompositeDisposable();
    public boolean LIZLLL;

    /* renamed from: LJ */
    public C9605p f26447LJ;
    public Room LJFF;

    static {
        Covode.recordClassIndex(30325);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 10).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        ALogger.m15801d("VideoTalkLinkIntegrationWidget", "unloadMatchWidget");
        WidgetManager widgetManager = this.subWidgetManager;
        if (widgetManager != null) {
            widgetManager.unload(this.LIZIZ);
        }
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        m15684LJ();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        enableSubWidgetManager();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onDestroy();
        LIZIZ();
        this.LIZLLL = false;
        this.LIZJ.dispose();
    }

    /* renamed from: LJ */
    private final void m15684LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        C80517HoV.LIZ().LIZ(new C4825a(context, 16, OperateType.PRE_APPLY, 2, this.LJFF, 0L, null, null, 224), new H7P(this));
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        ALogger.m15801d("VideoTalkLinkIntegrationWidget", "loadMatchWidget");
        if (this.LIZIZ == null) {
            this.LIZIZ = new ChatMatchWidget(false);
        }
        WidgetManager widgetManager = this.subWidgetManager;
        if (widgetManager != null) {
            widgetManager.load(this.LIZIZ);
        }
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        Room room = this.LJFF;
        DataCenter dataCenter = getDataCenter();
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        C116971W2r.LIZJ(new DialogC77423Gfh(context, room, dataCenter));
    }

    public VideoTalkLinkIntegrationWidget(Room room) {
        C106862S5w.LIZ(room);
        this.LJFF = room;
    }
}
