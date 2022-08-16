package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes17.dex */
public class AccessibilityRecordCompat {
    public final AccessibilityRecord mRecord;

    static {
        Covode.recordClassIndex(1123);
    }

    public Object getImpl() {
        return this.mRecord;
    }

    public int getAddedCount() {
        return this.mRecord.getAddedCount();
    }

    public CharSequence getBeforeText() {
        return this.mRecord.getBeforeText();
    }

    public CharSequence getClassName() {
        return this.mRecord.getClassName();
    }

    public CharSequence getContentDescription() {
        return this.mRecord.getContentDescription();
    }

    public int getCurrentItemIndex() {
        return this.mRecord.getCurrentItemIndex();
    }

    public int getFromIndex() {
        return this.mRecord.getFromIndex();
    }

    public int getItemCount() {
        return this.mRecord.getItemCount();
    }

    public int getMaxScrollX() {
        return getMaxScrollX(this.mRecord);
    }

    public int getMaxScrollY() {
        return getMaxScrollY(this.mRecord);
    }

    public Parcelable getParcelableData() {
        return this.mRecord.getParcelableData();
    }

    public int getRemovedCount() {
        return this.mRecord.getRemovedCount();
    }

    public int getScrollX() {
        return this.mRecord.getScrollX();
    }

    public int getScrollY() {
        return this.mRecord.getScrollY();
    }

    public List<CharSequence> getText() {
        return this.mRecord.getText();
    }

    public int getToIndex() {
        return this.mRecord.getToIndex();
    }

    public int getWindowId() {
        return this.mRecord.getWindowId();
    }

    public boolean isChecked() {
        return this.mRecord.isChecked();
    }

    public boolean isEnabled() {
        return this.mRecord.isEnabled();
    }

    public boolean isFullScreen() {
        return this.mRecord.isFullScreen();
    }

    public boolean isPassword() {
        return this.mRecord.isPassword();
    }

    public boolean isScrollable() {
        return this.mRecord.isScrollable();
    }

    public void recycle() {
        this.mRecord.recycle();
    }

    public static AccessibilityRecordCompat obtain() {
        return new AccessibilityRecordCompat(AccessibilityRecord.obtain());
    }

    public AccessibilityNodeInfoCompat getSource() {
        return AccessibilityNodeInfoCompat.wrapNonNullInstance(this.mRecord.getSource());
    }

    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.mRecord;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    public AccessibilityRecordCompat(Object obj) {
        this.mRecord = (AccessibilityRecord) obj;
    }

    public void setAddedCount(int i) {
        this.mRecord.setAddedCount(i);
    }

    public void setBeforeText(CharSequence charSequence) {
        this.mRecord.setBeforeText(charSequence);
    }

    public void setChecked(boolean z) {
        this.mRecord.setChecked(z);
    }

    public void setClassName(CharSequence charSequence) {
        this.mRecord.setClassName(charSequence);
    }

    public void setContentDescription(CharSequence charSequence) {
        this.mRecord.setContentDescription(charSequence);
    }

    public void setCurrentItemIndex(int i) {
        this.mRecord.setCurrentItemIndex(i);
    }

    public void setEnabled(boolean z) {
        this.mRecord.setEnabled(z);
    }

    public void setFromIndex(int i) {
        this.mRecord.setFromIndex(i);
    }

    public void setFullScreen(boolean z) {
        this.mRecord.setFullScreen(z);
    }

    public void setItemCount(int i) {
        this.mRecord.setItemCount(i);
    }

    public void setParcelableData(Parcelable parcelable) {
        this.mRecord.setParcelableData(parcelable);
    }

    public void setPassword(boolean z) {
        this.mRecord.setPassword(z);
    }

    public void setRemovedCount(int i) {
        this.mRecord.setRemovedCount(i);
    }

    public void setScrollX(int i) {
        this.mRecord.setScrollX(i);
    }

    public void setScrollY(int i) {
        this.mRecord.setScrollY(i);
    }

    public void setScrollable(boolean z) {
        this.mRecord.setScrollable(z);
    }

    public void setToIndex(int i) {
        this.mRecord.setToIndex(i);
    }

    public static int getMaxScrollX(AccessibilityRecord accessibilityRecord) {
        int i = Build.VERSION.SDK_INT;
        return accessibilityRecord.getMaxScrollX();
    }

    public static int getMaxScrollY(AccessibilityRecord accessibilityRecord) {
        int i = Build.VERSION.SDK_INT;
        return accessibilityRecord.getMaxScrollY();
    }

    public void setMaxScrollX(int i) {
        setMaxScrollX(this.mRecord, i);
    }

    public void setMaxScrollY(int i) {
        setMaxScrollY(this.mRecord, i);
    }

    public void setSource(View view) {
        this.mRecord.setSource(view);
    }

    public static AccessibilityRecordCompat obtain(AccessibilityRecordCompat accessibilityRecordCompat) {
        return new AccessibilityRecordCompat(AccessibilityRecord.obtain(accessibilityRecordCompat.mRecord));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityRecordCompat)) {
            return false;
        }
        AccessibilityRecordCompat accessibilityRecordCompat = (AccessibilityRecordCompat) obj;
        AccessibilityRecord accessibilityRecord = this.mRecord;
        if (accessibilityRecord == null) {
            if (accessibilityRecordCompat.mRecord != null) {
                return false;
            }
        } else if (!accessibilityRecord.equals(accessibilityRecordCompat.mRecord)) {
            return false;
        }
        return true;
    }

    public static void setMaxScrollX(AccessibilityRecord accessibilityRecord, int i) {
        int i2 = Build.VERSION.SDK_INT;
        accessibilityRecord.setMaxScrollX(i);
    }

    public static void setMaxScrollY(AccessibilityRecord accessibilityRecord, int i) {
        int i2 = Build.VERSION.SDK_INT;
        accessibilityRecord.setMaxScrollY(i);
    }

    public void setSource(View view, int i) {
        setSource(this.mRecord, view, i);
    }

    public static void setSource(AccessibilityRecord accessibilityRecord, View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        accessibilityRecord.setSource(view, i);
    }
}
