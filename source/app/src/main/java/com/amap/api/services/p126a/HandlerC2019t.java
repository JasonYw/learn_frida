package com.amap.api.services.p126a;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.view.MotionEventCompat;
import com.amap.api.services.busline.BusLineResult;
import com.amap.api.services.busline.BusLineSearch;
import com.amap.api.services.busline.BusStationResult;
import com.amap.api.services.busline.BusStationSearch;
import com.amap.api.services.cloud.CloudItemDetail;
import com.amap.api.services.cloud.CloudResult;
import com.amap.api.services.cloud.CloudSearch;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.district.DistrictResult;
import com.amap.api.services.district.DistrictSearch;
import com.amap.api.services.geocoder.GeocodeResult;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.amap.api.services.geocoder.RegeocodeResult;
import com.amap.api.services.help.Inputtips;
import com.amap.api.services.nearby.NearbySearch;
import com.amap.api.services.nearby.NearbySearchResult;
import com.amap.api.services.poisearch.PoiResult;
import com.amap.api.services.poisearch.PoiSearch;
import com.amap.api.services.route.BusRouteResult;
import com.amap.api.services.route.DistanceResult;
import com.amap.api.services.route.DistanceSearch;
import com.amap.api.services.route.DriveRoutePlanResult;
import com.amap.api.services.route.DriveRouteResult;
import com.amap.api.services.route.RideRouteResult;
import com.amap.api.services.route.RouteSearch;
import com.amap.api.services.route.TruckRouteRestult;
import com.amap.api.services.route.WalkRouteResult;
import com.amap.api.services.routepoisearch.RoutePOISearch;
import com.amap.api.services.routepoisearch.RoutePOISearchResult;
import com.amap.api.services.share.ShareSearch;
import com.amap.api.services.traffic.TrafficSearch;
import com.amap.api.services.traffic.TrafficStatusResult;
import com.amap.api.services.weather.LocalWeatherForecastResult;
import com.amap.api.services.weather.LocalWeatherLiveResult;
import com.amap.api.services.weather.WeatherSearch;
import com.bytedance.bdp.appbase.service.protocol.inner.InnerService;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.amap.api.services.a.t */
/* loaded from: classes19.dex */
public class HandlerC2019t extends Handler {

    /* renamed from: a */
    public static HandlerC2019t f24838a;

    /* renamed from: com.amap.api.services.a.t$a */
    /* loaded from: classes19.dex */
    public static class C2020a {

        /* renamed from: a */
        public BusLineResult f24839a;

        /* renamed from: b */
        public BusLineSearch.OnBusLineSearchListener f24840b;

        static {
            Covode.recordClassIndex(5631);
        }
    }

    /* renamed from: com.amap.api.services.a.t$b */
    /* loaded from: classes19.dex */
    public static class C2021b {

        /* renamed from: a */
        public BusStationResult f24841a;

        /* renamed from: b */
        public BusStationSearch.OnBusStationSearchListener f24842b;

        static {
            Covode.recordClassIndex(5632);
        }
    }

    /* renamed from: com.amap.api.services.a.t$c */
    /* loaded from: classes19.dex */
    public static class C2022c {

        /* renamed from: a */
        public CloudItemDetail f24843a;

        /* renamed from: b */
        public CloudSearch.OnCloudSearchListener f24844b;

        static {
            Covode.recordClassIndex(5633);
        }
    }

    /* renamed from: com.amap.api.services.a.t$d */
    /* loaded from: classes19.dex */
    public static class C2023d {

        /* renamed from: a */
        public CloudResult f24845a;

        /* renamed from: b */
        public CloudSearch.OnCloudSearchListener f24846b;

        static {
            Covode.recordClassIndex(5634);
        }
    }

    /* renamed from: com.amap.api.services.a.t$e */
    /* loaded from: classes19.dex */
    public static class C2024e {

        /* renamed from: a */
        public GeocodeResult f24847a;

        /* renamed from: b */
        public GeocodeSearch.OnGeocodeSearchListener f24848b;

        static {
            Covode.recordClassIndex(5635);
        }
    }

