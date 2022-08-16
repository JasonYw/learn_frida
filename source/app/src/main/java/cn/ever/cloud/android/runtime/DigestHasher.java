package cn.ever.cloud.android.runtime;

import android.content.Context;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import cn.ever.cloud.utils.DigestUtils;
import cn.ever.cloud.utils.HexUtils;
import cn.ever.cloud.utils.Result;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.util.zip.CRC32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3059io.CloseableKt;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class DigestHasher {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final Context context;

    static {
        Covode.recordClassIndex(2955);
    }

    public DigestHasher(Context context) {
        C106862S5w.LIZ(context);
        this.context = context;
    }

    public final Result<DigestUtils.HashResult> hashMd5AndCrc(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Result) proxy.result;
        }
        C106862S5w.LIZ(str);
        try {
            Result.Companion companion = Result.Companion;
            DigestUtils.HashResult calcHashResult = DigestUtils.calcHashResult(this.context, str);
            Intrinsics.checkNotNullExpressionValue(calcHashResult, "");
            return companion.success(calcHashResult);
        } catch (Throwable th) {
            return Result.Companion.failure(th);
        }
    }

    public final Result<DigestUtils.HashResult> hashMd5AndCrc(String str, long j, long j2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, new Long(j), new Long(j2)}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Result) proxy.result;
        }
        C106862S5w.LIZ(str);
        try {
            Result.Companion companion = Result.Companion;
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(str), "r");
            if (randomAccessFile.length() >= j + j2) {
                RandomAccessFile randomAccessFile2 = randomAccessFile;
                randomAccessFile2.seek(j);
                byte[] bArr = new byte[AccessibilityEventCompat.TYPE_VIEW_SCROLLED];
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                CRC32 crc32 = new CRC32();
                while (true) {
                    int read = randomAccessFile2.read(bArr, 0, Math.min((int) j2, (int) AccessibilityEventCompat.TYPE_VIEW_SCROLLED));
                    if (read > 0) {
                        messageDigest.update(bArr, 0, read);
                        crc32.update(bArr, 0, read);
                        j2 -= read;
                    } else {
                        String fromBytes = HexUtils.fromBytes(messageDigest.digest());
                        Intrinsics.checkNotNullExpressionValue(fromBytes, "");
                        DigestUtils.HashResult hashResult = new DigestUtils.HashResult(fromBytes, Long.valueOf(crc32.getValue()));
                        CloseableKt.closeFinally(randomAccessFile, null);
                        return companion.success(hashResult);
                    }
                }
            } else {
                throw new IndexOutOfBoundsException("file size " + randomAccessFile.length() + " less than offset: " + j + " + len: " + j2);
            }
        } catch (Throwable th) {
            return Result.Companion.failure(th);
        }
    }
}
