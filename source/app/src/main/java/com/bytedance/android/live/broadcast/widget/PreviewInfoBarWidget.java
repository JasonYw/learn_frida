package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.broadcast.widget.PreviewInfoBarWidget;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.android.livesdkapi.util.url.UrlBuilder;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C442873fV;
import p003X.C4574547f;

/* loaded from: classes12.dex */
public final class PreviewInfoBarWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public HSImageView LIZIZ;
    public TextView LIZJ;
    public TextView LIZLLL;

    /* renamed from: LJ */
    public String f25989LJ;
    public String LJFF;
    public C9078n LJI;

    static {
        Covode.recordClassIndex(18540);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewInfoBarWidget";
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698448;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LJIILJJIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        super.LJIILJJIL();
        LIZIZ();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onResume();
        this.contentView.setOnClickListener(new View.OnClickListener() { // from class: X.2wM
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18541);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                PreviewInfoBarWidget previewInfoBarWidget = PreviewInfoBarWidget.this;
                if (!PatchProxy.proxy(new Object[0], previewInfoBarWidget, PreviewInfoBarWidget.LIZ, false, 4).isSupported) {
                    String str = previewInfoBarWidget.f25989LJ;
                    if (str != null && str.length() != 0) {
                        Context context = previewInfoBarWidget.context;
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        Resources resources = context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "");
                        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                        int i = (int) (displayMetrics.widthPixels / displayMetrics.density);
                        UrlBuilder urlBuilder = new UrlBuilder(previewInfoBarWidget.f25989LJ);
                        urlBuilder.addParam("live_type", C442873fV.LIZ.LIZ(previewInfoBarWidget.LJIIJJI().LIZ().LIZ()));
                        C9078n c9078n = previewInfoBarWidget.LJI;
                        if (c9078n != null && c9078n.LJIILIIL()) {
                            c9078n.dismissAllowingStateLoss();
                        }
                        previewInfoBarWidget.LJI = null;
                        String build = urlBuilder.build();
                        Intrinsics.checkNotNullExpressionValue(build, "");
                        AbstractC100934Pp2 buildWebDialog = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).buildWebDialog(build);
                        buildWebDialog.LIZJ(i);
                        buildWebDialog.LIZLLL(484);
                        buildWebDialog.LIZ(8, 8, 0, 0);
                        AbstractC100934Pp2 LJII = buildWebDialog.LJII(LK5.LIZIZ(2131629314));
                        LJII.LIZIZ(false);
                        LJII.mo22951LJ(0);
                        LJII.LJI(80);
                        previewInfoBarWidget.LJI = LJII.LIZ();
                        if (previewInfoBarWidget.context instanceof FragmentActivity) {
                            C427822wK c427822wK = C9078n.LJJIJLIJ;
                            Context context2 = previewInfoBarWidget.context;
                            if (context2 != null) {
                                c427822wK.LIZ((FragmentActivity) context2, previewInfoBarWidget.LJI);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                            }
                        }
                        if (!PatchProxy.proxy(new Object[0], previewInfoBarWidget, PreviewInfoBarWidget.LIZ, false, 6).isSupported) {
                            HashMap hashMap = new HashMap();
                            try {
                                IUser LIZ2 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
                                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                                hashMap.put("live_type", C442873fV.LIZ.LIZ(previewInfoBarWidget.LJIIJJI().LIZ().LIZ()));
                                hashMap.put("anchor_id", String.valueOf(LIZ2.getId()));
                                hashMap.put("stimulate_type", previewInfoBarWidget.LJFF);
                                hashMap.put("event_page", "live_take_page");
                            } catch (Exception unused) {
                            }
                            C4574547f.LIZ().LIZ("livesdk_takepage_stimulate_entrance_click", hashMap, new Object[0]);
                            return;
                        }
                        return;
                    }
                    ALogger.m15800e(previewInfoBarWidget.LIZ(), "show InfoBar Dialog Error:null jumpUrl");
                }
            }
        });
        if (LJIILIIL() != 0) {
            LJIILJJIL();
        }
    }

    private final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            IUser LIZ2 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            hashMap.put("live_type", C442873fV.LIZ.LIZ(LJIIJJI().LIZ().LIZ()));
            hashMap.put("anchor_id", String.valueOf(LIZ2.getId()));
            hashMap.put("stimulate_type", this.LJFF);
            hashMap.put("event_page", "live_take_page");
        } catch (Exception unused) {
        }
        C4574547f.LIZ().LIZ("livesdk_takepage_stimulate_entrance_show", hashMap, new Object[0]);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        this.LIZIZ = (HSImageView) this.contentView.findViewById(2131177788);
        this.LIZJ = (TextView) this.contentView.findViewById(2131177821);
        this.LIZLLL = (TextView) this.contentView.findViewById(2131177790);
        LIZ(LJIIJJI().LIZ(new PreviewInfoBarWidget$onCreate$1(this)));
    }
}
