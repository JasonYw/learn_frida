package com.aweme.account.thirdservicemanger;

import com.aweme.account.thirdauthapi.p178a.AbstractC2424b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C117738WWe;

/* renamed from: com.aweme.account.thirdservicemanger.b */
/* loaded from: classes13.dex */
public final class C2427b {
    public static ChangeQuickRedirect LIZ;
    public static boolean LIZJ;

    /* renamed from: LJ */
    public final ConcurrentHashMap<String, AbstractC2424b> f25554LJ;
    public static final C117738WWe LIZLLL = new C117738WWe((byte) 0);
    public static final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) ThirdAuthServiceManager$Companion$instance$2.INSTANCE);

    public C2427b() {
        this.f25554LJ = new ConcurrentHashMap<>();
    }

    static {
        Covode.recordClassIndex(9361);
        if (!PatchProxy.proxy(new Object[0], LIZLLL, C117738WWe.LIZ, false, 2).isSupported && !LIZJ) {
            LIZJ = true;
            Set<BundleActivator> services = ServiceManager.get().getServices(BundleActivator.class);
            Intrinsics.checkExpressionValueIsNotNull(services, "");
            for (BundleActivator bundleActivator : services) {
                bundleActivator.LIZ();
            }
        }
    }

    public /* synthetic */ C2427b(byte b) {
        this();
    }

    public final AbstractC2424b LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (AbstractC2424b) proxy.result;
        }
        C106862S5w.LIZ(str);
        if (this.f25554LJ.containsKey(str)) {
            return this.f25554LJ.get(str);
        }
        return null;
    }

    public final boolean LIZIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(str);
        if (LIZ(str) != null) {
            return true;
        }
        return false;
    }

    public final void LIZ(String str, AbstractC2424b abstractC2424b) {
        if (PatchProxy.proxy(new Object[]{str, abstractC2424b}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, abstractC2424b);
        this.f25554LJ.put(str, abstractC2424b);
    }
}
