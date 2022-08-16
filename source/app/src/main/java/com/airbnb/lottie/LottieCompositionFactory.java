package com.airbnb.lottie;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.JsonReader;
import com.airbnb.lottie.model.LottieCompositionCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.C115762Vhc;
import p003X.C115837Vip;
import p003X.C115842Viu;
import p003X.C115843Viv;
import p003X.C115844Viw;
import p003X.C115845Vix;
import p003X.C115846Viy;
import p003X.C115847Viz;
import p003X.C115849Vj1;
import p003X.C115850Vj2;
import p003X.C116971W2r;
import p003X.C145198eio;
import p003X.C145224ejE;
import p003X.C145328eku;
import p003X.CallableC115763Vhd;
import p003X.CallableC115764Vhe;
import p003X.CallableC115765Vhf;
import p003X.CallableC115798ViC;
import p003X.CallableC115838Viq;
import p003X.CallableC115839Vir;
import p003X.CallableC115840Vis;
import p003X.CallableC115841Vit;
import p003X.CallableC73864FAs;

/* loaded from: classes13.dex */
public class LottieCompositionFactory {
    public static final Map<String, LottieTask<LottieComposition>> taskCache = new ConcurrentHashMap();
    public static boolean sComponentCallbackRegistered = false;
    public static ComponentCallbacks2 sComponentCallback = new ComponentCallbacks2() { // from class: com.airbnb.lottie.LottieCompositionFactory.1
        static {
            Covode.recordClassIndex(3921);
        }

        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public final void onLowMemory() {
            LottieCompositionFactory.clearCache();
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int i) {
            if (i != 5 && i != 10 && i != 40) {
                return;
            }
            LottieCompositionFactory.clearCache();
        }
    };

    static {
        Covode.recordClassIndex(3920);
    }

    public static void clearCache() {
        if (C145328eku.LIZ) {
            taskCache.clear();
            LottieCompositionCache.LIZ().LIZ.evictAll();
        }
    }

    public static String getCurCacheList() {
        StringBuilder sb = new StringBuilder();
        sb.append(LottieCompositionCache.LIZ().LIZ.snapshot().keySet().toString());
        if (taskCache != null) {
            sb.append(" /---/ ");
            sb.append(taskCache.keySet().toString());
        }
        return sb.toString();
    }

    public static String rawResCacheKey(int i) {
        return "rawRes_" + i;
    }

    public static void setMaxCacheSize(int i) {
        LottieCompositionCache.LIZ().LIZ.resize(i);
    }

    public static void checkAndRegisterLowMemoryListener(Context context) {
        if (sComponentCallbackRegistered) {
            return;
        }
        sComponentCallbackRegistered = true;
        if (C145328eku.LJIIIIZZ && context != null) {
            context.getApplicationContext().registerComponentCallbacks(sComponentCallback);
        }
    }

    public static boolean checkComposition(LottieComposition lottieComposition) {
        if (lottieComposition == null) {
            return false;
        }
        for (Map.Entry<String, LottieImageAsset> entry : lottieComposition.getImages().entrySet()) {
            if (entry.getValue().getBitmap() == null) {
                return false;
            }
        }
        return true;
    }

    public static LottieResult<LottieComposition> fromJsonInputStreamSync(InputStream inputStream, String str) {
        return fromJsonInputStreamSync(inputStream, str, true);
    }

    public static LottieTask<LottieComposition> fromAsset(Context context, String str) {
        return cache(str, new CallableC115839Vir(context.getApplicationContext(), str));
    }

    public static LottieTask<LottieComposition> fromJson(JSONObject jSONObject, String str) {
        return cache(str, new CallableC115798ViC(jSONObject, str));
    }

    public static LottieTask<LottieComposition> fromJsonInputStream(InputStream inputStream, String str) {
        return cache(str, new CallableC73864FAs(inputStream, str));
    }

    public static LottieTask<LottieComposition> fromJsonReader(JsonReader jsonReader, String str) {
        return cache(str, new CallableC115838Viq(jsonReader, str));
    }

    public static LottieTask<LottieComposition> fromJsonString(String str, String str2) {
        return cache(str2, new CallableC115841Vit(str, str2));
    }

