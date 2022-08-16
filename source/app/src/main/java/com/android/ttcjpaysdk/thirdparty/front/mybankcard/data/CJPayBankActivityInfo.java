package com.android.ttcjpaysdk.thirdparty.front.mybankcard.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes13.dex */
public final class CJPayBankActivityInfo implements CJPayObject, Serializable {
    public ArrayList<CJPaySingleBankActivityInfo> bank_activity_list;
    public String place_no;

    static {
        Covode.recordClassIndex(8742);
    }

    public CJPayBankActivityInfo() {
        this(null, null, 3, null);
    }

    public CJPayBankActivityInfo(String str, ArrayList<CJPaySingleBankActivityInfo> arrayList) {
        C106862S5w.LIZ(str, arrayList);
        this.place_no = str;
        this.bank_activity_list = arrayList;
    }

    public /* synthetic */ CJPayBankActivityInfo(String str, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : arrayList);
    }
}
