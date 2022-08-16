package com.bytedance.android.live.p238ai.api.model;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.ai.api.model.RechargeCurrentCacheData */
/* loaded from: classes8.dex */
public final class RechargeCurrentCacheData {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String actionTypeCode;
    public String anchorTypeCode;
    public String chargeReasonCode;
    public String chargeSceneCode;
    public int curMoneyPaid;
    public int curRankDuration;
    public int curSentGiftCnt;
    public int curSentGiftMoney;
    public int curWatchDuration;
    public String enterFromMergeCode;
    public String enterMethodCode;
    public String eventModuleCode;
    public String interactFunctionCode;
    public boolean isFollowed;
    public String liveTypeCode;
    public int livesdkAudienceLiveMessage;
    public int livesdkCommentScreenMessageMonitor;
    public int livesdkGiftEffectShow;
    public int livesdkLike;
    public int livesdkRechargeBannerClick;
    public int livesdkRechargeClick;
    public int livesdkRechargeCustomizedNext;
    public int livesdkRechargeShow;
    public int livesdkRechargeSuccess;
    public int livesdkRedPackageShow;
    public int livesdkSendGift;
    public String payMethodCode;
    public String requestPageCode;
    public String roomLayoutCode;
    public String streamingTypeCode;

    static {
        Covode.recordClassIndex(13835);
    }

    public RechargeCurrentCacheData() {
        this(false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1073741823, null);
    }