    public static LottieResult<LottieComposition> fromJsonStringSync(String str, String str2) {
        return fromJsonReaderSync(new JsonReader(new StringReader(str)), str2);
    }

    public static LottieResult<LottieComposition> fromJsonSync(JSONObject jSONObject, String str) {
        return fromJsonStringSync(jSONObject.toString(), str);
    }

    public static LottieTask<LottieComposition> fromUrl(Context context, String str) {
        return new LottieTask<>(new CallableC115763Vhd(new C115762Vhc(context, str)));
    }

    public static LottieResult<LottieComposition> fromUrlSync(Context context, String str) {
        return new C115762Vhc(context, str).LIZ();
    }

    public static LottieTask<LottieComposition> fromZipStream(ZipInputStream zipInputStream, String str) {
        return cache(str, new CallableC115764Vhe(zipInputStream, str));
    }

    public static LottieResult<LottieComposition> fromZipStreamSync(ZipInputStream zipInputStream, String str) {
        try {
            return fromZipStreamSyncInternal(zipInputStream, str);
        } finally {
            C145198eio.LIZ(zipInputStream);
        }
    }

    public static LottieResult<LottieComposition> fromJsonReaderSync(JsonReader jsonReader, String str) {
        try {
            LottieComposition LIZ = C145224ejE.LIZ(jsonReader);
            LottieCompositionCache.LIZ().LIZ(str, LIZ);
            return new LottieResult<>(LIZ);
        } catch (Exception e) {
            return new LottieResult<>(e);
        }
    }

    public static LottieTask<LottieComposition> fromRawRes(Context context, int i) {
        return cache(rawResCacheKey(i), new CallableC115840Vis(context.getApplicationContext(), i));
    }

    public static LottieImageAsset findImageAssetForFileName(LottieComposition lottieComposition, String str) {
        for (LottieImageAsset lottieImageAsset : lottieComposition.getImages().values()) {
            if (lottieImageAsset.getFileName().equals(str)) {
                return lottieImageAsset;
            }
        }
        return null;
    }

    public static LottieResult<LottieComposition> fromRawResSync(Context context, int i) {
        MethodCollector.m14708i(310);
        try {
            LottieResult<LottieComposition> fromJsonInputStreamSync = fromJsonInputStreamSync(context.getResources().openRawResource(i), rawResCacheKey(i));
            MethodCollector.m14707o(310);
            return fromJsonInputStreamSync;
        } catch (Resources.NotFoundException e) {
            LottieResult<LottieComposition> lottieResult = new LottieResult<>(e);
            MethodCollector.m14707o(310);
            return lottieResult;
        }
    }

    public static LottieTask<LottieComposition> cache(String str, Callable<LottieResult<LottieComposition>> callable) {
        if (str != null) {
            LottieComposition LIZ = LottieCompositionCache.LIZ().LIZ(str);
            if (LIZ != null) {
                return new LottieTask<>(new CallableC115765Vhf(LIZ));
            }
            if (str != null && taskCache.containsKey(str)) {
                return taskCache.get(str);
            }
        }
        LottieTask<LottieComposition> lottieTask = new LottieTask<>(callable);
        if (str != null) {
            lottieTask.addListener(new C115845Vix(str));
            lottieTask.addFailureListener(new C115846Viy(str));
            taskCache.put(str, lottieTask);
        }
        return lottieTask;
    }

    public static LottieResult<LottieComposition> fromAssetSync(Context context, String str) {
        MethodCollector.m14708i(309);
        try {
            String m25086C = C0002O.m25086C("asset_", str);
            if (str.endsWith(".zip")) {
                LottieResult<LottieComposition> fromZipStreamSync = fromZipStreamSync(new ZipInputStream(context.getAssets().open(str)), m25086C);
                MethodCollector.m14707o(309);
                return fromZipStreamSync;
            }
            LottieResult<LottieComposition> fromJsonInputStreamSync = fromJsonInputStreamSync(context.getAssets().open(str), m25086C);
            MethodCollector.m14707o(309);
            return fromJsonInputStreamSync;
        } catch (IOException e) {
            LottieResult<LottieComposition> lottieResult = new LottieResult<>(e);
            MethodCollector.m14707o(309);
            return lottieResult;
        }
    }

