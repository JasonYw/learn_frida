package cn.ever.cloud.android.services.upload;

import cn.ever.cloud.android.coroutine.SdkScope;
import cn.ever.cloud.android.p039a.AbstractC0682d;
import cn.ever.cloud.android.runtime.DigestHasher;
import cn.ever.cloud.android.runtime.RuntimeExtManager;
import cn.ever.cloud.android.runtime.SandboxManager;
import cn.ever.cloud.android.services.task.entity.ItemProgress;
import cn.ever.cloud.network.api.AbstractC0729a;
import cn.ever.cloud.network.retrofit.AbstractC0739b;
import cn.ever.cloud.utils.LogHelper;
import cn.ever.cloud.utils.Result;
import cn.ever.cloud.utils.error.ClientError;
import cn.ever.cloud.utils.error.EpError;
import cn.ever.cloud.utils.error.ErrorCode;
import cn.ever.cloud.utils.monitor.MonitorKit;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.clientreport.data.Config;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobKt;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C522256kF;

/* loaded from: classes23.dex */
public final class Uploader {
    public static final C522256kF Companion = new C522256kF((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC0729a apiClient;
    public final DigestHasher hasher;
    public final AbstractC0682d repo;
    public final RuntimeExtManager runtimeExtManager;
    public final SandboxManager sandboxManager;
    public final SdkScope scope;
    public final AbstractC0727a uploadCompleter;
    public final UploadGuard uploadGuard;

    static {
        Covode.recordClassIndex(3155);
    }

    /* loaded from: classes23.dex */
    public static final class UploadReport {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int code;
        public final long durationMs;
        public final String message;
        public final long spaceId;
        public final float speed;
        public final int uploadPass;

        static {
            Covode.recordClassIndex(3156);
        }

        public static /* synthetic */ UploadReport copy$default(UploadReport uploadReport, long j, int i, String str, long j2, float f, int i2, int i3, Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uploadReport, new Long(j), Integer.valueOf(i), str, new Long(j2), Float.valueOf(f), Integer.valueOf(i2), Integer.valueOf(i3), obj}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (UploadReport) proxy.result;
            }
            if ((i3 & 1) != 0) {
                j = uploadReport.spaceId;
            }
            if ((i3 & 2) != 0) {
                i = uploadReport.code;
            }
            if ((i3 & 4) != 0) {
                str = uploadReport.message;
            }
            if ((i3 & 8) != 0) {
                j2 = uploadReport.durationMs;
            }
            if ((i3 & 16) != 0) {
                f = uploadReport.speed;
            }
            if ((i3 & 32) != 0) {
                i2 = uploadReport.uploadPass;
            }
            return uploadReport.copy(j, i, str, j2, f, i2);
        }

        private Object[] getObjects() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
            return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.spaceId), Integer.valueOf(this.code), this.message, Long.valueOf(this.durationMs), Float.valueOf(this.speed), Integer.valueOf(this.uploadPass)};
        }

        public final long component1() {
            return this.spaceId;
        }

        public final int component2() {
            return this.code;
        }

        public final String component3() {
            return this.message;
        }

        public final long component4() {
            return this.durationMs;
        }

        public final float component5() {
            return this.speed;
        }

        public final int component6() {
            return this.uploadPass;
        }

        public final UploadReport copy(long j, int i, String str, long j2, float f, int i2) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), str, new Long(j2), Float.valueOf(f), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 1);
            return proxy.isSupported ? (UploadReport) proxy.result : new UploadReport(j, i, str, j2, f, i2);
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof UploadReport) {
                return C106862S5w.LIZ(((UploadReport) obj).getObjects(), getObjects());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("Uploader$UploadReport:%s,%s,%s,%s,%s,%s", getObjects());
        }

        public final int getCode() {
            return this.code;
        }

        public final long getDurationMs() {
            return this.durationMs;
        }

        public final String getMessage() {
            return this.message;
        }

        public final long getSpaceId() {
            return this.spaceId;
        }

        public final float getSpeed() {
            return this.speed;
        }

        public final int getUploadPass() {
            return this.uploadPass;
        }

        public UploadReport(long j, int i, String str, long j2, float f, int i2) {
            this.spaceId = j;
            this.code = i;
            this.message = str;
            this.durationMs = j2;
            this.speed = f;
            this.uploadPass = i2;
        }
    }

    public final String str(UploadMedia uploadMedia, UploadSandboxEnv uploadSandboxEnv) {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uploadMedia, uploadSandboxEnv}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String assetId = uploadMedia.getAssetId();
        String path = uploadMedia.getPath();
        if (path == null) {
            path = uploadMedia.getUri();
        }
        String itemKey = uploadMedia.getItemKey();
        if (uploadSandboxEnv != null) {
            str = uploadSandboxEnv.getMd5();
        } else {
            str = null;
        }
        return C0002O.m25080C("media={assetId=", assetId, "}, path=", path, ", itemKey=", itemKey, ", md5=", str);
    }

    public final Object uploadWithGuardPath(UploadMedia uploadMedia, Function1<? super ItemProgress, Unit> function1, Continuation<? super Long> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uploadMedia, function1, continuation}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        String path = uploadMedia.getPath();
        if (path == null && (path = uploadMedia.getUri()) == null) {
            path = "";
        }
        return this.uploadGuard.runInGuard(path, new Uploader$uploadWithGuardPath$2(this, uploadMedia, function1, null), continuation);
    }

    public final Object upload(UploadMedia uploadMedia, Function1<? super ItemProgress, Unit> function1, Continuation<? super Long> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uploadMedia, function1, continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return proxy.result;
        }
        MonitorKit.INSTANCE.serviceStart("singleAssetBackupResult", uploadMedia.getItemKey());
        try {
            UploadSandboxEnv prepareUploadSandbox = this.sandboxManager.prepareUploadSandbox(uploadMedia);
            JobKt.getJob(continuation.getContext()).invokeOnCompletion(new Uploader$upload$2(this, prepareUploadSandbox, uploadMedia));
            LogHelper.INSTANCE.m20553i("Uploader", C0002O.m25086C("start upload: ", str(uploadMedia, prepareUploadSandbox)));
            return this.uploadGuard.runInGuard(prepareUploadSandbox.getMd5(), new Uploader$upload$3(this, prepareUploadSandbox, function1, uploadMedia, null), continuation);
        } catch (FileNotFoundException e) {
            LogHelper.INSTANCE.m20554e("Uploader", C0002O.m25086C("sandbox manager prepare upload env occured err: ", e.getMessage()));
            throw ClientError.Companion.toClientError(ErrorCode.CLIENT_UPLOAD_FILE_NOT_EXISTS);
        }
    }

    public final void monitorBackup(Throwable th, UploadSandboxEnv uploadSandboxEnv, UploadMedia uploadMedia) {
        float f;
        String message;
        if (PatchProxy.proxy(new Object[]{th, uploadSandboxEnv, uploadMedia}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        long j = -1;
        int i = -1;
        try {
            j = MonitorKit.INSTANCE.serviceEndAndGetDuration("singleAssetBackupResult", uploadMedia.getItemKey());
            f = (((float) uploadSandboxEnv.getSize()) / 1024.0f) / (((float) j) / 1000.0f);
        } catch (Exception e) {
            LogHelper.INSTANCE.m20554e("Uploader", String.valueOf(e.getMessage()));
            f = 0.0f;
        }
        if (th == null) {
            message = "success";
            i = 0;
        } else if (th instanceof CancellationException) {
            return;
        } else {
            if (th instanceof EpError) {
                EpError epError = (EpError) th;
                i = epError.getCode();
                message = epError.getHumanMessage();
            } else {
                message = th.getMessage();
                if (message == null) {
                    message = th.getClass().getCanonicalName();
                }
            }
        }
        UploadReport uploadReport = new UploadReport(0L, i, message, j, f, uploadSandboxEnv.getUploadPass() ? 1 : 0);
        MonitorKit.INSTANCE.backup("singleAssetBackupResult", Long.valueOf(uploadReport.getSpaceId()), Integer.valueOf(uploadReport.getCode()), uploadReport.getMessage(), Long.valueOf(uploadReport.getDurationMs()), Float.valueOf(uploadReport.getSpeed()), Integer.valueOf(uploadReport.getUploadPass()));
    }

    public final AbstractC0739b createNewTypedOutput(final String str, final long j, final long j2, final Function1<? super Long, Unit> function1) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, new Long(j), new Long(j2), function1}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (AbstractC0739b) proxy.result;
        }
        return new AbstractC0739b(j, j2, str, function1) { // from class: cn.ever.cloud.android.services.upload.Uploader$createNewTypedOutput$1
            public static ChangeQuickRedirect changeQuickRedirect;
            public final /* synthetic */ long $length;
            public final /* synthetic */ long $offset;
            public final /* synthetic */ String $path;
            public final /* synthetic */ Function1 $progressFn;
            public final File file;
            public final String fileName;

            static {
                Covode.recordClassIndex(3158);
            }

            @Override // cn.ever.cloud.network.retrofit.AbstractC0739b
            public final long length() {
                return -1L;
            }

            @Override // cn.ever.cloud.network.retrofit.AbstractC0739b
            public final String mimeType() {
                return null;
            }

            @Override // cn.ever.cloud.network.retrofit.AbstractC0739b
            public final String fileName() {
                return this.fileName;
            }

            public final File getFile() {
                return this.file;
            }

            public final String getFileName() {
                return this.fileName;
            }

            @Override // cn.ever.cloud.network.retrofit.AbstractC0739b
            public final void writeTo(OutputStream outputStream) {
                Result failure;
                int i;
                MethodCollector.m14708i(216);
                if (PatchProxy.proxy(new Object[]{outputStream}, this, changeQuickRedirect, false, 1).isSupported) {
                    MethodCollector.m14707o(216);
                    return;
                }
                try {
                    failure = Result.Companion.success(new RandomAccessFile(this.file, "r"));
                } catch (Throwable th) {
                    failure = Result.Companion.failure(th);
                }
                if (failure.isSuccess()) {
                    RandomAccessFile randomAccessFile = (RandomAccessFile) failure.getValue();
                    randomAccessFile.seek(this.$offset);
                    long j3 = this.$length;
                    if (0 <= j3 && Config.DEFAULT_MAX_FILE_LENGTH > j3) {
                        i = 65536;
                    } else if (Config.DEFAULT_MAX_FILE_LENGTH <= j3 && 10485760 > j3) {
                        i = 131072;
                    } else if (10485760 <= j3 && 52428800 > j3) {
                        i = 524288;
                    } else {
                        i = 1048576;
                    }
                    byte[] bArr = new byte[i];
                    while (true) {
                        try {
                            int read = randomAccessFile.read(bArr, 0, Math.min(bArr.length, (int) j3));
                            if (read <= 0) {
                                LogHelper logHelper = LogHelper.INSTANCE;
                                logHelper.m20552v("Uploader", "read size=" + read + " <= 0, break");
                                break;
                            }
                            LogHelper logHelper2 = LogHelper.INSTANCE;
                            logHelper2.m20552v("Uploader", "read size=" + read);
                            if (outputStream != null) {
                                outputStream.write(bArr, 0, read);
                            }
                            j3 -= read;
                            this.$progressFn.invoke(Long.valueOf(this.$length - j3));
                            if (j3 <= 0) {
                                break;
                            }
                        } catch (Throwable th2) {
                            LogHelper logHelper3 = LogHelper.INSTANCE;
                            logHelper3.m20554e("Uploader", "read file input stream error: path=" + this.$path + ", error=" + th2);
                            if (th2 instanceof IOException) {
                                ClientError clientError = ClientError.Companion.toClientError(ErrorCode.CLIENT_UPLOAD_FILE_NOT_EXISTS);
                                MethodCollector.m14707o(216);
                                throw clientError;
                            }
                            MethodCollector.m14707o(216);
                            throw th2;
                        }
                    }
                }
                Throwable exceptionOrNull = failure.exceptionOrNull();
                if (exceptionOrNull == null) {
                    MethodCollector.m14707o(216);
                    return;
                }
                LogHelper logHelper4 = LogHelper.INSTANCE;
                logHelper4.m20554e("Uploader", "open file error: path=" + this.$path + ", error=" + exceptionOrNull);
                ClientError clientError2 = ClientError.Companion.toClientError(ErrorCode.CLIENT_UPLOAD_FILE_NOT_EXISTS);
                MethodCollector.m14707o(216);
                throw clientError2;
            }

            {
                this.$path = str;
                this.$progressFn = function1;
                this.file = new File(str);
                this.fileName = this.file.getName();
            }
        };
    }

    public static /* synthetic */ String str$default(Uploader uploader, UploadMedia uploadMedia, UploadSandboxEnv uploadSandboxEnv, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uploader, uploadMedia, uploadSandboxEnv, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if ((i & 1) != 0) {
            uploadSandboxEnv = null;
        }
        return uploader.str(uploadMedia, uploadSandboxEnv);
    }

    public Uploader(AbstractC0729a abstractC0729a, DigestHasher digestHasher, SandboxManager sandboxManager, AbstractC0727a abstractC0727a, SdkScope sdkScope, UploadGuard uploadGuard, RuntimeExtManager runtimeExtManager, AbstractC0682d abstractC0682d) {
        C106862S5w.LIZ(abstractC0729a, digestHasher, sandboxManager, abstractC0727a, sdkScope, uploadGuard, runtimeExtManager, abstractC0682d);
        this.apiClient = abstractC0729a;
        this.hasher = digestHasher;
        this.sandboxManager = sandboxManager;
        this.uploadCompleter = abstractC0727a;
        this.scope = sdkScope;
        this.uploadGuard = uploadGuard;
        this.runtimeExtManager = runtimeExtManager;
        this.repo = abstractC0682d;
    }
}
