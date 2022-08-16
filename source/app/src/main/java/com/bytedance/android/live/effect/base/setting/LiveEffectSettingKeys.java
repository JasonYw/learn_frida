package com.bytedance.android.live.effect.base.setting;

import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.covode.number.Covode;

/* loaded from: classes5.dex */
public interface LiveEffectSettingKeys {
    public static final SettingKey<Boolean> LIVE_ENABLE_DISCRETE_SQLITE_OPERATION = new SettingKey<>("live_enable_discrete_SQLite_operation", "是否开启数据库操作打散处理功能", Boolean.FALSE, Boolean.FALSE, "true:开启", "false:不开启");
    public static final SettingKey<Integer> START_LIVE_STYLE = new SettingKey<>("start_live_style_v2", 1, "开播页样式", "0:旧样式", "1:新样式");
    public static final SettingKey<Boolean> LIVE_STICKER_FAVORITE_ENABLE = new SettingKey<>("live_sticker_favorite_enable", "道具面板收藏功能开关", Boolean.FALSE, Boolean.TRUE, "true:开启", "false:关闭");
    public static final SettingKey<Boolean> LIVE_ENABLE_BEAUTY_SWITCH_BUTTON = new SettingKey<>("live_enable_beauty_switch", "是否开启美颜开关", Boolean.FALSE, Boolean.TRUE);
    public static final SettingKey<Boolean> LIVE_ENABLE_VCD_EFFECT = new SettingKey<>("live_enable_vcd_effect", "VCD特效", Boolean.TRUE, Boolean.TRUE);
    public static final SettingKey<Boolean> LIVE_ENABLE_NEW_GESTURE_DIALOG = new SettingKey<>("live_enable_new_gesture_dialog", "是否使用新交互手势面板", Boolean.FALSE, Boolean.TRUE, "true:开启新交互", "false:不开启新交互");
    public static final SettingKey<Integer> LIVE_SMALL_BEAUTY_AB_GROUP = new SettingKey<>("live_small_beauty_ab_group", 0, "直播小项AB分组");
    public static final SettingKey<Boolean> LIVE_ENABLE_NO_FILTER = new SettingKey<>("live_enable_no_filter", Boolean.TRUE, "是否显示空滤镜");
    public static final SettingKey<Boolean> LIVE_ENABLE_SMALL_ITEM_BEAUTY = new SettingKey<>("live_enable_small_item_beauty", Boolean.FALSE, "直播美颜小项");
    public static final SettingKey<Boolean> RESTORE_VIDEO_EFFECT = new SettingKey<>("restore_video_effect", Boolean.TRUE, "恢复工具线头饰");
    public static final SettingKey<Long> LIVE_FACE_STICKER_EFFECTIVELY_USE_TIME = new SettingKey<>("live_face_sticker_effectively_use_time", 30L, "贴纸使用行为的统计时长");
    public static final SettingKey<Long> LIVE_FILTER_EFFECTIVELY_USE_TIME = new SettingKey<>("live_filter_effectively_use_time", 30L, "滤镜使用行为的统计时长");
    public static final SettingKey<Boolean> LIVE_ANCHOR_FILTER_SLIDER_ENABLE = new SettingKey<>("live_anchor_filter_slider_enable", "是否开启滤镜滑杆", Boolean.TRUE, Boolean.TRUE);
    public static final SettingKey<Boolean> LIVE_SOUND_EFFECT_REMEMBER = new SettingKey<>("live_sound_effect_remember", "是否开启声效选中记忆", Boolean.FALSE, Boolean.FALSE);
    public static final SettingKey<Boolean> LIVE_ENABLE_REMOVE_AND_ADD_STICKER = new SettingKey<>("live_enable_remove_and_add_sticker", "是否在开播页使用道具时先remove再add", Boolean.FALSE, Boolean.FALSE);
    public static final SettingKey<Boolean> LIVE_STICKER_SHOW_LOG_FIX = new SettingKey<>("live_sticker_show_log_fix", "道具曝光埋点修复开关", Boolean.TRUE, Boolean.TRUE);

    static {
        Covode.recordClassIndex(24356);
    }
}
