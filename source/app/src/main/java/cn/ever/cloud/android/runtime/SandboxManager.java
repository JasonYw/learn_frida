package cn.ever.cloud.android.runtime;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.FileUtils;
import cn.ever.cloud.android.services.task.entity.PauseCancellationException;
import cn.ever.cloud.android.services.upload.UploadMedia;
import cn.ever.cloud.android.services.upload.UploadSandboxEnv;
import cn.ever.cloud.utils.DigestUtils;
import cn.ever.cloud.utils.IdGenerator;
import cn.ever.cloud.utils.LogHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3059io.CloseableKt;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C116971W2r;

/* loaded from: classes23.dex */
public final class SandboxManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String cacheFolderPath;
    public final Context context;
    public final DigestHasher hasher;

    static {
        Covode.recordClassIndex(2959);
    }

    private final void cleanSandboxUploadTempFile(UploadSandboxEnv uploadSandboxEnv) {
        if (!PatchProxy.proxy(new Object[]{uploadSandboxEnv}, this, changeQuickRedirect, false, 3).isSupported && uploadSandboxEnv.getCopyToSandbox()) {
            try {
                boolean LIZ = C116971W2r.LIZ(new File(uploadSandboxEnv.getSandboxPath()));
                LogHelper logHelper = LogHelper.INSTANCE;
                logHelper.m20553i("SandboxManager", "delete sandbox upload temp file? answer: " + LIZ);
            } catch (Exception e) {
                LogHelper logHelper2 = LogHelper.INSTANCE;
                logHelper2.m20553i("SandboxManager", "delete sandbox upload temp file occur err. " + e.getMessage());
            }
        }
    }

    private final void cleanOriginUploadFile(UploadMedia uploadMedia) {
        boolean z;
        if (PatchProxy.proxy(new Object[]{uploadMedia}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        LogHelper logHelper = LogHelper.INSTANCE;
        logHelper.m20553i("SandboxManager", "delete origin file? answer: " + uploadMedia.getDeleteOnEnd());
        if (uploadMedia.getDeleteOnEnd()) {
            String path = uploadMedia.getPath();
            if (path != null && path.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                try {
                    boolean LIZ = C116971W2r.LIZ(new File(uploadMedia.getPath()));
                    LogHelper logHelper2 = LogHelper.INSTANCE;
                    logHelper2.m20553i("SandboxManager", "delete file success: " + LIZ);
                    return;
                } catch (Exception e) {
                    LogHelper logHelper3 = LogHelper.INSTANCE;
                    logHelper3.m20554e("SandboxManager", "delete occur error: " + e.getMessage());
                    return;
                }
            }
            String uri = uploadMedia.getUri();
            if (uri != null && uri.length() != 0) {
                try {
                    boolean LIZ2 = C116971W2r.LIZ(new File(uploadMedia.getUri()));
                    LogHelper logHelper4 = LogHelper.INSTANCE;
                    logHelper4.m20553i("SandboxManager", "delete file success: " + LIZ2);
                    return;
                } catch (Exception e2) {
                    LogHelper logHelper5 = LogHelper.INSTANCE;
                    logHelper5.m20554e("SandboxManager", "delete occur error: " + e2.getMessage());
                    return;
                }
            }
            LogHelper.INSTANCE.m20554e("SandboxManager", "path or uri is empty, skip delete origin file");
        }
    }

    public final UploadSandboxEnv prepareUploadSandbox(UploadMedia uploadMedia) {
        Uri parse;
        MethodCollector.m14708i(204);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uploadMedia}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            UploadSandboxEnv uploadSandboxEnv = (UploadSandboxEnv) proxy.result;
            MethodCollector.m14707o(204);
            return uploadSandboxEnv;
        }
        C106862S5w.LIZ(uploadMedia);
        ContentResolver contentResolver = this.context.getContentResolver();
        long gen2 = IdGenerator.INSTANCE.gen(0);
        File file = new File(this.cacheFolderPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (file.isDirectory()) {
            String str = this.cacheFolderPath;
            File file2 = new File(str, gen2 + ".temp");
            if (!file2.exists() || (C116971W2r.LIZ(file2) && file2.createNewFile())) {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                if (Build.VERSION.SDK_INT >= 29) {
                    String path = uploadMedia.getPath();
                    if (path != null && path.length() != 0) {
                        copyFile(new File(uploadMedia.getPath()), file2);
                    } else {
                        String uri = uploadMedia.getUri();
                        if (uri != null && (parse = Uri.parse(uri)) != null) {
                            fileOutputStream = contentResolver.openInputStream(parse);
                            if (fileOutputStream != null) {
                                try {
                                    FileUtils.copy(fileOutputStream, fileOutputStream);
                                    CloseableKt.closeFinally(fileOutputStream, null);
                                } finally {
                                }
                            } else {
                                FileNotFoundException fileNotFoundException = new FileNotFoundException("open input stream failed. uri=" + parse);
                                MethodCollector.m14707o(204);
                                throw fileNotFoundException;
                            }
                        } else {
                            NullPointerException nullPointerException = new NullPointerException("UploadMedia.uri must not null in Android Q+, please use uri when import EcMedia for uriOrPath >= Android Q");
                            MethodCollector.m14707o(204);
                            throw nullPointerException;
                        }
                    }
                } else {
                    String path2 = uploadMedia.getPath();
                    if (path2 != null && path2.length() != 0) {
                        copyFile(new File(uploadMedia.getPath()), file2);
                    } else {
                        NullPointerException nullPointerException2 = new NullPointerException("UploadMedia.path must not null in Android Q-, please use absolutePath when import EcMedia for uriOrPath < Android Q");
                        MethodCollector.m14707o(204);
                        throw nullPointerException2;
                    }
                }
                try {
                    DigestHasher digestHasher = this.hasher;
                    String absolutePath = file2.getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "");
                    DigestUtils.HashResult orNull = digestHasher.hashMd5AndCrc(absolutePath).getOrNull();
                    CloseableKt.closeFinally(fileOutputStream, null);
                    if (orNull != null) {
                        String absolutePath2 = file2.getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath2, "");
                        String str2 = orNull.md5;
                        Intrinsics.checkNotNullExpressionValue(str2, "");
                        Long l = orNull.crc;
                        Intrinsics.checkNotNullExpressionValue(l, "");
                        UploadSandboxEnv uploadSandboxEnv2 = new UploadSandboxEnv(absolutePath2, str2, l.longValue(), file2.length(), true);
                        MethodCollector.m14707o(204);
                        return uploadSandboxEnv2;
                    }
                    NullPointerException nullPointerException3 = new NullPointerException("calculate md5 and crc failed! path: " + file2.getAbsolutePath());
                    MethodCollector.m14707o(204);
                    throw nullPointerException3;
                } finally {
                    try {
                        MethodCollector.m14707o(204);
                        throw th;
                    } finally {
                    }
                }
            }
            IllegalStateException illegalStateException = new IllegalStateException("delete sandbox file failed or create sandbox file failed, " + file2.getAbsolutePath());
            MethodCollector.m14707o(204);
            throw illegalStateException;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("cacheFolderPath must be directory path, " + this.cacheFolderPath);
        MethodCollector.m14707o(204);
        throw illegalArgumentException;
    }

    private final void copyFile(File file, File file2) {
        MethodCollector.m14708i(205);
        if (PatchProxy.proxy(new Object[]{file, file2}, this, changeQuickRedirect, false, 5).isSupported) {
            MethodCollector.m14707o(205);
            return;
        }
        if (!file2.exists()) {
            file2.createNewFile();
        }
        try {
            FileChannel channel = new FileInputStream(file).getChannel();
            FileChannel fileChannel = channel;
            FileOutputStream fileInputStream = new FileOutputStream(file2);
            try {
                FileChannel LIZ = C116971W2r.LIZ(fileInputStream);
                fileChannel.transferTo(0L, fileChannel.size(), LIZ);
                th = null;
                CloseableKt.closeFinally(LIZ, th);
                CloseableKt.closeFinally(fileInputStream, th);
                CloseableKt.closeFinally(channel, th);
            } finally {
            }
        } finally {
            try {
                MethodCollector.m14707o(205);
                throw th;
            } finally {
            }
        }
    }

    public SandboxManager(Context context, String str, DigestHasher digestHasher) {
        C106862S5w.LIZ(context, str, digestHasher);
        this.context = context;
        this.cacheFolderPath = str;
        this.hasher = digestHasher;
    }

    public final void cleanUploadSandbox(UploadSandboxEnv uploadSandboxEnv, UploadMedia uploadMedia, Throwable th) {
        if (PatchProxy.proxy(new Object[]{uploadSandboxEnv, uploadMedia, th}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(uploadSandboxEnv, uploadMedia);
        cleanSandboxUploadTempFile(uploadSandboxEnv);
        if (th != null) {
            if (th instanceof PauseCancellationException) {
                LogHelper.INSTANCE.m20553i("SandboxManager", "delete origin file skip by PauseCancellationException");
            } else if (th instanceof CancellationException) {
                cleanOriginUploadFile(uploadMedia);
            } else {
                LogHelper.INSTANCE.m20553i("SandboxManager", C0002O.m25086C("delete origin file skip by occur error, ", th.getMessage()));
            }
        }
    }
}
