package com.bytedance.android.live.liveinteract.chatroom.chatroom.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder.o$a;
import com.bytedance.android.live.liveinteract.p382pk.p384ui.PkItemExposeRecyclerView;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4784x;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.interact.model.C6057l;
import com.bytedance.android.livesdk.chatroom.interact.model.GroupRivals;
import com.bytedance.android.livesdk.chatroom.p518ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.log.model.C8657j;
import com.bytedance.android.livesdkapi.depend.live.ILiveRoomService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import me.drakeet.multitype.C35036d;
import p003X.AbstractC78050Gpo;
import p003X.AbstractC79997Hg7;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C4574547f;
import p003X.C79169HIt;
import p003X.C79584HYs;
import p003X.C79771HcT;
import p003X.C79891HeP;
import p003X.C79910Hei;
import p003X.C79919Her;
import p003X.C79968Hfe;

/* loaded from: classes3.dex */
public final class PKRivalsSearchRankListView extends FrameLayout implements AbstractC79997Hg7 {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public PkItemExposeRecyclerView LIZJ;
    public C79891HeP LIZLLL;

    /* renamed from: LJ */
    public C35036d f26302LJ;
    public DataCenter LJFF;
    public C79919Her LJI;
    public GroupRivals.GroupType LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public GroupRivals LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public HashMap LJIILIIL;

    static {
        Covode.recordClassIndex(26526);
    }

