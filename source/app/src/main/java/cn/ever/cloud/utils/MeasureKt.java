package cn.ever.cloud.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes23.dex */
public final class MeasureKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3433);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:6|(2:8|(7:10|11|(1:(1:14)(2:21|22))(2:23|(1:25))|15|16|17|18))|26|11|(0)(0)|15|16|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
        r1 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object measureTimeForMonitor(java.lang.String r5, java.lang.String r6, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r7, kotlin.jvm.functions.Function1<? super cn.ever.cloud.utils.MeasureReport, kotlin.Unit> r8, kotlin.coroutines.Continuation<? super T> r9) {
        /*
            r0 = 5
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = 0
            r2[r0] = r5
            r4 = 1
            r2[r4] = r6
            r0 = 2
            r2[r0] = r7
            r0 = 3
            r2[r0] = r8
            r0 = 4
            r2[r0] = r9
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = cn.ever.cloud.utils.MeasureKt.changeQuickRedirect
            r0 = 0
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r0, r1, r4, r4)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L20
            java.lang.Object r0 = r1.result
            return r0
        L20:
            boolean r0 = r9 instanceof cn.ever.cloud.utils.MeasureKt$measureTimeForMonitor$1
            if (r0 == 0) goto L4f
            r2 = r9
            cn.ever.cloud.utils.MeasureKt$measureTimeForMonitor$1 r2 = (cn.ever.cloud.utils.MeasureKt$measureTimeForMonitor$1) r2
            int r0 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L4f
            int r0 = r2.label
            int r0 = r0 - r1
            r2.label = r0
        L33:
            java.lang.Object r3 = r2.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r2.label
            if (r0 == 0) goto L5d
            if (r0 != r4) goto L55
            java.lang.Object r8 = r2.L$2
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            java.lang.Object r6 = r2.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r2.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.ResultKt.throwOnFailure(r3)
            goto L74
        L4f:
            cn.ever.cloud.utils.MeasureKt$measureTimeForMonitor$1 r2 = new cn.ever.cloud.utils.MeasureKt$measureTimeForMonitor$1
            r2.<init>(r9)
            goto L33
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L5d:
            kotlin.ResultKt.throwOnFailure(r3)
            cn.ever.cloud.utils.monitor.MonitorKit r0 = cn.ever.cloud.utils.monitor.MonitorKit.INSTANCE
            r0.serviceStart(r5, r6)
            r2.L$0 = r5
            r2.L$1 = r6
            r2.L$2 = r8
            r2.label = r4
            java.lang.Object r3 = r7.invoke(r2)
            if (r3 != r1) goto L74
            return r1
        L74:
            cn.ever.cloud.utils.monitor.MonitorKit r0 = cn.ever.cloud.utils.monitor.MonitorKit.INSTANCE     // Catch: java.lang.Exception -> L7b
            long r1 = r0.serviceEndAndGetDuration(r5, r6)     // Catch: java.lang.Exception -> L7b
            goto L7d
        L7b:
            r1 = -1
        L7d:
            cn.ever.cloud.utils.MeasureReport r0 = new cn.ever.cloud.utils.MeasureReport
            r0.<init>(r1)
            r8.invoke(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.utils.MeasureKt.measureTimeForMonitor(java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object measureTimeForMonitor$default(String str, String str2, Function1 function1, Function1 function12, Continuation continuation, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, function1, function12, continuation, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return measureTimeForMonitor(str, str2, function1, function12, continuation);
    }
}
