package com.bytedance.android.live.liveinteract.multianchor.p374pk.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.gift.IGiftCoreService;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.multianchor.p368f.C4520a;
import com.bytedance.android.live.liveinteract.multianchor.p374pk.C4536j;
import com.bytedance.android.live.liveinteract.multianchor.p374pk.team.PkProgressBar;
import com.bytedance.android.live.liveinteract.multianchor.p374pk.team.TeamStatus;
import com.bytedance.android.live.liveinteract.multianchor.p376ui.C4569d;
import com.bytedance.android.live.liveinteract.multianchor.positions.WindowsPosition;
import com.bytedance.android.live.liveinteract.multianchor.widget.AbstractC4582b;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v;
import com.bytedance.android.live.liveinteract.widget.widget.NoPaddingTextView;
import com.bytedance.android.live.liveinteract.widget.widget.PKProgressBar;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.config.C6936ds;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.model.C9069m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import com.facebook.drawee.view.SimpleDraweeView;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import p003X.AbstractC413402Xu;
import p003X.AbstractC4569445g;
import p003X.AbstractC79382HQy;
import p003X.AbstractC79500HVm;
import p003X.AbstractC81278I1w;
import p003X.AnonymousClass479;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2WC;
import p003X.C383291Fz;
import p003X.C3Q0;
import p003X.C4580049i;
import p003X.C47A;
import p003X.C79374HQq;
import p003X.C79379HQv;
import p003X.C79410HSa;
import p003X.C79488HVa;
import p003X.C79489HVb;
import p003X.C79491HVd;
import p003X.C79506HVs;
import p003X.C81978ISu;
import p003X.HR2;
import p003X.HR3;
import p003X.HR4;
import p003X.HRL;
import p003X.HVQ;
import p003X.HVR;
import p003X.HVS;
import p003X.HVT;
import p003X.HVZ;
import p003X.HW5;
import p003X.IQV;
import p003X.LK1;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.widget.MultiAnchorTeamPkWidget */
/* loaded from: classes3.dex */
public final class MultiAnchorTeamPkWidget extends RoomWidget implements AbstractC79382HQy, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public final AbstractC79500HVm LIZIZ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public Room f26362LJ;
    public boolean LJI;
    public final C79379HQv LJII;
    public C4536j LJIIIIZZ;
    public final C79374HQq LJIIJ;
    public final C383291Fz LJIIIZ = new C383291Fz(new HVQ());
    public final CompositeDisposable LIZJ = new CompositeDisposable();
    public float LJFF = 1.0f;

    static {
        Covode.recordClassIndex(28303);
    }

    @Override // p003X.AbstractC79382HQy
    public final int LIZ(int i, int i2) {
        return i2;
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131700030;
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 17).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LIZ(Integer num) {
        if (PatchProxy.proxy(new Object[]{num}, this, LIZ, false, 3).isSupported) {
            return;
        }
        Iterator<C4569d> it = this.LJII.LJI.iterator();
        while (it.hasNext()) {
            it.next().LIZ(num != null ? num.intValue() : C79506HVs.LIZ());
        }
        if (!this.LJI) {
            return;
        }
        LIZIZ(num);
    }

    @Override // p003X.AbstractC79382HQy
    public final Map<String, WindowsPosition> LIZ(List<String> list) {
        Map<String, WindowsPosition> hashMap;
        C4520a mo15709LJ;
        Map<Long, Long> map;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(list);
        C383291Fz c383291Fz = this.LJIIIZ;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{list}, c383291Fz, C383291Fz.LIZ, false, 1);
        if (proxy2.isSupported) {
            return (Map) proxy2.result;
        }
        C106862S5w.LIZ(list);
        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{list}, c383291Fz, C383291Fz.LIZ, false, 2);
        if (proxy3.isSupported) {
            hashMap = (Map) proxy3.result;
        } else {
            LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII, "");
            String LIZIZ = LJII.LIZIZ();
            if (TextUtils.isEmpty(LIZIZ) && !Lists.isEmpty(list)) {
                LIZIZ = list.get(0);
            }
            hashMap = new HashMap<>();
            AbstractC4782v LIZ2 = AbstractC4782v.LJIIL.LIZ();
            if (LIZ2 == null || (mo15709LJ = LIZ2.mo15709LJ()) == null) {
                hashMap = MapsKt__MapsKt.emptyMap();
            } else {
                C13491f LIZ3 = IQV.LIZ(HW5.LIZ());
                if (!(LIZ3 instanceof C4536j)) {
                    LIZ3 = null;
                }
                C4536j c4536j = (C4536j) LIZ3;
                if (c4536j == null || (map = c4536j.LJIIJ) == null) {
                    hashMap = MapsKt__MapsKt.emptyMap();
                } else {
                    Pair<List<String>, List<String>> LIZ4 = c383291Fz.LIZ(list, map, mo15709LJ);
                    List<String> component1 = LIZ4.component1();
                    List<String> component2 = LIZ4.component2();
                    if (!component2.contains(LIZIZ)) {
                        component1 = component2;
                        component2 = component1;
                    }
                    if (!component2.contains(LIZIZ)) {
                        hashMap = MapsKt__MapsKt.emptyMap();
                    } else {
                        Intrinsics.checkNotNullExpressionValue(LIZIZ, "");
                        c383291Fz.LIZ(component2, LIZIZ);
                        int size = list.size();
                        if (size == 1) {
                            hashMap.put(list.get(0), WindowsPosition.SINGLE);
                        } else if (size == 2) {
                            for (String str : list) {
                                hashMap.put(str, Intrinsics.areEqual(str, LIZIZ) ? WindowsPosition.TWO_LEFT : WindowsPosition.TWO_RIGHT);
                            }
                        } else if (size == 3) {
                            if (component2.size() == 1 && component1.size() == 2) {
                                hashMap.put(component2.get(0), WindowsPosition.THREE_LEFT);
                                hashMap.put(component1.get(0), WindowsPosition.THREE_RIGHT_TOP);
                                hashMap.put(component1.get(1), WindowsPosition.THREE_RIGHT_BOTTOM);
                            }
                            if (component2.size() == 2 && component1.size() == 1) {
                                hashMap.put(component2.get(0), WindowsPosition.THREE_LEFT);
                                hashMap.put(component2.get(1), WindowsPosition.THREE_RIGHT_BOTTOM);
                                hashMap.put(component1.get(0), WindowsPosition.THREE_RIGHT_TOP);
                            }
                        } else if (size == 4) {
                            if (component2.size() == 1 && component1.size() == 3) {
                                hashMap.put(component2.get(0), WindowsPosition.FOUR_LEFT_TOP);
                                hashMap.put(component1.get(0), WindowsPosition.FOUR_RIGHT_TOP);
                                hashMap.put(component1.get(1), WindowsPosition.FOUR_RIGHT_BOTTOM);
                                hashMap.put(component1.get(2), WindowsPosition.FOUR_LEFT_BOTTOM);
                            }
                            if (component2.size() == 2 && component1.size() == 2) {
                                hashMap.put(component2.get(0), WindowsPosition.FOUR_LEFT_TOP);
                                hashMap.put(component2.get(1), WindowsPosition.FOUR_LEFT_BOTTOM);
                                hashMap.put(component1.get(0), WindowsPosition.FOUR_RIGHT_TOP);
                                hashMap.put(component1.get(1), WindowsPosition.FOUR_RIGHT_BOTTOM);
                            }
                            if (component2.size() == 3 && component1.size() == 1) {
                                hashMap.put(component2.get(0), WindowsPosition.FOUR_LEFT_TOP);
                                hashMap.put(component2.get(1), WindowsPosition.FOUR_LEFT_BOTTOM);
                                hashMap.put(component2.get(2), WindowsPosition.FOUR_RIGHT_BOTTOM);
                                hashMap.put(component1.get(0), WindowsPosition.FOUR_RIGHT_TOP);
                            }
                        }
                    }
                }
            }
        }
        if (hashMap.size() == list.size()) {
            return hashMap;
        }
        return null;
    }

    @Override // p003X.AbstractC79382HQy
    public final void LIZ(HR4 hr4) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        boolean z = false;
        if (PatchProxy.proxy(new Object[]{hr4}, this, LIZ, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(hr4);
        if (hr4.LIZJ != 1) {
            return;
        }
        boolean z2 = !AnonymousClass479.LIZJ();
        if (LIZIZ() && !z2) {
            z = true;
        }
        ViewGroup viewGroup = this.containerView;
        ViewGroup.LayoutParams layoutParams = (viewGroup == null || (frameLayout2 = (FrameLayout) viewGroup.findViewById(2131185178)) == null) ? null : frameLayout2.getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 == null) {
            return;
        }
        if (z) {
            layoutParams2.height = hr4.LIZLLL - hr4.f6806LJ;
            layoutParams2.topMargin = hr4.f6806LJ;
        } else {
            int LIZLLL = LK5.LIZLLL(2131429315);
            layoutParams2.height = (hr4.LIZLLL - hr4.f6806LJ) - LIZLLL;
            layoutParams2.topMargin = hr4.f6806LJ + LIZLLL;
        }
        ViewGroup viewGroup2 = this.containerView;
        if (viewGroup2 != null && (frameLayout = (FrameLayout) viewGroup2.findViewById(2131185178)) != null) {
            frameLayout.setLayoutParams(layoutParams2);
        }
        if (this.LJI) {
            return;
        }
        LIZIZ(this.LJIIIIZZ.LJI.getValue());
        this.LJI = true;
    }

    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!C47A.LIZIZ() || !C47A.LIZJ() || this.LIZLLL) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onDestroy();
        this.LIZJ.dispose();
        this.LJII.LJI();
        AbstractC4582b LIZ2 = AbstractC4582b.LIZ.LIZ();
        if (LIZ2 != null) {
            LIZ2.LIZ(null);
        }
    }

    private void LIZJ() {
        HSImageView hSImageView;
        C6936ds c6936ds;
        String str;
        HSImageView hSImageView2;
        HSImageView hSImageView3;
        HSImageView hSImageView4;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        ViewGroup viewGroup = this.containerView;
        HSImageView hSImageView5 = null;
        String str2 = null;
        if (viewGroup != null) {
            hSImageView = (HSImageView) viewGroup.findViewById(2131185180);
        } else {
            hSImageView = null;
        }
        UIUtils.updateLayout(hSImageView, (int) (LK1.LIZLLL(98) * this.LJFF), (int) (LK1.LIZLLL(80) * this.LJFF));
        ViewGroup viewGroup2 = this.containerView;
        if (viewGroup2 != null && (hSImageView4 = (HSImageView) viewGroup2.findViewById(2131185180)) != null) {
            hSImageView4.setVisibility(0);
        }
        C4536j m23737LJ = C4536j.LJJIJIIJI.m23737LJ();
        if (m23737LJ != null) {
            long j = m23737LJ.LJIILL;
            if (j != 0) {
                SettingKey<Map<Long, C6936ds>> settingKey = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Map<Long, C6936ds> value = settingKey.getValue();
                if (value != null && (c6936ds = value.get(Long.valueOf(j))) != null && (str = c6936ds.LJIIZILJ) != null && str != null && str.length() != 0) {
                    ViewGroup viewGroup3 = this.containerView;
                    if (viewGroup3 != null) {
                        hSImageView2 = (HSImageView) viewGroup3.findViewById(2131185180);
                    } else {
                        hSImageView2 = null;
                    }
                    UIUtils.updateLayout(hSImageView2, (int) (LK1.LIZLLL(100) * this.LJFF), (int) (LK1.LIZLLL(100) * this.LJFF));
                    ViewGroup viewGroup4 = this.containerView;
                    if (viewGroup4 != null) {
                        hSImageView3 = (HSImageView) viewGroup4.findViewById(2131185180);
                    } else {
                        hSImageView3 = null;
                    }
                    SettingKey<Map<Long, C6936ds>> settingKey2 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                    Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                    C6936ds c6936ds2 = settingKey2.getValue().get(Long.valueOf(j));
                    if (c6936ds2 != null) {
                        str2 = c6936ds2.LJIIZILJ;
                    }
                    C81978ISu.LIZ(hSImageView3, str2);
                    ((AbstractC81278I1w) Observable.timer(2000L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).m151as(autoDispose())).LIZ(new HVZ(this));
                }
            }
        }
        ViewGroup viewGroup5 = this.containerView;
        if (viewGroup5 != null) {
            hSImageView5 = (HSImageView) viewGroup5.findViewById(2131185180);
        }
        C81978ISu.LIZ(hSImageView5, "https://lf1-webcastcdn-tos.douyinstatic.com/obj/live-android/DY_pk_start.webp");
        ((AbstractC81278I1w) Observable.timer(2000L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).m151as(autoDispose())).LIZ(new HVZ(this));
    }

    @Override // p003X.AbstractC79382HQy
    public final HRL LIZ() {
        ViewGroup.LayoutParams layoutParams;
        FrameLayout frameLayout;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        if (proxy.isSupported) {
            return (HRL) proxy.result;
        }
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null && (frameLayout = (FrameLayout) viewGroup.findViewById(2131185178)) != null) {
            layoutParams = frameLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 == null) {
            return null;
        }
        return new HRL(layoutParams2, 90, this.LJFF);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        float f;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        boolean z = false;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJIILJJIL = LJJJI.LJIILJJIL()) != null && LJIILJJIL.LIZIZ().booleanValue()) {
            z = true;
        }
        this.LIZLLL = z;
        this.f26362LJ = (Room) this.dataCenter.get("data_room", (String) new Room());
        if (LIZIZ()) {
            f = 2.0f;
        } else {
            f = 1.0f;
        }
        this.LJFF = f;
        this.LJIIIIZZ.LJII.observe(this, new HVR(this), true);
        C79374HQq c79374HQq = this.LJIIJ;
        if (c79374HQq != null) {
            c79374HQq.LIZ(this);
        }
        this.LJII.LIZ(this);
        AbstractC4582b LIZ2 = AbstractC4582b.LIZ.LIZ();
        if (LIZ2 != null) {
            LIZ2.LIZ(this);
        }
        this.LJIIIIZZ.LJI.observe(this, new C79489HVb(this), true);
        if (C4580049i.LIZIZ && C4580049i.LIZJ && !this.LIZLLL && C4580049i.LIZIZ()) {
            View view = this.contentView;
            View view2 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            UIUtils.updateLayoutMargin(view, -3, -C4580049i.LIZ(view2.getContext()), -3, -3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r3.length() > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0135, code lost:
        if (r3.length() > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016c, code lost:
        if (r3.length() > 0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void LIZLLL() {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multianchor.p374pk.widget.MultiAnchorTeamPkWidget.LIZLLL():void");
    }

    @Override // p003X.AbstractC79382HQy
    public final HR3 LIZ(boolean z) {
        boolean z2 = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (HR3) proxy.result;
        }
        if (!LIZIZ() || z) {
            z2 = false;
        }
        return new HR3(z2, LK5.LIZ(57.0f), null);
    }

    private final void LIZIZ(Integer num) {
        Long l;
        C2WC<Room> LIZ2;
        Room LIZ3;
        int i = 0;
        if (PatchProxy.proxy(new Object[]{num}, this, LIZ, false, 4).isSupported) {
            return;
        }
        int LIZIZ = C79506HVs.LIZIZ();
        if (num != null && num.intValue() == LIZIZ) {
            LIZJ();
        }
        HashMap<Long, Integer> hashMap = this.LJIIIIZZ.LJIIZILJ;
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LIZ2 = LJJJI.LIZ()) != null && (LIZ3 = LIZ2.LIZ()) != null) {
            l = Long.valueOf(LIZ3.ownerUserId);
        } else {
            l = null;
        }
        Integer num2 = hashMap.get(l);
        int LIZJ = C79506HVs.LIZJ();
        if (num != null && num.intValue() == LIZJ) {
            if (num2 != null) {
                i = num2.intValue();
            }
            if (!C79410HSa.LIZ(i)) {
                LIZLLL();
            }
        }
    }

    @Override // p003X.AbstractC79382HQy
    public final View LIZ(Context context) {
        MethodCollector.m14708i(1932);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            View view = (View) proxy.result;
            MethodCollector.m14707o(1932);
            return view;
        }
        C106862S5w.LIZ(context);
        if (this.LIZIZ.LIZ()) {
            MethodCollector.m14707o(1932);
            return null;
        }
        C79491HVd c79491HVd = new C79491HVd(this, context, null, 2);
        boolean z = this.LIZLLL;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, c79491HVd, PkProgressBar.LIZ, false, 3).isSupported) {
            c79491HVd.LIZLLL = z;
            LayoutInflater.from(c79491HVd.getContext()).inflate(2131699872, c79491HVd);
            NoPaddingTextView noPaddingTextView = (NoPaddingTextView) c79491HVd.LIZ(2131180729);
            if (noPaddingTextView != null) {
                C3Q0.LJI(noPaddingTextView, LK5.LIZ(0.5f));
            }
            NoPaddingTextView noPaddingTextView2 = (NoPaddingTextView) c79491HVd.LIZ(2131165275);
            if (noPaddingTextView2 != null) {
                C3Q0.LJI(noPaddingTextView2, LK5.LIZ(0.5f));
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) c79491HVd.LIZ(2131195232);
            if (appCompatTextView != null) {
                appCompatTextView.setTextSize(2, 14.0f);
            }
            c79491HVd.f26360LJ = c79491HVd.LJIIJJI;
            ((PKProgressBar) c79491HVd.LIZ(2131185194)).setIsAnchor(z);
            PKProgressBar pKProgressBar = (PKProgressBar) c79491HVd.LIZ(2131185194);
            if (pKProgressBar != null) {
                pKProgressBar.setOnProgressChangeListner(c79491HVd);
            }
            PKProgressBar pKProgressBar2 = (PKProgressBar) c79491HVd.LIZ(2131185194);
            if (pKProgressBar2 != null) {
                pKProgressBar2.setIsPortrait(c79491HVd.LJIIIZ);
            }
            PKProgressBar pKProgressBar3 = (PKProgressBar) c79491HVd.LIZ(2131185194);
            if (pKProgressBar3 != null) {
                pKProgressBar3.LIZ(LK5.LIZIZ(2131629097), LK5.LIZIZ(2131629097), LK5.LIZIZ(2131629098), LK5.LIZIZ(2131629098));
            }
            HSImageView hSImageView = (HSImageView) c79491HVd.LIZ(2131183085);
            if (hSImageView != null) {
                hSImageView.setVisibility(0);
            }
            SettingKey<C9069m> settingKey = LiveSettingKeys.LIVE_PK_SIMPLE_ATMOSPHERE_ANIMATION_URLS;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            C81978ISu.LIZ((SimpleDraweeView) c79491HVd.LIZ(2131183085), settingKey.getValue().LIZ);
            Context context2 = c79491HVd.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            c79491HVd.LIZIZ = Typeface.createFromAsset(context2.getAssets(), "fonts/clarity_mono_bold.otf");
            NoPaddingTextView noPaddingTextView3 = (NoPaddingTextView) c79491HVd.LIZ(2131180729);
            if (noPaddingTextView3 != null) {
                noPaddingTextView3.setTypeface(c79491HVd.LIZIZ);
            }
            NoPaddingTextView noPaddingTextView4 = (NoPaddingTextView) c79491HVd.LIZ(2131165275);
            if (noPaddingTextView4 != null) {
                noPaddingTextView4.setTypeface(c79491HVd.LIZIZ);
            }
            NoPaddingTextView noPaddingTextView5 = (NoPaddingTextView) c79491HVd.LIZ(2131195232);
            if (noPaddingTextView5 != null) {
                noPaddingTextView5.setTypeface(c79491HVd.LIZIZ);
            }
            NoPaddingTextView noPaddingTextView6 = (NoPaddingTextView) c79491HVd.LIZ(2131195232);
            if (noPaddingTextView6 != null) {
                noPaddingTextView6.setVisibility(8);
            }
            ((IGiftCoreService) ServiceManager.getService(IGiftCoreService.class)).addGiftSendResultListener(c79491HVd);
        }
        c79491HVd.LIZ(this.LJIIIIZZ.LJI.getValue(), this.LJIIIIZZ.LJII.getValue());
        c79491HVd.setLayerType(1, null);
        MethodCollector.m14707o(1932);
        return c79491HVd;
    }

    public final TeamStatus LIZ(Long l) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{l}, this, LIZ, false, 14);
        if (proxy.isSupported) {
            return (TeamStatus) proxy.result;
        }
        Room room = this.f26362LJ;
        if (room != null) {
            long j = room.ownerUserId;
            if (l != null) {
                long longValue = l.longValue();
                Map<Long, Long> map = this.LJIIIIZZ.LJIIJ;
                if (map == null) {
                    return null;
                }
                Long l2 = map.get(Long.valueOf(j));
                Long l3 = map.get(Long.valueOf(longValue));
                if (l2 != null && l2.longValue() != 0 && l3 != null && l3.longValue() != 0) {
                    if (Intrinsics.areEqual(l3, l2)) {
                        return TeamStatus.LEFT;
                    }
                    return TeamStatus.RIGHT;
                }
            }
        }
        return null;
    }

    public MultiAnchorTeamPkWidget(C79379HQv c79379HQv, C79374HQq c79374HQq, C4536j c4536j) {
        C106862S5w.LIZ(c79379HQv, c4536j);
        this.LJII = c79379HQv;
        this.LJIIJ = c79374HQq;
        this.LJIIIIZZ = c4536j;
        this.LIZIZ = new C79488HVa(this.LJIIIIZZ);
    }

    @Override // p003X.AbstractC79382HQy
    public final HR2 LIZ(boolean z, int i, int i2) {
        boolean z2;
        int i3;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (HR2) proxy.result;
        }
        if (LIZIZ() && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        int LIZLLL = LK5.LIZLLL(2131429315);
        int LIZ2 = LK5.LIZ(30.0f);
        if (z2) {
            i3 = RangesKt___RangesKt.coerceAtLeast(i2 - LK5.LIZ(500.0f), LK5.LIZ(120.0f));
        } else {
            i3 = -1;
        }
        return new HR2(i3, LIZ2, z2, LIZ2, LIZLLL, LK5.LIZ(41.0f));
    }

    @Override // p003X.AbstractC79382HQy
    public final View LIZ(Context context, String str, AnchorLinkUser anchorLinkUser) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str, anchorLinkUser}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(context);
        if (this.LIZIZ.LIZIZ()) {
            return null;
        }
        HVT hvt = new HVT(this, context);
        if (!PatchProxy.proxy(new Object[0], hvt, HVS.LIZ, false, 1).isSupported) {
            C116971W2r.LIZ(LayoutInflater.from(hvt.getContext()), hvt.getLayoutId(), (ViewGroup) hvt, true);
            TextView textView = (TextView) hvt.LIZ(2131188767);
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setText("0");
            TextView textView2 = (TextView) hvt.LIZ(2131188767);
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setMaxWidth(LK5.LIZ(70.0f));
        }
        hvt.setInteractId(str);
        return hvt;
    }
}
