package com.bytedance.android.live.liveinteract.chatroom.chatroom.widget;

import android.app.Activity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p347a.C4306a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.widget.PKRivalsPanelSearchWidget;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.widget.PKRivalsSearchRankListView;
import com.bytedance.android.livesdk.chatroom.interact.model.C6047ai;
import com.bytedance.android.livesdk.chatroom.interact.model.GroupRivals;
import com.bytedance.android.livesdk.chatroom.p518ui.SSLinearLayoutManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.AbstractC472394m1;
import p003X.AbstractC80011HgL;
import p003X.C106862S5w;
import p003X.C439993ar;
import p003X.C4574547f;
import p003X.C77347GeT;
import p003X.C79772HcU;
import p003X.C79919Her;
import p003X.C80068HhG;
import p003X.C80069HhH;
import p003X.C80076HhO;
import p003X.C80083HhV;
import p003X.C80084HhW;
import p003X.C82006ITw;
import p003X.C88440Kt0;
import p003X.HLJ;
import p003X.LK5;
import p003X.LLY;
import p003X.View$OnClickListenerC80067HhF;
import p003X.View$OnClickListenerC80077HhP;
import p003X.View$OnClickListenerC80085HhX;

/* loaded from: classes3.dex */
public final class PKRivalsPanelSearchWidget extends LiveRecyclableWidget implements AbstractC80011HgL, AbstractC472394m1, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public EditText LIZJ;
    public ImageView LIZLLL;
    public PKRivalsSearchRankListView LJFF;
    public PKRivalsSearchRankListView LJI;
    public final C79919Her LJIIIIZZ;
    public HLJ LJIIIZ;
    public View LJIIJ;
    public boolean LJIIJJI;
    public String LJIIL;
    public final boolean LJIILIIL;
    public ImageView LJIILJJIL;
    public RecyclerView LJIILL;
    public PKRivalsSearchHistoryView LJIILLIIL;
    public View LJIIZILJ;
    public GroupRivals.GroupType LJIJ;

    /* renamed from: LJ */
    public final List<Pair<GroupRivals.GroupType, PKRivalsSearchRankListView>> f26301LJ = new ArrayList();
    public final PagerAdapter LJIJI = new PagerAdapter() { // from class: X.97A
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(26504);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
            if (proxy.isSupported) {
                return ((Integer) proxy.result).intValue();
            }
            return PKRivalsPanelSearchWidget.this.f26301LJ.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final boolean isViewFromObject(View view, Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, obj}, this, LIZ, false, 2);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            C106862S5w.LIZ(view, obj);
            return Intrinsics.areEqual(view, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            MethodCollector.m14708i(1777);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewGroup, Integer.valueOf(i)}, this, LIZ, false, 3);
            if (proxy.isSupported) {
                Object obj = proxy.result;
                MethodCollector.m14707o(1777);
                return obj;
            }
            C106862S5w.LIZ(viewGroup);
            viewGroup.addView(PKRivalsPanelSearchWidget.this.f26301LJ.get(i).getSecond());
            PKRivalsSearchRankListView second = PKRivalsPanelSearchWidget.this.f26301LJ.get(i).getSecond();
            MethodCollector.m14707o(1777);
            return second;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            MethodCollector.m14708i(1778);
            if (PatchProxy.proxy(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, LIZ, false, 4).isSupported) {
                MethodCollector.m14707o(1778);
                return;
            }
            C106862S5w.LIZ(viewGroup, obj);
            viewGroup.removeView((View) obj);
            MethodCollector.m14707o(1778);
        }
    };
    public final Lazy LJIJJ = C77347GeT.LIZ(new PKRivalsPanelSearchWidget$mHistoryAdapter$2(this));
    public final List<String> LJII = new ArrayList();
    public final Lazy LJIJJLI = C77347GeT.LIZ(new PKRivalsPanelSearchWidget$mTextChangeListener$2(this));
    public final Lazy LJIL = C77347GeT.LIZ(new PKRivalsPanelSearchWidget$mOnEtTouchListener$2(this));

    static {
        Covode.recordClassIndex(26503);
    }

    private final C4306a LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C4306a) (proxy.isSupported ? proxy.result : this.LJIJJ.mo27335getValue());
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699888;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 27).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        RecyclerView recyclerView = this.LJIILL;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        recyclerView.setVisibility(8);
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        PKRivalsSearchHistoryView pKRivalsSearchHistoryView = this.LJIILLIIL;
        if (pKRivalsSearchHistoryView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        pKRivalsSearchHistoryView.setVisibility(8);
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        View view = this.LJIIZILJ;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        view.setVisibility(8);
    }

    @Override // p003X.AbstractC472394m1
    /* renamed from: LJ */
    public final void mo15743LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        this.LJIIIIZZ.m23729LJ();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        this.LJIIIIZZ.LIZ(this);
    }

    private final void LJI() {
        Object systemService;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            return;
        }
        Activity LIZ2 = C439993ar.LIZ(getContext());
        Object obj = null;
        if (LIZ2 != null) {
            obj = LIZ2.getSystemService("input_method");
        }
        if (obj instanceof InputMethodManager) {
            Activity LIZ3 = C439993ar.LIZ(getContext());
            if (LIZ3 != null && (systemService = LIZ3.getSystemService("input_method")) != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                EditText editText = this.LIZJ;
                if (editText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    public final void LIZLLL() {
        int i;
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            return;
        }
        EditText editText = this.LIZJ;
        String str2 = "";
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str2);
        }
        Editable text = editText.getText();
        Intrinsics.checkNotNullExpressionValue(text, str2);
        if (text.length() > 0) {
            LJI();
            C79919Her c79919Her = this.LJIIIIZZ;
            EditText editText2 = this.LIZJ;
            if (editText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str2);
            }
            c79919Her.LIZ(editText2.getText().toString(), 0, 20, "", true, this.LJIIL);
            LIZ();
            LIZIZ();
            LIZJ();
            EditText editText3 = this.LIZJ;
            if (editText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str2);
            }
            editText3.setCursorVisible(false);
            HashMap hashMap = new HashMap();
            hashMap.put("pksearch_type", "0");
            if (this.LJIIL.length() > 0) {
                str = PushConstants.INTENT_ACTIVITY_NAME;
            } else {
                str = "routine";
            }
            hashMap.put("pk_description", str);
            if (this.LJIIL.length() > 0) {
                str2 = this.LJIIL;
            }
            hashMap.put("pk_activity_type", str2);
            C4574547f.LIZ().LIZ("livesdk_pksearch_launch", hashMap, Room.class);
            return;
        }
        if (this.LJIILIIL) {
            i = 2131584278;
        } else {
            i = 2131587001;
        }
        C88440Kt0.LIZ(i);
    }

    public static final /* synthetic */ EditText LIZ(PKRivalsPanelSearchWidget pKRivalsPanelSearchWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pKRivalsPanelSearchWidget}, null, LIZ, true, 25);
        if (proxy.isSupported) {
            return (EditText) proxy.result;
        }
        EditText editText = pKRivalsPanelSearchWidget.LIZJ;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return editText;
    }

    public static final /* synthetic */ ImageView LIZIZ(PKRivalsPanelSearchWidget pKRivalsPanelSearchWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pKRivalsPanelSearchWidget}, null, LIZ, true, 26);
        if (proxy.isSupported) {
            return (ImageView) proxy.result;
        }
        ImageView imageView = pKRivalsPanelSearchWidget.LIZLLL;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return imageView;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 7).isSupported) {
            return;
        }
        this.LJIIIIZZ.LJFF.observe(this, new Observer<List<String>>() { // from class: X.97E
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(26511);
            }

            @Override // androidx.lifecycle.Observer
            public final /* synthetic */ void onChanged(List<String> list) {
                List<String> list2 = list;
                if (!PatchProxy.proxy(new Object[]{list2}, this, LIZ, false, 1).isSupported) {
                    PKRivalsPanelSearchWidget.this.LIZ(1, list2);
                }
            }
        });
        this.LJIIIIZZ.LJIIIIZZ.observe(this, new C80068HhG(this));
        this.LJIIIIZZ.LJIIIZ.observe(this, new C80069HhH(this));
    }

    @Override // p003X.AbstractC472394m1
    public final void LIZIZ(String str) {
        String str2;
        String str3;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 20).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJIIIIZZ.LIZ(str, 0, 20, "", true, this.LJIIL);
        LIZ(str);
        HashMap hashMap = new HashMap();
        hashMap.put("pksearch_type", "1");
        if (this.LJIIL.length() > 0) {
            str2 = PushConstants.INTENT_ACTIVITY_NAME;
        } else {
            str2 = "routine";
        }
        hashMap.put("pk_description", str2);
        if (this.LJIIL.length() > 0) {
            str3 = this.LJIIL;
        } else {
            str3 = "";
        }
        hashMap.put("pk_activity_type", str3);
        C4574547f.LIZ().LIZ("livesdk_pksearch_launch", hashMap, new Object[0]);
    }

    public final void LIZ(GroupRivals.GroupType groupType) {
        boolean z;
        if (!PatchProxy.proxy(new Object[]{groupType}, this, LIZ, false, 6).isSupported && groupType != this.LJIJ) {
            List<Pair<GroupRivals.GroupType, PKRivalsSearchRankListView>> list = this.f26301LJ;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).getFirst() == groupType) {
                        this.LJIJ = groupType;
                        View view = this.contentView;
                        Intrinsics.checkNotNullExpressionValue(view, "");
                        ((PKRivalsSearchRankTabColumn) view.findViewById(2131189014)).LIZ(groupType);
                        View view2 = this.contentView;
                        Intrinsics.checkNotNullExpressionValue(view2, "");
                        ViewPager viewPager = (ViewPager) view2.findViewById(2131189015);
                        Iterator<Pair<GroupRivals.GroupType, PKRivalsSearchRankListView>> it2 = this.f26301LJ.iterator();
                        int i = 0;
                        while (true) {
                            if (it2.hasNext()) {
                                if (it2.next().getFirst() == groupType) {
                                    break;
                                }
                                i++;
                            } else {
                                i = -1;
                                break;
                            }
                        }
                        viewPager.setCurrentItem(i, true);
                        Iterator<T> it3 = this.f26301LJ.iterator();
                        while (it3.hasNext()) {
                            Pair pair = (Pair) it3.next();
                            PKRivalsSearchRankListView pKRivalsSearchRankListView = (PKRivalsSearchRankListView) pair.getSecond();
                            if (pair.getFirst() == groupType) {
                                z = true;
                            } else {
                                z = false;
                            }
                            byte b = z ? (byte) 1 : (byte) 0;
                            byte b2 = z ? (byte) 1 : (byte) 0;
                            if (!PatchProxy.proxy(new Object[]{Byte.valueOf(b)}, pKRivalsSearchRankListView, PKRivalsSearchRankListView.LIZ, false, 4).isSupported) {
                                pKRivalsSearchRankListView.LIZIZ = z;
                                pKRivalsSearchRankListView.LIZ();
                            }
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // p003X.AbstractC80011HgL
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        LIZ();
        LIZIZ();
        LIZJ();
        LJI();
        EditText editText = this.LIZJ;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        editText.setText(str);
        this.LIZIZ = true;
        EditText editText2 = this.LIZJ;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        editText2.setCursorVisible(false);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        Object mo27335getValue;
        Object mo27335getValue2;
        MethodCollector.m14708i(1779);
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 5).isSupported) {
            MethodCollector.m14707o(1779);
            return;
        }
        View findViewById = this.LJIIJ.findViewById(2131188879);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LJIILJJIL = (ImageView) findViewById;
        ImageView imageView = this.LJIILJJIL;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        imageView.setOnClickListener(new View$OnClickListenerC80085HhX(this));
        View findViewById2 = this.LJIIJ.findViewById(2131170364);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZLLL = (ImageView) findViewById2;
        ImageView imageView2 = this.LIZLLL;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        imageView2.setOnClickListener(new View$OnClickListenerC80077HhP(this));
        View findViewById3 = this.LJIIJ.findViewById(2131188916);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LIZJ = (EditText) findViewById3;
        if (!this.LJIIJJI) {
            EditText editText = this.LIZJ;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            C82006ITw.LIZIZ(editText);
        }
        EditText editText2 = this.LIZJ;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            mo27335getValue = proxy.result;
        } else {
            mo27335getValue = this.LJIL.mo27335getValue();
        }
        editText2.setOnTouchListener((View.OnTouchListener) mo27335getValue);
        EditText editText3 = this.LIZJ;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy2.isSupported) {
            mo27335getValue2 = proxy2.result;
        } else {
            mo27335getValue2 = this.LJIJJLI.mo27335getValue();
        }
        editText3.addTextChangedListener((TextWatcher) mo27335getValue2);
        EditText editText4 = this.LIZJ;
        if (editText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        editText4.setOnEditorActionListener(new C80083HhV(this));
        View findViewById4 = findViewById(2131188937);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LJIILL = (RecyclerView) findViewById4;
        RecyclerView recyclerView = this.LJIILL;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        recyclerView.setAdapter(LJFF());
        RecyclerView recyclerView2 = this.LJIILL;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        recyclerView2.setLayoutManager(new SSLinearLayoutManager(this.context, 1, false));
        RecyclerView recyclerView3 = this.LJIILL;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        recyclerView3.setItemViewCacheSize(16);
        View findViewById5 = findViewById(2131188939);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.LJIILLIIL = (PKRivalsSearchHistoryView) findViewById5;
        PKRivalsSearchHistoryView pKRivalsSearchHistoryView = this.LJIILLIIL;
        if (pKRivalsSearchHistoryView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        pKRivalsSearchHistoryView.setCallBack(this);
        View findViewById6 = findViewById(2131188876);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LJIIZILJ = findViewById6;
        EditText editText5 = this.LIZJ;
        if (editText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        Editable text = editText5.getText();
        Intrinsics.checkNotNullExpressionValue(text, "");
        if (text.length() == 0) {
            this.LJIIIIZZ.LIZIZ();
        }
        View findViewById7 = this.LJIIJ.findViewById(2131168969);
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(new View$OnClickListenerC80067HhF(this));
        }
        View inflate = LayoutInflater.from(this.context).inflate(2131699883, (ViewGroup) null);
        if (inflate != null) {
            this.LJFF = (PKRivalsSearchRankListView) inflate;
            View inflate2 = LayoutInflater.from(this.context).inflate(2131699883, (ViewGroup) null);
            if (inflate2 != null) {
                this.LJI = (PKRivalsSearchRankListView) inflate2;
                PKRivalsSearchRankListView pKRivalsSearchRankListView = this.LJFF;
                if (pKRivalsSearchRankListView != null) {
                    DataCenter dataCenter = this.dataCenter;
                    Intrinsics.checkNotNullExpressionValue(dataCenter, "");
                    pKRivalsSearchRankListView.LIZ(dataCenter, GroupRivals.GroupType.GroupRivalsSearchPopularityRank, this.LJIIIIZZ, this.LJIILIIL);
                }
                PKRivalsSearchRankListView pKRivalsSearchRankListView2 = this.LJI;
                if (pKRivalsSearchRankListView2 != null) {
                    DataCenter dataCenter2 = this.dataCenter;
                    Intrinsics.checkNotNullExpressionValue(dataCenter2, "");
                    pKRivalsSearchRankListView2.LIZ(dataCenter2, GroupRivals.GroupType.GroupRivalsSearchHourlyRank, this.LJIIIIZZ, this.LJIILIIL);
                }
                PKRivalsSearchRankListView pKRivalsSearchRankListView3 = this.LJFF;
                if (pKRivalsSearchRankListView3 != null) {
                    this.f26301LJ.add(TuplesKt.m137to(GroupRivals.GroupType.GroupRivalsSearchPopularityRank, pKRivalsSearchRankListView3));
                }
                PKRivalsSearchRankListView pKRivalsSearchRankListView4 = this.LJI;
                if (pKRivalsSearchRankListView4 != null) {
                    this.f26301LJ.add(TuplesKt.m137to(GroupRivals.GroupType.GroupRivalsSearchHourlyRank, pKRivalsSearchRankListView4));
                }
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = this.f26301LJ.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Pair) it.next()).getFirst());
                }
                View view = this.contentView;
                Intrinsics.checkNotNullExpressionValue(view, "");
                ((PKRivalsSearchRankTabColumn) view.findViewById(2131189014)).setupTabs(arrayList);
                View view2 = this.contentView;
                Intrinsics.checkNotNullExpressionValue(view2, "");
                ViewPager viewPager = (ViewPager) view2.findViewById(2131189015);
                Intrinsics.checkNotNullExpressionValue(viewPager, "");
                viewPager.setAdapter(this.LJIJI);
                View view3 = this.contentView;
                Intrinsics.checkNotNullExpressionValue(view3, "");
                ((ViewPager) view3.findViewById(2131189015)).addOnPageChangeListener(new C80076HhO(this));
                View view4 = this.contentView;
                Intrinsics.checkNotNullExpressionValue(view4, "");
                ((PKRivalsSearchRankTabColumn) view4.findViewById(2131189014)).setOnPageSelectListener(new C80084HhW(this));
                this.LJIJI.notifyDataSetChanged();
                ImageView imageView3 = this.LJIILJJIL;
                if (imageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                LLY.LIZ((View) imageView3, LK5.LIZ(2131585797), true);
                MethodCollector.m14707o(1779);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.chatroom.chatroom.widget.PKRivalsSearchRankListView");
            MethodCollector.m14707o(1779);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.chatroom.chatroom.widget.PKRivalsSearchRankListView");
        MethodCollector.m14707o(1779);
        throw nullPointerException2;
    }

    public final void LIZ(int i, List<String> list) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), list}, this, LIZ, false, 16).isSupported && list != null) {
            if (i == 2) {
                C4306a LJFF = LJFF();
                EditText editText = this.LIZJ;
                if (editText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                int length = editText.getText().length();
                String str = this.LJIIL;
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), list, Integer.valueOf(length), str}, LJFF, C4306a.LIZ, false, 1).isSupported) {
                    C106862S5w.LIZ(list, str);
                    LJFF.LIZIZ = i;
                    LJFF.LIZJ.clear();
                    LJFF.LIZJ.addAll(list);
                    LJFF.LIZLLL = length;
                    LJFF.f26271LJ = str;
                }
                LJFF().notifyDataSetChanged();
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
                    RecyclerView recyclerView = this.LJIILL;
                    if (recyclerView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    recyclerView.setVisibility(0);
                }
            } else if (i != 1) {
            } else {
                PKRivalsSearchHistoryView pKRivalsSearchHistoryView = this.LJIILLIIL;
                if (pKRivalsSearchHistoryView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                pKRivalsSearchHistoryView.setData(list);
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
                    View view = this.LJIIZILJ;
                    if (view == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    view.setVisibility(0);
                }
                if (!list.isEmpty()) {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
                        return;
                    }
                    PKRivalsSearchHistoryView pKRivalsSearchHistoryView2 = this.LJIILLIIL;
                    if (pKRivalsSearchHistoryView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    pKRivalsSearchHistoryView2.setVisibility(0);
                    return;
                }
                LIZIZ();
            }
        }
    }

    public final Pair<String, GroupRivals> LIZ(C6047ai c6047ai, String str, GroupRivals.GroupType groupType) {
        GroupRivals groupRivals;
        C79772HcU c79772HcU;
        Map<Integer, GroupRivals> map;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c6047ai, str, groupType}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (Pair) proxy.result;
        }
        if (c6047ai != null && (c79772HcU = c6047ai.LIZIZ) != null && (map = c79772HcU.LIZJ) != null && (groupRivals = map.get(Integer.valueOf(groupType.ordinal()))) != null) {
            String str2 = groupRivals.LIZLLL;
            if (str2 != null && !TextUtils.isEmpty(str2)) {
                str = str2;
            }
        } else {
            groupRivals = null;
        }
        return TuplesKt.m137to(str, groupRivals);
    }

    public PKRivalsPanelSearchWidget(C79919Her c79919Her, HLJ hlj, View view, boolean z, String str, boolean z2) {
        C106862S5w.LIZ(c79919Her, hlj, view, str);
        this.LJIIIIZZ = c79919Her;
        this.LJIIIZ = hlj;
        this.LJIIJ = view;
        this.LJIIJJI = z;
        this.LJIIL = str;
        this.LJIILIIL = z2;
    }
}
