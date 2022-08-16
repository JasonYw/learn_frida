package com.bytedance.android.live.broadcastgame.opengame.debug.p295a;

import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.debug.a.d */
/* loaded from: classes5.dex */
public final class C3489d {
    public String LIZ;
    public View.OnClickListener LIZIZ;
    public CompoundButton.OnCheckedChangeListener LIZJ;
    public boolean LIZLLL;

    static {
        Covode.recordClassIndex(20095);
    }

    public C3489d(String str, View.OnClickListener onClickListener) {
        C106862S5w.LIZ(str, onClickListener);
        this.LIZ = "";
        this.LIZ = str;
        this.LIZIZ = onClickListener;
    }

    public C3489d(String str, boolean z, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        C106862S5w.LIZ(str, onCheckedChangeListener);
        this.LIZ = "";
        this.LIZ = str;
        this.LIZLLL = z;
        this.LIZJ = onCheckedChangeListener;
    }
}
