package com.amap.api.mapcore2d;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.mapcore2d.C1674et;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: com.amap.api.mapcore2d.cz */
/* loaded from: classes19.dex */
public class C1596cz extends Thread implements C1674et.AbstractC1675a {

    /* renamed from: g */
    public static boolean f23300g;

    /* renamed from: i */
    public static String f23301i = "sodownload";

    /* renamed from: j */
    public static String f23302j = "sofail";

    /* renamed from: a */
    public C1597a f23303a;

    /* renamed from: b */
    public RandomAccessFile f23304b;

    /* renamed from: c */
    public String f23305c;

    /* renamed from: d */
    public String f23306d;

    /* renamed from: e */
    public String f23307e;

    /* renamed from: f */
    public Context f23308f;

    /* renamed from: h */
    public C1674et f23309h;

    /* renamed from: com.amap.api.mapcore2d.cz$a */
    /* loaded from: classes19.dex */
    public static class C1597a extends AbstractC1683ew {

        /* renamed from: a */
        public String f23310a;

        static {
            Covode.recordClassIndex(5145);
        }

        @Override // com.amap.api.mapcore2d.AbstractC1683ew
        /* renamed from: f */
        public Map<String, String> mo17322f() {
            return null;
        }

        @Override // com.amap.api.mapcore2d.AbstractC1683ew
        /* renamed from: g */
        public Map<String, String> mo17321g() {
            return null;
        }

        @Override // com.amap.api.mapcore2d.AbstractC1683ew
        /* renamed from: h */
        public String mo17320h() {
            return this.f23310a;
        }

        public C1597a(String str) {
            this.f23310a = str;
        }
    }

    @Override // com.amap.api.mapcore2d.C1674et.AbstractC1675a
    /* renamed from: b */
    public void mo17601b() {
        m17973d();
    }

    static {
        Covode.recordClassIndex(5144);
    }

    /* renamed from: d */
    public void m17973d() {
        File file = new File(this.f23305c);
        if (file.exists()) {
            C116971W2r.LIZ(file);
        }
    }

    /* renamed from: a */
    public void m17976a() {
        C1597a c1597a = this.f23303a;
        if (c1597a == null || TextUtils.isEmpty(c1597a.mo17320h()) || !this.f23303a.mo17320h().contains("libJni_wgs2gcj.so") || !this.f23303a.mo17320h().contains(C1602db.m17947a(this.f23308f)) || new File(this.f23306d).exists()) {
            return;
        }
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            File file = new File(m17974b(this.f23308f, "tempfile"));
            if (file.exists()) {
                C116971W2r.LIZ(file);
            }
            this.f23309h.m17604a(this);
        } catch (Throwable th) {
            C1616do.m17866c(th, "sdl", "run");
            m17973d();
        }
    }

    @Override // com.amap.api.mapcore2d.C1674et.AbstractC1675a
    /* renamed from: c */
    public void mo17600c() {
        try {
            if (this.f23304b != null) {
                this.f23304b.close();
            }
            String m17993a = C1594cx.m17993a(this.f23305c);
            if (m17993a != null && m17993a.equalsIgnoreCase(this.f23307e)) {
                if (new File(this.f23306d).exists()) {
                    m17973d();
                    return;
                } else {
                    new File(this.f23305c).renameTo(new File(this.f23306d));
                    return;
                }
            }
            m17973d();
        } catch (Throwable th) {
            m17973d();
            File file = new File(this.f23306d);
            if (file.exists()) {
                C116971W2r.LIZ(file);
            }
            C1616do.m17866c(th, "sdl", "ofs");
        }
    }

    @Override // com.amap.api.mapcore2d.C1674et.AbstractC1675a
    /* renamed from: a */
    public void mo17603a(Throwable th) {
        try {
            if (this.f23304b != null) {
                this.f23304b.close();
            }
            m17973d();
            File file = new File(m17974b(this.f23308f, "tempfile"));
            if (!file.exists()) {
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdir();
                }
                file.createNewFile();
            }
        } catch (Throwable th2) {
            C1616do.m17866c(th2, "sdl", "oe");
        }
    }

    /* renamed from: b */
    public static String m17974b(Context context, String str) {
        return m17975a(context, str);
    }

    /* renamed from: a */
    public static String m17975a(Context context, String str) {
        new StringBuilder();
        return C0002O.m25083C(C116971W2r.LIZJ(context).getAbsolutePath(), File.separator, "libso", File.separator, str);
    }

    @Override // com.amap.api.mapcore2d.C1674et.AbstractC1675a
    /* renamed from: a */
    public void mo17602a(byte[] bArr, long j) {
        try {
            if (this.f23304b == null) {
                File file = new File(this.f23305c);
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                try {
                    this.f23304b = new RandomAccessFile(file, "rw");
                } catch (FileNotFoundException e) {
                    C1616do.m17866c(e, "sdl", "oDd");
                    m17973d();
                }
            }
            if (this.f23304b == null) {
                return;
            }
            try {
                this.f23304b.seek(j);
                this.f23304b.write(bArr);
            } catch (IOException e2) {
                m17973d();
                C1616do.m17866c(e2, "sdl", "oDd");
            }
        } catch (Throwable th) {
            m17973d();
            C1616do.m17866c(th, "sdl", "oDd");
        }
    }

    public C1596cz(Context context, String str, String str2, String str3) {
        this.f23308f = context;
        this.f23307e = str3;
        new StringBuilder();
        this.f23305c = m17975a(context, C0002O.m25086C(str, "temp.so"));
        this.f23306d = m17975a(context, "libwgs2gcj.so");
        this.f23303a = new C1597a(str2);
        this.f23309h = new C1674et(this.f23303a);
    }
}
