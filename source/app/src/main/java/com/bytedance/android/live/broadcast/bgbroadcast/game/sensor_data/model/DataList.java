package com.bytedance.android.live.broadcast.bgbroadcast.game.sensor_data.model;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class DataList implements Serializable {
    @SerializedName(C2521l.LJIIL)
    public ArrayList<DataItem> data;

    static {
        Covode.recordClassIndex(14848);
    }
}
