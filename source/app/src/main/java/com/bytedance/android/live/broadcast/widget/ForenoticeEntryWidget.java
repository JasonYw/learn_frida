package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.model.ScheduledSettingInfo;
import com.bytedance.android.live.broadcast.viewmodel.C3255a;
import com.bytedance.android.live.broadcast.widget.ForenoticeEntryWidget;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.livesdk.chatroom.p518ui.LiveSwitchButton;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C4574547f;
import p003X.C77347GeT;
import p003X.C87308Kak;
import p003X.KL6;
import p003X.LK1;
import p003X.LKE;
import p003X.LKF;
import p003X.LKI;
import p003X.LKJ;
import p003X.LKO;
import p003X.LKP;

/* loaded from: classes5.dex */
public final class ForenoticeEntryWidget extends LiveRecyclableWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public TextView LIZIZ;
    public View LIZJ;
    public TextView LIZLLL;

    /* renamed from: LJ */
    public TextView f25971LJ;
    public View LJFF;
    public TextView LJI;
    public TextView LJII;
    public TextView LJIIIIZZ;
    public TextView LJIIIZ;
    public View LJIIJ;
    public LiveSwitchButton LJIIJJI;
    public TextView LJIIL;
    public ScheduledSettingInfo LJIILIIL;
    public View LJIILJJIL;
    public LiveSwitchButton LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public final int LJIJJ;
    public final C3255a LJIJJLI;
    public final AbstractC3280a LJIL;
    public final Lazy LJJ;
    public View LJJI;
    public final Function0<Unit> LJJIFFI;

    /* renamed from: com.bytedance.android.live.broadcast.widget.ForenoticeEntryWidget$a */
    /* loaded from: classes12.dex */
    public interface AbstractC3280a {
        static {
            Covode.recordClassIndex(18320);
        }

        void LIZ(ScheduledSettingInfo scheduledSettingInfo);
    }

    static {
        Covode.recordClassIndex(18319);
    }

    public final AbstractC3323y LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (AbstractC3323y) (proxy.isSupported ? proxy.result : this.LJJ.mo27335getValue());
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699798;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 13).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        this.LJIILIIL = null;
        this.LJIILLIIL = false;
        this.LJIIZILJ = false;
        this.LJIJ = false;
        this.LJIJI = false;
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        this.LJJIFFI.mo30099invoke();
        KL6 kl6 = LKF.LIZJ;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        kl6.LIZ(context, this.LJIJJ, this.LJIILIIL, this.LJIJJLI.LJII, new LKE(this));
    }

    /* renamed from: LJ */
    public final void m15875LJ() {
        ScheduledSettingInfo value;
        String str;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported && (value = this.LJIJJLI.LIZJ.getValue()) != null) {
            HashMap hashMap = new HashMap();
            if (value.pushSwitch == 1) {
                str = "to_open";
            } else {
                str = "to_close";
            }
            hashMap.put("status", str);
            C4574547f.LIZ().LIZ("livesdk_notice_status", hashMap, new Object[0]);
        }
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        View view = this.LIZJ;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJFF;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        TextView textView = this.LIZIZ;
        if (textView != null) {
            textView.setTextColor(LK1.LJFF(LIZ().LIZJ()));
        }
        TextView textView2 = this.LIZIZ;
        if (textView2 != null) {
            LK1.LIZJ(textView2);
        }
        TextView textView3 = this.LIZIZ;
        if (textView3 != null) {
            textView3.setOnClickListener(new View.OnClickListener() { // from class: X.3VE
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(18326);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    if (PatchProxy.proxy(new Object[]{view3}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    TextView textView4 = ForenoticeEntryWidget.this.LIZIZ;
                    if (textView4 != null) {
                        LK1.LIZ(textView4);
                    }
                    ForenoticeEntryWidget.this.LJIJJLI.LIZ();
                }
            });
        }
    }

    public final void LIZLLL() {
        ScheduledSettingInfo value;
        String str;
        int i;
        String str2;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported && (value = this.LJIJJLI.LIZJ.getValue()) != null) {
            if (value.masterSwitch) {
                str = "live_announce_open";
            } else {
                str = "live_announce_close";
            }
            HashMap hashMap = new HashMap();
            String str3 = this.LJIJJLI.LJII;
            if (str3 != null) {
                hashMap.put("enter_from", str3);
            }
            if (value.anchorScheduledDays == 0) {
                i = 0;
            } else {
                i = 1;
            }
            hashMap.put("is_cycle", String.valueOf(i));
            hashMap.put("event_page", "live_take_page");
            String str4 = value.anchorScheduledTime;
            if (str4 != null && new Regex("\\d{4}").matches(str4)) {
                StringBuilder sb = new StringBuilder(str4);
                sb.insert(2, Constants.COLON_SEPARATOR);
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "");
                hashMap.put("live_announce_time", sb2);
            }
            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.LLILLJJLI;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            Boolean LIZ2 = c87308Kak.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            if (LIZ2.booleanValue() && value.profileSwitch) {
                str2 = "both";
            } else if (value.profileSwitch) {
                str2 = "personal_homepage";
            } else {
                C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.LLILLJJLI;
                Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                Boolean LIZ3 = c87308Kak2.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                if (LIZ3.booleanValue()) {
                    str2 = "live_sticker";
                }
                C4574547f.LIZ().LIZ(str, hashMap, new Object[0]);
            }
            hashMap.put("live_announce_page", str2);
            C4574547f.LIZ().LIZ(str, hashMap, new Object[0]);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 3).isSupported) {
            return;
        }
        View view = this.LIZJ;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJFF;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        this.LJIJJLI.LIZLLL.observe(this, new LKI(this));
        this.LJIJJLI.f25955LJ.observe(this, new LKJ(this));
        this.LJIJJLI.LIZ();
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LIZIZ = (TextView) findViewById(2131194556);
        this.LIZJ = findViewById(2131172150);
        this.LIZLLL = (TextView) findViewById(2131172152);
        this.f25971LJ = (TextView) findViewById(2131172151);
        this.LJFF = findViewById(2131184189);
        this.LJJI = findViewById(2131188736);
        this.LJI = (TextView) findViewById(2131184195);
        this.LJII = (TextView) findViewById(2131184192);
        this.LJIIIIZZ = (TextView) findViewById(2131184194);
        this.LJIIIZ = (TextView) findViewById(2131184190);
        this.LJIIJ = findViewById(2131184191);
        this.LJIIJJI = (LiveSwitchButton) findViewById(2131184193);
        this.LJIIL = (TextView) findViewById(2131168423);
        this.LJIILJJIL = findViewById(2131168421);
        this.LJIILL = (LiveSwitchButton) findViewById(2131168422);
        View view = this.LIZJ;
        if (view != null) {
            view.setOnClickListener(new LKO(this));
        }
        View view2 = this.LJJI;
        if (view2 != null) {
            view2.setOnClickListener(new LKP(this));
        }
    }

    public ForenoticeEntryWidget(int i, C3255a c3255a, AbstractC3280a abstractC3280a, Function0<Unit> function0) {
        C106862S5w.LIZ(c3255a, function0);
        this.LJIJJ = i;
        this.LJIJJLI = c3255a;
        this.LJIL = abstractC3280a;
        this.LJJIFFI = function0;
        this.LJJ = C77347GeT.LIZ(new ForenoticeEntryWidget$mThemeStrategy$2(this));
    }

    public /* synthetic */ ForenoticeEntryWidget(int i, C3255a c3255a, AbstractC3280a abstractC3280a, Function0 function0, int i2) {
        this(0, c3255a, null, function0);
    }
}
