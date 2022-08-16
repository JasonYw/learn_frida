package com.bef.effectsdk;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p002O.C0002O;
import p003X.C116971W2r;

/* loaded from: classes26.dex */
public class EffectSDKUtils {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static Set<File> localFiles = new HashSet();
    public static List<String> assetFiles = ModelsList.list;
    public static Set<File> needRemoveFiles = new HashSet();

    public static native String nativeGetSdkVersion();

    static {
        Covode.recordClassIndex(9513);
    }

    public static void deleteNoUseModel() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 9).isSupported) {
            return;
        }
        for (File file : localFiles) {
            if (needRemoveFiles.contains(file) && file.exists()) {
                C116971W2r.LIZ(file);
            }
        }
    }

    public static String getSdkVersion() {
        MethodCollector.m14708i(617);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 12);
        if (proxy.isSupported) {
            String str = (String) proxy.result;
            MethodCollector.m14707o(617);
            return str;
        }
        String nativeGetSdkVersion = nativeGetSdkVersion();
        MethodCollector.m14707o(617);
        return nativeGetSdkVersion;
    }

    public static void closeQuietly(Closeable closeable) {
        if (!PatchProxy.proxy(new Object[]{closeable}, null, changeQuickRedirect, true, 11).isSupported && closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static String getAssetRelativePath(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 8);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        int indexOf = str.indexOf("model/");
        if (indexOf >= 0) {
            return str.substring(indexOf + 6, str.length());
        }
        return str;
    }

    public static String getFileName(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 7);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf != -1) {
            return str.substring(lastIndexOf + 1, str.length());
        }
        return "";
    }

    public static void flushAlgorithmModelFiles(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        if (!localFiles.isEmpty()) {
            localFiles.clear();
        }
        scanRecursive(str, localFiles);
        copyAssets(context, str, null, false);
        deleteNoUseModel();
        localFiles.clear();
    }

    public static File takeFirstMatchingOrNull(Set<File> set, FileFilter fileFilter) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{set, fileFilter}, null, changeQuickRedirect, true, 10);
        if (proxy.isSupported) {
            return (File) proxy.result;
        }
        for (File file : set) {
            if (fileFilter.accept(file)) {
                return file;
            }
        }
        return null;
    }

    public static boolean needUpdate(final Context context, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!localFiles.isEmpty()) {
            localFiles.clear();
        }
        scanRecursive(str, localFiles);
        try {
            if (assetFiles.size() > localFiles.size()) {
                return true;
            }
            for (final String str2 : assetFiles) {
                if (takeFirstMatchingOrNull(localFiles, new FileFilter() { // from class: com.bef.effectsdk.EffectSDKUtils.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    static {
                        Covode.recordClassIndex(9514);
                    }

                    @Override // java.io.FileFilter
                    public final boolean accept(File file) {
                        MethodCollector.m14708i(615);
                        boolean z = true;
                        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 1);
                        if (proxy2.isSupported) {
                            boolean booleanValue = ((Boolean) proxy2.result).booleanValue();
                            MethodCollector.m14707o(615);
                            return booleanValue;
                        } else if (str2.contains(file.getName())) {
                            InputStream inputStream = null;
                            try {
                                inputStream = context.getAssets().open(str2);
                                if (file.length() != inputStream.available()) {
                                    z = false;
                                }
                                return z;
                            } catch (IOException unused) {
                                return false;
                            } finally {
                                EffectSDKUtils.closeQuietly(inputStream);
                                MethodCollector.m14707o(615);
                            }
                        } else {
                            MethodCollector.m14707o(615);
                            return false;
                        }
                    }
                }) == null) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static void scanRecursive(String str, Set<File> set) {
        File[] listFiles;
        if (PatchProxy.proxy(new Object[]{str, set}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        File file = new File(str);
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    scanRecursive(file2.getAbsolutePath(), set);
                } else {
                    set.add(file2);
                }
            }
        }
    }

    public static void copyFile(Context context, String str, String str2) {
        InputStream inputStream;
        MethodCollector.m14708i(616);
        FileOutputStream fileOutputStream = null;
        if (PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, 6).isSupported) {
            MethodCollector.m14707o(616);
            return;
        }
        try {
            inputStream = context.getAssets().open(str);
            try {
                new StringBuilder();
                String m25086C = C0002O.m25086C(str2, str.substring(str.indexOf("model") + 6, str.lastIndexOf("/")));
                File file = new File(m25086C);
                if (!file.exists() && !file.mkdirs()) {
                    IOException iOException = new IOException(C0002O.m25086C("Can not mkdirs ", file.getPath()));
                    MethodCollector.m14707o(616);
                    throw iOException;
                }
                new StringBuilder();
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(C0002O.m25085C(m25086C, "/", getFileName(str))));
                try {
                    byte[] bArr = new byte[AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            fileOutputStream2.write(bArr, 0, read);
                        } else {
                            try {
                                closeQuietly(inputStream);
                                return;
                            } finally {
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    try {
                        closeQuietly(inputStream);
                        throw th;
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    public static void flushAlgorithmModelFiles(Context context, String str, String[] strArr, boolean z) {
        if (PatchProxy.proxy(new Object[]{context, str, strArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        if (!localFiles.isEmpty()) {
            localFiles.clear();
        }
        scanRecursive(str, localFiles);
        copyAssets(context, str, strArr, z);
        deleteNoUseModel();
        localFiles.clear();
    }

    public static void copyAssets(Context context, String str, String[] strArr, boolean z) {
        if (PatchProxy.proxy(new Object[]{context, str, strArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 5).isSupported) {
            return;
        }
        if (!needRemoveFiles.isEmpty()) {
            needRemoveFiles.clear();
        }
        needRemoveFiles.addAll(localFiles);
        if (!str.endsWith("/")) {
            new StringBuilder();
            str = C0002O.m25086C(str, "/");
        }
        for (String str2 : assetFiles) {
            final String fileName = getFileName(str2);
            File takeFirstMatchingOrNull = takeFirstMatchingOrNull(needRemoveFiles, new FileFilter() { // from class: com.bef.effectsdk.EffectSDKUtils.2
                public static ChangeQuickRedirect changeQuickRedirect;

                static {
                    Covode.recordClassIndex(9515);
                }

                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 1);
                    if (proxy.isSupported) {
                        return ((Boolean) proxy.result).booleanValue();
                    }
                    return file.getName().contains(fileName);
                }
            });
            if (takeFirstMatchingOrNull != null && new File(str, getAssetRelativePath(str2)).exists()) {
                needRemoveFiles.remove(takeFirstMatchingOrNull);
            } else {
                if (strArr != null && !TextUtils.isEmpty(fileName)) {
                    for (String str3 : strArr) {
                        if (fileName.equals(str3)) {
                            if (z) {
                                copyFile(context, str2, str);
                            }
                        }
                    }
                }
                if (!z) {
                    copyFile(context, str2, str);
                }
            }
        }
    }
}
