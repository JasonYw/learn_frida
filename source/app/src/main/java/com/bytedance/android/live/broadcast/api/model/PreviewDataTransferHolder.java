package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import p003X.C106862S5w;
import p003X.K4C;

/* loaded from: classes5.dex */
public final class PreviewDataTransferHolder implements Serializable {
    public static final K4C Companion = new K4C((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static final long serialVersionUID = 1;
    public PreviewSourceParam previewSourceParam;
    public ArrayList<Integer> paidLiveCreateRights = new ArrayList<>();
    public long ownerIdOfSellTicket = -1;

    static {
        Covode.recordClassIndex(14500);
    }

    public final void LIZ(ArrayList<Integer> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(arrayList);
        this.paidLiveCreateRights = arrayList;
    }
}
