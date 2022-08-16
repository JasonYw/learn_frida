package com.bytedance.android.live.liveinteract.voicechat.ktv;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class AbstractKtvSeatListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* loaded from: classes3.dex */
    public enum SeatListType {
        KTV_HOST,
        NORMAL_GUEST;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(31416);
        }

        public static SeatListType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (SeatListType) (proxy.isSupported ? proxy.result : Enum.valueOf(SeatListType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static SeatListType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (SeatListType[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(31415);
    }

    public abstract int LIZ(long j);

    public abstract List<LinkPlayerInfo> LIZ();

    public abstract void LIZ(List<LinkPlayerInfo> list);
}
