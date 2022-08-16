package com.bytedance.android.live.broadcastgame;

import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import com.bytedance.android.live.broadcastgame.api.interactgame.AbstractC3360k;
import com.bytedance.android.live.broadcastgame.api.model.C3380j;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.broadcastgame.api.model.C3385r;
import com.bytedance.android.live.broadcastgame.api.model.PageDataV2;
import com.bytedance.android.live.broadcastgame.api.openplatform.AbstractC3398b;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.DataCenter;
import kotlin.jvm.functions.Function2;
import p003X.AbstractC87801Kih;
import p003X.KW5;
import p003X.KW6;

/* renamed from: com.bytedance.android.live.broadcastgame.n */
/* loaded from: classes5.dex */
public interface AbstractC3475n {
    static {
        Covode.recordClassIndex(19877);
    }

    Intent LIZ(Context context);

    AbstractC3398b LIZ(Context context, DataCenter dataCenter, long j, ViewGroup viewGroup);

    AbstractC3398b LIZ(AbstractC5436a abstractC5436a, Context context, DataCenter dataCenter, long j, ViewGroup viewGroup);

    AbstractC6524y.AbstractView$OnClickListenerC6525b LIZ();

    AbstractC6524y.AbstractView$OnClickListenerC6525b LIZ(Context context, DataCenter dataCenter, Function2<? super C3380j, ? super C3385r, ? extends AbstractC6524y.AbstractView$OnClickListenerC6525b> function2, AbstractC3360k abstractC3360k);

    AbstractC6524y.AbstractView$OnClickListenerC6525b LIZ(C3384q c3384q, AbstractC87801Kih abstractC87801Kih);

    String LIZ(String str);

    KW5 LIZIZ();

    AbstractC3398b LIZIZ(Context context, DataCenter dataCenter, long j, ViewGroup viewGroup);

    AbstractC3398b LIZIZ(AbstractC5436a abstractC5436a, Context context, DataCenter dataCenter, long j, ViewGroup viewGroup);

    KW6 LIZJ();

    boolean LIZLLL();

    /* renamed from: LJ */
    PageDataV2 mo15849LJ();

    void LJFF();

    AbstractC6524y.AbstractView$OnClickListenerC6525b LJI();
}
