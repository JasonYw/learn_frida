package com.bytedance.android.live.broadcast;

import android.view.View;
import com.bytedance.android.live.broadcast.api.model.C2903am;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.Widget;
import io.reactivex.Observable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.bytedance.android.live.broadcast.as */
/* loaded from: classes3.dex */
public interface AbstractC2930as {
    static {
        Covode.recordClassIndex(14605);
    }

    View LIZ(Function0<Unit> function0);

    Widget LIZ(int i);

    void LIZ();

    Observable<C5176i<C2903am>> LIZIZ(int i);
}
