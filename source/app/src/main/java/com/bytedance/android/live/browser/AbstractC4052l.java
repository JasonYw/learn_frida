package com.bytedance.android.live.browser;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.annie.card.base.AbstractC2599d;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.live.lynx.p396a.AbstractC5152b;
import com.bytedance.android.live.p311c.AbstractC4059b;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxGroup;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.Behavior;
import com.lynx.tasm.component.DynamicComponentFetcher;
import com.lynx.tasm.provider.AbsTemplateProvider;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p003X.AbstractC99816PSw;
import p003X.LX5;

/* renamed from: com.bytedance.android.live.browser.l */
/* loaded from: classes7.dex */
public interface AbstractC4052l {
    static {
        Covode.recordClassIndex(23061);
    }

    LX5 LIZ(Activity activity, Integer num, String str, LynxThreadStrategy lynxThreadStrategy, String str2, C4053p c4053p, AbstractC2599d abstractC2599d, boolean z);

    LX5 LIZ(AbstractC4059b abstractC4059b, String str, Integer num, LynxThreadStrategy lynxThreadStrategy, String str2, C4053p c4053p);

    AbstractC99816PSw LIZ();

    Fragment LIZ(Context context, Bundle bundle, C4053p c4053p);

    AbstractC5152b LIZ(Context context, Integer num, LynxThreadStrategy lynxThreadStrategy, C4053p c4053p, String str);

    LynxGroup LIZ(String str, String[] strArr, boolean z, boolean z2, boolean z3);

    Object LIZ(Map<String, ? extends Object> map, String str);

    void LIZ(Context context);

    void LIZ(Context context, ViewGroup viewGroup, String str, boolean z);

    void LIZ(View view, Object obj, boolean z);

    void LIZ(View view, String str, String str2, int i, String str3);

    void LIZ(LynxView lynxView, String str, String str2, double d, boolean z);

    void LIZ(String str, int i, String str2);

    void LIZ(String str, JSONObject jSONObject);

    <T extends LiveRecyclableWidget> Class<T> LIZIZ();

    List<Behavior> LIZJ();

    AbsTemplateProvider LIZLLL();

    /* renamed from: LJ */
    DynamicComponentFetcher mo15824LJ();
}
