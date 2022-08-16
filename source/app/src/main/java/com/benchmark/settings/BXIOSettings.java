package com.benchmark.settings;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;

/* loaded from: classes26.dex */
public class BXIOSettings {
    public String cachePathDir;
    public String externalCacheDir;
    public String mode = "internal";
    public int blockSize = AccessibilityEventCompat.TYPE_VIEW_SCROLLED;
    public int blockNum = AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END;

    static {
        Covode.recordClassIndex(9729);
    }
}
