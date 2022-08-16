package com.bytedance.android.live.impl.utils;

import android.app.Application;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AnonymousClass425;
import p003X.G4Y;

/* loaded from: classes8.dex */
public final class SharedPrefHelper$spForLiveFeatureManager$2 extends Lambda implements Function0<SharedPreferences> {
    public static final SharedPrefHelper$spForLiveFeatureManager$2 INSTANCE = new SharedPrefHelper$spForLiveFeatureManager$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(25042);
    }

    public SharedPrefHelper$spForLiveFeatureManager$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ SharedPreferences mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Application LIZ = AnonymousClass425.LIZ();
        SharedPrefHelper sharedPrefHelper = SharedPrefHelper.LIZJ;
        return G4Y.LIZ(LIZ, SharedPrefHelper.LIZIZ, 0);
    }
}
