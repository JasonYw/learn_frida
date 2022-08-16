package cn.ever.cloud.network.entity;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class NCommandResult {
    @SerializedName(C2521l.LJIIJ)
    public final long code;
    @SerializedName("command_id")
    public final long commandId;
    @SerializedName(C2521l.LJIIL)
    public final NCommandResultData data;
    @SerializedName("msg")
    public final String msg;

    static {
        Covode.recordClassIndex(3202);
    }

    public final long getCode() {
        return this.code;
    }

    public final long getCommandId() {
        return this.commandId;
    }

    public final NCommandResultData getData() {
        return this.data;
    }

    public final String getMsg() {
        return this.msg;
    }

    public NCommandResult(long j, long j2, String str, NCommandResultData nCommandResultData) {
        C106862S5w.LIZ(str);
        this.commandId = j;
        this.code = j2;
        this.msg = str;
        this.data = nCommandResultData;
    }
}
