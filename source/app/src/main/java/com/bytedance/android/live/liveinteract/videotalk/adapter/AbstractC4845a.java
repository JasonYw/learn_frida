package com.bytedance.android.live.liveinteract.videotalk.adapter;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multianchor.model.LinkmicPositionItem;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.livesdkapi.depend.model.live.audio.VoiceLiveTheme;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import p003X.C80971Hvp;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.adapter.a */
/* loaded from: classes3.dex */
public abstract class AbstractC4845a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    static {
        Covode.recordClassIndex(29667);
    }

    public abstract int LIZ(long j);

    public abstract int LIZ(long j, String str);

    public abstract List<LinkPlayerInfo> LIZ();

    public abstract void LIZ(C80971Hvp c80971Hvp);

    public abstract void LIZ(VoiceLiveTheme voiceLiveTheme);

    public abstract void LIZ(HashMap<String, Boolean> hashMap);

    public abstract void LIZ(List<? extends LinkmicPositionItem> list);

    public abstract void LIZ(boolean z);

    public abstract int LIZIZ(long j, String str);

    public abstract List<LinkmicPositionItem> LIZIZ();

    public abstract void LIZIZ(List<? extends LinkPlayerInfo> list);

    public abstract void LIZIZ(boolean z);

    public abstract void LIZJ();

    public abstract void LIZLLL();

    /* renamed from: LJ */
    public abstract void mo15694LJ();

    public abstract C80971Hvp LJFF();
}
