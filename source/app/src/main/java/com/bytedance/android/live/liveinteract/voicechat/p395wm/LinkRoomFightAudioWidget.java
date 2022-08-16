package com.bytedance.android.live.liveinteract.voicechat.p395wm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.plantform.core.C4806x;
import com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m;
import com.bytedance.android.live.liveinteract.voicechat.VoiceChatSceneBaseWidget;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.livesdk.chatroom.p517u.C6306l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413392Xt;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C423702pg;
import p003X.C79189HJn;
import p003X.C80608Hpy;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.wm.LinkRoomFightAudioWidget */
/* loaded from: classes3.dex */
public final class LinkRoomFightAudioWidget extends VoiceChatSceneBaseWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZJ;
    public C80608Hpy LIZLLL;

    /* renamed from: LJ */
    public final AbstractC5436a f26504LJ;
    public final AbstractC4964m.AbstractC4965a LJFF;
    public final AbstractC5143z LJI;

    static {
        Covode.recordClassIndex(31871);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699851;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.VoiceChatSceneBaseWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZJ, false, 15).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LIZ() {
        C80608Hpy c80608Hpy;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 10).isSupported && (c80608Hpy = this.LIZLLL) != null) {
            c80608Hpy.LJIIIZ();
        }
    }

    public final void LIZIZ() {
        C80608Hpy c80608Hpy;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 14).isSupported && (c80608Hpy = this.LIZLLL) != null) {
            c80608Hpy.LJI();
        }
    }

    public final void LIZ(String[] strArr, boolean[] zArr) {
        C80608Hpy c80608Hpy;
        if (!PatchProxy.proxy(new Object[]{strArr, zArr}, this, LIZJ, false, 3).isSupported && (c80608Hpy = this.LIZLLL) != null) {
            c80608Hpy.LIZ(strArr, zArr);
        }
    }

    public final void LIZ(C6306l c6306l, WidgetManager widgetManager) {
        AbstractC413392Xt<C4806x> LIZIZ;
        C4806x LIZIZ2;
        if (PatchProxy.proxy(new Object[]{c6306l, widgetManager}, this, LIZJ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6306l, widgetManager);
        this.LIZIZ = c6306l.f26940LJ;
        if (this.LIZIZ != 16) {
            C80608Hpy c80608Hpy = this.LIZLLL;
            if (c80608Hpy != null) {
                c80608Hpy.LJI();
            }
            widgetManager.unload(this);
            return;
        }
        LIZ(widgetManager, 2131180919, this);
        C79189HJn LIZ = C79189HJn.LIZJ.LIZ();
        if (LIZ != null && (LIZIZ = LIZ.LIZIZ()) != null && (LIZIZ2 = LIZIZ.LIZIZ()) != null) {
            DataCenter dataCenter = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter, "");
            Room LIZIZ3 = C423702pg.LIZIZ(dataCenter);
            boolean LIZIZ4 = C423702pg.LIZIZ(this.dataCenter, false, 1, null);
            View view = this.contentView;
            if (view != null) {
                Context context = this.context;
                Intrinsics.checkNotNullExpressionValue(context, "");
                DataCenter dataCenter2 = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter2, "");
                AbstractC4964m.AbstractC4965a abstractC4965a = this.LJFF;
                AbstractC5436a abstractC5436a = this.f26504LJ;
                ViewGroup viewGroup = this.containerView;
                Intrinsics.checkNotNullExpressionValue(viewGroup, "");
                FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(2131180924);
                Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                this.LIZLLL = new C80608Hpy(LIZIZ3, LIZIZ4, (ViewGroup) view, context, dataCenter2, this, abstractC4965a, abstractC5436a, frameLayout, LIZIZ2, this.LJI);
                C80608Hpy c80608Hpy2 = this.LIZLLL;
                if (c80608Hpy2 != null) {
                    c80608Hpy2.LIZLLL();
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    public LinkRoomFightAudioWidget(AbstractC5436a abstractC5436a, AbstractC4964m.AbstractC4965a abstractC4965a, AbstractC5143z abstractC5143z) {
        C106862S5w.LIZ(abstractC4965a, abstractC5143z);
        this.f26504LJ = abstractC5436a;
        this.LJFF = abstractC4965a;
        this.LJI = abstractC5143z;
    }
}
