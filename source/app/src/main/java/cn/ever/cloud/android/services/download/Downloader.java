package cn.ever.cloud.android.services.download;

import android.util.Base64;
import cn.ever.cloud.android.coroutine.SdkScope;
import cn.ever.cloud.android.runtime.DigestHasher;
import cn.ever.cloud.android.services.task.entity.ItemProgress;
import cn.ever.cloud.network.api.AbstractC0729a;
import cn.ever.cloud.network.entity.NEncChunk;
import cn.ever.cloud.utils.AesUtil;
import cn.ever.cloud.utils.DigestUtils;
import cn.ever.cloud.utils.LogHelper;
import cn.ever.cloud.utils.Result;
import cn.ever.cloud.utils.ThrottleKt;
import cn.ever.cloud.utils.error.ClientError;
import cn.ever.cloud.utils.error.EpError;
import cn.ever.cloud.utils.error.ErrorCode;
import cn.ever.cloud.utils.monitor.MonitorKit;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import p003X.C106862S5w;
import p003X.C522456kZ;

/* loaded from: classes23.dex */
public final class Downloader {
    public static final C522456kZ Companion = new C522456kZ((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC0729a apiClient;
    public final DigestHasher digestHasher;
    public final SdkScope scope;

    static {
        Covode.recordClassIndex(3019);
    }

    /* loaded from: classes23.dex */
    public static final class DownloadReport {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final long cloudId;
        public final int code;
        public final int downloadPass;
        public final long durationMs;
        public final long fileSize;
        public final String md5;
        public final String message;
        public final long spaceId;
        public final float speed;

        static {
            Covode.recordClassIndex(3020);
        }

        public static /* synthetic */ DownloadReport copy$default(DownloadReport downloadReport, long j, int i, String str, long j2, String str2, long j3, float f, long j4, int i2, int i3, Object obj) {
            long j5 = j;
            long j6 = j2;
            int i4 = i;
            String str3 = str;
            float f2 = f;
            String str4 = str2;
            long j7 = j3;
            long j8 = j4;
            int i5 = i2;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{downloadReport, new Long(j5), Integer.valueOf(i4), str3, new Long(j6), str4, new Long(j7), Float.valueOf(f2), new Long(j8), Integer.valueOf(i5), Integer.valueOf(i3), obj}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (DownloadReport) proxy.result;
            }
            if ((i3 & 1) != 0) {
                j5 = downloadReport.spaceId;
            }
            if ((i3 & 2) != 0) {
                i4 = downloadReport.code;
            }
            if ((i3 & 4) != 0) {
                str3 = downloadReport.message;
            }
            if ((i3 & 8) != 0) {
                j6 = downloadReport.durationMs;
            }
            if ((i3 & 16) != 0) {
                str4 = downloadReport.md5;
            }
            if ((i3 & 32) != 0) {
                j7 = downloadReport.fileSize;
            }
            if ((i3 & 64) != 0) {
                f2 = downloadReport.speed;
            }
            if ((i3 & 128) != 0) {
                j8 = downloadReport.cloudId;
            }
            if ((i3 & 256) != 0) {
                i5 = downloadReport.downloadPass;
            }
            return downloadReport.copy(j5, i4, str3, j6, str4, j7, f2, j8, i5);
        }

        private Object[] getObjects() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
            return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.spaceId), Integer.valueOf(this.code), this.message, Long.valueOf(this.durationMs), this.md5, Long.valueOf(this.fileSize), Float.valueOf(this.speed), Long.valueOf(this.cloudId), Integer.valueOf(this.downloadPass)};
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

        public final String component5() {
            return this.md5;
        }

        public final long component6() {
            return this.fileSize;
        }

        public final float component7() {
            return this.speed;
        }

        public final long component8() {
            return this.cloudId;
        }

        public final int component9() {
            return this.downloadPass;
        }

