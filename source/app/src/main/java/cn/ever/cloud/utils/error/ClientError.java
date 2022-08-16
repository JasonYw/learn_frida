package cn.ever.cloud.utils.error;

import cn.ever.cloud.utils.LogHelper;
import cn.ever.cloud.utils.MemUtil;
import cn.ever.cloud.utils.monitor.MonitorKit;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class ClientError extends EpError {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3450);
    }

    /* loaded from: classes23.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3451);
        }

        public Companion() {
        }

        public final ClientError networkClientError() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
            if (proxy.isSupported) {
                return (ClientError) proxy.result;
            }
            ErrorCode errorCode = ErrorCode.CLIENT_NETWORK_CLIENT;
            return new ClientError(errorCode.getCode(), errorCode.getMessage(), errorCode.getMessage());
        }

        public final ClientError networkError() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return (ClientError) proxy.result;
            }
            ErrorCode errorCode = ErrorCode.CLIENT_NETWORK;
            return new ClientError(errorCode.getCode(), errorCode.getMessage(), errorCode.getMessage());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ClientError internal(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return (ClientError) proxy.result;
            }
            ErrorCode errorCode = ErrorCode.CLIENT_OTHER;
            int code = errorCode.getCode();
            if (str == null) {
                str = errorCode.getMessage();
            }
            return new ClientError(code, str, errorCode.getMessage());
        }

        public final ClientError toClientError(ErrorCode errorCode) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{errorCode}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (ClientError) proxy.result;
            }
            C106862S5w.LIZ(errorCode);
            return new ClientError(errorCode.getCode(), errorCode.getMessage(), errorCode.getMessage());
        }
    }

    @Override // cn.ever.cloud.utils.error.EpError
    public final void onSendMonitor() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        try {
            MemUtil.AllMemInfo pickAllMemInfo = MemUtil.INSTANCE.pickAllMemInfo();
            MonitorKit.INSTANCE.epError("clientError", String.valueOf(getCode()), getDetailMessage(), Float.valueOf(pickAllMemInfo.getJUsedMem()), Float.valueOf(pickAllMemInfo.getJMaxMem()), Float.valueOf(pickAllMemInfo.getJUsedRatio()), Float.valueOf(pickAllMemInfo.getSysUsedMem()), Float.valueOf(pickAllMemInfo.getSysMaxMem()), Float.valueOf(pickAllMemInfo.getSysUsedRatio()), Float.valueOf(pickAllMemInfo.getNativeUsedMem()), Float.valueOf(pickAllMemInfo.getNativeMaxMem()), Float.valueOf(pickAllMemInfo.getNativeUsedRatio()));
        } catch (Exception e) {
            LogHelper.INSTANCE.m20554e("ClientError", String.valueOf(e.getMessage()));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientError(ErrorCode errorCode) {
        this(errorCode.getCode(), errorCode.getMessage(), errorCode.getMessage());
        C106862S5w.LIZ(errorCode);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientError(ErrorCode errorCode, String str) {
        this(errorCode.getCode(), str == null ? errorCode.getMessage() : str, errorCode.getMessage());
        C106862S5w.LIZ(errorCode);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientError(int i, String str, String str2) {
        super(i, str, str2);
        C106862S5w.LIZ(str);
    }

    public /* synthetic */ ClientError(ErrorCode errorCode, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorCode, (i & 2) != 0 ? null : str);
    }
}
