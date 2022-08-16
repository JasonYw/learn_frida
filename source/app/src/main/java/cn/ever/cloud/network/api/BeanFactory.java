package cn.ever.cloud.network.api;

import cn.ever.cloud.network.entity.C0731a;
import cn.ever.cloud.network.entity.C0732b;
import cn.ever.cloud.network.entity.C0733c;
import cn.ever.cloud.network.entity.C0734d;
import cn.ever.cloud.network.entity.C0736f;
import cn.ever.cloud.network.entity.C0737g;
import cn.ever.cloud.network.entity.NGetAssetEncRequest;
import cn.ever.cloud.network.entity.NGetUpdatesRequest;
import cn.ever.cloud.network.entity.NGetVideoPlayerRequest;
import cn.ever.cloud.network.entity.NPostSyncCommandRequest;
import cn.ever.cloud.network.entity.NUploadCompleteRequest;
import cn.ever.cloud.network.entity.NUploadStateRequest;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes23.dex */
public final class BeanFactory {
    public static final BeanFactory INSTANCE = new BeanFactory();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3170);
    }

    public final ApiBean<NGetAssetEncRequest, C0731a> getAssetEnc() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (ApiBean) proxy.result;
        }
        return new ApiBean<>("v4", "GetAssetEnc", NGetAssetEncRequest.class, C0731a.class);
    }

    public final ApiBean<NGetUpdatesRequest, C0732b> getUpdates() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (ApiBean) proxy.result;
        }
        return new ApiBean<>("v4", "GetUpdates", NGetUpdatesRequest.class, C0732b.class);
    }

    public final ApiBean<NGetVideoPlayerRequest, C0733c> getVideoPlayer() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (ApiBean) proxy.result;
        }
        return new ApiBean<>("v4", "GetVideoPlayer", NGetVideoPlayerRequest.class, C0733c.class);
    }

    public final ApiBean<NPostSyncCommandRequest, C0734d> postSyncCommand() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (ApiBean) proxy.result;
        }
        return new ApiBean<>("v4", "PostSyncCommand", NPostSyncCommandRequest.class, C0734d.class);
    }

    public final ApiBean<NUploadCompleteRequest, C0736f> uploadComplete() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (ApiBean) proxy.result;
        }
        return new ApiBean<>("v4", "UploadComplete", NUploadCompleteRequest.class, C0736f.class);
    }

    public final ApiBean<NUploadStateRequest, C0737g> uploadState() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (ApiBean) proxy.result;
        }
        return new ApiBean<>("v4", "UploadState", NUploadStateRequest.class, C0737g.class);
    }
}
