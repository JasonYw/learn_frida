package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes23.dex */
public final class NPostSyncCommandResponseData {
    @SerializedName("results")
    public final List<NCommandResult> results;

    static {
        Covode.recordClassIndex(3229);
    }

    public final List<NCommandResult> getResults() {
        return this.results;
    }

    public NPostSyncCommandResponseData(List<NCommandResult> list) {
        this.results = list;
    }
}
