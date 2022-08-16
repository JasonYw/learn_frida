package com.bytedance.android.live.broadcast.gamedetail.block.tab;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.gamedetailv2.view.NestedChildRecyclerView;
import com.bytedance.android.live.broadcast.hybrid.uielement.GameDetailLynxCard;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12636a;
import com.bytedance.ies.sve_core.AbstractC12641j;
import com.bytedance.ies.sve_core.AbstractC12642p;
import com.bytedance.live.datacontext.C13491f;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C414642b4;
import p003X.C89032L6c;
import p003X.C89045L6p;
import p003X.C89094L8m;
import p003X.IQV;
import p003X.L5K;
import p003X.L8E;

/* loaded from: classes5.dex */
public final class GameDetailLynxTabWidget extends BaseGameDetailTabWidget<C3075c> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final String f25857LJ;
    public GameDetailLynxCard LJFF;
    public NestedChildRecyclerView LJI;
    public final C89045L6p LJII;
    public boolean LJIIIIZZ;

    static {
        Covode.recordClassIndex(16300);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699276;
    }

    @Override // com.bytedance.android.live.broadcast.gamedetail.block.tab.BaseGameDetailTabWidget, com.bytedance.ies.viewpager.PagerItemWidget, com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZJ, false, 7).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
    /* renamed from: r_ */
    public final void mo14489r_() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 3).isSupported) {
            return;
        }
        super.mo14489r_();
        GameDetailLynxCard gameDetailLynxCard = this.LJFF;
        if (gameDetailLynxCard != null) {
            gameDetailLynxCard.LIZ();
        }
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.AbstractC3123l
    public final NestedChildRecyclerView LIZJ() {
        GameDetailLynxCard gameDetailLynxCard;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 4);
        if (proxy.isSupported) {
            return (NestedChildRecyclerView) proxy.result;
        }
        NestedChildRecyclerView nestedChildRecyclerView = this.LJI;
        if ((nestedChildRecyclerView == null || !nestedChildRecyclerView.isAttachedToWindow()) && (gameDetailLynxCard = this.LJFF) != null) {
            this.LJI = LIZ(gameDetailLynxCard);
        }
        return this.LJI;
    }

    @Override // com.bytedance.android.live.broadcast.gamedetail.block.tab.BaseGameDetailTabWidget, com.bytedance.ies.sve_core.PureWidget
    public final void LIZLLL() {
        GameDetailLynxCard gameDetailLynxCard;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 1).isSupported) {
            return;
        }
        super.LIZLLL();
        View view = this.contentView;
        if (view != null) {
            gameDetailLynxCard = (GameDetailLynxCard) view.findViewById(2131182418);
        } else {
            gameDetailLynxCard = null;
        }
        this.LJFF = gameDetailLynxCard;
        GameDetailLynxCard gameDetailLynxCard2 = this.LJFF;
        if (gameDetailLynxCard2 != null) {
            gameDetailLynxCard2.setCardLifeCycle(new L8E(this));
        }
        LIZ(C89032L6c.LIZ, C89094L8m.LIZ, (Function1<? super AbstractC12641j, ? extends AbstractC12636a>) null, new GameDetailLynxTabWidget$onMount$2(this));
    }

    @Override // com.bytedance.ies.viewpager.PagerItemWidget
    public final void LJII() {
        String str;
        String str2;
        String str3;
        Map<String, String> map;
        String str4;
        String str5;
        Map<String, String> map2;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 6).isSupported) {
            return;
        }
        LIZJ(new L5K(this.LIZLLL));
        if (this.LJIIIIZZ) {
            SettingKey<Map<String, String>> settingKey = LiveSettingKeys.LIVE_DYNAMIC_DETAIL_LYNX_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            String str6 = settingKey.getValue().get(this.f25857LJ);
            HashMap hashMap = new HashMap();
            C3075c c3075c = (C3075c) LJIIZILJ();
            if (c3075c == null || (str = c3075c.LIZJ) == null) {
                str = "";
            }
            hashMap.put("promoter_id", str);
            C3075c c3075c2 = (C3075c) LJIIZILJ();
            if (c3075c2 == null || (str2 = c3075c2.LIZLLL) == null) {
                str2 = "";
            }
            hashMap.put("game_id", str2);
            C3075c c3075c3 = (C3075c) LJIIZILJ();
            if (c3075c3 == null || (str3 = c3075c3.f25858LJ) == null) {
                str3 = "";
            }
            hashMap.put("game_name", str3);
            String uri = Uri.parse(C414642b4.LIZIZ(str6, hashMap)).buildUpon().build().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "");
            GameDetailLynxCard gameDetailLynxCard = this.LJFF;
            if (gameDetailLynxCard != null) {
                Pair[] pairArr = new Pair[2];
                C89045L6p c89045L6p = this.LJII;
                if (c89045L6p != null) {
                    str4 = c89045L6p.f8756LJ;
                } else {
                    str4 = null;
                }
                pairArr[0] = TuplesKt.m137to("gameDetailInfo", str4);
                C89045L6p c89045L6p2 = this.LJII;
                if (c89045L6p2 == null || (map2 = c89045L6p2.LJIJJ) == null || (str5 = map2.get(this.f25857LJ)) == null) {
                    str5 = "";
                }
                pairArr[1] = TuplesKt.m137to("index", str5);
                gameDetailLynxCard.LIZ(uri, MapsKt__MapsKt.mapOf(pairArr));
            }
            String str7 = this.f25857LJ;
            C89045L6p c89045L6p3 = this.LJII;
            if (c89045L6p3 != null && (map = c89045L6p3.LJIJJ) != null) {
                map.put(str7, "");
            }
            this.LJIIIIZZ = false;
        }
    }

    @Override // p003X.LAL
    public final /* synthetic */ void LIZ(AbstractC12642p abstractC12642p) {
        if (!PatchProxy.proxy(new Object[]{abstractC12642p}, this, LIZJ, false, 2).isSupported) {
            C106862S5w.LIZ(abstractC12642p);
        }
    }

    private final NestedChildRecyclerView LIZ(ViewGroup viewGroup) {
        NestedChildRecyclerView LIZ;
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewGroup}, this, LIZJ, false, 5);
        if (proxy.isSupported) {
            return (NestedChildRecyclerView) proxy.result;
        }
        if (viewGroup instanceof NestedChildRecyclerView) {
            NestedChildRecyclerView nestedChildRecyclerView = (NestedChildRecyclerView) viewGroup;
            if (nestedChildRecyclerView.isAttachedToWindow()) {
                return nestedChildRecyclerView;
            }
        }
        int childCount = viewGroup.getChildCount();
        if (childCount <= 0) {
            return null;
        }
        do {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof NestedChildRecyclerView) {
                NestedChildRecyclerView nestedChildRecyclerView2 = (NestedChildRecyclerView) childAt;
                if (nestedChildRecyclerView2.isAttachedToWindow()) {
                    return nestedChildRecyclerView2;
                }
            }
            if ((childAt instanceof ViewGroup) && (LIZ = LIZ((ViewGroup) childAt)) != null) {
                return LIZ;
            }
            i++;
        } while (i < childCount);
        return null;
    }

    public GameDetailLynxTabWidget(String str, String str2) {
        C106862S5w.LIZ(str, str2);
        this.LIZLLL = str;
        this.f25857LJ = str2;
        C13491f LIZ = IQV.LIZ(C89045L6p.class);
        this.LJII = (C89045L6p) (!(LIZ instanceof C89045L6p) ? null : LIZ);
        this.LJIIIIZZ = true;
    }
}
