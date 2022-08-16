package com.amap.api.services.p126a;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.INearbySearch;
import com.amap.api.services.nearby.NearbySearch;
import com.amap.api.services.nearby.NearbySearchResult;
import com.amap.api.services.nearby.UploadInfo;
import com.amap.api.services.nearby.UploadInfoCallback;
import com.amap.api.services.p126a.HandlerC2019t;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import p003X.C116971W2r;

/* renamed from: com.amap.api.services.a.ax */
/* loaded from: classes19.dex */
public class C1833ax implements INearbySearch {

    /* renamed from: e */
    public static long f24299e;

    /* renamed from: b */
    public String f24301b;

    /* renamed from: c */
    public Context f24302c;

    /* renamed from: f */
    public ExecutorService f24304f;

    /* renamed from: k */
    public UploadInfoCallback f24309k;

    /* renamed from: l */
    public TimerTask f24310l;

    /* renamed from: a */
    public List<NearbySearch.NearbyListener> f24300a = new ArrayList();

    /* renamed from: g */
    public LatLonPoint f24305g = null;

    /* renamed from: h */
    public String f24306h = null;

    /* renamed from: i */
    public boolean f24307i = false;

    /* renamed from: j */
    public Timer f24308j = new Timer();

    /* renamed from: d */
    public HandlerC2019t f24303d = HandlerC2019t.m16280a();

