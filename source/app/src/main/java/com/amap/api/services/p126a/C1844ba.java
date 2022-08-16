package com.amap.api.services.p126a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IRouteSearch;
import com.amap.api.services.route.BusRouteResult;
import com.amap.api.services.route.DriveRoutePlanResult;
import com.amap.api.services.route.DriveRouteResult;
import com.amap.api.services.route.RideRouteResult;
import com.amap.api.services.route.RouteSearch;
import com.amap.api.services.route.TruckRouteRestult;
import com.amap.api.services.route.WalkRouteResult;
import com.bytedance.covode.number.Covode;
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;

/* renamed from: com.amap.api.services.a.ba */
/* loaded from: classes19.dex */
public class C1844ba implements IRouteSearch {

    /* renamed from: a */
    public RouteSearch.OnRouteSearchListener f24335a;

    /* renamed from: b */
    public RouteSearch.OnTruckRouteSearchListener f24336b;

    /* renamed from: c */
    public RouteSearch.OnRoutePlanSearchListener f24337c;

    /* renamed from: d */
    public Context f24338d;

    /* renamed from: e */
    public Handler f24339e = HandlerC2019t.m16280a();

    static {
        Covode.recordClassIndex(5455);
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public void setOnRoutePlanSearchListener(RouteSearch.OnRoutePlanSearchListener onRoutePlanSearchListener) {
        this.f24337c = onRoutePlanSearchListener;
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public void setOnTruckRouteSearchListener(RouteSearch.OnTruckRouteSearchListener onTruckRouteSearchListener) {
        this.f24336b = onTruckRouteSearchListener;
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public void setRouteSearchListener(RouteSearch.OnRouteSearchListener onRouteSearchListener) {
        this.f24335a = onRouteSearchListener;
    }

    public C1844ba(Context context) {
        this.f24338d = context.getApplicationContext();
    }

    /* renamed from: a */
    private boolean m16993a(RouteSearch.FromAndTo fromAndTo) {
        if (fromAndTo == null || fromAndTo.getFrom() == null || fromAndTo.getTo() == null) {
            return false;
        }
        return true;
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public void calculateBusRouteAsyn(final RouteSearch.BusRouteQuery busRouteQuery) {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.ba.2
                static {
                    Covode.recordClassIndex(5457);
                }

                @Override // java.lang.Runnable
                public void run() {
                    Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                    obtainMessage.what = 100;
                    obtainMessage.arg1 = 1;
                    Bundle bundle = new Bundle();
                    BusRouteResult busRouteResult = null;
                    try {
                        try {
                            busRouteResult = C1844ba.this.calculateBusRoute(busRouteQuery);
                            bundle.putInt("errorCode", 1000);
                        } catch (AMapException e) {
                            bundle.putInt("errorCode", e.getErrorCode());
                        }
                    } finally {
                        obtainMessage.obj = C1844ba.this.f24335a;
                        bundle.putParcelable("result", busRouteResult);
                        obtainMessage.setData(bundle);
                        C1844ba.this.f24339e.sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            C2007j.m16371a(th, "RouteSearch", "calculateBusRouteAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public void calculateDrivePlanAsyn(final RouteSearch.DrivePlanQuery drivePlanQuery) {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.ba.6
                static {
                    Covode.recordClassIndex(5461);
                }

                @Override // java.lang.Runnable
                public void run() {
                    Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                    obtainMessage.what = 105;
                    obtainMessage.arg1 = 18;
                    Bundle bundle = new Bundle();
                    DriveRoutePlanResult driveRoutePlanResult = null;
                    try {
                        try {
                            driveRoutePlanResult = C1844ba.this.calculateDrivePlan(drivePlanQuery);
                            bundle.putInt("errorCode", 1000);
                        } catch (AMapException e) {
                            bundle.putInt("errorCode", e.getErrorCode());
                        }
                    } finally {
                        obtainMessage.obj = C1844ba.this.f24337c;
                        bundle.putParcelable("result", driveRoutePlanResult);
                        obtainMessage.setData(bundle);
                        C1844ba.this.f24339e.sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            C2007j.m16371a(th, "RouteSearch", "calculateTruckRouteAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public void calculateDriveRouteAsyn(final RouteSearch.DriveRouteQuery driveRouteQuery) {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.ba.3
                static {
                    Covode.recordClassIndex(5458);
                }

                @Override // java.lang.Runnable
                public void run() {
                    Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                    obtainMessage.what = BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS;
                    obtainMessage.arg1 = 1;
                    Bundle bundle = new Bundle();
                    DriveRouteResult driveRouteResult = null;
                    try {
                        try {
                            driveRouteResult = C1844ba.this.calculateDriveRoute(driveRouteQuery);
                            bundle.putInt("errorCode", 1000);
                        } catch (AMapException e) {
                            bundle.putInt("errorCode", e.getErrorCode());
                        }
                    } finally {
                        obtainMessage.obj = C1844ba.this.f24335a;
                        bundle.putParcelable("result", driveRouteResult);
                        obtainMessage.setData(bundle);
                        C1844ba.this.f24339e.sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            C2007j.m16371a(th, "RouteSearch", "calculateDriveRouteAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public void calculateRideRouteAsyn(final RouteSearch.RideRouteQuery rideRouteQuery) {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.ba.4
                static {
                    Covode.recordClassIndex(5459);
                }

                @Override // java.lang.Runnable
                public void run() {
                    Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                    obtainMessage.what = 103;
                    obtainMessage.arg1 = 1;
                    Bundle bundle = new Bundle();
                    RideRouteResult rideRouteResult = null;
                    try {
                        try {
                            rideRouteResult = C1844ba.this.calculateRideRoute(rideRouteQuery);
                            bundle.putInt("errorCode", 1000);
                        } catch (AMapException e) {
                            bundle.putInt("errorCode", e.getErrorCode());
                        }
                    } finally {
                        obtainMessage.obj = C1844ba.this.f24335a;
                        bundle.putParcelable("result", rideRouteResult);
                        obtainMessage.setData(bundle);
                        C1844ba.this.f24339e.sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            C2007j.m16371a(th, "RouteSearch", "calculateRideRouteAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public void calculateTruckRouteAsyn(final RouteSearch.TruckRouteQuery truckRouteQuery) {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.ba.5
                static {
                    Covode.recordClassIndex(5460);
                }

                @Override // java.lang.Runnable
                public void run() {
                    Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                    obtainMessage.what = 104;
                    obtainMessage.arg1 = 17;
                    Bundle bundle = new Bundle();
                    TruckRouteRestult truckRouteRestult = null;
                    try {
                        try {
                            truckRouteRestult = C1844ba.this.calculateTruckRoute(truckRouteQuery);
                            bundle.putInt("errorCode", 1000);
                        } catch (AMapException e) {
                            bundle.putInt("errorCode", e.getErrorCode());
                        }
                    } finally {
                        obtainMessage.obj = C1844ba.this.f24336b;
                        bundle.putParcelable("result", truckRouteRestult);
                        obtainMessage.setData(bundle);
                        C1844ba.this.f24339e.sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            C2007j.m16371a(th, "RouteSearch", "calculateTruckRouteAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public void calculateWalkRouteAsyn(final RouteSearch.WalkRouteQuery walkRouteQuery) {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.ba.1
                static {
                    Covode.recordClassIndex(5456);
                }

                @Override // java.lang.Runnable
                public void run() {
                    Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                    obtainMessage.what = 102;
                    obtainMessage.arg1 = 1;
                    Bundle bundle = new Bundle();
                    WalkRouteResult walkRouteResult = null;
                    try {
                        try {
                            walkRouteResult = C1844ba.this.calculateWalkRoute(walkRouteQuery);
                            bundle.putInt("errorCode", 1000);
                        } catch (AMapException e) {
                            bundle.putInt("errorCode", e.getErrorCode());
                        }
                    } finally {
                        obtainMessage.obj = C1844ba.this.f24335a;
                        bundle.putParcelable("result", walkRouteResult);
                        obtainMessage.setData(bundle);
                        C1844ba.this.f24339e.sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            C2007j.m16371a(th, "RouteSearch", "calculateWalkRouteAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public BusRouteResult calculateBusRoute(RouteSearch.BusRouteQuery busRouteQuery) {
        try {
            C2015r.m16283a(this.f24338d);
            if (busRouteQuery != null) {
                if (m16993a(busRouteQuery.getFromAndTo())) {
                    RouteSearch.BusRouteQuery m25290clone = busRouteQuery.m25290clone();
                    BusRouteResult m17087c = new C1904c(this.f24338d, m25290clone).m17087c();
                    if (m17087c != null) {
                        m17087c.setBusQuery(m25290clone);
                    }
                    return m17087c;
                }
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            C2007j.m16371a(e, "RouteSearch", "calculateBusRoute");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public DriveRoutePlanResult calculateDrivePlan(RouteSearch.DrivePlanQuery drivePlanQuery) {
        try {
            C2015r.m16283a(this.f24338d);
            if (drivePlanQuery != null) {
                if (m16993a(drivePlanQuery.getFromAndTo())) {
                    DriveRoutePlanResult m17087c = new C2010m(this.f24338d, drivePlanQuery.m25291clone()).m17087c();
                    if (m17087c != null) {
                        m17087c.setDrivePlanQuery(drivePlanQuery);
                    }
                    return m17087c;
                }
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            C2007j.m16371a(e, "RouteSearch", "calculateDrivePlan");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public DriveRouteResult calculateDriveRoute(RouteSearch.DriveRouteQuery driveRouteQuery) {
        try {
            C2015r.m16283a(this.f24338d);
            if (driveRouteQuery != null) {
                if (m16993a(driveRouteQuery.getFromAndTo())) {
                    RouteSearch.DriveRouteQuery m25292clone = driveRouteQuery.m25292clone();
                    DriveRouteResult m17087c = new C2011n(this.f24338d, m25292clone).m17087c();
                    if (m17087c != null) {
                        m17087c.setDriveQuery(m25292clone);
                    }
                    return m17087c;
                }
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            C2007j.m16371a(e, "RouteSearch", "calculateDriveRoute");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public RideRouteResult calculateRideRoute(RouteSearch.RideRouteQuery rideRouteQuery) {
        try {
            C2015r.m16283a(this.f24338d);
            if (rideRouteQuery != null) {
                if (m16993a(rideRouteQuery.getFromAndTo())) {
                    RouteSearch.RideRouteQuery m25294clone = rideRouteQuery.m25294clone();
                    RideRouteResult m17087c = new C1804ae(this.f24338d, m25294clone).m17087c();
                    if (m17087c != null) {
                        m17087c.setRideQuery(m25294clone);
                    }
                    return m17087c;
                }
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            C2007j.m16371a(e, "RouteSearch", "calculaterideRoute");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public TruckRouteRestult calculateTruckRoute(RouteSearch.TruckRouteQuery truckRouteQuery) {
        try {
            C2015r.m16283a(this.f24338d);
            if (truckRouteQuery != null) {
                if (m16993a(truckRouteQuery.getFromAndTo())) {
                    RouteSearch.TruckRouteQuery m25295clone = truckRouteQuery.m25295clone();
                    TruckRouteRestult m17087c = new C1811ak(this.f24338d, m25295clone).m17087c();
                    if (m17087c != null) {
                        m17087c.setTruckQuery(m25295clone);
                    }
                    return m17087c;
                }
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            C2007j.m16371a(e, "RouteSearch", "calculateDriveRoute");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IRouteSearch
    public WalkRouteResult calculateWalkRoute(RouteSearch.WalkRouteQuery walkRouteQuery) {
        try {
            C2015r.m16283a(this.f24338d);
            if (walkRouteQuery != null) {
                if (m16993a(walkRouteQuery.getFromAndTo())) {
                    RouteSearch.WalkRouteQuery m25296clone = walkRouteQuery.m25296clone();
                    WalkRouteResult m17087c = new C1812al(this.f24338d, m25296clone).m17087c();
                    if (m17087c != null) {
                        m17087c.setWalkQuery(m25296clone);
                    }
                    return m17087c;
                }
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            C2007j.m16371a(e, "RouteSearch", "calculateWalkRoute");
            throw e;
        }
    }
}
