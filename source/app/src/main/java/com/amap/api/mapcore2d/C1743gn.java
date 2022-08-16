package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Build;
import android.os.HandlerThread;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import p003X.C116971W2r;

/* renamed from: com.amap.api.mapcore2d.gn */
/* loaded from: classes19.dex */
public final class C1743gn {

    /* renamed from: a */
    public int f23749a;

    /* renamed from: c */
    public TelephonyManager f23751c;

    /* renamed from: e */
    public CellLocation f23753e;

    /* renamed from: l */
    public Context f23760l;

    /* renamed from: p */
    public C1741gl f23764p;

    /* renamed from: q */
    public Object f23765q;

    /* renamed from: b */
    public ArrayList<C1742gm> f23750b = new ArrayList<>();

    /* renamed from: m */
    public String f23761m = null;

    /* renamed from: n */
    public ArrayList<C1742gm> f23762n = new ArrayList<>();

    /* renamed from: o */
    public int f23763o = -113;

    /* renamed from: d */
    public long f23752d = 0;

    /* renamed from: r */
    public int f23766r = 0;

    /* renamed from: s */
    public long f23767s = 0;

    /* renamed from: f */
    public boolean f23754f = false;

    /* renamed from: g */
    public PhoneStateListener f23755g = null;

    /* renamed from: h */
    public String f23756h = null;

    /* renamed from: i */
    public boolean f23757i = false;

    /* renamed from: j */
    public StringBuilder f23758j = null;

    /* renamed from: k */
    public HandlerThread f23759k = null;

    /* renamed from: t */
    public boolean f23768t = false;

    /* renamed from: u */
    public Object f23769u = new Object();

    /* renamed from: com.amap.api.mapcore2d.gn$a */
    /* loaded from: classes19.dex */
    public class HandlerThreadC1745a extends HandlerThread {
        static {
            Covode.recordClassIndex(5293);
        }

        public HandlerThreadC1745a(String str) {
            super(str);
        }

        /* renamed from: com_amap_api_mapcore2d_gn$a_android_telephony_TelephonyManager_listen */
        public static void m17365x8a4c709c(TelephonyManager telephonyManager, PhoneStateListener phoneStateListener, int i) {
            ActionInvokeEntrance.setEventUuid(100913);
            if (((Boolean) ActionInvokeEntrance.actionIntercept(telephonyManager, new Object[]{phoneStateListener, Integer.valueOf(i)}, 100913, "void", false, null, false).first).booleanValue()) {
                return;
            }
            telephonyManager.listen(phoneStateListener, i);
            ActionInvokeEntrance.actionInvoke(null, telephonyManager, new Object[]{phoneStateListener, Integer.valueOf(i)}, 100913, "com_amap_api_mapcore2d_gn$a_android_telephony_TelephonyManager_listen(Landroid/telephony/TelephonyManager;Landroid/telephony/PhoneStateListener;I)V");
        }

        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            try {
                super.onLooperPrepared();
                synchronized (C1743gn.this.f23769u) {
                    if (!C1743gn.this.f23768t) {
                        C1743gn.this.m17376k();
                    }
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                try {
                    super.run();
                } catch (Throwable unused) {
                    m17365x8a4c709c(C1743gn.this.f23751c, C1743gn.this.f23755g, 0);
                    C1743gn.this.f23755g = null;
                    quit();
                }
            } catch (Throwable unused2) {
            }
        }
    }

    static {
        Covode.recordClassIndex(5291);
    }

    public C1743gn(Context context) {
        this.f23751c = null;
        this.f23764p = null;
        this.f23760l = context;
        if (this.f23751c == null) {
            this.f23751c = (TelephonyManager) C1757gy.m17272a(this.f23760l, "phone");
        }
        m17377j();
        this.f23764p = new C1741gl();
    }

