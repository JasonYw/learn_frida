package com.amap.api.mapcore2d;

import com.amap.api.maps2d.MapsInitializer;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.amap.api.mapcore2d.bv */
/* loaded from: classes19.dex */
public class C1546bv extends AbstractC1687f<C1541bs, C1541bs> implements AbstractC1555cc {

    /* renamed from: c */
    public C1475an f23073c;

    /* renamed from: d */
    public C1474am f23074d = new C1474am();

    static {
        Covode.recordClassIndex(5094);
    }

    @Override // com.amap.api.mapcore2d.AbstractC1687f
    /* renamed from: f */
    public int mo17551f() {
        return 4;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1687f
    /* renamed from: g */
    public int mo17550g() {
        return 1;
    }

    @Override // com.amap.api.mapcore2d.C1494aw
    /* renamed from: i */
    public void mo18235i() {
        mo18207a(false, false);
    }

    @Override // com.amap.api.mapcore2d.AbstractC1687f, com.amap.api.mapcore2d.C1494aw
    /* renamed from: b */
    public void mo17557b() {
        super.mo17557b();
        this.f23074d.clear();
        if (this.f22753b != null && this.f22753b.f22782c != null) {
            this.f22753b.f22782c.m18435b(this);
        }
        this.f22753b = null;
    }

    /* renamed from: j */
    private boolean m18234j() {
        if (this.f22753b == null || this.f22753b.f22784e == null || this.f22753b.f22784e.f22789a == null || this.f22753b.f22784e.f22789a.size() <= 0) {
            return false;
        }
        return this.f23073c.m18617a();
    }

    /* renamed from: a */
    private boolean m18240a(C1541bs c1541bs) {
        if (c1541bs != null && c1541bs.f23059h >= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m18236c(ArrayList<C1541bs> arrayList) {
        int size;
        if (arrayList == null || this.f23074d == null || (size = arrayList.size()) == 0) {
            return;
        }
        for (int i = 0; i < size; i++) {
            this.f23074d.m18619a(arrayList.get(i));
        }
    }

    /* renamed from: a */
    public void m18237a(List<C1541bs> list) {
        int size;
        if (list == null || (size = list.size()) == 0) {
            return;
        }
        int i = 0;
        while (i < size) {
            if (!this.f23074d.m18618b(list.get(i))) {
                list.remove(i);
                i--;
                size--;
            }
            i++;
        }
    }

    @Override // com.amap.api.mapcore2d.AbstractC1687f
    /* renamed from: a */
    public ArrayList<C1541bs> mo17558a(ArrayList<C1541bs> arrayList) {
        ArrayList<C1541bs> arrayList2 = null;
        if (arrayList != null && arrayList.size() != 0 && this.f22753b != null && this.f22753b.f22784e != null && this.f22753b.f22784e.f22789a != null) {
            m18237a((List<C1541bs>) arrayList);
            if (arrayList.size() == 0) {
                return null;
            }
            if (this.f23073c.f22673j != null || this.f23073c.f22674k != null) {
                C1547bw c1547bw = new C1547bw(arrayList, this.f23073c.f22674k);
                c1547bw.m18232a(this.f23073c);
                c1547bw.m18232a((C1475an) null);
                arrayList2 = c1547bw.m18285a();
            }
            m18236c(arrayList);
            if (this.f22753b != null && this.f22753b.f22784e != null) {
                this.f22753b.f22784e.m18461b();
            }
        }
        return arrayList2;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1687f
    /* renamed from: b */
    public ArrayList<C1541bs> mo17555b(ArrayList<C1541bs> arrayList) {
        int size;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return null;
        }
        int i = 0;
        ArrayList<C1541bs> arrayList2 = null;
        int i2 = -1;
        while (i < size) {
            try {
                C1541bs c1541bs = arrayList.get(i);
                if (c1541bs != null) {
                    if (this.f22753b == null || this.f22753b.f22784e == null || this.f22753b.f22784e.f22789a == null) {
                        return null;
                    }
                    this.f22753b.f22784e.f22789a.size();
                    if (this.f23073c.f22669f) {
                        try {
                            if (!MapsInitializer.getUpdateDataActiveEnable() || !C1771q.m17199b()) {
                                i2 = this.f23073c.f22678o.m17187a(c1541bs);
                            } else {
                                i2 = -1;
                            }
                        } catch (Throwable unused) {
                        }
                        if (i2 >= 0) {
                            arrayList.remove(i);
                            size--;
                            i--;
                            C1536bn<C1541bs> c1536bn = this.f23073c.f22679p;
                            if (c1536bn != null) {
                                synchronized (c1536bn) {
                                    Iterator<C1541bs> it = c1536bn.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            C1541bs next = it.next();
                                            if (next != null && next.equals(c1541bs)) {
                                                next.f23059h = i2;
                                                this.f22753b.f22784e.m18461b();
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList<>();
                            }
                            C1541bs c1541bs2 = new C1541bs(c1541bs);
                            c1541bs2.f23052a = -1;
                            arrayList2.add(c1541bs2);
                        }
                    }
                }
                i++;
            } catch (Throwable unused2) {
            }
        }
        return arrayList2;
    }

    public C1546bv(C1499az c1499az, C1475an c1475an) {
        super(c1499az);
        this.f23073c = c1475an;
        this.f23575a = new C1540br();
        this.f22753b.f22782c.m18440a(this);
        m17561a();
    }

    /* renamed from: a */
    private void m18238a(ArrayList<C1541bs> arrayList, boolean z) {
        if (this.f23575a != null && arrayList != null && arrayList.size() != 0) {
            this.f23575a.m18264a(arrayList, z);
        }
    }

    @Override // com.amap.api.mapcore2d.AbstractC1555cc
    /* renamed from: a */
    public void mo18207a(boolean z, boolean z2) {
        ArrayList<C1541bs> m18513a;
        try {
            if (!m18234j() || (m18513a = this.f22753b.f22787h.m18513a(this.f22753b.f22787h.f22741l, this.f22753b.f22787h.m18510b(), this.f22753b.f22782c.m18433c(), this.f22753b.f22782c.m18432d())) == null || m18513a.size() <= 0) {
                return;
            }
            ArrayList<C1541bs> m18239a = m18239a(m18513a, this.f23073c, this.f22753b.f22782c.m18431e(), z2);
            if (m18239a != null) {
                m18238a(m18239a, true);
                m18239a.clear();
            }
            m18513a.clear();
            this.f22753b.f22782c.m18429g().invalidate();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private ArrayList<C1541bs> m18239a(ArrayList<C1541bs> arrayList, C1475an c1475an, float f, boolean z) {
        int size;
        ArrayList<C1541bs> arrayList2 = new ArrayList<>();
        if (arrayList == null || c1475an == null || !c1475an.m18617a() || c1475an.f22679p == null) {
            return null;
        }
        c1475an.f22679p.clear();
        if (f > c1475an.f22666c || f < c1475an.f22667d || (size = arrayList.size()) <= 0) {
            return null;
        }
        for (int i = 0; i < size; i++) {
            try {
                C1541bs c1541bs = arrayList.get(i);
                if (c1541bs != null) {
                    int m18349a = c1475an.f22677n.m18349a(c1541bs.m18257c());
                    C1541bs c1541bs2 = new C1541bs(c1541bs.f23053b, c1541bs.f23054c, c1541bs.f23055d, c1475an.f22675l);
                    c1541bs2.f23059h = m18349a;
                    c1541bs2.f23058g = c1541bs.f23058g;
                    c1475an.f22679p.add(c1541bs2);
                    if (m18240a(c1541bs2) && !z && !this.f23074d.contains(c1541bs2)) {
                        if (!c1475an.f22669f) {
                            c1541bs2.f23052a = -1;
                        }
                        arrayList2.add(c1541bs2);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList2;
    }
}
