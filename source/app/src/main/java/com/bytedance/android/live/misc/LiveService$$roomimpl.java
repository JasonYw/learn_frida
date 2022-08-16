package com.bytedance.android.live.misc;

import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.monitor.SafetyGuard;
import com.bytedance.android.live.room.api.IDiscoveryService;
import com.bytedance.android.live.room.api.ILiveShareService;
import com.bytedance.android.live.room.api.INavigationService;
import com.bytedance.android.live.room.api.IProfileService;
import com.bytedance.android.live.room.api.IReportService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.reflect.InvocationTargetException;
import p002O.C0002O;
import p003X.C116971W2r;
import p003X.C64719BgH;

/* loaded from: classes12.dex */
public class LiveService$$roomimpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32518);
    }

    public static void registerService() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 4).isSupported) {
            return;
        }
        safeRegister(INavigationService.class, (IService) safeNewEmptyInstance("com.bytedance.android.live.room.navi.NavigationService"));
        safeRegister(IDiscoveryService.class, (IService) safeNewEmptyInstance("com.bytedance.android.live.room.discovery.DiscoveryService"));
        safeRegister(IProfileService.class, (IService) safeNewEmptyInstance("com.bytedance.android.live.room.profile.ProfileService"));
        safeRegister(IReportService.class, (IService) safeNewEmptyInstance("com.bytedance.android.live.room.report.ReportService"));
        safeRegister(ILiveShareService.class, (IService) safeNewEmptyInstance("com.bytedance.android.live.room.share.LiveShareService"));
    }

    public static <T> T safeNewEmptyInstance(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        try {
            return (T) C64719BgH.LIZ(C116971W2r.LIZ(str));
        } catch (Exception e) {
            handleComponentInitException(C0002O.m25086C("safeNewEmptyInstance ", str), e);
            return null;
        }
    }

    public static <T extends IService> void safeRegister(Class<T> cls, T t) {
        if (!PatchProxy.proxy(new Object[]{cls, t}, null, changeQuickRedirect, true, 3).isSupported && t != null) {
            ServiceManager.registerService(cls, t);
        }
    }

    public static void handleComponentInitException(String str, Exception exc) {
        Throwable th;
        if (PatchProxy.proxy(new Object[]{str, exc}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        if (exc instanceof InvocationTargetException) {
            th = ((InvocationTargetException) exc).getTargetException();
        } else {
            th = exc;
        }
        ALogger.m15799e("TTLiveSDKContext", str, th);
        SafetyGuard.LIZ(exc, C0002O.m25086C("[room-impl]-", str));
    }
}
