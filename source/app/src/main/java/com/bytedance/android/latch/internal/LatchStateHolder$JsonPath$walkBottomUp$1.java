package com.bytedance.android.latch.internal;

import com.bytedance.android.latch.internal.C2763c;
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

@DebugMetadata(m136c = "com.bytedance.android.latch.internal.LatchStateHolder$JsonPath$walkBottomUp$1", m135f = "LatchStateHolder.kt", m134i = {0, 0}, m133l = {129}, m132m = "invokeSuspend", m131n = {"$this$sequence", "current"}, m130s = {"L$0", "L$1"})
/* loaded from: classes28.dex */
public final class LatchStateHolder$JsonPath$walkBottomUp$1 extends RestrictedSuspendLambda implements Function2<AbstractC520516hR<? super C2763c.C2764a>, Continuation<? super Unit>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Object L$0;
    public Object L$1;
    public int label;

    /* renamed from: p$ */
    public AbstractC520516hR f25719p$;
    public final /* synthetic */ C2763c.C2764a this$0;

    static {
        Covode.recordClassIndex(13710);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LatchStateHolder$JsonPath$walkBottomUp$1(C2763c.C2764a c2764a, Continuation continuation) {
        super(2, continuation);
        this.this$0 = c2764a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        LatchStateHolder$JsonPath$walkBottomUp$1 latchStateHolder$JsonPath$walkBottomUp$1 = new LatchStateHolder$JsonPath$walkBottomUp$1(this.this$0, continuation);
        latchStateHolder$JsonPath$walkBottomUp$1.f25719p$ = (AbstractC520516hR) obj;
        return latchStateHolder$JsonPath$walkBottomUp$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC520516hR<? super C2763c.C2764a> abstractC520516hR, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC520516hR, continuation}, this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? proxy.result : ((BaseContinuationImpl) create(abstractC520516hR, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0042 -> B:10:0x0029). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            r5 = 1
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r1 = 0
            r2[r1] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.latch.internal.LatchStateHolder$JsonPath$walkBottomUp$1.changeQuickRedirect
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r6, r0, r1, r5)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L13
            java.lang.Object r0 = r1.result
            return r0
        L13:
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            if (r0 == 0) goto L45
            if (r0 != r5) goto L51
            java.lang.Object r3 = r6.L$1
            com.bytedance.android.latch.internal.c$a r3 = (com.bytedance.android.latch.internal.C2763c.C2764a) r3
            java.lang.Object r2 = r6.L$0
            X.6hR r2 = (p003X.AbstractC520516hR) r2
            kotlin.ResultKt.throwOnFailure(r7)
            r1 = r6
        L29:
            com.bytedance.android.latch.internal.c$a r3 = r3.LIZJ
        L2b:
            if (r3 == 0) goto L4e
            com.bytedance.android.latch.internal.c$a r0 = p003X.FCU.LIZ()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            r0 = r0 ^ r5
            if (r0 == 0) goto L4e
            r1.L$0 = r2
            r1.L$1 = r3
            r1.label = r5
            java.lang.Object r0 = r2.LIZ(r3, r1)
            if (r0 != r4) goto L29
            return r4
        L45:
            kotlin.ResultKt.throwOnFailure(r7)
            X.6hR r2 = r6.f25719p$
            com.bytedance.android.latch.internal.c$a r3 = r6.this$0
            r1 = r6
            goto L2b
        L4e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L51:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.latch.internal.LatchStateHolder$JsonPath$walkBottomUp$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
