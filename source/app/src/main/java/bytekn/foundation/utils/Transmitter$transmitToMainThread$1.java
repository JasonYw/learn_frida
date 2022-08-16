package bytekn.foundation.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class Transmitter$transmitToMainThread$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Runnable $runnable;

    static {
        Covode.recordClassIndex(2656);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transmitter$transmitToMainThread$1(Runnable runnable) {
        super(0);
        this.$runnable = runnable;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.$runnable.run();
        }
        return Unit.INSTANCE;
    }
}
