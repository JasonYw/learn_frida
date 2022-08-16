package com.bytedance.android.live.effect.api;

import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p1594ss.android.ugc.effectmanager.effect.model.Effect;
import io.reactivex.disposables.Disposable;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import p003X.C86931KNh;
import p003X.KAT;

/* renamed from: com.bytedance.android.live.effect.api.j */
/* loaded from: classes5.dex */
public interface AbstractC4169j {

    /* renamed from: com.bytedance.android.live.effect.api.j$a */
    /* loaded from: classes5.dex */
    public interface AbstractC4170a {
        static {
            Covode.recordClassIndex(24311);
        }

        void LIZ(String str, Sticker sticker, String str2, float f);
    }

    /* renamed from: com.bytedance.android.live.effect.api.j$b */
    /* loaded from: classes5.dex */
    public interface AbstractC4171b {
        static {
            Covode.recordClassIndex(24312);
        }

        void LIZ(String str, Sticker sticker);

        void LIZ(boolean z, String str, Sticker sticker);
    }

    static {
        Covode.recordClassIndex(24310);
    }

    int LIZ(String str);

    Disposable LIZ(String str, String str2, IFetchEffectListener iFetchEffectListener);

    Map<String, Map<String, Sticker>> LIZ();

    void LIZ(KAT kat);

    void LIZ(AbstractC4170a abstractC4170a);

    void LIZ(AbstractC4171b abstractC4171b);

    void LIZ(String str, Sticker sticker);

    void LIZ(String str, Sticker sticker, Sticker sticker2);

    void LIZ(String str, Sticker sticker, String str2, float f);

    void LIZ(String str, String str2);

    void LIZ(String str, List<? extends Effect> list, Function1<? super Effect, Boolean> function1);

    void LIZ(boolean z);

    Float LIZIZ(String str, String str2);

    List<Sticker> LIZIZ(String str);

    Pair<Boolean, Boolean> LIZIZ();

    void LIZIZ(AbstractC4170a abstractC4170a);

    void LIZIZ(AbstractC4171b abstractC4171b);

    void LIZIZ(String str, Sticker sticker);

    void LIZJ();

    void LIZJ(String str);

    void LIZLLL();

    /* renamed from: LJ */
    C86931KNh mo15786LJ();

    boolean LJFF();
}
