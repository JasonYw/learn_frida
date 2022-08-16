package com.bytedance.android.live.broadcast.refactoring;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcast.AbstractC2863ai;
import com.bytedance.android.live.broadcast.p274n.AbstractC3168b;
import com.bytedance.android.live.broadcast.refactoring.LiveBroadcastIllegalWidget;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.p518ui.DialogC6336gc;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import java.util.LinkedList;
import java.util.Queue;
import p003X.AbstractC4569445g;
import p003X.AbstractC86311Jzl;
import p003X.C116971W2r;
import p003X.C4574547f;
import p003X.C86320Jzu;
import p003X.C86665KDb;
import p003X.C86932KNi;
import p003X.C88440Kt0;
import p003X.C88613Kvn;
import p003X.DialogInterface$OnClickListenerC86367K1p;
import p003X.K06;
import p003X.K46;
import p003X.K47;
import p003X.KNP;
import p003X.KOF;
import p003X.KOH;
import p003X.LK5;

/* loaded from: classes5.dex */
public class LiveBroadcastIllegalWidget extends AbstractBroadcastWidget implements Observer<KVData>, AbstractC3168b, AbstractC4569445g {
    public static ChangeQuickRedirect LIZJ;
    public DialogC6336gc LIZLLL;

    /* renamed from: LJ */
    public final Room f25943LJ;
    public KOF LJFF;
    public final AbstractC86311Jzl LJI;
    public final K06 LJII;
    public final Context LJIIIIZZ;
    public KOH LJIIIZ;
    public DialogC6336gc LJIIJ;
    public final AbstractC2863ai LJIIJJI;
    public Queue<KVData> LJIIL = new LinkedList();

    static {
        Covode.recordClassIndex(17713);
    }

    @Override // com.bytedance.android.live.broadcast.p274n.AbstractC3168b
    public final void LIZ(String str, String str2) {
    }

    @Override // com.bytedance.android.live.broadcast.p274n.AbstractC3168b
    public final void LIZ(boolean z, String str, int i) {
    }

