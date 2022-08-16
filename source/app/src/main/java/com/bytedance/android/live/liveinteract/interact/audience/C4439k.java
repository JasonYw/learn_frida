package com.bytedance.android.live.liveinteract.interact.audience;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.o$a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.o$b;
import com.bytedance.android.live.liveinteract.interact.audience.seat.PkSeatAnimationView;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.p518ui.DynamicEmojiView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.H62;
import p003X.HJN;
import p003X.HJO;
import p003X.HJP;
import p003X.HJR;
import p003X.HJS;
import p003X.LK1;

/* renamed from: com.bytedance.android.live.liveinteract.interact.audience.k */
/* loaded from: classes3.dex */
public final class C4439k extends FrameLayout implements o$b {
    public static ChangeQuickRedirect LIZ;
    public View LIZIZ;
    public View LIZJ;
    public final DataCenter LIZLLL;

    /* renamed from: LJ */
    public boolean f26322LJ;
    public boolean LJFF;
    public boolean LJI;
    public final o$a LJII;
    public View LJIIIIZZ;
    public TextView LJIIIZ;
    public View LJIIJ;
    public PkSeatAnimationView LJIIJJI;
    public Disposable LJIIL;
    public DialogFragment LJIILIIL;
    public boolean LJIILJJIL;
    public final HJN LJIILL;

    /* renamed from: com.bytedance.android.live.liveinteract.interact.audience.k$a */
    /* loaded from: classes22.dex */
    public interface AbstractC4440a {
        static {
            Covode.recordClassIndex(27383);
        }
    }

