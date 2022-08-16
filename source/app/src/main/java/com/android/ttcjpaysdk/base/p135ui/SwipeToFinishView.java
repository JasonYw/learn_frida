package com.android.ttcjpaysdk.base.p135ui;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import p003X.C102129QJv;

/* renamed from: com.android.ttcjpaysdk.base.ui.SwipeToFinishView */
/* loaded from: classes8.dex */
public class SwipeToFinishView {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isSwipeToFinish;
    public boolean isSwipeToStart;
    public C102129QJv mySwipeView;

    static {
        Covode.recordClassIndex(6603);
    }

    public boolean isSwipeToFinish() {
        return this.isSwipeToFinish;
    }

    public SwipeToFinishView(Activity activity) {
        this.mySwipeView = new C102129QJv(this, activity);
        this.mySwipeView.setActivity(activity);
    }

    public void setEnableSwipe(boolean z) {
        if (this.mySwipeView.LIZJ != null) {
            this.mySwipeView.LIZLLL = z;
        }
    }

    public void setBackgroundColor(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported && this.mySwipeView.LIZJ != null) {
            this.mySwipeView.LIZJ.setBackgroundColor(CastProtectorUtils.parseColor(str));
        }
    }
}
