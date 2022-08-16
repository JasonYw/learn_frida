package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.JsonReader;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.C0844c;
import com.airbnb.lottie.model.C0850d;
import com.airbnb.lottie.model.layer.Layer;
import com.bytedance.covode.number.Covode;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p003X.C115851Vj3;

/* loaded from: classes19.dex */
public class LottieComposition {
    public Rect bounds;
    public SparseArrayCompat<C0850d> characters;
    public float endFrame;
    public Map<String, C0844c> fonts;
    public float frameRate;
    public Map<String, LottieImageAsset> images;
    public boolean isBitmapReady;
    public LongSparseArray<Layer> layerMap;
    public List<Layer> layers;
    public boolean needPolyfill;
    public Map<String, List<Layer>> precomps;
    public float startFrame;
    public final PerformanceTracker performanceTracker = new PerformanceTracker();
    public final HashSet<String> warnings = new HashSet<>();
    public String errorReportResId = "";

    static {
        Covode.recordClassIndex(3917);
    }

    public Rect getBounds() {
        return this.bounds;
    }

    public SparseArrayCompat<C0850d> getCharacters() {
        return this.characters;
    }

    public float getEndFrame() {
        return this.endFrame;
    }

    public Map<String, C0844c> getFonts() {
        return this.fonts;
    }

    public float getFrameRate() {
        return this.frameRate;
    }

    public Map<String, LottieImageAsset> getImages() {
        return this.images;
    }

    public List<Layer> getLayers() {
        return this.layers;
    }

    public PerformanceTracker getPerformanceTracker() {
        return this.performanceTracker;
    }

    public float getStartFrame() {
        return this.startFrame;
    }

    public boolean isBitmapReady() {
        return this.isBitmapReady;
    }

    public boolean isNeedPolyfill() {
        return this.needPolyfill;
    }

    public float getDurationFrames() {
        return this.endFrame - this.startFrame;
    }

    public float getDuration() {
        return (getDurationFrames() / this.frameRate) * 1000.0f;
    }

    public boolean hasImages() {
        if (!this.images.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<String> getWarnings() {
        HashSet<String> hashSet = this.warnings;
        return new ArrayList<>(Arrays.asList(hashSet.toArray(new String[hashSet.size()])));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (Layer layer : this.layers) {
            sb.append(layer.LIZ("\t"));
        }
        return sb.toString();
    }

    public void setBitmapReady(boolean z) {
        this.isBitmapReady = z;
    }

    public void setNeedPolyfill(boolean z) {
        this.needPolyfill = z;
    }

    public void addWarning(String str) {
        this.warnings.add(str);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.performanceTracker.setEnabled(z);
    }

    /* loaded from: classes13.dex */
    public static class Factory {
        static {
            Covode.recordClassIndex(3918);
        }

        public static LottieComposition fromInputStreamSync(InputStream inputStream) {
            return LottieCompositionFactory.fromJsonInputStreamSync(inputStream, null).getValue();
        }

        public static LottieComposition fromJsonSync(JsonReader jsonReader) {
            return LottieCompositionFactory.fromJsonReaderSync(jsonReader, null).getValue();
        }

        public static LottieComposition fromJsonSync(String str) {
            return LottieCompositionFactory.fromJsonStringSync(str, null).getValue();
        }

        public static LottieComposition fromFileSync(Context context, String str) {
            return LottieCompositionFactory.fromAssetSync(context, str).getValue();
        }

        public static AbstractC0826a fromInputStream(InputStream inputStream, OnCompositionLoadedListener onCompositionLoadedListener) {
            C115851Vj3 c115851Vj3 = new C115851Vj3(onCompositionLoadedListener, (byte) 0);
            LottieCompositionFactory.fromJsonInputStream(inputStream, null).addListener(c115851Vj3);
            return c115851Vj3;
        }

        public static AbstractC0826a fromJsonReader(JsonReader jsonReader, OnCompositionLoadedListener onCompositionLoadedListener) {
            C115851Vj3 c115851Vj3 = new C115851Vj3(onCompositionLoadedListener, (byte) 0);
            LottieCompositionFactory.fromJsonReader(jsonReader, null).addListener(c115851Vj3);
            return c115851Vj3;
        }

        public static AbstractC0826a fromJsonString(String str, OnCompositionLoadedListener onCompositionLoadedListener) {
            C115851Vj3 c115851Vj3 = new C115851Vj3(onCompositionLoadedListener, (byte) 0);
            LottieCompositionFactory.fromJsonString(str, null).addListener(c115851Vj3);
            return c115851Vj3;
        }

        public static LottieComposition fromJsonSync(Resources resources, JSONObject jSONObject) {
            return LottieCompositionFactory.fromJsonSync(jSONObject, null).getValue();
        }

        public static LottieComposition fromInputStreamSync(InputStream inputStream, boolean z) {
            return LottieCompositionFactory.fromJsonInputStreamSync(inputStream, null).getValue();
        }

        public static AbstractC0826a fromAssetFileName(Context context, String str, OnCompositionLoadedListener onCompositionLoadedListener) {
            C115851Vj3 c115851Vj3 = new C115851Vj3(onCompositionLoadedListener, (byte) 0);
            LottieCompositionFactory.fromAsset(context, str).addListener(c115851Vj3);
            return c115851Vj3;
        }

        public static AbstractC0826a fromRawFile(Context context, int i, OnCompositionLoadedListener onCompositionLoadedListener) {
            C115851Vj3 c115851Vj3 = new C115851Vj3(onCompositionLoadedListener, (byte) 0);
            LottieCompositionFactory.fromRawRes(context, i).addListener(c115851Vj3);
            return c115851Vj3;
        }
    }

    public List<Layer> getPrecomps(String str) {
        return this.precomps.get(str);
    }

    public Layer layerModelForId(long j) {
        return this.layerMap.get(j);
    }

    public void init(Rect rect, float f, float f2, float f3, List<Layer> list, LongSparseArray<Layer> longSparseArray, Map<String, List<Layer>> map, Map<String, LottieImageAsset> map2, SparseArrayCompat<C0850d> sparseArrayCompat, Map<String, C0844c> map3) {
        this.bounds = rect;
        this.startFrame = f;
        this.endFrame = f2;
        this.frameRate = f3;
        this.layers = list;
        this.layerMap = longSparseArray;
        this.precomps = map;
        this.images = map2;
        this.characters = sparseArrayCompat;
        this.fonts = map3;
    }
}
