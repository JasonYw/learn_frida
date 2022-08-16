package com.bytedance.android.commerce.base.model;

import com.bytedance.android.p225ec.adapter.api.message.model.CategoryInfo;
import com.bytedance.android.p225ec.adapter.api.message.model.ECShoppingProductChangeMessage;
import com.bytedance.android.p225ec.adapter.api.message.model.ECShoppingPromotionListMessage;
import com.bytedance.android.p225ec.adapter.api.message.model.FilterSwitchChangeData;
import com.bytedance.android.p225ec.adapter.api.message.model.LiveAuctionInfo;
import com.bytedance.android.p225ec.adapter.api.message.model.LiveAuctionSuccess;
import com.bytedance.android.p225ec.adapter.api.message.model.LiveCouponActivityData;
import com.bytedance.android.p225ec.adapter.api.message.model.LiveCouponMeta;
import com.bytedance.android.p225ec.adapter.api.message.model.LiveRedPacket;
import com.bytedance.android.p225ec.adapter.api.message.model.LotteryInfoList;
import com.bytedance.android.p225ec.adapter.api.message.model.ProductInfo;
import com.bytedance.android.p225ec.adapter.api.message.model.RoomTagOfflineInfo;
import com.bytedance.android.p225ec.adapter.api.message.model.SkuInfo;
import com.bytedance.android.p225ec.adapter.api.message.model.TraceTimeMetric;
import com.bytedance.android.p225ec.adapter.api.message.model.UpdatedCampaignInfo;
import com.bytedance.android.p225ec.adapter.api.message.model.UpdatedCartInfo;
import com.bytedance.android.p225ec.adapter.api.message.model.UpdatedCommentaryVideoInfo;
import com.bytedance.android.p225ec.adapter.api.message.model.UpdatedCouponInfo;
import com.bytedance.android.p225ec.adapter.api.message.model.UpdatedGroupInfo;
import com.bytedance.android.p225ec.adapter.api.message.model.UpdatedHotAtmosphere;
import com.bytedance.android.p225ec.adapter.api.message.model.UpdatedProductInfo;
import com.bytedance.android.p225ec.adapter.api.message.model.UpdatedSkuInfo;
import com.bytedance.android.p225ec.adapter.api.message.model.WinLotteryAlert;
import com.bytedance.android.p225ec.adapter.api.message.model.WinLotteryInfo;
import com.bytedance.android.p225ec.adapter.api.message.model._CategoryInfo_ProtoDecoder;
import com.bytedance.android.p225ec.adapter.api.message.model._FilterSwitchChangeData_ProtoDecoder;
import com.bytedance.android.p225ec.adapter.api.message.model._LiveAuctionInfo_ProtoDecoder;
import com.bytedance.android.p225ec.adapter.api.message.model._LiveAuctionSuccess_ProtoDecoder;
import com.bytedance.android.p225ec.adapter.api.message.model._LiveCouponActivityData_ProtoDecoder;
import com.bytedance.android.p225ec.adapter.api.message.model._LiveCouponMeta_ProtoDecoder;
import com.bytedance.android.p225ec.adapter.api.message.model._LiveRedPacket_ProtoDecoder;
import com.bytedance.android.p225ec.adapter.api.message.model._LotteryInfoList_ProtoDecoder;
import com.bytedance.android.p225ec.adapter.api.message.model._ProductInfo_ProtoDecoder;
import com.bytedance.android.p225ec.adapter.api.message.model._RoomTagOfflineInfo_ProtoDecoder;
import com.bytedance.android.p225ec.adapter.api.message.model._TraceTimeMetric_ProtoDecoder;
import com.bytedance.android.p225ec.adapter.api.message.model._UpdatedCampaignInfo_ProtoDecoder;
import com.bytedance.android.p225ec.adapter.api.message.model._UpdatedCartInfo_ProtoDecoder;
import com.bytedance.android.p225ec.adapter.api.message.model._UpdatedCommentaryVideoInfo_ProtoDecoder;
import com.bytedance.android.p225ec.adapter.api.message.model._UpdatedCouponInfo_ProtoDecoder;
import com.bytedance.android.p225ec.adapter.api.message.model._UpdatedGroupInfo_ProtoDecoder;
import com.bytedance.android.p225ec.adapter.api.message.model._UpdatedHotAtmosphere_ProtoDecoder;
import com.bytedance.android.p225ec.adapter.api.message.model._UpdatedProductInfo_ProtoDecoder;
import com.bytedance.android.p225ec.adapter.api.message.model._UpdatedSkuInfo_ProtoDecoder;
import com.bytedance.android.p225ec.adapter.api.message.model._WinLotteryInfo_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;
import p003X.C109990TSe;
import p003X.C109991TSf;
import p003X.C112799Uav;
import p003X.C112800Uaw;
import p003X.C112801Uax;
import p003X.C112840Uba;
import p003X.C112841Ubb;
import p003X.C113471Ull;
import p003X.TT1;
import p003X.TVI;
import p003X.UW6;

