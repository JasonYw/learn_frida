package cn.ever.cloud.network.error;

import cn.ever.cloud.network.entity.NResponse;
import cn.ever.cloud.utils.error.EpError;
import cn.ever.cloud.utils.error.ErrorCode;
import cn.ever.cloud.utils.monitor.MonitorKit;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class ServerError extends EpError {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int statusCode;

    static {
        Covode.recordClassIndex(3251);
    }

    /* loaded from: classes23.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3252);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ServerError serverInternal(int i) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (ServerError) proxy.result;
            }
            return new ServerError(i, ErrorCode.SERVER_INTERNAL);
        }

        public final ServerError fromResponse(int i, NResponse nResponse) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), nResponse}, this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return (ServerError) proxy.result;
            }
            C106862S5w.LIZ(nResponse);
            int i2 = nResponse.code;
            String str = nResponse.message;
            Intrinsics.checkNotNullExpressionValue(str, "");
            return new ServerError(i, i2, str, nResponse.message);
        }

        public final ServerError fromCode(int i, int i2) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return (ServerError) proxy.result;
            }
            ErrorCode findByCode = ErrorCode.Companion.findByCode(i2);
            if (findByCode != null) {
                return new ServerError(i, findByCode);
            }
            return new ServerError(i, i2, "cannot find ErrorCode for code: " + i2, "服务器错误");
        }
    }

    @Override // cn.ever.cloud.utils.error.EpError
    public final void onSendMonitor() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        MonitorKit.INSTANCE.epError("serverError", String.valueOf(getCode()), getDetailMessage());
    }

    @Override // cn.ever.cloud.utils.error.EpError, java.lang.Throwable
    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "ServerError(statusCode=" + this.statusCode + ", code=" + getCode() + ", detailMessage='" + getDetailMessage() + "'), " + superToString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ServerError(int i, ErrorCode errorCode) {
        this(i, errorCode.getCode(), errorCode.getMessage(), errorCode.getMessage());
        C106862S5w.LIZ(errorCode);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerError(int i, int i2, String str, String str2) {
        super(i2, str, str2);
        C106862S5w.LIZ(str);
        this.statusCode = i;
    }
}
