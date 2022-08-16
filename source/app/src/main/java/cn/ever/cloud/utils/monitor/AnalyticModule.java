package cn.ever.cloud.utils.monitor;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.umeng.commonsdk.internal.C33838c;
import com.umeng.commonsdk.vchannel.C33968a;

/* loaded from: classes20.dex */
public abstract class AnalyticModule extends ModuleConfig {
    public static final ModuleConfig PREVIEW = new Preview(null);
    public static final ModuleConfig SHARE_GUIDE = new ShareGuide(null);
    public static final ModuleConfig BACKUP = new Backup(null);
    public static final ModuleConfig HOME_PAGE_NO_BACKUP = new HomePageNoBackup(null);
    public static final ModuleConfig LOGIN = new Login(null);
    public static final ModuleConfig HOME_PAGE = new HomePage(null);
    public static final ModuleConfig MOMENT = new Moment(null);
    public static final ModuleConfig PHOTO_FILTER = new PhotoFilter(null);
    public static final ModuleConfig ACCOUNT_SECURITY = new AccountSecurity(null);
    public static final ModuleConfig SEARCH = new Search(null);
    public static final ModuleConfig TRANSMISSION = new Transmission(null);
    public static final ModuleConfig OTHER_SETTINGS = new OtherSettings(null);
    public static final ModuleConfig SYNC_SETTINGS = new SyncSettings(null);
    public static final ModuleConfig MULTI_SELECTOR = new MultiSelector(null);
    public static final ModuleConfig MEMBER = new Member(null);
    public static final ModuleConfig HOME_PAGE_LIB = new HomePageLib(null);
    public static final ModuleConfig STATUS_BAR = new StatusBar(null);
    public static final ModuleConfig SHARE_SPACE_SETTING = new ShareSpaceSetting(null);
    public static final ModuleConfig SETTINGS = new Settings(null);
    public static final ModuleConfig HOME_PAGE_STORIES = new HomePageStories(null);
    public static final ModuleConfig SHARE_SPACE = new ShareSpace(null);
    public static final ModuleConfig SHARE_SPACE_INVITE_PAGE = new ShareSpaceInvitePage(null);
    public static final ModuleConfig HOME_PAGE_ASSISTANT = new HomePageAssistant(null);
    public static final ModuleConfig SHARE_SPACE_TAB = new ShareSpaceTab(null);
    public static final ModuleConfig HOME_PAGE_FEED = new HomePageFeed(null);
    public static final ModuleConfig TRASH = new Trash(null);
    public static final ModuleConfig HOME_PAGE_ALBUMS = new HomePageAlbums(null);
    public static final ModuleConfig DEEP_LINK = new DeepLink(null);
    public static final ModuleConfig SHARE_SPACE_LIST = new ShareSpaceList(null);
    public static final ModuleConfig SHARE_SPACE_MENU = new ShareSpaceMenu(null);
    public static final ModuleConfig PAGE = new Page(null);
    public static final ModuleConfig SHARE_PUBLISH = new SharePublish(null);
    public static final ModuleConfig SHARE_STORAGE_PAGE = new ShareStoragePage(null);

    /* renamed from: cn.ever.cloud.utils.monitor.AnalyticModule$1 */
    /* loaded from: classes20.dex */
    public static /* synthetic */ class C07611 {
        static {
            Covode.recordClassIndex(3459);
        }
    }

