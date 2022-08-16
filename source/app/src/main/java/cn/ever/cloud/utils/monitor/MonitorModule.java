package cn.ever.cloud.utils.monitor;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C64868Big;

/* loaded from: classes23.dex */
public abstract class MonitorModule extends ModuleConfig {
    public static final ModuleConfig BACKUP = new Backup(null);
    public static final ModuleConfig DOWNLOAD = new Download(null);
    public static final ModuleConfig EP_ERROR = new EpError(null);
    public static final ModuleConfig ASSET_SERVICE = new AssetService(null);
    public static final ModuleConfig SYNC = new Sync(null);
    public static final ModuleConfig ALBUM_SERVICE = new AlbumService(null);
    public static final ModuleConfig USER = new User(null);
    public static final ModuleConfig NETWORK = new Network(null);

    /* renamed from: cn.ever.cloud.utils.monitor.MonitorModule$1 */
    /* loaded from: classes23.dex */
    public static /* synthetic */ class C07621 {
        static {
            Covode.recordClassIndex(3498);
        }
    }

    /* loaded from: classes23.dex */
    public static class AlbumService extends MonitorModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3499);
        }

        public AlbumService() {
            super("albumService", true, null);
            register("getAlbums", "durationMs");
        }

        public /* synthetic */ AlbumService(C07621 c07621) {
            this();
        }

        @Override // cn.ever.cloud.utils.monitor.ModuleConfig
        public void register(String str, String... strArr) {
            if (PatchProxy.proxy(new Object[]{str, strArr}, this, changeQuickRedirect, false, 1).isSupported) {
                return;
            }
            super.register(str, strArr);
        }
    }

    /* loaded from: classes23.dex */
    public static class AssetService extends MonitorModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3500);
        }

        public AssetService() {
            super("assetService", true, null);
            register("fetchAssets", "durationMs");
        }

        public /* synthetic */ AssetService(C07621 c07621) {
            this();
        }

        @Override // cn.ever.cloud.utils.monitor.ModuleConfig
        public void register(String str, String... strArr) {
            if (PatchProxy.proxy(new Object[]{str, strArr}, this, changeQuickRedirect, false, 1).isSupported) {
                return;
            }
            super.register(str, strArr);
        }
    }

    /* loaded from: classes23.dex */
    public static class Backup extends MonitorModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3501);
        }

        public Backup() {
            super("backup", true, null);
            register("singleAssetBackupResult", "spaceId", C2521l.LJIIJ, "message", "durationMs", "speed", "uploadPass");
        }

        public /* synthetic */ Backup(C07621 c07621) {
            this();
        }

        @Override // cn.ever.cloud.utils.monitor.ModuleConfig
        public void register(String str, String... strArr) {
            if (PatchProxy.proxy(new Object[]{str, strArr}, this, changeQuickRedirect, false, 1).isSupported) {
                return;
            }
            super.register(str, strArr);
        }
    }

    /* loaded from: classes23.dex */
    public static class Network extends MonitorModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3504);
        }

        public Network() {
            super("network", true, null);
            register("request", "path", C2521l.LJIIJ, "message");
        }

        public /* synthetic */ Network(C07621 c07621) {
            this();
        }

        @Override // cn.ever.cloud.utils.monitor.ModuleConfig
        public void register(String str, String... strArr) {
            if (PatchProxy.proxy(new Object[]{str, strArr}, this, changeQuickRedirect, false, 1).isSupported) {
                return;
            }
            super.register(str, strArr);
        }
    }

    /* loaded from: classes23.dex */
    public static class User extends MonitorModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3506);
        }

        public User() {
            super("user", true, null);
            register("userStorage", "usage", "quota");
        }

        public /* synthetic */ User(C07621 c07621) {
            this();
        }

        @Override // cn.ever.cloud.utils.monitor.ModuleConfig
        public void register(String str, String... strArr) {
            if (PatchProxy.proxy(new Object[]{str, strArr}, this, changeQuickRedirect, false, 1).isSupported) {
                return;
            }
            super.register(str, strArr);
        }
    }

    /* loaded from: classes23.dex */
    public static class Download extends MonitorModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3502);
        }

        public Download() {
            super(C64868Big.LIZJ, true, null);
            register("singleAssetDownloadResult", "spaceId", C2521l.LJIIJ, "message", "durationMs", "md5", "fileSize", "speed", "mediaId", "downloadPass");
        }

        public /* synthetic */ Download(C07621 c07621) {
            this();
        }

        @Override // cn.ever.cloud.utils.monitor.ModuleConfig
        public void register(String str, String... strArr) {
            if (PatchProxy.proxy(new Object[]{str, strArr}, this, changeQuickRedirect, false, 1).isSupported) {
                return;
            }
            super.register(str, strArr);
        }
    }

    /* loaded from: classes23.dex */
    public static class Sync extends MonitorModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3505);
        }

        public Sync() {
            super("sync", true, null);
            register("pullRequest", C2521l.LJIIJ, "durationMs", "assets", "tags");
            register("pullError", C2521l.LJIIJ, "message");
        }

        public /* synthetic */ Sync(C07621 c07621) {
            this();
        }

        @Override // cn.ever.cloud.utils.monitor.ModuleConfig
        public void register(String str, String... strArr) {
            if (PatchProxy.proxy(new Object[]{str, strArr}, this, changeQuickRedirect, false, 1).isSupported) {
                return;
            }
            super.register(str, strArr);
        }
    }

    static {
        Covode.recordClassIndex(3497);
    }

    /* loaded from: classes23.dex */
    public static class EpError extends MonitorModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3503);
        }

        public EpError() {
            super("epError", true, null);
            register("epError", "errorCode", "detailMessage");
            register("DBUpsertError", "tableName");
            register("clientError", "errorCode", "detailMessage", "jTotalMem", "jMaxMem", "jUsedRatio", "sysUsedMem", "sysMaxMem", "sysUsedRatio", "nativeUsedMem", "nativeMaxMem", "nativeUsedRatio");
            register("serverError", "errorCode", "detailMessage");
            register("bizException", "errorCode", "detailMessage");
        }

        public /* synthetic */ EpError(C07621 c07621) {
            this();
        }

        @Override // cn.ever.cloud.utils.monitor.ModuleConfig
        public void register(String str, String... strArr) {
            if (PatchProxy.proxy(new Object[]{str, strArr}, this, changeQuickRedirect, false, 1).isSupported) {
                return;
            }
            super.register(str, strArr);
        }
    }

    public MonitorModule(String str) {
        super(str);
    }

    public MonitorModule(String str, boolean z) {
        super(str, z);
    }

    public /* synthetic */ MonitorModule(String str, boolean z, C07621 c07621) {
        this(str, z);
    }
}
