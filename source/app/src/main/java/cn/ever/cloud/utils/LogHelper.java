package cn.ever.cloud.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC521786jU;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class LogHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final LogHelper INSTANCE = new LogHelper();
    public static AbstractC521786jU logger = DefaultLoggerImpl.INSTANCE;
    public static int logLevel = 2;

    public static /* synthetic */ void getLogLevel$annotations() {
    }

    static {
        Covode.recordClassIndex(3431);
    }

    public final void setLogLevel(int i) {
        logLevel = i;
    }

    public final void setLogger(AbstractC521786jU abstractC521786jU) {
        if (PatchProxy.proxy(new Object[]{abstractC521786jU}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC521786jU);
        logger = abstractC521786jU;
    }

    /* renamed from: d */
    public final void m20555d(String str, String str2) {
        AbstractC521786jU abstractC521786jU;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        if (logLevel <= 3 && (abstractC521786jU = logger) != null) {
            abstractC521786jU.print(3, str, str2);
        }
    }

    /* renamed from: e */
    public final void m20554e(String str, String str2) {
        AbstractC521786jU abstractC521786jU;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        if (logLevel <= 6 && (abstractC521786jU = logger) != null) {
            abstractC521786jU.print(6, str, str2);
        }
    }

    /* renamed from: i */
    public final void m20553i(String str, String str2) {
        AbstractC521786jU abstractC521786jU;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        if (logLevel <= 4 && (abstractC521786jU = logger) != null) {
            abstractC521786jU.print(4, str, str2);
        }
    }

    /* renamed from: v */
    public final void m20552v(String str, String str2) {
        AbstractC521786jU abstractC521786jU;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        if (logLevel <= 2 && (abstractC521786jU = logger) != null) {
            abstractC521786jU.print(2, str, str2);
        }
    }

    /* renamed from: w */
    public final void m20551w(String str, String str2) {
        AbstractC521786jU abstractC521786jU;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        if (logLevel <= 5 && (abstractC521786jU = logger) != null) {
            abstractC521786jU.print(5, str, str2);
        }
    }
}