        public final DownloadReport copy(long j, int i, String str, long j2, String str2, long j3, float f, long j4, int i2) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), str, new Long(j2), str2, new Long(j3), Float.valueOf(f), new Long(j4), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (DownloadReport) proxy.result;
            }
            C106862S5w.LIZ(str2);
            return new DownloadReport(j, i, str, j2, str2, j3, f, j4, i2);
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof DownloadReport) {
                return C106862S5w.LIZ(((DownloadReport) obj).getObjects(), getObjects());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("Downloader$DownloadReport:%s,%s,%s,%s,%s,%s,%s,%s,%s", getObjects());
        }

        public final long getCloudId() {
            return this.cloudId;
        }

        public final int getCode() {
            return this.code;
        }

        public final int getDownloadPass() {
            return this.downloadPass;
        }

        public final long getDurationMs() {
            return this.durationMs;
        }

        public final long getFileSize() {
            return this.fileSize;
        }

        public final String getMd5() {
            return this.md5;
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

        public DownloadReport(long j, int i, String str, long j2, String str2, long j3, float f, long j4, int i2) {
            C106862S5w.LIZ(str2);
            this.spaceId = j;
            this.code = i;
            this.message = str;
            this.durationMs = j2;
            this.md5 = str2;
            this.fileSize = j3;
            this.speed = f;
            this.cloudId = j4;
            this.downloadPass = i2;
        }
    }

    private final boolean validateChunksOrder(List<NEncChunk> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        NEncChunk nEncChunk = (NEncChunk) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
        if (nEncChunk != null) {
            long offset = nEncChunk.getOffset();
            for (NEncChunk nEncChunk2 : list) {
                if (offset > nEncChunk2.getOffset()) {
                    return false;
                }
                offset = nEncChunk2.getOffset();
            }
        }
        return true;
    }

    private final long rectifyAlreadyDownloaded(List<NEncChunk> list, long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, new Long(j)}, this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        long j2 = 0;
        for (NEncChunk nEncChunk : list) {
            if (nEncChunk.getOffset() + nEncChunk.getSize() == j) {
                break;
            }
            if (nEncChunk.getOffset() + nEncChunk.getSize() > j) {
                break;
            }
            j2 += nEncChunk.getSize();
        }
        j = j2;
        LogHelper logHelper = LogHelper.INSTANCE;
        logHelper.m20555d("Downloader", "rectifyAlreadyDownloaded offset=" + j);
        return j;
    }

    private final Result<Boolean> swapFile(String str, String str2) {
        Result<Boolean> failure;
        MethodCollector.m14708i(207);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 14);
        if (proxy.isSupported) {
            Result<Boolean> result = (Result) proxy.result;
            MethodCollector.m14707o(207);
            return result;
        }
        try {
            failure = Result.Companion.success(Boolean.valueOf(new File(str).renameTo(new File(str2))));
        } catch (Throwable th) {
            failure = Result.Companion.failure(th);
        }
        MethodCollector.m14707o(207);
        return failure;
    }

    private final boolean validateChunksCompletion(List<NEncChunk> list, long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, new Long(j)}, this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        long j2 = 0;
        for (NEncChunk nEncChunk : list) {
            if (nEncChunk.getOffset() != j2) {
                return false;
            }
            j2 += nEncChunk.getSize();
        }
        if (j2 != j) {
            return false;
        }
        return true;
    }

    public final void monitorDownload(Throwable th, DownloadMedia downloadMedia) {
        float f;
        String message;
        if (PatchProxy.proxy(new Object[]{th, downloadMedia}, this, changeQuickRedirect, false, 16).isSupported) {
            return;
        }
        long j = -1;
        int i = -1;
        try {
            j = MonitorKit.INSTANCE.serviceEndAndGetDuration("singleAssetDownloadResult", downloadMedia.getItemKey());
            f = (((float) downloadMedia.getSize()) / 1024.0f) / (((float) j) / 1000.0f);
        } catch (Exception e) {
            LogHelper.INSTANCE.m20554e("Downloader", String.valueOf(e.getMessage()));
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
        DownloadReport downloadReport = new DownloadReport(0L, i, message, j, downloadMedia.getMd5(), downloadMedia.getSize(), f, downloadMedia.getCloudId(), downloadMedia.getDownloadPass() ? 1 : 0);
        MonitorKit.INSTANCE.download("singleAssetDownloadResult", Long.valueOf(downloadReport.getSpaceId()), Integer.valueOf(downloadReport.getCode()), downloadReport.getMessage(), Long.valueOf(downloadReport.getDurationMs()), downloadReport.getMd5(), Long.valueOf(downloadReport.getFileSize()), Float.valueOf(downloadReport.getSpeed()), String.valueOf(downloadReport.getCloudId()), Integer.valueOf(downloadReport.getDownloadPass()));
    }

    public Downloader(DigestHasher digestHasher, AbstractC0729a abstractC0729a, SdkScope sdkScope) {
        C106862S5w.LIZ(digestHasher, abstractC0729a, sdkScope);
        this.digestHasher = digestHasher;
        this.apiClient = abstractC0729a;
        this.scope = sdkScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object downloadWithRetry(cn.ever.cloud.android.services.download.DownloadMedia r6, kotlin.jvm.functions.Function1<? super cn.ever.cloud.android.services.task.entity.ItemProgress, kotlin.Unit> r7, kotlin.coroutines.Continuation<? super java.lang.String> r8) {
        /*
            r5 = this;
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            r2[r1] = r6
            r4 = 1
            r2[r4] = r7
            r0 = 2
            r2[r0] = r8
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = cn.ever.cloud.android.services.download.Downloader.changeQuickRedirect
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r5, r0, r1, r4)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L19
            java.lang.Object r0 = r1.result
            return r0
        L19:
            boolean r0 = r8 instanceof cn.ever.cloud.android.services.download.Downloader$downloadWithRetry$1
            if (r0 == 0) goto L52
            r3 = r8
            cn.ever.cloud.android.services.download.Downloader$downloadWithRetry$1 r3 = (cn.ever.cloud.android.services.download.Downloader$downloadWithRetry$1) r3
            int r0 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L52
            int r0 = r3.label
            int r0 = r0 - r1
            r3.label = r0
        L2c:
            java.lang.Object r2 = r3.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.label
            if (r0 == 0) goto L44
            if (r0 != r4) goto L58
            java.lang.Object r6 = r3.L$0
            cn.ever.cloud.android.services.download.DownloadMedia r6 = (cn.ever.cloud.android.services.download.DownloadMedia) r6
            kotlin.ResultKt.throwOnFailure(r2)
        L3f:
            java.lang.String r0 = r6.getTargetPath()
            return r0
        L44:
            kotlin.ResultKt.throwOnFailure(r2)
            r3.L$0 = r6
            r3.label = r4
            java.lang.Object r0 = r5.downloadAndCheckIntegrity(r6, r7, r3)
            if (r0 != r1) goto L3f
            return r1
        L52:
            cn.ever.cloud.android.services.download.Downloader$downloadWithRetry$1 r3 = new cn.ever.cloud.android.services.download.Downloader$downloadWithRetry$1
            r3.<init>(r5, r8)
            goto L2c
        L58:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.download.Downloader.downloadWithRetry(cn.ever.cloud.android.services.download.DownloadMedia, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Type inference failed for: r4v3, types: [byte[], T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object encryptDownloadInternal(cn.ever.cloud.network.entity.NEncChunk r19, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> r20, kotlin.coroutines.Continuation<? super byte[]> r21) {
        /*
            r18 = this;
            r6 = r18
            r0 = 3
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r3 = 0
            r5 = r19
            r4[r3] = r5
            r8 = 1
            r0 = r20
            r4[r8] = r0
            r1 = 2
            r7 = r21
            r4[r1] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r2 = cn.ever.cloud.android.services.download.Downloader.changeQuickRedirect
            r1 = 6
            com.bytedance.hotfix.PatchProxyResult r2 = com.bytedance.hotfix.PatchProxy.proxy(r4, r6, r2, r3, r1)
            boolean r1 = r2.isSupported
            if (r1 == 0) goto L22
            java.lang.Object r0 = r2.result
            return r0
        L22:
            boolean r1 = r7 instanceof cn.ever.cloud.android.services.download.Downloader$encryptDownloadInternal$1
            if (r1 == 0) goto L9e
            r15 = r7
            cn.ever.cloud.android.services.download.Downloader$encryptDownloadInternal$1 r15 = (cn.ever.cloud.android.services.download.Downloader$encryptDownloadInternal$1) r15
            int r1 = r15.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L9e
            int r1 = r15.label
            int r1 = r1 - r2
            r15.label = r1
        L35:
            java.lang.Object r6 = r15.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r15.label
            if (r1 == 0) goto L57
            if (r1 != r8) goto La4
            java.lang.Object r4 = r15.L$1
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref.IntRef) r4
            java.lang.Object r1 = r15.L$0
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            kotlin.ResultKt.throwOnFailure(r6)
        L4c:
            T r1 = r1.element
            byte[] r1 = (byte[]) r1
            int r0 = r4.element
            byte[] r0 = kotlin.collections.ArraysKt___ArraysJvmKt.copyOfRange(r1, r3, r0)
            return r0
        L57:
            kotlin.ResultKt.throwOnFailure(r6)
            long r9 = r5.getSize()
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r1 > 0) goto Lac
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            long r6 = r5.getSize()
            int r4 = (int) r6
            byte[] r4 = new byte[r4]
            r1.element = r4
            kotlin.jvm.internal.Ref$IntRef r4 = new kotlin.jvm.internal.Ref$IntRef
            r4.<init>()
            r4.element = r3
            java.lang.String r9 = r5.getLink()
            r10 = 0
            r11 = 0
            r6 = 0
            cn.ever.cloud.android.services.download.Downloader$encryptDownloadInternal$2 r14 = new cn.ever.cloud.android.services.download.Downloader$encryptDownloadInternal$2
            r14.<init>(r1, r4, r0, r5)
            r0 = 14
            r17 = 0
            r15.L$0 = r1
            r15.L$1 = r4
            r15.label = r8
            r8 = r18
            r12 = 0
            r16 = 14
            java.lang.Object r0 = downloadInternal$default(r8, r9, r10, r11, r12, r14, r15, r16, r17)
            if (r0 != r2) goto L4c
            return r2
        L9e:
            cn.ever.cloud.android.services.download.Downloader$encryptDownloadInternal$1 r15 = new cn.ever.cloud.android.services.download.Downloader$encryptDownloadInternal$1
            r15.<init>(r6, r7)
            goto L35
        La4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lac:
            cn.ever.cloud.utils.error.ClientError r4 = new cn.ever.cloud.utils.error.ClientError
            cn.ever.cloud.utils.error.ErrorCode r3 = cn.ever.cloud.utils.error.ErrorCode.CLIENT_DOWNLOAD_CHUNK_TO_LARGE
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "chunk="
            r2.<init>(r0)
            java.lang.String r0 = r5.getLink()
            r2.append(r0)
            java.lang.String r0 = ", size="
            r2.append(r0)
            long r0 = r5.getSize()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r4.<init>(r3, r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.download.Downloader.encryptDownloadInternal(cn.ever.cloud.network.entity.NEncChunk, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Result<Long> alreadyDownloaded(String str, long j, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, new Long(j), str2}, this, changeQuickRedirect, false, 13);
        if (proxy.isSupported) {
            return (Result) proxy.result;
        }
        File file = new File(str);
        if (!file.exists()) {
            LogHelper logHelper = LogHelper.INSTANCE;
            logHelper.m20553i("Downloader", str + " not exists. reset offset.");
            return Result.Companion.success(0L);
        } else if (!file.isFile()) {
            Result.Companion companion = Result.Companion;
            ErrorCode errorCode = ErrorCode.CLIENT_DOWNLOAD_PATH_IS_DIRECTORY;
            return companion.failure(new ClientError(errorCode, str + " is a directory."));
        } else {
            long length = file.length();
            if (j == length) {
                Result<DigestUtils.HashResult> hashMd5AndCrc = this.digestHasher.hashMd5AndCrc(str);
                if (hashMd5AndCrc.exceptionOrNull() == null) {
                    if (Intrinsics.areEqual(((DigestUtils.HashResult) hashMd5AndCrc.getValue()).md5, str2)) {
                        LogHelper logHelper2 = LogHelper.INSTANCE;
                        logHelper2.m20553i("Downloader", "target:" + str + " already exists");
                        return Result.Companion.success(Long.valueOf(j));
                    }
                    LogHelper logHelper3 = LogHelper.INSTANCE;
                    logHelper3.m20553i("Downloader", "target:" + str + " exists with same size, but md5 inconsistency");
                    return Result.Companion.success(0L);
                }
                LogHelper logHelper4 = LogHelper.INSTANCE;
                logHelper4.m20553i("Downloader", str + " not exists. reset offset.");
                return Result.Companion.success(0L);
            }
            if (length >= j) {
                length = 0;
            }
            LogHelper logHelper5 = LogHelper.INSTANCE;
            logHelper5.m20553i("Downloader", str + " exists. set offset to " + length + '.');
            return Result.Companion.success(Long.valueOf(length));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object downloadAndCheckIntegrity(cn.ever.cloud.android.services.download.DownloadMedia r29, kotlin.jvm.functions.Function1<? super cn.ever.cloud.android.services.task.entity.ItemProgress, kotlin.Unit> r30, kotlin.coroutines.Continuation<? super kotlin.Unit> r31) {
        /*
            Method dump skipped, instructions count: 973
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.download.Downloader.downloadAndCheckIntegrity(cn.ever.cloud.android.services.download.DownloadMedia, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Result<Object> decryptAndWriteToFile(String str, byte[] bArr, long j, RandomAccessFile randomAccessFile) {
        Result failure;
        Result.Companion companion;
        AesUtil aesUtil;
        Charset charset;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, bArr, new Long(j), randomAccessFile}, this, changeQuickRedirect, false, 15);
        if (proxy.isSupported) {
            return (Result) proxy.result;
        }
        LogHelper.INSTANCE.m20552v("Downloader", "decrypt data");
        try {
            companion = Result.Companion;
            aesUtil = AesUtil.INSTANCE;
            charset = Charsets.UTF_8;
        } catch (Throwable th) {
            failure = Result.Companion.failure(th);
        }
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            byte[] decode = Base64.decode(bytes, 0);
            Intrinsics.checkNotNullExpressionValue(decode, "");
            failure = companion.success(aesUtil.decrypt(bArr, decode));
            Throwable exceptionOrNull = failure.exceptionOrNull();
            if (exceptionOrNull == null) {
                byte[] bArr2 = (byte[]) failure.getValue();
                if (bArr2.length != j) {
                    Result.Companion companion2 = Result.Companion;
                    ErrorCode errorCode = ErrorCode.CLIENT_DOWNLOAD_CHUNK_DECRYPT;
                    return companion2.failure(new ClientError(errorCode, "decrypt size=" + bArr2.length + ", expect " + j));
                }
                LogHelper.INSTANCE.m20552v("Downloader", "write to file");
                try {
                    Result.Companion companion3 = Result.Companion;
                    randomAccessFile.write(bArr2);
                    companion3.success(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion.failure(th2);
                }
                LogHelper.INSTANCE.m20552v("Downloader", "write to file success");
                return Result.Companion.success(new Object());
            }
            return Result.Companion.failure(exceptionOrNull);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final /* synthetic */ Object directDownload(DownloadMedia downloadMedia, long j, String str, Function1<? super ItemProgress, Unit> function1, Continuation<? super Long> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{downloadMedia, new Long(j), str, function1, continuation}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return directDownloadInternal(str, downloadMedia.getCloudId(), j, ThrottleKt.throttleLatest(300L, this.scope, new Downloader$directDownload$2(function1, downloadMedia, j)), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object directDownloadInternal(java.lang.String r18, long r19, long r21, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> r23, kotlin.coroutines.Continuation<? super java.lang.Long> r24) {
        /*
            r17 = this;
            r4 = r17
            r0 = 5
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r9 = 0
            r8 = r18
            r10[r9] = r8
            java.lang.Long r2 = new java.lang.Long
            r0 = r19
            r2.<init>(r0)
            r5 = 1
            r10[r5] = r2
            java.lang.Long r3 = new java.lang.Long
            r11 = r21
            r3.<init>(r11)
            r2 = 2
            r10[r2] = r3
            r2 = 3
            r7 = r23
            r10[r2] = r7
            r2 = 4
            r6 = r24
            r10[r2] = r6
            com.bytedance.hotfix.base.ChangeQuickRedirect r3 = cn.ever.cloud.android.services.download.Downloader.changeQuickRedirect
            r2 = 7
            com.bytedance.hotfix.PatchProxyResult r3 = com.bytedance.hotfix.PatchProxy.proxy(r10, r4, r3, r9, r2)
            boolean r2 = r3.isSupported
            if (r2 == 0) goto L36
            java.lang.Object r0 = r3.result
            return r0
        L36:
            boolean r2 = r6 instanceof cn.ever.cloud.android.services.download.Downloader$directDownloadInternal$1
            if (r2 == 0) goto L98
            r14 = r6
            cn.ever.cloud.android.services.download.Downloader$directDownloadInternal$1 r14 = (cn.ever.cloud.android.services.download.Downloader$directDownloadInternal$1) r14
            int r2 = r14.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L98
            int r2 = r14.label
            int r2 = r2 - r3
            r14.label = r2
        L49:
            java.lang.Object r3 = r14.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r14.label
            if (r2 == 0) goto L63
            if (r2 != r5) goto L9e
            java.lang.Object r2 = r14.L$0
            kotlin.jvm.internal.Ref$LongRef r2 = (kotlin.jvm.internal.Ref.LongRef) r2
            kotlin.ResultKt.throwOnFailure(r3)
        L5c:
            long r0 = r2.element
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)
            return r0
        L63:
            kotlin.ResultKt.throwOnFailure(r3)
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile
            java.io.File r3 = new java.io.File
            r3.<init>(r8)
            java.lang.String r2 = "rw"
            r6.<init>(r3, r2)
            r6.seek(r11)
            kotlin.jvm.internal.Ref$LongRef r2 = new kotlin.jvm.internal.Ref$LongRef
            r2.<init>()
            r2.element = r11
            r8 = 0
            r9 = 0
            java.lang.Long r10 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)
            cn.ever.cloud.android.services.download.Downloader$directDownloadInternal$2 r13 = new cn.ever.cloud.android.services.download.Downloader$directDownloadInternal$2
            r13.<init>(r6, r2, r7)
            r0 = 3
            r16 = 0
            r14.L$0 = r2
            r14.label = r5
            r7 = r17
            r15 = 3
            java.lang.Object r0 = downloadInternal$default(r7, r8, r9, r10, r11, r13, r14, r15, r16)
            if (r0 != r4) goto L5c
            return r4
        L98:
            cn.ever.cloud.android.services.download.Downloader$directDownloadInternal$1 r14 = new cn.ever.cloud.android.services.download.Downloader$directDownloadInternal$1
            r14.<init>(r4, r6)
            goto L49
        L9e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.download.Downloader.directDownloadInternal(java.lang.String, long, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e6 A[Catch: all -> 0x01f5, TryCatch #8 {all -> 0x01f5, blocks: (B:66:0x01ca, B:50:0x01e6, B:51:0x01f4, B:62:0x01da, B:63:0x01dd), top: B:48:0x0199 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020d  */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v25, types: [kotlin.jvm.internal.Ref$BooleanRef] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r13v14, types: [byte[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0088 -> B:14:0x008d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object downloadInternal(java.lang.String r25, java.lang.String r26, java.lang.Long r27, long r28, kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Integer, kotlin.Unit> r30, kotlin.coroutines.Continuation<? super kotlin.Unit> r31) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.download.Downloader.downloadInternal(java.lang.String, java.lang.String, java.lang.Long, long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0200 A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v34, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00a2 -> B:15:0x0076). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x01fe -> B:16:0x0077). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object encryptDownloadChunkToFile(cn.ever.cloud.android.services.download.DownloadMedia r30, long r31, java.lang.String r33, java.util.List<cn.ever.cloud.network.entity.NEncChunk> r34, java.lang.String r35, kotlin.jvm.functions.Function1<? super cn.ever.cloud.android.services.task.entity.ItemProgress, kotlin.Unit> r36, kotlin.coroutines.Continuation<? super cn.ever.cloud.utils.Result<java.lang.Long>> r37) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.download.Downloader.encryptDownloadChunkToFile(cn.ever.cloud.android.services.download.DownloadMedia, long, java.lang.String, java.util.List, java.lang.String, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object encryptDownload(cn.ever.cloud.android.services.download.DownloadMedia r18, java.lang.String r19, java.util.List<cn.ever.cloud.network.entity.NEncChunk> r20, long r21, long r23, java.lang.String r25, kotlin.jvm.functions.Function1<? super cn.ever.cloud.android.services.task.entity.ItemProgress, kotlin.Unit> r26, kotlin.coroutines.Continuation<? super java.lang.Long> r27) {
        /*
            r17 = this;
            r13 = r20
            r6 = r17
            r0 = r6
            r0 = 8
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r4 = 0
            r9 = r18
            r8[r4] = r9
            r5 = 1
            r12 = r19
            r8[r5] = r12
            r0 = 2
            r8[r0] = r13
            java.lang.Long r3 = new java.lang.Long
            r0 = r21
            r3.<init>(r0)
            r2 = 3
            r8[r2] = r3
            java.lang.Long r2 = new java.lang.Long
            r10 = r23
            r2.<init>(r10)
            r3 = 4
            r8[r3] = r2
            r2 = 5
            r14 = r25
            r8[r2] = r14
            r2 = 6
            r15 = r26
            r8[r2] = r15
            r2 = 7
            r7 = r27
            r8[r2] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r2 = cn.ever.cloud.android.services.download.Downloader.changeQuickRedirect
            com.bytedance.hotfix.PatchProxyResult r3 = com.bytedance.hotfix.PatchProxy.proxy(r8, r6, r2, r4, r3)
            boolean r2 = r3.isSupported
            if (r2 == 0) goto L46
            java.lang.Object r0 = r3.result
            return r0
        L46:
            boolean r2 = r7 instanceof cn.ever.cloud.android.services.download.Downloader$encryptDownload$1
            if (r2 == 0) goto L9f
            r4 = r7
            cn.ever.cloud.android.services.download.Downloader$encryptDownload$1 r4 = (cn.ever.cloud.android.services.download.Downloader$encryptDownload$1) r4
            int r2 = r4.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L9f
            int r2 = r4.label
            int r2 = r2 - r3
            r4.label = r2
        L59:
            java.lang.Object r7 = r4.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r4.label
            if (r2 == 0) goto L6f
            if (r2 != r5) goto La5
            kotlin.ResultKt.throwOnFailure(r7)
        L68:
            cn.ever.cloud.utils.Result r7 = (cn.ever.cloud.utils.Result) r7
            java.lang.Object r0 = cn.ever.cloud.utils.ResultKt.getOrThrow(r7)
            return r0
        L6f:
            kotlin.ResultKt.throwOnFailure(r7)
            boolean r2 = r6.validateChunksOrder(r13)
            if (r2 != 0) goto L8a
            cn.ever.cloud.utils.LogHelper r8 = cn.ever.cloud.utils.LogHelper.INSTANCE
            java.lang.String r7 = "Downloader"
            java.lang.String r2 = "chunks order error, resort."
            r8.m20554e(r7, r2)
            cn.ever.cloud.android.services.download.Downloader$encryptDownload$$inlined$sortedBy$1 r2 = new cn.ever.cloud.android.services.download.Downloader$encryptDownload$$inlined$sortedBy$1
            r2.<init>()
            java.util.List r13 = kotlin.collections.CollectionsKt___CollectionsKt.sortedWith(r13, r2)
        L8a:
            boolean r0 = r6.validateChunksCompletion(r13, r0)
            if (r0 == 0) goto Lad
            r6.rectifyAlreadyDownloaded(r13, r10)
            r4.label = r5
            r8 = r6
            r16 = r4
            java.lang.Object r7 = r8.encryptDownloadChunkToFile(r9, r10, r12, r13, r14, r15, r16)
            if (r7 != r3) goto L68
            return r3
        L9f:
            cn.ever.cloud.android.services.download.Downloader$encryptDownload$1 r4 = new cn.ever.cloud.android.services.download.Downloader$encryptDownload$1
            r4.<init>(r6, r7)
            goto L59
        La5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lad:
            cn.ever.cloud.utils.error.ClientError r3 = new cn.ever.cloud.utils.error.ClientError
            cn.ever.cloud.utils.error.ErrorCode r2 = cn.ever.cloud.utils.error.ErrorCode.CLIENT_DOWNLOAD_CHUNK_INCOMPLETE
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "media="
            r1.<init>(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            r3.<init>(r2, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.download.Downloader.encryptDownload(cn.ever.cloud.android.services.download.DownloadMedia, java.lang.String, java.util.List, long, long, java.lang.String, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object downloadInternal$default(Downloader downloader, String str, String str2, Long l, long j, Function2 function2, Continuation continuation, int i, Object obj) {
        long j2 = j;
        String str3 = str;
        String str4 = str2;
        Long l2 = null;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{downloader, str3, str4, l, new Long(j2), function2, continuation, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 9);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if ((i & 1) != 0) {
            str3 = null;
        }
        if ((i & 2) != 0) {
            str4 = "origin";
        }
        if ((i & 4) == 0) {
            l2 = l;
        }
        if ((i & 8) != 0) {
            j2 = 0;
        }
        return downloader.downloadInternal(str3, str4, l2, j2, function2, continuation);
    }
}