    /* renamed from: a */
    private CellLocation m17402a(Object obj, String str, Object... objArr) {
        CellLocation cellLocation;
        if (obj == null) {
            return null;
        }
        try {
            Object m17293a = C1754gw.m17293a(obj, str, objArr);
            cellLocation = m17293a != null ? (CellLocation) m17293a : null;
        } catch (Throwable unused) {
        }
        if (!m17398b(cellLocation)) {
            return null;
        }
        return cellLocation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.amap.api.mapcore2d.gm] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.telephony.CellLocation m17401a(java.util.List<android.telephony.CellInfo> r12) {
        /*
            r11 = this;
            r4 = 0
            if (r12 == 0) goto La4
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto La4
            r3 = 0
        La:
            int r0 = r12.size()
            if (r3 >= r0) goto L73
            java.lang.Object r2 = r12.get(r3)
            android.telephony.CellInfo r2 = (android.telephony.CellInfo) r2
            if (r2 == 0) goto L70
            boolean r1 = r2.isRegistered()     // Catch: java.lang.Throwable -> L70
            boolean r0 = r2 instanceof android.telephony.CellInfoCdma     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L31
            android.telephony.CellInfoCdma r2 = (android.telephony.CellInfoCdma) r2     // Catch: java.lang.Throwable -> L70
            android.telephony.CellIdentityCdma r0 = r2.getCellIdentity()     // Catch: java.lang.Throwable -> L70
            boolean r0 = m17416a(r0)     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L70
            com.amap.api.mapcore2d.gm r3 = r11.m17412a(r2, r1)     // Catch: java.lang.Throwable -> L70
            goto L74
        L31:
            boolean r0 = r2 instanceof android.telephony.CellInfoGsm     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L46
            android.telephony.CellInfoGsm r2 = (android.telephony.CellInfoGsm) r2     // Catch: java.lang.Throwable -> L70
            android.telephony.CellIdentityGsm r0 = r2.getCellIdentity()     // Catch: java.lang.Throwable -> L70
            boolean r0 = m17415a(r0)     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L70
            com.amap.api.mapcore2d.gm r3 = m17411a(r2, r1)     // Catch: java.lang.Throwable -> L70
            goto L74
        L46:
            boolean r0 = r2 instanceof android.telephony.CellInfoWcdma     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L5b
            android.telephony.CellInfoWcdma r2 = (android.telephony.CellInfoWcdma) r2     // Catch: java.lang.Throwable -> L70
            android.telephony.CellIdentityWcdma r0 = r2.getCellIdentity()     // Catch: java.lang.Throwable -> L70
            boolean r0 = m17413a(r0)     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L70
            com.amap.api.mapcore2d.gm r3 = m17409a(r2, r1)     // Catch: java.lang.Throwable -> L70
            goto L74
        L5b:
            boolean r0 = r2 instanceof android.telephony.CellInfoLte     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L73
            android.telephony.CellInfoLte r2 = (android.telephony.CellInfoLte) r2     // Catch: java.lang.Throwable -> L70
            android.telephony.CellIdentityLte r0 = r2.getCellIdentity()     // Catch: java.lang.Throwable -> L70
            boolean r0 = m17414a(r0)     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L70
            com.amap.api.mapcore2d.gm r3 = m17410a(r2, r1)     // Catch: java.lang.Throwable -> L70
            goto L74
        L70:
            int r3 = r3 + 1
            goto La
        L73:
            r3 = r4
        L74:
            if (r3 == 0) goto L9d
            int r1 = r3.f23743k     // Catch: java.lang.Throwable -> L9b
            r0 = 2
            if (r1 != r0) goto L8e
            android.telephony.cdma.CdmaCellLocation r5 = new android.telephony.cdma.CdmaCellLocation     // Catch: java.lang.Throwable -> L9b
            r5.<init>()     // Catch: java.lang.Throwable -> L9b
            int r6 = r3.f23741i     // Catch: java.lang.Throwable -> La0
            int r7 = r3.f23737e     // Catch: java.lang.Throwable -> La0
            int r8 = r3.f23738f     // Catch: java.lang.Throwable -> La0
            int r9 = r3.f23739g     // Catch: java.lang.Throwable -> La0
            int r10 = r3.f23740h     // Catch: java.lang.Throwable -> La0
            r5.setCellLocationData(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> La0
            goto La0
        L8e:
            android.telephony.gsm.GsmCellLocation r2 = new android.telephony.gsm.GsmCellLocation     // Catch: java.lang.Throwable -> L9b
            r2.<init>()     // Catch: java.lang.Throwable -> L9b
            int r1 = r3.f23735c     // Catch: java.lang.Throwable -> L9e
            int r0 = r3.f23736d     // Catch: java.lang.Throwable -> L9e
            r2.setLacAndCid(r1, r0)     // Catch: java.lang.Throwable -> L9e
            goto L9e
        L9b:
            r5 = r4
            goto La0
        L9d:
            r2 = r4
        L9e:
            r5 = r4
            r4 = r2
        La0:
            if (r5 != 0) goto La3
            return r4
        La3:
            return r5
        La4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.C1743gn.m17401a(java.util.List):android.telephony.CellLocation");
    }

    /* renamed from: a */
    public static C1742gm m17417a(int i, boolean z, int i2, int i3, int i4, int i5, int i6) {
        C1742gm c1742gm = new C1742gm(i, z);
        c1742gm.f23733a = i2;
        c1742gm.f23734b = i3;
        c1742gm.f23735c = i4;
        c1742gm.f23736d = i5;
        c1742gm.f23742j = i6;
        return c1742gm;
    }

    /* renamed from: a */
    private C1742gm m17412a(CellInfoCdma cellInfoCdma, boolean z) {
        int i;
        int i2;
        CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
        String[] m17270a = C1757gy.m17270a(this.f23751c);
        try {
            i = Integer.parseInt(m17270a[0]);
        } catch (Throwable unused) {
            i = 0;
        }
        try {
            i2 = Integer.parseInt(m17270a[1]);
        } catch (Throwable unused2) {
            i2 = 0;
            C1742gm m17417a = m17417a(2, z, i, i2, 0, 0, cellInfoCdma.getCellSignalStrength().getCdmaDbm());
            m17417a.f23739g = cellIdentity.getSystemId();
            m17417a.f23740h = cellIdentity.getNetworkId();
            m17417a.f23741i = cellIdentity.getBasestationId();
            m17417a.f23737e = cellIdentity.getLatitude();
            m17417a.f23738f = cellIdentity.getLongitude();
            return m17417a;
        }
        C1742gm m17417a2 = m17417a(2, z, i, i2, 0, 0, cellInfoCdma.getCellSignalStrength().getCdmaDbm());
        m17417a2.f23739g = cellIdentity.getSystemId();
        m17417a2.f23740h = cellIdentity.getNetworkId();
        m17417a2.f23741i = cellIdentity.getBasestationId();
        m17417a2.f23737e = cellIdentity.getLatitude();
        m17417a2.f23738f = cellIdentity.getLongitude();
        return m17417a2;
    }

    /* renamed from: a */
    public static C1742gm m17411a(CellInfoGsm cellInfoGsm, boolean z) {
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        return m17417a(1, z, cellIdentity.getMcc(), cellIdentity.getMnc(), cellIdentity.getLac(), cellIdentity.getCid(), cellInfoGsm.getCellSignalStrength().getDbm());
    }

    /* renamed from: a */
    public static C1742gm m17410a(CellInfoLte cellInfoLte, boolean z) {
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        C1742gm m17417a = m17417a(3, z, cellIdentity.getMcc(), cellIdentity.getMnc(), m17390x6aece154(cellIdentity), cellIdentity.getCi(), cellInfoLte.getCellSignalStrength().getDbm());
        m17417a.f23747o = cellIdentity.getPci();
        return m17417a;
    }

    /* renamed from: a */
    public static C1742gm m17409a(CellInfoWcdma cellInfoWcdma, boolean z) {
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        C1742gm m17417a = m17417a(4, z, cellIdentity.getMcc(), cellIdentity.getMnc(), cellIdentity.getLac(), cellIdentity.getCid(), cellInfoWcdma.getCellSignalStrength().getDbm());
        m17417a.f23747o = cellIdentity.getPsc();
        return m17417a;
    }

    /* renamed from: a */
    public static C1742gm m17406a(NeighboringCellInfo neighboringCellInfo, String[] strArr) {
        try {
            C1742gm c1742gm = new C1742gm(1, false);
            c1742gm.f23733a = Integer.parseInt(strArr[0]);
            c1742gm.f23734b = Integer.parseInt(strArr[1]);
            c1742gm.f23735c = C1754gw.m17290b(neighboringCellInfo, "getLac", new Object[0]);
            c1742gm.f23736d = neighboringCellInfo.getCid();
            c1742gm.f23742j = C1757gy.m17276a(neighboringCellInfo.getRssi());
            return c1742gm;
        } catch (Throwable th) {
            C1752gu.m17302a(th, "CgiManager", "getGsm");
            return null;
        }
    }

    /* renamed from: a */
    private void m17407a(CellLocation cellLocation, String[] strArr) {
        List<NeighboringCellInfo> list;
        C1742gm m17406a;
        if (cellLocation == null || this.f23751c == null) {
            return;
        }
        this.f23750b.clear();
        if (!m17398b(cellLocation)) {
            return;
        }
        this.f23749a = 1;
        this.f23750b.add(m17392c(cellLocation, strArr));
        if (Build.VERSION.SDK_INT > 28 || (list = (List) C1754gw.m17293a(this.f23751c, "getNeighboringCellInfo", new Object[0])) == null || list.isEmpty()) {
            return;
        }
        for (NeighboringCellInfo neighboringCellInfo : list) {
            if (neighboringCellInfo != null && m17418a(neighboringCellInfo.getLac(), neighboringCellInfo.getCid()) && (m17406a = m17406a(neighboringCellInfo, strArr)) != null && !this.f23750b.contains(m17406a)) {
                this.f23750b.add(m17406a);
            }
        }
    }

    /* renamed from: a */
    public static boolean m17419a(int i) {
        return i > 0 && i <= 15;
    }

    /* renamed from: a */
    public static boolean m17418a(int i, int i2) {
        return (i == -1 || i == 0 || i > 65535 || i2 == -1 || i2 == 0 || i2 == 65535 || i2 >= 268435455) ? false : true;
    }

    /* renamed from: a */
    public static boolean m17416a(CellIdentityCdma cellIdentityCdma) {
        return cellIdentityCdma != null && cellIdentityCdma.getSystemId() > 0 && cellIdentityCdma.getNetworkId() >= 0 && cellIdentityCdma.getBasestationId() >= 0;
    }

    /* renamed from: a */
    public static boolean m17415a(CellIdentityGsm cellIdentityGsm) {
        return cellIdentityGsm != null && m17394c(cellIdentityGsm.getLac()) && m17383d(cellIdentityGsm.getCid());
    }

    /* renamed from: a */
    public static boolean m17414a(CellIdentityLte cellIdentityLte) {
        return cellIdentityLte != null && m17394c(m17390x6aece154(cellIdentityLte)) && m17383d(cellIdentityLte.getCi());
    }

    /* renamed from: a */
    public static boolean m17413a(CellIdentityWcdma cellIdentityWcdma) {
        return cellIdentityWcdma != null && m17394c(cellIdentityWcdma.getLac()) && m17383d(cellIdentityWcdma.getCid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m17399b(int i) {
        ArrayList<C1742gm> arrayList;
        if (i == -113) {
            this.f23763o = -113;
            return;
        }
        this.f23763o = i;
        int i2 = this.f23749a;
        if ((i2 != 1 && i2 != 2) || (arrayList = this.f23750b) == null || arrayList.isEmpty()) {
            return;
        }
        try {
            this.f23750b.get(0).f23742j = this.f23763o;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private void m17397b(CellLocation cellLocation, String[] strArr) {
        if (cellLocation == null) {
            return;
        }
        this.f23750b.clear();
        if (C1757gy.m17257c() < 5) {
            return;
        }
        try {
            boolean z = true;
            if (this.f23765q != null) {
                try {
                    Field declaredField = cellLocation.getClass().getDeclaredField("mGsmCellLoc");
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) declaredField.get(cellLocation);
                    if (gsmCellLocation != null && m17398b(gsmCellLocation)) {
                        m17407a(gsmCellLocation, strArr);
                        return;
                    }
                } catch (Throwable unused) {
                }
            }
            if (!m17398b(cellLocation)) {
                return;
            }
            this.f23749a = 2;
            C1742gm c1742gm = new C1742gm(2, true);
            c1742gm.f23733a = Integer.parseInt(strArr[0]);
            c1742gm.f23734b = Integer.parseInt(strArr[1]);
            c1742gm.f23739g = C1754gw.m17290b(cellLocation, "getSystemId", new Object[0]);
            c1742gm.f23740h = C1754gw.m17290b(cellLocation, "getNetworkId", new Object[0]);
            c1742gm.f23741i = C1754gw.m17290b(cellLocation, "getBaseStationId", new Object[0]);
            c1742gm.f23742j = this.f23763o;
            c1742gm.f23737e = C1754gw.m17290b(cellLocation, "getBaseStationLatitude", new Object[0]);
            c1742gm.f23738f = C1754gw.m17290b(cellLocation, "getBaseStationLongitude", new Object[0]);
            if (c1742gm.f23737e != c1742gm.f23738f || c1742gm.f23737e <= 0) {
                z = false;
            }
            if (c1742gm.f23737e < 0 || c1742gm.f23738f < 0 || c1742gm.f23737e == Integer.MAX_VALUE || c1742gm.f23738f == Integer.MAX_VALUE || z) {
                c1742gm.f23737e = 0;
                c1742gm.f23738f = 0;
            }
            if (this.f23750b.contains(c1742gm)) {
                return;
            }
            this.f23750b.add(c1742gm);
        } catch (Throwable th) {
            C1752gu.m17302a(th, "CgiManager", "hdlCdmaLocChange");
        }
    }

    /* renamed from: b */
    private boolean m17398b(CellLocation cellLocation) {
        boolean m17408a = m17408a(cellLocation);
        if (!m17408a) {
            this.f23749a = 0;
        }
        return m17408a;
    }

    /* renamed from: c */
    private int m17393c(CellLocation cellLocation) {
        int i = 0;
        if (this.f23757i || cellLocation == null) {
            return 0;
        }
        if (cellLocation instanceof GsmCellLocation) {
            return 1;
        }
        try {
            C116971W2r.LIZ("android.telephony.cdma.CdmaCellLocation");
            i = 2;
            return 2;
        } catch (Throwable th) {
            C1752gu.m17302a(th, "Utils", "getCellLocT");
            return i;
        }
    }

    /* renamed from: c */
    private C1742gm m17392c(CellLocation cellLocation, String[] strArr) {
        GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
        C1742gm c1742gm = new C1742gm(1, true);
        c1742gm.f23733a = C1757gy.m17252d(strArr[0]);
        c1742gm.f23734b = C1757gy.m17252d(strArr[1]);
        c1742gm.f23735c = m17385xde97cb8f(gsmCellLocation);
        c1742gm.f23736d = m17386xde97aabf(gsmCellLocation);
        c1742gm.f23742j = this.f23763o;
        return c1742gm;
    }

    /* renamed from: c */
    public static boolean m17394c(int i) {
        return (i == -1 || i == 0 || i > 65535) ? false : true;
    }

    /* renamed from: com_amap_api_mapcore2d_gn_android_telephony_CellIdentityLte_getTac */
    public static int m17390x6aece154(CellIdentityLte cellIdentityLte) {
        ActionInvokeEntrance.setEventUuid(102016);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(cellIdentityLte, new Object[0], 102016, "int", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return ((Integer) actionIntercept.second).intValue();
        }
        int tac = cellIdentityLte.getTac();
        ActionInvokeEntrance.actionInvoke(Integer.valueOf(tac), cellIdentityLte, new Object[0], 102016, "com_amap_api_mapcore2d_gn_android_telephony_CellIdentityLte_getTac(Landroid/telephony/CellIdentityLte;)I");
        return tac;
    }

    /* renamed from: com_amap_api_mapcore2d_gn_android_telephony_TelephonyManager_getAllCellInfo */
    public static List m17389x4d50c013(TelephonyManager telephonyManager) {
        ActionInvokeEntrance.setEventUuid(100909);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(telephonyManager, new Object[0], 100909, "java.util.List", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (List) actionIntercept.second;
        }
        List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
        ActionInvokeEntrance.actionInvoke(allCellInfo, telephonyManager, new Object[0], 100909, "com_amap_api_mapcore2d_gn_android_telephony_TelephonyManager_getAllCellInfo(Landroid/telephony/TelephonyManager;)Ljava/util/List;");
        return allCellInfo;
    }

    /* renamed from: com_amap_api_mapcore2d_gn_android_telephony_TelephonyManager_getCellLocation */
    public static CellLocation m17388x848e1d55(TelephonyManager telephonyManager) {
        ActionInvokeEntrance.setEventUuid(100900);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(telephonyManager, new Object[0], 100900, "android.telephony.CellLocation", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (CellLocation) actionIntercept.second;
        }
        CellLocation cellLocation = telephonyManager.getCellLocation();
        ActionInvokeEntrance.actionInvoke(cellLocation, telephonyManager, new Object[0], 100900, "com_amap_api_mapcore2d_gn_android_telephony_TelephonyManager_getCellLocation(Landroid/telephony/TelephonyManager;)Landroid/telephony/CellLocation;");
        return cellLocation;
    }

    /* renamed from: com_amap_api_mapcore2d_gn_android_telephony_TelephonyManager_listen */
    public static void m17387x609d11f(TelephonyManager telephonyManager, PhoneStateListener phoneStateListener, int i) {
        ActionInvokeEntrance.setEventUuid(100913);
        if (((Boolean) ActionInvokeEntrance.actionIntercept(telephonyManager, new Object[]{phoneStateListener, Integer.valueOf(i)}, 100913, "void", false, null, false).first).booleanValue()) {
            return;
        }
        telephonyManager.listen(phoneStateListener, i);
        ActionInvokeEntrance.actionInvoke(null, telephonyManager, new Object[]{phoneStateListener, Integer.valueOf(i)}, 100913, "com_amap_api_mapcore2d_gn_android_telephony_TelephonyManager_listen(Landroid/telephony/TelephonyManager;Landroid/telephony/PhoneStateListener;I)V");
    }

    /* renamed from: com_amap_api_mapcore2d_gn_android_telephony_gsm_GsmCellLocation_getCid */
    public static int m17386xde97aabf(GsmCellLocation gsmCellLocation) {
        ActionInvokeEntrance.setEventUuid(100906);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(gsmCellLocation, new Object[0], 100906, "int", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return ((Integer) actionIntercept.second).intValue();
        }
        int cid = gsmCellLocation.getCid();
        ActionInvokeEntrance.actionInvoke(Integer.valueOf(cid), gsmCellLocation, new Object[0], 100906, "com_amap_api_mapcore2d_gn_android_telephony_gsm_GsmCellLocation_getCid(Landroid/telephony/gsm/GsmCellLocation;)I");
        return cid;
    }

    /* renamed from: com_amap_api_mapcore2d_gn_android_telephony_gsm_GsmCellLocation_getLac */
    public static int m17385xde97cb8f(GsmCellLocation gsmCellLocation) {
        ActionInvokeEntrance.setEventUuid(100907);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(gsmCellLocation, new Object[0], 100907, "int", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return ((Integer) actionIntercept.second).intValue();
        }
        int lac = gsmCellLocation.getLac();
        ActionInvokeEntrance.actionInvoke(Integer.valueOf(lac), gsmCellLocation, new Object[0], 100907, "com_amap_api_mapcore2d_gn_android_telephony_gsm_GsmCellLocation_getLac(Landroid/telephony/gsm/GsmCellLocation;)I");
        return lac;
    }

    /* renamed from: d */
    public static boolean m17383d(int i) {
        return (i == -1 || i == 0 || i == 65535 || i >= 268435455) ? false : true;
    }

    /* renamed from: j */
    private void m17377j() {
        TelephonyManager telephonyManager = this.f23751c;
        if (telephonyManager == null) {
            return;
        }
        try {
            this.f23749a = m17393c(m17388x848e1d55(telephonyManager));
        } catch (SecurityException e) {
            this.f23756h = e.getMessage();
        } catch (Throwable th) {
            this.f23756h = null;
            C1752gu.m17302a(th, "CgiManager", "CgiManager");
            this.f23749a = 0;
        }
        try {
            this.f23766r = m17366u();
            int i = this.f23766r;
            this.f23765q = i != 1 ? i != 2 ? C1757gy.m17272a(this.f23760l, "phone2") : C1757gy.m17272a(this.f23760l, "phone2") : C1757gy.m17272a(this.f23760l, "phone_msim");
        } catch (Throwable unused) {
        }
        if (this.f23759k != null) {
            return;
        }
        this.f23759k = new HandlerThreadC1745a("listenerPhoneStateThread");
        this.f23759k.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m17376k() {
        int i;
        this.f23755g = new PhoneStateListener() { // from class: com.amap.api.mapcore2d.gn.1
            static {
                Covode.recordClassIndex(5292);
            }

            @Override // android.telephony.PhoneStateListener
            public final void onCellLocationChanged(CellLocation cellLocation) {
                ActionInvokeEntrance.setEventUuid(100911);
                if (((Boolean) ActionInvokeEntrance.actionIntercept(this, new Object[]{cellLocation}, 100911, "void", false, null, false).first).booleanValue()) {
                    return;
                }
                ActionInvokeEntrance.actionInvokeInsert(this, new Object[]{cellLocation}, 100911, "onCellLocationChanged(Landroid/telephony/CellLocation;)V");
                try {
                    if (!C1743gn.this.m17408a(cellLocation)) {
                        return;
                    }
                    C1743gn.this.f23753e = cellLocation;
                    C1743gn.this.f23754f = true;
                    C1743gn.this.f23767s = C1757gy.m17265b();
                } catch (Throwable unused) {
                }
            }

            @Override // android.telephony.PhoneStateListener
            public final void onServiceStateChanged(ServiceState serviceState) {
                try {
                    int state = serviceState.getState();
                    if (state == 0) {
                        C1743gn.this.m17381f();
                    } else if (state != 1) {
                    } else {
                        C1743gn.this.m17379h();
                    }
                } catch (Throwable unused) {
                }
            }

            @Override // android.telephony.PhoneStateListener
            public final void onSignalStrengthChanged(int i2) {
                int i3 = -113;
                try {
                    int i4 = C1743gn.this.f23749a;
                    if (i4 == 1 || i4 == 2) {
                        i3 = C1757gy.m17276a(i2);
                    }
                    C1743gn.this.m17399b(i3);
                } catch (Throwable unused) {
                }
            }

            @Override // android.telephony.PhoneStateListener
            public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
                if (signalStrength == null) {
                    return;
                }
                int i2 = -113;
                try {
                    int i3 = C1743gn.this.f23749a;
                    if (i3 == 1) {
                        i2 = C1757gy.m17276a(signalStrength.getGsmSignalStrength());
                    } else if (i3 == 2) {
                        i2 = signalStrength.getCdmaDbm();
                    }
                    C1743gn.this.m17399b(i2);
                } catch (Throwable unused) {
                }
            }
        };
        try {
            i = C1754gw.m17289b("android.telephony.PhoneStateListener", C1757gy.m17257c() < 7 ? "LISTEN_SIGNAL_STRENGTH" : "LISTEN_SIGNAL_STRENGTHS");
        } catch (Throwable unused) {
            i = 0;
        }
        if (i == 0) {
            try {
                m17387x609d11f(this.f23751c, this.f23755g, 16);
                return;
            } catch (Throwable unused2) {
                return;
            }
        }
        try {
            m17387x609d11f(this.f23751c, this.f23755g, i | 16);
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: l */
    private CellLocation m17375l() {
        TelephonyManager telephonyManager = this.f23751c;
        if (telephonyManager != null) {
            try {
                CellLocation m17388x848e1d55 = m17388x848e1d55(telephonyManager);
                this.f23756h = null;
                if (m17398b(m17388x848e1d55)) {
                    this.f23753e = m17388x848e1d55;
                    return m17388x848e1d55;
                }
            } catch (SecurityException e) {
                this.f23756h = e.getMessage();
                return null;
            } catch (Throwable th) {
                this.f23756h = null;
                C1752gu.m17302a(th, "CgiManager", "getCellLocation");
            }
        }
        return null;
    }

    /* renamed from: m */
    private boolean m17374m() {
        return !this.f23757i && C1757gy.m17265b() - this.f23752d >= 10000;
    }

    /* renamed from: n */
    private void m17373n() {
        m17379h();
    }

    /* renamed from: o */
    private void m17372o() {
        int m17384d = m17384d();
        if (m17384d == 1) {
            if (!this.f23750b.isEmpty()) {
                return;
            }
            this.f23749a = 0;
        } else if (m17384d != 2 || !this.f23750b.isEmpty()) {
        } else {
            this.f23749a = 0;
        }
    }

    /* renamed from: p */
    private void m17371p() {
        if (!this.f23757i && this.f23751c != null) {
            CellLocation m17370q = m17370q();
            if (!m17398b(m17370q)) {
                m17370q = m17369r();
            }
            if (m17398b(m17370q)) {
                this.f23753e = m17370q;
                this.f23767s = C1757gy.m17265b();
            } else if (C1757gy.m17265b() - this.f23767s > 60000) {
                this.f23753e = null;
                this.f23750b.clear();
                this.f23762n.clear();
            }
        }
        this.f23754f = true;
        if (m17398b(this.f23753e)) {
            String[] m17270a = C1757gy.m17270a(this.f23751c);
            int m17393c = m17393c(this.f23753e);
            if (m17393c == 1) {
                m17407a(this.f23753e, m17270a);
            } else if (m17393c == 2) {
                m17397b(this.f23753e, m17270a);
            }
        }
        try {
            if (C1757gy.m17257c() >= 18) {
                m17367t();
            }
        } catch (Throwable unused) {
        }
        TelephonyManager telephonyManager = this.f23751c;
        if (telephonyManager != null) {
            this.f23761m = telephonyManager.getNetworkOperator();
            if (TextUtils.isEmpty(this.f23761m)) {
                return;
            }
            this.f23749a |= 8;
        }
    }

    /* renamed from: q */
    private CellLocation m17370q() {
        TelephonyManager telephonyManager = this.f23751c;
        CellLocation cellLocation = null;
        if (telephonyManager == null) {
            return null;
        }
        CellLocation m17375l = m17375l();
        if (m17398b(m17375l)) {
            return m17375l;
        }
        if (C1757gy.m17257c() >= 18) {
            try {
                cellLocation = m17401a(m17389x4d50c013(telephonyManager));
            } catch (SecurityException e) {
                this.f23756h = e.getMessage();
            }
        }
        if (cellLocation != null) {
            return cellLocation;
        }
        CellLocation m17402a = m17402a(telephonyManager, "getCellLocationExt", 1);
        return m17402a != null ? m17402a : m17402a(telephonyManager, "getCellLocationGemini", 1);
    }

    /* renamed from: r */
    private CellLocation m17369r() {
        Object obj = this.f23765q;
        CellLocation cellLocation = null;
        if (obj == null) {
            return null;
        }
        try {
            Class<?> m17368s = m17368s();
            if (m17368s.isInstance(obj)) {
                Object cast = m17368s.cast(obj);
                CellLocation m17402a = m17402a(cast, "getCellLocation", new Object[0]);
                if (m17402a != null) {
                    return m17402a;
                }
                CellLocation m17402a2 = m17402a(cast, "getCellLocation", 1);
                if (m17402a2 != null) {
                    return m17402a2;
                }
                CellLocation m17402a3 = m17402a(cast, "getCellLocationGemini", 1);
                if (m17402a3 != null) {
                    return m17402a3;
                }
                cellLocation = m17402a(cast, "getAllCellInfo", 1);
                if (cellLocation != null) {
                    return cellLocation;
                }
            }
        } catch (Throwable th) {
            C1752gu.m17302a(th, "CgiManager", "getSim2Cgi");
        }
        return cellLocation;
    }

    /* renamed from: s */
    private Class<?> m17368s() {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        int i = this.f23766r;
        Class<?> cls = null;
        try {
            cls = C116971W2r.LIZ(systemClassLoader, i != 0 ? i != 1 ? i != 2 ? null : "android.telephony.TelephonyManager2" : "android.telephony.MSimTelephonyManager" : "android.telephony.TelephonyManager");
            return cls;
        } catch (Throwable th) {
            C1752gu.m17302a(th, "CgiManager", "getSim2TmClass");
            return cls;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m17367t() {
        /*
            r10 = this;
            android.telephony.TelephonyManager r0 = r10.f23751c
            if (r0 != 0) goto L5
            return
        L5:
            java.util.ArrayList<com.amap.api.mapcore2d.gm> r7 = r10.f23762n
            com.amap.api.mapcore2d.gl r6 = r10.f23764p
            r1 = 0
            java.util.List r9 = m17389x4d50c013(r0)     // Catch: java.lang.SecurityException -> L11
            r10.f23756h = r1     // Catch: java.lang.SecurityException -> L13
            goto L1c
        L11:
            r0 = move-exception
            goto L15
        L13:
            r0 = move-exception
            r1 = r9
        L15:
            java.lang.String r0 = r0.getMessage()
            r10.f23756h = r0
            r9 = r1
        L1c:
            if (r9 == 0) goto Lba
            int r8 = r9.size()
            if (r8 == 0) goto Lba
            if (r7 == 0) goto L29
            r7.clear()
        L29:
            r5 = 0
        L2a:
            if (r5 >= r8) goto Lba
            java.lang.Object r4 = r9.get(r5)
            android.telephony.CellInfo r4 = (android.telephony.CellInfo) r4
            if (r4 == 0) goto Lb6
            boolean r1 = r4.isRegistered()     // Catch: java.lang.Throwable -> Lb6
            boolean r0 = r4 instanceof android.telephony.CellInfoCdma     // Catch: java.lang.Throwable -> Lb6
            r2 = 65535(0xffff, double:3.23786E-319)
            if (r0 == 0) goto L5f
            android.telephony.CellInfoCdma r4 = (android.telephony.CellInfoCdma) r4     // Catch: java.lang.Throwable -> Lb6
            android.telephony.CellIdentityCdma r0 = r4.getCellIdentity()     // Catch: java.lang.Throwable -> Lb6
            boolean r0 = m17416a(r0)     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto Lb6
            com.amap.api.mapcore2d.gm r4 = r10.m17412a(r4, r1)     // Catch: java.lang.Throwable -> Lb6
            long r0 = r6.m17427a(r4)     // Catch: java.lang.Throwable -> Lb6
            long r0 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> Lb6
        L57:
            int r2 = (int) r0     // Catch: java.lang.Throwable -> Lb6
            short r0 = (short) r2     // Catch: java.lang.Throwable -> Lb6
            r4.f23744l = r0     // Catch: java.lang.Throwable -> Lb6
            r7.add(r4)     // Catch: java.lang.Throwable -> Lb6
            goto Lb6
        L5f:
            boolean r0 = r4 instanceof android.telephony.CellInfoGsm     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto L7c
            android.telephony.CellInfoGsm r4 = (android.telephony.CellInfoGsm) r4     // Catch: java.lang.Throwable -> Lb6
            android.telephony.CellIdentityGsm r0 = r4.getCellIdentity()     // Catch: java.lang.Throwable -> Lb6
            boolean r0 = m17415a(r0)     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto Lb6
            com.amap.api.mapcore2d.gm r4 = m17411a(r4, r1)     // Catch: java.lang.Throwable -> Lb6
            long r0 = r6.m17427a(r4)     // Catch: java.lang.Throwable -> Lb6
            long r0 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> Lb6
            goto L57
        L7c:
            boolean r0 = r4 instanceof android.telephony.CellInfoWcdma     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto L99
            android.telephony.CellInfoWcdma r4 = (android.telephony.CellInfoWcdma) r4     // Catch: java.lang.Throwable -> Lb6
            android.telephony.CellIdentityWcdma r0 = r4.getCellIdentity()     // Catch: java.lang.Throwable -> Lb6
            boolean r0 = m17413a(r0)     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto Lb6
            com.amap.api.mapcore2d.gm r4 = m17409a(r4, r1)     // Catch: java.lang.Throwable -> Lb6
            long r0 = r6.m17427a(r4)     // Catch: java.lang.Throwable -> Lb6
            long r0 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> Lb6
            goto L57
        L99:
            boolean r0 = r4 instanceof android.telephony.CellInfoLte     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto Lb6
            android.telephony.CellInfoLte r4 = (android.telephony.CellInfoLte) r4     // Catch: java.lang.Throwable -> Lb6
            android.telephony.CellIdentityLte r0 = r4.getCellIdentity()     // Catch: java.lang.Throwable -> Lb6
            boolean r0 = m17414a(r0)     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto Lb6
            com.amap.api.mapcore2d.gm r4 = m17410a(r4, r1)     // Catch: java.lang.Throwable -> Lb6
            long r0 = r6.m17427a(r4)     // Catch: java.lang.Throwable -> Lb6
            long r0 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> Lb6
            goto L57
        Lb6:
            int r5 = r5 + 1
            goto L2a
        Lba:
            if (r7 == 0) goto Lcb
            int r0 = r7.size()
            if (r0 <= 0) goto Lcb
            int r0 = r10.f23749a
            r0 = r0 | 4
            r10.f23749a = r0
            r6.m17426a(r7)
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.C1743gn.m17367t():void");
    }

    /* renamed from: u */
    private int m17366u() {
        try {
            C116971W2r.LIZ("android.telephony.MSimTelephonyManager");
            this.f23766r = 1;
        } catch (Throwable unused) {
        }
        if (this.f23766r == 0) {
            try {
                C116971W2r.LIZ("android.telephony.TelephonyManager2");
                this.f23766r = 2;
            } catch (Throwable unused2) {
            }
        }
        return this.f23766r;
    }

    /* renamed from: a */
    public final ArrayList<C1742gm> m17420a() {
        return this.f23750b;
    }

    /* renamed from: a */
    public final boolean m17408a(CellLocation cellLocation) {
        String str;
        if (cellLocation == null) {
            return false;
        }
        int m17393c = m17393c(cellLocation);
        boolean z = true;
        if (m17393c != 1) {
            if (m17393c == 2) {
                try {
                    if (C1754gw.m17290b(cellLocation, "getSystemId", new Object[0]) <= 0 || C1754gw.m17290b(cellLocation, "getNetworkId", new Object[0]) < 0) {
                        return false;
                    }
                    if (C1754gw.m17290b(cellLocation, "getBaseStationId", new Object[0]) < 0) {
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    str = "cgiUseful Cgi.I_CDMA_T";
                }
            }
            return z;
        }
        try {
            GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
            z = m17418a(m17385xde97cb8f(gsmCellLocation), m17386xde97aabf(gsmCellLocation));
            return z;
        } catch (Throwable th2) {
            th = th2;
            str = "cgiUseful Cgi.I_GSM_T";
        }
        C1752gu.m17302a(th, "CgiManager", str);
        return z;
    }

    /* renamed from: b */
    public final ArrayList<C1742gm> m17400b() {
        return this.f23762n;
    }

    /* renamed from: c */
    public final int m17395c() {
        return this.f23749a;
    }

    /* renamed from: d */
    public final int m17384d() {
        return this.f23749a & 3;
    }

    /* renamed from: e */
    public final TelephonyManager m17382e() {
        return this.f23751c;
    }

    /* renamed from: f */
    public final void m17381f() {
        try {
            this.f23757i = C1757gy.m17273a(this.f23760l);
            if (m17374m() || this.f23750b.isEmpty()) {
                m17371p();
                this.f23752d = C1757gy.m17265b();
            }
            if (this.f23757i) {
                m17373n();
            } else {
                m17372o();
            }
        } catch (SecurityException e) {
            this.f23756h = e.getMessage();
        } catch (Throwable th) {
            C1752gu.m17302a(th, "CgiManager", "refresh");
        }
    }

    /* renamed from: g */
    public final void m17380g() {
        PhoneStateListener phoneStateListener;
        this.f23764p.m17429a();
        this.f23767s = 0L;
        synchronized (this.f23769u) {
            this.f23768t = true;
        }
        TelephonyManager telephonyManager = this.f23751c;
        if (telephonyManager != null && (phoneStateListener = this.f23755g) != null) {
            try {
                m17387x609d11f(telephonyManager, phoneStateListener, 0);
            } catch (Throwable th) {
                C1752gu.m17302a(th, "CgiManager", "destroy");
            }
        }
        this.f23755g = null;
        HandlerThread handlerThread = this.f23759k;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f23759k = null;
        }
        this.f23763o = -113;
        this.f23751c = null;
        this.f23765q = null;
    }

    /* renamed from: h */
    public final void m17379h() {
        this.f23756h = null;
        this.f23753e = null;
        this.f23749a = 0;
        this.f23750b.clear();
        this.f23762n.clear();
    }

    /* renamed from: i */
    public final String m17378i() {
        return this.f23761m;
    }
}
