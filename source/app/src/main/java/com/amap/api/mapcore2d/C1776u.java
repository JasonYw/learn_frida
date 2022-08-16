package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Environment;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: com.amap.api.mapcore2d.u */
/* loaded from: classes19.dex */
public class C1776u {

    /* renamed from: a */
    public Context f24039a;

    /* renamed from: b */
    public C1515ba f24040b;

    /* renamed from: c */
    public String f24041c;

    /* renamed from: d */
    public final int f24042d = 128;

    static {
        Covode.recordClassIndex(5324);
    }

    /* renamed from: a */
    private byte[] m17191a(int i) {
        return new byte[]{(byte) (i & MotionEventCompat.ACTION_MASK), (byte) ((65280 & i) >> 8), (byte) ((16711680 & i) >> 16), (byte) ((i & ViewCompat.MEASURED_STATE_MASK) >> 24)};
    }

    /* renamed from: a */
    public void m17188a(C1515ba c1515ba) {
        this.f24040b = c1515ba;
    }

    /* renamed from: a */
    public static void m17185a(final String str) {
        new Thread(new Runnable() { // from class: com.amap.api.mapcore2d.u.1
            static {
                Covode.recordClassIndex(5325);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C1776u.m17182b(str);
                } catch (Throwable unused) {
                }
            }
        }).start();
    }

    /* renamed from: a */
    private void m17184a(byte[] bArr) {
        if (bArr != null && bArr.length == 4) {
            byte b = bArr[0];
            bArr[0] = bArr[3];
            bArr[3] = b;
            byte b2 = bArr[1];
            bArr[1] = bArr[2];
            bArr[2] = b2;
        }
    }

    /* renamed from: b */
    public static boolean m17182b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        if (file.isFile()) {
            return m17180c(str);
        }
        return m17179d(str);
    }

    /* renamed from: c */
    public static boolean m17180c(String str) {
        File file = new File(str);
        if (file.isFile() && file.exists()) {
            C116971W2r.LIZ(file);
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private int m17181b(byte[] bArr) {
        return ((bArr[3] << 24) & ViewCompat.MEASURED_STATE_MASK) | (bArr[0] & 255) | ((bArr[1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | ((bArr[2] << 16) & 16711680);
    }

    /* renamed from: d */
    public static boolean m17179d(String str) {
        if (!str.endsWith(File.separator)) {
            new StringBuilder();
            str = C0002O.m25086C(str, File.separator);
        }
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isFile()) {
                    if (!m17180c(listFiles[i].getAbsolutePath())) {
                        return false;
                    }
                } else if (!m17179d(listFiles[i].getAbsolutePath())) {
                    return false;
                }
            }
            if (C116971W2r.LIZ(file)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public int m17187a(C1541bs c1541bs) {
        String[] m17186a;
        int m17190a;
        try {
            m17186a = m17186a(c1541bs, true);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "CachManager", "getTileFromCach");
            return -1;
        }
        if (m17186a == null || m17186a.length != 2 || m17186a[0].equals("") || Arrays.equals(m17186a, new String[m17186a.length])) {
            return -1;
        }
        File file = new File(m17186a[0]);
        if (!file.exists() || (m17190a = m17190a(c1541bs.f23053b, c1541bs.f23054c)) < 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                randomAccessFile.seek(m17190a * 4);
            } catch (IOException e) {
                C1569cm.m18147a(e, "CachManager", "getTileFromCach");
            }
            byte[] bArr = new byte[4];
            try {
                randomAccessFile.read(bArr, 0, 4);
            } catch (IOException e2) {
                C1569cm.m18147a(e2, "CachManager", "getTileFromCach");
            }
            m17184a(bArr);
            int m17181b = m17181b(bArr);
            randomAccessFile.close();
            if (m17181b < 0) {
                return -1;
            }
            File file2 = new File(m17186a[1]);
            if (!file2.exists()) {
                return -1;
            }
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "r");
                try {
                    randomAccessFile2.seek(m17181b);
                } catch (IOException e3) {
                    C1569cm.m18147a(e3, "CachManager", "getTileFromCach");
                }
                try {
                    randomAccessFile2.read(bArr, 0, 4);
                } catch (IOException e4) {
                    C1569cm.m18147a(e4, "CachManager", "getTileFromCach");
                }
                m17184a(bArr);
                int m17181b2 = m17181b(bArr);
                if (m17181b2 > 0 && m17181b2 <= 204800) {
                    byte[] bArr2 = new byte[m17181b2];
                    randomAccessFile2.read(bArr2, 0, m17181b2);
                    try {
                        randomAccessFile2.close();
                    } catch (IOException e5) {
                        C1569cm.m18147a(e5, "CachManager", "getTileFromCach");
                    }
                    if (this.f24040b == null) {
                        return -1;
                    }
                    return this.f24040b.m18348a(bArr2, null, true, null, c1541bs.m18257c());
                }
                try {
                    randomAccessFile2.close();
                    return -1;
                } catch (IOException e6) {
                    C1569cm.m18147a(e6, "CachManager", "getTileFromCach");
                    return -1;
                }
            } catch (FileNotFoundException e7) {
                C1569cm.m18147a(e7, "CachManager", "getTileFromCach");
                return -1;
            }
            C1569cm.m18147a(th, "CachManager", "getTileFromCach");
            return -1;
        } catch (FileNotFoundException e8) {
            C1569cm.m18147a(e8, "CachManager", "getTileFromCach");
            return -1;
        }
    }

    /* renamed from: a */
    private int m17190a(int i, int i2) {
        return ((i % 128) * 128) + (i2 % 128);
    }

    /* renamed from: a */
    private String[] m17186a(C1541bs c1541bs, boolean z) {
        int i = (c1541bs.f23053b / 128) / 10;
        int i2 = (c1541bs.f23054c / 128) / 10;
        String[] strArr = new String[2];
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f24041c);
            sb.append("/");
            sb.append(c1541bs.f23055d);
            sb.append("/");
            sb.append(i);
            sb.append("/");
            sb.append(i2);
            sb.append("/");
            if (!z) {
                File file = new File(sb.toString());
                if (!file.exists()) {
                    file.mkdirs();
                }
            }
            sb.append(c1541bs.m18257c());
            strArr[0] = sb.toString() + ".idx";
            strArr[1] = sb.toString() + ".dat";
            return strArr;
        } catch (Throwable th) {
            C1569cm.m18147a(th, "CachManager", "getCachFileName");
            return strArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a7, code lost:
        if (r6.createNewFile() == false) goto L58;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean m17183a(byte[] r13, com.amap.api.mapcore2d.C1541bs r14) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.C1776u.m17183a(byte[], com.amap.api.mapcore2d.bs):boolean");
    }

    /* renamed from: a */
    public static String m17189a(Context context, String str, C1475an c1475an) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return C116971W2r.LIZJ(context).getPath();
        }
        File file = new File(C1569cm.m18142b(context), c1475an.f22665b);
        if (!file.exists()) {
            file.mkdir();
        }
        new StringBuilder();
        return C0002O.m25086C(file.toString(), "/");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
        if (r1 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1776u(android.content.Context r4, boolean r5, com.amap.api.mapcore2d.C1475an r6) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "/sdcard/Amap/RMap"
            r3.f24041c = r0
            r0 = 128(0x80, float:1.794E-43)
            r3.f24042d = r0
            r3.f24039a = r4
            if (r6 != 0) goto L10
            return
        L10:
            r0 = 1
            if (r5 != r0) goto L29
            java.io.File r0 = p003X.C116971W2r.LIZJ(r4)
            java.lang.String r0 = r0.getPath()
            r3.f24041c = r0
        L1d:
            com.amap.api.mapcore2d.bg r2 = com.amap.api.mapcore2d.C1528bg.m18296a()
            java.lang.String r1 = r3.f24041c
            java.lang.String r0 = "cache_path"
            r2.m18289b(r0, r1)
            return
        L29:
            r0 = 0
            java.lang.String r0 = r6.f22676m
            if (r0 == 0) goto L4f
            java.lang.String r1 = r6.f22676m
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4f
            java.io.File r2 = new java.io.File
            java.lang.String r0 = r6.f22676m
            r2.<init>(r0)
            boolean r1 = r2.exists()
            if (r1 != 0) goto L49
            boolean r1 = r2.mkdirs()
        L49:
            java.lang.String r0 = r6.f22676m
            r3.f24041c = r0
            if (r1 != 0) goto L1d
        L4f:
            android.content.Context r1 = r3.f24039a
            java.lang.String r0 = r3.f24041c
            java.lang.String r0 = m17189a(r1, r0, r6)
            r3.f24041c = r0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.C1776u.<init>(android.content.Context, boolean, com.amap.api.mapcore2d.an):void");
    }
}
