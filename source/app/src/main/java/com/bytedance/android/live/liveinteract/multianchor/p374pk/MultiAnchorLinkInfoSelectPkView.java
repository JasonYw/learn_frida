package com.bytedance.android.live.liveinteract.multianchor.p374pk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC79545HXf;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C79546HXg;
import p003X.LK1;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.MultiAnchorLinkInfoSelectPkView */
/* loaded from: classes3.dex */
public final class MultiAnchorLinkInfoSelectPkView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public final List<MultiAnchorLinkInfoTopSelectSubView> LIZIZ = new ArrayList();
    public final Map<View, Long> LIZJ = new HashMap();
    public final HashSet<Long> LIZLLL = new HashSet<>();

    /* renamed from: LJ */
    public final HashSet<Long> f26354LJ = new HashSet<>();
    public AbstractC79545HXf LJFF;
    public DataCenter LJI;
    public HashMap LJII;

    static {
        Covode.recordClassIndex(28158);
    }

    private View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJII == null) {
            this.LJII = new HashMap();
        }
        View view = (View) this.LJII.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJII.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final List<Long> getSelectedAnchorsId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        return CollectionsKt___CollectionsKt.toList(this.LIZLLL);
    }

    private void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        for (MultiAnchorLinkInfoTopSelectSubView multiAnchorLinkInfoTopSelectSubView : this.LIZIZ) {
            multiAnchorLinkInfoTopSelectSubView.setOnSelectedListener(new C79546HXg(this));
        }
    }

    private void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        for (MultiAnchorLinkInfoTopSelectSubView multiAnchorLinkInfoTopSelectSubView : this.LIZIZ) {
            multiAnchorLinkInfoTopSelectSubView.setOnSelectedListener(null);
        }
    }

    public final int getShowingCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
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

    /* JADX WARN: Multi-variable type inference failed */
    private final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        C116971W2r.LIZ(LayoutInflater.from(getContext()), 2131700455, (ViewGroup) this, true);
        List<MultiAnchorLinkInfoTopSelectSubView> list = this.LIZIZ;
        View LIZ2 = LIZ(2131183453);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        list.add(LIZ2);
        View LIZ3 = LIZ(2131183454);
        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
        list.add(LIZ3);
        View LIZ4 = LIZ(2131183455);
        Intrinsics.checkNotNullExpressionValue(LIZ4, "");
        list.add(LIZ4);
        View LIZ5 = LIZ(2131183456);
        Intrinsics.checkNotNullExpressionValue(LIZ5, "");
        list.add(LIZ5);
        LIZIZ();
    }

    public final void setOnSelectedAnchorChangedListener(AbstractC79545HXf abstractC79545HXf) {
        this.LJFF = abstractC79545HXf;
    }

    public MultiAnchorLinkInfoSelectPkView(Context context) {
        super(context);
        MethodCollector.m14708i(1917);
        LIZ();
        MethodCollector.m14707o(1917);
    }

    public MultiAnchorLinkInfoSelectPkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(1918);
        LIZ();
        MethodCollector.m14707o(1918);
    }

    public MultiAnchorLinkInfoSelectPkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1919);
        LIZ();
        MethodCollector.m14707o(1919);
    }

    private void LIZ(List<? extends AnchorLinkUser> list, DataCenter dataCenter, boolean z) {
        User LIZ2;
        if (PatchProxy.proxy(new Object[]{list, dataCenter, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        LIZJ();
        Intrinsics.checkNotNull(dataCenter);
        Room room = (Room) dataCenter.get("data_room", (String) new Room());
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                AnchorLinkUser anchorLinkUser = list.get(i);
                Intrinsics.checkNotNull(anchorLinkUser);
                User LIZ3 = anchorLinkUser.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                if (LIZ3.getId() == room.ownerUserId) {
                    break;
                }
                i++;
            } else {
                i = 0;
                break;
            }
        }
        if (!list.isEmpty()) {
            Collections.swap(list, 0, i);
        }
        this.LJI = dataCenter;
        this.LIZJ.clear();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        int size2 = this.LIZIZ.size();
        for (int i2 = 0; i2 < size2; i2++) {
            MultiAnchorLinkInfoTopSelectSubView multiAnchorLinkInfoTopSelectSubView = this.LIZIZ.get(i2);
            if (i2 >= arrayList2.size()) {
                if (z) {
                    LK1.LIZJ(multiAnchorLinkInfoTopSelectSubView);
                } else {
                    LK1.LIZ((View) multiAnchorLinkInfoTopSelectSubView);
                }
            } else {
                multiAnchorLinkInfoTopSelectSubView.LIZ((AnchorLinkUser) arrayList2.get(i2), this.LJI, false);
                LK1.LIZJ(multiAnchorLinkInfoTopSelectSubView);
                AnchorLinkUser anchorLinkUser2 = (AnchorLinkUser) arrayList2.get(i2);
                if (anchorLinkUser2 != null && (LIZ2 = anchorLinkUser2.LIZ()) != null) {
                    this.LIZJ.put(multiAnchorLinkInfoTopSelectSubView, Long.valueOf(LIZ2.getId()));
                    multiAnchorLinkInfoTopSelectSubView.setSelected(!this.f26354LJ.contains(Long.valueOf(LIZ2.getId())));
                    if (!this.f26354LJ.contains(Long.valueOf(LIZ2.getId())) && !this.LIZLLL.contains(Long.valueOf(LIZ2.getId()))) {
                        this.LIZLLL.add(Long.valueOf(LIZ2.getId()));
                    }
                }
            }
        }
        Iterator<Long> it = this.LIZLLL.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            Long next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            if (!this.LIZJ.values().contains(Long.valueOf(next.longValue()))) {
                it.remove();
            }
        }
        LIZIZ();
        AbstractC79545HXf abstractC79545HXf = this.LJFF;
        if (abstractC79545HXf != null) {
            abstractC79545HXf.LIZ(CollectionsKt___CollectionsKt.toList(this.LIZLLL));
        }
    }

    public static /* synthetic */ void LIZ(MultiAnchorLinkInfoSelectPkView multiAnchorLinkInfoSelectPkView, List list, DataCenter dataCenter, boolean z, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{multiAnchorLinkInfoSelectPkView, list, dataCenter, (byte) 0, 4, null}, null, LIZ, true, 5).isSupported) {
            return;
        }
        multiAnchorLinkInfoSelectPkView.LIZ(list, dataCenter, false);
    }
}
