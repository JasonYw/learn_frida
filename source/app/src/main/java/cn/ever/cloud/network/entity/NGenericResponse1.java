package cn.ever.cloud.network.entity;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes19.dex */
public class NGenericResponse1<Data> extends NResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(C2521l.LJIIL)
    public final Data data;

    static {
        Covode.recordClassIndex(3211);
    }

    public final Data getData() {
        return this.data;
    }

    @Override // cn.ever.cloud.network.entity.NResponse
    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        StringBuffer stringBuffer = new StringBuffer("NGenericResponse1{");
        stringBuffer.append("data=");
        stringBuffer.append(this.data);
        stringBuffer.append(", detailMessage='");
        stringBuffer.append(this.message);
        stringBuffer.append('\'');
        stringBuffer.append(", code=");
        stringBuffer.append(this.code);
        stringBuffer.append(", timestamp=");
        stringBuffer.append(this.timestamp);
        stringBuffer.append('}');
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "");
        return stringBuffer2;
    }
}
