package cn.everphoto.sdkcv.dicomponent;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C116971W2r;

/* loaded from: classes8.dex */
public final class CvMgrImpl$mScheduler$2 extends Lambda implements Function0<Scheduler> {
    public static final CvMgrImpl$mScheduler$2 INSTANCE = new CvMgrImpl$mScheduler$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3676);
    }

    public CvMgrImpl$mScheduler$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [io.reactivex.Scheduler, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Scheduler mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return Schedulers.from(C116971W2r.LIZIZ(1));
    }
}
