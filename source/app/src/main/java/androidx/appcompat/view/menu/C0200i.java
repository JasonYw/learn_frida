package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.p015a.p016a.AbstractMenuItemC0233b;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC138399cwt;
import p003X.AbstractC138414cx8;
import p003X.C116971W2r;
import p003X.C138415cx9;
import p003X.C138491cyN;
import p003X.SubMenuC138412cx6;

/* renamed from: androidx.appcompat.view.menu.i */
/* loaded from: classes17.dex */
public final class C0200i implements AbstractMenuItemC0233b {
    public final int LIZ;
    public C0199g LIZLLL;

    /* renamed from: LJ */
    public Runnable f20224LJ;
    public ContextMenu.ContextMenuInfo LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public CharSequence LJIIIZ;
    public CharSequence LJIIJ;
    public Intent LJIIJJI;
    public char LJIIL;
    public char LJIILIIL;
    public Drawable LJIILJJIL;
    public int LJIILL;
    public SubMenuC138412cx6 LJIILLIIL;
    public MenuItem.OnMenuItemClickListener LJIIZILJ;
    public CharSequence LJIJ;
    public CharSequence LJIJI;
    public ColorStateList LJIJJ;
    public PorterDuff.Mode LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public int LJJII;
    public View LJJIII;
    public AbstractC138414cx8 LJJIIJ;
    public MenuItem.OnActionExpandListener LJJIIJZLJL;
    public boolean LJJIIZ;
    public int LIZIZ = AccessibilityEventCompat.TYPE_VIEW_SCROLLED;
    public int LIZJ = AccessibilityEventCompat.TYPE_VIEW_SCROLLED;
    public int LJJIFFI = 16;

    static {
        Covode.recordClassIndex(558);
    }

    @Override // androidx.core.p015a.p016a.AbstractMenuItemC0233b
    public final AbstractC138414cx8 LIZ() {
        return this.LJJIIJ;
    }

