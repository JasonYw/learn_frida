package com.amap.api.mapcore2d;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.amap.api.mapcore2d.C1599da;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p003X.C116971W2r;
import p003X.G4Y;

/* renamed from: com.amap.api.mapcore2d.dq */
/* loaded from: classes19.dex */
public class C1622dq {

    /* renamed from: e */
    public File[] f23390e;

    /* renamed from: d */
    public static HashSet<String> f23388d = new HashSet<>();

    /* renamed from: a */
    public static byte[] f23385a = "FDF1F436161AEF5B".getBytes();

    /* renamed from: b */
    public static byte[] f23386b = "0102030405060708".getBytes();

    /* renamed from: c */
    public static String f23387c = "SOCRASH";

    /* renamed from: f */
    public static final String f23389f = "SOCRASH";

    /* renamed from: com.amap.api.mapcore2d.dq$a */
    /* loaded from: classes19.dex */
    public static class C1623a {

        /* renamed from: a */
        public String f23391a;

        /* renamed from: b */
        public String f23392b;

        /* renamed from: c */
        public String f23393c;

        /* renamed from: d */
        public String f23394d;

        /* renamed from: e */
        public String f23395e;

        static {
            Covode.recordClassIndex(5171);
        }

        public C1623a() {
        }

        /* renamed from: a */
        public String m17835a() {
            return this.f23391a;
        }

        /* renamed from: b */
        public String m17833b() {
            return this.f23392b;
        }

        /* renamed from: c */
        public String m17831c() {
            return this.f23393c;
        }

        /* renamed from: d */
        public String m17830d() {
            return this.f23394d;
        }

        /* renamed from: e */
        public String m17829e() {
            return this.f23395e;
        }

        /* renamed from: a */
        public static C1623a m17834a(String str) {
            if (TextUtils.isEmpty(str)) {
                return new C1623a();
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C1623a(jSONObject.optString("mk", ""), jSONObject.optString("ak", ""), jSONObject.optString("bk", ""), jSONObject.optString("ik", ""), jSONObject.optString("nk", ""));
            } catch (Throwable unused) {
                return new C1623a();
            }
        }

