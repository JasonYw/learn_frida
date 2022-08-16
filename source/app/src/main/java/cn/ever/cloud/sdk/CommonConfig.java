package cn.ever.cloud.sdk;

import android.content.Context;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC521496j1;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class CommonConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC0758b ISF;
    public final String bizSecUid;
    public final String bizUid;
    public final String cacheFolderPath;
    public final Integer commonThreadPoolNThread;
    public final Context context;
    public final String dataFolderPath;
    public final long deviceId;
    public final long epUid;
    public final long installId;
    public final int logLevel;
    public final AbstractC521496j1 networkConfig;
    public final String token;

    static {
        Covode.recordClassIndex(3282);
    }

    public static /* synthetic */ CommonConfig copy$default(CommonConfig commonConfig, Context context, String str, String str2, long j, String str3, AbstractC0758b abstractC0758b, long j2, long j3, int i, String str4, String str5, AbstractC521496j1 abstractC521496j1, Integer num, int i2, Object obj) {
        Context context2 = context;
        String str6 = str;
        long j4 = j2;
        String str7 = str3;
        AbstractC0758b abstractC0758b2 = abstractC0758b;
        String str8 = str2;
        long j5 = j;
        int i3 = i;
        AbstractC521496j1 abstractC521496j12 = abstractC521496j1;
        long j6 = j3;
        String str9 = str4;
        Integer num2 = num;
        String str10 = str5;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{commonConfig, context2, str6, str8, new Long(j5), str7, abstractC0758b2, new Long(j4), new Long(j6), Integer.valueOf(i3), str9, str10, abstractC521496j12, num2, Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (CommonConfig) proxy.result;
        }
        if ((i2 & 1) != 0) {
            context2 = commonConfig.context;
        }
        if ((i2 & 2) != 0) {
            str6 = commonConfig.bizUid;
        }
        if ((i2 & 4) != 0) {
            str8 = commonConfig.bizSecUid;
        }
        if ((i2 & 8) != 0) {
            j5 = commonConfig.epUid;
        }
        if ((i2 & 16) != 0) {
            str7 = commonConfig.token;
        }
        if ((i2 & 32) != 0) {
            abstractC0758b2 = commonConfig.ISF;
        }
        if ((i2 & 64) != 0) {
            j4 = commonConfig.deviceId;
        }
        if ((i2 & 128) != 0) {
            j6 = commonConfig.installId;
        }
        if ((i2 & 256) != 0) {
            i3 = commonConfig.logLevel;
        }
        if ((i2 & 512) != 0) {
            str9 = commonConfig.dataFolderPath;
        }
        if ((i2 & AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END) != 0) {
            str10 = commonConfig.cacheFolderPath;
        }
        if ((i2 & AccessibilityEventCompat.TYPE_WINDOW_CONTENT_CHANGED) != 0) {
            abstractC521496j12 = commonConfig.networkConfig;
        }
        if ((i2 & AccessibilityEventCompat.TYPE_VIEW_SCROLLED) != 0) {
            num2 = commonConfig.commonThreadPoolNThread;
        }
        return commonConfig.copy(context2, str6, str8, j5, str7, abstractC0758b2, j4, j6, i3, str9, str10, abstractC521496j12, num2);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.context, this.bizUid, this.bizSecUid, Long.valueOf(this.epUid), this.token, this.ISF, Long.valueOf(this.deviceId), Long.valueOf(this.installId), Integer.valueOf(this.logLevel), this.dataFolderPath, this.cacheFolderPath, this.networkConfig, this.commonThreadPoolNThread};
    }

    public final Context component1() {
        return this.context;
    }

    public final String component10() {
        return this.dataFolderPath;
    }

    public final String component11() {
        return this.cacheFolderPath;
    }

    public final AbstractC521496j1 component12() {
        return this.networkConfig;
    }

    public final Integer component13() {
        return this.commonThreadPoolNThread;
    }

    public final String component2() {
        return this.bizUid;
    }

    public final String component3() {
        return this.bizSecUid;
    }

    public final long component4() {
        return this.epUid;
    }

    public final String component5() {
        return this.token;
    }

    public final AbstractC0758b component6() {
        return this.ISF;
    }

    public final long component7() {
        return this.deviceId;
    }

    public final long component8() {
        return this.installId;
    }

    public final int component9() {
        return this.logLevel;
    }

    public final CommonConfig copy(Context context, String str, String str2, long j, String str3, AbstractC0758b abstractC0758b, long j2, long j3, int i, String str4, String str5, AbstractC521496j1 abstractC521496j1, Integer num) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str, str2, new Long(j), str3, abstractC0758b, new Long(j2), new Long(j3), Integer.valueOf(i), str4, str5, abstractC521496j1, num}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (CommonConfig) proxy.result;
        }
        C106862S5w.LIZ(context, str, abstractC0758b, str4, str5);
        return new CommonConfig(context, str, str2, j, str3, abstractC0758b, j2, j3, i, str4, str5, abstractC521496j1, num);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommonConfig) {
            return C106862S5w.LIZ(((CommonConfig) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("CommonConfig:%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", getObjects());
    }

    public final String getBizSecUid() {
        return this.bizSecUid;
    }

    public final String getBizUid() {
        return this.bizUid;
    }

    public final String getCacheFolderPath() {
        return this.cacheFolderPath;
    }

    public final Integer getCommonThreadPoolNThread() {
        return this.commonThreadPoolNThread;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getDataFolderPath() {
        return this.dataFolderPath;
    }

    public final long getDeviceId() {
        return this.deviceId;
    }

    public final long getEpUid() {
        return this.epUid;
    }

    public final AbstractC0758b getISF() {
        return this.ISF;
    }

    public final long getInstallId() {
        return this.installId;
    }

    public final int getLogLevel() {
        return this.logLevel;
    }

    public final AbstractC521496j1 getNetworkConfig() {
        return this.networkConfig;
    }

    public final String getToken() {
        return this.token;
    }

    /* loaded from: classes23.dex */
    public static final class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final Context applicationContext;
        public String bizSecUid;
        public String bizUid;
        public String cacheFolderPath;
        public Integer commonThreadPoolNThread;
        public String dataFolderPath;
        public Long deviceId;
        public Long epUid;
        public Long installId;
        public Integer logLevel;
        public AbstractC521496j1 networkConfig;
        public AbstractC0758b sourceFrom;
        public String token;

        static {
            Covode.recordClassIndex(3283);
        }

        public final CommonConfig build() {
            int i;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11);
            if (proxy.isSupported) {
                return (CommonConfig) proxy.result;
            }
            Context context = this.applicationContext;
            String str = this.bizUid;
            Intrinsics.checkNotNull(str);
            String str2 = this.bizSecUid;
            Long l = this.epUid;
            Intrinsics.checkNotNull(l);
            long longValue = l.longValue();
            String str3 = this.token;
            AbstractC0758b abstractC0758b = this.sourceFrom;
            if (abstractC0758b == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            Long l2 = this.deviceId;
            Intrinsics.checkNotNull(l2);
            long longValue2 = l2.longValue();
            Long l3 = this.installId;
            Intrinsics.checkNotNull(l3);
            long longValue3 = l3.longValue();
            Integer num = this.logLevel;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 2;
            }
            String str4 = this.dataFolderPath;
            Intrinsics.checkNotNull(str4);
            String str5 = this.cacheFolderPath;
            Intrinsics.checkNotNull(str5);
            return new CommonConfig(context, str, str2, longValue, str3, abstractC0758b, longValue2, longValue3, i, str4, str5, this.networkConfig, this.commonThreadPoolNThread);
        }

        public final Builder setNetworkConfig(AbstractC521496j1 abstractC521496j1) {
            this.networkConfig = abstractC521496j1;
            return this;
        }

        public final Builder setToken(String str) {
            this.token = str;
            return this;
        }

        public Builder(Context context) {
            C106862S5w.LIZ(context);
            this.applicationContext = context;
        }

        public final Builder setBizSecUid(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            C106862S5w.LIZ(str);
            this.bizSecUid = str;
            return this;
        }

        public final Builder setBizUid(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            C106862S5w.LIZ(str);
            this.bizUid = str;
            return this;
        }

        public final Builder setCacheFolderPath(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 9);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            C106862S5w.LIZ(str);
            this.cacheFolderPath = str;
            return this;
        }

        public final void setCommonThreadPoolNThread(int i) {
            if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 10).isSupported) {
                return;
            }
            this.commonThreadPoolNThread = Integer.valueOf(i);
        }

        public final Builder setDataFolderPath(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 8);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            C106862S5w.LIZ(str);
            this.dataFolderPath = str;
            return this;
        }

        public final Builder setSourceFrom(AbstractC0758b abstractC0758b) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC0758b}, this, changeQuickRedirect, false, 4);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            C106862S5w.LIZ(abstractC0758b);
            this.sourceFrom = abstractC0758b;
            return this;
        }

        public final Builder setDeviceId(long j) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 5);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            this.deviceId = Long.valueOf(j);
            return this;
        }

        public final Builder setEpUid(long j) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            this.epUid = Long.valueOf(j);
            return this;
        }

        public final Builder setInstallId(long j) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 6);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            this.installId = Long.valueOf(j);
            return this;
        }

        public final Builder setLogLevel(int i) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 7);
            if (proxy.isSupported) {
                return (Builder) proxy.result;
            }
            this.logLevel = Integer.valueOf(i);
            return this;
        }
    }

    public CommonConfig(Context context, String str, String str2, long j, String str3, AbstractC0758b abstractC0758b, long j2, long j3, int i, String str4, String str5, AbstractC521496j1 abstractC521496j1, Integer num) {
        C106862S5w.LIZ(context, str, abstractC0758b, str4, str5);
        this.context = context;
        this.bizUid = str;
        this.bizSecUid = str2;
        this.epUid = j;
        this.token = str3;
        this.ISF = abstractC0758b;
        this.deviceId = j2;
        this.installId = j3;
        this.logLevel = i;
        this.dataFolderPath = str4;
        this.cacheFolderPath = str5;
        this.networkConfig = abstractC521496j1;
        this.commonThreadPoolNThread = num;
    }

    public /* synthetic */ CommonConfig(Context context, String str, String str2, long j, String str3, AbstractC0758b abstractC0758b, long j2, long j3, int i, String str4, String str5, AbstractC521496j1 abstractC521496j1, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, j, (i2 & 16) != 0 ? null : str3, abstractC0758b, j2, j3, i, str4, str5, (i2 & AccessibilityEventCompat.TYPE_WINDOW_CONTENT_CHANGED) != 0 ? null : abstractC521496j1, (i2 & AccessibilityEventCompat.TYPE_VIEW_SCROLLED) == 0 ? num : null);
    }
}
