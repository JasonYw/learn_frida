package com.android.ttcjpaysdk.bindcard.base.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.android.ttcjpaysdk.base.theme.widget.CJPayCustomButton;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractView$OnClickListenerC137362cg2;
import p003X.C116971W2r;

/* loaded from: classes17.dex */
public class LoadingButton extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public View.OnClickListener LIZIZ;
    public CJPayCustomButton LIZJ;
    public ProgressBar LIZLLL;

    /* renamed from: LJ */
    public String f25477LJ;
    public int LJFF;
    public float LJI;
    public int LJII;
    public int LJIIIIZZ;

    static {
        Covode.recordClassIndex(7204);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported || this.LIZLLL.getVisibility() == 0) {
            return;
        }
        setEnabled(false);
        this.LIZLLL.setVisibility(0);
        this.LIZJ.setText("");
    }

    public final void LIZIZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported && this.LIZLLL.getVisibility() != 4 && this.LIZLLL.getVisibility() != 8) {
            setEnabled(true);
            this.LIZLLL.setVisibility(4);
            this.LIZJ.setText(this.f25477LJ);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.LIZIZ = onClickListener;
    }

    public LoadingButton(Context context) {
        this(context, null);
    }

    public void setButtonText(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.f25477LJ = str;
        invalidate();
    }

    public void setButtonTextColor(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJFF = i;
        invalidate();
    }

    public void setButtonTextSize(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        this.LJI = i;
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        this.LIZJ.setEnabled(z);
    }

    public void setLoadingHeight(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        this.LJIIIIZZ = i;
        invalidate();
    }

    public void setLoadingWidth(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LJII = i;
        invalidate();
    }

    public LoadingButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void LIZ(Context context, AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, LIZ, false, 10).isSupported) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130772499, 2130772500, 2130772501, 2130773658, 2130773660});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f25477LJ = obtainStyledAttributes.getString(index);
                this.LIZJ.setText(this.f25477LJ);
            } else if (index == 1) {
                this.LJFF = obtainStyledAttributes.getColor(index, -1);
                this.LIZJ.setTextColor(this.LJFF);
            } else if (index == 2) {
                this.LJI = obtainStyledAttributes.getDimension(index, CJPayBasicUtils.sp2px(context, 15.0f));
                this.LIZJ.setTextSize(0, this.LJI);
            } else if (index == 4) {
                this.LJII = (int) obtainStyledAttributes.getDimension(index, CJPayBasicUtils.dipToPX(context, 20.0f));
                this.LIZLLL.getLayoutParams().width = this.LJII;
            } else if (index == 3) {
                this.LJIIIIZZ = (int) obtainStyledAttributes.getDimension(index, CJPayBasicUtils.dipToPX(context, 20.0f));
                this.LIZLLL.getLayoutParams().height = this.LJIIIIZZ;
            }
        }
        obtainStyledAttributes.recycle();
    }

    public LoadingButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(459);
        this.f25477LJ = "";
        if (!PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 9).isSupported) {
            setOrientation(0);
            View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(context), 2131690756, (ViewGroup) this, true);
            this.LIZJ = (CJPayCustomButton) LIZ2.findViewById(2131182052);
            this.LIZLLL = (ProgressBar) LIZ2.findViewById(2131182051);
            this.LIZJ.setOnClickListener(new AbstractView$OnClickListenerC137362cg2() { // from class: com.android.ttcjpaysdk.bindcard.base.view.LoadingButton.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(7205);
                }

                @Override // p003X.AbstractView$OnClickListenerC137362cg2
                public final void doClick(View view) {
                    if (!PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported && LoadingButton.this.LIZIZ != null) {
                        LoadingButton.this.LIZIZ.onClick(LoadingButton.this);
                    }
                }
            });
        }
        LIZ(context, attributeSet);
        MethodCollector.m14707o(459);
    }
}
