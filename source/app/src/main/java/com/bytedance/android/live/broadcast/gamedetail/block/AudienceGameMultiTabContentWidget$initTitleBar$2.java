package com.bytedance.android.live.broadcast.gamedetail.block;

import com.bytedance.android.live.broadcast.gamedetail.block.reducer.C3070b;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.C3086g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class AudienceGameMultiTabContentWidget$initTitleBar$2 extends Lambda implements Function2<C3070b, C3086g, C3086g> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AudienceGameMultiTabContentWidget this$0;

    static {
        Covode.recordClassIndex(16162);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceGameMultiTabContentWidget$initTitleBar$2(AudienceGameMultiTabContentWidget audienceGameMultiTabContentWidget) {
        super(2);
        this.this$0 = audienceGameMultiTabContentWidget;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r1 != 6) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.bytedance.android.live.broadcast.gamedetail.block.widget.g, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.bytedance.android.live.broadcast.gamedetail.block.widget.C3086g invoke(com.bytedance.android.live.broadcast.gamedetail.block.reducer.C3070b r6, com.bytedance.android.live.broadcast.gamedetail.block.widget.C3086g r7) {
        /*
            r5 = this;
            com.bytedance.android.live.broadcast.gamedetail.block.reducer.b r6 = (com.bytedance.android.live.broadcast.gamedetail.block.reducer.C3070b) r6
            com.bytedance.android.live.broadcast.gamedetail.block.widget.g r7 = (com.bytedance.android.live.broadcast.gamedetail.block.widget.C3086g) r7
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r1 = 0
            r4[r1] = r6
            r2 = 1
            r4[r2] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.broadcast.gamedetail.block.AudienceGameMultiTabContentWidget$initTitleBar$2.changeQuickRedirect
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r4, r5, r0, r1, r2)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r1.result
            return r0
        L1a:
            p003X.C106862S5w.LIZ(r6)
            com.bytedance.android.live.broadcast.gamedetail.block.AudienceGameMultiTabContentWidget r1 = r5.this$0
            int r0 = r6.LIZLLL
            r1.LIZIZ = r0
            int r1 = r6.LIZLLL
            if (r1 == r2) goto L32
            if (r1 == r3) goto L42
            r0 = 3
            if (r1 == r0) goto L33
            r0 = 5
            if (r1 == r0) goto L33
            r0 = 6
            if (r1 == r0) goto L42
        L32:
            r3 = 0
        L33:
            com.bytedance.android.live.broadcast.gamedetail.block.widget.g r2 = new com.bytedance.android.live.broadcast.gamedetail.block.widget.g
            r1 = 0
            if (r7 == 0) goto L40
            com.bytedance.android.live.broadcast.gamedetailv2.data.b r0 = r7.LIZJ
            com.bytedance.android.live.broadcast.gamedetail.order.d r1 = r7.LIZLLL
        L3c:
            r2.<init>(r3, r0, r1)
            return r2
        L40:
            r0 = r1
            goto L3c
        L42:
            r3 = 1
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.gamedetail.block.AudienceGameMultiTabContentWidget$initTitleBar$2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
