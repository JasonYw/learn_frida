package com.bytedance.android.live.liveinteract.videotalk.adapter;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.bid.AbstractC4289e;
import com.bytedance.android.live.liveinteract.bid.C4287a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p345a.C4300c;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p353ui.SeatAnimationView;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p354vm.C4378a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.C4369e;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.C4377t;
import com.bytedance.android.live.liveinteract.multianchor.model.LinkmicPositionItem;
import com.bytedance.android.live.liveinteract.plantform.model.C4816k;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.model.MicPosTagInfo;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah;
import com.bytedance.android.live.liveinteract.videotalk.quickinteract.AbstractC4936a;
import com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.p390ui.SelfDisciplineEndView;
import com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.p390ui.SelfDisciplineTimerView;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.p517u.AbstractC6302f;
import com.bytedance.android.livesdk.chatroom.p517u.C6307m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.audio.VoiceLiveTheme;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413392Xt;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C77739Gkn;
import p003X.C78746H2m;
import p003X.C78836H5y;
import p003X.C79007HCn;
import p003X.C79242HLo;
import p003X.C79250HLw;
import p003X.C80668Hqw;
import p003X.C80681Hr9;
import p003X.C80723Hrp;
import p003X.C80731Hrx;
import p003X.C80890HuW;
import p003X.C80927Hv7;
import p003X.C80971Hvp;
import p003X.C81097Hxr;
import p003X.HDJ;
import p003X.IQV;
import p003X.LK1;
import p003X.LK5;
import p003X.M0Q;
import p003X.View$OnAttachStateChangeListenerC80676Hr4;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.adapter.s */
/* loaded from: classes3.dex */
public class C4849s extends AbstractC4847b {
    public static ChangeQuickRedirect LIZLLL;
    public final HDJ LIZ;
    public final ArrayList<LinkmicPositionItem> LIZIZ;
    public boolean LIZJ;

    /* renamed from: LJ */
    public final AbstractC4848n f26437LJ;
    public boolean LJFF;
    public VoiceLiveTheme LJI;
    public boolean LJII;
    public final C78746H2m LJIIIIZZ;
    public final int LJIIIZ;
    public List<? extends LinkPlayerInfo> LJIIJ;
    public Map<String, ? extends View> LJIIJJI;
    public boolean LJIIL;
    public C4300c LJIILIIL;
    public int LJIILJJIL;
    public final C4377t LJIILL;
    public final C4369e LJIILLIIL;
    public C80971Hvp LJIJI;
    public final int LJIJJ;
    public boolean LJIJJLI;
    public static final C81097Hxr LJIJ = new C81097Hxr((byte) 0);
    public static final String LJIIZILJ = "https://lf3-webcastcdn-tos.douyinstatic.com/obj/live-android/chat_room_invite_anim_v2.webp";

