package cn.ever.cloud.android.api.impl;

import cn.ever.cloud.android.api.AlbumApi;
import cn.ever.cloud.android.entity.Album;
import cn.ever.cloud.android.entity.AlbumChange;
import cn.ever.cloud.android.entity.Media;
import cn.ever.cloud.android.entity.PageData;
import cn.ever.cloud.android.entity.PageParams;
import cn.ever.cloud.android.exception.BizExceptionKt;
import cn.ever.cloud.android.services.AlbumService;
import cn.ever.cloud.android.services.AssetService;
import cn.ever.cloud.android.services.task.TaskService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class AlbumApiImpl implements AlbumApi {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AlbumService albumService;
    public final AssetService assetService;
    public final TaskService taskService;

    static {
        Covode.recordClassIndex(2759);
    }

    @Override // cn.ever.cloud.android.api.AlbumApi
    public final Flow<AlbumChange> getChange(Long l) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{l}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Flow) proxy.result;
        }
        return this.albumService.getAlbumChanges();
    }

    @Override // cn.ever.cloud.android.api.AlbumApi
    public final Object cancelAndRemove(long j, Continuation<? super Boolean> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), continuation}, this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return BizExceptionKt.checkException(new AlbumApiImpl$cancelAndRemove$2(this, j, null), continuation);
    }

    @Override // cn.ever.cloud.android.api.AlbumApi
    public final Object create(String str, Continuation<? super Album> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, continuation}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return BizExceptionKt.checkException(new AlbumApiImpl$create$2(this, str, null), continuation);
    }

    @Override // cn.ever.cloud.android.api.AlbumApi
    public final Object createPredefineAlbum(long j, Continuation<? super Album> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), continuation}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return BizExceptionKt.checkException(new AlbumApiImpl$createPredefineAlbum$2(this, j, null), continuation);
    }

    @Override // cn.ever.cloud.android.api.AlbumApi
    public final Object delete(long j, Continuation<? super Boolean> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), continuation}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return BizExceptionKt.checkException(new AlbumApiImpl$delete$2(this, j, null), continuation);
    }

    @Override // cn.ever.cloud.android.api.AlbumApi
    public final Object getAlbumInfo(long j, Continuation<? super Album> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return BizExceptionKt.checkException(new AlbumApiImpl$getAlbumInfo$2(this, j, null), continuation);
    }

    @Override // cn.ever.cloud.android.api.AlbumApi
    public final Object getAlbums(PageParams pageParams, Continuation<? super PageData<Album>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pageParams, continuation}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return BizExceptionKt.checkException(new AlbumApiImpl$getAlbums$2(this, pageParams, null), continuation);
    }

    public AlbumApiImpl(AlbumService albumService, TaskService taskService, AssetService assetService) {
        C106862S5w.LIZ(albumService, taskService, assetService);
        this.albumService = albumService;
        this.taskService = taskService;
        this.assetService = assetService;
    }

    @Override // cn.ever.cloud.android.api.AlbumApi
    public final Object addAssets(long j, List<Media> list, Continuation<? super List<String>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), list, continuation}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return BizExceptionKt.checkException(new AlbumApiImpl$addAssets$2(this, list, j, null), continuation);
    }

    @Override // cn.ever.cloud.android.api.AlbumApi
    public final Object addAssetsPredefineAlbumId(long j, List<Media> list, Continuation<? super List<String>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), list, continuation}, this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return BizExceptionKt.checkException(new AlbumApiImpl$addAssetsPredefineAlbumId$2(this, list, j, null), continuation);
    }

    @Override // cn.ever.cloud.android.api.AlbumApi
    public final Object modifyCover(long j, String str, Continuation<? super Boolean> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str, continuation}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return BizExceptionKt.checkException(new AlbumApiImpl$modifyCover$2(this, j, str, null), continuation);
    }

    @Override // cn.ever.cloud.android.api.AlbumApi
    public final Object removeAssets(long j, List<String> list, Continuation<? super Boolean> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), list, continuation}, this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return BizExceptionKt.checkException(new AlbumApiImpl$removeAssets$2(this, j, list, null), continuation);
    }

    @Override // cn.ever.cloud.android.api.AlbumApi
    public final Object rename(long j, String str, Continuation<? super Boolean> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str, continuation}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return BizExceptionKt.checkException(new AlbumApiImpl$rename$2(this, j, str, null), continuation);
    }
}
