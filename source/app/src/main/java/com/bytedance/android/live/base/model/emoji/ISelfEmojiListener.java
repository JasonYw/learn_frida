package com.bytedance.android.live.base.model.emoji;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes27.dex */
public interface ISelfEmojiListener {
    static {
        Covode.recordClassIndex(14023);
    }

    void onAddSelfEmojis(List<SelfEmoji> list, boolean z, String str);

    void onDeleteSelfEmojis(List<SelfEmoji> list, boolean z, String str);

    void onGetSelfEmojis(List<SelfEmoji> list);
}
