package com.baichuan.nb_trade.core;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* loaded from: classes13.dex */
public interface AlibcTradeInitCallback extends Serializable {
    static {
        Covode.recordClassIndex(9460);
    }

    void onFailure(int i, String str);

    void onSuccess();
}
