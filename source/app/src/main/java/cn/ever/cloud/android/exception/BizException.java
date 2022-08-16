package cn.ever.cloud.android.exception;

import cn.ever.cloud.utils.monitor.MonitorKit;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class BizException extends Exception {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int code;

    static {
        Covode.recordClassIndex(2881);
    }

    public final int getCode() {
        return this.code;
    }

    private final void onSendMonitor() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        MonitorKit.INSTANCE.epError("bizException", String.valueOf(this.code), getMessage());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "code=" + this.code + ", message=" + getMessage();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizException(int i, String str, Throwable th) {
        super(str, th);
        C106862S5w.LIZ(str);
        this.code = i;
        onSendMonitor();
    }
}
