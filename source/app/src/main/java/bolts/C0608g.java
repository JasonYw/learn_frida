package bolts;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: bolts.g */
/* loaded from: classes18.dex */
public class C0608g<TResult> {
    public static ChangeQuickRedirect LIZ;
    public final Task<TResult> LIZIZ = new Task<>();

    static {
        Covode.recordClassIndex(2514);
    }

    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return this.LIZIZ.trySetCancelled();
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported || LIZ()) {
            return;
        }
        throw new IllegalStateException("Cannot cancel a completed task.");
    }

    public final boolean LIZ(Exception exc) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{exc}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return this.LIZIZ.trySetError(exc);
    }

    public final void LIZIZ(Exception exc) {
        if (PatchProxy.proxy(new Object[]{exc}, this, LIZ, false, 6).isSupported || LIZ(exc)) {
            return;
        }
        throw new IllegalStateException("Cannot set the error on a completed task.");
    }

    public final boolean LIZ(TResult tresult) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{tresult}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return this.LIZIZ.trySetResult(tresult);
    }

    public final void LIZIZ(TResult tresult) {
        if (PatchProxy.proxy(new Object[]{tresult}, this, LIZ, false, 5).isSupported || LIZ((C0608g<TResult>) tresult)) {
            return;
        }
        throw new IllegalStateException("Cannot set the result of a completed task.");
    }
}
