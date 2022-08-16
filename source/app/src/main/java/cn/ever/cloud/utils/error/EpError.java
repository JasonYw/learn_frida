package cn.ever.cloud.utils.error;

import cn.ever.cloud.utils.monitor.MonitorKit;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p002O.C0002O;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public class EpError extends RuntimeException {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int code;
    public final String detailMessage;
    public final String humanMessage;

    static {
        Covode.recordClassIndex(3452);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDetailMessage() {
        return this.detailMessage;
    }

    public final String getHumanMessage() {
        return this.humanMessage;
    }

    public final String superToString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return super.toString();
    }

    public void onSendMonitor() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        MonitorKit.INSTANCE.epError("epError", String.valueOf(this.code), this.detailMessage);
    }

    @Override // java.lang.Throwable
    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return C0002O.m25080C("EpError(code=", Integer.valueOf(this.code), ", detailMessage='", this.detailMessage, "', humanMessage='", this.humanMessage, "'), ", super.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpError(int i, String str, String str2) {
        super(str);
        C106862S5w.LIZ(str);
        this.code = i;
        this.detailMessage = str;
        this.humanMessage = str2 == null ? "其他异常错误" : str2;
        onSendMonitor();
    }
}
