package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p003X.C106862S5w;
import p003X.C522136k3;

/* loaded from: classes23.dex */
public final class NPostSyncCommandRequest {
    public static final C522136k3 Companion = new C522136k3(null);
    @SerializedName("commands")
    public final List<NCommand> commands;

    static {
        Covode.recordClassIndex(3227);
    }

    public final List<NCommand> getCommands() {
        return this.commands;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NPostSyncCommandRequest(List<? extends NCommand> list) {
        C106862S5w.LIZ(list);
        this.commands = list;
    }
}
