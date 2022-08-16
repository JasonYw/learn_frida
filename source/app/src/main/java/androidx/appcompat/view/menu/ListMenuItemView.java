package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC138399cwt;
import p003X.C116971W2r;
import p003X.C138269cum;

/* loaded from: classes17.dex */
public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, AbstractC138399cwt {
    public C0200i LIZ;
    public ImageView LIZIZ;
    public RadioButton LIZJ;
    public TextView LIZLLL;

    /* renamed from: LJ */
    public CheckBox f20223LJ;
    public TextView LJFF;
    public ImageView LJI;
    public ImageView LJII;
    public LinearLayout LJIIIIZZ;
    public Drawable LJIIIZ;
    public int LJIIJ;
    public Context LJIIJJI;
    public boolean LJIIL;
    public Drawable LJIILIIL;
    public boolean LJIILJJIL;
    public LayoutInflater LJIILL;
    public boolean LJIILLIIL;

    static {
        Covode.recordClassIndex(541);
    }

    @Override // p003X.AbstractC138399cwt
    public boolean prefersCondensedTitle() {
        return false;
    }

    @Override // p003X.AbstractC138399cwt
    public C0200i getItemData() {
        return this.LIZ;
    }

    private void LIZ() {
        this.LIZJ = (RadioButton) C116971W2r.LIZ(getInflater(), 2131689504, (ViewGroup) this, false);
        LIZ(this.LIZJ);
    }

    private void LIZIZ() {
        this.f20223LJ = (CheckBox) C116971W2r.LIZ(getInflater(), 2131689501, (ViewGroup) this, false);
        LIZ(this.f20223LJ);
    }

    private LayoutInflater getInflater() {
        if (this.LJIILL == null) {
            this.LJIILL = LayoutInflater.from(getContext());
        }
        return this.LJIILL;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        ViewCompat.setBackground(this, this.LJIIIZ);
        this.LIZLLL = (TextView) findViewById(2131171295);
        int i = this.LJIIJ;
        if (i != -1) {
            this.LIZLLL.setTextAppearance(this.LJIIJJI, i);
        }
        this.LJFF = (TextView) findViewById(2131189822);
        this.LJI = (ImageView) findViewById(2131190991);
        ImageView imageView = this.LJI;
        if (imageView != null) {
            imageView.setImageDrawable(this.LJIILIIL);
        }
        this.LJII = (ImageView) findViewById(2131176275);
        this.LJIIIIZZ = (LinearLayout) findViewById(2131166269);
    }

    private void LIZ(View view) {
        LIZ(view, -1);
    }

    public void setForceShowIcon(boolean z) {
        this.LJIILLIIL = z;
        this.LJIIL = z;
    }

    private void setSubMenuArrowVisible(boolean z) {
        int i;
        ImageView imageView = this.LJI;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.LIZ.LJFF()) {
            if (this.LIZJ == null) {
                LIZ();
            }
            compoundButton = this.LIZJ;
        } else {
            if (this.f20223LJ == null) {
                LIZIZ();
            }
            compoundButton = this.f20223LJ;
        }
        compoundButton.setChecked(z);
    }

    public void setGroupDividerEnabled(boolean z) {
        int i;
        ImageView imageView = this.LJII;
        if (imageView != null) {
            if (!this.LJIILJJIL && z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    private void setShortcut$25d965e(boolean z) {
        int i;
        if (z && this.LIZ.m21198LJ()) {
            i = 0;
            this.LJFF.setText(this.LIZ.LIZLLL());
        } else {
            i = 8;
        }
        if (this.LJFF.getVisibility() != i) {
            this.LJFF.setVisibility(i);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.LJII;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.LJII.getLayoutParams();
            rect.top += this.LJII.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.LIZLLL.setText(charSequence);
            if (this.LIZLLL.getVisibility() != 0) {
                this.LIZLLL.setVisibility(0);
            }
        } else if (this.LIZLLL.getVisibility() != 8) {
            this.LIZLLL.setVisibility(8);
        }
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.LIZJ == null && this.f20223LJ == null) {
            return;
        }
        if (this.LIZ.LJFF()) {
            if (this.LIZJ == null) {
                LIZ();
            }
            compoundButton = this.LIZJ;
            compoundButton2 = this.f20223LJ;
        } else {
            if (this.f20223LJ == null) {
                LIZIZ();
            }
            compoundButton = this.f20223LJ;
            compoundButton2 = this.LIZJ;
        }
        if (z) {
            compoundButton.setChecked(this.LIZ.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 != null && compoundButton2.getVisibility() != 8) {
                compoundButton2.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox = this.f20223LJ;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.LIZJ;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z;
        if (!this.LIZ.LIZLLL.mOptionalIconsVisible && !this.LJIILLIIL) {
            z = false;
            if (!this.LJIIL) {
                return;
            }
        } else {
            z = true;
        }
        if (this.LIZIZ == null && drawable == null && !this.LJIIL) {
            return;
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = (ImageView) C116971W2r.LIZ(getInflater(), 2131689502, (ViewGroup) this, false);
            LIZ(this.LIZIZ, 0);
        }
        if (drawable == null && !this.LJIIL) {
            this.LIZIZ.setVisibility(8);
            return;
        }
        ImageView imageView = this.LIZIZ;
        if (!z) {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        if (this.LIZIZ.getVisibility() == 0) {
            return;
        }
        this.LIZIZ.setVisibility(0);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130773639);
    }

    private void LIZ(View view, int i) {
        LinearLayout linearLayout = this.LJIIIIZZ;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.LIZIZ != null && this.LJIIL) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.LIZIZ.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // p003X.AbstractC138399cwt
    public void initialize(C0200i c0200i, int i) {
        int i2;
        int i3;
        String sb;
        this.LIZ = c0200i;
        int i4 = 0;
        if (c0200i.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setTitle(c0200i.LIZ((AbstractC138399cwt) this));
        setCheckable(c0200i.isCheckable());
        boolean m21198LJ = c0200i.m21198LJ();
        c0200i.LIZJ();
        if (m21198LJ && this.LIZ.m21198LJ()) {
            TextView textView = this.LJFF;
            C0200i c0200i2 = this.LIZ;
            char LIZJ = c0200i2.LIZJ();
            if (LIZJ == 0) {
                sb = "";
            } else {
                Resources resources = c0200i2.LIZLLL.mContext.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(c0200i2.LIZLLL.mContext).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(2131558662));
                }
                if (c0200i2.LIZLLL.isQwertyMode()) {
                    i3 = c0200i2.LIZJ;
                } else {
                    i3 = c0200i2.LIZIZ;
                }
                C0200i.LIZ(sb2, i3, 65536, resources.getString(2131558658));
                C0200i.LIZ(sb2, i3, AccessibilityEventCompat.TYPE_VIEW_SCROLLED, resources.getString(2131558654));
                C0200i.LIZ(sb2, i3, 2, resources.getString(2131558653));
                C0200i.LIZ(sb2, i3, 1, resources.getString(2131558659));
                C0200i.LIZ(sb2, i3, 4, resources.getString(2131558661));
                C0200i.LIZ(sb2, i3, 8, resources.getString(2131558657));
                if (LIZJ != '\b') {
                    if (LIZJ != '\n') {
                        if (LIZJ != ' ') {
                            sb2.append(LIZJ);
                        } else {
                            sb2.append(resources.getString(2131558660));
                        }
                    } else {
                        sb2.append(resources.getString(2131558656));
                    }
                } else {
                    sb2.append(resources.getString(2131558655));
                }
                sb = sb2.toString();
            }
            textView.setText(sb);
        } else {
            i4 = 8;
        }
        if (this.LJFF.getVisibility() != i4) {
            this.LJFF.setVisibility(i4);
        }
        setIcon(c0200i.getIcon());
        setEnabled(c0200i.isEnabled());
        setSubMenuArrowVisible(c0200i.hasSubMenu());
        setContentDescription(c0200i.getContentDescription());
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C138269cum LIZ = C138269cum.LIZ(getContext(), attributeSet, new int[]{16842926, 16843052, 16843053, 16843054, 16843055, 16843056, 16843057, 2130773961, 2130774592}, i, 0);
        this.LJIIIZ = LIZ.LIZ(5);
        this.LJIIJ = LIZ.LJI(1, -1);
        this.LJIIL = LIZ.LIZ(7, false);
        this.LJIIJJI = context;
        this.LJIILIIL = LIZ.LIZ(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, 2130772998, 0);
        this.LJIILJJIL = obtainStyledAttributes.hasValue(0);
        LIZ.LIZ();
        obtainStyledAttributes.recycle();
    }
}
