package com.android.ttcjpaysdk.base.p135ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.C130805ay3;

/* renamed from: com.android.ttcjpaysdk.base.ui.widget.ExtendRecyclerView */
/* loaded from: classes16.dex */
public class ExtendRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect LIZ;
    public ArrayList<C2183a> LIZIZ = new ArrayList<>();
    public ArrayList<C2183a> LIZJ = new ArrayList<>();

    static {
        Covode.recordClassIndex(6690);
    }

    public int getFooterViewsCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return this.LIZJ.size();
    }

    public int getHeaderViewsCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return this.LIZIZ.size();
    }

    public RecyclerView.Adapter getRealAdapter() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 14);
        if (proxy.isSupported) {
            return (RecyclerView.Adapter) proxy.result;
        }
        return super.mo25798getAdapter();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: getAdapter */
    public RecyclerView.Adapter mo25798getAdapter() {
        RecyclerView.Adapter<RecyclerView.ViewHolder> adapter;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (RecyclerView.Adapter) proxy.result;
        }
        RecyclerView.Adapter mo25798getAdapter = super.mo25798getAdapter();
        if (C130805ay3.class.isInstance(mo25798getAdapter) && (adapter = ((C130805ay3) mo25798getAdapter).LIZIZ) != null) {
            return adapter;
        }
        return mo25798getAdapter;
    }

    /* renamed from: com.android.ttcjpaysdk.base.ui.widget.ExtendRecyclerView$a */
    /* loaded from: classes16.dex */
    public static class C2183a {
        public View LIZ;

        static {
            Covode.recordClassIndex(6691);
        }

        public C2183a(View view) {
            this.LIZ = view;
        }
    }

    public ExtendRecyclerView(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        if (PatchProxy.proxy(new Object[]{adapter}, this, LIZ, false, 12).isSupported) {
            return;
        }
        if ((this.LIZIZ.size() > 0 || this.LIZJ.size() > 0) && !C130805ay3.class.isInstance(adapter)) {
            adapter = new C130805ay3(this.LIZIZ, this.LIZJ, adapter);
        }
        super.setAdapter(adapter);
    }

    public final void LIZ(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 2).isSupported && !PatchProxy.proxy(new Object[]{view, null}, this, LIZ, false, 1).isSupported) {
            this.LIZIZ.add(new C2183a(view));
            RecyclerView.Adapter mo25798getAdapter = super.mo25798getAdapter();
            if (mo25798getAdapter != null) {
                if (!C130805ay3.class.isInstance(mo25798getAdapter)) {
                    setAdapter(mo25798getAdapter);
                }
                mo25798getAdapter.notifyDataSetChanged();
            }
        }
    }

    public final void LIZJ(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 7).isSupported && !PatchProxy.proxy(new Object[]{view, null}, this, LIZ, false, 6).isSupported) {
            this.LIZJ.add(new C2183a(view));
            RecyclerView.Adapter mo25798getAdapter = super.mo25798getAdapter();
            if (mo25798getAdapter != null) {
                if (!C130805ay3.class.isInstance(mo25798getAdapter)) {
                    setAdapter(mo25798getAdapter);
                }
                mo25798getAdapter.notifyDataSetChanged();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean LIZIZ(android.view.View r9) {
        /*
            r8 = this;
            r6 = 1
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r5 = 0
            r1[r5] = r9
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.android.ttcjpaysdk.base.p135ui.widget.ExtendRecyclerView.LIZ
            r2 = 4
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r8, r0, r5, r2)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1a:
            java.util.ArrayList<com.android.ttcjpaysdk.base.ui.widget.ExtendRecyclerView$a> r0 = r8.LIZIZ
            int r0 = r0.size()
            if (r0 <= 0) goto Lbb
            androidx.recyclerview.widget.RecyclerView$Adapter r4 = super.mo25798getAdapter()
            java.lang.Class<X.ay3> r0 = p003X.C130805ay3.class
            boolean r0 = r0.isInstance(r4)
            r3 = 2
            if (r0 == 0) goto L49
            X.ay3 r4 = (p003X.C130805ay3) r4
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r9
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = p003X.C130805ay3.LIZ
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r4, r0, r5, r2)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L74
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb9
        L49:
            r7 = 1
        L4a:
            java.util.ArrayList<com.android.ttcjpaysdk.base.ui.widget.ExtendRecyclerView$a> r4 = r8.LIZIZ
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r5] = r9
            r2[r6] = r4
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.android.ttcjpaysdk.base.p135ui.widget.ExtendRecyclerView.LIZ
            r0 = 5
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r8, r1, r5, r0)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L70
            int r1 = r4.size()
        L61:
            if (r5 >= r1) goto L70
            java.lang.Object r0 = r4.get(r5)
            com.android.ttcjpaysdk.base.ui.widget.ExtendRecyclerView$a r0 = (com.android.ttcjpaysdk.base.p135ui.widget.ExtendRecyclerView.C2183a) r0
            android.view.View r0 = r0.LIZ
            if (r0 != r9) goto L71
            r4.remove(r5)
        L70:
            return r7
        L71:
            int r5 = r5 + 1
            goto L61
        L74:
            java.util.List<com.android.ttcjpaysdk.base.ui.widget.ExtendRecyclerView$a> r0 = r4.LIZJ
            int r0 = r0.size()
            if (r0 <= 0) goto Lb9
            java.util.List<com.android.ttcjpaysdk.base.ui.widget.ExtendRecyclerView$a> r7 = r4.LIZJ
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r5] = r9
            r2[r6] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = p003X.C130805ay3.LIZ
            r0 = 6
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r4, r1, r5, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto La0
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb9
        L99:
            com.android.ttcjpaysdk.base.utils.CJPayBasicUtils.detachFromParent(r9)
            r4.notifyDataSetChanged()
            goto L49
        La0:
            int r2 = r7.size()
            r1 = 0
        La5:
            if (r1 >= r2) goto Lb9
            java.lang.Object r0 = r7.get(r1)
            com.android.ttcjpaysdk.base.ui.widget.ExtendRecyclerView$a r0 = (com.android.ttcjpaysdk.base.p135ui.widget.ExtendRecyclerView.C2183a) r0
            android.view.View r0 = r0.LIZ
            if (r0 != r9) goto Lb6
            r7.remove(r1)
            r0 = 1
            goto L99
        Lb6:
            int r1 = r1 + 1
            goto La5
        Lb9:
            r7 = 0
            goto L4a
        Lbb:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.base.p135ui.widget.ExtendRecyclerView.LIZIZ(android.view.View):boolean");
    }

    public ExtendRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExtendRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