    public static LottieResult<LottieComposition> fromZipStreamSyncInternal(ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            LottieComposition lottieComposition = null;
            while (nextEntry != null) {
                if (!nextEntry.getName().contains("__MACOSX")) {
                    if (nextEntry.getName().contains(".json")) {
                        lottieComposition = fromJsonInputStreamSync(zipInputStream, str, false).getValue();
                    } else if (nextEntry.getName().contains(".png")) {
                        String[] split = nextEntry.getName().split("/");
                        hashMap.put(split[split.length - 1], C116971W2r.LIZ(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            if (lottieComposition == null) {
                return new LottieResult<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                LottieImageAsset findImageAssetForFileName = findImageAssetForFileName(lottieComposition, (String) entry.getKey());
                if (findImageAssetForFileName != null) {
                    if (C145328eku.LIZ) {
                        findImageAssetForFileName.setBitmap(C145198eio.LIZ((Bitmap) entry.getValue(), findImageAssetForFileName.getWidth(), findImageAssetForFileName.getHeight(), findImageAssetForFileName));
                    } else {
                        findImageAssetForFileName.setBitmap((Bitmap) entry.getValue());
                    }
                }
            }
            for (Map.Entry<String, LottieImageAsset> entry2 : lottieComposition.getImages().entrySet()) {
                if (entry2.getValue().getBitmap() == null) {
                    return new LottieResult<>(new IllegalStateException(C0002O.m25086C("There is no image for ", entry2.getValue().getFileName())));
                }
            }
            LottieCompositionCache.LIZ().LIZ(str, lottieComposition);
            return new LottieResult<>(lottieComposition);
        } catch (IOException e) {
            return new LottieResult<>(e);
        }
    }

    public static LottieResult<LottieComposition> fromJsonInputStreamSync(InputStream inputStream, String str, boolean z) {
        try {
            return fromJsonReaderSync(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                C145198eio.LIZ(inputStream);
            }
        }
    }

    public static void prepareBitmapForComposition(LottieComposition lottieComposition, ImageAssetDelegateAsync imageAssetDelegateAsync, CompositionReadyListener compositionReadyListener) {
        if (lottieComposition.getImages() != null && lottieComposition.getImages().size() != 0) {
            if (lottieComposition.getImages() != null) {
                AtomicInteger atomicInteger = new AtomicInteger(lottieComposition.getImages().size());
                for (Map.Entry<String, LottieImageAsset> entry : lottieComposition.getImages().entrySet()) {
                    if (imageAssetDelegateAsync != null) {
                        LottieImageAsset value = entry.getValue();
                        if ("%s".equals(value.getFileName())) {
                            lottieComposition.setNeedPolyfill(true);
                            if (atomicInteger.decrementAndGet() == 0) {
                                lottieComposition.setBitmapReady(true);
                                compositionReadyListener.onCompositionReady(lottieComposition);
                            }
                        } else {
                            imageAssetDelegateAsync.fetchBitmapAsync(value, new C115837Vip(value, atomicInteger, lottieComposition, compositionReadyListener));
                        }
                    }
                }
                return;
            }
            return;
        }
        lottieComposition.setBitmapReady(true);
        compositionReadyListener.onCompositionReady(lottieComposition);
    }

    public static void fromJsonFileAsync(String str, String str2, ImageAssetDelegateAsync imageAssetDelegateAsync, CompositionReadyListener compositionReadyListener) {
        LottieComposition LIZ = LottieCompositionCache.LIZ().LIZ(str2);
        if (checkComposition(LIZ)) {
            compositionReadyListener.onCompositionReady(LIZ);
        } else {
            LottieTask.EXECUTOR.execute(new C115847Viz(imageAssetDelegateAsync, compositionReadyListener, null, str, str2));
        }
    }

    public static void fromJsonStringAsync(String str, String str2, ImageAssetDelegateAsync imageAssetDelegateAsync, CompositionReadyListener compositionReadyListener) {
        LottieComposition LIZ = LottieCompositionCache.LIZ().LIZ(str2);
        if (checkComposition(LIZ)) {
            compositionReadyListener.onCompositionReady(LIZ);
        } else {
            LottieTask.EXECUTOR.execute(new C115850Vj2(imageAssetDelegateAsync, compositionReadyListener, null, str, str2));
        }
    }

    public static void fromJsonFileAsyncInternal(String str, String str2, WeakReference<ImageAssetDelegateAsync> weakReference, WeakReference<CompositionReadyListener> weakReference2) {
        MethodCollector.m14708i(311);
        if (weakReference.get() != null && weakReference2.get() != null) {
            ImageAssetDelegateAsync imageAssetDelegateAsync = weakReference.get();
            CompositionReadyListener compositionReadyListener = weakReference2.get();
            try {
                LottieComposition value = fromJsonInputStreamSync(new FileInputStream(new File(str)), str2, true).getValue();
                if (value == null) {
                    compositionReadyListener.onCompositionFailed("fromJsonFileAsyncInternal Unable to parse composition and composition is null");
                    MethodCollector.m14707o(311);
                    return;
                }
                prepareBitmapForComposition(value, imageAssetDelegateAsync, new C115842Viu(str2, compositionReadyListener));
                MethodCollector.m14707o(311);
                return;
            } catch (Exception e) {
                compositionReadyListener.onCompositionFailed(C0002O.m25086C("fromJsonFileAsyncInternal Unable to parse composition. Error msg is ", e.toString()));
                MethodCollector.m14707o(311);
                return;
            }
        }
        MethodCollector.m14707o(311);
    }

    public static void fromJsonStringAsyncInternal(String str, String str2, WeakReference<ImageAssetDelegateAsync> weakReference, WeakReference<CompositionReadyListener> weakReference2) {
        if (weakReference.get() != null && weakReference2.get() != null) {
            CompositionReadyListener compositionReadyListener = weakReference2.get();
            ImageAssetDelegateAsync imageAssetDelegateAsync = weakReference.get();
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                prepareBitmapForComposition(C145224ejE.LIZ(jsonReader), imageAssetDelegateAsync, new C115844Viw(str2, compositionReadyListener));
            } catch (Throwable th) {
                try {
                    compositionReadyListener.onCompositionFailed(C0002O.m25086C("load composition failed from json string. ", th.getMessage()));
                } finally {
                    C145198eio.LIZ(jsonReader);
                }
            }
        }
    }

    public static void fromJsonAssetAsync(Context context, String str, String str2, ImageAssetDelegateAsync imageAssetDelegateAsync, CompositionReadyListener compositionReadyListener) {
        LottieComposition LIZ = LottieCompositionCache.LIZ().LIZ(str2);
        if (checkComposition(LIZ)) {
            compositionReadyListener.onCompositionReady(LIZ);
        } else {
            LottieTask.EXECUTOR.execute(new C115849Vj1(imageAssetDelegateAsync, compositionReadyListener, context, str, str2));
        }
    }

    public static void fromJsonAssetAsyncInternal(WeakReference<Context> weakReference, String str, String str2, WeakReference<ImageAssetDelegateAsync> weakReference2, WeakReference<CompositionReadyListener> weakReference3) {
        if (weakReference.get() != null && weakReference2.get() != null && weakReference3.get() != null) {
            Context context = weakReference.get();
            CompositionReadyListener compositionReadyListener = weakReference3.get();
            ImageAssetDelegateAsync imageAssetDelegateAsync = weakReference2.get();
            try {
                LottieComposition value = fromAssetSync(context, str).getValue();
                if (value == null) {
                    compositionReadyListener.onCompositionFailed("fromJsonAssetSyncInternal Unable to parse composition and composition is null");
                } else {
                    prepareBitmapForComposition(value, imageAssetDelegateAsync, new C115843Viv(str2, compositionReadyListener));
                }
            } catch (Exception e) {
                compositionReadyListener.onCompositionFailed(C0002O.m25086C("load composition failed from asset. ", e.getMessage()));
            }
        }
    }
}