    /* renamed from: com.amap.api.services.a.t$f */
    /* loaded from: classes19.dex */
    public static class C2025f {

        /* renamed from: a */
        public List<NearbySearch.NearbyListener> f24849a;

        /* renamed from: b */
        public NearbySearchResult f24850b;

        static {
            Covode.recordClassIndex(5636);
        }
    }

    /* renamed from: com.amap.api.services.a.t$g */
    /* loaded from: classes19.dex */
    public static class C2026g {

        /* renamed from: a */
        public PoiItem f24851a;

        /* renamed from: b */
        public PoiSearch.OnPoiSearchListener f24852b;

        static {
            Covode.recordClassIndex(5637);
        }
    }

    /* renamed from: com.amap.api.services.a.t$h */
    /* loaded from: classes19.dex */
    public static class C2027h {

        /* renamed from: a */
        public PoiResult f24853a;

        /* renamed from: b */
        public PoiSearch.OnPoiSearchListener f24854b;

        static {
            Covode.recordClassIndex(5638);
        }
    }

    /* renamed from: com.amap.api.services.a.t$i */
    /* loaded from: classes19.dex */
    public static class C2028i {

        /* renamed from: a */
        public RegeocodeResult f24855a;

        /* renamed from: b */
        public GeocodeSearch.OnGeocodeSearchListener f24856b;

        static {
            Covode.recordClassIndex(5639);
        }
    }

    /* renamed from: com.amap.api.services.a.t$j */
    /* loaded from: classes19.dex */
    public static class C2029j {

        /* renamed from: a */
        public RoutePOISearchResult f24857a;

        /* renamed from: b */
        public RoutePOISearch.OnRoutePOISearchListener f24858b;

        static {
            Covode.recordClassIndex(5640);
        }
    }

    /* renamed from: com.amap.api.services.a.t$k */
    /* loaded from: classes19.dex */
    public static class C2030k {

        /* renamed from: a */
        public LocalWeatherForecastResult f24859a;

        /* renamed from: b */
        public WeatherSearch.OnWeatherSearchListener f24860b;

        static {
            Covode.recordClassIndex(5641);
        }
    }

    /* renamed from: com.amap.api.services.a.t$l */
    /* loaded from: classes19.dex */
    public static class C2031l {

        /* renamed from: a */
        public LocalWeatherLiveResult f24861a;

        /* renamed from: b */
        public WeatherSearch.OnWeatherSearchListener f24862b;

        static {
            Covode.recordClassIndex(5642);
        }
    }

    static {
        Covode.recordClassIndex(5630);
    }

    public HandlerC2019t() {
    }

    /* renamed from: a */
    public static synchronized HandlerC2019t m16280a() {
        HandlerC2019t handlerC2019t;
        synchronized (HandlerC2019t.class) {
            if (f24838a == null) {
                if (Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper()) {
                    f24838a = new HandlerC2019t();
                } else {
                    f24838a = new HandlerC2019t(Looper.getMainLooper());
                }
            }
            handlerC2019t = f24838a;
        }
        return handlerC2019t;
    }

    public HandlerC2019t(Looper looper) {
        super(looper);
    }

    /* renamed from: e */
    private void m16275e(Message message) {
        BusStationSearch.OnBusStationSearchListener onBusStationSearchListener;
        C2021b c2021b = (C2021b) message.obj;
        if (c2021b == null || (onBusStationSearchListener = c2021b.f24842b) == null) {
            return;
        }
        BusStationResult busStationResult = null;
        if (message.what == 1000) {
            busStationResult = c2021b.f24841a;
        }
        onBusStationSearchListener.onBusStationSearched(busStationResult, message.what);
    }

    /* renamed from: g */
    private void m16273g(Message message) {
        Inputtips.InputtipsListener inputtipsListener = (Inputtips.InputtipsListener) message.obj;
        if (inputtipsListener == null) {
            return;
        }
        ArrayList arrayList = null;
        if (message.what == 1000) {
            arrayList = message.getData().getParcelableArrayList("result");
        }
        inputtipsListener.onGetInputtips(arrayList, message.what);
    }