    @Override // com.bytedance.android.live.broadcast.refactoring.AbstractBroadcastWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZJ, false, 25).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.refactoring.AbstractBroadcastWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public /* bridge */ /* synthetic */ void onCreate() {
        super.onCreate();
    }

    @Override // com.bytedance.android.live.broadcast.refactoring.AbstractBroadcastWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public /* bridge */ /* synthetic */ void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.android.live.broadcast.p274n.AbstractC3168b
    public final void LIZ(boolean z, String str) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, this, LIZJ, false, 9).isSupported && isViewValid()) {
            LIZJ();
            this.LIZLLL.LIZ(z, str);
        }
    }

    @Override // com.bytedance.android.live.broadcast.p274n.AbstractC3168b
    public final void LJJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 12).isSupported || !isViewValid()) {
            return;
        }
        LIZ();
        C4574547f.LIZ().LIZ("livesdk_feedback_shield_alert_click_mannual_review");
    }

    @Override // com.bytedance.android.live.broadcast.p274n.AbstractC3168b
    public final void LJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 14).isSupported) {
            return;
        }
        if (KOF.m23481t_()) {
            C88440Kt0.LIZ(2131700270, 0, 17);
        } else {
            C88613Kvn.LIZ(getContext(), 2131586009);
        }
    }

    @Override // com.bytedance.android.live.broadcast.p274n.AbstractC3168b
    public final void LJJIFFI() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 15).isSupported) {
            return;
        }
        C86665KDb.LIZIZ("ttlive_on_force_end_live", "LiveBroadcastFragment");
        if (this.dataCenter != null) {
            this.dataCenter.put("cmd_stop_live_broadcast", 105);
        }
        ALogger.m15801d("LiveBroadcastFragment", "room close forceEndLive");
        C86320Jzu.LIZ("force_finish_of_illegal", this.f25943LJ);
        this.LJI.LJIIL();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 17).isSupported) {
            return;
        }
        super.onDestroy();
        KOF kof = this.LJFF;
        if (kof != null) {
            kof.LIZJ();
            this.LJFF = null;
        }
        DialogC6336gc dialogC6336gc = this.LIZLLL;
        if (dialogC6336gc != null) {
            C116971W2r.LIZ(dialogC6336gc);
            this.LIZLLL = null;
        }
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
    }

    @Override // com.bytedance.android.live.broadcast.refactoring.AbstractBroadcastWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 5).isSupported) {
            return;
        }
        super.onResume();
        while (!this.LJIIL.isEmpty()) {
            onChanged(this.LJIIL.poll());
        }
    }

    private void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 3).isSupported) {
            return;
        }
        C86665KDb.LIZIZ("ttlive_show_illegal_review_dialog", "LiveBroadcastFragment");
        if (this.LJIIIZ == null) {
            if (KOF.m23481t_()) {
                this.LJIIIZ = new KNP().LIZ(this.LJFF);
                this.LJIIIZ.setCancelable(false);
                this.LJFF.LJIIIZ = LIZIZ();
            } else {
                this.LJIIIZ = KOH.LIZ(getContext(), this.LJFF);
            }
            this.LJFF.LJIIIIZZ = this.LJIIIZ;
        }
        if (this.LJI.LJIJI().getActivity() != null) {
            this.LJIIIZ.show(this.LJI.LJIJI().getActivity().getSupportFragmentManager(), "IllegalReviewDialog");
        }
    }

    private Dialog LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 4);
        if (proxy.isSupported) {
            return (Dialog) proxy.result;
        }
        if (this.LJIIJ == null) {
            C86932KNi c86932KNi = new C86932KNi(getContext(), 2);
            c86932KNi.LIZJ(2131698927);
            c86932KNi.LIZIZ(LK5.LIZ(2131588454));
            c86932KNi.LIZ(true);
            c86932KNi.LIZIZ(true);
            c86932KNi.LIZ(2131494983);
            c86932KNi.LIZIZ(LK5.LIZ(2131585798), new DialogInterface.OnClickListener(this) { // from class: X.Jzq
                public static ChangeQuickRedirect LIZ;
                public final LiveBroadcastIllegalWidget LIZIZ;

                static {
                    Covode.recordClassIndex(17835);
                }

                {
                    this.LIZIZ = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    LiveBroadcastIllegalWidget liveBroadcastIllegalWidget = this.LIZIZ;
                    if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, liveBroadcastIllegalWidget, LiveBroadcastIllegalWidget.LIZJ, false, 24).isSupported) {
                        return;
                    }
                    dialogInterface.dismiss();
                    C86665KDb.LIZIZ("ttlive_on_illegal_review_dialog_confirm", "LiveBroadcastFragment");
                    liveBroadcastIllegalWidget.dataCenter.put("cmd_finish_broadcast_confirm_click", "");
                    C86320Jzu.LIZ("illegal_review_close_live", liveBroadcastIllegalWidget.f25943LJ);
                    C4574547f.LIZ().LIZ("livesdk_feedback_shield_alert_click_leave_confirm");
                }
            });
            c86932KNi.LIZLLL(LK5.LIZ(2131588456), DialogInterface$OnClickListenerC86367K1p.LIZIZ);
            this.LJIIJ = c86932KNi.LIZ();
        }
        return this.LJIIJ;
    }

    private void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 7).isSupported || this.LIZLLL != null) {
            return;
        }
        if (KOF.m23481t_()) {
            C86932KNi c86932KNi = new C86932KNi(getContext(), 1);
            c86932KNi.LIZJ(2131698906);
            c86932KNi.LIZ(LK5.LIZJ(2130856575), (View.OnClickListener) null);
            c86932KNi.LIZ(false);
            c86932KNi.LIZIZ(false);
            this.LIZLLL = c86932KNi.LIZ();
            return;
        }
        this.LIZLLL = DialogC6336gc.LIZ(this.LJIIIIZZ, 1);
    }

    @Override // com.bytedance.android.live.broadcast.p274n.AbstractC3168b
    public final void LIZ(CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, LIZJ, false, 6).isSupported || !isViewValid()) {
            return;
        }
        LIZJ();
        this.LIZLLL.LIZ(charSequence);
    }

    @Override // com.bytedance.android.live.broadcast.p274n.AbstractC3168b
    public final void LIZIZ(CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, LIZJ, false, 8).isSupported || !isViewValid()) {
            return;
        }
        LIZJ();
        this.LIZLLL.LIZIZ(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.lifecycle.Observer
    /* renamed from: LIZ */
    public void onChanged(KVData kVData) {
        if (!PatchProxy.proxy(new Object[]{kVData}, this, LIZJ, false, 2).isSupported && isViewValid() && kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            if (!this.LIZIZ) {
                this.LJIIL.offer(kVData);
                return;
            }
            String key = kVData.getKey();
            if (key.hashCode() == 562756910 && key.equals("cmd_show_illegal_dialog")) {
                LIZ();
                this.LJFF.LIZ(false);
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.p274n.AbstractC3168b
    public final void LIZ(boolean z) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZJ, false, 11).isSupported && isViewValid() && this.LIZLLL != null) {
            LIZJ();
            if (z) {
                this.LIZLLL.setCancelable(false);
                C116971W2r.LIZJ(this.LIZLLL);
                this.LIZLLL.LIZ(new View.OnClickListener(this) { // from class: X.K0H
                    public static ChangeQuickRedirect LIZ;
                    public final LiveBroadcastIllegalWidget LIZIZ;

                    static {
                        Covode.recordClassIndex(17838);
                    }

                    {
                        this.LIZIZ = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        LiveBroadcastIllegalWidget liveBroadcastIllegalWidget = this.LIZIZ;
                        if (PatchProxy.proxy(new Object[]{view}, liveBroadcastIllegalWidget, LiveBroadcastIllegalWidget.LIZJ, false, 21).isSupported || liveBroadcastIllegalWidget.LJFF == null) {
                            return;
                        }
                        liveBroadcastIllegalWidget.LJFF.LIZ();
                        C116971W2r.LIZ(liveBroadcastIllegalWidget.LIZLLL);
                    }
                });
                this.LIZLLL.LIZLLL = new K46(this) { // from class: X.K0X
                    public static ChangeQuickRedirect LIZ;
                    public final LiveBroadcastIllegalWidget LIZIZ;

                    static {
                        Covode.recordClassIndex(17839);
                    }

                    {
                        this.LIZIZ = this;
                    }

                    @Override // p003X.K46
                    public final void LIZ() {
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        LiveBroadcastIllegalWidget liveBroadcastIllegalWidget = this.LIZIZ;
                        if (PatchProxy.proxy(new Object[0], liveBroadcastIllegalWidget, LiveBroadcastIllegalWidget.LIZJ, false, 20).isSupported) {
                            return;
                        }
                        C88613Kvn.LIZ(liveBroadcastIllegalWidget.getContext(), LK5.LIZ(2131585806), 1L);
                    }
                };
                this.LIZLLL.f26965LJ = new K47(this) { // from class: X.K0Y
                    public static ChangeQuickRedirect LIZ;
                    public final LiveBroadcastIllegalWidget LIZIZ;

                    static {
                        Covode.recordClassIndex(17840);
                    }

                    {
                        this.LIZIZ = this;
                    }

                    @Override // p003X.K47
                    public final void LIZ() {
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        LiveBroadcastIllegalWidget liveBroadcastIllegalWidget = this.LIZIZ;
                        if (PatchProxy.proxy(new Object[0], liveBroadcastIllegalWidget, LiveBroadcastIllegalWidget.LIZJ, false, 19).isSupported) {
                            return;
                        }
                        C88613Kvn.LIZ(liveBroadcastIllegalWidget.getContext(), LK5.LIZ(2131585806), 1L);
                    }
                };
                C4574547f.LIZ().LIZ("livesdk_feedback_shield_alert_show");
                return;
            }
            C116971W2r.LIZ(this.LIZLLL);
        }
    }

    @Override // com.bytedance.android.live.broadcast.p274n.AbstractC3168b
    public final void LIZ(boolean z, CharSequence charSequence, CharSequence charSequence2) {
        K06 k06;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), charSequence, charSequence2}, this, LIZJ, false, 13).isSupported && isViewValid() && (k06 = this.LJII) != null) {
            k06.LIZ(z, charSequence, charSequence2);
        }
    }

    @Override // com.bytedance.android.live.broadcast.p274n.AbstractC3168b
    public final void LIZ(boolean z, CharSequence charSequence, final String str) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), charSequence, str}, this, LIZJ, false, 10).isSupported || !isViewValid()) {
            return;
        }
        LIZJ();
        this.LIZLLL.LIZ(z, charSequence, new View.OnClickListener(this, str) { // from class: X.K4G
            public static ChangeQuickRedirect LIZ;
            public final LiveBroadcastIllegalWidget LIZIZ;
            public final String LIZJ;

            static {
                Covode.recordClassIndex(17837);
            }

            {
                this.LIZIZ = this;
                this.LIZJ = str;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                LiveBroadcastIllegalWidget liveBroadcastIllegalWidget = this.LIZIZ;
                String str2 = this.LIZJ;
                if (PatchProxy.proxy(new Object[]{str2, view}, liveBroadcastIllegalWidget, LiveBroadcastIllegalWidget.LIZJ, false, 22).isSupported) {
                    return;
                }
                AbstractC100890PoK buildFullScreenWebPage = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).buildFullScreenWebPage(liveBroadcastIllegalWidget.getContext(), str2);
                buildFullScreenWebPage.LIZ(true);
                buildFullScreenWebPage.LIZ();
            }
        });
    }

    public LiveBroadcastIllegalWidget(AbstractC86311Jzl abstractC86311Jzl, Room room, DataCenter dataCenter, K06 k06, AbstractC2863ai abstractC2863ai) {
        this.LJI = abstractC86311Jzl;
        this.LJII = k06;
        this.f25943LJ = room;
        this.LJIIIIZZ = abstractC86311Jzl.LJIJI().getContext();
        this.dataCenter = dataCenter;
        this.LJIIJJI = abstractC2863ai;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 1).isSupported) {
            long id = this.f25943LJ.getId();
            this.LJI.LJIJI().getContext();
            this.LJFF = new KOF(id, this.LJIIJJI);
            this.LJFF.LIZ((KOF) this);
            if (this.dataCenter != null) {
                this.dataCenter.observeForever("cmd_show_illegal_dialog", this);
            }
        }
    }
}
