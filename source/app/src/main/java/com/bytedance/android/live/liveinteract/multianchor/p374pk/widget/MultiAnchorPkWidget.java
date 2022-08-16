package com.bytedance.android.live.liveinteract.multianchor.p374pk.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.multianchor.p374pk.C4536j;
import com.bytedance.android.live.liveinteract.multianchor.p376ui.C4569d;
import com.bytedance.android.live.liveinteract.multianchor.positions.WindowsPosition;
import com.bytedance.android.live.liveinteract.multianchor.widget.AbstractC4582b;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.config.C6936ds;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413402Xu;
import p003X.AbstractC4569445g;
import p003X.AbstractC79382HQy;
import p003X.AbstractC79500HVm;
import p003X.AbstractC81278I1w;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C4580049i;
import p003X.C47A;
import p003X.C79374HQq;
import p003X.C79379HQv;
import p003X.C79410HSa;
import p003X.C79493HVf;
import p003X.C79497HVj;
import p003X.C79506HVs;
import p003X.C79550HXk;
import p003X.C79559HXt;
import p003X.C81978ISu;
import p003X.HR2;
import p003X.HR3;
import p003X.HR4;
import p003X.HRL;
import p003X.HVN;
import p003X.HVO;
import p003X.HWW;
import p003X.LK1;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.widget.MultiAnchorPkWidget */
/* loaded from: classes3.dex */
public final class MultiAnchorPkWidget extends RoomWidget implements AbstractC79382HQy, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final C79559HXt LJIIIZ = new C79559HXt((byte) 0);
    public final AbstractC79500HVm LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public Room f26361LJ;
    public boolean LJI;
    public final C79379HQv LJII;
    public C4536j LJIIIIZZ;
    public final C79374HQq LJIIJ;
    public final CompositeDisposable LIZIZ = new CompositeDisposable();
    public float LJFF = 1.0f;

    static {
        Covode.recordClassIndex(28289);
    }

    @Override // p003X.AbstractC79382HQy
    public final int LIZ(int i, int i2) {
        return i;
    }

    @Override // p003X.AbstractC79382HQy
    public final HR2 LIZ(boolean z, int i, int i2) {
        return null;
    }

    @Override // p003X.AbstractC79382HQy
    public final View LIZ(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(context);
        return null;
    }

    @Override // p003X.AbstractC79382HQy
    public final Map<String, WindowsPosition> LIZ(List<String> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 12);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(list);
        return null;
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131700030;
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 15).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LIZ(Long l) {
        if (!PatchProxy.proxy(new Object[]{l}, this, LIZ, false, 2).isSupported && l != null) {
            HWW hww = this.LJII.LJIJI;
            if (hww != null) {
                hww.LIZ(l.longValue());
            }
            if (!this.LIZJ.LIZ(l.longValue(), this.LJIIIIZZ.LIZJ())) {
                return;
            }
            this.LJII.LIZIZ(this);
        }
    }

    private final boolean LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!C47A.LIZIZ() || this.LIZLLL) {
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
        this.LIZIZ.dispose();
        this.LJII.LJI();
        AbstractC4582b LIZ2 = AbstractC4582b.LIZ.LIZ();
        if (LIZ2 != null) {
            LIZ2.LIZ(null);
        }
    }

    @Override // p003X.AbstractC79382HQy
    public final HRL LIZ() {
        ViewGroup.LayoutParams layoutParams;
        FrameLayout frameLayout;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 14);
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

    private void LIZIZ() {
        HSImageView hSImageView;
        String str;
        HSImageView hSImageView2;
        HSImageView hSImageView3;
        C6936ds c6936ds;
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
        UIUtils.updateLayout(hSImageView, (int) (LK1.LIZLLL(90) * this.LJFF), (int) (LK1.LIZLLL(90) * this.LJFF));
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
                if (value != null && (c6936ds = value.get(Long.valueOf(j))) != null) {
                    str = c6936ds.LJIIZILJ;
                } else {
                    str = null;
                }
                if (str != null && str.length() != 0) {
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
                    ((AbstractC81278I1w) Observable.timer(2000L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).m151as(autoDispose())).LIZ(new HVN(this));
                }
            }
        }
        ViewGroup viewGroup5 = this.containerView;
        if (viewGroup5 != null) {
            hSImageView5 = (HSImageView) viewGroup5.findViewById(2131185180);
        }
        C81978ISu.LIZ(hSImageView5, "https://lf1-webcastcdn-tos.douyinstatic.com/obj/live-android/DY_pk_start.webp");
        ((AbstractC81278I1w) Observable.timer(2000L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).m151as(autoDispose())).LIZ(new HVN(this));
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
        this.f26361LJ = (Room) this.dataCenter.get("data_room", (String) new Room());
        if (LIZLLL()) {
            f = 2.0f;
        } else {
            f = 1.0f;
        }
        this.LJFF = f;
        LIZ(this.LJIIIIZZ.LJII.getValue());
        this.LJIIIIZZ.LJII.observe(this, new HVO(this));
        C79374HQq c79374HQq = this.LJIIJ;
        if (c79374HQq != null) {
            c79374HQq.LIZ(this);
        }
        this.LJII.LIZ(this);
        AbstractC4582b LIZ2 = AbstractC4582b.LIZ.LIZ();
        if (LIZ2 != null) {
            LIZ2.LIZ(this);
        }
        this.LJIIIIZZ.LJI.observe(this, new C79493HVf(this), true);
        if (C4580049i.LIZIZ && C4580049i.LIZJ && !this.LIZLLL && C4580049i.LIZIZ()) {
            View view = this.contentView;
            View view2 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            UIUtils.updateLayoutMargin(view, -3, -C4580049i.LIZ(view2.getContext()), -3, -3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
        if (r1.length() > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0105, code lost:
        if (r1.length() > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012e, code lost:
        if (r1.length() > 0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void LIZJ() {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multianchor.p374pk.widget.MultiAnchorPkWidget.LIZJ():void");
    }

    @Override // p003X.AbstractC79382HQy
    public final HR3 LIZ(boolean z) {
        int LIZ2;
        Integer num;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (HR3) proxy.result;
        }
        boolean LIZLLL = LIZLLL();
        if (z) {
            LIZ2 = LK5.LIZ(16.0f);
        } else {
            LIZ2 = LK5.LIZ(8.0f);
        }
        if (LIZLLL) {
            num = 2130854920;
        } else {
            num = null;
        }
        return new HR3(LIZLLL, LIZ2, num);
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
            LIZIZ();
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
                LIZJ();
            }
        }
    }

    @Override // p003X.AbstractC79382HQy
    public final void LIZ(HR4 hr4) {
        ViewGroup.LayoutParams layoutParams;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        if (PatchProxy.proxy(new Object[]{hr4}, this, LIZ, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(hr4);
        if (hr4.LIZJ == 1) {
            ViewGroup viewGroup = this.containerView;
            if (viewGroup != null && (frameLayout2 = (FrameLayout) viewGroup.findViewById(2131185178)) != null) {
                layoutParams = frameLayout2.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                layoutParams = null;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.height = hr4.LIZLLL - hr4.f6806LJ;
                layoutParams2.topMargin = hr4.f6806LJ;
                ViewGroup viewGroup2 = this.containerView;
                if (viewGroup2 != null && (frameLayout = (FrameLayout) viewGroup2.findViewById(2131185178)) != null) {
                    frameLayout.setLayoutParams(layoutParams2);
                }
                if (!this.LJI) {
                    LIZIZ(this.LJIIIIZZ.LJI.getValue());
                    this.LJI = true;
                }
            }
        }
    }

    public final void LIZ(Integer num) {
        int LIZ2;
        C2WC<Boolean> LLJILJIL;
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{num}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LLJILJIL = LJJJI.LLJILJIL()) != null) {
            if (num == null || num.intValue() == C79506HVs.LIZ()) {
                z = false;
            }
            LLJILJIL.LIZ(Boolean.valueOf(z));
        }
        Iterator<C4569d> it = this.LJII.LJI.iterator();
        while (it.hasNext()) {
            C4569d next = it.next();
            if (num != null) {
                LIZ2 = num.intValue();
            } else {
                LIZ2 = C79506HVs.LIZ();
            }
            next.LIZ(LIZ2);
        }
        if (this.LJI) {
            LIZIZ(num);
        }
    }

    public MultiAnchorPkWidget(C79379HQv c79379HQv, C79374HQq c79374HQq, C4536j c4536j) {
        C106862S5w.LIZ(c79379HQv, c4536j);
        this.LJII = c79379HQv;
        this.LJIIJ = c79374HQq;
        this.LJIIIIZZ = c4536j;
        this.LIZJ = new C79497HVj(this.LJIIIIZZ);
    }

    @Override // p003X.AbstractC79382HQy
    public final View LIZ(Context context, String str, AnchorLinkUser anchorLinkUser) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str, anchorLinkUser}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(context);
        if (this.LIZJ.LIZIZ()) {
            return null;
        }
        C79550HXk c79550HXk = new C79550HXk(this, context);
        c79550HXk.setInteractId(str);
        c79550HXk.setVisibility(8);
        return c79550HXk;
    }
}
