package com.bytedance.android.live.core.verify.responbean;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes8.dex */
public class CertificationQuery {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("children_cert_token")
    public String childrenCertToken;
    @SerializedName("failed_reason")
    public String failedReason;
    @SerializedName("msg")
    public String message;
    @SerializedName("is_verified")
    public boolean passed;
    @SerializedName("prompts_type")
    public int promptsType;
    @SerializedName("sdk_verified")
    public boolean sdkVerified;
    @SerializedName("status_code")
    public int statusCode;
    @SerializedName("use_manual_verify")
    public boolean useManualVerify;

    static {
        Covode.recordClassIndex(24192);
    }

    public String getChildrenCertToken() {
        return this.childrenCertToken;
    }

    public String getFailedReason() {
        return this.failedReason;
    }

    public String getMessage() {
        return this.message;
    }

    public boolean getPassed() {
        return this.passed;
    }

    public int getPromptsType() {
        return this.promptsType;
    }

    public boolean getSdkVerified() {
        return this.sdkVerified;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public boolean isUseManualVerify() {
        return this.useManualVerify;
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "CertificationQuery{statusCode=" + this.statusCode + ", message='" + this.message + "', passed=" + this.passed + ", failedReason='" + this.failedReason + "', useManualVerify=" + this.useManualVerify + ", promptsType=" + this.promptsType + ", sdkVerified=" + this.sdkVerified + '}';
    }
}
