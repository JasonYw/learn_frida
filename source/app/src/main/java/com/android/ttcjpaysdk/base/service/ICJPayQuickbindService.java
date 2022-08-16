package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayQuickbindService extends ICJPayService {

    /* loaded from: classes17.dex */
    public interface IQuickbindContextDepend {
        static {
            Covode.recordClassIndex(6483);
        }

        String getBindCardInfo();

        String getBindCardSource();

        JSONObject getCJPayHostInfo();

        int getTradeScene();

        boolean isIndependentBindCard();
    }

    static {
        Covode.recordClassIndex(6481);
    }

    void doQuickBindCard(IQuickbindContextDepend iQuickbindContextDepend);
}
