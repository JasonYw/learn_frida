package com.bytedance.android.live.broadcastgame.widget;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.broadcastgame.AbstractC3475n;
import com.bytedance.android.live.broadcastgame.api.IAnchorGameWidget;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.api.openplatform.AbstractC3398b;
import com.bytedance.android.live.broadcastgame.effectgame.AnchorAudioZhufenGameWidget;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.tetris.layer.core.event.AbstractC4106a;
import com.bytedance.android.live.core.tetris.layer.core.event.C4108b;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.pushstream.IPushStreamService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostContext;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import p003X.AbstractC413392Xt;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C409882Kg;
import p003X.C412362Tu;
import p003X.C423702pg;
import p003X.KW5;
import p003X.KW6;
import p003X.KW7;
import p003X.KXQ;

/* loaded from: classes5.dex */
public final class AnchorGameWidget extends IAnchorGameWidget implements AbstractC4106a, AbstractC4569445g {
    public static ChangeQuickRedirect LIZIZ;
    public AbstractC3475n LIZJ;
    public KW5 LIZLLL;

    /* renamed from: LJ */
    public KW6 f26116LJ;
    public InteractGameSEIWidget LJFF;
    public AbstractC3398b LJI;
    public AbstractC3398b LJII;
    public AbstractC5436a LJIIIIZZ;
    public final Room LJIIIZ;
    public final FragmentManager LJIIJ;

