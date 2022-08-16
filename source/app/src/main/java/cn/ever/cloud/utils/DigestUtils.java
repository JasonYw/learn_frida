package cn.ever.cloud.utils;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.zip.CRC32;

/* loaded from: classes23.dex */
public final class DigestUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3424);
    }

    public static HashResult calcHashResult(FileDescriptor fileDescriptor) {
        BufferedInputStream bufferedInputStream;
        MethodCollector.m14708i(224);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{fileDescriptor}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            HashResult hashResult = (HashResult) proxy.result;
            MethodCollector.m14707o(224);
            return hashResult;
        }
        try {
            byte[] bArr = new byte[AccessibilityEventCompat.TYPE_VIEW_SCROLLED];
            bufferedInputStream = new BufferedInputStream(new FileInputStream(fileDescriptor));
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                CRC32 crc32 = new CRC32();
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read > 0) {
                        messageDigest.update(bArr, 0, read);
                        crc32.update(bArr, 0, read);
                    } else {
                        HashResult hashResult2 = new HashResult(HexUtils.fromBytes(messageDigest.digest()), Long.valueOf(crc32.getValue()));
                        IOUtils.close((InputStream) bufferedInputStream);
                        MethodCollector.m14707o(224);
                        return hashResult2;
                    }
                }
            } catch (Throwable th) {
                th = th;
                IOUtils.close((InputStream) bufferedInputStream);
                MethodCollector.m14707o(224);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = null;
        }
    }

    /* loaded from: classes23.dex */
    public static class HashResult {
        public final Long crc;
        public final String md5;

        static {
            Covode.recordClassIndex(3425);
        }

        public HashResult(String str, Long l) {
            this.md5 = str;
            this.crc = l;
        }
    }

    public static ParcelFileDescriptor getPfd(Context context, Uri uri) {
        MethodCollector.m14708i(225);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, uri}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) proxy.result;
            MethodCollector.m14707o(225);
            return parcelFileDescriptor;
        }
        ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
        MethodCollector.m14707o(225);
        return openFileDescriptor;
    }

    public static HashResult calcHashResult(Context context, String str) {
        ParcelFileDescriptor parcelFileDescriptor = null;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str}, parcelFileDescriptor, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (HashResult) proxy.result;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                try {
                    Uri fromFile = Uri.fromFile(new File(str));
                    parcelFileDescriptor = getPfd(context, fromFile);
                    if (parcelFileDescriptor != null) {
                        return calcHashResult(parcelFileDescriptor.getFileDescriptor());
                    }
                    throw new NullPointerException("get pfd return null. uri: " + fromFile);
                } catch (IOException e) {
                    LogHelper logHelper = LogHelper.INSTANCE;
                    logHelper.m20554e("DigestUtils", "calc hash result error: path=" + str + ", error=" + e);
                    throw e;
                }
            }
            throw new IllegalArgumentException("file path cannot be empty");
        } finally {
            IOUtils.close(parcelFileDescriptor);
        }
    }
}
