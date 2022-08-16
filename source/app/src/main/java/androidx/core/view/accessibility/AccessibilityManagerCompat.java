package androidx.core.view.accessibility;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import java.util.List;
import p003X.AbstractC139190d9e;
import p003X.AbstractC67123Cdx;
import p003X.DP2;
import p003X.accessibility.AccessibilityManager$AccessibilityStateChangeListenerC139189d9d;

/* loaded from: classes17.dex */
public final class AccessibilityManagerCompat {
    static {
        Covode.recordClassIndex(1112);
    }

    /* renamed from: androidx_core_view_accessibility_AccessibilityManagerCompat_android_view_accessibility_AccessibilityManager_getEnabledAccessibilityServiceList */
    public static List m21173x6967df52(AccessibilityManager accessibilityManager, int i) {
        ActionInvokeEntrance.setEventUuid(101307);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(accessibilityManager, new Object[]{Integer.valueOf(i)}, 101307, "java.util.List", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (List) actionIntercept.second;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(i);
        ActionInvokeEntrance.actionInvoke(enabledAccessibilityServiceList, accessibilityManager, new Object[]{Integer.valueOf(i)}, 101307, "androidx_core_view_accessibility_AccessibilityManagerCompat_android_view_accessibility_AccessibilityManager_getEnabledAccessibilityServiceList(Landroid/view/accessibility/AccessibilityManager;I)Ljava/util/List;");
        return enabledAccessibilityServiceList;
    }

    /* renamed from: androidx_core_view_accessibility_AccessibilityManagerCompat_android_view_accessibility_AccessibilityManager_getInstalledAccessibilityServiceList */
    public static List m21172x635558b(AccessibilityManager accessibilityManager) {
        ActionInvokeEntrance.setEventUuid(101306);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(accessibilityManager, new Object[0], 101306, "java.util.List", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (List) actionIntercept.second;
        }
        List<AccessibilityServiceInfo> installedAccessibilityServiceList = accessibilityManager.getInstalledAccessibilityServiceList();
        ActionInvokeEntrance.actionInvoke(installedAccessibilityServiceList, accessibilityManager, new Object[0], 101306, "androidx_core_view_accessibility_AccessibilityManagerCompat_android_view_accessibility_AccessibilityManager_getInstalledAccessibilityServiceList(Landroid/view/accessibility/AccessibilityManager;)Ljava/util/List;");
        return installedAccessibilityServiceList;
    }

    public static List<AccessibilityServiceInfo> getInstalledAccessibilityServiceList(AccessibilityManager accessibilityManager) {
        return m21172x635558b(accessibilityManager);
    }

    public static boolean isTouchExplorationEnabled(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    public static List<AccessibilityServiceInfo> getEnabledAccessibilityServiceList(AccessibilityManager accessibilityManager, int i) {
        return m21173x6967df52(accessibilityManager, i);
    }

    public static boolean addAccessibilityStateChangeListener(AccessibilityManager accessibilityManager, AbstractC139190d9e abstractC139190d9e) {
        if (abstractC139190d9e == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new accessibility.AccessibilityManager$AccessibilityStateChangeListenerC139189d9d(abstractC139190d9e));
    }

    public static boolean removeAccessibilityStateChangeListener(AccessibilityManager accessibilityManager, AbstractC139190d9e abstractC139190d9e) {
        if (abstractC139190d9e == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new accessibility.AccessibilityManager$AccessibilityStateChangeListenerC139189d9d(abstractC139190d9e));
    }

    public static boolean addTouchExplorationStateChangeListener(AccessibilityManager accessibilityManager, AbstractC67123Cdx abstractC67123Cdx) {
        int i = Build.VERSION.SDK_INT;
        if (abstractC67123Cdx == null) {
            return false;
        }
        return accessibilityManager.addTouchExplorationStateChangeListener(new DP2(abstractC67123Cdx));
    }

    public static boolean removeTouchExplorationStateChangeListener(AccessibilityManager accessibilityManager, AbstractC67123Cdx abstractC67123Cdx) {
        int i = Build.VERSION.SDK_INT;
        if (abstractC67123Cdx == null) {
            return false;
        }
        return accessibilityManager.removeTouchExplorationStateChangeListener(new DP2(abstractC67123Cdx));
    }
}
