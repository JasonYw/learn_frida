package com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base;

import android.graphics.PointF;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.liveinteract.multianchor.model.LinkmicPositionItem;
import com.bytedance.android.live.liveinteract.plantform.model.C4816k;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.videotalk.quickinteract.C4939e;
import com.bytedance.android.livesdk.chatroom.model.interact.C6156ao;
import com.bytedance.android.livesdk.chatroom.model.interact.C6166j;
import com.bytedance.android.livesdk.message.model.C8852eq;
import com.bytedance.android.livesdkapi.depend.model.live.audio.VoiceLiveTheme;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import p003X.AbstractC80593Hpj;
import p003X.AbstractC80868HuA;
import p003X.AbstractC80883HuP;
import p003X.C106862S5w;
import p003X.C78616Gyw;
import p003X.C80674Hr2;
import p003X.C80678Hr6;
import p003X.C80701HrT;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.l */
/* loaded from: classes3.dex */
public final class C4374l {
    public static ChangeQuickRedirect LIZ;
    public final RecyclerView LIZIZ;
    public final LifecycleOwner LIZJ;

    static {
        Covode.recordClassIndex(26327);
    }

    public final void LIZ(IMessage iMessage, List<? extends LinkPlayerInfo> list) {
        IntRange indices;
        AbstractC80593Hpj abstractC80593Hpj;
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{iMessage, list}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        if (!(iMessage instanceof C8852eq)) {
            return;
        }
        C8852eq c8852eq = (C8852eq) iMessage;
        if (PatchProxy.proxy(new Object[]{c8852eq, list}, this, LIZ, false, 9).isSupported) {
            return;
        }
        ALogger.m15797i("MicSeatLayerManager", "dispatchFriendOnlineMessage");
        if (list == null || (indices = CollectionsKt__CollectionsKt.getIndices(list)) == null) {
            return;
        }
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            RecyclerView recyclerView = this.LIZIZ;
            RecyclerView.ViewHolder viewHolder = null;
            if (recyclerView != null) {
                viewHolder = recyclerView.findViewHolderForAdapterPosition(nextInt);
            }
            if ((viewHolder instanceof AbstractC80593Hpj) && (LIZ2 = (abstractC80593Hpj = (AbstractC80593Hpj) viewHolder).LIZ()) != null && LIZ2.LIZLLL() != null) {
                C4372d LIZ3 = abstractC80593Hpj.LIZ();
                if (LIZ3 == null || PatchProxy.proxy(new Object[]{c8852eq}, LIZ3, C4372d.LIZ, false, 14).isSupported) {
                    return;
                }
                C106862S5w.LIZ(c8852eq);
                AbstractC80868HuA LIZLLL = LIZ3.LIZLLL();
                if (LIZLLL == null) {
                    return;
                }
                LIZLLL.LIZ(c8852eq);
                return;
            }
        }
    }

    public final void LIZ(VoiceLiveTheme voiceLiveTheme, List<LinkPlayerInfo> list, int i) {
        AbstractC80868HuA LIZLLL;
        if (PatchProxy.proxy(new Object[]{voiceLiveTheme, list, Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(voiceLiveTheme, list);
        ALogger.m15797i("MicSeatLayerManager", "onVideoLiveThemeChanged voice");
        RecyclerView recyclerView = this.LIZIZ;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(i) : null;
        if (!(findViewHolderForAdapterPosition instanceof AbstractC80593Hpj)) {
            return;
        }
        AbstractC80593Hpj abstractC80593Hpj = (AbstractC80593Hpj) findViewHolderForAdapterPosition;
        C4372d LIZ2 = abstractC80593Hpj.LIZ();
        if (LIZ2 != null) {
            LIZ2.LIZ(voiceLiveTheme);
        }
        C4372d LIZ3 = abstractC80593Hpj.LIZ();
        if (LIZ3 != null && (LIZLLL = LIZ3.LIZLLL()) != null) {
            LIZLLL.LIZ(list, i);
        }
        LIZLLL(i);
    }

    public final void LIZ(VoiceLiveTheme voiceLiveTheme, int i) {
        AbstractC80868HuA LIZLLL;
        if (PatchProxy.proxy(new Object[]{voiceLiveTheme, Integer.valueOf(i)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(voiceLiveTheme);
        ALogger.m15797i("MicSeatLayerManager", "onVideoLiveThemeChanged video");
        RecyclerView recyclerView = this.LIZIZ;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(i) : null;
        if (!(findViewHolderForAdapterPosition instanceof AbstractC80593Hpj)) {
            return;
        }
        AbstractC80593Hpj abstractC80593Hpj = (AbstractC80593Hpj) findViewHolderForAdapterPosition;
        C4372d LIZ2 = abstractC80593Hpj.LIZ();
        if (LIZ2 != null) {
            LIZ2.LIZ(voiceLiveTheme);
        }
        C4372d LIZ3 = abstractC80593Hpj.LIZ();
        if (LIZ3 != null && (LIZLLL = LIZ3.LIZLLL()) != null) {
            LIZLLL.mo23679a_(i);
        }
        LIZLLL(i);
    }

    public final void LIZ(List<LinkPlayerInfo> list) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        AbstractC80593Hpj abstractC80593Hpj;
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        ALogger.m15797i("MicSeatLayerManager", "onEmptySeatOccupied");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RecyclerView recyclerView = this.LIZIZ;
            if (recyclerView != null && (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i)) != null && (findViewHolderForAdapterPosition instanceof AbstractC80593Hpj) && (LIZ2 = (abstractC80593Hpj = (AbstractC80593Hpj) findViewHolderForAdapterPosition).LIZ()) != null && LIZ2.LIZLLL() != null && list.get(i).LIZ() != null) {
                C4372d LIZ3 = abstractC80593Hpj.LIZ();
                if (LIZ3 == null) {
                    return;
                }
                LIZ3.LIZIZ();
                return;
            }
        }
    }

    public final void LIZ(List<LinkPlayerInfo> list, List<? extends LinkmicPositionItem> list2) {
        boolean z;
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{list, list2}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        ALogger.m15797i("MicSeatLayerManager", "onEmptySeatOccupied, locklist");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RecyclerView recyclerView = this.LIZIZ;
            RecyclerView.ViewHolder viewHolder = null;
            if (recyclerView != null) {
                viewHolder = recyclerView.findViewHolderForAdapterPosition(i);
            }
            boolean z2 = viewHolder instanceof AbstractC80593Hpj;
            if ((!z2 || ((LIZ2 = ((AbstractC80593Hpj) viewHolder).LIZ()) != null && LIZ2.LIZLLL() != null)) && viewHolder != null) {
                if (list2 != null) {
                    while (true) {
                        z = false;
                        for (LinkmicPositionItem linkmicPositionItem : list2) {
                            if (linkmicPositionItem.LIZIZ == i) {
                                if (linkmicPositionItem.LIZJ == LinkmicPositionItem.LinkmicPositionStatus.LOCKED.ordinal()) {
                                    z = true;
                                }
                            }
                        }
                    }
                } else {
                    z = false;
                }
                if (z2 && (list.get(i).LIZ() != null || z)) {
                    C4372d LIZ3 = ((AbstractC80593Hpj) viewHolder).LIZ();
                    if (LIZ3 == null) {
                        return;
                    }
                    LIZ3.LIZIZ();
                    return;
                }
            }
        }
    }

    public final void LIZ(List<LinkPlayerInfo> list, boolean z) {
        AbstractC80593Hpj abstractC80593Hpj;
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{list, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        ALogger.m15797i("MicSeatLayerManager", "setWhenDataRefreshFlag");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RecyclerView recyclerView = this.LIZIZ;
            RecyclerView.ViewHolder viewHolder = null;
            if (recyclerView != null) {
                viewHolder = recyclerView.findViewHolderForAdapterPosition(i);
            }
            if ((viewHolder instanceof AbstractC80593Hpj) && (LIZ2 = (abstractC80593Hpj = (AbstractC80593Hpj) viewHolder).LIZ()) != null && LIZ2.LIZLLL() != null) {
                C4372d LIZ3 = abstractC80593Hpj.LIZ();
                if (LIZ3 == null) {
                    return;
                }
                LIZ3.LIZ(z);
                return;
            }
        }
    }

    public final void LIZ(List<LinkPlayerInfo> list, LinkPlayerInfo linkPlayerInfo) {
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{list, linkPlayerInfo}, this, LIZ, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(list, linkPlayerInfo);
        ALogger.m15797i("MicSeatLayerManager", "setWhenDataRefreshFlag");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RecyclerView recyclerView = this.LIZIZ;
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(i) : null;
            if ((findViewHolderForAdapterPosition instanceof AbstractC80593Hpj) && (LIZ2 = ((AbstractC80593Hpj) findViewHolderForAdapterPosition).LIZ()) != null && !PatchProxy.proxy(new Object[]{linkPlayerInfo}, LIZ2, C4372d.LIZ, false, 20).isSupported) {
                C106862S5w.LIZ(linkPlayerInfo);
                for (AbstractC4373j abstractC4373j : LIZ2.LIZIZ) {
                    if (abstractC4373j instanceof C80678Hr6) {
                        ((C80678Hr6) abstractC4373j).LJIIJJI = linkPlayerInfo;
                    }
                }
            }
        }
    }

    public final void LIZ(String str, long j, C4816k c4816k, int i) {
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{str, new Long(j), c4816k, Integer.valueOf(i)}, this, LIZ, false, 19).isSupported) {
            return;
        }
        RecyclerView recyclerView = this.LIZIZ;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(i) : null;
        if (!(findViewHolderForAdapterPosition instanceof AbstractC80593Hpj) || (LIZ2 = ((AbstractC80593Hpj) findViewHolderForAdapterPosition).LIZ()) == null) {
            return;
        }
        LIZ2.LIZ(str, j, c4816k);
    }

    public final void LIZ(Map<String, Long> map, int i) {
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{map, Integer.valueOf(i)}, this, LIZ, false, 22).isSupported) {
            return;
        }
        C106862S5w.LIZ(map);
        RecyclerView recyclerView = this.LIZIZ;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(i) : null;
        if (!(findViewHolderForAdapterPosition instanceof AbstractC80593Hpj) || (LIZ2 = ((AbstractC80593Hpj) findViewHolderForAdapterPosition).LIZ()) == null) {
            return;
        }
        LIZ2.LIZ(map);
    }

    public final void LIZ(List<? extends C6156ao> list, int i) {
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{list, Integer.valueOf(i)}, this, LIZ, false, 28).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        RecyclerView recyclerView = this.LIZIZ;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(i) : null;
        if (!(findViewHolderForAdapterPosition instanceof AbstractC80593Hpj) || (LIZ2 = ((AbstractC80593Hpj) findViewHolderForAdapterPosition).LIZ()) == null) {
            return;
        }
        LIZ2.LIZIZ(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(List<? extends LinkPlayerInfo> list, C6166j c6166j) {
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{list, c6166j}, this, LIZ, false, 33).isSupported) {
            return;
        }
        C106862S5w.LIZ(list, c6166j);
        List<C6166j.C6167a> list2 = c6166j.LJFF;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RecyclerView recyclerView = this.LIZIZ;
            C6166j.C6167a c6167a = null;
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(i) : null;
            if ((findViewHolderForAdapterPosition instanceof AbstractC80593Hpj) && (LIZ2 = ((AbstractC80593Hpj) findViewHolderForAdapterPosition).LIZ()) != null) {
                if (list2 != null) {
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        C6166j.C6167a c6167a2 = (C6166j.C6167a) next;
                        User LIZ3 = list.get(i).LIZ();
                        if (LIZ3 != null && LIZ3.getId() == c6167a2.LIZIZ) {
                            c6167a = next;
                            break;
                        }
                    }
                    c6167a = c6167a;
                }
                LIZ2.LIZ(c6167a);
            }
        }
    }

    public final void LIZ(List<? extends LinkPlayerInfo> list, C6166j c6166j, boolean z) {
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{list, c6166j, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 35).isSupported) {
            return;
        }
        C106862S5w.LIZ(list, c6166j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RecyclerView recyclerView = this.LIZIZ;
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(i) : null;
            if ((findViewHolderForAdapterPosition instanceof AbstractC80593Hpj) && (LIZ2 = ((AbstractC80593Hpj) findViewHolderForAdapterPosition).LIZ()) != null) {
                LIZ2.LIZ(c6166j, z);
            }
        }
    }

    public final void LIZIZ() {
        RecyclerView recyclerView;
        RecyclerView.Adapter mo25798getAdapter;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 42).isSupported && (recyclerView = this.LIZIZ) != null && (mo25798getAdapter = recyclerView.mo25798getAdapter()) != null) {
            mo25798getAdapter.notifyDataSetChanged();
        }
    }

    public final void LIZ() {
        RecyclerView.ViewHolder viewHolder;
        C4372d LIZ2;
        AbstractC80883HuP LJIIL;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            return;
        }
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView != null) {
            viewHolder = recyclerView.findViewHolderForAdapterPosition(0);
        } else {
            viewHolder = null;
        }
        if ((viewHolder instanceof AbstractC80593Hpj) && (LIZ2 = ((AbstractC80593Hpj) viewHolder).LIZ()) != null && !PatchProxy.proxy(new Object[0], LIZ2, C4372d.LIZ, false, 24).isSupported && (LJIIL = LIZ2.LJIIL()) != null) {
            LJIIL.LIZ();
        }
    }

    public final void LIZIZ(int i) {
        RecyclerView.ViewHolder viewHolder;
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 17).isSupported) {
            return;
        }
        ALogger.m15797i("MicSeatLayerManager", "refreshKtvStatusLabel");
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView != null) {
            viewHolder = recyclerView.findViewHolderForAdapterPosition(i);
        } else {
            viewHolder = null;
        }
        if ((viewHolder instanceof AbstractC80593Hpj) && (LIZ2 = ((AbstractC80593Hpj) viewHolder).LIZ()) != null) {
            LIZ2.LIZJ();
        }
    }

    public final void LIZJ(int i) {
        RecyclerView.ViewHolder viewHolder;
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 24).isSupported) {
            return;
        }
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView != null) {
            viewHolder = recyclerView.findViewHolderForAdapterPosition(i);
        } else {
            viewHolder = null;
        }
        if ((viewHolder instanceof AbstractC80593Hpj) && (LIZ2 = ((AbstractC80593Hpj) viewHolder).LIZ()) != null) {
            LIZ2.m15747LJ();
        }
    }

    public final void LIZLLL(int i) {
        RecyclerView.ViewHolder viewHolder;
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 26).isSupported) {
            return;
        }
        ALogger.m15797i("MicSeatLayerManager", "stopAudioAnimation video");
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView != null) {
            viewHolder = recyclerView.findViewHolderForAdapterPosition(i);
        } else {
            viewHolder = null;
        }
        if ((viewHolder instanceof AbstractC80593Hpj) && (LIZ2 = ((AbstractC80593Hpj) viewHolder).LIZ()) != null) {
            LIZ2.LJII();
        }
    }

    /* renamed from: LJ */
    public final void m15746LJ(int i) {
        RecyclerView.ViewHolder viewHolder;
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 30).isSupported) {
            return;
        }
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView != null) {
            viewHolder = recyclerView.findViewHolderForAdapterPosition(i);
        } else {
            viewHolder = null;
        }
        if ((viewHolder instanceof AbstractC80593Hpj) && (LIZ2 = ((AbstractC80593Hpj) viewHolder).LIZ()) != null) {
            LIZ2.LJIIJJI();
        }
    }

    public final PointF LJFF(int i) {
        RecyclerView.ViewHolder viewHolder;
        C4372d LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 37);
        if (proxy.isSupported) {
            return (PointF) proxy.result;
        }
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView != null) {
            viewHolder = recyclerView.findViewHolderForAdapterPosition(i);
        } else {
            viewHolder = null;
        }
        if (!(viewHolder instanceof AbstractC80593Hpj) || (LIZ2 = ((AbstractC80593Hpj) viewHolder).LIZ()) == null) {
            return null;
        }
        return LIZ2.LJIIIZ();
    }

    public final void LIZ(int i) {
        RecyclerView.ViewHolder viewHolder;
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        ALogger.m15797i("MicSeatLayerManager", "onInviteGuideStart");
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView != null) {
            viewHolder = recyclerView.findViewHolderForAdapterPosition(i);
        } else {
            viewHolder = null;
        }
        if ((viewHolder instanceof AbstractC80593Hpj) && (LIZ2 = ((AbstractC80593Hpj) viewHolder).LIZ()) != null) {
            LIZ2.LIZ(this.LIZJ);
        }
    }

    public final void LIZJ(List<? extends LinkPlayerInfo> list) {
        RecyclerView.ViewHolder viewHolder;
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 39).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RecyclerView recyclerView = this.LIZIZ;
            if (recyclerView != null) {
                viewHolder = recyclerView.findViewHolderForAdapterPosition(i);
            } else {
                viewHolder = null;
            }
            if ((viewHolder instanceof AbstractC80593Hpj) && (LIZ2 = ((AbstractC80593Hpj) viewHolder).LIZ()) != null) {
                LIZ2.LJIILIIL();
            }
        }
    }

    public final void LIZLLL(List<? extends LinkPlayerInfo> list) {
        RecyclerView.ViewHolder viewHolder;
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 41).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RecyclerView recyclerView = this.LIZIZ;
            if (recyclerView != null) {
                viewHolder = recyclerView.findViewHolderForAdapterPosition(i);
            } else {
                viewHolder = null;
            }
            if ((viewHolder instanceof AbstractC80593Hpj) && (LIZ2 = ((AbstractC80593Hpj) viewHolder).LIZ()) != null) {
                LIZ2.LIZIZ(i);
            }
        }
    }

    public final void LIZIZ(List<LinkPlayerInfo> list) {
        AbstractC80593Hpj abstractC80593Hpj;
        C4372d LIZ2;
        C80701HrT c80701HrT;
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        ALogger.m15797i("MicSeatLayerManager", "bindGuestList");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RecyclerView recyclerView = this.LIZIZ;
            RecyclerView.ViewHolder viewHolder = null;
            if (recyclerView != null) {
                viewHolder = recyclerView.findViewHolderForAdapterPosition(i);
            }
            if ((viewHolder instanceof AbstractC80593Hpj) && (LIZ2 = (abstractC80593Hpj = (AbstractC80593Hpj) viewHolder).LIZ()) != null && LIZ2.LIZLLL() != null) {
                C4372d LIZ3 = abstractC80593Hpj.LIZ();
                if (LIZ3 != null && !PatchProxy.proxy(new Object[]{list}, LIZ3, C4372d.LIZ, false, 16).isSupported) {
                    C106862S5w.LIZ(list);
                    AbstractC80868HuA LIZLLL = LIZ3.LIZLLL();
                    if (LIZLLL != null) {
                        LIZLLL.LIZ(list);
                    }
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[0], LIZ3, C4372d.LIZ, false, 46);
                    if (proxy.isSupported) {
                        c80701HrT = (C80701HrT) proxy.result;
                    } else {
                        for (AbstractC4373j abstractC4373j : LIZ3.LIZIZ) {
                            if (abstractC4373j instanceof C80701HrT) {
                                c80701HrT = (C80701HrT) abstractC4373j;
                            }
                        }
                        return;
                    }
                    if (c80701HrT != null && !PatchProxy.proxy(new Object[]{list}, c80701HrT, C80701HrT.LIZ, false, 6).isSupported) {
                        C106862S5w.LIZ(list);
                        c80701HrT.LIZIZ = list;
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    public C4374l(RecyclerView recyclerView, LifecycleOwner lifecycleOwner) {
        this.LIZIZ = recyclerView;
        this.LIZJ = lifecycleOwner;
    }

    public final Integer LIZIZ(C4939e c4939e, int i) {
        RecyclerView.ViewHolder viewHolder;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4939e, Integer.valueOf(i)}, this, LIZ, false, 32);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        C106862S5w.LIZ(c4939e);
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView != null) {
            viewHolder = recyclerView.findViewHolderForAdapterPosition(i);
        } else {
            viewHolder = null;
        }
        if (viewHolder instanceof AbstractC80593Hpj) {
            C4372d LIZ2 = ((AbstractC80593Hpj) viewHolder).LIZ();
            if (LIZ2 == null) {
                return null;
            }
            return LIZ2.LIZIZ(c4939e);
        }
        return -1;
    }

    /* renamed from: LJ */
    public final void m15745LJ(List<? extends LinkPlayerInfo> list, C6166j c6166j) {
        RecyclerView.ViewHolder viewHolder;
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{list, c6166j}, this, LIZ, false, 40).isSupported) {
            return;
        }
        C106862S5w.LIZ(list, c6166j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RecyclerView recyclerView = this.LIZIZ;
            if (recyclerView != null) {
                viewHolder = recyclerView.findViewHolderForAdapterPosition(i);
            } else {
                viewHolder = null;
            }
            if ((viewHolder instanceof AbstractC80593Hpj) && (LIZ2 = ((AbstractC80593Hpj) viewHolder).LIZ()) != null && !PatchProxy.proxy(new Object[]{c6166j}, LIZ2, C4372d.LIZ, false, 55).isSupported) {
                C106862S5w.LIZ(c6166j);
                for (AbstractC4373j abstractC4373j : LIZ2.LIZIZ) {
                    if (abstractC4373j instanceof C80674Hr2) {
                        ((C80674Hr2) abstractC4373j).LIZLLL(c6166j);
                    }
                }
            }
        }
    }

    public final void LIZ(int i, int i2) {
        RecyclerView.ViewHolder viewHolder;
        C4372d LIZ2;
        AbstractC80883HuP LJIIL;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 20).isSupported) {
            return;
        }
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView != null) {
            viewHolder = recyclerView.findViewHolderForAdapterPosition(i2);
        } else {
            viewHolder = null;
        }
        if ((viewHolder instanceof AbstractC80593Hpj) && (LIZ2 = ((AbstractC80593Hpj) viewHolder).LIZ()) != null && !PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, LIZ2, C4372d.LIZ, false, 26).isSupported && (LJIIL = LIZ2.LJIIL()) != null) {
            LJIIL.mo23675b_(i);
        }
    }

    public final void LIZIZ(int i, int i2) {
        RecyclerView.ViewHolder viewHolder;
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 23).isSupported) {
            return;
        }
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView != null) {
            viewHolder = recyclerView.findViewHolderForAdapterPosition(i2);
        } else {
            viewHolder = null;
        }
        if ((viewHolder instanceof AbstractC80593Hpj) && (LIZ2 = ((AbstractC80593Hpj) viewHolder).LIZ()) != null) {
            LIZ2.LIZ(i);
        }
    }

    public final void LIZJ(List<? extends LinkPlayerInfo> list, C6166j c6166j) {
        RecyclerView.ViewHolder viewHolder;
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{list, c6166j}, this, LIZ, false, 36).isSupported) {
            return;
        }
        C106862S5w.LIZ(list, c6166j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RecyclerView recyclerView = this.LIZIZ;
            if (recyclerView != null) {
                viewHolder = recyclerView.findViewHolderForAdapterPosition(i);
            } else {
                viewHolder = null;
            }
            if ((viewHolder instanceof AbstractC80593Hpj) && (LIZ2 = ((AbstractC80593Hpj) viewHolder).LIZ()) != null && !PatchProxy.proxy(new Object[]{c6166j}, LIZ2, C4372d.LIZ, false, 52).isSupported) {
                C106862S5w.LIZ(c6166j);
                for (AbstractC4373j abstractC4373j : LIZ2.LIZIZ) {
                    if (abstractC4373j instanceof C80674Hr2) {
                        ((C80674Hr2) abstractC4373j).LIZIZ(c6166j);
                    }
                }
            }
        }
    }

    public final void LIZLLL(List<? extends LinkPlayerInfo> list, C6166j c6166j) {
        RecyclerView.ViewHolder viewHolder;
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{list, c6166j}, this, LIZ, false, 38).isSupported) {
            return;
        }
        C106862S5w.LIZ(list, c6166j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RecyclerView recyclerView = this.LIZIZ;
            if (recyclerView != null) {
                viewHolder = recyclerView.findViewHolderForAdapterPosition(i);
            } else {
                viewHolder = null;
            }
            if ((viewHolder instanceof AbstractC80593Hpj) && (LIZ2 = ((AbstractC80593Hpj) viewHolder).LIZ()) != null && !PatchProxy.proxy(new Object[]{c6166j}, LIZ2, C4372d.LIZ, false, 53).isSupported) {
                C106862S5w.LIZ(c6166j);
                for (AbstractC4373j abstractC4373j : LIZ2.LIZIZ) {
                    if (abstractC4373j instanceof C80674Hr2) {
                        ((C80674Hr2) abstractC4373j).LIZJ(c6166j);
                    }
                }
            }
        }
    }

    public final void LIZ(C78616Gyw c78616Gyw, int i) {
        RecyclerView.ViewHolder viewHolder;
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{c78616Gyw, Integer.valueOf(i)}, this, LIZ, false, 43).isSupported) {
            return;
        }
        C106862S5w.LIZ(c78616Gyw);
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView != null) {
            viewHolder = recyclerView.findViewHolderForAdapterPosition(i);
        } else {
            viewHolder = null;
        }
        if ((viewHolder instanceof AbstractC80593Hpj) && (LIZ2 = ((AbstractC80593Hpj) viewHolder).LIZ()) != null) {
            LIZ2.LIZ(c78616Gyw);
        }
    }

    public final void LIZJ(List<LinkPlayerInfo> list, boolean z) {
        RecyclerView.ViewHolder viewHolder;
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{list, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        ALogger.m15797i("MicSeatLayerManager", "setWhenDataRefreshFlag");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RecyclerView recyclerView = this.LIZIZ;
            if (recyclerView != null) {
                viewHolder = recyclerView.findViewHolderForAdapterPosition(i);
            } else {
                viewHolder = null;
            }
            if ((viewHolder instanceof AbstractC80593Hpj) && (LIZ2 = ((AbstractC80593Hpj) viewHolder).LIZ()) != null) {
                LIZ2.LIZJ(z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(List<LinkPlayerInfo> list, boolean z) {
        RecyclerView.ViewHolder viewHolder;
        C4372d LIZ2;
        AbstractC80868HuA LIZLLL;
        if (PatchProxy.proxy(new Object[]{list, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 29).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RecyclerView recyclerView = this.LIZIZ;
            if (recyclerView != null) {
                viewHolder = recyclerView.findViewHolderForAdapterPosition(i);
            } else {
                viewHolder = null;
            }
            if ((viewHolder instanceof AbstractC80593Hpj) && (LIZ2 = ((AbstractC80593Hpj) viewHolder).LIZ()) != null && !PatchProxy.proxy(new Object[]{Byte.valueOf((byte) z)}, LIZ2, C4372d.LIZ, false, 35).isSupported && (LIZLLL = LIZ2.LIZLLL()) != null) {
                LIZLLL.LIZ(z);
            }
        }
    }

    public final void LIZ(User user, List<? extends LinkPlayerInfo> list) {
        IntRange intRange;
        RecyclerView.ViewHolder viewHolder;
        AbstractC80593Hpj abstractC80593Hpj;
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{user, list}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(user);
        ALogger.m15797i("MicSeatLayerManager", "onLinkAlertMessage");
        if (list != null) {
            intRange = CollectionsKt__CollectionsKt.getIndices(list);
        } else {
            intRange = null;
        }
        Intrinsics.checkNotNull(intRange);
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first > last) {
            return;
        }
        while (true) {
            RecyclerView recyclerView = this.LIZIZ;
            if (recyclerView != null) {
                viewHolder = recyclerView.findViewHolderForAdapterPosition(first);
            } else {
                viewHolder = null;
            }
            if ((viewHolder instanceof AbstractC80593Hpj) && (LIZ2 = (abstractC80593Hpj = (AbstractC80593Hpj) viewHolder).LIZ()) != null && LIZ2.LIZLLL() != null) {
                C4372d LIZ3 = abstractC80593Hpj.LIZ();
                if (LIZ3 != null && !PatchProxy.proxy(new Object[]{user}, LIZ3, C4372d.LIZ, false, 15).isSupported) {
                    C106862S5w.LIZ(user);
                    AbstractC80868HuA LIZLLL = LIZ3.LIZLLL();
                    if (LIZLLL != null) {
                        LIZLLL.LIZ(user);
                        return;
                    }
                    return;
                }
                return;
            } else if (first != last) {
                first++;
            } else {
                return;
            }
        }
    }

    public final void LIZIZ(List<? extends LinkPlayerInfo> list, C6166j c6166j) {
        RecyclerView.ViewHolder viewHolder;
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{list, c6166j}, this, LIZ, false, 34).isSupported) {
            return;
        }
        C106862S5w.LIZ(list, c6166j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RecyclerView recyclerView = this.LIZIZ;
            if (recyclerView != null) {
                viewHolder = recyclerView.findViewHolderForAdapterPosition(i);
            } else {
                viewHolder = null;
            }
            if ((viewHolder instanceof AbstractC80593Hpj) && (LIZ2 = ((AbstractC80593Hpj) viewHolder).LIZ()) != null && !PatchProxy.proxy(new Object[]{c6166j}, LIZ2, C4372d.LIZ, false, 50).isSupported) {
                C106862S5w.LIZ(c6166j);
                for (AbstractC4373j abstractC4373j : LIZ2.LIZIZ) {
                    if (abstractC4373j instanceof C80674Hr2) {
                        ((C80674Hr2) abstractC4373j).LIZ(c6166j);
                    }
                }
            }
        }
    }

    public final void LIZ(C4939e c4939e, int i) {
        RecyclerView.ViewHolder viewHolder;
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{c4939e, Integer.valueOf(i)}, this, LIZ, false, 31).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4939e);
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView != null) {
            viewHolder = recyclerView.findViewHolderForAdapterPosition(i);
        } else {
            viewHolder = null;
        }
        if ((viewHolder instanceof AbstractC80593Hpj) && (LIZ2 = ((AbstractC80593Hpj) viewHolder).LIZ()) != null) {
            LIZ2.LIZ(c4939e);
        }
    }

    public final void LIZIZ(List<LinkPlayerInfo> list, boolean z) {
        RecyclerView.ViewHolder viewHolder;
        C4372d LIZ2;
        if (PatchProxy.proxy(new Object[]{list, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        ALogger.m15797i("MicSeatLayerManager", "setWhenDataRefreshFlag");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RecyclerView recyclerView = this.LIZIZ;
            if (recyclerView != null) {
                viewHolder = recyclerView.findViewHolderForAdapterPosition(i);
            } else {
                viewHolder = null;
            }
            if ((viewHolder instanceof AbstractC80593Hpj) && (LIZ2 = ((AbstractC80593Hpj) viewHolder).LIZ()) != null) {
                LIZ2.LIZIZ(z);
            }
        }
    }
}
