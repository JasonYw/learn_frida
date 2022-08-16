package cn.ever.cloud.sdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes23.dex */
public final class StrategyConfig {
    public final Integer downloadConcurrent;
    public final Integer downloadFailedRetry;
    public final Long maxUploadFileBytes;
    public final Long maxUploadVideoDuration;
    public final Integer uploadConcurrent;
    public final Integer uploadFailedRetry;

    static {
        Covode.recordClassIndex(3302);
    }

    public final Integer getDownloadConcurrent() {
        return this.downloadConcurrent;
    }

    public final Integer getDownloadFailedRetry() {
        return this.downloadFailedRetry;
    }

    public final Long getMaxUploadFileBytes() {
        return this.maxUploadFileBytes;
    }

    public final Long getMaxUploadVideoDuration() {
        return this.maxUploadVideoDuration;
    }

    public final Integer getUploadConcurrent() {
        return this.uploadConcurrent;
    }

    public final Integer getUploadFailedRetry() {
        return this.uploadFailedRetry;
    }

    /* loaded from: classes23.dex */
    public static final class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3303);
        }

        public final StrategyConfig build() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (StrategyConfig) proxy.result;
            }
            return new StrategyConfig(null, null, null, null, null, null, 63, null);
        }
    }

    public StrategyConfig(Integer num, Integer num2, Integer num3, Integer num4, Long l, Long l2) {
        this.uploadConcurrent = num;
        this.uploadFailedRetry = num2;
        this.downloadConcurrent = num3;
        this.downloadFailedRetry = num4;
        this.maxUploadFileBytes = l;
        this.maxUploadVideoDuration = l2;
    }

    public /* synthetic */ StrategyConfig(Integer num, Integer num2, Integer num3, Integer num4, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : l, (i & 32) == 0 ? l2 : null);
    }
}
