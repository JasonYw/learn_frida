package cn.ever.cloud.sdk.mapper;

import cn.ever.cloud.android.config.NetworkDomain;
import cn.ever.cloud.android.entity.Album;
import cn.ever.cloud.android.entity.AlbumChange;
import cn.ever.cloud.android.entity.Asset;
import cn.ever.cloud.android.entity.AssetQuery;
import cn.ever.cloud.android.entity.Media;
import cn.ever.cloud.android.entity.PageData;
import cn.ever.cloud.android.entity.PageParams;
import cn.ever.cloud.android.entity.Storage;
import cn.ever.cloud.android.entity.Task;
import cn.ever.cloud.android.entity.TaskItem;
import cn.ever.cloud.android.entity.TaskProgress;
import cn.ever.cloud.android.entity.TaskReq;
import cn.ever.cloud.android.entity.ThumbnailInfo;
import cn.ever.cloud.android.entity.UserInfo;
import cn.ever.cloud.android.entity.VideoInfo;
import cn.ever.cloud.android.entity.VideoPlayInfo;
import cn.ever.cloud.android.exception.BizException;
import cn.ever.cloud.network.auth.UserId;
import cn.ever.cloud.sdk.EcNetworkDomain;
import cn.ever.cloud.sdk.EcNetworkTimeout;
import cn.ever.cloud.sdk.entity.EcAlbum;
import cn.ever.cloud.sdk.entity.EcAlbumChange;
import cn.ever.cloud.sdk.entity.EcAsset;
import cn.ever.cloud.sdk.entity.EcAssetQuery;
import cn.ever.cloud.sdk.entity.EcMedia;
import cn.ever.cloud.sdk.entity.EcPageData;
import cn.ever.cloud.sdk.entity.EcPageParams;
import cn.ever.cloud.sdk.entity.EcStorage;
import cn.ever.cloud.sdk.entity.EcTask;
import cn.ever.cloud.sdk.entity.EcTaskItem;
import cn.ever.cloud.sdk.entity.EcTaskProgress;
import cn.ever.cloud.sdk.entity.EcTaskReq;
import cn.ever.cloud.sdk.entity.EcThumbnailInfo;
import cn.ever.cloud.sdk.entity.EcVideoInfo;
import cn.ever.cloud.sdk.entity.EcVideoPlayInfo;
import cn.ever.cloud.sdk.entity.EpUser;
import cn.ever.cloud.sdk.entity.EpUserInfo;
import cn.ever.cloud.sdk.exception.EcException;
import cn.ever.cloud.utils.error.ErrorCode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import p003X.AbstractC521446iw;
import p003X.AbstractC521496j1;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class MapperKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3415);
    }

    public static final AssetQuery toAssetQuery(EcAssetQuery ecAssetQuery) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ecAssetQuery}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            return (AssetQuery) proxy.result;
        }
        C106862S5w.LIZ(ecAssetQuery);
        return new AssetQuery(toPageParams(ecAssetQuery.getPageParams()), ecAssetQuery.getAlbumId());
    }

    public static final EcAlbum toEcAlbum(Album album) {
        EcAsset ecAsset = null;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{album}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (EcAlbum) proxy.result;
        }
        C106862S5w.LIZ(album);
        long albumId = album.getAlbumId();
        String name = album.getName();
        long createAt = album.getCreateAt();
        long updateAt = album.getUpdateAt();
        Asset cover = album.getCover();
        if (cover != null) {
            ecAsset = toEcAsset(cover);
        }
        return new EcAlbum(albumId, name, createAt, updateAt, ecAsset, album.isDeleted());
    }

    public static final EcStorage toEcStorage(Storage storage) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{storage}, null, changeQuickRedirect, true, 9);
        if (proxy.isSupported) {
            return (EcStorage) proxy.result;
        }
        C106862S5w.LIZ(storage);
        return new EcStorage(storage.getQuota(), storage.getUsage());
    }

    public static final EcTaskItem toEcTaskItem(TaskItem taskItem) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem}, null, changeQuickRedirect, true, 11);
        if (proxy.isSupported) {
            return (EcTaskItem) proxy.result;
        }
        C106862S5w.LIZ(taskItem);
        return new EcTaskItem(taskItem.getTaskKey(), taskItem.getAssetId(), taskItem.getState(), taskItem.getErrCode(), taskItem.getErrMsg(), taskItem.getCompletePath());
    }

    public static final EcTaskProgress toEcTaskProgress(TaskProgress taskProgress) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskProgress}, null, changeQuickRedirect, true, 12);
        if (proxy.isSupported) {
            return (EcTaskProgress) proxy.result;
        }
        C106862S5w.LIZ(taskProgress);
        return new EcTaskProgress(taskProgress.getProcessList(), taskProgress.getItemFailed(), taskProgress.getItemDone(), taskProgress.getItemTotal(), taskProgress.getBytesDone(), taskProgress.getBytesTotal());
    }

    public static final EcVideoPlayInfo toEcVideoPlayInfo(VideoPlayInfo videoPlayInfo) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{videoPlayInfo}, null, changeQuickRedirect, true, 15);
        if (proxy.isSupported) {
            return (EcVideoPlayInfo) proxy.result;
        }
        C106862S5w.LIZ(videoPlayInfo);
        return new EcVideoPlayInfo(videoPlayInfo.getPrimaryUrl(), videoPlayInfo.getSecondaryUrl(), videoPlayInfo.getKey());
    }

    public static final EpUser toEpUser(UserId userId) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{userId}, null, changeQuickRedirect, true, 18);
        if (proxy.isSupported) {
            return (EpUser) proxy.result;
        }
        C106862S5w.LIZ(userId);
        return new EpUser(userId.getThirdPartyUid(), userId.getThirdPartySecUid(), userId.getEpUid());
    }

    public static final AbstractC521446iw toNetworkConfig(final AbstractC521496j1 abstractC521496j1) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC521496j1}, null, changeQuickRedirect, true, 19);
        if (proxy.isSupported) {
            return (AbstractC521446iw) proxy.result;
        }
        C106862S5w.LIZ(abstractC521496j1);
        return new AbstractC521446iw() { // from class: cn.ever.cloud.sdk.mapper.MapperKt$toNetworkConfig$1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(3417);
            }

            public final Map<String, String> getPassportHeader() {
                return null;
            }

            public final boolean isBoe() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
                if (proxy2.isSupported) {
                    return ((Boolean) proxy2.result).booleanValue();
                }
                return false;
            }

            public final Map<String, String> getCommonParams() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
                if (proxy2.isSupported) {
                    return (Map) proxy2.result;
                }
                return AbstractC521496j1.this.LIZIZ();
            }

            public final String userAgent() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
                if (proxy2.isSupported) {
                    return (String) proxy2.result;
                }
                return AbstractC521496j1.this.LIZ();
            }

            @Override // p003X.AbstractC521446iw
            public final NetworkDomain domain() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
                if (proxy2.isSupported) {
                    return (NetworkDomain) proxy2.result;
                }
                EcNetworkDomain LIZJ = AbstractC521496j1.this.LIZJ();
                if (LIZJ != null) {
                    return MapperKt.toNetworkDomain(LIZJ);
                }
                return null;
            }

            public final Triple<Long, Long, Long> timeout() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
                if (proxy2.isSupported) {
                    return (Triple) proxy2.result;
                }
                EcNetworkTimeout LIZLLL = AbstractC521496j1.this.LIZLLL();
                if (LIZLLL != null) {
                    return new Triple<>(Long.valueOf(LIZLLL.getGeneralMs()), Long.valueOf(LIZLLL.getUploadMs()), Long.valueOf(LIZLLL.getDownloadMs()));
                }
                return null;
            }
        };
    }

    public static final NetworkDomain toNetworkDomain(EcNetworkDomain ecNetworkDomain) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ecNetworkDomain}, null, changeQuickRedirect, true, 20);
        if (proxy.isSupported) {
            return (NetworkDomain) proxy.result;
        }
        C106862S5w.LIZ(ecNetworkDomain);
        return new NetworkDomain(ecNetworkDomain.getHost(), ecNetworkDomain.isHttps());
    }

    public static final <T> PageData<T> toPageData(EcPageData<T> ecPageData) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ecPageData}, null, changeQuickRedirect, true, 6);
        if (proxy.isSupported) {
            return (PageData) proxy.result;
        }
        C106862S5w.LIZ(ecPageData);
        return new PageData<>(ecPageData.getHasMore(), ecPageData.getCursor(), ecPageData.getData());
    }

    public static final PageParams toPageParams(EcPageParams ecPageParams) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ecPageParams}, null, changeQuickRedirect, true, 8);
        if (proxy.isSupported) {
            return (PageParams) proxy.result;
        }
        C106862S5w.LIZ(ecPageParams);
        return new PageParams(ecPageParams.getCursor(), ecPageParams.getCount());
    }

    public static final ThumbnailInfo toThumbnailInfo(EcThumbnailInfo ecThumbnailInfo) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ecThumbnailInfo}, null, changeQuickRedirect, true, 23);
        if (proxy.isSupported) {
            return (ThumbnailInfo) proxy.result;
        }
        C106862S5w.LIZ(ecThumbnailInfo);
        return new ThumbnailInfo(ecThumbnailInfo.getResolution(), ecThumbnailInfo.getThumbnail());
    }

    public static final UserId toUserId(EpUser epUser) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{epUser}, null, changeQuickRedirect, true, 17);
        if (proxy.isSupported) {
            return (UserId) proxy.result;
        }
        C106862S5w.LIZ(epUser);
        return new UserId(epUser.getBizUid(), epUser.getBizSecUid(), epUser.getEpUid());
    }

    public static final UserInfo toUserInfo(EpUserInfo epUserInfo) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{epUserInfo}, null, changeQuickRedirect, true, 16);
        if (proxy.isSupported) {
            return (UserInfo) proxy.result;
        }
        C106862S5w.LIZ(epUserInfo);
        return new UserInfo(toUserId(epUserInfo.getUser()), epUserInfo.getToken());
    }

    public static final EcAlbumChange toEcAlbumChange(AlbumChange albumChange) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{albumChange}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (EcAlbumChange) proxy.result;
        }
        C106862S5w.LIZ(albumChange);
        List<Album> upsert = albumChange.getUpsert();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(upsert, 10));
        for (Album album : upsert) {
            arrayList.add(toEcAlbum(album));
        }
        return new EcAlbumChange(arrayList, albumChange.getDeleted());
    }

    public static final EcAsset toEcAsset(Asset asset) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{asset}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (EcAsset) proxy.result;
        }
        C106862S5w.LIZ(asset);
        return new EcAsset(asset.getAssetId(), asset.getMediaId(), asset.getPath(), asset.getUri(), asset.getCloudId(), asset.getWidth(), asset.getHeight(), asset.getMime(), asset.getDuration(), asset.getSize(), asset.getType(), asset.isDeleted(), asset.getPreviewUrl(), asset.getThumbnailUrl());
    }

    public static final EcException toEcException(Exception exc) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{exc}, null, changeQuickRedirect, true, 22);
        if (proxy.isSupported) {
            return (EcException) proxy.result;
        }
        C106862S5w.LIZ(exc);
        if (exc instanceof BizException) {
            return new EcException(((BizException) exc).getCode(), exc.getMessage(), exc.getCause());
        }
        return new EcException(ErrorCode.CLIENT_OTHER.getCode(), exc.getMessage(), exc.getCause());
    }

    public static final EcTask toEcTask(Task task) {
        ArrayList arrayList = null;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{task}, null, changeQuickRedirect, true, 10);
        if (proxy.isSupported) {
            return (EcTask) proxy.result;
        }
        C106862S5w.LIZ(task);
        String taskKey = task.getTaskKey();
        int taskType = task.getTaskType();
        int state = task.getState();
        EcTaskProgress ecTaskProgress = toEcTaskProgress(task.getProgress());
        List<TaskItem> failedList = task.getFailedList();
        if (failedList != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(failedList, 10));
            for (TaskItem taskItem : failedList) {
                arrayList2.add(toEcTaskItem(taskItem));
            }
            arrayList = arrayList2;
        }
        return new EcTask(taskKey, taskType, state, ecTaskProgress, arrayList, task.getCompletePath(), task.getFailedAddTaskList());
    }

    public static final EcVideoInfo toEcVideoInfo(VideoInfo videoInfo) {
        EcVideoPlayInfo ecVideoPlayInfo;
        EcVideoPlayInfo ecVideoPlayInfo2;
        EcVideoPlayInfo ecVideoPlayInfo3 = null;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{videoInfo}, null, changeQuickRedirect, true, 14);
        if (proxy.isSupported) {
            return (EcVideoInfo) proxy.result;
        }
        C106862S5w.LIZ(videoInfo);
        String assetId = videoInfo.getAssetId();
        int status = videoInfo.getStatus();
        VideoPlayInfo p360 = videoInfo.getP360();
        if (p360 != null) {
            ecVideoPlayInfo = toEcVideoPlayInfo(p360);
        } else {
            ecVideoPlayInfo = null;
        }
        VideoPlayInfo p480 = videoInfo.getP480();
        if (p480 != null) {
            ecVideoPlayInfo2 = toEcVideoPlayInfo(p480);
        } else {
            ecVideoPlayInfo2 = null;
        }
        VideoPlayInfo p720 = videoInfo.getP720();
        if (p720 != null) {
            ecVideoPlayInfo3 = toEcVideoPlayInfo(p720);
        }
        return new EcVideoInfo(assetId, status, ecVideoPlayInfo, ecVideoPlayInfo2, ecVideoPlayInfo3);
    }

    public static final Media toMedia(EcMedia ecMedia) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ecMedia}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (Media) proxy.result;
        }
        C106862S5w.LIZ(ecMedia);
        return new Media(ecMedia.getMediaId(), ecMedia.getUriOrPath(), ecMedia.getTakenMs(), ecMedia.getDurationMs(), ecMedia.getType(), ecMedia.getMime(), ecMedia.getWidth(), ecMedia.getHeight(), ecMedia.getDeleteOnEnd());
    }

    public static final TaskReq toTaskReq(EcTaskReq ecTaskReq) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ecTaskReq}, null, changeQuickRedirect, true, 13);
        if (proxy.isSupported) {
            return (TaskReq) proxy.result;
        }
        C106862S5w.LIZ(ecTaskReq);
        TaskReq.Builder assets = new TaskReq.Builder().taskKey(ecTaskReq.getTaskKey()).assets(ecTaskReq.getUniformIds());
        assets.useMobile(ecTaskReq.getUseMobile());
        assets.downloadFolder(ecTaskReq.getDownloadSavePath());
        return assets.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object checkException(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super cn.ever.cloud.sdk.entity.Result<T>> r6) {
        /*
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r0 = 0
            r3[r0] = r5
            r4 = 1
            r3[r4] = r6
            com.bytedance.hotfix.base.ChangeQuickRedirect r2 = cn.ever.cloud.sdk.mapper.MapperKt.changeQuickRedirect
            r1 = 0
            r0 = 21
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r3, r1, r2, r4, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L19
            java.lang.Object r0 = r1.result
            return r0
        L19:
            boolean r0 = r6 instanceof cn.ever.cloud.sdk.mapper.MapperKt$checkException$1
            if (r0 == 0) goto L3d
            r3 = r6
            cn.ever.cloud.sdk.mapper.MapperKt$checkException$1 r3 = (cn.ever.cloud.sdk.mapper.MapperKt$checkException$1) r3
            int r0 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L3d
            int r0 = r3.label
            int r0 = r0 - r1
            r3.label = r0
        L2c:
            java.lang.Object r2 = r3.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.label
            if (r0 == 0) goto L4b
            if (r0 != r4) goto L43
            java.lang.Object r0 = r3.L$0
            cn.ever.cloud.sdk.entity.Result$Companion r0 = (cn.ever.cloud.sdk.entity.Result.Companion) r0
            goto L5b
        L3d:
            cn.ever.cloud.sdk.mapper.MapperKt$checkException$1 r3 = new cn.ever.cloud.sdk.mapper.MapperKt$checkException$1
            r3.<init>(r6)
            goto L2c
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L4b:
            kotlin.ResultKt.throwOnFailure(r2)
            cn.ever.cloud.sdk.entity.Result$Companion r0 = cn.ever.cloud.sdk.entity.Result.Companion     // Catch: java.lang.Exception -> L63
            r3.L$0 = r0     // Catch: java.lang.Exception -> L63
            r3.label = r4     // Catch: java.lang.Exception -> L63
            java.lang.Object r2 = r5.invoke(r3)     // Catch: java.lang.Exception -> L63
            if (r2 != r1) goto L5e
            return r1
        L5b:
            kotlin.ResultKt.throwOnFailure(r2)     // Catch: java.lang.Exception -> L63
        L5e:
            cn.ever.cloud.sdk.entity.Result r0 = r0.success(r2)     // Catch: java.lang.Exception -> L63
            return r0
        L63:
            r0 = move-exception
            cn.ever.cloud.sdk.entity.Result$Companion r1 = cn.ever.cloud.sdk.entity.Result.Companion
            cn.ever.cloud.sdk.exception.EcException r0 = toEcException(r0)
            cn.ever.cloud.sdk.entity.Result r0 = r1.failure(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.sdk.mapper.MapperKt.checkException(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T, R> EcPageData<R> toEcPageData(PageData<T> pageData, Function1<? super T, ? extends R> function1) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pageData, function1}, null, changeQuickRedirect, true, 7);
        if (proxy.isSupported) {
            return (EcPageData) proxy.result;
        }
        C106862S5w.LIZ(pageData, function1);
        boolean hasMore = pageData.getHasMore();
        String cursor = pageData.getCursor();
        List<T> data = pageData.getData();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(data, 10));
        for (T t : data) {
            arrayList.add(function1.invoke(t));
        }
        return new EcPageData<>(hasMore, cursor, arrayList);
    }
}
