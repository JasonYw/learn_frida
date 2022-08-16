package com.android.ttcjpaysdk.bindcard.base.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.p135ui.CJPayInputKeyboardHelper;
import com.android.ttcjpaysdk.base.p135ui.widget.CJPayKeyboardView;
import com.android.ttcjpaysdk.thirdparty.view.CJPayPasteAwareEditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import p003X.AbstractC134545bwa;
import p003X.AbstractC134546bwb;
import p003X.AbstractC134547bwc;
import p003X.AbstractC135263c8A;
import p003X.AbstractView$OnClickListenerC137362cg2;
import p003X.C116971W2r;
import p003X.C135100c5X;
import p003X.C135272c8J;
import p003X.C135851cHe;

/* loaded from: classes17.dex */
public class LabelEditText extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public CJPayPasteAwareEditText LIZIZ;
    public TextView LIZJ;
    public View LIZLLL;

    /* renamed from: LJ */
    public LinearLayout f25476LJ;
    public TextView LJFF;
    public CJPayInputKeyboardHelper LJI;
    public View.OnFocusChangeListener LJII;
    public AbstractC134545bwa LJIIIIZZ;
    public TextWatcher LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public TextView LJIILLIIL;
    public ImageView LJIIZILJ;
    public LinearLayout LJIJ;
    public ImageView LJIJI;
    public TextView LJIJJ;
    public RelativeLayout LJIJJLI;
    public String LJIL;
    public String LJJ;
    public String LJJI;
    public int LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public int LJJIIZ;
    public int LJJIIZI;
    public int LJJIJ;
    public Drawable LJJIJIIJI;
    public Drawable LJJIJIIJIL;
    public boolean LJJIJIL;

    static {
        Covode.recordClassIndex(7191);
    }

    public void setOnInputErrorStatusChangedListener(AbstractC134546bwb abstractC134546bwb) {
    }

    public void setOnRightLabelClickListener(AbstractC134547bwc abstractC134547bwc) {
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        postDelayed(new Runnable() { // from class: com.android.ttcjpaysdk.bindcard.base.view.LabelEditText.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(7193);
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                LabelEditText.this.LIZIZ.requestFocus();
            }
        }, 300L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LIZIZ.clearFocus();
    }

    public Editable getText() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (Editable) proxy.result;
        }
        return this.LIZIZ.mo25203getText();
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        this.LJIILLIIL.setText(this.LJJI);
        this.LJIILLIIL.setTextColor(C135272c8J.LIZ());
        if (this.LJIIJJI) {
            this.LIZLLL.setBackgroundColor(C135272c8J.LIZ());
        } else {
            this.LJIJJLI.setBackgroundDrawable(this.LJJIJIIJIL);
        }
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        if (this.LJIILIIL) {
            CJPayInputKeyboardHelper.hideSystemKeyboard(getContext(), this.LIZIZ);
            return;
        }
        CJPayInputKeyboardHelper.hideCustomKeyboard(getContext(), getCustomKeyboardView(), null);
    }

    /* renamed from: LJ */
    public final void m16058LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            return;
        }
        if (this.LIZIZ.mo25203getText().length() != 0 && this.LIZIZ.hasFocus()) {
            this.LJIIZILJ.setVisibility(0);
        } else {
            this.LJIIZILJ.setVisibility(8);
        }
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LJIILLIIL.setText(this.LJIL);
        this.LJIILLIIL.setTextColor(C116971W2r.LIZ(getContext().getResources(), 2131623986));
        if (this.LJIIJJI) {
            if (this.LIZIZ.hasFocus()) {
                this.LIZLLL.setBackgroundColor(C116971W2r.LIZ(getContext().getResources(), 2131623985));
                return;
            } else {
                this.LIZLLL.setBackgroundColor(C116971W2r.LIZ(getContext().getResources(), 2131624859));
                return;
            }
        }
        this.LJIJJLI.setBackgroundDrawable(this.LJJIJIIJI);
    }

    public CJPayKeyboardView getCustomKeyboardView() {
        MethodCollector.m14708i(458);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
        if (proxy.isSupported) {
            CJPayKeyboardView cJPayKeyboardView = (CJPayKeyboardView) proxy.result;
            MethodCollector.m14707o(458);
            return cJPayKeyboardView;
        }
        FrameLayout frameLayout = (FrameLayout) getRootView().findViewById(16908290);
        int childCount = frameLayout.getChildCount();
        if (childCount > 1) {
            View childAt = frameLayout.getChildAt(childCount - 1);
            if ("caijing_key_borad".equals(childAt.getTag())) {
                CJPayKeyboardView cJPayKeyboardView2 = (CJPayKeyboardView) childAt.findViewById(2131192764);
                MethodCollector.m14707o(458);
                return cJPayKeyboardView2;
            }
        }
        RelativeLayout relativeLayout = (RelativeLayout) C116971W2r.LIZ(LayoutInflater.from(getContext()), 2131690729, (ViewGroup) frameLayout, false);
        relativeLayout.getLayoutParams().height = -2;
        relativeLayout.getLayoutParams().width = -1;
        relativeLayout.setTag("caijing_key_borad");
        frameLayout.addView(relativeLayout);
        frameLayout.invalidate();
        CJPayKeyboardView cJPayKeyboardView3 = (CJPayKeyboardView) relativeLayout.findViewById(2131192764);
        MethodCollector.m14707o(458);
        return cJPayKeyboardView3;
    }

    public void setErrorTips(String str) {
        this.LJJI = str;
    }

    public void setHintText(String str) {
        this.LJJ = str;
    }

    public void setLabelText(String str) {
        this.LJIL = str;
    }

    public void setOnClearListener(AbstractC134545bwa abstractC134545bwa) {
        this.LJIIIIZZ = abstractC134545bwa;
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.LJII = onFocusChangeListener;
    }

    public LabelEditText(Context context) {
        this(context, null);
    }

    public void setOnPasteListener(CJPayPasteAwareEditText.OnPasteListener onPasteListener) {
        if (PatchProxy.proxy(new Object[]{onPasteListener}, this, LIZ, false, 12).isSupported) {
            return;
        }
        this.LIZIZ.setOnPasteListener(onPasteListener);
    }

    public void setSelection(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        this.LIZIZ.setSelection(i);
    }

    public void setText(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 6).isSupported) {
            return;
        }
        this.LIZIZ.setText(str);
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{(byte) 1}, this, LIZ, false, 9).isSupported || !this.LJJIJIL) {
            return;
        }
        this.LJIJ.setVisibility(0);
    }

    public LabelEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void LIZ(Context context, AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, LIZ, false, 20).isSupported) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130773088, 2130773236, 2130773240, 2130773362, 2130773363, 2130773364, 2130773365, 2130773366, 2130773367, 2130773368, 2130773369, 2130773391, 2130773453, 2130773478, 2130773479, 2130773480, 2130773802, 2130774404, 2130774415});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 16) {
                this.LJIIJ = obtainStyledAttributes.getBoolean(index, false);
            } else if (index == 15) {
                this.LJIL = obtainStyledAttributes.getString(index);
            } else if (index == 2) {
                this.LJJ = obtainStyledAttributes.getString(index);
            } else if (index == 14) {
                this.LJJIFFI = obtainStyledAttributes.getDimensionPixelSize(index, -9999);
            } else if (index == 13) {
                this.LJJII = obtainStyledAttributes.getDimensionPixelSize(index, -9999);
            } else if (index == 11) {
                this.LJIIJJI = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == 1) {
                this.LJIIL = obtainStyledAttributes.getBoolean(index, false);
            } else if (index == 5) {
                this.LJJIII = obtainStyledAttributes.getDimensionPixelSize(index, -9999);
            } else if (index == 4) {
                this.LJJIIJ = obtainStyledAttributes.getDimensionPixelSize(index, -9999);
            } else if (index == 7) {
                this.LJJIIJZLJL = obtainStyledAttributes.getDimensionPixelSize(index, -9999);
            } else if (index == 9) {
                this.LJJIIZ = obtainStyledAttributes.getDimensionPixelSize(index, -9999);
            } else if (index == 8) {
                this.LJJIIZI = obtainStyledAttributes.getDimensionPixelSize(index, -9999);
            } else if (index == 6) {
                this.LJJIJ = obtainStyledAttributes.getDimensionPixelSize(index, -9999);
            } else if (index == 3) {
                this.LJJIJIIJI = obtainStyledAttributes.getDrawable(index);
            } else if (index == 10) {
                this.LJJIJIIJIL = obtainStyledAttributes.getDrawable(index);
            } else if (index == 0) {
                this.LJJI = obtainStyledAttributes.getString(index);
            } else if (index == 12) {
                if (obtainStyledAttributes.getInt(index, 0) == 1) {
                    this.LJIILIIL = false;
                }
            } else if (index == 18) {
                this.LJIILL = obtainStyledAttributes.getBoolean(index, false);
            } else if (index == 17) {
                this.LJIILJJIL = obtainStyledAttributes.getBoolean(index, true);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void LIZ(String str, String str2, AbstractView$OnClickListenerC137362cg2 abstractView$OnClickListenerC137362cg2) {
        if (PatchProxy.proxy(new Object[]{str, str2, abstractView$OnClickListenerC137362cg2}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C135851cHe.LIZ(str, this.LJIJI);
        this.LJIJJ.setText(str2);
        this.LJIJ.setOnClickListener(abstractView$OnClickListenerC137362cg2);
        this.LJJIJIL = true;
    }

    public LabelEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(457);
        this.LJIL = "";
        this.LJJ = "";
        this.LJJI = "";
        this.LJJIFFI = -9999;
        this.LJJII = -9999;
        this.LJIIJJI = true;
        this.LJJIII = -9999;
        this.LJJIIJ = -9999;
        this.LJIILIIL = true;
        this.LJIILJJIL = true;
        LIZ(context, attributeSet);
        if (!PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 13).isSupported) {
            setOrientation(0);
            View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(context), 2131690755, (ViewGroup) this, true);
            this.LIZIZ = (CJPayPasteAwareEditText) LIZ2.findViewById(2131174185);
            this.LIZJ = (TextView) LIZ2.findViewById(2131194412);
            this.LJIILLIIL = (TextView) LIZ2.findViewById(2131194467);
            LIZ2.findViewById(2131168088);
            this.LJIIZILJ = (ImageView) LIZ2.findViewById(2131167988);
            this.LJIJ = (LinearLayout) LIZ2.findViewById(2131180292);
            this.LJIJI = (ImageView) LIZ2.findViewById(2131178565);
            this.LJIJJ = (TextView) LIZ2.findViewById(2131193530);
            this.LIZLLL = LIZ2.findViewById(2131172666);
            this.f25476LJ = (LinearLayout) LIZ2.findViewById(2131180423);
            this.LJIJJLI = (RelativeLayout) LIZ2.findViewById(2131169862);
            this.LJFF = (TextView) LIZ2.findViewById(2131166327);
            getRootView().setOnClickListener(new View.OnClickListener() { // from class: com.android.ttcjpaysdk.bindcard.base.view.LabelEditText.3
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(7194);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    LabelEditText.this.LIZIZ.requestFocus();
                    if (LabelEditText.this.LIZIZ.isFocusable() && LabelEditText.this.LIZIZ.isFocusableInTouchMode()) {
                        LabelEditText.this.LJI.showKeyboard(LabelEditText.this.getContext(), LabelEditText.this.LIZIZ);
                    }
                }
            });
            this.LIZIZ.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.android.ttcjpaysdk.bindcard.base.view.LabelEditText.4
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(7195);
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    if (PatchProxy.proxy(new Object[]{view, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    LabelEditText.this.m16058LJ();
                    if (!z) {
                        if (LabelEditText.this.LIZIZ.mo25203getText().length() == 0) {
                            if (LabelEditText.this.LJIIL) {
                                LabelEditText.this.LJFF.setVisibility(0);
                            } else {
                                LabelEditText.this.LIZJ.setVisibility(0);
                            }
                            LabelEditText.this.f25476LJ.setVisibility(4);
                        }
                        LabelEditText.this.LIZLLL.setBackgroundColor(C116971W2r.LIZ(LabelEditText.this.getContext().getResources(), 2131624859));
                    } else {
                        LabelEditText.this.LIZJ.setVisibility(4);
                        LabelEditText.this.LJFF.setVisibility(4);
                        LabelEditText.this.f25476LJ.setVisibility(0);
                        LabelEditText.this.LJI.showKeyboard(LabelEditText.this.getContext(), LabelEditText.this.LIZIZ);
                        LabelEditText labelEditText = LabelEditText.this;
                        if (!PatchProxy.proxy(new Object[0], labelEditText, LabelEditText.LIZ, false, 16).isSupported && labelEditText.LIZIZ.mo25203getText().length() == 0) {
                            labelEditText.LIZJ.setVisibility(4);
                            labelEditText.LJFF.setVisibility(4);
                            if (labelEditText.LJIIJ) {
                                if (!PatchProxy.proxy(new Object[0], labelEditText, LabelEditText.LIZ, false, 17).isSupported) {
                                    labelEditText.f25476LJ.setVisibility(0);
                                    TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 0, labelEditText.f25476LJ.getHeight(), 0, 0.0f);
                                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                                    AnimationSet animationSet = new AnimationSet(true);
                                    animationSet.addAnimation(translateAnimation);
                                    animationSet.addAnimation(alphaAnimation);
                                    animationSet.setDuration(250L);
                                    labelEditText.f25476LJ.startAnimation(animationSet);
                                }
                            } else {
                                labelEditText.f25476LJ.setVisibility(0);
                            }
                        }
                        if (LabelEditText.this.LJIIJJI) {
                            LabelEditText labelEditText2 = LabelEditText.this;
                            if (!PatchProxy.proxy(new Object[0], labelEditText2, LabelEditText.LIZ, false, 19).isSupported) {
                                C135100c5X.LIZ(labelEditText2.LIZLLL, CastProtectorUtils.parseColor("#e8e8e8"), CastProtectorUtils.parseColor("#222222")).start();
                            }
                        }
                    }
                    if (LabelEditText.this.LJII != null) {
                        LabelEditText.this.LJII.onFocusChange(view, z);
                    }
                }
            });
            this.LIZIZ.setOnTouchListener(new View.OnTouchListener() { // from class: com.android.ttcjpaysdk.bindcard.base.view.LabelEditText.5
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(7196);
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, motionEvent}, this, LIZ, false, 1);
                    if (proxy.isSupported) {
                        return ((Boolean) proxy.result).booleanValue();
                    }
                    if (LabelEditText.this.LIZIZ.isFocusable() && LabelEditText.this.LIZIZ.isFocusableInTouchMode()) {
                        LabelEditText.this.LJI.showKeyboard(LabelEditText.this.getContext(), LabelEditText.this.LIZIZ);
                        LabelEditText.this.LIZIZ.requestFocus();
                    }
                    return false;
                }
            });
            this.LIZIZ.addTextChangedListener(new TextWatcher() { // from class: com.android.ttcjpaysdk.bindcard.base.view.LabelEditText.6
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(7197);
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    if (PatchProxy.proxy(new Object[]{editable}, this, LIZ, false, 3).isSupported) {
                        return;
                    }
                    if (LabelEditText.this.LJIIIZ != null) {
                        LabelEditText.this.LJIIIZ.afterTextChanged(editable);
                    }
                    LabelEditText.this.m16058LJ();
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    if (!PatchProxy.proxy(new Object[]{charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 1).isSupported && LabelEditText.this.LJIIIZ != null) {
                        LabelEditText.this.LJIIIZ.beforeTextChanged(charSequence, i2, i3, i4);
                    }
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    if (!PatchProxy.proxy(new Object[]{charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 2).isSupported && LabelEditText.this.LJIIIZ != null) {
                        LabelEditText.this.LJIIIZ.onTextChanged(charSequence, i2, i3, i4);
                    }
                }
            });
            this.LJIIZILJ.setOnClickListener(new View.OnClickListener() { // from class: com.android.ttcjpaysdk.bindcard.base.view.LabelEditText.7
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(7198);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    LabelEditText.this.LIZIZ.setText("");
                }
            });
            this.LIZIZ.changeCursorColor();
            this.LJIILLIIL.setText(this.LJIL);
            this.LIZJ.setText(this.LJJ);
            this.LJFF.setText(this.LJJ);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f25476LJ.getLayoutParams();
            int i2 = this.LJJII;
            if (i2 != -9999) {
                layoutParams.height = i2;
            }
            int i3 = this.LJJIFFI;
            if (i3 != -9999) {
                layoutParams.topMargin = i3;
            }
            if (this.LJIIJJI) {
                this.LIZLLL.setVisibility(0);
            } else {
                this.LIZLLL.setVisibility(8);
                this.LJIJJLI.setBackgroundDrawable(this.LJJIJIIJI);
            }
            if (this.LJIIL) {
                this.LIZJ.setVisibility(8);
                this.LJFF.setVisibility(0);
            } else {
                this.LIZJ.setVisibility(0);
                this.LJFF.setVisibility(8);
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.LJIJJLI.getLayoutParams();
            int i4 = this.LJJIII;
            if (i4 != -9999) {
                layoutParams2.topMargin = i4;
            }
            int i5 = this.LJJIIJ;
            if (i5 != -9999) {
                layoutParams2.height = i5;
            }
            this.LJIJJLI.setPadding(this.LJJIIJZLJL, this.LJJIIZ, this.LJJIIZI, this.LJJIJ);
        }
        post(new Runnable() { // from class: com.android.ttcjpaysdk.bindcard.base.view.LabelEditText.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(7192);
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                final LabelEditText labelEditText = LabelEditText.this;
                if (!PatchProxy.proxy(new Object[0], labelEditText, LabelEditText.LIZ, false, 14).isSupported) {
                    final CJPayKeyboardView customKeyboardView = labelEditText.getCustomKeyboardView();
                    if (labelEditText.LJIILIIL) {
                        labelEditText.LJI = new CJPayInputKeyboardHelper(false, customKeyboardView);
                    } else {
                        labelEditText.LJI = new CJPayInputKeyboardHelper(true, customKeyboardView, labelEditText.LJIILL);
                    }
                    if (labelEditText.LJIILJJIL) {
                        customKeyboardView.showDone();
                        customKeyboardView.setOnDoneListener(new AbstractC135263c8A() { // from class: com.android.ttcjpaysdk.bindcard.base.view.LabelEditText.8
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(7199);
                            }

                            @Override // p003X.AbstractC135263c8A
                            public final void LIZ() {
                                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                    return;
                                }
                                CJPayInputKeyboardHelper.hideCustomKeyboard(LabelEditText.this.getContext(), customKeyboardView, null);
                                LabelEditText.this.post(new Runnable() { // from class: com.android.ttcjpaysdk.bindcard.base.view.LabelEditText.8.1
                                    public static ChangeQuickRedirect LIZ;

                                    static {
                                        Covode.recordClassIndex(7200);
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                            return;
                                        }
                                        LabelEditText.this.LIZIZ.clearFocus();
                                    }
                                });
                            }
                        });
                    }
                    if (labelEditText.LJIILL) {
                        customKeyboardView.showX();
                    }
                }
            }
        });
        MethodCollector.m14707o(457);
    }
}
