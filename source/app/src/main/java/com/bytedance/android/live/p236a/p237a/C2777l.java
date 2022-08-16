package com.bytedance.android.live.p236a.p237a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import kotlin.Pair;
import p003X.C106862S5w;
import p003X.C421322lq;
import p003X.C421452m3;

/* renamed from: com.bytedance.android.live.a.a.l */
/* loaded from: classes12.dex */
public class C2777l extends C421452m3 {
    public static ChangeQuickRedirect LJFF;
    public static final C421322lq LJIIIZ = new C421322lq((byte) 0);
    public boolean LJI;
    public Disposable LJII;
    public boolean LJIIIIZZ;

    static {
        Covode.recordClassIndex(13797);
    }

    public void LIZ() {
    }

    public boolean LIZ(boolean z) {
        return false;
    }

    public Pair<String, View.OnClickListener> LIZIZ() {
        return null;
    }

    public void LIZ(C2778n c2778n, boolean z) {
        if (PatchProxy.proxy(new Object[]{c2778n, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LJFF, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(c2778n);
        this.LJI = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2777l(String str, String str2, boolean z, boolean z2, boolean z3) {
        super(str, str2, z, z2, z3);
        C106862S5w.LIZ(str, str2);
        this.LJI = z;
        this.LJIIIIZZ = true;
    }

    public /* synthetic */ C2777l(String str, String str2, boolean z, boolean z2, boolean z3, int i) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? true : z3);
    }
}
