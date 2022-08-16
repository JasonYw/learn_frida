package androidx.core.view;

import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p003X.AbstractC102155QKv;
import p003X.AbstractC139074d7m;
import p003X.AbstractC139075d7n;
import p003X.C102154QKu;
import p003X.C138357cwD;
import p003X.C138490cyM;
import p003X.C139076d7o;
import p003X.C139082d7u;
import p003X.C70763DvZ;
import p003X.C87021KQt;
import p003X.Q0S;

/* loaded from: classes17.dex */
public class ViewCompat {
    public static final int[] ACCESSIBILITY_ACTIONS_RESOURCE_IDS;
    public static final int LAYER_TYPE_HARDWARE = 2;
    public static final int LAYER_TYPE_NONE = 0;
    public static final int LAYER_TYPE_SOFTWARE = 1;
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;
    public static final int MEASURED_SIZE_MASK = 16777215;
    public static final int MEASURED_STATE_MASK = -16777216;
    public static final int MEASURED_STATE_TOO_SMALL = 16777216;
    public static final int OVER_SCROLL_ALWAYS = 0;
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
    public static final int OVER_SCROLL_NEVER = 2;
    public static boolean sAccessibilityDelegateCheckFailed;
    public static Field sAccessibilityDelegateField;
    public static Q0S sAccessibilityPaneVisibilityManager;
    public static Method sChildrenDrawingOrderMethod;
    public static Method sDispatchFinishTemporaryDetach;
    public static Method sDispatchStartTemporaryDetach;
    public static Field sMinHeightField;
    public static boolean sMinHeightFieldFetched;
    public static Field sMinWidthField;
    public static boolean sMinWidthFieldFetched;
    public static final AtomicInteger sNextGeneratedId;
    public static boolean sTempDetachBound;
    public static ThreadLocal<Rect> sThreadLocalRect;
    public static WeakHashMap<View, String> sTransitionNameMap;
    public static WeakHashMap<View, ViewPropertyAnimatorCompat> sViewPropertyAnimatorMap;

    public static AbstractC139074d7m<Boolean> accessibilityHeadingProperty() {
        return new AbstractC139074d7m<Boolean>(2131191454, Boolean.class, 28) { // from class: androidx.core.view.ViewCompat.5
            static {
                Covode.recordClassIndex(1085);
            }

            @Override // p003X.AbstractC139074d7m
            public final /* synthetic */ Boolean LIZ(View view) {
                return Boolean.valueOf(view.isAccessibilityHeading());
            }

            @Override // p003X.AbstractC139074d7m
            public final /* synthetic */ void LIZ(View view, Boolean bool) {
                view.setAccessibilityHeading(bool.booleanValue());
            }

            @Override // p003X.AbstractC139074d7m
            public final /* bridge */ /* synthetic */ boolean LIZ(Boolean bool, Boolean bool2) {
                if (!AbstractC139074d7m.LIZ(bool, bool2)) {
                    return true;
                }
                return false;
            }

            {
                super(2131191454, r4, 28);
            }
        };
    }

    public static int generateViewId() {
        int i = Build.VERSION.SDK_INT;
        return View.generateViewId();
    }

    public static AbstractC139074d7m<CharSequence> paneTitleProperty() {
        return new AbstractC139074d7m<CharSequence>(2131191455, CharSequence.class, 8, 28) { // from class: androidx.core.view.ViewCompat.4
            static {
                Covode.recordClassIndex(1084);
            }

            @Override // p003X.AbstractC139074d7m
            public final /* synthetic */ CharSequence LIZ(View view) {
                return view.getAccessibilityPaneTitle();
            }

            @Override // p003X.AbstractC139074d7m
            public final /* synthetic */ void LIZ(View view, CharSequence charSequence) {
                view.setAccessibilityPaneTitle(charSequence);
            }

            @Override // p003X.AbstractC139074d7m
            public final /* synthetic */ boolean LIZ(CharSequence charSequence, CharSequence charSequence2) {
                if (!TextUtils.equals(charSequence, charSequence2)) {
                    return true;
                }
                return false;
            }

            {
                super(2131191455, r5, 28, (byte) 0);
            }
        };
    }

