package com.bytedance.android.live.liveinteract.videotalk.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m;
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
public final /* synthetic */ class VideoTalkRoomGuestWidget$registerWindowMangers$5 extends FunctionReferenceImpl implements Function1<Class<? extends AbstractC4964m>, AbstractC4964m> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(30719);
    }

    public VideoTalkRoomGuestWidget$registerWindowMangers$5(VideoTalkRoomGuestWidget videoTalkRoomGuestWidget) {
        super(1, videoTalkRoomGuestWidget, VideoTalkRoomGuestWidget.class, "createLinkRoomSceneWindowManager", "createLinkRoomSceneWindowManager(Ljava/lang/Class;)Lcom/bytedance/android/live/liveinteract/videotalk/ui/IWindowManager;", 0);
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
        VideoTalkRoomGuestWidget videoTalkRoomGuestWidget = (VideoTalkRoomGuestWidget) this.receiver;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{cls}, videoTalkRoomGuestWidget, VideoTalkRoomGuestWidget.LIZJ, false, 12);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        View view = videoTalkRoomGuestWidget.contentView;
        if (view != null && (findViewById = view.findViewById(2131180925)) != null) {
            findViewById.setVisibility(0);
        }
        Room LJJIIJZLJL = videoTalkRoomGuestWidget.LJJIIJZLJL();
        View view2 = videoTalkRoomGuestWidget.contentView;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        View findViewById2 = view2.findViewById(2131180925);
        if (findViewById2 != null) {
            Context context = videoTalkRoomGuestWidget.context;
            Intrinsics.checkNotNullExpressionValue(context, "");
            DataCenter dataCenter = videoTalkRoomGuestWidget.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter, "");
            ViewGroup viewGroup = videoTalkRoomGuestWidget.containerView;
            Intrinsics.checkNotNullExpressionValue(viewGroup, "");
            FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(2131197173);
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            return new C80607Hpx(LJJIIJZLJL, false, (ConstraintLayout) findViewById2, context, dataCenter, videoTalkRoomGuestWidget, videoTalkRoomGuestWidget, null, frameLayout);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
    }
}
