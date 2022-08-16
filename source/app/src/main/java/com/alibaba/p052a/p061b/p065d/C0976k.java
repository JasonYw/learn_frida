package com.alibaba.p052a.p061b.p065d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import p003X.C116971W2r;

/* renamed from: com.alibaba.a.b.d.k */
/* loaded from: classes26.dex */
public class C0976k {

    /* renamed from: a */
    public static File f21410a;

    /* renamed from: b */
    public static FileChannel f21411b;

    /* renamed from: c */
    public static FileLock f21412c;

    static {
        Covode.recordClassIndex(4286);
    }

    /* renamed from: a */
    public static synchronized void m20091a() {
        synchronized (C0976k.class) {
            if (f21412c != null) {
                try {
                    f21412c.release();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    f21412c = null;
                    throw th;
                }
                f21412c = null;
            }
            if (f21411b != null) {
                try {
                    f21411b.close();
                } catch (Exception unused2) {
                } finally {
                    f21411b = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized boolean m20090a(Context context) {
        synchronized (C0976k.class) {
            if (f21410a == null) {
                f21410a = new File(C116971W2r.LIZJ(context) + File.separator + "ap.Lock");
            }
            boolean exists = f21410a.exists();
            if (!exists) {
                try {
                    exists = f21410a.createNewFile();
                } catch (IOException unused) {
                }
            }
            if (!exists) {
                return true;
            }
            if (f21411b == null) {
                try {
                    f21411b = new RandomAccessFile(f21410a, "rw").getChannel();
                } catch (Exception unused2) {
                    return false;
                }
            }
            try {
                FileLock tryLock = f21411b.tryLock();
                if (tryLock != null) {
                    f21412c = tryLock;
                    return true;
                }
            } catch (Throwable unused3) {
            }
            return false;
        }
    }
}