    @Override // androidx.core.p015a.p016a.AbstractMenuItemC0233b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.LIZJ;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.LJIILIIL;
    }

    @Override // androidx.core.p015a.p016a.AbstractMenuItemC0233b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.LJIJ;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.LJII;
    }

    @Override // androidx.core.p015a.p016a.AbstractMenuItemC0233b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.LJIJJ;
    }

    @Override // androidx.core.p015a.p016a.AbstractMenuItemC0233b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.LJIJJLI;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.LJIIJJI;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.LJI;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.LJFF;
    }

    @Override // androidx.core.p015a.p016a.AbstractMenuItemC0233b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.LIZIZ;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.LJIIL;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.LJIIIIZZ;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.LJIILLIIL;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.LJIIIZ;
    }

    @Override // androidx.core.p015a.p016a.AbstractMenuItemC0233b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.LJIJI;
    }

    @Override // androidx.core.p015a.p016a.AbstractMenuItemC0233b, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.LJJIIZ;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.LJIILLIIL != null) {
            return true;
        }
        return false;
    }

    public final char LIZJ() {
        if (this.LIZLLL.isQwertyMode()) {
            return this.LJIILIIL;
        }
        return this.LJIIL;
    }

    public final boolean LJFF() {
        if ((this.LJJIFFI & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean LJI() {
        if ((this.LJJIFFI & 32) == 32) {
            return true;
        }
        return false;
    }

    public final boolean LJII() {
        if ((this.LJJII & 1) == 1) {
            return true;
        }
        return false;
    }

    public final boolean LJIIIIZZ() {
        if ((this.LJJII & 2) == 2) {
            return true;
        }
        return false;
    }

    public final boolean LJIIIZ() {
        if ((this.LJJII & 4) == 4) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.LJIIJ;
        if (charSequence == null) {
            charSequence = this.LJIIIZ;
        }
        int i = Build.VERSION.SDK_INT;
        return charSequence;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.LJJIFFI & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.LJJIFFI & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.LJJIFFI & 16) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        CharSequence charSequence = this.LJIIIZ;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: LJ */
    public final boolean m21198LJ() {
        if (this.LIZLLL.isShortcutsVisible() && LIZJ() != 0) {
            return true;
        }
        return false;
    }

    public final boolean LJIIJ() {
        AbstractC138414cx8 abstractC138414cx8;
        if ((this.LJJII & 8) != 0) {
            if (this.LJJIII == null && (abstractC138414cx8 = this.LJJIIJ) != null) {
                this.LJJIII = abstractC138414cx8.onCreateActionView(this);
            }
            if (this.LJJIII != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.p015a.p016a.AbstractMenuItemC0233b, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.LJJII & 8) == 0) {
            return false;
        }
        if (this.LJJIII == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.LJJIIJZLJL;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.LIZLLL.collapseItemActionView(this);
    }

    @Override // androidx.core.p015a.p016a.AbstractMenuItemC0233b, android.view.MenuItem
    public final boolean expandActionView() {
        if (!LJIIJ()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.LJJIIJZLJL;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.LIZLLL.expandItemActionView(this);
    }

    @Override // androidx.core.p015a.p016a.AbstractMenuItemC0233b, android.view.MenuItem
    public final View getActionView() {
        View view = this.LJJIII;
        if (view != null) {
            return view;
        }
        AbstractC138414cx8 abstractC138414cx8 = this.LJJIIJ;
        if (abstractC138414cx8 != null) {
            this.LJJIII = abstractC138414cx8.onCreateActionView(this);
            return this.LJJIII;
        }
        return null;
    }

    public final boolean LIZIZ() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.LJIIZILJ;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0199g c0199g = this.LIZLLL;
        if (c0199g.dispatchMenuItemSelected(c0199g, this)) {
            return true;
        }
        Runnable runnable = this.f20224LJ;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.LJIIJJI != null) {
            try {
                C116971W2r.LIZ(this.LIZLLL.mContext, this.LJIIJJI);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        AbstractC138414cx8 abstractC138414cx8 = this.LJJIIJ;
        if (abstractC138414cx8 != null && abstractC138414cx8.onPerformDefaultAction()) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.LJIILJJIL;
        if (drawable != null) {
            return LIZ(drawable);
        }
        if (this.LJIILL != 0) {
            Drawable LIZIZ = C138491cyN.LIZIZ(this.LIZLLL.mContext, this.LJIILL);
            this.LJIILL = 0;
            this.LJIILJJIL = LIZIZ;
            return LIZ(LIZIZ);
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        AbstractC138414cx8 abstractC138414cx8 = this.LJJIIJ;
        if (abstractC138414cx8 != null && abstractC138414cx8.overridesItemVisibility()) {
            if ((this.LJJIFFI & 8) == 0 && this.LJJIIJ.isVisible()) {
                return true;
            }
            return false;
        } else if ((this.LJJIFFI & 8) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public final String LIZLLL() {
        int i;
        char LIZJ = LIZJ();
        if (LIZJ == 0) {
            return "";
        }
        Resources resources = this.LIZLLL.mContext.getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.LIZLLL.mContext).hasPermanentMenuKey()) {
            sb.append(resources.getString(2131558662));
        }
        if (this.LIZLLL.isQwertyMode()) {
            i = this.LIZJ;
        } else {
            i = this.LIZIZ;
        }
        LIZ(sb, i, 65536, resources.getString(2131558658));
        LIZ(sb, i, AccessibilityEventCompat.TYPE_VIEW_SCROLLED, resources.getString(2131558654));
        LIZ(sb, i, 2, resources.getString(2131558653));
        LIZ(sb, i, 1, resources.getString(2131558659));
        LIZ(sb, i, 4, resources.getString(2131558661));
        LIZ(sb, i, 8, resources.getString(2131558657));
        if (LIZJ != '\b') {
            if (LIZJ != '\n') {
                if (LIZJ != ' ') {
                    sb.append(LIZJ);
                } else {
                    sb.append(resources.getString(2131558660));
                }
            } else {
                sb.append(resources.getString(2131558656));
            }
        } else {
            sb.append(resources.getString(2131558655));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.LJIIJJI = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.LJJIIJZLJL = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.LJIIZILJ = onMenuItemClickListener;
        return this;
    }

    @Override // androidx.core.p015a.p016a.AbstractMenuItemC0233b, android.view.MenuItem
    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // androidx.core.p015a.p016a.AbstractMenuItemC0233b, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(View view) {
        LIZ(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        LIZ(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        LIZIZ(charSequence);
        return this;
    }

    @Override // androidx.core.p015a.p016a.AbstractMenuItemC0233b
    public final AbstractMenuItemC0233b LIZ(CharSequence charSequence) {
        this.LJIJ = charSequence;
        this.LIZLLL.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.p015a.p016a.AbstractMenuItemC0233b
    public final AbstractMenuItemC0233b LIZIZ(CharSequence charSequence) {
        this.LJIJI = charSequence;
        this.LIZLLL.onItemsChanged(false);
        return this;
    }

    public final void LIZLLL(boolean z) {
        if (z) {
            this.LJJIFFI |= 32;
        } else {
            this.LJJIFFI &= -33;
        }
    }

    /* renamed from: LJ */
    public final void m21197LJ(boolean z) {
        this.LJJIIZ = z;
        this.LIZLLL.onItemsChanged(false);
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        if ((this.LJJIFFI & 4) != 0) {
            this.LIZLLL.setExclusiveItemChecked(this);
            return this;
        }
        LIZIZ(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.LJIILJJIL = null;
        this.LJIILL = i;
        this.LJJI = true;
        this.LIZLLL.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.p015a.p016a.AbstractMenuItemC0233b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.LJIJJ = colorStateList;
        this.LJIL = true;
        this.LJJI = true;
        this.LIZLLL.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.p015a.p016a.AbstractMenuItemC0233b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.LJIJJLI = mode;
        this.LJJ = true;
        this.LJJI = true;
        this.LIZLLL.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.LJIIL == c) {
            return this;
        }
        this.LJIIL = c;
        this.LIZLLL.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.LIZLLL.mContext.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.LJIIJ = charSequence;
        this.LIZLLL.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        if (LIZJ(z)) {
            this.LIZLLL.onItemVisibleChanged(this);
        }
        return this;
    }

    private AbstractMenuItemC0233b LIZ(View view) {
        int i;
        this.LJJIII = view;
        this.LJJIIJ = null;
        if (view != null && view.getId() == -1 && (i = this.LJI) > 0) {
            view.setId(i);
        }
        this.LIZLLL.onItemActionRequestChanged(this);
        return this;
    }

    public final void LIZIZ(boolean z) {
        int i;
        int i2 = this.LJJIFFI;
        int i3 = i2 & (-3);
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.LJJIFFI = i | i3;
        if (i2 != this.LJJIFFI) {
            this.LIZLLL.onItemsChanged(false);
        }
    }

    public final boolean LIZJ(boolean z) {
        int i;
        int i2 = this.LJJIFFI;
        int i3 = i2 & (-9);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.LJJIFFI = i | i3;
        if (i2 == this.LJJIFFI) {
            return false;
        }
        return true;
    }

    @Override // androidx.core.p015a.p016a.AbstractMenuItemC0233b, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.LIZLLL.mContext;
        LIZ(C116971W2r.LIZ(LayoutInflater.from(context), i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.LJIILIIL == c) {
            return this;
        }
        this.LJIILIIL = Character.toLowerCase(c);
        this.LIZLLL.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.LJJIFFI;
        this.LJJIFFI = (z ? 1 : 0) | (i & (-2));
        if (i != this.LJJIFFI) {
            this.LIZLLL.onItemsChanged(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.LJJIFFI |= 16;
        } else {
            this.LJJIFFI &= -17;
        }
        this.LIZLLL.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.LJIILL = 0;
        this.LJIILJJIL = drawable;
        this.LJJI = true;
        this.LIZLLL.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.p015a.p016a.AbstractMenuItemC0233b, android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.LJJII = i;
        this.LIZLLL.onItemActionRequestChanged(this);
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.LJIIIZ = charSequence;
        this.LIZLLL.onItemsChanged(false);
        SubMenuC138412cx6 subMenuC138412cx6 = this.LJIILLIIL;
        if (subMenuC138412cx6 != null) {
            subMenuC138412cx6.setHeaderTitle(charSequence);
        }
        return this;
    }

    private Drawable LIZ(Drawable drawable) {
        if (drawable != null && this.LJJI && (this.LJIL || this.LJJ)) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            if (this.LJIL) {
                DrawableCompat.setTintList(drawable, this.LJIJJ);
            }
            if (this.LJJ) {
                DrawableCompat.setTintMode(drawable, this.LJIJJLI);
            }
            this.LJJI = false;
        }
        return drawable;
    }

    @Override // androidx.core.p015a.p016a.AbstractMenuItemC0233b
    public final AbstractMenuItemC0233b LIZ(AbstractC138414cx8 abstractC138414cx8) {
        AbstractC138414cx8 abstractC138414cx82 = this.LJJIIJ;
        if (abstractC138414cx82 != null) {
            abstractC138414cx82.reset();
        }
        this.LJJIII = null;
        this.LJJIIJ = abstractC138414cx8;
        this.LIZLLL.onItemsChanged(true);
        AbstractC138414cx8 abstractC138414cx83 = this.LJJIIJ;
        if (abstractC138414cx83 != null) {
            abstractC138414cx83.setVisibilityListener(new C138415cx9(this));
        }
        return this;
    }

    public final CharSequence LIZ(AbstractC138399cwt abstractC138399cwt) {
        if (abstractC138399cwt.prefersCondensedTitle()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    public final void LIZ(SubMenuC138412cx6 subMenuC138412cx6) {
        this.LJIILLIIL = subMenuC138412cx6;
        subMenuC138412cx6.setHeaderTitle(getTitle());
    }

    public final void LIZ(boolean z) {
        int i;
        int i2 = this.LJJIFFI & (-5);
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        this.LJJIFFI = i | i2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.LJIIL = c;
        this.LJIILIIL = Character.toLowerCase(c2);
        this.LIZLLL.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.p015a.p016a.AbstractMenuItemC0233b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.LJIIL == c && this.LIZIZ == i) {
            return this;
        }
        this.LJIIL = c;
        this.LIZIZ = KeyEvent.normalizeMetaState(i);
        this.LIZLLL.onItemsChanged(false);
        return this;
    }

    @Override // androidx.core.p015a.p016a.AbstractMenuItemC0233b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.LJIILIIL == c && this.LIZJ == i) {
            return this;
        }
        this.LJIILIIL = Character.toLowerCase(c);
        this.LIZJ = KeyEvent.normalizeMetaState(i);
        this.LIZLLL.onItemsChanged(false);
        return this;
    }

    public static void LIZ(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // androidx.core.p015a.p016a.AbstractMenuItemC0233b, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.LJIIL = c;
        this.LIZIZ = KeyEvent.normalizeMetaState(i);
        this.LJIILIIL = Character.toLowerCase(c2);
        this.LIZJ = KeyEvent.normalizeMetaState(i2);
        this.LIZLLL.onItemsChanged(false);
        return this;
    }

    public C0200i(C0199g c0199g, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.LIZLLL = c0199g;
        this.LJI = i2;
        this.LJII = i;
        this.LJIIIIZZ = i3;
        this.LIZ = i4;
        this.LJIIIZ = charSequence;
        this.LJJII = i5;
    }
}
