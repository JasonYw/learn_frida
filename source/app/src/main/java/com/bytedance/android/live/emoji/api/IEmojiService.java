package com.bytedance.android.live.emoji.api;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import com.bytedance.android.live.base.model.emoji.BaseEmoji;
import com.bytedance.android.live.base.model.emoji.EmojiUriNode;
import com.bytedance.android.live.emoji.api.p332a.AbstractC4230a;
import com.bytedance.android.live.emoji.api.p333b.C4231a;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p003X.AbstractC459134Dr;
import p003X.C134333bt7;
import p003X.C91132LvK;
import p003X.M1T;

/* loaded from: classes17.dex */
public interface IEmojiService extends AbstractC459134Dr {
    static {
        Covode.recordClassIndex(24849);
    }

    C134333bt7 createEmojiEditText(Context context, int i);

    View createEmojiSelectPanel(Context context, boolean z, int i, M1T m1t);

    View createNewEmojiSelectPanel(Context context, boolean z, int i, C91132LvK c91132LvK, AbstractC4230a abstractC4230a);

    View createVSEmojiSelectPanel(Context context, boolean z, int i, int i2, M1T m1t);

    List<BaseEmoji> getRecommendEmojiList();

    String getStringForMaxLength(String str, int i);

    Spannable parseEmojiForMiniGame(Spannable spannable, int i);

    List<C4231a> parseEmojiIndexList(CharSequence charSequence);

    List<EmojiUriNode> parseEmojiUriList(CharSequence charSequence);

    SpannableString parseEmojiV2(SpannableString spannableString, int i);

    SpannableString parseEmojiWithFontSize(Context context, CharSequence charSequence, float f, boolean z);

    Spannable parseOnlyEmoji(Spannable spannable, int i);
}
