package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface ICJPayVerifyQueryService extends ICJPayService {
    static {
        Covode.recordClassIndex(6509);
    }

    void initVerifyQuery(ICJPayVerifyQueryParams iCJPayVerifyQueryParams, ICJPayVerifyQueryCallBack iCJPayVerifyQueryCallBack);

    void release();

    void start();
}
