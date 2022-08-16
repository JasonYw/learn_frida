package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Pair;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.amap.api.mapcore2d.bb */
/* loaded from: classes19.dex */
public abstract class AbstractC1518bb {

    /* renamed from: j */
    public static float f22934j = 1.0f;

    /* renamed from: p */
    public static Method f22935p;

    /* renamed from: q */
    public static Method f22936q;

    /* renamed from: r */
    public static boolean f22937r;

    /* renamed from: s */
    public static boolean f22938s;

    /* renamed from: a */
    public AbstractC1520b f22939a;

    /* renamed from: b */
    public int f22940b;

    /* renamed from: c */
    public Matrix f22941c = new Matrix();

    /* renamed from: d */
    public Matrix f22942d = new Matrix();

    /* renamed from: e */
    public PointF f22943e = new PointF();

    /* renamed from: f */
    public PointF f22944f = new PointF();

    /* renamed from: g */
    public PointF f22945g = new PointF();

    /* renamed from: h */
    public float f22946h = 1.0f;

    /* renamed from: i */
    public float f22947i = 1.0f;

    /* renamed from: k */
    public boolean f22948k = false;

    /* renamed from: l */
    public boolean f22949l = false;

    /* renamed from: m */
    public boolean f22950m = false;

    /* renamed from: n */
    public int f22951n = 0;

    /* renamed from: o */
    public long f22952o = 0;

    /* renamed from: com.amap.api.mapcore2d.bb$b */
    /* loaded from: classes19.dex */
    public interface AbstractC1520b {
        static {
            Covode.recordClassIndex(5068);
        }

        /* renamed from: a */
        boolean mo18334a(float f, float f2);

        /* renamed from: a */
        boolean mo18333a(float f, PointF pointF);

        /* renamed from: a */
        boolean mo18332a(Matrix matrix);

        /* renamed from: a */
        boolean mo18331a(PointF pointF);

        /* renamed from: b */
        boolean mo18330b(float f, PointF pointF);
    }

    static {
        Covode.recordClassIndex(5066);
    }

    /* renamed from: b */
    public static void m18339b(MotionEvent motionEvent) {
        if (f22938s) {
            return;
        }
        f22938s = true;
        try {
            f22935p = motionEvent.getClass().getMethod("getX", Integer.TYPE);
            f22936q = motionEvent.getClass().getMethod("getY", Integer.TYPE);
            if (f22935p != null && f22936q != null) {
                f22937r = true;
            }
        } catch (Exception e) {
            C1569cm.m18147a(e, "MutiTouchGestureDetector", "checkSDKForMuti");
        }
    }

    /* renamed from: com.amap.api.mapcore2d.bb$a */
    /* loaded from: classes19.dex */
    public static class C1519a extends AbstractC1518bb {

        /* renamed from: p */
        public float f22953p;

        /* renamed from: q */
        public float f22954q;

        /* renamed from: r */
        public float f22955r;

        /* renamed from: s */
        public float f22956s;

        /* renamed from: t */
        public long f22957t;

        /* renamed from: u */
        public int f22958u;

        /* renamed from: v */
        public int f22959v;

        /* renamed from: w */
        public long f22960w;

        static {
            Covode.recordClassIndex(5067);
        }

        public static Object com_amap_api_mapcore2d_bb$a_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
            ActionInvokeEntrance.setEventUuid(110000);
            Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_amap_api_mapcore2d_bb$a_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
            if (((Boolean) actionIntercept.first).booleanValue()) {
                return actionIntercept.second;
            }
            Object invoke = method.invoke(obj, objArr);
            ActionInvokeEntrance.actionInvokeReflection(invoke, method, new Object[]{obj, objArr}, "com_amap_api_mapcore2d_bb$a_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
            return invoke;
        }