    /* renamed from: i */
    private void m16271i(Message message) {
        DistrictSearch.OnDistrictSearchListener onDistrictSearchListener = (DistrictSearch.OnDistrictSearchListener) message.obj;
        if (onDistrictSearchListener == null) {
            return;
        }
        onDistrictSearchListener.onDistrictSearched((DistrictResult) message.getData().getParcelable("result"));
    }

    /* renamed from: j */
    private void m16270j(Message message) {
        BusLineSearch.OnBusLineSearchListener onBusLineSearchListener;
        C2020a c2020a = (C2020a) message.obj;
        if (c2020a == null || (onBusLineSearchListener = c2020a.f24840b) == null) {
            return;
        }
        BusLineResult busLineResult = null;
        if (message.what == 1000) {
            busLineResult = c2020a.f24839a;
        }
        onBusLineSearchListener.onBusLineSearched(busLineResult, message.what);
    }

    /* renamed from: p */
    private void m16264p(Message message) {
        RoutePOISearch.OnRoutePOISearchListener onRoutePOISearchListener;
        Bundle data;
        C2029j c2029j = (C2029j) message.obj;
        if (c2029j != null && (onRoutePOISearchListener = c2029j.f24858b) != null && (data = message.getData()) != null) {
            onRoutePOISearchListener.onRoutePoiSearched(c2029j.f24857a, data.getInt("errorCode"));
        }
    }

    /* renamed from: b */
    private void m16278b(Message message) {
        List<NearbySearch.NearbyListener> list = (List) message.obj;
        if (list != null && list.size() != 0) {
            for (NearbySearch.NearbyListener nearbyListener : list) {
                nearbyListener.onNearbyInfoUploaded(message.what);
            }
        }
    }

    /* renamed from: c */
    private void m16277c(Message message) {
        List<NearbySearch.NearbyListener> list;
        C2025f c2025f = (C2025f) message.obj;
        if (c2025f != null && (list = c2025f.f24849a) != null && list.size() != 0) {
            NearbySearchResult nearbySearchResult = null;
            if (message.what == 1000) {
                nearbySearchResult = c2025f.f24850b;
            }
            for (NearbySearch.NearbyListener nearbyListener : list) {
                nearbyListener.onNearbyInfoSearched(nearbySearchResult, message.what);
            }
        }
    }

    /* renamed from: d */
    private void m16276d(Message message) {
        List<NearbySearch.NearbyListener> list = (List) message.obj;
        if (list != null && list.size() != 0) {
            for (NearbySearch.NearbyListener nearbyListener : list) {
                nearbyListener.onUserInfoCleared(message.what);
            }
        }
    }

    /* renamed from: h */
    private void m16272h(Message message) {
        C2024e c2024e;
        GeocodeSearch.OnGeocodeSearchListener onGeocodeSearchListener;
        GeocodeSearch.OnGeocodeSearchListener onGeocodeSearchListener2;
        if (message.what == 201) {
            C2028i c2028i = (C2028i) message.obj;
            if (c2028i == null || (onGeocodeSearchListener2 = c2028i.f24856b) == null) {
                return;
            }
            onGeocodeSearchListener2.onRegeocodeSearched(c2028i.f24855a, message.arg2);
        } else if (message.what != 200 || (c2024e = (C2024e) message.obj) == null || (onGeocodeSearchListener = c2024e.f24848b) == null) {
        } else {
            onGeocodeSearchListener.onGeocodeSearched(c2024e.f24847a, message.arg2);
        }
    }

    /* renamed from: l */
    private void m16268l(Message message) {
        Bundle data;
        RouteSearch.OnTruckRouteSearchListener onTruckRouteSearchListener = (RouteSearch.OnTruckRouteSearchListener) message.obj;
        if (onTruckRouteSearchListener != null && message.what == 104 && (data = message.getData()) != null) {
            onTruckRouteSearchListener.onTruckRouteSearched((TruckRouteRestult) message.getData().getParcelable("result"), data.getInt("errorCode"));
        }
    }

