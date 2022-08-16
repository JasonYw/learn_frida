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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C79007HCn;
import p003X.C79080HFi;
import p003X.HHA;

/* loaded from: classes3.dex */
public final class VideoTalkRoomGuestWidget$createFloatWindowManager$1 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ VideoTalkRoomGuestWidget this$0;

    static {
        Covode.recordClassIndex(30686);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTalkRoomGuestWidget$createFloatWindowManager$1(VideoTalkRoomGuestWidget videoTalkRoomGuestWidget) {
        super(1);
        this.this$0 = videoTalkRoomGuestWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        SingingChallengeLiveCoreInfo singingChallengeLiveCoreInfo;
        Map<Long, String> map;
        String str;
        SingingChallengeRtcInfo singingChallengeRtcInfo;
        Map<Long, String> map2;
        long j;
        String str2;
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported && this.this$0.LJIIIZ()) {
            AbstractC4254a LJJIIJ = this.this$0.LJJIIJ();
            if (!(LJJIIJ instanceof C79007HCn)) {
                LJJIIJ = null;
            }
            C79007HCn c79007HCn = (C79007HCn) LJJIIJ;
            if (c79007HCn != null) {
                MultiRtcInfo multiRtcInfo = c79007HCn.LJIIIZ;
                long j2 = 1;
                if (multiRtcInfo != null && (singingChallengeRtcInfo = multiRtcInfo.singingChallengeRtcInfo) != null && (map2 = singingChallengeRtcInfo.LIZIZ) != null) {
                    for (Map.Entry<Long, String> entry : map2.entrySet()) {
                        ALogger.m15797i("VideoTalkRoomGuestWidget", "singingChallengeRtcInfo：key:" + entry.getKey() + ", value:" + entry.getValue());
                    }
                    if (booleanValue) {
                        j = 1;
                    } else {
                        j = 2;
                    }
                    String str3 = map2.get(Long.valueOf(j));
                    if (str3 != null) {
                        AbstractC4964m abstractC4964m = this.this$0.LJII;
                        if (!(abstractC4964m instanceof C79080HFi)) {
                            abstractC4964m = null;
                        }
                        C79080HFi c79080HFi = (C79080HFi) abstractC4964m;
                        if (c79080HFi != null) {
                            str2 = c79080HFi.LJIIIZ;
                        } else {
                            str2 = null;
                        }
                        if (!Intrinsics.areEqual(str2, str3) && str3.length() != 0) {
                            ALogger.m15797i("KtvChallengeRoomWindowManager", "ktv challenge updateRtcExtInfo:" + str3);
                            AbstractC4964m abstractC4964m2 = this.this$0.LJII;
                            if (!(abstractC4964m2 instanceof C79080HFi)) {
                                abstractC4964m2 = null;
                            }
                            C79080HFi c79080HFi2 = (C79080HFi) abstractC4964m2;
                            if (c79080HFi2 != null) {
                                c79080HFi2.LJIIIZ = str3;
                            }
                            HHA hha = this.this$0.LJIIZILJ;
                            if (hha != null) {
                                hha.LIZIZ(str3);
                            }
                        }
                    }
                }
                MultiLiveCoreInfo multiLiveCoreInfo = c79007HCn.LJIIJJI;
                if (multiLiveCoreInfo != null && (singingChallengeLiveCoreInfo = multiLiveCoreInfo.singingChallengeLiveCoreInfo) != null && (map = singingChallengeLiveCoreInfo.LIZIZ) != null) {
                    for (Map.Entry<Long, String> entry2 : map.entrySet()) {
                        ALogger.m15797i("VideoTalkRoomGuestWidget", "singingChallengeLiveCoreInfo：key:" + entry2.getKey() + ", value:" + entry2.getValue());
                    }
                    if (!booleanValue) {
                        j2 = 2;
                    }
                    String str4 = map.get(Long.valueOf(j2));
                    if (str4 != null) {
                        AbstractC4964m abstractC4964m3 = this.this$0.LJII;
                        if (!(abstractC4964m3 instanceof C79080HFi)) {
                            abstractC4964m3 = null;
                        }
                        C79080HFi c79080HFi3 = (C79080HFi) abstractC4964m3;
                        if (c79080HFi3 != null) {
                            str = c79080HFi3.LJIIIIZZ;
                        } else {
                            str = null;
                        }
                        if (!Intrinsics.areEqual(str, str4) && str4.length() != 0) {
                            AbstractC4964m abstractC4964m4 = this.this$0.LJII;
                            if (!(abstractC4964m4 instanceof C79080HFi)) {
                                abstractC4964m4 = null;
                            }
                            C79080HFi c79080HFi4 = (C79080HFi) abstractC4964m4;
                            if (c79080HFi4 != null) {
                                c79080HFi4.LJIIIIZZ = str4;
                            }
                            HHA hha2 = this.this$0.LJIIZILJ;
                            if (hha2 != null) {
                                hha2.LIZ(str4);
                            }
                            ALogger.m15797i("VideoTalkRoomAnchorWidget", "ktv challenge updateLiveCoreParams:" + str4);
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
