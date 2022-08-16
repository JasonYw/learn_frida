package com.bytedance.android.live.playtogether.api;

import android.content.Context;
import com.bytedance.android.live.base.IService;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.Widget;
import java.util.Map;
import p003X.AbstractC88815Kz3;

/* renamed from: com.bytedance.android.live.playtogether.api.a */
/* loaded from: classes5.dex */
public interface AbstractC5188a extends IService {
    static {
        Covode.recordClassIndex(32852);
    }

    AbstractC88815Kz3 genPlayTogetherFloatWindowPanel();

    Class<? extends Widget> getWidget();

    boolean isInstalled(Context context, String str);

    boolean launchGame(Context context, String str);

    boolean openDownloadSchema(Context context, String str);

    void openPlayTogetherPanel(Context context, Long l);

    void reportEvent(String str, Map<String, String> map);

    void techEvent(String str, Map<String, String> map);
}
