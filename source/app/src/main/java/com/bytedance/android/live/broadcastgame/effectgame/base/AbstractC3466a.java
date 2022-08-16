package com.bytedance.android.live.broadcastgame.effectgame.base;

import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.effectmanager.common.task.ExceptionResult;

/* renamed from: com.bytedance.android.live.broadcastgame.effectgame.base.a */
/* loaded from: classes5.dex */
public interface AbstractC3466a {
    static {
        Covode.recordClassIndex(19761);
    }

    void LIZ(int i, int i2, long j, Sticker sticker);

    void LIZ(int i, Sticker sticker);

    void LIZ(int i, Sticker sticker, ExceptionResult exceptionResult);

    void LIZ(int i, boolean z, int i2, Sticker sticker);
}
