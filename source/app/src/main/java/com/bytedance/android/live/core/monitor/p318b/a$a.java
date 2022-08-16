package com.bytedance.android.live.core.monitor.p318b;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import p003X.C91287Lxp;

/* renamed from: com.bytedance.android.live.core.monitor.b.a$a */
/* loaded from: classes5.dex */
public final class a$a {
    @SerializedName("enable")
    public boolean LIZ;
    @SerializedName("upload_strategy")
    public int LIZLLL;
    @SerializedName("event_type_blocklist")
    public List<String> LIZIZ = CollectionsKt__CollectionsKt.emptyList();
    @SerializedName("business_type_blocklist")
    public List<String> LIZJ = CollectionsKt__CollectionsKt.emptyList();
    @SerializedName("upload_strategy_batch_config")

    /* renamed from: LJ */
    public C91287Lxp f26171LJ = new C91287Lxp();

    static {
        Covode.recordClassIndex(23497);
    }
}
