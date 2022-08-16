package com.bytedance.android.live.playtogether.reportpanel.adapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.playtogether.reportpanel.adapter.c */
/* loaded from: classes3.dex */
public class C5238c extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(33090);
    }

    public void LIZ(Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(obj);
    }

    public void LIZ(Object obj, boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{obj, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5238c(View view) {
        super(view);
        C106862S5w.LIZ(view);
    }
}
