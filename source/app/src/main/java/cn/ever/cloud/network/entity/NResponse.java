package cn.ever.cloud.network.entity;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes19.dex */
public class NResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(C2521l.LJIIJ)
    public int code;
    @SerializedName("message")
    public String message;
    @SerializedName("timestamp")
    public long timestamp;

    static {
        Covode.recordClassIndex(3230);
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        StringBuffer stringBuffer = new StringBuffer("NResponse{");
        stringBuffer.append("detailMessage='");
        stringBuffer.append(this.message);
        stringBuffer.append('\'');
        stringBuffer.append(", code=");
        stringBuffer.append(this.code);
        stringBuffer.append(", timestamp=");
        stringBuffer.append(this.timestamp);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
