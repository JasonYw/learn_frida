package com.amap.api.fence;

import android.app.PendingIntent;
import android.content.Context;
import com.amap.api.location.DPoint;
import com.bytedance.covode.number.Covode;
import com.loc.C15797a;
import com.loc.C15968ej;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class GeoFenceClient {

    /* renamed from: a */
    public Context f22543a;

    /* renamed from: b */
    public C15797a f22544b;

    static {
        Covode.recordClassIndex(4968);
    }

    public GeoFenceClient(Context context) {
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context参数不能为null");
            }
            this.f22543a = context.getApplicationContext();
            this.f22544b = new C15797a(this.f22543a);
        } catch (Throwable th) {
            C15968ej.m10694a(th, "GeoFenceClient", "<init>");
        }
    }

    public void addGeoFence(DPoint dPoint, float f, String str) {
        try {
            this.f22544b.m11435a(dPoint, f, str);
        } catch (Throwable th) {
            C15968ej.m10694a(th, "GeoFenceClient", "addGeoFence round");
        }
    }

    public void addGeoFence(String str, String str2) {
        try {
            this.f22544b.m11431a(str, str2);
        } catch (Throwable th) {
            C15968ej.m10694a(th, "GeoFenceClient", "addGeoFence district");
        }
    }

    public void addGeoFence(String str, String str2, DPoint dPoint, float f, int i, String str3) {
        try {
            this.f22544b.m11430a(str, str2, dPoint, f, i, str3);
        } catch (Throwable th) {
            C15968ej.m10694a(th, "GeoFenceClient", "addGeoFence searche");
        }
    }

    public void addGeoFence(String str, String str2, String str3, int i, String str4) {
        try {
            this.f22544b.m11429a(str, str2, str3, i, str4);
        } catch (Throwable th) {
            C15968ej.m10694a(th, "GeoFenceClient", "addGeoFence searche");
        }
    }

    public void addGeoFence(List<DPoint> list, String str) {
        try {
            this.f22544b.m11426a(list, str);
        } catch (Throwable th) {
            C15968ej.m10694a(th, "GeoFenceClient", "addGeoFence polygon");
        }
    }

    public PendingIntent createPendingIntent(String str) {
        try {
            return this.f22544b.m11433a(str);
        } catch (Throwable th) {
            C15968ej.m10694a(th, "GeoFenceClient", "creatPendingIntent");
            return null;
        }
    }

    public List<GeoFence> getAllGeoFence() {
        List<GeoFence> arrayList = new ArrayList<>();
        try {
            arrayList = this.f22544b.m11425b();
            return arrayList;
        } catch (Throwable th) {
            C15968ej.m10694a(th, "GeoFenceClient", "getGeoFenceList");
            return arrayList;
        }
    }

    public boolean isPause() {
        try {
            return this.f22544b.m11404j();
        } catch (Throwable th) {
            C15968ej.m10694a(th, "GeoFenceClient", "isPause");
            return true;
        }
    }

    public void pauseGeoFence() {
        try {
            this.f22544b.m11407g();
        } catch (Throwable th) {
            C15968ej.m10694a(th, "GeoFenceClient", "pauseGeoFence");
        }
    }

    public void removeGeoFence() {
        try {
            this.f22544b.m11447a();
        } catch (Throwable th) {
            C15968ej.m10694a(th, "GeoFenceClient", "removeGeoFence");
        }
    }

    public boolean removeGeoFence(GeoFence geoFence) {
        try {
            return this.f22544b.m11441a(geoFence);
        } catch (Throwable th) {
            C15968ej.m10694a(th, "GeoFenceClient", "removeGeoFence1");
            return false;
        }
    }

    public void resumeGeoFence() {
        try {
            this.f22544b.m11405i();
        } catch (Throwable th) {
            C15968ej.m10694a(th, "GeoFenceClient", "resumeGeoFence");
        }
    }

    public void setActivateAction(int i) {
        try {
            this.f22544b.m11446a(i);
        } catch (Throwable th) {
            C15968ej.m10694a(th, "GeoFenceClient", "setActivatesAction");
        }
    }

    public void setGeoFenceAble(String str, boolean z) {
        try {
            this.f22544b.m11428a(str, z);
        } catch (Throwable th) {
            C15968ej.m10694a(th, "GeoFenceClient", "setGeoFenceAble");
        }
    }

    public void setGeoFenceListener(GeoFenceListener geoFenceListener) {
        try {
            this.f22544b.m11438a(geoFenceListener);
        } catch (Throwable th) {
            C15968ej.m10694a(th, "GeoFenceClient", "setGeoFenceListener");
        }
    }
}
