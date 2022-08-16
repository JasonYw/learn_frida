package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.amap.api.maps2d.MapsInitializer;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.amap.api.mapcore2d.az */
/* loaded from: classes19.dex */
public class C1499az {

    /* renamed from: a */
    public static double f22780a = 0.6499999761581421d;

    /* renamed from: c */
    public C1505c f22782c;

    /* renamed from: e */
    public C1501a f22784e;

    /* renamed from: f */
    public C1778v f22785f;

    /* renamed from: g */
    public GestureDetector$OnDoubleTapListenerC1507b f22786g;

    /* renamed from: h */
    public C1492av f22787h;

    /* renamed from: i */
    public C1475an f22788i;

    /* renamed from: b */
    public C1506d f22781b = new C1506d();

    /* renamed from: d */
    public C1504b f22783d = new C1504b();

    /* renamed from: com.amap.api.mapcore2d.az$1 */
    /* loaded from: classes19.dex */
    public static /* synthetic */ class C15001 {
        static {
            Covode.recordClassIndex(5048);
        }
    }

    /* renamed from: com.amap.api.mapcore2d.az$c */
    /* loaded from: classes19.dex */
    public class C1505c {

        /* renamed from: a */
        public boolean f22809a;

        /* renamed from: c */
        public GestureDetector$OnDoubleTapListenerC1507b f22811c;

        /* renamed from: d */
        public ArrayList<AbstractC1555cc> f22812d;

        static {
            Covode.recordClassIndex(5053);
        }

        /* renamed from: c */
        public int m18433c() {
            return C1771q.f24025n;
        }

        /* renamed from: d */
        public int m18432d() {
            return C1771q.f24026o;
        }

        /* renamed from: g */
        public GestureDetector$OnDoubleTapListenerC1507b m18429g() {
            return this.f22811c;
        }

        /* renamed from: a */
        public int m18445a() {
            try {
                return C1499az.this.f22787h.f22738i;
            } catch (Throwable th) {
                C1569cm.m18147a(th, "Mediator", "getMaxZoomLevel");
                return 0;
            }
        }

        /* renamed from: b */
        public int m18437b() {
            try {
                return C1499az.this.f22787h.f22737h;
            } catch (Throwable th) {
                C1569cm.m18147a(th, "Mediator", "getMinZoomLevel");
                return 0;
            }
        }

        /* renamed from: e */
        public float m18431e() {
            try {
                return C1499az.this.f22787h.f22739j;
            } catch (Throwable th) {
                C1569cm.m18147a(th, "Mediator", "getZoomLevel");
                return 0.0f;
            }
        }

        /* renamed from: f */
        public C1781w m18430f() {
            C1781w m18507b = C1499az.this.f22787h.m18507b(C1499az.this.f22787h.f22741l);
            if (C1499az.this.f22783d != null && C1499az.this.f22783d.f22806a) {
                return C1499az.this.f22787h.f22742m;
            }
            return m18507b;
        }

        /* renamed from: a */
        public void m18440a(AbstractC1555cc abstractC1555cc) {
            this.f22812d.add(abstractC1555cc);
        }

        /* renamed from: b */
        public void m18435b(AbstractC1555cc abstractC1555cc) {
            this.f22812d.remove(abstractC1555cc);
        }

        /* renamed from: a */
        public void m18443a(int i) {
            if (i <= 0) {
                return;
            }
            try {
                C1499az.this.f22787h.f22738i = i;
                C1771q.m17201a(i);
            } catch (Throwable th) {
                C1569cm.m18147a(th, "Mediator", "setMaxZoomLevel");
            }
        }

        /* renamed from: b */
        public void m18436b(int i) {
            if (i <= 0) {
                return;
            }
            try {
                C1499az.this.f22787h.f22737h = i;
                C1771q.m17198b(i);
            } catch (Throwable th) {
                C1569cm.m18147a(th, "Mediator", "setMinZoomLevel");
            }
        }

        /* renamed from: b */
        public void m18434b(C1781w c1781w) {
            C1781w m18430f = C1499az.this.f22782c.m18430f();
            if (c1781w != null && !c1781w.equals(m18430f)) {
                if (C1771q.f24030s) {
                    C1499az.this.f22787h.f22741l = C1499az.this.f22787h.m18514a(c1781w);
                }
                m18438a(false, true);
            }
        }

