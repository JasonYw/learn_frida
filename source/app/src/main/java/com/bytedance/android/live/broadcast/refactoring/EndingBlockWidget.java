package com.bytedance.android.live.broadcast.refactoring;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcast.AbstractC2865ak;
import com.bytedance.android.live.broadcast.api.AnchorFastMatchEntryApi;
import com.bytedance.android.live.broadcast.api.CoreRoomApi;
import com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager;
import com.bytedance.android.live.broadcast.model.ShowFastMatchEntryResult;
import com.bytedance.android.live.broadcast.refactoring.EndingBlockWidget;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.depend.hashtag.LiveHashTag;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.event.C5986ap;
import com.bytedance.android.livesdk.chatroom.p518ui.DialogC6336gc;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.log.model.C8670x;
import com.bytedance.android.livesdk.message.model.C8945id;
import com.bytedance.android.livesdkapi.depend.live.ILiveRoomService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveHashTagUseInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p003X.AbstractC100834PnQ;
import p003X.AbstractC4569445g;
import p003X.AbstractC77996Gow;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC86311Jzl;
import p003X.C100839PnV;
import p003X.C116971W2r;
import p003X.C2VQ;
import p003X.C419012i7;
import p003X.C419422im;
import p003X.C426242tm;
import p003X.C4574547f;
import p003X.C78368Guw;
import p003X.C79007HCn;
import p003X.C79169HIt;
import p003X.C86320Jzu;
import p003X.C86665KDb;
import p003X.C86748KGg;
import p003X.C86932KNi;
import p003X.C87010KQi;
import p003X.C87308Kak;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.C95452Nio;
import p003X.DialogInterface$OnClickListenerC86368K1q;
import p003X.DialogInterface$OnClickListenerC86370K1s;
import p003X.DialogInterface$OnClickListenerC86371K1t;
import p003X.DialogInterface$OnClickListenerC86372K1u;
import p003X.DialogInterface$OnClickListenerC86373K1v;
import p003X.K00;
import p003X.K0B;
import p003X.K32;
import p003X.K38;
import p003X.K39;
import p003X.KCU;
import p003X.KDX;
import p003X.KKQ;
import p003X.LK5;

/* loaded from: classes5.dex */
public class EndingBlockWidget extends AbstractBroadcastWidget implements Observer<KVData>, AbstractC4569445g {
    public static ChangeQuickRedirect LIZJ;
    public DataCenter LIZLLL;

    /* renamed from: LJ */
    public AbstractC86311Jzl f25940LJ;
    public Disposable LJFF;
    public AbstractC2865ak LJI;
    public Room LJII;
    public C8668v LJIIIZ;
    public DialogC6336gc LJIIJ;
    public DialogC6336gc LJIIJJI;
    public DialogC6336gc LJIIL;
    public KDX LJIILIIL;
    public Dialog LJIILJJIL;
    public Disposable LJIILL;
    public Disposable LJIILLIIL;
    public Disposable LJIIZILJ;
    public Disposable LJIJ;
    public Disposable LJIJI;
    public Handler LJIJJ = new Handler();
    public CompositeDisposable LJIIIIZZ = new CompositeDisposable();
    public Queue<KVData> LJIJJLI = new LinkedList();
    public long LJIL = 0;

    static {
        Covode.recordClassIndex(17709);
    }