    public static AbstractC139074d7m<Boolean> screenReaderFocusableProperty() {
        return new AbstractC139074d7m<Boolean>(2131191505, Boolean.class, 28) { // from class: androidx.core.view.ViewCompat.3
            static {
                Covode.recordClassIndex(1083);
            }

            @Override // p003X.AbstractC139074d7m
            public final /* synthetic */ Boolean LIZ(View view) {
                return Boolean.valueOf(view.isScreenReaderFocusable());
            }

            @Override // p003X.AbstractC139074d7m
            public final /* synthetic */ void LIZ(View view, Boolean bool) {
                view.setScreenReaderFocusable(bool.booleanValue());
            }

            @Override // p003X.AbstractC139074d7m
            public final /* bridge */ /* synthetic */ boolean LIZ(Boolean bool, Boolean bool2) {
                if (!AbstractC139074d7m.LIZ(bool, bool2)) {
                    return true;
                }
                return false;
            }

            {
                super(2131191505, r4, 28);
            }
        };
    }

    public static void bindTempDetach() {
        try {
            sDispatchStartTemporaryDetach = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            sDispatchFinishTemporaryDetach = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException unused) {
        }
        sTempDetachBound = true;
    }

    public static Rect getEmptyTempRect() {
        if (sThreadLocalRect == null) {
            sThreadLocalRect = new ThreadLocal<>();
        }
        Rect rect = sThreadLocalRect.get();
        if (rect == null) {
            rect = new Rect();
            sThreadLocalRect.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(1080);
        sNextGeneratedId = new AtomicInteger(1);
        sViewPropertyAnimatorMap = null;
        sAccessibilityDelegateCheckFailed = false;
        ACCESSIBILITY_ACTIONS_RESOURCE_IDS = new int[]{2131165728, 2131165729, 2131165740, 2131165751, 2131165754, 2131165755, 2131165756, 2131165757, 2131165758, 2131165759, 2131165730, 2131165731, 2131165732, 2131165733, 2131165734, 2131165735, 2131165736, 2131165737, 2131165738, 2131165739, 2131165741, 2131165742, 2131165743, 2131165744, 2131165745, 2131165746, 2131165747, 2131165748, 2131165749, 2131165750, 2131165752, 2131165753};
        sAccessibilityPaneVisibilityManager = new Q0S();
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(1080);
        sNextGeneratedId = new AtomicInteger(1);
        sViewPropertyAnimatorMap = null;
        sAccessibilityDelegateCheckFailed = false;
        ACCESSIBILITY_ACTIONS_RESOURCE_IDS = new int[]{2131165728, 2131165729, 2131165740, 2131165751, 2131165754, 2131165755, 2131165756, 2131165757, 2131165758, 2131165759, 2131165730, 2131165731, 2131165732, 2131165733, 2131165734, 2131165735, 2131165736, 2131165737, 2131165738, 2131165739, 2131165741, 2131165742, 2131165743, 2131165744, 2131165745, 2131165746, 2131165747, 2131165748, 2131165749, 2131165750, 2131165752, 2131165753};
        sAccessibilityPaneVisibilityManager = new Q0S();
    }

    public static void jumpDrawablesToCurrentState(View view) {
        view.jumpDrawablesToCurrentState();
    }

    public static void enableAccessibleClickableSpanSupport(View view) {
        int i = Build.VERSION.SDK_INT;
        getOrCreateAccessibilityDelegateCompat(view);
    }

    public static float getAlpha(View view) {
        return view.getAlpha();
    }

    public static int getLayerType(View view) {
        return view.getLayerType();
    }

    public static Matrix getMatrix(View view) {
        return view.getMatrix();
    }

    public static int getMeasuredHeightAndState(View view) {
        return view.getMeasuredHeightAndState();
    }

    public static int getMeasuredState(View view) {
        return view.getMeasuredState();
    }

    public static int getMeasuredWidthAndState(View view) {
        return view.getMeasuredWidthAndState();
    }

    public static int getOverScrollMode(View view) {
        return view.getOverScrollMode();
    }

    public static float getPivotX(View view) {
        return view.getPivotX();
    }

    public static float getPivotY(View view) {
        return view.getPivotY();
    }

    public static float getRotation(View view) {
        return view.getRotation();
    }

    public static float getRotationX(View view) {
        return view.getRotationX();
    }

    public static float getRotationY(View view) {
        return view.getRotationY();
    }

    public static float getScaleX(View view) {
        return view.getScaleX();
    }

    public static float getScaleY(View view) {
        return view.getScaleY();
    }

    public static float getTranslationX(View view) {
        return view.getTranslationX();
    }

    public static float getTranslationY(View view) {
        return view.getTranslationY();
    }

    public static float getX(View view) {
        return view.getX();
    }

    public static float getY(View view) {
        return view.getY();
    }

    public static boolean isOpaque(View view) {
        return view.isOpaque();
    }

    public static void postInvalidateOnAnimation(View view) {
        int i = Build.VERSION.SDK_INT;
        view.postInvalidateOnAnimation();
    }

    public static void requestApplyInsets(View view) {
        int i = Build.VERSION.SDK_INT;
        view.requestApplyInsets();
    }

    public static void stopNestedScroll(View view) {
        int i = Build.VERSION.SDK_INT;
        view.stopNestedScroll();
    }

    public static void cancelDragAndDrop(View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.cancelDragAndDrop();
        }
    }

