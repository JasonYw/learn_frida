package com.amap.api.services.p126a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.cloud.CloudItemDetail;
import com.amap.api.services.cloud.CloudResult;
import com.amap.api.services.cloud.CloudSearch;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.ICloudSearch;
import com.amap.api.services.p126a.HandlerC2019t;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.amap.api.services.a.as */
/* loaded from: classes19.dex */
public class C1821as implements ICloudSearch {

    /* renamed from: a */
    public Context f24262a;

    /* renamed from: b */
    public CloudSearch.OnCloudSearchListener f24263b;

    /* renamed from: c */
    public CloudSearch.Query f24264c;

    /* renamed from: d */
    public int f24265d;

    /* renamed from: e */
    public HashMap<Integer, CloudResult> f24266e;

    /* renamed from: f */
    public Handler f24267f = HandlerC2019t.m16280a();

    static {
        Covode.recordClassIndex(5432);
    }

    @Override // com.amap.api.services.interfaces.ICloudSearch
    public void setOnCloudSearchListener(CloudSearch.OnCloudSearchListener onCloudSearchListener) {
        this.f24263b = onCloudSearchListener;
    }

    public C1821as(Context context) {
        this.f24262a = context.getApplicationContext();
    }

    /* renamed from: b */
    private boolean m17041b(int i) {
        if (i <= this.f24265d && i > 0) {
            return true;
        }
        return false;
    }

    @Override // com.amap.api.services.interfaces.ICloudSearch
    public void searchCloudAsyn(final CloudSearch.Query query) {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.as.1
                static {
                    Covode.recordClassIndex(5433);
                }

                @Override // java.lang.Runnable
                public void run() {
                    Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                    try {
                        try {
                            obtainMessage.arg1 = 12;
                            obtainMessage.what = 700;
                            HandlerC2019t.C2023d c2023d = new HandlerC2019t.C2023d();
                            c2023d.f24846b = C1821as.this.f24263b;
                            obtainMessage.obj = c2023d;
                            c2023d.f24845a = C1821as.this.m17043a(query);
                            obtainMessage.arg2 = 1000;
                        } catch (AMapException e) {
                            obtainMessage.arg2 = e.getErrorCode();
                        }
                    } finally {
                        C1821as.this.f24267f.sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public CloudResult m17048a(int i) {
        if (m17041b(i)) {
            return this.f24266e.get(Integer.valueOf(i));
        }
        throw new IllegalArgumentException("page out of range");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public CloudResult m17043a(CloudSearch.Query query) {
        try {
            if (m17039b(query)) {
                if (!query.queryEquals(this.f24264c)) {
                    this.f24265d = 0;
                    this.f24264c = query.m25284clone();
                    if (this.f24266e != null) {
                        this.f24266e.clear();
                    }
                }
                try {
                    if (this.f24265d == 0) {
                        CloudResult m17087c = new C2005h(this.f24262a, query).m17087c();
                        m17044a(m17087c, query);
                        return m17087c;
                    }
                    CloudResult m17048a = m17048a(query.getPageNum());
                    if (m17048a == null) {
                        CloudResult m17087c2 = new C2005h(this.f24262a, query).m17087c();
                        this.f24266e.put(Integer.valueOf(query.getPageNum()), m17087c2);
                        return m17087c2;
                    }
                    return m17048a;
                } catch (Throwable th) {
                    th = th;
                    C2007j.m16371a(th, "CloudSearch", "searchCloud");
                    if (!(th instanceof AMapException)) {
                        return null;
                    }
                    throw th;
                }
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: b */
    private boolean m17039b(CloudSearch.Query query) {
        if (query == null || C2007j.m16372a(query.getTableID()) || query.getBound() == null) {
            return false;
        }
        if (query.getBound() != null && query.getBound().getShape().equals("Bound") && query.getBound().getCenter() == null) {
            return false;
        }
        if (query.getBound() != null && query.getBound().getShape().equals("Rectangle")) {
            LatLonPoint lowerLeft = query.getBound().getLowerLeft();
            LatLonPoint upperRight = query.getBound().getUpperRight();
            if (lowerLeft == null || upperRight == null || lowerLeft.getLatitude() >= upperRight.getLatitude() || lowerLeft.getLongitude() >= upperRight.getLongitude()) {
                return false;
            }
        }
        if (query.getBound() != null && query.getBound().getShape().equals("Polygon")) {
            List<LatLonPoint> polyGonList = query.getBound().getPolyGonList();
            for (int i = 0; i < polyGonList.size(); i++) {
                if (polyGonList.get(i) == null) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override // com.amap.api.services.interfaces.ICloudSearch
    public void searchCloudDetailAsyn(final String str, final String str2) {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.as.2
                static {
                    Covode.recordClassIndex(5434);
                }

                @Override // java.lang.Runnable
                public void run() {
                    Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                    try {
                        try {
                            obtainMessage.arg1 = 12;
                            obtainMessage.what = 701;
                            HandlerC2019t.C2022c c2022c = new HandlerC2019t.C2022c();
                            c2022c.f24844b = C1821as.this.f24263b;
                            obtainMessage.obj = c2022c;
                            c2022c.f24843a = C1821as.this.m17042a(str, str2);
                            obtainMessage.arg2 = 1000;
                        } catch (AMapException e) {
                            obtainMessage.arg2 = e.getErrorCode();
                        }
                    } finally {
                        C1821as.this.f24267f.sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m17044a(CloudResult cloudResult, CloudSearch.Query query) {
        this.f24266e = new HashMap<>();
        if (this.f24265d > 0) {
            this.f24266e.put(Integer.valueOf(query.getPageNum()), cloudResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public CloudItemDetail m17042a(String str, String str2) {
        if (str != null && !str.trim().equals("")) {
            if (str2 != null && !str2.trim().equals("")) {
                try {
                    return new C2004g(this.f24262a, new C1801ab(str, str2)).m17087c();
                } catch (Throwable th) {
                    C2007j.m16371a(th, "CloudSearch", "searchCloudDetail");
                    if (!(th instanceof AMapException)) {
                        return null;
                    }
                    throw th;
                }
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
        throw new AMapException("无效的参数 - IllegalArgumentException");
    }
}
