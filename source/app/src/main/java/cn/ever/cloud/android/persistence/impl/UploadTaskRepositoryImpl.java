package cn.ever.cloud.android.persistence.impl;

import cn.ever.cloud.android.p039a.AbstractC0683e;
import cn.ever.cloud.android.persistence.SdkDatabase;
import cn.ever.cloud.android.persistence.table.DbUploadTaskItem;
import cn.ever.cloud.android.services.task.entity.PauseReason;
import cn.ever.cloud.android.services.task.entity.TaskState;
import cn.ever.cloud.android.services.upload.UploadMedia;
import cn.ever.cloud.android.services.upload.UploadTaskItem;
import cn.ever.cloud.utils.LogHelper;
import cn.ever.cloud.utils.error.EpError;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import p003X.AbstractC521346im;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class UploadTaskRepositoryImpl implements AbstractC0683e {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: db */
    public final SdkDatabase f21053db;

    static {
        Covode.recordClassIndex(2933);
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0683e
    public final List<UploadTaskItem> getItemsToSchedule() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        List<TaskState> listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new TaskState[]{TaskState.Waiting, TaskState.Running, TaskState.Pause, TaskState.Failed, TaskState.Succeeded});
        AbstractC521346im uploadTaskDao = this.f21053db.uploadTaskDao();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOf, 10));
        for (TaskState taskState : listOf) {
            arrayList.add(Integer.valueOf(taskState.getIntVal()));
        }
        return toEntity(uploadTaskDao.queryTasksByState(arrayList));
    }

    public UploadTaskRepositoryImpl(SdkDatabase sdkDatabase) {
        C106862S5w.LIZ(sdkDatabase);
        this.f21053db = sdkDatabase;
    }

    private final List<DbUploadTaskItem> toDb(List<UploadTaskItem> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (UploadTaskItem uploadTaskItem : list) {
            arrayList.add(m20560to(uploadTaskItem));
        }
        return arrayList;
    }

    private final List<UploadTaskItem> toEntity(List<DbUploadTaskItem> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (DbUploadTaskItem dbUploadTaskItem : list) {
            arrayList.add(m20561to(dbUploadTaskItem));
        }
        return arrayList;
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0683e
    public final UploadTaskItem getTaskItem(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (UploadTaskItem) proxy.result;
        }
        DbUploadTaskItem queryTaskItem = this.f21053db.uploadTaskDao().queryTaskItem(j);
        if (queryTaskItem != null) {
            return m20561to(queryTaskItem);
        }
        return null;
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0683e
    public final void markTaskItemCancelled(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        this.f21053db.uploadTaskDao().updateStateAndRelativeExtras(j, TaskState.Deleted.getIntVal(), null, null, null);
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0683e
    public final void markTaskItemUploading(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        this.f21053db.uploadTaskDao().updateStateAndRelativeExtras(j, TaskState.Running.getIntVal(), null, null, null);
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0683e
    public final List<Long> batchInsert(List<UploadTaskItem> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        C106862S5w.LIZ(list);
        List<List<UploadTaskItem>> chunked = CollectionsKt___CollectionsKt.chunked(list, 900);
        ArrayList arrayList = new ArrayList();
        for (List<UploadTaskItem> list2 : chunked) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, this.f21053db.uploadTaskDao().batchInsert(toDb(list2)));
        }
        return arrayList;
    }

    /* renamed from: to */
    private final DbUploadTaskItem m20560to(UploadTaskItem uploadTaskItem) {
        Integer num;
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uploadTaskItem}, this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return (DbUploadTaskItem) proxy.result;
        }
        long id = uploadTaskItem.getId();
        String assetId = uploadTaskItem.getMedia().getAssetId();
        String path = uploadTaskItem.getMedia().getPath();
        String uri = uploadTaskItem.getMedia().getUri();
        long tagId = uploadTaskItem.getMedia().getTagId();
        long linkId = uploadTaskItem.getMedia().getLinkId();
        String itemKey = uploadTaskItem.getMedia().getItemKey();
        long groupId = uploadTaskItem.getGroupId();
        String groupKey = uploadTaskItem.getGroupKey();
        int intVal = uploadTaskItem.getStatus().getIntVal();
        Long cloudId = uploadTaskItem.getCloudId();
        EpError error = uploadTaskItem.getError();
        Integer num2 = null;
        if (error != null) {
            num = Integer.valueOf(error.getCode());
        } else {
            num = null;
        }
        EpError error2 = uploadTaskItem.getError();
        if (error2 != null) {
            str = error2.getHumanMessage();
        } else {
            str = null;
        }
        PauseReason pauseReason = uploadTaskItem.getPauseReason();
        if (pauseReason != null) {
            num2 = Integer.valueOf(pauseReason.getIntVal());
        }
        return new DbUploadTaskItem(id, assetId, path, uri, tagId, linkId, itemKey, groupId, groupKey, intVal, cloudId, num, str, num2, uploadTaskItem.getMedia().getPredefineAlbumEdit(), uploadTaskItem.getMedia().getDeleteOnEnd());
    }

    /* renamed from: to */
    private final UploadTaskItem m20561to(DbUploadTaskItem dbUploadTaskItem) {
        EpError epError;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dbUploadTaskItem}, this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return (UploadTaskItem) proxy.result;
        }
        PauseReason pauseReason = null;
        if (dbUploadTaskItem.getErrorCode() != null && dbUploadTaskItem.getErrorMessage() != null) {
            epError = new EpError(dbUploadTaskItem.getErrorCode().intValue(), dbUploadTaskItem.getErrorMessage(), dbUploadTaskItem.getErrorMessage());
        } else {
            epError = null;
        }
        long id = dbUploadTaskItem.getId();
        UploadMedia uploadMedia = new UploadMedia(dbUploadTaskItem.getAssetId(), dbUploadTaskItem.getPath(), dbUploadTaskItem.getUri(), dbUploadTaskItem.getTagId(), dbUploadTaskItem.getLinkId(), dbUploadTaskItem.getItemKey(), dbUploadTaskItem.getPredefineAlbumEdit(), dbUploadTaskItem.getDeleteOnEnd());
        long groupId = dbUploadTaskItem.getGroupId();
        String groupKey = dbUploadTaskItem.getGroupKey();
        TaskState from = TaskState.Companion.from(dbUploadTaskItem.getState());
        if (from == null) {
            from = TaskState.Waiting;
        }
        Long cloudId = dbUploadTaskItem.getCloudId();
        Integer pauseReason2 = dbUploadTaskItem.getPauseReason();
        if (pauseReason2 != null) {
            pauseReason = PauseReason.Companion.from(pauseReason2.intValue());
        }
        return new UploadTaskItem(id, uploadMedia, groupId, groupKey, from, cloudId, epError, pauseReason);
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0683e
    public final void markTaskItemComplete(long j, long j2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2)}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        this.f21053db.uploadTaskDao().updateStateAndRelativeExtras(j, TaskState.Succeeded.getIntVal(), null, null, null);
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0683e
    public final void markTaskItemPaused(long j, PauseReason pauseReason) {
        if (PatchProxy.proxy(new Object[]{new Long(j), pauseReason}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(pauseReason);
        this.f21053db.uploadTaskDao().updateStateAndRelativeExtras(j, TaskState.Pause.getIntVal(), null, null, Integer.valueOf(pauseReason.getIntVal()));
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0683e
    public final void markTaskItemFailed(long j, EpError epError) {
        String str;
        if (PatchProxy.proxy(new Object[]{new Long(j), epError}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        if (epError == null) {
            LogHelper.INSTANCE.m20554e("UploadTaskRepositoryImpl", "error is null when mark task=" + j + " as failed");
        }
        AbstractC521346im uploadTaskDao = this.f21053db.uploadTaskDao();
        int intVal = TaskState.Failed.getIntVal();
        Integer num = null;
        if (epError != null) {
            num = Integer.valueOf(epError.getCode());
            str = epError.getHumanMessage();
        } else {
            str = null;
        }
        uploadTaskDao.updateStateAndRelativeExtras(j, intVal, num, str, null);
    }
}
