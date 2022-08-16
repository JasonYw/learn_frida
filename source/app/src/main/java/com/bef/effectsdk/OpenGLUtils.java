package com.bef.effectsdk;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;
import p002O.C0002O;
import p003X.C116971W2r;

/* loaded from: classes10.dex */
public class OpenGLUtils {
    public static final String FAIL_RES = String.format(Locale.US, "{%s: false}", "\"res\"");
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void saveBitmap(Bitmap bitmap, String str) {
    }

    static {
        Covode.recordClassIndex(9540);
    }

    public static int getExternalOESTextureID() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 10);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return iArr[0];
    }

    public static void checkGlError(String str) {
        int glGetError;
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 12).isSupported || (glGetError = GLES20.glGetError()) == 0) {
            return;
        }
        new StringBuilder();
        throw new RuntimeException(C0002O.m25085C(str, ": glError 0x", Integer.toHexString(glGetError)));
    }

    public static Bitmap loadBitmap(String str) {
        FileInputStream fileInputStream;
        MethodCollector.m14708i(644);
        FileInputStream fileInputStream2 = null;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            Bitmap bitmap = (Bitmap) proxy.result;
            MethodCollector.m14707o(644);
            return bitmap;
        }
        try {
            fileInputStream = new FileInputStream(new File(str));
            try {
                Bitmap LIZ = C116971W2r.LIZ(fileInputStream);
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
                MethodCollector.m14707o(644);
                return LIZ;
            } catch (Exception unused2) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                MethodCollector.m14707o(644);
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                MethodCollector.m14707o(644);
                throw th;
            }
        } catch (Exception unused5) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String loadTexture(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Bitmap LJFF = C116971W2r.LJFF(str);
        if (LJFF == null) {
            return FAIL_RES;
        }
        return String.format(Locale.US, "{%s: true, %s: %d, %s: %d, %s: %d}", "\"res\"", "\"width\"", Integer.valueOf(LJFF.getWidth()), "\"height\"", Integer.valueOf(LJFF.getHeight()), "\"textureId\"", Integer.valueOf(loadTexture(LJFF, -1, false)));
    }

    public static int loadShader(int i, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, null, changeQuickRedirect, true, 13);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        return glCreateShader;
    }

    public static int loadTexture(Bitmap bitmap, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bitmap, Integer.valueOf(i)}, null, changeQuickRedirect, true, 6);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return loadTexture(bitmap, i, false);
    }

    public static int loadProgram(String str, String str2) {
        int loadShader;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 8);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int[] iArr = new int[1];
        int loadShader2 = loadShader(str, 35633);
        if (loadShader2 == 0 || (loadShader = loadShader(str2, 35632)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, loadShader2);
        GLES20.glAttachShader(glCreateProgram, loadShader);
        GLES20.glLinkProgram(glCreateProgram);
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] <= 0) {
            return 0;
        }
        GLES20.glDeleteShader(loadShader2);
        GLES20.glDeleteShader(loadShader);
        return glCreateProgram;
    }

    public static int loadShader(String str, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, null, changeQuickRedirect, true, 9);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            return 0;
        }
        return glCreateShader;
    }

    public static Bitmap loadBitmap(FileDescriptor fileDescriptor, long j, long j2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{fileDescriptor, new Long(j), new Long(j2)}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (Bitmap) proxy.result;
        }
        FileInputStream createInputStream = new AssetFileDescriptor(ParcelFileDescriptor.dup(fileDescriptor), j, j2).createInputStream();
        try {
            return C116971W2r.LIZ(createInputStream);
        } finally {
            createInputStream.close();
        }
    }

    public static int loadTexture(Bitmap bitmap, int i, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bitmap, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 7);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (bitmap == null) {
            return -1;
        }
        int[] iArr = new int[1];
        if (i == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        } else {
            GLES20.glBindTexture(3553, i);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            iArr[0] = i;
        }
        if (z) {
            bitmap.recycle();
        }
        return iArr[0];
    }

    public static void byte2Bitmap(byte[] bArr, int i, int i2, String str) {
        if (PatchProxy.proxy(new Object[]{bArr, Integer.valueOf(i), Integer.valueOf(i2), str}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        Bitmap LIZ = C116971W2r.LIZ(i, i2, Bitmap.Config.ARGB_8888);
        LIZ.eraseColor(-16776961);
        LIZ.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        saveBitmap(LIZ, str);
    }

    public static int initEffectTexture(int i, int i2, int[] iArr, int i3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), iArr, Integer.valueOf(i3)}, null, changeQuickRedirect, true, 11);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(i3, iArr[0]);
        GLES20.glTexParameterf(i3, 10240, 9729.0f);
        GLES20.glTexParameterf(i3, 10241, 9729.0f);
        GLES20.glTexParameterf(i3, 10242, 33071.0f);
        GLES20.glTexParameterf(i3, 10243, 33071.0f);
        GLES20.glTexImage2D(i3, 0, 6408, i, i2, 0, 6408, 5121, null);
        return iArr[0];
    }

    public static Bitmap loadBitmap(byte[] bArr, int i, int i2, boolean z) {
        MethodCollector.m14708i(645);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bArr, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            Bitmap bitmap = (Bitmap) proxy.result;
            MethodCollector.m14707o(645);
            return bitmap;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i3 = Build.VERSION.SDK_INT;
        options.inPremultiplied = z;
        Bitmap LIZ = C116971W2r.LIZ(bArr, i, i2, options);
        if (LIZ != null && LIZ.getConfig() != Bitmap.Config.ARGB_8888) {
            LIZ = LIZ.copy(Bitmap.Config.ARGB_8888, true);
        }
        MethodCollector.m14707o(645);
        return LIZ;
    }
}
