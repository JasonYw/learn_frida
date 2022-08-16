package cn.ever.cloud.android.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC521586jA;
import p003X.C106862S5w;
import p003X.C521666jI;

/* loaded from: classes23.dex */
public final class RuntimeExtManager {
    public static final C521666jI Companion = new C521666jI((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC521586jA extDepend;

    static {
        Covode.recordClassIndex(2956);
    }

    public RuntimeExtManager(AbstractC521586jA abstractC521586jA) {
        C106862S5w.LIZ(abstractC521586jA);
        this.extDepend = abstractC521586jA;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:6|(2:8|(6:10|11|12|(1:(2:15|16)(2:23|24))(3:25|26|(1:28))|17|(2:19|20)(1:21)))|31|11|12|(0)(0)|17|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
        cn.ever.cloud.utils.LogHelper.INSTANCE.m20554e("RuntimeExtManager", p002O.C0002O.m25086C("get thumbnail info occur error, ", r0.getMessage()));
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getPreviewBase64(java.lang.String r9, int r10, kotlin.coroutines.Continuation<? super java.lang.String> r11) {
        /*
            r8 = this;
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            r2[r1] = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r7 = 1
            r2[r7] = r0
            r4 = 2
            r2[r4] = r11
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = cn.ever.cloud.android.runtime.RuntimeExtManager.changeQuickRedirect
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r8, r0, r1, r7)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r1.result
            return r0
        L1d:
            boolean r0 = r11 instanceof cn.ever.cloud.android.runtime.RuntimeExtManager$getPreviewBase64$1
            if (r0 == 0) goto L44
            r2 = r11
            cn.ever.cloud.android.runtime.RuntimeExtManager$getPreviewBase64$1 r2 = (cn.ever.cloud.android.runtime.RuntimeExtManager$getPreviewBase64$1) r2
            int r0 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L44
            int r0 = r2.label
            int r0 = r0 - r1
            r2.label = r0
        L30:
            java.lang.Object r6 = r2.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r2.label
            r3 = 0
            java.lang.String r5 = "RuntimeExtManager"
            if (r0 == 0) goto L52
            if (r0 != r7) goto L4a
            java.lang.Object r9 = r2.L$0
            java.lang.String r9 = (java.lang.String) r9
            goto L62
        L44:
            cn.ever.cloud.android.runtime.RuntimeExtManager$getPreviewBase64$1 r2 = new cn.ever.cloud.android.runtime.RuntimeExtManager$getPreviewBase64$1
            r2.<init>(r8, r11)
            goto L30
        L4a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L52:
            kotlin.ResultKt.throwOnFailure(r6)
            X.6jA r0 = r8.extDepend     // Catch: java.lang.Throwable -> L68
            r2.L$0 = r9     // Catch: java.lang.Throwable -> L68
            r2.label = r7     // Catch: java.lang.Throwable -> L68
            java.lang.Object r6 = r0.getThumbnailInfo(r9, r10, r2)     // Catch: java.lang.Throwable -> L68
            if (r6 != r1) goto L65
            return r1
        L62:
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L68
        L65:
            cn.ever.cloud.android.entity.ThumbnailInfo r6 = (cn.ever.cloud.android.entity.ThumbnailInfo) r6     // Catch: java.lang.Throwable -> L68
            goto L79
        L68:
            r0 = move-exception
            cn.ever.cloud.utils.LogHelper r2 = cn.ever.cloud.utils.LogHelper.INSTANCE
            java.lang.String r1 = "get thumbnail info occur error, "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = p002O.C0002O.m25086C(r1, r0)
            r2.m20554e(r5, r0)
            r6 = r3
        L79:
            if (r6 == 0) goto L99
            cn.ever.cloud.utils.LogHelper r3 = cn.ever.cloud.utils.LogHelper.INSTANCE
            java.lang.String r2 = "get thumbnail info, path: "
            java.lang.String r1 = ", resolution: "
            java.lang.String r0 = r6.getResolution()
            java.lang.String r0 = p002O.C0002O.m25084C(r2, r9, r1, r0)
            r3.m20553i(r5, r0)
            java.nio.ByteBuffer r0 = r6.getThumbnail()
            byte[] r0 = r0.array()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r4)
            return r0
        L99:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.runtime.RuntimeExtManager.getPreviewBase64(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
