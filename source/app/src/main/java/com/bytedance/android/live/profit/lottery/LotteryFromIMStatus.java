package com.bytedance.android.live.profit.lottery;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes12.dex */
public enum LotteryFromIMStatus {
    LOTTERY_ONGOING("lottery_ongoing"),
    LOTTERY_FINISHED("lottery_finished"),
    LOTTERY_REJECTED("lottery_rejected"),
    LOTTERY_CANCELED("lottery_canceled");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String statusMsg;

    public static LotteryFromIMStatus valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (LotteryFromIMStatus) (proxy.isSupported ? proxy.result : Enum.valueOf(LotteryFromIMStatus.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LotteryFromIMStatus[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (LotteryFromIMStatus[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(33405);
    }

    LotteryFromIMStatus(String str) {
        this.statusMsg = str;
    }
}
