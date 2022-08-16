package com.airbnb.lottie;

import androidx.collection.ArraySet;
import androidx.core.util.Pair;
import com.airbnb.lottie.utils.C0853c;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p003X.C145328eku;

/* loaded from: classes10.dex */
public class PerformanceTracker {
    public boolean enabled;
    public boolean onlyEnabledSaveFrame;
    public final Set<FrameListener> frameListeners = new ArraySet();
    public final Map<String, C0853c> layerRenderTimes = new HashMap();
    public final Comparator<Pair<String, Float>> floatComparator = new Comparator<Pair<String, Float>>(this) { // from class: com.airbnb.lottie.PerformanceTracker.1
        static {
            Covode.recordClassIndex(3968);
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float floatValue = pair.second.floatValue();
            float floatValue2 = pair2.second.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            if (floatValue > floatValue2) {
                return -1;
            }
            return 0;
        }
    };

    /* loaded from: classes10.dex */
    public interface FrameListener {
        static {
            Covode.recordClassIndex(3969);
        }

        void onFrameRendered(float f);
    }

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            Covode.recordClassIndex(3967);
        } else {
            Covode.recordClassIndex(3967);
        }
    }

    public void clearRenderTimes() {
        this.layerRenderTimes.clear();
    }

    public void logRenderTimes() {
        if (!this.enabled) {
            return;
        }
        List<Pair<String, Float>> sortedRenderTimes = getSortedRenderTimes();
        for (int i = 0; i < sortedRenderTimes.size(); i++) {
            sortedRenderTimes.get(i);
        }
    }

    public List<Pair<String, Float>> getSortedRenderTimes() {
        float f;
        if (!this.enabled) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.layerRenderTimes.size());
        for (Map.Entry<String, C0853c> entry : this.layerRenderTimes.entrySet()) {
            String key = entry.getKey();
            C0853c value = entry.getValue();
            if (value.LIZIZ == 0) {
                f = 0.0f;
            } else {
                f = value.LIZ / value.LIZIZ;
            }
            arrayList.add(new Pair(key, Float.valueOf(f)));
        }
        Collections.sort(arrayList, this.floatComparator);
        return arrayList;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void setOnlyEnabledRecord(boolean z) {
        this.onlyEnabledSaveFrame = z;
    }

    public void addFrameListener(FrameListener frameListener) {
        this.frameListeners.add(frameListener);
    }

    public void removeFrameListener(FrameListener frameListener) {
        if (C145328eku.LIZ) {
            this.frameListeners.remove(frameListener);
        } else {
            this.frameListeners.add(frameListener);
        }
    }

    public void recordRenderTime(String str, float f) {
        if (!this.enabled && !this.onlyEnabledSaveFrame) {
            return;
        }
        if (!this.onlyEnabledSaveFrame || this.enabled) {
            C0853c c0853c = this.layerRenderTimes.get(str);
            if (c0853c == null) {
                c0853c = new C0853c();
                this.layerRenderTimes.put(str, c0853c);
            }
            c0853c.LIZ += f;
            c0853c.LIZIZ++;
            if (c0853c.LIZIZ == Integer.MAX_VALUE) {
                c0853c.LIZ /= 2.0f;
                c0853c.LIZIZ /= 2;
            }
        }
        if (str.equals("__container")) {
            for (FrameListener frameListener : this.frameListeners) {
                frameListener.onFrameRendered(f);
            }
        }
    }
}
