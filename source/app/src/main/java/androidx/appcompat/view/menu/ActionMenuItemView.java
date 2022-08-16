package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC138359cwF;
import p003X.AbstractC138360cwG;
import p003X.AbstractC138399cwt;
import p003X.AbstractC138402cww;
import p003X.AbstractView$OnAttachStateChangeListenerC138371cwR;
import p003X.C138358cwE;
import p003X.C138361cwH;

/* loaded from: classes17.dex */
public class ActionMenuItemView extends AppCompatTextView implements View.OnClickListener, AbstractC138399cwt, AbstractC138402cww {
    public C0200i LIZ;
    public AbstractC138360cwG LIZIZ;
    public AbstractC138359cwF LIZJ;

    /* renamed from: LJ */
    public CharSequence f20222LJ;
    public Drawable LJFF;
    public AbstractView$OnAttachStateChangeListenerC138371cwR LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;

    static {
        Covode.recordClassIndex(537);
    }

    @Override // p003X.AbstractC138399cwt
    public boolean prefersCondensedTitle() {
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    @Override // p003X.AbstractC138399cwt
    public C0200i getItemData() {
        return this.LIZ;
    }

    @Override // p003X.AbstractC138402cww
    public final boolean LIZJ() {
        return LIZ();
    }

    public final boolean LIZ() {
        if (!TextUtils.isEmpty(getText())) {
            return true;
        }
        return false;
    }

    @Override // p003X.AbstractC138402cww
    public final boolean LIZIZ() {
        if (LIZ() && this.LIZ.getIcon() == null) {
            return true;
        }
        return false;
    }

    private boolean LIZLLL() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            if ((i < 640 || i2 < 480) && configuration.orientation != 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: LJ */
    private void m21199LJ() {
        CharSequence charSequence;
        CharSequence title;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f20222LJ);
        if (this.LJFF != null && (!this.LIZ.LJIIIZ() || (!this.LJII && !this.LJIIIIZZ))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        if (z3) {
            charSequence = this.f20222LJ;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence contentDescription = this.LIZ.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                title = null;
            } else {
                title = this.LIZ.getTitle();
            }
            setContentDescription(title);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.LIZ.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.LIZ.getTitle();
            }
            C138361cwH.LIZ(this, charSequence2);
            return;
        }
        C138361cwH.LIZ(this, tooltipText);
    }

    public void setItemInvoker(AbstractC138360cwG abstractC138360cwG) {
        this.LIZIZ = abstractC138360cwG;
    }

    public void setPopupCallback(AbstractC138359cwF abstractC138359cwF) {
        this.LIZJ = abstractC138359cwF;
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public void setTitle(CharSequence charSequence) {
        this.f20222LJ = charSequence;
        m21199LJ();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC138360cwG abstractC138360cwG = this.LIZIZ;
        if (abstractC138360cwG != null) {
            abstractC138360cwG.LIZ(this.LIZ);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.LJII = LIZLLL();
        m21199LJ();
    }

    public void setExpandedFormat(boolean z) {
        if (this.LJIIIIZZ != z) {
            this.LJIIIIZZ = z;
            C0200i c0200i = this.LIZ;
            if (c0200i != null) {
                c0200i.LIZLLL.onItemActionRequestChanged(c0200i);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnAttachStateChangeListenerC138371cwR abstractView$OnAttachStateChangeListenerC138371cwR;
        if (this.LIZ.hasSubMenu() && (abstractView$OnAttachStateChangeListenerC138371cwR = this.LJI) != null && abstractView$OnAttachStateChangeListenerC138371cwR.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setIcon(Drawable drawable) {
        this.LJFF = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.LJIIJJI;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            int i2 = this.LJIIJJI;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m21199LJ();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // p003X.AbstractC138399cwt
    public void initialize(C0200i c0200i, int i) {
        int i2;
        this.LIZ = c0200i;
        setIcon(c0200i.getIcon());
        setTitle(c0200i.LIZ((AbstractC138399cwt) this));
        setId(c0200i.getItemId());
        if (c0200i.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setEnabled(c0200i.isEnabled());
        if (c0200i.hasSubMenu() && this.LJI == null) {
            this.LJI = new C138358cwE(this);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean LIZ = LIZ();
        if (LIZ && (i4 = this.LJIIJ) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.LJIIIZ);
        } else {
            i3 = this.LJIIIZ;
        }
        if (mode != 1073741824 && this.LJIIIZ > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!LIZ && this.LJFF != null) {
            super.setPadding((getMeasuredWidth() - this.LJFF.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.LJII = LIZLLL();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843071}, i, 0);
        this.LJIIIZ = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.LJIIJJI = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.LJIIJ = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.LJIIJ = i;
        super.setPadding(i, i2, i3, i4);
    }
}
