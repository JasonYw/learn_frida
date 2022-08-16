package com.bytedance.android.live.liveinteract.voicechat;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.model.RoomLinkerContent;
import com.bytedance.android.livesdk.message.model.C8854es;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;
import p003X.AbstractC78116Gqs;
import p003X.AbstractC78720H1m;
import p003X.AbstractC78986HBs;
import p003X.AbstractC79061HEp;
import p003X.C79047HEb;
import p003X.HAA;
import p003X.HDJ;
import p003X.HHB;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.c */
/* loaded from: classes3.dex */
public interface AbstractC5003c {
    public static final C79047HEb LIZ = C79047HEb.LIZIZ;

    static {
        Covode.recordClassIndex(30931);
    }

    void LIZ(long j, String str);

    void LIZ(AbstractC78116Gqs abstractC78116Gqs);

    void LIZ(HAA haa);

    void LIZ(User user);

    void LIZ(C8854es c8854es);

    void LIZ(String str, boolean z);

    void LIZ(boolean z, String str, int i);

    void LIZ(boolean z, String str, int i, String str2);

    void LIZ(boolean z, List<AnchorLinkUser> list, long j, Map<Long, ? extends RoomLinkerContent> map);

    void LIZIZ(long j, String str);

    /* renamed from: LJ */
    boolean mo15654LJ();

    AbstractC78720H1m LJFF();

    void LJI();

    AbstractC78986HBs<LinkPlayerInfo> LJII();

    List<LinkPlayerInfo> LJIIIIZZ();

    List<LinkPlayerInfo> LJIIIZ();

    boolean LJIIJ();

    boolean LJIIJJI();

    boolean LJIIL();

    AbstractC79061HEp LJIILIIL();

    HHB LJIILJJIL();

    HDJ LJIILL();
}