    static {
        Covode.recordClassIndex(21821);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.IAnchorGameWidget
    @Deprecated(message = "可删除")
    public final void LIZ(C3383p c3383p) {
        C106862S5w.LIZ(c3383p);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698300;
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.event.AbstractC4106a
    public final void onEvent(C4108b c4108b) {
        if (PatchProxy.proxy(new Object[]{c4108b}, this, LIZIZ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4108b);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.broadcastgame.api.IAnchorGameWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 14).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.IAnchorGameWidget
    public final void LIZIZ() {
        AbstractC3398b abstractC3398b;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 13).isSupported && (abstractC3398b = this.LJI) != null) {
            abstractC3398b.LIZIZ();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.event.AbstractC4106a
    public final List<Class<? extends C4108b>> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 10);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        return CollectionsKt__CollectionsJVMKt.listOf(C412362Tu.class);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.IAnchorGameWidget
    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 12).isSupported) {
            return;
        }
        AbstractC3398b abstractC3398b = this.LJI;
        if (abstractC3398b != null) {
            KW7.LIZ(abstractC3398b, false, false, 3, null);
        }
        AbstractC3398b abstractC3398b2 = this.LJII;
        if (abstractC3398b2 != null) {
            KW7.LIZ(abstractC3398b2, true, false, 2, null);
        }
    }

    private final AbstractC5436a LIZLLL() {
        AbstractC5436a abstractC5436a;
        AbstractC413392Xt<AbstractC5436a> LJJLIIIJL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 2);
        if (proxy.isSupported) {
            return (AbstractC5436a) proxy.result;
        }
        if (this.LJIIIIZZ == null) {
            if (C423702pg.LJII(this.dataCenter)) {
                abstractC5436a = ((IPushStreamService) ServiceManager.getService(IPushStreamService.class)).getRecordLiveStream(this.context);
            } else {
                C5923dp LIZ = C409882Kg.LIZ(C5923dp.LJIIJ, this.dataCenter, 0L, 2, null);
                if (LIZ != null && (LJJLIIIJL = LIZ.LJJLIIIJL()) != null) {
                    abstractC5436a = LJJLIIIJL.LIZIZ();
                } else {
                    abstractC5436a = null;
                }
            }
            this.LJIIIIZZ = abstractC5436a;
        }
        return this.LJIIIIZZ;
    }

    /* renamed from: LJ */
    private final void m15831LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 8).isSupported) {
            return;
        }
        enableSubWidgetManager();
        if (LIZLLL() != null && isScreenPortrait()) {
            this.subWidgetManager.load(new InteractGameStartupWidget(this.LJI, this.LJII));
            this.subWidgetManager.load(new LiveBroadcastGameControlWidget());
            this.LJFF = new InteractGameSEIWidget(LIZLLL());
            this.subWidgetManager.load(this.LJFF);
            AbstractC5436a LIZLLL = LIZLLL();
            if (LIZLLL != null) {
                this.subWidgetManager.load(2131173779, new LiveGameControlWidget(LIZLLL, this.LJIIIZ.getId(), this.LJIIJ));
            }
            this.subWidgetManager.load(new AnchorAudioZhufenGameWidget());
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        WidgetManager widgetManager;
        List<Widget> list;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 4).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 9).isSupported && (widgetManager = this.subWidgetManager) != null && (list = widgetManager.widgets) != null) {
            for (Widget widget : list) {
                widgetManager.unload(widget);
            }
        }
        AbstractC3398b abstractC3398b = this.LJI;
        if (abstractC3398b != null) {
            abstractC3398b.LIZ();
        }
        AbstractC3398b abstractC3398b2 = this.LJII;
        if (abstractC3398b2 != null) {
            abstractC3398b2.LIZ();
        }
        KW5 kw5 = this.LIZLLL;
        if (kw5 != null) {
            kw5.LIZ();
        }
        KW6 kw6 = this.f26116LJ;
        if (kw6 != null) {
            kw6.LIZ();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        AbstractC3398b abstractC3398b;
        AbstractC3398b abstractC3398b2;
        KW5 kw5;
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZIZ, false, 1).isSupported) {
            return;
        }
        AbstractC5436a LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            AbstractC3475n abstractC3475n = this.LIZJ;
            KW6 kw6 = null;
            if (abstractC3475n != null) {
                Context context = this.context;
                Intrinsics.checkNotNullExpressionValue(context, "");
                DataCenter dataCenter = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter, "");
                long id = this.LJIIIZ.getId();
                ViewGroup viewGroup = this.containerView;
                Intrinsics.checkNotNullExpressionValue(viewGroup, "");
                abstractC3398b = abstractC3475n.LIZ(LIZLLL, context, dataCenter, id, viewGroup);
            } else {
                abstractC3398b = null;
            }
            this.LJI = abstractC3398b;
            AbstractC3475n abstractC3475n2 = this.LIZJ;
            if (abstractC3475n2 != null) {
                Context context2 = this.context;
                Intrinsics.checkNotNullExpressionValue(context2, "");
                DataCenter dataCenter2 = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter2, "");
                long id2 = this.LJIIIZ.getId();
                ViewGroup viewGroup2 = this.containerView;
                Intrinsics.checkNotNullExpressionValue(viewGroup2, "");
                abstractC3398b2 = abstractC3475n2.LIZIZ(LIZLLL, context2, dataCenter2, id2, viewGroup2);
            } else {
                abstractC3398b2 = null;
            }
            this.LJII = abstractC3398b2;
            if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 3).isSupported) {
                IService service = ServiceManager.getService(IHostContext.class);
                Intrinsics.checkNotNullExpressionValue(service, "");
                String channel = ((IHostContext) service).getChannel();
                ALogger.m15801d("AnchorGameWidget", "当前channel = [" + channel + LoggerUtil.M_RIGHT_TAG);
                Intrinsics.checkNotNullExpressionValue(channel, "");
                if (StringsKt__StringsKt.contains$default((CharSequence) channel, (CharSequence) "lark_inhouse", false, 2, (Object) null)) {
                    AbstractC3475n abstractC3475n3 = this.LIZJ;
                    if (abstractC3475n3 != null) {
                        kw5 = abstractC3475n3.LIZIZ();
                    } else {
                        kw5 = null;
                    }
                    this.LIZLLL = kw5;
                    KW5 kw52 = this.LIZLLL;
                    if (kw52 != null) {
                        kw52.LIZ(this.containerView, this.context);
                    }
                }
                if (StringsKt__StringsKt.contains$default((CharSequence) channel, (CharSequence) "live_open_platform", false, 2, (Object) null)) {
                    AbstractC3475n abstractC3475n4 = this.LIZJ;
                    if (abstractC3475n4 != null) {
                        kw6 = abstractC3475n4.LIZJ();
                    }
                    this.f26116LJ = kw6;
                    KW6 kw62 = this.f26116LJ;
                    if (kw62 != null) {
                        kw62.LIZ(this.containerView, this.context);
                    }
                }
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 6).isSupported) {
            if (C423702pg.LJI(this.dataCenter)) {
                m15831LJ();
            } else if (C423702pg.LJFF(this.dataCenter)) {
                m15831LJ();
            } else if (C423702pg.LJII(this.dataCenter) && !PatchProxy.proxy(new Object[0], this, LIZIZ, false, 7).isSupported) {
                enableSubWidgetManager();
                this.subWidgetManager.load(new InteractGameStartupWidget(this.LJI, this.LJII));
                this.LJFF = new InteractGameSEIWidget(LIZLLL());
                this.subWidgetManager.load(this.LJFF);
            }
        }
    }

    public AnchorGameWidget(AbstractC5436a abstractC5436a, Room room, Fragment fragment, FragmentManager fragmentManager) {
        C106862S5w.LIZ(room, fragment, fragmentManager);
        this.LJIIIIZZ = abstractC5436a;
        this.LJIIIZ = room;
        this.LJIIJ = fragmentManager;
        KXQ.LIZ().LIZIZ().LIZ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.broadcastgame.api.IAnchorGameWidget
    public final void LIZ(String str, String str2, int i, boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{str, str2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        InteractGameSEIWidget interactGameSEIWidget = this.LJFF;
        if (interactGameSEIWidget != null && !PatchProxy.proxy(new Object[]{str, str2, Integer.valueOf(i), Byte.valueOf((byte) z), Byte.valueOf((byte) z2)}, interactGameSEIWidget, InteractGameSEIWidget.LIZIZ, false, 1).isSupported) {
            C106862S5w.LIZ(str);
            AbstractC5436a abstractC5436a = interactGameSEIWidget.LIZJ;
            if (abstractC5436a != null) {
                abstractC5436a.LIZ(str, str2, i, z, z2);
            }
        }
    }
}
