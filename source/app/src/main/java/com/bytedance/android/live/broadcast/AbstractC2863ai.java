package com.bytedance.android.live.broadcast;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.broadcast.api.p255g.AbstractC2884d;
import com.bytedance.android.live.broadcast.api.p255g.AbstractC2885g;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.pushstream.p419f.AbstractC5441a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p003X.AbstractC80428Hn4;
import p003X.AbstractC81935IRd;
import p003X.AbstractC81939IRh;
import p003X.AbstractC81969ISl;
import p003X.AbstractC86605KAt;
import p003X.AbstractC86662KCy;
import p003X.AbstractC87075KSv;
import p003X.AbstractC89439LLt;
import p003X.HCC;
import p003X.HFT;
import p003X.HGX;
import p003X.HKC;
import p003X.K7O;
import p003X.K8A;

/* renamed from: com.bytedance.android.live.broadcast.ai */
/* loaded from: classes5.dex */
public interface AbstractC2863ai {
    static {
        Covode.recordClassIndex(14341);
    }

    int LIZ(AbstractC5436a abstractC5436a);

    HFT LIZ(Context context, String str);

    HGX LIZ(AbstractC5436a abstractC5436a, Context context, int i);

    AbstractC80428Hn4 LIZ(Context context);

    AbstractC81939IRh LIZ(Context context, boolean z, AbstractC81969ISl abstractC81969ISl, int i);

    AbstractC2884d LIZ(Context context, HCC hcc, String str);

    AbstractC2885g LIZ(Context context, String str, boolean z, AbstractC2885g.AbstractC2887b abstractC2887b);

    <T> Class<T> LIZ(int i);

    Object LIZ(int i, List<? extends Object> list);

    void LIZ();

    void LIZ(AbstractC86662KCy abstractC86662KCy);

    void LIZ(Context context, int i, AbstractC89439LLt abstractC89439LLt);

    void LIZ(Context context, AbstractC5436a abstractC5436a, boolean z, Function0<Unit> function0, Function0<Unit> function02);

    void LIZ(Context context, String str, Error error);

    void LIZ(FragmentActivity fragmentActivity, Room room, LiveMode liveMode);

    void LIZ(FragmentActivity fragmentActivity, Room room, LiveMode liveMode, Long l);

    void LIZ(boolean z);

    String LIZIZ();

    void LIZIZ(int i);

    void LIZIZ(FragmentActivity fragmentActivity, Room room, LiveMode liveMode);

    Observable<Integer> LIZJ();

    void LIZJ(int i);

    AbstractC86605KAt LIZLLL();

    boolean LIZLLL(int i);

    /* renamed from: LJ */
    AbstractC87075KSv mo15921LJ();

    K7O LJFF();

    AbstractC5441a LJI();

    AbstractC81935IRd LJII();

    AbstractC86662KCy LJIIIIZZ();

    HKC LJIIIZ();

    K8A LJIIJ();
}
