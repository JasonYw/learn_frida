package com.bytedance.android.live.liveinteract.videotalk.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.C78377Gv5;

/* loaded from: classes3.dex */
public final /* synthetic */ class VideoTalkRoomAnchorWidget$onCreate$2 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(30658);
    }

    public VideoTalkRoomAnchorWidget$onCreate$2(VideoTalkRoomAnchorWidget videoTalkRoomAnchorWidget) {
        super(1, videoTalkRoomAnchorWidget, VideoTalkRoomAnchorWidget.class, "isMultipleKtvMode", "isMultipleKtvMode(Z)V", 0);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [byte, boolean] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        ?? booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue == true ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            VideoTalkRoomAnchorWidget videoTalkRoomAnchorWidget = (VideoTalkRoomAnchorWidget) this.receiver;
            if (!PatchProxy.proxy(new Object[]{Byte.valueOf((byte) booleanValue)}, videoTalkRoomAnchorWidget, VideoTalkRoomAnchorWidget.LIZIZ, false, 137).isSupported) {
                if (booleanValue != 0) {
                    C78377Gv5 c78377Gv5 = videoTalkRoomAnchorWidget.LJIJJ;
                    if (c78377Gv5 != null) {
                        c78377Gv5.LIZ(0.34f);
                    }
                } else {
                    C78377Gv5 c78377Gv52 = videoTalkRoomAnchorWidget.LJIJJ;
                    if (c78377Gv52 != null) {
                        c78377Gv52.LIZ(1.0f);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
