package com.bytedance.android.live.liveinteract.linkroomfight.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC80108Hhu;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C414192aL;
import p003X.C80107Hht;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.adapter.h */
/* loaded from: classes3.dex */
public final class C4448h extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static ChangeQuickRedirect LIZ;
    public final List<String> LIZIZ = new ArrayList();
    public int LIZJ;
    public final AbstractC80108Hhu LIZLLL;

    /* renamed from: LJ */
    public final Context f26332LJ;

    static {
        Covode.recordClassIndex(27536);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return this.LIZIZ.size();
    }

    public C4448h(Context context, AbstractC80108Hhu abstractC80108Hhu) {
        C106862S5w.LIZ(context, abstractC80108Hhu);
        this.f26332LJ = context;
        this.LIZLLL = abstractC80108Hhu;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewGroup, Integer.valueOf(i)}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (RecyclerView.ViewHolder) proxy.result;
        }
        C106862S5w.LIZ(viewGroup);
        View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(this.f26332LJ), 2131699508, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        return new C80107Hht(this, LIZ2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.proxy(new Object[]{viewHolder, Integer.valueOf(i)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(viewHolder);
        if (viewHolder instanceof C80107Hht) {
            C80107Hht c80107Hht = (C80107Hht) viewHolder;
            String str = this.LIZIZ.get(i);
            int i2 = this.LIZJ;
            if (!PatchProxy.proxy(new Object[]{str, Integer.valueOf(i2)}, c80107Hht, C80107Hht.LIZ, false, 1).isSupported) {
                C106862S5w.LIZ(str);
                c80107Hht.LIZLLL = str;
                c80107Hht.LIZIZ.setText(str);
                SpannableString spannableString = new SpannableString(str);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(LK5.LIZIZ(2131629111));
                if (spannableString.length() < i2) {
                    i2 = spannableString.length();
                }
                C116971W2r.LIZ(spannableString, foregroundColorSpan, 0, i2, 18);
                Intrinsics.areEqual(c80107Hht.LIZIZ.getText(), spannableString);
                c80107Hht.LIZIZ.setOnClickListener(C414192aL.LIZ(0L, new C4445x8338aefc(c80107Hht), 1, null));
                c80107Hht.LIZJ.setOnClickListener(C414192aL.LIZ(0L, new C4446x8338aefd(c80107Hht), 1, null));
            }
        }
    }
}
