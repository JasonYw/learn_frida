package cn.everphoto.sdkcv.moment;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Scheduler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C106007Rof;

/* loaded from: classes9.dex */
public final class MomentApiImpl$mScheduler$2 extends Lambda implements Function0<Scheduler> {
    public static final MomentApiImpl$mScheduler$2 INSTANCE = new MomentApiImpl$mScheduler$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3686);
    }

    public MomentApiImpl$mScheduler$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [io.reactivex.Scheduler, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Scheduler mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return C106007Rof.LIZ();
    }
}
