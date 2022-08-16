package com.amap.api.services.traffic;

import android.content.Context;
import com.amap.api.services.interfaces.ITrafficSearch;
import com.amap.api.services.p126a.C1858bc;
import com.amap.api.services.p126a.C1863be;
import com.amap.api.services.p126a.C1930cr;
import com.amap.api.services.p126a.C2006i;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class TrafficSearch {

    /* renamed from: a */
    public ITrafficSearch f25392a;
    public static int ROAD_LEVEL_HIGH_WAY = 1;
    public static int ROAD_LEVEL_CITY_QUICK_WAY = 2;
    public static int ROAD_LEVEL_HIGH_WAY_BYROAD = 3;
    public static int ROAD_LEVEL_MAIN_WAY = 4;
    public static int ROAD_LEVEL_NORMAL_WAY = 5;
    public static int ROAD_LEVEL_NONAME_WAY = 6;

    /* loaded from: classes19.dex */
    public interface OnTrafficSearchListener {
        static {
            Covode.recordClassIndex(5870);
        }

        void onRoadTrafficSearched(TrafficStatusResult trafficStatusResult, int i);
    }

    static {
        Covode.recordClassIndex(5869);
    }

    public void loadTrafficByCircleAsyn(CircleTrafficQuery circleTrafficQuery) {
        ITrafficSearch iTrafficSearch = this.f25392a;
        if (iTrafficSearch != null) {
            iTrafficSearch.loadTrafficByCircleAsyn(circleTrafficQuery);
        }
    }

    public void loadTrafficByRoadAsyn(RoadTrafficQuery roadTrafficQuery) {
        ITrafficSearch iTrafficSearch = this.f25392a;
        if (iTrafficSearch != null) {
            iTrafficSearch.loadTrafficByRoadAsyn(roadTrafficQuery);
        }
    }

    public void setTrafficSearchListener(OnTrafficSearchListener onTrafficSearchListener) {
        ITrafficSearch iTrafficSearch = this.f25392a;
        if (iTrafficSearch != null) {
            iTrafficSearch.setTrafficSearchListener(onTrafficSearchListener);
        }
    }

    public TrafficStatusResult loadTrafficByCircle(CircleTrafficQuery circleTrafficQuery) {
        ITrafficSearch iTrafficSearch = this.f25392a;
        if (iTrafficSearch != null) {
            return iTrafficSearch.loadTrafficByCircle(circleTrafficQuery);
        }
        return null;
    }

    public TrafficStatusResult loadTrafficByRoad(RoadTrafficQuery roadTrafficQuery) {
        ITrafficSearch iTrafficSearch = this.f25392a;
        if (iTrafficSearch != null) {
            return iTrafficSearch.loadTrafficByRoad(roadTrafficQuery);
        }
        return null;
    }

    public TrafficSearch(Context context) {
        try {
            this.f25392a = (ITrafficSearch) C1930cr.m16606a(context, C2006i.m16379a(true), "com.amap.api.services.dynamic.TrafficSearchWrapper", C1858bc.class, new Class[]{Context.class}, new Object[]{context});
        } catch (C1863be e) {
            e.printStackTrace();
        }
        if (this.f25392a == null) {
            try {
                this.f25392a = new C1858bc(context);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
