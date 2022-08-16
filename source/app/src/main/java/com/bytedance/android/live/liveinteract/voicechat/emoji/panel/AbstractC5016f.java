package com.bytedance.android.live.liveinteract.voicechat.emoji.panel;

import android.view.View;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.H0H;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.emoji.panel.f */
/* loaded from: classes3.dex */
public abstract class AbstractC5016f {
    public static ChangeQuickRedirect LIZIZ;
    public boolean LIZ;
    public final H0H LIZJ;
    public String LIZLLL = "";

    static {
        Covode.recordClassIndex(31190);
    }

    public abstract int LIZ();

    public abstract void LIZ(View view);

    public void LIZ(HSImageView hSImageView) {
        if (PatchProxy.proxy(new Object[]{hSImageView}, this, LIZIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(hSImageView);
    }

    public abstract String LIZIZ();

    /* renamed from: LJ */
    public int mo15649LJ() {
        return 0;
    }

    public Object LJFF() {
        return null;
    }

    public boolean LIZJ() {
        return this.LIZ;
    }

    public String LIZLLL() {
        return this.LIZLLL;
    }

    public AbstractC5016f(H0H h0h) {
        C106862S5w.LIZ(h0h);
        this.LIZJ = h0h;
    }
}
