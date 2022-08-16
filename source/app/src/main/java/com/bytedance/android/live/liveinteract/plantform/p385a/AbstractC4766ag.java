package com.bytedance.android.live.liveinteract.plantform.p385a;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.model.RoomLinkerContent;
import com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.livesdk.message.model.C8854es;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.covode.number.Covode;
import com.p1594ss.avframework.livestreamv2.core.interact.model.Config;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p003X.AbstractC78986HBs;
import p003X.C78566Gy8;
import p003X.C78746H2m;
import p003X.HAA;
import p003X.HBX;

/* renamed from: com.bytedance.android.live.liveinteract.plantform.a.ag */
/* loaded from: classes3.dex */
public interface AbstractC4766ag {
    public static final C78566Gy8 LIZ = C78566Gy8.LIZIZ;

    static {
        Covode.recordClassIndex(29122);
    }

    void LIZ(int i, int i2);

    void LIZ(int i, Integer num, String str);

    void LIZ(int i, String str, int i2, String str2);

    void LIZ(long j, long j2, boolean z);

    void LIZ(long j, long j2, boolean z, Function1<? super Boolean, Unit> function1);

    void LIZ(long j, String str);

    void LIZ(long j, boolean z);

    void LIZ(HAA haa);

    void LIZ(View view);

    void LIZ(User user);

    void LIZ(LinkPlayerInfo linkPlayerInfo);

    @Deprecated(message = "仅打Log作为参考，后续可以删除")
    void LIZ(C8874fl c8874fl);

    void LIZ(boolean z, String str);

    void LIZ(boolean z, List<AnchorLinkUser> list, long j, Map<Long, ? extends RoomLinkerContent> map);

    void LIZIZ(long j);

    void LIZIZ(long j, String str);

    void LIZIZ(long j, boolean z);

    HBX LIZJ();

    void LIZJ(long j);

    AbstractC78986HBs<LinkPlayerInfo> LIZLLL();

    boolean LIZLLL(long j);

    /* renamed from: LJ */
    void mo15673LJ(String str);

    void LJFF(String str);

    ArrayList<LinkPlayerInfo> LJI();

    long LJIIIIZZ();

    AbstractC5436a LJIIIZ();

    Config.MixStreamType LJIIJ();

    AbstractC4964m LJIIJJI();

    C78746H2m LJIIL();

    boolean LJIILIIL();

    boolean LJIILJJIL();

    String LJIILL();

    void LJIILLIIL();

    void LJIJ();

    /* renamed from: a_ */
    void mo15672a_(C8854es c8854es);
}
