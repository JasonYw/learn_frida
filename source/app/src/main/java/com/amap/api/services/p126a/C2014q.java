package com.amap.api.services.p126a;

import android.text.TextUtils;
import com.amap.api.services.busline.BusLineItem;
import com.amap.api.services.busline.BusStationItem;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.core.SuggestionCity;
import com.amap.api.services.district.DistrictItem;
import com.amap.api.services.geocoder.AoiItem;
import com.amap.api.services.geocoder.BusinessArea;
import com.amap.api.services.geocoder.GeocodeAddress;
import com.amap.api.services.geocoder.RegeocodeAddress;
import com.amap.api.services.geocoder.RegeocodeRoad;
import com.amap.api.services.geocoder.StreetNumber;
import com.amap.api.services.help.Tip;
import com.amap.api.services.poisearch.IndoorData;
import com.amap.api.services.poisearch.Photo;
import com.amap.api.services.poisearch.PoiItemExtension;
import com.amap.api.services.poisearch.SubPoiItem;
import com.amap.api.services.road.Crossroad;
import com.amap.api.services.route.BusPath;
import com.amap.api.services.route.BusRouteResult;
import com.amap.api.services.route.BusStep;
import com.amap.api.services.route.DistanceItem;
import com.amap.api.services.route.DistanceResult;
import com.amap.api.services.route.District;
import com.amap.api.services.route.Doorway;
import com.amap.api.services.route.DrivePath;
import com.amap.api.services.route.DrivePlanPath;
import com.amap.api.services.route.DrivePlanStep;
import com.amap.api.services.route.DriveRoutePlanResult;
import com.amap.api.services.route.DriveRouteResult;
import com.amap.api.services.route.DriveStep;
import com.amap.api.services.route.Railway;
import com.amap.api.services.route.RailwaySpace;
import com.amap.api.services.route.RailwayStationItem;
import com.amap.api.services.route.RidePath;
import com.amap.api.services.route.RideRouteResult;
import com.amap.api.services.route.RideStep;
import com.amap.api.services.route.RouteBusLineItem;
import com.amap.api.services.route.RouteBusWalkItem;
import com.amap.api.services.route.RouteRailwayItem;
import com.amap.api.services.route.RouteSearchCity;
import com.amap.api.services.route.TMC;
import com.amap.api.services.route.TaxiItem;
import com.amap.api.services.route.TimeInfo;
import com.amap.api.services.route.TimeInfosElement;
import com.amap.api.services.route.TruckPath;
import com.amap.api.services.route.TruckRouteRestult;
import com.amap.api.services.route.TruckStep;
import com.amap.api.services.route.WalkPath;
import com.amap.api.services.route.WalkRouteResult;
import com.amap.api.services.route.WalkStep;
import com.amap.api.services.routepoisearch.RoutePOIItem;
import com.amap.api.services.traffic.TrafficStatusEvaluation;
import com.amap.api.services.traffic.TrafficStatusInfo;
import com.amap.api.services.traffic.TrafficStatusResult;
import com.amap.api.services.weather.LocalDayWeatherForecast;
import com.amap.api.services.weather.LocalWeatherForecast;
import com.amap.api.services.weather.LocalWeatherLive;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.commonsdk.internal.C33838c;
import com.umeng.commonsdk.vchannel.C33968a;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mipush.sdk.MiPushMessage;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.amap.api.services.a.q */
/* loaded from: classes19.dex */
public class C2014q {

    /* renamed from: a */
    public static String[] f24827a = {"010", "021", "022", "023", "1852", "1853"};

