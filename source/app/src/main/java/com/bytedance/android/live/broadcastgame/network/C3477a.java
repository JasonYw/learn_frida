package com.bytedance.android.live.broadcastgame.network;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONObject;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.network.a */
/* loaded from: classes3.dex */
public final class C3477a implements C3LJ {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("game_id")
    public long LIZIZ;
    @SerializedName("config_extra")
    public String LIZJ;
    public List<String> LIZLLL;

    static {
        Covode.recordClassIndex(19881);
    }

    public C3477a() {
        this.LIZIZ = 0L;
        this.LIZJ = "";
    }

    public final List<String> LIZ() {
        Unit unit;
        String optString;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        List<String> list = this.LIZLLL;
        if (list == null) {
            list = new ArrayList<>();
            try {
                JSONArray optJSONArray = new JSONObject(this.LIZJ).optJSONArray("feedback");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null && (optString = optJSONObject.optString("text")) != null) {
                            list.add(optString);
                        }
                    }
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                Result.m30308constructorimpl(unit);
            } catch (Throwable th) {
                Result.m30308constructorimpl(ResultKt.createFailure(th));
            }
            this.LIZLLL = list;
        }
        return list;
    }

    public C3477a(C10532g c10532g) {
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 3) {
                    QV1.LJII(c10532g);
                } else {
                    this.LIZJ = QV1.LJFF(c10532g);
                }
            } else {
                this.LIZIZ = QV1.LIZJ(c10532g);
            }
        }
        c10532g.LIZ(LIZ2);
        if (this.LIZIZ == 0) {
            this.LIZIZ = 0L;
        }
        if (this.LIZJ == null) {
            this.LIZJ = "";
        }
    }
}
