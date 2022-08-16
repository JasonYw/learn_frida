package com.android.ttcjpaysdk.thirdparty.counter.data;

import com.android.ttcjpaysdk.thirdparty.data.CJPayCard;
import com.android.ttcjpaysdk.thirdparty.data.CJPayUserAgreement;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;

/* renamed from: com.android.ttcjpaysdk.thirdparty.counter.data.d */
/* loaded from: classes17.dex */
public final class C2324d {
    public static ChangeQuickRedirect LIZ;
    public boolean LJIIIIZZ;
    public int LJIIJ;
    public boolean LJIILLIIL;
    public CJPayCard LJIIZILJ;
    public ArrayList<String> LJIJJLI;
    public String LIZIZ = "";
    public String LIZJ = "";
    public String LIZLLL = "";

    /* renamed from: LJ */
    public String f25519LJ = "";
    public String LJFF = "";
    public String LJI = "";
    public String LJII = "";
    public String LJIIIZ = "";
    public String LJIIJJI = "";
    public String LJIIL = "";
    public String LJIILIIL = "";
    public String LJIILJJIL = "";
    public String LJIILL = "";
    public ArrayList<CJPayUserAgreement> LJIJ = new ArrayList<>();
    public String LJIJI = "";
    public String LJIJJ = "";
    public boolean LJIL = false;

    static {
        Covode.recordClassIndex(8234);
    }

    public final boolean LIZ() {
        if (this.LJIIJ == 2) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return "1".equals(this.LIZJ);
    }
}
