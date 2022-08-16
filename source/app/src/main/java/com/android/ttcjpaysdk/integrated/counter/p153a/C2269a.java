package com.android.ttcjpaysdk.integrated.counter.p153a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.ttcjpaysdk.integrated.counter.data.PaymentMethodInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC137299cf1;
import p003X.AbstractC137329cfV;
import p003X.AbstractC137337cfd;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C137167cct;
import p003X.C137249ceD;
import p003X.C137382cgM;

/* renamed from: com.android.ttcjpaysdk.integrated.counter.a.a */
/* loaded from: classes17.dex */
public final class C2269a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static ChangeQuickRedirect LIZ;
    public static volatile boolean LJII;
    public static boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIIJ;
    public static final C137382cgM LJIIJJI = new C137382cgM((byte) 0);
    public AbstractC2270c LIZIZ;
    public AbstractC137329cfV LIZJ;
    public AbstractC137299cf1 LIZLLL;

    /* renamed from: LJ */
    public AbstractC137337cfd f25497LJ;
    public final Context LJFF;
    public int LJI;
    public final LayoutInflater LJIIL;
    public final int LJIILIIL;

    static {
        Covode.recordClassIndex(7498);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        LJII = false;
        notifyDataSetChanged();
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        LJIIIIZZ = false;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC2270c abstractC2270c = this.LIZIZ;
        if (abstractC2270c == null) {
            return 0;
        }
        return abstractC2270c.LIZ();
    }

    public final void LIZ(ArrayList<PaymentMethodInfo> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(arrayList);
        AbstractC2270c abstractC2270c = this.LIZIZ;
        if (abstractC2270c != null && !PatchProxy.proxy(new Object[]{arrayList}, abstractC2270c, AbstractC2270c.LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(arrayList);
            abstractC2270c.LIZIZ.clear();
            abstractC2270c.LIZIZ.addAll(arrayList);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC2270c abstractC2270c = this.LIZIZ;
        if (abstractC2270c == null) {
            return 0;
        }
        return abstractC2270c.LIZ(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.proxy(new Object[]{viewHolder, Integer.valueOf(i)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(viewHolder);
        AbstractC2270c abstractC2270c = this.LIZIZ;
        if (abstractC2270c != null) {
            abstractC2270c.LIZ(viewHolder, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewGroup, Integer.valueOf(i)}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (RecyclerView.ViewHolder) proxy.result;
        }
        C106862S5w.LIZ(viewGroup);
        AbstractC2270c abstractC2270c = this.LIZIZ;
        if (abstractC2270c != null) {
            viewHolder = abstractC2270c.LIZ(viewGroup, i);
        } else {
            viewHolder = null;
        }
        if (viewHolder instanceof C137249ceD) {
            C137249ceD c137249ceD = (C137249ceD) viewHolder;
            c137249ceD.LJIIIIZZ = this.LIZJ;
            c137249ceD.LJIIIZ = this.LIZLLL;
            c137249ceD.LJIIJJI = this.f25497LJ;
        }
        if (viewHolder == null) {
            View LIZ2 = C116971W2r.LIZ(this.LJIIL, 2131690669, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            return new C137167cct(LIZ2);
        }
        return viewHolder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (r0 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2269a(android.content.Context r10, int r11, int r12) {
        /*
            r9 = this;
            r9.<init>()
            r9.LJFF = r10
            r9.LJIILIIL = r11
            r9.LJI = r12
            X.cdk r3 = p003X.C137367cg7.LIZ
            android.content.Context r1 = r9.LJFF
            int r7 = r9.LJIILIIL
            r8 = 2
            java.lang.Object[] r6 = new java.lang.Object[r8]
            r2 = 0
            r6[r2] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r5 = 1
            r6[r5] = r0
            com.bytedance.hotfix.base.ChangeQuickRedirect r4 = p003X.C137220cdk.LIZ
            r0 = 5
            com.bytedance.hotfix.PatchProxyResult r4 = com.bytedance.hotfix.PatchProxy.proxy(r6, r3, r4, r2, r0)
            boolean r0 = r4.isSupported
            if (r0 == 0) goto L42
            java.lang.Object r0 = r4.result
            com.android.ttcjpaysdk.integrated.counter.a.c r0 = (com.android.ttcjpaysdk.integrated.counter.p153a.AbstractC2270c) r0
        L2b:
            r9.LIZIZ = r0
            com.android.ttcjpaysdk.integrated.counter.a.c r1 = r9.LIZIZ
            if (r1 == 0) goto L35
            int r0 = r9.LJI
            r1.LIZJ = r0
        L35:
            com.android.ttcjpaysdk.integrated.counter.p153a.C2269a.LJIIIZ = r2
            com.android.ttcjpaysdk.integrated.counter.p153a.C2269a.LJIIJ = r2
            android.content.Context r0 = r9.LJFF
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r9.LJIIL = r0
            return
        L42:
            r0 = 0
            if (r7 == 0) goto L7d
            if (r7 == r5) goto L76
            if (r7 == r8) goto L6f
            r0 = 3
            if (r7 == r0) goto L68
            r0 = 4
            if (r7 == r0) goto L61
            r0 = 6
            if (r7 != r0) goto L5a
            java.lang.Class<com.android.ttcjpaysdk.base.service.ICJPayIntegratedDyPayService> r0 = com.android.ttcjpaysdk.base.service.ICJPayIntegratedDyPayService.class
            com.android.ttcjpaysdk.integrated.counter.a.c r0 = r3.LIZ(r1, r0)
        L58:
            if (r0 != 0) goto L2b
        L5a:
            java.lang.Class<com.android.ttcjpaysdk.base.service.ICJPayIntegratedNormalService> r0 = com.android.ttcjpaysdk.base.service.ICJPayIntegratedNormalService.class
            com.android.ttcjpaysdk.integrated.counter.a.c r0 = r3.LIZ(r1, r0)
            goto L2b
        L61:
            java.lang.Class<com.android.ttcjpaysdk.base.service.ICJPayIntegratedDyImService> r0 = com.android.ttcjpaysdk.base.service.ICJPayIntegratedDyImService.class
            com.android.ttcjpaysdk.integrated.counter.a.c r0 = r3.LIZ(r1, r0)
            goto L58
        L68:
            java.lang.Class<com.android.ttcjpaysdk.base.service.ICJPayIntegratedLiteService> r0 = com.android.ttcjpaysdk.base.service.ICJPayIntegratedLiteService.class
            com.android.ttcjpaysdk.integrated.counter.a.c r0 = r3.LIZ(r1, r0)
            goto L58
        L6f:
            java.lang.Class<com.android.ttcjpaysdk.base.service.ICJPayIntegratedGameService> r0 = com.android.ttcjpaysdk.base.service.ICJPayIntegratedGameService.class
            com.android.ttcjpaysdk.integrated.counter.a.c r0 = r3.LIZ(r1, r0)
            goto L58
        L76:
            java.lang.Class<com.android.ttcjpaysdk.base.service.ICJPayIntegratedFullScreenService> r0 = com.android.ttcjpaysdk.base.service.ICJPayIntegratedFullScreenService.class
            com.android.ttcjpaysdk.integrated.counter.a.c r0 = r3.LIZ(r1, r0)
            goto L58
        L7d:
            java.lang.Class<com.android.ttcjpaysdk.base.service.ICJPayIntegratedNormalService> r0 = com.android.ttcjpaysdk.base.service.ICJPayIntegratedNormalService.class
            com.android.ttcjpaysdk.integrated.counter.a.c r0 = r3.LIZ(r1, r0)
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.integrated.counter.p153a.C2269a.<init>(android.content.Context, int, int):void");
    }
}