    @Override // com.bytedance.android.live.broadcast.refactoring.AbstractBroadcastWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZJ, false, 73).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.refactoring.AbstractBroadcastWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public /* bridge */ /* synthetic */ void onPause() {
        super.onPause();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void LIZ(final java.util.HashMap r15, com.bytedance.android.live.network.response.C5176i r16) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.refactoring.EndingBlockWidget.LIZ(java.util.HashMap, com.bytedance.android.live.network.response.i):void");
    }

    public final /* synthetic */ void LIZ(final HashMap hashMap, AbstractC100834PnQ abstractC100834PnQ) {
        if (PatchProxy.proxy(new Object[]{hashMap, abstractC100834PnQ}, this, LIZJ, false, 59).isSupported) {
            return;
        }
        if (((ShowFastMatchEntryResult) abstractC100834PnQ.LIZIZ).showEntry) {
            if (!PatchProxy.proxy(new Object[]{hashMap}, this, LIZJ, false, 18).isSupported) {
                C86665KDb.LIZIZ("ttlive_on_zero_link_room_close_dialog", "LiveBroadcastFragment");
                hashMap.put("popup_strategy", "no_link_user");
                LIZLLL(hashMap);
                ((IInteractService) ServiceManager.getService(IInteractService.class)).getAudioTalkService().LJI();
                if (!PatchProxy.proxy(new Object[]{hashMap}, this, LIZJ, false, 19).isSupported && this.LJIILIIL == null) {
                    K0B k0b = new K0B(getContext(), 1);
                    k0b.LIZ(2131699007);
                    k0b.LIZ(LK5.LIZ(2131588544));
                    k0b.LIZIZ(LK5.LIZ(2131588545));
                    k0b.LIZIZ(17);
                    k0b.LIZ(false);
                    k0b.LIZ(LK5.LIZ(2131582379), DialogInterface$OnClickListenerC86368K1q.LIZIZ);
                    k0b.LIZIZ(LK5.LIZ(2131585803), new DialogInterface.OnClickListener(this, hashMap) { // from class: X.K1I
                        public static ChangeQuickRedirect LIZ;
                        public final EndingBlockWidget LIZIZ;
                        public final HashMap LIZJ;

                        static {
                            Covode.recordClassIndex(17862);
                        }

                        {
                            this.LIZIZ = this;
                            this.LIZJ = hashMap;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            this.LIZIZ.LIZLLL(this.LIZJ, dialogInterface, i);
                        }
                    });
                    k0b.LIZ(new DialogInterface.OnClickListener(this) { // from class: X.Jzt
                        public static ChangeQuickRedirect LIZ;
                        public final EndingBlockWidget LIZIZ;

                        static {
                            Covode.recordClassIndex(17864);
                        }

                        {
                            this.LIZIZ = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            EndingBlockWidget endingBlockWidget = this.LIZIZ;
                            if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, endingBlockWidget, EndingBlockWidget.LIZJ, false, 54).isSupported) {
                                return;
                            }
                            LinkCrossRoomDataHolder.LJII().LJJIII = true;
                            endingBlockWidget.LIZ("broadcast_window_close_live");
                            ((IInteractService) ServiceManager.getService(IInteractService.class)).getAudioTalkService().LIZIZ(((IInteractService) ServiceManager.getService(IInteractService.class)).getCurrentScene());
                            dialogInterface.dismiss();
                        }
                    });
                    this.LJIILIIL = k0b.LIZ();
                }
                if (!this.LJIILIIL.isShowing()) {
                    C116971W2r.LIZJ(this.LJIILIIL);
                }
            }
        } else {
            LIZJ(hashMap);
        }
        Disposable disposable = this.LJIILL;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.LJIJ;
        if (disposable2 == null) {
            return;
        }
        disposable2.dispose();
    }

    public final /* synthetic */ void LIZ(HashMap hashMap, Throwable th) {
        if (PatchProxy.proxy(new Object[]{hashMap, th}, this, LIZJ, false, 58).isSupported) {
            return;
        }
        Disposable disposable = this.LJIJ;
        if (disposable != null) {
            disposable.dispose();
        }
        LIZJ(hashMap);
    }

    public final /* synthetic */ void LIZ(HashMap hashMap, Long l) {
        if (PatchProxy.proxy(new Object[]{hashMap, l}, this, LIZJ, false, 57).isSupported) {
            return;
        }
        Disposable disposable = this.LJIILL;
        if (disposable != null && !disposable.isDisposed()) {
            this.LJIILL.dispose();
        }
        KDX kdx = this.LJIILIIL;
        if (kdx == null || kdx.isShowing()) {
            return;
        }
        LIZJ(hashMap);
    }

    public final /* synthetic */ void LIZ(HashMap hashMap, DialogInterface dialogInterface, int i) {
        if (PatchProxy.proxy(new Object[]{hashMap, dialogInterface, Integer.valueOf(i)}, this, LIZJ, false, 45).isSupported) {
            return;
        }
        C86665KDb.LIZIZ("ttlive_on_close_pk_room_dialog_confirm", "LiveBroadcastFragment");
        LinkCrossRoomDataHolder.LJII().LJJIII = true;
        LinkCrossRoomDataHolder.LJII().LJJIIZ = true;
        ((IInteractService) ServiceManager.getService(IInteractService.class)).getPkService().LJIIJ();
        LIZ("broadcast_window_close_live");
        this.f25940LJ.LIZIZ(hashMap);
        dialogInterface.dismiss();
    }

    public final void LIZ(HashMap<String, String> hashMap, final int i) {
        if (PatchProxy.proxy(new Object[]{hashMap, Integer.valueOf(i)}, this, LIZJ, false, 34).isSupported) {
            return;
        }
        C86665KDb.LIZ("ttlive_on_finish_broadcast_confirm_click", "room", this.LJII.isLiveTypeAudio() ? LiveMode.AUDIO : LiveMode.VIDEO).LIZ().LIZ();
        C426242tm.LIZ(this.LJII, hashMap);
        hashMap.put("resolution", AnchorVideoResolutionManager.LJIIIZ.LIZIZ());
        C4574547f LIZ = C4574547f.LIZ();
        C8668v c8668v = new C8668v();
        c8668v.LIZ("live_take_detail");
        c8668v.LJFF("click");
        c8668v.LIZIZ("live_take");
        LIZ.LIZ("anchor_close_live_confirm", hashMap, c8668v, new C8670x());
        if (((Boolean) C79007HCn.LJII().LJJIIZI).booleanValue()) {
            this.LJIJJ.postDelayed(new Runnable(this, i) { // from class: X.K2P
                public static ChangeQuickRedirect LIZ;
                public final EndingBlockWidget LIZIZ;
                public final int LIZJ;

                static {
                    Covode.recordClassIndex(17721);
                }

                {
                    this.LIZIZ = this;
                    this.LIZJ = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    this.LIZIZ.LIZ(this.LIZJ);
                }
            }, 1000L);
        } else {
            if (this.f25940LJ != null) {
                this.LIZLLL.put("cmd_stop_live_broadcast", Integer.valueOf(i));
                this.f25940LJ.LJIIL();
            }
            KCU.LIZ(true, 0, (String) null);
            KCU.LIZ(i);
        }
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("use_status", Boolean.TRUE.equals(this.LIZLLL.get("data_has_sticker_effective")) ? "use" : "unused");
        m15886LJ();
        C4574547f LIZ2 = C4574547f.LIZ();
        HashMap<String, String> m15885LJ = m15885LJ(hashMap2);
        C8668v c8668v2 = new C8668v();
        c8668v2.LIZ("anchor_live_ending");
        c8668v2.LJFF("other");
        c8668v2.LIZIZ("live_take");
        LIZ2.LIZ("pm_live_sticker_use", m15885LJ, c8668v2, new C8670x());
        HashMap hashMap3 = new HashMap();
        hashMap3.put("barrage_status", AbstractC80293Hkt.f7091cM.LIZ().toString());
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC80293Hkt.f7092cN.LIZ().size());
        hashMap3.put("barrage_authorized_cnt", sb.toString());
        C426242tm.LIZ(this.LJII, hashMap3);
        C4574547f.LIZ().LIZ("livesdk_live_overclick", hashMap3, new C8668v(), Room.class);
        AbstractC80293Hkt.f7091cM.LIZ(0);
        AbstractC80293Hkt.f7092cN.LIZ().clear();
        LIZLLL();
    }

    public String LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 37);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Room room = this.LJII;
        if (room == null) {
            return "0";
        }
        return room.getIdStr();
    }

    @Override // com.bytedance.android.live.broadcast.refactoring.AbstractBroadcastWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        this.LJII = (Room) this.LIZLLL.get("data_room");
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 4).isSupported) {
            return;
        }
        super.onStop();
        this.LJIIIIZZ.clear();
    }

    public int LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 15);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        Object obj = null;
        DataCenter dataCenter = this.LIZLLL;
        if (dataCenter != null) {
            obj = dataCenter.get("data_member_count");
        }
        if (!(obj instanceof Integer)) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 40).isSupported) {
            return;
        }
        super.onDestroy();
        DataCenter dataCenter = this.LIZLLL;
        if (dataCenter != null) {
            dataCenter.removeObserver(this);
        }
        Disposable disposable = this.LJIILLIIL;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.LJIJI;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        this.LJIJJ.removeCallbacksAndMessages(null);
    }

    /* renamed from: LJ */
    private void m15886LJ() {
        DataCenter dataCenter;
        String str;
        String str2;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 38).isSupported && (dataCenter = this.LIZLLL) != null && this.LJII != null) {
            LiveHashTagUseInfo liveHashTagUseInfo = (LiveHashTagUseInfo) dataCenter.get("data_hash_tag_use_info");
            String str3 = null;
            LiveHashTag liveHashTag = (LiveHashTag) this.LIZLLL.get("cmd_update_live_challenge", (String) null);
            if (liveHashTag != null) {
                str = liveHashTag.f26767id;
                str2 = liveHashTag.source;
                str3 = liveHashTag.creationId;
            } else {
                str = null;
                str2 = null;
            }
            KKQ.LIZ(this.LJII.getOwnerUserId(), this.LJII.getId(), str3, str, str2, liveHashTagUseInfo);
        }
    }

    @Override // com.bytedance.android.live.broadcast.refactoring.AbstractBroadcastWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 3).isSupported) {
            return;
        }
        super.onResume();
        this.LJIIIIZZ.clear();
        if (!PatchProxy.proxy(new Object[]{C5986ap.class}, this, LIZJ, false, 5).isSupported) {
            this.LJIIIIZZ.add(C87010KQi.LIZ().LIZ(C5986ap.class).subscribe(new Consumer(this) { // from class: X.K1e
                public static ChangeQuickRedirect LIZ;
                public final EndingBlockWidget LIZIZ;

                static {
                    Covode.recordClassIndex(17850);
                }

                {
                    this.LIZIZ = this;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    EndingBlockWidget endingBlockWidget = this.LIZIZ;
                    if (PatchProxy.proxy(new Object[]{obj}, endingBlockWidget, EndingBlockWidget.LIZJ, false, 72).isSupported || !(obj instanceof C5986ap)) {
                        return;
                    }
                    endingBlockWidget.onEvent((C5986ap) obj);
                }
            }));
        }
        while (!this.LJIJJLI.isEmpty()) {
            onChanged(this.LJIJJLI.poll());
        }
    }

    private void LIZLLL() {
        String str;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 36).isSupported && LiveSettingKeys.LIVE_ANCHOR_GIFT_ANIMATION_SWITCH.getValue().LIZ() && LiveSettingKeys.LIVE_MORE_DIALOG_ANCHOR_202107.getValue().booleanValue()) {
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", String.valueOf(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ()));
            hashMap.put("room_id", LIZJ());
            if (AbstractC80293Hkt.LLZZZZ.LIZ().booleanValue()) {
                str = "on";
            } else {
                str = "off";
            }
            hashMap.put("gift_effect_status", str);
            hashMap.put("live_type", C2VQ.LIZ(this.LJII.getStreamType()));
            C4574547f.LIZ().LIZ("livesdk_live_gift_effect_status", hashMap, new Object[0]);
        }
    }

    public boolean LIZIZ() {
        AbstractC2865ak abstractC2865ak;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 30);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Room room = this.LJII;
        if (room == null || room.getStreamType() != LiveMode.AUDIO || !LiveSettingKeys.LIVE_BROADCAST_AUDIO_FLOAT_WINDOW.getValue().booleanValue() || (abstractC2865ak = this.LJI) == null || abstractC2865ak.LIZ() == null || this.LJI.LIZ().LIZJ() != 0 || AbstractC80293Hkt.f7121cq.LIZ().intValue() >= 3) {
            return false;
        }
        return true;
    }

    public void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 27).isSupported) {
            return;
        }
        C86320Jzu.LIZ(str, 0, "", this.LJII);
    }

    public final void LIZIZ(HashMap<String, String> hashMap) {
        if (PatchProxy.proxy(new Object[]{hashMap}, this, LIZJ, false, 33).isSupported) {
            return;
        }
        LIZ(hashMap, 1);
    }

    private void LIZLLL(HashMap<String, String> hashMap) {
        if (PatchProxy.proxy(new Object[]{hashMap}, this, LIZJ, false, 28).isSupported) {
            return;
        }
        C4574547f.LIZ().LIZ("anchor_close_live_popup", hashMap, this.LJIIIZ, new C8670x());
    }

    /* renamed from: LJ */
    private HashMap<String, String> m15885LJ(HashMap<String, String> hashMap) {
        long j;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{hashMap}, this, LIZJ, false, 35);
        if (proxy.isSupported) {
            return (HashMap) proxy.result;
        }
        Room room = this.LJII;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        hashMap.put("room_id", String.valueOf(j));
        return hashMap;
    }

    private void LIZJ(final HashMap<String, String> hashMap) {
        if (PatchProxy.proxy(new Object[]{hashMap}, this, LIZJ, false, 13).isSupported) {
            return;
        }
        if (LIZ() <= 0) {
            hashMap.put("popup_strategy", "no_audience");
        } else {
            hashMap.put("popup_strategy", "has_audience");
        }
        LIZLLL(hashMap);
        C86665KDb.LIZIZ("ttlive_show_normal_close_room_dialog", "LiveBroadcastFragment");
        AbstractC77996Gow mo15264LJ = C419012i7.LIZ().LIZ(getContext(), 4).mo15264LJ(2131588186);
        mo15264LJ.LIZJ(this.f25940LJ.LJIJJ());
        mo15264LJ.LIZIZ(0, 2131586570, new DialogInterface.OnClickListener(this, hashMap) { // from class: X.K1G
            public static ChangeQuickRedirect LIZ;
            public final EndingBlockWidget LIZIZ;
            public final HashMap LIZJ;

            static {
                Covode.recordClassIndex(17855);
            }

            {
                this.LIZIZ = this;
                this.LIZJ = hashMap;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                this.LIZIZ.LJFF(this.LIZJ, dialogInterface, i);
            }
        }).LIZIZ(1, 2131582393, new DialogInterface.OnClickListener(this, hashMap) { // from class: X.K1H
            public static ChangeQuickRedirect LIZ;
            public final EndingBlockWidget LIZIZ;
            public final HashMap LIZJ;

            static {
                Covode.recordClassIndex(17856);
            }

            {
                this.LIZIZ = this;
                this.LIZJ = hashMap;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                this.LIZIZ.m15884LJ(this.LIZJ, dialogInterface, i);
            }
        }).LIZJ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.lifecycle.Observer
    /* renamed from: LIZ */
    public void onChanged(KVData kVData) {
        boolean z = false;
        if (!PatchProxy.proxy(new Object[]{kVData}, this, LIZJ, false, 31).isSupported && this.f25940LJ.LJIILIIL() && kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            if (!this.f25940LJ.LJIILIIL()) {
                this.LJIJJLI.offer(kVData);
                return;
            }
            String key = kVData.getKey();
            int hashCode = key.hashCode();
            if (hashCode != -520829884) {
                if (hashCode != 37961367 || !key.equals("cmd_exit_room")) {
                    return;
                }
            } else if (key.equals("cmd_finish_broadcast_confirm_click")) {
                z = true;
            } else {
                return;
            }
            long j = 0;
            if (z) {
                if (z) {
                    C86665KDb.LIZIZ("ttlive_on_back_exit_confirm", "LiveBroadcastFragment");
                    Room room = this.LJII;
                    if (room != null) {
                        j = room.getId();
                    }
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("room_id", String.valueOf(j));
                    this.f25940LJ.LIZIZ(hashMap);
                }
            } else if (kVData.getData() instanceof Bundle) {
                LIZ(((Bundle) kVData.getData()).getLong("match_room_id", 0L), ((Bundle) kVData.getData()).getBundle("enter_room_data"));
            }
        }
    }

    public final /* synthetic */ void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZJ, false, 43).isSupported) {
            return;
        }
        if (this.f25940LJ != null) {
            this.LIZLLL.put("cmd_stop_live_broadcast", Integer.valueOf(i));
            this.f25940LJ.LJIIL();
        }
        KCU.LIZ(true, 0, (String) null);
        KCU.LIZ(i);
    }

    public final void LIZ(HashMap<String, String> hashMap) {
        if (PatchProxy.proxy(new Object[]{hashMap}, this, LIZJ, false, 11).isSupported) {
            return;
        }
        C4574547f LIZ = C4574547f.LIZ();
        C8668v c8668v = new C8668v();
        c8668v.LIZ("live_take_detail");
        c8668v.LJFF("click");
        c8668v.LIZIZ("live_take");
        LIZ.LIZ("anchor_close_live_cancel", hashMap, c8668v, new C8670x());
        C419422im.LIZ(getContext());
        this.LJII.getId();
    }

    public void onEvent(C5986ap c5986ap) {
        int currentScene;
        boolean z;
        int i = 1;
        if (PatchProxy.proxy(new Object[]{c5986ap}, this, LIZJ, false, 6).isSupported) {
            return;
        }
        int i2 = c5986ap.LIZ;
        if (i2 != 6 && i2 != 8) {
            if (i2 == 49 && c5986ap.LIZLLL != null) {
                int i3 = ((C8945id) c5986ap.LIZJ).LIZIZ;
                if (i3 == 12) {
                    i = 106;
                } else if (i3 == 13) {
                    i = 107;
                } else if (i3 == 14) {
                    i = 108;
                }
                LIZ(c5986ap.LIZLLL, i);
            }
        } else if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 7).isSupported) {
            C86665KDb.LIZIZ("ttlive_on_back_key_pressed", "LiveBroadcastFragment");
            if (((IRoomService) ServiceManager.getService(IRoomService.class)).isRecording()) {
                C88440Kt0.LIZ(2131587379);
                return;
            }
            int intValue = ((Integer) this.LIZLLL.get("data_link_state", (String) 0)).intValue();
            final HashMap<String, String> LJIILJJIL = this.f25940LJ.LJIILJJIL();
            Room room = this.LJII;
            if (room != null) {
                LJIILJJIL.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                LJIILJJIL.put("live_type", C2VQ.LIZ(this.LJII.getStreamType()));
            }
            C78368Guw.LIZIZ.LIZ(LJIILJJIL);
            C8668v c8668v = new C8668v();
            c8668v.LIZ("live_take_detail");
            c8668v.LJFF("click");
            c8668v.LIZIZ("live_take");
            this.LJIIIZ = c8668v;
            if (C79169HIt.LIZIZ(intValue, 4)) {
                LJIILJJIL.put("popup_strategy", "pk_ing");
                LIZLLL(LJIILJJIL);
                if (PatchProxy.proxy(new Object[]{LJIILJJIL}, this, LIZJ, false, 25).isSupported) {
                    return;
                }
                C86665KDb.LIZIZ("ttlive_on_close_pk_room_dialog", "LiveBroadcastFragment");
                if (!PatchProxy.proxy(new Object[]{LJIILJJIL}, this, LIZJ, false, 26).isSupported && this.LJIIJJI == null) {
                    SpannableString spannableString = new SpannableString(LK5.LIZ(2131585114));
                    C116971W2r.LIZ(spannableString, new StyleSpan(1), 17, 23, 18);
                    C116971W2r.LIZ(spannableString, new StyleSpan(1), 24, spannableString.length(), 18);
                    C86932KNi c86932KNi = new C86932KNi(getContext(), 3);
                    c86932KNi.LIZJ(2131698879);
                    c86932KNi.LIZIZ(spannableString);
                    c86932KNi.LJFF(17);
                    c86932KNi.LIZIZ(false);
                    c86932KNi.LIZIZ(LK5.LIZ(2131585115), K00.LIZIZ);
                    c86932KNi.LIZJ(LK5.LIZ(2131585116), new DialogInterface.OnClickListener(this, LJIILJJIL) { // from class: X.K1L
                        public static ChangeQuickRedirect LIZ;
                        public final EndingBlockWidget LIZIZ;
                        public final HashMap LIZJ;

                        static {
                            Covode.recordClassIndex(17872);
                        }

                        {
                            this.LIZIZ = this;
                            this.LIZJ = LJIILJJIL;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i4)}, this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            this.LIZIZ.LIZ(this.LIZJ, dialogInterface, i4);
                        }
                    });
                    c86932KNi.LIZLLL(LK5.LIZ(2131585117), DialogInterface$OnClickListenerC86372K1u.LIZIZ);
                    this.LJIIJJI = c86932KNi.LIZ();
                }
                if (this.LJIIJJI.isShowing()) {
                    return;
                }
                C116971W2r.LIZJ(this.LJIIJJI);
            } else if (C79169HIt.LIZIZ(intValue, 64)) {
                LJIILJJIL.put("popup_strategy", "has_link_user");
                LIZLLL(LJIILJJIL);
                if (PatchProxy.proxy(new Object[]{LJIILJJIL}, this, LIZJ, false, 23).isSupported) {
                    return;
                }
                C86665KDb.LIZIZ("ttlive_show_close_multi_anchor_link_room_dialog", "LiveBroadcastFragment");
                if (!PatchProxy.proxy(new Object[]{LJIILJJIL}, this, LIZJ, false, 24).isSupported && this.LJIIL == null) {
                    SpannableString spannableString2 = new SpannableString(LK5.LIZ(2131585112));
                    C116971W2r.LIZ(spannableString2, new StyleSpan(1), 17, 23, 18);
                    C116971W2r.LIZ(spannableString2, new StyleSpan(1), 24, spannableString2.length(), 18);
                    C86932KNi c86932KNi2 = new C86932KNi(getContext(), 3);
                    c86932KNi2.LIZJ(2131698879);
                    c86932KNi2.LIZIZ(spannableString2);
                    c86932KNi2.LJFF(17);
                    c86932KNi2.LIZIZ(false);
                    c86932KNi2.LIZIZ(LK5.LIZ(2131585113), DialogInterface$OnClickListenerC86373K1v.LIZIZ);
                    c86932KNi2.LIZJ(LK5.LIZ(2131585116), new DialogInterface.OnClickListener(this, LJIILJJIL) { // from class: X.K1K
                        public static ChangeQuickRedirect LIZ;
                        public final EndingBlockWidget LIZIZ;
                        public final HashMap LIZJ;

                        static {
                            Covode.recordClassIndex(17869);
                        }

                        {
                            this.LIZIZ = this;
                            this.LIZJ = LJIILJJIL;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i4)}, this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            this.LIZIZ.LIZIZ(this.LIZJ, dialogInterface, i4);
                        }
                    });
                    c86932KNi2.LIZLLL(LK5.LIZ(2131585117), DialogInterface$OnClickListenerC86371K1t.LIZIZ);
                    this.LJIIL = c86932KNi2.LIZ();
                }
                if (this.LJIIL.isShowing()) {
                    return;
                }
                C116971W2r.LIZJ(this.LJIIL);
            } else if (LIZIZ()) {
                LJIILJJIL.put("popup_strategy", "voice_live_support_mini_window");
                LIZLLL(LJIILJJIL);
                if (!PatchProxy.proxy(new Object[]{LJIILJJIL}, this, LIZJ, false, 21).isSupported) {
                    C86665KDb.LIZIZ("ttlive_SHOW_close_room_dialog", "LiveBroadcastFragment");
                    if (!PatchProxy.proxy(new Object[]{LJIILJJIL}, this, LIZJ, false, 22).isSupported && this.LJIIJ == null) {
                        C86932KNi c86932KNi3 = new C86932KNi(getContext(), 3);
                        c86932KNi3.LIZJ(2131698912);
                        c86932KNi3.LIZ(LK5.LIZJ(2130856132), (View.OnClickListener) null);
                        c86932KNi3.LIZIZ(false);
                        c86932KNi3.LIZJ(LK5.LIZ(2131585119), new DialogInterface.OnClickListener(this, LJIILJJIL) { // from class: X.K1J
                            public static ChangeQuickRedirect LIZ;
                            public final EndingBlockWidget LIZIZ;
                            public final HashMap LIZJ;

                            static {
                                Covode.recordClassIndex(17865);
                            }

                            {
                                this.LIZIZ = this;
                                this.LIZJ = LJIILJJIL;
                            }

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i4) {
                                if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i4)}, this, LIZ, false, 1).isSupported) {
                                    return;
                                }
                                this.LIZIZ.LIZJ(this.LIZJ, dialogInterface, i4);
                            }
                        });
                        c86932KNi3.LIZIZ(LK5.LIZ(2131585118), new DialogInterface.OnClickListener(this) { // from class: X.JzX
                            public static ChangeQuickRedirect LIZ;
                            public final EndingBlockWidget LIZIZ;

                            static {
                                Covode.recordClassIndex(17866);
                            }

                            {
                                this.LIZIZ = this;
                            }

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i4) {
                                if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i4)}, this, LIZ, false, 1).isSupported) {
                                    return;
                                }
                                final EndingBlockWidget endingBlockWidget = this.LIZIZ;
                                if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i4)}, endingBlockWidget, EndingBlockWidget.LIZJ, false, 51).isSupported) {
                                    return;
                                }
                                dialogInterface.dismiss();
                                HashMap hashMap = new HashMap();
                                hashMap.put("room_id", String.valueOf(endingBlockWidget.LJII.getId()));
                                hashMap.put("anchor_id", String.valueOf(endingBlockWidget.LJII.getOwnerUserId()));
                                hashMap.put("live_type", C2VQ.LIZ(endingBlockWidget.LJII.getStreamType()));
                                hashMap.put("room_layout", endingBlockWidget.LJII.isMediaRoom() ? "media" : "normal");
                                C78368Guw.LIZIZ.LIZ(hashMap);
                                C4574547f.LIZ().LIZ("livesdk_anchor_close_mini_window_live_click", hashMap, new Object[0]);
                                AbstractC80293Hkt.f7106cb.LIZ(Boolean.TRUE);
                                if (endingBlockWidget.getContext() == null) {
                                    return;
                                }
                                if (endingBlockWidget.LJI != null && !endingBlockWidget.LJI.LIZ().LIZ()) {
                                    AbstractC80293Hkt.f7107cc.LIZ(Long.valueOf(System.currentTimeMillis()));
                                    C88440Kt0.LIZ(2131582315);
                                    if (endingBlockWidget.LJFF != null && !endingBlockWidget.LJFF.isDisposed()) {
                                        endingBlockWidget.LJFF.dispose();
                                    }
                                    endingBlockWidget.LJFF = Observable.timer(2L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.m138io()).subscribe(new Consumer(endingBlockWidget) { // from class: X.K0R
                                        public static ChangeQuickRedirect LIZ;
                                        public final EndingBlockWidget LIZIZ;

                                        static {
                                            Covode.recordClassIndex(17724);
                                        }

                                        {
                                            this.LIZIZ = endingBlockWidget;
                                        }

                                        @Override // io.reactivex.functions.Consumer
                                        public final void accept(Object obj) {
                                            if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                                                return;
                                            }
                                            EndingBlockWidget endingBlockWidget2 = this.LIZIZ;
                                            if (PatchProxy.proxy(new Object[]{obj}, endingBlockWidget2, EndingBlockWidget.LIZJ, false, 52).isSupported || endingBlockWidget2.LJI == null) {
                                                return;
                                            }
                                            endingBlockWidget2.LJI.LIZ().LIZ(endingBlockWidget2.getContext());
                                        }
                                    }, K33.LIZ);
                                    return;
                                }
                                DialogC86685KDv dialogC86685KDv = new DialogC86685KDv(endingBlockWidget.getContext());
                                dialogC86685KDv.setCanceledOnTouchOutside(false);
                                dialogC86685KDv.setCancelable(false);
                                C116971W2r.LIZJ(dialogC86685KDv);
                            }
                        });
                        c86932KNi3.LIZLLL(LK5.LIZ(2131588153), DialogInterface$OnClickListenerC86370K1s.LIZIZ);
                        c86932KNi3.LIZIZ(2131494983);
                        c86932KNi3.LIZIZ(LK5.LIZ(2131585120));
                        this.LJIIJ = c86932KNi3.LIZ();
                    }
                    if (!this.LJIIJ.isShowing()) {
                        C116971W2r.LIZJ(this.LJIIJ);
                    }
                }
                C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.f7121cq;
                c87308Kak.LIZ(Integer.valueOf(c87308Kak.LIZ().intValue() + 1));
            } else {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 20);
                if (!proxy.isSupported ? (currentScene = ((IInteractService) ServiceManager.getService(IInteractService.class)).getCurrentScene()) == 5 || currentScene == 9 || currentScene == 8 || currentScene == 10 : ((Boolean) proxy.result).booleanValue()) {
                    if (PatchProxy.proxy(new Object[]{LJIILJJIL}, this, LIZJ, false, 16).isSupported) {
                        return;
                    }
                    this.LJIILL = ((AnchorFastMatchEntryApi) C88306Kqq.LIZ().LIZ(AnchorFastMatchEntryApi.class)).checkAnchorFastMatch(this.LJII.getRoomId()).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer(this, LJIILJJIL) { // from class: X.K1R
                        public static ChangeQuickRedirect LIZ;
                        public final EndingBlockWidget LIZIZ;
                        public final HashMap LIZJ;

                        static {
                            Covode.recordClassIndex(17857);
                        }

                        {
                            this.LIZIZ = this;
                            this.LIZJ = LJIILJJIL;
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            this.LIZIZ.LIZ(this.LIZJ, (AbstractC100834PnQ) obj);
                        }
                    }, new Consumer(this, LJIILJJIL) { // from class: X.K1S
                        public static ChangeQuickRedirect LIZ;
                        public final EndingBlockWidget LIZIZ;
                        public final HashMap LIZJ;

                        static {
                            Covode.recordClassIndex(17858);
                        }

                        {
                            this.LIZIZ = this;
                            this.LIZJ = LJIILJJIL;
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            this.LIZIZ.LIZ(this.LIZJ, (Throwable) obj);
                        }
                    });
                    KDX kdx = this.LJIILIIL;
                    if (kdx == null || kdx.isShowing() || PatchProxy.proxy(new Object[]{LJIILJJIL}, this, LIZJ, false, 17).isSupported) {
                        return;
                    }
                    this.LJIJ = Observable.timer(LiveSettingKeys.LIVE_ANCHOR_MAX_DELAY_CLOSE_ROOM.getValue().longValue(), TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.m138io()).subscribe(new Consumer(this, LJIILJJIL) { // from class: X.K1T
                        public static ChangeQuickRedirect LIZ;
                        public final EndingBlockWidget LIZIZ;
                        public final HashMap LIZJ;

                        static {
                            Covode.recordClassIndex(17859);
                        }

                        {
                            this.LIZIZ = this;
                            this.LIZJ = LJIILJJIL;
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            this.LIZIZ.LIZ(this.LIZJ, (Long) obj);
                        }
                    }, K39.LIZ);
                    return;
                }
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZJ, false, 41);
                if (proxy2.isSupported) {
                    z = ((Boolean) proxy2.result).booleanValue();
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = this.LJIL;
                    if (j != 0 && currentTimeMillis - j <= 500) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LJIL = currentTimeMillis;
                }
                if (!z && !PatchProxy.proxy(new Object[]{LJIILJJIL}, this, LIZJ, false, 8).isSupported) {
                    this.LJIILLIIL = ((CoreRoomApi) C88306Kqq.LIZ().LIZ(CoreRoomApi.class)).fetchEndingBlockingStrategy(this.LJII.getRoomId()).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer(this, LJIILJJIL) { // from class: X.K1Q
                        public static ChangeQuickRedirect LIZ;
                        public final EndingBlockWidget LIZIZ;
                        public final HashMap LIZJ;

                        static {
                            Covode.recordClassIndex(17853);
                        }

                        {
                            this.LIZIZ = this;
                            this.LIZJ = LJIILJJIL;
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            this.LIZIZ.LIZ(this.LIZJ, (C5176i) obj);
                        }
                    }, new Consumer(this, LJIILJJIL) { // from class: X.K1U
                        public static ChangeQuickRedirect LIZ;
                        public final EndingBlockWidget LIZIZ;
                        public final HashMap LIZJ;

                        static {
                            Covode.recordClassIndex(17863);
                        }

                        {
                            this.LIZIZ = this;
                            this.LIZJ = LJIILJJIL;
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            this.LIZIZ.LIZIZ(this.LIZJ, (Throwable) obj);
                        }
                    });
                    Dialog dialog = this.LJIILJJIL;
                    if (dialog != null && !dialog.isShowing() && !PatchProxy.proxy(new Object[]{LJIILJJIL}, this, LIZJ, false, 12).isSupported) {
                        this.LJIIZILJ = Observable.timer(LiveConfigSettingKeys.ENDING_BLOCKING_STRATEGY_TIMEOUT.getValue().intValue(), TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.m138io()).subscribe(new Consumer(this, LJIILJJIL) { // from class: X.K1O
                            public static ChangeQuickRedirect LIZ;
                            public final EndingBlockWidget LIZIZ;
                            public final HashMap LIZJ;

                            static {
                                Covode.recordClassIndex(17729);
                            }

                            {
                                this.LIZIZ = this;
                                this.LIZJ = LJIILJJIL;
                            }

                            @Override // io.reactivex.functions.Consumer
                            public final void accept(Object obj) {
                                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                                    return;
                                }
                                this.LIZIZ.LIZIZ(this.LIZJ, (Long) obj);
                            }
                        }, K38.LIZ);
                    }
                }
            }
        }
    }

    private void LIZ(final long j, final Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{new Long(j), bundle}, this, LIZJ, false, 39).isSupported) {
            return;
        }
        this.LJIJI = ((RoomRetrofitApi) C88306Kqq.LIZ().LIZ(RoomRetrofitApi.class)).finishRoomAbnormal().compose(C100839PnV.LIZJ()).subscribe(new Consumer(this, j, bundle) { // from class: X.K1N
            public static ChangeQuickRedirect LIZ;
            public final EndingBlockWidget LIZIZ;
            public final long LIZJ;
            public final Bundle LIZLLL;

            static {
                Covode.recordClassIndex(17722);
            }

            {
                this.LIZIZ = this;
                this.LIZJ = j;
                this.LIZLLL = bundle;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                this.LIZIZ.LIZ(this.LIZJ, this.LIZLLL, (C5176i) obj);
            }
        }, K32.LIZIZ);
    }

    public final /* synthetic */ void LIZIZ(HashMap hashMap, Long l) {
        if (PatchProxy.proxy(new Object[]{hashMap, l}, this, LIZJ, false, 63).isSupported) {
            return;
        }
        Disposable disposable = this.LJIILLIIL;
        if (disposable != null && !disposable.isDisposed()) {
            this.LJIILLIIL.dispose();
        }
        Dialog dialog = this.LJIILJJIL;
        if (dialog != null && !dialog.isShowing()) {
            LIZJ(hashMap);
        }
        ALogger.m15800e("LiveBroadcastFragment", "fetchEndingBlockingStrategyTimeout: " + LiveConfigSettingKeys.ENDING_BLOCKING_STRATEGY_TIMEOUT.getValue());
    }

    public final /* synthetic */ void LIZIZ(HashMap hashMap, Throwable th) {
        if (PatchProxy.proxy(new Object[]{hashMap, th}, this, LIZJ, false, 70).isSupported) {
            return;
        }
        Disposable disposable = this.LJIIZILJ;
        if (disposable != null) {
            disposable.dispose();
        }
        ALogger.m15800e("LiveBroadcastFragment", "fetchEndingBlockingStrategy error" + LiveConfigSettingKeys.ENDING_BLOCKING_STRATEGY_TIMEOUT.getValue());
        LIZJ(hashMap);
    }

    public EndingBlockWidget(AbstractC86311Jzl abstractC86311Jzl, DataCenter dataCenter, AbstractC2865ak abstractC2865ak) {
        this.f25940LJ = abstractC86311Jzl;
        this.LIZLLL = dataCenter;
        this.LJI = abstractC2865ak;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 1).isSupported) {
            this.LIZLLL.observeForever("cmd_exit_room", this);
            this.LIZLLL.observeForever("cmd_finish_broadcast_confirm_click", this);
        }
    }

    public final /* synthetic */ void LIZIZ(HashMap hashMap, DialogInterface dialogInterface, int i) {
        if (PatchProxy.proxy(new Object[]{hashMap, dialogInterface, Integer.valueOf(i)}, this, LIZJ, false, 48).isSupported) {
            return;
        }
        LinkCrossRoomDataHolder.LJII().LJJIIJZLJL = true;
        LIZ("broadcast_window_close_live");
        C86665KDb.LIZIZ("ttlive_on_close_multi_anchor_link_room_dialog_confirm", "LiveBroadcastFragment");
        this.f25940LJ.LIZIZ(hashMap);
        dialogInterface.dismiss();
    }

    public final /* synthetic */ void LIZJ(HashMap hashMap, DialogInterface dialogInterface, int i) {
        if (PatchProxy.proxy(new Object[]{hashMap, dialogInterface, Integer.valueOf(i)}, this, LIZJ, false, 53).isSupported) {
            return;
        }
        C86665KDb.LIZIZ("ttlive_on_close_room_dialog_confirm", "LiveBroadcastFragment");
        LIZ("broadcast_window_close_live");
        this.f25940LJ.LIZIZ(hashMap);
        dialogInterface.dismiss();
    }

    public final /* synthetic */ void LJFF(HashMap hashMap, DialogInterface dialogInterface, int i) {
        if (PatchProxy.proxy(new Object[]{hashMap, dialogInterface, Integer.valueOf(i)}, this, LIZJ, false, 62).isSupported) {
            return;
        }
        C86665KDb.LIZIZ("ttlive_on_normal_close_room_dialog_confirm", "LiveBroadcastFragment");
        C86748KGg.LIZ("ttlive_close_live_manual", "LiveBroadcastFragment");
        this.f25940LJ.LIZIZ(hashMap);
        dialogInterface.dismiss();
    }

    public final /* synthetic */ void LJI(HashMap hashMap, DialogInterface dialogInterface, int i) {
        if (PatchProxy.proxy(new Object[]{hashMap, dialogInterface, Integer.valueOf(i)}, this, LIZJ, false, 65).isSupported) {
            return;
        }
        this.f25940LJ.LIZ(hashMap);
        dialogInterface.dismiss();
    }

    public final /* synthetic */ void LJII(HashMap hashMap, DialogInterface dialogInterface, int i) {
        if (PatchProxy.proxy(new Object[]{hashMap, dialogInterface, Integer.valueOf(i)}, this, LIZJ, false, 66).isSupported) {
            return;
        }
        C86665KDb.LIZIZ("ttlive_on_task_ending_blocking_dialog_confirm", "LiveBroadcastFragment");
        this.f25940LJ.LIZIZ(hashMap);
        dialogInterface.dismiss();
    }

    public final /* synthetic */ void LJIIIIZZ(HashMap hashMap, DialogInterface dialogInterface, int i) {
        if (PatchProxy.proxy(new Object[]{hashMap, dialogInterface, Integer.valueOf(i)}, this, LIZJ, false, 69).isSupported) {
            return;
        }
        DataCenter dataCenter = this.LIZLLL;
        if (dataCenter != null) {
            dataCenter.put("data_voice_chat_room_close_page", "close");
        }
        C86665KDb.LIZIZ("ttlive_on_task_ending_blocking_dialog_confirm", "LiveBroadcastFragment");
        LIZIZ(hashMap);
        dialogInterface.dismiss();
    }

    public final /* synthetic */ void LIZLLL(HashMap hashMap, DialogInterface dialogInterface, int i) {
        if (PatchProxy.proxy(new Object[]{hashMap, dialogInterface, Integer.valueOf(i)}, this, LIZJ, false, 55).isSupported) {
            return;
        }
        C86665KDb.LIZIZ("ttlive_on_zero_link_room_close_dialog_confirm", "LiveBroadcastFragment");
        LinkCrossRoomDataHolder.LJII().LJJIII = true;
        LIZ("broadcast_window_close_live");
        this.f25940LJ.LIZIZ(hashMap);
        dialogInterface.dismiss();
    }

    /* renamed from: LJ */
    public final /* synthetic */ void m15884LJ(HashMap hashMap, DialogInterface dialogInterface, int i) {
        if (PatchProxy.proxy(new Object[]{hashMap, dialogInterface, Integer.valueOf(i)}, this, LIZJ, false, 61).isSupported) {
            return;
        }
        this.f25940LJ.LIZ(hashMap);
        dialogInterface.dismiss();
    }

    public final /* synthetic */ void LIZ(long j, Bundle bundle, C5176i c5176i) {
        if (PatchProxy.proxy(new Object[]{new Long(j), bundle, c5176i}, this, LIZJ, false, 42).isSupported) {
            return;
        }
        this.f25940LJ.LJIIJJI();
        ((ILiveRoomService) ServiceManager.getService(IRoomService.class)).setCurrentRoom(null);
        C95452Nio.m23163LJ().LJJIFFI().startLive(getContext(), j, bundle);
        if (this.f25940LJ.LJIJI().getActivity() != null) {
            C86665KDb.LIZIZ("ttlive_finish_room_for_fast_match", "LiveBroadcastFragment");
            this.f25940LJ.LJIJI().getActivity().finish();
        }
    }
}
