package android.p006ss.com.vboost;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;

/* renamed from: android.ss.com.vboost.CustomScene */
/* loaded from: classes21.dex */
public enum CustomScene {
    COMMON_APP_START(100001, "common_app_start"),
    COMMON_CAMERA_START(100002, "common_camera_start"),
    COMMON_WINDOW_SWITCH(100003, "common_window_switch"),
    COMMON_TAB_SWITCH(100004, "common_tab_switch"),
    DY_GO_DUET(200001, "dy_go_duet"),
    DY_GO_REACTION(200002, "dy_go_reaction"),
    DY_TAB_LIVING_LOAD(200003, "dy_tab_living_load"),
    DY_TAB_NEARBY_LOAD(200004, "dy_tab_nearby_load"),
    DY_TAB_FOLLOW_LOAD(200005, "dy_tab_follow_load"),
    DY_TAB_SEARCH_LOAD(200006, "dy_tab_search_load"),
    DY_TAB_HOME_LOAD(200007, "dy_tab_home_load"),
    DY_TAB_FAMILIAR_LOAD(200008, "dy_tab_familiar_load"),
    DY_TAB_PUBLISH_LOAD(200009, "dy_tab_publish_load"),
    DY_TAB_NOTIFICATION_LOAD(200010, "dy_tab_notification_load"),
    DY_TAB_USER_LOAD(200011, "dy_tab_user_load"),
    DY_CONCURRENT_UPLOAD_COMPILE(200012, "dy_concurrent_upload_compile"),
    DY_FEED_SCROLL(200013, "dy_feed_scroll"),
    DY_COMMENT_LOAD(200014, "dy_comment_load"),
    DY_TAB_MUSIC(200015, "dy_tab_music"),
    DY_15S_CAPTURE_START(200016, "dy_15s_capture_start"),
    DY_LIVING_SCROLL(200017, "dy_living_scroll"),
    DY_LIVING_ENTER_GIFT_PANEL(200018, "dy_living_enter_gift_panel"),
    DY_LIVING_ENTER_GOODS_LIST(200019, "dy_living_enter_goods_list"),
    TO_FIRST_FRAME_DRAW(300001, "to_first_frame_draw"),
    TO_TAB_SWITCH(300002, "to_tab_switch"),
    TO_CLICK_NEWS(300003, "to_click_news"),
    TO_SCROLL_NEWS(300004, "to_scroll_news"),
    TO_VIDEO_FIRST_FRAME(300005, "to_video_first_frame"),
    TL_FIRST_FRAME_DRAW(400001, "tl_first_frame_draw"),
    TL_TAB_SWITCH(400002, "tl_tab_switch"),
    TL_CLICK_NEWS(400003, "tl_click_news"),
    TL_SCROLL_NEWS(400004, "tl_scroll_news"),
    DC_SCROLL_HOME(500001, "dc_scroll_home"),
    DC_TAB_SWITCH(500002, "dc_tab_switch"),
    DC_SCROLL_MOMENTS(500003, "dc_scroll_moments"),
    DC_VIDEO_FIRST_DRAW(500004, "dc_video_first_draw"),
    TT_GO_DUET(600001, "tt_go_duet"),
    TT_GO_REACTION(600002, "tt_go_reaction"),
    TT_TAB_LIVING_LOAD(600003, "tt_tab_living_load"),
    TT_TAB_NEARBY_LOAD(600004, "tt_tab_nearby_load"),
    TT_TAB_FOLLOW_LOAD(600005, "tt_tab_follow_load"),
    TT_TAB_SEARCH_LOAD(600006, "tt_tab_search_load"),
    TT_TAB_HOME_LOAD(600007, "tt_tab_home_load"),
    TT_TAB_FAMILIAR_LOAD(600008, "tt_tab_familiar_load"),
    TT_TAB_PUBLISH_LOAD(600009, "tt_tab_publish_load"),
    TT_TAB_NOTIFICATION_LOAD(600010, "tt_tab_notification_load"),
    TT_TAB_USER_LOAD(600011, "tt_tab_user_load"),
    TT_CONCURRENT_UPLOAD_COMPILE(600012, "tt_concurrent_upload_compile"),
    TT_FEED_SCROLL(600013, "tt_feed_scroll"),
    TT_COMMENT_LOAD(600014, "tt_comment_load"),
    TT_TAB_MUSIC(600015, "tt_tab_music"),
    TT_15S_CAPTURE_START(600016, "tt_15s_capture_start"),
    TT_LIVING_SCROLL(600017, "tt_living_scroll"),
    TT_LIVING_ENTER_GIFT_PANEL(600018, "tt_living_enter_gift_panel"),
    TT_LIVING_ENTER_GOODS_LIST(600019, "tt_living_enter_goods_list");
    
