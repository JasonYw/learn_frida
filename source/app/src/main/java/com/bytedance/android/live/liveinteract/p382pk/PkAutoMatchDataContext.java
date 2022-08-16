package com.bytedance.android.live.liveinteract.p382pk;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.linkpk.AbstractC4262f;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.data.LinkAutoMatchModel;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p349c.l$a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder.C4324k;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4784x;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.interact.model.C6053g;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9533c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.live.datacontext.C13491f;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC426192th;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C4574547f;
import p003X.C79317HOl;
import p003X.C79615HZx;
import p003X.C79627Ha9;
import p003X.C79628HaA;
import p003X.C79665Hal;
import p003X.C81289I2h;
import p003X.HNS;
import p003X.HP7;
import p003X.IQV;
import p003X.LK5;
import p003X.QB4;

/* renamed from: com.bytedance.android.live.liveinteract.pk.PkAutoMatchDataContext */
/* loaded from: classes3.dex */
public final class PkAutoMatchDataContext extends C13491f {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public boolean f26406LJ;
    public C79317HOl LJFF;
    public Room LJII;
    public Disposable LJIIIIZZ;
    public Disposable LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public List<Object> LJIIL;
    public C6053g LJIILJJIL;
    public LinkAutoMatchModel LJIILL;
    public boolean LJJ;
    public DataCenter LJJII;
    public C4733k LJJIII;
    public C8874fl LJJIIJZLJL;
    public final CompositeDisposable LIZJ = new CompositeDisposable();
    public final C5923dp LJJIIJ = (C5923dp) IQV.LIZ(C5923dp.class);
    public final LinkCrossRoomDataHolder LJI = LinkCrossRoomDataHolder.LJII();
    public NextLiveData<C4324k> LJIILIIL = new NextLiveData<>();
    public String LJIILLIIL = "";
    public final MutableLiveData<AbstractC4262f> LJIIZILJ = new MutableLiveData<>();
    public final LiveData<AbstractC4262f> LJIJ = this.LJIIZILJ;
    public final MutableLiveData<Long> LJIJI = new MutableLiveData<>();
    public final LiveData<Long> LJIJJ = this.LJIJI;
    public final MutableLiveData<Long> LJIJJLI = new MutableLiveData<>();
    public final LiveData<Long> LJIL = this.LJIJJLI;
    public final C81289I2h LJJIIZ = HNS.LIZ(this, null, 1, null);
    public final C81289I2h LJJIIZI = HNS.LIZ(this, null, 1, null);
    public final HP7 LJJI = new C79628HaA(this);
    public final l$a LJJIFFI = new C79627Ha9(this);

