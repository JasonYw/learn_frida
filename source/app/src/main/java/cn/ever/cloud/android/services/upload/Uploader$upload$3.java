package cn.ever.cloud.android.services.upload;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.android.services.upload.Uploader$upload$3", m135f = "Uploader.kt", m134i = {1, 1, 1, 2}, m133l = {82, 119, 141, 144}, m132m = "invokeSuspend", m131n = {"uploadState", "uploadedSize", "chunkSplit", "completeExtra"}, m130s = {"L$0", "L$1", "L$3", "L$0"})
/* loaded from: classes23.dex */
public final class Uploader$upload$3 extends SuspendLambda implements Function1<Continuation<? super Long>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ UploadSandboxEnv $env;
    public final /* synthetic */ UploadMedia $media;
    public final /* synthetic */ Function1 $progressFn;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ Uploader this$0;

    static {
        Covode.recordClassIndex(3160);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uploader$upload$3(Uploader uploader, UploadSandboxEnv uploadSandboxEnv, Function1 function1, UploadMedia uploadMedia, Continuation continuation) {
        super(1, continuation);
        this.this$0 = uploader;
        this.$env = uploadSandboxEnv;
        this.$progressFn = function1;
        this.$media = uploadMedia;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        return new Uploader$upload$3(this.this$0, this.$env, this.$progressFn, this.$media, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Long> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? proxy.result : ((BaseContinuationImpl) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0314 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0188  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x016a -> B:30:0x0182). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0202 -> B:29:0x021c). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.upload.Uploader$upload$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
