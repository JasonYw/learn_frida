package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.amap.api.interfaces.MapCameraMessage;
import com.amap.api.mapcore2d.AbstractC1518bb;
import com.amap.api.mapcore2d.C1490au;
import com.amap.api.mapcore2d.C1534bm;
import com.amap.api.mapcore2d.C1762l;
import com.amap.api.mapcore2d.C1765n;
import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.CameraUpdate;
import com.amap.api.maps2d.LocationSource;
import com.amap.api.maps2d.Projection;
import com.amap.api.maps2d.UiSettings;
import com.amap.api.maps2d.model.CameraPosition;
import com.amap.api.maps2d.model.Circle;
import com.amap.api.maps2d.model.CircleOptions;
import com.amap.api.maps2d.model.GroundOverlay;
import com.amap.api.maps2d.model.GroundOverlayOptions;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.LatLngBounds;
import com.amap.api.maps2d.model.Marker;
import com.amap.api.maps2d.model.MarkerOptions;
import com.amap.api.maps2d.model.MyLocationStyle;
import com.amap.api.maps2d.model.Polygon;
import com.amap.api.maps2d.model.PolygonOptions;
import com.amap.api.maps2d.model.Polyline;
import com.amap.api.maps2d.model.PolylineOptions;
import com.amap.api.maps2d.model.Text;
import com.amap.api.maps2d.model.TextOptions;
import com.amap.api.maps2d.model.TileOverlay;
import com.amap.api.maps2d.model.TileOverlayOptions;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import p003X.C116971W2r;
import p003X.TFG;

/* renamed from: com.amap.api.mapcore2d.b */
/* loaded from: classes19.dex */
public class GestureDetector$OnDoubleTapListenerC1507b extends View implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, AbstractC1518bb.AbstractC1520b, C1534bm.AbstractC1535a, C1762l.AbstractC1763a, C1765n.AbstractC1766a, AbstractC1783y {

    /* renamed from: aH */
    public static int f22816aH = Color.rgb(222, 215, 214);

    /* renamed from: aI */
    public static Paint f22817aI = null;

    /* renamed from: aJ */
    public static Bitmap f22818aJ = null;

    /* renamed from: A */
    public C1598d f22819A;

    /* renamed from: B */
    public AMap.OnMyLocationChangeListener f22820B;

    /* renamed from: D */
    public C1521bc f22822D;

    /* renamed from: E */
    public C1556cd f22823E;

    /* renamed from: F */
    public C1532bk f22824F;

    /* renamed from: G */
    public LocationSource f22825G;

    /* renamed from: H */
    public C1768p f22826H;

    /* renamed from: L */
    public AMap.OnCameraChangeListener f22830L;

    /* renamed from: M */
    public C1761k f22831M;

    /* renamed from: O */
    public C1492av f22833O;

    /* renamed from: R */
    public View f22836R;

    /* renamed from: S */
    public AMap.OnInfoWindowClickListener f22837S;

    /* renamed from: T */
    public AMap.InfoWindowAdapter f22838T;

    /* renamed from: U */
    public C1496ay f22839U;

    /* renamed from: V */
    public AMap.OnMarkerClickListener f22840V;

    /* renamed from: Z */
    public AbstractC1468ah f22842Z;

    /* renamed from: a */
    public C1499az f22843a;

    /* renamed from: aA */
    public float f22844aA;

    /* renamed from: aB */
    public float f22845aB;

    /* renamed from: aC */
    public int f22846aC;

    /* renamed from: aD */
    public int f22847aD;

    /* renamed from: ad */
    public AMap.OnMarkerDragListener f22857ad;

    /* renamed from: ae */
    public AMap.OnMapTouchListener f22858ae;

    /* renamed from: af */
    public AMap.OnMapLongClickListener f22859af;

    /* renamed from: ag */
    public AMap.OnMapLoadedListener f22860ag;

    /* renamed from: ah */
    public AMap.OnMapClickListener f22861ah;

    /* renamed from: ap */
    public Point f22869ap;

    /* renamed from: aq */
    public GestureDetector f22870aq;

    /* renamed from: ar */
    public AbstractC1518bb.C1519a f22871ar;

    /* renamed from: au */
    public Scroller f22874au;

    /* renamed from: b */
    public View$OnKeyListenerC1480aq f22880b;

    /* renamed from: d */
    public boolean f22882d;

    /* renamed from: f */
    public C1557ce f22884f;

    /* renamed from: g */
    public C1490au f22885g;

    /* renamed from: h */
    public AbstractC1473al f22886h;

    /* renamed from: i */
    public C1543bu f22887i;

    /* renamed from: j */
    public C1486at f22888j;

    /* renamed from: n */
    public Context f22892n;

    /* renamed from: o */
    public boolean f22893o;

    /* renamed from: q */
    public Marker f22895q;

    /* renamed from: r */
    public AbstractC1462ab f22896r;

    /* renamed from: v */
    public CameraUpdate f22900v;

    /* renamed from: w */
    public long f22901w;

    /* renamed from: x */
    public AMap.CancelableCallback f22902x;

    /* renamed from: y */
    public C1477ap f22903y;

    /* renamed from: z */
    public Location f22904z;

    /* renamed from: p */
    public boolean f22894p = true;

    /* renamed from: s */
    public final int[] f22897s = {10000000, 5000000, 2000000, 1000000, 500000, 200000, 100000, 50000, 30000, 20000, 10000, TFG.LIZIZ, Constants.ASSEMBLE_PUSH_RETRY_INTERVAL, 1000, 500, 200, 100, 50, 25, 10, 5};

    /* renamed from: t */
    public boolean f22898t = true;

    /* renamed from: u */
    public int f22899u = 1;

    /* renamed from: c */
    public float[] f22881c = new float[2];

    /* renamed from: e */
    public C1485as f22883e = new C1485as(this);

    /* renamed from: C */
    public boolean f22821C = true;

    /* renamed from: I */
    public C1460a f22827I = null;

    /* renamed from: J */
    public boolean f22828J = false;

    /* renamed from: K */
    public boolean f22829K = false;

    /* renamed from: N */
    public AMap.CancelableCallback f22832N = null;

    /* renamed from: P */
    public boolean f22834P = false;

    /* renamed from: Q */
    public boolean f22835Q = false;

    /* renamed from: W */
    public Drawable f22841W = null;

    /* renamed from: aa */
    public boolean f22854aa = false;

    /* renamed from: ab */
    public boolean f22855ab = false;

    /* renamed from: ac */
    public boolean f22856ac = false;

    /* renamed from: ai */
    public boolean f22862ai = false;

    /* renamed from: aj */
    public AMap.OnMapScreenShotListener f22863aj = null;

    /* renamed from: ak */
    public Timer f22864ak = null;

    /* renamed from: al */
    public Thread f22865al = null;

