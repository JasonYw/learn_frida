package com.bytedance.android.annie.lynx;

import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.android.annie.api.card.IHybridComponent;
import com.bytedance.android.annie.api.resource.AnnieResType;
import com.bytedance.android.annie.card.base.AbstractC2599d;
import com.bytedance.android.annie.log.LogLevel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.C13039ag;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.LynxViewBuilder;
import com.lynx.tasm.LynxViewClient;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C99775PRh;
import p003X.C99777PRj;

/* renamed from: com.bytedance.android.annie.lynx.c */
/* loaded from: classes7.dex */
public class C2607c implements AbstractC2599d {
    public static ChangeQuickRedirect LIZ;
    public final AbstractC2599d LIZIZ;

    static {
        Covode.recordClassIndex(10824);
    }

    public C2607c() {
        this(null, 1);
    }

    public void LIZ(String str, String str2, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, str2, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
    }

    public void LIZ(LynxViewBuilder lynxViewBuilder) {
        if (PatchProxy.proxy(new Object[]{lynxViewBuilder}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(lynxViewBuilder);
        if (this.LIZIZ != null) {
            return;
        }
        LIZ("on before lynx instance created");
    }

    public void LIZ(LynxView lynxView) {
        if (PatchProxy.proxy(new Object[]{lynxView}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(lynxView);
        if (this.LIZIZ != null) {
            return;
        }
        LIZ("on lynx instance created");
    }

    public void LIZ(LynxView lynxView, LynxViewClient.ScrollInfo scrollInfo) {
        if (PatchProxy.proxy(new Object[]{lynxView, scrollInfo}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(lynxView);
        if (this.LIZIZ != null) {
            return;
        }
        LIZ("on scroll start, info " + scrollInfo);
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public void LIZ(C13039ag c13039ag) {
        if (PatchProxy.proxy(new Object[]{c13039ag}, this, LIZ, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(c13039ag);
        AbstractC2599d abstractC2599d = this.LIZIZ;
        if (abstractC2599d == null) {
            return;
        }
        abstractC2599d.LIZ(c13039ag);
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public void LIZ(JSONObject jSONObject, C13039ag c13039ag) {
        if (PatchProxy.proxy(new Object[]{jSONObject, c13039ag}, this, LIZ, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(jSONObject, c13039ag);
        AbstractC2599d abstractC2599d = this.LIZIZ;
        if (abstractC2599d == null) {
            return;
        }
        abstractC2599d.LIZ(jSONObject, c13039ag);
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 17).isSupported) {
            return;
        }
        C99775PRh.LIZIZ.LIZIZ(new C99777PRj("Annie_Lynx-Lifecycle", LogLevel.INFO, null, str, 4));
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public void LIZ(boolean z) {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 18).isSupported && (abstractC2599d = this.LIZIZ) != null) {
            abstractC2599d.LIZ(z);
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LIZ(String str, AnnieResType annieResType, IHybridComponent.HybridType hybridType, Map<String, Object> map) {
        if (PatchProxy.proxy(new Object[]{str, annieResType, hybridType, map}, this, LIZ, false, 32).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, annieResType, hybridType);
        AbstractC2599d abstractC2599d = this.LIZIZ;
        if (abstractC2599d == null) {
            return;
        }
        abstractC2599d.LIZ(str, annieResType, hybridType, map);
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LIZ() {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 37).isSupported && (abstractC2599d = this.LIZIZ) != null) {
            abstractC2599d.LIZ();
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LIZIZ() {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 38).isSupported && (abstractC2599d = this.LIZIZ) != null) {
            abstractC2599d.LIZIZ();
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LIZJ() {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 39).isSupported && (abstractC2599d = this.LIZIZ) != null) {
            abstractC2599d.LIZJ();
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public void LIZLLL() {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported && (abstractC2599d = this.LIZIZ) != null) {
            abstractC2599d.LIZLLL();
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    /* renamed from: LJ */
    public final void mo15986LJ() {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported && (abstractC2599d = this.LIZIZ) != null) {
            abstractC2599d.mo15986LJ();
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LJFF() {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported && (abstractC2599d = this.LIZIZ) != null) {
            abstractC2599d.LJFF();
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LJI() {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported && (abstractC2599d = this.LIZIZ) != null) {
            abstractC2599d.LJI();
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LJII() {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported && (abstractC2599d = this.LIZIZ) != null) {
            abstractC2599d.LJII();
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LJIIIIZZ() {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported && (abstractC2599d = this.LIZIZ) != null) {
            abstractC2599d.LJIIIIZZ();
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LJIIIZ() {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 25).isSupported && (abstractC2599d = this.LIZIZ) != null) {
            abstractC2599d.LJIIIZ();
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public void LJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        if (this.LIZIZ == null) {
            LIZ("on release");
        }
        AbstractC2599d abstractC2599d = this.LIZIZ;
        if (abstractC2599d != null) {
            abstractC2599d.LJIIJ();
        }
    }

    public C2607c(AbstractC2599d abstractC2599d) {
        this.LIZIZ = abstractC2599d;
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LIZ(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 35).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        AbstractC2599d abstractC2599d = this.LIZIZ;
        if (abstractC2599d != null) {
            abstractC2599d.LIZ(view);
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public void LIZIZ(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 34).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        LIZ("on first screen");
        AbstractC2599d abstractC2599d = this.LIZIZ;
        if (abstractC2599d != null) {
            abstractC2599d.LIZIZ(view);
        }
    }

    public void LIZJ(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        if (this.LIZIZ == null) {
            LIZ("on update data without change");
        }
    }

    public /* synthetic */ C2607c(AbstractC2599d abstractC2599d, int i) {
        this(null);
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public void LIZ(View view, String str) {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[]{view, str}, this, LIZ, false, 30).isSupported && (abstractC2599d = this.LIZIZ) != null) {
            abstractC2599d.LIZ(view, str);
        }
    }

    public void LIZIZ(LynxView lynxView, LynxViewClient.ScrollInfo scrollInfo) {
        if (PatchProxy.proxy(new Object[]{lynxView, scrollInfo}, this, LIZ, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(lynxView);
        if (this.LIZIZ == null) {
            LIZ("on scroll stop, info " + scrollInfo);
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LIZ(View view, Set<String> set) {
        if (PatchProxy.proxy(new Object[]{view, set}, this, LIZ, false, 36).isSupported) {
            return;
        }
        C106862S5w.LIZ(view, set);
        AbstractC2599d abstractC2599d = this.LIZIZ;
        if (abstractC2599d != null) {
            abstractC2599d.LIZ(view, set);
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LIZ(View view, boolean z) {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[]{view, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 27).isSupported && (abstractC2599d = this.LIZIZ) != null) {
            abstractC2599d.LIZ(view, z);
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public void LIZIZ(View view, String str, String str2) {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[]{view, str, str2}, this, LIZ, false, 31).isSupported && (abstractC2599d = this.LIZIZ) != null) {
            abstractC2599d.LIZIZ(view, str, str2);
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public void LIZ(View view, String str, String str2) {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[]{view, str, str2}, this, LIZ, false, 26).isSupported && (abstractC2599d = this.LIZIZ) != null) {
            abstractC2599d.LIZ(view, str, str2);
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public void LIZ(View view, String str, Bitmap bitmap, boolean z) {
        AbstractC2599d abstractC2599d;
        if (!PatchProxy.proxy(new Object[]{view, str, bitmap, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 29).isSupported && (abstractC2599d = this.LIZIZ) != null) {
            abstractC2599d.LIZ(view, str, bitmap, z);
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public final void LIZIZ(String str, AnnieResType annieResType, IHybridComponent.HybridType hybridType, Map<String, Long> map) {
        if (PatchProxy.proxy(new Object[]{str, annieResType, hybridType, map}, this, LIZ, false, 33).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, annieResType, hybridType, map);
        AbstractC2599d abstractC2599d = this.LIZIZ;
        if (abstractC2599d != null) {
            abstractC2599d.LIZIZ(str, annieResType, hybridType, map);
        }
    }

    @Override // com.bytedance.android.annie.card.base.AbstractC2599d
    public void LIZ(View view, boolean z, String str, long j) {
        if (PatchProxy.proxy(new Object[]{view, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, new Long(j)}, this, LIZ, false, 28).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        AbstractC2599d abstractC2599d = this.LIZIZ;
        if (abstractC2599d != null) {
            abstractC2599d.LIZ(view, z, str, j);
        }
    }
}