        /* renamed from: b */
        public static List<C1623a> m17832b(String str) {
            if (TextUtils.isEmpty(str)) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(m17834a(jSONArray.getString(i)));
                }
            } catch (Throwable unused) {
            }
            return arrayList;
        }

        public C1623a(String str, String str2, String str3, String str4, String str5) {
            this.f23391a = str;
            this.f23392b = str2;
            this.f23393c = str3;
            this.f23394d = str4;
            this.f23395e = str5;
        }
    }

    /* renamed from: a */
    public static String m17844a() {
        return C1594cx.m17990b("SO_DYNAMIC_FILE_KEY");
    }

    static {
        Covode.recordClassIndex(5170);
    }

    /* renamed from: com.amap.api.mapcore2d.dq$b */
    /* loaded from: classes19.dex */
    public static class C1624b {

        /* renamed from: a */
        public int f23396a;

        /* renamed from: b */
        public String f23397b;

        static {
            Covode.recordClassIndex(5172);
        }
    }

    /* renamed from: a */
    private void m17840a(File file) {
        if (file == null) {
            return;
        }
        try {
            C116971W2r.LIZ(file);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private File[] m17837b(Context context) {
        File file = new File(C1613dm.m17890a(context));
        if (!file.isDirectory()) {
            return null;
        }
        return file.listFiles();
    }

    /* renamed from: b */
    private byte[] m17836b(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            byte[] m18022a = C1589cv.m18022a("a1f5886b7153004c5c99559f5261676f".getBytes(), bArr, "nFy1THrhajaZzz8U".getBytes());
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[m18022a.length - 16];
            System.arraycopy(m18022a, 0, bArr2, 0, 16);
            System.arraycopy(m18022a, 16, bArr3, 0, m18022a.length - 16);
            if (!m17838a(C1594cx.m17991a(bArr3, "MD5"), bArr2)) {
                return new byte[0];
            }
            return bArr3;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void m17843a(Context context) {
        try {
            File[] m17837b = m17837b(context);
            if (m17837b == null) {
                return;
            }
            this.f23390e = m17837b;
            C1599da c1599da = null;
            try {
                C1599da.C1601a c1601a = new C1599da.C1601a(f23389f, "1.0", "");
                c1601a.m17957a(new String[0]);
                c1599da = c1601a.m17960a();
            } catch (Throwable unused) {
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < m17837b.length && i < 10; i++) {
                File file = m17837b[i];
                if (file != null && file.exists() && file.isFile()) {
                    byte[] m17836b = m17836b(file);
                    if (m17836b != null && m17836b.length != 0 && m17836b.length <= 100000) {
                        String m17992a = C1594cx.m17992a(m17836b);
                        if (!m17839a(arrayList, m17992a) && !f23388d.contains(m17992a)) {
                            m17841a(context, m17836b);
                            f23388d.add(m17992a);
                            C1620dp.m17853a(c1599da, context, f23389f, C1589cv.m18020b(m17836b));
                            m17840a(file);
                        } else {
                            C116971W2r.LIZ(file);
                        }
                    } else {
                        C116971W2r.LIZ(file);
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    private boolean m17839a(List<C1624b> list, String str) {
        if (list == null) {
            return false;
        }
        for (C1624b c1624b : list) {
            if (c1624b.f23397b.equals(str)) {
                c1624b.f23396a++;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m17841a(Context context, byte[] bArr) {
        List<C1623a> m17832b;
        if (context == null) {
            return;
        }
        try {
            String str = new String(bArr, "ISO-8859-1");
            if (str.indexOf("{\"") > 0 && str.indexOf("\"}") > 0) {
                JSONObject jSONObject = new JSONObject(str.substring(str.indexOf("{\""), str.lastIndexOf("\"}") + 2));
                String optString = jSONObject.optString("ik");
                String optString2 = jSONObject.optString("jk");
                if (TextUtils.isEmpty(optString2) || (m17832b = C1623a.m17832b(optString)) == null) {
                    return;
                }
                for (int i = 0; i < m17832b.size(); i++) {
                    C1623a c1623a = m17832b.get(i);
                    if (optString2.contains(c1623a.m17829e())) {
                        m17842a(context, c1623a);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m17842a(Context context, C1623a c1623a) {
        if (!TextUtils.isEmpty(c1623a.m17833b()) && !TextUtils.isEmpty(c1623a.m17831c()) && !TextUtils.isEmpty(c1623a.m17830d())) {
            SharedPreferences LIZ = G4Y.LIZ(context, m17844a(), 0);
            JSONArray jSONArray = new JSONArray(C1602db.m17936a(C1571co.m18133b(C1602db.m17925e(LIZ.getString("SO_ERROR_KEY", "")))));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.opt("mk").equals(c1623a.m17835a()) && jSONObject.opt("ak").equals(c1623a.m17833b()) && jSONObject.opt("bk").equals(c1623a.m17831c()) && jSONObject.opt("ik").equals(c1623a.m17830d()) && jSONObject.opt("nk").equals(c1623a.m17829e())) {
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("mk", c1623a.m17835a());
            jSONObject2.putOpt("ak", c1623a.m17833b());
            jSONObject2.putOpt("bk", c1623a.m17831c());
            jSONObject2.putOpt("ik", c1623a.m17830d());
            jSONObject2.putOpt("nk", c1623a.m17829e());
            jSONArray.put(jSONObject2);
            SharedPreferences.Editor edit = LIZ.edit();
            edit.putString("SO_ERROR_KEY", C1602db.m17920g(C1571co.m18134a(C1602db.m17940a(jSONArray.toString()))));
            edit.commit();
        }
    }

    /* renamed from: a */
    private boolean m17838a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0 || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
