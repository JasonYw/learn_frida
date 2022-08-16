package com.bytedance.android.live.broadcastgame.debug.frag;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcastgame.api.C3324a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class a$a extends RecyclerView.Adapter<a$b> {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(LiveGameAAMLoggerFragment$SimpleAdapter$data$2.INSTANCE);

    static {
        Covode.recordClassIndex(19714);
    }

    public final List<C3324a> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (List) (proxy.isSupported ? proxy.result : this.LIZIZ.mo27335getValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return LIZ().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ a$b onCreateViewHolder(ViewGroup viewGroup, int i) {
        a$b a_b;
        MethodCollector.m14708i(1413);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewGroup, Integer.valueOf(i)}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            a_b = (a$b) proxy.result;
        } else {
            C106862S5w.LIZ(viewGroup);
            a_b = new a$b(new TextView(viewGroup.getContext()));
        }
        MethodCollector.m14707o(1413);
        return a_b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(a$b a_b, int i) {
        int i2;
        a$b a_b2 = a_b;
        if (!PatchProxy.proxy(new Object[]{a_b2, Integer.valueOf(i)}, this, LIZ, false, 5).isSupported) {
            C106862S5w.LIZ(a_b2);
            C3324a c3324a = LIZ().get(i);
            if (!PatchProxy.proxy(new Object[]{c3324a}, a_b2, a$b.LIZ, false, 1).isSupported) {
                C106862S5w.LIZ(c3324a);
                a_b2.LIZIZ.setText(c3324a.LIZ());
                TextView textView = a_b2.LIZIZ;
                if (c3324a.LIZJ) {
                    i2 = -65536;
                } else {
                    i2 = -1;
                }
                textView.setTextColor(i2);
            }
        }
    }
}
