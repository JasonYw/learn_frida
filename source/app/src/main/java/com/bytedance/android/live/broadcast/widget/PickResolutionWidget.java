package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget;
import com.bytedance.android.live.broadcast.widget.PickResolutionWidget;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveAnchorOneOffKeys;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C2VQ;
import p003X.C3VF;
import p003X.C4574547f;
import p003X.C87308Kak;

/* loaded from: classes12.dex */
public final class PickResolutionWidget extends AbsRecyclablePreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LJFF;
    public final Function0<Unit> LJI;

    static {
        Covode.recordClassIndex(18367);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PickResolutionWidget";
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699878;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJFF, false, 3).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
    }

    public PickResolutionWidget(Function0<Unit> function0) {
        C106862S5w.LIZ(function0);
        this.LJI = function0;
    }

    public final void LIZ(String str) {
        String str2;
        C3VF user;
        if (PatchProxy.proxy(new Object[]{str}, this, LJFF, false, 2).isSupported) {
            return;
        }
        C4574547f LIZ = C4574547f.LIZ();
        Pair[] pairArr = new Pair[4];
        LiveMode LIZ2 = LIZIZ().LIZ().LIZ();
        if (LIZ2 == null) {
            LIZ2 = LiveMode.VIDEO;
        }
        pairArr[0] = TuplesKt.m137to("live_type", C2VQ.LIZ(LIZ2));
        IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
        if (iUserService != null && (user = iUserService.user()) != null) {
            str2 = String.valueOf(user.LIZIZ());
        } else {
            str2 = null;
        }
        pairArr[1] = TuplesKt.m137to("anchor_id", str2);
        pairArr[2] = TuplesKt.m137to("event_page", "live_take_page");
        pairArr[3] = TuplesKt.m137to("show_type", "icon");
        LIZ.LIZ(str, MapsKt__MapsKt.mapOf(pairArr), Room.class);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        List<RoomCreateInfo.C2896g.C2897a> list;
        int i;
        if (PatchProxy.proxy(new Object[]{objArr}, this, LJFF, false, 1).isSupported) {
            return;
        }
        int i2 = 8;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], AnchorVideoResolutionManager.LJIIIZ, AnchorVideoResolutionManager.LIZ, false, 8);
        if (!proxy.isSupported ? (list = AnchorVideoResolutionManager.LIZIZ) == null || list.isEmpty() : !((Boolean) proxy.result).booleanValue()) {
            ViewGroup viewGroup = this.containerView;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                return;
            }
            return;
        }
        AnchorVideoResolutionManager.LJIIIZ.m15916LJ("load PickResolutionWidget");
        this.contentView.setOnClickListener(new View.OnClickListener() { // from class: X.2nB
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18368);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                View view2 = PickResolutionWidget.this.contentView;
                Intrinsics.checkNotNullExpressionValue(view2, "");
                View findViewById = view2.findViewById(2131172723);
                Intrinsics.checkNotNullExpressionValue(findViewById, "");
                findViewById.setVisibility(8);
                PickResolutionWidget.this.LJI.mo30099invoke();
                AnchorVideoResolutionManager.LIZ(PickResolutionWidget.this.context, null, false);
                PickResolutionWidget.this.LIZ("livesdk_anchor_definition_setting_button");
            }
        });
        String value = AnchorVideoResolutionManager.LJI.getValue();
        AnchorVideoResolutionManager anchorVideoResolutionManager = AnchorVideoResolutionManager.LJIIIZ;
        anchorVideoResolutionManager.m15916LJ("current selected resolution is " + value + " ; isEnable : " + AnchorVideoResolutionManager.LJIIIZ.LIZJ());
        View view = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        if (AnchorVideoResolutionManager.LJIIIZ.LIZJ() && value != null && !StringsKt__StringsJVMKt.isBlank(value)) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        View view2 = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        TextView textView = (TextView) view2.findViewById(2131195179);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setText(value);
        View view3 = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view3, "");
        View findViewById = view3.findViewById(2131172723);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        C87308Kak<LiveAnchorOneOffKeys> c87308Kak = AbstractC80293Hkt.f7120cp;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        if (!c87308Kak.LIZ().getDot_preview_used()) {
            i2 = 0;
        }
        findViewById.setVisibility(i2);
        C87308Kak<LiveAnchorOneOffKeys> c87308Kak2 = AbstractC80293Hkt.f7120cp;
        c87308Kak2.LIZ(LiveAnchorOneOffKeys.copy$default(c87308Kak2.LIZ(), true, false, false, 6, null));
        LIZ("livesdk_anchor_definition_setting_button_show");
        ViewGroup viewGroup2 = this.containerView;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
    }
}
