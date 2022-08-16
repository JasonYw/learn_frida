package cn.ever.cloud.android.services;

import cn.ever.cloud.android.entity.KeyValue;
import cn.ever.cloud.android.p039a.AbstractC0680b;
import cn.ever.cloud.android.p039a.AbstractC0681c;
import cn.ever.cloud.android.p039a.AbstractC0684f;
import cn.ever.cloud.android.remote.SyncRemoteRepo;
import cn.ever.cloud.utils.DebugUtil;
import cn.ever.cloud.utils.LogHelper;
import cn.ever.cloud.utils.monitor.MonitorKit;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.C522186k8;

/* loaded from: classes23.dex */
public final class SyncService {
    public static final C522186k8 Companion = new C522186k8((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AlbumService albumService;
    public final AbstractC0680b assetRepository;
    public final AbstractC0681c kvRepo;
    public final SyncRemoteRepo remoteRepo;
    public final AbstractC0684f userRepository;

    static {
        Covode.recordClassIndex(2994);
    }

    private final String getCursor() {
        String value;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        KeyValue keyValue = this.kvRepo.getKeyValue("asset_page_token");
        if (keyValue == null || (value = keyValue.getValue()) == null) {
            return "";
        }
        return value;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0128 A[Catch: all -> 0x01ad, TryCatch #2 {all -> 0x01ad, blocks: (B:20:0x0110, B:22:0x0128, B:23:0x0131, B:25:0x014b, B:26:0x0153, B:28:0x015d, B:29:0x0161, B:31:0x019b, B:36:0x0089, B:40:0x00b4), top: B:19:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014b A[Catch: all -> 0x01ad, TryCatch #2 {all -> 0x01ad, blocks: (B:20:0x0110, B:22:0x0128, B:23:0x0131, B:25:0x014b, B:26:0x0153, B:28:0x015d, B:29:0x0161, B:31:0x019b, B:36:0x0089, B:40:0x00b4), top: B:19:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015d A[Catch: all -> 0x01ad, TryCatch #2 {all -> 0x01ad, blocks: (B:20:0x0110, B:22:0x0128, B:23:0x0131, B:25:0x014b, B:26:0x0153, B:28:0x015d, B:29:0x0161, B:31:0x019b, B:36:0x0089, B:40:0x00b4), top: B:19:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019b A[Catch: all -> 0x01ad, TryCatch #2 {all -> 0x01ad, blocks: (B:20:0x0110, B:22:0x0128, B:23:0x0131, B:25:0x014b, B:26:0x0153, B:28:0x015d, B:29:0x0161, B:31:0x019b, B:36:0x0089, B:40:0x00b4), top: B:19:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x010c -> B:19:0x0110). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object pull(kotlin.coroutines.Continuation<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.SyncService.pull(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void monitorSyncError(int i, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        MonitorKit.INSTANCE.sync("pullError", Integer.valueOf(i), str);
    }

    private final void monitorResult(int i, int i2, int i3) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        long j = -1;
        try {
            j = MonitorKit.INSTANCE.serviceEndAndGetDuration("pullRequest", "SyncService");
        } catch (Throwable th) {
            LogHelper.INSTANCE.m20554e("SyncService", String.valueOf(th.getMessage()));
            DebugUtil.INSTANCE.debug();
        }
        MonitorKit.INSTANCE.sync("pullRequest", Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public SyncService(AbstractC0680b abstractC0680b, AlbumService albumService, SyncRemoteRepo syncRemoteRepo, AbstractC0681c abstractC0681c, AbstractC0684f abstractC0684f) {
        C106862S5w.LIZ(abstractC0680b, albumService, syncRemoteRepo, abstractC0681c, abstractC0684f);
        this.assetRepository = abstractC0680b;
        this.albumService = albumService;
        this.remoteRepo = syncRemoteRepo;
        this.kvRepo = abstractC0681c;
        this.userRepository = abstractC0684f;
    }
}