        /* renamed from: a */
        public void m18444a(float f) {
            int i;
            double d;
            if (f != C1499az.this.f22787h.f22739j) {
                C1499az.this.f22787h.f22739j = f;
                double d2 = C1499az.this.f22787h.f22733d / (1 << i);
                float f2 = f - ((int) f);
                double d3 = f2;
                if (d3 < C1499az.f22780a) {
                    C1499az.this.f22787h.f22730a = (int) (C1499az.this.f22787h.f22731b * ((d3 * 0.4d) + 1.0d));
                    d = C1499az.this.f22787h.f22730a / C1499az.this.f22787h.f22731b;
                } else {
                    C1499az.this.f22787h.f22730a = (int) (C1499az.this.f22787h.f22731b / (2.0f / (2.0f - ((1.0f - f2) * 0.4f))));
                    d = C1499az.this.f22787h.f22730a / C1499az.this.f22787h.f22731b;
                    d2 /= 2.0d;
                }
                C1499az.this.f22787h.f22740k = d2 / d;
                C1499az.this.f22786g.f22881c[1] = f;
                C1499az.this.f22786g.f22884f.m18192a(f);
            }
            m18438a(false, false);
        }

        /* renamed from: a */
        public void m18439a(C1781w c1781w) {
            if (c1781w == null) {
                return;
            }
            if (C1771q.f24030s) {
                C1499az.this.f22787h.f22741l = C1499az.this.f22787h.m18514a(c1781w);
            }
            m18438a(false, false);
        }

        public C1505c(GestureDetector$OnDoubleTapListenerC1507b gestureDetector$OnDoubleTapListenerC1507b) {
            this.f22809a = true;
            this.f22811c = gestureDetector$OnDoubleTapListenerC1507b;
            this.f22812d = new ArrayList<>();
        }

        /* renamed from: a */
        public void m18442a(int i, int i2) {
            if (i != C1771q.f24025n || i2 != C1771q.f24026o) {
                C1771q.f24025n = i;
                C1771q.f24026o = i2;
                m18438a(true, false);
            }
        }

        /* renamed from: a */
        public void m18438a(boolean z, boolean z2) {
            Iterator<AbstractC1555cc> it = this.f22812d.iterator();
            while (it.hasNext()) {
                it.next().mo18207a(z, z2);
            }
            if (C1499az.this.f22786g != null && C1499az.this.f22786g.f22887i != null) {
                C1499az.this.f22786g.f22887i.m18247a(true);
                C1499az.this.f22786g.postInvalidate();
            }
        }

        public /* synthetic */ C1505c(C1499az c1499az, GestureDetector$OnDoubleTapListenerC1507b gestureDetector$OnDoubleTapListenerC1507b, C15001 c15001) {
            this(gestureDetector$OnDoubleTapListenerC1507b);
        }
    }

    /* renamed from: com.amap.api.mapcore2d.az$a */
    /* loaded from: classes19.dex */
    public class C1501a {

        /* renamed from: a */
        public C1536bn<C1475an> f22789a;

        /* renamed from: b */
        public boolean f22790b;

        /* renamed from: c */
        public boolean f22791c;

        /* renamed from: d */
        public String f22792d;

        /* renamed from: e */
        public int f22793e;

        /* renamed from: f */
        public int f22794f;

        /* renamed from: g */
        public String f22795g;

        /* renamed from: h */
        public String f22796h;

        /* renamed from: i */
        public String f22797i;

        /* renamed from: j */
        public String f22798j;

        /* renamed from: l */
        public boolean f22800l;

        /* renamed from: m */
        public boolean f22801m;

        /* renamed from: n */
        public Context f22802n;

        /* renamed from: o */
        public boolean f22803o;

        static {
            Covode.recordClassIndex(5049);
        }

        /* renamed from: c */
        private int m18455c() {
            return 3;
        }

