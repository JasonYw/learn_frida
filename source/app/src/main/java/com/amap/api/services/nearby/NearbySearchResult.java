package com.amap.api.services.nearby;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class NearbySearchResult {

    /* renamed from: a */
    public List<NearbyInfo> f25097a = new ArrayList();

    /* renamed from: b */
    public int f25098b = 0;

    static {
        Covode.recordClassIndex(5735);
    }

    public List<NearbyInfo> getNearbyInfoList() {
        return this.f25097a;
    }

    public int getTotalNum() {
        return this.f25098b;
    }

    public void setNearbyInfoList(List<NearbyInfo> list) {
        this.f25097a = list;
        this.f25098b = list.size();
    }
}
