package com.bytedance.android.live.liveinteract.videotalk.widget;

import com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final /* synthetic */ class VideoTalkRoomAnchorWidget$registerWindowMangers$5 extends FunctionReferenceImpl implements Function1<Class<? extends AbstractC4964m>, AbstractC4964m> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(30670);
    }

    public VideoTalkRoomAnchorWidget$registerWindowMangers$5(VideoTalkRoomAnchorWidget videoTalkRoomAnchorWidget) {
        super(1, videoTalkRoomAnchorWidget, VideoTalkRoomAnchorWidget.class, "createEqualSceneWindowManager", "createEqualSceneWindowManager(Ljava/lang/Class;)Lcom/bytedance/android/live/liveinteract/videotalk/ui/IWindowManager;", 0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.liveinteract.videotalk.ui.m, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ AbstractC4964m invoke(Class<? extends AbstractC4964m> cls) {
        Class<? extends AbstractC4964m> cls2 = cls;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(cls2);
        return ((VideoTalkRoomAnchorWidget) this.receiver).LIZJ(cls2);
    }
}
