package com.bytedance.android.annie.card.base;

import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.android.annie.api.card.IHybridComponent;
import com.bytedance.android.annie.api.resource.AnnieResType;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.C13039ag;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.annie.card.base.d */
/* loaded from: classes7.dex */
public interface AbstractC2599d {
    static {
        Covode.recordClassIndex(10679);
    }

    void LIZ();

    void LIZ(View view);

    void LIZ(View view, String str);

    void LIZ(View view, String str, Bitmap bitmap, boolean z);

    void LIZ(View view, String str, String str2);

    void LIZ(View view, Set<String> set);

    @Deprecated(message = "使用 onTemplateLoaded(view: View?, isOffline: Boolean, resFrom: String) 替代")
    void LIZ(View view, boolean z);

    void LIZ(View view, boolean z, String str, long j);

    void LIZ(C13039ag c13039ag);

    void LIZ(String str, AnnieResType annieResType, IHybridComponent.HybridType hybridType, Map<String, Object> map);

    void LIZ(JSONObject jSONObject, C13039ag c13039ag);

    void LIZ(boolean z);

    void LIZIZ();

    void LIZIZ(View view);

    void LIZIZ(View view, String str, String str2);

    void LIZIZ(String str, AnnieResType annieResType, IHybridComponent.HybridType hybridType, Map<String, Long> map);

    void LIZJ();

    void LIZLLL();

    /* renamed from: LJ */
    void mo15986LJ();

    void LJFF();

    void LJI();

    void LJII();

    void LJIIIIZZ();

    void LJIIIZ();

    void LJIIJ();
}
