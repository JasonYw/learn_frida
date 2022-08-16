package com.amap.api.services.p126a;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.LatLonSharePoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.interfaces.IShareSearch;
import com.amap.api.services.share.ShareSearch;
import com.bytedance.bdp.appbase.service.protocol.inner.InnerService;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.bb */
/* loaded from: classes19.dex */
public class C1851bb implements IShareSearch {

    /* renamed from: b */
    public static String f24352b = "http://wb.amap.com/?r=%f,%f,%s,%f,%f,%s,%d,%d,%d,%s,%s,%s&sourceapplication=openapi/0";

    /* renamed from: c */
    public static String f24353c = "http://wb.amap.com/?q=%f,%f,%s&sourceapplication=openapi/0";

    /* renamed from: d */
    public static String f24354d = "http://wb.amap.com/?n=%f,%f,%f,%f,%d&sourceapplication=openapi/0";

    /* renamed from: e */
    public static String f24355e = "http://wb.amap.com/?p=%s,%f,%f,%s,%s&sourceapplication=openapi/0";

    /* renamed from: f */
    public static final String f24356f = "";

    /* renamed from: a */
    public Context f24357a;

    /* renamed from: g */
    public ShareSearch.OnShareSearchListener f24358g;

    static {
        Covode.recordClassIndex(5462);
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public void setOnShareSearchListener(ShareSearch.OnShareSearchListener onShareSearchListener) {
        this.f24358g = onShareSearchListener;
    }

    public C1851bb(Context context) {
        this.f24357a = context;
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public void searchBusRouteShareUrlAsyn(final ShareSearch.ShareBusRouteQuery shareBusRouteQuery) {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.bb.2
                static {
                    Covode.recordClassIndex(5464);
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (C1851bb.this.f24358g == null) {
                        return;
                    }
                    Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                    obtainMessage.arg1 = 11;
                    obtainMessage.what = InnerService.LOAD_FAIL;
                    obtainMessage.obj = C1851bb.this.f24358g;
                    try {
                        try {
                            String searchBusRouteShareUrl = C1851bb.this.searchBusRouteShareUrl(shareBusRouteQuery);
                            Bundle bundle = new Bundle();
                            bundle.putString("shareurlkey", searchBusRouteShareUrl);
                            obtainMessage.setData(bundle);
                            obtainMessage.arg2 = 1000;
                        } catch (AMapException e) {
                            obtainMessage.arg2 = e.getErrorCode();
                        }
                    } finally {
                        HandlerC2019t.m16280a().sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public void searchDrivingRouteShareUrlAsyn(final ShareSearch.ShareDrivingRouteQuery shareDrivingRouteQuery) {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.bb.4
                static {
                    Covode.recordClassIndex(5466);
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (C1851bb.this.f24358g == null) {
                        return;
                    }
                    Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                    obtainMessage.arg1 = 11;
                    obtainMessage.what = 1104;
                    obtainMessage.obj = C1851bb.this.f24358g;
                    try {
                        try {
                            String searchDrivingRouteShareUrl = C1851bb.this.searchDrivingRouteShareUrl(shareDrivingRouteQuery);
                            Bundle bundle = new Bundle();
                            bundle.putString("shareurlkey", searchDrivingRouteShareUrl);
                            obtainMessage.setData(bundle);
                            obtainMessage.arg2 = 1000;
                        } catch (AMapException e) {
                            obtainMessage.arg2 = e.getErrorCode();
                        }
                    } finally {
                        HandlerC2019t.m16280a().sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public void searchLocationShareUrlAsyn(final LatLonSharePoint latLonSharePoint) {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.bb.6
                static {
                    Covode.recordClassIndex(5468);
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (C1851bb.this.f24358g == null) {
                        return;
                    }
                    Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                    obtainMessage.arg1 = 11;
                    obtainMessage.what = InnerService.PATH_AND_URL_EMPTY;
                    obtainMessage.obj = C1851bb.this.f24358g;
                    try {
                        try {
                            String searchLocationShareUrl = C1851bb.this.searchLocationShareUrl(latLonSharePoint);
                            Bundle bundle = new Bundle();
                            bundle.putString("shareurlkey", searchLocationShareUrl);
                            obtainMessage.setData(bundle);
                            obtainMessage.arg2 = 1000;
                        } catch (AMapException e) {
                            obtainMessage.arg2 = e.getErrorCode();
                        }
                    } finally {
                        HandlerC2019t.m16280a().sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public void searchNaviShareUrlAsyn(final ShareSearch.ShareNaviQuery shareNaviQuery) {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.bb.5
                static {
                    Covode.recordClassIndex(5467);
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (C1851bb.this.f24358g == null) {
                        return;
                    }
                    Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                    obtainMessage.arg1 = 11;
                    obtainMessage.what = InnerService.PATH_PARAM_ERROR;
                    obtainMessage.obj = C1851bb.this.f24358g;
                    try {
                        try {
                            String searchNaviShareUrl = C1851bb.this.searchNaviShareUrl(shareNaviQuery);
                            Bundle bundle = new Bundle();
                            bundle.putString("shareurlkey", searchNaviShareUrl);
                            obtainMessage.setData(bundle);
                            obtainMessage.arg2 = 1000;
                        } catch (AMapException e) {
                            obtainMessage.arg2 = e.getErrorCode();
                        }
                    } finally {
                        HandlerC2019t.m16280a().sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public void searchPoiShareUrlAsyn(final PoiItem poiItem) {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.bb.1
                static {
                    Covode.recordClassIndex(5463);
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (C1851bb.this.f24358g == null) {
                        return;
                    }
                    Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                    obtainMessage.arg1 = 11;
                    obtainMessage.what = 1100;
                    obtainMessage.obj = C1851bb.this.f24358g;
                    try {
                        try {
                            String searchPoiShareUrl = C1851bb.this.searchPoiShareUrl(poiItem);
                            Bundle bundle = new Bundle();
                            bundle.putString("shareurlkey", searchPoiShareUrl);
                            obtainMessage.setData(bundle);
                            obtainMessage.arg2 = 1000;
                        } catch (AMapException e) {
                            obtainMessage.arg2 = e.getErrorCode();
                        }
                    } finally {
                        HandlerC2019t.m16280a().sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public void searchWalkRouteShareUrlAsyn(final ShareSearch.ShareWalkRouteQuery shareWalkRouteQuery) {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.bb.3
                static {
                    Covode.recordClassIndex(5465);
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (C1851bb.this.f24358g == null) {
                        return;
                    }
                    Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                    obtainMessage.arg1 = 11;
                    obtainMessage.what = 1105;
                    obtainMessage.obj = C1851bb.this.f24358g;
                    try {
                        try {
                            String searchWalkRouteShareUrl = C1851bb.this.searchWalkRouteShareUrl(shareWalkRouteQuery);
                            Bundle bundle = new Bundle();
                            bundle.putString("shareurlkey", searchWalkRouteShareUrl);
                            obtainMessage.setData(bundle);
                            obtainMessage.arg2 = 1000;
                        } catch (AMapException e) {
                            obtainMessage.arg2 = e.getErrorCode();
                        }
                    } finally {
                        HandlerC2019t.m16280a().sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public String searchLocationShareUrl(LatLonSharePoint latLonSharePoint) {
        try {
            if (latLonSharePoint != null) {
                return new C1808ah(this.f24357a, String.format(f24353c, Double.valueOf(latLonSharePoint.getLatitude()), Double.valueOf(latLonSharePoint.getLongitude()), latLonSharePoint.getSharePointName())).m17087c();
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            C2007j.m16371a(e, "ShareSearch", "searchLocationShareUrl");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public String searchPoiShareUrl(PoiItem poiItem) {
        if (poiItem != null) {
            try {
                if (poiItem.getLatLonPoint() != null) {
                    LatLonPoint latLonPoint = poiItem.getLatLonPoint();
                    return new C1808ah(this.f24357a, String.format(f24355e, poiItem.getPoiId(), Double.valueOf(latLonPoint.getLatitude()), Double.valueOf(latLonPoint.getLongitude()), poiItem.getTitle(), poiItem.getSnippet())).m17087c();
                }
            } catch (AMapException e) {
                C2007j.m16371a(e, "ShareSearch", "searchPoiShareUrl");
                throw e;
            }
        }
        throw new AMapException("无效的参数 - IllegalArgumentException");
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public String searchBusRouteShareUrl(ShareSearch.ShareBusRouteQuery shareBusRouteQuery) {
        try {
            if (shareBusRouteQuery != null) {
                int busMode = shareBusRouteQuery.getBusMode();
                ShareSearch.ShareFromAndTo shareFromAndTo = shareBusRouteQuery.getShareFromAndTo();
                if (shareFromAndTo.getFrom() != null && shareFromAndTo.getTo() != null) {
                    LatLonPoint from = shareFromAndTo.getFrom();
                    LatLonPoint to = shareFromAndTo.getTo();
                    return new C1808ah(this.f24357a, String.format(f24352b, Double.valueOf(from.getLatitude()), Double.valueOf(from.getLongitude()), shareFromAndTo.getFromName(), Double.valueOf(to.getLatitude()), Double.valueOf(to.getLongitude()), shareFromAndTo.getToName(), Integer.valueOf(busMode), 1, 0, f24356f, f24356f, f24356f)).m17087c();
                }
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            C2007j.m16371a(e, "ShareSearch", "searchBusRouteShareUrl");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public String searchDrivingRouteShareUrl(ShareSearch.ShareDrivingRouteQuery shareDrivingRouteQuery) {
        try {
            if (shareDrivingRouteQuery != null) {
                int drivingMode = shareDrivingRouteQuery.getDrivingMode();
                ShareSearch.ShareFromAndTo shareFromAndTo = shareDrivingRouteQuery.getShareFromAndTo();
                if (shareFromAndTo.getFrom() != null && shareFromAndTo.getTo() != null) {
                    LatLonPoint from = shareFromAndTo.getFrom();
                    LatLonPoint to = shareFromAndTo.getTo();
                    return new C1808ah(this.f24357a, String.format(f24352b, Double.valueOf(from.getLatitude()), Double.valueOf(from.getLongitude()), shareFromAndTo.getFromName(), Double.valueOf(to.getLatitude()), Double.valueOf(to.getLongitude()), shareFromAndTo.getToName(), Integer.valueOf(drivingMode), 0, 0, f24356f, f24356f, f24356f)).m17087c();
                }
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            C2007j.m16371a(e, "ShareSearch", "searchDrivingRouteShareUrl");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public String searchNaviShareUrl(ShareSearch.ShareNaviQuery shareNaviQuery) {
        String format;
        try {
            if (shareNaviQuery != null) {
                ShareSearch.ShareFromAndTo fromAndTo = shareNaviQuery.getFromAndTo();
                if (fromAndTo.getTo() != null) {
                    LatLonPoint from = fromAndTo.getFrom();
                    LatLonPoint to = fromAndTo.getTo();
                    int naviMode = shareNaviQuery.getNaviMode();
                    if (fromAndTo.getFrom() == null) {
                        format = String.format(f24354d, null, null, Double.valueOf(to.getLatitude()), Double.valueOf(to.getLongitude()), Integer.valueOf(naviMode));
                    } else {
                        format = String.format(f24354d, Double.valueOf(from.getLatitude()), Double.valueOf(from.getLongitude()), Double.valueOf(to.getLatitude()), Double.valueOf(to.getLongitude()), Integer.valueOf(naviMode));
                    }
                    return new C1808ah(this.f24357a, format).m17087c();
                }
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            C2007j.m16371a(e, "ShareSearch", "searchNaviShareUrl");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IShareSearch
    public String searchWalkRouteShareUrl(ShareSearch.ShareWalkRouteQuery shareWalkRouteQuery) {
        try {
            if (shareWalkRouteQuery != null) {
                int walkMode = shareWalkRouteQuery.getWalkMode();
                ShareSearch.ShareFromAndTo shareFromAndTo = shareWalkRouteQuery.getShareFromAndTo();
                if (shareFromAndTo.getFrom() != null && shareFromAndTo.getTo() != null) {
                    LatLonPoint from = shareFromAndTo.getFrom();
                    LatLonPoint to = shareFromAndTo.getTo();
                    return new C1808ah(this.f24357a, String.format(f24352b, Double.valueOf(from.getLatitude()), Double.valueOf(from.getLongitude()), shareFromAndTo.getFromName(), Double.valueOf(to.getLatitude()), Double.valueOf(to.getLongitude()), shareFromAndTo.getToName(), Integer.valueOf(walkMode), 2, 0, f24356f, f24356f, f24356f)).m17087c();
                }
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            C2007j.m16371a(e, "ShareSearch", "searchWalkRouteShareUrl");
            throw e;
        }
    }
}
