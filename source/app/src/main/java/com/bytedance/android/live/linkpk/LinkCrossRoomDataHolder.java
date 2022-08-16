package com.bytedance.android.live.linkpk;

import androidx.collection.LongSparseArray;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.data.C4281b;
import com.bytedance.android.live.liveinteract.plantform.model.RoomLinkerContent;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.MultiLiveCoreInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.MultiRtcInfo;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.model.C8650b;
import com.bytedance.android.livesdk.log.model.C8656i;
import com.bytedance.android.livesdk.log.p723a.AbstractC8644i;
import com.bytedance.android.livesdk.message.linker.C8681b;
import com.bytedance.android.livesdk.message.model.p726a.C8720d;
import com.bytedance.android.livesdk.message.model.p726a.C8721e;
import com.bytedance.android.livesdkapi.depend.model.live.BattlePrecisionMatcher;
import com.bytedance.android.livesdkapi.depend.model.live.BattleRivalTag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p003X.C4574547f;
import p003X.C79112HGo;
import p003X.HRI;
import p003X.HSV;

/* loaded from: classes3.dex */
public class LinkCrossRoomDataHolder extends DataCenter implements AbstractC4254a {
    public static ChangeQuickRedirect LIZ;
    public static final LinkCrossRoomDataHolder LIZIZ = new LinkCrossRoomDataHolder();
    public static LongSparseArray<LinkCrossRoomDataHolder> LJLL = new LongSparseArray<>(2);
    public static long LJLLI;
    public boolean LIZJ;
    public long LIZLLL;

    /* renamed from: LJ */
    public long f26249LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public long LJIILIIL;
    public int LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public long LJIIZILJ;
    public int LJIJ;
    public String LJIJI;
    public long LJIJJ;
    public int LJIJJLI;
    public long LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public long LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public RivalExtraInfo LJJIJIIJI;
    public int LJJIJIIJIL;
    public Room LJJJ;
    public Room LJJJJIZL;
    public long LJJJJJL;
    public User LJJJJL;
    public boolean LJJJJLL;
    public BattlePrecisionMatcher LJJLIIIIJ;
    public String LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public String LJJLIIIJLLLLLLLZ;
    public Map<Integer, String> LJJLIIJ;
    public List<String> LJJLIL;
    public String LJJLJ;
    public MultiRtcInfo LJLIL;
    public MultiLiveCoreInfo LJLILLLLZI;
    public int LJLJJL;
    public C79112HGo LJLJJLL;
    public Map<Long, RoomLinkerContent> LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public String LJIIL = "";
    public Map<String, Long> LJJIIZI = new HashMap();
    public List<String> LJJIJ = new ArrayList();
    public HSV LJJIJIL = new HSV();
    public boolean LJJIJL = false;
    public boolean LJJIJLIJ = false;
    public List<String> LJJIL = new ArrayList();
    public boolean LJJIZ = false;
    public HRI LJJJI = new HRI();
    public List<BattleRivalTag> LJJJIL = new ArrayList();
    public boolean LJJJJ = false;
    public boolean LJJJJI = false;
    public boolean LJJJJJ = false;
    public String LJJJJLI = "normal";
    public boolean LJJJJZ = false;
    public int LJJJJZI = 1;
    public long LJJJLIIL = 0;
    public String LJJJLL = "";
    public int LJLLILLLL = 0;
    public boolean LJJJLZIJ = false;
    public boolean LJJJZ = false;
    public boolean LJJL = false;
    public List<BattlePrecisionMatcher> LJJLI = new ArrayList();
    public long LJJLIIIJJIZ = 0;
    public long LJJLIIIJL = 0;
    public long LJJLIIIJLJLI = 0;
    public long LJJLJLI = 0;
    public boolean LJJLL = false;
    public boolean LJJZ = false;
    public boolean LJJZZI = false;
    public boolean LJJZZIII = false;
    public boolean LJL = false;
    public boolean LJLI = false;
    public boolean LJLIIIL = false;
    public boolean LJLIIL = false;
    public LongSparseArray<String> LJLJI = new LongSparseArray<>();
    public LongSparseArray<String> LJLJJI = new LongSparseArray<>();

    @Override // com.bytedance.android.live.linkpk.AbstractC4254a
    public final void LIZ(C8681b c8681b) {
    }

    @Override // com.bytedance.android.live.linkpk.AbstractC4254a
    public final String LIZ() {
        return this.LJIILL;
    }

