package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* loaded from: classes15.dex */
public class g$a {
    public RecyclerView.ViewHolder LIZ;
    public RecyclerView.ViewHolder LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public int f20281LJ;
    public int LJFF;

    static {
        Covode.recordClassIndex(1759);
    }

    public final String toString() {
        return "ChangeInfo{oldHolder=" + this.LIZ + ", newHolder=" + this.LIZIZ + ", fromX=" + this.LIZJ + ", fromY=" + this.LIZLLL + ", toX=" + this.f20281LJ + ", toY=" + this.LJFF + '}';
    }

    public g$a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        this.LIZ = viewHolder;
        this.LIZIZ = viewHolder2;
    }

    public g$a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        this(viewHolder, viewHolder2);
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.f20281LJ = i3;
        this.LJFF = i4;
    }
}
