package cn.everphoto.core.cvinfo.cache;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC116349Vr5;
import p003X.C116350Vr6;

/* loaded from: classes13.dex */
public final class AssetMomentRepositoryImpl$allMoment$2 extends Lambda implements Function0<ConcurrentHashMap<String, C0771j>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C116350Vr6 this$0;

    static {
        Covode.recordClassIndex(3539);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetMomentRepositoryImpl$allMoment$2(C116350Vr6 c116350Vr6) {
        super(0);
        this.this$0 = c116350Vr6;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.ConcurrentHashMap<java.lang.String, cn.everphoto.core.cvinfo.cache.j>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ConcurrentHashMap<String, C0771j> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ConcurrentHashMap<String, C0771j> concurrentHashMap = new ConcurrentHashMap<>();
        AbstractC116349Vr5 LIZIZ = this.this$0.LIZ.LIZIZ();
        Intrinsics.checkExpressionValueIsNotNull(LIZIZ, "");
        List<C0771j> LIZ = LIZIZ.LIZ();
        if (LIZ != null) {
            for (C0771j c0771j : LIZ) {
                String str = c0771j.LIZ;
                Intrinsics.checkExpressionValueIsNotNull(str, "");
                concurrentHashMap.put(str, c0771j);
            }
        }
        return concurrentHashMap;
    }
}
