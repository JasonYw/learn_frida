package com.bytedance.android.live.liveinteract.videotalk.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C80607Hpx;

/* loaded from: classes3.dex */
public final /* synthetic */ class VideoTalkRoomAnchorWidget$registerWindowMangers$12 extends FunctionReferenceImpl implements Function1<Class<? extends AbstractC4964m>, AbstractC4964m> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(30666);
    }

    public VideoTalkRoomAnchorWidget$registerWindowMangers$12(VideoTalkRoomAnchorWidget videoTalkRoomAnchorWidget) {
        super(1, videoTalkRoomAnchorWidget, VideoTalkRoomAnchorWidget.class, "createLinkRoomSceneWindowManager", "createLinkRoomSceneWindowManager(Ljava/lang/Class;)Lcom/bytedance/android/live/liveinteract/videotalk/ui/IWindowManager;", 0);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.bytedance.android.live.liveinteract.videotalk.ui.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.bytedance.android.live.liveinteract.videotalk.ui.m, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ AbstractC4964m invoke(Class<? extends AbstractC4964m> cls) {
        View findViewById;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(cls);
        VideoTalkRoomAnchorWidget videoTalkRoomAnchorWidget = (VideoTalkRoomAnchorWidget) this.receiver;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{cls}, videoTalkRoomAnchorWidget, VideoTalkRoomAnchorWidget.LIZIZ, false, 17);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        View view = videoTalkRoomAnchorWidget.contentView;
        if (view != null && (findViewById = view.findViewById(2131180925)) != null) {
            findViewById.setVisibility(0);
        }
        Room LJIJI = videoTalkRoomAnchorWidget.LJIJI();
        View view2 = videoTalkRoomAnchorWidget.contentView;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        View findViewById2 = view2.findViewById(2131180925);
        if (findViewById2 != null) {
            Context context = videoTalkRoomAnchorWidget.context;
            Intrinsics.checkNotNullExpressionValue(context, "");
            DataCenter dataCenter = videoTalkRoomAnchorWidget.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter, "");
            AbstractC5436a abstractC5436a = videoTalkRoomAnchorWidget.LJJI;
            ViewGroup viewGroup = videoTalkRoomAnchorWidget.containerView;
            Intrinsics.checkNotNullExpressionValue(viewGroup, "");
            FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(2131197173);
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            return new C80607Hpx(LJIJI, true, (ConstraintLayout) findViewById2, context, dataCenter, videoTalkRoomAnchorWidget, videoTalkRoomAnchorWidget, abstractC5436a, frameLayout);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
    }
}