    /* renamed from: m */
    private void m16267m(Message message) {
        Bundle data;
        RouteSearch.OnRoutePlanSearchListener onRoutePlanSearchListener = (RouteSearch.OnRoutePlanSearchListener) message.obj;
        if (onRoutePlanSearchListener != null && message.what == 105 && (data = message.getData()) != null) {
            onRoutePlanSearchListener.onDriveRoutePlanSearched((DriveRoutePlanResult) message.getData().getParcelable("result"), data.getInt("errorCode"));
        }
    }

    /* renamed from: n */
    private void m16266n(Message message) {
        C2022c c2022c;
        if (message.what == 700) {
            C2023d c2023d = (C2023d) message.obj;
            if (c2023d == null) {
                return;
            }
            c2023d.f24846b.onCloudSearched(c2023d.f24845a, message.arg2);
        } else if (message.what != 701 || (c2022c = (C2022c) message.obj) == null) {
        } else {
            c2022c.f24844b.onCloudItemDetailSearched(c2022c.f24843a, message.arg2);
        }
    }

    /* renamed from: r */
    private void m16262r(Message message) {
        Bundle data;
        DistanceSearch.OnDistanceSearchListener onDistanceSearchListener = (DistanceSearch.OnDistanceSearchListener) message.obj;
        if (onDistanceSearchListener != null && message.what == 400 && (data = message.getData()) != null) {
            onDistanceSearchListener.onDistanceSearched((DistanceResult) message.getData().getParcelable("result"), data.getInt("errorCode"));
        }
    }

    /* renamed from: a */
    private void m16279a(Message message) {
        int i = message.arg2;
        ShareSearch.OnShareSearchListener onShareSearchListener = (ShareSearch.OnShareSearchListener) message.obj;
        String string = message.getData().getString("shareurlkey");
        if (onShareSearchListener == null) {
            return;
        }
        switch (message.what) {
            case 1100:
                onShareSearchListener.onPoiShareUrlSearched(string, i);
                return;
            case InnerService.PATH_AND_URL_EMPTY:
                onShareSearchListener.onLocationShareUrlSearched(string, i);
                return;
            case InnerService.PATH_PARAM_ERROR:
                onShareSearchListener.onNaviShareUrlSearched(string, i);
                return;
            case InnerService.LOAD_FAIL:
                onShareSearchListener.onBusRouteShareUrlSearched(string, i);
                return;
            case 1104:
                onShareSearchListener.onDrivingRouteShareUrlSearched(string, i);
                return;
            case 1105:
                onShareSearchListener.onWalkRouteShareUrlSearched(string, i);
                return;
            default:
                return;
        }
    }

    /* renamed from: f */
    private void m16274f(Message message) {
        C2026g c2026g;
        PoiSearch.OnPoiSearchListener onPoiSearchListener;
        Bundle data;
        if (message.what == 600) {
            C2027h c2027h = (C2027h) message.obj;
            if (c2027h != null && (onPoiSearchListener = c2027h.f24854b) != null && (data = message.getData()) != null) {
                onPoiSearchListener.onPoiSearched(c2027h.f24853a, data.getInt("errorCode"));
            }
        } else if (message.what != 602 || (c2026g = (C2026g) message.obj) == null) {
        } else {
            PoiSearch.OnPoiSearchListener onPoiSearchListener2 = c2026g.f24852b;
            Bundle data2 = message.getData();
            if (data2 != null) {
                onPoiSearchListener2.onPoiItemSearched(c2026g.f24851a, data2.getInt("errorCode"));
            }
        }
    }

