package com.bytedance.android.live.broadcast.bgbroadcast.game.sensor_data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class DataItem implements Serializable {
    @SerializedName("uid")
    public String uid = "";
    @SerializedName("did")
    public String did = "";
    @SerializedName("room_id")
    public String roomId = "";
    @SerializedName("type")
    public int type = DataType.INVALID.value;
    @SerializedName("timestamp")
    public long timestamp = -1;
    @SerializedName("values")
    public float[] values = new float[3];
    @SerializedName("platform")
    public String platform = "";

    static {
        Covode.recordClassIndex(14847);
    }
}
