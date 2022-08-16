package cn.ever.cloud.network_impl.api;

import cn.ever.cloud.network.api.AbstractC0729a;
import cn.ever.cloud.network.api.ApiBundle;
import cn.ever.cloud.network.api.BeanFactory;
import cn.ever.cloud.network.entity.C0731a;
import cn.ever.cloud.network.entity.C0732b;
import cn.ever.cloud.network.entity.C0733c;
import cn.ever.cloud.network.entity.C0734d;
import cn.ever.cloud.network.entity.C0735e;
import cn.ever.cloud.network.entity.C0736f;
import cn.ever.cloud.network.entity.C0737g;
import cn.ever.cloud.network.entity.NGetAssetEncRequest;
import cn.ever.cloud.network.entity.NGetUpdatesRequest;
import cn.ever.cloud.network.entity.NGetVideoPlayerRequest;
import cn.ever.cloud.network.entity.NPostSyncCommandRequest;
import cn.ever.cloud.network.entity.NUploadChunkRequest;
import cn.ever.cloud.network.entity.NUploadCompleteRequest;
import cn.ever.cloud.network.entity.NUploadStateRequest;
import cn.ever.cloud.network.retrofit.AbstractC0739b;
import cn.ever.cloud.network_impl.DataConverterKt;
import cn.ever.cloud.network_impl.NetworkHelperKt;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.ttnet.utils.RetrofitUtils;
import kotlin.coroutines.Continuation;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class ApiClientImpl implements AbstractC0729a {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final ApiBundle apiBundle;
    public final ApiExecutor apiExecutor;
    public final RetrofitDownloadApi downloadService;
    public final Retrofit retrofit;
    public final RetrofitApi service;
    public final RetrofitUploadApi uploadService;

    static {
        Covode.recordClassIndex(3266);
    }

    @Override // cn.ever.cloud.network.api.AbstractC0729a
    public final Object getAssetEnc(NGetAssetEncRequest nGetAssetEncRequest, Continuation<? super C0731a> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{nGetAssetEncRequest, continuation}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.apiExecutor.execute(this.service.getAssetEnc(this.apiBundle.getSourceFrom(), BeanFactory.INSTANCE.getAssetEnc().getPath(), nGetAssetEncRequest), continuation);
    }

    @Override // cn.ever.cloud.network.api.AbstractC0729a
    public final Object getUpdates(NGetUpdatesRequest nGetUpdatesRequest, Continuation<? super C0732b> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{nGetUpdatesRequest, continuation}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.apiExecutor.execute(this.service.getUpdates(this.apiBundle.getSourceFrom(), BeanFactory.INSTANCE.getUpdates().getPath(), nGetUpdatesRequest), continuation);
    }

    @Override // cn.ever.cloud.network.api.AbstractC0729a
    public final Object getVideoPlayer(NGetVideoPlayerRequest nGetVideoPlayerRequest, Continuation<? super C0733c> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{nGetVideoPlayerRequest, continuation}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.apiExecutor.execute(this.service.getVideoPlayer(this.apiBundle.getSourceFrom(), BeanFactory.INSTANCE.getVideoPlayer().getPath(), nGetVideoPlayerRequest), continuation);
    }

    @Override // cn.ever.cloud.network.api.AbstractC0729a
    public final Object postSyncCommand(NPostSyncCommandRequest nPostSyncCommandRequest, Continuation<? super C0734d> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{nPostSyncCommandRequest, continuation}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.apiExecutor.execute(this.service.postSyncCommand(this.apiBundle.getSourceFrom(), BeanFactory.INSTANCE.postSyncCommand().getPath(), nPostSyncCommandRequest), continuation);
    }

    @Override // cn.ever.cloud.network.api.AbstractC0729a
    public final Object uploadComplete(NUploadCompleteRequest nUploadCompleteRequest, Continuation<? super C0736f> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{nUploadCompleteRequest, continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.apiExecutor.execute(this.service.uploadComplete(this.apiBundle.getSourceFrom(), BeanFactory.INSTANCE.uploadComplete().getPath(), nUploadCompleteRequest), continuation);
    }

    @Override // cn.ever.cloud.network.api.AbstractC0729a
    public final Object uploadState(NUploadStateRequest nUploadStateRequest, Continuation<? super C0737g> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{nUploadStateRequest, continuation}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.apiExecutor.execute(this.service.uploadState(this.apiBundle.getSourceFrom(), BeanFactory.INSTANCE.uploadState().getPath(), nUploadStateRequest), continuation);
    }

    public ApiClientImpl(ApiBundle apiBundle, Retrofit retrofit, ApiExecutor apiExecutor) {
        C106862S5w.LIZ(apiBundle, retrofit, apiExecutor);
        this.apiBundle = apiBundle;
        this.retrofit = retrofit;
        this.apiExecutor = apiExecutor;
        this.service = (RetrofitApi) RetrofitUtils.createService(this.retrofit, RetrofitApi.class);
        this.uploadService = (RetrofitUploadApi) RetrofitUtils.createService(this.retrofit, RetrofitUploadApi.class);
        this.downloadService = (RetrofitDownloadApi) RetrofitUtils.createService(this.retrofit, RetrofitDownloadApi.class);
    }

    @Override // p003X.AbstractC522236kD
    public final Object uploadChunk(AbstractC0739b abstractC0739b, NUploadChunkRequest nUploadChunkRequest, Continuation<? super C0735e> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC0739b, nUploadChunkRequest, continuation}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.apiExecutor.execute(this.uploadService.uploadChunk(this.apiBundle.getSourceFrom(), NetworkHelperKt.toTypedOutput(abstractC0739b), DataConverterKt.toQueryMap(nUploadChunkRequest)), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    @Override // cn.ever.cloud.network.api.DownloadApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object streamDownload(java.lang.String r7, long r8, java.lang.Long r10, kotlin.coroutines.Continuation<? super cn.ever.cloud.network.retrofit.AbstractC0738a> r11) {
        /*
            r6 = this;
            r0 = 4
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r2 = 0
            r3[r2] = r7
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r8)
            r4 = 1
            r3[r4] = r0
            r0 = 2
            r3[r0] = r10
            r0 = 3
            r3[r0] = r11
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = cn.ever.cloud.network_impl.api.ApiClientImpl.changeQuickRedirect
            r0 = 8
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r3, r6, r1, r2, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L23
            java.lang.Object r0 = r1.result
            return r0
        L23:
            boolean r0 = r11 instanceof cn.ever.cloud.network_impl.api.ApiClientImpl$streamDownload$1
            if (r0 == 0) goto L85
            r3 = r11
            cn.ever.cloud.network_impl.api.ApiClientImpl$streamDownload$1 r3 = (cn.ever.cloud.network_impl.api.ApiClientImpl$streamDownload$1) r3
            int r0 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L85
            int r0 = r3.label
            int r0 = r0 - r1
            r3.label = r0
        L36:
            java.lang.Object r1 = r3.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.label
            if (r0 == 0) goto L4c
            if (r0 != r4) goto L8b
            kotlin.ResultKt.throwOnFailure(r1)
        L45:
            com.bytedance.retrofit2.mime.TypedInput r1 = (com.bytedance.retrofit2.mime.TypedInput) r1
            cn.ever.cloud.network.retrofit.a r0 = cn.ever.cloud.network_impl.NetworkHelperKt.toNetTypedInput(r1)
            return r0
        L4c:
            kotlin.ResultKt.throwOnFailure(r1)
            com.bytedance.retrofit2.client.Header r2 = new com.bytedance.retrofit2.client.Header
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "bytes="
            r1.<init>(r0)
            r1.append(r8)
            r0 = 45
            r1.append(r0)
            if (r10 != 0) goto L64
            java.lang.String r10 = ""
        L64:
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "Range"
            r2.<init>(r0, r1)
            java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(r2)
            cn.ever.cloud.network_impl.api.ApiExecutor r1 = r6.apiExecutor
            cn.ever.cloud.network_impl.api.RetrofitDownloadApi r0 = r6.downloadService
            com.bytedance.retrofit2.Call r0 = r0.download(r7, r2)
            r3.label = r4
            java.lang.Object r1 = r1.execute(r0, r3)
            if (r1 != r5) goto L45
            return r5
        L85:
            cn.ever.cloud.network_impl.api.ApiClientImpl$streamDownload$1 r3 = new cn.ever.cloud.network_impl.api.ApiClientImpl$streamDownload$1
            r3.<init>(r6, r11)
            goto L36
        L8b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.network_impl.api.ApiClientImpl.streamDownload(java.lang.String, long, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    @Override // cn.ever.cloud.network.api.DownloadApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object streamDownload(java.lang.String r7, long r8, long r10, java.lang.Long r12, kotlin.coroutines.Continuation<? super cn.ever.cloud.network.retrofit.AbstractC0738a> r13) {
        /*
            r6 = this;
            r0 = 5
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r2 = 0
            r3[r2] = r7
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r8)
            r4 = 1
            r3[r4] = r0
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r10)
            r0 = 2
            r3[r0] = r1
            r0 = 3
            r3[r0] = r12
            r0 = 4
            r3[r0] = r13
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = cn.ever.cloud.network_impl.api.ApiClientImpl.changeQuickRedirect
            r0 = 9
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r3, r6, r1, r2, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r1.result
            return r0
        L2b:
            boolean r0 = r13 instanceof cn.ever.cloud.network_impl.api.ApiClientImpl$streamDownload$2
            if (r0 == 0) goto L8d
            r3 = r13
            cn.ever.cloud.network_impl.api.ApiClientImpl$streamDownload$2 r3 = (cn.ever.cloud.network_impl.api.ApiClientImpl$streamDownload$2) r3
            int r0 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L8d
            int r0 = r3.label
            int r0 = r0 - r1
            r3.label = r0
        L3e:
            java.lang.Object r1 = r3.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.label
            if (r0 == 0) goto L54
            if (r0 != r4) goto L93
            kotlin.ResultKt.throwOnFailure(r1)
        L4d:
            com.bytedance.retrofit2.mime.TypedInput r1 = (com.bytedance.retrofit2.mime.TypedInput) r1
            cn.ever.cloud.network.retrofit.a r0 = cn.ever.cloud.network_impl.NetworkHelperKt.toNetTypedInput(r1)
            return r0
        L54:
            kotlin.ResultKt.throwOnFailure(r1)
            com.bytedance.retrofit2.client.Header r2 = new com.bytedance.retrofit2.client.Header
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "bytes="
            r1.<init>(r0)
            r1.append(r10)
            r0 = 45
            r1.append(r0)
            if (r12 != 0) goto L6c
            java.lang.String r12 = ""
        L6c:
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "Range"
            r2.<init>(r0, r1)
            java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(r2)
            cn.ever.cloud.network_impl.api.ApiExecutor r1 = r6.apiExecutor
            cn.ever.cloud.network_impl.api.RetrofitDownloadApi r0 = r6.downloadService
            com.bytedance.retrofit2.Call r0 = r0.download(r7, r8, r2)
            r3.label = r4
            java.lang.Object r1 = r1.execute(r0, r3)
            if (r1 != r5) goto L4d
            return r5
        L8d:
            cn.ever.cloud.network_impl.api.ApiClientImpl$streamDownload$2 r3 = new cn.ever.cloud.network_impl.api.ApiClientImpl$streamDownload$2
            r3.<init>(r6, r13)
            goto L3e
        L93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.network_impl.api.ApiClientImpl.streamDownload(java.lang.String, long, long, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
