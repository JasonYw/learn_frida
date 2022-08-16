package com.bytedance.android.live.liveinteract.videotalk.adapter;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.livesdk.message.model.C8851ep;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9536f;
import com.bytedance.covode.number.Covode;

/* loaded from: classes3.dex */
public interface r$b {
    static {
        Covode.recordClassIndex(29747);
    }

    void LIZ();

    void LIZ(int i, RecyclerView.ViewHolder viewHolder);

    void LIZ(int i, boolean z);

    void LIZ(LinkPlayerInfo linkPlayerInfo);

    void LIZ(C8851ep c8851ep);

    void LIZ(C9536f c9536f);

    void LIZIZ(int i, boolean z);

    void LIZIZ(LinkPlayerInfo linkPlayerInfo);
}
