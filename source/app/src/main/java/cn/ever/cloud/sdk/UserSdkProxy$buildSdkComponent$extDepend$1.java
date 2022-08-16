package cn.ever.cloud.sdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC521586jA;

/* loaded from: classes23.dex */
public final class UserSdkProxy$buildSdkComponent$extDepend$1 implements AbstractC521586jA {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ UserSdkProxy this$0;

    static {
        Covode.recordClassIndex(3312);
    }

    public UserSdkProxy$buildSdkComponent$extDepend$1(UserSdkProxy userSdkProxy) {
        this.this$0 = userSdkProxy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
        if (r10 != 4) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // p003X.AbstractC521586jA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getThumbnailInfo(java.lang.String r9, int r10, kotlin.coroutines.Continuation<? super cn.ever.cloud.android.entity.ThumbnailInfo> r11) {
        /*
            r8 = this;
            r7 = 3
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r6 = 0
            r1[r6] = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r5 = 1
            r1[r5] = r0
            r4 = 2
            r1[r4] = r11
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = cn.ever.cloud.sdk.UserSdkProxy$buildSdkComponent$extDepend$1.changeQuickRedirect
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r8, r0, r6, r5)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r1.result
            return r0
        L1d:
            boolean r0 = r11 instanceof cn.ever.cloud.sdk.UserSdkProxy$buildSdkComponent$extDepend$1$getThumbnailInfo$1
            if (r0 == 0) goto L6b
            r3 = r11
            cn.ever.cloud.sdk.UserSdkProxy$buildSdkComponent$extDepend$1$getThumbnailInfo$1 r3 = (cn.ever.cloud.sdk.UserSdkProxy$buildSdkComponent$extDepend$1$getThumbnailInfo$1) r3
            int r0 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L6b
            int r0 = r3.label
            int r0 = r0 - r1
            r3.label = r0
        L30:
            java.lang.Object r1 = r3.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.label
            if (r0 == 0) goto L48
            if (r0 != r5) goto L71
            kotlin.ResultKt.throwOnFailure(r1)
        L3f:
            cn.ever.cloud.sdk.entity.EcThumbnailInfo r1 = (cn.ever.cloud.sdk.entity.EcThumbnailInfo) r1
            if (r1 == 0) goto L79
            cn.ever.cloud.android.entity.ThumbnailInfo r0 = cn.ever.cloud.sdk.mapper.MapperKt.toThumbnailInfo(r1)
            return r0
        L48:
            kotlin.ResultKt.throwOnFailure(r1)
            cn.ever.cloud.sdk.UserSdkProxy r0 = r8.this$0
            cn.ever.cloud.sdk.DependConfig r0 = r0.dependConfig
            X.6j9 r1 = r0.getExtDelegate()
            if (r10 == r5) goto L69
            if (r10 == r4) goto L67
            if (r10 == r7) goto L69
            r0 = 4
            if (r10 == r0) goto L69
        L5c:
            if (r1 == 0) goto L79
            r3.label = r5
            java.lang.Object r1 = r1.LIZ(r9, r6, r3)
            if (r1 != r2) goto L3f
            return r2
        L67:
            r6 = 2
            goto L5c
        L69:
            r6 = 1
            goto L5c
        L6b:
            cn.ever.cloud.sdk.UserSdkProxy$buildSdkComponent$extDepend$1$getThumbnailInfo$1 r3 = new cn.ever.cloud.sdk.UserSdkProxy$buildSdkComponent$extDepend$1$getThumbnailInfo$1
            r3.<init>(r8, r11)
            goto L30
        L71:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L79:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.sdk.UserSdkProxy$buildSdkComponent$extDepend$1.getThumbnailInfo(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