    /* renamed from: am */
    public TimerTask f22866am = new TimerTask() { // from class: com.amap.api.mapcore2d.b.1
        static {
            Covode.recordClassIndex(5056);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                GestureDetector$OnDoubleTapListenerC1507b.this.f22889k.sendEmptyMessage(19);
            } catch (Throwable th) {
                C1569cm.m18147a(th, "AMapDelegateImpGLSurfaceView", "TimerTask run");
            }
        }
    };

    /* renamed from: an */
    public Handler f22867an = new Handler();

    /* renamed from: ao */
    public Handler f22868ao = new Handler() { // from class: com.amap.api.mapcore2d.b.2

        /* renamed from: a */
        public String f22906a = "onTouchHandler";

        static {
            Covode.recordClassIndex(5057);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            try {
                if (GestureDetector$OnDoubleTapListenerC1507b.this.f22858ae != null) {
                    GestureDetector$OnDoubleTapListenerC1507b.this.f22858ae.onTouch((MotionEvent) message.obj);
                }
            } catch (Throwable th) {
                C1569cm.m18147a(th, "AMapDelegateImpGLSurfaceView", this.f22906a);
            }
        }
    };

    /* renamed from: k */
    public final Handler f22889k = new Handler() { // from class: com.amap.api.mapcore2d.b.3

        /* renamed from: a */
        public String f22908a = "handleMessage";

        static {
            Covode.recordClassIndex(5058);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bitmap bitmap;
            Bitmap drawingCache;
            if (message != null && GestureDetector$OnDoubleTapListenerC1507b.this.f22843a != null && GestureDetector$OnDoubleTapListenerC1507b.this.f22843a.f22782c != null) {
                try {
                    int i = message.what;
                    if (i != 2) {
                        if (i != 13) {
                            if (i != 19) {
                                if (i != 10) {
                                    if (i != 11) {
                                        switch (i) {
                                            case MotionEventCompat.AXIS_HAT_X /* 15 */:
                                                GestureDetector$OnDoubleTapListenerC1507b.this.m18421D();
                                                return;
                                            case 16:
                                                try {
                                                    bitmap = (Bitmap) message.obj;
                                                } catch (Exception e) {
                                                    C1569cm.m18147a(e, "AMapDelegateImpGLSurfaceView", this.f22908a);
                                                }
                                                if (!bitmap.isRecycled()) {
                                                    Bitmap LIZ = C116971W2r.LIZ(bitmap);
                                                    if (LIZ != null) {
                                                        Canvas canvas = new Canvas(LIZ);
                                                        if (GestureDetector$OnDoubleTapListenerC1507b.this.f22823E != null) {
                                                            GestureDetector$OnDoubleTapListenerC1507b.this.f22823E.draw(canvas);
                                                        }
                                                        if (GestureDetector$OnDoubleTapListenerC1507b.this.f22836R != null && GestureDetector$OnDoubleTapListenerC1507b.this.f22839U != null && (drawingCache = GestureDetector$OnDoubleTapListenerC1507b.this.f22836R.getDrawingCache(true)) != null) {
                                                            canvas.drawBitmap(drawingCache, GestureDetector$OnDoubleTapListenerC1507b.this.f22836R.getLeft(), GestureDetector$OnDoubleTapListenerC1507b.this.f22836R.getTop(), new Paint());
                                                        }
                                                        if (GestureDetector$OnDoubleTapListenerC1507b.this.f22863aj != null) {
                                                            GestureDetector$OnDoubleTapListenerC1507b.this.f22863aj.onMapScreenShot(LIZ);
                                                        }
                                                        GestureDetector$OnDoubleTapListenerC1507b.this.destroyDrawingCache();
                                                        GestureDetector$OnDoubleTapListenerC1507b.this.f22863aj = null;
                                                        return;
                                                    }
                                                    if (GestureDetector$OnDoubleTapListenerC1507b.this.f22863aj != null) {
                                                        GestureDetector$OnDoubleTapListenerC1507b.this.f22863aj.onMapScreenShot(null);
                                                    }
                                                    GestureDetector$OnDoubleTapListenerC1507b.this.destroyDrawingCache();
                                                    GestureDetector$OnDoubleTapListenerC1507b.this.f22863aj = null;
                                                    return;
                                                }
                                                return;
                                            case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                                                CameraPosition m18422C = GestureDetector$OnDoubleTapListenerC1507b.this.m18422C();
                                                if (GestureDetector$OnDoubleTapListenerC1507b.this.f22830L != null) {
                                                    GestureDetector$OnDoubleTapListenerC1507b.this.m18401a(true, m18422C);
                                                }
                                                if (C1771q.f24019h == null || C1771q.f24019h.trim().length() == 0) {
                                                    if (m18422C.zoom >= 10.0f && !C1568cl.m18163a(m18422C.target.latitude, m18422C.target.longitude)) {
                                                        GestureDetector$OnDoubleTapListenerC1507b.this.f22823E.setVisibility(8);
                                                    } else {
                                                        GestureDetector$OnDoubleTapListenerC1507b.this.f22823E.setVisibility(0);
                                                    }
                                                }
                                                if (GestureDetector$OnDoubleTapListenerC1507b.this.f22832N != null) {
                                                    GestureDetector$OnDoubleTapListenerC1507b.this.f22828J = true;
                                                    GestureDetector$OnDoubleTapListenerC1507b.this.f22832N.onFinish();
                                                    GestureDetector$OnDoubleTapListenerC1507b.this.f22828J = false;
                                                }
                                                if (!GestureDetector$OnDoubleTapListenerC1507b.this.f22829K) {
                                                    GestureDetector$OnDoubleTapListenerC1507b.this.f22832N = null;
                                                    return;
                                                } else {
                                                    GestureDetector$OnDoubleTapListenerC1507b.this.f22829K = false;
                                                    return;
                                                }
                                            default:
                                                return;
                                        }
                                    }
                                    if (GestureDetector$OnDoubleTapListenerC1507b.this.f22860ag != null) {
                                        GestureDetector$OnDoubleTapListenerC1507b.this.f22860ag.onMapLoaded();
                                    }
                                    GestureDetector$OnDoubleTapListenerC1507b.this.m18360w();
                                    return;
                                } else if (GestureDetector$OnDoubleTapListenerC1507b.this.f22830L == null) {
                                    return;
                                } else {
                                    GestureDetector$OnDoubleTapListenerC1507b.this.f22830L.onCameraChange(new CameraPosition(GestureDetector$OnDoubleTapListenerC1507b.this.m18420E(), GestureDetector$OnDoubleTapListenerC1507b.this.getZoomLevel(), 0.0f, 0.0f));
                                    return;
                                }
                            } else if (GestureDetector$OnDoubleTapListenerC1507b.this.f22843a == null || GestureDetector$OnDoubleTapListenerC1507b.this.f22843a.f22783d == null) {
                                return;
                            } else {
                                GestureDetector$OnDoubleTapListenerC1507b.this.f22843a.f22783d.m18450a();
                                return;
                            }
                        } else if (GestureDetector$OnDoubleTapListenerC1507b.this.f22831M != null && GestureDetector$OnDoubleTapListenerC1507b.this.f22831M.m17235g() && GestureDetector$OnDoubleTapListenerC1507b.this.f22831M.m17234h() == 2) {
                            C1764m m17224a = C1764m.m17224a(new C1465ae(GestureDetector$OnDoubleTapListenerC1507b.this.f22831M.m17241b(), GestureDetector$OnDoubleTapListenerC1507b.this.f22831M.m17239c()), GestureDetector$OnDoubleTapListenerC1507b.this.f22831M.m17238d(), GestureDetector$OnDoubleTapListenerC1507b.this.f22831M.m17237e(), GestureDetector$OnDoubleTapListenerC1507b.this.f22831M.m17236f());
                            if (GestureDetector$OnDoubleTapListenerC1507b.this.f22831M.m17244a()) {
                                m17224a.isChangeFinished = true;
                            }
                            GestureDetector$OnDoubleTapListenerC1507b.this.f22883e.m18555a(m17224a);
                            return;
                        } else {
                            return;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Key验证失败：[");
                    if (message.obj != null) {
                        sb.append(message.obj);
                    } else {
                        sb.append(C1574cr.f23180b);
                    }
                    sb.append("]");
                } catch (Throwable th) {
                    C1569cm.m18147a(th, "AMapDelegateImpGLSurfaceView", "handle_handleMessage");
                }
            }
        }
    };

    /* renamed from: l */
    public int f22890l = 0;

    /* renamed from: as */
    public ArrayList<GestureDetector.OnGestureListener> f22872as = new ArrayList<>();

    /* renamed from: at */
    public ArrayList<AbstractC1518bb.AbstractC1520b> f22873at = new ArrayList<>();

    /* renamed from: av */
    public int f22875av = 0;

    /* renamed from: aw */
    public int f22876aw = 0;

    /* renamed from: ax */
    public Matrix f22877ax = new Matrix();

    /* renamed from: ay */
    public float f22878ay = 1.0f;

    /* renamed from: az */
    public boolean f22879az = false;

    /* renamed from: aE */
    public long f22848aE = 0;

    /* renamed from: aF */
    public int f22849aF = 0;

    /* renamed from: aG */
    public int f22850aG = 0;

    /* renamed from: aK */
    public int f22851aK = 0;

    /* renamed from: aL */
    public boolean f22852aL = false;

    /* renamed from: aM */
    public AbstractC1513a f22853aM = null;

    /* renamed from: m */
    public float f22891m = -1.0f;

    /* renamed from: com.amap.api.mapcore2d.b$a */
    /* loaded from: classes19.dex */
    public static abstract class AbstractC1513a {
        static {
            Covode.recordClassIndex(5061);
        }

        /* renamed from: a */
        public abstract void m18356a(int i, int i2, int i3, int i4);
    }

    public static Object com_amap_api_mapcore2d_b_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        ActionInvokeEntrance.setEventUuid(110000);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_amap_api_mapcore2d_b_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return actionIntercept.second;
        }
        Object invoke = method.invoke(obj, objArr);
        ActionInvokeEntrance.actionInvokeReflection(invoke, method, new Object[]{obj, objArr}, "com_amap_api_mapcore2d_b_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        return invoke;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1518bb.AbstractC1520b
    /* renamed from: a */
    public boolean mo18332a(Matrix matrix) {
        return false;
    }

    @Override // com.amap.api.interfaces.IAMap
    public LatLngBounds getMapBounds() {
        return null;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: q */
    public int m18363q() {
        return 0;
    }

    @Override // com.amap.api.interfaces.IAMap
    public void setZOrderOnTop(boolean z) {
    }

    @Override // com.amap.api.mapcore2d.C1534bm.AbstractC1535a
    /* renamed from: u */
    public void mo18268u() {
    }

    /* renamed from: m */
    public static int m18369m() {
        return f22816aH;
    }

    @Override // com.amap.api.interfaces.IAMap
    public Handler getMainHandler() {
        return this.f22889k;
    }

    @Override // com.amap.api.interfaces.IAMap
    public int getMapType() {
        return this.f22899u;
    }

    @Override // com.amap.api.interfaces.IAMap
    public AMap.OnCameraChangeListener getOnCameraChangeListener() {
        return this.f22830L;
    }

    @Override // com.amap.api.interfaces.IAMap
    public View getView() {
        return this.f22885g;
    }

    /* renamed from: i */
    public View$OnKeyListenerC1480aq m18377i() {
        return this.f22880b;
    }

    @Override // com.amap.api.interfaces.IAMap
    public boolean isMyLocationEnabled() {
        return this.f22821C;
    }

    /* renamed from: o */
    public float m18365o() {
        return this.f22878ay;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.amap.api.mapcore2d.AbstractC1783y
    /* renamed from: a */
    public C1499az mo17149a() {
        return this.f22843a;
    }

    /* renamed from: a */
    public float m18418a(float f) {
        C1499az c1499az = this.f22843a;
        if (c1499az == null || c1499az.f22782c == null) {
            return f;
        }
        if (f < this.f22843a.f22782c.m18437b()) {
            f = this.f22843a.f22782c.m18437b();
        }
        return f > ((float) this.f22843a.f22782c.m18445a()) ? this.f22843a.f22782c.m18445a() : f;
    }

    /* renamed from: a */
    public void m18416a(float f, Point point, boolean z, long j) {
        if (this.f22880b == null || this.f22843a == null) {
            return;
        }
        float zoomLevel = getZoomLevel();
        float m18143b = C1569cm.m18143b(zoomLevel + f);
        if (m18143b - zoomLevel <= 0.0f) {
            return;
        }
        new C1465ae();
        C1465ae m18419F = m18419F();
        if (point == null || m18419F == null) {
            return;
        }
        C1465ae c1465ae = new C1465ae();
        m18414a(point.x, point.y, c1465ae);
        int i = m18419F.f22658a - c1465ae.f22658a;
        double d = i;
        double d2 = f;
        double d3 = m18419F.f22659b - c1465ae.f22659b;
        m18419F.f22658a = c1465ae.f22658a + ((int) ((d / Math.pow(2.0d, d2)) - d));
        m18419F.f22659b = c1465ae.f22659b + ((int) ((d3 / Math.pow(2.0d, d2)) - d3));
        C1781w m18507b = this.f22843a.f22787h.m18507b(new C1781w(m18419F.f22659b, m18419F.f22658a, false));
        if (z) {
            this.f22880b.m18600a(m18143b, point.x, point.y, (int) j);
            return;
        }
        this.f22880b.m18591a(m18507b);
        C1762l.m17233a().m17231b();
    }

    /* renamed from: a */
    public void m18409a(AbstractC1462ab abstractC1462ab) {
        int i;
        int i2;
        AMap.InfoWindowAdapter infoWindowAdapter;
        if (abstractC1462ab == null) {
            return;
        }
        if (abstractC1462ab.getTitle() == null && abstractC1462ab.getSnippet() == null) {
            return;
        }
        m18385e();
        Marker marker = new Marker(abstractC1462ab);
        AMap.InfoWindowAdapter infoWindowAdapter2 = this.f22838T;
        if (infoWindowAdapter2 != null) {
            this.f22836R = infoWindowAdapter2.getInfoWindow(marker);
        }
        try {
            if (this.f22841W == null) {
                this.f22841W = C1525bd.m18312a(this.f22892n, "infowindow_bg2d.9.png");
            }
        } catch (Exception e) {
            C1569cm.m18147a(e, "AMapDelegateImpGLSurfaceView", "showInfoWindow");
        }
        if (this.f22836R == null && (infoWindowAdapter = this.f22838T) != null) {
            this.f22836R = infoWindowAdapter.getInfoContents(marker);
        }
        View view = this.f22836R;
        if (view != null) {
            if (view.getBackground() == null) {
                this.f22836R.setBackgroundDrawable(this.f22841W);
            }
        } else {
            LinearLayout linearLayout = new LinearLayout(this.f22892n);
            linearLayout.setBackgroundDrawable(this.f22841W);
            TextView textView = new TextView(this.f22892n);
            textView.setText(abstractC1462ab.getTitle());
            textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            TextView textView2 = new TextView(this.f22892n);
            textView2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            textView2.setText(abstractC1462ab.getSnippet());
            linearLayout.setOrientation(1);
            linearLayout.addView(textView);
            linearLayout.addView(textView2);
            this.f22836R = linearLayout;
        }
        ViewGroup.LayoutParams layoutParams = this.f22836R.getLayoutParams();
        this.f22836R.setDrawingCacheEnabled(true);
        this.f22836R.setDrawingCacheQuality(0);
        C1774s mo18490b = abstractC1462ab.mo18490b();
        if (layoutParams != null) {
            i = layoutParams.width;
            i2 = layoutParams.height;
        } else {
            i = -2;
            i2 = -2;
        }
        C1490au.C1491a c1491a = new C1490au.C1491a(i, i2, abstractC1462ab.getRealPosition(), (-((int) mo18490b.f24037a)) + (abstractC1462ab.getWidth() / 2), (-((int) mo18490b.f24038b)) + 2, 81);
        this.f22839U = (C1496ay) abstractC1462ab;
        C1490au c1490au = this.f22885g;
        if (c1490au == null) {
            return;
        }
        c1490au.addView(this.f22836R, c1491a);
    }

    /* renamed from: b */
    public boolean m18394b(AbstractC1462ab abstractC1462ab) {
        C1496ay c1496ay = this.f22839U;
        if (c1496ay == null || this.f22836R == null || abstractC1462ab == null) {
            return false;
        }
        return c1496ay.getId().equals(abstractC1462ab.getId());
    }

    @Override // com.amap.api.mapcore2d.AbstractC1783y
    /* renamed from: a */
    public void mo17146a(int i, int i2) {
        C1556cd c1556cd = this.f22823E;
        if (c1556cd != null) {
            c1556cd.m18204a(i, i2, getMapWidth(), getMapHeight());
            this.f22823E.postInvalidate();
            if (this.f22824F.getVisibility() != 0) {
                return;
            }
            this.f22824F.postInvalidate();
        }
    }

    /* renamed from: a */
    public void m18402a(boolean z) {
        if (m18375j() == z || this.f22843a == null) {
            return;
        }
        if (!z) {
            mo17149a().f22784e.m18463a(mo17149a().f22784e.f22796h, false);
            mo17149a().f22784e.m18463a(mo17149a().f22784e.f22795g, true);
            mo17149a().f22782c.m18438a(false, false);
        } else if (mo17149a().f22784e.m18457b(mo17149a().f22784e.f22796h) != null) {
            mo17149a().f22784e.m18463a(mo17149a().f22784e.f22796h, true);
            mo17149a().f22782c.m18438a(false, false);
        } else {
            C1475an c1475an = new C1475an(this.f22833O);
            c1475an.f22682q = new C1546bv(this.f22843a, c1475an);
            c1475an.f22673j = new AbstractC1554cb() { // from class: com.amap.api.mapcore2d.b.4
                static {
                    Covode.recordClassIndex(5059);
                }

                @Override // com.amap.api.mapcore2d.AbstractC1554cb
                /* renamed from: a */
                public String mo18208a(int i, int i2, int i3) {
                    return C1495ax.m18504a().m18500e() + "/appmaptile?z=" + i3 + "&x=" + i + "&y=" + i2 + "&lang=zh_cn&size=1&scale=1&style=6";
                }
            };
            c1475an.f22665b = mo17149a().f22784e.f22796h;
            c1475an.f22668e = true;
            c1475an.m18615a(true);
            c1475an.f22669f = true;
            c1475an.f22666c = C1771q.f24014c;
            c1475an.f22667d = C1771q.f24015d;
            mo17149a().f22784e.m18466a(c1475an, this.f22892n);
            mo17149a().f22784e.m18463a(mo17149a().f22784e.f22796h, true);
            mo17149a().f22782c.m18438a(false, false);
        }
    }

    @Override // com.amap.api.mapcore2d.AbstractC1518bb.AbstractC1520b
    /* renamed from: a */
    public boolean mo18334a(float f, float f2) {
        View$OnKeyListenerC1480aq view$OnKeyListenerC1480aq = this.f22880b;
        if (view$OnKeyListenerC1480aq != null) {
            view$OnKeyListenerC1480aq.m18581b(true);
        }
        if (this.f22879az) {
            this.f22844aA += f;
            this.f22845aB += f2;
        }
        postInvalidate();
        return this.f22879az;
    }

    /* renamed from: b */
    public boolean m18397b(Matrix matrix) {
        try {
            if (!this.f22886h.isZoomGesturesEnabled()) {
                return false;
            }
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "AMapDelegateImpGLSurfaceView", "onScale");
        }
        this.f22877ax.set(matrix);
        postInvalidate();
        return true;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1518bb.AbstractC1520b
    /* renamed from: a */
    public boolean mo18333a(float f, PointF pointF) {
        try {
            if (!this.f22886h.isZoomGesturesEnabled()) {
                return false;
            }
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "AMapDelegateImpGLSurfaceView", "onScale");
        }
        C1499az c1499az = this.f22843a;
        if (c1499az != null && c1499az.f22784e != null) {
            this.f22843a.f22784e.f22791c = false;
        }
        m18362r();
        m18415a(f, pointF, this.f22844aA, this.f22845aB);
        this.f22879az = false;
        postInvalidateDelayed(8L);
        this.f22843a.m18475a(true);
        return true;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1518bb.AbstractC1520b
    /* renamed from: b */
    public boolean mo18330b(float f, PointF pointF) {
        this.f22879az = false;
        try {
            if (!this.f22886h.isZoomGesturesEnabled()) {
                return false;
            }
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "AMapDelegateImpGLSurfaceView", "endScale");
        }
        C1762l.m17233a().m17231b();
        return true;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1518bb.AbstractC1520b
    /* renamed from: a */
    public boolean mo18331a(PointF pointF) {
        try {
            if (!this.f22886h.isZoomGesturesEnabled()) {
                return false;
            }
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "AMapDelegateImpGLSurfaceView", "startScale");
        }
        try {
            if (!m18390c().isZoomGesturesEnabled()) {
                return false;
            }
        } catch (RemoteException e2) {
            C1569cm.m18147a(e2, "AMapDelegateImpGLSurfaceView", "startScale");
        }
        C1499az c1499az = this.f22843a;
        if (c1499az != null && c1499az.f22784e != null) {
            this.f22843a.m18475a(this.f22894p);
            this.f22843a.f22784e.m18462a(true);
            this.f22843a.f22784e.f22791c = true;
        }
        this.f22879az = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m18401a(boolean z, CameraPosition cameraPosition) {
        if (this.f22830L != null && this.f22831M.m17244a() && isEnabled()) {
            if (cameraPosition == null) {
                try {
                    cameraPosition = getCameraPosition();
                } catch (RemoteException e) {
                    C1569cm.m18147a(e, "AMapDelegateImpGLSurfaceView", "cameraChangeFinish");
                }
            }
            try {
                this.f22830L.onCameraChangeFinish(cameraPosition);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.amap.api.mapcore2d.AbstractC1783y
    /* renamed from: a */
    public void mo17145a(int i, int i2, C1774s c1774s) {
        PointF pointF = new PointF(i, i2);
        C1492av c1492av = this.f22833O;
        C1781w m18515a = c1492av.m18515a(pointF, c1492av.f22741l, this.f22833O.f22743n, this.f22833O.f22740k, this.f22833O.f22744o);
        if (c1774s != null) {
            double m17196a = C1773r.m17196a(m18515a.m17162b());
            double m17196a2 = C1773r.m17196a(m18515a.m17164a());
            c1774s.f24038b = m17196a;
            c1774s.f24037a = m17196a2;
        }
    }

    @Override // com.amap.api.mapcore2d.AbstractC1783y
    /* renamed from: a */
    public void mo17147a(double d, double d2, C1774s c1774s) {
        getZoomLevel();
        C1781w c1781w = new C1781w((int) C1773r.m17197a(d), (int) C1773r.m17197a(d2));
        C1492av c1492av = this.f22833O;
        PointF m18506b = c1492av.m18506b(c1781w, c1492av.f22741l, this.f22833O.f22743n, this.f22833O.f22740k);
        if (c1774s != null) {
            c1774s.f24037a = m18506b.x;
            c1774s.f24038b = m18506b.y;
        }
    }

    @Override // com.amap.api.mapcore2d.AbstractC1783y
    /* renamed from: a */
    public void mo17148a(double d, double d2, C1465ae c1465ae) {
        C1492av c1492av = this.f22833O;
        if (c1492av == null) {
            return;
        }
        C1781w m18507b = c1492av.m18507b(new C1781w((int) (d * 1000000.0d), (int) (d2 * 1000000.0d)));
        c1465ae.f22658a = m18507b.m17164a();
        c1465ae.f22659b = m18507b.m17162b();
    }

    /* renamed from: a */
    public void m18410a(MapCameraMessage mapCameraMessage, boolean z, long j) {
        int i;
        int i2;
        float f;
        if (this.f22880b == null) {
            return;
        }
        try {
            LatLngBounds latLngBounds = mapCameraMessage.bounds;
            if (latLngBounds == null || latLngBounds.northeast == null || latLngBounds.southwest == null) {
                return;
            }
            if (mapCameraMessage.width == 0) {
                mapCameraMessage.width = this.f22843a.f22782c.m18433c();
            }
            if (mapCameraMessage.height == 0) {
                mapCameraMessage.height = this.f22843a.f22782c.m18432d();
            }
            float f2 = (float) ((latLngBounds.northeast.latitude * 1000000.0d) - (latLngBounds.southwest.latitude * 1000000.0d));
            float f3 = (float) ((latLngBounds.northeast.longitude * 1000000.0d) - (latLngBounds.southwest.longitude * 1000000.0d));
            if (f2 == 0.0f) {
                f2 = 1.0f;
            }
            if (f3 == 0.0f) {
                f3 = 1.0f;
            }
            float f4 = f3;
            float f5 = f2;
            Pair<Float, Boolean> m18602a = this.f22880b.m18602a(f5, f4, mapCameraMessage.width, mapCameraMessage.height, mapCameraMessage.paddingLeft + mapCameraMessage.paddingRight, mapCameraMessage.paddingTop + mapCameraMessage.paddingBottom);
            if (m18602a != null) {
                f = ((Float) m18602a.first).floatValue();
                ((Boolean) m18602a.second).booleanValue();
                C1465ae c1465ae = new C1465ae();
                mo17144b(latLngBounds.northeast.latitude, latLngBounds.northeast.longitude, c1465ae);
                C1465ae c1465ae2 = new C1465ae();
                mo17144b(latLngBounds.southwest.latitude, latLngBounds.southwest.longitude, c1465ae2);
                int abs = Math.abs(c1465ae.f22658a - c1465ae2.f22658a);
                int abs2 = Math.abs(c1465ae2.f22659b - c1465ae.f22659b);
                if (abs2 == 0) {
                    abs2 = 1;
                }
                if (abs == 0) {
                    abs = 1;
                }
                int m18417a = (int) m18417a(getZoomLevel(), f, abs);
                int m18417a2 = (int) m18417a(getZoomLevel(), f, abs2);
                i = (int) ((latLngBounds.southwest.latitude * 1000000.0d) + ((((mapCameraMessage.paddingTop - mapCameraMessage.paddingBottom) + m18417a2) * f2) / (m18417a2 * 2)));
                i2 = (int) ((latLngBounds.southwest.longitude * 1000000.0d) + ((((mapCameraMessage.paddingRight - mapCameraMessage.paddingLeft) + m18417a) * f3) / (m18417a * 2)));
            } else {
                i = (int) (((latLngBounds.northeast.latitude * 1000000.0d) + (latLngBounds.southwest.latitude * 1000000.0d)) / 2.0d);
                i2 = (int) (((latLngBounds.northeast.longitude * 1000000.0d) + (latLngBounds.southwest.longitude * 1000000.0d)) / 2.0d);
                f = -1.0f;
            }
            C1781w c1781w = new C1781w(i, i2);
            if (z) {
                this.f22880b.m18589a(c1781w, (int) j);
            } else {
                this.f22880b.m18591a(c1781w);
            }
            if (f == -1.0f) {
                return;
            }
            this.f22880b.m18579c(f);
        } catch (Exception e) {
            C1569cm.m18147a(e, "AMapDelegateImpGLSurfaceView", "newLatLngBoundsWithSize");
        }
    }

    /* renamed from: c */
    public AbstractC1473al m18390c() {
        return this.f22886h;
    }

    /* renamed from: f */
    public Point m18383f() {
        return this.f22823E.m18198d();
    }

    /* renamed from: g */
    public boolean m18381g() {
        return this.f22894p;
    }

    @Override // com.amap.api.interfaces.IAMap
    public Projection getAMapProjection() {
        return new Projection(this.f22842Z);
    }

    @Override // com.amap.api.interfaces.IAMap
    public UiSettings getAMapUiSettings() {
        return new UiSettings(this.f22886h);
    }

    @Override // com.amap.api.interfaces.IAMap
    public int getLogoPosition() {
        return this.f22823E.m18206a();
    }

    @Override // com.amap.api.interfaces.IAMap
    public boolean isTrafficEnabled() {
        return m18373k();
    }

    /* renamed from: l */
    public AbstractC1518bb m18371l() {
        return this.f22871ar;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return super.onSaveInstanceState();
    }

    /* renamed from: p */
    public void m18364p() {
        this.f22844aA = 0.0f;
        this.f22845aB = 0.0f;
    }

    /* renamed from: r */
    public void m18362r() {
        this.f22889k.sendEmptyMessage(10);
    }

    @Override // com.amap.api.interfaces.IAMap
    public void removecache() {
        removecache(null);
    }

    /* renamed from: s */
    public void m18361s() {
        this.f22889k.sendEmptyMessage(15);
    }

    @Override // com.amap.api.mapcore2d.C1762l.AbstractC1763a
    /* renamed from: v */
    public void mo17229v() {
        this.f22889k.sendEmptyMessage(17);
    }

    @Override // com.amap.api.interfaces.IAMap
    public void AMapInvalidate() {
        postInvalidate();
        this.f22885g.postInvalidate();
    }

    @Override // com.amap.api.mapcore2d.AbstractC1783y
    /* renamed from: d */
    public AbstractC1529bh mo17142d() {
        C1499az c1499az = this.f22843a;
        if (c1499az == null) {
            return null;
        }
        return c1499az.f22781b;
    }

    @Override // com.amap.api.interfaces.IAMap
    public Location getMyLocation() {
        C1598d c1598d;
        if (this.f22825G != null && (c1598d = this.f22819A) != null) {
            return c1598d.f23311a;
        }
        return null;
    }

    @Override // com.amap.api.mapcore2d.C1765n.AbstractC1766a
    /* renamed from: t */
    public void mo17208t() {
        AMap.CancelableCallback cancelableCallback = this.f22832N;
        if (cancelableCallback != null) {
            cancelableCallback.onCancel();
            this.f22832N = null;
        }
    }

    static {
        Covode.recordClassIndex(5055);
    }

    /* renamed from: B */
    private void m18423B() {
        Point point = this.f22869ap;
        if (point == null) {
            return;
        }
        int i = point.x - this.f22849aF;
        int i2 = this.f22869ap.y;
        int i3 = this.f22850aG;
        Point point2 = this.f22869ap;
        point2.x = this.f22849aF;
        point2.y = i3;
        this.f22880b.m18574d(i, i2 - i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public LatLng m18420E() {
        C1781w m18379h = m18379h();
        if (m18379h == null) {
            return null;
        }
        return new LatLng(C1773r.m17196a(m18379h.m17162b()), C1773r.m17196a(m18379h.m17164a()));
    }

    /* renamed from: F */
    private C1465ae m18419F() {
        C1781w m18379h = m18379h();
        if (m18379h == null) {
            return null;
        }
        C1465ae c1465ae = new C1465ae();
        c1465ae.f22658a = (int) m18379h.m17158e();
        c1465ae.f22659b = (int) m18379h.m17157f();
        return c1465ae;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m18360w() {
        try {
            if (this.f22900v != null) {
                animateCameraWithDurationAndCallback(this.f22900v, this.f22901w, this.f22902x);
                this.f22900v = null;
                this.f22901w = 0L;
                this.f22902x = null;
            }
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMapDelegateImpGLSurfaceView", "handleUnHandleMessage");
        }
    }

    /* renamed from: y */
    private void m18358y() {
        m18413a(this.f22892n);
        this.f22885g.addView(this, 0, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: z */
    private void m18357z() {
        this.f22843a.m18479a();
        View$OnKeyListenerC1480aq view$OnKeyListenerC1480aq = this.f22880b;
        if (view$OnKeyListenerC1480aq != null) {
            view$OnKeyListenerC1480aq.m18581b(true);
            this.f22880b.m18573e();
        }
        this.f22880b = null;
        this.f22843a = null;
    }

    /* renamed from: b */
    public C1521bc m18400b() {
        return this.f22822D;
    }

    @Override // com.amap.api.interfaces.IAMap
    public CameraPosition getCameraPosition() {
        LatLng m18420E = m18420E();
        if (m18420E == null) {
            return null;
        }
        float zoomLevel = getZoomLevel();
        CameraPosition.Builder builder = CameraPosition.builder();
        builder.target(m18420E);
        builder.zoom(zoomLevel);
        return builder.build();
    }

    @Override // com.amap.api.interfaces.IAMap
    public int getMapHeight() {
        C1499az c1499az = this.f22843a;
        if (c1499az != null && c1499az.f22782c != null) {
            return this.f22843a.f22782c.m18432d();
        }
        return 0;
    }

    @Override // com.amap.api.interfaces.IAMap
    public List<Marker> getMapScreenMarkers() {
        if (!C1569cm.m18156a(getWidth(), getHeight())) {
            return new ArrayList();
        }
        return this.f22888j.m18531g();
    }

    @Override // com.amap.api.interfaces.IAMap
    public int getMapWidth() {
        C1499az c1499az = this.f22843a;
        if (c1499az != null && c1499az.f22782c != null) {
            return this.f22843a.f22782c.m18433c();
        }
        return 0;
    }

    @Override // com.amap.api.interfaces.IAMap
    public float getMaxZoomLevel() {
        int i;
        C1499az c1499az = this.f22843a;
        if (c1499az != null && c1499az.f22782c != null) {
            i = this.f22843a.f22782c.m18445a();
        } else {
            i = C1771q.f24014c;
        }
        return i;
    }

    @Override // com.amap.api.interfaces.IAMap
    public float getMinZoomLevel() {
        int i;
        C1499az c1499az = this.f22843a;
        if (c1499az != null && c1499az.f22782c != null) {
            i = this.f22843a.f22782c.m18437b();
        } else {
            i = C1771q.f24015d;
        }
        return i;
    }

    @Override // com.amap.api.interfaces.IAMap
    public float getZoomLevel() {
        C1499az c1499az = this.f22843a;
        float f = 0.0f;
        if (c1499az != null && c1499az.f22782c != null) {
            try {
                f = this.f22843a.f22782c.m18431e();
                return f;
            } catch (Exception e) {
                C1569cm.m18147a(e, "AMapDelegateImpGLSurfaceView", "getZoomLevel");
            }
        }
        return f;
    }

    /* renamed from: h */
    public C1781w m18379h() {
        C1499az c1499az = this.f22843a;
        if (c1499az != null && c1499az.f22782c != null) {
            return this.f22843a.f22782c.m18430f();
        }
        return null;
    }

    @Override // com.amap.api.interfaces.IAMap
    public void onPause() {
        C1499az c1499az = this.f22843a;
        if (c1499az != null && c1499az.f22783d != null) {
            this.f22843a.f22783d.m18447d();
        }
        C1543bu c1543bu = this.f22887i;
        if (c1543bu != null) {
            c1543bu.m18243d();
        }
    }

    @Override // com.amap.api.interfaces.IAMap
    public void onResume() {
        C1499az c1499az = this.f22843a;
        if (c1499az != null && c1499az.f22783d != null) {
            this.f22843a.f22783d.m18448c();
        }
        C1543bu c1543bu = this.f22887i;
        if (c1543bu != null) {
            c1543bu.m18242e();
        }
    }

    @Override // com.amap.api.interfaces.IAMap
    public void redrawInfoWindow() {
        View view = this.f22836R;
        if (view != null && this.f22839U != null) {
            C1490au.C1491a c1491a = (C1490au.C1491a) view.getLayoutParams();
            if (c1491a != null) {
                c1491a.f22726b = this.f22839U.getRealPosition();
            }
            this.f22885g.m18527a();
        }
    }

    /* renamed from: com.amap.api.mapcore2d.b$b */
    /* loaded from: classes19.dex */
    public class RunnableC1514b implements Runnable {

        /* renamed from: b */
        public Context f22913b;

        /* renamed from: c */
        public AMap.OnCacheRemoveListener f22914c;

        static {
            Covode.recordClassIndex(5062);
        }

        /* JADX WARN: Finally extract failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                C1569cm.m18150a(new File(C1569cm.m18142b(this.f22913b)));
                try {
                    if (this.f22914c != null) {
                        this.f22914c.onRemoveCacheFinish(true);
                    }
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                try {
                    C1616do.m17866c(th, "AMapDelegateImpGLSurfaceView", "RemoveCacheRunnable");
                    try {
                        if (this.f22914c != null) {
                            this.f22914c.onRemoveCacheFinish(false);
                        }
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable th2) {
                    try {
                        if (this.f22914c != null) {
                            this.f22914c.onRemoveCacheFinish(true);
                        }
                    } catch (Throwable unused3) {
                    }
                    throw th2;
                }
            }
        }

        public RunnableC1514b(Context context, AMap.OnCacheRemoveListener onCacheRemoveListener) {
            this.f22913b = context;
            this.f22914c = onCacheRemoveListener;
        }
    }

    /* renamed from: A */
    private void m18424A() {
        if (this.f22834P) {
            this.f22834P = false;
        }
        if (this.f22856ac) {
            this.f22856ac = false;
            C1764m m17228a = C1764m.m17228a();
            m17228a.isChangeFinished = true;
            this.f22883e.m18555a(m17228a);
        }
        if (this.f22835Q) {
            this.f22835Q = false;
            C1764m m17228a2 = C1764m.m17228a();
            m17228a2.isChangeFinished = true;
            this.f22883e.m18555a(m17228a2);
        }
        this.f22855ab = false;
        Marker marker = this.f22895q;
        if (marker != null) {
            AMap.OnMarkerDragListener onMarkerDragListener = this.f22857ad;
            if (onMarkerDragListener != null) {
                onMarkerDragListener.onMarkerDragEnd(marker);
            }
            this.f22895q = null;
            this.f22896r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public CameraPosition m18422C() {
        C1781w m18379h = m18379h();
        if (m18379h == null) {
            return null;
        }
        return CameraPosition.fromLatLngZoom(new LatLng(m18379h.m17162b() / 1000000.0d, m18379h.m17164a() / 1000000.0d), getZoomLevel());
    }

    /* renamed from: n */
    public static synchronized Paint m18367n() {
        Paint paint;
        synchronized (GestureDetector$OnDoubleTapListenerC1507b.class) {
            if (f22817aI == null) {
                Paint paint2 = new Paint();
                f22817aI = paint2;
                paint2.setColor(-7829368);
                f22817aI.setAlpha(90);
                f22817aI.setPathEffect(new DashPathEffect(new float[]{2.0f, 2.5f}, 1.0f));
            }
            paint = f22817aI;
        }
        return paint;
    }

    @Override // com.amap.api.interfaces.IAMap
    public void clear() {
        try {
            m18385e();
            if (this.f22843a == null) {
                return;
            }
            this.f22843a.f22785f.m17178a();
            this.f22888j.m18539c();
            this.f22887i.m18246b();
            if (this.f22822D != null) {
                this.f22822D.m18329a();
            }
            postInvalidate();
        } catch (Exception e) {
            C1569cm.m18147a(e, "AMapDelegateImpGLSurfaceView", "clear");
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMapDelegateImpGLSurfaceView", "clear");
        }
    }

    /* renamed from: e */
    public void m18385e() {
        View view = this.f22836R;
        if (view != null) {
            view.clearFocus();
            this.f22836R.destroyDrawingCache();
            C1490au c1490au = this.f22885g;
            if (c1490au != null) {
                c1490au.removeView(this.f22836R);
            }
            Drawable background = this.f22836R.getBackground();
            if (background != null) {
                background.setCallback(null);
            }
            this.f22836R = null;
        }
        this.f22839U = null;
    }

    @Override // com.amap.api.interfaces.IAMap
    public float getScalePerPixel() {
        int width = getWidth();
        C1774s c1774s = new C1774s();
        C1774s c1774s2 = new C1774s();
        mo17145a(0, 0, c1774s);
        mo17145a(width, 0, c1774s2);
        return (float) (C1569cm.m18152a(new LatLng(c1774s.f24038b, c1774s.f24037a), new LatLng(c1774s2.f24038b, c1774s2.f24037a)) / width);
    }

    /* renamed from: j */
    public boolean m18375j() {
        C1475an m18457b;
        C1499az c1499az = this.f22843a;
        if (c1499az == null || c1499az.f22784e == null || (m18457b = mo17149a().f22784e.m18457b(mo17149a().f22784e.f22796h)) == null) {
            return false;
        }
        return m18457b.m18617a();
    }

    /* renamed from: k */
    public boolean m18373k() {
        if (mo17149a() == null) {
            return false;
        }
        C1475an m18457b = mo17149a().f22784e.m18457b(mo17149a().f22784e.f22797i);
        if (m18457b == null) {
            return false;
        }
        return m18457b.m18617a();
    }

    @Override // com.amap.api.interfaces.IAMap
    public void stopAnimation() {
        if (this.f22880b == null) {
            return;
        }
        if (!this.f22831M.m17244a()) {
            this.f22831M.m17242a(true);
            C1762l.m17233a().m17231b();
            AMap.CancelableCallback cancelableCallback = this.f22832N;
            if (cancelableCallback != null) {
                cancelableCallback.onCancel();
            }
            this.f22832N = null;
        }
        this.f22880b.m18581b(true);
    }

    /* renamed from: x */
    private void m18359x() {
        Method[] methods;
        for (Method method : View.class.getMethods()) {
            if (method != null && method.getName().equals("setLayerType")) {
                try {
                    com_amap_api_mapcore2d_b_java_lang_reflect_Method_invoke(method, this, new Object[]{Integer.valueOf(View.class.getField("LAYER_TYPE_SOFTWARE").getInt(null)), null});
                    return;
                } catch (Exception e) {
                    C1569cm.m18147a(e, "AMapDelegateImpGLSurfaceView", "setLayerType");
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f22874au.computeScrollOffset() && this.f22874au.isFinished()) {
            int currX = this.f22874au.getCurrX() - this.f22875av;
            int currY = this.f22874au.getCurrY() - this.f22876aw;
            this.f22875av = this.f22874au.getCurrX();
            this.f22876aw = this.f22874au.getCurrY();
            C1781w mo18287a = this.f22843a.f22781b.mo18287a(this.f22843a.f22787h.f22743n.x + currX, this.f22843a.f22787h.f22743n.y + currY);
            if (this.f22874au.isFinished()) {
                C1762l.m17233a().m17231b();
                if (this.f22830L != null) {
                    m18401a(true, m18422C());
                }
                this.f22843a.f22782c.m18438a(false, false);
                return;
            }
            this.f22843a.f22782c.m18434b(mo18287a);
            return;
        }
        super.computeScroll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public void m18421D() {
        int[] iArr;
        int i;
        if (this.f22824F == null) {
            return;
        }
        if (this.f22891m == -1.0f) {
            int width = getWidth();
            int height = getHeight();
            int i2 = this.f22892n.getResources().getDisplayMetrics().densityDpi;
            int i3 = 50;
            if (i2 > 120) {
                if (i2 <= 160) {
                    if (Math.max(width, height) <= 480) {
                        i3 = 120;
                    }
                } else if (i2 <= 240) {
                    i3 = Math.min(width, height) >= 1000 ? 60 : 70;
                } else if (i2 > 320 && i2 > 480) {
                    i3 = 40;
                }
                this.f22891m = i3 / 100.0f;
            }
            i3 = 100;
            this.f22891m = i3 / 100.0f;
        }
        LatLng m18420E = m18420E();
        if (m18420E == null) {
            return;
        }
        float zoomLevel = getZoomLevel();
        float f = this.f22891m;
        double cos = (float) ((((Math.cos((m18420E.latitude * 3.141592653589793d) / 180.0d) * 2.0d) * 3.141592653589793d) * 6378137.0d) / (Math.pow(2.0d, zoomLevel) * 256.0d));
        String m18157a = C1569cm.m18157a(this.f22897s[(int) zoomLevel]);
        this.f22824F.m18280a((int) (iArr[i] / (cos * f)));
        this.f22824F.m18279a(m18157a);
        this.f22824F.postInvalidate();
    }

    @Override // com.amap.api.interfaces.IAMap
    public void destroy() {
        try {
            if (this.f22864ak != null) {
                this.f22864ak.cancel();
                this.f22864ak = null;
            }
            if (this.f22866am != null) {
                this.f22866am.cancel();
                this.f22866am = null;
            }
            if (this.f22868ao != null) {
                this.f22868ao.removeCallbacksAndMessages(null);
            }
            if (this.f22889k != null) {
                this.f22889k.removeCallbacksAndMessages(null);
            }
            if (this.f22865al != null) {
                this.f22865al.interrupt();
                this.f22865al = null;
            }
            if (this.f22825G != null) {
                this.f22825G.deactivate();
                this.f22825G = null;
            }
            C1765n.m17212a().m17209b(this);
            C1534bm.m18271a().m18270a(this);
            C1762l.m17233a().m17230b(this);
            this.f22884f.m18193a();
            this.f22824F.m18281a();
            this.f22823E.m18202b();
            this.f22903y.m18613a();
            this.f22826H.m17207a();
            this.f22843a.f22785f.m17169b();
            this.f22888j.m18533f();
            if (this.f22841W != null) {
                this.f22841W.setCallback(null);
            }
            this.f22885g.removeAllViews();
            m18385e();
            if (this.f22887i != null) {
                this.f22887i.m18241f();
            }
            if (this.f22843a != null) {
                this.f22843a.f22783d.m18449b();
                m18357z();
            }
            this.f22825G = null;
            this.f22861ah = null;
            C1771q.f24019h = null;
            C1771q.f24018g = null;
            C1616do.m17870b();
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMapDelegateImpGLSurfaceView", "destroy");
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // com.amap.api.interfaces.IAMap
    public void setInfoWindowAdapter(AMap.InfoWindowAdapter infoWindowAdapter) {
        this.f22838T = infoWindowAdapter;
    }

    @Override // com.amap.api.interfaces.IAMap
    public void setOnCameraChangeListener(AMap.OnCameraChangeListener onCameraChangeListener) {
        this.f22830L = onCameraChangeListener;
    }

    @Override // com.amap.api.interfaces.IAMap
    public void setOnInfoWindowClickListener(AMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        this.f22837S = onInfoWindowClickListener;
    }

    @Override // com.amap.api.interfaces.IAMap
    public void setOnMapClickListener(AMap.OnMapClickListener onMapClickListener) {
        this.f22861ah = onMapClickListener;
    }

    @Override // com.amap.api.interfaces.IAMap
    public void setOnMapLongClickListener(AMap.OnMapLongClickListener onMapLongClickListener) {
        this.f22859af = onMapLongClickListener;
    }

    @Override // com.amap.api.interfaces.IAMap
    public void setOnMapTouchListener(AMap.OnMapTouchListener onMapTouchListener) {
        this.f22858ae = onMapTouchListener;
    }

    @Override // com.amap.api.interfaces.IAMap
    public void setOnMaploadedListener(AMap.OnMapLoadedListener onMapLoadedListener) {
        this.f22860ag = onMapLoadedListener;
    }

    @Override // com.amap.api.interfaces.IAMap
    public void setOnMarkerClickListener(AMap.OnMarkerClickListener onMarkerClickListener) {
        this.f22840V = onMarkerClickListener;
    }

    @Override // com.amap.api.interfaces.IAMap
    public void setOnMarkerDragListener(AMap.OnMarkerDragListener onMarkerDragListener) {
        this.f22857ad = onMarkerDragListener;
    }

    @Override // com.amap.api.interfaces.IAMap
    public void setOnMyLocationChangeListener(AMap.OnMyLocationChangeListener onMyLocationChangeListener) {
        this.f22820B = onMyLocationChangeListener;
    }

    @Override // com.amap.api.interfaces.IAMap
    public void animateCamera(CameraUpdate cameraUpdate) {
        if (cameraUpdate == null) {
            return;
        }
        animateCameraWithCallback(cameraUpdate, null);
    }

    @Override // com.amap.api.interfaces.IAMap
    public void getMapScreenShot(AMap.OnMapScreenShotListener onMapScreenShotListener) {
        this.f22863aj = onMapScreenShotListener;
        this.f22854aa = true;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        this.f22893o = z;
        super.setClickable(z);
    }

    @Override // com.amap.api.interfaces.IAMap
    public void setMyLocationRotateAngle(float f) {
        C1521bc c1521bc = this.f22822D;
        if (c1521bc != null) {
            c1521bc.m18328a(f);
        }
    }

    @Override // com.amap.api.interfaces.IAMap
    public void setMyLocationType(int i) {
        C1521bc c1521bc = this.f22822D;
        if (c1521bc != null) {
            c1521bc.m18327a(i);
        }
    }

    @Override // com.amap.api.interfaces.IAMap
    public void setTrafficEnabled(boolean z) {
        m18391b(z);
        postInvalidate();
    }

    @Override // com.amap.api.interfaces.IAMap
    public void moveCamera(CameraUpdate cameraUpdate) {
        if (cameraUpdate == null) {
            return;
        }
        this.f22827I.m18620a(cameraUpdate.getCameraUpdateFactoryDelegate());
    }

    @Override // com.amap.api.interfaces.IAMap
    public boolean removeGLOverlay(String str) {
        C1499az c1499az = this.f22843a;
        if (c1499az == null) {
            return false;
        }
        try {
            return c1499az.f22785f.m17167b(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.amap.api.interfaces.IAMap
    public void setZoomPosition(int i) {
        C1557ce c1557ce = this.f22884f;
        if (c1557ce != null) {
            c1557ce.m18191a(i);
            this.f22884f.postInvalidate();
        }
    }

    @Override // com.amap.api.interfaces.IAMap
    public Text addText(TextOptions textOptions) {
        C1538bp c1538bp = new C1538bp(this, textOptions, this.f22888j);
        this.f22888j.m18549a(c1538bp);
        postInvalidate();
        return new Text(c1538bp);
    }

    /* renamed from: c */
    public boolean m18389c(float f) {
        try {
            if (!this.f22886h.isZoomGesturesEnabled()) {
                return false;
            }
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "AMapDelegateImpGLSurfaceView", "onScale");
        }
        m18399b(f);
        return false;
    }

    @Override // com.amap.api.interfaces.IAMap
    public boolean removeMarker(String str) {
        try {
            AbstractC1462ab m18547a = this.f22888j.m18547a(str);
            if (m18547a != null) {
                return this.f22888j.m18543b(m18547a);
            }
            return false;
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "AMapDelegateImpGLSurfaceView", "removeMarker");
            return false;
        }
    }

    @Override // com.amap.api.interfaces.IAMap
    public void removecache(AMap.OnCacheRemoveListener onCacheRemoveListener) {
        if (this.f22867an != null) {
            try {
                RunnableC1514b runnableC1514b = new RunnableC1514b(this.f22892n, onCacheRemoveListener);
                this.f22867an.removeCallbacks(runnableC1514b);
                this.f22867an.post(runnableC1514b);
            } catch (Throwable th) {
                C1616do.m17866c(th, "AMapDelegateImpGLSurfaceView", "removecache");
            }
        }
    }

    @Override // com.amap.api.interfaces.IAMap
    public void setLogoPosition(int i) {
        C1556cd c1556cd = this.f22823E;
        if (c1556cd != null) {
            c1556cd.m18205a(i);
            this.f22823E.postInvalidate();
            if (this.f22824F.getVisibility() == 0) {
                this.f22824F.postInvalidate();
            }
        }
    }

    @Override // com.amap.api.interfaces.IAMap
    public void setMapLanguage(String str) {
        C1499az c1499az = this.f22843a;
        if (c1499az == null || c1499az.f22784e == null || m18375j()) {
            return;
        }
        this.f22843a.f22784e.m18464a(str);
    }

    @Override // com.amap.api.interfaces.IAMap
    public void setMapType(int i) {
        if (i == 2) {
            this.f22899u = 2;
            m18402a(true);
            this.f22823E.m18203a(true);
        } else {
            this.f22899u = 1;
            m18402a(false);
            this.f22823E.m18203a(false);
        }
        postInvalidate();
    }

    @Override // com.amap.api.interfaces.IAMap
    public void showCompassEnabled(boolean z) {
        if (z) {
            this.f22826H.setVisibility(0);
        } else {
            this.f22826H.setVisibility(8);
        }
    }

    @Override // com.amap.api.interfaces.IAMap
    public void showMyLocationButtonEnabled(boolean z) {
        if (z) {
            this.f22903y.setVisibility(0);
        } else {
            this.f22903y.setVisibility(8);
        }
    }

    @Override // com.amap.api.interfaces.IAMap
    public void showScaleEnabled(boolean z) {
        if (z) {
            this.f22824F.setVisibility(0);
            m18361s();
            return;
        }
        this.f22824F.m18279a("");
        this.f22824F.m18280a(0);
        this.f22824F.setVisibility(8);
    }

    @Override // com.amap.api.interfaces.IAMap
    public void showZoomControlsEnabled(boolean z) {
        if (z) {
            this.f22884f.setVisibility(0);
        } else {
            this.f22884f.setVisibility(8);
        }
    }

    /* renamed from: a */
    private LatLng m18403a(LatLng latLng) {
        C1465ae c1465ae = new C1465ae();
        mo17144b(latLng.latitude, latLng.longitude, c1465ae);
        c1465ae.f22659b -= 60;
        C1774s c1774s = new C1774s();
        mo17145a(c1465ae.f22658a, c1465ae.f22659b, c1774s);
        return new LatLng(c1774s.f24038b, c1774s.f24037a);
    }

    @Override // com.amap.api.interfaces.IAMap
    public Circle addCircle(CircleOptions circleOptions) {
        try {
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMapDelegateImpGLSurfaceView", "addCircle");
        }
        if (this.f22843a == null) {
            return null;
        }
        AbstractC1784z m17174a = this.f22843a.f22785f.m17174a(circleOptions);
        postInvalidate();
        if (m17174a != null) {
            return new Circle(m17174a);
        }
        return null;
    }

    @Override // com.amap.api.interfaces.IAMap
    public GroundOverlay addGroundOverlay(GroundOverlayOptions groundOverlayOptions) {
        try {
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMapDelegateImpGLSurfaceView", "addGroundOverlay");
        }
        if (this.f22843a == null) {
            return null;
        }
        AbstractC1461aa m17173a = this.f22843a.f22785f.m17173a(groundOverlayOptions);
        postInvalidate();
        if (m17173a != null) {
            return new GroundOverlay(m17173a);
        }
        return null;
    }

    @Override // com.amap.api.interfaces.IAMap
    public Marker addMarker(MarkerOptions markerOptions) {
        if (markerOptions == null) {
            return null;
        }
        try {
            C1496ay c1496ay = new C1496ay(markerOptions, this.f22888j);
            this.f22888j.m18550a(c1496ay);
            postInvalidate();
            return new Marker(c1496ay);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMapDelegateImpGLSurfaceView", "addMarker");
            return null;
        }
    }

    @Override // com.amap.api.interfaces.IAMap
    public Polygon addPolygon(PolygonOptions polygonOptions) {
        try {
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMapDelegateImpGLSurfaceView", "addPolygon");
        }
        if (this.f22843a == null || this.f22843a.f22785f == null) {
            return null;
        }
        AbstractC1466af m17172a = this.f22843a.f22785f.m17172a(polygonOptions);
        postInvalidate();
        if (m17172a != null) {
            return new Polygon(m17172a);
        }
        return null;
    }

    @Override // com.amap.api.interfaces.IAMap
    public Polyline addPolyline(PolylineOptions polylineOptions) {
        try {
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMapDelegateImpGLSurfaceView", "addPolyline");
        }
        if (this.f22843a == null) {
            return null;
        }
        AbstractC1467ag m17171a = mo17149a().f22785f.m17171a(polylineOptions);
        postInvalidate();
        if (m17171a != null) {
            return new Polyline(m17171a);
        }
        return null;
    }

    @Override // com.amap.api.interfaces.IAMap
    public TileOverlay addTileOverlay(TileOverlayOptions tileOverlayOptions) {
        C1499az c1499az = this.f22843a;
        if (c1499az == null) {
            return null;
        }
        C1542bt c1542bt = new C1542bt(tileOverlayOptions, this.f22887i, c1499az.f22787h, this.f22843a, this.f22892n);
        this.f22887i.m18248a(c1542bt);
        postInvalidate();
        return new TileOverlay(c1542bt);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!C1771q.f24029r || this.f22843a == null) {
            return true;
        }
        if (!this.f22893o) {
            return false;
        }
        if (this.f22858ae != null) {
            this.f22868ao.removeMessages(1);
            Message obtainMessage = this.f22868ao.obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.obj = MotionEvent.obtain(motionEvent);
            obtainMessage.sendToTarget();
        }
        if (this.f22843a.f22784e.m18467a(motionEvent)) {
            return true;
        }
        m18395b(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.amap.api.interfaces.IAMap
    public void setLocationSource(LocationSource locationSource) {
        if (this.f22903y == null) {
            return;
        }
        LocationSource locationSource2 = this.f22825G;
        if (locationSource2 != null && (locationSource2 instanceof C1551c)) {
            locationSource2.deactivate();
        }
        this.f22825G = locationSource;
        if (locationSource != null) {
            this.f22903y.m18611a(true);
        } else {
            this.f22903y.m18611a(false);
        }
    }

    /* renamed from: b */
    private boolean m18395b(MotionEvent motionEvent) {
        boolean z = false;
        try {
            z = this.f22871ar.m18336a(motionEvent, getWidth(), getHeight());
            if (!z) {
                z = this.f22870aq.onTouchEvent(motionEvent);
            }
            if (motionEvent.getAction() == 1 && this.f22856ac) {
                C1762l.m17233a().m17231b();
            }
            if (motionEvent.getAction() == 2) {
                m18411a(motionEvent);
            }
            if (motionEvent.getAction() == 1) {
                m18424A();
                return z;
            }
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMapDelegateImpGLSurfaceView", "handleTouch");
        }
        return z;
    }

    /* renamed from: c */
    public PointF m18388c(PointF pointF) {
        PointF pointF2 = new PointF();
        int width = getWidth();
        int height = getHeight();
        int i = width >> 1;
        float f = pointF.x - i;
        int i2 = height >> 1;
        double d = pointF.y - i2;
        double d2 = f;
        double atan2 = Math.atan2(d, d2);
        double sqrt = Math.sqrt(Math.pow(d2, 2.0d) + Math.pow(d, 2.0d));
        double m18363q = atan2 + ((m18363q() * 3.141592653589793d) / 180.0d);
        pointF2.x = (float) ((Math.cos(m18363q) * sqrt) + i);
        pointF2.y = (float) ((sqrt * Math.sin(m18363q)) + i2);
        return pointF2;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        try {
            if (!this.f22886h.isZoomGesturesEnabled()) {
                return true;
            }
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "AMapDelegateImpGLSurfaceView", "onDoubleTap");
        }
        if (this.f22898t) {
            if (this.f22886h.isZoomInByScreenCenter()) {
                this.f22880b.m18580c();
            } else {
                this.f22880b.m18578c((int) motionEvent.getX(), (int) motionEvent.getY());
            }
        }
        if (this.f22851aK > 1) {
            return true;
        }
        this.f22852aL = true;
        C1499az c1499az = this.f22843a;
        if (c1499az != null && c1499az.f22782c != null) {
            this.f22884f.m18192a(this.f22843a.f22782c.m18431e() + 1.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f22856ac = false;
        if (!this.f22852aL && !this.f22831M.m17244a()) {
            this.f22831M.m17242a(true);
            AMap.CancelableCallback cancelableCallback = this.f22832N;
            if (cancelableCallback != null) {
                cancelableCallback.onCancel();
            }
            this.f22832N = null;
        }
        this.f22852aL = false;
        this.f22851aK = 0;
        Point point = this.f22869ap;
        if (point == null) {
            this.f22869ap = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            return true;
        }
        point.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        try {
            this.f22856ac = false;
            if (this.f22859af != null) {
                C1774s c1774s = new C1774s();
                mo17145a((int) motionEvent.getX(), (int) motionEvent.getY(), c1774s);
                this.f22859af.onMapLongClick(new LatLng(c1774s.f24038b, c1774s.f24037a));
                this.f22834P = true;
            }
            this.f22896r = this.f22888j.m18551a(motionEvent);
            if (this.f22896r == null) {
                return;
            }
            this.f22895q = new Marker(this.f22896r);
            if (this.f22896r != null && this.f22896r.isDraggable()) {
                this.f22896r.mo18493a(m18403a(this.f22896r.getRealPosition()));
                this.f22888j.m18538c(this.f22896r);
                if (this.f22857ad != null) {
                    this.f22857ad.onMarkerDragStart(this.f22895q);
                }
                this.f22855ab = true;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.amap.api.interfaces.IAMap
    public void setMyLocationEnabled(boolean z) {
        try {
            if (this.f22825G != null) {
                if (z) {
                    this.f22825G.activate(this.f22819A);
                    this.f22903y.m18611a(true);
                    if (this.f22822D == null) {
                        this.f22822D = new C1521bc(this, this.f22892n);
                    }
                    this.f22821C = z;
                }
                if (this.f22822D != null) {
                    this.f22822D.m18329a();
                    this.f22822D = null;
                }
                this.f22825G.deactivate();
            }
            this.f22903y.m18611a(false);
            if (!z) {
                this.f22886h.setMyLocationButtonEnabled(z);
            }
            this.f22821C = z;
        } catch (Throwable th) {
            C1616do.m17866c(th, "AMapDelegateImpGLSurfaceView", "setMyLocationEnabled");
        }
    }

    @Override // com.amap.api.interfaces.IAMap
    public void setMyLocationStyle(MyLocationStyle myLocationStyle) {
        if (m18400b() == null) {
            this.f22822D = new C1521bc(this, this.f22892n);
        }
        if (this.f22822D != null) {
            if (myLocationStyle.getInterval() < 1000) {
                myLocationStyle.interval(1000L);
            }
            LocationSource locationSource = this.f22825G;
            if (locationSource != null && (locationSource instanceof C1551c)) {
                ((C1551c) locationSource).m18215a(myLocationStyle.getInterval());
                ((C1551c) this.f22825G).m18216a(myLocationStyle.getMyLocationType());
            }
            this.f22822D.m18322a(myLocationStyle);
        }
    }

    @Override // com.amap.api.interfaces.IAMap
    public void showMyLocationOverlay(Location location) {
        if (location == null) {
            return;
        }
        try {
            if (isMyLocationEnabled() && this.f22825G != null) {
                if (this.f22822D == null) {
                    this.f22822D = new C1521bc(this, this.f22892n);
                }
                if (this.f22822D != null && location.getLongitude() != 0.0d && location.getLatitude() != 0.0d) {
                    this.f22822D.m18325a(location);
                }
                if (this.f22820B != null) {
                    this.f22820B.onMyLocationChange(location);
                }
                this.f22904z = new Location(location);
                return;
            }
            if (this.f22822D != null) {
                this.f22822D.m18329a();
            }
            this.f22822D = null;
        } catch (Throwable unused) {
        }
    }

    public GestureDetector$OnDoubleTapListenerC1507b(Context context) {
        super(context);
        m18359x();
        setClickable(true);
        m18412a(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public PointF m18396b(PointF pointF) {
        PointF pointF2 = new PointF();
        int width = getWidth();
        int height = getHeight();
        int i = width >> 1;
        float f = pointF.x - i;
        int i2 = height >> 1;
        double d = pointF.y - i2;
        double d2 = f;
        double atan2 = Math.atan2(d, d2);
        double sqrt = Math.sqrt(Math.pow(d2, 2.0d) + Math.pow(d, 2.0d));
        double m18363q = atan2 - ((m18363q() * 3.141592653589793d) / 180.0d);
        pointF2.x = (float) ((Math.cos(m18363q) * sqrt) + i);
        pointF2.y = (float) ((sqrt * Math.sin(m18363q)) + i2);
        return pointF2;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        try {
            Paint m18367n = m18367n();
            canvas.drawColor(m18369m());
            int width = getWidth();
            int height = getHeight();
            if (width <= height) {
                width = height;
            }
            float left = getLeft();
            float top = getTop();
            for (int i = 0; i < width; i += 256) {
                float f = i;
                canvas.drawLine(left, f, left + getWidth(), f, m18367n);
                canvas.drawLine(f, top, f, top + getHeight(), m18367n);
            }
            if (this.f22854aa) {
                setDrawingCacheEnabled(true);
                buildDrawingCache();
                Bitmap drawingCache = getDrawingCache();
                Message obtainMessage = this.f22889k.obtainMessage();
                obtainMessage.what = 16;
                obtainMessage.obj = drawingCache;
                this.f22889k.sendMessage(obtainMessage);
                this.f22854aa = false;
            }
            if (this.f22843a != null && this.f22843a.f22782c != null) {
                this.f22843a.f22782c.m18442a(getWidth(), getHeight());
            }
            if (this.f22843a != null && this.f22843a.f22784e != null) {
                this.f22843a.f22784e.m18468a(canvas, this.f22877ax, this.f22844aA, this.f22845aB);
            }
            if (!this.f22831M.m17244a()) {
                this.f22889k.sendEmptyMessage(13);
            }
            if (!this.f22862ai) {
                this.f22889k.sendEmptyMessage(11);
                this.f22862ai = true;
            }
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMapDelegateImpGLSurfaceView", "onDraw");
        }
    }

    /* renamed from: a */
    private void m18413a(Context context) {
        this.f22869ap = null;
        this.f22870aq = new GestureDetector(context, this);
        this.f22871ar = AbstractC1518bb.m18342a(context, this);
        this.f22874au = new Scroller(context);
        new DisplayMetrics();
        DisplayMetrics displayMetrics = context.getApplicationContext().getResources().getDisplayMetrics();
        this.f22846aC = displayMetrics.widthPixels;
        this.f22847aD = displayMetrics.heightPixels;
        this.f22875av = displayMetrics.widthPixels / 2;
        this.f22876aw = displayMetrics.heightPixels / 2;
    }

    /* renamed from: b */
    public void m18399b(float f) {
        this.f22878ay = f;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C1499az c1499az;
        LatLng realPosition;
        if (this.f22880b == null || (c1499az = this.f22843a) == null) {
            return false;
        }
        c1499az.f22784e.m18458b(motionEvent);
        Iterator<GestureDetector.OnGestureListener> it = this.f22872as.iterator();
        while (it.hasNext()) {
            it.next().onSingleTapUp(motionEvent);
        }
        this.f22856ac = false;
        if (this.f22834P) {
            this.f22834P = false;
            return true;
        }
        try {
            if (this.f22836R != null) {
                if (this.f22888j.m18552a(new Rect(this.f22836R.getLeft(), this.f22836R.getTop(), this.f22836R.getRight(), this.f22836R.getBottom()), (int) motionEvent.getX(), (int) motionEvent.getY()) && this.f22837S != null) {
                    AbstractC1462ab m18535e = this.f22888j.m18535e();
                    if (!m18535e.isVisible()) {
                        return true;
                    }
                    this.f22837S.onInfoWindowClick(new Marker(m18535e));
                    return true;
                }
            }
            if (this.f22888j.m18544b(motionEvent)) {
                AbstractC1462ab m18535e2 = this.f22888j.m18535e();
                if (m18535e2 != null && m18535e2.isVisible()) {
                    Marker marker = new Marker(m18535e2);
                    if (this.f22840V != null) {
                        if (!this.f22840V.onMarkerClick(marker) && this.f22888j.m18545b() > 0) {
                            if (this.f22888j.m18535e() != null && !m18535e2.isViewMode() && (realPosition = m18535e2.getRealPosition()) != null) {
                                this.f22880b.m18591a(C1569cm.m18153a(realPosition));
                                C1762l.m17233a().m17231b();
                            }
                        } else {
                            this.f22888j.m18538c(m18535e2);
                            return true;
                        }
                    }
                    m18409a(m18535e2);
                    this.f22888j.m18538c(m18535e2);
                }
                return true;
            }
            if (this.f22861ah != null) {
                C1774s c1774s = new C1774s();
                mo17145a((int) motionEvent.getX(), (int) motionEvent.getY(), c1774s);
                this.f22861ah.onMapClick(new LatLng(c1774s.f24038b, c1774s.f24037a));
            }
            return true;
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMapDelegateImpGLSurfaceView", "onSingleTapConfirmed");
            return true;
        }
    }

    /* renamed from: a */
    private void m18411a(MotionEvent motionEvent) {
        if (this.f22855ab && this.f22896r != null && this.f22895q != null) {
            C1774s c1774s = new C1774s();
            mo17145a((int) motionEvent.getX(), (int) (motionEvent.getY() - 60.0f), c1774s);
            LatLng latLng = new LatLng(c1774s.f24038b, c1774s.f24037a);
            AbstractC1462ab abstractC1462ab = this.f22896r;
            if (abstractC1462ab != null && abstractC1462ab.isDraggable()) {
                this.f22896r.mo18493a(latLng);
                AMap.OnMarkerDragListener onMarkerDragListener = this.f22857ad;
                if (onMarkerDragListener != null) {
                    onMarkerDragListener.onMarkerDrag(this.f22895q);
                }
            }
        }
    }

    /* renamed from: b */
    public void m18391b(boolean z) {
        if (z == m18373k() || this.f22843a == null) {
            return;
        }
        String str = mo17149a().f22784e.f22797i;
        if (!z) {
            mo17149a().f22784e.m18463a(str, false);
            mo17149a().f22782c.m18438a(false, false);
        } else if (mo17149a().f22784e.m18457b(str) != null) {
            mo17149a().f22784e.m18463a(str, true);
            mo17149a().f22782c.m18438a(false, false);
        } else {
            C1475an c1475an = new C1475an(this.f22833O);
            c1475an.f22682q = new C1546bv(this.f22843a, c1475an);
            c1475an.f22670g = true;
            c1475an.f22672i = 120000L;
            c1475an.f22673j = new AbstractC1554cb() { // from class: com.amap.api.mapcore2d.b.5
                static {
                    Covode.recordClassIndex(5060);
                }

                @Override // com.amap.api.mapcore2d.AbstractC1554cb
                /* renamed from: a */
                public String mo18208a(int i, int i2, int i3) {
                    return C1495ax.m18504a().m18502c() + "/trafficengine/mapabc/traffictile?v=w2.61&zoom=" + (17 - i3) + "&x=" + i + "&y=" + i2;
                }
            };
            c1475an.f22665b = str;
            c1475an.f22668e = false;
            c1475an.m18615a(true);
            c1475an.f22669f = false;
            c1475an.f22666c = 18;
            c1475an.f22667d = 9;
            mo17149a().f22784e.m18466a(c1475an, getContext());
            mo17149a().f22784e.m18463a(str, true);
            mo17149a().f22782c.m18438a(false, false);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* renamed from: b */
    private void m18398b(int i, int i2) {
        if (this.f22869ap == null) {
            return;
        }
        this.f22849aF = i;
        this.f22850aG = i2;
        m18423B();
    }

    @Override // com.amap.api.interfaces.IAMap
    public void animateCameraWithCallback(CameraUpdate cameraUpdate, AMap.CancelableCallback cancelableCallback) {
        if (cameraUpdate == null) {
            return;
        }
        try {
            animateCameraWithDurationAndCallback(cameraUpdate, 250L, cancelableCallback);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C1499az c1499az = this.f22843a;
        if (c1499az == null) {
            return true;
        }
        if (!this.f22893o) {
            return false;
        }
        if (c1499az.f22784e.m18471a(i, keyEvent) || this.f22880b.onKey(this, i, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        C1499az c1499az = this.f22843a;
        if (c1499az == null) {
            return true;
        }
        if (!this.f22893o) {
            return false;
        }
        if (c1499az.f22784e.m18460b(i, keyEvent) || this.f22880b.onKey(this, i, keyEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m18412a(Context context, AttributeSet attributeSet) {
        C1771q.f24013b = C1573cq.m18121c(context);
        this.f22892n = context;
        try {
            this.f22865al = new C1723g(this.f22892n, this);
            this.f22842Z = new C1530bi(this);
            setBackgroundColor(Color.rgb(222, 215, 214));
            C1765n.m17212a().m17211a(this);
            C1762l.m17233a().m17232a(this);
            this.f22827I = new C1460a(this);
            this.f22819A = new C1598d(this);
            this.f22831M = new C1761k(context);
            this.f22887i = new C1543bu(this.f22892n, this);
            this.f22843a = new C1499az(this.f22892n, this, C1771q.f24021j);
            this.f22887i.m18247a(true);
            this.f22833O = this.f22843a.f22787h;
            this.f22880b = new View$OnKeyListenerC1480aq(this.f22843a);
            this.f22886h = new C1552ca(this);
            this.f22884f = new C1557ce(this.f22892n, this.f22880b, this);
            this.f22885g = new C1490au(this.f22892n, this);
            this.f22903y = new C1477ap(this.f22892n, this.f22883e, this);
            this.f22823E = new C1556cd(this.f22892n, this);
            this.f22824F = new C1532bk(this.f22892n, this);
            this.f22826H = new C1768p(this.f22892n, this.f22883e, this);
            this.f22888j = new C1486at(this.f22892n, attributeSet, this);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            m18358y();
            this.f22885g.addView(this.f22887i, layoutParams);
            this.f22885g.addView(this.f22823E, layoutParams);
            this.f22885g.addView(this.f22824F, layoutParams);
            this.f22885g.addView(this.f22888j, new C1490au.C1491a(layoutParams));
            this.f22885g.addView(this.f22884f, new C1490au.C1491a(-2, -2, new LatLng(0.0d, 0.0d), 0, 0, 83));
            this.f22885g.addView(this.f22903y, new C1490au.C1491a(-2, -2, new LatLng(0.0d, 0.0d), 0, 0, 83));
            try {
                if (!m18390c().isMyLocationButtonEnabled()) {
                    this.f22903y.setVisibility(8);
                }
            } catch (RemoteException e) {
                C1569cm.m18147a(e, "AMapDelegateImpGLSurfaceView", "initEnviornment");
            }
            this.f22826H.setVisibility(8);
            this.f22885g.addView(this.f22826H, new C1490au.C1491a(-2, -2, new LatLng(0.0d, 0.0d), 0, 0, 51));
            this.f22822D = new C1521bc(this, this.f22892n);
            this.f22884f.setId(C1758h.f23939a);
            this.f22865al.setName("AuthThread");
            this.f22865al.start();
            if (this.f22864ak == null) {
                this.f22864ak = new Timer();
                this.f22864ak.schedule(this.f22866am, 10000L, 1000L);
            }
            this.f22825G = new C1551c(this.f22892n);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMapDelegateImpGLSurfaceView", "initEnviornment");
        }
    }

    /* renamed from: a */
    public static float m18417a(float f, float f2, double d) {
        return (float) (d / Math.pow(2.0d, f - f2));
    }

    @Override // com.amap.api.mapcore2d.AbstractC1783y
    /* renamed from: b */
    public void mo17144b(double d, double d2, C1465ae c1465ae) {
        if (this.f22833O == null) {
            return;
        }
        getZoomLevel();
        C1781w c1781w = new C1781w((int) C1773r.m17197a(d), (int) C1773r.m17197a(d2));
        C1492av c1492av = this.f22833O;
        PointF m18506b = c1492av.m18506b(c1781w, c1492av.f22741l, this.f22833O.f22743n, this.f22833O.f22740k);
        if (c1465ae != null) {
            c1465ae.f22658a = (int) m18506b.x;
            c1465ae.f22659b = (int) m18506b.y;
        }
    }

    /* renamed from: a */
    private void m18414a(int i, int i2, C1465ae c1465ae) {
        getZoomLevel();
        PointF pointF = new PointF(i, i2);
        C1492av c1492av = this.f22833O;
        C1781w m18515a = c1492av.m18515a(pointF, c1492av.f22741l, this.f22833O.f22743n, this.f22833O.f22740k, this.f22833O.f22744o);
        if (c1465ae != null) {
            c1465ae.f22658a = (int) m18515a.m17158e();
            c1465ae.f22659b = (int) m18515a.m17157f();
        }
    }

    @Override // com.amap.api.interfaces.IAMap
    public void animateCameraWithDurationAndCallback(CameraUpdate cameraUpdate, long j, AMap.CancelableCallback cancelableCallback) {
        if (cameraUpdate == null) {
            return;
        }
        MapCameraMessage cameraUpdateFactoryDelegate = cameraUpdate.getCameraUpdateFactoryDelegate();
        if (cameraUpdateFactoryDelegate.nowType == MapCameraMessage.Type.newLatLngBounds && !C1569cm.m18156a(getWidth(), getHeight())) {
            this.f22900v = cameraUpdate;
            this.f22901w = j;
            this.f22902x = cancelableCallback;
        } else if (this.f22880b == null) {
        } else {
            if (cancelableCallback != null) {
                try {
                    this.f22832N = cancelableCallback;
                } catch (Throwable th) {
                    C1569cm.m18147a(th, "AMapDelegateImpGLSurfaceView", "animateCameraWithDurationAndCallback");
                    return;
                }
            }
            if (this.f22880b.m18571f()) {
                this.f22880b.m18569g();
            }
            if (cancelableCallback != null) {
                this.f22832N = cancelableCallback;
            }
            if (this.f22828J) {
                this.f22829K = true;
            }
            if (cameraUpdateFactoryDelegate.nowType == MapCameraMessage.Type.scrollBy) {
                m18362r();
                if (this.f22843a == null || !this.f22893o) {
                    return;
                }
                this.f22880b.m18595a((int) cameraUpdateFactoryDelegate.xPixel, (int) cameraUpdateFactoryDelegate.yPixel, (int) j);
                postInvalidate();
            } else if (cameraUpdateFactoryDelegate.nowType == MapCameraMessage.Type.zoomIn) {
                this.f22880b.m18599a((int) j);
            } else if (cameraUpdateFactoryDelegate.nowType == MapCameraMessage.Type.zoomOut) {
                this.f22880b.m18584b((int) j);
            } else if (cameraUpdateFactoryDelegate.nowType == MapCameraMessage.Type.zoomTo) {
                this.f22880b.m18601a(cameraUpdateFactoryDelegate.zoom, (int) j);
            } else if (cameraUpdateFactoryDelegate.nowType == MapCameraMessage.Type.zoomBy) {
                float f = cameraUpdateFactoryDelegate.amount;
                Point point = cameraUpdateFactoryDelegate.focus;
                if (point == null) {
                    point = new Point(this.f22843a.f22782c.m18433c() / 2, this.f22843a.f22782c.m18432d() / 2);
                }
                m18416a(f, point, true, j);
            } else if (cameraUpdateFactoryDelegate.nowType == MapCameraMessage.Type.newCameraPosition) {
                CameraPosition cameraPosition = cameraUpdateFactoryDelegate.cameraPosition;
                this.f22880b.m18579c(cameraPosition.zoom);
                this.f22880b.m18589a(new C1781w((int) (cameraPosition.target.latitude * 1000000.0d), (int) (cameraPosition.target.longitude * 1000000.0d)), (int) j);
            } else if (cameraUpdateFactoryDelegate.nowType == MapCameraMessage.Type.changeCenter) {
                CameraPosition cameraPosition2 = cameraUpdateFactoryDelegate.cameraPosition;
                this.f22880b.m18589a(new C1781w((int) (cameraPosition2.target.latitude * 1000000.0d), (int) (cameraPosition2.target.longitude * 1000000.0d)), (int) j);
            } else if (cameraUpdateFactoryDelegate.nowType != MapCameraMessage.Type.newLatLngBounds && cameraUpdateFactoryDelegate.nowType != MapCameraMessage.Type.newLatLngBoundsWithSize) {
                cameraUpdateFactoryDelegate.isChangeFinished = true;
                this.f22883e.m18555a((C1764m) cameraUpdateFactoryDelegate);
            } else {
                m18362r();
                m18410a(cameraUpdateFactoryDelegate, true, j);
            }
        }
    }

    @Override // com.amap.api.mapcore2d.AbstractC1783y
    /* renamed from: b */
    public void mo17143b(int i, int i2, C1774s c1774s) {
        if (c1774s != null) {
            c1774s.f24037a = C1773r.m17196a(i);
            c1774s.f24038b = C1773r.m17196a(i2);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.f22871ar.f22948k && motionEvent.getEventTime() - this.f22871ar.f22952o >= 30) {
            postInvalidate();
            this.f22856ac = false;
            try {
                if (!this.f22886h.isScrollGesturesEnabled()) {
                    return true;
                }
            } catch (RemoteException e) {
                C1569cm.m18147a(e, "AMapDelegateImpGLSurfaceView", "onFling");
            }
            this.f22832N = null;
            int i = this.f22846aC;
            int i2 = this.f22847aD;
            this.f22874au.fling(this.f22875av, this.f22876aw, (((int) (-f)) * 3) / 5, (((int) (-f2)) * 3) / 5, -i, i, -i2, i2);
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.f22871ar.f22948k && motionEvent2.getEventTime() - this.f22871ar.f22952o >= 30) {
            try {
                if (!this.f22886h.isScrollGesturesEnabled()) {
                    this.f22856ac = false;
                    return true;
                }
            } catch (RemoteException e) {
                C1569cm.m18147a(e, "AMapDelegateImpGLSurfaceView", "onScroll");
            }
            if (this.f22851aK > 1) {
                this.f22856ac = false;
                return true;
            }
            this.f22856ac = true;
            m18398b((int) motionEvent2.getX(), (int) motionEvent2.getY());
            postInvalidate();
            m18362r();
        }
        return true;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f22843a.f22787h.m18518a(new Point(i / 2, i2 / 2));
        this.f22843a.f22782c.m18442a(i, i2);
        if (this.f22880b.m18606a() != 0.0f && this.f22880b.m18587b() != 0.0f) {
            View$OnKeyListenerC1480aq view$OnKeyListenerC1480aq = this.f22880b;
            view$OnKeyListenerC1480aq.m18604a(view$OnKeyListenerC1480aq.m18606a(), this.f22880b.m18587b());
            this.f22880b.m18605a(0.0f);
            this.f22880b.m18586b(0.0f);
        }
        redrawInfoWindow();
        AbstractC1513a abstractC1513a = this.f22853aM;
        if (abstractC1513a != null) {
            abstractC1513a.m18356a(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    private void m18415a(float f, PointF pointF, float f2, float f3) {
        try {
            if (!this.f22886h.isZoomGesturesEnabled()) {
                return;
            }
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "AMapDelegateImpGLSurfaceView", "doScale");
        }
        C1499az c1499az = this.f22843a;
        if (c1499az != null && c1499az.f22782c != null) {
            this.f22851aK = 2;
            int m18433c = this.f22843a.f22782c.m18433c() / 2;
            int m18432d = this.f22843a.f22782c.m18432d() / 2;
            float m18418a = m18418a((float) (this.f22843a.f22782c.m18431e() + (Math.log(f) / Math.log(2.0d))));
            if (m18418a != this.f22843a.f22782c.m18431e()) {
                float[] fArr = this.f22881c;
                fArr[0] = fArr[1];
                fArr[1] = m18418a;
                if (fArr[0] != fArr[1]) {
                    C1781w mo18287a = this.f22843a.f22781b.mo18287a(m18433c, m18432d);
                    this.f22843a.f22782c.m18444a(m18418a);
                    this.f22843a.f22782c.m18439a(mo18287a);
                    m18421D();
                }
            }
        }
    }
}
