package com.bytedance.android.live.media.api;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.base.IService;
import com.bytedance.covode.number.Covode;
import p003X.C458454Bb;

/* loaded from: classes12.dex */
public interface IMediaService extends IService {
    static {
        Covode.recordClassIndex(32420);
    }

    View createView(Context context, boolean z);

    int getMediaAnchorResId();

    int getMediaDetailMaskResId();

    int getMediaIntroductionResId();

    int getMediaMoveDownCloseResId();

    int getMediaTitleResId();

    int getMediaWatchNumberResId();

    void hideMediaIntroduction(View view);

    void initMediaView(View view, C458454Bb c458454Bb);

    void prepareReplayWidget(View view, boolean z);

    void setInteractionVisibility(View view, boolean z, boolean z2);
}