/* loaded from: classes11.dex */
public final class _ProtoDecoders_ECADAPTERAPI {
    public static final Map<Class, AbstractC10531b> DECODER_MAP = new HashMap();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11586);
    }

    public final void inject(Map<Class, AbstractC10531b> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        map.put(CategoryInfo.class, new _CategoryInfo_ProtoDecoder());
        map.put(ECShoppingProductChangeMessage.class, new TVI());
        map.put(ECShoppingPromotionListMessage.class, new C112840Uba());
        map.put(FilterSwitchChangeData.class, new _FilterSwitchChangeData_ProtoDecoder());
        map.put(FilterSwitchChangeData.UpIcon.class, new C112841Ubb());
        map.put(LiveAuctionInfo.class, new _LiveAuctionInfo_ProtoDecoder());
        map.put(LiveAuctionInfo.LiveAuctionUserInfo.class, new C109991TSf());
        map.put(LiveAuctionInfo.LiveAuctionIncrPrice.class, new TT1());
        map.put(LiveAuctionInfo.LiveAuctionImg.class, new C109990TSe());
        map.put(LiveAuctionSuccess.class, new _LiveAuctionSuccess_ProtoDecoder());
        map.put(LiveCouponActivityData.class, new _LiveCouponActivityData_ProtoDecoder());
        map.put(LiveCouponMeta.class, new _LiveCouponMeta_ProtoDecoder());
        map.put(LiveRedPacket.class, new _LiveRedPacket_ProtoDecoder());
        map.put(LotteryInfoList.class, new _LotteryInfoList_ProtoDecoder());
        map.put(ProductInfo.class, new _ProductInfo_ProtoDecoder());
        map.put(RoomTagOfflineInfo.class, new _RoomTagOfflineInfo_ProtoDecoder());
        map.put(SkuInfo.class, new UW6());
        map.put(TraceTimeMetric.class, new _TraceTimeMetric_ProtoDecoder());
        map.put(UpdatedCampaignInfo.class, new _UpdatedCampaignInfo_ProtoDecoder());
        map.put(UpdatedCartInfo.class, new _UpdatedCartInfo_ProtoDecoder());
        map.put(UpdatedCartInfo.RoomCartStateVertical.class, new C112801Uax());
        map.put(UpdatedCartInfo.RoomCartStateHorizontal.class, new C112800Uaw());
        map.put(UpdatedCartInfo.RoomCartIconsMsg.class, new C112799Uav());
        map.put(UpdatedCommentaryVideoInfo.class, new _UpdatedCommentaryVideoInfo_ProtoDecoder());
        map.put(UpdatedCouponInfo.class, new _UpdatedCouponInfo_ProtoDecoder());
        map.put(UpdatedGroupInfo.class, new _UpdatedGroupInfo_ProtoDecoder());
        map.put(UpdatedHotAtmosphere.class, new _UpdatedHotAtmosphere_ProtoDecoder());
        map.put(UpdatedProductInfo.class, new _UpdatedProductInfo_ProtoDecoder());
        map.put(UpdatedSkuInfo.class, new _UpdatedSkuInfo_ProtoDecoder());
        map.put(WinLotteryAlert.class, new C113471Ull());
        map.put(WinLotteryInfo.class, new _WinLotteryInfo_ProtoDecoder());
    }
}
