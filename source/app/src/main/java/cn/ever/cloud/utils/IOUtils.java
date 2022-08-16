package cn.ever.cloud.utils;

import android.database.Cursor;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes23.dex */
public final class IOUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3427);
    }

    public static void close(FileChannel fileChannel) {
        if (PatchProxy.proxy(new Object[]{fileChannel}, null, changeQuickRedirect, true, 5).isSupported || fileChannel == null) {
            return;
        }
        try {
            fileChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void close(Cursor cursor) {
        if (PatchProxy.proxy(new Object[]{cursor}, null, changeQuickRedirect, true, 2).isSupported || cursor == null) {
            return;
        }
        try {
            cursor.close();
        } catch (Throwable th) {
            LogHelper logHelper = LogHelper.INSTANCE;
            logHelper.m20551w("IOUtils", "close fail " + th);
        }
    }

    public static void close(Closeable closeable) {
        if (PatchProxy.proxy(new Object[]{closeable}, null, changeQuickRedirect, true, 6).isSupported || closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th) {
            LogHelper logHelper = LogHelper.INSTANCE;
            logHelper.m20551w("IOUtils", "close fail " + th);
        }
    }

    public static byte[] toByteArray(InputStream inputStream) {
        MethodCollector.m14708i(226);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{inputStream}, null, changeQuickRedirect, true, 1);
        try {
            if (proxy.isSupported) {
                byte[] bArr = (byte[]) proxy.result;
                MethodCollector.m14707o(226);
                return bArr;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[AccessibilityEventCompat.TYPE_VIEW_SCROLLED];
            while (true) {
                int read = inputStream.read(bArr2);
                if (-1 != read) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            close(inputStream);
            MethodCollector.m14707o(226);
        }
    }

    public static void close(InputStream inputStream) {
        if (PatchProxy.proxy(new Object[]{inputStream}, null, changeQuickRedirect, true, 3).isSupported || inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (Throwable th) {
            LogHelper logHelper = LogHelper.INSTANCE;
            logHelper.m20551w("IOUtils", "close fail " + th);
        }
    }

    public static void close(OutputStream outputStream) {
        if (PatchProxy.proxy(new Object[]{outputStream}, null, changeQuickRedirect, true, 4).isSupported || outputStream == null) {
            return;
        }
        try {
            outputStream.close();
        } catch (Throwable th) {
            LogHelper logHelper = LogHelper.INSTANCE;
            logHelper.m20551w("IOUtils", "close fail " + th);
        }
    }
}
