package com.byted.cast.proxy;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes8.dex */
public class Config {
    public String appId;
    public String appSecret;
    public String domain;
    public boolean enableDebug;
    public ILogger logger;
    public IMonitor monitor;
    public CastProxyType type;

    static {
        Covode.recordClassIndex(9768);
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppSecret() {
        return this.appSecret;
    }

    public CastProxyType getCastProxyType() {
        return this.type;
    }

    public ILogger getLogger() {
        return this.logger;
    }

    public IMonitor getMonitor() {
        return this.monitor;
    }

    public String getProxy() {
        return this.domain;
    }

    public boolean isEnableDebug() {
        return this.enableDebug;
    }

    /* loaded from: classes8.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String appId;
        public String appSecret;
        public String domain;
        public boolean enableDebug;
        public ILogger logger = new ILogger() { // from class: com.byted.cast.proxy.Config.Builder.1
            static {
                Covode.recordClassIndex(9770);
            }

            @Override // com.byted.cast.proxy.ILogger
            public void onDebug(String str, String str2) {
            }

            @Override // com.byted.cast.proxy.ILogger
            public void onError(String str, String str2) {
            }

            @Override // com.byted.cast.proxy.ILogger
            public void onError(String str, String str2, Throwable th) {
            }

            @Override // com.byted.cast.proxy.ILogger
            public void onInfo(String str, String str2) {
            }

            @Override // com.byted.cast.proxy.ILogger
            public void onVerbose(String str, String str2) {
            }

            @Override // com.byted.cast.proxy.ILogger
            public void onWarn(String str, String str2) {
            }
        };
        public IMonitor monitor;
        public CastProxyType type;

        static {
            Covode.recordClassIndex(9769);
        }

        public Config build() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (Config) proxy.result;
            }
            Config config = new Config();
            config.appId = this.appId;
            config.appSecret = this.appSecret;
            config.enableDebug = this.enableDebug;
            config.monitor = this.monitor;
            config.logger = this.logger;
            config.domain = this.domain;
            config.type = this.type;
            return config;
        }

        public Builder appId(String str) {
            this.appId = str;
            return this;
        }

        public Builder appSecret(String str) {
            this.appSecret = str;
            return this;
        }

        public Builder castProxyType(CastProxyType castProxyType) {
            this.type = castProxyType;
            return this;
        }

        public Builder enableDebug(boolean z) {
            this.enableDebug = z;
            return this;
        }

        public Builder logger(ILogger iLogger) {
            this.logger = iLogger;
            return this;
        }

        public Builder monitor(IMonitor iMonitor) {
            this.monitor = iMonitor;
            return this;
        }

        public Builder proxy(String str) {
            this.domain = str;
            return this;
        }
    }
}
