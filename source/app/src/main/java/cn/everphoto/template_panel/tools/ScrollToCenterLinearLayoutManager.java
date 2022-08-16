package cn.everphoto.template_panel.tools;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.TPL;

/* loaded from: classes4.dex */
public final class ScrollToCenterLinearLayoutManager extends LinearLayoutManager {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(3815);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollToCenterLinearLayoutManager(Context context, int i, boolean z) {
        super(context, 0, false);
        C106862S5w.LIZ(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        Context context;
        if (PatchProxy.proxy(new Object[]{recyclerView, state, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        if (recyclerView != null) {
            context = recyclerView.getContext();
        } else {
            context = null;
        }
        TPL tpl = new TPL(recyclerView, context);
        tpl.setTargetPosition(i);
        startSmoothScroll(tpl);
    }
}
