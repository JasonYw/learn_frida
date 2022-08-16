package cn.ever.cloud.android.services.upload;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class UploadGuard {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: m */
    public final Mutex f21061m = MutexKt.Mutex$default(false, 1, null);
    public final List<Pair<Object, ReferencedMutex>> innerMutexes = new ArrayList();

    static {
        Covode.recordClassIndex(3136);
    }

    /* loaded from: classes23.dex */
    public static final class ReferencedMutex {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final Mutex inner;
        public final AtomicInteger innerRefCount = new AtomicInteger(0);

        static {
            Covode.recordClassIndex(3137);
        }

        public final void acquireAdd() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported) {
                return;
            }
            this.innerRefCount.getAndAdd(1);
        }

        public final int getRef() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return ((Integer) proxy.result).intValue();
            }
            return this.innerRefCount.get();
        }

        public final void releaseSubtract() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported) {
                return;
            }
            this.innerRefCount.getAndAdd(-1);
        }

        public final void unlock() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5).isSupported) {
                return;
            }
            Mutex.DefaultImpls.unlock$default(this.inner, null, 1, null);
        }

        public ReferencedMutex(Mutex mutex) {
            C106862S5w.LIZ(mutex);
            this.inner = mutex;
        }

        public final Object lock(Continuation<? super Unit> continuation) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 4);
            if (proxy.isSupported) {
                return proxy.result;
            }
            Object lock$default = Mutex.DefaultImpls.lock$default(this.inner, null, continuation, 1, null);
            if (lock$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return lock$default;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:6|(2:8|(19:10|11|(1:(1:(1:(1:(1:(5:18|19|(1:21)|22|23)(2:24|25))(5:26|27|(1:29)|30|31))(10:32|33|34|35|36|(1:38)|27|(0)|30|31))(10:44|45|46|(1:48)|36|(0)|27|(0)|30|31))(1:51))(2:69|(1:71))|52|(2:53|(2:55|(1:57))(2:67|68))|58|(1:60)(1:66)|(1:62)|63|(1:65)|45|46|(0)|36|(0)|27|(0)|30|31))|72|11|(0)(0)|52|(3:53|(0)(0)|56)|58|(0)(0)|(0)|63|(0)|45|46|(0)|36|(0)|27|(0)|30|31) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0141, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012b, code lost:
        r8 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0141 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0153 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0095  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object runInGuard(java.lang.Object r14, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r15, kotlin.coroutines.Continuation<? super T> r16) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.upload.UploadGuard.runInGuard(java.lang.Object, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
