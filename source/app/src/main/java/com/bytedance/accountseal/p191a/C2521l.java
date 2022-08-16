package com.bytedance.accountseal.p191a;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C137536ciq;
import p003X.C137544ciy;
import p003X.PIK;

/* renamed from: com.bytedance.accountseal.a.l */
/* loaded from: classes17.dex */
public final class C2521l {
    public static ChangeQuickRedirect LIZ = null;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;

    /* renamed from: LJ */
    public final C137536ciq f25586LJ;
    public static final C137544ciy LJIIZILJ = new C137544ciy((byte) 0);
    public static final String LJFF = LJFF;
    public static final String LJFF = LJFF;
    public static final String LJI = LJI;
    public static final String LJI = LJI;
    public static final String LJII = "params";
    public static final String LJIIIIZZ = LJIIIIZZ;
    public static final String LJIIIIZZ = LJIIIIZZ;
    public static final String LJIIIZ = LJIIIZ;
    public static final String LJIIIZ = LJIIIZ;
    public static final String LJIIJ = LJIIJ;
    public static final String LJIIJ = LJIIJ;
    public static final String LJIIJJI = LJIIJJI;
    public static final String LJIIJJI = LJIIJJI;
    public static final String LJIIL = LJIIL;
    public static final String LJIIL = LJIIL;
    public static final String LJIILIIL = LJIILIIL;
    public static final String LJIILIIL = LJIILIIL;
    public static final String LJIILJJIL = LJIILJJIL;
    public static final String LJIILJJIL = LJIILJJIL;
    public static final String LJIILL = LJIILL;
    public static final String LJIILL = LJIILL;
    public static final int LJIILLIIL = 1;

    static {
        Covode.recordClassIndex(9860);
    }

    public final void LIZ(JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(jSONObject);
        C137536ciq c137536ciq = this.f25586LJ;
        if (c137536ciq != null) {
            String jSONObject2 = LJIIZILJ.LIZ(LJIILLIIL, LJIILIIL, jSONObject, this).toString();
            Intrinsics.checkExpressionValueIsNotNull(jSONObject2, "");
            c137536ciq.LIZ(jSONObject2);
        }
    }

    public C2521l(String str, C137536ciq c137536ciq) {
        C106862S5w.LIZ(str, c137536ciq);
        this.f25586LJ = c137536ciq;
        try {
            if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
                JSONObject jSONObject = new JSONObject(str);
                Integer.valueOf(jSONObject.getInt(LJFF));
                this.LIZIZ = jSONObject.getString(LJI);
                this.LIZJ = jSONObject.getString(LJII);
                jSONObject.getString(LJIIIIZZ);
                this.LIZLLL = jSONObject.getString(LJIIIZ);
            }
        } catch (JSONException e) {
            PIK.LIZ(e);
        }
    }
}
