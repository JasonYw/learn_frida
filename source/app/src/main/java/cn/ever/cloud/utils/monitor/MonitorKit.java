package cn.ever.cloud.utils.monitor;

import cn.ever.cloud.utils.LogHelper;
import cn.ever.cloud.utils.monitor.TimeStampPool;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class MonitorKit {
    public static final MonitorKit INSTANCE = new MonitorKit();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3496);
    }

    public final void clearMonitorDelegate() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17).isSupported) {
            return;
        }
        MonitorHelper.INSTANCE.clearMonitorDelegate();
    }

    public final void addMonitorDelegate(AbstractC0764a abstractC0764a) {
        if (PatchProxy.proxy(new Object[]{abstractC0764a}, this, changeQuickRedirect, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC0764a);
        MonitorHelper.INSTANCE.addMonitorDelegate(abstractC0764a);
    }

    public final void ensureNotNull(Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        MonitorHelper.INSTANCE.ensureNotNull(obj);
    }

    public final void albumService(String str, Object... objArr) {
        if (PatchProxy.proxy(new Object[]{str, objArr}, this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ((Object) str, (Object) objArr);
        MonitorHelper monitorHelper = MonitorHelper.INSTANCE;
        ModuleConfig moduleConfig = MonitorModule.ALBUM_SERVICE;
        Intrinsics.checkNotNullExpressionValue(moduleConfig, "");
        monitorHelper.logEvent(moduleConfig, str, Arrays.copyOf(objArr, objArr.length));
    }

    public final void assetService(String str, Object... objArr) {
        if (PatchProxy.proxy(new Object[]{str, objArr}, this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ((Object) str, (Object) objArr);
        MonitorHelper monitorHelper = MonitorHelper.INSTANCE;
        ModuleConfig moduleConfig = MonitorModule.ASSET_SERVICE;
        Intrinsics.checkNotNullExpressionValue(moduleConfig, "");
        monitorHelper.logEvent(moduleConfig, str, Arrays.copyOf(objArr, objArr.length));
    }

    public final void backup(String str, Object... objArr) {
        if (PatchProxy.proxy(new Object[]{str, objArr}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ((Object) str, (Object) objArr);
        MonitorHelper monitorHelper = MonitorHelper.INSTANCE;
        ModuleConfig moduleConfig = MonitorModule.BACKUP;
        Intrinsics.checkNotNullExpressionValue(moduleConfig, "");
        monitorHelper.logEvent(moduleConfig, str, Arrays.copyOf(objArr, objArr.length));
    }

    public final void download(String str, Object... objArr) {
        if (PatchProxy.proxy(new Object[]{str, objArr}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ((Object) str, (Object) objArr);
        MonitorHelper monitorHelper = MonitorHelper.INSTANCE;
        ModuleConfig moduleConfig = MonitorModule.DOWNLOAD;
        Intrinsics.checkNotNullExpressionValue(moduleConfig, "");
        monitorHelper.logEvent(moduleConfig, str, Arrays.copyOf(objArr, objArr.length));
    }

    public final void ensureNotReachHere(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        LogHelper.INSTANCE.m20554e("MonitorKit", str2);
        MonitorHelper monitorHelper = MonitorHelper.INSTANCE;
        new StringBuilder();
        monitorHelper.ensureNotReachHere(C0002O.m25085C(str, " - ", str2));
    }

    public final void epError(String str, Object... objArr) {
        if (PatchProxy.proxy(new Object[]{str, objArr}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ((Object) str, (Object) objArr);
        MonitorHelper monitorHelper = MonitorHelper.INSTANCE;
        ModuleConfig moduleConfig = MonitorModule.EP_ERROR;
        Intrinsics.checkNotNullExpressionValue(moduleConfig, "");
        monitorHelper.logEvent(moduleConfig, str, Arrays.copyOf(objArr, objArr.length));
    }

    public final void network(String str, Object... objArr) {
        if (PatchProxy.proxy(new Object[]{str, objArr}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ((Object) str, (Object) objArr);
        MonitorHelper monitorHelper = MonitorHelper.INSTANCE;
        ModuleConfig moduleConfig = MonitorModule.NETWORK;
        Intrinsics.checkNotNullExpressionValue(moduleConfig, "");
        monitorHelper.logEvent(moduleConfig, str, Arrays.copyOf(objArr, objArr.length));
    }

    public final TimeStampPool.TimeZone serviceEnd(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (TimeStampPool.TimeZone) proxy.result;
        }
        C106862S5w.LIZ(str);
        TimeStampPool.TimeZone onServiceEnd = TimeStampPool.onServiceEnd(str, str2);
        Intrinsics.checkNotNullExpressionValue(onServiceEnd, "");
        return onServiceEnd;
    }

    public final long serviceEndAndGetDuration(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        C106862S5w.LIZ(str);
        return serviceEnd(str, str2).duration();
    }

    public final TimeStampPool.TimeZone servicePause(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (TimeStampPool.TimeZone) proxy.result;
        }
        C106862S5w.LIZ(str);
        TimeStampPool.TimeZone onServicePause = TimeStampPool.onServicePause(str, str2);
        Intrinsics.checkNotNullExpressionValue(onServicePause, "");
        return onServicePause;
    }

    public final long servicePauseAndGetDuration(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        C106862S5w.LIZ(str);
        return servicePause(str, str2).duration();
    }

    public final long serviceStart(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        C106862S5w.LIZ(str);
        return TimeStampPool.serviceStart(str, str2);
    }

    public final void sync(String str, Object... objArr) {
        if (PatchProxy.proxy(new Object[]{str, objArr}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ((Object) str, (Object) objArr);
        MonitorHelper monitorHelper = MonitorHelper.INSTANCE;
        ModuleConfig moduleConfig = MonitorModule.SYNC;
        Intrinsics.checkNotNullExpressionValue(moduleConfig, "");
        monitorHelper.logEvent(moduleConfig, str, Arrays.copyOf(objArr, objArr.length));
    }

    public final void user(String str, Object... objArr) {
        if (PatchProxy.proxy(new Object[]{str, objArr}, this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ((Object) str, (Object) objArr);
        MonitorHelper monitorHelper = MonitorHelper.INSTANCE;
        ModuleConfig moduleConfig = MonitorModule.USER;
        Intrinsics.checkNotNullExpressionValue(moduleConfig, "");
        monitorHelper.logEvent(moduleConfig, str, Arrays.copyOf(objArr, objArr.length));
    }
}