    private View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIILIIL == null) {
            this.LJIILIIL = new HashMap();
        }
        View view = (View) this.LJIILIIL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJIILIIL.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LIZ(DataCenter dataCenter, GroupRivals.GroupType groupType, C79919Her c79919Her, boolean z) {
        String str;
        if (PatchProxy.proxy(new Object[]{dataCenter, groupType, c79919Her, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(dataCenter, groupType, c79919Her);
        this.LJFF = dataCenter;
        this.LJII = groupType;
        this.LJI = c79919Her;
        this.LIZLLL = new C79891HeP();
        this.LJIIIIZZ = z;
        C35036d c35036d = this.f26302LJ;
        String str2 = "";
        if (c35036d == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str2);
        }
        C79891HeP c79891HeP = this.LIZLLL;
        if (c79891HeP == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str2);
        }
        DataCenter dataCenter2 = this.LJFF;
        if (dataCenter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str2);
        }
        c35036d.LIZ(o$a.class, new C79968Hfe(c79891HeP, this, dataCenter2));
        TextView textView = (TextView) LIZ(2131184690);
        if (textView != null) {
            GroupRivals.GroupType groupType2 = this.LJII;
            if (groupType2 != null) {
                int i = C79771HcT.LIZ[groupType2.ordinal()];
                if (i == 1) {
                    str = getResources().getString(2131584347);
                } else if (i == 2) {
                    str = getResources().getString(2131584346);
                }
                textView.setText(str);
            }
            str = str2;
            textView.setText(str);
        }
        PkItemExposeRecyclerView pkItemExposeRecyclerView = this.LIZJ;
        if (pkItemExposeRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str2);
        }
        C35036d c35036d2 = this.f26302LJ;
        if (c35036d2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str2);
        }
        pkItemExposeRecyclerView.setAdapter(c35036d2);
        PkItemExposeRecyclerView pkItemExposeRecyclerView2 = this.LIZJ;
        if (pkItemExposeRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str2);
        }
        int i2 = C79771HcT.LIZIZ[groupType.ordinal()];
        if (i2 == 1) {
            str2 = "popularity_rank";
        } else if (i2 == 2) {
            str2 = "hourly_rank";
        }
        pkItemExposeRecyclerView2.setInviteIconPanelType(str2);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        LIZ(getVisibility(), this.LIZIZ, this.LJIIJ);
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        C35036d c35036d = this.f26302LJ;
        if (c35036d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c35036d.notifyDataSetChanged();
    }

    private void LIZJ() {
        MethodCollector.m14708i(1785);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1785);
            return;
        }
        LayoutInflater.from(getContext()).inflate(2131700492, this);
        Intrinsics.checkNotNullExpressionValue(findViewById(2131184691), "");
        View findViewById = findViewById(2131187112);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZJ = (PkItemExposeRecyclerView) findViewById;
        PkItemExposeRecyclerView pkItemExposeRecyclerView = this.LIZJ;
        if (pkItemExposeRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        pkItemExposeRecyclerView.setLayoutManager(new SSLinearLayoutManager(getContext(), 1, false));
        this.f26302LJ = new C35036d();
        MethodCollector.m14707o(1785);
    }

    public PKRivalsSearchRankListView(Context context) {
        super(context);
        MethodCollector.m14708i(1786);
        LIZJ();
        MethodCollector.m14707o(1786);
    }

    private final List<Object> LIZIZ(GroupRivals groupRivals) {
        int i;
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{groupRivals}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        if (((int) groupRivals.LIZ.longValue()) == GroupRivals.GroupType.GroupRivalsSearchPopularityRank.ordinal()) {
            i = 10;
        } else {
            GroupRivals.GroupType.GroupRivalsSearchHourlyRank.ordinal();
            i = 6;
        }
        if (!TextUtils.isEmpty(groupRivals.f26853LJ) && (str = groupRivals.f26853LJ) != null) {
            int hashCode = str.hashCode();
            if (hashCode != -351423754) {
                if (hashCode != 641745480) {
                    if (hashCode == 949970329 && str.equals("hourly_rank_region")) {
                        i = 7;
                    }
                } else if (str.equals("hourly_rank_global")) {
                    i = 6;
                }
            } else if (str.equals("popularity_rank")) {
                i = 10;
            }
        }
        LinkedList linkedList = new LinkedList();
        List<C6057l> list = groupRivals.LIZIZ;
        if (list != null) {
            for (C6057l c6057l : list) {
                o$a o_a = new o$a();
                o_a.LIZ = i;
                o_a.LIZIZ = c6057l;
                o_a.LIZJ = this.LJIIIIZZ;
                linkedList.add(o_a);
            }
        }
        return linkedList;
    }

    public final void LIZ(GroupRivals groupRivals) {
        List<C6057l> list;
        if (PatchProxy.proxy(new Object[]{groupRivals}, this, LIZ, false, 7).isSupported) {
            return;
        }
        this.LJIIJJI = true;
        this.LJIIL = false;
        this.LJIIJ = groupRivals;
        LIZ();
        if (groupRivals != null) {
            list = groupRivals.LIZIZ;
        } else {
            list = null;
        }
        if (list != null && !groupRivals.LIZIZ.isEmpty()) {
            LinearLayout linearLayout = (LinearLayout) LIZ(2131184691);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
            PkItemExposeRecyclerView pkItemExposeRecyclerView = (PkItemExposeRecyclerView) LIZ(2131187112);
            Intrinsics.checkNotNullExpressionValue(pkItemExposeRecyclerView, "");
            pkItemExposeRecyclerView.setVisibility(0);
            C35036d c35036d = this.f26302LJ;
            if (c35036d == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c35036d.LIZJ(LIZIZ(groupRivals));
            C35036d c35036d2 = this.f26302LJ;
            if (c35036d2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c35036d2.notifyDataSetChanged();
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) LIZ(2131184691);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setVisibility(0);
        PkItemExposeRecyclerView pkItemExposeRecyclerView2 = (PkItemExposeRecyclerView) LIZ(2131187112);
        Intrinsics.checkNotNullExpressionValue(pkItemExposeRecyclerView2, "");
        pkItemExposeRecyclerView2.setVisibility(8);
    }

    public PKRivalsSearchRankListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(1787);
        LIZJ();
        MethodCollector.m14707o(1787);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        if (PatchProxy.proxy(new Object[]{view, Integer.valueOf(i)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        super.onVisibilityChanged(view, i);
        LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0119  */
    @Override // p003X.AbstractC79997Hg7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZIZ(int r24, com.bytedance.android.livesdk.chatroom.interact.model.C6057l r25) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.chatroom.chatroom.widget.PKRivalsSearchRankListView.LIZIZ(int, com.bytedance.android.livesdk.chatroom.interact.model.l):void");
    }

    @Override // p003X.AbstractC79997Hg7
    public final void LIZ(int i, C6057l c6057l) {
        long j;
        char c;
        char c2;
        char c3;
        Long l;
        Room room;
        String str;
        Room room2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c6057l}, this, LIZ, false, 10).isSupported) {
            return;
        }
        IService service = ServiceManager.getService(IRoomService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        Room currentRoom = ((ILiveRoomService) service).getCurrentRoom();
        if (currentRoom == null || !C79584HYs.LIZ(2, i, currentRoom.ownerUserId, 0) || !C79584HYs.LIZ(String.valueOf(currentRoom.ownerUserId), 2, i)) {
            return;
        }
        LinkCrossRoomDataHolder.LJII().LJII = i;
        LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
        if (c6057l != null && (room2 = c6057l.LIZIZ) != null) {
            j = room2.ownerUserId;
        } else {
            j = 0;
        }
        LJII.LJJJLIIL = j;
        C79919Her c79919Her = this.LJI;
        if (c79919Her == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        long id = currentRoom.getId();
        if (!PatchProxy.proxy(new Object[]{new Long(id), Integer.valueOf(i), c6057l, ""}, c79919Her, C79919Her.f6899LJ, false, 4).isSupported && !c79919Her.LJJI) {
            c79919Her.LJJI = true;
            if (!c79919Her.LJIL) {
                c79919Her.LIZLLL.LJJJ = c6057l.LIZIZ;
            }
            int LJJIFFI = AbstractC78050Gpo.LIZ().LJJIFFI();
            if (c6057l.LIZJ == null || c6057l.LIZJ.LJIIIZ == null || c6057l.LIZJ.LJIIIZ.isEmpty()) {
                str = "";
            } else {
                str = c6057l.LIZJ.LJIIIZ;
            }
            if (!C79169HIt.LIZIZ(LJJIFFI, 64) && !c79919Her.LJIL) {
                if (AbstractC4784x.LJII.LIZ() != null && AbstractC4784x.LJII.LIZ().LIZIZ() != null && c6057l.LIZIZ != null) {
                    c = 1;
                    c2 = 0;
                    c3 = 2;
                    AbstractC4784x.LJII.LIZ().LIZIZ().LIZ(id, c6057l.LIZIZ.getId(), i, 0, c6057l.LIZIZ.getOwner().getSecUid(), c6057l.LIZIZ, AbstractC80293Hkt.LLJ.LIZ(), AbstractC80293Hkt.LLILZIL.LIZ().intValue(), "", 0L, str, c79919Her.LJIJJLI ? 1 : 0);
                } else {
                    c = 1;
                    c2 = 0;
                    c3 = 2;
                }
            } else {
                c = 1;
                c2 = 0;
                c3 = 2;
                if (AbstractC4782v.LJIIL.LIZ() != null && c6057l.LIZIZ != null) {
                    LinkCrossRoomDataHolder.LJII().LJJLJ = "invite";
                    AbstractC4782v.LJIIL.LIZ().LIZJ().LIZ(id, c6057l.LIZIZ.getId(), i, 0, c6057l.LIZIZ.getOwner().getSecUid(), c6057l.LIZIZ, "", 0, "", 0L, str, c79919Her.LJIJJLI ? 1 : 0);
                }
            }
        } else {
            c = 1;
            c2 = 0;
            c3 = 2;
        }
        Map hashMap = new HashMap();
        hashMap.put("is_oncemore", "0");
        hashMap.put("invitee_list", C79910Hei.LIZIZ.LIZIZ(i));
        hashMap.put("is_recommend_list", "0");
        hashMap.put("pk_description", "routine");
        if (this.LJIIIIZZ) {
            hashMap.put("anchor_connection_type", "invite");
            hashMap.put("connection_type", "manual_link");
            hashMap.put("source", "link_banner");
        } else {
            hashMap.put("source", "pk_banner");
        }
        if (c6057l != null && (room = c6057l.LIZIZ) != null) {
            l = Long.valueOf(room.ownerUserId);
        } else {
            l = null;
        }
        hashMap.put("invitee_id", String.valueOf(l));
        C4574547f LIZ2 = C4574547f.LIZ();
        Object[] objArr = new Object[3];
        C8657j c8657j = new C8657j();
        c8657j.LIZ(300);
        objArr[c2] = c8657j;
        LinkCrossRoomDataHolder LJII2 = LinkCrossRoomDataHolder.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII2, "");
        objArr[c] = LJII2.LJIIIZ();
        objArr[c3] = Room.class;
        LIZ2.LIZ("connection_invite", hashMap, objArr);
    }

    @Override // p003X.AbstractC79997Hg7
    public final void LIZ(C6057l c6057l, int i) {
        if (PatchProxy.proxy(new Object[]{c6057l, Integer.valueOf(i)}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C79919Her c79919Her = this.LJI;
        if (c79919Her == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!PatchProxy.proxy(new Object[]{c6057l, Integer.valueOf(i)}, c79919Her, C79919Her.f6899LJ, false, 5).isSupported) {
            long j = LinkCrossRoomDataHolder.LJII().LIZLLL;
            if (c6057l != null && c6057l.LIZIZ != null) {
                if (!C79169HIt.LIZIZ(AbstractC78050Gpo.LIZ().LJJIFFI(), 64) && !c79919Her.LJIL) {
                    if (AbstractC4784x.LJII.LIZ() != null && AbstractC4784x.LJII.LIZ().LIZIZ() != null) {
                        AbstractC4784x.LJII.LIZ().LIZIZ().LIZ(j, c6057l.LIZIZ.getId(), c6057l.LIZIZ.getOwnerUserId(), c6057l.LIZIZ.getOwner().getSecUid(), 0, "click_item_cancel");
                    }
                } else if (AbstractC4782v.LJIIL.LIZ() != null && AbstractC4782v.LJIIL.LIZ().LIZJ() != null) {
                    AbstractC4782v.LJIIL.LIZ().LIZJ().LIZ(j, c6057l.LIZIZ.getId(), c6057l.LIZIZ.getOwner().getId(), c6057l.LIZIZ.getOwner().getSecUid(), i, "click_item_cancel");
                }
            }
        }
        DataCenter dataCenter = this.LJFF;
        if (dataCenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        dataCenter.put("data_pk_match_state", 0);
    }

    public PKRivalsSearchRankListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1788);
        LIZJ();
        MethodCollector.m14707o(1788);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r0 != 2) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void LIZ(int r11, boolean r12, com.bytedance.android.livesdk.chatroom.interact.model.GroupRivals r13) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.chatroom.chatroom.widget.PKRivalsSearchRankListView.LIZ(int, boolean, com.bytedance.android.livesdk.chatroom.interact.model.GroupRivals):void");
    }
}
