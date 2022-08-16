package com.amap.api.mapcore2d;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.amap.api.maps2d.model.TileProvider;
import com.bytedance.covode.number.Covode;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import p002O.C0002O;
import p003X.TFG;

/* renamed from: com.amap.api.mapcore2d.bw */
/* loaded from: classes19.dex */
public class C1547bw extends AbstractC1531bj<ArrayList<C1541bs>, ArrayList<C1541bs>> {

    /* renamed from: f */
    public C1475an f23075f;

    /* renamed from: g */
    public TileProvider f23076g;

    static {
        Covode.recordClassIndex(5095);
    }

    @Override // com.amap.api.mapcore2d.AbstractC1683ew
    /* renamed from: g */
    public Map<String, String> mo17321g() {
        return null;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1531bj
    /* renamed from: b */
    public byte[] mo18227b() {
        TileProvider tileProvider = this.f23076g;
        if (tileProvider != null) {
            return tileProvider.getTile(((C1541bs) ((ArrayList) this.f23012b).get(0)).f23053b, ((C1541bs) ((ArrayList) this.f23012b).get(0)).f23054c, ((C1541bs) ((ArrayList) this.f23012b).get(0)).f23055d).data;
        }
        return super.mo18227b();
    }

    @Override // com.amap.api.mapcore2d.AbstractC1531bj
    /* renamed from: e */
    public ArrayList<C1541bs> mo18225d() {
        ArrayList<C1541bs> arrayList = new ArrayList<>();
        Iterator it = ((ArrayList) this.f23012b).iterator();
        while (it.hasNext()) {
            arrayList.add(new C1541bs((C1541bs) it.next()));
        }
        return arrayList;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1683ew
    /* renamed from: f */
    public Map<String, String> mo17322f() {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", "AMAP_SDK_Android_2DMap_6.0.0");
        hashMap.put("Accept-Encoding", "gzip");
        hashMap.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", "6.0.0", "2dmap"));
        hashMap.put("X-INFO", C1584ct.m18092a(C1484ar.f22704a));
        hashMap.put("key", C1573cq.m18118f(C1484ar.f22704a));
        hashMap.put("logversion", "2.1");
        return hashMap;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1683ew
    /* renamed from: h */
    public String mo17320h() {
        int i = ((C1541bs) ((ArrayList) this.f23012b).get(0)).f23053b;
        int i2 = ((C1541bs) ((ArrayList) this.f23012b).get(0)).f23054c;
        int i3 = ((C1541bs) ((ArrayList) this.f23012b).get(0)).f23055d;
        if (C1771q.f24020i == 0 && i3 > 9 && !C1568cl.m18162a(i, i2, i3)) {
            return String.format(Locale.US, C1495ax.m18504a().m18501d(), Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2));
        }
        int pow = (int) Math.pow(2.0d, ((C1541bs) ((ArrayList) this.f23012b).get(0)).f23055d);
        int i4 = ((C1541bs) ((ArrayList) this.f23012b).get(0)).f23053b;
        if (i4 >= pow) {
            i4 -= pow;
        } else if (i4 < 0) {
            i4 += pow;
        }
        String mo18208a = this.f23075f.f22673j.mo18208a(i4, i2, i3);
        if (TextUtils.isEmpty(C1771q.f24019h)) {
            new StringBuilder();
            mo18208a = C0002O.m25086C(mo18208a, m18230a(mo18208a));
        }
        ((C1541bs) ((ArrayList) this.f23012b).get(0)).m18258b();
        return mo18208a;
    }

    /* renamed from: a */
    public void m18232a(C1475an c1475an) {
        this.f23075f = c1475an;
    }

    /* renamed from: a */
    private byte[] m18233a(Bitmap bitmap) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            C1569cm.m18147a(th, "TileServerHandler", "Bitmap2Bytes");
            return null;
        }
    }

    @Override // com.amap.api.mapcore2d.AbstractC1531bj
    /* renamed from: b */
    public ArrayList<C1541bs> mo18229a(byte[] bArr) {
        ArrayList<C1541bs> arrayList = null;
        if (this.f23012b != 0 && bArr != null) {
            try {
                int size = ((ArrayList) this.f23012b).size();
                for (int i = 0; i < size; i++) {
                    C1541bs c1541bs = (C1541bs) ((ArrayList) this.f23012b).get(i);
                    if (m18228a(bArr, c1541bs) < 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        C1541bs c1541bs2 = new C1541bs(c1541bs);
                        if (this.f23075f.f22671h && c1541bs2.f23055d > 9 && !C1568cl.m18162a(c1541bs2.f23053b, c1541bs2.f23054c, c1541bs2.f23055d)) {
                            c1541bs2.f23060i = true;
                        }
                        arrayList.add(c1541bs2);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public String m18230a(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (!TextUtils.isEmpty(str) && !str.startsWith(C1495ax.m18504a().m18502c())) {
            stringBuffer.append("&key=");
            stringBuffer.append(C1573cq.m18118f(C1484ar.f22704a));
        }
        stringBuffer.append("&channel=amapapi");
        return stringBuffer.toString();
    }

    public C1547bw(ArrayList<C1541bs> arrayList, TileProvider tileProvider) {
        super(arrayList);
        this.f23076g = tileProvider;
        m17571a(C1595cy.m17983a(C1484ar.f22704a));
        m17572a(TFG.LIZIZ);
        m17569b(50000);
    }

    /* renamed from: a */
    private void m18231a(C1541bs c1541bs, int i) {
        C1475an c1475an;
        C1541bs c1541bs2;
        if (c1541bs != null && i >= 0 && (c1475an = this.f23075f) != null && c1475an.f22679p != null) {
            C1536bn<C1541bs> c1536bn = this.f23075f.f22679p;
            synchronized (this.f23075f) {
                int size = c1536bn.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        if (i2 < c1536bn.size() && (c1541bs2 = c1536bn.get(i2)) != null && c1541bs2.equals(c1541bs)) {
                            c1541bs2.f23059h = i;
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public int m18228a(byte[] bArr, C1541bs c1541bs) {
        C1475an c1475an;
        int i;
        if (c1541bs == null || bArr == null || (c1475an = this.f23075f) == null || c1475an.f22677n == null) {
            return -1;
        }
        try {
            i = this.f23075f.f22677n.m18348a(null, bArr, false, null, c1541bs.m18257c());
        } catch (Throwable th) {
            th = th;
            i = -1;
        }
        if (i < 0) {
            return -1;
        }
        try {
            m18231a(c1541bs, i);
        } catch (Throwable th2) {
            th = th2;
            C1569cm.m18147a(th, "TileServerHandler", "saveImgToMemory");
            return i;
        }
        if (this.f23075f == null) {
            return i;
        }
        if (this.f23075f.f22669f) {
            byte[] m18233a = m18233a(this.f23075f.f22677n.m18354a(i));
            if (this.f23075f != null && this.f23075f.f22678o != null) {
                this.f23075f.f22678o.m17183a(m18233a, c1541bs);
                return i;
            }
        }
        return i;
    }
}
