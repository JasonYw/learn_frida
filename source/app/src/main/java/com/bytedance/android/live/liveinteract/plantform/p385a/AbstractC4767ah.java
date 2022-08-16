package com.bytedance.android.live.liveinteract.plantform.p385a;

import android.view.SurfaceView;
import com.bytedance.android.live.broadcast.api.p255g.AbstractC2885g;
import com.bytedance.android.live.liveinteract.api.chatroom.model.LinkApplyType;
import com.bytedance.android.live.liveinteract.api.chatroom.model.LinkMatchType;
import com.bytedance.android.live.liveinteract.api.p338b.AbstractC4264a;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.model.RoomLinkerContent;
import com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.livesdk.message.model.C8854es;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.android.livesdkapi.message.C9605p;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import p003X.AbstractC78986HBs;
import p003X.AbstractC79093HFv;
import p003X.C78567Gy9;
import p003X.C78746H2m;
import p003X.C78999HCf;
import p003X.HDJ;
import p003X.HK9;

/* renamed from: com.bytedance.android.live.liveinteract.plantform.a.ah */
/* loaded from: classes3.dex */
public interface AbstractC4767ah {
    public static final C78567Gy9 LIZIZ = C78567Gy9.LIZIZ;

    static {
        Covode.recordClassIndex(29125);
    }

    void LIZ(int i, int i2);

    void LIZ(int i, int i2, int i3, String str);

    void LIZ(int i, int i2, LinkApplyType linkApplyType, LinkMatchType linkMatchType, String str);

    void LIZ(int i, int i2, String str, LinkApplyType linkApplyType, AbstractC4264a abstractC4264a);

    void LIZ(int i, int i2, String str, String str2, Integer num, LinkApplyType linkApplyType, AbstractC4264a abstractC4264a);

    void LIZ(int i, int i2, boolean z, boolean z2, int i3);

    void LIZ(int i, HK9 hk9);

    void LIZ(int i, Integer num, String str, Boolean bool);

    void LIZ(int i, String str);

    void LIZ(int i, boolean z);

    void LIZ(long j, AbstractC79093HFv abstractC79093HFv);

    void LIZ(long j, String str, int i, int i2);

    void LIZ(SurfaceView surfaceView);

    void LIZ(C9605p c9605p);

    void LIZ(String str, int i, String str2);

    void LIZ(boolean z, List<AnchorLinkUser> list, long j, Map<Long, ? extends RoomLinkerContent> map);

    void LIZIZ(long j, long j2, boolean z);

    void LIZIZ(long j, AbstractC79093HFv abstractC79093HFv);

    void LIZIZ(long j, String str);

    void LIZIZ(String str, int i, String str2);

    boolean LIZIZ(long j);

    @Deprecated(message = "仅打Log作为参考，后续可以删除")
    void LIZJ(C8874fl c8874fl);

    /* renamed from: LJ */
    C78999HCf mo15671LJ();

    void LJFF();

    void LJII();

    AbstractC78986HBs<LinkPlayerInfo> LJIIIIZZ();

    boolean LJIIIZ();

    int LJIIJ();

    SurfaceView LJIIJJI();

    boolean LJIIL();

    AbstractC5436a LJIILIIL();

    HDJ LJIILJJIL();

    C78746H2m LJIILL();

    AbstractC2885g LJIILLIIL();

    boolean LJIJJLI();

    void LJIL();

    String LJJ();

    void LJJI();

    void LJJIFFI();

    /* renamed from: a_ */
    void mo15665a_(long j);

    AbstractC4964m ae_();

    boolean af_();

    /* renamed from: b_ */
    void mo15664b_(C8854es c8854es);
}