    public static final int LAST_COMMON_SCENE_ID;
    public static final int LAST_DC_SCENE_ID;
    public static final int LAST_DY_SCENE_ID;
    public static final int LAST_SCENE_ID;
    public static final int LAST_TL_SCENE_ID;
    public static final int LAST_TO_SCENE_ID;
    public static final int LAST_TT_SCENE_ID;
    public static final int MAX_CLASS;
    public static ChangeQuickRedirect changeQuickRedirect;
    public String desc;

    /* renamed from: id */
    public int f20182id;

    public static CustomScene valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return proxy.isSupported ? (CustomScene) proxy.result : (CustomScene) Enum.valueOf(CustomScene.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static CustomScene[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return proxy.isSupported ? (CustomScene[]) proxy.result : (CustomScene[]) values().clone();
    }

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(31);
        CustomScene customScene = COMMON_TAB_SWITCH;
        CustomScene customScene2 = DY_LIVING_ENTER_GOODS_LIST;
        CustomScene customScene3 = TO_VIDEO_FIRST_FRAME;
        CustomScene customScene4 = TL_SCROLL_NEWS;
        CustomScene customScene5 = DC_VIDEO_FIRST_DRAW;
        CustomScene customScene6 = TT_LIVING_ENTER_GOODS_LIST;
        LAST_COMMON_SCENE_ID = customScene.f20182id;
        LAST_DY_SCENE_ID = customScene2.f20182id;
        LAST_TO_SCENE_ID = customScene3.f20182id;
        LAST_TL_SCENE_ID = customScene4.f20182id;
        LAST_DC_SCENE_ID = customScene5.f20182id;
        int i = customScene6.f20182id;
        LAST_TT_SCENE_ID = i;
        LAST_SCENE_ID = i;
        MAX_CLASS = i / 100000;
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(31);
        COMMON_APP_START = new CustomScene(100001, "common_app_start");
        COMMON_CAMERA_START = new CustomScene(100002, "common_camera_start");
        COMMON_WINDOW_SWITCH = new CustomScene(100003, "common_window_switch");
        COMMON_TAB_SWITCH = new CustomScene(100004, "common_tab_switch");
        DY_GO_DUET = new CustomScene(200001, "dy_go_duet");
        DY_GO_REACTION = new CustomScene(200002, "dy_go_reaction");
        DY_TAB_LIVING_LOAD = new CustomScene(200003, "dy_tab_living_load");
        DY_TAB_NEARBY_LOAD = new CustomScene(200004, "dy_tab_nearby_load");
        DY_TAB_FOLLOW_LOAD = new CustomScene(200005, "dy_tab_follow_load");
        DY_TAB_SEARCH_LOAD = new CustomScene(200006, "dy_tab_search_load");
        DY_TAB_HOME_LOAD = new CustomScene(200007, "dy_tab_home_load");
        DY_TAB_FAMILIAR_LOAD = new CustomScene(200008, "dy_tab_familiar_load");
        DY_TAB_PUBLISH_LOAD = new CustomScene(200009, "dy_tab_publish_load");
        DY_TAB_NOTIFICATION_LOAD = new CustomScene(200010, "dy_tab_notification_load");
        DY_TAB_USER_LOAD = new CustomScene(200011, "dy_tab_user_load");
        DY_CONCURRENT_UPLOAD_COMPILE = new CustomScene(200012, "dy_concurrent_upload_compile");
        DY_FEED_SCROLL = new CustomScene(200013, "dy_feed_scroll");
        DY_COMMENT_LOAD = new CustomScene(200014, "dy_comment_load");
        DY_TAB_MUSIC = new CustomScene(200015, "dy_tab_music");
        DY_15S_CAPTURE_START = new CustomScene(200016, "dy_15s_capture_start");
        DY_LIVING_SCROLL = new CustomScene(200017, "dy_living_scroll");
        DY_LIVING_ENTER_GIFT_PANEL = new CustomScene(200018, "dy_living_enter_gift_panel");
        DY_LIVING_ENTER_GOODS_LIST = new CustomScene(200019, "dy_living_enter_goods_list");
        TO_FIRST_FRAME_DRAW = new CustomScene(300001, "to_first_frame_draw");
        TO_TAB_SWITCH = new CustomScene(300002, "to_tab_switch");
        TO_CLICK_NEWS = new CustomScene(300003, "to_click_news");
        TO_SCROLL_NEWS = new CustomScene(300004, "to_scroll_news");
        TO_VIDEO_FIRST_FRAME = new CustomScene(300005, "to_video_first_frame");
        TL_FIRST_FRAME_DRAW = new CustomScene(400001, "tl_first_frame_draw");
        TL_TAB_SWITCH = new CustomScene(400002, "tl_tab_switch");
        TL_CLICK_NEWS = new CustomScene(400003, "tl_click_news");
        TL_SCROLL_NEWS = new CustomScene(400004, "tl_scroll_news");
        DC_SCROLL_HOME = new CustomScene(500001, "dc_scroll_home");
        DC_TAB_SWITCH = new CustomScene(500002, "dc_tab_switch");
        DC_SCROLL_MOMENTS = new CustomScene(500003, "dc_scroll_moments");
        DC_VIDEO_FIRST_DRAW = new CustomScene(500004, "dc_video_first_draw");
        TT_GO_DUET = new CustomScene(600001, "tt_go_duet");
        TT_GO_REACTION = new CustomScene(600002, "tt_go_reaction");
        TT_TAB_LIVING_LOAD = new CustomScene(600003, "tt_tab_living_load");
        TT_TAB_NEARBY_LOAD = new CustomScene(600004, "tt_tab_nearby_load");
        TT_TAB_FOLLOW_LOAD = new CustomScene(600005, "tt_tab_follow_load");
        TT_TAB_SEARCH_LOAD = new CustomScene(600006, "tt_tab_search_load");
        TT_TAB_HOME_LOAD = new CustomScene(600007, "tt_tab_home_load");
        TT_TAB_FAMILIAR_LOAD = new CustomScene(600008, "tt_tab_familiar_load");
        TT_TAB_PUBLISH_LOAD = new CustomScene(600009, "tt_tab_publish_load");
        TT_TAB_NOTIFICATION_LOAD = new CustomScene(600010, "tt_tab_notification_load");
        TT_TAB_USER_LOAD = new CustomScene(600011, "tt_tab_user_load");
        TT_CONCURRENT_UPLOAD_COMPILE = new CustomScene(600012, "tt_concurrent_upload_compile");
        TT_FEED_SCROLL = new CustomScene(600013, "tt_feed_scroll");
        TT_COMMENT_LOAD = new CustomScene(600014, "tt_comment_load");
        TT_TAB_MUSIC = new CustomScene(600015, "tt_tab_music");
        TT_15S_CAPTURE_START = new CustomScene(600016, "tt_15s_capture_start");
        TT_LIVING_SCROLL = new CustomScene(600017, "tt_living_scroll");
        TT_LIVING_ENTER_GIFT_PANEL = new CustomScene(600018, "tt_living_enter_gift_panel");
        TT_LIVING_ENTER_GOODS_LIST = new CustomScene(600019, "tt_living_enter_goods_list");
        CustomScene customScene = COMMON_TAB_SWITCH;
        CustomScene customScene2 = DY_LIVING_ENTER_GOODS_LIST;
        CustomScene customScene3 = TO_VIDEO_FIRST_FRAME;
        CustomScene customScene4 = TL_SCROLL_NEWS;
        CustomScene customScene5 = DC_VIDEO_FIRST_DRAW;
        CustomScene customScene6 = TT_LIVING_ENTER_GOODS_LIST;
        $VALUES = new CustomScene[]{COMMON_APP_START, COMMON_CAMERA_START, COMMON_WINDOW_SWITCH, customScene, DY_GO_DUET, DY_GO_REACTION, DY_TAB_LIVING_LOAD, DY_TAB_NEARBY_LOAD, DY_TAB_FOLLOW_LOAD, DY_TAB_SEARCH_LOAD, DY_TAB_HOME_LOAD, DY_TAB_FAMILIAR_LOAD, DY_TAB_PUBLISH_LOAD, DY_TAB_NOTIFICATION_LOAD, DY_TAB_USER_LOAD, DY_CONCURRENT_UPLOAD_COMPILE, DY_FEED_SCROLL, DY_COMMENT_LOAD, DY_TAB_MUSIC, DY_15S_CAPTURE_START, DY_LIVING_SCROLL, DY_LIVING_ENTER_GIFT_PANEL, customScene2, TO_FIRST_FRAME_DRAW, TO_TAB_SWITCH, TO_CLICK_NEWS, TO_SCROLL_NEWS, customScene3, TL_FIRST_FRAME_DRAW, TL_TAB_SWITCH, TL_CLICK_NEWS, customScene4, DC_SCROLL_HOME, DC_TAB_SWITCH, DC_SCROLL_MOMENTS, customScene5, TT_GO_DUET, TT_GO_REACTION, TT_TAB_LIVING_LOAD, TT_TAB_NEARBY_LOAD, TT_TAB_FOLLOW_LOAD, TT_TAB_SEARCH_LOAD, TT_TAB_HOME_LOAD, TT_TAB_FAMILIAR_LOAD, TT_TAB_PUBLISH_LOAD, TT_TAB_NOTIFICATION_LOAD, TT_TAB_USER_LOAD, TT_CONCURRENT_UPLOAD_COMPILE, TT_FEED_SCROLL, TT_COMMENT_LOAD, TT_TAB_MUSIC, TT_15S_CAPTURE_START, TT_LIVING_SCROLL, TT_LIVING_ENTER_GIFT_PANEL, customScene6};
        LAST_COMMON_SCENE_ID = customScene.f20182id;
        LAST_DY_SCENE_ID = customScene2.f20182id;
        LAST_TO_SCENE_ID = customScene3.f20182id;
        LAST_TL_SCENE_ID = customScene4.f20182id;
        LAST_DC_SCENE_ID = customScene5.f20182id;
        int i = customScene6.f20182id;
        LAST_TT_SCENE_ID = i;
        LAST_SCENE_ID = i;
        MAX_CLASS = i / 100000;
    }

