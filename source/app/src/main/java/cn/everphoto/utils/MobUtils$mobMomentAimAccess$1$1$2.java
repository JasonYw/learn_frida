package cn.everphoto.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ttve.model.refactor.algorithm.VEModelAiMomentInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes13.dex */
public final class MobUtils$mobMomentAimAccess$1$1$2 extends Lambda implements Function1<VEModelAiMomentInfo, String> {
    public static final MobUtils$mobMomentAimAccess$1$1$2 INSTANCE = new MobUtils$mobMomentAimAccess$1$1$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3857);
    }

    public MobUtils$mobMomentAimAccess$1$1$2() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ String invoke(VEModelAiMomentInfo vEModelAiMomentInfo) {
        VEModelAiMomentInfo vEModelAiMomentInfo2 = vEModelAiMomentInfo;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{vEModelAiMomentInfo2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return String.valueOf(vEModelAiMomentInfo2.moment_source);
    }
}
