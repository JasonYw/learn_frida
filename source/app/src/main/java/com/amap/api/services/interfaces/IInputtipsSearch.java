package com.amap.api.services.interfaces;

import com.amap.api.services.help.Inputtips;
import com.amap.api.services.help.InputtipsQuery;
import com.amap.api.services.help.Tip;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* loaded from: classes19.dex */
public interface IInputtipsSearch {
    static {
        Covode.recordClassIndex(5721);
    }

    InputtipsQuery getQuery();

    ArrayList<Tip> requestInputtips();

    void requestInputtips(String str, String str2);

    void requestInputtips(String str, String str2, String str3);

    void requestInputtipsAsyn();

    void setInputtipsListener(Inputtips.InputtipsListener inputtipsListener);

    void setQuery(InputtipsQuery inputtipsQuery);
}
