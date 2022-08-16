package com.amap.api.services.interfaces;

import com.amap.api.services.route.BusRouteResult;
import com.amap.api.services.route.DriveRoutePlanResult;
import com.amap.api.services.route.DriveRouteResult;
import com.amap.api.services.route.RideRouteResult;
import com.amap.api.services.route.RouteSearch;
import com.amap.api.services.route.TruckRouteRestult;
import com.amap.api.services.route.WalkRouteResult;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface IRouteSearch {
    static {
        Covode.recordClassIndex(5725);
    }

    BusRouteResult calculateBusRoute(RouteSearch.BusRouteQuery busRouteQuery);

    void calculateBusRouteAsyn(RouteSearch.BusRouteQuery busRouteQuery);

    DriveRoutePlanResult calculateDrivePlan(RouteSearch.DrivePlanQuery drivePlanQuery);

    void calculateDrivePlanAsyn(RouteSearch.DrivePlanQuery drivePlanQuery);

    DriveRouteResult calculateDriveRoute(RouteSearch.DriveRouteQuery driveRouteQuery);

    void calculateDriveRouteAsyn(RouteSearch.DriveRouteQuery driveRouteQuery);

    RideRouteResult calculateRideRoute(RouteSearch.RideRouteQuery rideRouteQuery);

    void calculateRideRouteAsyn(RouteSearch.RideRouteQuery rideRouteQuery);

    TruckRouteRestult calculateTruckRoute(RouteSearch.TruckRouteQuery truckRouteQuery);

    void calculateTruckRouteAsyn(RouteSearch.TruckRouteQuery truckRouteQuery);

    WalkRouteResult calculateWalkRoute(RouteSearch.WalkRouteQuery walkRouteQuery);

    void calculateWalkRouteAsyn(RouteSearch.WalkRouteQuery walkRouteQuery);

    void setOnRoutePlanSearchListener(RouteSearch.OnRoutePlanSearchListener onRoutePlanSearchListener);

    void setOnTruckRouteSearchListener(RouteSearch.OnTruckRouteSearchListener onTruckRouteSearchListener);

    void setRouteSearchListener(RouteSearch.OnRouteSearchListener onRouteSearchListener);
}
