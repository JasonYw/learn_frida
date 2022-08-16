package com.bytedance.android.live.liveinteract.videotalk.adapter;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.livesdk.message.model.C8851ep;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.adapter.n */
/* loaded from: classes3.dex */
public interface AbstractC4848n {
    static {
        Covode.recordClassIndex(29721);
    }

    int LIZ();

    void LIZ(int i, int i2);

    void LIZ(int i, RecyclerView.ViewHolder viewHolder);

    void LIZ(int i, LinkPlayerInfo linkPlayerInfo);

    void LIZ(int i, boolean z);

    void LIZ(User user, boolean z);

    void LIZ(LinkPlayerInfo linkPlayerInfo);

    void LIZ(C8851ep c8851ep);

    void LIZ(String str, boolean z);

    void LIZIZ(int i, LinkPlayerInfo linkPlayerInfo);

    void LIZIZ(LinkPlayerInfo linkPlayerInfo);

    /* renamed from: d_ */
    void mo15675d_(int i);
}
