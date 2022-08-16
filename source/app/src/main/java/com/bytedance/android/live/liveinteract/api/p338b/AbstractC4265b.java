package com.bytedance.android.live.liveinteract.api.p338b;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.tetris.widgets.LiveWidget;
import com.bytedance.android.live.liveinteract.api.BaseLinkWidget;
import com.bytedance.android.live.liveinteract.api.chatroom.model.LinkApplyType;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6071r;
import com.bytedance.android.livesdk.message.model.KtvMusic;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC418632hV;
import p003X.C3BM;
import p003X.H6E;

/* renamed from: com.bytedance.android.live.liveinteract.api.b.b */
/* loaded from: classes3.dex */
public interface AbstractC4265b extends C3BM {
    static {
        Covode.recordClassIndex(25114);
    }

    LiveWidget LIZ(AbstractC6071r abstractC6071r);

    BaseLinkWidget LIZ(FragmentManager fragmentManager, AbstractC5436a abstractC5436a, AbstractC6071r abstractC6071r);

    void LIZ(int i);

    void LIZ(int i, int i2, boolean z, boolean z2, int i3);

    void LIZ(int i, String str);

    void LIZ(long j, String str);

    void LIZ(Context context, Bundle bundle);

    void LIZ(Context context, Room room, H6E h6e);

    void LIZ(Context context, String str);

    void LIZ(KtvMusic ktvMusic, String str, LinkApplyType linkApplyType, AbstractC4264a abstractC4264a);

    void LIZ(String str);

    void LIZ(String str, LinkApplyType linkApplyType);

    void LIZ(String str, boolean z);

    void LIZ(boolean z);

    void LIZ(boolean z, AbstractC418632hV abstractC418632hV);

    void LIZ(boolean z, String str);

    boolean LIZ();

    boolean LIZ(long j, boolean z);

    boolean LIZ(boolean z, long j);

    boolean LIZ(boolean z, User user);

    void LIZIZ(int i);

    boolean LIZIZ();

    boolean LIZIZ(boolean z, User user);

    void LIZJ();

    boolean LIZLLL();

    /* renamed from: LJ */
    AbstractC5436a mo15778LJ();

    String LJFF();

    void LJI();
}
