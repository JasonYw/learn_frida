package com.bytedance.android.live.effect.p329a;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.view.SimpleDraweeView;

/* renamed from: com.bytedance.android.live.effect.a.a$b */
/* loaded from: classes5.dex */
public class a$b extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final View LIZIZ;
    public View LIZJ;
    public SimpleDraweeView LIZLLL;

    /* renamed from: LJ */
    public TextView f26209LJ;
    public View LJFF;

    static {
        Covode.recordClassIndex(24289);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJFF.setVisibility(4);
    }

    public a$b(View view) {
        super(view);
        this.LIZJ = view.findViewById(2131168140);
        this.LIZLLL = (SimpleDraweeView) view.findViewById(2131178617);
        this.f26209LJ = (TextView) view.findViewById(2131172009);
        this.LIZIZ = view.findViewById(2131165240);
        this.LJFF = view.findViewById(2131178222);
    }
}