    /* renamed from: a */
    public static void m16341a(JSONArray jSONArray, ArrayList<DistrictItem> arrayList, DistrictItem districtItem) {
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(m16309k(optJSONObject));
            }
        }
        if (districtItem == null) {
            return;
        }
        districtItem.setSubDistrict(arrayList);
    }

    /* renamed from: a */
    public static void m16342a(JSONArray jSONArray, RegeocodeAddress regeocodeAddress) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Crossroad crossroad = new Crossroad();
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                crossroad.setId(m16338a(optJSONObject, C33968a.f42937f));
                crossroad.setDirection(m16338a(optJSONObject, "direction"));
                crossroad.setDistance(m16310k(m16338a(optJSONObject, "distance")));
                crossroad.setCenterPoint(m16331b(optJSONObject, "location"));
                crossroad.setFirstRoadId(m16338a(optJSONObject, "first_id"));
                crossroad.setFirstRoadName(m16338a(optJSONObject, "first_name"));
                crossroad.setSecondRoadId(m16338a(optJSONObject, "second_id"));
                crossroad.setSecondRoadName(m16338a(optJSONObject, "second_name"));
                arrayList.add(crossroad);
            }
        }
        regeocodeAddress.setCrossroads(arrayList);
    }

    /* renamed from: a */
    public static void m16339a(JSONObject jSONObject, RegeocodeAddress regeocodeAddress) {
        regeocodeAddress.setCountry(m16338a(jSONObject, "country"));
        regeocodeAddress.setProvince(m16338a(jSONObject, "province"));
        regeocodeAddress.setCity(m16338a(jSONObject, "city"));
        regeocodeAddress.setCityCode(m16338a(jSONObject, "citycode"));
        regeocodeAddress.setAdCode(m16338a(jSONObject, "adcode"));
        regeocodeAddress.setDistrict(m16338a(jSONObject, "district"));
        regeocodeAddress.setTownship(m16338a(jSONObject, "township"));
        regeocodeAddress.setNeighborhood(m16338a(jSONObject.optJSONObject("neighborhood"), "name"));
        regeocodeAddress.setBuilding(m16338a(jSONObject.optJSONObject("building"), "name"));
        StreetNumber streetNumber = new StreetNumber();
        JSONObject optJSONObject = jSONObject.optJSONObject("streetNumber");
        streetNumber.setStreet(m16338a(optJSONObject, "street"));
        streetNumber.setNumber(m16338a(optJSONObject, "number"));
        streetNumber.setLatLonPoint(m16331b(optJSONObject, "location"));
        streetNumber.setDirection(m16338a(optJSONObject, "direction"));
        streetNumber.setDistance(m16310k(m16338a(optJSONObject, "distance")));
        regeocodeAddress.setStreetNumber(streetNumber);
        regeocodeAddress.setBusinessAreas(m16303n(jSONObject));
        regeocodeAddress.setTowncode(m16338a(jSONObject, "towncode"));
        m16348a(regeocodeAddress);
    }

    /* renamed from: a */
    public static void m16347a(DriveStep driveStep, JSONObject jSONObject) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("cities");
            if (optJSONArray == null) {
                return;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                RouteSearchCity routeSearchCity = new RouteSearchCity();
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    routeSearchCity.setSearchCityName(m16338a(optJSONObject, "name"));
                    routeSearchCity.setSearchCitycode(m16338a(optJSONObject, "citycode"));
                    routeSearchCity.setSearchCityhAdCode(m16338a(optJSONObject, "adcode"));
                    m16346a(routeSearchCity, optJSONObject);
                    arrayList.add(routeSearchCity);
                }
            }
            driveStep.setRouteSearchCityList(arrayList);
        } catch (JSONException e) {
            C2007j.m16371a(e, "JSONHelper", "parseCrossCity");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    /* renamed from: a */
    public static void m16346a(RouteSearchCity routeSearchCity, JSONObject jSONObject) {
        if (!jSONObject.has("districts")) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("districts");
            if (optJSONArray == null) {
                routeSearchCity.setDistricts(arrayList);
                return;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                District district = new District();
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    district.setDistrictName(m16338a(optJSONObject, "name"));
                    district.setDistrictAdcode(m16338a(optJSONObject, "adcode"));
                    arrayList.add(district);
                }
            }
            routeSearchCity.setDistricts(arrayList);
        } catch (JSONException e) {
            C2007j.m16371a(e, "JSONHelper", "parseCrossDistricts");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    /* renamed from: a */
    public static void m16345a(TruckStep truckStep, JSONObject jSONObject) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("cities");
            if (optJSONArray == null) {
                return;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                RouteSearchCity routeSearchCity = new RouteSearchCity();
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    routeSearchCity.setSearchCityName(m16338a(optJSONObject, "name"));
                    routeSearchCity.setSearchCitycode(m16338a(optJSONObject, "citycode"));
                    routeSearchCity.setSearchCityhAdCode(m16338a(optJSONObject, "adcode"));
                    m16346a(routeSearchCity, optJSONObject);
                    arrayList.add(routeSearchCity);
                }
            }
            truckStep.setRouteSearchCityList(arrayList);
        } catch (JSONException e) {
            C2007j.m16371a(e, "JSONHelper", "parseCrossCity");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    static {
        Covode.recordClassIndex(5625);
    }

    /* renamed from: i */
    public static boolean m16314i(String str) {
        if (str != null && !str.equals("")) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public static RailwaySpace m16355D(JSONObject jSONObject) {
        return new RailwaySpace(m16338a(jSONObject, C2521l.LJIIJ), m16310k(m16338a(jSONObject, "cost")));
    }

    /* renamed from: f */
    public static ArrayList<LatLonPoint> m16320f(String str) {
        ArrayList<LatLonPoint> arrayList = new ArrayList<>();
        for (String str2 : str.split(";")) {
            arrayList.add(m16318g(str2));
        }
        return arrayList;
    }

    /* renamed from: h */
    public static boolean m16316h(String str) {
        if (str != null && !str.equals("") && !str.equals("0")) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static Doorway m16295r(JSONObject jSONObject) {
        Doorway doorway = new Doorway();
        doorway.setName(m16338a(jSONObject, "name"));
        doorway.setLatLonPoint(m16331b(jSONObject, "location"));
        return doorway;
    }

    /* renamed from: A */
    public static List<RailwayStationItem> m16358A(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("via_stops");
        if (optJSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(m16285z(optJSONObject));
            }
        }
        return arrayList;
    }

    /* renamed from: B */
    public static List<Railway> m16357B(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("alters");
        if (optJSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                Railway railway = new Railway();
                railway.setID(m16338a(optJSONObject, C33968a.f42937f));
                railway.setName(m16338a(optJSONObject, "name"));
                arrayList.add(railway);
            }
        }
        return arrayList;
    }

    /* renamed from: C */
    public static List<RailwaySpace> m16356C(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("spaces");
        if (optJSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(m16355D(optJSONObject));
            }
        }
        return arrayList;
    }

    /* renamed from: F */
    public static List<Photo> m16353F(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        if (!jSONObject.has("photos")) {
            return arrayList;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("photos");
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            Photo photo = new Photo();
            photo.setTitle(m16338a(optJSONObject, "title"));
            photo.setUrl(m16338a(optJSONObject, PushConstants.WEB_URL));
            arrayList.add(photo);
        }
        return arrayList;
    }

    /* renamed from: G */
    public static RoutePOIItem m16352G(JSONObject jSONObject) {
        RoutePOIItem routePOIItem = new RoutePOIItem();
        routePOIItem.setID(m16338a(jSONObject, C33968a.f42937f));
        routePOIItem.setTitle(m16338a(jSONObject, "name"));
        routePOIItem.setPoint(m16331b(jSONObject, "location"));
        routePOIItem.setDistance(m16310k(m16338a(jSONObject, "distance")));
        routePOIItem.setDuration(m16310k(m16338a(jSONObject, "duration")));
        return routePOIItem;
    }

    /* renamed from: b */
    public static ArrayList<String> m16332b(JSONObject jSONObject) {
        ArrayList<String> arrayList = new ArrayList<>();
        JSONArray optJSONArray = jSONObject.optJSONArray("keywords");
        if (optJSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.optString(i));
        }
        return arrayList;
    }

    /* renamed from: c */
    public static ArrayList<PoiItem> m16328c(JSONObject jSONObject) {
        ArrayList<PoiItem> arrayList = new ArrayList<>();
        if (jSONObject == null) {
            return arrayList;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("pois");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(m16325d(optJSONObject));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static BusStationItem m16317g(JSONObject jSONObject) {
        BusStationItem busStationItem = new BusStationItem();
        busStationItem.setBusStationId(m16338a(jSONObject, C33968a.f42937f));
        busStationItem.setLatLonPoint(m16331b(jSONObject, "location"));
        busStationItem.setBusStationName(m16338a(jSONObject, "name"));
        return busStationItem;
    }

    /* renamed from: i */
    public static ArrayList<BusLineItem> m16313i(JSONObject jSONObject) {
        ArrayList<BusLineItem> arrayList = new ArrayList<>();
        JSONArray optJSONArray = jSONObject.optJSONArray("buslines");
        if (optJSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(m16311j(optJSONObject));
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static int m16312j(String str) {
        int i = 0;
        if (str != null && !str.equals("") && !str.equals("[]")) {
            try {
                i = Integer.parseInt(str);
                return i;
            } catch (NumberFormatException e) {
                C2007j.m16371a(e, "JSONHelper", "str2int");
            }
        }
        return i;
    }

    /* renamed from: k */
    public static float m16310k(String str) {
        float f = 0.0f;
        if (str != null && !str.equals("") && !str.equals("[]")) {
            try {
                f = Float.parseFloat(str);
                return f;
            } catch (NumberFormatException e) {
                C2007j.m16371a(e, "JSONHelper", "str2float");
            }
        }
        return f;
    }

    /* renamed from: l */
    public static double m16308l(String str) {
        double d = 0.0d;
        if (str != null && !str.equals("") && !str.equals("[]")) {
            try {
                d = Double.parseDouble(str);
                return d;
            } catch (NumberFormatException e) {
                C2007j.m16371a(e, "JSONHelper", "str2float");
            }
        }
        return d;
    }

    /* renamed from: m */
    public static long m16306m(String str) {
        long j = 0;
        if (str != null && !str.equals("") && !str.equals("[]")) {
            try {
                j = Long.parseLong(str);
                return j;
            } catch (NumberFormatException e) {
                C2007j.m16371a(e, "JSONHelper", "str2long");
            }
        }
        return j;
    }

    /* renamed from: n */
    public static List<BusinessArea> m16303n(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("businessAreas");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                BusinessArea businessArea = new BusinessArea();
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    businessArea.setCenterPoint(m16331b(optJSONObject, "location"));
                    businessArea.setName(m16338a(optJSONObject, "name"));
                    arrayList.add(businessArea);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    public static List<RouteBusLineItem> m16297q(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("buslines");
        if (optJSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(m16291t(optJSONObject));
            }
        }
        return arrayList;
    }

    /* renamed from: t */
    public static boolean m16292t(String str) {
        if (str != null && str.length() > 0) {
            for (String str2 : f24827a) {
                if (str.trim().equals(str2.trim())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: u */
    public static List<BusStationItem> m16290u(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("via_stops");
        if (optJSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(m16289v(optJSONObject));
            }
        }
        return arrayList;
    }

    /* renamed from: v */
    public static BusStationItem m16289v(JSONObject jSONObject) {
        BusStationItem busStationItem = new BusStationItem();
        busStationItem.setBusStationName(m16338a(jSONObject, "name"));
        busStationItem.setBusStationId(m16338a(jSONObject, C33968a.f42937f));
        busStationItem.setLatLonPoint(m16331b(jSONObject, "location"));
        return busStationItem;
    }

    /* renamed from: E */
    public static TaxiItem m16354E(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        TaxiItem taxiItem = new TaxiItem();
        taxiItem.setOrigin(m16331b(jSONObject, "origin"));
        taxiItem.setDestination(m16331b(jSONObject, "destination"));
        taxiItem.setDistance(m16310k(m16338a(jSONObject, "distance")));
        taxiItem.setDuration(m16310k(m16338a(jSONObject, "duration")));
        taxiItem.setSname(m16338a(jSONObject, "sname"));
        taxiItem.setTname(m16338a(jSONObject, "tname"));
        return taxiItem;
    }

    /* renamed from: I */
    public static TrafficStatusInfo m16350I(JSONObject jSONObject) {
        TrafficStatusInfo trafficStatusInfo = new TrafficStatusInfo();
        try {
            trafficStatusInfo.setName(m16338a(jSONObject, "name"));
            trafficStatusInfo.setStatus(m16338a(jSONObject, "status"));
            trafficStatusInfo.setAngle(m16312j(m16338a(jSONObject, "angle")));
            trafficStatusInfo.setSpeed(m16310k(m16338a(jSONObject, "speed")));
            trafficStatusInfo.setDirection(m16338a(jSONObject, "direction"));
            trafficStatusInfo.setLcodes(m16338a(jSONObject, "lcodes"));
            trafficStatusInfo.setCoordinates(m16327c(jSONObject, "polyline"));
            return trafficStatusInfo;
        } catch (JSONException e) {
            C2007j.m16371a(e, "JSONHelper", "parseRoadInfo");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    /* renamed from: a */
    public static BusRouteResult m16344a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("route")) {
                return null;
            }
            BusRouteResult busRouteResult = new BusRouteResult();
            JSONObject optJSONObject = jSONObject.optJSONObject("route");
            if (optJSONObject == null) {
                return busRouteResult;
            }
            busRouteResult.setStartPos(m16331b(optJSONObject, "origin"));
            busRouteResult.setTargetPos(m16331b(optJSONObject, "destination"));
            busRouteResult.setTaxiCost(m16310k(m16338a(optJSONObject, "taxi_cost")));
            if (!optJSONObject.has("transits")) {
                return busRouteResult;
            }
            JSONArray optJSONArray = optJSONObject.optJSONArray("transits");
            if (optJSONArray == null) {
                return busRouteResult;
            }
            busRouteResult.setPaths(m16343a(optJSONArray));
            return busRouteResult;
        } catch (JSONException unused) {
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    /* renamed from: e */
    public static ArrayList<BusStationItem> m16322e(JSONObject jSONObject) {
        ArrayList<BusStationItem> arrayList = new ArrayList<>();
        if (jSONObject == null) {
            return arrayList;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("busstops");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(m16319f(optJSONObject));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public static BusStationItem m16319f(JSONObject jSONObject) {
        BusStationItem m16317g = m16317g(jSONObject);
        if (m16317g == null) {
            return m16317g;
        }
        m16317g.setAdCode(m16338a(jSONObject, "adcode"));
        m16317g.setCityCode(m16338a(jSONObject, "citycode"));
        JSONArray optJSONArray = jSONObject.optJSONArray("buslines");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray == null) {
            m16317g.setBusLineItems(arrayList);
            return m16317g;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(m16315h(optJSONObject));
            }
        }
        m16317g.setBusLineItems(arrayList);
        return m16317g;
    }

    /* renamed from: g */
    public static LatLonPoint m16318g(String str) {
        if (str == null || str.equals("") || str.equals("[]")) {
            return null;
        }
        String[] split = str.split(",| ");
        if (split.length != 2) {
            return null;
        }
        return new LatLonPoint(Double.parseDouble(split[1]), Double.parseDouble(split[0]));
    }

    /* renamed from: h */
    public static BusLineItem m16315h(JSONObject jSONObject) {
        BusLineItem busLineItem = new BusLineItem();
        busLineItem.setBusLineId(m16338a(jSONObject, C33968a.f42937f));
        busLineItem.setBusLineType(m16338a(jSONObject, "type"));
        busLineItem.setBusLineName(m16338a(jSONObject, "name"));
        busLineItem.setDirectionsCoordinates(m16327c(jSONObject, "polyline"));
        busLineItem.setCityCode(m16338a(jSONObject, "citycode"));
        busLineItem.setOriginatingStation(m16338a(jSONObject, "start_stop"));
        busLineItem.setTerminalStation(m16338a(jSONObject, "end_stop"));
        return busLineItem;
    }

    /* renamed from: k */
    public static DistrictItem m16309k(JSONObject jSONObject) {
        String optString;
        DistrictItem districtItem = new DistrictItem();
        districtItem.setCitycode(m16338a(jSONObject, "citycode"));
        districtItem.setAdcode(m16338a(jSONObject, "adcode"));
        districtItem.setName(m16338a(jSONObject, "name"));
        districtItem.setLevel(m16338a(jSONObject, "level"));
        districtItem.setCenter(m16331b(jSONObject, "center"));
        if (jSONObject.has("polyline") && (optString = jSONObject.optString("polyline")) != null && optString.length() > 0) {
            districtItem.setDistrictBoundary(optString.split("\\|"));
        }
        m16341a(jSONObject.optJSONArray("districts"), new ArrayList(), districtItem);
        return districtItem;
    }

    /* renamed from: n */
    public static boolean m16304n(String str) {
        if (str == null || str.equals("") || str.equals("[]") || str.equals("0") || !str.equals("1")) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public static RouteBusWalkItem m16299p(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        RouteBusWalkItem routeBusWalkItem = new RouteBusWalkItem();
        routeBusWalkItem.setOrigin(m16331b(jSONObject, "origin"));
        routeBusWalkItem.setDestination(m16331b(jSONObject, "destination"));
        routeBusWalkItem.setDistance(m16310k(m16338a(jSONObject, "distance")));
        routeBusWalkItem.setDuration(m16306m(m16338a(jSONObject, "duration")));
        if (!jSONObject.has("steps")) {
            return routeBusWalkItem;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("steps");
        if (optJSONArray == null) {
            return routeBusWalkItem;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(m16293s(optJSONObject));
            }
        }
        routeBusWalkItem.setSteps(arrayList);
        return routeBusWalkItem;
    }

    /* renamed from: s */
    public static WalkStep m16293s(JSONObject jSONObject) {
        WalkStep walkStep = new WalkStep();
        walkStep.setInstruction(m16338a(jSONObject, "instruction"));
        walkStep.setOrientation(m16338a(jSONObject, "orientation"));
        walkStep.setRoad(m16338a(jSONObject, "road"));
        walkStep.setDistance(m16310k(m16338a(jSONObject, "distance")));
        walkStep.setDuration(m16310k(m16338a(jSONObject, "duration")));
        walkStep.setPolyline(m16327c(jSONObject, "polyline"));
        walkStep.setAction(m16338a(jSONObject, "action"));
        walkStep.setAssistantAction(m16338a(jSONObject, "assistant_action"));
        return walkStep;
    }

    /* renamed from: w */
    public static ArrayList<RoutePOIItem> m16288w(JSONObject jSONObject) {
        ArrayList<RoutePOIItem> arrayList = new ArrayList<>();
        if (jSONObject == null) {
            return arrayList;
        }
        Object opt = jSONObject.opt("pois");
        if (opt instanceof JSONArray) {
            JSONArray optJSONArray = jSONObject.optJSONArray("pois");
            if (optJSONArray != null && optJSONArray.length() != 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        arrayList.add(m16352G(optJSONObject));
                    }
                }
            } else {
                return arrayList;
            }
        } else if (opt instanceof JSONObject) {
            arrayList.add(m16352G(((JSONObject) opt).optJSONObject("poi")));
        }
        return arrayList;
    }

    /* renamed from: x */
    public static SubPoiItem m16287x(JSONObject jSONObject) {
        SubPoiItem subPoiItem = new SubPoiItem(m16338a(jSONObject, C33968a.f42937f), m16331b(jSONObject, "location"), m16338a(jSONObject, "name"), m16338a(jSONObject, "address"));
        subPoiItem.setSubName(m16338a(jSONObject, "sname"));
        subPoiItem.setSubTypeDes(m16338a(jSONObject, "subtype"));
        if (jSONObject.has("distance")) {
            String m16338a = m16338a(jSONObject, "distance");
            if (!m16314i(m16338a)) {
                try {
                    subPoiItem.setDistance((int) Float.parseFloat(m16338a));
                    return subPoiItem;
                } catch (NumberFormatException e) {
                    C2007j.m16371a(e, "JSONHelper", "parseSubPoiItem");
                    return subPoiItem;
                } catch (Exception e2) {
                    C2007j.m16371a(e2, "JSONHelper", "parseSubPoiItem");
                }
            }
        }
        return subPoiItem;
    }

    /* renamed from: y */
    public static RouteRailwayItem m16286y(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has(C33968a.f42937f) || !jSONObject.has("name")) {
            return null;
        }
        RouteRailwayItem routeRailwayItem = new RouteRailwayItem();
        routeRailwayItem.setID(m16338a(jSONObject, C33968a.f42937f));
        routeRailwayItem.setName(m16338a(jSONObject, "name"));
        routeRailwayItem.setTime(m16338a(jSONObject, "time"));
        routeRailwayItem.setTrip(m16338a(jSONObject, "trip"));
        routeRailwayItem.setDistance(m16310k(m16338a(jSONObject, "distance")));
        routeRailwayItem.setType(m16338a(jSONObject, "type"));
        routeRailwayItem.setDeparturestop(m16285z(jSONObject.optJSONObject("departure_stop")));
        routeRailwayItem.setArrivalstop(m16285z(jSONObject.optJSONObject("arrival_stop")));
        routeRailwayItem.setViastops(m16358A(jSONObject));
        routeRailwayItem.setAlters(m16357B(jSONObject));
        routeRailwayItem.setSpaces(m16356C(jSONObject));
        return routeRailwayItem;
    }

    /* renamed from: z */
    public static RailwayStationItem m16285z(JSONObject jSONObject) {
        RailwayStationItem railwayStationItem = new RailwayStationItem();
        railwayStationItem.setID(m16338a(jSONObject, C33968a.f42937f));
        railwayStationItem.setName(m16338a(jSONObject, "name"));
        railwayStationItem.setLocation(m16331b(jSONObject, "location"));
        railwayStationItem.setAdcode(m16338a(jSONObject, "adcode"));
        railwayStationItem.setTime(m16338a(jSONObject, "time"));
        railwayStationItem.setisStart(m16304n(m16338a(jSONObject, "start")));
        railwayStationItem.setisEnd(m16304n(m16338a(jSONObject, "end")));
        railwayStationItem.setWait(m16310k(m16338a(jSONObject, "wait")));
        return railwayStationItem;
    }

    /* renamed from: H */
    public static RidePath m16351H(JSONObject jSONObject) {
        RidePath ridePath = new RidePath();
        if (jSONObject == null) {
            return null;
        }
        try {
            ridePath.setDistance(m16310k(m16338a(jSONObject, "distance")));
            ridePath.setDuration(m16306m(m16338a(jSONObject, "duration")));
            if (jSONObject.has("steps")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("steps");
                ArrayList arrayList = new ArrayList();
                if (optJSONArray == null) {
                    return null;
                }
                for (int i = 0; i < optJSONArray.length(); i++) {
                    RideStep rideStep = new RideStep();
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        rideStep.setInstruction(m16338a(optJSONObject, "instruction"));
                        rideStep.setOrientation(m16338a(optJSONObject, "orientation"));
                        rideStep.setRoad(m16338a(optJSONObject, "road"));
                        rideStep.setDistance(m16310k(m16338a(optJSONObject, "distance")));
                        rideStep.setDuration(m16310k(m16338a(optJSONObject, "duration")));
                        rideStep.setPolyline(m16327c(optJSONObject, "polyline"));
                        rideStep.setAction(m16338a(optJSONObject, "action"));
                        rideStep.setAssistantAction(m16338a(optJSONObject, "assistant_action"));
                        arrayList.add(rideStep);
                    }
                }
                ridePath.setSteps(arrayList);
            }
            return ridePath;
        } catch (JSONException e) {
            C2007j.m16371a(e, "JSONHelper", "parseRidePath");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    /* renamed from: a */
    public static ArrayList<SuggestionCity> m16340a(JSONObject jSONObject) {
        ArrayList<SuggestionCity> arrayList = new ArrayList<>();
        if (!jSONObject.has("cities")) {
            return arrayList;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("cities");
        if (optJSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(new SuggestionCity(m16338a(optJSONObject, "name"), m16338a(optJSONObject, "citycode"), m16338a(optJSONObject, "adcode"), m16312j(m16338a(optJSONObject, "num"))));
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static LocalWeatherLive m16326d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("lives")) {
                return null;
            }
            LocalWeatherLive localWeatherLive = new LocalWeatherLive();
            JSONArray optJSONArray = jSONObject.optJSONArray("lives");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(0);
                if (optJSONObject == null) {
                    return localWeatherLive;
                }
                localWeatherLive.setAdCode(m16338a(optJSONObject, "adcode"));
                localWeatherLive.setProvince(m16338a(optJSONObject, "province"));
                localWeatherLive.setCity(m16338a(optJSONObject, "city"));
                localWeatherLive.setWeather(m16338a(optJSONObject, "weather"));
                localWeatherLive.setTemperature(m16338a(optJSONObject, "temperature"));
                localWeatherLive.setWindDirection(m16338a(optJSONObject, "winddirection"));
                localWeatherLive.setWindPower(m16338a(optJSONObject, "windpower"));
                localWeatherLive.setHumidity(m16338a(optJSONObject, "humidity"));
                localWeatherLive.setReportTime(m16338a(optJSONObject, "reporttime"));
            }
            return localWeatherLive;
        } catch (JSONException e) {
            C2007j.m16371a(e, "JSONHelper", "WeatherForecastResult");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    /* renamed from: e */
    public static LocalWeatherForecast m16323e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("forecasts")) {
                return null;
            }
            LocalWeatherForecast localWeatherForecast = new LocalWeatherForecast();
            JSONArray jSONArray = jSONObject.getJSONArray("forecasts");
            if (jSONArray != null && jSONArray.length() > 0) {
                JSONObject optJSONObject = jSONArray.optJSONObject(0);
                if (optJSONObject == null) {
                    return localWeatherForecast;
                }
                localWeatherForecast.setCity(m16338a(optJSONObject, "city"));
                localWeatherForecast.setAdCode(m16338a(optJSONObject, "adcode"));
                localWeatherForecast.setProvince(m16338a(optJSONObject, "province"));
                localWeatherForecast.setReportTime(m16338a(optJSONObject, "reporttime"));
                if (!optJSONObject.has("casts")) {
                    return localWeatherForecast;
                }
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray = optJSONObject.optJSONArray("casts");
                if (optJSONArray == null || optJSONArray.length() <= 0) {
                    localWeatherForecast.setWeatherForecast(arrayList);
                    return localWeatherForecast;
                }
                for (int i = 0; i < optJSONArray.length(); i++) {
                    LocalDayWeatherForecast localDayWeatherForecast = new LocalDayWeatherForecast();
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    if (optJSONObject2 != null) {
                        localDayWeatherForecast.setDate(m16338a(optJSONObject2, "date"));
                        localDayWeatherForecast.setWeek(m16338a(optJSONObject2, "week"));
                        localDayWeatherForecast.setDayWeather(m16338a(optJSONObject2, "dayweather"));
                        localDayWeatherForecast.setNightWeather(m16338a(optJSONObject2, "nightweather"));
                        localDayWeatherForecast.setDayTemp(m16338a(optJSONObject2, "daytemp"));
                        localDayWeatherForecast.setNightTemp(m16338a(optJSONObject2, "nighttemp"));
                        localDayWeatherForecast.setDayWindDirection(m16338a(optJSONObject2, "daywind"));
                        localDayWeatherForecast.setNightWindDirection(m16338a(optJSONObject2, "nightwind"));
                        localDayWeatherForecast.setDayWindPower(m16338a(optJSONObject2, "daypower"));
                        localDayWeatherForecast.setNightWindPower(m16338a(optJSONObject2, "nightpower"));
                        arrayList.add(localDayWeatherForecast);
                    }
                }
                localWeatherForecast.setWeatherForecast(arrayList);
                return localWeatherForecast;
            }
            return localWeatherForecast;
        } catch (JSONException e) {
            C2007j.m16371a(e, "JSONHelper", "WeatherForecastResult");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    /* renamed from: j */
    public static BusLineItem m16311j(JSONObject jSONObject) {
        BusLineItem m16315h = m16315h(jSONObject);
        if (m16315h == null) {
            return m16315h;
        }
        m16315h.setFirstBusTime(C2007j.m16366c(m16338a(jSONObject, "start_time")));
        m16315h.setLastBusTime(C2007j.m16366c(m16338a(jSONObject, "end_time")));
        m16315h.setBusCompany(m16338a(jSONObject, "company"));
        m16315h.setDistance(m16310k(m16338a(jSONObject, "distance")));
        m16315h.setBasicPrice(m16310k(m16338a(jSONObject, "basic_price")));
        m16315h.setTotalPrice(m16310k(m16338a(jSONObject, "total_price")));
        m16315h.setBounds(m16327c(jSONObject, "bounds"));
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("busstops");
        if (optJSONArray == null) {
            m16315h.setBusStations(arrayList);
            return m16315h;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(m16317g(optJSONObject));
            }
        }
        m16315h.setBusStations(arrayList);
        return m16315h;
    }

    /* renamed from: l */
    public static ArrayList<GeocodeAddress> m16307l(JSONObject jSONObject) {
        ArrayList<GeocodeAddress> arrayList = new ArrayList<>();
        if (jSONObject == null) {
            return arrayList;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("geocodes");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    GeocodeAddress geocodeAddress = new GeocodeAddress();
                    geocodeAddress.setFormatAddress(m16338a(optJSONObject, "formatted_address"));
                    geocodeAddress.setProvince(m16338a(optJSONObject, "province"));
                    geocodeAddress.setCity(m16338a(optJSONObject, "city"));
                    geocodeAddress.setDistrict(m16338a(optJSONObject, "district"));
                    geocodeAddress.setTownship(m16338a(optJSONObject, "township"));
                    geocodeAddress.setNeighborhood(m16338a(optJSONObject.optJSONObject("neighborhood"), "name"));
                    geocodeAddress.setBuilding(m16338a(optJSONObject.optJSONObject("building"), "name"));
                    geocodeAddress.setAdcode(m16338a(optJSONObject, "adcode"));
                    geocodeAddress.setLatLonPoint(m16331b(optJSONObject, "location"));
                    geocodeAddress.setLevel(m16338a(optJSONObject, "level"));
                    arrayList.add(geocodeAddress);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public static ArrayList<Tip> m16305m(JSONObject jSONObject) {
        ArrayList<Tip> arrayList = new ArrayList<>();
        JSONArray optJSONArray = jSONObject.optJSONArray("tips");
        if (optJSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            Tip tip = new Tip();
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                tip.setName(m16338a(optJSONObject, "name"));
                tip.setDistrict(m16338a(optJSONObject, "district"));
                tip.setAdcode(m16338a(optJSONObject, "adcode"));
                tip.setID(m16338a(optJSONObject, C33968a.f42937f));
                tip.setAddress(m16338a(optJSONObject, "address"));
                tip.setTypeCode(m16338a(optJSONObject, "typecode"));
                String m16338a = m16338a(optJSONObject, "location");
                if (!TextUtils.isEmpty(m16338a)) {
                    String[] split = m16338a.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    if (split.length == 2) {
                        tip.setPostion(new LatLonPoint(Double.parseDouble(split[1]), Double.parseDouble(split[0])));
                    }
                }
                arrayList.add(tip);
            }
        }
        return arrayList;
    }

    /* renamed from: o */
    public static BusStep m16301o(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        BusStep busStep = new BusStep();
        JSONObject optJSONObject = jSONObject.optJSONObject("walking");
        if (optJSONObject != null) {
            busStep.setWalk(m16299p(optJSONObject));
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("bus");
        if (optJSONObject2 != null) {
            busStep.setBusLines(m16297q(optJSONObject2));
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("entrance");
        if (optJSONObject3 != null) {
            busStep.setEntrance(m16295r(optJSONObject3));
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("exit");
        if (optJSONObject4 != null) {
            busStep.setExit(m16295r(optJSONObject4));
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("railway");
        if (optJSONObject5 != null) {
            busStep.setRailway(m16286y(optJSONObject5));
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject("taxi");
        if (optJSONObject6 != null) {
            busStep.setTaxi(m16354E(optJSONObject6));
        }
        if ((busStep.getWalk() == null || busStep.getWalk().getSteps().size() == 0) && busStep.getBusLines().size() == 0 && busStep.getRailway() == null && busStep.getTaxi() == null) {
            return null;
        }
        return busStep;
    }

    /* renamed from: p */
    public static TrafficStatusResult m16300p(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("trafficinfo")) {
                return null;
            }
            TrafficStatusResult trafficStatusResult = new TrafficStatusResult();
            JSONObject optJSONObject = jSONObject.optJSONObject("trafficinfo");
            trafficStatusResult.setDescription(m16338a(optJSONObject, MiPushMessage.KEY_DESC));
            if (optJSONObject.has("evaluation")) {
                TrafficStatusEvaluation trafficStatusEvaluation = new TrafficStatusEvaluation();
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("evaluation");
                trafficStatusEvaluation.setExpedite(m16338a(optJSONObject2, "expedite"));
                trafficStatusEvaluation.setCongested(m16338a(optJSONObject2, "congested"));
                trafficStatusEvaluation.setBlocked(m16338a(optJSONObject2, "blocked"));
                trafficStatusEvaluation.setUnknown(m16338a(optJSONObject2, LoggerUtil.UNKNOWN));
                trafficStatusEvaluation.setStatus(m16338a(optJSONObject2, "status"));
                trafficStatusEvaluation.setDescription(m16338a(optJSONObject2, MiPushMessage.KEY_DESC));
                trafficStatusResult.setEvaluation(trafficStatusEvaluation);
            }
            if (!optJSONObject.has("roads")) {
                return trafficStatusResult;
            }
            ArrayList arrayList = new ArrayList();
            Object opt = optJSONObject.opt("roads");
            if (opt == null) {
                trafficStatusResult.setRoads(arrayList);
                return trafficStatusResult;
            }
            if (opt instanceof JSONArray) {
                JSONArray optJSONArray = optJSONObject.optJSONArray("roads");
                for (int i = 0; i < optJSONArray.length(); i++) {
                    TrafficStatusInfo m16350I = m16350I(optJSONArray.optJSONObject(i));
                    if (m16350I != null) {
                        arrayList.add(m16350I);
                    }
                }
            }
            trafficStatusResult.setRoads(arrayList);
            return trafficStatusResult;
        } catch (JSONException e) {
            C2007j.m16371a(e, "JSONHelper", "parseRideRoute");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    /* renamed from: q */
    public static DistanceResult m16298q(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("results")) {
                return null;
            }
            DistanceResult distanceResult = new DistanceResult();
            JSONArray optJSONArray = jSONObject.optJSONArray("results");
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                DistanceItem distanceItem = new DistanceItem();
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                distanceItem.setOriginId(m16312j(m16338a(jSONObject2, "origin_id")));
                distanceItem.setDestId(m16312j(m16338a(jSONObject2, "dest_id")));
                distanceItem.setDistance(m16310k(m16338a(jSONObject2, "distance")));
                distanceItem.setDuration(m16310k(m16338a(jSONObject2, "duration")));
                String m16338a = m16338a(jSONObject2, C33838c.f42636f);
                if (!TextUtils.isEmpty(m16338a)) {
                    distanceItem.setErrorInfo(m16338a);
                    distanceItem.setErrorCode(m16312j(m16338a(jSONObject2, C2521l.LJIIJ)));
                }
                arrayList.add(distanceItem);
            }
            distanceResult.setDistanceResults(arrayList);
            return distanceResult;
        } catch (JSONException e) {
            C2007j.m16371a(e, "JSONHelper", "parseRouteDistance");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    /* renamed from: t */
    public static RouteBusLineItem m16291t(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        RouteBusLineItem routeBusLineItem = new RouteBusLineItem();
        routeBusLineItem.setDepartureBusStation(m16289v(jSONObject.optJSONObject("departure_stop")));
        routeBusLineItem.setArrivalBusStation(m16289v(jSONObject.optJSONObject("arrival_stop")));
        routeBusLineItem.setBusLineName(m16338a(jSONObject, "name"));
        routeBusLineItem.setBusLineId(m16338a(jSONObject, C33968a.f42937f));
        routeBusLineItem.setBusLineType(m16338a(jSONObject, "type"));
        routeBusLineItem.setDistance(m16310k(m16338a(jSONObject, "distance")));
        routeBusLineItem.setDuration(m16310k(m16338a(jSONObject, "duration")));
        routeBusLineItem.setPolyline(m16327c(jSONObject, "polyline"));
        routeBusLineItem.setFirstBusTime(C2007j.m16366c(m16338a(jSONObject, "start_time")));
        routeBusLineItem.setLastBusTime(C2007j.m16366c(m16338a(jSONObject, "end_time")));
        routeBusLineItem.setPassStationNum(m16312j(m16338a(jSONObject, "via_num")));
        routeBusLineItem.setPassStations(m16290u(jSONObject));
        return routeBusLineItem;
    }

    /* renamed from: b */
    public static DriveRouteResult m16334b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("route")) {
                return null;
            }
            DriveRouteResult driveRouteResult = new DriveRouteResult();
            JSONObject optJSONObject = jSONObject.optJSONObject("route");
            if (optJSONObject == null) {
                return driveRouteResult;
            }
            driveRouteResult.setStartPos(m16331b(optJSONObject, "origin"));
            driveRouteResult.setTargetPos(m16331b(optJSONObject, "destination"));
            driveRouteResult.setTaxiCost(m16310k(m16338a(optJSONObject, "taxi_cost")));
            if (!optJSONObject.has("paths")) {
                return driveRouteResult;
            }
            JSONArray optJSONArray = optJSONObject.optJSONArray("paths");
            if (optJSONArray == null) {
                return driveRouteResult;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                DrivePath drivePath = new DrivePath();
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (optJSONObject2 != null) {
                    drivePath.setDistance(m16310k(m16338a(optJSONObject2, "distance")));
                    drivePath.setDuration(m16306m(m16338a(optJSONObject2, "duration")));
                    drivePath.setStrategy(m16338a(optJSONObject2, "strategy"));
                    drivePath.setTolls(m16310k(m16338a(optJSONObject2, "tolls")));
                    drivePath.setTollDistance(m16310k(m16338a(optJSONObject2, "toll_distance")));
                    drivePath.setTotalTrafficlights(m16312j(m16338a(optJSONObject2, "traffic_lights")));
                    drivePath.setRestriction(m16312j(m16338a(optJSONObject2, "restriction")));
                    JSONArray optJSONArray2 = optJSONObject2.optJSONArray("steps");
                    if (optJSONArray2 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                            DriveStep driveStep = new DriveStep();
                            JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i2);
                            if (optJSONObject3 != null) {
                                driveStep.setInstruction(m16338a(optJSONObject3, "instruction"));
                                driveStep.setOrientation(m16338a(optJSONObject3, "orientation"));
                                driveStep.setRoad(m16338a(optJSONObject3, "road"));
                                driveStep.setDistance(m16310k(m16338a(optJSONObject3, "distance")));
                                driveStep.setTolls(m16310k(m16338a(optJSONObject3, "tolls")));
                                driveStep.setTollDistance(m16310k(m16338a(optJSONObject3, "toll_distance")));
                                driveStep.setTollRoad(m16338a(optJSONObject3, "toll_road"));
                                driveStep.setDuration(m16310k(m16338a(optJSONObject3, "duration")));
                                driveStep.setPolyline(m16327c(optJSONObject3, "polyline"));
                                driveStep.setAction(m16338a(optJSONObject3, "action"));
                                driveStep.setAssistantAction(m16338a(optJSONObject3, "assistant_action"));
                                m16347a(driveStep, optJSONObject3);
                                m16336b(driveStep, optJSONObject3);
                                arrayList2.add(driveStep);
                            }
                        }
                        drivePath.setSteps(arrayList2);
                        arrayList.add(drivePath);
                    }
                }
            }
            driveRouteResult.setPaths(arrayList);
            return driveRouteResult;
        } catch (JSONException e) {
            C2007j.m16371a(e, "JSONHelper", "parseDriveRoute");
            throw new AMapException("协议解析错误 - ProtocolException");
        } catch (Throwable th) {
            C2007j.m16371a(th, "JSONHelper", "parseDriveRouteThrowable");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    /* renamed from: c */
    public static WalkRouteResult m16330c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("route")) {
                return null;
            }
            WalkRouteResult walkRouteResult = new WalkRouteResult();
            JSONObject optJSONObject = jSONObject.optJSONObject("route");
            walkRouteResult.setStartPos(m16331b(optJSONObject, "origin"));
            walkRouteResult.setTargetPos(m16331b(optJSONObject, "destination"));
            if (!optJSONObject.has("paths")) {
                return walkRouteResult;
            }
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = optJSONObject.optJSONArray("paths");
            if (optJSONArray == null) {
                walkRouteResult.setPaths(arrayList);
                return walkRouteResult;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                WalkPath walkPath = new WalkPath();
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (optJSONObject2 != null) {
                    walkPath.setDistance(m16310k(m16338a(optJSONObject2, "distance")));
                    walkPath.setDuration(m16306m(m16338a(optJSONObject2, "duration")));
                    if (optJSONObject2.has("steps")) {
                        JSONArray optJSONArray2 = optJSONObject2.optJSONArray("steps");
                        ArrayList arrayList2 = new ArrayList();
                        if (optJSONArray2 != null) {
                            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                WalkStep walkStep = new WalkStep();
                                JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i2);
                                if (optJSONObject3 != null) {
                                    walkStep.setInstruction(m16338a(optJSONObject3, "instruction"));
                                    walkStep.setOrientation(m16338a(optJSONObject3, "orientation"));
                                    walkStep.setRoad(m16338a(optJSONObject3, "road"));
                                    walkStep.setDistance(m16310k(m16338a(optJSONObject3, "distance")));
                                    walkStep.setDuration(m16310k(m16338a(optJSONObject3, "duration")));
                                    walkStep.setPolyline(m16327c(optJSONObject3, "polyline"));
                                    walkStep.setAction(m16338a(optJSONObject3, "action"));
                                    walkStep.setAssistantAction(m16338a(optJSONObject3, "assistant_action"));
                                    arrayList2.add(walkStep);
                                }
                            }
                            walkPath.setSteps(arrayList2);
                        }
                    }
                    arrayList.add(walkPath);
                }
            }
            walkRouteResult.setPaths(arrayList);
            return walkRouteResult;
        } catch (JSONException e) {
            C2007j.m16371a(e, "JSONHelper", "parseWalkRoute");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    /* renamed from: d */
    public static PoiItem m16325d(JSONObject jSONObject) {
        PoiItem poiItem = new PoiItem(m16338a(jSONObject, C33968a.f42937f), m16331b(jSONObject, "location"), m16338a(jSONObject, "name"), m16338a(jSONObject, "address"));
        poiItem.setAdCode(m16338a(jSONObject, "adcode"));
        poiItem.setProvinceName(m16338a(jSONObject, "pname"));
        poiItem.setCityName(m16338a(jSONObject, "cityname"));
        poiItem.setAdName(m16338a(jSONObject, "adname"));
        poiItem.setCityCode(m16338a(jSONObject, "citycode"));
        poiItem.setProvinceCode(m16338a(jSONObject, "pcode"));
        poiItem.setDirection(m16338a(jSONObject, "direction"));
        if (jSONObject.has("distance")) {
            String m16338a = m16338a(jSONObject, "distance");
            if (!m16314i(m16338a)) {
                try {
                    poiItem.setDistance((int) Float.parseFloat(m16338a));
                } catch (NumberFormatException e) {
                    C2007j.m16371a(e, "JSONHelper", "parseBasePoi");
                } catch (Exception e2) {
                    C2007j.m16371a(e2, "JSONHelper", "parseBasePoi");
                }
            }
        }
        poiItem.setTel(m16338a(jSONObject, "tel"));
        poiItem.setTypeDes(m16338a(jSONObject, "type"));
        poiItem.setEnter(m16331b(jSONObject, "entr_location"));
        poiItem.setExit(m16331b(jSONObject, "exit_location"));
        poiItem.setWebsite(m16338a(jSONObject, "website"));
        poiItem.setPostcode(m16338a(jSONObject, "postcode"));
        poiItem.setBusinessArea(m16338a(jSONObject, "business_area"));
        poiItem.setEmail(m16338a(jSONObject, "email"));
        if (m16316h(m16338a(jSONObject, "indoor_map"))) {
            poiItem.setIndoorMap(false);
        } else {
            poiItem.setIndoorMap(true);
        }
        poiItem.setParkingType(m16338a(jSONObject, "parking_type"));
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has("children")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("children");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        arrayList.add(m16287x(optJSONObject));
                    }
                }
            }
            poiItem.setSubPois(arrayList);
        }
        poiItem.setIndoorDate(m16324d(jSONObject, "indoor_data"));
        poiItem.setPoiExtension(m16321e(jSONObject, "biz_ext"));
        poiItem.setTypeCode(m16338a(jSONObject, "typecode"));
        poiItem.setShopID(m16338a(jSONObject, "shopid"));
        m16349a(poiItem, jSONObject);
        return poiItem;
    }

    /* renamed from: o */
    public static RideRouteResult m16302o(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has(C2521l.LJIIL)) {
                return null;
            }
            RideRouteResult rideRouteResult = new RideRouteResult();
            JSONObject optJSONObject = jSONObject.optJSONObject(C2521l.LJIIL);
            rideRouteResult.setStartPos(m16331b(optJSONObject, "origin"));
            rideRouteResult.setTargetPos(m16331b(optJSONObject, "destination"));
            ArrayList arrayList = new ArrayList();
            Object opt = optJSONObject.opt("paths");
            if (opt == null) {
                rideRouteResult.setPaths(arrayList);
                return rideRouteResult;
            }
            if (opt instanceof JSONArray) {
                JSONArray optJSONArray = optJSONObject.optJSONArray("paths");
                for (int i = 0; i < optJSONArray.length(); i++) {
                    RidePath m16351H = m16351H(optJSONArray.optJSONObject(i));
                    if (m16351H != null) {
                        arrayList.add(m16351H);
                    }
                }
            } else if (opt instanceof JSONObject) {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("paths");
                if (!optJSONObject2.has("path")) {
                    rideRouteResult.setPaths(arrayList);
                    return rideRouteResult;
                }
                RidePath m16351H2 = m16351H(optJSONObject2.optJSONObject("path"));
                if (m16351H2 != null) {
                    arrayList.add(m16351H2);
                }
            }
            rideRouteResult.setPaths(arrayList);
            return rideRouteResult;
        } catch (JSONException e) {
            C2007j.m16371a(e, "JSONHelper", "parseRideRoute");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    /* renamed from: r */
    public static TruckRouteRestult m16296r(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has(C2521l.LJIIL)) {
                return null;
            }
            TruckRouteRestult truckRouteRestult = new TruckRouteRestult();
            JSONObject optJSONObject = jSONObject.optJSONObject(C2521l.LJIIL).optJSONObject("route");
            truckRouteRestult.setStartPos(m16331b(optJSONObject, "origin"));
            truckRouteRestult.setTargetPos(m16331b(optJSONObject, "destination"));
            if (!optJSONObject.has("paths")) {
                return truckRouteRestult;
            }
            JSONArray optJSONArray = optJSONObject.optJSONArray("paths");
            if (optJSONArray == null) {
                return truckRouteRestult;
            }
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                TruckPath truckPath = new TruckPath();
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                truckPath.setDistance(m16310k(m16338a(jSONObject2, "distance")));
                truckPath.setDuration(m16306m(m16338a(jSONObject2, "duration")));
                truckPath.setStrategy(m16338a(jSONObject2, "strategy"));
                truckPath.setTolls(m16310k(m16338a(jSONObject2, "tolls")));
                truckPath.setTollDistance(m16310k(m16338a(jSONObject2, "toll_distance")));
                truckPath.setTotalTrafficlights(m16312j(m16338a(jSONObject2, "traffic_lights")));
                truckPath.setRestriction(m16312j(m16338a(jSONObject2, "restriction")));
                JSONArray optJSONArray2 = jSONObject2.optJSONArray("steps");
                if (optJSONArray2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        TruckStep truckStep = new TruckStep();
                        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                        if (optJSONObject2 != null) {
                            truckStep.setInstruction(m16338a(optJSONObject2, "instruction"));
                            truckStep.setOrientation(m16338a(optJSONObject2, "orientation"));
                            truckStep.setRoad(m16338a(optJSONObject2, "road"));
                            truckStep.setDistance(m16310k(m16338a(optJSONObject2, "distance")));
                            truckStep.setTolls(m16310k(m16338a(optJSONObject2, "tolls")));
                            truckStep.setTollDistance(m16310k(m16338a(optJSONObject2, "toll_distance")));
                            truckStep.setTollRoad(m16338a(optJSONObject2, "toll_road"));
                            truckStep.setDuration(m16310k(m16338a(optJSONObject2, "duration")));
                            truckStep.setPolyline(m16327c(optJSONObject2, "polyline"));
                            truckStep.setAction(m16338a(optJSONObject2, "action"));
                            truckStep.setAssistantAction(m16338a(optJSONObject2, "assistant_action"));
                            m16345a(truckStep, optJSONObject2);
                            m16335b(truckStep, optJSONObject2);
                            arrayList2.add(truckStep);
                        }
                    }
                    truckPath.setSteps(arrayList2);
                    arrayList.add(truckPath);
                }
            }
            truckRouteRestult.setPaths(arrayList);
            return truckRouteRestult;
        } catch (JSONException e) {
            C2007j.m16371a(e, "JSONHelper", "parseTruckRoute");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    /* renamed from: a */
    public static List<BusPath> m16343a(JSONArray jSONArray) {
        BusStep m16301o;
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            BusPath busPath = new BusPath();
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                busPath.setCost(m16310k(m16338a(optJSONObject, "cost")));
                busPath.setDuration(m16306m(m16338a(optJSONObject, "duration")));
                busPath.setNightBus(m16304n(m16338a(optJSONObject, "nightflag")));
                busPath.setWalkDistance(m16310k(m16338a(optJSONObject, "walking_distance")));
                busPath.setDistance(m16310k(m16338a(optJSONObject, "distance")));
                JSONArray optJSONArray = optJSONObject.optJSONArray("segments");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    float f = 0.0f;
                    float f2 = 0.0f;
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                        if (optJSONObject2 != null && (m16301o = m16301o(optJSONObject2)) != null) {
                            arrayList2.add(m16301o);
                            if (m16301o.getWalk() != null) {
                                f2 += m16301o.getWalk().getDistance();
                            }
                            if (m16301o.getBusLines() != null && m16301o.getBusLines().size() > 0) {
                                f += m16301o.getBusLines().get(0).getDistance();
                            }
                        }
                    }
                    busPath.setSteps(arrayList2);
                    busPath.setBusDistance(f);
                    busPath.setWalkDistance(f2);
                    arrayList.add(busPath);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: s */
    public static DriveRoutePlanResult m16294s(String str) {
        int i;
        boolean z;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("errcode")) {
                jSONObject.optInt("errcode");
                jSONObject.optString("errmsg");
                jSONObject.optString("errdetail");
            }
            if (!jSONObject.has(C2521l.LJIIL)) {
                return null;
            }
            DriveRoutePlanResult driveRoutePlanResult = new DriveRoutePlanResult();
            JSONObject optJSONObject = jSONObject.optJSONObject(C2521l.LJIIL);
            if (optJSONObject == null) {
                return driveRoutePlanResult;
            }
            if (!optJSONObject.has("paths")) {
                return driveRoutePlanResult;
            }
            JSONArray optJSONArray = optJSONObject.optJSONArray("paths");
            if (optJSONArray == null) {
                return driveRoutePlanResult;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                DrivePlanPath drivePlanPath = new DrivePlanPath();
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                if (optJSONObject2 != null) {
                    drivePlanPath.setDistance(m16310k(m16338a(optJSONObject2, "distance")));
                    drivePlanPath.setTrafficLights(m16312j(m16338a(optJSONObject2, "traffic_lights")));
                    JSONArray optJSONArray2 = optJSONObject2.optJSONArray("steps");
                    if (optJSONArray2 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                            DrivePlanStep drivePlanStep = new DrivePlanStep();
                            JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i3);
                            if (optJSONObject3 != null) {
                                drivePlanStep.setAdCode(m16338a(optJSONObject3, "adcode"));
                                drivePlanStep.setRoad(m16338a(optJSONObject3, "road"));
                                drivePlanStep.setDistance(m16310k(m16338a(optJSONObject3, "distance")));
                                if (m16312j(m16338a(optJSONObject3, "toll")) == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                try {
                                    drivePlanStep.setToll(z);
                                    drivePlanStep.setPolyline(m16327c(optJSONObject3, "polyline"));
                                    arrayList2.add(drivePlanStep);
                                } catch (JSONException e) {
                                    e = e;
                                    C2007j.m16371a(e, "JSONHelper", "parseDriveRoute");
                                    throw new AMapException("协议解析错误 - ProtocolException");
                                } catch (Throwable th) {
                                    th = th;
                                    C2007j.m16371a(th, "JSONHelper", "parseDriveRouteThrowable");
                                    throw new AMapException("协议解析错误 - ProtocolException");
                                }
                            }
                        }
                        drivePlanPath.setSteps(arrayList2);
                        arrayList.add(drivePlanPath);
                    }
                }
            }
            driveRoutePlanResult.setPaths(arrayList);
            if (!optJSONObject.has("time_infos")) {
                return driveRoutePlanResult;
            }
            JSONArray optJSONArray3 = optJSONObject.optJSONArray("time_infos");
            if (optJSONArray3 == null) {
                return driveRoutePlanResult;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                TimeInfo timeInfo = new TimeInfo();
                JSONObject optJSONObject4 = optJSONArray3.optJSONObject(i4);
                if (optJSONObject4 != null) {
                    if (optJSONObject4.has("starttime")) {
                        timeInfo.setStartTime(m16306m(m16338a(optJSONObject4, "starttime")));
                        JSONArray optJSONArray4 = optJSONObject4.optJSONArray("elements");
                        if (optJSONArray4 != null) {
                            ArrayList arrayList4 = new ArrayList();
                            for (int i5 = 0; i5 < optJSONArray4.length(); i5++) {
                                TimeInfosElement timeInfosElement = new TimeInfosElement();
                                JSONObject optJSONObject5 = optJSONArray4.optJSONObject(i5);
                                if (optJSONObject5 != null) {
                                    timeInfosElement.setPathindex(m16312j(m16338a(optJSONObject5, "pathindex")));
                                    timeInfosElement.setDuration(m16310k(m16338a(optJSONObject5, "duration")));
                                    timeInfosElement.setTolls(m16310k(m16338a(optJSONObject5, "tolls")));
                                    int m16312j = m16312j(m16338a(optJSONObject5, "restriction"));
                                    if (m16312j != 2 && m16312j != -1) {
                                        i = 1;
                                    } else {
                                        i = 0;
                                    }
                                    timeInfosElement.setRestriction(i);
                                    JSONArray optJSONArray5 = optJSONObject5.optJSONArray("tmcs");
                                    if (optJSONArray5 != null) {
                                        ArrayList arrayList5 = new ArrayList();
                                        for (int i6 = 0; i6 < optJSONArray5.length(); i6++) {
                                            TMC tmc = new TMC();
                                            JSONObject optJSONObject6 = optJSONArray5.optJSONObject(i6);
                                            if (optJSONObject6 != null) {
                                                tmc.setStatus(m16338a(optJSONObject6, "status"));
                                                tmc.setDistance(m16312j(m16338a(optJSONObject6, "distance")));
                                                tmc.setPolyline(m16327c(optJSONObject6, "polyline"));
                                                arrayList5.add(tmc);
                                            }
                                        }
                                        timeInfosElement.setTMCs(arrayList5);
                                        arrayList4.add(timeInfosElement);
                                    }
                                }
                            }
                            timeInfo.setElements(arrayList4);
                            arrayList3.add(timeInfo);
                        }
                    } else {
                        return driveRoutePlanResult;
                    }
                }
            }
            driveRoutePlanResult.setTimeInfos(arrayList3);
            return driveRoutePlanResult;
        } catch (JSONException e2) {
            e = e2;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static void m16348a(RegeocodeAddress regeocodeAddress) {
        if ((regeocodeAddress.getCity() == null || regeocodeAddress.getCity().length() <= 0) && m16292t(regeocodeAddress.getCityCode())) {
            regeocodeAddress.setCity(regeocodeAddress.getProvince());
        }
    }

    /* renamed from: a */
    public static String m16338a(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str) || jSONObject.optString(str).equals("[]")) {
            return "";
        }
        return jSONObject.optString(str).trim();
    }

    /* renamed from: b */
    public static LatLonPoint m16331b(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        return m16318g(jSONObject.optString(str));
    }

    /* renamed from: c */
    public static ArrayList<LatLonPoint> m16327c(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return m16320f(jSONObject.optString(str));
        }
        return null;
    }

    /* renamed from: a */
    public static void m16349a(PoiItem poiItem, JSONObject jSONObject) {
        List<Photo> m16353F = m16353F(jSONObject.optJSONObject("deep_info"));
        if (m16353F.size() == 0) {
            m16353F = m16353F(jSONObject);
        }
        poiItem.setPhotos(m16353F);
    }

    /* renamed from: d */
    public static IndoorData m16324d(JSONObject jSONObject, String str) {
        int i;
        String str2;
        JSONObject optJSONObject;
        String str3 = "";
        if (jSONObject.has(str) && (optJSONObject = jSONObject.optJSONObject(str)) != null && optJSONObject.has("cpid") && optJSONObject.has("floor")) {
            str3 = m16338a(optJSONObject, "cpid");
            i = m16312j(m16338a(optJSONObject, "floor"));
            str2 = m16338a(optJSONObject, "truefloor");
        } else {
            i = 0;
            str2 = str3;
        }
        return new IndoorData(str3, i, str2);
    }

    /* renamed from: e */
    public static PoiItemExtension m16321e(JSONObject jSONObject, String str) {
        String str2;
        JSONObject optJSONObject;
        String str3 = "";
        if (jSONObject.has(str) && (optJSONObject = jSONObject.optJSONObject(str)) != null) {
            str3 = m16338a(optJSONObject, "open_time");
            str2 = m16338a(optJSONObject, "rating");
        } else {
            str2 = str3;
        }
        return new PoiItemExtension(str3, str2);
    }

    /* renamed from: b */
    public static void m16336b(DriveStep driveStep, JSONObject jSONObject) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("tmcs");
            if (optJSONArray == null) {
                return;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                TMC tmc = new TMC();
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    tmc.setDistance(m16312j(m16338a(optJSONObject, "distance")));
                    tmc.setStatus(m16338a(optJSONObject, "status"));
                    tmc.setPolyline(m16327c(optJSONObject, "polyline"));
                    arrayList.add(tmc);
                }
            }
            driveStep.setTMCs(arrayList);
        } catch (JSONException e) {
            C2007j.m16371a(e, "JSONHelper", "parseTMCs");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    /* renamed from: c */
    public static void m16329c(JSONArray jSONArray, RegeocodeAddress regeocodeAddress) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            AoiItem aoiItem = new AoiItem();
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                aoiItem.setId(m16338a(optJSONObject, C33968a.f42937f));
                aoiItem.setName(m16338a(optJSONObject, "name"));
                aoiItem.setAdcode(m16338a(optJSONObject, "adcode"));
                aoiItem.setLocation(m16331b(optJSONObject, "location"));
                aoiItem.setArea(Float.valueOf(m16310k(m16338a(optJSONObject, "area"))));
                arrayList.add(aoiItem);
            }
        }
        regeocodeAddress.setAois(arrayList);
    }

    /* renamed from: b */
    public static void m16335b(TruckStep truckStep, JSONObject jSONObject) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("tmcs");
            if (optJSONArray == null) {
                return;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                TMC tmc = new TMC();
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    tmc.setDistance(m16312j(m16338a(optJSONObject, "distance")));
                    tmc.setStatus(m16338a(optJSONObject, "status"));
                    tmc.setPolyline(m16327c(optJSONObject, "polyline"));
                    arrayList.add(tmc);
                }
            }
            truckStep.setTMCs(arrayList);
        } catch (JSONException e) {
            C2007j.m16371a(e, "JSONHelper", "parseTMCs");
            throw new AMapException("协议解析错误 - ProtocolException");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<com.amap.api.services.nearby.NearbyInfo> m16337a(org.json.JSONObject r14, boolean r15) {
        /*
            java.lang.String r0 = "datas"
            org.json.JSONArray r13 = r14.optJSONArray(r0)
            if (r13 == 0) goto L80
            int r0 = r13.length()
            if (r0 == 0) goto L80
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            int r11 = r13.length()
            r14 = 0
            r10 = 0
        L19:
            if (r10 >= r11) goto L7f
            org.json.JSONObject r2 = r13.optJSONObject(r10)
            java.lang.String r0 = "userid"
            java.lang.String r9 = m16338a(r2, r0)
            java.lang.String r0 = "location"
            java.lang.String r1 = m16338a(r2, r0)
            r4 = 0
            if (r1 == 0) goto L7c
            java.lang.String r0 = ","
            java.lang.String[] r3 = r1.split(r0)
            int r1 = r3.length
            r0 = 2
            if (r1 != r0) goto L7c
            r0 = r3[r14]
            double r6 = m16308l(r0)
            r0 = 1
            r0 = r3[r0]
            double r4 = m16308l(r0)
        L46:
            java.lang.String r0 = "distance"
            java.lang.String r1 = m16338a(r2, r0)
            java.lang.String r0 = "updatetime"
            java.lang.String r0 = m16338a(r2, r0)
            long r2 = m16306m(r0)
            int r8 = m16312j(r1)
            com.amap.api.services.core.LatLonPoint r1 = new com.amap.api.services.core.LatLonPoint
            r1.<init>(r4, r6)
            com.amap.api.services.nearby.NearbyInfo r0 = new com.amap.api.services.nearby.NearbyInfo
            r0.<init>()
            r0.setUserID(r9)
            r0.setTimeStamp(r2)
            r0.setPoint(r1)
            if (r15 == 0) goto L78
            r0.setDrivingDistance(r8)
        L72:
            r12.add(r0)
            int r10 = r10 + 1
            goto L19
        L78:
            r0.setDistance(r8)
            goto L72
        L7c:
            r6 = 0
            goto L46
        L7f:
            return r12
        L80:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.p126a.C2014q.m16337a(org.json.JSONObject, boolean):java.util.ArrayList");
    }

    /* renamed from: b */
    public static void m16333b(JSONArray jSONArray, RegeocodeAddress regeocodeAddress) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            RegeocodeRoad regeocodeRoad = new RegeocodeRoad();
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                regeocodeRoad.setId(m16338a(optJSONObject, C33968a.f42937f));
                regeocodeRoad.setName(m16338a(optJSONObject, "name"));
                regeocodeRoad.setLatLngPoint(m16331b(optJSONObject, "location"));
                regeocodeRoad.setDirection(m16338a(optJSONObject, "direction"));
                regeocodeRoad.setDistance(m16310k(m16338a(optJSONObject, "distance")));
                arrayList.add(regeocodeRoad);
            }
        }
        regeocodeAddress.setRoads(arrayList);
    }
}