    static {
        Covode.recordClassIndex(5444);
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public void clearUserInfoAsyn() {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.ax.1
                static {
                    Covode.recordClassIndex(5445);
                }

                @Override // java.lang.Runnable
                public void run() {
                    Message obtainMessage = C1833ax.this.f24303d.obtainMessage();
                    obtainMessage.arg1 = 8;
                    obtainMessage.obj = C1833ax.this.f24300a;
                    try {
                        try {
                            C1833ax.this.m17020a();
                            obtainMessage.what = 1000;
                        } catch (AMapException e) {
                            obtainMessage.what = e.getErrorCode();
                            C2007j.m16371a(e, "NearbySearch", "clearUserInfoAsyn");
                            if (C1833ax.this.f24303d == null) {
                            }
                        }
                    } finally {
                        if (C1833ax.this.f24303d != null) {
                            C1833ax.this.f24303d.sendMessage(obtainMessage);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            C2007j.m16371a(th, "NearbySearch", "clearUserInfoAsynThrowable");
        }
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public synchronized void destroy() {
        try {
            this.f24308j.cancel();
        } catch (Throwable th) {
            C2007j.m16371a(th, "NearbySearch", "destryoy");
        }
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public synchronized void stopUploadNearbyInfoAuto() {
        try {
            if (this.f24310l != null) {
                this.f24310l.cancel();
            }
            this.f24307i = false;
            this.f24310l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public int m17020a() {
        try {
            if (!this.f24307i) {
                if (m17015a(this.f24301b)) {
                    C2015r.m16283a(this.f24302c);
                    return new C2032u(this.f24302c, this.f24301b).m17087c().intValue();
                }
                throw new AMapException("USERID非法");
            }
            throw new AMapException("已开启自动上传");
        } catch (AMapException e) {
            throw e;
        }
    }

    /* renamed from: com.amap.api.services.a.ax$a */
    /* loaded from: classes19.dex */
    public class C1837a extends TimerTask {
        static {
            Covode.recordClassIndex(5448);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                if (C1833ax.this.f24309k != null) {
                    int m17012b = C1833ax.this.m17012b(C1833ax.this.f24309k.OnUploadInfoCallback());
                    Message obtainMessage = C1833ax.this.f24303d.obtainMessage();
                    obtainMessage.arg1 = 10;
                    obtainMessage.obj = C1833ax.this.f24300a;
                    obtainMessage.what = m17012b;
                    C1833ax.this.f24303d.sendMessage(obtainMessage);
                }
            } catch (Throwable th) {
                C2007j.m16371a(th, "NearbySearch", "UpdateDataTask");
            }
        }

        public C1837a() {
        }
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public void setUserID(String str) {
        this.f24301b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public int m17016a(UploadInfo uploadInfo) {
        if (this.f24307i) {
            return PushConstants.EXPIRE_NOTIFICATION;
        }
        return m17012b(uploadInfo);
    }

    /* renamed from: a */
    private boolean m17017a(NearbySearch.NearbyQuery nearbyQuery) {
        if (nearbyQuery == null || nearbyQuery.getCenterPoint() == null) {
            return false;
        }
        return true;
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public synchronized void addNearbyListener(NearbySearch.NearbyListener nearbyListener) {
        try {
            this.f24300a.add(nearbyListener);
        } catch (Throwable th) {
            C2007j.m16371a(th, "NearbySearch", "addNearbyListener");
        }
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public synchronized void removeNearbyListener(NearbySearch.NearbyListener nearbyListener) {
        if (nearbyListener == null) {
            return;
        }
        try {
            this.f24300a.remove(nearbyListener);
        } catch (Throwable th) {
            C2007j.m16371a(th, "NearbySearch", "removeNearbyListener");
        }
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public void searchNearbyInfoAsyn(final NearbySearch.NearbyQuery nearbyQuery) {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.ax.3
                static {
                    Covode.recordClassIndex(5447);
                }

                @Override // java.lang.Runnable
                public void run() {
                    Message obtainMessage = C1833ax.this.f24303d.obtainMessage();
                    obtainMessage.arg1 = 9;
                    HandlerC2019t.C2025f c2025f = new HandlerC2019t.C2025f();
                    c2025f.f24849a = C1833ax.this.f24300a;
                    obtainMessage.obj = c2025f;
                    try {
                        try {
                            c2025f.f24850b = C1833ax.this.searchNearbyInfo(nearbyQuery);
                            obtainMessage.what = 1000;
                        } catch (AMapException e) {
                            obtainMessage.what = e.getErrorCode();
                            C2007j.m16371a(e, "NearbySearch", "searchNearbyInfoAsyn");
                            if (C1833ax.this.f24303d == null) {
                            }
                        }
                    } finally {
                        if (C1833ax.this.f24303d != null) {
                            C1833ax.this.f24303d.sendMessage(obtainMessage);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            C2007j.m16371a(th, "NearbySearch", "searchNearbyInfoAsynThrowable");
        }
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public void uploadNearbyInfoAsyn(final UploadInfo uploadInfo) {
        if (this.f24304f == null) {
            this.f24304f = C116971W2r.LIZ();
        }
        this.f24304f.submit(new Runnable() { // from class: com.amap.api.services.a.ax.2
            static {
                Covode.recordClassIndex(5446);
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Message obtainMessage = C1833ax.this.f24303d.obtainMessage();
                    obtainMessage.arg1 = 10;
                    obtainMessage.obj = C1833ax.this.f24300a;
                    obtainMessage.what = C1833ax.this.m17016a(uploadInfo);
                    C1833ax.this.f24303d.sendMessage(obtainMessage);
                } catch (Throwable th) {
                    C2007j.m16371a(th, "NearbySearch", "uploadNearbyInfoAsyn");
                }
            }
        });
    }

    public C1833ax(Context context) {
        this.f24302c = context.getApplicationContext();
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public NearbySearchResult searchNearbyInfo(NearbySearch.NearbyQuery nearbyQuery) {
        try {
            C2015r.m16283a(this.f24302c);
            if (m17017a(nearbyQuery)) {
                return new C2033v(this.f24302c, nearbyQuery).m17087c();
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            throw e;
        } catch (Throwable th) {
            C2007j.m16371a(th, "NearbySearch", "searchNearbyInfo");
            throw new AMapException("未知错误");
        }
    }

    /* renamed from: a */
    private boolean m17015a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return C116971W2r.LIZJ("^[a-z0-9A-Z_-]{1,32}$").matcher(str).find();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public int m17012b(UploadInfo uploadInfo) {
        try {
            C2015r.m16283a(this.f24302c);
            if (uploadInfo == null) {
                return PushConstants.DELAY_NOTIFICATION;
            }
            long time = new Date().getTime();
            if (time - f24299e < 6500) {
                return 2203;
            }
            f24299e = time;
            String userID = uploadInfo.getUserID();
            if (!m17015a(userID)) {
                return PushConstants.ON_TIME_NOTIFICATION;
            }
            if (TextUtils.isEmpty(this.f24306h)) {
                this.f24306h = userID;
            }
            if (!userID.equals(this.f24306h)) {
                return PushConstants.ON_TIME_NOTIFICATION;
            }
            LatLonPoint point = uploadInfo.getPoint();
            if (point != null && !point.equals(this.f24305g)) {
                new C2034w(this.f24302c, uploadInfo).m17087c();
                this.f24305g = point.copy();
                return 1000;
            }
            return 2204;
        } catch (AMapException e) {
            return e.getErrorCode();
        } catch (Throwable unused) {
            return 1900;
        }
    }

    @Override // com.amap.api.services.interfaces.INearbySearch
    public synchronized void startUploadNearbyInfoAuto(UploadInfoCallback uploadInfoCallback, int i) {
        if (i < 7000) {
            i = 7000;
        }
        try {
            this.f24309k = uploadInfoCallback;
            if (this.f24307i && this.f24310l != null) {
                this.f24310l.cancel();
            }
            this.f24307i = true;
            this.f24310l = new C1837a();
            this.f24308j.schedule(this.f24310l, 0L, i);
        } catch (Throwable th) {
            C2007j.m16371a(th, "NearbySearch", "startUploadNearbyInfoAuto");
        }
    }
}
