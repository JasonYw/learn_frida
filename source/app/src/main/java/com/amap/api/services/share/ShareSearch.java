package com.amap.api.services.share;

import android.content.Context;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.LatLonSharePoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.interfaces.IShareSearch;
import com.amap.api.services.p126a.C1851bb;
import com.amap.api.services.p126a.C1863be;
import com.amap.api.services.p126a.C1930cr;
import com.amap.api.services.p126a.C2006i;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class ShareSearch {

    /* renamed from: a */
    public IShareSearch f25375a;

    /* loaded from: classes19.dex */
    public interface OnShareSearchListener {
        static {
            Covode.recordClassIndex(5859);
        }

        void onBusRouteShareUrlSearched(String str, int i);

        void onDrivingRouteShareUrlSearched(String str, int i);

        void onLocationShareUrlSearched(String str, int i);

        void onNaviShareUrlSearched(String str, int i);

        void onPoiShareUrlSearched(String str, int i);

        void onWalkRouteShareUrlSearched(String str, int i);
    }

    static {
        Covode.recordClassIndex(5858);
    }

    /* loaded from: classes19.dex */
    public static class ShareBusRouteQuery {

        /* renamed from: a */
        public ShareFromAndTo f25376a;

        /* renamed from: b */
        public int f25377b;

        static {
            Covode.recordClassIndex(5860);
        }

        public int getBusMode() {
            return this.f25377b;
        }

        public ShareFromAndTo getShareFromAndTo() {
            return this.f25376a;
        }

        public ShareBusRouteQuery(ShareFromAndTo shareFromAndTo, int i) {
            this.f25376a = shareFromAndTo;
            this.f25377b = i;
        }
    }

    /* loaded from: classes19.dex */
    public static class ShareDrivingRouteQuery {

        /* renamed from: a */
        public ShareFromAndTo f25378a;

        /* renamed from: b */
        public int f25379b;

        static {
            Covode.recordClassIndex(5861);
        }

        public int getDrivingMode() {
            return this.f25379b;
        }

        public ShareFromAndTo getShareFromAndTo() {
            return this.f25378a;
        }

        public ShareDrivingRouteQuery(ShareFromAndTo shareFromAndTo, int i) {
            this.f25378a = shareFromAndTo;
            this.f25379b = i;
        }
    }

    /* loaded from: classes19.dex */
    public static class ShareFromAndTo {

        /* renamed from: a */
        public LatLonPoint f25380a;

        /* renamed from: b */
        public LatLonPoint f25381b;

        /* renamed from: c */
        public String f25382c = "起点";

        /* renamed from: d */
        public String f25383d = "终点";

        static {
            Covode.recordClassIndex(5862);
        }

        public LatLonPoint getFrom() {
            return this.f25380a;
        }

        public String getFromName() {
            return this.f25382c;
        }

        public LatLonPoint getTo() {
            return this.f25381b;
        }

        public String getToName() {
            return this.f25383d;
        }

        public void setFromName(String str) {
            this.f25382c = str;
        }

        public void setToName(String str) {
            this.f25383d = str;
        }

        public ShareFromAndTo(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.f25380a = latLonPoint;
            this.f25381b = latLonPoint2;
        }
    }

    /* loaded from: classes19.dex */
    public static class ShareNaviQuery {

        /* renamed from: a */
        public ShareFromAndTo f25384a;

        /* renamed from: b */
        public int f25385b;

        static {
            Covode.recordClassIndex(5863);
        }

        public ShareFromAndTo getFromAndTo() {
            return this.f25384a;
        }

        public int getNaviMode() {
            return this.f25385b;
        }

        public ShareNaviQuery(ShareFromAndTo shareFromAndTo, int i) {
            this.f25384a = shareFromAndTo;
            this.f25385b = i;
        }
    }

    /* loaded from: classes19.dex */
    public static class ShareWalkRouteQuery {

        /* renamed from: a */
        public ShareFromAndTo f25386a;

        /* renamed from: b */
        public int f25387b;

        static {
            Covode.recordClassIndex(5864);
        }

        public ShareFromAndTo getShareFromAndTo() {
            return this.f25386a;
        }

        public int getWalkMode() {
            return this.f25387b;
        }

        public ShareWalkRouteQuery(ShareFromAndTo shareFromAndTo, int i) {
            this.f25386a = shareFromAndTo;
            this.f25387b = i;
        }
    }

    public void searchBusRouteShareUrlAsyn(ShareBusRouteQuery shareBusRouteQuery) {
        IShareSearch iShareSearch = this.f25375a;
        if (iShareSearch != null) {
            iShareSearch.searchBusRouteShareUrlAsyn(shareBusRouteQuery);
        }
    }

    public void searchDrivingRouteShareUrlAsyn(ShareDrivingRouteQuery shareDrivingRouteQuery) {
        IShareSearch iShareSearch = this.f25375a;
        if (iShareSearch != null) {
            iShareSearch.searchDrivingRouteShareUrlAsyn(shareDrivingRouteQuery);
        }
    }

    public void searchLocationShareUrlAsyn(LatLonSharePoint latLonSharePoint) {
        IShareSearch iShareSearch = this.f25375a;
        if (iShareSearch != null) {
            iShareSearch.searchLocationShareUrlAsyn(latLonSharePoint);
        }
    }

    public void searchNaviShareUrlAsyn(ShareNaviQuery shareNaviQuery) {
        IShareSearch iShareSearch = this.f25375a;
        if (iShareSearch != null) {
            iShareSearch.searchNaviShareUrlAsyn(shareNaviQuery);
        }
    }

    public void searchPoiShareUrlAsyn(PoiItem poiItem) {
        IShareSearch iShareSearch = this.f25375a;
        if (iShareSearch != null) {
            iShareSearch.searchPoiShareUrlAsyn(poiItem);
        }
    }

    public void searchWalkRouteShareUrlAsyn(ShareWalkRouteQuery shareWalkRouteQuery) {
        IShareSearch iShareSearch = this.f25375a;
        if (iShareSearch != null) {
            iShareSearch.searchWalkRouteShareUrlAsyn(shareWalkRouteQuery);
        }
    }

    public void setOnShareSearchListener(OnShareSearchListener onShareSearchListener) {
        IShareSearch iShareSearch = this.f25375a;
        if (iShareSearch != null) {
            iShareSearch.setOnShareSearchListener(onShareSearchListener);
        }
    }

    public String searchBusRouteShareUrl(ShareBusRouteQuery shareBusRouteQuery) {
        IShareSearch iShareSearch = this.f25375a;
        if (iShareSearch != null) {
            iShareSearch.searchBusRouteShareUrl(shareBusRouteQuery);
            return null;
        }
        return null;
    }

    public String searchDrivingRouteShareUrl(ShareDrivingRouteQuery shareDrivingRouteQuery) {
        IShareSearch iShareSearch = this.f25375a;
        if (iShareSearch != null) {
            iShareSearch.searchDrivingRouteShareUrl(shareDrivingRouteQuery);
            return null;
        }
        return null;
    }

    public String searchLocationShareUrl(LatLonSharePoint latLonSharePoint) {
        IShareSearch iShareSearch = this.f25375a;
        if (iShareSearch != null) {
            iShareSearch.searchLocationShareUrl(latLonSharePoint);
            return null;
        }
        return null;
    }

    public String searchNaviShareUrl(ShareNaviQuery shareNaviQuery) {
        IShareSearch iShareSearch = this.f25375a;
        if (iShareSearch != null) {
            iShareSearch.searchNaviShareUrl(shareNaviQuery);
            return null;
        }
        return null;
    }

    public String searchPoiShareUrl(PoiItem poiItem) {
        IShareSearch iShareSearch = this.f25375a;
        if (iShareSearch != null) {
            iShareSearch.searchPoiShareUrl(poiItem);
            return null;
        }
        return null;
    }

    public String searchWalkRouteShareUrl(ShareWalkRouteQuery shareWalkRouteQuery) {
        IShareSearch iShareSearch = this.f25375a;
        if (iShareSearch != null) {
            iShareSearch.searchWalkRouteShareUrl(shareWalkRouteQuery);
            return null;
        }
        return null;
    }

    public ShareSearch(Context context) {
        try {
            this.f25375a = (IShareSearch) C1930cr.m16606a(context, C2006i.m16379a(true), "com.amap.api.services.dynamic.ShareSearchWrapper", C1851bb.class, new Class[]{Context.class}, new Object[]{context});
        } catch (C1863be e) {
            e.printStackTrace();
        }
        if (this.f25375a == null) {
            try {
                this.f25375a = new C1851bb(context);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
