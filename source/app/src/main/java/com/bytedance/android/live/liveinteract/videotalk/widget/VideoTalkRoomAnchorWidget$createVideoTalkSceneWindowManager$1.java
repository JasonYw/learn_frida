package com.bytedance.android.live.liveinteract.videotalk.widget;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.linkpk.AbstractC4254a;
import com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m;
import com.bytedance.android.livesdk.chatroom.model.interact.MultiLiveCoreInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.MultiRtcInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.SingingChallengeLiveCoreInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.SingingChallengeRtcInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C79007HCn;
import p003X.C79080HFi;

/* loaded from: classes3.dex */
public final class VideoTalkRoomAnchorWidget$createVideoTalkSceneWindowManager$1 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ VideoTalkRoomAnchorWidget this$0;

    static {
        Covode.recordClassIndex(30644);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTalkRoomAnchorWidget$createVideoTalkSceneWindowManager$1(VideoTalkRoomAnchorWidget videoTalkRoomAnchorWidget) {
        super(1);
        this.this$0 = videoTalkRoomAnchorWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        SingingChallengeLiveCoreInfo singingChallengeLiveCoreInfo;
        Map<Long, String> map;
        SingingChallengeRtcInfo singingChallengeRtcInfo;
        Map<Long, String> map2;
        long j;
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            ALogger.m15797i("KtvChallengeRoomWindowManager", "主播是否放大:" + booleanValue);
            AbstractC4254a abstractC4254a = this.this$0.LJIIJJI;
            if (!(abstractC4254a instanceof C79007HCn)) {
                abstractC4254a = null;
            }
            C79007HCn c79007HCn = (C79007HCn) abstractC4254a;
            if (c79007HCn != null) {
                MultiRtcInfo multiRtcInfo = c79007HCn.LJIIIZ;
                if (multiRtcInfo != null && (singingChallengeRtcInfo = multiRtcInfo.singingChallengeRtcInfo) != null && (map2 = singingChallengeRtcInfo.LIZIZ) != null) {
                    for (Map.Entry<Long, String> entry : map2.entrySet()) {
                        ALogger.m15797i("VideoTalkRoomAnchorWidget", "singingChallengeRtcInfo：key:" + entry.getKey() + ", value:" + entry.getValue());
                    }
                    if (booleanValue) {
                        j = 1;
                    } else {
                        j = 2;
                    }
                    String str = map2.get(Long.valueOf(j));
                    if (str != null && str.length() > 0) {
                        ALogger.m15797i("KtvChallengeRoomWindowManager", "ktv challenge updateRtcExtInfo:" + str);
                        this.this$0.LJIL().LIZIZ(str);
                        AbstractC4964m LIZ = VideoTalkRoomAnchorWidget.LIZ(this.this$0);
                        if (!(LIZ instanceof C79080HFi)) {
                            LIZ = null;
                        }
                        C79080HFi c79080HFi = (C79080HFi) LIZ;
                        if (c79080HFi != null) {
                            c79080HFi.LJIIIZ = str;
                        }
                    }
                }
                MultiLiveCoreInfo multiLiveCoreInfo = c79007HCn.LJIIJJI;
                if (multiLiveCoreInfo != null && (singingChallengeLiveCoreInfo = multiLiveCoreInfo.singingChallengeLiveCoreInfo) != null && (map = singingChallengeLiveCoreInfo.LIZIZ) != null) {
                    for (Map.Entry<Long, String> entry2 : map.entrySet()) {
                        ALogger.m15797i("VideoTalkRoomAnchorWidget", "singingChallengeLiveCoreInfo：key:" + entry2.getKey() + ", value:" + entry2.getValue());
                    }
                    String str2 = map.get(1L);
                    if (str2 != null && str2.length() > 0) {
                        ALogger.m15797i("KtvChallengeRoomWindowManager", "ktv challenge updateLiveCoreParams:" + str2);
                        this.this$0.LJIL().LIZ(str2);
                        AbstractC4964m LIZ2 = VideoTalkRoomAnchorWidget.LIZ(this.this$0);
                        if (!(LIZ2 instanceof C79080HFi)) {
                            LIZ2 = null;
                        }
                        C79080HFi c79080HFi2 = (C79080HFi) LIZ2;
                        if (c79080HFi2 != null) {
                            c79080HFi2.LJIIIIZZ = str2;
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
