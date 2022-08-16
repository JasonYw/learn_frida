package com.bytedance.android.live.liveinteract.chatroom.chatroom.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.interact.model.GroupRivals;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import p003X.AbstractC80086HhY;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C3Q0;
import p003X.LK1;
import p003X.View$OnClickListenerC80082HhU;

/* loaded from: classes3.dex */
public final class PKRivalsSearchRankTabColumn extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public final List<Pair<GroupRivals.GroupType, TextView>> LIZIZ = new ArrayList();
    public GroupRivals.GroupType LIZJ;
    public AbstractC80086HhY LIZLLL;

    static {
        Covode.recordClassIndex(26527);
    }

    private final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        setBackgroundResource(2131629506);
    }

    public PKRivalsSearchRankTabColumn(Context context) {
        super(context);
        MethodCollector.m14708i(1790);
        LIZ();
        MethodCollector.m14707o(1790);
    }

    public final void setOnPageSelectListener(AbstractC80086HhY abstractC80086HhY) {
        if (PatchProxy.proxy(new Object[]{abstractC80086HhY}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC80086HhY);
        this.LIZLLL = abstractC80086HhY;
    }

    private final void setupOnClickListener(Pair<? extends GroupRivals.GroupType, ? extends TextView> pair) {
        if (PatchProxy.proxy(new Object[]{pair}, this, LIZ, false, 4).isSupported) {
            return;
        }
        pair.getSecond().setOnClickListener(new View$OnClickListenerC80082HhU(this, pair));
    }

    public final void LIZ(GroupRivals.GroupType groupType) {
        boolean z;
        int i;
        if (PatchProxy.proxy(new Object[]{groupType}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(groupType);
        List<Pair<GroupRivals.GroupType, TextView>> list = this.LIZIZ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Pair) it.next()).getFirst() == groupType) {
                    if (this.LIZJ == groupType) {
                        return;
                    }
                    this.LIZJ = groupType;
                    Iterator<T> it2 = this.LIZIZ.iterator();
                    while (it2.hasNext()) {
                        Pair pair = (Pair) it2.next();
                        if (pair.getFirst() == groupType) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Resources resources = getResources();
                        if (z) {
                            i = 2131629103;
                        } else {
                            i = 2131629104;
                        }
                        int LIZ2 = C116971W2r.LIZ(resources, i);
                        ((TextView) pair.getSecond()).setSelected(z);
                        ((TextView) pair.getSecond()).setTextColor(LIZ2);
                    }
                    AbstractC80086HhY abstractC80086HhY = this.LIZLLL;
                    if (abstractC80086HhY != null) {
                        abstractC80086HhY.LIZ(groupType);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void setupTabs(List<? extends GroupRivals.GroupType> list) {
        boolean z;
        int LIZLLL;
        MethodCollector.m14708i(1789);
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 2).isSupported) {
            MethodCollector.m14707o(1789);
            return;
        }
        C106862S5w.LIZ(list);
        this.LIZIZ.clear();
        removeAllViews();
        for (Object obj : list) {
            if (getChildCount() == 0) {
                z = true;
            } else {
                z = false;
            }
            TextView textView = new TextView(getContext());
            List<Pair<GroupRivals.GroupType, TextView>> list2 = this.LIZIZ;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).getFirst() == obj) {
                        MethodCollector.m14707o(1789);
                        return;
                    }
                }
            }
            addView(textView);
            Pair<GroupRivals.GroupType, TextView> m137to = TuplesKt.m137to(obj, textView);
            this.LIZIZ.add(m137to);
            if (z) {
                LIZLLL = 0;
            } else {
                LIZLLL = LK1.LIZLLL(16);
            }
            C3Q0.LIZLLL(textView, LIZLLL);
            setupOnClickListener(m137to);
        }
        MethodCollector.m14707o(1789);
    }

    public PKRivalsSearchRankTabColumn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(1791);
        LIZ();
        MethodCollector.m14707o(1791);
    }

    public final void LIZ(GroupRivals.GroupType groupType, String str) {
        if (PatchProxy.proxy(new Object[]{groupType, str}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(groupType, str);
        List<Pair<GroupRivals.GroupType, TextView>> list = this.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (groupType == ((Pair) obj).getFirst()) {
                arrayList.add(obj);
            }
        }
        for (Pair pair : CollectionsKt___CollectionsKt.take(arrayList, 1)) {
            ((TextView) pair.getSecond()).setText(str);
        }
    }

    public PKRivalsSearchRankTabColumn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1792);
        LIZ();
        MethodCollector.m14707o(1792);
    }
}
