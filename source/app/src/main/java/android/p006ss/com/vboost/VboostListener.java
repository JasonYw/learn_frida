package android.p006ss.com.vboost;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: android.ss.com.vboost.VboostListener */
/* loaded from: classes18.dex */
public class VboostListener {

    /* renamed from: android.ss.com.vboost.VboostListener$SystemListener */
    /* loaded from: classes18.dex */
    public interface SystemListener {
        static {
            Covode.recordClassIndex(41);
        }

        void onSystemEvent(int i, int i2, Bundle bundle);
    }

    /* renamed from: android.ss.com.vboost.VboostListener$VboostApplogListener */
    /* loaded from: classes18.dex */
    public interface VboostApplogListener {
        static {
            Covode.recordClassIndex(42);
        }

        void onInternalEventV3(String str, JSONObject jSONObject, String str2, String str3, String str4);
    }

    static {
        Covode.recordClassIndex(40);
    }
}