    CustomScene(int i, String str) {
        this.f20182id = i;
        this.desc = str;
    }

    public static int getSceneClass(int i) {
        return i / 100000;
    }

    public static int getSceneNum(int i) {
        return i % 100000;
    }

    public static boolean isValidClass(int i) {
        return i > 0 && i <= MAX_CLASS;
    }

    public static boolean isValidNum(int i, int i2) {
        switch (i) {
            case 1:
                return i2 > 0 && i2 <= LAST_COMMON_SCENE_ID % 100000;
            case 2:
                return i2 > 0 && i2 <= LAST_DY_SCENE_ID % 100000;
            case 3:
                return i2 > 0 && i2 <= LAST_TO_SCENE_ID % 100000;
            case 4:
                return i2 > 0 && i2 <= LAST_TL_SCENE_ID % 100000;
            case 5:
                return i2 > 0 && i2 <= LAST_DC_SCENE_ID % 100000;
            case 6:
                return i2 > 0 && i2 <= LAST_TT_SCENE_ID % 100000;
            default:
                return false;
        }
    }

    public static boolean isValidId(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        int sceneClass = getSceneClass(i);
        return isValidClass(sceneClass) && isValidNum(sceneClass, getSceneNum(i));
    }

    public final int getId() {
        return this.f20182id;
    }

    public final String getDesc() {
        return this.desc;
    }
}
