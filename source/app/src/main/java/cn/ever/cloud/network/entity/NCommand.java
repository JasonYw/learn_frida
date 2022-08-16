package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public class NCommand {
    @SerializedName(MiPushCommandMessage.KEY_COMMAND)
    public final String command;
    @SerializedName("command_id")
    public final long commandId;
    @SerializedName("created_at")
    public final long createdAt;
    @SerializedName("param")
    public final Object param;

    static {
        Covode.recordClassIndex(3200);
    }

    public NCommand() {
        this(null, 0L, 0L, null, 15, null);
    }

    public final String getCommand() {
        return this.command;
    }

    public final long getCommandId() {
        return this.commandId;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final Object getParam() {
        return this.param;
    }

    public NCommand(String str, long j, long j2, Object obj) {
        C106862S5w.LIZ(str);
        this.command = str;
        this.commandId = j;
        this.createdAt = j2;
        this.param = obj;
    }

    public /* synthetic */ NCommand(String str, long j, long j2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) == 0 ? j2 : 0L, (i & 8) != 0 ? null : obj);
    }
}
