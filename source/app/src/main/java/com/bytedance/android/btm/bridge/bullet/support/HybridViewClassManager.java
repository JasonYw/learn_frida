package com.bytedance.android.btm.bridge.bullet.support;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class HybridViewClassManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final HybridViewClassManager INSTANCE = new HybridViewClassManager();
    public static final List<Class<? extends View>> viewClazzList = new ArrayList();

    public final List<Class<? extends View>> getViewList() {
        return viewClazzList;
    }

    static {
        Covode.recordClassIndex(11346);
    }

    public final void addView(Class<? extends View> cls) {
        if (PatchProxy.proxy(new Object[]{cls}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(cls);
        viewClazzList.add(cls);
    }
}
