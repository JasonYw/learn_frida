package com.bytedance.android.live.base.model.feed;

import androidx.core.view.MotionEventCompat;
import com.bytedance.android.live.base.model._Appointment_ProtoDecoder;
import com.bytedance.android.live.base.model._CateCell_ProtoDecoder;
import com.bytedance.android.live.base.model.banner._FeedBannerContainer_ProtoDecoder;
import com.bytedance.android.live.base.model.banner._RankRoundBanner_ProtoDecoder;
import com.bytedance.android.live.base.model.feedback.FeedbackCard;
import com.bytedance.android.live.base.model.follow._PlaceHolder_ProtoDecoder;
import com.bytedance.android.live.base.model.follow._ScheduledLiveItem_ProtoDecoder;
import com.bytedance.android.live.base.model.p247ad.AdExtra;
import com.bytedance.android.live.base.model.tab._TabItem_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.episode._Episode_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.QV1;

/* loaded from: classes8.dex */
public final class _FeedItem_ProtoDecoder implements AbstractC10531b<FeedItem> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(14036);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
    /* renamed from: decode */
    public final FeedItem mo25795decode(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (FeedItem) proxy.result;
        }
        return decodeStatic(c10532g);
    }

    public static FeedItem decodeStatic(C10532g c10532g) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (FeedItem) proxy.result;
        }
        FeedItem feedItem = new FeedItem();
        feedItem.tabs = new ArrayList();
        feedItem.tags = new ArrayList();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        feedItem.type = (int) QV1.LIZJ(c10532g);
                        break;
                    case 2:
                        feedItem.resId = QV1.LJFF(c10532g);
                        break;
                    case 3:
                        feedItem.room = _Room_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 4:
                        feedItem.tags.add(QV1.LJFF(c10532g));
                        break;
                    case 5:
                        feedItem.adRawString = QV1.LJFF(c10532g);
                        break;
                    case 6:
                        feedItem.bannerContainer = _FeedBannerContainer_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 7:
                        feedItem.rankRoundBanner = _RankRoundBanner_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 8:
                        feedItem.cateCell = _CateCell_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 9:
                        feedItem.isRecommendCard = QV1.LIZ(c10532g);
                        break;
                    case 10:
                    case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                    case MotionEventCompat.AXIS_THROTTLE /* 19 */:
                    case 20:
                    case 21:
                    case MotionEventCompat.AXIS_GAS /* 22 */:
                    default:
                        QV1.LJII(c10532g);
                        break;
                    case 11:
                        feedItem.tabs.add(_TabItem_ProtoDecoder.decodeStatic(c10532g));
                        break;
                    case 12:
                        feedItem.isPseudoLiving = QV1.LIZ(c10532g);
                        break;
                    case 13:
                        feedItem.liveReason = QV1.LJFF(c10532g);
                        break;
                    case 14:
                        feedItem.placeHolder = _PlaceHolder_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case MotionEventCompat.AXIS_HAT_X /* 15 */:
                        feedItem.scheduledLive = _ScheduledLiveItem_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 16:
                        feedItem.episode = _Episode_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 18:
                        feedItem.appointment = _Appointment_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case MotionEventCompat.AXIS_BRAKE /* 23 */:
                        feedItem.feedbackCard = new FeedbackCard(c10532g);
                        break;
                    case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                        feedItem.isAd = QV1.LIZ(c10532g);
                        break;
                    case MotionEventCompat.AXIS_TILT /* 25 */:
                        feedItem.adExtra = new AdExtra(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ);
                feedItem.init();
                return feedItem;
            }
        }
    }
}
