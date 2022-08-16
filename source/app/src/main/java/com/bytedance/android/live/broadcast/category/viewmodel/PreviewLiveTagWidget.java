package com.bytedance.android.live.broadcast.category.viewmodel;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.model.CategoryNode;
import com.bytedance.android.live.broadcast.api.model.CategoryScene;
import com.bytedance.android.live.broadcast.category.C2961d;
import com.bytedance.android.live.broadcast.model.Challenge;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C2VQ;
import p003X.C2WC;
import p003X.C3VF;
import p003X.C4574547f;
import p003X.C77347GeT;
import p003X.C86906KMi;
import p003X.C86919KMv;
import p003X.C88440Kt0;
import p003X.LK5;

/* loaded from: classes5.dex */
public class PreviewLiveTagWidget extends PreviewCategoryWidget implements AbstractC4569445g {

    /* renamed from: LJ */
    public static ChangeQuickRedirect f25801LJ;
    public final Lazy LJFF = C77347GeT.LIZ(new PreviewLiveTagWidget$mLiveTagDataHandler$2(this));
    public boolean LJI;

    static {
        Covode.recordClassIndex(15185);
    }

    private final C2961d LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, f25801LJ, false, 1);
        return (C2961d) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewLiveTagWidget";
    }

    @Override // com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget, com.bytedance.ies.sdk.widgets.Widget
    public int getLayoutId() {
        return 2131698451;
    }

    @Override // com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget, com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, f25801LJ, false, 11).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public PreviewLiveTagWidget() {
        super(CategoryScene.VIDEO);
    }

    @Override // com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget
    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, f25801LJ, false, 6).isSupported) {
            return;
        }
        LJI().LIZIZ();
    }

    @Override // com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget, com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        TextView textView;
        TextView textView2;
        if (PatchProxy.proxy(new Object[0], this, f25801LJ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        SettingKey<Integer> settingKey = LiveSettingKeys.LIVE_OPEN_LIVE_VIDEO_INTERACT_STYLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (settingKey.getValue().intValue() > 0) {
            SettingKey<Boolean> settingKey2 = LiveSettingKeys.LIVE_VIDEO_KTV_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            Boolean value = settingKey2.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                View view = this.contentView;
                if (view != null) {
                    view.setBackground(null);
                }
                SettingKey<Integer> settingKey3 = LiveSettingKeys.LIVE_OPEN_LIVE_VIDEO_INTERACT_STYLE;
                Intrinsics.checkNotNullExpressionValue(settingKey3, "");
                Integer value2 = settingKey3.getValue();
                if (value2 != null && value2.intValue() == 1) {
                    View view2 = this.contentView;
                    if (view2 != null && (textView2 = (TextView) view2.findViewById(2131169122)) != null) {
                        textView2.setText(LK5.LIZ(2131587620));
                    }
                    View view3 = this.contentView;
                    if (view3 != null && (textView = (TextView) view3.findViewById(2131169122)) != null) {
                        textView.setEms(5);
                    }
                }
            }
        }
        LIZIZ().LJIIIZ().observe(this, new C86906KMi(this));
    }

    @Override // com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget
    public final void LIZ(CategoryScene categoryScene) {
        if (PatchProxy.proxy(new Object[]{categoryScene}, this, f25801LJ, false, 4).isSupported) {
            return;
        }
        LJI().LIZ(categoryScene);
    }

    @Override // com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget
    public final void LIZ(String str) {
        View view;
        TextView textView;
        if (PatchProxy.proxy(new Object[]{str}, this, f25801LJ, false, 10).isSupported) {
            return;
        }
        if (!TextUtils.isEmpty(str) && (view = this.contentView) != null && (textView = (TextView) view.findViewById(2131169122)) != null) {
            textView.setText(str);
        }
        C86919KMv c86919KMv = this.LIZJ;
        if (c86919KMv != null) {
            c86919KMv.dismiss();
        }
        this.LIZJ = null;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LIZ(LiveMode liveMode) {
        String str;
        if (PatchProxy.proxy(new Object[]{liveMode}, this, f25801LJ, false, 9).isSupported) {
            return;
        }
        super.LIZ(liveMode);
        if (liveMode == LiveMode.VIDEO) {
            HashMap<CategoryScene, List<CategoryNode>> value = LIZIZ().m15906LJ().getValue();
            if (value == null || value.isEmpty()) {
                LIZ(CategoryScene.VIDEO);
            }
            CategoryNode LIZ = LIZJ().LJIIL().LIZ();
            if (LIZ != null && LIZ.challengeIdStr != null && LIZ != null && LIZ.challengeName != null) {
                String str2 = LIZ.challengeIdStr;
                String str3 = LIZ.challengeName;
                Challenge LIZ2 = LIZJ().LJIJJLI().LIZ();
                if (LIZ2 != null) {
                    str = LIZ2.source;
                } else {
                    str = null;
                }
                if (Intrinsics.areEqual(str, "challenge")) {
                    return;
                }
                if (str2 != null && str2.length() > 0 && str3 != null && str3.length() > 0) {
                    LIZJ().LJIJJLI().LIZ(new Challenge(str2, str3));
                    return;
                }
                Challenge LIZ3 = LIZJ().LJIJJLI().LIZ();
                if (LIZ3 != null && LIZ3.isCategoryBind) {
                    LIZJ().LJIJJLI().LIZ(null);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget
    public final void LIZ(CategoryNode categoryNode) {
        LiveMode liveMode;
        String str;
        boolean z;
        Long l;
        C2WC<LiveMode> c2wc;
        Long l2;
        if (PatchProxy.proxy(new Object[]{categoryNode}, this, f25801LJ, false, 8).isSupported) {
            return;
        }
        super.LIZ(categoryNode);
        if (categoryNode == null) {
            return;
        }
        if (!PatchProxy.proxy(new Object[]{categoryNode}, this, f25801LJ, false, 3).isSupported) {
            LJI().LIZ(categoryNode);
        }
        LIZJ().LJIIL().LIZ(categoryNode);
        C2WC<LiveMode> c2wc2 = LIZJ().LIZJ;
        LiveMode liveMode2 = null;
        if (c2wc2 != null) {
            liveMode = c2wc2.LIZ();
        } else {
            liveMode = null;
        }
        if (liveMode == LiveMode.AUDIO) {
            return;
        }
        String str2 = categoryNode.challengeIdStr;
        String str3 = categoryNode.challengeName;
        Challenge LIZ = LIZJ().LJIJJLI().LIZ();
        if (LIZ != null) {
            str = LIZ.source;
        } else {
            str = null;
        }
        if (Intrinsics.areEqual(str, "challenge") && Intrinsics.areEqual(LIZIZ().LJIILJJIL().getValue(), Boolean.FALSE)) {
            return;
        }
        if (str2 != null && str2.length() > 0 && str3 != null && str3.length() > 0) {
            Challenge challenge = new Challenge(str2, str3);
            challenge.isCategoryBind = false;
            LIZJ().LJIJJLI().LIZ(challenge);
        } else {
            LIZJ().LJIJJLI().LIZ(null);
        }
        String str4 = LIZJ().LJIIL().LIZ().challengeIdStr;
        Intrinsics.checkNotNullExpressionValue(str4, "");
        if (str4.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!this.LJI && Intrinsics.areEqual(LIZIZ().LJIILJJIL().getValue(), Boolean.TRUE)) {
                C88440Kt0.LIZ(2131582488);
                this.LJI = true;
            }
            HashMap hashMap = new HashMap();
            C3VF user = ((IUserService) ServiceManager.getService(IUserService.class)).user();
            if (user != null) {
                l2 = Long.valueOf(user.LIZIZ());
            } else {
                l2 = null;
            }
            hashMap.put("anchor_id", String.valueOf(l2.longValue()));
            hashMap.put("room_id", "");
            hashMap.put("entrance_type", "live_take");
            hashMap.put("tag_id", String.valueOf(LIZJ().LJIIL().LIZ().challengeId.longValue()));
            hashMap.put("tag_source", "content");
            hashMap.put("is_auto", "1");
            hashMap.put("creation_id", UUID.randomUUID().toString());
            C4574547f.LIZ().LIZ("livesdk_challenge_list_click", hashMap, new Object[0]);
        }
        if (Intrinsics.areEqual(LIZIZ().LJIILJJIL().getValue(), Boolean.TRUE)) {
            HashMap hashMap2 = new HashMap();
            C3VF user2 = ((IUserService) ServiceManager.getService(IUserService.class)).user();
            if (user2 != null) {
                l = Long.valueOf(user2.LIZIZ());
            } else {
                l = null;
            }
            hashMap2.put("anchor_id", String.valueOf(l.longValue()));
            hashMap2.put("request_page", "live_start");
            hashMap2.put("content", String.valueOf(categoryNode.title));
            C3199v LIZJ = LIZJ();
            if (LIZJ != null && (c2wc = LIZJ.LIZJ) != null) {
                liveMode2 = c2wc.LIZ();
            }
            hashMap2.put("live_type", C2VQ.LIZ(liveMode2));
            C4574547f.LIZ().LIZ("livesdk_room_content_select_click", hashMap2, new Object[0]);
        }
    }

    @Override // com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget
    public final void LIZ(HashMap<CategoryScene, List<CategoryNode>> hashMap) {
        LiveMode liveMode;
        if (PatchProxy.proxy(new Object[]{hashMap}, this, f25801LJ, false, 7).isSupported) {
            return;
        }
        C2WC<LiveMode> c2wc = LIZJ().LIZJ;
        if (c2wc != null) {
            liveMode = c2wc.LIZ();
        } else {
            liveMode = null;
        }
        if (liveMode == LiveMode.SCREEN_RECORD) {
            return;
        }
        LJI().LIZ(hashMap);
    }

    @Override // com.bytedance.android.live.broadcast.category.viewmodel.PreviewCategoryWidget
    public final CategoryNode LIZ(long j, List<? extends CategoryNode> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), list}, this, f25801LJ, false, 5);
        if (proxy.isSupported) {
            return (CategoryNode) proxy.result;
        }
        return LJI().LIZ(j, list);
    }
}