    public static View.AccessibilityDelegate getAccessibilityDelegateInternal(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        return getAccessibilityDelegateThroughReflection(view);
    }

    public static int getAccessibilityLiveRegion(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getAccessibilityLiveRegion();
    }

    public static CharSequence getAccessibilityPaneTitle(View view) {
        return paneTitleProperty().LIZIZ(view);
    }

    public static ColorStateList getBackgroundTintList(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode getBackgroundTintMode(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getBackgroundTintMode();
    }

    public static Rect getClipBounds(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getClipBounds();
    }

    public static Display getDisplay(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getDisplay();
    }

    public static float getElevation(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getElevation();
    }

    public static boolean getFitsSystemWindows(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getFitsSystemWindows();
    }

    public static int getImportantForAccessibility(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getImportantForAccessibility();
    }

    public static int getImportantForAutofill(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static int getLabelFor(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getLabelFor();
    }

    public static int getLayoutDirection(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getLayoutDirection();
    }

    public static int getMinimumHeight(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getMinimumHeight();
    }

    public static int getMinimumWidth(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getMinimumWidth();
    }

    public static int getNextClusterForwardId(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getNextClusterForwardId();
        }
        return -1;
    }

    public static AccessibilityDelegateCompat getOrCreateAccessibilityDelegateCompat(View view) {
        AccessibilityDelegateCompat accessibilityDelegate = getAccessibilityDelegate(view);
        if (accessibilityDelegate == null) {
            accessibilityDelegate = new AccessibilityDelegateCompat();
        }
        setAccessibilityDelegate(view, accessibilityDelegate);
        return accessibilityDelegate;
    }

    public static int getPaddingEnd(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getPaddingEnd();
    }

    public static int getPaddingStart(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getPaddingStart();
    }

    public static ViewParent getParentForAccessibility(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getParentForAccessibility();
    }

    public static int getScrollIndicators(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return view.getScrollIndicators();
        }
        return 0;
    }