    /* loaded from: classes20.dex */
    public static class ShareGuide extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3480);
        }

        public ShareGuide() {
            super("shareGuide", false, null);
            register("guide", new String[0]);
        }

        public /* synthetic */ ShareGuide(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class DeepLink extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3462);
        }

        public DeepLink() {
            super("deepLink", false, null);
            register("handleSchema", "handled", "path");
        }

        public /* synthetic */ DeepLink(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class HomePage extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3463);
        }

        public HomePage() {
            super("homePage", false, null);
            register("enter", "member");
        }

        public /* synthetic */ HomePage(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class HomePageNoBackup extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3468);
        }

        public HomePageNoBackup() {
            super("homePageNoBackup", false, null);
            register("enter", "number");
        }

        public /* synthetic */ HomePageNoBackup(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class Page extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3475);
        }

        public Page() {
            super("page", false, null);
            register("pageStay", "currentPage", "duration");
        }

        public /* synthetic */ Page(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class ShareSpaceList extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3484);
        }

        public ShareSpaceList() {
            super("shareSpaceList", false, null);
            register("showPreviewPage", "type", "source", "status");
        }

        public /* synthetic */ ShareSpaceList(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class ShareSpaceTab extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3487);
        }

        public ShareSpaceTab() {
            super("shareSpaceTab", false, null);
            register("enter", new String[0]);
            register("clickSpaceList", new String[0]);
            register("clickMenu", new String[0]);
        }

        public /* synthetic */ ShareSpaceTab(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class ShareStoragePage extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3488);
        }

        public ShareStoragePage() {
            super("shareStoragePage", false, null);
            register("enter", "status");
            register("clickCreateShare", new String[0]);
        }

        public /* synthetic */ ShareStoragePage(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class StatusBar extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3489);
        }

        public StatusBar() {
            super("statusBar", false, null);
            register("show", "status");
        }

        public /* synthetic */ StatusBar(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class Trash extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3492);
        }

        public Trash() {
            super("trash", false, null);
            register("enter", "source");
        }

        public /* synthetic */ Trash(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class Backup extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3461);
        }

        public Backup() {
            super("backup", false, null);
            register(C33838c.f42636f, "assetsSize", "assetsLocalOnly", "assetsLocalAndCloud", "assetsCloudOnly", "assetsNeedBackup", "autoBackup", "spaceCount", "backupState", "backupRemainCount");
        }

        public /* synthetic */ Backup(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class HomePageFeed extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3466);
        }

        public HomePageFeed() {
            super("homePageFeed", false, null);
            register("enter", C33968a.f42937f);
            register("likes", "source");
            register(UGCMonitor.EVENT_COMMENT, "source");
            register("message", new String[0]);
            register("enterFeed", new String[0]);
            register("inviteBar", "type", C33968a.f42937f);
        }

        public /* synthetic */ HomePageFeed(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class HomePageLib extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3467);
        }

        public HomePageLib() {
            super("homePageLib", false, null);
            register("enter", "space");
            register("showStory", new String[0]);
            register("closeStory", new String[0]);
            register("clickMoreStory", new String[0]);
            register("clickStory", new String[0]);
        }

        public /* synthetic */ HomePageLib(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class HomePageStories extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3469);
        }

        public HomePageStories() {
            super("homePageStories", false, null);
            register("enter", "space");
            register("clickAll", "space");
            register("clickMemory", "space");
            register("clickStory", "space");
            register("clickStoryPlay", "space");
        }

        public /* synthetic */ HomePageStories(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class Moment extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3472);
        }

        public Moment() {
            super("moment", true, null);
            register("topicsNumber", "type", "number", "photoCount", "duplicatedMomentCount", "duplicatedPhotoCount", "increasedMomentCount", "increasedPhotoCount");
            register("momentAssetImport", "initialSize");
            register("momentAssetImportResult", "size");
        }

        public /* synthetic */ Moment(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class OtherSettings extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3474);
        }

        public OtherSettings() {
            super("otherSettings", false, null);
            register("enter", new String[0]);
            register("account", new String[0]);
            register("logout", "type");
        }

        public /* synthetic */ OtherSettings(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class Search extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3478);
        }

        public Search() {
            super("search", false, null);
            register("enter", C33968a.f42937f);
            register("result", "status");
            register("text", C33968a.f42937f);
            register("confirm", "source");
        }

        public /* synthetic */ Search(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class ShareSpace extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3482);
        }

        public ShareSpace() {
            super("shareSpace", false, null);
            register("enter", C33968a.f42937f, "name", "members", "assetsSize", "unread", "pin", "usageM", "updateTime", "activities", "peopleCount");
            register("invitePage", "source", C33968a.f42937f);
        }

        public /* synthetic */ ShareSpace(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class ShareSpaceInvitePage extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3483);
        }

        public ShareSpaceInvitePage() {
            super("shareSpaceInvitePage", false, null);
            register("copyInviteCode", C33968a.f42937f);
            register("clickWX", C33968a.f42937f);
            register("clickQQ", C33968a.f42937f);
        }

        public /* synthetic */ ShareSpaceInvitePage(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class ShareSpaceMenu extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3485);
        }

        public ShareSpaceMenu() {
            super("shareSpaceMenu", false, null);
            register("clickCreateSpace", "type", "source");
            register("clickEnterInviteCode", "type", "source");
            register("clickSpaceSetting", new String[0]);
            register("clickInviteMembers", new String[0]);
            register("clickMessages", new String[0]);
            register("clickSearch", new String[0]);
        }

        public /* synthetic */ ShareSpaceMenu(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class ShareSpaceSetting extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3486);
        }

        public ShareSpaceSetting() {
            super("shareSpaceSetting", false, null);
            register("enter", new String[0]);
            register("enterInvitePage", "source");
            register("setNickname", "type");
            register("clickTop", "status");
        }

        public /* synthetic */ ShareSpaceSetting(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class AccountSecurity extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3460);
        }

        public AccountSecurity() {
            super("accountSecurity", false, null);
            register("bindPhone", new String[0]);
            register("changePhone", new String[0]);
            register("enterOldPhone", new String[0]);
            register("enterOldPhoneCode", new String[0]);
            register("enterBindNewPhone", new String[0]);
            register("bindNewPhone", new String[0]);
            register("changePassword", new String[0]);
            register("bindWX", "type");
            register("bindQQ", "type");
            register("deviceManagement", new String[0]);
            register("deviceOffline", new String[0]);
        }

        public /* synthetic */ AccountSecurity(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class Member extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3471);
        }

        public Member() {
            super("member", false, null);
            register("enter", "source");
            register("clickMember", "type");
            register("clickBuy", "memberType", "memberNewType");
            register("confirmBuy", "duration", "memberType", "paymentAmount", "payChannel", "orderId", "memberNewType");
            register("showBuyResultPage", "duration", "memberType", "paymentAmount", "payChannel", "result", "failReason", "orderId", "memberNewType");
            register("clickUpgradeMember", "type");
            register("confirmUpgradeMember", "result", "failReason");
        }

        public /* synthetic */ Member(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class MultiSelector extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3473);
        }

        public MultiSelector() {
            super("multiSelector", false, null);
            register("enter", "source");
            register("clickAll", "source");
            register("clickDelete", "source");
            register("clickAdd", "source");
            register("clickPublish", "source");
            register("clickShare", "source");
            register("clickDownload", "source");
            register("clickBackup", "source");
            register("clickFavorites", "source");
            register("clickHide", "source");
            register("clickEncrypt", "source");
            register("clickMovie", "source");
        }

        public /* synthetic */ MultiSelector(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class PhotoFilter extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3476);
        }

        public PhotoFilter() {
            super("photoFilter", false, null);
            register("enter", "source");
            register("photoStatus", "status");
            register("viewBy", "status");
            register("orderBy", "status");
            register("mimeType", "status");
            register("noShow", "status");
        }

        public /* synthetic */ PhotoFilter(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class Settings extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3479);
        }

        public Settings() {
            super("settings", false, null);
            register("enter", new String[0]);
            register("clickProfile", new String[0]);
            register("clickSignin", new String[0]);
            register("signPopup", new String[0]);
            register("clickSyncSettings", new String[0]);
            register("clickVip", new String[0]);
            register("clickFeedback", new String[0]);
            register("clickStorage", new String[0]);
            register("clickShareStorage", new String[0]);
            register("clickStorageRule", "source");
            register("clickCreateShare", new String[0]);
            register("clickUseShare", new String[0]);
            register("clickToSyncSettings", new String[0]);
        }

        public /* synthetic */ Settings(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class SharePublish extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3481);
        }

        public SharePublish() {
            super("sharePublish", false, null);
            register("enter", new String[0]);
            register("enterMainPage", "source");
            register("addPhoto", new String[0]);
            register("sorting", new String[0]);
            register("complete", UGCMonitor.TYPE_PHOTO, "text", "space", "at");
            register("clickAdd", new String[0]);
            register("clickPhoto", new String[0]);
            register("clickPhotomovie", new String[0]);
        }

        public /* synthetic */ SharePublish(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class SyncSettings extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3490);
        }

        public SyncSettings() {
            super("syncSettings", false, null);
            register("switch", "status");
            register("mobileSwitch", "status");
            register("clickPeopleTab", new String[0]);
            register("clickLocalTab", new String[0]);
            register("clickPersonalTab", new String[0]);
            register("clickPeopleSwitch", "status");
            register("clickLocalSwitch", "status");
            register("clickPersonalSwitch", "status");
            register("albumSyncSwitch", "status", "type");
        }

        public /* synthetic */ SyncSettings(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class Transmission extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3491);
        }

        public Transmission() {
            super("transmission", false, null);
            register("enter", new String[0]);
            register("clickUploadTab", new String[0]);
            register("showUploadError", new String[0]);
            register("clickUploadError", new String[0]);
            register("clickDownloadTab", new String[0]);
            register("clickSuspend", new String[0]);
            register("clickContinue", new String[0]);
            register("clickCleanUp", new String[0]);
            register("clickCancel", "type");
        }

        public /* synthetic */ Transmission(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class HomePageAlbums extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3464);
        }

        public HomePageAlbums() {
            super("homePageAlbums", false, null);
            register("enter", "space");
            register("clickNewAlbum", "space", "type");
            register("clickOnePeople", "space");
            register("clickPeople", "space");
            register("clickPeopleSync", "space");
            register("clickEntityAlbum", "space");
            register("clickOneEntityAlbum", "space");
            register("clickPlaces", "space");
            register("clickOnePlaces", "space");
            register("clickLocal", "space");
            register("clickOneLocal", "space");
            register("clickLocalSync", "space");
            register("clickVideo", "space");
            register("clickScreenShots", "space");
            register("clickGif", "space");
            register("clickPersonal", "space");
            register("clickPersonalSync", "space");
            register("clickFavorites", "space");
            register("deletePersonal", "space");
            register("clickSort", "space", "type");
        }

        public /* synthetic */ HomePageAlbums(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class HomePageAssistant extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3465);
        }

        public HomePageAssistant() {
            super("homePageAssistant", false, null);
            register("enter", new String[0]);
            register("freeSpace", new String[0]);
            register("freeSpacePopup", "type");
            register("noFreeSpacePopup", new String[0]);
            register("hide", new String[0]);
            register("clickPhotomovie", C33968a.f42937f);
            register("photomovie", "source");
            register("switchTemplate", C33968a.f42937f);
            register("savePhotomovie", "time");
            register("graphSelector", "source");
            register("sharePhotomovie", "type");
            register("secret", new String[0]);
            register("secretPasswordPanel", new String[0]);
            register("secretSetPassword", new String[0]);
            register("incorrectPasswordPopup", new String[0]);
            register("secretDecrypt", "source");
            register("secretDelete", "source");
            register("secretMove", new String[0]);
            register("musicAlbum", new String[0]);
        }

        public /* synthetic */ HomePageAssistant(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class Login extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3470);
        }

        public Login() {
            super("login", false, null);
            register("enter", "networkScene");
            register("getSmsCode", new String[0]);
            register("enterSmsCode", new String[0]);
            register("clickSmsCodeLogin", new String[0]);
            register("clickPassword", new String[0]);
            register("clickOtherLogin", new String[0]);
            register("clickWXLogin", new String[0]);
            register("clickQQLogin", new String[0]);
            register("oldUser", new String[0]);
            register("oldUserOtherLogin", new String[0]);
            register("enterBindPhone", new String[0]);
            register("skipBindPhone", new String[0]);
            register("bindPhone", new String[0]);
            register("enterPassword", new String[0]);
            register("clickPasswordLogin", new String[0]);
            register("clickForgetPassword", new String[0]);
            register("success", "user", "type");
            register("forgetPasswordGetSmsCode", new String[0]);
            register("forgetPasswordVerifySmsCode", new String[0]);
            register("resetPassword", new String[0]);
            register("graphicCode", "type");
            register("showOneClickLogin", new String[0]);
            register("clickOneClickLogin", new String[0]);
            register("clickPasswordOCL", new String[0]);
            register("clickSmsCodeOCL", new String[0]);
        }

        public /* synthetic */ Login(C07611 c07611) {
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

    /* loaded from: classes20.dex */
    public static class Preview extends AnalyticModule {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3477);
        }

        public Preview() {
            super("preview", false, null);
            register("enter", "source");
            register("clickDelete", "source");
            register("clickAdd", "source");
            register("clickPublish", "source");
            register("clickShare", "source");
            register("clickDownload", "source");
            register("clickUpload", "source");
            register("clickFavorites", "source");
            register("clickHide", "source");
            register("clickInfo", "source", "type");
            register("showViewImage", "source");
            register("clickViewImage", "source");
            register("clickEncrypt", "source");
            register("playVideo", "source");
            register("enlarge", "source");
            register("back", new String[0]);
            register("clickMovie", "source");
            register("clickEdit", "source");
            register("note", "type");
        }

        public /* synthetic */ Preview(C07611 c07611) {
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
        Covode.recordClassIndex(3458);
    }

    public AnalyticModule(String str) {
        super(str);
    }

    public AnalyticModule(String str, boolean z) {
        super(str, z);
    }

    public /* synthetic */ AnalyticModule(String str, boolean z, C07611 c07611) {
        this(str, z);
    }
}