    /* renamed from: o */
    private void m16265o(Message message) {
        C2030k c2030k;
        WeatherSearch.OnWeatherSearchListener onWeatherSearchListener;
        Bundle data;
        WeatherSearch.OnWeatherSearchListener onWeatherSearchListener2;
        Bundle data2;
        if (message.what == 1301) {
            C2031l c2031l = (C2031l) message.obj;
            if (c2031l != null && (onWeatherSearchListener2 = c2031l.f24862b) != null && (data2 = message.getData()) != null) {
                onWeatherSearchListener2.onWeatherLiveSearched(c2031l.f24861a, data2.getInt("errorCode"));
            }
        } else if (message.what == 1302 && (c2030k = (C2030k) message.obj) != null && (onWeatherSearchListener = c2030k.f24860b) != null && (data = message.getData()) != null) {
            onWeatherSearchListener.onWeatherForecastSearched(c2030k.f24859a, data.getInt("errorCode"));
        }
    }

    /* renamed from: q */
    private void m16263q(Message message) {
        TrafficSearch.OnTrafficSearchListener onTrafficSearchListener = (TrafficSearch.OnTrafficSearchListener) message.obj;
        if (onTrafficSearchListener == null) {
            return;
        }
        if (message.what == 300) {
            Bundle data = message.getData();
            if (data != null) {
                onTrafficSearchListener.onRoadTrafficSearched((TrafficStatusResult) message.getData().getParcelable("result"), data.getInt("errorCode"));
            }
        } else if (message.what == 301) {
            Bundle data2 = message.getData();
            if (data2 != null) {
                onTrafficSearchListener.onRoadTrafficSearched((TrafficStatusResult) message.getData().getParcelable("result"), data2.getInt("errorCode"));
            }
        } else if (message.what == 302) {
            message.getData();
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            switch (message.arg1) {
                case 1:
                    m16269k(message);
                    return;
                case 2:
                    m16272h(message);
                    return;
                case 3:
                    m16270j(message);
                    return;
                case 4:
                    m16271i(message);
                    return;
                case 5:
                    m16273g(message);
                    return;
                case 6:
                    m16274f(message);
                    return;
                case 7:
                    m16275e(message);
                    return;
                case 8:
                    m16276d(message);
                    return;
                case 9:
                    m16277c(message);
                    return;
                case 10:
                    m16278b(message);
                    return;
                case 11:
                    m16279a(message);
                    return;
                case 12:
                    m16266n(message);
                    return;
                case 13:
                    m16265o(message);
                    return;
                case 14:
                    m16264p(message);
                    return;
                case MotionEventCompat.AXIS_HAT_X /* 15 */:
                    m16263q(message);
                    return;
                case 16:
                    m16262r(message);
                    return;
                case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                    m16268l(message);
                    return;
                case 18:
                    m16267m(message);
                    return;
                default:
                    return;
            }
        } catch (Throwable th) {
            C2007j.m16371a(th, "MessageHandler", "handleMessage");
        }
    }

    /* renamed from: k */
    private void m16269k(Message message) {
        Bundle data;
        RouteSearch.OnRouteSearchListener onRouteSearchListener = (RouteSearch.OnRouteSearchListener) message.obj;
        if (onRouteSearchListener == null) {
            return;
        }
        if (message.what == 100) {
            Bundle data2 = message.getData();
            if (data2 != null) {
                onRouteSearchListener.onBusRouteSearched((BusRouteResult) message.getData().getParcelable("result"), data2.getInt("errorCode"));
            }
        } else if (message.what == 101) {
            Bundle data3 = message.getData();
            if (data3 != null) {
                onRouteSearchListener.onDriveRouteSearched((DriveRouteResult) message.getData().getParcelable("result"), data3.getInt("errorCode"));
            }
        } else if (message.what == 102) {
            Bundle data4 = message.getData();
            if (data4 != null) {
                onRouteSearchListener.onWalkRouteSearched((WalkRouteResult) message.getData().getParcelable("result"), data4.getInt("errorCode"));
            }
        } else if (message.what == 103) {
            Bundle data5 = message.getData();
            if (data5 != null) {
                onRouteSearchListener.onRideRouteSearched((RideRouteResult) message.getData().getParcelable("result"), data5.getInt("errorCode"));
            }
        } else if (message.what == 104 && (data = message.getData()) != null) {
            onRouteSearchListener.onRideRouteSearched((RideRouteResult) message.getData().getParcelable("result"), data.getInt("errorCode"));
        }
    }
}
