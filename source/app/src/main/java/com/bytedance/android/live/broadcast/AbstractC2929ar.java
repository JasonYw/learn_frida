package com.bytedance.android.live.broadcast;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.broadcast.api.AbstractC2879d;
import com.bytedance.android.live.broadcast.model.AbstractC3155a;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.livesdkapi.AbstractC9586k;
import com.bytedance.android.livesdkapi.config.FastStartLiveConfig;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import p003X.AbstractC86821KJb;

/* renamed from: com.bytedance.android.live.broadcast.ar */
/* loaded from: classes5.dex */
public interface AbstractC2929ar {
    static {
        Covode.recordClassIndex(14604);
    }

    AbstractC86821KJb LIZ(C3199v c3199v);

    AbstractC3155a LIZ();

    AbstractC9586k.AbstractC9587a LIZ(int i, ArrayList<AbstractC9586k> arrayList, AbstractC9586k.C9588b c9588b);

    void LIZ(Context context, FastStartLiveConfig fastStartLiveConfig, ArrayList<AbstractC9586k> arrayList, AbstractC2879d abstractC2879d);

    void LIZ(FragmentActivity fragmentActivity, FastStartLiveConfig fastStartLiveConfig);

    void LIZ(FragmentActivity fragmentActivity, FastStartLiveConfig fastStartLiveConfig, ArrayList<AbstractC9586k> arrayList, AbstractC2879d abstractC2879d);

    void LIZ(String[] strArr);
}
