package com.bytedance.android.live.network.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;

/* loaded from: classes8.dex */
public abstract class AbsJsonDeserializer<T> implements JsonDeserializer<T> {
    public Gson LIZ;

    static {
        Covode.recordClassIndex(32628);
    }

    public AbsJsonDeserializer(Gson gson) {
        this.LIZ = gson;
    }
}
