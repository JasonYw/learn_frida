package com.bytedance.android.live.broadcast.widget;

import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.KKB;
import p003X.KKR;
import p003X.LHN;
import p003X.M0O;
import p003X.View$OnClickListenerC86860KKo;

/* loaded from: classes5.dex */
public final class PreviewActivityBannerWidget$refreshBanner$1 extends Lambda implements Function1<RoomCreateInfo, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewActivityBannerWidget this$0;

    static {
        Covode.recordClassIndex(18394);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewActivityBannerWidget$refreshBanner$1(PreviewActivityBannerWidget previewActivityBannerWidget) {
        super(1);
        this.this$0 = previewActivityBannerWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(RoomCreateInfo roomCreateInfo) {
        String str;
        RoomCreateInfo.C2893d LIZ;
        ViewGroup.LayoutParams layoutParams;
        int LIZLLL;
        RoomCreateInfo roomCreateInfo2 = roomCreateInfo;
        if (!PatchProxy.proxy(new Object[]{roomCreateInfo2}, this, changeQuickRedirect, false, 1).isSupported) {
            if (roomCreateInfo2 != null && KKB.LIZ(roomCreateInfo2, this.this$0.LJIIJJI().LIZ().LIZ())) {
                PreviewActivityBannerWidget previewActivityBannerWidget = this.this$0;
                LiveMode LIZ2 = previewActivityBannerWidget.LJIIJJI().LIZ().LIZ();
                if (!PatchProxy.proxy(new Object[]{roomCreateInfo2, LIZ2}, previewActivityBannerWidget, PreviewActivityBannerWidget.LIZ, false, 3).isSupported) {
                    previewActivityBannerWidget.LJIILJJIL();
                    ViewGroup viewGroup = previewActivityBannerWidget.containerView;
                    Intrinsics.checkNotNullExpressionValue(viewGroup, "");
                    HSImageView hSImageView = (HSImageView) viewGroup.findViewById(2131193079);
                    if (hSImageView != null && (layoutParams = hSImageView.getLayoutParams()) != null) {
                        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], previewActivityBannerWidget, PreviewActivityBannerWidget.LIZ, false, 4);
                        if (proxy.isSupported) {
                            LIZLLL = ((Integer) proxy.result).intValue();
                        } else {
                            LIZLLL = (int) ((LHN.LIZLLL() - (((int) UIUtils.dip2Px(previewActivityBannerWidget.getContext(), 40.0f)) * 2)) * 0.1966f);
                        }
                        layoutParams.height = LIZLLL;
                    }
                    ViewGroup viewGroup2 = previewActivityBannerWidget.containerView;
                    Intrinsics.checkNotNullExpressionValue(viewGroup2, "");
                    HSImageView hSImageView2 = (HSImageView) viewGroup2.findViewById(2131193079);
                    if (hSImageView2 != null) {
                        hSImageView2.setVisibility(0);
                    }
                    KKR kkr = roomCreateInfo2.LJJIIJZLJL;
                    if (kkr != null && (LIZ = kkr.LIZ(LIZ2)) != null) {
                        str = LIZ.LIZIZ;
                    } else {
                        str = null;
                    }
                    ViewGroup viewGroup3 = previewActivityBannerWidget.containerView;
                    Intrinsics.checkNotNullExpressionValue(viewGroup3, "");
                    M0O.LIZ((HSImageView) viewGroup3.findViewById(2131193079), str);
                    previewActivityBannerWidget.LIZ("live_banner_show", roomCreateInfo2, LIZ2);
                    ViewGroup viewGroup4 = previewActivityBannerWidget.containerView;
                    Intrinsics.checkNotNullExpressionValue(viewGroup4, "");
                    HSImageView hSImageView3 = (HSImageView) viewGroup4.findViewById(2131193079);
                    if (hSImageView3 != null) {
                        hSImageView3.setOnClickListener(new View$OnClickListenerC86860KKo(previewActivityBannerWidget, roomCreateInfo2, LIZ2));
                    }
                }
            } else {
                this.this$0.LJIILL();
            }
        }
        return Unit.INSTANCE;
    }
}
