package com.bytedance.android.live.broadcast.preview.base;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.covode.number.Covode;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.bytedance.android.live.broadcast.preview.base.a */
/* loaded from: classes5.dex */
public interface AbstractC3175a {
    static {
        Covode.recordClassIndex(17227);
    }

    String LIZ();

    void LIZ(C3180k c3180k);

    void LIZ(Function1<? super View, Unit> function1);

    CompositeDisposable LJIIL();

    int LJIILIIL();

    Context LJIILLIIL();
}
