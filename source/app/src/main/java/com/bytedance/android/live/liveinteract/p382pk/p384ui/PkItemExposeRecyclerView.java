package com.bytedance.android.live.liveinteract.p382pk.p384ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashSet;
import p003X.C106862S5w;
import p003X.C81302I2u;

/* renamed from: com.bytedance.android.live.liveinteract.pk.ui.PkItemExposeRecyclerView */
/* loaded from: classes3.dex */
public class PkItemExposeRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect LIZIZ;
    public String LIZ = "";
    public final HashSet<String> LIZJ = new HashSet<>();

    static {
        Covode.recordClassIndex(29091);
    }

    public final String getInviteIconPanelType() {
        return this.LIZ;
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 6).isSupported) {
            return;
        }
        this.LIZJ.clear();
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 3).isSupported || !LIZ(this, null, 1, null)) {
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                RecyclerView.ViewHolder childViewHolder = getChildViewHolder(childAt);
                if (LIZ(childAt) && (childViewHolder instanceof AbstractC4756a)) {
                    LIZ((AbstractC4756a) childViewHolder);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter<?> adapter) {
        if (PatchProxy.proxy(new Object[]{adapter}, this, LIZIZ, false, 2).isSupported) {
            return;
        }
        super.setAdapter(adapter);
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new C81302I2u(this));
        }
    }

    public final void setInviteIconPanelType(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LIZ = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkItemExposeRecyclerView(Context context) {
        super(context);
        C106862S5w.LIZ(context);
        getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.android.live.liveinteract.pk.ui.PkItemExposeRecyclerView.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(29092);
            }

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                PkItemExposeRecyclerView.this.LIZ();
            }
        });
        addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.bytedance.android.live.liveinteract.pk.ui.PkItemExposeRecyclerView.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(29093);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (PatchProxy.proxy(new Object[]{recyclerView, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                C106862S5w.LIZ(recyclerView);
                if (i == 0 || i == 1 || i == 2) {
                    PkItemExposeRecyclerView.this.LIZ();
                }
            }
        });
    }

    private final void LIZ(AbstractC4756a abstractC4756a) {
        if (!PatchProxy.proxy(new Object[]{abstractC4756a}, this, LIZIZ, false, 5).isSupported && !this.LIZJ.contains(abstractC4756a.LIZ())) {
            abstractC4756a.LIZ(this.LIZ);
            this.LIZJ.add(abstractC4756a.LIZ());
        }
    }

    private final boolean LIZ(Rect rect) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{rect}, this, LIZIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (isShown() && getGlobalVisibleRect(rect)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean LIZ(android.view.View r7) {
        /*
            r6 = this;
            r5 = 1
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r4 = 0
            r2[r4] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.p382pk.p384ui.PkItemExposeRecyclerView.LIZIZ
            r0 = 4
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r6, r1, r4, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1a:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r6.mo25799getLayoutManager()
            boolean r0 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 != 0) goto L23
            r1 = 0
        L23:
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            if (r1 == 0) goto L62
            int r3 = r1.getOrientation()
        L2b:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            boolean r0 = r7.isShown()
            if (r0 == 0) goto L65
            boolean r0 = r7.getGlobalVisibleRect(r1)
            if (r0 == 0) goto L65
            if (r3 != r5) goto L4b
            int r1 = r1.height()
            int r0 = r7.getMeasuredHeight()
            int r0 = r0 / 2
            if (r1 <= r0) goto L64
        L4a:
            return r5
        L4b:
            r2 = 0
            if (r3 != 0) goto L60
            int r1 = r1.width()
            int r0 = r7.getMeasuredWidth()
            int r0 = r0 / 2
            if (r1 <= r0) goto L60
            r0 = 1
        L5b:
            if (r2 != 0) goto L4a
            if (r0 == 0) goto L64
            return r5
        L60:
            r0 = 0
            goto L5b
        L62:
            r3 = -1
            goto L2b
        L64:
            return r4
        L65:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.p382pk.p384ui.PkItemExposeRecyclerView.LIZ(android.view.View):boolean");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkItemExposeRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106862S5w.LIZ(context);
        getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.android.live.liveinteract.pk.ui.PkItemExposeRecyclerView.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(29092);
            }

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                PkItemExposeRecyclerView.this.LIZ();
            }
        });
        addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.bytedance.android.live.liveinteract.pk.ui.PkItemExposeRecyclerView.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(29093);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (PatchProxy.proxy(new Object[]{recyclerView, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                C106862S5w.LIZ(recyclerView);
                if (i == 0 || i == 1 || i == 2) {
                    PkItemExposeRecyclerView.this.LIZ();
                }
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkItemExposeRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.android.live.liveinteract.pk.ui.PkItemExposeRecyclerView.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(29092);
            }

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                PkItemExposeRecyclerView.this.LIZ();
            }
        });
        addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.bytedance.android.live.liveinteract.pk.ui.PkItemExposeRecyclerView.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(29093);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                if (PatchProxy.proxy(new Object[]{recyclerView, Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                C106862S5w.LIZ(recyclerView);
                if (i2 == 0 || i2 == 1 || i2 == 2) {
                    PkItemExposeRecyclerView.this.LIZ();
                }
            }
        });
    }

    public static /* synthetic */ boolean LIZ(PkItemExposeRecyclerView pkItemExposeRecyclerView, Rect rect, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pkItemExposeRecyclerView, null, 1, null}, null, LIZIZ, true, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return pkItemExposeRecyclerView.LIZ(new Rect());
    }
}