    public static /* synthetic */ RechargeCurrentCacheData copy$default(RechargeCurrentCacheData rechargeCurrentCacheData, boolean z, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
        String str14 = str8;
        String str15 = str7;
        String str16 = str6;
        String str17 = str5;
        int i18 = i;
        boolean z2 = z;
        String str18 = str;
        String str19 = str2;
        String str20 = str3;
        String str21 = str4;
        int i19 = i16;
        int i20 = i15;
        int i21 = i14;
        int i22 = i13;
        int i23 = i2;
        String str22 = str12;
        int i24 = i4;
        int i25 = i3;
        String str23 = str13;
        String str24 = str10;
        int i26 = i12;
        int i27 = i5;
        int i28 = i6;
        int i29 = i7;
        String str25 = str9;
        int i30 = i8;
        String str26 = str11;
        int i31 = i9;
        int i32 = i10;
        int i33 = i11;
        byte b = z2 ? (byte) 1 : (byte) 0;
        byte b2 = z2 ? (byte) 1 : (byte) 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{rechargeCurrentCacheData, Byte.valueOf(b), Integer.valueOf(i18), str18, str19, str20, str21, str17, str16, str15, str14, str25, str24, str26, str22, str23, Integer.valueOf(i23), Integer.valueOf(i25), Integer.valueOf(i24), Integer.valueOf(i27), Integer.valueOf(i28), Integer.valueOf(i29), Integer.valueOf(i30), Integer.valueOf(i31), Integer.valueOf(i32), Integer.valueOf(i33), Integer.valueOf(i26), Integer.valueOf(i22), Integer.valueOf(i21), Integer.valueOf(i20), Integer.valueOf(i19), Integer.valueOf(i17), obj}, null, changeQuickRedirect, true, 15);
        if (proxy.isSupported) {
            return (RechargeCurrentCacheData) proxy.result;
        }
        if ((i17 & 1) != 0) {
            z2 = rechargeCurrentCacheData.isFollowed;
        }
        if ((i17 & 2) != 0) {
            i18 = rechargeCurrentCacheData.curMoneyPaid;
        }
        if ((i17 & 4) != 0) {
            str18 = rechargeCurrentCacheData.eventModuleCode;
        }
        if ((i17 & 8) != 0) {
            str19 = rechargeCurrentCacheData.liveTypeCode;
        }
        if ((i17 & 16) != 0) {
            str20 = rechargeCurrentCacheData.payMethodCode;
        }
        if ((i17 & 32) != 0) {
            str21 = rechargeCurrentCacheData.anchorTypeCode;
        }
        if ((i17 & 64) != 0) {
            str17 = rechargeCurrentCacheData.chargeSceneCode;
        }
        if ((i17 & 128) != 0) {
            str16 = rechargeCurrentCacheData.chargeReasonCode;
        }
        if ((i17 & 256) != 0) {
            str15 = rechargeCurrentCacheData.interactFunctionCode;
        }
        if ((i17 & 512) != 0) {
            str14 = rechargeCurrentCacheData.requestPageCode;
        }
        if ((i17 & AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END) != 0) {
            str25 = rechargeCurrentCacheData.roomLayoutCode;
        }
        if ((i17 & AccessibilityEventCompat.TYPE_WINDOW_CONTENT_CHANGED) != 0) {
            str24 = rechargeCurrentCacheData.streamingTypeCode;
        }
        if ((i17 & AccessibilityEventCompat.TYPE_VIEW_SCROLLED) != 0) {
            str26 = rechargeCurrentCacheData.enterFromMergeCode;
        }
        if ((i17 & 8192) != 0) {
            str22 = rechargeCurrentCacheData.enterMethodCode;
        }
        if ((i17 & 16384) != 0) {
            str23 = rechargeCurrentCacheData.actionTypeCode;
        }
        if ((32768 & i17) != 0) {
            i23 = rechargeCurrentCacheData.livesdkCommentScreenMessageMonitor;
        }
        if ((65536 & i17) != 0) {
            i25 = rechargeCurrentCacheData.livesdkGiftEffectShow;
        }
        if ((131072 & i17) != 0) {
            i24 = rechargeCurrentCacheData.livesdkRedPackageShow;
        }
        if ((262144 & i17) != 0) {
            i27 = rechargeCurrentCacheData.livesdkAudienceLiveMessage;
        }
        if ((524288 & i17) != 0) {
            i28 = rechargeCurrentCacheData.livesdkSendGift;
        }
        if ((1048576 & i17) != 0) {
            i29 = rechargeCurrentCacheData.livesdkRechargeClick;
        }
        if ((2097152 & i17) != 0) {
            i30 = rechargeCurrentCacheData.livesdkRechargeShow;
        }
        if ((4194304 & i17) != 0) {
            i31 = rechargeCurrentCacheData.livesdkRechargeSuccess;
        }
        if ((8388608 & i17) != 0) {
            i32 = rechargeCurrentCacheData.livesdkRechargeCustomizedNext;
        }
        if ((16777216 & i17) != 0) {
            i33 = rechargeCurrentCacheData.livesdkLike;
        }
        if ((33554432 & i17) != 0) {
            i26 = rechargeCurrentCacheData.livesdkRechargeBannerClick;
        }
        if ((67108864 & i17) != 0) {
            i22 = rechargeCurrentCacheData.curWatchDuration;
        }
        if ((134217728 & i17) != 0) {
            i21 = rechargeCurrentCacheData.curRankDuration;
        }
        if ((268435456 & i17) != 0) {
            i20 = rechargeCurrentCacheData.curSentGiftMoney;
        }
        if ((i17 & 536870912) != 0) {
            i19 = rechargeCurrentCacheData.curSentGiftCnt;
        }
        int i34 = i19;
        boolean z3 = z2 ? 1 : 0;
        Object[] objArr = z2 ? 1 : 0;
        return rechargeCurrentCacheData.copy(z3, i18, str18, str19, str20, str21, str17, str16, str15, str14, str25, str24, str26, str22, str23, i23, i25, i24, i27, i28, i29, i30, i31, i32, i33, i26, i22, i21, i20, i34);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.isFollowed), Integer.valueOf(this.curMoneyPaid), this.eventModuleCode, this.liveTypeCode, this.payMethodCode, this.anchorTypeCode, this.chargeSceneCode, this.chargeReasonCode, this.interactFunctionCode, this.requestPageCode, this.roomLayoutCode, this.streamingTypeCode, this.enterFromMergeCode, this.enterMethodCode, this.actionTypeCode, Integer.valueOf(this.livesdkCommentScreenMessageMonitor), Integer.valueOf(this.livesdkGiftEffectShow), Integer.valueOf(this.livesdkRedPackageShow), Integer.valueOf(this.livesdkAudienceLiveMessage), Integer.valueOf(this.livesdkSendGift), Integer.valueOf(this.livesdkRechargeClick), Integer.valueOf(this.livesdkRechargeShow), Integer.valueOf(this.livesdkRechargeSuccess), Integer.valueOf(this.livesdkRechargeCustomizedNext), Integer.valueOf(this.livesdkLike), Integer.valueOf(this.livesdkRechargeBannerClick), Integer.valueOf(this.curWatchDuration), Integer.valueOf(this.curRankDuration), Integer.valueOf(this.curSentGiftMoney), Integer.valueOf(this.curSentGiftCnt)};
    }

    public final boolean component1() {
        return this.isFollowed;
    }

    public final String component10() {
        return this.requestPageCode;
    }

    public final String component11() {
        return this.roomLayoutCode;
    }

    public final String component12() {
        return this.streamingTypeCode;
    }

    public final String component13() {
        return this.enterFromMergeCode;
    }

    public final String component14() {
        return this.enterMethodCode;
    }

    public final String component15() {
        return this.actionTypeCode;
    }

    public final int component16() {
        return this.livesdkCommentScreenMessageMonitor;
    }

    public final int component17() {
        return this.livesdkGiftEffectShow;
    }

    public final int component18() {
        return this.livesdkRedPackageShow;
    }

    public final int component19() {
        return this.livesdkAudienceLiveMessage;
    }

    public final int component2() {
        return this.curMoneyPaid;
    }

    public final int component20() {
        return this.livesdkSendGift;
    }

    public final int component21() {
        return this.livesdkRechargeClick;
    }

    public final int component22() {
        return this.livesdkRechargeShow;
    }

    public final int component23() {
        return this.livesdkRechargeSuccess;
    }

    public final int component24() {
        return this.livesdkRechargeCustomizedNext;
    }

    public final int component25() {
        return this.livesdkLike;
    }

    public final int component26() {
        return this.livesdkRechargeBannerClick;
    }

    public final int component27() {
        return this.curWatchDuration;
    }

    public final int component28() {
        return this.curRankDuration;
    }

    public final int component29() {
        return this.curSentGiftMoney;
    }

    public final String component3() {
        return this.eventModuleCode;
    }

    public final int component30() {
        return this.curSentGiftCnt;
    }

    public final String component4() {
        return this.liveTypeCode;
    }

    public final String component5() {
        return this.payMethodCode;
    }

    public final String component6() {
        return this.anchorTypeCode;
    }

    public final String component7() {
        return this.chargeSceneCode;
    }

    public final String component8() {
        return this.chargeReasonCode;
    }

    public final String component9() {
        return this.interactFunctionCode;
    }

    public final RechargeCurrentCacheData copy(boolean z, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16)}, this, changeQuickRedirect, false, 14);
        if (proxy.isSupported) {
            return (RechargeCurrentCacheData) proxy.result;
        }
        C106862S5w.LIZ(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
        return new RechargeCurrentCacheData(z, i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 17);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof RechargeCurrentCacheData) {
            return C106862S5w.LIZ(((RechargeCurrentCacheData) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("RechargeCurrentCacheData:%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", getObjects());
    }

    public final String getActionTypeCode() {
        return this.actionTypeCode;
    }

    public final String getAnchorTypeCode() {
        return this.anchorTypeCode;
    }

    public final String getChargeReasonCode() {
        return this.chargeReasonCode;
    }

    public final String getChargeSceneCode() {
        return this.chargeSceneCode;
    }

    public final int getCurMoneyPaid() {
        return this.curMoneyPaid;
    }

    public final int getCurRankDuration() {
        return this.curRankDuration;
    }

    public final int getCurSentGiftCnt() {
        return this.curSentGiftCnt;
    }

    public final int getCurSentGiftMoney() {
        return this.curSentGiftMoney;
    }

    public final int getCurWatchDuration() {
        return this.curWatchDuration;
    }

    public final String getEnterFromMergeCode() {
        return this.enterFromMergeCode;
    }

    public final String getEnterMethodCode() {
        return this.enterMethodCode;
    }

    public final String getEventModuleCode() {
        return this.eventModuleCode;
    }

    public final String getInteractFunctionCode() {
        return this.interactFunctionCode;
    }

    public final String getLiveTypeCode() {
        return this.liveTypeCode;
    }

    public final int getLivesdkAudienceLiveMessage() {
        return this.livesdkAudienceLiveMessage;
    }

    public final int getLivesdkCommentScreenMessageMonitor() {
        return this.livesdkCommentScreenMessageMonitor;
    }

    public final int getLivesdkGiftEffectShow() {
        return this.livesdkGiftEffectShow;
    }

    public final int getLivesdkLike() {
        return this.livesdkLike;
    }

    public final int getLivesdkRechargeBannerClick() {
        return this.livesdkRechargeBannerClick;
    }

    public final int getLivesdkRechargeClick() {
        return this.livesdkRechargeClick;
    }

    public final int getLivesdkRechargeCustomizedNext() {
        return this.livesdkRechargeCustomizedNext;
    }

    public final int getLivesdkRechargeShow() {
        return this.livesdkRechargeShow;
    }

    public final int getLivesdkRechargeSuccess() {
        return this.livesdkRechargeSuccess;
    }

    public final int getLivesdkRedPackageShow() {
        return this.livesdkRedPackageShow;
    }

    public final int getLivesdkSendGift() {
        return this.livesdkSendGift;
    }

    public final String getPayMethodCode() {
        return this.payMethodCode;
    }

    public final String getRequestPageCode() {
        return this.requestPageCode;
    }

    public final String getRoomLayoutCode() {
        return this.roomLayoutCode;
    }

    public final String getStreamingTypeCode() {
        return this.streamingTypeCode;
    }

    public final boolean isFollowed() {
        return this.isFollowed;
    }

    public final void setCurMoneyPaid(int i) {
        this.curMoneyPaid = i;
    }

    public final void setCurRankDuration(int i) {
        this.curRankDuration = i;
    }

    public final void setCurSentGiftCnt(int i) {
        this.curSentGiftCnt = i;
    }

    public final void setCurSentGiftMoney(int i) {
        this.curSentGiftMoney = i;
    }

    public final void setCurWatchDuration(int i) {
        this.curWatchDuration = i;
    }

    public final void setFollowed(boolean z) {
        this.isFollowed = z;
    }

    public final void setLivesdkAudienceLiveMessage(int i) {
        this.livesdkAudienceLiveMessage = i;
    }

    public final void setLivesdkCommentScreenMessageMonitor(int i) {
        this.livesdkCommentScreenMessageMonitor = i;
    }

    public final void setLivesdkGiftEffectShow(int i) {
        this.livesdkGiftEffectShow = i;
    }

    public final void setLivesdkLike(int i) {
        this.livesdkLike = i;
    }

    public final void setLivesdkRechargeBannerClick(int i) {
        this.livesdkRechargeBannerClick = i;
    }

    public final void setLivesdkRechargeClick(int i) {
        this.livesdkRechargeClick = i;
    }

    public final void setLivesdkRechargeCustomizedNext(int i) {
        this.livesdkRechargeCustomizedNext = i;
    }

    public final void setLivesdkRechargeShow(int i) {
        this.livesdkRechargeShow = i;
    }

    public final void setLivesdkRechargeSuccess(int i) {
        this.livesdkRechargeSuccess = i;
    }

    public final void setLivesdkRedPackageShow(int i) {
        this.livesdkRedPackageShow = i;
    }

    public final void setLivesdkSendGift(int i) {
        this.livesdkSendGift = i;
    }

    public final void setActionTypeCode(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.actionTypeCode = str;
    }

    public final void setAnchorTypeCode(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.anchorTypeCode = str;
    }

    public final void setChargeReasonCode(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.chargeReasonCode = str;
    }

    public final void setChargeSceneCode(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.chargeSceneCode = str;
    }

    public final void setEnterFromMergeCode(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.enterFromMergeCode = str;
    }

    public final void setEnterMethodCode(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.enterMethodCode = str;
    }

    public final void setEventModuleCode(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.eventModuleCode = str;
    }

    public final void setInteractFunctionCode(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.interactFunctionCode = str;
    }

    public final void setLiveTypeCode(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.liveTypeCode = str;
    }

    public final void setPayMethodCode(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.payMethodCode = str;
    }

    public final void setRequestPageCode(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.requestPageCode = str;
    }

    public final void setRoomLayoutCode(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.roomLayoutCode = str;
    }

    public final void setStreamingTypeCode(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.streamingTypeCode = str;
    }

    public RechargeCurrentCacheData(boolean z, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        C106862S5w.LIZ(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
        this.isFollowed = z;
        this.curMoneyPaid = i;
        this.eventModuleCode = str;
        this.liveTypeCode = str2;
        this.payMethodCode = str3;
        this.anchorTypeCode = str4;
        this.chargeSceneCode = str5;
        this.chargeReasonCode = str6;
        this.interactFunctionCode = str7;
        this.requestPageCode = str8;
        this.roomLayoutCode = str9;
        this.streamingTypeCode = str10;
        this.enterFromMergeCode = str11;
        this.enterMethodCode = str12;
        this.actionTypeCode = str13;
        this.livesdkCommentScreenMessageMonitor = i2;
        this.livesdkGiftEffectShow = i3;
        this.livesdkRedPackageShow = i4;
        this.livesdkAudienceLiveMessage = i5;
        this.livesdkSendGift = i6;
        this.livesdkRechargeClick = i7;
        this.livesdkRechargeShow = i8;
        this.livesdkRechargeSuccess = i9;
        this.livesdkRechargeCustomizedNext = i10;
        this.livesdkLike = i11;
        this.livesdkRechargeBannerClick = i12;
        this.curWatchDuration = i13;
        this.curRankDuration = i14;
        this.curSentGiftMoney = i15;
        this.curSentGiftCnt = i16;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ RechargeCurrentCacheData(boolean r33, int r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, int r48, int r49, int r50, int r51, int r52, int r53, int r54, int r55, int r56, int r57, int r58, int r59, int r60, int r61, int r62, int r63, kotlin.jvm.internal.DefaultConstructorMarker r64) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.p238ai.api.model.RechargeCurrentCacheData.<init>(boolean, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
