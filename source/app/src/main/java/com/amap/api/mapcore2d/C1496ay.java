package com.amap.api.mapcore2d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.amap.api.interfaces.IMarker;
import com.amap.api.maps2d.model.BitmapDescriptor;
import com.amap.api.maps2d.model.BitmapDescriptorFactory;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.MarkerOptions;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.amap.api.mapcore2d.ay */
/* loaded from: classes19.dex */
public class C1496ay implements AbstractC1462ab {

    /* renamed from: a */
    public static int f22756a;

    /* renamed from: b */
    public int f22757b;

    /* renamed from: c */
    public float f22758c;

    /* renamed from: d */
    public CopyOnWriteArrayList<BitmapDescriptor> f22759d;

    /* renamed from: e */
    public int f22760e;

    /* renamed from: f */
    public String f22761f;

    /* renamed from: g */
    public LatLng f22762g;

    /* renamed from: h */
    public LatLng f22763h;

    /* renamed from: i */
    public String f22764i;

    /* renamed from: j */
    public String f22765j;

    /* renamed from: k */
    public float f22766k;

    /* renamed from: l */
    public float f22767l;

    /* renamed from: m */
    public boolean f22768m;

    /* renamed from: n */
    public boolean f22769n;

    /* renamed from: o */
    public C1486at f22770o;

    /* renamed from: p */
    public Object f22771p;

    /* renamed from: q */
    public boolean f22772q;

    /* renamed from: r */
    public C1498a f22773r;

    /* renamed from: s */
    public boolean f22774s;

    /* renamed from: t */
    public int f22775t;

    /* renamed from: u */
    public int f22776u;

    /* renamed from: v */
    public float f22777v;

    /* renamed from: w */
    public int f22778w;

    /* renamed from: com.amap.api.mapcore2d.ay$1 */
    /* loaded from: classes19.dex */
    public static /* synthetic */ class C14971 {
        static {
            Covode.recordClassIndex(5045);
        }
    }

    static {
        Covode.recordClassIndex(5044);
    }

