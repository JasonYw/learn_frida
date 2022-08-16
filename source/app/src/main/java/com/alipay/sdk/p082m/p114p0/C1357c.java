package com.alipay.sdk.p082m.p114p0;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.p0.c */
/* loaded from: classes2.dex */
public class C1357c {

    /* renamed from: A */
    public static String f22322A = null;

    /* renamed from: B */
    public static volatile C1357c f22323B = null;

    /* renamed from: C */
    public static volatile C1356b f22324C = null;

    /* renamed from: f */
    public static final String f22325f = "OAID";

    /* renamed from: g */
    public static final String f22326g = "VAID";

    /* renamed from: o */
    public static Context f22327o;

    /* renamed from: p */
    public static boolean f22328p;

    /* renamed from: q */
    public static C1359d f22329q;

    /* renamed from: r */
    public static C1359d f22330r;

    /* renamed from: s */
    public static C1359d f22331s;

    /* renamed from: t */
    public static Object f22332t = new Object();

    /* renamed from: u */
    public static HandlerThread f22333u;

    /* renamed from: v */
    public static Handler f22334v;

    /* renamed from: w */
    public static String f22335w;

    /* renamed from: x */
    public static String f22336x;

    /* renamed from: y */
    public static String f22337y;

    /* renamed from: z */
    public static String f22338z;

    /* renamed from: c */
    public boolean m18991c() {
        return f22328p;
    }

    static {
        Covode.recordClassIndex(4857);
    }

    /* renamed from: b */
    public String m18994b() {
        if (!m18991c()) {
            return null;
        }
        m18999a(4, (String) null);
        return f22322A;
    }

    /* renamed from: f */
    public static void m18987f() {
        f22328p = "1".equals(m18995a("persist.sys.identifierid.supported", "0"));
    }

    /* renamed from: g */
    public static void m18986g() {
        HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
        f22333u = handlerThread;
        handlerThread.start();
        f22334v = new HandlerC1358a(f22333u.getLooper());
    }

    /* renamed from: a */
    public String m19000a() {
        if (!m18991c()) {
            return null;
        }
        String str = f22336x;
        if (str != null) {
            return str;
        }
        m18999a(0, (String) null);
        if (f22329q == null) {
            m18997a(f22327o, 0, null);
        }
        return f22336x;
    }

    /* renamed from: com.alipay.sdk.m.p0.c$a */
    /* loaded from: classes2.dex */
    public static class HandlerC1358a extends Handler {
        static {
            Covode.recordClassIndex(4858);
        }

        public HandlerC1358a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == 11) {
                String unused = C1357c.f22335w = C1357c.f22324C.m19001a(message.getData().getInt("type"), message.getData().getString("appid"));
                synchronized (C1357c.f22332t) {
                    C1357c.f22332t.notify();
                }
            }
        }
    }

    /* renamed from: a */
    public static C1357c m18998a(Context context) {
        if (f22323B == null) {
            synchronized (C1357c.class) {
                f22327o = context.getApplicationContext();
                f22323B = new C1357c();
            }
        }
        if (f22324C == null) {
            synchronized (C1357c.class) {
                f22327o = context.getApplicationContext();
                m18986g();
                f22324C = new C1356b(f22327o);
                m18987f();
            }
        }
        return f22323B;
    }

    /* renamed from: b */
    public String m18992b(String str) {
        if (!m18991c()) {
            return null;
        }
        String str2 = f22337y;
        if (str2 != null) {
            return str2;
        }
        m18999a(1, str);
        if (f22330r == null && f22337y != null) {
            m18997a(f22327o, 1, str);
        }
        return f22337y;
    }

    /* renamed from: a */
    public String m18996a(String str) {
        if (!m18991c()) {
            return null;
        }
        String str2 = f22338z;
        if (str2 != null) {
            return str2;
        }
        m18999a(2, str);
        if (f22331s == null && f22338z != null) {
            m18997a(f22327o, 2, str);
        }
        return f22338z;
    }

    /* renamed from: b */
    private void m18993b(int i, String str) {
        Message obtainMessage = f22334v.obtainMessage();
        obtainMessage.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt("type", i);
        if (i == 1 || i == 2) {
            bundle.putString("appid", str);
        }
        obtainMessage.setData(bundle);
        f22334v.sendMessage(obtainMessage);
    }

    /* renamed from: a */
    public static String m18995a(String str, String str2) {
        try {
            try {
                Class LIZ = C116971W2r.LIZ("android.os.SystemProperties");
                return (String) LIZ.getMethod("get", String.class, String.class).invoke(LIZ, str, LoggerUtil.UNKNOWN);
            } catch (Exception e) {
                e.printStackTrace();
                return str2;
            }
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* renamed from: a */
    public void m18999a(int i, String str) {
        synchronized (f22332t) {
            m18993b(i, str);
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                f22332t.wait(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (SystemClock.uptimeMillis() - uptimeMillis < 2000) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                            }
                        } else if (f22335w != null) {
                            f22338z = f22335w;
                            f22335w = null;
                        }
                        f22322A = f22335w;
                        f22335w = null;
                    } else if (f22335w != null) {
                        f22337y = f22335w;
                        f22335w = null;
                    }
                } else {
                    f22336x = f22335w;
                    f22335w = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m18997a(Context context, int i, String str) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    f22331s = new C1359d(f22323B, 2, str);
                    context.getContentResolver().registerContentObserver(Uri.parse(C0002O.m25086C("content://com.vivo.vms.IdProvider/IdentifierId/AAID_", str)), false, f22331s);
                    return;
                }
                return;
            }
            f22330r = new C1359d(f22323B, 1, str);
            context.getContentResolver().registerContentObserver(Uri.parse(C0002O.m25086C("content://com.vivo.vms.IdProvider/IdentifierId/VAID_", str)), false, f22330r);
            return;
        }
        f22329q = new C1359d(f22323B, 0, null);
        context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, f22329q);
    }
}
