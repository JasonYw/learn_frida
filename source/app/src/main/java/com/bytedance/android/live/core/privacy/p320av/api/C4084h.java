package com.bytedance.android.live.core.privacy.p320av.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.core.privacy.av.api.h */
/* loaded from: classes5.dex */
public class C4084h {
    @SerializedName("enable")
    public boolean LIZ;
    @SerializedName("support_upload_alog_when_error")
    public boolean LIZIZ;
    @SerializedName("support_upload_trace")
    public boolean LIZLLL;
    @SerializedName("support_upload_monitor")
    public boolean LIZJ = true;
    @SerializedName("disable_checker_biz")

    /* renamed from: LJ */
    public List<String> f26177LJ = new ArrayList() { // from class: com.bytedance.android.live.core.privacy.av.api.PrivacyConfig$1
        static {
            Covode.recordClassIndex(23557);
        }
    };
    @SerializedName("supported_upload_to_trace_event_type")
    public List<String> LJFF = new ArrayList() { // from class: com.bytedance.android.live.core.privacy.av.api.PrivacyConfig$2
        static {
            Covode.recordClassIndex(23558);
        }

        {
            add("av_status_change");
            add("trigger_detection");
            add("page_life_cycle");
            add("av_operation");
        }
    };

    static {
        Covode.recordClassIndex(23570);
    }
}
