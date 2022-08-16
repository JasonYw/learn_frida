package com.benchmark.presenter;

import android.os.Environment;
import com.benchmark.settings.BXIOSettings;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Random;
import p002O.C0002O;
import p003X.C108306Ske;
import p003X.C63275Ay5;
import p003X.C65715BwL;

/* loaded from: classes26.dex */
public class IOBridge {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static Random randomGenerator = new Random();
    public boolean internal;
    public BXIOSettings settings;
    public String testFile;

    static {
        Covode.recordClassIndex(9721);
    }

    public void afterRun() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C65715BwL.LIZIZ(this.testFile);
    }

    public boolean isExternalStorageWritable() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public HashMap<String, Float> runIOTest() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (HashMap) proxy.result;
        }
        HashMap<String, Float> hashMap = new HashMap<>();
        float write = write(this.settings.blockSize, this.settings.blockNum, true, this.testFile);
        C65715BwL.LIZIZ(this.testFile);
        float write2 = write(this.settings.blockSize, this.settings.blockNum, false, this.testFile);
        float read = read(this.settings.blockSize, this.settings.blockNum, true, this.testFile);
        float read2 = read(this.settings.blockSize, this.settings.blockNum, false, this.testFile);
        float LIZ = C63275Ay5.LIZ(write);
        C108306Ske.LIZIZ("IOBridge", "runIOTest: random_write: " + LIZ);
        hashMap.put("random_write", Float.valueOf(LIZ));
        float LIZ2 = C63275Ay5.LIZ(read);
        C108306Ske.LIZIZ("IOBridge", "runIOTest: random_read: " + LIZ2);
        hashMap.put("random_read", Float.valueOf(LIZ2));
        float LIZ3 = C63275Ay5.LIZ(write2);
        C108306Ske.LIZIZ("IOBridge", "runIOTest: sequential_write: " + LIZ3);
        hashMap.put("sequential_write", Float.valueOf(LIZ3));
        float LIZ4 = C63275Ay5.LIZ(read2);
        C108306Ske.LIZIZ("IOBridge", "runIOTest: sequential_read: " + LIZ4);
        hashMap.put("sequential_read", Float.valueOf(LIZ4));
        return hashMap;
    }

    public int prepare(BXIOSettings bXIOSettings) {
        long LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bXIOSettings}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (!this.internal && !isExternalStorageWritable()) {
            return -10003;
        }
        if (bXIOSettings.mode.equalsIgnoreCase("internal")) {
            this.internal = true;
        }
        if (this.internal) {
            LIZ = C65715BwL.LIZ(bXIOSettings.cachePathDir);
        } else {
            LIZ = C65715BwL.LIZ(bXIOSettings.externalCacheDir);
        }
        if (LIZ >= bXIOSettings.blockNum * 10 * bXIOSettings.blockSize) {
            this.settings = bXIOSettings;
            new StringBuilder();
            String m25085C = C0002O.m25085C(bXIOSettings.cachePathDir, File.separator, "test.file");
            new StringBuilder();
            String m25085C2 = C0002O.m25085C(bXIOSettings.externalCacheDir, File.separator, "test.file");
            if (this.internal) {
                m25085C2 = m25085C;
            }
            this.testFile = m25085C2;
            return 0;
        }
        return -10002;
    }

    public static float read(int i, int i2, boolean z, String str) {
        long nanoTime;
        int i3;
        MethodCollector.m14708i(795);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, null, changeQuickRedirect, true, 6);
        if (proxy.isSupported) {
            float floatValue = ((Float) proxy.result).floatValue();
            MethodCollector.m14707o(795);
            return floatValue;
        }
        File file = new File(str);
        byte[] bArr = new byte[i];
        if (z) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            nanoTime = System.nanoTime();
            i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                try {
                    try {
                        randomAccessFile.seek(randomGenerator.nextInt(i2 - 1) * i);
                        randomAccessFile.readFully(bArr, 0, i);
                        i3 += i;
                    } catch (IOException e) {
                        MethodCollector.m14707o(795);
                        throw e;
                    }
                } catch (Throwable th) {
                    randomAccessFile.close();
                    MethodCollector.m14707o(795);
                    throw th;
                }
            }
            randomAccessFile.close();
        } else {
            FileInputStream fileInputStream = new FileInputStream(file);
            nanoTime = System.nanoTime();
            i3 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                try {
                    try {
                        fileInputStream.read(bArr, 0, i);
                        i3 += i;
                    } catch (IOException e2) {
                        MethodCollector.m14707o(795);
                        throw e2;
                    }
                } catch (Throwable th2) {
                    fileInputStream.close();
                    MethodCollector.m14707o(795);
                    throw th2;
                }
            }
            fileInputStream.close();
        }
        float nanoTime2 = (i3 / ((float) (System.nanoTime() - nanoTime))) * 1000.0f;
        MethodCollector.m14707o(795);
        return nanoTime2;
    }

    public static float write(int i, int i2, boolean z, String str) {
        long nanoTime;
        int i3;
        MethodCollector.m14708i(794);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            float floatValue = ((Float) proxy.result).floatValue();
            MethodCollector.m14707o(794);
            return floatValue;
        }
        byte[] bArr = new byte[i];
        for (int i4 = 0; i4 < i; i4++) {
            bArr[i4] = -16;
        }
        File file = new File(str);
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            file.createNewFile();
            C108306Ske.LIZLLL("IOBenchmarkTest", "io benchmark createNewFile");
        }
        if (z) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            nanoTime = System.nanoTime();
            i3 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                try {
                    try {
                        randomAccessFile.seek(randomGenerator.nextInt(i2 - 1) * i);
                        randomAccessFile.write(bArr, 0, i);
                        i3 += i;
                    } catch (Throwable th) {
                        randomAccessFile.close();
                        MethodCollector.m14707o(794);
                        throw th;
                    }
                } catch (IOException e) {
                    MethodCollector.m14707o(794);
                    throw e;
                }
            }
            randomAccessFile.close();
        } else {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            nanoTime = System.nanoTime();
            i3 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                try {
                    try {
                        fileOutputStream.write(bArr, 0, i);
                        i3 += i;
                    } catch (IOException e2) {
                        MethodCollector.m14707o(794);
                        throw e2;
                    }
                } catch (Throwable th2) {
                    fileOutputStream.close();
                    MethodCollector.m14707o(794);
                    throw th2;
                }
            }
            fileOutputStream.close();
        }
        float nanoTime2 = (i3 / ((float) (System.nanoTime() - nanoTime))) * 1000.0f;
        MethodCollector.m14707o(794);
        return nanoTime2;
    }
}
