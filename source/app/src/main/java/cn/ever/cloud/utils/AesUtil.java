package cn.ever.cloud.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3059io.CloseableKt;
import p003X.C106862S5w;

/* loaded from: classes26.dex */
public final class AesUtil {
    public static final AesUtil INSTANCE = new AesUtil();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3418);
    }

    public final byte[] decrypt(byte[] bArr, byte[] bArr2) {
        MethodCollector.m14708i(223);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bArr, bArr2}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            byte[] bArr3 = (byte[]) proxy.result;
            MethodCollector.m14707o(223);
            return bArr3;
        }
        C106862S5w.LIZ(bArr, bArr2);
        LogHelper.INSTANCE.m20555d("AesUtil", "start decrypt");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        byte[] bArr4 = new byte[16];
        ArraysKt___ArraysJvmKt.copyInto(bArr, bArr4, 0, 0, 16);
        cipher.init(2, secretKeySpec, new IvParameterSpec(bArr4));
        ByteArrayInputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream = new ByteArrayInputStream(bArr);
        try {
            ByteArrayInputStream byteArrayInputStream = byteArrayOutputStream;
            byteArrayInputStream.skip(16L);
            CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, cipher);
            CipherOutputStream cipherOutputStream2 = cipherOutputStream;
            byte[] bArr5 = new byte[1048576];
            while (true) {
                int read = byteArrayInputStream.read(bArr5);
                if (read != -1) {
                    cipherOutputStream2.write(bArr5, 0, read);
                } else {
                    CloseableKt.closeFinally(cipherOutputStream, null);
                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                    LogHelper.INSTANCE.m20555d("AesUtil", "finished decrypt");
                    try {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        CloseableKt.closeFinally(byteArrayOutputStream, null);
                        Intrinsics.checkNotNullExpressionValue(byteArray, "");
                        MethodCollector.m14707o(223);
                        return byteArray;
                    } finally {
                    }
                }
            }
        } finally {
            try {
                MethodCollector.m14707o(223);
                throw th;
            } finally {
            }
        }
    }

    public final void decryptFile(File file, File file2, byte[] bArr) {
        MethodCollector.m14708i(222);
        if (PatchProxy.proxy(new Object[]{file, file2, bArr}, this, changeQuickRedirect, false, 1).isSupported) {
            MethodCollector.m14707o(222);
            return;
        }
        C106862S5w.LIZ(file, file2, bArr);
        LogHelper logHelper = LogHelper.INSTANCE;
        logHelper.m20555d("AesUtil", "start decrypt sourceFile:" + file);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(new byte[16]));
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileInputStream fileInputStream2 = fileInputStream;
            fileInputStream2.skip(16L);
            CipherOutputStream cipherOutputStream = new CipherOutputStream(new FileOutputStream(file2), cipher);
            CipherOutputStream cipherOutputStream2 = cipherOutputStream;
            byte[] bArr2 = new byte[1048576];
            while (true) {
                int read = fileInputStream2.read(bArr2);
                if (read != -1) {
                    cipherOutputStream2.write(bArr2, 0, read);
                } else {
                    CloseableKt.closeFinally(cipherOutputStream, null);
                    CloseableKt.closeFinally(fileInputStream, null);
                    LogHelper logHelper2 = LogHelper.INSTANCE;
                    logHelper2.m20555d("AesUtil", "finished decryptFile:" + file);
                    MethodCollector.m14707o(222);
                    return;
                }
            }
        } finally {
        }
    }
}
