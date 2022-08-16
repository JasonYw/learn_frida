package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC138360cwG;
import p003X.AbstractC138363cwJ;
import p003X.C138269cum;

/* loaded from: classes17.dex */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, AbstractC138360cwG, AbstractC138363cwJ {
    public static final int[] LIZ = {16842964, 16843049};
    public C0199g LIZIZ;
    public int LIZJ;

    public final int getWindowAnimations() {
        return this.LIZJ;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    static {
        Covode.recordClassIndex(540);
    }

    @Override // p003X.AbstractC138363cwJ
    public final void initialize(C0199g c0199g) {
        this.LIZIZ = c0199g;
    }

    @Override // p003X.AbstractC138360cwG
    public final boolean LIZ(C0200i c0200i) {
        return this.LIZIZ.performItemAction(c0200i, 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C138269cum LIZ2 = C138269cum.LIZ(context, attributeSet, LIZ, i, 0);
        if (LIZ2.LJFF(0)) {
            setBackgroundDrawable(LIZ2.LIZ(0));
        }
        if (LIZ2.LJFF(1)) {
            setDivider(LIZ2.LIZ(1));
        }
        LIZ2.LIZ();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        LIZ((C0200i) getAdapter().getItem(i));
    }
}
