package com.amap.api.mapcore2d;

import android.graphics.Canvas;
import android.graphics.Rect;
import com.amap.api.interfaces.IMarker;
import com.amap.api.maps2d.model.LatLng;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.ab */
/* loaded from: classes19.dex */
public interface AbstractC1462ab extends IMarker, AbstractC1463ac {
    static {
        Covode.recordClassIndex(5010);
    }

    /* renamed from: a */
    Rect mo18499a();

    /* renamed from: a */
    void mo18497a(Canvas canvas, AbstractC1783y abstractC1783y);

    /* renamed from: a */
    void mo18493a(LatLng latLng);

    /* renamed from: b */
    C1774s mo18490b();
}
