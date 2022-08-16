package com.bytedance.android.live.liveinteract.interact.audience.p359b;

import com.bytedance.android.live.liveinteract.plantform.model.MessageBoardInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import java.util.Map;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.interact.audience.b.a */
/* loaded from: classes3.dex */
public final class C4418a {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public long LIZLLL;

    /* renamed from: LJ */
    public int f26320LJ;
    public long LJFF;
    public long LJII;
    public MessageBoardInfo LJIIIZ;
    public String LIZJ = "apply";
    public int LJI = 2;
    public Map<String, String> LJIIIIZZ = new LinkedHashMap();

    static {
        Covode.recordClassIndex(27066);
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LIZJ = str;
    }
}
