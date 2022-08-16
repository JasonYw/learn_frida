package com.bytedance.android.live.core.utils;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import p003X.AbstractC520516hR;
import p003X.C106862S5w;

@DebugMetadata(m136c = "com.bytedance.android.live.core.utils.UtilityKotlinExtentionsKt$children$1", m135f = "UtilityKotlinExtentions.kt", m134i = {0, 0}, m133l = {145}, m132m = "invokeSuspend", m131n = {"$this$sequence", "i"}, m130s = {"L$0", "I$0"})
/* loaded from: classes23.dex */
public final class UtilityKotlinExtentionsKt$children$1 extends RestrictedSuspendLambda implements Function2<AbstractC520516hR<? super View>, Continuation<? super Unit>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ViewGroup $this_children;
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public int label;

    static {
        Covode.recordClassIndex(23830);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilityKotlinExtentionsKt$children$1(ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.$this_children = viewGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        UtilityKotlinExtentionsKt$children$1 utilityKotlinExtentionsKt$children$1 = new UtilityKotlinExtentionsKt$children$1(this.$this_children, continuation);
        utilityKotlinExtentionsKt$children$1.L$0 = obj;
        return utilityKotlinExtentionsKt$children$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC520516hR<? super View> abstractC520516hR, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC520516hR, continuation}, this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? proxy.result : ((BaseContinuationImpl) create(abstractC520516hR, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0040 -> B:10:0x0029). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r1 = 0
            r2[r1] = r8
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.core.utils.UtilityKotlinExtentionsKt$children$1.changeQuickRedirect
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r7, r0, r1, r6)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L13
            java.lang.Object r0 = r1.result
            return r0
        L13:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r7.label
            if (r0 == 0) goto L43
            if (r0 != r6) goto L56
            int r0 = r7.I$1
            int r4 = r7.I$0
            java.lang.Object r1 = r7.L$0
            X.6hR r1 = (p003X.AbstractC520516hR) r1
            kotlin.ResultKt.throwOnFailure(r8)
            r3 = r7
        L29:
            int r4 = r4 + r6
        L2a:
            if (r4 >= r0) goto L53
            android.view.ViewGroup r2 = r3.$this_children
            android.view.View r2 = r2.getChildAt(r4)
            if (r2 == 0) goto L53
            r3.L$0 = r1
            r3.I$0 = r4
            r3.I$1 = r0
            r3.label = r6
            java.lang.Object r2 = r1.LIZ(r2, r3)
            if (r2 != r5) goto L29
            return r5
        L43:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r1 = r7.L$0
            X.6hR r1 = (p003X.AbstractC520516hR) r1
            android.view.ViewGroup r0 = r7.$this_children
            int r0 = r0.getChildCount()
            r4 = 0
            r3 = r7
            goto L2a
        L53:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.utils.UtilityKotlinExtentionsKt$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
