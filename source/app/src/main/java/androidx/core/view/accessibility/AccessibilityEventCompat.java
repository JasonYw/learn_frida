package androidx.core.view.accessibility;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public final class AccessibilityEventCompat {
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_END = 1024;
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_START = 512;
    public static final int TYPE_VIEW_HOVER_ENTER = 128;
    public static final int TYPE_VIEW_HOVER_EXIT = 256;
    public static final int TYPE_VIEW_SCROLLED = 4096;
    public static final int TYPE_VIEW_TEXT_SELECTION_CHANGED = 8192;
    public static final int TYPE_WINDOW_CONTENT_CHANGED = 2048;

    static {
        Covode.recordClassIndex(1111);
    }

    public static AccessibilityRecordCompat asRecord(AccessibilityEvent accessibilityEvent) {
        return new AccessibilityRecordCompat(accessibilityEvent);
    }

    public static int getRecordCount(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    public static int getAction(AccessibilityEvent accessibilityEvent) {
        int i = Build.VERSION.SDK_INT;
        return accessibilityEvent.getAction();
    }

    public static int getContentChangeTypes(AccessibilityEvent accessibilityEvent) {
        int i = Build.VERSION.SDK_INT;
        return accessibilityEvent.getContentChangeTypes();
    }

    public static int getMovementGranularity(AccessibilityEvent accessibilityEvent) {
        int i = Build.VERSION.SDK_INT;
        return accessibilityEvent.getMovementGranularity();
    }

    public static void setAction(AccessibilityEvent accessibilityEvent, int i) {
        int i2 = Build.VERSION.SDK_INT;
        accessibilityEvent.setAction(i);
    }

    public static void setContentChangeTypes(AccessibilityEvent accessibilityEvent, int i) {
        int i2 = Build.VERSION.SDK_INT;
        accessibilityEvent.setContentChangeTypes(i);
    }

    public static void setMovementGranularity(AccessibilityEvent accessibilityEvent, int i) {
        int i2 = Build.VERSION.SDK_INT;
        accessibilityEvent.setMovementGranularity(i);
    }

    public static void appendRecord(AccessibilityEvent accessibilityEvent, AccessibilityRecordCompat accessibilityRecordCompat) {
        accessibilityEvent.appendRecord((AccessibilityRecord) accessibilityRecordCompat.getImpl());
    }

    public static AccessibilityRecordCompat getRecord(AccessibilityEvent accessibilityEvent, int i) {
        return new AccessibilityRecordCompat(accessibilityEvent.getRecord(i));
    }
}