    public static List<Rect> getSystemGestureExclusionRects(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getSystemGestureExclusionRects();
        }
        return Collections.emptyList();
    }

    public static String getTransitionName(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getTransitionName();
    }

    public static float getTranslationZ(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getTranslationZ();
    }

    public static int getWindowSystemUiVisibility(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getWindowSystemUiVisibility();
    }

    public static float getZ(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getZ();
    }

    public static boolean hasAccessibilityDelegate(View view) {
        if (getAccessibilityDelegateInternal(view) != null) {
            return true;
        }
        return false;
    }

    public static boolean hasExplicitFocusable(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.hasExplicitFocusable();
        }
        return view.hasFocusable();
    }

    public static boolean hasNestedScrollingParent(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.hasNestedScrollingParent();
    }

    public static boolean hasOnClickListeners(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.hasOnClickListeners();
    }

    public static boolean hasOverlappingRendering(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.hasOverlappingRendering();
    }

    public static boolean hasTransientState(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.hasTransientState();
    }

    public static boolean isAttachedToWindow(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isAttachedToWindow();
    }

    public static boolean isFocusedByDefault(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.isFocusedByDefault();
        }
        return false;
    }

    public static boolean isImportantForAccessibility(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isImportantForAccessibility();
    }

    public static boolean isImportantForAutofill(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.isImportantForAutofill();
        }
        return true;
    }

    public static boolean isInLayout(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isInLayout();
    }

    public static boolean isKeyboardNavigationCluster(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.isKeyboardNavigationCluster();
        }
        return false;
    }

    public static boolean isLaidOut(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isLaidOut();
    }

    public static boolean isLayoutDirectionResolved(View view) {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        return view.isLayoutDirectionResolved();
    }

    public static boolean isNestedScrollingEnabled(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isNestedScrollingEnabled();
    }

    public static boolean isPaddingRelative(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isPaddingRelative();
    }

    public static boolean restoreDefaultFocus(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.restoreDefaultFocus();
        }
        return view.requestFocus();
    }

    public static void tickleInvalidationFlag(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static ViewPropertyAnimatorCompat animate(View view) {
        if (sViewPropertyAnimatorMap == null) {
            sViewPropertyAnimatorMap = new WeakHashMap<>();
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = sViewPropertyAnimatorMap.get(view);
        if (viewPropertyAnimatorCompat == null) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = new ViewPropertyAnimatorCompat(view);
            sViewPropertyAnimatorMap.put(view, viewPropertyAnimatorCompat2);
            return viewPropertyAnimatorCompat2;
        }
        return viewPropertyAnimatorCompat;
    }

    public static void dispatchFinishTemporaryDetach(View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.dispatchFinishTemporaryDetach();
            return;
        }
        if (!sTempDetachBound) {
            bindTempDetach();
        }
        Method method = sDispatchFinishTemporaryDetach;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        view.onFinishTemporaryDetach();
    }

    public static void dispatchStartTemporaryDetach(View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.dispatchStartTemporaryDetach();
            return;
        }
        if (!sTempDetachBound) {
            bindTempDetach();
        }
        Method method = sDispatchStartTemporaryDetach;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        view.onStartTemporaryDetach();
    }

    public static AccessibilityDelegateCompat getAccessibilityDelegate(View view) {
        View.AccessibilityDelegate accessibilityDelegateInternal = getAccessibilityDelegateInternal(view);
        if (accessibilityDelegateInternal == null) {
            return null;
        }
        if (accessibilityDelegateInternal instanceof C139076d7o) {
            return ((C139076d7o) accessibilityDelegateInternal).LIZ;
        }
        return new AccessibilityDelegateCompat(accessibilityDelegateInternal);
    }

    public static C139082d7u getAccessibilityNodeProvider(View view) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeProvider accessibilityNodeProvider = view.getAccessibilityNodeProvider();
        if (accessibilityNodeProvider != null) {
            return new C139082d7u(accessibilityNodeProvider);
        }
        return null;
    }

    public static List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> getActionList(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(2131191452);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(2131191452, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static WindowInsetsCompat getRootWindowInsets(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return WindowInsetsCompat.toWindowInsetsCompat(C87021KQt.LIZ(view));
        }
        return null;
    }

    public static boolean isAccessibilityHeading(View view) {
        Boolean LIZIZ = accessibilityHeadingProperty().LIZIZ(view);
        if (LIZIZ == null) {
            return false;
        }
        return LIZIZ.booleanValue();
    }

    public static boolean isScreenReaderFocusable(View view) {
        Boolean LIZIZ = screenReaderFocusableProperty().LIZIZ(view);
        if (LIZIZ == null) {
            return false;
        }
        return LIZIZ.booleanValue();
    }

    public static View.AccessibilityDelegate getAccessibilityDelegateThroughReflection(View view) {
        if (sAccessibilityDelegateCheckFailed) {
            return null;
        }
        if (sAccessibilityDelegateField == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                sAccessibilityDelegateField = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                sAccessibilityDelegateCheckFailed = true;
                return null;
            }
        }
        try {
            Object obj = sAccessibilityDelegateField.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        } catch (Throwable unused2) {
            sAccessibilityDelegateCheckFailed = true;
            return null;
        }
    }

    public static int getAvailableActionIdFromResources(View view) {
        boolean z;
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = getActionList(view);
        int i = 0;
        int i2 = -1;
        while (true) {
            int[] iArr = ACCESSIBILITY_ACTIONS_RESOURCE_IDS;
            if (i >= iArr.length || i2 != -1) {
                break;
            }
            int i3 = iArr[i];
            boolean z2 = true;
            for (int i4 = 0; i4 < actionList.size(); i4++) {
                if (actionList.get(i4).getId() != i3) {
                    z = true;
                } else {
                    z = false;
                }
                z2 &= z;
            }
            if (z2) {
                i2 = i3;
            }
            i++;
        }
        return i2;
    }

    public static void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public static void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    public static void setActivated(View view, boolean z) {
        view.setActivated(z);
    }

    public static void setAlpha(View view, float f) {
        view.setAlpha(f);
    }

    public static void setFitsSystemWindows(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    public static void setOverScrollMode(View view, int i) {
        view.setOverScrollMode(i);
    }

    public static void setPivotX(View view, float f) {
        view.setPivotX(f);
    }

    public static void setPivotY(View view, float f) {
        view.setPivotY(f);
    }

    public static void setRotation(View view, float f) {
        view.setRotation(f);
    }

    public static void setRotationX(View view, float f) {
        view.setRotationX(f);
    }

    public static void setRotationY(View view, float f) {
        view.setRotationY(f);
    }

    public static void setSaveFromParentEnabled(View view, boolean z) {
        view.setSaveFromParentEnabled(z);
    }

    public static void setScaleX(View view, float f) {
        view.setScaleX(f);
    }

    public static void setScaleY(View view, float f) {
        view.setScaleY(f);
    }

    public static void setTranslationX(View view, float f) {
        view.setTranslationX(f);
    }

    public static void setTranslationY(View view, float f) {
        view.setTranslationY(f);
    }

    public static void setX(View view, float f) {
        view.setX(f);
    }

    public static void setY(View view, float f) {
        view.setY(f);
    }

    public static boolean canScrollHorizontally(View view, int i) {
        return view.canScrollHorizontally(i);
    }

    public static boolean canScrollVertically(View view, int i) {
        return view.canScrollVertically(i);
    }

    public static int combineMeasuredStates(int i, int i2) {
        return View.combineMeasuredStates(i, i2);
    }

    public static void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat.unwrap());
    }

    public static void postOnAnimation(View view, Runnable runnable) {
        int i = Build.VERSION.SDK_INT;
        view.postOnAnimation(runnable);
    }

    public static void setAccessibilityLiveRegion(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        view.setAccessibilityLiveRegion(i);
    }

    public static void setBackground(View view, Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        view.setBackground(drawable);
    }

    public static void setClipBounds(View view, Rect rect) {
        int i = Build.VERSION.SDK_INT;
        view.setClipBounds(rect);
    }

    public static void setElevation(View view, float f) {
        int i = Build.VERSION.SDK_INT;
        view.setElevation(f);
    }

    public static void setHasTransientState(View view, boolean z) {
        int i = Build.VERSION.SDK_INT;
        view.setHasTransientState(z);
    }

    public static void setImportantForAccessibility(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        view.setImportantForAccessibility(i);
    }

    public static void setLabelFor(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        view.setLabelFor(i);
    }

    public static void setLayerPaint(View view, Paint paint) {
        int i = Build.VERSION.SDK_INT;
        view.setLayerPaint(paint);
    }

    public static void setLayoutDirection(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        view.setLayoutDirection(i);
    }

    public static void setNestedScrollingEnabled(View view, boolean z) {
        int i = Build.VERSION.SDK_INT;
        view.setNestedScrollingEnabled(z);
    }

    public static void setTransitionName(View view, String str) {
        int i = Build.VERSION.SDK_INT;
        view.setTransitionName(str);
    }

    public static void setTranslationZ(View view, float f) {
        int i = Build.VERSION.SDK_INT;
        view.setTranslationZ(f);
    }

    public static void setZ(View view, float f) {
        int i = Build.VERSION.SDK_INT;
        view.setZ(f);
    }

    public static void removeAccessibilityAction(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        removeActionWithId(i, view);
        notifyViewAccessibilityStateChangedIfNeeded(view, 0);
    }

    public static void setAccessibilityHeading(View view, boolean z) {
        accessibilityHeadingProperty().LIZIZ(view, Boolean.valueOf(z));
    }

    public static void setAutofillHints(View view, String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setAutofillHints(strArr);
        }
    }

    public static void setFocusedByDefault(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setFocusedByDefault(z);
        }
    }

    public static void setImportantForAutofill(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    public static void setKeyboardNavigationCluster(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setKeyboardNavigationCluster(z);
        }
    }

    public static void setNextClusterForwardId(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setNextClusterForwardId(i);
        }
    }

    public static void setScreenReaderFocusable(View view, boolean z) {
        screenReaderFocusableProperty().LIZIZ(view, Boolean.valueOf(z));
    }

    public static void setScrollIndicators(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i);
        }
    }

    public static void setSystemGestureExclusionRects(View view, List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    public static void setTooltipText(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        }
    }

    public static boolean startNestedScroll(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return view.startNestedScroll(i);
    }

    public static void stopNestedScroll(View view, int i) {
        if (view instanceof AbstractC139075d7n) {
            ((AbstractC139075d7n) view).stopNestedScroll(i);
        } else if (i == 0) {
            stopNestedScroll(view);
        }
    }

    public static void updateDragShadow(View view, View.DragShadowBuilder dragShadowBuilder) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    public static void addAccessibilityAction(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat) {
        int i = Build.VERSION.SDK_INT;
        getOrCreateAccessibilityDelegateCompat(view);
        removeActionWithId(accessibilityActionCompat.getId(), view);
        getActionList(view).add(accessibilityActionCompat);
        notifyViewAccessibilityStateChangedIfNeeded(view, 0);
    }

    public static void compatOffsetLeftAndRight(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            tickleInvalidationFlag(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                tickleInvalidationFlag((View) parent);
            }
        }
    }

    public static void compatOffsetTopAndBottom(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            tickleInvalidationFlag(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                tickleInvalidationFlag((View) parent);
            }
        }
    }

    public static WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = Build.VERSION.SDK_INT;
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null && !view.dispatchApplyWindowInsets(windowInsets).equals(windowInsets)) {
            return WindowInsetsCompat.toWindowInsetsCompat(windowInsets);
        }
        return windowInsetsCompat;
    }

    public static boolean hasNestedScrollingParent(View view, int i) {
        if (view instanceof AbstractC139075d7n) {
            ((AbstractC139075d7n) view).hasNestedScrollingParent(i);
            return false;
        } else if (i != 0) {
            return false;
        } else {
            return hasNestedScrollingParent(view);
        }
    }

    public static WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = Build.VERSION.SDK_INT;
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
            if (!onApplyWindowInsets.equals(windowInsets)) {
                return WindowInsetsCompat.toWindowInsetsCompat(onApplyWindowInsets);
            }
        }
        return windowInsetsCompat;
    }

    public static void removeActionWithId(int i, View view) {
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = getActionList(view);
        for (int i2 = 0; i2 < actionList.size(); i2++) {
            if (actionList.get(i2).getId() == i) {
                actionList.remove(i2);
                return;
            }
        }
    }

    public static <T extends View> T requireViewById(View view, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) view.requireViewById(i);
        }
        T t = (T) view.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilityDelegateCompat) {
        View.AccessibilityDelegate bridge;
        if (accessibilityDelegateCompat == null) {
            if (getAccessibilityDelegateInternal(view) instanceof C139076d7o) {
                accessibilityDelegateCompat = new AccessibilityDelegateCompat();
            } else {
                bridge = null;
                view.setAccessibilityDelegate(bridge);
            }
        }
        bridge = accessibilityDelegateCompat.getBridge();
        view.setAccessibilityDelegate(bridge);
    }

    public static void setOnApplyWindowInsetsListener(View view, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        int i = Build.VERSION.SDK_INT;
        if (onApplyWindowInsetsListener == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.ViewCompat.1
                static {
                    if (ReDexClinitStringAb.abTest >= 5) {
                        Covode.recordClassIndex(1081);
                    } else {
                        Covode.recordClassIndex(1081);
                    }
                }

                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    return OnApplyWindowInsetsListener.this.onApplyWindowInsets(view2, WindowInsetsCompat.toWindowInsetsCompat(windowInsets)).toWindowInsets();
                }
            });
        }
    }

    public static void setPointerIcon(View view, C138357cwD c138357cwD) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 24) {
            if (c138357cwD != null) {
                obj = c138357cwD.LIZ;
            } else {
                obj = null;
            }
            view.setPointerIcon((PointerIcon) obj);
        }
    }

    public static boolean dispatchUnhandledKeyEventBeforeCallback(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        C102154QKu LIZ = C102154QKu.LIZ(view);
        if (keyEvent.getAction() == 0) {
            LIZ.LIZIZ();
        }
        View LIZ2 = LIZ.LIZ(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (LIZ2 != null) {
                if (!KeyEvent.isModifierKey(keyCode)) {
                    LIZ.LIZ().put(keyCode, new WeakReference<>(LIZ2));
                    return true;
                }
                return true;
            }
        } else if (LIZ2 != null) {
            return true;
        }
        return false;
    }

    public static void setAccessibilityPaneTitle(View view, CharSequence charSequence) {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        paneTitleProperty().LIZIZ(view, charSequence);
        if (charSequence != null) {
            Q0S q0s = sAccessibilityPaneVisibilityManager;
            WeakHashMap<View, Boolean> weakHashMap = q0s.LIZ;
            if (view.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(q0s);
            if (view.isAttachedToWindow()) {
                q0s.LIZ(view);
                return;
            }
            return;
        }
        Q0S q0s2 = sAccessibilityPaneVisibilityManager;
        q0s2.LIZ.remove(view);
        view.removeOnAttachStateChangeListener(q0s2);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(q0s2);
    }

    public static void setBackgroundTintList(View view, ColorStateList colorStateList) {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        view.setBackgroundTintList(colorStateList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            if (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) {
                z = false;
            } else {
                z = true;
            }
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    public static void setBackgroundTintMode(View view, PorterDuff.Mode mode) {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        view.setBackgroundTintMode(mode);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            if (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) {
                z = false;
            } else {
                z = true;
            }
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    public static void setChildrenDrawingOrderEnabled(ViewGroup viewGroup, boolean z) {
        if (sChildrenDrawingOrderMethod == null) {
            try {
                sChildrenDrawingOrderMethod = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            sChildrenDrawingOrderMethod.setAccessible(true);
        }
        try {
            sChildrenDrawingOrderMethod.invoke(viewGroup, Boolean.valueOf(z));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
        }
    }

    public static void addOnUnhandledKeyEventListener(View view, final AbstractC102155QKv abstractC102155QKv) {
        if (Build.VERSION.SDK_INT >= 28) {
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(2131191520);
            if (simpleArrayMap == null) {
                simpleArrayMap = new SimpleArrayMap();
                view.setTag(2131191520, simpleArrayMap);
            }
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.ViewCompat.2
                static {
                    Covode.recordClassIndex(1082);
                }

                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return AbstractC102155QKv.this.LIZ();
                }
            };
            simpleArrayMap.put(abstractC102155QKv, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(2131191520);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(2131191520, arrayList);
        }
        arrayList.add(abstractC102155QKv);
        if (arrayList.size() == 1) {
            C102154QKu.LIZIZ(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        r1 = r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (isAttachedToWindow(r1) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        p003X.C102154QKu.LIZIZ(r1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
        if (r0 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean dispatchUnhandledKeyEventBeforeHierarchy(android.view.View r5, android.view.KeyEvent r6) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r0 = 28
            if (r1 < r0) goto L8
            return r4
        L8:
            X.QKu r1 = p003X.C102154QKu.LIZ(r5)
            java.lang.ref.WeakReference<android.view.KeyEvent> r0 = r1.LIZIZ
            if (r0 == 0) goto L18
            java.lang.ref.WeakReference<android.view.KeyEvent> r0 = r1.LIZIZ
            java.lang.Object r0 = r0.get()
            if (r0 == r6) goto L5e
        L18:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r6)
            r1.LIZIZ = r0
            r0 = 0
            android.util.SparseArray r3 = r1.LIZ()
            int r0 = r6.getAction()
            r2 = 1
            if (r0 != r2) goto L40
            int r0 = r6.getKeyCode()
            int r1 = r3.indexOfKey(r0)
            if (r1 < 0) goto L40
            java.lang.Object r0 = r3.valueAt(r1)
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            r3.removeAt(r1)
            if (r0 != 0) goto L4c
        L40:
            int r0 = r6.getKeyCode()
            java.lang.Object r0 = r3.get(r0)
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            if (r0 == 0) goto L5e
        L4c:
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L5d
            boolean r0 = isAttachedToWindow(r1)
            if (r0 == 0) goto L5d
            p003X.C102154QKu.LIZIZ(r1, r6)
        L5d:
            return r2
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewCompat.dispatchUnhandledKeyEventBeforeHierarchy(android.view.View, android.view.KeyEvent):boolean");
    }

    public static void notifyViewAccessibilityStateChangedIfNeeded(View view, int i) {
        boolean z;
        int i2;
        if (!((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        if (getAccessibilityPaneTitle(view) != null) {
            z = true;
        } else {
            z = false;
        }
        if (getAccessibilityLiveRegion(view) != 0 || (z && view.getVisibility() == 0)) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            if (z) {
                i2 = 32;
            } else {
                i2 = AccessibilityEventCompat.TYPE_WINDOW_CONTENT_CHANGED;
            }
            obtain.setEventType(i2);
            obtain.setContentChangeTypes(i);
            view.sendAccessibilityEventUnchecked(obtain);
        } else if (view.getParent() != null) {
            try {
                view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
            } catch (AbstractMethodError unused) {
            }
        }
    }

    public static void offsetLeftAndRight(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        Rect emptyTempRect = getEmptyTempRect();
        boolean z = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            emptyTempRect.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !emptyTempRect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        compatOffsetLeftAndRight(view, i);
        if (z && emptyTempRect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(emptyTempRect);
        }
    }

    public static void offsetTopAndBottom(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        Rect emptyTempRect = getEmptyTempRect();
        boolean z = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            emptyTempRect.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !emptyTempRect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        compatOffsetTopAndBottom(view, i);
        if (z && emptyTempRect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(emptyTempRect);
        }
    }

    public static void removeOnUnhandledKeyEventListener(View view, AbstractC102155QKv abstractC102155QKv) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        if (Build.VERSION.SDK_INT >= 28) {
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(2131191520);
            if (simpleArrayMap != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) simpleArrayMap.get(abstractC102155QKv)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
                return;
            }
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(2131191520);
        if (arrayList != null) {
            arrayList.remove(abstractC102155QKv);
            if (arrayList.size() == 0) {
                synchronized (C102154QKu.LIZ) {
                    for (int i = 0; i < C102154QKu.LIZ.size(); i++) {
                        if (C102154QKu.LIZ.get(i).get() == view) {
                            C102154QKu.LIZ.remove(i);
                            return;
                        }
                    }
                }
            }
        }
    }

    public static void setLayerType(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    public static void postOnAnimationDelayed(View view, Runnable runnable, long j) {
        int i = Build.VERSION.SDK_INT;
        view.postOnAnimationDelayed(runnable, j);
    }

    public static int resolveSizeAndState(int i, int i2, int i3) {
        return View.resolveSizeAndState(i, i2, i3);
    }

    public static int addAccessibilityAction(View view, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
        int availableActionIdFromResources = getAvailableActionIdFromResources(view);
        if (availableActionIdFromResources != -1) {
            addAccessibilityAction(view, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(availableActionIdFromResources, charSequence, accessibilityViewCommand));
        }
        return availableActionIdFromResources;
    }

    public static void addKeyboardNavigationClusters(View view, Collection<View> collection, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.addKeyboardNavigationClusters(collection, i);
        }
    }

    public static WindowInsetsCompat computeSystemWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
        int i = Build.VERSION.SDK_INT;
        return C138490cyM.LIZ(view, windowInsetsCompat, rect);
    }

    public static boolean dispatchNestedPreFling(View view, float f, float f2) {
        int i = Build.VERSION.SDK_INT;
        return view.dispatchNestedPreFling(f, f2);
    }

    public static View keyboardNavigationClusterSearch(View view, View view2, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }
        return null;
    }

    public static boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        int i2 = Build.VERSION.SDK_INT;
        return view.performAccessibilityAction(i, bundle);
    }

    public static void setScrollIndicators(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    public static boolean startNestedScroll(View view, int i, int i2) {
        if (view instanceof AbstractC139075d7n) {
            return ((AbstractC139075d7n) view).startNestedScroll(i, i2);
        }
        if (i2 == 0) {
            return startNestedScroll(view, i);
        }
        return false;
    }

    public static boolean dispatchNestedFling(View view, float f, float f2, boolean z) {
        int i = Build.VERSION.SDK_INT;
        return view.dispatchNestedFling(f, f2, z);
    }

    public static void replaceAccessibilityAction(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
        if (accessibilityViewCommand == null && charSequence == null) {
            removeAccessibilityAction(view, accessibilityActionCompat.getId());
        } else {
            addAccessibilityAction(view, accessibilityActionCompat.createReplacementAction(charSequence, accessibilityViewCommand));
        }
    }

    public static void setPaddingRelative(View view, int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static boolean dispatchNestedPreScroll(View view, int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = Build.VERSION.SDK_INT;
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    public static void postInvalidateOnAnimation(View view, int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        view.postInvalidateOnAnimation(i, i2, i3, i4);
    }

    public static boolean startDragAndDrop(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }
        return view.startDrag(clipData, dragShadowBuilder, obj, i);
    }

    public static boolean dispatchNestedPreScroll(View view, int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if (view instanceof AbstractC139075d7n) {
            return ((AbstractC139075d7n) view).dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
        }
        if (i3 == 0) {
            return dispatchNestedPreScroll(view, i, i2, iArr, iArr2);
        }
        return false;
    }

    public static boolean dispatchNestedScroll(View view, int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = Build.VERSION.SDK_INT;
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    public static void saveAttributeDataForStyleable(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C70763DvZ.LIZ(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static boolean dispatchNestedScroll(View view, int i, int i2, int i3, int i4, int[] iArr, int i5) {
        if (view instanceof AbstractC139075d7n) {
            return ((AbstractC139075d7n) view).dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
        }
        if (i5 == 0) {
            return dispatchNestedScroll(view, i, i2, i3, i4, iArr);
        }
        return false;
    }

    public static void dispatchNestedScroll(View view, int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        if (view instanceof NestedScrollingChild3) {
            ((NestedScrollingChild3) view).dispatchNestedScroll(i, i2, i3, i4, iArr, i5, iArr2);
        } else {
            dispatchNestedScroll(view, i, i2, i3, i4, iArr, i5);
        }
    }
}
