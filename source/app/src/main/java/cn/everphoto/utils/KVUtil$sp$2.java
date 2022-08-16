package cn.everphoto.utils;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C106011Roj;
import p003X.G4Y;

/* loaded from: classes9.dex */
public final class KVUtil$sp$2 extends Lambda implements Function0<SharedPreferences> {
    public static final KVUtil$sp$2 INSTANCE = new KVUtil$sp$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3855);
    }

    public KVUtil$sp$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ SharedPreferences mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return G4Y.LIZ(C106011Roj.LIZ(), "kv_moment_sdk_sp", 0);
    }
}