    static {
        Covode.recordClassIndex(28895);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PkAutoMatchDataContext.class, "showPopupEvent", "getShowPopupEvent()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(PkAutoMatchDataContext.class, "dismissDialogEvent", "getDismissDialogEvent()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl2);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2};
    }

    public final AbstractC426192th<String> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJJIIZ.LIZ(this, LIZIZ[0]));
    }

    public final AbstractC426192th<Boolean> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJJIIZI.LIZ(this, LIZIZ[1]));
    }

    public final boolean LIZ() {
        C6053g c6053g = this.LJIILJJIL;
        if (c6053g != null && c6053g.LIZLLL > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.pk.PkAutoMatchDataContext$PKAutoMatchType */
    /* loaded from: classes3.dex */
    public enum PKAutoMatchType {
        AUTO_MATCH_TYPE_FAST(1),
        AUTO_MATCH_TYPE_MIDDLE(2),
        AUTO_MATCH_TYPE_SLOW(3);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public int value;

        public static PKAutoMatchType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (PKAutoMatchType) (proxy.isSupported ? proxy.result : Enum.valueOf(PKAutoMatchType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static PKAutoMatchType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (PKAutoMatchType[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(28897);
        }

        PKAutoMatchType(int i) {
            this.value = i;
        }
    }

    public final long LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        if (LIZ()) {
            C6053g c6053g = this.LJIILJJIL;
            if (c6053g == null) {
                return 60L;
            }
            return c6053g.LIZLLL;
        }
        LinkAutoMatchModel linkAutoMatchModel = this.LJIILL;
        if (linkAutoMatchModel == null) {
            return 60L;
        }
        return linkAutoMatchModel.getExpectTime();
    }

    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        C79615HZx.LIZ().LIZIZ();
        if (this.LJIILIIL.getValue() != null) {
            LIZ(null);
        }
    }

    public final void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        C4324k value = this.LJIILIIL.getValue();
        if (value != null) {
            value.LJIILJJIL = false;
        }
        this.LJIILIIL.setValue(null);
        this.LJIIL = null;
    }

    /* renamed from: LJ */
    public final void m15719LJ() {
        C9533c LIZ2;
        C79317HOl LIZIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        if (this.LIZLLL) {
            LinkAutoMatchModel linkAutoMatchModel = this.LJIILL;
            if (linkAutoMatchModel != null) {
                LIZ(linkAutoMatchModel, 1, "");
                this.LJIILL = null;
            }
            this.LIZLLL = false;
            C4324k value = this.LJIILIIL.getValue();
            if (value != null) {
                value.LJIILJJIL = false;
            }
            this.LJIILIIL.setValue(null);
        }
        C8874fl c8874fl = this.LJJIIJZLJL;
        if (c8874fl != null && (LIZ2 = c8874fl.LIZ()) != null && LIZ2.LIZ == 1) {
            C4324k value2 = this.LJIILIIL.getValue();
            if (value2 != null) {
                value2.LJIILJJIL = false;
            }
            this.LJIILIIL.setValue(null);
            AbstractC4784x LIZ3 = AbstractC4784x.LJII.LIZ();
            if (LIZ3 != null && (LIZIZ2 = LIZ3.LIZIZ()) != null) {
                LIZIZ2.onMessage(c8874fl);
            }
            this.LJJIIJZLJL = null;
        }
    }

    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        this.LJIILJJIL = null;
        LIZLLL().LIZ(Boolean.TRUE);
        Disposable disposable = this.LJIIIIZZ;
        if (disposable != null && (!disposable.isDisposed())) {
            disposable.dispose();
            this.LJIIIIZZ = null;
        }
        Disposable disposable2 = this.LJIIIZ;
        if (disposable2 != null && (!disposable2.isDisposed())) {
            disposable2.dispose();
            this.LJIIIZ = null;
        }
        this.LJIIL = null;
        this.f26406LJ = false;
        this.LJIIZILJ.setValue(C79665Hal.LIZ);
    }

    public final void LIZ(C8874fl c8874fl) {
        Room room;
        C79317HOl c79317HOl;
        String str;
        if (PatchProxy.proxy(new Object[]{c8874fl}, this, LIZ, false, 18).isSupported) {
            return;
        }
        this.LJJIIJZLJL = c8874fl;
        C4324k value = this.LJIILIIL.getValue();
        if (value != null && (room = value.LIZJ) != null && (c79317HOl = this.LJFF) != null) {
            long j = LinkCrossRoomDataHolder.LJII().LIZLLL;
            long id = room.getId();
            long ownerUserId = room.getOwnerUserId();
            User owner = room.getOwner();
            if (owner == null || (str = owner.getSecUid()) == null) {
                str = "";
            }
            c79317HOl.LIZ(j, id, ownerUserId, str, 0, "click_item_cancel");
        }
        if (c8874fl != null) {
            C4574547f.LIZ().LIZ("livesdk_random_instead_invite", Room.class);
        }
    }

    public final void LIZ(int i, boolean z) {
        long j;
        if (PatchProxy.proxy(new Object[]{1, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 10).isSupported) {
            return;
        }
        this.LJJ = true;
        this.LJIIJJI = true;
        C79615HZx.LIZ().LIZLLL = 1;
        LinkCrossRoomDataHolder.LJII().LJJIJIL.LIZLLL = System.currentTimeMillis();
        if (z) {
            C6053g c6053g = this.LJIILJJIL;
            if (c6053g != null) {
                Integer valueOf = Integer.valueOf(c6053g.f26859LJ);
                if (valueOf.intValue() > 0 && valueOf != null) {
                    int intValue = valueOf.intValue();
                    C79615HZx LIZ2 = C79615HZx.LIZ();
                    long j2 = intValue;
                    C6053g c6053g2 = this.LJIILJJIL;
                    if (c6053g2 != null) {
                        j = c6053g2.LIZLLL;
                    } else {
                        j = 60;
                    }
                    LIZ2.LIZ((int) (j2 + j));
                    return;
                }
                return;
            }
            return;
        }
        C6053g c6053g3 = this.LJIILJJIL;
        if (c6053g3 != null) {
            Integer valueOf2 = Integer.valueOf(c6053g3.f26859LJ);
            if (valueOf2.intValue() > 0 && valueOf2 != null) {
                int intValue2 = valueOf2.intValue();
                C79615HZx LIZ3 = C79615HZx.LIZ();
                long j3 = intValue2;
                Long value = this.LJIJJLI.getValue();
                if (value == null) {
                    value = 0L;
                }
                Intrinsics.checkNotNullExpressionValue(value, "");
                LIZ3.LIZ((int) (j3 + value.longValue()));
            }
        }
    }

    public PkAutoMatchDataContext(DataCenter dataCenter, C4733k c4733k, Context context) {
        C2WC<Room> LIZ2;
        C106862S5w.LIZ(dataCenter, c4733k, context);
        this.LJJII = dataCenter;
        this.LJJIII = c4733k;
        Room room = null;
        QB4.LIZ(LLLLIIIILLL().subscribe(new Action() { // from class: com.bytedance.android.live.liveinteract.pk.PkAutoMatchDataContext.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(28896);
            }

            @Override // io.reactivex.functions.Action
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                PkAutoMatchDataContext.this.LJFF();
                PkAutoMatchDataContext.this.LJI();
                C79317HOl c79317HOl = PkAutoMatchDataContext.this.LJFF;
                if (c79317HOl != null) {
                    c79317HOl.LIZIZ(PkAutoMatchDataContext.this.LJJI);
                }
                C79615HZx LIZ3 = C79615HZx.LIZ();
                l$a l_a = PkAutoMatchDataContext.this.LJJIFFI;
                if (!PatchProxy.proxy(new Object[]{l_a}, LIZ3, C79615HZx.LIZ, false, 10).isSupported && l_a != null && LIZ3.LIZIZ.contains(l_a)) {
                    LIZ3.LIZIZ.remove(l_a);
                }
                PkAutoMatchDataContext.this.LIZJ.dispose();
            }
        }), this.LIZJ);
        C5923dp c5923dp = this.LJJIIJ;
        if (c5923dp != null && (LIZ2 = c5923dp.LIZ()) != null) {
            room = LIZ2.LIZ();
        }
        this.LJII = room;
        C79615HZx LIZ3 = C79615HZx.LIZ();
        l$a l_a = this.LJJIFFI;
        if (!PatchProxy.proxy(new Object[]{l_a}, LIZ3, C79615HZx.LIZ, false, 8).isSupported && l_a != null) {
            int size = LIZ3.LIZIZ.size();
            if (!PatchProxy.proxy(new Object[]{l_a, Integer.valueOf(size)}, LIZ3, C79615HZx.LIZ, false, 9).isSupported) {
                LIZ3.LIZIZ.add(LIZ3.LIZIZ.size() < size ? LIZ3.LIZIZ.size() : size, l_a);
            }
        }
        this.LJIIZILJ.setValue(C79665Hal.LIZ);
    }

    public final void LIZ(LinkAutoMatchModel linkAutoMatchModel, int i, String str) {
        long j;
        long j2;
        String str2;
        if (PatchProxy.proxy(new Object[]{linkAutoMatchModel, 1, str}, this, LIZ, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkAutoMatchModel, str);
        this.LIZLLL = false;
        if (linkAutoMatchModel.getRivalRoom() != null) {
            Room rivalRoom = linkAutoMatchModel.getRivalRoom();
            String str3 = "";
            Intrinsics.checkNotNullExpressionValue(rivalRoom, str3);
            if (rivalRoom.getOwner() != null && this.LJII != null) {
                LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJI;
                linkCrossRoomDataHolder.LJIIJJI = 300;
                linkCrossRoomDataHolder.LJIIL = LK5.LJIIJ().getString(2131585776);
                LinkCrossRoomDataHolder linkCrossRoomDataHolder2 = this.LJI;
                Room rivalRoom2 = linkAutoMatchModel.getRivalRoom();
                Intrinsics.checkNotNullExpressionValue(rivalRoom2, str3);
                User owner = rivalRoom2.getOwner();
                if (owner != null) {
                    j = owner.getId();
                } else {
                    j = 0;
                }
                linkCrossRoomDataHolder2.LJFF = j;
                this.LJI.LJJJ = linkAutoMatchModel.getRivalRoom();
                C79317HOl c79317HOl = this.LJFF;
                if (c79317HOl != null) {
                    Room room = this.LJII;
                    if (room != null) {
                        j2 = room.getId();
                    } else {
                        j2 = 0;
                    }
                    Room rivalRoom3 = linkAutoMatchModel.getRivalRoom();
                    Intrinsics.checkNotNullExpressionValue(rivalRoom3, str3);
                    long id = rivalRoom3.getId();
                    Room rivalRoom4 = linkAutoMatchModel.getRivalRoom();
                    Intrinsics.checkNotNullExpressionValue(rivalRoom4, str3);
                    User owner2 = rivalRoom4.getOwner();
                    if (owner2 == null || (str2 = owner2.getSecUid()) == null) {
                        str2 = str3;
                    }
                    Room rivalRoom5 = linkAutoMatchModel.getRivalRoom();
                    Intrinsics.checkNotNullExpressionValue(rivalRoom5, str3);
                    String str4 = this.LJI.LJIIL;
                    String str5 = linkAutoMatchModel.signExtra;
                    if (str5 != null) {
                        str3 = str5;
                    }
                    c79317HOl.LIZ(j2, id, 0, 1, str2, rivalRoom5, str4, 300, str, str3);
                }
            }
        }
    }
}
