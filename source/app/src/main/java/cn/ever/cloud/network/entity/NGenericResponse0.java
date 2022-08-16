package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes19.dex */
public class NGenericResponse0 extends NResponse {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3210);
    }

    @Override // cn.ever.cloud.network.entity.NResponse
    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        StringBuffer stringBuffer = new StringBuffer("NGenericResponse0{");
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
