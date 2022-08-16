package com.android.ttcjpaysdk.integrated.counter.p153a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.ttcjpaysdk.integrated.counter.data.PaymentMethodInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.C106862S5w;

/* renamed from: com.android.ttcjpaysdk.integrated.counter.a.d */
/* loaded from: classes17.dex */
public abstract class AbstractC2271d {
    public static ChangeQuickRedirect LIZ;
    public final ArrayList<PaymentMethodInfo> LIZIZ = new ArrayList<>();
    public final LayoutInflater LIZJ;

    static {
        Covode.recordClassIndex(7506);
    }

    public abstract int LIZ();

    public abstract int LIZ(int i);

    public abstract RecyclerView.ViewHolder LIZ(ViewGroup viewGroup, int i);

    public abstract void LIZ(RecyclerView.ViewHolder viewHolder, int i);

    public AbstractC2271d(Context context) {
        this.LIZJ = LayoutInflater.from(context);
    }

    public void LIZ(ArrayList<PaymentMethodInfo> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(arrayList);
        this.LIZIZ.clear();
        this.LIZIZ.addAll(arrayList);
    }
}
