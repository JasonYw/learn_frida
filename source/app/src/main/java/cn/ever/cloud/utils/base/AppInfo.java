package cn.ever.cloud.utils.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class AppInfo {
    public static final /* synthetic */ KProperty[] $$delegatedProperties;
    public static ChangeQuickRedirect changeQuickRedirect;
    public static String did;
    public static String sdkVersion;

    /* renamed from: sf */
    public static String f21066sf;
    public static final AppInfo INSTANCE = new AppInfo();
    public static final ReadWriteProperty uid$delegate = Delegates.INSTANCE.notNull();

    public final long getUid() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? ((Long) proxy.result).longValue() : ((Number) uid$delegate.getValue(this, $$delegatedProperties[0])).longValue();
    }

    public final void setUid(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        uid$delegate.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
    }

    public final String getDid() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String str = did;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return str;
    }

    public final String getSdkVersion() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String str = sdkVersion;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return str;
    }

    public final String getSf() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String str = f21066sf;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return str;
    }

    static {
        Covode.recordClassIndex(3447);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(AppInfo.class, "uid", "getUid()J", 0);
        Reflection.mutableProperty1(mutablePropertyReference1Impl);
        $$delegatedProperties = new KProperty[]{mutablePropertyReference1Impl};
    }

    public final void setDid(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        did = str;
    }

    public final void setSdkVersion(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        sdkVersion = str;
    }

    public final void setSf(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        f21066sf = str;
    }

    public final void setup(long j, String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, str2, str3}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2, str3);
        setUid(j);
        did = str;
        sdkVersion = str2;
        f21066sf = str3;
    }
}
