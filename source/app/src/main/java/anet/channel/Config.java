package anet.channel;

import android.text.TextUtils;
import anet.channel.entity.ENV;
import anet.channel.security.C0530c;
import anet.channel.security.ISecurity;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Config {
    public static final Config DEFAULT_CONFIG;

    /* renamed from: a */
    public static Map<String, Config> f20322a = new HashMap();

    /* renamed from: b */
    public String f20323b;

    /* renamed from: c */
    public String f20324c;

    /* renamed from: d */
    public ENV f20325d = ENV.ONLINE;

    /* renamed from: e */
    public ISecurity f20326e;

    public final String getAppkey() {
        return this.f20324c;
    }

    public final ENV getEnv() {
        return this.f20325d;
    }

    public final ISecurity getSecurity() {
        return this.f20326e;
    }

    public final String getTag() {
        return this.f20323b;
    }

    public final String toString() {
        return this.f20323b;
    }

    static {
        Covode.recordClassIndex(2128);
        Builder builder = new Builder();
        builder.setTag("[default]");
        builder.setAppkey("[default]");
        builder.setEnv(ENV.ONLINE);
        DEFAULT_CONFIG = builder.build();
    }

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: a */
        public String f20327a;

        /* renamed from: b */
        public String f20328b;

        /* renamed from: c */
        public ENV f20329c = ENV.ONLINE;

        /* renamed from: d */
        public String f20330d;

        /* renamed from: e */
        public String f20331e;

        static {
            Covode.recordClassIndex(2129);
        }

        public Config build() {
            MethodCollector.m14708i(3);
            if (!TextUtils.isEmpty(this.f20328b)) {
                synchronized (Config.f20322a) {
                    try {
                        for (Config config : Config.f20322a.values()) {
                            if (config.f20325d == this.f20329c && config.f20324c.equals(this.f20328b)) {
                                ALog.m20783w("awcn.Config", "duplicated config exist!", null, "appkey", this.f20328b, "env", this.f20329c);
                                if (!TextUtils.isEmpty(this.f20327a)) {
                                    Config.f20322a.put(this.f20327a, config);
                                }
                                return config;
                            }
                        }
                        Config config2 = new Config();
                        config2.f20324c = this.f20328b;
                        config2.f20325d = this.f20329c;
                        if (TextUtils.isEmpty(this.f20327a)) {
                            config2.f20323b = StringUtils.concatString(this.f20328b, "$", this.f20329c.toString());
                        } else {
                            config2.f20323b = this.f20327a;
                        }
                        if (!TextUtils.isEmpty(this.f20331e)) {
                            config2.f20326e = C0530c.m20922a().createNonSecurity(this.f20331e);
                        } else {
                            config2.f20326e = C0530c.m20922a().createSecurity(this.f20330d);
                        }
                        synchronized (Config.f20322a) {
                            try {
                                Config.f20322a.put(config2.f20323b, config2);
                            } finally {
                            }
                        }
                        MethodCollector.m14707o(3);
                        return config2;
                    } finally {
                        MethodCollector.m14707o(3);
                    }
                }
            }
            RuntimeException runtimeException = new RuntimeException("appkey can not be null or empty!");
            MethodCollector.m14707o(3);
            throw runtimeException;
        }

        public Builder setAppSecret(String str) {
            this.f20331e = str;
            return this;
        }

        public Builder setAppkey(String str) {
            this.f20328b = str;
            return this;
        }

        public Builder setAuthCode(String str) {
            this.f20330d = str;
            return this;
        }

        public Builder setEnv(ENV env) {
            this.f20329c = env;
            return this;
        }

        public Builder setTag(String str) {
            this.f20327a = str;
            return this;
        }
    }

    public static Config getConfigByTag(String str) {
        Config config;
        MethodCollector.m14708i(4);
        synchronized (f20322a) {
            try {
                config = f20322a.get(str);
            } catch (Throwable th) {
                MethodCollector.m14707o(4);
                throw th;
            }
        }
        MethodCollector.m14707o(4);
        return config;
    }

    public static Config getConfig(String str, ENV env) {
        MethodCollector.m14708i(5);
        synchronized (f20322a) {
            try {
                for (Config config : f20322a.values()) {
                    if (config.f20325d == env && config.f20324c.equals(str)) {
                        MethodCollector.m14707o(5);
                        return config;
                    }
                }
                MethodCollector.m14707o(5);
                return null;
            } catch (Throwable th) {
                MethodCollector.m14707o(5);
                throw th;
            }
        }
    }
}
