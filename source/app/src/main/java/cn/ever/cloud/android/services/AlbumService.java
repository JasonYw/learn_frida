package cn.ever.cloud.android.services;

import cn.ever.cloud.android.entity.Album;
import cn.ever.cloud.android.entity.AlbumAssetRelation;
import cn.ever.cloud.android.entity.AlbumChange;
import cn.ever.cloud.android.entity.LocalAsset;
import cn.ever.cloud.android.p039a.AbstractC0679a;
import cn.ever.cloud.android.p039a.AbstractC0680b;
import cn.ever.cloud.android.services.task.TaskService;
import cn.ever.cloud.android.services.upload.UploadService;
import cn.ever.cloud.network.api.AbstractC0729a;
import cn.ever.cloud.network.entity.NAsset;
import cn.ever.cloud.network.entity.NPackTag;
import cn.ever.cloud.network.entity.NTagV2;
import cn.ever.cloud.utils.IdGenerator;
import cn.ever.cloud.utils.KotlinExtKt;
import cn.ever.cloud.utils.LogHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.Flow;
import p003X.C106862S5w;
import p003X.C522166k6;

/* loaded from: classes23.dex */
public final class AlbumService {
    public static final C522166k6 Companion = new C522166k6((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AlbumChangeEventBus albumChangeEventBus;
    public final AbstractC0679a albumRepository;
    public final AbstractC0729a apiClient;
    public final AbstractC0680b assetRepository;
    public final AssetService assetService;
    public final TaskService taskService;
    public final UploadService uploadService;

    static {
        Covode.recordClassIndex(2964);
    }

    public final void destroy() {
    }

    public final Flow<AlbumChange> getAlbumChanges() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Flow) proxy.result;
        }
        return this.albumChangeEventBus.albumChanges();
    }

    private final List<AlbumAssetRelation> mapAlbumAssetRelations(List<NAsset> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 15);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        for (NAsset nAsset : list) {
            for (NTagV2 nTagV2 : nAsset.getTagsV2()) {
                arrayList.add(new AlbumAssetRelation(KotlinExtKt.getOrDefault(nTagV2.getLinkId()), nTagV2.getTagId(), 0L, nAsset.getId(), nTagV2.getAddedAtUtc(), KotlinExtKt.getOrDefault(nAsset.getTakenUtc()), (int) KotlinExtKt.getOrDefault(Long.valueOf(nAsset.getStatus()))));
            }
        }
        return arrayList;
    }

    private final Album parseAlbum(NPackTag nPackTag) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{nPackTag}, this, changeQuickRedirect, false, 17);
        if (proxy.isSupported) {
            return (Album) proxy.result;
        }
        if (nPackTag != null) {
            return new Album(nPackTag.getId(), nPackTag.getDisplayName(), nPackTag.getCreatedAtUtc(), nPackTag.getModifiedTimeUtc(), nPackTag.getDeleted(), null, null, new AlbumService$parseAlbum$1(null), 96, null);
        }
        throw new NullPointerException("tag is null");
    }

    public final /* synthetic */ Object getAlbumFirstAssetCoverLink(long j, Continuation<? super Long> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), continuation}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return proxy.result;
        }
        AlbumAssetRelation albumAssetRelation = (AlbumAssetRelation) CollectionsKt___CollectionsKt.getOrNull(this.assetRepository.getAlbumAssetRelationByAlbumId(j), 0);
        if (albumAssetRelation != null) {
            return Boxing.boxLong(albumAssetRelation.getLinkId());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createAlbum(java.lang.String r14, kotlin.coroutines.Continuation<? super cn.ever.cloud.android.entity.Album> r15) {
        /*
            r13 = this;
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r3 = 0
            r5[r3] = r14
            r1 = 1
            r5[r1] = r15
            com.bytedance.hotfix.base.ChangeQuickRedirect r2 = cn.ever.cloud.android.services.AlbumService.changeQuickRedirect
            r0 = 7
            com.bytedance.hotfix.PatchProxyResult r2 = com.bytedance.hotfix.PatchProxy.proxy(r5, r13, r2, r3, r0)
            boolean r0 = r2.isSupported
            if (r0 == 0) goto L17
            java.lang.Object r0 = r2.result
            return r0
        L17:
            boolean r0 = r15 instanceof cn.ever.cloud.android.services.AlbumService$createAlbum$1
            if (r0 == 0) goto Lb2
            r3 = r15
            cn.ever.cloud.android.services.AlbumService$createAlbum$1 r3 = (cn.ever.cloud.android.services.AlbumService$createAlbum$1) r3
            int r0 = r3.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r2
            if (r0 == 0) goto Lb2
            int r0 = r3.label
            int r0 = r0 - r2
            r3.label = r0
        L2a:
            java.lang.Object r6 = r3.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.label
            r5 = 0
            if (r0 == 0) goto L47
            if (r0 == r1) goto L3f
            if (r0 != r4) goto Lb9
            java.lang.Object r1 = r3.L$0
            kotlin.ResultKt.throwOnFailure(r6)
        L3e:
            return r1
        L3f:
            java.lang.Object r5 = r3.L$0
            cn.ever.cloud.android.services.AlbumService r5 = (cn.ever.cloud.android.services.AlbumService) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L79
        L47:
            kotlin.ResultKt.throwOnFailure(r6)
            cn.ever.cloud.android.entity.SyncCommand r0 = cn.ever.cloud.android.entity.SyncCommand.TagCreate
            cn.ever.cloud.network.entity.NCommand r6 = new cn.ever.cloud.network.entity.NCommand
            java.lang.String r7 = r0.getCommandName()
            long r8 = r0.getCommandId()
            long r10 = java.lang.System.currentTimeMillis()
            cn.ever.cloud.network.entity.NCreateTagParam r12 = new cn.ever.cloud.network.entity.NCreateTagParam
            r12.<init>(r14, r5, r5, r5)
            r6.<init>(r7, r8, r10, r12)
            cn.ever.cloud.network.entity.NPostSyncCommandRequest r5 = new cn.ever.cloud.network.entity.NPostSyncCommandRequest
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(r6)
            r5.<init>(r0)
            cn.ever.cloud.network.api.a r0 = r13.apiClient
            r3.L$0 = r13
            r3.label = r1
            java.lang.Object r6 = r0.postSyncCommand(r5, r3)
            if (r6 != r2) goto L78
            return r2
        L78:
            r5 = r13
        L79:
            cn.ever.cloud.network.entity.NGenericResponse1 r6 = (cn.ever.cloud.network.entity.NGenericResponse1) r6
            java.lang.Object r0 = r6.getData()
            cn.ever.cloud.network.entity.NPostSyncCommandResponseData r0 = (cn.ever.cloud.network.entity.NPostSyncCommandResponseData) r0
            if (r0 == 0) goto Lc1
            java.util.List r0 = r0.getResults()
            if (r0 == 0) goto Lc1
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.first(r0)
            cn.ever.cloud.network.entity.NCommandResult r0 = (cn.ever.cloud.network.entity.NCommandResult) r0
            if (r0 == 0) goto Lc1
            cn.ever.cloud.network.entity.NCommandResultData r0 = r0.getData()
            if (r0 == 0) goto Lc1
            cn.ever.cloud.network.entity.NPackTag r0 = r0.getTag()
            if (r0 == 0) goto Lc1
            cn.ever.cloud.android.entity.Album r1 = cn.ever.cloud.android.remote.NDataMapperKt.toAlbum(r0)
            if (r1 == 0) goto Lc1
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(r1)
            r3.L$0 = r1
            r3.label = r4
            java.lang.Object r0 = r5.saveAlbums(r0, r3)
            if (r0 != r2) goto L3e
            return r2
        Lb2:
            cn.ever.cloud.android.services.AlbumService$createAlbum$1 r3 = new cn.ever.cloud.android.services.AlbumService$createAlbum$1
            r3.<init>(r13, r15)
            goto L2a
        Lb9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lc1:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.AlbumService.createAlbum(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createPredefineAlbum(long r22, kotlin.coroutines.Continuation<? super cn.ever.cloud.android.entity.Album> r24) {
        /*
            r21 = this;
            r0 = r21
            r4 = 2
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Long r1 = new java.lang.Long
            r8 = r22
            r1.<init>(r8)
            r5 = 0
            r6[r5] = r1
            r3 = 1
            r7 = r24
            r6[r3] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r2 = cn.ever.cloud.android.services.AlbumService.changeQuickRedirect
            r1 = 8
            com.bytedance.hotfix.PatchProxyResult r2 = com.bytedance.hotfix.PatchProxy.proxy(r6, r0, r2, r5, r1)
            boolean r1 = r2.isSupported
            if (r1 == 0) goto L23
            java.lang.Object r0 = r2.result
            return r0
        L23:
            boolean r1 = r7 instanceof cn.ever.cloud.android.services.AlbumService$createPredefineAlbum$1
            if (r1 == 0) goto Lc1
            r2 = r7
            cn.ever.cloud.android.services.AlbumService$createPredefineAlbum$1 r2 = (cn.ever.cloud.android.services.AlbumService$createPredefineAlbum$1) r2
            int r1 = r2.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r5
            if (r1 == 0) goto Lc1
            int r1 = r2.label
            int r1 = r1 - r5
            r2.label = r1
        L36:
            java.lang.Object r6 = r2.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r2.label
            if (r5 == 0) goto L4a
            if (r5 == r3) goto L81
            if (r5 != r4) goto Lc8
            java.lang.Object r5 = r2.L$0
            kotlin.ResultKt.throwOnFailure(r6)
        L49:
            return r5
        L4a:
            kotlin.ResultKt.throwOnFailure(r6)
            cn.ever.cloud.android.entity.SyncCommand r5 = cn.ever.cloud.android.entity.SyncCommand.PredefineTagCreate
            cn.ever.cloud.network.entity.NCommand r14 = new cn.ever.cloud.network.entity.NCommand
            java.lang.String r15 = r5.getCommandName()
            long r16 = r5.getCommandId()
            long r18 = java.lang.System.currentTimeMillis()
            cn.ever.cloud.network.entity.NCreatePredefineTagParam r7 = new cn.ever.cloud.network.entity.NCreatePredefineTagParam
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r7.<init>(r8, r10, r11, r12, r13)
            r20 = r7
            r14.<init>(r15, r16, r18, r20)
            cn.ever.cloud.network.entity.NPostSyncCommandRequest r6 = new cn.ever.cloud.network.entity.NPostSyncCommandRequest
            java.util.List r5 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(r14)
            r6.<init>(r5)
            cn.ever.cloud.network.api.a r5 = r0.apiClient
            r2.L$0 = r0
            r2.label = r3
            java.lang.Object r6 = r5.postSyncCommand(r6, r2)
            if (r6 != r1) goto L88
            return r1
        L81:
            java.lang.Object r0 = r2.L$0
            cn.ever.cloud.android.services.AlbumService r0 = (cn.ever.cloud.android.services.AlbumService) r0
            kotlin.ResultKt.throwOnFailure(r6)
        L88:
            cn.ever.cloud.network.entity.NGenericResponse1 r6 = (cn.ever.cloud.network.entity.NGenericResponse1) r6
            java.lang.Object r3 = r6.getData()
            cn.ever.cloud.network.entity.NPostSyncCommandResponseData r3 = (cn.ever.cloud.network.entity.NPostSyncCommandResponseData) r3
            if (r3 == 0) goto Ld0
            java.util.List r3 = r3.getResults()
            if (r3 == 0) goto Ld0
            java.lang.Object r3 = kotlin.collections.CollectionsKt___CollectionsKt.first(r3)
            cn.ever.cloud.network.entity.NCommandResult r3 = (cn.ever.cloud.network.entity.NCommandResult) r3
            if (r3 == 0) goto Ld0
            cn.ever.cloud.network.entity.NCommandResultData r3 = r3.getData()
            if (r3 == 0) goto Ld0
            cn.ever.cloud.network.entity.NPackTag r3 = r3.getTag()
            if (r3 == 0) goto Ld0
            cn.ever.cloud.android.entity.Album r5 = cn.ever.cloud.android.remote.NDataMapperKt.toAlbum(r3)
            if (r5 == 0) goto Ld0
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(r5)
            r2.L$0 = r5
            r2.label = r4
            java.lang.Object r0 = r0.saveAlbums(r3, r2)
            if (r0 != r1) goto L49
            return r1
        Lc1:
            cn.ever.cloud.android.services.AlbumService$createPredefineAlbum$1 r2 = new cn.ever.cloud.android.services.AlbumService$createPredefineAlbum$1
            r2.<init>(r0, r7)
            goto L36
        Lc8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Ld0:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.AlbumService.createPredefineAlbum(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object deleteAlbum(long r14, kotlin.coroutines.Continuation<? super java.lang.Boolean> r16) {
        /*
            r13 = this;
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r14)
            r3 = 0
            r5[r3] = r0
            r1 = 1
            r6 = r16
            r5[r1] = r6
            com.bytedance.hotfix.base.ChangeQuickRedirect r2 = cn.ever.cloud.android.services.AlbumService.changeQuickRedirect
            r0 = 9
            com.bytedance.hotfix.PatchProxyResult r2 = com.bytedance.hotfix.PatchProxy.proxy(r5, r13, r2, r3, r0)
            boolean r0 = r2.isSupported
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r2.result
            return r0
        L1f:
            boolean r0 = r6 instanceof cn.ever.cloud.android.services.AlbumService$deleteAlbum$1
            if (r0 == 0) goto Ld2
            r3 = r6
            cn.ever.cloud.android.services.AlbumService$deleteAlbum$1 r3 = (cn.ever.cloud.android.services.AlbumService$deleteAlbum$1) r3
            int r0 = r3.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r2
            if (r0 == 0) goto Ld2
            int r0 = r3.label
            int r0 = r0 - r2
            r3.label = r0
        L32:
            java.lang.Object r7 = r3.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.label
            if (r0 == 0) goto L5a
            if (r0 == r1) goto L50
            if (r0 != r4) goto Ld9
            java.lang.Object r6 = r3.L$0
            cn.ever.cloud.android.entity.Album r6 = (cn.ever.cloud.android.entity.Album) r6
            kotlin.ResultKt.throwOnFailure(r7)
        L47:
            boolean r0 = r6.isDeleted()
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
        L50:
            long r14 = r3.J$0
            java.lang.Object r5 = r3.L$0
            cn.ever.cloud.android.services.AlbumService r5 = (cn.ever.cloud.android.services.AlbumService) r5
            kotlin.ResultKt.throwOnFailure(r7)
            goto L8e
        L5a:
            kotlin.ResultKt.throwOnFailure(r7)
            cn.ever.cloud.android.entity.SyncCommand r0 = cn.ever.cloud.android.entity.SyncCommand.TagDelete
            cn.ever.cloud.network.entity.NCommand r6 = new cn.ever.cloud.network.entity.NCommand
            java.lang.String r7 = r0.getCommandName()
            long r8 = r0.getCommandId()
            long r10 = java.lang.System.currentTimeMillis()
            cn.ever.cloud.network.entity.NDeleteTagParam r12 = new cn.ever.cloud.network.entity.NDeleteTagParam
            r12.<init>(r14)
            r6.<init>(r7, r8, r10, r12)
            cn.ever.cloud.network.entity.NPostSyncCommandRequest r5 = new cn.ever.cloud.network.entity.NPostSyncCommandRequest
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(r6)
            r5.<init>(r0)
            cn.ever.cloud.network.api.a r0 = r13.apiClient
            r3.L$0 = r13
            r3.J$0 = r14
            r3.label = r1
            java.lang.Object r7 = r0.postSyncCommand(r5, r3)
            if (r7 != r2) goto L8d
            return r2
        L8d:
            r5 = r13
        L8e:
            cn.ever.cloud.network.entity.NGenericResponse1 r7 = (cn.ever.cloud.network.entity.NGenericResponse1) r7
            java.lang.Object r0 = r7.getData()
            cn.ever.cloud.network.entity.NPostSyncCommandResponseData r0 = (cn.ever.cloud.network.entity.NPostSyncCommandResponseData) r0
            if (r0 == 0) goto Le1
            java.util.List r0 = r0.getResults()
            if (r0 == 0) goto Le1
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.first(r0)
            cn.ever.cloud.network.entity.NCommandResult r0 = (cn.ever.cloud.network.entity.NCommandResult) r0
            if (r0 == 0) goto Le1
            cn.ever.cloud.network.entity.NCommandResultData r0 = r0.getData()
            if (r0 == 0) goto Le1
            cn.ever.cloud.network.entity.NPackTag r0 = r0.getTag()
            if (r0 == 0) goto Le1
            cn.ever.cloud.android.entity.Album r6 = cn.ever.cloud.android.remote.NDataMapperKt.toAlbum(r0)
            if (r6 == 0) goto Le1
            cn.ever.cloud.android.a.b r0 = r5.assetRepository
            java.util.List r1 = r0.getAlbumAssetRelationByAlbumId(r14)
            cn.ever.cloud.android.a.b r0 = r5.assetRepository
            r0.deleteAlbumAssetRelations(r1)
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(r6)
            r3.L$0 = r6
            r3.label = r4
            java.lang.Object r0 = r5.saveAlbums(r0, r3)
            if (r0 != r2) goto L47
            return r2
        Ld2:
            cn.ever.cloud.android.services.AlbumService$deleteAlbum$1 r3 = new cn.ever.cloud.android.services.AlbumService$deleteAlbum$1
            r3.<init>(r13, r6)
            goto L32
        Ld9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Le1:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.AlbumService.deleteAlbum(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getAlbum(long r7, kotlin.coroutines.Continuation<? super cn.ever.cloud.android.entity.Album> r9) {
        /*
            r6 = this;
            r0 = 2
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r7)
            r2 = 0
            r4[r2] = r0
            r3 = 1
            r4[r3] = r9
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = cn.ever.cloud.android.services.AlbumService.changeQuickRedirect
            r0 = 6
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r4, r6, r1, r2, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r1.result
            return r0
        L1c:
            boolean r0 = r9 instanceof cn.ever.cloud.android.services.AlbumService$getAlbum$1
            if (r0 == 0) goto L8e
            r5 = r9
            cn.ever.cloud.android.services.AlbumService$getAlbum$1 r5 = (cn.ever.cloud.android.services.AlbumService$getAlbum$1) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L8e
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L2f:
            java.lang.Object r1 = r5.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            if (r0 == 0) goto L5f
            if (r0 != r3) goto L94
            long r7 = r5.J$0
            java.lang.Object r0 = r5.L$3
            cn.ever.cloud.android.entity.Album r0 = (cn.ever.cloud.android.entity.Album) r0
            java.lang.Object r4 = r5.L$2
            cn.ever.cloud.android.entity.Album r4 = (cn.ever.cloud.android.entity.Album) r4
            java.lang.Object r3 = r5.L$1
            java.lang.Object r2 = r5.L$0
            cn.ever.cloud.android.services.AlbumService r2 = (cn.ever.cloud.android.services.AlbumService) r2
            kotlin.ResultKt.throwOnFailure(r1)
        L4e:
            java.lang.Long r1 = (java.lang.Long) r1
            r0.setCoverLink(r1)
        L53:
            cn.ever.cloud.android.services.AlbumService$getAlbum$$inlined$apply$lambda$1 r1 = new cn.ever.cloud.android.services.AlbumService$getAlbum$$inlined$apply$lambda$1
            r0 = 0
            r1.<init>(r4, r0, r2, r5)
            r4.setGetCoverClosure(r1)
            if (r3 == 0) goto L9c
            return r3
        L5f:
            kotlin.ResultKt.throwOnFailure(r1)
            cn.ever.cloud.android.a.a r0 = r6.albumRepository
            cn.ever.cloud.android.entity.Album r4 = r0.getAlbum(r7)
            if (r4 == 0) goto L9c
            java.lang.Long r0 = r4.getCoverLink()
            if (r0 != 0) goto L8b
            long r0 = r4.getAlbumId()
            r5.L$0 = r6
            r5.L$1 = r4
            r5.L$2 = r4
            r5.L$3 = r4
            r5.J$0 = r7
            r5.label = r3
            java.lang.Object r1 = r6.getAlbumFirstAssetCoverLink(r0, r5)
            if (r1 != r2) goto L87
            return r2
        L87:
            r2 = r6
            r3 = r4
            r0 = r3
            goto L4e
        L8b:
            r2 = r6
            r3 = r4
            goto L53
        L8e:
            cn.ever.cloud.android.services.AlbumService$getAlbum$1 r5 = new cn.ever.cloud.android.services.AlbumService$getAlbum$1
            r5.<init>(r6, r9)
            goto L2f
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9c:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "album is null, albumId: "
            r1.<init>(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.AlbumService.getAlbum(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object removeLocalAssets(long r21, kotlin.coroutines.Continuation<? super kotlin.Unit> r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = 2
            java.lang.Object[] r7 = new java.lang.Object[r0]
            java.lang.Long r0 = new java.lang.Long
            r3 = r21
            r0.<init>(r3)
            r6 = 0
            r7[r6] = r0
            r2 = 1
            r8 = r23
            r7[r2] = r8
            com.bytedance.hotfix.base.ChangeQuickRedirect r5 = cn.ever.cloud.android.services.AlbumService.changeQuickRedirect
            r0 = 14
            com.bytedance.hotfix.PatchProxyResult r5 = com.bytedance.hotfix.PatchProxy.proxy(r7, r1, r5, r6, r0)
            boolean r0 = r5.isSupported
            if (r0 == 0) goto L23
            java.lang.Object r0 = r5.result
            return r0
        L23:
            boolean r0 = r8 instanceof cn.ever.cloud.android.services.AlbumService$removeLocalAssets$1
            if (r0 == 0) goto Laf
            r0 = r8
            cn.ever.cloud.android.services.AlbumService$removeLocalAssets$1 r0 = (cn.ever.cloud.android.services.AlbumService$removeLocalAssets$1) r0
            int r5 = r0.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 & r6
            if (r5 == 0) goto Laf
            int r5 = r0.label
            int r5 = r5 - r6
            r0.label = r5
        L36:
            java.lang.Object r7 = r0.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r0.label
            if (r6 == 0) goto L48
            if (r6 != r2) goto Lb5
            kotlin.ResultKt.throwOnFailure(r7)
        L45:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L48:
            kotlin.ResultKt.throwOnFailure(r7)
            cn.ever.cloud.android.a.b r6 = r1.assetRepository
            java.util.List r6 = r6.getAlbumAssetRelationByAlbumId(r3)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r6.iterator()
        L5a:
            boolean r6 = r8.hasNext()
            if (r6 == 0) goto L7a
            java.lang.Object r7 = r8.next()
            r6 = r7
            cn.ever.cloud.android.entity.AlbumAssetRelation r6 = (cn.ever.cloud.android.entity.AlbumAssetRelation) r6
            boolean r6 = r6.hasCloud()
            r6 = r6 ^ r2
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L5a
            r9.add(r7)
            goto L5a
        L7a:
            java.util.List r9 = (java.util.List) r9
            cn.ever.cloud.android.a.b r6 = r1.assetRepository
            r6.deleteAlbumAssetRelations(r9)
            long r12 = java.lang.System.currentTimeMillis()
            cn.ever.cloud.android.a.a r6 = r1.albumRepository
            cn.ever.cloud.android.entity.Album r6 = r6.getAlbum(r3)
            if (r6 == 0) goto L45
            r7 = 0
            r9 = 0
            r10 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 247(0xf7, float:3.46E-43)
            r19 = 0
            cn.ever.cloud.android.entity.Album r3 = cn.ever.cloud.android.entity.Album.copy$default(r6, r7, r9, r10, r12, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L45
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(r3)
            r0.label = r2
            java.lang.Object r0 = r1.saveAlbums(r3, r0)
            if (r0 != r5) goto L45
            return r5
        Laf:
            cn.ever.cloud.android.services.AlbumService$removeLocalAssets$1 r0 = new cn.ever.cloud.android.services.AlbumService$removeLocalAssets$1
            r0.<init>(r1, r8)
            goto L36
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.AlbumService.removeLocalAssets(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object saveAlbums(List<Album> list, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Boxing.boxBoolean(!((Album) obj).isDeleted()).booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (Boxing.boxBoolean(((Album) obj2).isDeleted()).booleanValue()) {
                arrayList3.add(obj2);
            }
        }
        ArrayList<Album> arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
        for (Album album : arrayList4) {
            arrayList5.add(Boxing.boxLong(album.getAlbumId()));
        }
        ArrayList arrayList6 = arrayList5;
        this.albumRepository.upsertAlbums(list);
        if ((!arrayList2.isEmpty()) || (!arrayList6.isEmpty())) {
            LogHelper logHelper = LogHelper.INSTANCE;
            logHelper.m20555d("AlbumService", "send album change in " + Thread.currentThread());
            this.albumChangeEventBus.notifyAlbums(new AlbumChange(arrayList2, arrayList6));
        }
        return Unit.INSTANCE;
    }

    private final List<AlbumAssetRelation> mapToRelation(long j, List<LocalAsset> list, long j2) {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), list, new Long(j2)}, this, changeQuickRedirect, false, 16);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (LocalAsset localAsset : list) {
            arrayList.add(new AlbumAssetRelation(IdGenerator.INSTANCE.gen(i), j, localAsset.getLocalId(), 0L, j2, localAsset.getTakenMs(), 0));
            i = 0;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0076 -> B:16:0x005d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0091 -> B:15:0x0057). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchAlbums(java.lang.String r12, int r13, kotlin.coroutines.Continuation<? super cn.ever.cloud.android.entity.PageData<cn.ever.cloud.android.entity.Album>> r14) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.AlbumService.fetchAlbums(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (r0 != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object getAssetByLink(long r9, java.lang.Long r11, kotlin.coroutines.Continuation<? super cn.ever.cloud.android.entity.Asset> r12) {
        /*
            r8 = this;
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r9)
            r3 = 0
            r2[r3] = r0
            r7 = 1
            r2[r7] = r11
            r0 = 2
            r2[r0] = r12
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = cn.ever.cloud.android.services.AlbumService.changeQuickRedirect
            r0 = 4
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r8, r1, r3, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r1.result
            return r0
        L1f:
            boolean r0 = r12 instanceof cn.ever.cloud.android.services.AlbumService$getAssetByLink$1
            if (r0 == 0) goto L75
            r6 = r12
            cn.ever.cloud.android.services.AlbumService$getAssetByLink$1 r6 = (cn.ever.cloud.android.services.AlbumService$getAssetByLink$1) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L75
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L32:
            java.lang.Object r1 = r6.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            r5 = 0
            if (r0 == 0) goto L57
            if (r0 != r7) goto L7b
            java.lang.Object r4 = r6.L$0
            cn.ever.cloud.android.services.AlbumService r4 = (cn.ever.cloud.android.services.AlbumService) r4
            kotlin.ResultKt.throwOnFailure(r1)
        L46:
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L56
            cn.ever.cloud.android.a.b r2 = r4.assetRepository
            long r0 = r1.longValue()
            cn.ever.cloud.android.entity.AlbumAssetRelation r0 = r2.getAlbumAssetRelationByLinkId(r0)
            if (r0 != 0) goto L84
        L56:
            return r5
        L57:
            kotlin.ResultKt.throwOnFailure(r1)
            if (r11 == 0) goto L56
            cn.ever.cloud.android.a.b r2 = r8.assetRepository
            long r0 = r11.longValue()
            cn.ever.cloud.android.entity.AlbumAssetRelation r0 = r2.getAlbumAssetRelationByLinkId(r0)
            if (r0 != 0) goto L83
            r6.L$0 = r8
            r6.label = r7
            java.lang.Object r1 = r8.getAlbumFirstAssetCoverLink(r9, r6)
            if (r1 != r4) goto L73
            return r4
        L73:
            r4 = r8
            goto L46
        L75:
            cn.ever.cloud.android.services.AlbumService$getAssetByLink$1 r6 = new cn.ever.cloud.android.services.AlbumService$getAssetByLink$1
            r6.<init>(r8, r12)
            goto L32
        L7b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L83:
            r4 = r8
        L84:
            cn.ever.cloud.android.services.AssetService r1 = r4.assetService
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(r0)
            java.util.List r0 = r1.getAssetsByRelations(r0)
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.getOrNull(r0, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.AlbumService.getAssetByLink(long, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object modifyAlbumCover(long r23, java.lang.String r25, kotlin.coroutines.Continuation<? super java.lang.Boolean> r26) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.AlbumService.modifyAlbumCover(long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object renameAlbum(long r22, java.lang.String r24, kotlin.coroutines.Continuation<? super java.lang.Boolean> r25) {
        /*
            r21 = this;
            r0 = r21
            r1 = 3
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.Long r1 = new java.lang.Long
            r8 = r22
            r1.<init>(r8)
            r5 = 0
            r7[r5] = r1
            r4 = 1
            r10 = r24
            r7[r4] = r10
            r3 = 2
            r6 = r25
            r7[r3] = r6
            com.bytedance.hotfix.base.ChangeQuickRedirect r2 = cn.ever.cloud.android.services.AlbumService.changeQuickRedirect
            r1 = 10
            com.bytedance.hotfix.PatchProxyResult r2 = com.bytedance.hotfix.PatchProxy.proxy(r7, r0, r2, r5, r1)
            boolean r1 = r2.isSupported
            if (r1 == 0) goto L28
            java.lang.Object r0 = r2.result
            return r0
        L28:
            boolean r1 = r6 instanceof cn.ever.cloud.android.services.AlbumService$renameAlbum$1
            if (r1 == 0) goto Lc8
            r2 = r6
            cn.ever.cloud.android.services.AlbumService$renameAlbum$1 r2 = (cn.ever.cloud.android.services.AlbumService$renameAlbum$1) r2
            int r1 = r2.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r5
            if (r1 == 0) goto Lc8
            int r1 = r2.label
            int r1 = r1 - r5
            r2.label = r1
        L3b:
            java.lang.Object r6 = r2.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r2.label
            if (r5 == 0) goto L51
            if (r5 == r4) goto L87
            if (r5 != r3) goto Lcf
            kotlin.ResultKt.throwOnFailure(r6)
        L4c:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            return r0
        L51:
            kotlin.ResultKt.throwOnFailure(r6)
            cn.ever.cloud.android.entity.SyncCommand r5 = cn.ever.cloud.android.entity.SyncCommand.TagUpdate
            cn.ever.cloud.network.entity.NCommand r14 = new cn.ever.cloud.network.entity.NCommand
            java.lang.String r15 = r5.getCommandName()
            long r16 = r5.getCommandId()
            long r18 = java.lang.System.currentTimeMillis()
            cn.ever.cloud.network.entity.NUpdateTagParam r7 = new cn.ever.cloud.network.entity.NUpdateTagParam
            r11 = 0
            r12 = 0
            r13 = 0
            r7.<init>(r8, r10, r11, r12, r13)
            r20 = r7
            r14.<init>(r15, r16, r18, r20)
            cn.ever.cloud.network.entity.NPostSyncCommandRequest r6 = new cn.ever.cloud.network.entity.NPostSyncCommandRequest
            java.util.List r5 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(r14)
            r6.<init>(r5)
            cn.ever.cloud.network.api.a r5 = r0.apiClient
            r2.L$0 = r0
            r2.label = r4
            java.lang.Object r6 = r5.postSyncCommand(r6, r2)
            if (r6 != r1) goto L8e
            return r1
        L87:
            java.lang.Object r0 = r2.L$0
            cn.ever.cloud.android.services.AlbumService r0 = (cn.ever.cloud.android.services.AlbumService) r0
            kotlin.ResultKt.throwOnFailure(r6)
        L8e:
            cn.ever.cloud.network.entity.NGenericResponse1 r6 = (cn.ever.cloud.network.entity.NGenericResponse1) r6
            java.lang.Object r5 = r6.getData()
            cn.ever.cloud.network.entity.NPostSyncCommandResponseData r5 = (cn.ever.cloud.network.entity.NPostSyncCommandResponseData) r5
            r6 = 0
            if (r5 == 0) goto Ld7
            java.util.List r5 = r5.getResults()
            if (r5 == 0) goto Ld7
            java.lang.Object r5 = kotlin.collections.CollectionsKt___CollectionsKt.first(r5)
            cn.ever.cloud.network.entity.NCommandResult r5 = (cn.ever.cloud.network.entity.NCommandResult) r5
            if (r5 == 0) goto Ld7
            cn.ever.cloud.network.entity.NCommandResultData r5 = r5.getData()
            if (r5 == 0) goto Ld7
            cn.ever.cloud.network.entity.NPackTag r5 = r5.getTag()
            if (r5 == 0) goto Ld7
            cn.ever.cloud.android.entity.Album r5 = cn.ever.cloud.android.remote.NDataMapperKt.toAlbum(r5)
            if (r5 == 0) goto Ld7
            java.util.List r5 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(r5)
            r2.L$0 = r6
            r2.label = r3
            java.lang.Object r0 = r0.saveAlbums(r5, r2)
            if (r0 != r1) goto L4c
            return r1
        Lc8:
            cn.ever.cloud.android.services.AlbumService$renameAlbum$1 r2 = new cn.ever.cloud.android.services.AlbumService$renameAlbum$1
            r2.<init>(r0, r6)
            goto L3b
        Lcf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Ld7:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.AlbumService.renameAlbum(long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x038f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object removeAssets(long r28, java.util.List<java.lang.String> r30, kotlin.coroutines.Continuation<? super kotlin.Unit> r31) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.AlbumService.removeAssets(long, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0 A[LOOP:0: B:17:0x00aa->B:19:0x00b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0194 A[LOOP:1: B:26:0x018e->B:28:0x0194, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0256 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object addAssets(long r31, java.util.List<java.lang.String> r33, boolean r34, kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> r35) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.AlbumService.addAssets(long, java.util.List, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public AlbumService(AbstractC0679a abstractC0679a, AbstractC0680b abstractC0680b, AssetService assetService, UploadService uploadService, TaskService taskService, AbstractC0729a abstractC0729a, AlbumChangeEventBus albumChangeEventBus) {
        C106862S5w.LIZ(abstractC0679a, abstractC0680b, assetService, uploadService, taskService, abstractC0729a, albumChangeEventBus);
        this.albumRepository = abstractC0679a;
        this.assetRepository = abstractC0680b;
        this.assetService = assetService;
        this.uploadService = uploadService;
        this.taskService = taskService;
        this.apiClient = abstractC0729a;
        this.albumChangeEventBus = albumChangeEventBus;
        LogHelper logHelper = LogHelper.INSTANCE;
        logHelper.m20555d("AlbumService", "init album service: " + this);
    }
}