    @Override // com.bytedance.android.live.linkpk.AbstractC4254a
    public final String LIZIZ() {
        return this.LJIILL;
    }

    @Override // com.bytedance.android.live.linkpk.AbstractC4254a
    public final int LIZJ() {
        return this.LJIILJJIL;
    }

    @Override // com.bytedance.android.live.linkpk.AbstractC4254a
    public final String LIZLLL() {
        return this.LJIJI;
    }

    @Override // com.bytedance.android.live.linkpk.AbstractC4254a
    /* renamed from: LJ */
    public final long mo15779LJ() {
        return this.LIZLLL;
    }

    @Override // com.bytedance.android.live.linkpk.AbstractC4254a
    public final int LJFF() {
        return this.LJLLILLLL;
    }

    /* loaded from: classes3.dex */
    public enum BattleStatsFromType {
        Default,
        OpenIM,
        PKingInRoom,
        SEI,
        PKingNoBlood,
        NoFinishIM;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static BattleStatsFromType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (BattleStatsFromType[]) proxy.result;
            }
            return (BattleStatsFromType[]) values().clone();
        }

        static {
            Covode.recordClassIndex(25055);
        }

        public static BattleStatsFromType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (BattleStatsFromType) proxy.result;
            }
            return (BattleStatsFromType) Enum.valueOf(BattleStatsFromType.class, str);
        }
    }

    /* loaded from: classes3.dex */
    public enum LinkState {
        DISABLED,
        SELF_JOIN,
        SELF_JOIN_SUCCEED,
        TURN_ON_ENGINE,
        TURN_ON_ENGINE_SUCCEED,
        CONNECTION_SUCCEED,
        FINISH,
        FINISH_SUCCEED,
        TURN_OFF_ENGINE,
        TURN_OFF_ENGINE_SUCCEED,
        UNLOADED;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static LinkState[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (LinkState[]) proxy.result;
            }
            return (LinkState[]) values().clone();
        }

        static {
            Covode.recordClassIndex(25056);
        }

        public static LinkState valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (LinkState) proxy.result;
            }
            return (LinkState) Enum.valueOf(LinkState.class, str);
        }
    }

    /* loaded from: classes3.dex */
    public enum PkResult {
        UNFINISHED,
        LEFT_WON,
        RIGHT_WON,
        EVEN;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static PkResult[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (PkResult[]) proxy.result;
            }
            return (PkResult[]) values().clone();
        }

        static {
            Covode.recordClassIndex(25057);
        }

        public static PkResult valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (PkResult) proxy.result;
            }
            return (PkResult) Enum.valueOf(PkResult.class, str);
        }
    }

    static {
        Covode.recordClassIndex(25054);
    }

    @Override // com.bytedance.ies.sdk.widgets.DataCenter, androidx.lifecycle.ViewModel
    public void onCleared() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        super.onCleared();
        ALogger.m15797i("DATA_CENTER", "DataCenter onCleared();");
    }

    public static LinkCrossRoomDataHolder LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 2);
        if (proxy.isSupported) {
            return (LinkCrossRoomDataHolder) proxy.result;
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LJLL.get(LJLLI);
        if (linkCrossRoomDataHolder == null) {
            LIZIZ.LJI();
            return LIZIZ;
        }
        return linkCrossRoomDataHolder;
    }

    public final void LJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        this.LJJJZ = false;
        this.LJJLIIIJ = null;
        this.LJJLIIIJILLIZJL = "";
        this.LJJLIIIJJI = "";
        this.LJJLIIIJJIZ = 0L;
        this.LJJLIIIJL = 0L;
        this.LJJLI.clear();
        this.LJJLIIIIJ = null;
    }

    public final C8650b LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (C8650b) proxy.result;
        }
        C8650b c8650b = new C8650b();
        c8650b.LIZ = "manual_link";
        c8650b.LIZIZ = this.LIZLLL;
        c8650b.LIZJ = this.LJJJLIIL;
        c8650b.LIZLLL = this.LJJJLL;
        c8650b.LJFF = this.LJJLIIIJLLLLLLLZ;
        c8650b.LJI = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ();
        c8650b.f27822LJ = this.LJJJJZI;
        c8650b.LJII = 0;
        c8650b.LJIIIIZZ = 0L;
        return c8650b;
    }

    @Override // com.bytedance.android.live.linkpk.AbstractC4254a
    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        this.LJJIJIL.LIZ();
        this.LJJZZI = false;
        this.LJLIIL = false;
        this.LJJZ = false;
        this.LJJZZIII = false;
        this.LJL = false;
        this.LJLIIIL = false;
        this.LJLI = false;
        this.LJJIJIIJI = null;
        this.LJJIJIIJIL = 0;
        this.LJJJJIZL = null;
        this.LJJIII = false;
        this.LJJIIZ = false;
        this.LJJII = false;
        this.LJJ = false;
        this.LJJI = false;
        this.LIZLLL = 0L;
        this.f26249LJ = 0L;
        this.LJLJLJ = false;
        this.LJLJLLL = false;
        this.LJJIJL = false;
        this.LJLIL = null;
        this.LJLILLLLZI = null;
        this.LJIILL = null;
        this.LJIIIIZZ = null;
        this.LJFF = 0L;
        this.LJIIIZ = false;
        this.LJIIJ = false;
        this.LIZJ = false;
        this.LJIIJJI = 0;
        this.LJIIL = "";
        this.LJJIL.clear();
        this.LJIILIIL = 0L;
        this.LJIIZILJ = 0L;
        this.LJIJ = 0;
        this.LJIJI = "";
        this.LJIJJ = 0L;
        this.LJJJ = null;
        this.LJJJJL = null;
        this.LJJJJJ = false;
        this.LJJJJJL = 0L;
        this.LJJIZ = false;
        this.LJJLIIIJLLLLLLLZ = "";
        this.LJJJJLI = "normal";
        this.LJJJJLL = false;
        this.LJJJJZI = 1;
        this.LJJJLIIL = 0L;
        this.LJJJLL = "";
        Map<String, Long> map = this.LJJIIZI;
        if (map != null) {
            map.clear();
        }
        this.LJJIJ.clear();
        this.LJJJIL.clear();
        this.LJJLJLI = 0L;
        this.LJJLJ = "";
        this.LJJJJ = false;
        this.LJJJJI = false;
        this.LJLLILLLL = 0;
        this.LJJLL = false;
        this.LJJJLZIJ = false;
        this.LJJJZ = false;
        this.LJJL = false;
        this.LJJLIIIJ = null;
        this.LJJLIIIJILLIZJL = "";
        this.LJJLIIIJJI = "";
        this.LJJLIIIJJIZ = 0L;
        this.LJJLIIIJL = 0L;
        this.LJJLI.clear();
        this.LJJLIIIIJ = null;
        this.LJLJJL = 0;
        LongSparseArray<String> longSparseArray = this.LJLJI;
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
        LongSparseArray<String> longSparseArray2 = this.LJLJJI;
        if (longSparseArray2 != null) {
            longSparseArray2.clear();
        }
        if (LiveConfigSettingKeys.SHOW_LINK_CROSS_ROOM_RESET_STACKTRACE.getValue().booleanValue()) {
            ALogger.m15794w("ttlive_pk", "LinkCrossRoomDataHolder.reset", new IllegalStateException());
        }
        this.LJLJL = null;
        this.LJLJJLL = null;
    }

    public final C8656i LJIIIZ() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (C8656i) proxy.result;
        }
        String str2 = "random_pk";
        String str3 = "anchor";
        if (this.LJIIJJI > 0) {
            AbstractC4256d LJIIL = ((IInteractService) ServiceManager.getService(IInteractService.class)).getPkService().LJIIL();
            int i = this.LJIJJLI;
            if (i == 0) {
                str2 = "manual_pk";
            } else if (i != 1) {
                if (i == 3) {
                    str2 = "match_bell";
                } else if (i == 100) {
                    str2 = "npk";
                } else {
                    str2 = "";
                }
            }
            if (LJIIL instanceof AbstractC4256d.C4258b) {
                str2 = str3;
            }
        } else {
            if (this.LJJ) {
                str3 = "audience";
            }
            if (this.LJIJJLI != 1) {
                str2 = str3;
            }
        }
        C8656i c8656i = new C8656i();
        c8656i.LIZIZ = this.LIZLLL;
        c8656i.LIZJ = this.LJFF;
        c8656i.LIZLLL = this.LJIIJJI;
        c8656i.f27824LJ = str2;
        c8656i.LJI = this.f26249LJ;
        c8656i.LJIIJJI = this.LJJIJLIJ ? 1 : 0;
        c8656i.LJII = this.LJIIL;
        c8656i.LJIIJ = this.LJJJJLI;
        c8656i.LJIIL = this.LJJLIIIJLLLLLLLZ;
        Boolean valueOf = Boolean.valueOf(this.LJJI);
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{valueOf}, c8656i, C8656i.LIZ, false, 1);
        if (proxy2.isSupported) {
            return (C8656i) proxy2.result;
        }
        if (valueOf.booleanValue()) {
            str = "1";
        } else {
            str = "0";
        }
        c8656i.LJIIIZ = str;
        return c8656i;
    }

    @Override // com.bytedance.android.live.linkpk.AbstractC4254a
    public final void LIZ(int i) {
        this.LJIILJJIL = i;
    }

    @Override // com.bytedance.android.live.linkpk.AbstractC4254a
    public final void LIZIZ(int i) {
        this.LJIJ = i;
    }

    @Override // com.bytedance.android.live.linkpk.AbstractC4254a
    public final void LIZJ(int i) {
        this.LJLLILLLL = i;
    }

    @Override // com.bytedance.android.live.linkpk.AbstractC4254a
    public final void LIZ(long j) {
        this.LIZLLL = j;
    }

    @Override // com.bytedance.android.live.linkpk.AbstractC4254a
    public final void LIZIZ(String str) {
        this.LJIILL = str;
    }

    @Override // com.bytedance.android.live.linkpk.AbstractC4254a
    public final void LIZJ(String str) {
        this.LJIJI = str;
    }

    public static void LIZIZ(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, null, LIZ, true, 3).isSupported || LJLL.get(j) == null) {
            return;
        }
        LJLL.remove(j);
    }

    public final void LIZLLL(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LJJLIIIJLLLLLLLZ = str;
        AbstractC8644i LIZ2 = C4574547f.LIZ().LIZ(Room.class);
        if (LIZ2 != null) {
            LIZ2.LIZ("request_id", str);
        }
    }

    public final void LIZ(C79112HGo c79112HGo) {
        C79112HGo c79112HGo2;
        if (PatchProxy.proxy(new Object[]{c79112HGo}, this, LIZ, false, 8).isSupported) {
            return;
        }
        if (LiveConfigSettingKeys.MULTI_ANCHOR_FORWARD_OPT_EANBLE.getValue().booleanValue() && c79112HGo != null && c79112HGo.LIZJ != null && (c79112HGo2 = this.LJLJJLL) != null) {
            c79112HGo2.LIZJ.putAll(c79112HGo.LIZJ);
        } else {
            this.LJLJJLL = c79112HGo;
        }
    }

    @Override // com.bytedance.android.live.linkpk.AbstractC4254a
    public final void LIZ(String str) {
        this.LJIILL = str;
    }

    public final LinkCrossRoomDataHolder LIZ(C4281b c4281b, Room room) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4281b, room}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (LinkCrossRoomDataHolder) proxy.result;
        }
        if (c4281b == null) {
            return this;
        }
        if (c4281b.LIZ > 0) {
            this.LIZLLL = c4281b.LIZ;
            this.LIZJ = true;
        }
        if (c4281b.LIZLLL != null) {
            Iterator<C8720d> it = c4281b.LIZLLL.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C8720d next = it.next();
                if (room.getOwner().getId() != next.LIZ) {
                    this.LJFF = next.LIZ;
                    break;
                }
            }
        }
        C8721e c8721e = c4281b.LIZJ;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c8721e}, this, LIZ, false, 12);
        if (proxy2.isSupported) {
            Object obj = proxy2.result;
        } else if (c8721e != null) {
            if (c8721e.LIZIZ > 0) {
                this.LIZLLL = c8721e.LIZIZ;
            }
            if (c8721e.LJFF > 0) {
                this.f26249LJ = c8721e.LJFF;
            }
            if (c8721e.LIZJ > 0) {
                this.LJIIJJI = c8721e.LIZJ;
            }
            if (c8721e.LIZLLL > 0) {
                this.LJIILIIL = c8721e.LIZLLL;
            }
            if (!StringUtils.isEmpty(c8721e.f6831LJ)) {
                this.LJIIL = c8721e.f6831LJ;
            }
            this.LJIJJLI = (int) c8721e.LJI;
            return this;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r13.getOwner() != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (android.text.TextUtils.isEmpty(r13.getEnterLogId()) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
        p003X.C2IN.LIZIZ().LIZIZ("ttlive_room", p002O.C0002O.m25086C("owner is null, logId = ", r13.getEnterLogId()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
        if (r13 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder LIZ(com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo r12, com.bytedance.android.livesdkapi.depend.model.live.Room r13) {
        /*
            r11 = this;
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r4 = 0
            r2[r4] = r12
            r5 = 1
            r2[r5] = r13
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder.LIZ
            r0 = 10
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r11, r1, r4, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r1.result
            com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder r0 = (com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder) r0
            return r0
        L1a:
            if (r12 != 0) goto L1d
            return r11
        L1d:
            long r0 = r12.LIZIZ
            r9 = 0
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 <= 0) goto L2b
            long r0 = r12.LIZIZ
            r11.LIZLLL = r0
            r11.LIZJ = r5
        L2b:
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.LinkMicBattleScore> r0 = r12.f28141LJ
            if (r0 == 0) goto L7c
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.LinkMicBattleScore> r0 = r12.f28141LJ
            java.util.Iterator r8 = r0.iterator()
        L35:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lc8
            java.lang.Object r3 = r8.next()
            com.bytedance.android.livesdkapi.depend.model.live.LinkMicBattleScore r3 = (com.bytedance.android.livesdkapi.depend.model.live.LinkMicBattleScore) r3
            com.bytedance.android.live.base.model.user.User r0 = r13.getOwner()
            if (r0 == 0) goto L35
            com.bytedance.android.live.base.model.user.User r0 = r13.getOwner()
            long r6 = r0.getId()
            long r0 = r3.userId
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 == 0) goto L35
            long r0 = r3.userId
            r11.LJFF = r0
        L59:
            com.bytedance.android.live.base.model.user.User r0 = r13.getOwner()
            if (r0 != 0) goto L7c
            java.lang.String r0 = r13.getEnterLogId()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L7c
            X.2IN r2 = p003X.C2IN.LIZIZ()
            java.lang.String r1 = "owner is null, logId = "
            java.lang.String r0 = r13.getEnterLogId()
            java.lang.String r1 = p002O.C0002O.m25086C(r1, r0)
            java.lang.String r0 = "ttlive_room"
            r2.LIZIZ(r0, r1)
        L7c:
            com.bytedance.android.livesdkapi.depend.model.live.LinkMicBattleSetting r3 = r12.LIZLLL
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r4] = r3
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder.LIZ
            r0 = 13
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r11, r1, r4, r0)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto Lc7
            if (r3 == 0) goto Lc7
            long r1 = r3.channelId
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto L9a
            long r0 = r3.channelId
            r11.LIZLLL = r0
        L9a:
            long r1 = r3.battleId
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto La4
            long r0 = r3.battleId
            r11.f26249LJ = r0
        La4:
            int r0 = r3.duration
            if (r0 <= 0) goto Lac
            int r0 = r3.duration
            r11.LJIIJJI = r0
        Lac:
            long r1 = r3.startTimeMs
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto Lb6
            long r0 = r3.startTimeMs
            r11.LJIILIIL = r0
        Lb6:
            java.lang.String r0 = r3.theme
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r0 != 0) goto Lc2
            java.lang.String r0 = r3.theme
            r11.LJIIL = r0
        Lc2:
            long r1 = r3.matchType
            int r0 = (int) r1
            r11.LJIJJLI = r0
        Lc7:
            return r11
        Lc8:
            if (r13 == 0) goto L7c
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder.LIZ(com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo, com.bytedance.android.livesdkapi.depend.model.live.Room):com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder");
    }

    public static LinkCrossRoomDataHolder LIZ(long j, ViewModelProvider viewModelProvider, LifecycleOwner lifecycleOwner) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), viewModelProvider, lifecycleOwner}, null, LIZ, true, 1);
        if (proxy.isSupported) {
            return (LinkCrossRoomDataHolder) proxy.result;
        }
        LIZIZ(j);
        LJLLI = j;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = (LinkCrossRoomDataHolder) viewModelProvider.get(LinkCrossRoomDataHolder.class);
        linkCrossRoomDataHolder.lifecycleOwner = lifecycleOwner;
        LJLL.put(j, linkCrossRoomDataHolder);
        return linkCrossRoomDataHolder;
    }
}
