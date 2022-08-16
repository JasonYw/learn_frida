package com.bytedance.android.live.livepullstream.api;

import com.bytedance.android.live.base.IService;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p003X.AbstractC450903sS;

/* loaded from: classes12.dex */
public interface ICastScreenStreamService extends IService {
    static {
        Covode.recordClassIndex(32106);
    }

    AbstractC450903sS getLiveStreamWrapper(JSONObject jSONObject);
}
