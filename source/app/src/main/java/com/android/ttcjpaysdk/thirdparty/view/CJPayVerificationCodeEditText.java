package com.android.ttcjpaysdk.thirdparty.view;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import java.util.ArrayList;
import java.util.List;
import p003X.AbstractC135049c4i;
import p003X.C116971W2r;

/* loaded from: classes17.dex */
public class CJPayVerificationCodeEditText extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public static String LIZIZ = "#FE2C55";
    public List<View> LIZJ;
    public List<View> LIZLLL;

    /* renamed from: LJ */
    public int f25550LJ;
    public int LJFF;
    public boolean LJI;
    public int LJII;
    public Context LJIIIIZZ;
    public List<EditText> LJIIIZ;
    public AbstractC135049c4i LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public float LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public Handler LJIJ;

    public int getCurrentPosition() {
        return this.f25550LJ;
    }

    public int getInputCount() {
        return this.LJII;
    }

    public int getInputSpace() {
        return this.LJIILIIL;
    }

    public int getLineDefaultColor() {
        return this.LJFF;
    }

    public int getLineFocusColor() {
        return this.LJIIJJI;
    }

    public int getLineHeight() {
        return this.LJIIL;
    }

    public int getLineSpace() {
        return this.LJIILJJIL;
    }

    public float getTextSize() {
        return this.LJIILL;
    }

    static {
        Covode.recordClassIndex(9239);
    }

    /* renamed from: LJ */
    private boolean m16023LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        List<EditText> list = this.LJIIIZ;
        if (list == null) {
            return false;
        }
        for (EditText editText : list) {
            if (editText.getText().toString().isEmpty()) {
                return false;
            }
        }
        LIZ(true);
        return true;
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        for (EditText editText : this.LJIIIZ) {
            editText.getText().clear();
        }
        this.f25550LJ = 0;
        if (this.LJIIZILJ) {
            this.LJIIIZ.get(0).requestFocus();
        } else {
            LIZ(this.f25550LJ, false);
        }
        LIZJ();
    }

    public final void LIZJ() {
        Handler handler;
        List<View> list;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported && (handler = this.LJIJ) != null && this.LJIILLIIL) {
            handler.removeMessages(1);
            int i = this.f25550LJ;
            if (i >= 0 && i < this.LJII && (list = this.LIZLLL) != null && list.get(i) != null) {
                this.LIZLLL.get(this.f25550LJ).setVisibility(0);
            }
            postDelayed(new Runnable() { // from class: com.android.ttcjpaysdk.thirdparty.view.CJPayVerificationCodeEditText.3
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(9242);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && CJPayVerificationCodeEditText.this.getContext() != null && !((Activity) CJPayVerificationCodeEditText.this.getContext()).isFinishing() && CJPayVerificationCodeEditText.this.f25550LJ >= 0 && CJPayVerificationCodeEditText.this.f25550LJ < CJPayVerificationCodeEditText.this.LJII && CJPayVerificationCodeEditText.this.LIZLLL != null && CJPayVerificationCodeEditText.this.LIZLLL.get(CJPayVerificationCodeEditText.this.f25550LJ) != null) {
                        CJPayVerificationCodeEditText.this.LIZLLL.get(CJPayVerificationCodeEditText.this.f25550LJ).setVisibility(8);
                    }
                }
            }, 400L);
            Message message = new Message();
            message.what = 1;
            this.LJIJ.sendMessageDelayed(message, 1100L);
        }
    }

    public String getContent() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (this.LJIIIZ == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (EditText editText : this.LJIIIZ) {
            sb.append(editText.getText().toString());
        }
        return sb.toString();
    }

    public int getLastInputPosition() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        List<EditText> list = this.LJIIIZ;
        if (list != null && !list.isEmpty()) {
            int size = this.LJIIIZ.size() - 1;
            while (size >= 0) {
                if (!TextUtils.isEmpty(this.LJIIIZ.get(size).getText().toString())) {
                    if (size < this.LJIIIZ.size() - 1) {
                        size++;
                    }
                    if (this.LJIIZILJ) {
                        this.LJIIIZ.get(size).requestFocus();
                        return size;
                    }
                    LIZ(size, false);
                    return size;
                }
                size--;
            }
        }
        return 0;
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        if (this.LJIIIZ.get(this.f25550LJ).getText().toString().isEmpty()) {
            int i = this.f25550LJ;
            if (i <= 0) {
                return;
            }
            do {
                this.f25550LJ = i;
                if (!this.LJIIIZ.get(i).getText().toString().isEmpty()) {
                    break;
                }
                i--;
            } while (i >= 0);
        }
        if (this.LJIIZILJ) {
            this.LJIIIZ.get(this.f25550LJ).requestFocus();
        } else {
            LIZ(this.f25550LJ, false);
        }
        this.LJIIIZ.get(this.f25550LJ).getText().clear();
        LIZJ();
    }

    private void LIZLLL() {
        int i;
        MethodCollector.m14708i(573);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(573);
        } else if (this.LJII <= 0) {
            MethodCollector.m14707o(573);
        } else {
            this.LJIIIZ = new ArrayList();
            this.LIZJ = new ArrayList();
            this.LIZLLL = new ArrayList();
            setOrientation(0);
            setGravity(17);
            for (int i2 = 0; i2 < this.LJII; i2++) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, CJPayBasicUtils.dipToPX(this.LJIIIIZZ, 50.0f), 1.0f);
                if (i2 == 0) {
                    i = 0;
                } else {
                    i = this.LJIILIIL;
                }
                layoutParams.setMargins(i, 0, 0, 0);
                FrameLayout frameLayout = new FrameLayout(this.LJIIIIZZ);
                frameLayout.setLayoutParams(layoutParams);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                EditText editText = new EditText(this.LJIIIIZZ);
                int i3 = Build.VERSION.SDK_INT;
                editText.setBackground(null);
                editText.setPadding(0, 0, 0, this.LJIILJJIL);
                editText.setMaxLines(1);
                editText.setTextSize(this.LJIILL);
                editText.setTextColor(CastProtectorUtils.parseColor("#222222"));
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(1)});
                editText.setInputType(2);
                editText.setGravity(17);
                editText.setLayoutParams(layoutParams2);
                frameLayout.addView(editText);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, this.LJIIL);
                layoutParams3.gravity = 80;
                View view = new View(this.LJIIIIZZ);
                view.setBackgroundColor(CastProtectorUtils.parseColor("#222222"));
                view.setLayoutParams(layoutParams3);
                frameLayout.addView(view);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(CJPayBasicUtils.dipToPX(this.LJIIIIZZ, 2.0f), -1);
                layoutParams4.gravity = 1;
                layoutParams4.setMargins(0, CJPayBasicUtils.dipToPX(this.LJIIIIZZ, 11.0f), 0, CJPayBasicUtils.dipToPX(this.LJIIIIZZ, 11.0f));
                View view2 = new View(this.LJIIIIZZ);
                view2.setBackgroundColor(CastProtectorUtils.parseColor(LIZIZ));
                view2.setLayoutParams(layoutParams4);
                view2.setVisibility(8);
                frameLayout.addView(view2);
                addView(frameLayout);
                this.LJIIIZ.add(editText);
                this.LIZJ.add(view);
                this.LIZLLL.add(view2);
            }
            View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: com.android.ttcjpaysdk.thirdparty.view.CJPayVerificationCodeEditText.2
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(9241);
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view3, boolean z) {
                    if (PatchProxy.proxy(new Object[]{view3, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    CJPayVerificationCodeEditText.this.LIZ(-1, true);
                }
            };
            for (EditText editText2 : this.LJIIIZ) {
                editText2.setOnFocusChangeListener(onFocusChangeListener);
                editText2.setInputType(0);
            }
            this.LJIIIZ.get(0).requestFocus();
            if (!this.LJIIZILJ) {
                this.LJIIIZ.get(1).setFocusable(false);
                this.LJIIIZ.get(2).setFocusable(false);
                this.LJIIIZ.get(3).setFocusable(false);
                this.LJIIIZ.get(4).setFocusable(false);
                this.LJIIIZ.get(5).setFocusable(false);
            }
            MethodCollector.m14707o(573);
        }
    }

    public void setInputCompleteListener(AbstractC135049c4i abstractC135049c4i) {
        this.LJIIJ = abstractC135049c4i;
    }

    public void setInputCount(int i) {
        this.LJII = i;
    }

    public void setInputSpace(int i) {
        this.LJIILIIL = i;
    }

    public void setLineDefaultColor(int i) {
        this.LJFF = i;
    }

    public void setLineFocusColor(int i) {
        this.LJIIJJI = i;
    }

    public void setLineHeight(int i) {
        this.LJIIL = i;
    }

    public void setLineSpace(int i) {
        this.LJIILJJIL = i;
    }

    public void setTextSize(float f) {
        this.LJIILL = f;
    }

    public CJPayVerificationCodeEditText(Context context) {
        this(context, null);
    }

    public void setAllLineLight(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        this.LJI = z;
        if (this.LJI) {
            for (View view : this.LIZJ) {
                view.setBackgroundColor(this.LJIIJJI);
            }
        }
    }

    public void setUnderlineFocusColor(int i) {
        List<View> list;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 8).isSupported && (list = this.LIZJ) != null && i < list.size()) {
            this.LIZJ.get(i).setBackgroundColor(this.LJIIJJI);
        }
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 3).isSupported) {
            return;
        }
        if (!str.isEmpty() && this.f25550LJ < this.LJIIIZ.size()) {
            this.LJIIIZ.get(this.f25550LJ).setText(str);
        }
        if (!str.isEmpty() && this.f25550LJ < this.LJIIIZ.size() - 1) {
            this.f25550LJ++;
            if (this.LJIIZILJ) {
                this.LJIIIZ.get(this.f25550LJ).requestFocus();
            } else {
                LIZ(this.f25550LJ, false);
            }
        }
        if (m16023LJ() && this.LJIIJ != null) {
            getContent();
        }
    }

    public final void LIZ(boolean z) {
        Handler handler;
        List<View> list;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 11).isSupported || (handler = this.LJIJ) == null) {
            return;
        }
        handler.removeMessages(1);
        int i = this.f25550LJ;
        if (i >= 0 && i < this.LJII && (list = this.LIZLLL) != null && list.get(i) != null) {
            this.LIZLLL.get(this.f25550LJ).setVisibility(8);
        }
        if (z) {
            this.LJIJ.removeCallbacksAndMessages(null);
        }
    }

    public CJPayVerificationCodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZ(int i, boolean z) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 12).isSupported) {
            return;
        }
        for (int i2 = 0; i2 < this.LJIIIZ.size(); i2++) {
            if (!z ? i2 != i : !this.LJIIIZ.get(i2).isFocused()) {
                this.LIZLLL.get(i2).setVisibility(8);
            } else {
                this.f25550LJ = i2;
                if (TextUtils.isEmpty(this.LJIIIZ.get(this.f25550LJ).getText())) {
                    LIZJ();
                } else {
                    LIZ(false);
                }
            }
            if (!this.LJI) {
                this.LIZJ.get(i2).setBackgroundColor(this.LJFF);
            }
        }
        if (!this.LJI && this.LIZJ.get(this.f25550LJ) != null) {
            ObjectAnimator LIZ2 = LIZ(this.LIZJ.get(this.f25550LJ), this.LJFF, this.LJIIJJI);
            LIZ2.addListener(new Animator.AnimatorListener() { // from class: com.android.ttcjpaysdk.thirdparty.view.CJPayVerificationCodeEditText.4
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(9243);
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.proxy(new Object[]{animator}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    for (int i3 = 0; i3 < CJPayVerificationCodeEditText.this.LIZJ.size(); i3++) {
                        if (i3 != CJPayVerificationCodeEditText.this.f25550LJ) {
                            CJPayVerificationCodeEditText.this.LIZJ.get(i3).setBackgroundColor(CJPayVerificationCodeEditText.this.LJFF);
                        }
                    }
                }
            });
            LIZ2.start();
        }
    }

    private ObjectAnimator LIZ(View view, int i, int i2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (ObjectAnimator) proxy.result;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(view, "backgroundColor", i, i2);
        ofInt.setDuration(250L);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        return ofInt;
    }

    public CJPayVerificationCodeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(572);
        this.LJIIJJI = CastProtectorUtils.parseColor("#161823");
        this.LJFF = CastProtectorUtils.parseColor("#1F161823");
        this.LJI = false;
        this.LJII = 6;
        this.LJIILL = 28.0f;
        this.LJIILLIIL = true;
        this.LJIIZILJ = false;
        this.LJIJ = new Handler(new Handler.Callback() { // from class: com.android.ttcjpaysdk.thirdparty.view.CJPayVerificationCodeEditText.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(9240);
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{message}, this, LIZ, false, 1);
                if (proxy.isSupported) {
                    return ((Boolean) proxy.result).booleanValue();
                }
                if (message.what == 1) {
                    CJPayVerificationCodeEditText.this.LIZJ();
                }
                return false;
            }
        });
        this.LJIIIIZZ = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130772064, 2130772065, 2130772069, 2130772072, 2130772077, 2130772078, 2130772097, 2130772098, 2130772099});
        if (obtainStyledAttributes != null) {
            this.LJII = obtainStyledAttributes.getInteger(3, 6);
            this.LJIIL = (int) obtainStyledAttributes.getDimension(7, CJPayBasicUtils.dipToPX(getContext(), 1.0f));
            this.LJIILIIL = (int) obtainStyledAttributes.getDimension(5, CJPayBasicUtils.dipToPX(getContext(), 16.0f));
            this.LJIILJJIL = (int) obtainStyledAttributes.getDimension(8, CJPayBasicUtils.dipToPX(getContext(), 10.0f));
            this.LJIILL = obtainStyledAttributes.getDimension(6, 28.0f);
            this.LJIIJJI = obtainStyledAttributes.getColor(2, C116971W2r.LIZ(getContext(), 2131623985));
            this.LJFF = obtainStyledAttributes.getColor(1, C116971W2r.LIZ(getContext(), 2131624859));
            this.LJIILLIIL = obtainStyledAttributes.getBoolean(0, true);
            this.LJIIZILJ = obtainStyledAttributes.getBoolean(4, false);
            obtainStyledAttributes.recycle();
        }
        LIZLLL();
        MethodCollector.m14707o(572);
    }
}
