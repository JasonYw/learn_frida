package com.bytedance.android.live.broadcast.category.viewmodel;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.model.CategoryNode;
import com.bytedance.android.live.broadcast.api.model.CategoryScene;
import com.bytedance.android.live.broadcast.category.C2959a;
import com.bytedance.android.live.broadcast.model.Challenge;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C134215brD;
import p003X.C2VQ;
import p003X.C2WC;
import p003X.C3VF;
import p003X.C4574547f;
import p003X.C86905KMh;
import p003X.C86909KMl;
import p003X.C86910KMm;
import p003X.LK1;

/* loaded from: classes5.dex */
public class PreviewGameCategoryWidget extends PreviewCategoryWidget implements AbstractC4569445g {

    /* renamed from: LJ */
    public static ChangeQuickRedirect f25800LJ;
    public C134215brD LJFF;

    static {
        Covode.recordClassIndex(15177);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public String LIZ() {
        return "PreviewGameCategoryWidget";
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public String getSpm() {
        return "a100.a100.a221";
    }

    @Override // com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget, com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, f25800LJ, false, 8).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public PreviewGameCategoryWidget() {
        super(CategoryScene.GAME);
    }

    @Override // com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget
    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, f25800LJ, false, 3).isSupported) {
            return;
        }
        m15907LJ().LIZIZ();
    }

    @Override // com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget, com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        View view;
        if (PatchProxy.proxy(new Object[0], this, f25800LJ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        LIZIZ().LJFF().observe(this, new C86905KMh(this));
        LIZIZ().LJIILLIIL().observe(this, new C86909KMl(this));
        LIZLLL().LIZIZ().observe(this, new C86910KMm(this));
        SettingKey<Integer> settingKey = LiveSettingKeys.LIVE_OPEN_LIVE_VIDEO_INTERACT_STYLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (settingKey.getValue().intValue() > 0) {
            SettingKey<Boolean> settingKey2 = LiveSettingKeys.LIVE_VIDEO_KTV_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            Boolean value = settingKey2.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue() && (view = this.contentView) != null) {
                view.setBackground(null);
            }
        }
        LK1.LIZ(1L, false, false, new PreviewGameCategoryWidget$onCreate$4(this), 6, null);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LIZ(LiveMode liveMode) {
        if (PatchProxy.proxy(new Object[]{liveMode}, this, f25800LJ, false, 7).isSupported) {
            return;
        }
        super.LIZ(liveMode);
        if (liveMode == LiveMode.SCREEN_RECORD) {
            HashMap<CategoryScene, List<CategoryNode>> value = LIZIZ().m15906LJ().getValue();
            if (value == null || value.isEmpty()) {
                LIZ(CategoryScene.GAME);
                return;
            }
            return;
        }
        C134215brD c134215brD = this.LJFF;
        if (c134215brD != null) {
            c134215brD.LIZLLL();
        }
    }

    @Override // com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget
    public final void LIZ(HashMap<CategoryScene, List<CategoryNode>> hashMap) {
        LiveMode liveMode;
        if (PatchProxy.proxy(new Object[]{hashMap}, this, f25800LJ, false, 4).isSupported) {
            return;
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_BROADCAST_SELECT_TAG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            C2WC<LiveMode> c2wc = LIZJ().LIZJ;
            if (c2wc != null) {
                liveMode = c2wc.LIZ();
            } else {
                liveMode = null;
            }
            if (liveMode != LiveMode.SCREEN_RECORD) {
                return;
            }
        }
        m15907LJ().LIZ(hashMap, new PreviewGameCategoryWidget$onCategoryFetched$1(this));
    }

    @Override // com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget
    public final void LIZ(CategoryNode categoryNode) {
        Long l;
        C2WC<LiveMode> c2wc;
        if (PatchProxy.proxy(new Object[]{categoryNode}, this, f25800LJ, false, 5).isSupported) {
            return;
        }
        super.LIZ(categoryNode);
        LiveMode liveMode = null;
        if (categoryNode != null && categoryNode.categoryId != null && categoryNode.challengeId != null) {
            if (!PatchProxy.proxy(new Object[]{categoryNode}, this, f25800LJ, false, 2).isSupported) {
                m15907LJ().LIZ(categoryNode);
            }
            String str = categoryNode.challengeIdStr;
            String str2 = categoryNode.challengeName;
            if (str != null && str.length() > 0 && str2 != null && str2.length() > 0) {
                Challenge challenge = new Challenge(str, str2);
                challenge.isCategoryBind = true;
                challenge.source = "vertical_record";
                LIZJ().LJJ().LIZ(challenge);
            } else {
                Challenge LIZ = LIZJ().LJJ().LIZ();
                if (LIZ != null && LIZ.isCategoryBind) {
                    LIZJ().LJJ().LIZ(null);
                }
            }
            LIZJ().LJIILL().LIZ(categoryNode);
            if (categoryNode.isOtherCategory && C2959a.LIZLLL.LIZ()) {
                LIZIZ().LJI().postValue(categoryNode);
            }
            if (Intrinsics.areEqual(LIZIZ().LJIILJJIL().getValue(), Boolean.TRUE)) {
                HashMap hashMap = new HashMap();
                C3VF user = ((IUserService) ServiceManager.getService(IUserService.class)).user();
                if (user != null) {
                    l = Long.valueOf(user.LIZIZ());
                } else {
                    l = null;
                }
                hashMap.put("anchor_id", String.valueOf(l.longValue()));
                hashMap.put("request_page", "live_start");
                hashMap.put("content", String.valueOf(categoryNode.title));
                SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_BROADCAST_SELECT_TAG;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue()) {
                    C3199v LIZJ = LIZJ();
                    if (LIZJ != null && (c2wc = LIZJ.LIZJ) != null) {
                        liveMode = c2wc.LIZ();
                    }
                    hashMap.put("live_type", C2VQ.LIZ(liveMode));
                }
                C4574547f.LIZ().LIZ("livesdk_room_content_select_click", hashMap, new Object[0]);
            }
        }
    }
}
