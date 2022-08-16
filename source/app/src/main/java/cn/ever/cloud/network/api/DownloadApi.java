package cn.ever.cloud.network.api;

import cn.ever.cloud.network.retrofit.AbstractC0738a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.coroutines.Continuation;

/* loaded from: classes23.dex */
public interface DownloadApi {
    static {
        Covode.recordClassIndex(3171);
    }

    Object streamDownload(String str, long j, long j2, Long l, Continuation<? super AbstractC0738a> continuation);

    Object streamDownload(String str, long j, Long l, Continuation<? super AbstractC0738a> continuation);

    /* loaded from: classes23.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3172);
        }

        public static /* synthetic */ Object streamDownload$default(DownloadApi downloadApi, String str, long j, Long l, Continuation continuation, int i, Object obj) {
            Object[] objArr = {downloadApi, str, new Long(j), l, continuation, Integer.valueOf(i), obj};
            Long l2 = null;
            PatchProxyResult proxy = PatchProxy.proxy(objArr, null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            if (obj == null) {
                if ((i & 4) == 0) {
                    l2 = l;
                }
                return downloadApi.streamDownload(str, j, l2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: streamDownload");
        }

        public static /* synthetic */ Object streamDownload$default(DownloadApi downloadApi, String str, long j, long j2, Long l, Continuation continuation, int i, Object obj) {
            Object[] objArr = {downloadApi, str, new Long(j), new Long(j2), l, continuation, Integer.valueOf(i), obj};
            Long l2 = null;
            PatchProxyResult proxy = PatchProxy.proxy(objArr, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return proxy.result;
            }
            if (obj == null) {
                if ((i & 8) == 0) {
                    l2 = l;
                }
                return downloadApi.streamDownload(str, j, j2, l2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: streamDownload");
        }
    }
}
