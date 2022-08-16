package com.bytedance.android.live.liveinteract.multianchor.p374pk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p003X.AbstractC79731Hbp;
import p003X.C79703HbN;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.PkSwitchMultiSelectPkView */
/* loaded from: classes3.dex */
public final class PkSwitchMultiSelectPkView extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public final List<MultiAnchorLinkInfoTopSelectSubView> LIZIZ = new ArrayList();
    public final Map<View, Long> LIZJ = new HashMap();
    public final HashSet<Long> LIZLLL = new HashSet<>();

    /* renamed from: LJ */
    public final HashSet<Long> f26357LJ = new HashSet<>();
    public DataCenter LJFF;
    public AbstractC79731Hbp LJI;

    static {
        Covode.recordClassIndex(28170);
    }

    private final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        setOrientation(0);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        for (MultiAnchorLinkInfoTopSelectSubView multiAnchorLinkInfoTopSelectSubView : this.LIZIZ) {
            multiAnchorLinkInfoTopSelectSubView.setOnSelectedListener(new C79703HbN(this));
        }
    }

    public final int getShowingCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        List<MultiAnchorLinkInfoTopSelectSubView> list = this.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((MultiAnchorLinkInfoTopSelectSubView) obj).getVisibility() == 0) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    public final void setOnSelectedAnchorChangedListener(AbstractC79731Hbp abstractC79731Hbp) {
        this.LJI = abstractC79731Hbp;
    }

    public PkSwitchMultiSelectPkView(Context context) {
        super(context);
        MethodCollector.m14708i(1926);
        LIZIZ();
        MethodCollector.m14707o(1926);
    }

    public PkSwitchMultiSelectPkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(1927);
        LIZIZ();
        MethodCollector.m14707o(1927);
    }

    public PkSwitchMultiSelectPkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1928);
        LIZIZ();
        MethodCollector.m14707o(1928);
    }
}
