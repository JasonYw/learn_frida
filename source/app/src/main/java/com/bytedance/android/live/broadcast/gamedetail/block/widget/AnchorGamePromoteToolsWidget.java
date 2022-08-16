package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.content.Context;
import android.net.Uri;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.gamedetail.order.C3100d;
import com.bytedance.android.live.broadcast.p267g.C3019c;
import com.bytedance.android.live.broadcast.promotelist.C3213g;
import com.bytedance.android.live.broadcast.welfare.packs.C3275h;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12642p;
import com.bytedance.ies.sve_core.PureWidget;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C3807516f;
import p003X.C409882Kg;
import p003X.C414642b4;
import p003X.C5LE;
import p003X.C87010KQi;
import p003X.C89026L5w;
import p003X.C89056L7a;
import p003X.C89094L8m;
import p003X.L3E;
import p003X.L61;
import p003X.L63;
import p003X.L64;
import p003X.L65;
import p003X.L68;
import p003X.L6L;
import p003X.LK5;
import p003X.QB4;

/* loaded from: classes5.dex */
public final class AnchorGamePromoteToolsWidget extends PureWidget<C3082b> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public TextView LIZIZ;
    public Disposable LIZJ;
    public RecyclerView LIZLLL;

    /* renamed from: LJ */
    public TextView f25860LJ;
    public LinearLayout LJFF;

    static {
        Covode.recordClassIndex(16310);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698305;
    }

    @Override // com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public AnchorGamePromoteToolsWidget() {
        super(null, 1);
    }

    @Override // com.bytedance.ies.sve_core.PureWidget, p003X.LAC
    /* renamed from: LJ */
    public final void mo14490LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.mo14490LJ();
        Disposable disposable = this.LIZJ;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.LIZLLL();
        this.LIZIZ = (TextView) this.contentView.findViewById(2131195315);
        this.LIZLLL = (RecyclerView) this.contentView.findViewById(2131188527);
        this.f25860LJ = (TextView) this.contentView.findViewById(2131194814);
        this.LJFF = (LinearLayout) this.contentView.findViewById(2131181785);
        LinearLayout linearLayout = this.LJFF;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        TextView textView = this.f25860LJ;
        if (textView != null) {
            textView.setVisibility(8);
        }
        RecyclerView recyclerView = this.LIZLLL;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this.context, 0, false));
        }
        RecyclerView recyclerView2 = this.LIZLLL;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(new L3E(0, LK5.LIZ(6.0f)));
        }
        TextView textView2 = this.LIZIZ;
        if (textView2 != null) {
            textView2.setOnClickListener(new L63(this));
        }
        Observable LIZ2 = C87010KQi.LIZ().LIZ(C3019c.class);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        this.LIZJ = QB4.LIZIZ(LIZ2).subscribe(new C89026L5w(this), C3807516f.LIZ);
        TextView textView3 = (TextView) this.contentView.findViewById(2131194456);
        C5LE c5le = C5LE.LIZIZ;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        c5le.LIZ(textView3, 600);
        TextView textView4 = (TextView) this.contentView.findViewById(2131194449);
        C5LE c5le2 = C5LE.LIZIZ;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        c5le2.LIZ(textView4, 600);
        TextView textView5 = (TextView) this.contentView.findViewById(2131194450);
        C5LE c5le3 = C5LE.LIZIZ;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        c5le3.LIZ(textView5, 600);
    }

    public final void LIZ(long j) {
        String str;
        String str2;
        String str3;
        C2WC<Room> LIZ2;
        Room LIZ3;
        C2WC<Room> LIZ4;
        Room LIZ5;
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        L64 l64 = L64.LIZJ;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        String str4 = ((C3100d) LIZ(C89094L8m.LIZ, (C89094L8m) null)).LIZIZ;
        Long valueOf = Long.valueOf(j);
        if (!PatchProxy.proxy(new Object[]{context, str4, valueOf}, l64, L64.LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(context);
            SettingKey<String> settingKey = LiveSettingKeys.LIVE_RESERVE_GIFT_LYNX_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            String value = settingKey.getValue();
            try {
                Uri parse = Uri.parse(value);
                HashMap hashMap = new HashMap();
                C5923dp LIZ6 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                if (LIZ6 == null || (LIZ4 = LIZ6.LIZ()) == null || (LIZ5 = LIZ4.LIZ()) == null || (str = String.valueOf(LIZ5.ownerUserId)) == null) {
                    str = "0";
                }
                hashMap.put("anchor_id", str);
                C5923dp LIZ7 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                if (LIZ7 == null || (LIZ2 = LIZ7.LIZ()) == null || (LIZ3 = LIZ2.LIZ()) == null || (str2 = LIZ3.getIdStr()) == null) {
                    str2 = "0";
                }
                hashMap.put("room_id", str2);
                if (str4 == null) {
                    str4 = "";
                }
                hashMap.put("game_id", str4);
                if (valueOf == null || (str3 = String.valueOf(valueOf.longValue())) == null) {
                    str3 = "0";
                }
                hashMap.put("pack_count", str3);
                String LIZIZ = C414642b4.LIZIZ(value, hashMap);
                String queryParameter = parse.getQueryParameter("fallback_url");
                Uri build = Uri.parse(LIZIZ).buildUpon().appendQueryParameter("hybrid_type", "lynx").build();
                Intrinsics.checkNotNullExpressionValue(build, "");
                l64.LIZ(context, build, queryParameter);
            } catch (Exception e) {
                L6L.LIZIZ.LIZLLL("GamePromoteHybrid", e.toString());
            }
        }
    }

    @Override // p003X.LAL
    public final /* synthetic */ void LIZ(AbstractC12642p abstractC12642p) {
        List<C3275h> list;
        List<C3275h> list2;
        TextView textView;
        C3082b c3082b = (C3082b) abstractC12642p;
        if (!PatchProxy.proxy(new Object[]{c3082b}, this, LIZ, false, 3).isSupported) {
            C106862S5w.LIZ(c3082b);
            String str = c3082b.LIZ;
            if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 5).isSupported && (textView = this.LIZIZ) != null) {
                if (str != null && StringsKt__StringsJVMKt.isBlank(str)) {
                    str = "设置";
                }
                textView.setText(str);
            }
            C3213g c3213g = c3082b.LIZIZ;
            if (c3213g != null && (list = c3213g.LIZ) != null && (!list.isEmpty())) {
                LinearLayout linearLayout = this.LJFF;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                if (list.size() > 3) {
                    list2 = list.subList(0, 3);
                } else {
                    list2 = list;
                }
                Context context = this.context;
                Intrinsics.checkNotNullExpressionValue(context, "");
                C89056L7a c89056L7a = new C89056L7a(context, list2, "type_anchor_detail");
                LinearLayout linearLayout2 = this.LJFF;
                if (linearLayout2 != null) {
                    linearLayout2.setOnClickListener(new L68(this, list));
                }
                c89056L7a.LIZIZ = new L65(this, list);
                RecyclerView recyclerView = this.LIZLLL;
                if (recyclerView != null) {
                    recyclerView.setAdapter(c89056L7a);
                }
                c89056L7a.notifyDataSetChanged();
                if (c3082b.LIZIZ.LIZIZ > 3) {
                    TextView textView2 = this.f25860LJ;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    TextView textView3 = this.f25860LJ;
                    if (textView3 != null) {
                        textView3.setText(String.valueOf(c3082b.LIZIZ.LIZIZ));
                    }
                }
                LIZJ(new L61(1));
            }
        }
    }
}
