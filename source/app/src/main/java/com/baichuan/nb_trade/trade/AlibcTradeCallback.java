package com.baichuan.nb_trade.trade;

import com.bytedance.covode.number.Covode;

/* loaded from: classes13.dex */
public interface AlibcTradeCallback {
    static {
        Covode.recordClassIndex(9487);
    }

    void onFailure(int i, String str);

    void onSuccess(String str);
}
