package com.bytedance.android.live.liveinteract.multianchor.match;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.linkpk.AbstractC4254a;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.data.C4279a;
import com.bytedance.android.live.liveinteract.api.data.LinkAutoMatchModel;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.multianchor.p368f.C4520a;
import com.bytedance.android.live.liveinteract.p382pk.PkAutoMatchDataContext;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4764ae;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4784x;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.interact.model.C6053g;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.message.model.C9023t;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.xiaomi.mipush.sdk.Constants;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC426192th;
import p003X.AbstractC4569445g;
import p003X.AbstractC78050Gpo;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C2IN;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C3BK;
import p003X.C423702pg;
import p003X.C4313534v;
import p003X.C536537Hj;
import p003X.C79313HOh;
import p003X.C79317HOl;
import p003X.C79335HPd;
import p003X.C79347HPp;
import p003X.C79414HSe;
import p003X.C79605HZn;
import p003X.C79638HaK;
import p003X.C79639HaL;
import p003X.C79640HaM;
import p003X.C79641HaN;
import p003X.C79650HaW;
import p003X.C79652HaY;
import p003X.C79654Haa;
import p003X.C79659Haf;
import p003X.C79661Hah;
import p003X.C79662Hai;
import p003X.C88440Kt0;
import p003X.HNG;
import p003X.IQV;
import p003X.IQX;
import p003X.KDS;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class MultiPkMatchWidget extends RoomWidget implements AbstractC4530a, g$a, AbstractC4569445g {
    public static ChangeQuickRedirect LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public C4533e f26346LJ;
    public boolean LJI;
    public Disposable LJIIIIZZ;
    public Disposable LJIIIZ;
    public Disposable LJIIJ;
    public C79641HaN LJIIJJI;
    public final CompositeDisposable LJII = new CompositeDisposable();
    public final String LJFF = C0002O.m25085C("http://", C4313534v.LIZIZ(), "/obj/live-android/ttlive_anim_pk_random_point.webp");
    public final C79335HPd LJIIL = new C79335HPd(this);
    public final Observer<AbstractC4256d> LJIILIIL = new C79654Haa(this);

    static {
        Covode.recordClassIndex(28106);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 25).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.match.AbstractC4530a
    /* renamed from: LJ */
    public final boolean mo15726LJ() {
        return this.LJI;
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.match.g$a
    public final void LIZ(boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 19).isSupported) {
            return;
        }
        if (z2) {
            C88440Kt0.LIZ(2131586984, 1);
            C79414HSe.LIZIZ.LIZIZ();
        }
        LJI();
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.match.AbstractC4530a
    public final boolean LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C79641HaN c79641HaN = this.LJIIJJI;
        if (c79641HaN == null) {
            return false;
        }
        return c79641HaN.LIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.match.g$a
    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 20).isSupported) {
            return;
        }
        LJI();
    }

    public MultiPkMatchWidget() {
        LinkCrossRoomDataHolder.LJII();
    }

    private final AbstractC4531c LJII() {
        C2WC<AbstractC4531c> LIZIZ2;
        AbstractC4531c LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 3);
        if (proxy.isSupported) {
            return (AbstractC4531c) proxy.result;
        }
        C4533e c4533e = this.f26346LJ;
        if (c4533e == null || (LIZIZ2 = c4533e.LIZIZ()) == null || (LIZ = LIZIZ2.LIZ()) == null) {
            return C79662Hai.f6870LJ;
        }
        return LIZ;
    }

    private final C79317HOl LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 6);
        if (proxy.isSupported) {
            return (C79317HOl) proxy.result;
        }
        AbstractC4782v LIZ = AbstractC4782v.LJIIL.LIZ();
        if (LIZ != null) {
            return LIZ.LIZJ();
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.match.AbstractC4530a
    public final void LIZIZ() {
        AbstractC426192th<C4532d> LJI;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 11).isSupported) {
            return;
        }
        ALogger.m15800e("ttlive_multi_pk_match", "onReceiveMatchInvite, " + LJII());
        C4533e c4533e = this.f26346LJ;
        if (c4533e != null && (LJI = c4533e.LJI()) != null) {
            LJI.LIZ(new C4532d(false));
        }
        C88440Kt0.LIZ(2131586416);
        LIZ(1, "matchInvited");
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.match.AbstractC4530a
    public final void LIZJ() {
        String LIZ;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 16).isSupported) {
            return;
        }
        if (LJII().LIZJ) {
            LIZ = LK5.LIZ(2131586413);
        } else {
            LIZ = LK5.LIZ(2131586408);
        }
        AbstractC4764ae LIZ2 = AbstractC4764ae.LJIILIIL.LIZ();
        if (LIZ2 != null) {
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            LIZ2.LIZ(LIZ);
        }
        this.LIZLLL = true;
        ((KDS) Single.timer(5L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).m149as(autoDispose())).LIZ(new C79639HaL(this));
    }

    public final void LJI() {
        AbstractC4764ae LIZ;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 22).isSupported) {
            return;
        }
        Disposable disposable = this.LJIIIIZZ;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.LJIIIZ;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        Disposable disposable3 = this.LJIIJ;
        if (disposable3 != null) {
            disposable3.dispose();
        }
        AbstractC4764ae LIZ2 = AbstractC4764ae.LJIILIIL.LIZ();
        if (LIZ2 != null) {
            LIZ2.LIZIZ(!C79347HPp.LIZ());
        }
        if (this.LIZLLL) {
            AbstractC4764ae LIZ3 = AbstractC4764ae.LJIILIIL.LIZ();
            if (LIZ3 != null) {
                LIZ3.LJIIIZ();
            }
            this.LIZLLL = false;
        }
        AbstractC4774i LIZ4 = AbstractC78050Gpo.LIZ();
        if (LIZ4 != null && LIZ4.mo15716LJ(4) && (LIZ = AbstractC4764ae.LJIILIIL.LIZ()) != null) {
            LIZ.LIZ(5);
        }
        this.LJI = false;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 24).isSupported) {
            return;
        }
        super.onDestroy();
        C79641HaN c79641HaN = this.LJIIJJI;
        if (c79641HaN != null && !PatchProxy.proxy(new Object[0], c79641HaN, C79641HaN.LIZ, false, 21).isSupported) {
            c79641HaN.LJII.clear();
            c79641HaN.LIZLLL.dispose();
            Disposable disposable = c79641HaN.f6865LJ;
            if (disposable != null) {
                disposable.dispose();
            }
            Disposable disposable2 = c79641HaN.LJFF;
            if (disposable2 != null) {
                disposable2.dispose();
            }
            Disposable disposable3 = c79641HaN.LJI;
            if (disposable3 != null) {
                disposable3.dispose();
            }
            IMessageManager iMessageManager = c79641HaN.LIZJ;
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(c79641HaN);
            }
        }
        this.LJII.dispose();
        C79317HOl LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null) {
            LJIIIIZZ.LIZIZ(this.LJIIL);
        }
        LJI();
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        C3BK pkService = ((IInteractService) service).getPkService();
        if (pkService != null) {
            pkService.LIZIZ(this.LJIILIIL);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.match.AbstractC4530a
    public final void LIZ() {
        C6053g LIZ;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 10).isSupported) {
            return;
        }
        if (LJII().LIZJ) {
            ALogger.m15795w("ttlive_multi_pk_match", "speedUpMatch: already speedingUp, " + LJII());
            return;
        }
        C79641HaN c79641HaN = this.LJIIJJI;
        if (c79641HaN != null && !PatchProxy.proxy(new Object[0], c79641HaN, C79641HaN.LIZ, false, 17).isSupported) {
            c79641HaN.LIZ(C79661Hah.f6869LJ);
            long longValue = c79641HaN.LJIIIZ.LJFF().LIZ().longValue();
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], c79641HaN, C79641HaN.LIZ, false, 7);
            if (proxy.isSupported) {
                LIZ = (C6053g) proxy.result;
            } else {
                LIZ = c79641HaN.LJIIIZ.LIZLLL().LIZ();
            }
            if (LIZ != null) {
                Long valueOf = Long.valueOf(LIZ.f26859LJ);
                if (valueOf.longValue() > 0 && valueOf != null) {
                    long longValue2 = valueOf.longValue();
                    c79641HaN.LIZ(Math.max(longValue + longValue2, longValue2), "speedUp");
                }
            }
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 7).isSupported) {
            return;
        }
        super.onCreate();
        Pair LIZ = IQV.LIZ((Function0) MultiPkMatchWidget$onCreate$pair$1.INSTANCE);
        C4533e c4533e = (C4533e) LIZ.getFirst();
        c4533e.LIZ().LIZIZ(this);
        IQX.LIZ(c4533e, C4533e.class);
        this.LJII.add((Disposable) LIZ.getSecond());
        this.f26346LJ = c4533e;
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        this.LJIIJJI = new C79641HaN(dataCenter, c4533e);
        C79641HaN c79641HaN = this.LJIIJJI;
        if (c79641HaN != null && !PatchProxy.proxy(new Object[]{this}, c79641HaN, C79641HaN.LIZ, false, 19).isSupported) {
            C106862S5w.LIZ(this);
            c79641HaN.LJII.add(this);
        }
        C79641HaN c79641HaN2 = this.LJIIJJI;
        if (c79641HaN2 != null && !PatchProxy.proxy(new Object[0], c79641HaN2, C79641HaN.LIZ, false, 8).isSupported) {
            c79641HaN2.LIZJ = (IMessageManager) c79641HaN2.LJIIIIZZ.get("data_message_manager");
            IMessageManager iMessageManager = c79641HaN2.LIZJ;
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(MessageType.LINK_MIC_BATTLE_MULTI_MATCH.LIZ(), c79641HaN2);
            }
        }
        C79317HOl LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null) {
            LJIIIIZZ.LIZ(this.LJIIL);
        }
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        C3BK pkService = ((IInteractService) service).getPkService();
        if (pkService != null) {
            pkService.LIZ(this.LJIILIIL);
        }
    }

    private final void LIZJ(C6053g c6053g) {
        C4533e c4533e;
        C2WD<C6053g> LIZLLL;
        if (!PatchProxy.proxy(new Object[]{c6053g}, this, LIZIZ, false, 5).isSupported && (c4533e = this.f26346LJ) != null && (LIZLLL = c4533e.LIZLLL()) != null) {
            LIZLLL.LIZ(c6053g);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.match.AbstractC4530a
    public final void LIZIZ(C6053g c6053g) {
        if (PatchProxy.proxy(new Object[]{c6053g}, this, LIZIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6053g);
        ALogger.m15795w("ttlive_multi_pk_match", "update self " + c6053g + " status=" + LJII());
        LIZJ(c6053g);
    }

    private final void LIZIZ(LinkAutoMatchModel linkAutoMatchModel) {
        long j;
        C2WC<Long> LJFF;
        C6053g LJII;
        if (PatchProxy.proxy(new Object[]{linkAutoMatchModel}, this, LIZIZ, false, 15).isSupported) {
            return;
        }
        C4533e c4533e = this.f26346LJ;
        if (c4533e != null && (LJII = c4533e.LJII()) != null) {
            j = LJII.LIZLLL;
        } else {
            j = 30;
        }
        ALogger.m15795w("ttlive_multi_pk_match", "MatchWidget startMatchCountDown waitSec=" + j);
        if (j >= 60) {
            AbstractC4764ae LIZ = AbstractC4764ae.LJIILIIL.LIZ();
            if (LIZ != null) {
                LIZ.LIZIZ("");
            }
            AbstractC4764ae LIZ2 = AbstractC4764ae.LJIILIIL.LIZ();
            if (LIZ2 != null) {
                LIZ2.LIZJ(this.LJFF);
            }
        } else {
            AbstractC4764ae LIZ3 = AbstractC4764ae.LJIILIIL.LIZ();
            if (LIZ3 != null) {
                LIZ3.LIZIZ(String.valueOf(j));
            }
        }
        C4533e c4533e2 = this.f26346LJ;
        if (c4533e2 != null && (LJFF = c4533e2.LJFF()) != null) {
            LJFF.LIZ(Long.valueOf(j));
        }
        AbstractC4764ae LIZ4 = AbstractC4764ae.LJIILIIL.LIZ();
        if (LIZ4 != null) {
            LIZ4.LIZLLL(2130856632);
        }
        Disposable disposable = this.LJIIIIZZ;
        if (disposable != null) {
            disposable.dispose();
        }
        this.LJIIIIZZ = C536537Hj.LIZ(1L, TimeUnit.SECONDS).compose(C100839PnV.LIZJ()).subscribe(new C79640HaM(this));
        Disposable disposable2 = this.LJIIIZ;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        List<C4279a> previewUserList = linkAutoMatchModel.getPreviewUserList();
        if (previewUserList != null && !previewUserList.isEmpty()) {
            List<C4279a> previewUserList2 = linkAutoMatchModel.getPreviewUserList();
            AbstractC4764ae LIZ5 = AbstractC4764ae.LJIILIIL.LIZ();
            if (LIZ5 != null) {
                ImageModel imageModel = previewUserList2.get(0).LIZIZ;
                Intrinsics.checkNotNullExpressionValue(imageModel, "");
                LIZ5.LIZ(imageModel);
            }
            this.LJIIIZ = C536537Hj.LIZ(2300L, TimeUnit.MILLISECONDS).compose(C100839PnV.LIZJ()).subscribe(new C79638HaK(this, previewUserList2));
            return;
        }
        ALogger.m15795w("ttlive_multi_pk_match", "previewUserList is empty");
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.match.g$a
    public final void LIZ(LinkAutoMatchModel linkAutoMatchModel) {
        AbstractC426192th<C4532d> LJI;
        Room rivalRoom;
        int i;
        String str;
        Room LIZIZ2;
        String str2;
        if (PatchProxy.proxy(new Object[]{linkAutoMatchModel}, this, LIZIZ, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkAutoMatchModel);
        LJI();
        LIZ(1, "matchSuccess");
        if (!PatchProxy.proxy(new Object[]{linkAutoMatchModel}, this, LIZIZ, false, 18).isSupported && (rivalRoom = linkAutoMatchModel.getRivalRoom()) != null && rivalRoom.getOwner() != null) {
            Room rivalRoom2 = linkAutoMatchModel.getRivalRoom();
            Intrinsics.checkNotNullExpressionValue(rivalRoom2, "");
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{rivalRoom2}, null, C79650HaW.LIZ, true, 3);
            if (proxy.isSupported) {
                i = ((Integer) proxy.result).intValue();
            } else {
                C106862S5w.LIZ(rivalRoom2);
                Map<String, Long> map = rivalRoom2.linkMap;
                if (map != null && map.containsKey("1")) {
                    i = 1;
                } else {
                    Map<String, Long> map2 = rivalRoom2.linkMap;
                    if (map2 != null && map2.containsKey("7")) {
                        i = 7;
                    } else {
                        i = 0;
                    }
                }
            }
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{linkAutoMatchModel}, null, C79650HaW.LIZ, true, 4);
            if (proxy2.isSupported) {
                str = (String) proxy2.result;
            } else {
                C106862S5w.LIZ(linkAutoMatchModel);
                List<LinkAutoMatchModel.C4278a> list = linkAutoMatchModel.rivals;
                if (list == null || list.isEmpty()) {
                    str = "";
                } else {
                    List<LinkAutoMatchModel.C4278a> list2 = linkAutoMatchModel.rivals;
                    Intrinsics.checkNotNullExpressionValue(list2, "");
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    for (LinkAutoMatchModel.C4278a c4278a : list2) {
                        arrayList.add(Long.valueOf(c4278a.LIZIZ));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (linkAutoMatchModel.getRivalUserId() != ((Number) obj).longValue()) {
                            arrayList2.add(obj);
                        }
                    }
                    str = CollectionsKt___CollectionsKt.joinToString$default(arrayList2, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, null, 62, null);
                }
            }
            ALogger.m15795w("ttlive_multi_pk_match", "matchInvite inviteeUserIds=" + str + " inviteeScene=" + i);
            C79317HOl LJIIIIZZ = LJIIIIZZ();
            if (LJIIIIZZ != null) {
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1);
                if (proxy3.isSupported) {
                    LIZIZ2 = (Room) proxy3.result;
                } else {
                    DataCenter dataCenter = this.dataCenter;
                    Intrinsics.checkNotNullExpressionValue(dataCenter, "");
                    LIZIZ2 = C423702pg.LIZIZ(dataCenter);
                }
                long id = LIZIZ2.getId();
                long roomId = rivalRoom2.getRoomId();
                User owner = rivalRoom2.getOwner();
                if (owner == null || (str2 = owner.getSecUid()) == null) {
                    str2 = "";
                }
                String str3 = linkAutoMatchModel.signExtra;
                if (str3 == null) {
                    str3 = "";
                }
                LJIIIIZZ.LIZ(id, roomId, 0, 4, str2, rivalRoom2, "", 300, "", 0L, str3, 2, 0, i, str);
            }
            this.LJI = true;
            Disposable disposable = this.LJIIJ;
            if (disposable != null) {
                disposable.dispose();
            }
            this.LJIIJ = Observable.timer(20L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new C79605HZn(this));
        }
        C88440Kt0.LIZ(2131586416);
        C4533e c4533e = this.f26346LJ;
        if (c4533e != null && (LJI = c4533e.LJI()) != null) {
            LJI.LIZ(new C4532d(true));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.match.g$a
    public final void LIZIZ(C9023t c9023t) {
        if (PatchProxy.proxy(new Object[]{c9023t}, this, LIZIZ, false, 21).isSupported) {
            return;
        }
        C106862S5w.LIZ(c9023t);
        ALogger.m15795w("ttlive_multi_pk_match", "MatchWidget onPassiveMatchEnd");
        LJI();
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.match.AbstractC4530a
    public final void LIZ(C6053g c6053g) {
        C4520a LIZJ;
        boolean z;
        List<AnchorLinkUser> m15728LJ;
        C4520a LIZJ2;
        List<AnchorLinkUser> m15728LJ2;
        boolean z2;
        long j;
        int i;
        C4520a LIZJ3;
        if (PatchProxy.proxy(new Object[]{c6053g}, this, LIZIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6053g);
        LIZJ(c6053g);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 23);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else {
            AbstractC4784x LIZ = AbstractC4784x.LJII.LIZ();
            if ((LIZ != null && (LIZJ2 = LIZ.LIZJ()) != null && (m15728LJ2 = LIZJ2.m15728LJ()) != null && (!m15728LJ2.isEmpty())) || ((LIZJ = C79347HPp.LIZJ()) != null && (m15728LJ = LIZJ.m15728LJ()) != null && (!m15728LJ.isEmpty()))) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            ALogger.m15800e("ttlive_multi_pk_match", "startMatch intercepted, LinkerInvitingRival");
            C88440Kt0.LIZ(LK5.LIZ(2131586407));
            C79313HOh c79313HOh = C79313HOh.f6779LJ;
            if (!PatchProxy.proxy(new Object[0], c79313HOh, C79313HOh.LIZLLL, false, 45).isSupported) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                AbstractC4784x LIZ2 = AbstractC4784x.LJII.LIZ();
                if (LIZ2 != null && (LIZJ3 = LIZ2.LIZJ()) != null) {
                    linkedHashMap.put("pk_waiting_list", C79347HPp.LIZ(LIZJ3.m15728LJ()));
                    List<User> LJIIIIZZ = LIZJ3.LJIIIIZZ();
                    if (!(true ^ LJIIIIZZ.isEmpty())) {
                        LJIIIIZZ = null;
                    }
                    linkedHashMap.put("pk_invitee_list", String.valueOf(LJIIIIZZ));
                }
                c79313HOh.LIZIZ(linkedHashMap);
                c79313HOh.LIZ(linkedHashMap);
                C2IN.LIZIZ().LIZLLL("ttlive_anchor_link", "intercept_multi_match_when_inviting: " + linkedHashMap);
                HNG.LIZ("intercept_multi_match_when_inviting", (Map<String, Object>) linkedHashMap, (AbstractC4254a) LinkCrossRoomDataHolder.LJII(), false);
            }
        } else if (C79347HPp.LIZ(this.dataCenter)) {
            ALogger.m15800e("ttlive_multi_pk_match", "startMatch intercepted, PkWithAudience");
            C88440Kt0.LIZ(LK5.LIZ(2131586404));
        } else if (C79347HPp.LIZ()) {
            ALogger.m15800e("ttlive_multi_pk_match", "startMatch intercepted, isMultiAnchorLinkOn");
        } else {
            C79641HaN c79641HaN = this.LJIIJJI;
            if (c79641HaN != null && !PatchProxy.proxy(new Object[]{c6053g}, c79641HaN, C79641HaN.LIZ, false, 10).isSupported) {
                C106862S5w.LIZ(c6053g);
                if (c79641HaN.LIZ()) {
                    ALogger.m15800e("ttlive_multi_pk_match", "startRandomMatch intercepted, already matching");
                    return;
                }
                ALogger.m15795w("ttlive_multi_pk_match", "startRandomMatch " + c6053g);
                Disposable disposable = c79641HaN.LJFF;
                if (disposable != null) {
                    disposable.dispose();
                }
                Disposable disposable2 = c79641HaN.f6865LJ;
                if (disposable2 != null) {
                    disposable2.dispose();
                }
                c79641HaN.f6865LJ = C536537Hj.LIZ(3L, 3L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new C79652HaY(c79641HaN));
                C79659Haf c79659Haf = c6053g.LJI;
                if (c79659Haf != null && c79659Haf.LIZIZ == PkAutoMatchDataContext.PKAutoMatchType.AUTO_MATCH_TYPE_SLOW.value) {
                    z2 = true;
                    j = c6053g.LIZLLL;
                    i = c6053g.f26859LJ;
                } else {
                    z2 = false;
                    j = c6053g.LIZLLL;
                    i = c6053g.LJFF;
                }
                c79641HaN.LIZ(j + i, "startMatchSpeedUp");
                c79641HaN.LIZ(c79641HaN.LIZIZ.getId(), true, z2, c6053g);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.match.g$a
    public final void LIZ(C9023t c9023t) {
        ArrayList arrayList;
        if (PatchProxy.proxy(new Object[]{c9023t}, this, LIZIZ, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(c9023t);
        ALogger.m15795w("ttlive_multi_pk_match", "MatchWidget onPassiveMatchStart");
        LinkAutoMatchModel linkAutoMatchModel = new LinkAutoMatchModel();
        List<C9023t.C9024a> list = c9023t.LJFF;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (C9023t.C9024a c9024a : list) {
                C4279a c4279a = new C4279a();
                c4279a.LIZ = c9024a.LIZ;
                c4279a.LIZIZ = c9024a.LIZIZ;
                arrayList2.add(c4279a);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        linkAutoMatchModel.setPreviewUserList(arrayList);
        LIZIZ(linkAutoMatchModel);
        LIZJ();
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.match.AbstractC4530a
    public final void LIZ(int i, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, LIZIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        C79641HaN c79641HaN = this.LJIIJJI;
        if (c79641HaN != null) {
            C79641HaN.LIZ(c79641HaN, i, str, false, 4, null);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.match.g$a
    public final void LIZ(LinkAutoMatchModel linkAutoMatchModel, boolean z) {
        if (PatchProxy.proxy(new Object[]{linkAutoMatchModel, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkAutoMatchModel);
        if (z) {
            LIZIZ(linkAutoMatchModel);
        }
    }
}