    public void LIZJ(List<LinkPlayerInfo> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZLLL, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4847b
    public final List<LinkPlayerInfo> LIZ() {
        return this.LJIIJ;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4847b
    /* renamed from: LJ */
    public final C80971Hvp mo15693LJ() {
        return this.LJIJI;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4847b
    public final void LIZ(C80971Hvp c80971Hvp) {
        if (PatchProxy.proxy(new Object[]{c80971Hvp}, this, LIZLLL, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(c80971Hvp);
        this.LJIJI = c80971Hvp;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4847b
    public final void LIZ(HashMap<String, Boolean> hashMap) {
        HDJ hdj;
        if (PatchProxy.proxy(new Object[]{hashMap}, this, LIZLLL, false, 21).isSupported) {
            return;
        }
        C106862S5w.LIZ(hashMap);
        int size = this.LJIIJ.size();
        for (int i = 0; i < size; i++) {
            LinkPlayerInfo linkPlayerInfo = this.LJIIJ.get(i);
            String LIZLLL2 = linkPlayerInfo.LIZLLL();
            LIZLLL2.toString();
            boolean areEqual = Intrinsics.areEqual(hashMap.get(LIZLLL2), Boolean.TRUE);
            if (!TextUtils.isEmpty(linkPlayerInfo.LIZLLL()) && !TextUtils.equals(linkPlayerInfo.LIZLLL(), "0") && areEqual != linkPlayerInfo.LJJJJ) {
                if (linkPlayerInfo.LJJJJ > 0 && linkPlayerInfo.LJIIL != 0 && Intrinsics.areEqual(linkPlayerInfo.LIZLLL(), C79007HCn.LJII().LIZLLL) && (hdj = this.LIZ) != null && hdj.LIZ(linkPlayerInfo.LIZLLL())) {
                    HDJ hdj2 = this.LIZ;
                    User LIZ = linkPlayerInfo.LIZ();
                    long id = LIZ != null ? LIZ.getId() : 0L;
                    String LIZLLL3 = linkPlayerInfo.LIZLLL();
                    Intrinsics.checkNotNullExpressionValue(LIZLLL3, "");
                    HDJ.LIZ(hdj2, id, LIZLLL3, linkPlayerInfo.LJIIL, linkPlayerInfo.LJJLIIIJJIZ, false, 16, null);
                }
                linkPlayerInfo.LJJJJ = areEqual ? 1 : 0;
                this.f26437LJ.LIZ(i, linkPlayerInfo.LJJJJ);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4847b
    public final void LIZ(VoiceLiveTheme voiceLiveTheme) {
        if (PatchProxy.proxy(new Object[]{voiceLiveTheme}, this, LIZLLL, false, 25).isSupported) {
            return;
        }
        C106862S5w.LIZ(voiceLiveTheme);
        this.LJI = voiceLiveTheme;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4847b
    public final void LIZ(List<LinkmicPositionItem> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZLLL, false, 26).isSupported) {
            return;
        }
        this.LIZIZ.clear();
        if (list == null) {
            return;
        }
        this.LIZIZ.addAll(list);
    }

    public final boolean LJII() {
        if (this.LJIILJJIL != 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(29751);
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4847b
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZLLL, false, 14).isSupported) {
            return;
        }
        LIZIZ(CollectionsKt___CollectionsKt.toMutableList((Collection) this.LJIIJ));
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4847b
    public final void LIZJ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZLLL, false, 27).isSupported && this.LIZJ) {
            this.LJII = true;
            notifyDataSetChanged();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4847b
    public final void LIZLLL() {
        if (!PatchProxy.proxy(new Object[0], this, LIZLLL, false, 28).isSupported && this.LIZJ) {
            this.LJII = false;
            notifyDataSetChanged();
        }
    }

    public boolean LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZLLL, false, 15);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (LJII()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZLLL, false, 13);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return this.LJIIJ.size();
    }

    private final Room LJI() {
        C2WC<Room> LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZLLL, false, 19);
        if (proxy.isSupported) {
            return (Room) proxy.result;
        }
        C5923dp c5923dp = (C5923dp) IQV.LIZ(C5923dp.class);
        if (c5923dp != null && (LIZ = c5923dp.LIZ()) != null) {
            return LIZ.LIZ();
        }
        return null;
    }

    private final boolean LJIIIIZZ() {
        List<Integer> emptyList;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ;
        C6307m LIZIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZLLL, false, 20);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C5923dp LIZ = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ == null || (LJJZZIII = LIZ.LJJZZIII()) == null || (LIZIZ = LJJZZIII.LIZIZ()) == null || (LIZIZ2 = LIZIZ.LIZIZ()) == null || (emptyList = LIZIZ2.LIZJ) == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        return emptyList.contains(4);
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4847b
    public final void LIZIZ(boolean z) {
        this.LIZJ = z;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4847b
    public final void LIZ(boolean z) {
        this.LJFF = z;
    }

    public C80668Hqw LIZ(View view) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, this, LIZLLL, false, 4);
        if (proxy.isSupported) {
            return (C80668Hqw) proxy.result;
        }
        C106862S5w.LIZ(view);
        return new C80668Hqw(this, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.proxy(new Object[]{viewHolder}, this, LIZLLL, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(viewHolder);
        if (viewHolder instanceof C80681Hr9) {
            ((C80681Hr9) viewHolder).LJFF();
        } else if (viewHolder instanceof C80668Hqw) {
            C80668Hqw c80668Hqw = (C80668Hqw) viewHolder;
            if (!PatchProxy.proxy(new Object[0], c80668Hqw, C80668Hqw.f7329LJ, false, 12).isSupported && !PatchProxy.proxy(new Object[0], c80668Hqw, C80668Hqw.f7329LJ, false, 13).isSupported) {
                HSImageView hSImageView = c80668Hqw.LJIILLIIL;
                if (hSImageView != null) {
                    hSImageView.setVisibility(8);
                }
                SelfDisciplineEndView selfDisciplineEndView = c80668Hqw.LJIIZILJ;
                if (selfDisciplineEndView != null) {
                    selfDisciplineEndView.setVisibility(8);
                }
                View view = c80668Hqw.LJIILJJIL;
                if (view != null) {
                    view.setVisibility(8);
                }
                SelfDisciplineTimerView selfDisciplineTimerView = c80668Hqw.LJIILL;
                if (selfDisciplineTimerView != null) {
                    selfDisciplineTimerView.setVisibility(8);
                }
            }
        }
        super.onViewDetachedFromWindow(viewHolder);
    }

    private final boolean LIZ(int i) {
        AbstractC413392Xt<C4378a> LIZIZ;
        C4378a LIZIZ2;
        List<Pair<String, Boolean>> list;
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZLLL, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C4287a LIZ = C4287a.LIZJ.LIZ();
        if (LIZ != null && (LIZIZ = LIZ.LIZIZ()) != null && (LIZIZ2 = LIZIZ.LIZIZ()) != null && (list = LIZIZ2.f26297LJ) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (Intrinsics.areEqual(pair.getFirst(), this.LJIIJ.get(i).LIZLLL())) {
                    z = ((Boolean) pair.getSecond()).booleanValue();
                }
            }
        }
        return z;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4847b
    public final void LIZIZ(List<? extends LinkPlayerInfo> list) {
        boolean z;
        if (PatchProxy.proxy(new Object[]{list}, this, LIZLLL, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        List<LinkPlayerInfo> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
        LIZJ(mutableList);
        LIZ(this.LJIIJ, mutableList);
        DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(new C79250HLw(this.LJIIJ, mutableList), true);
        Intrinsics.checkNotNullExpressionValue(calculateDiff, "");
        this.LJIIJ = mutableList;
        for (LinkmicPositionItem linkmicPositionItem : this.LIZIZ) {
            if (linkmicPositionItem.LIZIZ > 0 && linkmicPositionItem.LIZIZ <= this.LJIIJ.size() && linkmicPositionItem.LIZ(this.LJIIJ.get(linkmicPositionItem.LIZIZ - 1))) {
                LinkPlayerInfo linkPlayerInfo = this.LJIIJ.get(linkmicPositionItem.LIZIZ - 1);
                linkPlayerInfo.LJJJJIZL = linkmicPositionItem.LIZJ;
                linkPlayerInfo.LJJJJJ = linkmicPositionItem.LIZLLL;
                linkPlayerInfo.LJJJJJL = linkmicPositionItem.f26349LJ;
            }
        }
        if (LJFF()) {
            C78836H5y.LIZ(this.LJIIJ, this.LJIIL, true);
        }
        calculateDiff.dispatchUpdatesTo(this);
        Iterator<? extends LinkPlayerInfo> it = this.LJIIJ.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().LJJIJIL) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        Room LJI = LJI();
        if (z) {
            if (LJI != null && !this.LJIJJLI) {
                C77739Gkn.LIZIZ.LIZ(LJI, true, LJIIIIZZ());
                this.LJIJJLI = true;
                return;
            }
            return;
        }
        this.LJIJJLI = false;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4847b
    public final int LIZ(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZLLL, false, 23);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int size = this.LJIIJ.size();
        for (int i = 0; i < size; i++) {
            User LIZ = this.LJIIJ.get(i).LIZ();
            if (LIZ != null && LIZ.getId() == j) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        boolean z;
        C80971Hvp c80971Hvp;
        C80971Hvp c80971Hvp2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZLLL, false, 8);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        String LIZLLL2 = this.LJIIJ.get(i).LIZLLL();
        if (!TextUtils.isEmpty(LIZLLL2) && !TextUtils.equals(LIZLLL2, "0")) {
            z = false;
        } else {
            z = true;
        }
        AbstractC4289e LIZIZ = C4287a.LIZJ.LIZIZ();
        if (C4378a.LJJIJIL.LIZJ() && C4378a.LJJIJIL.LIZLLL() && ((this.LJIIJ.get(i).LJJIJLIJ > 0 && (c80971Hvp2 = this.LJIJI) != null && c80971Hvp2.LJFF && LIZ(i) && this.LJIIL) || (LinkmicPositionItem.LinkmicPositionStatus.BIDPAID.ordinal() == this.LJIIJ.get(i).LJJJJIZL && LIZIZ != null && LIZIZ.LJIILIIL() != null))) {
            if (this.LJIIJ.get(i).LJJIJLIJ > 0 && (c80971Hvp = this.LJIJI) != null && c80971Hvp.LJFF && this.LJIIL) {
                this.LJIIJ.get(i).LJJJJIZL = LinkmicPositionItem.LinkmicPositionStatus.BIDPAID.ordinal();
                return 3;
            }
            return 3;
        } else if (C4378a.LJJIJIL.LIZJ() && C4378a.LJJIJIL.LIZLLL() && this.LJIIJ.get(i).LJJIJLIJ > 0 && Intrinsics.areEqual(this.LJIIJ.get(i).LJJIZ, Boolean.TRUE) && this.LJIIL) {
            return 4;
        } else {
            if (!z) {
                return 1;
            }
            LinkPlayerInfo linkPlayerInfo = this.LJIIJ.get(i);
            if (linkPlayerInfo == null || linkPlayerInfo.LIZ() == null || !linkPlayerInfo.LJJIJIL) {
                return 0;
            }
            return 2;
        }
    }

    public C80681Hr9 LIZ(View view, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, Integer.valueOf(i)}, this, LIZLLL, false, 3);
        if (proxy.isSupported) {
            return (C80681Hr9) proxy.result;
        }
        C106862S5w.LIZ(view);
        return new C80681Hr9(this, view, i);
    }

    private final void LIZ(List<? extends LinkPlayerInfo> list, List<? extends LinkPlayerInfo> list2) {
        Object obj;
        Object obj2;
        AbstractC4936a LIZ;
        User LIZ2;
        User LIZ3;
        if (PatchProxy.proxy(new Object[]{list, list2}, this, LIZLLL, false, 18).isSupported) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
                if (linkPlayerInfo != null && (LIZ3 = linkPlayerInfo.LIZ()) != null && LIZ3.getId() == C79242HLo.LIZ()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) obj;
        if (linkPlayerInfo2 != null) {
            int i = linkPlayerInfo2.LJIIJJI;
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    LinkPlayerInfo linkPlayerInfo3 = (LinkPlayerInfo) obj2;
                    if (linkPlayerInfo3 != null && (LIZ2 = linkPlayerInfo3.LIZ()) != null && LIZ2.getId() == C79242HLo.LIZ()) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo4 = (LinkPlayerInfo) obj2;
            if (linkPlayerInfo4 != null && i != linkPlayerInfo4.LJIIJJI && (LIZ = AbstractC4936a.LIZ.LIZ()) != null) {
                LIZ.LIZIZ();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4847b
    public final int LIZIZ(long j, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{0L, str}, this, LIZLLL, false, 22);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int size = this.LJIIJ.size();
        for (int i = 0; i < size; i++) {
            LinkPlayerInfo linkPlayerInfo = this.LJIIJ.get(i);
            User LIZ = linkPlayerInfo.LIZ();
            if (LIZ != null && LIZ.getId() == 0) {
                return i;
            }
            if (!TextUtils.isEmpty(str) && Intrinsics.areEqual(linkPlayerInfo.LIZLLL(), str)) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C80971Hvp c80971Hvp;
        ImageModel imageModel;
        User LIZ;
        if (PatchProxy.proxy(new Object[]{viewHolder, Integer.valueOf(i)}, this, LIZLLL, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(viewHolder);
        if (viewHolder instanceof C80681Hr9) {
            ((C80681Hr9) viewHolder).LIZ(this.LJIIJ.get(i), i);
        } else if (viewHolder instanceof C80668Hqw) {
            ((C80668Hqw) viewHolder).LIZ(this.LJIIJ.get(i), i);
        } else if (viewHolder instanceof C80723Hrp) {
            C80723Hrp c80723Hrp = (C80723Hrp) viewHolder;
            LinkPlayerInfo linkPlayerInfo = this.LJIIJ.get(i);
            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), linkPlayerInfo}, c80723Hrp, C80723Hrp.LIZ, false, 3).isSupported) {
                C106862S5w.LIZ(linkPlayerInfo);
                c80723Hrp.LJFF = i;
                c80723Hrp.f7359LJ = linkPlayerInfo;
                if (i == c80723Hrp.LJII.getItemCount() - 1) {
                    UIUtils.updateLayoutMargin(c80723Hrp.LIZJ, -3, -3, -3, 0);
                    UIUtils.updateLayout(c80723Hrp.itemView, -3, c80723Hrp.LJI);
                } else {
                    UIUtils.updateLayoutMargin(c80723Hrp.LIZJ, -3, -3, -3, LK1.LIZLLL(2));
                    UIUtils.updateLayout(c80723Hrp.itemView, -3, c80723Hrp.LJII.LJIIIZ);
                }
                ImageView imageView = c80723Hrp.LIZIZ;
                LinkPlayerInfo linkPlayerInfo2 = c80723Hrp.f7359LJ;
                if (linkPlayerInfo2 != null && (LIZ = linkPlayerInfo2.LIZ()) != null) {
                    imageModel = LIZ.getAvatarMedium();
                } else {
                    imageModel = null;
                }
                M0Q.LIZIZ(imageView, imageModel);
                c80723Hrp.LIZ();
                c80723Hrp.LIZLLL.LIZ(c80723Hrp.LJII.LJIIJ.get(i), c80723Hrp.LJII.LJIIL);
                c80723Hrp.LIZIZ();
            }
        } else if (viewHolder instanceof C80731Hrx) {
            ((C80731Hrx) viewHolder).LIZ(this.LJIIJ.get(i), i);
        } else if ((viewHolder instanceof View$OnAttachStateChangeListenerC80676Hr4) && (c80971Hvp = this.LJIJI) != null) {
            ((View$OnAttachStateChangeListenerC80676Hr4) viewHolder).LIZ(c80971Hvp, this.LJIIJ.get(i), i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewGroup, Integer.valueOf(i)}, this, LIZLLL, false, 2);
        if (proxy.isSupported) {
            return (RecyclerView.ViewHolder) proxy.result;
        }
        C106862S5w.LIZ(viewGroup);
        if (i == 2) {
            View LIZ = C116971W2r.LIZ(LayoutInflater.from(viewGroup.getContext()), 2131699641, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            UIUtils.updateLayout(LIZ, this.LJIJJ, this.LJIIIZ);
            int LIZJ = this.LJIILIIL.LIZJ() - (this.LJIIIZ * 5);
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{LIZ, Integer.valueOf(LIZJ)}, this, LIZLLL, false, 7);
            if (proxy2.isSupported) {
                return (C80723Hrp) proxy2.result;
            }
            C106862S5w.LIZ(LIZ);
            return new C80723Hrp(this, LIZ, LIZJ);
        } else if (i == 0) {
            View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(viewGroup.getContext()), 2131699640, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            UIUtils.updateLayout(LIZ2, this.LJIJJ, this.LJIIIZ);
            int i2 = this.LJIILJJIL;
            if (i2 != 1 && i2 != 2) {
                if (i2 == 4) {
                    ((TextView) LIZ2.findViewById(2131192869)).setTextSize(1, 8.0f);
                }
            } else {
                TextView textView = (TextView) LIZ2.findViewById(2131192869);
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setTextSize(6.0f);
                ImageView imageView = (ImageView) LIZ2.findViewById(2131192863);
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.getLayoutParams().width = LK5.LIZ(10.0f);
                ImageView imageView2 = (ImageView) LIZ2.findViewById(2131192863);
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.getLayoutParams().height = LK5.LIZ(10.0f);
            }
            return LIZ(LIZ2, this.LJIILIIL.LIZJ() - (this.LJIIIZ * 5));
        } else if (i != 3 && i != 4) {
            View LIZ3 = C116971W2r.LIZ(LayoutInflater.from(viewGroup.getContext()), 2131699613, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
            UIUtils.updateLayout(LIZ3, this.LJIJJ, this.LJIIIZ);
            View findViewById = LIZ3.findViewById(2131176402);
            int i3 = this.LJIJJ;
            UIUtils.updateLayout(findViewById, (int) (i3 * 0.704d), (int) (i3 * 0.704d));
            UIUtils.updateLayout(LIZ3.findViewById(2131176375), (int) (this.LJIJJ * 0.528d), (int) (this.LJIIIZ * 0.528d));
            UIUtils.updateLayout(LIZ3.findViewById(2131180654), (int) (this.LJIJJ * 0.528d), (int) (this.LJIIIZ * 0.528d));
            UIUtils.updateLayout(LIZ3.findViewById(2131179947), (int) (this.LJIJJ * 0.77d), (int) (this.LJIIIZ * 0.77d));
            View findViewById2 = LIZ3.findViewById(2131176389);
            int i4 = this.LJIJJ;
            UIUtils.updateLayout(findViewById2, (int) (i4 * 0.739d), (int) (i4 * 0.739d));
            ((SeatAnimationView) LIZ3.findViewById(2131189091)).LIZ((int) (this.LJIJJ * 0.528d), (int) (this.LJIIIZ * 0.528d));
            int i5 = this.LJIJJ;
            ((SeatAnimationView) LIZ3.findViewById(2131189091)).LIZIZ((int) (i5 * 0.71d), (int) (i5 * 0.71d));
            ((SeatAnimationView) LIZ3.findViewById(2131189091)).LIZLLL((int) (this.LJIJJ * 0.528d), (int) (this.LJIIIZ * 0.528d));
            return LIZ(LIZ3);
        } else {
            View LIZ4 = C116971W2r.LIZ(LayoutInflater.from(viewGroup.getContext()), 2131699639, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(LIZ4, "");
            UIUtils.updateLayout(LIZ4, this.LJIJJ, this.LJIIIZ);
            return LIZ(LIZ4, this.LJIILIIL.LIZJ() - (this.LJIIIZ * 5), i);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.adapter.AbstractC4847b
    public final int LIZ(long j, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str}, this, LIZLLL, false, 24);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (str == null) {
            return -1;
        }
        int size = this.LJIIJ.size();
        for (int i = 0; i < size; i++) {
            LinkPlayerInfo linkPlayerInfo = this.LJIIJ.get(i);
            if (!TextUtils.isEmpty(linkPlayerInfo.LIZLLL()) && !TextUtils.equals(linkPlayerInfo.LIZLLL(), "0") && linkPlayerInfo.LIZ() != null) {
                User LIZ = linkPlayerInfo.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ, "");
                if (LIZ.getId() == j) {
                    this.LJIIJ.get(i).LIZJ = str;
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        LinkPlayerInfo linkPlayerInfo;
        User LIZ;
        User LIZ2;
        long j;
        User LIZ3;
        Map<String, Long> map;
        Long l;
        if (PatchProxy.proxy(new Object[]{viewHolder, Integer.valueOf(i), list}, this, LIZLLL, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(viewHolder, list);
        if (viewHolder instanceof C80723Hrp) {
            onBindViewHolder(viewHolder, i);
        } else if (!Lists.isEmpty(list) && !(viewHolder instanceof C80681Hr9)) {
            if (viewHolder instanceof C80668Hqw) {
                Object obj = list.get(list.size() - 1);
                if (obj != null) {
                    Bundle bundle = (Bundle) obj;
                    C80668Hqw c80668Hqw = (C80668Hqw) viewHolder;
                    LinkPlayerInfo linkPlayerInfo2 = this.LJIIJ.get(i);
                    if (!PatchProxy.proxy(new Object[]{linkPlayerInfo2}, c80668Hqw, C80668Hqw.f7329LJ, false, 15).isSupported) {
                        C106862S5w.LIZ(linkPlayerInfo2);
                        c80668Hqw.LJIJI = linkPlayerInfo2;
                        c80668Hqw.LIZIZ(linkPlayerInfo2.LJJJJI);
                        LinkPlayerInfo linkPlayerInfo3 = c80668Hqw.LJIJI;
                        if (linkPlayerInfo3 != null && (LIZ3 = linkPlayerInfo3.LIZ()) != null) {
                            long id = LIZ3.getId();
                            C78746H2m c78746H2m = c80668Hqw.LJIJJLI.LJIIIIZZ;
                            if (c78746H2m != null && (map = c78746H2m.LIZLLL) != null && (l = map.get(String.valueOf(id))) != null) {
                                j = l.longValue();
                                c80668Hqw.LIZ(j);
                            }
                        }
                        j = 0;
                        c80668Hqw.LIZ(j);
                    }
                    for (String str : bundle.keySet()) {
                        if (str != null) {
                            Long l2 = null;
                            switch (str.hashCode()) {
                                case -1051514844:
                                    if (str.equals("active_name")) {
                                        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, c80668Hqw, C80668Hqw.f7329LJ, false, 54).isSupported) {
                                            break;
                                        } else {
                                            C4369e c4369e = c80668Hqw.LJIJJLI.LJIILLIIL;
                                            if (c4369e != null) {
                                                LinkPlayerInfo linkPlayerInfo4 = c80668Hqw.LJIJJLI.LJIIJ.get(i);
                                                if (linkPlayerInfo4 != null && (LIZ2 = linkPlayerInfo4.LIZ()) != null) {
                                                    l2 = Long.valueOf(LIZ2.getId());
                                                }
                                                if (c4369e.LIZ(l2)) {
                                                    break;
                                                }
                                            }
                                            c80668Hqw.LJIIIZ.LIZ(c80668Hqw.LJIJJLI.LJIIJ.get(i), c80668Hqw.LJIJJLI.LJIIL);
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                case -656849637:
                                    if (str.equals("avatar_medium")) {
                                        if (!PatchProxy.proxy(new Object[0], c80668Hqw, C80668Hqw.f7329LJ, false, 21).isSupported && (linkPlayerInfo = c80668Hqw.LJIJI) != null && (LIZ = linkPlayerInfo.LIZ()) != null) {
                                            M0Q.LIZIZ(c80668Hqw.LJFF, LIZ.getAvatarThumb());
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -648379841:
                                    if (str.equals("mic_dress")) {
                                        c80668Hqw.LJIIJ();
                                        break;
                                    } else {
                                        continue;
                                    }
                                case -39481008:
                                    if (str.equals("silence_status")) {
                                        c80668Hqw.LIZ(bundle.getInt("silence_status"));
                                        break;
                                    } else {
                                        continue;
                                    }
                                case -2260976:
                                    if (str.equals("self_discipline_duration")) {
                                        if (!PatchProxy.proxy(new Object[0], c80668Hqw, C80668Hqw.f7329LJ, false, 55).isSupported) {
                                            c80668Hqw.m23698LJ();
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                case 973184867:
                                    if (str.equals("is_background")) {
                                        c80668Hqw.LIZ(bundle.getBoolean("is_background"), false);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 1127701174:
                                    if (str.equals("mic_pos_tag_info")) {
                                        Serializable serializable = bundle.getSerializable("mic_pos_tag_info");
                                        if (!(serializable instanceof MicPosTagInfo)) {
                                            serializable = null;
                                        }
                                        c80668Hqw.LIZ((MicPosTagInfo) serializable);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 1774723882:
                                    if (str.equals("fan_ticket_str")) {
                                        String string = bundle.getString("fan_ticket_str");
                                        if (!PatchProxy.proxy(new Object[]{c80668Hqw, string, 0L, null, 6, null}, null, C80668Hqw.f7329LJ, true, 17).isSupported) {
                                            c80668Hqw.LIZ(string, 0L, (C4816k) null);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                case 1939875509:
                                    if (str.equals("media_type")) {
                                        c80668Hqw.LIZIZ(bundle.getInt("media_type"));
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                        }
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
            } else if (viewHolder instanceof C80731Hrx) {
                onBindViewHolder(viewHolder, i);
            } else if (viewHolder instanceof View$OnAttachStateChangeListenerC80676Hr4) {
                onBindViewHolder(viewHolder, i);
            }
        } else {
            onBindViewHolder(viewHolder, i);
        }
    }

    public final View$OnAttachStateChangeListenerC80676Hr4 LIZ(View view, int i, int i2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZLLL, false, 5);
        if (proxy.isSupported) {
            return (View$OnAttachStateChangeListenerC80676Hr4) proxy.result;
        }
        C106862S5w.LIZ(view);
        if (i2 == 3) {
            return new View$OnAttachStateChangeListenerC80676Hr4(view, this, new C80890HuW(this), i);
        }
        return new C80731Hrx(view, this, new C80927Hv7(this), i);
    }

    public C4849s(List<? extends LinkPlayerInfo> list, AbstractC4848n abstractC4848n, Map<String, ? extends View> map, boolean z, C4300c c4300c, int i, C4377t c4377t, C4369e c4369e) {
        HDJ hdj;
        C106862S5w.LIZ(list, abstractC4848n, map, c4300c);
        this.LJIIJ = list;
        this.LJIIJJI = map;
        this.LJIIL = z;
        this.LJIILIIL = c4300c;
        this.LJIILJJIL = i;
        this.LJIILL = c4377t;
        this.LJIILLIIL = c4369e;
        this.f26437LJ = abstractC4848n;
        AbstractC4767ah LIZ = AbstractC4767ah.LIZIZ.LIZ();
        if (LIZ != null) {
            hdj = LIZ.LJIILJJIL();
        } else {
            hdj = null;
        }
        this.LIZ = hdj;
        this.LIZIZ = new ArrayList<>();
        this.LJIIIIZZ = C78746H2m.LJI.LIZ();
        this.LJIJI = new C80971Hvp();
        this.LJIJJ = this.LJIILIIL.LIZ();
        this.LJIIIZ = this.LJIILIIL.LIZIZ();
    }

    public /* synthetic */ C4849s(List list, AbstractC4848n abstractC4848n, Map map, boolean z, C4300c c4300c, int i, C4377t c4377t, C4369e c4369e, int i2) {
        this(list, abstractC4848n, map, z, c4300c, 0, c4377t, c4369e);
    }
}
