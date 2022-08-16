package com.bytedance.android.live.broadcastgame.opengame.network.outer;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.outer.a */
/* loaded from: classes5.dex */
public interface AbstractC3587a {
    static {
        Covode.recordClassIndex(20470);
    }

    void LIZ(long j);

    void LIZ(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, long j, Function3<? super Integer, ? super JSONObject, ? super String, Unit> function3, Function1<? super Throwable, Unit> function1, boolean z);

    void LIZ(String str, String str2, String str3, Map<String, String> map, byte[] bArr, String str4, long j, Function3<? super Integer, ? super JSONObject, ? super String, Unit> function3, Function1<? super Throwable, Unit> function1, boolean z);

    boolean LIZ();

    void LIZIZ();
}
