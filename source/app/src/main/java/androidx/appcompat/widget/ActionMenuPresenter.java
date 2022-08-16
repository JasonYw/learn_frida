package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0199g;
import androidx.appcompat.view.menu.C0200i;
import com.bytedance.bdp.service.plug.map.BuildConfig;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import p003X.AbstractC138363cwJ;
import p003X.AbstractC138395cwp;
import p003X.AbstractC138399cwt;
import p003X.AbstractC138404cwy;
import p003X.AbstractC138414cx8;
import p003X.C138315cvX;
import p003X.C138362cwI;
import p003X.C138376cwW;
import p003X.C138392cwm;
import p003X.C138393cwn;
import p003X.C138397cwr;
import p003X.RunnableC138394cwo;
import p003X.SubMenuC138412cx6;

/* loaded from: classes17.dex */
public final class ActionMenuPresenter extends AbstractC138395cwp implements AbstractC138404cwy {
    public C138362cwI LJII;
    public Drawable LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public C138392cwm LJIIL;
    public C138393cwn LJIILIIL;
    public RunnableC138394cwo LJIILJJIL;
    public int LJIILLIIL;
    public boolean LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public int LJJI;
    public C138376cwW LJJII;
    public final SparseBooleanArray LJJIFFI = new SparseBooleanArray();
    public final C138397cwr LJIILL = new C138397cwr(this);

    static {
        Covode.recordClassIndex(589);
    }

    /* loaded from: classes17.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.appcompat.widget.ActionMenuPresenter.SavedState.1
            static {
                Covode.recordClassIndex(591);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        public int LIZ;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        static {
            Covode.recordClassIndex(BuildConfig.VERSION_CODE);
        }

        public SavedState(Parcel parcel) {
            this.LIZ = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.LIZ);
        }
    }

    public final boolean LIZLLL() {
        return LIZJ() | m21195LJ();
    }

    /* renamed from: LJ */
    public final boolean m21195LJ() {
        C138393cwn c138393cwn = this.LJIILIIL;
        if (c138393cwn != null) {
            c138393cwn.LIZJ();
            return true;
        }
        return false;
    }

    public final boolean LJFF() {
        C138392cwm c138392cwm = this.LJIIL;
        if (c138392cwm != null && c138392cwm.m21657LJ()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0201m
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.LIZ = this.LJIILLIIL;
        return savedState;
    }

    public final void LIZ() {
        if (!this.LJIJJLI) {
            this.LJIJJ = C138315cvX.LIZ(this.LIZIZ).LIZ();
        }
        if (this.LIZJ != null) {
            this.LIZJ.onItemsChanged(true);
        }
    }

    public final boolean LIZJ() {
        if (this.LJIILJJIL != null && this.LJFF != null) {
            ((View) this.LJFF).removeCallbacks(this.LJIILJJIL);
            this.LJIILJJIL = null;
            return true;
        }
        C138392cwm c138392cwm = this.LJIIL;
        if (c138392cwm != null) {
            c138392cwm.LIZJ();
            return true;
        }
        return false;
    }

    public final boolean LIZIZ() {
        if (this.LJIIJ && !LJFF() && this.LIZJ != null && this.LJFF != null && this.LJIILJJIL == null && !this.LIZJ.getNonActionItems().isEmpty()) {
            this.LJIILJJIL = new RunnableC138394cwo(this, new C138392cwm(this, this.LIZIZ, this.LIZJ, this.LJII, true));
            ((View) this.LJFF).post(this.LJIILJJIL);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x012b, code lost:
        if (r3 != false) goto L72;
     */
    @Override // p003X.AbstractC138395cwp, androidx.appcompat.view.menu.AbstractC0201m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean flagActionItems() {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuPresenter.flagActionItems():boolean");
    }

    public final void LIZ(ActionMenuView actionMenuView) {
        this.LJFF = actionMenuView;
        actionMenuView.initialize(this.LIZJ);
    }

    @Override // p003X.AbstractC138395cwp
    public final AbstractC138363cwJ LIZ(ViewGroup viewGroup) {
        AbstractC138363cwJ abstractC138363cwJ = this.LJFF;
        AbstractC138363cwJ LIZ = super.LIZ(viewGroup);
        if (abstractC138363cwJ != LIZ) {
            ((ActionMenuView) LIZ).setPresenter(this);
        }
        return LIZ;
    }

    public ActionMenuPresenter(Context context) {
        super(context, 2131689489, 2131689488);
    }

    @Override // p003X.AbstractC138404cwy
    public final void LIZIZ(boolean z) {
        if (z) {
            super.onSubMenuSelected(null);
        } else if (this.LIZJ != null) {
            this.LIZJ.close(false);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0201m
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        if (savedState.LIZ > 0 && (findItem = this.LIZJ.findItem(savedState.LIZ)) != null) {
            onSubMenuSelected((SubMenuC138412cx6) findItem.getSubMenu());
        }
    }

    public final void LIZ(boolean z) {
        this.LJIIJ = true;
        this.LJIIZILJ = true;
    }

    @Override // p003X.AbstractC138395cwp, androidx.appcompat.view.menu.AbstractC0201m
    public final boolean onSubMenuSelected(SubMenuC138412cx6 subMenuC138412cx6) {
        boolean z = false;
        if (!subMenuC138412cx6.hasVisibleItems()) {
            return false;
        }
        SubMenuC138412cx6 subMenuC138412cx62 = subMenuC138412cx6;
        while (subMenuC138412cx62.mParentMenu != this.LIZJ) {
            subMenuC138412cx62 = (SubMenuC138412cx6) subMenuC138412cx62.mParentMenu;
        }
        MenuItem item = subMenuC138412cx62.getItem();
        ViewGroup viewGroup = (ViewGroup) this.LJFF;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof AbstractC138399cwt) && ((AbstractC138399cwt) childAt).getItemData() == item) {
                    if (childAt != null) {
                        this.LJIILLIIL = subMenuC138412cx6.getItem().getItemId();
                        int size = subMenuC138412cx6.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                break;
                            }
                            MenuItem item2 = subMenuC138412cx6.getItem(i2);
                            if (item2.isVisible() && item2.getIcon() != null) {
                                z = true;
                                break;
                            }
                            i2++;
                        }
                        this.LJIILIIL = new C138393cwn(this, this.LIZIZ, subMenuC138412cx6, childAt);
                        this.LJIILIIL.LIZ(z);
                        if (this.LJIILIIL.LIZIZ()) {
                            super.onSubMenuSelected(subMenuC138412cx6);
                            return true;
                        }
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    @Override // p003X.AbstractC138395cwp, androidx.appcompat.view.menu.AbstractC0201m
    public final void updateMenuView(boolean z) {
        ArrayList<C0200i> arrayList;
        int size;
        super.updateMenuView(z);
        ((View) this.LJFF).requestLayout();
        if (this.LIZJ != null) {
            ArrayList<C0200i> actionItems = this.LIZJ.getActionItems();
            int size2 = actionItems.size();
            for (int i = 0; i < size2; i++) {
                AbstractC138414cx8 LIZ = actionItems.get(i).LIZ();
                if (LIZ != null) {
                    LIZ.mSubUiVisibilityListener = this;
                }
            }
        }
        if (this.LIZJ != null) {
            arrayList = this.LIZJ.getNonActionItems();
        } else {
            arrayList = null;
        }
        if (this.LJIIJ && arrayList != null && ((size = arrayList.size()) != 1 ? size > 0 : (!arrayList.get(0).isActionViewExpanded()))) {
            if (this.LJII == null) {
                this.LJII = new C138362cwI(this, this.LIZ);
            }
            ViewGroup viewGroup = (ViewGroup) this.LJII.getParent();
            if (viewGroup != this.LJFF) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.LJII);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.LJFF;
                actionMenuView.addView(this.LJII, actionMenuView.LIZ());
            }
        } else {
            C138362cwI c138362cwI = this.LJII;
            if (c138362cwI != null && c138362cwI.getParent() == this.LJFF) {
                ((ViewGroup) this.LJFF).removeView(this.LJII);
            }
        }
        ((ActionMenuView) this.LJFF).setOverflowReserved(this.LJIIJ);
    }

