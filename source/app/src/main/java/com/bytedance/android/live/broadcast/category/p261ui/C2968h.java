package com.bytedance.android.live.broadcast.category.p261ui;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.broadcast.api.model.CategoryNode;
import com.bytedance.android.live.broadcast.api.model.CategoryScene;
import com.bytedance.android.live.broadcast.category.C2959a;
import com.bytedance.android.live.broadcast.category.viewmodel.C2970a;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.android.livesdk.chatroom.p518ui.DoubleColorBallAnimationView;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.widget.LivePagerSlidingTabStrip;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.service.IPerformanceManager;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.scalpel.scenemanager.core.AbstractC13971f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2VQ;
import p003X.C3VF;
import p003X.C4574547f;
import p003X.C77347GeT;
import p003X.C86826KJg;
import p003X.C86916KMs;
import p003X.C86917KMt;
import p003X.C88440Kt0;
import p003X.KON;
import p003X.LK5;
import p003X.View$OnClickListenerC86918KMu;

/* renamed from: com.bytedance.android.live.broadcast.category.ui.h */
/* loaded from: classes5.dex */
public final class C2968h extends C9078n implements AbstractC13971f {
    public static ChangeQuickRedirect LIZ;
    public HashMap LJIIJ;
    public final Lazy LJI = C77347GeT.LIZ(new PreviewCategorySelectFragment$mLiveMode$2(this));
    public final Lazy LJII = C77347GeT.LIZ(new PreviewCategorySelectFragment$mCategoryScene$2(this));
    public final Lazy LJIIIIZZ = C77347GeT.LIZ(new PreviewCategorySelectFragment$mCategoryViewModel$2(this));
    public final Lazy LIZIZ = C77347GeT.LIZ(PreviewCategorySelectFragment$mPreviewWidgetContext$2.INSTANCE);
    public final Lazy LIZJ = C77347GeT.LIZ(new PreviewCategorySelectFragment$mInstalledAppsManager$2(this));
    public Long LIZLLL = 0L;

    /* renamed from: LJ */
    public boolean f25796LJ = true;
    public final Lazy LJIIIZ = C77347GeT.LIZ(new PreviewCategorySelectFragment$mRecentPanelClickListener$2(this));
    public final KON LJFF = new KON(this);

    static {
        Covode.recordClassIndex(15128);
    }