        /* renamed from: b */
        private float m18335b(MotionEvent motionEvent) {
            float f;
            float f2 = 0.0f;
            try {
                f = ((Float) com_amap_api_mapcore2d_bb$a_java_lang_reflect_Method_invoke(AbstractC1518bb.f22935p, motionEvent, new Object[]{0})).floatValue() - ((Float) com_amap_api_mapcore2d_bb$a_java_lang_reflect_Method_invoke(AbstractC1518bb.f22935p, motionEvent, new Object[]{1})).floatValue();
            } catch (IllegalAccessException e) {
                C1569cm.m18147a(e, "MutiTouchGestureDetector", "distance");
                f = 0.0f;
                f2 = ((Float) com_amap_api_mapcore2d_bb$a_java_lang_reflect_Method_invoke(AbstractC1518bb.f22936q, motionEvent, new Object[]{0})).floatValue() - ((Float) com_amap_api_mapcore2d_bb$a_java_lang_reflect_Method_invoke(AbstractC1518bb.f22936q, motionEvent, new Object[]{1})).floatValue();
                return (float) Math.sqrt((f * f) + (f2 * f2));
            } catch (IllegalArgumentException e2) {
                C1569cm.m18147a(e2, "MutiTouchGestureDetector", "distance");
                f = 0.0f;
                f2 = ((Float) com_amap_api_mapcore2d_bb$a_java_lang_reflect_Method_invoke(AbstractC1518bb.f22936q, motionEvent, new Object[]{0})).floatValue() - ((Float) com_amap_api_mapcore2d_bb$a_java_lang_reflect_Method_invoke(AbstractC1518bb.f22936q, motionEvent, new Object[]{1})).floatValue();
                return (float) Math.sqrt((f * f) + (f2 * f2));
            } catch (InvocationTargetException e3) {
                C1569cm.m18147a(e3, "MutiTouchGestureDetector", "distance");
                f = 0.0f;
                f2 = ((Float) com_amap_api_mapcore2d_bb$a_java_lang_reflect_Method_invoke(AbstractC1518bb.f22936q, motionEvent, new Object[]{0})).floatValue() - ((Float) com_amap_api_mapcore2d_bb$a_java_lang_reflect_Method_invoke(AbstractC1518bb.f22936q, motionEvent, new Object[]{1})).floatValue();
                return (float) Math.sqrt((f * f) + (f2 * f2));
            }
            try {
                f2 = ((Float) com_amap_api_mapcore2d_bb$a_java_lang_reflect_Method_invoke(AbstractC1518bb.f22936q, motionEvent, new Object[]{0})).floatValue() - ((Float) com_amap_api_mapcore2d_bb$a_java_lang_reflect_Method_invoke(AbstractC1518bb.f22936q, motionEvent, new Object[]{1})).floatValue();
            } catch (IllegalAccessException e4) {
                C1569cm.m18147a(e4, "MutiTouchGestureDetector", "distance");
            } catch (IllegalArgumentException e5) {
                C1569cm.m18147a(e5, "MutiTouchGestureDetector", "distance");
            } catch (InvocationTargetException e6) {
                C1569cm.m18147a(e6, "MutiTouchGestureDetector", "distance");
            }
            return (float) Math.sqrt((f * f) + (f2 * f2));
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:2|3)|4|5|6|(1:10)|11|12|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
            com.amap.api.mapcore2d.C1569cm.m18147a(r0, "MutiTouchGestureDetector", "midPoint");
         */
        /* JADX WARN: Removed duplicated region for block: B:8:0x007b  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m18337a(android.graphics.PointF r11, android.view.MotionEvent r12) {
            /*
                r10 = this;
                java.lang.String r7 = "MutiTouchGestureDetector"
                java.lang.String r6 = "midPoint"
                r5 = 0
                r9 = 0
                r8 = 1
                java.lang.reflect.Method r2 = com.amap.api.mapcore2d.AbstractC1518bb.m18340b()     // Catch: java.lang.IllegalAccessException -> L35 java.lang.IllegalArgumentException -> L3a java.lang.reflect.InvocationTargetException -> L3f
                java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch: java.lang.IllegalAccessException -> L35 java.lang.IllegalArgumentException -> L3a java.lang.reflect.InvocationTargetException -> L3f
                java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.IllegalAccessException -> L35 java.lang.IllegalArgumentException -> L3a java.lang.reflect.InvocationTargetException -> L3f
                r1[r9] = r0     // Catch: java.lang.IllegalAccessException -> L35 java.lang.IllegalArgumentException -> L3a java.lang.reflect.InvocationTargetException -> L3f
                java.lang.Object r0 = com_amap_api_mapcore2d_bb$a_java_lang_reflect_Method_invoke(r2, r12, r1)     // Catch: java.lang.IllegalAccessException -> L35 java.lang.IllegalArgumentException -> L3a java.lang.reflect.InvocationTargetException -> L3f
                java.lang.Float r0 = (java.lang.Float) r0     // Catch: java.lang.IllegalAccessException -> L35 java.lang.IllegalArgumentException -> L3a java.lang.reflect.InvocationTargetException -> L3f
                float r4 = r0.floatValue()     // Catch: java.lang.IllegalAccessException -> L35 java.lang.IllegalArgumentException -> L3a java.lang.reflect.InvocationTargetException -> L3f
                java.lang.reflect.Method r2 = com.amap.api.mapcore2d.AbstractC1518bb.m18340b()     // Catch: java.lang.IllegalAccessException -> L35 java.lang.IllegalArgumentException -> L3a java.lang.reflect.InvocationTargetException -> L3f
                java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch: java.lang.IllegalAccessException -> L35 java.lang.IllegalArgumentException -> L3a java.lang.reflect.InvocationTargetException -> L3f
                java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.IllegalAccessException -> L35 java.lang.IllegalArgumentException -> L3a java.lang.reflect.InvocationTargetException -> L3f
                r1[r9] = r0     // Catch: java.lang.IllegalAccessException -> L35 java.lang.IllegalArgumentException -> L3a java.lang.reflect.InvocationTargetException -> L3f
                java.lang.Object r0 = com_amap_api_mapcore2d_bb$a_java_lang_reflect_Method_invoke(r2, r12, r1)     // Catch: java.lang.IllegalAccessException -> L35 java.lang.IllegalArgumentException -> L3a java.lang.reflect.InvocationTargetException -> L3f
                java.lang.Float r0 = (java.lang.Float) r0     // Catch: java.lang.IllegalAccessException -> L35 java.lang.IllegalArgumentException -> L3a java.lang.reflect.InvocationTargetException -> L3f
                float r0 = r0.floatValue()     // Catch: java.lang.IllegalAccessException -> L35 java.lang.IllegalArgumentException -> L3a java.lang.reflect.InvocationTargetException -> L3f
                float r4 = r4 + r0
                goto L44
            L35:
                r0 = move-exception
                com.amap.api.mapcore2d.C1569cm.m18147a(r0, r7, r6)
                goto L43
            L3a:
                r0 = move-exception
                com.amap.api.mapcore2d.C1569cm.m18147a(r0, r7, r6)
                goto L43
            L3f:
                r0 = move-exception
                com.amap.api.mapcore2d.C1569cm.m18147a(r0, r7, r6)
            L43:
                r4 = 0
            L44:
                java.lang.reflect.Method r2 = com.amap.api.mapcore2d.AbstractC1518bb.m18338c()     // Catch: java.lang.Throwable -> L73
                java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L73
                java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L73
                r1[r9] = r0     // Catch: java.lang.Throwable -> L73
                java.lang.Object r0 = com_amap_api_mapcore2d_bb$a_java_lang_reflect_Method_invoke(r2, r12, r1)     // Catch: java.lang.Throwable -> L73
                java.lang.Float r0 = (java.lang.Float) r0     // Catch: java.lang.Throwable -> L73
                float r3 = r0.floatValue()     // Catch: java.lang.Throwable -> L73
                java.lang.reflect.Method r2 = com.amap.api.mapcore2d.AbstractC1518bb.m18338c()     // Catch: java.lang.Throwable -> L73
                java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L73
                java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L73
                r1[r9] = r0     // Catch: java.lang.Throwable -> L73
                java.lang.Object r0 = com_amap_api_mapcore2d_bb$a_java_lang_reflect_Method_invoke(r2, r12, r1)     // Catch: java.lang.Throwable -> L73
                java.lang.Float r0 = (java.lang.Float) r0     // Catch: java.lang.Throwable -> L73
                float r0 = r0.floatValue()     // Catch: java.lang.Throwable -> L73
                float r5 = r3 + r0
                goto L77
            L73:
                r0 = move-exception
                com.amap.api.mapcore2d.C1569cm.m18147a(r0, r7, r6)
            L77:
                int r1 = r10.f22958u
                if (r1 == 0) goto L81
                int r0 = r10.f22959v
                if (r0 == 0) goto L81
                float r4 = (float) r1
                float r5 = (float) r0
            L81:
                r0 = 1073741824(0x40000000, float:2.0)
                float r4 = r4 / r0
                float r5 = r5 / r0
                r11.set(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.AbstractC1518bb.C1519a.m18337a(android.graphics.PointF, android.view.MotionEvent):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
            if (r1 != 6) goto L16;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m18336a(android.view.MotionEvent r12, int r13, int r14) {
            /*
                Method dump skipped, instructions count: 407
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.AbstractC1518bb.C1519a.m18336a(android.view.MotionEvent, int, int):boolean");
        }
    }

    /* renamed from: a */
    public static C1519a m18342a(Context context, AbstractC1520b abstractC1520b) {
        C1519a c1519a = new C1519a();
        c1519a.f22939a = abstractC1520b;
        return c1519a;
    }
}
