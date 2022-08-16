package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import p003X.AbstractC527886tK;
import p003X.C116971W2r;

/* loaded from: classes28.dex */
public final class ViewStubCompat extends View {
    public int LIZ;
    public int LIZIZ;
    public WeakReference<View> LIZJ;
    public LayoutInflater LIZLLL;

    /* renamed from: LJ */
    public AbstractC527886tK f20233LJ;

    static {
        Covode.recordClassIndex(671);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public final int getInflatedId() {
        return this.LIZIZ;
    }

    public final LayoutInflater getLayoutInflater() {
        return this.LIZLLL;
    }

    public final int getLayoutResource() {
        return this.LIZ;
    }

    public final View LIZ() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.LIZ != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.LIZLLL;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View LIZ = C116971W2r.LIZ(layoutInflater, this.LIZ, viewGroup, false);
                int i = this.LIZIZ;
                if (i != -1) {
                    LIZ.setId(i);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(LIZ, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(LIZ, indexOfChild);
                }
                this.LIZJ = new WeakReference<>(LIZ);
                AbstractC527886tK abstractC527886tK = this.f20233LJ;
                if (abstractC527886tK != null) {
                    abstractC527886tK.LIZ(this, LIZ);
                }
                return LIZ;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    public final void setInflatedId(int i) {
        this.LIZIZ = i;
    }

    public final void setLayoutInflater(LayoutInflater layoutInflater) {
        this.LIZLLL = layoutInflater;
    }

    public final void setLayoutResource(int i) {
        this.LIZ = i;
    }

    public final void setOnInflateListener(AbstractC527886tK abstractC527886tK) {
        this.f20233LJ = abstractC527886tK;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        WeakReference<View> weakReference = this.LIZJ;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i != 0 && i != 4) {
            return;
        }
        LIZ();
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842960, 16842994, 16842995}, i, 0);
        this.LIZIZ = obtainStyledAttributes.getResourceId(2, -1);
        this.LIZ = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
