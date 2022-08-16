package com.bytedance.android.live.broadcastgame.api;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcastgame.api.interactgame.GameInviteState;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.broadcastgame.api.model.InteractID;
import com.bytedance.android.live.broadcastgame.api.p283b.a$b;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.DataCenter;
import io.reactivex.Observable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p003X.AbstractC87212KYc;
import p003X.AbstractC88219KpR;
import p003X.KUC;

/* renamed from: com.bytedance.android.live.broadcastgame.api.f */
/* loaded from: classes5.dex */
public interface AbstractC3357f {
    static {
        Covode.recordClassIndex(19090);
    }

    KUC LIZ(Context context, String str);

    AbstractC87212KYc LIZ(Context context, long j, long j2);

    AbstractC88219KpR<C3384q, a$b> LIZ(DataCenter dataCenter);

    IAnchorGameWidget LIZ(AbstractC5436a abstractC5436a, Room room, Fragment fragment, FragmentManager fragmentManager);

    Observable<GameInviteState> LIZ();

    Observable<C5176i<Object>> LIZ(long j, long j2, String str);

    void LIZ(C3384q c3384q, Context context, DataCenter dataCenter, Function0<Unit> function0, Function0<Unit> function02);

    void LIZ(String str, Function1<? super Sticker, Unit> function1);

    void LIZ(boolean z);

    boolean LIZ(InteractID interactID);

    Observable<Object> LIZIZ();

    void LIZIZ(boolean z);

    boolean LIZJ();

    void LIZLLL();

    /* renamed from: LJ */
    C3384q mo15852LJ();

    boolean LJFF();

    void LJI();

    void LJII();
}
