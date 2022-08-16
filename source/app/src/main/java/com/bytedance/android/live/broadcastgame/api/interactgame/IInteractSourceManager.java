package com.bytedance.android.live.broadcastgame.api.interactgame;

import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.livesdk.gecko.g$b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.DataCenter;
import io.reactivex.Observable;
import p003X.AbstractC88271KqH;
import p003X.AbstractC88290Kqa;

/* loaded from: classes5.dex */
public interface IInteractSourceManager extends IService {
    static {
        Covode.recordClassIndex(19105);
    }

    Observable<g$b> getEffectSource(C3383p c3383p, boolean z);

    Observable<g$b> getLynxFile(C3383p c3383p, boolean z, String str);

    Observable<g$b> getPngFile(C3383p c3383p, int i);

    void setDataCenter(DataCenter dataCenter);

    void setGeckoClient(AbstractC88290Kqa abstractC88290Kqa);

    void setTC21GeckoClient(AbstractC88271KqH abstractC88271KqH);

    Observable<g$b> updateOpenPlatformJsSdk(String str, String str2, String str3, String str4);
}
