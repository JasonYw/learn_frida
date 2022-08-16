package com.bytedance.android.live.broadcast.api;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a;
import com.bytedance.android.live.broadcast.api.model.C2917q;
import com.bytedance.android.livesdk.message.model.IntroduceCardType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.google.gson.JsonObject;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p003X.AbstractC89313LGx;
import p003X.LFT;
import p003X.LFV;

/* renamed from: com.bytedance.android.live.broadcast.api.l */
/* loaded from: classes5.dex */
public interface AbstractC2891l extends IService {
    static {
        Covode.recordClassIndex(14477);
    }

    int LIZ(Context context, JsonObject jsonObject, AbstractC2889a abstractC2889a);

    AbstractC89313LGx LIZ(Context context, IntroduceCardType introduceCardType);

    Observable<List<C2917q>> LIZ(Context context, List<? extends C2917q> list, int i);

    void LIZ(long j);

    void LIZ(Context context);

    void LIZ(Context context, int i, String str, LFV lfv);

    void LIZ(Context context, Bundle bundle, Boolean bool);

    void LIZ(Context context, Room room);

    void LIZ(Context context, Room room, Map<String, String> map);

    void LIZ(Context context, JsonObject jsonObject);

    void LIZ(Context context, String str, LFV lfv);

    void LIZ(Context context, String str, String str2, String str3, LFT lft);

    void LIZ(Context context, Map<String, String> map);

    void LIZ(String str, LFV lfv);

    void LIZ(String str, String str2, long j, JSONObject jSONObject);

    RecyclerView LIZIZ(Context context);

    void LIZIZ(long j);

    void LIZIZ(Context context, Bundle bundle, Boolean bool);

    void LIZIZ(Context context, Room room);

    void LIZIZ(Context context, JsonObject jsonObject);

    void LIZIZ(Context context, Map<String, Object> map);

    void LIZJ(Context context, JsonObject jsonObject);
}