        /* renamed from: a */
        public boolean m18471a(int i, KeyEvent keyEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean m18467a(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: b */
        public boolean m18460b(int i, KeyEvent keyEvent) {
            return false;
        }

        /* renamed from: b */
        public boolean m18458b(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean m18463a(String str, boolean z) {
            if (str.equals("")) {
                return false;
            }
            int size = this.f22789a.size();
            for (int i = 0; i < size; i++) {
                C1475an c1475an = this.f22789a.get(i);
                if (c1475an != null && c1475an.f22665b.equals(str)) {
                    c1475an.m18615a(z);
                    if (!c1475an.f22668e) {
                        return true;
                    }
                    if (z) {
                        if (c1475an.f22666c > c1475an.f22667d) {
                            C1499az.this.f22782c.m18443a(c1475an.f22666c);
                            C1499az.this.f22782c.m18436b(c1475an.f22667d);
                        }
                        m18453c(str);
                        C1499az.this.f22782c.m18438a(false, false);
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: d */
        private void m18452d() {
            int size = this.f22789a.size();
            for (int i = 0; i < size; i++) {
                C1475an c1475an = this.f22789a.get(i);
                if (c1475an != null) {
                    c1475an.f22675l = i;
                }
            }
        }

        /* renamed from: b */
        public void m18461b() {
            if (C1499az.this.f22782c != null && C1499az.this.f22782c.f22811c != null) {
                C1499az.this.f22782c.f22811c.postInvalidate();
            }
        }

        /* renamed from: a */
        public void m18472a() {
            if (C1499az.this.f22784e.f22789a == null) {
                return;
            }
            Iterator<C1475an> it = C1499az.this.f22784e.f22789a.iterator();
            while (it.hasNext()) {
                C1475an next = it.next();
                if (next != null) {
                    next.m18614b();
                }
            }
            C1499az.this.f22784e.f22789a.clear();
            C1499az.this.f22784e.f22789a = null;
        }

        /* renamed from: b */
        public void m18456b(boolean z) {
            this.f22801m = z;
        }

        /* renamed from: a */
        public void m18462a(boolean z) {
            this.f22800l = z;
        }

        /* renamed from: b */
        private void m18459b(Canvas canvas) {
            if (this.f22801m) {
                C1499az.this.f22785f.m17177a(canvas);
            }
        }

        /* renamed from: c */
        private void m18454c(Canvas canvas) {
            C1499az.this.f22786g.f22888j.m18553a(canvas);
        }

        /* renamed from: a */
        private void m18469a(Canvas canvas) {
            int size = this.f22789a.size();
            for (int i = 0; i < size; i++) {
                C1475an c1475an = this.f22789a.get(i);
                if (c1475an != null && c1475an.m18617a()) {
                    c1475an.m18616a(canvas);
                }
            }
        }

        /* renamed from: c */
        private void m18453c(String str) {
            if (str.equals("")) {
                return;
            }
            int size = this.f22789a.size();
            for (int i = 0; i < size; i++) {
                C1475an c1475an = this.f22789a.get(i);
                if (c1475an != null && !c1475an.f22665b.equals(str) && c1475an.f22668e && c1475an.m18617a()) {
                    c1475an.m18615a(false);
                }
            }
        }

        /* renamed from: d */
        private boolean m18451d(String str) {
            C1536bn<C1475an> c1536bn = this.f22789a;
            if (c1536bn == null) {
                return false;
            }
            int size = c1536bn.size();
            for (int i = 0; i < size; i++) {
                C1475an c1475an = this.f22789a.get(i);
                if (c1475an != null && c1475an.f22665b.equals(str)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public C1475an m18457b(String str) {
            C1536bn<C1475an> c1536bn;
            if (!str.equals("") && (c1536bn = this.f22789a) != null && c1536bn.size() != 0) {
                int size = this.f22789a.size();
                for (int i = 0; i < size; i++) {
                    C1475an c1475an = this.f22789a.get(i);
                    if (c1475an != null && c1475an.f22665b.equals(str)) {
                        return c1475an;
                    }
                }
            }
            return null;
        }

        /* renamed from: a */
        public void m18464a(String str) {
            if (str == null || str.equals("") || this.f22792d.equals(str)) {
                return;
            }
            if (!str.equals("zh_cn") && !str.equals("en")) {
                return;
            }
            if (C1771q.f24018g != null && !C1771q.f24018g.equals("")) {
                this.f22795g = C1771q.f24018g;
            } else if (str.equals("zh_cn")) {
                this.f22795g = "GridMapV3";
            } else if (str.equals("en")) {
                this.f22795g = "GridMapEnV3";
            }
            C1499az.this.f22788i = m18457b(this.f22795g);
            if (C1499az.this.f22788i == null) {
                C1499az c1499az = C1499az.this;
                c1499az.f22788i = new C1475an(c1499az.f22787h);
                C1475an c1475an = C1499az.this.f22788i;
                C1499az c1499az2 = C1499az.this;
                c1475an.f22682q = new C1546bv(c1499az2, c1499az2.f22788i);
                C1499az.this.f22788i.f22673j = new AbstractC1554cb() { // from class: com.amap.api.mapcore2d.az.a.1
                    static {
                        Covode.recordClassIndex(5050);
                    }

                    @Override // com.amap.api.mapcore2d.AbstractC1554cb
                    /* renamed from: a */
                    public String mo18208a(int i, int i2, int i3) {
                        if (C1771q.f24019h != null && !C1771q.f24019h.equals("")) {
                            return String.format(Locale.US, C1771q.f24019h, Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2));
                        }
                        return String.format(Locale.US, C1495ax.m18504a().m18503b(), Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2), C1501a.this.f22792d);
                    }
                };
                if (C1771q.f24019h != null && !C1771q.f24019h.equals("")) {
                    C1499az.this.f22788i.f22671h = false;
                } else {
                    C1499az.this.f22788i.f22671h = true;
                }
                C1499az.this.f22788i.f22665b = this.f22795g;
                C1499az.this.f22788i.f22668e = true;
                C1499az.this.f22788i.m18615a(true);
                C1499az.this.f22788i.f22669f = true;
                C1499az.this.f22788i.f22666c = C1771q.f24014c;
                C1499az.this.f22788i.f22667d = C1771q.f24015d;
                m18466a(C1499az.this.f22788i, this.f22802n);
            }
            m18463a(this.f22795g, true);
            this.f22792d = str;
        }

        public C1501a(Context context) {
            this.f22801m = true;
            this.f22792d = "zh_cn";
            this.f22796h = "SatelliteMap3";
            this.f22797i = "GridTmc3";
            this.f22798j = "SateliteTmc3";
            if (context == null) {
                return;
            }
            this.f22802n = context;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int m18455c = (displayMetrics.widthPixels / C1499az.this.f22787h.f22730a) + m18455c();
            int m18455c2 = (displayMetrics.heightPixels / C1499az.this.f22787h.f22730a) + m18455c();
            this.f22793e = (m18455c * m18455c2) + m18455c + m18455c2;
            this.f22794f = (this.f22793e / 8) + 1;
            int i = this.f22794f;
            if (i == 0) {
                this.f22794f = 1;
            } else if (i > 5) {
                this.f22794f = 5;
            }
            m18470a(context, "zh_cn");
        }

        /* renamed from: a */
        private void m18470a(Context context, String str) {
            if (this.f22789a == null) {
                this.f22789a = new C1536bn<>();
            }
            if (C1771q.f24018g != null && !C1771q.f24018g.equals("")) {
                this.f22795g = C1771q.f24018g;
            } else if (str.equals("zh_cn")) {
                this.f22795g = "GridMapV3";
            } else if (str.equals("en")) {
                this.f22795g = "GridMapEnV3";
            }
            C1475an c1475an = new C1475an(C1499az.this.f22787h);
            c1475an.f22673j = new AbstractC1554cb() { // from class: com.amap.api.mapcore2d.az.a.2
                static {
                    Covode.recordClassIndex(5051);
                }

                @Override // com.amap.api.mapcore2d.AbstractC1554cb
                /* renamed from: a */
                public String mo18208a(int i, int i2, int i3) {
                    if (C1771q.f24019h != null && !C1771q.f24019h.equals("")) {
                        return String.format(Locale.US, C1771q.f24019h, Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2));
                    }
                    return String.format(Locale.US, C1495ax.m18504a().m18503b(), Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2), C1501a.this.f22792d);
                }
            };
            if (C1771q.f24019h != null && !C1771q.f24019h.equals("")) {
                c1475an.f22671h = false;
            } else {
                c1475an.f22671h = true;
            }
            c1475an.f22665b = this.f22795g;
            c1475an.f22668e = true;
            c1475an.f22669f = true;
            c1475an.f22666c = C1771q.f24014c;
            c1475an.f22667d = C1771q.f24015d;
            c1475an.f22682q = new C1546bv(C1499az.this, c1475an);
            c1475an.m18615a(true);
            m18466a(c1475an, context);
        }

        /* renamed from: a */
        public boolean m18466a(C1475an c1475an, Context context) {
            boolean z = false;
            if (c1475an == null || c1475an.f22665b.equals("") || m18451d(c1475an.f22665b)) {
                return false;
            }
            c1475an.f22679p = new C1536bn<>();
            c1475an.f22677n = new C1515ba(this.f22793e, this.f22794f, c1475an.f22670g, c1475an.f22672i, c1475an);
            c1475an.f22678o = new C1776u(context, C1499az.this.f22782c.f22811c.f22882d, c1475an);
            c1475an.f22678o.m17188a(c1475an.f22677n);
            int size = this.f22789a.size();
            if (c1475an.f22668e && size != 0) {
                int i = size - 1;
                while (true) {
                    if (i >= 0) {
                        C1475an c1475an2 = this.f22789a.get(i);
                        if (c1475an2 != null && c1475an2.f22668e) {
                            this.f22789a.add(i, c1475an);
                            break;
                        }
                        i--;
                    } else {
                        break;
                    }
                }
            } else {
                z = this.f22789a.add(c1475an);
            }
            m18452d();
            if (c1475an.m18617a()) {
                m18463a(c1475an.f22665b, true);
            }
            return z;
        }

        public /* synthetic */ C1501a(C1499az c1499az, Context context, C15001 c15001) {
            this(context);
        }

        /* renamed from: a */
        public void m18468a(Canvas canvas, Matrix matrix, float f, float f2) {
            try {
                if (this.f22800l) {
                    canvas.save();
                    canvas.translate(f, f2);
                    canvas.concat(matrix);
                    m18469a(canvas);
                    if (C1499az.this.f22786g.f22887i.m18250a()) {
                        m18459b(canvas);
                    }
                    C1499az.this.f22786g.f22887i.m18249a(canvas);
                    canvas.restore();
                    if (!C1499az.this.f22786g.f22887i.m18250a()) {
                        m18459b(canvas);
                    }
                    if (!this.f22790b && !this.f22791c) {
                        m18462a(false);
                        C1499az.this.f22782c.f22811c.m18397b(new Matrix());
                        C1499az.this.f22782c.f22811c.m18389c(1.0f);
                        C1499az.this.f22782c.f22811c.m18364p();
                    }
                } else {
                    m18469a(canvas);
                    C1499az.this.f22786g.f22887i.m18249a(canvas);
                    m18459b(canvas);
                }
                m18454c(canvas);
            } catch (Throwable th) {
                C1569cm.m18147a(th, "Mediator", "draw");
            }
        }
    }

    static {
        Covode.recordClassIndex(5047);
    }

    /* renamed from: c */
    private void m18473c() {
        C1528bg.m18296a();
        String m18292a = C1528bg.m18292a("cache_path", (String) null);
        if (m18292a != null) {
            C1776u.m17185a(m18292a);
        }
        C1528bg.m18296a().m18289b("updateDataPeriodDate", C1775t.m17195a());
    }

    /* renamed from: a */
    public void m18479a() {
        this.f22784e.m18472a();
        this.f22781b = null;
        this.f22782c = null;
        this.f22783d = null;
        this.f22784e = null;
        if (MapsInitializer.getUpdateDataActiveEnable() && C1771q.m17199b()) {
            m18473c();
        }
    }

    /* renamed from: com.amap.api.mapcore2d.az$b */
    /* loaded from: classes19.dex */
    public class C1504b {

        /* renamed from: a */
        public boolean f22806a;

        /* renamed from: b */
        public int f22807b;

        static {
            Covode.recordClassIndex(5052);
        }

        /* renamed from: b */
        public void m18449b() {
            C1499az.this.f22782c.f22809a = false;
            if (C1499az.this.f22784e.f22789a != null && C1499az.this.f22784e.f22789a.size() != 0) {
                int size = C1499az.this.f22784e.f22789a.size();
                for (int i = 0; i < size; i++) {
                    C1499az.this.f22784e.f22789a.get(i).f22682q.mo17557b();
                }
            }
        }

        /* renamed from: c */
        public void m18448c() {
            if (C1499az.this.f22784e.f22789a != null && C1499az.this.f22784e.f22789a.size() != 0) {
                try {
                    int size = C1499az.this.f22784e.f22789a.size();
                    for (int i = 0; i < size; i++) {
                        C1499az.this.f22784e.f22789a.get(i).f22682q.mo17553d();
                    }
                } catch (Throwable unused) {
                }
            }
        }

        /* renamed from: d */
        public void m18447d() {
            C1546bv c1546bv;
            if (C1499az.this.f22784e.f22789a != null && C1499az.this.f22784e.f22789a.size() != 0) {
                int size = C1499az.this.f22784e.f22789a.size();
                for (int i = 0; i < size; i++) {
                    C1475an c1475an = C1499az.this.f22784e.f22789a.get(i);
                    if (c1475an != null && (c1546bv = c1475an.f22682q) != null) {
                        c1546bv.mo17554c();
                    }
                }
            }
        }

        /* renamed from: e */
        public void m18446e() {
            C1546bv c1546bv;
            if (C1499az.this.f22784e.f22789a != null && C1499az.this.f22784e.f22789a.size() != 0) {
                int size = C1499az.this.f22784e.f22789a.size();
                for (int i = 0; i < size; i++) {
                    C1475an c1475an = C1499az.this.f22784e.f22789a.get(i);
                    if (c1475an != null && (c1546bv = c1475an.f22682q) != null) {
                        c1546bv.m18505h();
                    }
                }
            }
        }

        /* renamed from: a */
        public void m18450a() {
            if (C1499az.this.f22784e.f22803o) {
                C1499az.this.f22784e.m18461b();
            }
            this.f22807b++;
            int i = this.f22807b;
            if (i >= 20 && i % 20 == 0 && C1499az.this.f22784e.f22789a != null && C1499az.this.f22784e.f22789a.size() != 0) {
                int size = C1499az.this.f22784e.f22789a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C1499az.this.f22784e.f22789a.get(i2).f22682q.mo18235i();
                }
            }
        }

        public C1504b() {
            m18446e();
        }
    }

    /* renamed from: b */
    private void m18474b() {
        if (MapsInitializer.getUpdateDataActiveEnable()) {
            C1528bg.m18296a();
            String m18294a = C1528bg.m18294a("updateDataPeriodDate");
            if (m18294a != null && !m18294a.equals("")) {
                if (C1775t.m17194a(m18294a, C1775t.m17195a()) > C1528bg.m18296a().m18293a("period_day", C1771q.f24028q)) {
                    m18473c();
                    return;
                }
                return;
            }
            C1528bg.m18296a().m18289b("updateDataPeriodDate", C1775t.m17195a());
        }
    }

    /* renamed from: com.amap.api.mapcore2d.az$d */
    /* loaded from: classes19.dex */
    public class C1506d implements AbstractC1529bh {

        /* renamed from: b */
        public float f22814b;

        /* renamed from: c */
        public HashMap<Float, Float> f22815c = new HashMap<>();

        static {
            Covode.recordClassIndex(5054);
        }

        public C1506d() {
        }

        /* renamed from: a */
        public float m18428a(float f) {
            float m18431e = C1499az.this.f22782c.m18431e();
            if (this.f22815c.size() > 30 || m18431e != this.f22814b) {
                this.f22814b = m18431e;
                this.f22815c.clear();
            }
            if (!this.f22815c.containsKey(Float.valueOf(f))) {
                float m18512a = C1499az.this.f22787h.m18512a(mo18287a(0, 0), mo18287a(0, 100));
                if (m18512a <= 0.0f) {
                    return 0.0f;
                }
                this.f22815c.put(Float.valueOf(f), Float.valueOf((f / m18512a) * 100.0f));
            }
            return this.f22815c.get(Float.valueOf(f)).floatValue();
        }

        @Override // com.amap.api.mapcore2d.AbstractC1529bh
        /* renamed from: a */
        public Point mo18286a(C1781w c1781w, Point point) {
            boolean z;
            int i;
            int i2;
            if (c1781w == null) {
                return null;
            }
            PointF m18506b = C1499az.this.f22787h.m18506b(c1781w, C1499az.this.f22787h.f22741l, C1499az.this.f22787h.f22743n, C1499az.this.f22787h.f22740k);
            AbstractC1518bb m18371l = C1499az.this.f22782c.f22811c.m18371l();
            Point point2 = C1499az.this.f22782c.f22811c.mo17149a().f22787h.f22743n;
            if (m18371l.f22950m) {
                try {
                    z = C1499az.this.f22786g.f22886h.isZoomGesturesEnabled();
                } catch (RemoteException e) {
                    e.printStackTrace();
                    z = true;
                }
                if (m18371l.f22949l && z) {
                    float f = (AbstractC1518bb.f22934j * (((int) m18506b.x) - m18371l.f22944f.x)) + m18371l.f22944f.x + (m18371l.f22945g.x - m18371l.f22944f.x);
                    float f2 = (AbstractC1518bb.f22934j * (((int) m18506b.y) - m18371l.f22944f.y)) + m18371l.f22944f.y + (m18371l.f22945g.y - m18371l.f22944f.y);
                    i = (int) f;
                    i2 = (int) f2;
                    if (f >= i + 0.5d) {
                        i++;
                    }
                    if (f2 >= i2 + 0.5d) {
                        i2++;
                    }
                } else {
                    i = (int) m18506b.x;
                    i2 = (int) m18506b.y;
                }
            } else {
                float f3 = (C1499az.this.f22787h.f22732c * (((int) m18506b.x) - point2.x)) + point2.x;
                float f4 = (C1499az.this.f22787h.f22732c * (((int) m18506b.y) - point2.y)) + point2.y;
                i = (int) f3;
                i2 = (int) f4;
                if (f3 >= i + 0.5d) {
                    i++;
                }
                if (f4 >= i2 + 0.5d) {
                    i2++;
                }
            }
            Point point3 = new Point(i, i2);
            if (point != null) {
                point.x = point3.x;
                point.y = point3.y;
            }
            return point3;
        }

        @Override // com.amap.api.mapcore2d.AbstractC1529bh
        /* renamed from: a */
        public C1781w mo18287a(int i, int i2) {
            return C1499az.this.f22787h.m18515a(new PointF(i, i2), C1499az.this.f22787h.f22741l, C1499az.this.f22787h.f22743n, C1499az.this.f22787h.f22740k, C1499az.this.f22787h.f22744o);
        }

        /* renamed from: a */
        public int m18427a(int i, int i2, int i3) {
            return m18426a(i, i2, i3, false);
        }

        /* renamed from: b */
        public int m18425b(int i, int i2, int i3) {
            return m18426a(i, i2, i3, true);
        }

        /* renamed from: a */
        private int m18426a(int i, int i2, int i3, boolean z) {
            if (i <= 0) {
                i = C1499az.this.f22782c.m18433c();
            }
            if (i2 <= 0) {
                i2 = C1499az.this.f22782c.m18432d();
            }
            C1781w mo18287a = mo18287a(i3, i2 - i3);
            C1781w mo18287a2 = mo18287a(i - i3, i3);
            if (z) {
                return Math.abs(mo18287a.m17164a() - mo18287a2.m17164a());
            }
            return Math.abs(mo18287a.m17162b() - mo18287a2.m17162b());
        }
    }

    /* renamed from: a */
    public void m18475a(boolean z) {
        this.f22784e.m18456b(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0032  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m18478a(android.content.Context r15) {
        /*
            r14 = this;
            java.lang.String r11 = "Mediator"
            java.lang.String r10 = "initialize"
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.content.Context r0 = r15.getApplicationContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r12 = r0.getDisplayMetrics()
            java.lang.Class r1 = r12.getClass()     // Catch: java.lang.SecurityException -> L20 java.lang.NoSuchFieldException -> L25
            java.lang.String r0 = "densityDpi"
            java.lang.reflect.Field r13 = r1.getField(r0)     // Catch: java.lang.SecurityException -> L20 java.lang.NoSuchFieldException -> L25
            goto L2a
        L20:
            r0 = move-exception
            com.amap.api.mapcore2d.C1569cm.m18147a(r0, r11, r10)
            goto L29
        L25:
            r0 = move-exception
            com.amap.api.mapcore2d.C1569cm.m18147a(r0, r11, r10)
        L29:
            r13 = 0
        L2a:
            r9 = 3
            r7 = 153600(0x25800, double:7.58885E-319)
            r3 = 1
            r6 = 2
            if (r13 == 0) goto L64
            int r1 = r12.widthPixels
            int r0 = r12.heightPixels
            int r1 = r1 * r0
            long r4 = (long) r1
            r2 = 160(0xa0, float:2.24E-43)
            int r1 = r13.getInt(r12)     // Catch: java.lang.IllegalArgumentException -> L58 java.lang.IllegalAccessException -> L5d
            r0 = 120(0x78, float:1.68E-43)
            if (r1 > r0) goto L43
            goto L79
        L43:
            if (r1 <= r2) goto L61
            r0 = 240(0xf0, float:3.36E-43)
            if (r1 > r0) goto L4c
            com.amap.api.mapcore2d.C1771q.f24024m = r6
            goto L7b
        L4c:
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 <= 0) goto L53
            com.amap.api.mapcore2d.C1771q.f24024m = r6
            goto L7b
        L53:
            if (r0 >= 0) goto L61
            com.amap.api.mapcore2d.C1771q.f24024m = r3
            goto L7b
        L58:
            r0 = move-exception
            com.amap.api.mapcore2d.C1569cm.m18147a(r0, r11, r10)
            goto L61
        L5d:
            r0 = move-exception
            com.amap.api.mapcore2d.C1569cm.m18147a(r0, r11, r10)
        L61:
            com.amap.api.mapcore2d.C1771q.f24024m = r9
            goto L7b
        L64:
            int r1 = r12.widthPixels
            int r0 = r12.heightPixels
            int r1 = r1 * r0
            long r1 = (long) r1
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L71
            com.amap.api.mapcore2d.C1771q.f24024m = r6
            goto L7b
        L71:
            if (r0 >= 0) goto L76
            com.amap.api.mapcore2d.C1771q.f24024m = r3
            goto L7b
        L76:
            com.amap.api.mapcore2d.C1771q.f24024m = r9
            goto L7b
        L79:
            com.amap.api.mapcore2d.C1771q.f24024m = r3
        L7b:
            int r0 = com.amap.api.mapcore2d.C1771q.f24024m
            if (r0 == r6) goto L83
            r0 = 18
            com.amap.api.mapcore2d.C1771q.f24014c = r0
        L83:
            com.amap.api.mapcore2d.C1528bg.m18295a(r15)
            boolean r0 = com.amap.api.maps2d.MapsInitializer.getUpdateDataActiveEnable()
            java.lang.String r1 = "UpdateDataActiveEnable"
            if (r0 == 0) goto L94
            com.amap.api.mapcore2d.C1528bg.m18296a()
            com.amap.api.mapcore2d.C1528bg.m18288b(r1, r3)
        L94:
            com.amap.api.mapcore2d.C1528bg.m18296a()
            r0 = 0
            boolean r0 = com.amap.api.mapcore2d.C1528bg.m18291a(r1, r0)
            com.amap.api.maps2d.MapsInitializer.setUpdateDataActiveEnable(r0)
            r14.m18474b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.C1499az.m18478a(android.content.Context):void");
    }

    public C1499az(Context context, GestureDetector$OnDoubleTapListenerC1507b gestureDetector$OnDoubleTapListenerC1507b, int i) {
        this.f22786g = gestureDetector$OnDoubleTapListenerC1507b;
        this.f22782c = new C1505c(this, gestureDetector$OnDoubleTapListenerC1507b, null);
        this.f22787h = new C1492av(this.f22782c);
        C1492av c1492av = this.f22787h;
        c1492av.f22730a = i;
        c1492av.f22731b = i;
        c1492av.m18521a();
        m18478a(context);
        this.f22784e = new C1501a(this, context, null);
        this.f22785f = new C1778v(gestureDetector$OnDoubleTapListenerC1507b);
        this.f22782c.m18438a(false, false);
    }
}
