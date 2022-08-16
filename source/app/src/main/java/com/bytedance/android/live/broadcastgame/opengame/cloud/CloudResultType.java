package com.bytedance.android.live.broadcastgame.opengame.cloud;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes5.dex */
public final class CloudResultType {
    static {
        Covode.recordClassIndex(19971);
    }

    /* loaded from: classes5.dex */
    public enum ClientResultType {
        Success("success", 0),
        NetworkUnavailable("Network Error Occur:%s, status code = %s", 40000),
        NetworkError("Network Error Occur:%s, errNo = %s", 40000),
        NotLogin("User Doesn't Login", 40006),
        NetworkTimeOut("Network Request Timeout", 40015),
        ServerError("Internal Error Occur, server error:%s, errNo = %s", 50001);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final String errMsg;
        public final int errNo;

        public static ClientResultType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (ClientResultType) (proxy.isSupported ? proxy.result : Enum.valueOf(ClientResultType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ClientResultType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (ClientResultType[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(19972);
        }

        ClientResultType(String str, int i) {
            this.errMsg = str;
            this.errNo = i;
        }
    }

    /* loaded from: classes5.dex */
    public enum OpenPlatformServerResultType {
        Success(0, "success"),
        SystemError(11000, "system error"),
        SidNotExist(13001, "sid not exist"),
        BadBaseToken(13002, "bad base token"),
        BadCloudCode(13003, "bad cloud code"),
        BadAnonymousCloudCode(13004, "bad anonymous cloud code"),
        NotFaasFunction(13005, "not available faas function"),
        BadParams(40014, "bad params"),
        BadAppId(40015, "bad appId"),
        BadCloudToken(40022, "bad cloud token"),
        BadSid(40023, "bad sid"),
        BadBaseAppId(40026, "bad base appId"),
        UnknownError(-1, "unknown error");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final String errMsg;
        public final int errNo;

        public static OpenPlatformServerResultType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (OpenPlatformServerResultType) (proxy.isSupported ? proxy.result : Enum.valueOf(OpenPlatformServerResultType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static OpenPlatformServerResultType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (OpenPlatformServerResultType[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(19973);
        }

        OpenPlatformServerResultType(int i, String str) {
            this.errNo = i;
            this.errMsg = str;
        }
    }
}
