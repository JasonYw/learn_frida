package com.bytedance.android.live.broadcast;

import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes5.dex */
public final class LiveTypeButton extends Enum<LiveTypeButton> {
    public static final /* synthetic */ LiveTypeButton[] $VALUES;
    public static final LiveTypeButton AUDIO;
    public static final LiveTypeButton MEDIA;
    public static final LiveTypeButton SCREEN_SHOT;
    public static final LiveTypeButton THIRD_PARTY;
    public static final LiveTypeButton VIDEO;
    public static ChangeQuickRedirect changeQuickRedirect;
    public final LiveMode liveMode;
    public final int selectedDrawableId;
    public final int titleId;
    public final int unselectedDrawableId;

    public static LiveTypeButton valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (LiveTypeButton) (proxy.isSupported ? proxy.result : Enum.valueOf(LiveTypeButton.class, str));
    }

    public static LiveTypeButton[] values() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (LiveTypeButton[]) (proxy.isSupported ? proxy.result : $VALUES.clone());
    }

    static {
        int i;
        Covode.recordClassIndex(14301);
        LiveTypeButton[] liveTypeButtonArr = new LiveTypeButton[5];
        LiveTypeButton liveTypeButton = new LiveTypeButton("VIDEO", 0, LiveMode.VIDEO, 2130855500, 2130855501, 2131588215);
        VIDEO = liveTypeButton;
        liveTypeButtonArr[0] = liveTypeButton;
        LiveTypeButton liveTypeButton2 = new LiveTypeButton("MEDIA", 1, LiveMode.MEDIA, 2130855500, 2130855501, 2131588215);
        MEDIA = liveTypeButton2;
        liveTypeButtonArr[1] = liveTypeButton2;
        LiveTypeButton liveTypeButton3 = new LiveTypeButton("AUDIO", 2, LiveMode.AUDIO, 2130855463, 2130855464, 2131582148);
        AUDIO = liveTypeButton3;
        liveTypeButtonArr[2] = liveTypeButton3;
        LiveMode liveMode = LiveMode.SCREEN_RECORD;
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_SCREENSHOT_TITLE_HAND_TOUR;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            i = 2131587576;
        } else {
            i = 2131587575;
        }
        LiveTypeButton liveTypeButton4 = new LiveTypeButton("SCREEN_SHOT", 3, liveMode, 2130855496, 2130855497, i);
        SCREEN_SHOT = liveTypeButton4;
        liveTypeButtonArr[3] = liveTypeButton4;
        LiveTypeButton liveTypeButton5 = new LiveTypeButton("THIRD_PARTY", 4, LiveMode.THIRD_PARTY, 2130855479, 2130855480, 2131588081);
        THIRD_PARTY = liveTypeButton5;
        liveTypeButtonArr[4] = liveTypeButton5;
        $VALUES = liveTypeButtonArr;
    }

    public LiveTypeButton(String str, int i, LiveMode liveMode, int i2, int i3, int i4) {
        this.liveMode = liveMode;
        this.selectedDrawableId = i2;
        this.unselectedDrawableId = i3;
        this.titleId = i4;
    }
}