    static {
        Covode.recordClassIndex(27382);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.o$b
    public final void LIZ(long j, long j2) {
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.o$b
    public final void LIZ(String str) {
    }

    public final boolean getMIsBackGround() {
        return this.LJIILJJIL;
    }

    public final o$a getPresenter() {
        return this.LJII;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Dialog dialog;
        DialogFragment dialogFragment;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        o$a o_a = this.LJII;
        if (o_a != null) {
            o_a.LIZ();
        }
        Disposable disposable = this.LJIIL;
        if (disposable != null) {
            disposable.dispose();
        }
        this.LJIIL = null;
        DialogFragment dialogFragment2 = this.LJIILIIL;
        if (dialogFragment2 != null && (dialog = dialogFragment2.getDialog()) != null && dialog.isShowing() && (dialogFragment = this.LJIILIIL) != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        this.LJIILIIL = null;
        super.onDetachedFromWindow();
    }

    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return ((IUserService) ServiceManager.getService(IUserService.class)).user().LJI();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z;
        long j;
        LinkPlayerInfo mo15759LJ;
        User LIZ2;
        DynamicEmojiView dynamicEmojiView;
        Boolean bool;
        MethodCollector.m14708i(1863);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1863);
            return;
        }
        super.onAttachedToWindow();
        View.inflate(getContext(), 2131700086, this);
        setOnClickListener(new H62(this));
        DataCenter dataCenter = this.LIZLLL;
        if (dataCenter != null && (bool = (Boolean) dataCenter.get("data_is_anchor", (String) Boolean.FALSE)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.f26322LJ = z;
        this.LJIIIIZZ = findViewById(2131184443);
        this.LJIIIZ = (TextView) findViewById(2131184511);
        this.LIZJ = findViewById(2131179252);
        this.LJIIJ = findViewById(2131167920);
        this.LJIIJJI = (PkSeatAnimationView) findViewById(2131189091);
        PkSeatAnimationView pkSeatAnimationView = this.LJIIJJI;
        if (pkSeatAnimationView != null && !PatchProxy.proxy(new Object[]{4, (byte) 0}, pkSeatAnimationView, PkSeatAnimationView.LIZ, false, 1).isSupported) {
            pkSeatAnimationView.LIZJ = FrameLayout.inflate(pkSeatAnimationView.getContext(), 2131700311, pkSeatAnimationView);
            View view = pkSeatAnimationView.LIZJ;
            HSImageView hSImageView = null;
            if (view != null) {
                dynamicEmojiView = (DynamicEmojiView) view.findViewById(2131173139);
            } else {
                dynamicEmojiView = null;
            }
            pkSeatAnimationView.LIZLLL = dynamicEmojiView;
            View view2 = pkSeatAnimationView.LIZJ;
            if (view2 != null) {
                hSImageView = (HSImageView) view2.findViewById(2131173861);
            }
            pkSeatAnimationView.f26325LJ = hSImageView;
            pkSeatAnimationView.LIZIZ = new HJO();
            HJO hjo = pkSeatAnimationView.LIZIZ;
            if (hjo != null) {
                DynamicEmojiView dynamicEmojiView2 = pkSeatAnimationView.LIZLLL;
                HSImageView hSImageView2 = pkSeatAnimationView.f26325LJ;
                if (!PatchProxy.proxy(new Object[]{4, dynamicEmojiView2, hSImageView2}, hjo, HJO.LIZ, false, 1).isSupported) {
                    HJS hjs = new HJS(hjo, dynamicEmojiView2, hSImageView2);
                    HJP hjp = hjo.LIZJ;
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{hjs}, hjp, HJP.LIZ, false, 2);
                    if (proxy.isSupported) {
                        Object obj = proxy.result;
                    } else {
                        C106862S5w.LIZ(hjs);
                        if (hjp.LIZIZ == null) {
                            hjp.LIZIZ = hjs;
                        } else {
                            HJR hjr = hjp.LIZJ;
                            if (hjr != null) {
                                hjr.LIZ(hjs);
                            }
                        }
                        hjp.LIZJ = hjs;
                    }
                }
            }
            if (!PatchProxy.proxy(new Object[0], pkSeatAnimationView, PkSeatAnimationView.LIZ, false, 3).isSupported) {
                if (pkSeatAnimationView.LJFF != 0 && pkSeatAnimationView.LJI != 0) {
                    pkSeatAnimationView.LIZ(pkSeatAnimationView.LIZLLL, pkSeatAnimationView.LJFF, pkSeatAnimationView.LJI);
                }
                if (pkSeatAnimationView.LJII != 0 && pkSeatAnimationView.LJIIIIZZ != 0) {
                    pkSeatAnimationView.LIZ(pkSeatAnimationView.f26325LJ, pkSeatAnimationView.LJII, pkSeatAnimationView.LJIIIIZZ);
                }
            }
        }
        o$a o_a = this.LJII;
        if (o_a != null) {
            o_a.LIZ((o$a) this);
        }
        LIZ(true);
        PkSeatAnimationView pkSeatAnimationView2 = this.LJIIJJI;
        if (pkSeatAnimationView2 != null) {
            HJN hjn = this.LJIILL;
            if (hjn != null) {
                o$a o_a2 = this.LJII;
                if (o_a2 != null && (mo15759LJ = o_a2.mo15759LJ()) != null && (LIZ2 = mo15759LJ.LIZ()) != null) {
                    j = LIZ2.getId();
                } else {
                    j = 0;
                }
                if (!PatchProxy.proxy(new Object[]{new Long(j), pkSeatAnimationView2}, hjn, HJN.LIZ, false, 1).isSupported) {
                    C106862S5w.LIZ(pkSeatAnimationView2);
                    hjn.LIZIZ.put(Long.valueOf(j), pkSeatAnimationView2);
                }
            } else {
                MethodCollector.m14707o(1863);
                return;
            }
        }
        MethodCollector.m14707o(1863);
    }

    public final void setIsBackGround(boolean z) {
        this.LJIILJJIL = z;
    }

    public final void setIsSelfRoomWindow(boolean z) {
        this.LJFF = z;
    }

    public final void setMIsBackGround(boolean z) {
        this.LJIILJJIL = z;
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.o$b
    public final void setVisibility(boolean z) {
        int i = 0;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 9).isSupported) {
            return;
        }
        if (!z) {
            i = 4;
        }
        setVisibility(i);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.o$b
    public final void LIZ(boolean z) {
        LinkPlayerInfo linkPlayerInfo;
        int i = 0;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6).isSupported) {
            return;
        }
        o$a o_a = this.LJII;
        if (o_a != null) {
            linkPlayerInfo = o_a.mo15759LJ();
        } else {
            linkPlayerInfo = null;
        }
        boolean LIZJ = LIZJ(linkPlayerInfo);
        View view = this.LJIIIIZZ;
        if (view != null) {
            if (z || LIZJ) {
                i = 4;
            }
            view.setVisibility(i);
        }
    }

    public final boolean LIZJ(LinkPlayerInfo linkPlayerInfo) {
        User LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{linkPlayerInfo}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (linkPlayerInfo != null && (LIZ2 = linkPlayerInfo.LIZ()) != null && LIZ2.getId() == ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ()) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(LinkPlayerInfo linkPlayerInfo) {
        if (PatchProxy.proxy(new Object[]{linkPlayerInfo}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkPlayerInfo);
        User LIZ2 = linkPlayerInfo.LIZ();
        if (LIZ2 != null) {
            UserProfileEvent userProfileEvent = new UserProfileEvent(LIZ2.getId());
            userProfileEvent.setClickUserPosition("pk_linked_audience");
            userProfileEvent.interactLogLabel = "right_anchor";
            userProfileEvent.setReportSource("anchor_linkmic");
            userProfileEvent.setReportType("data_card_linked_audience");
            DataCenter dataCenter = this.LIZLLL;
            if (dataCenter != null) {
                dataCenter.put("cmd_show_user_profile", userProfileEvent);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.o$b
    public final void LIZ(LinkPlayerInfo linkPlayerInfo) {
        Object obj;
        if (!PatchProxy.proxy(new Object[]{linkPlayerInfo}, this, LIZ, false, 5).isSupported && linkPlayerInfo != null) {
            DataCenter dataCenter = this.LIZLLL;
            CharSequence charSequence = null;
            if (dataCenter != null) {
                obj = dataCenter.get("data_pk_anchor_silence_status_change", (String) Boolean.FALSE);
            } else {
                obj = null;
            }
            User LIZ2 = linkPlayerInfo.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            String realNickName = LIZ2.getRealNickName();
            if (realNickName != null && realNickName.length() >= 10) {
                if (realNickName != null) {
                    charSequence = realNickName.subSequence(0, 10);
                }
                realNickName = Intrinsics.stringPlus((String) charSequence, "...");
            }
            if (TextUtils.isEmpty(realNickName)) {
                TextView textView = this.LJIIIZ;
                if (textView != null) {
                    LK1.LIZ((View) textView, false);
                }
            } else {
                TextView textView2 = this.LJIIIZ;
                if (textView2 != null) {
                    LK1.LIZ((View) textView2, true);
                }
                TextView textView3 = this.LJIIIZ;
                if (textView3 != null) {
                    textView3.setText(realNickName);
                }
            }
            if (Intrinsics.areEqual(obj, Boolean.TRUE) && !this.LJFF) {
                View view = this.LIZJ;
                if (view != null) {
                    LK1.LIZ(view, true);
                }
            } else if (linkPlayerInfo.LJIIL != 3 && linkPlayerInfo.LJIIL != 2 && linkPlayerInfo.LJIIL != 1) {
                View view2 = this.LIZJ;
                if (view2 != null) {
                    LK1.LIZ(view2, false);
                }
            } else {
                View view3 = this.LIZJ;
                if (view3 == null) {
                    return;
                }
                LK1.LIZ(view3, true);
            }
        }
    }

    public final void LIZ(boolean z, boolean z2, boolean z3) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), (byte) 1}, this, LIZ, false, 7).isSupported) {
            return;
        }
        this.LJFF = z2;
        View view = this.LJIIJ;
        if (view != null) {
            LK1.LIZ(view, true);
        }
        int i = 2130857641;
        if (z) {
            View view2 = this.LJIIJ;
            if (view2 != null) {
                if (z2) {
                    i = 2130857653;
                }
                view2.setBackgroundResource(i);
                return;
            }
            return;
        }
        View view3 = this.LJIIJ;
        if (view3 != null) {
            if (z2 && (this.f26322LJ || LIZ())) {
                i = 2130857654;
            }
            view3.setBackgroundResource(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4439k(Context context, o$a o_a, AbstractC4440a abstractC4440a, DataCenter dataCenter, HJN hjn, LifecycleOwner lifecycleOwner) {
        super(context);
        C106862S5w.LIZ(context, lifecycleOwner);
        MethodCollector.m14708i(1864);
        this.LJII = o_a;
        this.LJIILL = hjn;
        this.LIZLLL = dataCenter;
        MethodCollector.m14707o(1864);
    }
}
