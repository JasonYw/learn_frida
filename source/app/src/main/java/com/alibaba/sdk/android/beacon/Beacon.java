package com.alibaba.sdk.android.beacon;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes19.dex */
public final class Beacon {

    /* renamed from: a */
    public final C1025b f21517a;

    /* renamed from: com.alibaba.sdk.android.beacon.Beacon$1 */
    /* loaded from: classes19.dex */
    public static /* synthetic */ class C10231 {
        static {
            Covode.recordClassIndex(4418);
        }
    }

    /* loaded from: classes19.dex */
    public final class BeaconHandler extends Handler {
        static {
            Covode.recordClassIndex(4419);
        }

        public BeaconHandler(Looper looper) {
            super(looper);
        }
    }

    /* loaded from: classes19.dex */
    public static final class Builder {
        public String mAppKey;
        public String mAppSecret;
        public Map<String, String> mExtras = new HashMap();
        public long mLoopInterval = Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;

        static {
            Covode.recordClassIndex(4420);
        }

        public final Builder appKey(String str) {
            this.mAppKey = str.trim();
            return this;
        }

        public final Builder appSecret(String str) {
            this.mAppSecret = str.trim();
            return this;
        }

        public final Beacon build() {
            return new Beacon(this, null);
        }

        public final Builder extras(Map<String, String> map) {
            this.mExtras.putAll(map);
            return this;
        }

        public final Builder loopInterval(long j) {
            if (j < 60000) {
                this.mLoopInterval = 60000L;
                return this;
            }
            this.mLoopInterval = j;
            return this;
        }
    }

    /* loaded from: classes19.dex */
    public static final class Config {
        public final String key;
        public final String value;

        static {
            Covode.recordClassIndex(4421);
        }

        public Config(String str, String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    /* loaded from: classes19.dex */
    public static final class Error {
        public final String errCode;
        public final String errMsg;

        static {
            Covode.recordClassIndex(4422);
        }

        public Error(String str, String str2) {
            this.errCode = str;
            this.errMsg = str2;
        }
    }

    /* loaded from: classes19.dex */
    public interface OnServiceErrListener {
        static {
            Covode.recordClassIndex(4423);
        }

        void onErr(Error error);
    }

    /* loaded from: classes19.dex */
    public interface OnUpdateListener {
        static {
            Covode.recordClassIndex(4424);
        }

        void onUpdate(List<Config> list);
    }

    static {
        Covode.recordClassIndex(4417);
    }

    public Beacon(Builder builder) {
        this.f21517a = new C1025b(this);
    }

    public /* synthetic */ Beacon(Builder builder, C10231 c10231) {
        this(builder);
    }

    public static final void setPrepare(boolean z) {
        C1024a.f21518a = z;
    }

    public final void addServiceErrListener(OnServiceErrListener onServiceErrListener) {
    }

    public final void addUpdateListener(OnUpdateListener onUpdateListener) {
    }

    public final List<Config> getConfigs() {
        return this.f21517a.m19995a();
    }

    public final void start(Context context) {
    }

    public final void stop() {
    }
}
