package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC138390cwk;
import p003X.SubMenuC138412cx6;

/* renamed from: androidx.appcompat.view.menu.m */
/* loaded from: classes17.dex */
public interface AbstractC0201m {
    static {
        Covode.recordClassIndex(569);
    }

    boolean collapseItemActionView(C0199g c0199g, C0200i c0200i);

    boolean expandItemActionView(C0199g c0199g, C0200i c0200i);

    boolean flagActionItems();

    int getId();

    void initForMenu(Context context, C0199g c0199g);

    void onCloseMenu(C0199g c0199g, boolean z);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(SubMenuC138412cx6 subMenuC138412cx6);

    void setCallback(AbstractC138390cwk abstractC138390cwk);

    void updateMenuView(boolean z);
}
