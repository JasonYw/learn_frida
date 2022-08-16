package com.bytedance.android.live.browser.jsbridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.reactivex.Observable;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;
import p003X.AbstractC101016PqM;
import p003X.AbstractC101027PqX;
import p003X.PK0;

/* renamed from: com.bytedance.android.live.browser.jsbridge.g */
/* loaded from: classes8.dex */
public interface AbstractC3973g {

    /* renamed from: com.bytedance.android.live.browser.jsbridge.g$b */
    /* loaded from: classes8.dex */
    public interface AbstractC3974b extends AbstractC3975c {
        static {
            Covode.recordClassIndex(22331);
        }

        Observable<JsonElement> LIZ(String str);
    }

    /* renamed from: com.bytedance.android.live.browser.jsbridge.g$c */
    /* loaded from: classes8.dex */
    public interface AbstractC3975c {
        static {
            Covode.recordClassIndex(22332);
        }

        String LIZJ();
    }

    /* renamed from: com.bytedance.android.live.browser.jsbridge.g$d */
    /* loaded from: classes8.dex */
    public interface AbstractC3976d {
        static {
            Covode.recordClassIndex(22333);
        }

        JsonObject LIZ();

        void LIZ(String str, JSONArray jSONArray, Function2<? super String, ? super PK0<JsonObject, JsonObject>, Unit> function2, Function1<? super String, Unit> function1);

        void LIZIZ();
    }

    static {
        Covode.recordClassIndex(22329);
    }

    Map<String, AbstractC3975c> LIZ();

    <T> void LIZ(AbstractC101027PqX<T> abstractC101027PqX, T t);

    <T> void LIZ(Function1<? super DataCenter, ? extends AbstractC101016PqM<? extends T>> function1);
}
