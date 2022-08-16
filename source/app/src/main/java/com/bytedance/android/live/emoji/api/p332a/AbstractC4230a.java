package com.bytedance.android.live.emoji.api.p332a;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.live.base.model.emoji.BaseEmoji;
import com.bytedance.android.live.base.model.emoji.SelfEmoji;
import com.bytedance.android.livesdkapi.depend.model.live.p774vs.ShowEmojiInfo;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.android.live.emoji.api.a.a */
/* loaded from: classes5.dex */
public interface AbstractC4230a {
    static {
        Covode.recordClassIndex(24851);
    }

    void LIZ();

    void LIZ(View view, BaseEmoji baseEmoji, int i, int i2, int i3, MotionEvent motionEvent);

    void LIZ(BaseEmoji baseEmoji, String str);

    void LIZ(ShowEmojiInfo showEmojiInfo, String str, String str2);

    void LIZ(String str, String str2);

    void LIZ(List<SelfEmoji> list);

    void LIZIZ();

    void LIZJ();
}
