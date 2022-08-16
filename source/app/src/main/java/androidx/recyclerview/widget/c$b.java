package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* loaded from: classes28.dex */
public abstract class c$b extends RecyclerView.ViewHolder {
    public boolean LIZ;

    static {
        Covode.recordClassIndex(1746);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ViewHolder
    public void resetInternal() {
        super.resetInternal();
        this.LIZ = false;
    }

    public c$b(View view) {
        super(view);
    }
}
