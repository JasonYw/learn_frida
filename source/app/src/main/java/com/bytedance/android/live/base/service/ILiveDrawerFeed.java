package com.bytedance.android.live.base.service;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.base.IService;
import com.bytedance.covode.number.Covode;

/* loaded from: classes23.dex */
public interface ILiveDrawerFeed extends IService {
    static {
        Covode.recordClassIndex(14277);
    }

    void clearDrawerData(FragmentActivity fragmentActivity);
}
