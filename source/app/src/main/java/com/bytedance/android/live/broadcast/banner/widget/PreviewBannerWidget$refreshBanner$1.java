package com.bytedance.android.live.broadcast.banner.widget;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.banner.view.AutoScrollViewPager;
import com.bytedance.android.live.broadcast.banner.view.LinearBannerIndicator;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C81918IQm;
import p003X.C86863KKr;
import p003X.C86866KKu;
import p003X.C86867KKv;
import p003X.KKB;
import p003X.KKR;

/* loaded from: classes5.dex */
public final class PreviewBannerWidget$refreshBanner$1 extends Lambda implements Function1<RoomCreateInfo, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewBannerWidget this$0;

    static {
        Covode.recordClassIndex(14656);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewBannerWidget$refreshBanner$1(PreviewBannerWidget previewBannerWidget) {
        super(1);
        this.this$0 = previewBannerWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(RoomCreateInfo roomCreateInfo) {
        List<RoomCreateInfo.C2893d> list;
        ViewGroup.LayoutParams layoutParams;
        RoomCreateInfo roomCreateInfo2 = roomCreateInfo;
        if (!PatchProxy.proxy(new Object[]{roomCreateInfo2}, this, changeQuickRedirect, false, 1).isSupported) {
            if (roomCreateInfo2 != null && KKB.LIZIZ(roomCreateInfo2, this.this$0.LJIIJJI().LIZ().LIZ())) {
                PreviewBannerWidget previewBannerWidget = this.this$0;
                LiveMode LIZ = previewBannerWidget.LJIIJJI().LIZ().LIZ();
                if (!PatchProxy.proxy(new Object[]{roomCreateInfo2, LIZ}, previewBannerWidget, PreviewBannerWidget.LIZ, false, 3).isSupported && (previewBannerWidget.LIZJ == null || LIZ == null || previewBannerWidget.LIZJ != LIZ || !previewBannerWidget.LIZLLL)) {
                    previewBannerWidget.LIZJ = LIZ;
                    if (previewBannerWidget.LIZIZ == null) {
                        Context context = previewBannerWidget.context;
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        ViewGroup viewGroup = previewBannerWidget.containerView;
                        Intrinsics.checkNotNullExpressionValue(viewGroup, "");
                        AutoScrollViewPager autoScrollViewPager = (AutoScrollViewPager) viewGroup.findViewById(2131193084);
                        Intrinsics.checkNotNullExpressionValue(autoScrollViewPager, "");
                        previewBannerWidget.LIZIZ = new C86863KKr(context, autoScrollViewPager);
                    }
                    previewBannerWidget.LJIILJJIL();
                    if (previewBannerWidget.getContext() != null) {
                        ViewGroup viewGroup2 = previewBannerWidget.containerView;
                        Intrinsics.checkNotNullExpressionValue(viewGroup2, "");
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup2.findViewById(2131193082);
                        if (constraintLayout != null && (layoutParams = constraintLayout.getLayoutParams()) != null) {
                            layoutParams.height = (int) C81918IQm.LIZ(previewBannerWidget.context, 58.0f);
                        }
                    }
                    ViewGroup viewGroup3 = previewBannerWidget.containerView;
                    Intrinsics.checkNotNullExpressionValue(viewGroup3, "");
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) viewGroup3.findViewById(2131193082);
                    if (constraintLayout2 != null) {
                        constraintLayout2.setVisibility(0);
                    }
                    ViewGroup viewGroup4 = previewBannerWidget.containerView;
                    Intrinsics.checkNotNullExpressionValue(viewGroup4, "");
                    AutoScrollViewPager autoScrollViewPager2 = (AutoScrollViewPager) viewGroup4.findViewById(2131193084);
                    ViewGroup viewGroup5 = previewBannerWidget.containerView;
                    Intrinsics.checkNotNullExpressionValue(viewGroup5, "");
                    LinearBannerIndicator linearBannerIndicator = (LinearBannerIndicator) viewGroup5.findViewById(2131193083);
                    KKR kkr = roomCreateInfo2.LJJIIJZLJL;
                    if (kkr != null) {
                        list = kkr.LIZIZ(LIZ);
                    } else {
                        list = null;
                    }
                    if (list != null && !list.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(list);
                        if (list.size() > 1) {
                            arrayList.add(list.get(0));
                            arrayList.add(0, list.get(list.size() - 1));
                        } else if (list.size() == 1) {
                            previewBannerWidget.LIZ("EXPOSURE", list.get(0), LIZ);
                        }
                        C86863KKr c86863KKr = previewBannerWidget.LIZIZ;
                        if (c86863KKr != null) {
                            c86863KKr.LIZIZ = new C86866KKu(previewBannerWidget, linearBannerIndicator, arrayList, LIZ);
                        }
                        C86863KKr c86863KKr2 = previewBannerWidget.LIZIZ;
                        if (c86863KKr2 != null) {
                            c86863KKr2.LIZJ = new C86867KKv(previewBannerWidget, LIZ);
                        }
                        Intrinsics.checkNotNullExpressionValue(autoScrollViewPager2, "");
                        autoScrollViewPager2.setAdapter(previewBannerWidget.LIZIZ);
                        C86863KKr c86863KKr3 = previewBannerWidget.LIZIZ;
                        if (c86863KKr3 != null && !PatchProxy.proxy(new Object[]{arrayList}, c86863KKr3, C86863KKr.LIZ, false, 6).isSupported) {
                            C106862S5w.LIZ(arrayList);
                            c86863KKr3.LIZLLL.clear();
                            c86863KKr3.LIZLLL.addAll(arrayList);
                            c86863KKr3.notifyDataSetChanged();
                        }
                        if (arrayList.size() <= 1) {
                            autoScrollViewPager2.setAutoEnable(false);
                        } else {
                            autoScrollViewPager2.setCurrentItem(1);
                            autoScrollViewPager2.setAutoEnable(true);
                            if (!PatchProxy.proxy(new Object[0], autoScrollViewPager2, AutoScrollViewPager.LIZ, false, 3).isSupported) {
                                if (autoScrollViewPager2.LIZIZ) {
                                    autoScrollViewPager2.LIZLLL = true;
                                }
                                autoScrollViewPager2.f25784LJ.removeCallbacksAndMessages(null);
                                autoScrollViewPager2.f25784LJ.sendEmptyMessageDelayed(1000, autoScrollViewPager2.LIZJ);
                            }
                            linearBannerIndicator.setData(list.size());
                        }
                    } else {
                        previewBannerWidget.LIZIZ();
                    }
                }
                this.this$0.LIZLLL = true;
            } else {
                this.this$0.LIZIZ();
            }
        }
        return Unit.INSTANCE;
    }
}
