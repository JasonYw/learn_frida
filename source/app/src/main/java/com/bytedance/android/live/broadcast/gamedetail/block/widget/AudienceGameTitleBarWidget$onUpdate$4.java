package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.api.gamepromote.GameStageType;
import com.bytedance.android.live.broadcast.download.DownloadView;
import com.bytedance.android.live.broadcast.gamedetail.order.model.C3113i;
import com.bytedance.android.live.broadcast.gamedetail.order.p269a.C3099a;
import com.bytedance.android.live.broadcast.gamedetail.order.view.ReserveButton;
import com.bytedance.android.live.broadcast.gamedetailv2.data.C3119b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.C106862S5w;
import p003X.C87010KQi;
import p003X.L7K;
import p003X.L7P;
import p003X.L8U;
import p003X.L8W;
import p003X.M0Q;

/* loaded from: classes5.dex */
public final class AudienceGameTitleBarWidget$onUpdate$4 extends Lambda implements Function1<C3119b, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AudienceGameTitleBarWidget this$0;

    static {
        Covode.recordClassIndex(16350);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceGameTitleBarWidget$onUpdate$4(AudienceGameTitleBarWidget audienceGameTitleBarWidget) {
        super(1);
        this.this$0 = audienceGameTitleBarWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3119b c3119b) {
        Long l;
        GameStageType LIZ;
        String str;
        TextView textView;
        String str2;
        C3119b c3119b2 = c3119b;
        if (!PatchProxy.proxy(new Object[]{c3119b2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c3119b2);
            C3243u c3243u = c3119b2.LIZIZ;
            Integer num = null;
            if (c3243u != null && (str2 = c3243u.LJFF) != null && (!StringsKt__StringsJVMKt.isBlank(str2))) {
                ImageModel imageModel = new ImageModel();
                imageModel.setUrls(CollectionsKt__CollectionsKt.arrayListOf(str2));
                M0Q.LIZ(this.this$0.f25863LJ, imageModel);
            }
            C3243u c3243u2 = c3119b2.LIZIZ;
            if (c3243u2 != null && (str = c3243u2.LIZLLL) != null && (!StringsKt__StringsJVMKt.isBlank(str)) && (textView = this.this$0.LJFF) != null) {
                textView.setText(str);
            }
            C3243u c3243u3 = c3119b2.LIZIZ;
            if (c3243u3 != null) {
                l = c3243u3.LJJIIJ;
            } else {
                l = null;
            }
            if (l != null && l.longValue() == 0) {
                C3243u c3243u4 = c3119b2.LIZIZ;
                if (c3243u4 != null && (LIZ = c3243u4.LIZ()) != null && L8U.LIZ[LIZ.ordinal()] == 1) {
                    AudienceGameTitleBarWidget audienceGameTitleBarWidget = this.this$0;
                    C3113i c3113i = c3119b2.LJIJJLI;
                    if (!PatchProxy.proxy(new Object[]{c3113i, c3119b2}, audienceGameTitleBarWidget, AudienceGameTitleBarWidget.LIZ, false, 5).isSupported) {
                        audienceGameTitleBarWidget.LJIIIZ = C87010KQi.LIZ().LIZ(C3099a.class).subscribe(new L7P(audienceGameTitleBarWidget, c3119b2, c3113i), L8W.LIZ);
                        if (c3113i != null) {
                            num = Integer.valueOf(c3113i.LIZJ);
                        }
                        audienceGameTitleBarWidget.LIZ(num);
                        ReserveButton reserveButton = audienceGameTitleBarWidget.LJIIIIZZ;
                        if (reserveButton != null) {
                            reserveButton.setOnClickListener(new L7K(audienceGameTitleBarWidget, c3113i, c3119b2));
                        }
                    }
                    DownloadView downloadView = this.this$0.LJI;
                    if (downloadView != null) {
                        downloadView.setVisibility(8);
                    }
                    ReserveButton reserveButton2 = this.this$0.LJIIIIZZ;
                    if (reserveButton2 != null) {
                        reserveButton2.setVisibility(0);
                    }
                } else {
                    DownloadView downloadView2 = this.this$0.LJI;
                    if (downloadView2 != null) {
                        downloadView2.setVisibility(0);
                    }
                    ReserveButton reserveButton3 = this.this$0.LJIIIIZZ;
                    if (reserveButton3 != null) {
                        reserveButton3.setVisibility(8);
                    }
                    this.this$0.LIZ(c3119b2);
                }
            } else {
                DownloadView downloadView3 = this.this$0.LJI;
                if (downloadView3 != null) {
                    downloadView3.setVisibility(8);
                }
                ReserveButton reserveButton4 = this.this$0.LJIIIIZZ;
                if (reserveButton4 != null) {
                    reserveButton4.setVisibility(8);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
