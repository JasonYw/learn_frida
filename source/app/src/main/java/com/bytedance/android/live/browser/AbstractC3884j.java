package com.bytedance.android.live.browser;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.bytedance.android.annie.container.fragment.C2606a;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import io.reactivex.subjects.PublishSubject;
import p003X.AbstractC100890PoK;
import p003X.C3JU;
import p003X.C3M9;
import p003X.P32;

/* renamed from: com.bytedance.android.live.browser.j */
/* loaded from: classes8.dex */
public interface AbstractC3884j {
    static {
        Covode.recordClassIndex(22036);
    }

    C3JU LIZ(Activity activity, IBrowserService.AbstractC3873d abstractC3873d, C3M9 c3m9, String str);

    P32 LIZ(Bundle bundle);

    AbstractC100890PoK LIZ(Context context, String str);

    AbstractC13049f.AbstractC13051b LIZ(Context context, PublishSubject<Pair<Integer, int[]>> publishSubject, Fragment fragment);

    String LIZ(String str);

    void LIZIZ();

    boolean LIZIZ(String str);

    void LIZJ();

    void LIZLLL();

    /* renamed from: LJ */
    C2606a mo15830LJ();
}