    private final View.OnClickListener LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        return (View.OnClickListener) (proxy.isSupported ? proxy.result : this.LJIIIZ.mo27335getValue());
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO
    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 20);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIIJ == null) {
            this.LJIIJ = new HashMap();
        }
        View view = (View) this.LJIIJ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.LJIIJ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final LiveMode LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (LiveMode) (proxy.isSupported ? proxy.result : this.LJI.mo27335getValue());
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO
    public final void LIZJ() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported && (hashMap = this.LJIIJ) != null) {
            hashMap.clear();
        }
    }

    public final CategoryScene LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (CategoryScene) (proxy.isSupported ? proxy.result : this.LJII.mo27335getValue());
    }

    /* renamed from: LJ */
    public final C2970a m15908LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (C2970a) (proxy.isSupported ? proxy.result : this.LJIIIIZZ.mo27335getValue());
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneFullName() {
        return "com/bytedance/android/live/broadcast/category/ui/PreviewCategorySelectFragment";
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneSimpleName() {
        return "PreviewCategorySelectFragment";
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            return;
        }
        super.onDestroyView();
        LIZJ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Long l;
        Long l2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        super.onResume();
        HashMap hashMap = new HashMap();
        hashMap.put("is_live", "0");
        hashMap.put("scene", "tag");
        hashMap.put("live_type", C2VQ.LIZ(LIZIZ()));
        Long value = m15908LJ().LJIIJJI().getValue();
        if (value != null) {
            hashMap.put("duration", String.valueOf(System.currentTimeMillis() - value.longValue()));
        }
        C4574547f.LIZ().LIZ("livesdk_performance_anchor_bhv_monitor", hashMap, new Object[0]);
        ((IPerformanceManager) ServiceManager.getService(IPerformanceManager.class)).monitorPerformance("tag");
        Long l3 = null;
        if (LIZIZ() == LiveMode.SCREEN_RECORD) {
            HashMap hashMap2 = new HashMap();
            C3VF user = ((IUserService) ServiceManager.getService(IUserService.class)).user();
            if (user != null) {
                l2 = Long.valueOf(user.LIZIZ());
            } else {
                l2 = null;
            }
            hashMap2.put("anchor_id", String.valueOf(l2.longValue()));
            if (Intrinsics.areEqual(m15908LJ().LJIILIIL().getValue(), Boolean.TRUE)) {
                hashMap2.put("request_page", "live_room");
            } else {
                hashMap2.put("request_page", "live_start");
            }
            SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_BROADCAST_SELECT_TAG;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value2 = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            if (value2.booleanValue()) {
                hashMap2.put("live_type", C2VQ.LIZ(LIZIZ()));
            }
            C4574547f.LIZ().LIZ("livesdk_room_content_select_show", hashMap2, new Object[0]);
        } else if (LIZIZ() == LiveMode.VIDEO) {
            HashMap hashMap3 = new HashMap();
            C3VF user2 = ((IUserService) ServiceManager.getService(IUserService.class)).user();
            if (user2 != null) {
                l = Long.valueOf(user2.LIZIZ());
            } else {
                l = null;
            }
            hashMap3.put("anchor_id", String.valueOf(l.longValue()));
            if (Intrinsics.areEqual(m15908LJ().LJIILIIL().getValue(), Boolean.TRUE)) {
                hashMap3.put("request_page", "live_room");
            } else {
                hashMap3.put("request_page", "live_start");
            }
            hashMap3.put("live_type", C2VQ.LIZ(LIZIZ()));
            SettingKey<Boolean> settingKey2 = LiveSettingKeys.LIVE_BROADCAST_SELECT_TAG;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            Boolean value3 = settingKey2.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "");
            if (value3.booleanValue() && !this.f25796LJ) {
                hashMap3.put("request_page", "live_end");
            }
            C4574547f.LIZ().LIZ("livesdk_room_content_select_show", hashMap3, new Object[0]);
        }
        if (!this.f25796LJ) {
            HashMap hashMap4 = new HashMap();
            C3VF user3 = ((IUserService) ServiceManager.getService(IUserService.class)).user();
            if (user3 != null) {
                l3 = Long.valueOf(user3.LIZIZ());
            }
            hashMap4.put("anchor_id", String.valueOf(l3.longValue()));
            hashMap4.put("live_type", "video_live");
            hashMap4.put("request_page", "live_end");
            C4574547f.LIZ().LIZ("livesdk_room_content_select_show", hashMap4, new Object[0]);
        }
    }

    @Override // com.bytedance.android.livesdk.C9078n, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onCreate(bundle);
        this.LJJJJJ = true;
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 18).isSupported) {
            return;
        }
        if (z) {
            UIUtils.setViewVisibility(LIZ(2131180320), 8);
            UIUtils.setViewVisibility(LIZ(2131168884), 0);
        } else {
            UIUtils.setViewVisibility(LIZ(2131180320), 0);
            UIUtils.setViewVisibility(LIZ(2131168884), 8);
        }
        View LIZ2 = LIZ(2131168884);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        LIZ(LIZ2, z);
    }

    private final void LIZ(View view, boolean z) {
        MethodCollector.m14708i(1221);
        if (PatchProxy.proxy(new Object[]{view, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 19).isSupported) {
            MethodCollector.m14707o(1221);
        } else if (view instanceof DoubleColorBallAnimationView) {
            if (z) {
                ((DoubleColorBallAnimationView) view).LIZ();
                MethodCollector.m14707o(1221);
                return;
            }
            ((DoubleColorBallAnimationView) view).LIZIZ();
            MethodCollector.m14707o(1221);
        } else {
            if (view instanceof ImageView) {
                if (z) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), 2130968834));
                    MethodCollector.m14707o(1221);
                    return;
                }
                view.clearAnimation();
            }
            MethodCollector.m14707o(1221);
        }
    }

    public final void LIZ(Long l, List<? extends CategoryNode> list) {
        int i = 0;
        if (PatchProxy.proxy(new Object[]{l, list}, this, LIZ, false, 14).isSupported) {
            return;
        }
        if ((l == null || l.longValue() != 0) && list != null && !list.isEmpty()) {
            for (CategoryNode categoryNode : list) {
                if (Intrinsics.areEqual(categoryNode.categoryId, l)) {
                    ((ViewPager) LIZ(2131169127)).setCurrentItem(i, true);
                    return;
                }
                List<CategoryNode> list2 = categoryNode.subCategories;
                if (list2.size() > 0) {
                    for (CategoryNode categoryNode2 : list2) {
                        if (Intrinsics.areEqual(categoryNode2.categoryId, l)) {
                            ((ViewPager) LIZ(2131169127)).setCurrentItem(i, true);
                            return;
                        }
                    }
                    continue;
                }
                i++;
            }
        }
    }

    @Override // com.bytedance.android.livesdk.C9078n, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<CategoryNode> list;
        List<CategoryNode> value;
        LiveMode LIZIZ;
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        super.onViewCreated(view, bundle);
        LIZ(true);
        ViewPager viewPager = (ViewPager) LIZ(2131169127);
        if (viewPager != null) {
            viewPager.setAdapter(this.LJFF);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported && (LIZIZ = LIZIZ()) != null) {
            String LIZIZ2 = C86826KJg.f8424LJ.LIZIZ(LIZIZ);
            if (!TextUtils.isEmpty(LIZIZ2)) {
                m15908LJ().LIZLLL().postValue(LIZIZ2);
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            if (LIZIZ() != LiveMode.SCREEN_RECORD) {
                SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_BROADCAST_SELECT_TAG;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value2 = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "");
                if (value2.booleanValue()) {
                    LinearLayout linearLayout = (LinearLayout) LIZ(2131180552);
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                    linearLayout.setVisibility(0);
                    TextView textView = (TextView) LIZ(2131189040);
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    textView.setText(LK5.LIZ(2131587777));
                } else {
                    LinearLayout linearLayout2 = (LinearLayout) LIZ(2131180552);
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                    linearLayout2.setVisibility(8);
                }
            }
            ((LinearLayout) LIZ(2131181551)).setOnClickListener(new View$OnClickListenerC86918KMu(this));
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            if (LIZLLL() == CategoryScene.GAME) {
                value = m15908LJ().LJII().getValue();
            } else {
                value = m15908LJ().LJIIJ().getValue();
            }
            List<CategoryNode> list2 = value;
            if (C2959a.LIZLLL.LIZ()) {
                List<CategoryNode> arrayList = new ArrayList<>();
                if (value != null) {
                    for (CategoryNode categoryNode : value) {
                        if (!categoryNode.isOtherCategory) {
                            arrayList.add(categoryNode);
                        }
                    }
                }
                list2 = arrayList;
            }
            if (list2 != null && !list2.isEmpty()) {
                LinearLayout linearLayout3 = (LinearLayout) LIZ(2131181849);
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
                linearLayout3.setVisibility(0);
                CategoryNode categoryNode2 = list2.get(0);
                TextView textView2 = (TextView) LIZ(2131171910);
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setText(categoryNode2.title);
                TextView textView3 = (TextView) LIZ(2131171910);
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                textView3.setTag(categoryNode2);
                ((TextView) LIZ(2131171910)).setOnClickListener(LJFF());
                if (list2.size() > 1) {
                    CategoryNode categoryNode3 = list2.get(1);
                    TextView textView4 = (TextView) LIZ(2131171911);
                    Intrinsics.checkNotNullExpressionValue(textView4, "");
                    textView4.setText(categoryNode3.title);
                    TextView textView5 = (TextView) LIZ(2131171911);
                    Intrinsics.checkNotNullExpressionValue(textView5, "");
                    textView5.setTag(categoryNode3);
                    ((TextView) LIZ(2131171911)).setOnClickListener(LJFF());
                    TextView textView6 = (TextView) LIZ(2131171911);
                    Intrinsics.checkNotNullExpressionValue(textView6, "");
                    textView6.setVisibility(0);
                } else {
                    TextView textView7 = (TextView) LIZ(2131171911);
                    Intrinsics.checkNotNullExpressionValue(textView7, "");
                    textView7.setVisibility(4);
                }
            } else {
                LinearLayout linearLayout4 = (LinearLayout) LIZ(2131181849);
                Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
                linearLayout4.setVisibility(8);
            }
        }
        LivePagerSlidingTabStrip livePagerSlidingTabStrip = (LivePagerSlidingTabStrip) LIZ(2131169123);
        if (livePagerSlidingTabStrip != null) {
            livePagerSlidingTabStrip.setTextSelectedStyle(1);
        }
        LivePagerSlidingTabStrip livePagerSlidingTabStrip2 = (LivePagerSlidingTabStrip) LIZ(2131169123);
        if (livePagerSlidingTabStrip2 != null) {
            livePagerSlidingTabStrip2.LIZ((Typeface) null, 0);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            HashMap<CategoryScene, List<CategoryNode>> value3 = m15908LJ().m15906LJ().getValue();
            if (value3 != null && (list = value3.get(LIZLLL())) != null && (!list.isEmpty())) {
                this.LJFF.LIZIZ.clear();
                this.LJFF.LIZIZ.addAll(list);
                this.LJFF.notifyDataSetChanged();
                LIZ(false);
                SettingKey<Boolean> settingKey2 = LiveSettingKeys.LIVE_BROADCAST_SELECT_TAG;
                Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                Boolean value4 = settingKey2.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "");
                if (value4.booleanValue()) {
                    LIZ(this.LIZLLL, list);
                    this.LIZLLL = 0L;
                }
            } else {
                Context context = getContext();
                if (context != null) {
                    if (!NetworkUtils.isNetworkAvailable((FragmentActivity) context)) {
                        LIZ(false);
                        UIUtils.setViewVisibility(LIZ(2131180320), 8);
                        C88440Kt0.LIZ(2131582268);
                    } else {
                        m15908LJ().LIZJ().postValue(LIZLLL());
                        m15908LJ().m15906LJ().observe(this, new C86916KMs<>(this));
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
            }
        }
        m15908LJ().LJIILL().observe(this, new C86917KMt<>(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(layoutInflater);
        return C116971W2r.LIZ(layoutInflater, 2131698412, viewGroup, false);
    }
}
