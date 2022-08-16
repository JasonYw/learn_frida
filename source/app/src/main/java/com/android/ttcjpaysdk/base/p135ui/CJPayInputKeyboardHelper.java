package com.android.ttcjpaysdk.base.p135ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.p135ui.widget.CJPayKeyboardView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.reflect.Method;
import p003X.AbstractC135262c89;
import p003X.AbstractC135291c8c;
import p003X.AbstractC135808cGx;

/* renamed from: com.android.ttcjpaysdk.base.ui.CJPayInputKeyboardHelper */
/* loaded from: classes17.dex */
public class CJPayInputKeyboardHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static boolean sIsInAnimation;
    public CJPayKeyboardView mCustomKeyboard;
    public AbstractC135291c8c mOnDeleteListener;
    public AbstractC135808cGx mOnShowHideListener;
    public boolean mShowCustomKeyboard;
    public boolean mShowXInKeyboard;

    static {
        Covode.recordClassIndex(6594);
    }

    public void setOnDeleteListener(AbstractC135291c8c abstractC135291c8c) {
        this.mOnDeleteListener = abstractC135291c8c;
    }

    public void setOnExpandCollapseListener(AbstractC135808cGx abstractC135808cGx) {
        this.mOnShowHideListener = abstractC135808cGx;
    }

    public void setShowCustomKeyboard(boolean z) {
        this.mShowCustomKeyboard = z;
    }

    public void setShowXInKeyboard(boolean z) {
        this.mShowXInKeyboard = z;
    }

    public static void hideSystemKeyboard(Context context) {
        View currentFocus;
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 7).isSupported || !(context instanceof Activity)) {
            return;
        }
        Activity activity = (Activity) context;
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null && (currentFocus = activity.getCurrentFocus()) != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
    }

    private void showCustomKeyboardAnimated(Context context) {
        MethodCollector.m14708i(408);
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 8).isSupported) {
            MethodCollector.m14707o(408);
            return;
        }
        CJPayKeyboardView cJPayKeyboardView = this.mCustomKeyboard;
        if (cJPayKeyboardView == null) {
            MethodCollector.m14707o(408);
            return;
        }
        if (this.mShowXInKeyboard) {
            cJPayKeyboardView.showX();
        } else {
            cJPayKeyboardView.hideX();
        }
        if (this.mCustomKeyboard.getVisibility() == 0) {
            MethodCollector.m14707o(408);
            return;
        }
        this.mCustomKeyboard.setVisibility(0);
        sIsInAnimation = true;
        this.mCustomKeyboard.postDelayed(new Runnable(this) { // from class: com.android.ttcjpaysdk.base.ui.CJPayInputKeyboardHelper.2
            static {
                Covode.recordClassIndex(6596);
            }

            @Override // java.lang.Runnable
            public final void run() {
                CJPayInputKeyboardHelper.sIsInAnimation = false;
            }
        }, 500L);
        int i = Build.VERSION.SDK_INT;
        if (CJPayHostInfo.animationResourceMap != null) {
            if (CJPayHostInfo.animationResourceMap.containsKey("TTCJPayKeySlideInFromBottomAnimationResource")) {
                this.mCustomKeyboard.startAnimation(AnimationUtils.loadAnimation(context, CJPayHostInfo.animationResourceMap.get("TTCJPayKeySlideInFromBottomAnimationResource").intValue()));
            }
        } else {
            this.mCustomKeyboard.startAnimation(AnimationUtils.loadAnimation(context, 2130968821));
        }
        AbstractC135808cGx abstractC135808cGx = this.mOnShowHideListener;
        if (abstractC135808cGx != null) {
            abstractC135808cGx.LIZ(true);
        }
        MethodCollector.m14707o(408);
    }

    public CJPayInputKeyboardHelper(boolean z, CJPayKeyboardView cJPayKeyboardView) {
        this(z, cJPayKeyboardView, false);
    }

    public static boolean hideCustomKeyboard(Context context, CJPayKeyboardView cJPayKeyboardView) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, cJPayKeyboardView}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return hideCustomKeyboard(context, cJPayKeyboardView, null);
    }

    public static void showSystemKeyboard(Context context, View view) {
        if (PatchProxy.proxy(new Object[]{context, view}, null, changeQuickRedirect, true, 5).isSupported) {
            return;
        }
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(view, 0);
            }
        } catch (Exception unused) {
        }
    }

    public void showCustomKeyboard(Context context, final EditText editText) {
        if (PatchProxy.proxy(new Object[]{context, editText}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        hideSystemKeyboard(context, editText);
        showCustomKeyboardAnimated(context);
        this.mCustomKeyboard.setOnKeyListener(new AbstractC135262c89() { // from class: com.android.ttcjpaysdk.base.ui.CJPayInputKeyboardHelper.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(6595);
            }

            @Override // p003X.AbstractC135262c89
            public final void LIZ() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
                    return;
                }
                int min = Math.min(editText.getSelectionStart(), editText.getSelectionEnd());
                int max = Math.max(editText.getSelectionStart(), editText.getSelectionEnd());
                if (min >= 0) {
                    if (min != max) {
                        editText.getText().delete(min, max);
                    } else {
                        editText.getText().delete(Math.max(0, min - 1), min);
                    }
                    if (CJPayInputKeyboardHelper.this.mOnDeleteListener != null) {
                        CJPayInputKeyboardHelper.this.mOnDeleteListener.LIZ();
                    }
                }
            }

            @Override // p003X.AbstractC135262c89
            public final void LIZ(String str) {
                if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                int min = Math.min(editText.getSelectionStart(), editText.getSelectionEnd());
                int max = Math.max(editText.getSelectionStart(), editText.getSelectionEnd());
                if (min >= 0) {
                    editText.getText().replace(min, max, str);
                }
            }
        });
    }

    public void showKeyboard(Context context, EditText editText) {
        if (PatchProxy.proxy(new Object[]{context, editText}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        if (this.mShowCustomKeyboard) {
            showCustomKeyboard(context, editText);
            return;
        }
        hideCustomKeyboard(context, this.mCustomKeyboard, this.mOnShowHideListener);
        showSystemKeyboard(context, editText);
    }

    public static void hideSystemKeyboard(Context context, EditText editText) {
        if (PatchProxy.proxy(new Object[]{context, editText}, null, changeQuickRedirect, true, 6).isSupported) {
            return;
        }
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
            }
        } catch (Exception unused) {
        }
        int i = Build.VERSION.SDK_INT;
        try {
            Method method = EditText.class.getMethod("setShowSoftInputOnFocus", Boolean.TYPE);
            method.setAccessible(true);
            method.invoke(editText, Boolean.FALSE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public CJPayInputKeyboardHelper(boolean z, CJPayKeyboardView cJPayKeyboardView, boolean z2) {
        this.mShowCustomKeyboard = z;
        this.mCustomKeyboard = cJPayKeyboardView;
        this.mShowXInKeyboard = z2;
    }

    public static boolean hideCustomKeyboard(Context context, CJPayKeyboardView cJPayKeyboardView, AbstractC135808cGx abstractC135808cGx) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, cJPayKeyboardView, abstractC135808cGx}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (cJPayKeyboardView == null || cJPayKeyboardView.getVisibility() == 8 || cJPayKeyboardView.getAnimation() != null || sIsInAnimation) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return hideCustomKeyboardAnimated(context, cJPayKeyboardView, abstractC135808cGx);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean hideCustomKeyboardAnimated(android.content.Context r7, final com.android.ttcjpaysdk.base.p135ui.widget.CJPayKeyboardView r8, p003X.AbstractC135808cGx r9) {
        /*
            r6 = 409(0x199, float:5.73E-43)
            com.bytedance.frameworks.apm.trace.MethodCollector.m14708i(r6)
            r0 = 3
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r3 = 0
            r5[r3] = r7
            r2 = 1
            r5[r2] = r8
            r0 = 2
            r5[r0] = r9
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.android.ttcjpaysdk.base.p135ui.CJPayInputKeyboardHelper.changeQuickRedirect
            r4 = 0
            r0 = 9
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r5, r4, r1, r2, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r6)
            return r0
        L2a:
            if (r8 == 0) goto L78
            int r1 = r8.getVisibility()
            r0 = 8
            if (r1 == r0) goto L78
            android.view.animation.Animation r0 = r8.getAnimation()
            if (r0 != 0) goto L78
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.android.ttcjpaysdk.base.CJPayHostInfo.animationResourceMap
            if (r0 == 0) goto L70
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.android.ttcjpaysdk.base.CJPayHostInfo.animationResourceMap
            java.lang.String r1 = "TTCJPayKeySlideOutToBottomAnimationResource"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L62
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.android.ttcjpaysdk.base.CJPayHostInfo.animationResourceMap
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r7, r0)
        L58:
            if (r4 == 0) goto L62
            com.android.ttcjpaysdk.base.ui.CJPayInputKeyboardHelper$3 r0 = new com.android.ttcjpaysdk.base.ui.CJPayInputKeyboardHelper$3
            r0.<init>()
            r4.setAnimationListener(r0)
        L62:
            if (r9 == 0) goto L67
            r9.LIZ(r3)
        L67:
            if (r4 == 0) goto L6c
            r8.startAnimation(r4)
        L6c:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r6)
            return r2
        L70:
            r0 = 2130968822(0x7f0400f6, float:1.7546308E38)
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r7, r0)
            goto L58
        L78:
            com.bytedance.frameworks.apm.trace.MethodCollector.m14707o(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.base.p135ui.CJPayInputKeyboardHelper.hideCustomKeyboardAnimated(android.content.Context, com.android.ttcjpaysdk.base.ui.widget.CJPayKeyboardView, X.cGx):boolean");
    }
}
