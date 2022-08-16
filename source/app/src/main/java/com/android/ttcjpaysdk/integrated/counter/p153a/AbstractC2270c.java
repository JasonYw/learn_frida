package com.android.ttcjpaysdk.integrated.counter.p153a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.ttcjpaysdk.integrated.counter.data.PaymentMethodInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;

/* renamed from: com.android.ttcjpaysdk.integrated.counter.a.c */
/* loaded from: classes17.dex */
public abstract class AbstractC2270c {
    public static ChangeQuickRedirect LIZ;
    public final ArrayList<PaymentMethodInfo> LIZIZ = new ArrayList<>();
    public int LIZJ;
    public final LayoutInflater LIZLLL;

    static {
        Covode.recordClassIndex(7505);
    }

    public abstract int LIZ();

    public abstract int LIZ(int i);

    public abstract RecyclerView.ViewHolder LIZ(ViewGroup viewGroup, int i);

    public abstract void LIZ(RecyclerView.ViewHolder viewHolder, int i);

    public void LIZIZ() {
    }

    public AbstractC2270c(Context context) {
        this.LIZLLL = LayoutInflater.from(context);
    }
}