    @Override // p003X.AbstractC138395cwp
    public final boolean LIZ(C0200i c0200i) {
        return c0200i.LJI();
    }

    @Override // p003X.AbstractC138395cwp, androidx.appcompat.view.menu.AbstractC0201m
    public final void onCloseMenu(C0199g c0199g, boolean z) {
        LIZLLL();
        super.onCloseMenu(c0199g, z);
    }

    @Override // p003X.AbstractC138395cwp
    public final void LIZ(C0200i c0200i, AbstractC138399cwt abstractC138399cwt) {
        abstractC138399cwt.initialize(c0200i, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) abstractC138399cwt;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.LJFF);
        if (this.LJJII == null) {
            this.LJJII = new C138376cwW(this);
        }
        actionMenuItemView.setPopupCallback(this.LJJII);
    }

    @Override // p003X.AbstractC138395cwp, androidx.appcompat.view.menu.AbstractC0201m
    public final void initForMenu(Context context, C0199g c0199g) {
        super.initForMenu(context, c0199g);
        Resources resources = context.getResources();
        C138315cvX LIZ = C138315cvX.LIZ(context);
        if (!this.LJIIZILJ) {
            int i = Build.VERSION.SDK_INT;
            this.LJIIJ = true;
        }
        if (!this.LJJ) {
            this.LJIJ = LIZ.LIZ.getResources().getDisplayMetrics().widthPixels / 2;
        }
        if (!this.LJIJJLI) {
            this.LJIJJ = LIZ.LIZ();
        }
        int i2 = this.LJIJ;
        if (this.LJIIJ) {
            if (this.LJII == null) {
                this.LJII = new C138362cwI(this, this.LIZ);
                if (this.LJIIIZ) {
                    this.LJII.setImageDrawable(this.LJIIIIZZ);
                    this.LJIIIIZZ = null;
                    this.LJIIIZ = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.LJII.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i2 -= this.LJII.getMeasuredWidth();
        } else {
            this.LJII = null;
        }
        this.LJIJI = i2;
        this.LJJI = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // p003X.AbstractC138395cwp
    public final boolean LIZ(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.LJII) {
            return false;
        }
        return super.LIZ(viewGroup, i);
    }

    @Override // p003X.AbstractC138395cwp
    public final View LIZ(C0200i c0200i, View view, ViewGroup viewGroup) {
        int i;
        View actionView = c0200i.getActionView();
        if (actionView == null || c0200i.LJIIJ()) {
            actionView = super.LIZ(c0200i, view, viewGroup);
        }
        if (c0200i.isActionViewExpanded()) {
            i = 8;
        } else {
            i = 0;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo25202generateLayoutParams(layoutParams));
        }
        return actionView;
    }
}
