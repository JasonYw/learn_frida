package cn.ever.cloud.android.exception;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes23.dex */
public final class BizExceptionKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(2882);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object checkException(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super T> r6) {
        /*
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = 0
            r2[r0] = r5
            r4 = 1
            r2[r4] = r6
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = cn.ever.cloud.android.exception.BizExceptionKt.changeQuickRedirect
            r0 = 0
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r0, r1, r4, r4)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L17
            java.lang.Object r0 = r1.result
            return r0
        L17:
            boolean r0 = r6 instanceof cn.ever.cloud.android.exception.BizExceptionKt$checkException$1
            if (r0 == 0) goto L37
            r3 = r6
            cn.ever.cloud.android.exception.BizExceptionKt$checkException$1 r3 = (cn.ever.cloud.android.exception.BizExceptionKt$checkException$1) r3
            int r0 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L37
            int r0 = r3.label
            int r0 = r0 - r1
            r3.label = r0
        L2a:
            java.lang.Object r2 = r3.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.label
            if (r0 == 0) goto L49
            if (r0 != r4) goto L41
            goto L3d
        L37:
            cn.ever.cloud.android.exception.BizExceptionKt$checkException$1 r3 = new cn.ever.cloud.android.exception.BizExceptionKt$checkException$1
            r3.<init>(r6)
            goto L2a
        L3d:
            kotlin.ResultKt.throwOnFailure(r2)     // Catch: java.lang.Throwable -> L56
            return r2
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L49:
            kotlin.ResultKt.throwOnFailure(r2)
            r3.label = r4     // Catch: java.lang.Throwable -> L56
            java.lang.Object r2 = r5.invoke(r3)     // Catch: java.lang.Throwable -> L56
            if (r2 != r1) goto L55
            return r1
        L55:
            return r2
        L56:
            r4 = move-exception
            cn.ever.cloud.android.exception.BizException r3 = new cn.ever.cloud.android.exception.BizException
            cn.ever.cloud.utils.error.ErrorCode r0 = cn.ever.cloud.utils.error.ErrorCode.CLIENT_OTHER
            int r2 = r0.getCode()
            java.lang.String r0 = r4.getMessage()
            java.lang.String r1 = cn.ever.cloud.utils.KotlinExtKt.getOrDefault(r0)
            java.lang.Throwable r0 = r4.getCause()
            r3.<init>(r2, r1, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.exception.BizExceptionKt.checkException(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