    /* renamed from: g */
    public float m18481g() {
        return this.f22766k;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1463ac
    public int getAddIndex() {
        return this.f22778w;
    }

    @Override // com.amap.api.interfaces.IMarker
    public Object getObject() {
        return this.f22771p;
    }

    @Override // com.amap.api.interfaces.IMarker
    public int getPeriod() {
        return this.f22760e;
    }

    @Override // com.amap.api.interfaces.IMarker
    public String getSnippet() {
        return this.f22765j;
    }

    @Override // com.amap.api.interfaces.IMarker
    public String getTitle() {
        return this.f22764i;
    }

    @Override // com.amap.api.interfaces.IMarker, com.amap.api.mapcore2d.AbstractC1463ac
    public float getZIndex() {
        return this.f22777v;
    }

    /* renamed from: h */
    public float m18480h() {
        return this.f22767l;
    }

    @Override // com.amap.api.interfaces.IMarker
    public boolean isDraggable() {
        return this.f22768m;
    }

    @Override // com.amap.api.interfaces.IMarker
    public boolean isViewMode() {
        return this.f22774s;
    }

    @Override // com.amap.api.interfaces.IMarker
    public boolean isVisible() {
        return this.f22769n;
    }

    /* renamed from: e */
    public C1465ae m18484e() {
        C1465ae m18486d = m18486d();
        if (m18486d == null) {
            return null;
        }
        return m18486d;
    }

    @Override // com.amap.api.interfaces.IMarker
    public int hashCodeRemote() {
        return super.hashCode();
    }

    @Override // com.amap.api.interfaces.IMarker
    public boolean isInfoWindowShown() {
        return this.f22770o.m18532f(this);
    }

    @Override // com.amap.api.interfaces.IMarker
    public boolean remove() {
        return this.f22770o.m18543b(this);
    }

    /* renamed from: c */
    public void m18488c() {
        CopyOnWriteArrayList<BitmapDescriptor> copyOnWriteArrayList = this.f22759d;
        if (copyOnWriteArrayList == null) {
            this.f22759d = new CopyOnWriteArrayList<>();
        } else {
            copyOnWriteArrayList.clear();
        }
    }

    @Override // com.amap.api.interfaces.IMarker
    public String getId() {
        if (this.f22761f == null) {
            this.f22761f = m18492a("Marker");
        }
        return this.f22761f;
    }

    @Override // com.amap.api.interfaces.IMarker
    public void hideInfoWindow() {
        if (isInfoWindowShown()) {
            this.f22770o.m18534e(this);
        }
    }

    @Override // com.amap.api.interfaces.IMarker
    public void showInfoWindow() {
        if (!isVisible()) {
            return;
        }
        this.f22770o.m18536d(this);
    }

    @Override // com.amap.api.interfaces.IMarker
    public int getHeight() {
        if (m18482f() != null) {
            return m18482f().getHeight();
        }
        return 0;
    }

    @Override // com.amap.api.interfaces.IMarker
    public int getWidth() {
        if (m18482f() != null) {
            return m18482f().getWidth();
        }
        return 0;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1462ab
    /* renamed from: b */
    public C1774s mo18490b() {
        C1774s c1774s = new C1774s();
        CopyOnWriteArrayList<BitmapDescriptor> copyOnWriteArrayList = this.f22759d;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() != 0) {
            c1774s.f24037a = getWidth() * this.f22766k;
            c1774s.f24038b = getHeight() * this.f22767l;
        }
        return c1774s;
    }

    /* renamed from: f */
    public BitmapDescriptor m18482f() {
        CopyOnWriteArrayList<BitmapDescriptor> copyOnWriteArrayList = this.f22759d;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        if (copyOnWriteArrayList.size() == 0) {
            m18488c();
            this.f22759d.add(BitmapDescriptorFactory.defaultMarker());
        } else if (this.f22759d.get(0) == null) {
            this.f22759d.clear();
            return m18482f();
        }
        return this.f22759d.get(0);
    }

    @Override // com.amap.api.interfaces.IMarker
    public ArrayList<BitmapDescriptor> getIcons() {
        CopyOnWriteArrayList<BitmapDescriptor> copyOnWriteArrayList = this.f22759d;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            ArrayList<BitmapDescriptor> arrayList = new ArrayList<>();
            Iterator<BitmapDescriptor> it = this.f22759d.iterator();
            while (it.hasNext()) {
                BitmapDescriptor next = it.next();
                if (next != null) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        return null;
    }

    @Override // com.amap.api.interfaces.IMarker
    public LatLng getPosition() {
        if (this.f22774s) {
            C1774s c1774s = new C1774s();
            this.f22770o.f22710a.mo17145a(this.f22775t, this.f22776u, c1774s);
            return new LatLng(c1774s.f24038b, c1774s.f24037a);
        }
        return this.f22762g;
    }

    @Override // com.amap.api.interfaces.IMarker
    public LatLng getRealPosition() {
        if (this.f22774s) {
            C1774s c1774s = new C1774s();
            this.f22770o.f22710a.mo17145a(this.f22775t, this.f22776u, c1774s);
            return new LatLng(c1774s.f24038b, c1774s.f24037a);
        } else if (this.f22772q) {
            return this.f22763h;
        } else {
            return this.f22762g;
        }
    }

    /* renamed from: com.amap.api.mapcore2d.ay$a */
    /* loaded from: classes19.dex */
    public class C1498a extends Thread {
        static {
            Covode.recordClassIndex(5046);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                setName("MarkerThread");
                while (!Thread.currentThread().isInterrupted() && C1496ay.this.f22759d != null && C1496ay.this.f22759d.size() > 1) {
                    if (C1496ay.this.f22757b != C1496ay.this.f22759d.size() - 1) {
                        C1496ay.m18487c(C1496ay.this);
                    } else {
                        C1496ay.this.f22757b = 0;
                    }
                    C1496ay.this.f22770o.m18554a().postInvalidate();
                    try {
                        Thread.sleep(C1496ay.this.f22760e * 250);
                    } catch (InterruptedException e) {
                        C1569cm.m18147a(e, "MarkerDelegateImp", "run");
                    }
                    if (C1496ay.this.f22759d == null) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable unused) {
            }
        }

        public C1498a() {
        }

        public /* synthetic */ C1498a(C1496ay c1496ay, C14971 c14971) {
            this();
        }
    }

    /* renamed from: d */
    public C1465ae m18486d() {
        C1781w c1781w;
        if (getPosition() == null) {
            return null;
        }
        C1465ae c1465ae = new C1465ae();
        try {
            if (this.f22772q) {
                c1781w = new C1781w((int) (getRealPosition().latitude * 1000000.0d), (int) (getRealPosition().longitude * 1000000.0d));
            } else {
                c1781w = new C1781w((int) (getPosition().latitude * 1000000.0d), (int) (getPosition().longitude * 1000000.0d));
            }
            Point point = new Point();
            this.f22770o.m18554a().mo17142d().mo18286a(c1781w, point);
            c1465ae.f22658a = point.x;
            c1465ae.f22659b = point.y;
            return c1465ae;
        } catch (Throwable unused) {
            return c1465ae;
        }
    }

    @Override // com.amap.api.interfaces.IMarker
    public void destroy() {
        Bitmap bitmap;
        try {
        } catch (Exception e) {
            C1569cm.m18147a(e, "MarkerDelegateImp", "destroy");
        }
        if (this.f22759d == null) {
            this.f22762g = null;
            this.f22771p = null;
            this.f22773r = null;
            return;
        }
        Iterator<BitmapDescriptor> it = this.f22759d.iterator();
        while (it.hasNext()) {
            BitmapDescriptor next = it.next();
            if (next != null && (bitmap = next.getBitmap()) != null) {
                bitmap.recycle();
            }
        }
        this.f22759d = null;
        this.f22762g = null;
        this.f22771p = null;
        this.f22773r = null;
        C1486at c1486at = this.f22770o;
        if (c1486at != null && c1486at.f22710a != null) {
            this.f22770o.f22710a.postInvalidate();
        }
    }

    @Override // com.amap.api.mapcore2d.AbstractC1462ab
    /* renamed from: a */
    public Rect mo18499a() {
        C1465ae m18484e = m18484e();
        if (m18484e == null) {
            return new Rect(0, 0, 0, 0);
        }
        try {
            int width = getWidth();
            int height = getHeight();
            Rect rect = new Rect();
            if (this.f22758c == 0.0f) {
                float f = height;
                rect.top = (int) (m18484e.f22659b - (this.f22767l * f));
                float f2 = width;
                rect.left = (int) (m18484e.f22658a - (this.f22766k * f2));
                rect.bottom = (int) (m18484e.f22659b + (f * (1.0f - this.f22767l)));
                rect.right = (int) (m18484e.f22658a + ((1.0f - this.f22766k) * f2));
                return rect;
            }
            float f3 = width;
            float f4 = height;
            C1465ae m18498a = m18498a((-this.f22766k) * f3, (this.f22767l - 1.0f) * f4);
            C1465ae m18498a2 = m18498a((-this.f22766k) * f3, this.f22767l * f4);
            C1465ae m18498a3 = m18498a((1.0f - this.f22766k) * f3, this.f22767l * f4);
            C1465ae m18498a4 = m18498a((1.0f - this.f22766k) * f3, (this.f22767l - 1.0f) * f4);
            rect.top = m18484e.f22659b - Math.max(m18498a.f22659b, Math.max(m18498a2.f22659b, Math.max(m18498a3.f22659b, m18498a4.f22659b)));
            rect.left = m18484e.f22658a + Math.min(m18498a.f22658a, Math.min(m18498a2.f22658a, Math.min(m18498a3.f22658a, m18498a4.f22658a)));
            rect.bottom = m18484e.f22659b - Math.min(m18498a.f22659b, Math.min(m18498a2.f22659b, Math.min(m18498a3.f22659b, m18498a4.f22659b)));
            rect.right = m18484e.f22658a + Math.max(m18498a.f22658a, Math.max(m18498a2.f22658a, Math.max(m18498a3.f22658a, m18498a4.f22658a)));
            return rect;
        } catch (Throwable th) {
            C1569cm.m18147a(th, "MarkerDelegateImp", "getRect");
            return new Rect(0, 0, 0, 0);
        }
    }

    @Override // com.amap.api.mapcore2d.AbstractC1463ac
    public void setAddIndex(int i) {
        this.f22778w = i;
    }

    @Override // com.amap.api.interfaces.IMarker
    public void setDraggable(boolean z) {
        this.f22768m = z;
    }

    @Override // com.amap.api.interfaces.IMarker
    public void setObject(Object obj) {
        this.f22771p = obj;
    }

    @Override // com.amap.api.interfaces.IMarker
    public void setSnippet(String str) {
        this.f22765j = str;
    }

    @Override // com.amap.api.interfaces.IMarker
    public void setTitle(String str) {
        this.f22764i = str;
    }

    /* renamed from: c */
    public static /* synthetic */ int m18487c(C1496ay c1496ay) {
        int i = c1496ay.f22757b;
        c1496ay.f22757b = i + 1;
        return i;
    }

    @Override // com.amap.api.interfaces.IMarker
    public void setZIndex(float f) {
        this.f22777v = f;
        this.f22770o.m18537d();
    }

    @Override // com.amap.api.interfaces.IMarker
    public void setPeriod(int i) {
        if (i <= 1) {
            this.f22760e = 1;
        } else {
            this.f22760e = i;
        }
    }

    /* renamed from: a */
    public static String m18492a(String str) {
        f22756a++;
        return str + f22756a;
    }

    @Override // com.amap.api.interfaces.IMarker
    public boolean equalsRemote(IMarker iMarker) {
        if (iMarker != null) {
            if (equals(iMarker) || iMarker.getId().equals(getId())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.amap.api.interfaces.IMarker
    public void setVisible(boolean z) {
        this.f22769n = z;
        if (!z && isInfoWindowShown()) {
            this.f22770o.m18534e(this);
        }
        this.f22770o.m18554a().postInvalidate();
    }

    @Override // com.amap.api.interfaces.IMarker
    public void setIcon(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor != null) {
            try {
                if (this.f22759d != null) {
                    this.f22759d.clear();
                    this.f22759d.add(bitmapDescriptor);
                    if (isInfoWindowShown()) {
                        this.f22770o.m18534e(this);
                        this.f22770o.m18536d(this);
                    }
                    this.f22770o.m18554a().postInvalidate();
                }
            } catch (Throwable th) {
                C1569cm.m18147a(th, "MarkerDelegateImp", "setIcon");
            }
        }
    }

    @Override // com.amap.api.interfaces.IMarker
    public void setIcons(ArrayList<BitmapDescriptor> arrayList) {
        if (arrayList == null) {
            return;
        }
        m18491a(arrayList);
        if (this.f22773r == null) {
            this.f22773r = new C1498a(this, null);
            this.f22773r.start();
        }
        if (isInfoWindowShown()) {
            this.f22770o.m18534e(this);
            this.f22770o.m18536d(this);
        }
        this.f22770o.m18554a().postInvalidate();
    }

    @Override // com.amap.api.interfaces.IMarker
    public void setPosition(LatLng latLng) {
        if (latLng == null) {
            return;
        }
        if (this.f22772q) {
            try {
                double[] m17497a = C1721fy.m17497a(latLng.longitude, latLng.latitude);
                this.f22763h = new LatLng(m17497a[1], m17497a[0]);
            } catch (Exception e) {
                C1569cm.m18147a(e, "MarkerDelegateImp", "setPosition");
                this.f22763h = latLng;
            }
        }
        this.f22774s = false;
        this.f22762g = latLng;
        this.f22770o.m18554a().postInvalidate();
    }

    @Override // com.amap.api.interfaces.IMarker
    public void setRotateAngle(float f) {
        this.f22758c = (((-f) % 360.0f) + 360.0f) % 360.0f;
        if (isInfoWindowShown()) {
            this.f22770o.m18534e(this);
            this.f22770o.m18536d(this);
        }
        this.f22770o.m18554a().postInvalidate();
    }

    /* renamed from: a */
    private void m18494a(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor != null) {
            m18488c();
            this.f22759d.add(bitmapDescriptor.m25276clone());
        }
        this.f22770o.m18554a().postInvalidate();
    }

    @Override // com.amap.api.mapcore2d.AbstractC1462ab
    /* renamed from: a */
    public void mo18493a(LatLng latLng) {
        if (this.f22772q) {
            this.f22763h = latLng;
        } else {
            this.f22762g = latLng;
        }
        try {
            Point screenLocation = this.f22770o.m18554a().getAMapProjection().toScreenLocation(latLng);
            this.f22775t = screenLocation.x;
            this.f22776u = screenLocation.y;
        } catch (Throwable th) {
            C1569cm.m18147a(th, "MarkerDelegateImp", "setOffSetPosition");
        }
    }

    /* renamed from: a */
    public void m18491a(ArrayList<BitmapDescriptor> arrayList) {
        try {
            m18488c();
            if (arrayList != null) {
                Iterator<BitmapDescriptor> it = arrayList.iterator();
                while (it.hasNext()) {
                    BitmapDescriptor next = it.next();
                    if (next != null) {
                        this.f22759d.add(next.m25276clone());
                    }
                }
                if (arrayList.size() > 1 && this.f22773r == null) {
                    this.f22773r = new C1498a(this, null);
                    this.f22773r.start();
                }
            }
            this.f22770o.m18554a().postInvalidate();
        } catch (Throwable th) {
            C1569cm.m18147a(th, "MarkerDelegateImp", "setBitmapDescriptor");
        }
    }

    @Override // com.amap.api.interfaces.IMarker
    public void setPositionByPixels(int i, int i2) {
        this.f22775t = i;
        this.f22776u = i2;
        this.f22774s = true;
        if (isInfoWindowShown()) {
            showInfoWindow();
        }
    }

    /* renamed from: a */
    private C1465ae m18498a(float f, float f2) {
        C1465ae c1465ae = new C1465ae();
        double d = f;
        double d2 = (float) ((this.f22758c * 3.141592653589793d) / 180.0d);
        double d3 = f2;
        c1465ae.f22658a = (int) ((Math.cos(d2) * d) + (Math.sin(d2) * d3));
        c1465ae.f22659b = (int) ((d3 * Math.cos(d2)) - (d * Math.sin(d2)));
        return c1465ae;
    }

    @Override // com.amap.api.interfaces.IMarker
    public void setAnchor(float f, float f2) {
        if (this.f22766k == f && this.f22767l == f2) {
            return;
        }
        this.f22766k = f;
        this.f22767l = f2;
        if (isInfoWindowShown()) {
            this.f22770o.m18534e(this);
            this.f22770o.m18536d(this);
        }
        this.f22770o.m18554a().postInvalidate();
    }

    public C1496ay(MarkerOptions markerOptions, C1486at c1486at) {
        this.f22760e = 20;
        this.f22766k = 0.5f;
        this.f22767l = 1.0f;
        this.f22769n = true;
        this.f22770o = c1486at;
        this.f22772q = markerOptions.isGps();
        this.f22777v = markerOptions.getZIndex();
        if (markerOptions.getPosition() != null) {
            if (this.f22772q) {
                try {
                    double[] m17497a = C1721fy.m17497a(markerOptions.getPosition().longitude, markerOptions.getPosition().latitude);
                    this.f22763h = new LatLng(m17497a[1], m17497a[0]);
                } catch (Exception e) {
                    C1569cm.m18147a(e, "MarkerDelegateImp", "MarkerDelegateImp");
                    this.f22763h = markerOptions.getPosition();
                }
            }
            this.f22762g = markerOptions.getPosition();
        }
        this.f22766k = markerOptions.getAnchorU();
        this.f22767l = markerOptions.getAnchorV();
        this.f22769n = markerOptions.isVisible();
        this.f22765j = markerOptions.getSnippet();
        this.f22764i = markerOptions.getTitle();
        this.f22768m = markerOptions.isDraggable();
        this.f22760e = markerOptions.getPeriod();
        this.f22761f = getId();
        m18491a(markerOptions.getIcons());
        CopyOnWriteArrayList<BitmapDescriptor> copyOnWriteArrayList = this.f22759d;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() == 0) {
            m18494a(markerOptions.getIcon());
        }
    }

    @Override // com.amap.api.mapcore2d.AbstractC1462ab
    /* renamed from: a */
    public void mo18497a(Canvas canvas, AbstractC1783y abstractC1783y) {
        C1465ae m18484e;
        Bitmap bitmap;
        if (this.f22769n && getPosition() != null && m18482f() != null) {
            if (isViewMode()) {
                m18484e = new C1465ae(this.f22775t, this.f22776u);
            } else {
                m18484e = m18484e();
            }
            ArrayList<BitmapDescriptor> icons = getIcons();
            if (icons == null) {
                return;
            }
            if (icons.size() > 1) {
                bitmap = icons.get(this.f22757b).getBitmap();
            } else if (icons.size() == 1) {
                bitmap = icons.get(0).getBitmap();
            } else {
                return;
            }
            if (bitmap != null && !bitmap.isRecycled()) {
                canvas.save();
                canvas.rotate(this.f22758c, m18484e.f22658a, m18484e.f22659b);
                canvas.drawBitmap(bitmap, m18484e.f22658a - (m18481g() * bitmap.getWidth()), m18484e.f22659b - (m18480h() * bitmap.getHeight()), (Paint) null);
                canvas.restore();
            }
        }
    }
}
