package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.broadcast.preview.base.AbstractC3175a;
import com.bytedance.android.live.broadcast.utils.flexlayout.FlexboxLayoutManager;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.C6947ec;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC445813kF;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C77347GeT;
import p003X.C86748KGg;
import p003X.C86954KOe;
import p003X.C86989KPn;
import p003X.C86990KPo;
import p003X.C86991KPp;
import p003X.C86992KPq;
import p003X.C86996KPu;
import p003X.LK1;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class PreviewToolAreaWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;

    /* renamed from: LJ */
    public boolean f26000LJ;
    public FlexboxLayoutManager LJFF;
    public GridLayoutManager LJI;
    public WidgetManager LJIILJJIL;
    public C86989KPn LJIJ;
    public final Lazy LJIILL = C77347GeT.LIZ(new PreviewToolAreaWidget$mLivePopup$2(this));
    public final Lazy LIZIZ = C77347GeT.LIZ(PreviewToolAreaWidget$mReadLocalConfig$2.INSTANCE);
    public final Lazy LJIILLIIL = C77347GeT.LIZ(new PreviewToolAreaWidget$mToolAreaConfig$2(this));
    public final Map<String, C3316bs> LJIIZILJ = new LinkedHashMap();
    public List<C3316bs> LIZJ = CollectionsKt__CollectionsKt.emptyList();
    public final Map<C3316bs, Integer> LIZLLL = new LinkedHashMap();
    public boolean LJIIL = true;
    public final int LJIILIIL = LK1.LIZLLL(16);

    static {
        Covode.recordClassIndex(18728);
    }

    private final C6947ec LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return (C6947ec) (proxy.isSupported ? proxy.result : this.LJIILLIIL.mo27335getValue());
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewToolAreaWidget";
    }

    public final C3313av LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (C3313av) (proxy.isSupported ? proxy.result : this.LJIILL.mo27335getValue());
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698484;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a181";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 19).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final int LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return LK5.LIZLLL(2131429511);
    }

    /* renamed from: LJ */
    public final void m15859LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        LJII();
        C86989KPn c86989KPn = this.LJIJ;
        if (c86989KPn != null) {
            c86989KPn.LIZ(this.LIZJ);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        super.onDestroy();
        this.LJIJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJIIZILJ.clear();
        this.LIZJ = CollectionsKt__CollectionsKt.emptyList();
    }

    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_ANCHOR_CANCEL_START_LIVE_DIFF;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            RoomCreateInfo LIZ2 = LJIIJJI().LIZIZ().LIZ();
            if (LIZ2 != null && LIZ2.LJJI == 1) {
                return false;
            }
            return true;
        }
        return LJIIJJI().LJI().LIZ().hasLastRoomInfo();
    }

    private final void LJII() {
        int i = 0;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        if (this.LJIIZILJ.isEmpty()) {
            ALogger.m15800e(LIZ(), "empty mAllToolItemMap");
            return;
        }
        List<C6947ec.C6948b> list = LJI().LIZ;
        Object obj = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                C6947ec.C6948b c6948b = (C6947ec.C6948b) next;
                if (c6948b.LIZIZ == LIZIZ() && c6948b.LIZ == LJIIJJI().LIZ().LIZ()) {
                    obj = next;
                    break;
                }
            }
            C6947ec.C6948b c6948b2 = (C6947ec.C6948b) obj;
            if (c6948b2 != null) {
                ArrayList arrayList = new ArrayList();
                List<String> list2 = c6948b2.LIZJ;
                if (list2 != null) {
                    for (String str : list2) {
                        C3316bs c3316bs = this.LJIIZILJ.get(str);
                        if (c3316bs != null) {
                            c3316bs.f26009LJ = i;
                            i++;
                            arrayList.add(c3316bs);
                        } else {
                            String LIZ2 = LIZ();
                            ALogger.m15800e(LIZ2, "can not find item with key:" + str + " in mAllToolItemMap");
                        }
                    }
                }
                this.LIZJ = arrayList;
                C86991KPp.LIZ(LIZ(this.LIZJ));
                return;
            }
        }
        String LIZ3 = LIZ();
        ALogger.m15800e(LIZ3, "can not find configItem for LiveMode:" + LJIIJJI().LIZ().LIZ().name() + ",isOldAnchor:" + LIZIZ());
        this.LIZJ = CollectionsKt__CollectionsKt.emptyList();
    }

    public final void LJFF() {
        String str;
        String str2;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported && this.f26000LJ) {
            ALogger.m15795w(LIZ(), "start to refreshAdapterVisibility");
            C86989KPn c86989KPn = this.LJIJ;
            if (c86989KPn != null) {
                for (Map.Entry<C3316bs, Integer> entry : this.LIZLLL.entrySet()) {
                    int intValue = entry.getValue().intValue();
                    if (intValue > 0) {
                        C3316bs key = entry.getKey();
                        if (!PatchProxy.proxy(new Object[]{key}, c86989KPn, C86989KPn.LIZ, false, 8).isSupported) {
                            C106862S5w.LIZ(key);
                            if (c86989KPn.LIZJ.contains(key)) {
                                ALogger.m15801d("PreviewToolAreaAdapter", key.LIZLLL + " in toolList skip add and Soft");
                            } else {
                                ALogger.m15801d("PreviewToolAreaAdapter", "start addDataAndSoft for " + key.LIZLLL + ", item priority:" + key.f26009LJ);
                                c86989KPn.LIZJ.add(key);
                                CollectionsKt__MutableCollectionsJVMKt.sort(c86989KPn.LIZJ);
                                c86989KPn.LIZ();
                                c86989KPn.LIZIZ();
                                c86989KPn.notifyDataSetChanged();
                                String str3 = key.LIZLLL;
                                AbstractC3175a abstractC3175a = key.LIZIZ;
                                if (abstractC3175a == null || (str = abstractC3175a.LIZ()) == null) {
                                    str = "widget为空";
                                }
                                C86991KPp.LIZIZ(str3, str);
                            }
                        }
                    } else if (intValue < 0) {
                        C3316bs key2 = entry.getKey();
                        if (!PatchProxy.proxy(new Object[]{key2}, c86989KPn, C86989KPn.LIZ, false, 10).isSupported) {
                            C106862S5w.LIZ(key2);
                            ALogger.m15801d("PreviewToolAreaAdapter", "start removeData for " + key2.LIZLLL);
                            c86989KPn.LIZJ.remove(key2);
                            c86989KPn.LIZ();
                            c86989KPn.LIZIZ();
                            c86989KPn.notifyDataSetChanged();
                            String str4 = key2.LIZLLL;
                            AbstractC3175a abstractC3175a2 = key2.LIZIZ;
                            if (abstractC3175a2 == null || (str2 = abstractC3175a2.LIZ()) == null) {
                                str2 = "widget为空";
                            }
                            if (!PatchProxy.proxy(new Object[]{str4, str2}, null, C86991KPp.LIZ, true, 4).isSupported) {
                                C86748KGg.LIZ("ttlive_anchor_guide_toolbar_remove_item", null, null, null, 14, null).LIZ(0).LIZ(str4).LIZ(str4, (Object) "item唯一标识符").LIZ("title", (Object) str2).LIZ().LIZ();
                            }
                        }
                    }
                }
                this.LIZLLL.clear();
                this.f26000LJ = false;
                return;
            }
            ALogger.m15800e(LIZ(), "refreshAdapterVisibility : null adapter");
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        RecyclerView recyclerView;
        RecyclerView.LayoutManager layoutManager;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onCreate();
        WidgetManager widgetManager = this.LJIILJJIL;
        if (widgetManager != null) {
            if (!PatchProxy.proxy(new Object[]{widgetManager}, this, LIZ, false, 11).isSupported) {
                this.LJIIZILJ.clear();
                Map<Widget, ViewGroup> map = widgetManager.widgetViewGroupHashMap;
                Intrinsics.checkNotNullExpressionValue(map, "");
                for (Map.Entry<Widget, ViewGroup> entry : map.entrySet()) {
                    AbstractC445813kF abstractC445813kF = (AbstractC445813kF) entry.getKey().getClass().getAnnotation(AbstractC445813kF.class);
                    if (abstractC445813kF != null) {
                        Widget key = entry.getKey();
                        if (key != null) {
                            ViewGroup value = entry.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "");
                            C3316bs c3316bs = new C3316bs((AbstractC3175a) key, value, abstractC445813kF.LIZ(), 0, 8);
                            if (c3316bs.LIZJ instanceof ToolItemFrameLayout) {
                                ((ToolItemFrameLayout) c3316bs.LIZJ).LIZIZ = null;
                                ((ToolItemFrameLayout) c3316bs.LIZJ).setVisibilityChangeListener(new C3303xe7721dc7(c3316bs, entry, abstractC445813kF, this));
                                ((ToolItemFrameLayout) c3316bs.LIZJ).setDispatchTouchEventListener(new PreviewToolAreaWidget$initAllWidgetList$1$1$2(c3316bs));
                            }
                            this.LJIIZILJ.put(abstractC445813kF.LIZ(), c3316bs);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.broadcast.preview.base.IPreviewWidget");
                        }
                    }
                }
            }
            LJII();
            if (C86996KPu.LIZ()) {
                this.LJI = new GridLayoutManager(this.context, 5);
            } else {
                FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this.context);
                flexboxLayoutManager.LIZJ(0);
                flexboxLayoutManager.LIZLLL(1);
                flexboxLayoutManager.LJFF(2);
                flexboxLayoutManager.m15879LJ(0);
                this.LJFF = flexboxLayoutManager;
            }
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "");
            C86989KPn c86989KPn = new C86989KPn(context, 5);
            PreviewToolAreaWidget$onCreate$$inlined$let$lambda$1 previewToolAreaWidget$onCreate$$inlined$let$lambda$1 = new PreviewToolAreaWidget$onCreate$$inlined$let$lambda$1(this);
            if (!PatchProxy.proxy(new Object[]{previewToolAreaWidget$onCreate$$inlined$let$lambda$1}, c86989KPn, C86989KPn.LIZ, false, 3).isSupported) {
                C106862S5w.LIZ(previewToolAreaWidget$onCreate$$inlined$let$lambda$1);
                previewToolAreaWidget$onCreate$$inlined$let$lambda$1.invoke(Integer.valueOf(c86989KPn.LIZJ.size()));
                c86989KPn.LIZLLL = previewToolAreaWidget$onCreate$$inlined$let$lambda$1;
            }
            c86989KPn.LIZ(this.LIZJ);
            this.LJIJ = c86989KPn;
            View view = this.contentView;
            if (view != null && (recyclerView = (RecyclerView) view.findViewById(2131188586)) != null) {
                if (C86996KPu.LIZ()) {
                    layoutManager = this.LJI;
                } else {
                    layoutManager = this.LJFF;
                }
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(this.LJIJ);
                recyclerView.addItemDecoration(new C86992KPq(this));
            }
            Disposable subscribe = LJIIJJI().LJI().LIZIZ().subscribe(new C86954KOe(this));
            Intrinsics.checkNotNullExpressionValue(subscribe, "");
            LIZ(subscribe);
        }
        Disposable subscribe2 = LJIIJJI().LJIILIIL().LIZIZ().subscribe(new C86990KPo(this));
        Intrinsics.checkNotNullExpressionValue(subscribe2, "");
        LIZ(subscribe2);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LIZ(LiveMode liveMode) {
        if (!PatchProxy.proxy(new Object[]{liveMode}, this, LIZ, false, 9).isSupported && liveMode != null) {
            LJII();
            C86989KPn c86989KPn = this.LJIJ;
            if (c86989KPn != null) {
                c86989KPn.LIZ(this.LIZJ);
            }
        }
    }

    private final String LIZ(List<C3316bs> list) {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 18);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        int size = list.size();
        Iterator<T> it = list.iterator();
        String str = "[";
        while (it.hasNext()) {
            str = str + ((C3316bs) it.next()).LIZLLL;
            i++;
            if (i != size) {
                str = str + ", ";
            }
        }
        return str + LoggerUtil.M_RIGHT_TAG;
    }
}
