package com.android.ttcjpaysdk.base.p128d.p129b;

import com.android.ttcjpaysdk.base.network.ICJPayRequest;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.android.ttcjpaysdk.base.d.b.b */
/* loaded from: classes17.dex */
public class C2124b {
    public static ChangeQuickRedirect LIZ;
    public final ArrayList<ICJPayRequest> LIZIZ = new ArrayList<>();

    static {
        Covode.recordClassIndex(6008);
    }

    public final void LIZ() {
        ArrayList<ICJPayRequest> arrayList;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported && (arrayList = this.LIZIZ) != null) {
            Iterator<ICJPayRequest> it = arrayList.iterator();
            while (it.hasNext()) {
                ICJPayRequest next = it.next();
                if (next != null) {
                    next.cancel();
                }
            }
            this.LIZIZ.clear();
        }
    }

    public final void LIZ(ICJPayRequest iCJPayRequest) {
        Boolean bool;
        if (!PatchProxy.proxy(new Object[]{iCJPayRequest}, this, LIZ, false, 1).isSupported && iCJPayRequest != null) {
            ArrayList<ICJPayRequest> arrayList = this.LIZIZ;
            if (arrayList != null) {
                bool = Boolean.valueOf(arrayList.add(iCJPayRequest));
            } else {
                bool = null;
            }
            bool.booleanValue();
        }
    }
}
