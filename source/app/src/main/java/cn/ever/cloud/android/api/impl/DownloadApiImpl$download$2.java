package cn.ever.cloud.android.api.impl;

import cn.ever.cloud.android.entity.TaskReq;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.android.api.impl.DownloadApiImpl$download$2", m135f = "DownloadApiImpl.kt", m134i = {0}, m133l = {87}, m132m = "invokeSuspend", m131n = {"idsNotAddedToDownload"}, m130s = {"L$0"})
/* loaded from: classes23.dex */
public final class DownloadApiImpl$download$2 extends SuspendLambda implements Function1<Continuation<? super Pair<? extends String, ? extends List<String>>>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ TaskReq $downloadReq;
    public Object L$0;
    public int label;
    public final /* synthetic */ DownloadApiImpl this$0;

    static {
        Covode.recordClassIndex(2784);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadApiImpl$download$2(DownloadApiImpl downloadApiImpl, TaskReq taskReq, Continuation continuation) {
        super(1, continuation);
        this.this$0 = downloadApiImpl;
        this.$downloadReq = taskReq;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        return new DownloadApiImpl$download$2(this.this$0, this.$downloadReq, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Pair<? extends String, ? extends List<String>>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? proxy.result : ((BaseContinuationImpl) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x014b, code lost:
        if (r11 == null) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ff A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.api.impl.DownloadApiImpl$download$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
