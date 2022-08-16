package com.bytedance.android.live.effect.beauty.smallitem;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.C2844m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.base.setting.LiveEffectSettingKeys;
import com.bytedance.android.live.effect.n$b;
import com.bytedance.android.livesdk.chatroom.p518ui.LiveSwitchButton;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.p1594ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC86763KGv;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C86699KEj;
import p003X.C86757KGp;
import p003X.C86760KGs;
import p003X.C86762KGu;
import p003X.C86764KGw;
import p003X.C86765KGx;
import p003X.C86766KGy;
import p003X.KQ1;
import p003X.LK5;
import p003X.LLY;
import p003X.M0Q;
import p003X.View$OnClickListenerC86759KGr;
import p003X.View$OnClickListenerC86761KGt;

/* renamed from: com.bytedance.android.live.effect.beauty.smallitem.a */
/* loaded from: classes5.dex */
public final class C4190a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static ChangeQuickRedirect LIZ;
    public int LIZJ;
    public AbstractC86763KGv LIZLLL;
    public final C86757KGp LJII;
    public final LiveEffectContextFactory.Type LJIIIIZZ;
    public boolean LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final List<Sticker> LIZIZ = new ArrayList();

    /* renamed from: LJ */
    public SparseArray<Boolean> f26221LJ = new SparseArray<>();
    public SparseArray<Integer> LJFF = new SparseArray<>();
    public final Lazy LJI = LazyKt__LazyJVMKt.lazy(LiveSmallItemBeautyAdapter$handler$2.INSTANCE);

    static {
        Covode.recordClassIndex(24421);
    }

    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        SettingKey<Boolean> settingKey = LiveEffectSettingKeys.LIVE_ENABLE_BEAUTY_SWITCH_BUTTON;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (!value.booleanValue()) {
            return false;
        }
        if (this.LJIIIIZZ != LiveEffectContextFactory.Type.DEFAULT && this.LJIIIIZZ != LiveEffectContextFactory.Type.LINK) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (!LIZ()) {
            return this.LIZIZ.size();
        }
        if (this.LIZIZ.size() <= 0) {
            return 0;
        }
        return this.LIZIZ.size() + 1;
    }

    /* renamed from: com.bytedance.android.live.effect.beauty.smallitem.a$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC4191a extends RecyclerView.ViewHolder {
        public C86766KGy LIZ;

        static {
            Covode.recordClassIndex(24422);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC4191a(View view) {
            super(view);
            C106862S5w.LIZ(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (LIZ() && i == 0) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
        if (r1.intValue() >= 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int LIZ(int r10) {
        /*
            r9 = this;
            r0 = 1
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r2 = 0
            r3[r2] = r0
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.effect.beauty.smallitem.C4190a.LIZ
            r0 = 14
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r3, r9, r1, r2, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r1.result
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L1f:
            android.util.SparseArray<java.lang.Integer> r1 = r9.LJFF
            r8 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.lang.Object r4 = r1.get(r10, r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.util.List<com.bytedance.android.livesdkapi.depend.model.Sticker> r0 = r9.LIZIZ
            java.lang.Object r0 = r0.get(r10)
            com.bytedance.android.livesdkapi.depend.model.Sticker r0 = (com.bytedance.android.livesdkapi.depend.model.Sticker) r0
            java.util.List r1 = r0.getSubStickers()
            r0 = 0
            if (r1 == 0) goto L99
            java.util.Iterator r7 = r1.iterator()
            r6 = 0
        L40:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r5 = r7.next()
            com.bytedance.android.livesdkapi.depend.model.Sticker r5 = (com.bytedance.android.livesdkapi.depend.model.Sticker) r5
            X.KG5 r1 = com.bytedance.android.live.effect.api.C4173o.LJIIJ
            com.bytedance.android.live.effect.api.LiveEffectContextFactory$Type r0 = r9.LJIIIIZZ
            com.bytedance.android.live.effect.api.o r0 = r1.LIZ(r0)
            com.bytedance.android.live.effect.api.j r1 = r0.LJII()
            java.lang.String r0 = p003X.C86676KDm.LJI
            java.util.List r0 = r1.LIZIZ(r0)
            java.util.Iterator r3 = r0.iterator()
        L62:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.android.livesdkapi.depend.model.Sticker r0 = (com.bytedance.android.livesdkapi.depend.model.Sticker) r0
            java.lang.String r1 = r0.getEffectId()
            java.lang.String r0 = r5.getEffectId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L62
            if (r2 == 0) goto L96
            r8 = r6
        L80:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            if (r1 == 0) goto L99
            int r0 = r1.intValue()
            if (r0 < 0) goto L99
        L8c:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            int r0 = r1.intValue()
            return r0
        L96:
            int r6 = r6 + 1
            goto L40
        L99:
            r1 = r4
            goto L8c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.beauty.smallitem.C4190a.LIZ(int):int");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewGroup, Integer.valueOf(i)}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (RecyclerView.ViewHolder) proxy.result;
        }
        C106862S5w.LIZ(viewGroup);
        if (i == 1) {
            View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(viewGroup.getContext()), 2131699100, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            return new C86764KGw(LIZ2);
        }
        View LIZ3 = C116971W2r.LIZ(LayoutInflater.from(viewGroup.getContext()), this.LJIIJ, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
        return new C86765KGx(LIZ3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        boolean z;
        AbstractC86763KGv abstractC86763KGv;
        C86766KGy c86766KGy;
        int i3 = i;
        int i4 = 0;
        if (PatchProxy.proxy(new Object[]{viewHolder, Integer.valueOf(i3)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(viewHolder);
        if (viewHolder instanceof AbstractC4191a) {
            if (LIZ()) {
                i3--;
            }
            AbstractC4191a abstractC4191a = (AbstractC4191a) viewHolder;
            LiveSmallItemBeautyAdapter$onBindViewHolder$1 liveSmallItemBeautyAdapter$onBindViewHolder$1 = LiveSmallItemBeautyAdapter$onBindViewHolder$1.INSTANCE;
            LiveSmallItemBeautyAdapter$onBindViewHolder$2 liveSmallItemBeautyAdapter$onBindViewHolder$2 = LiveSmallItemBeautyAdapter$onBindViewHolder$2.INSTANCE;
            if (!PatchProxy.proxy(new Object[]{abstractC4191a, Integer.valueOf(i3), liveSmallItemBeautyAdapter$onBindViewHolder$1, liveSmallItemBeautyAdapter$onBindViewHolder$2}, this, LIZ, false, 7).isSupported) {
                if (this.LIZJ == i3) {
                    View view = abstractC4191a.itemView;
                    Intrinsics.checkNotNullExpressionValue(view, "");
                    View findViewById = view.findViewById(2131175486);
                    Intrinsics.checkNotNullExpressionValue(findViewById, "");
                    View findViewById2 = findViewById.findViewById(2131168140);
                    Intrinsics.checkNotNullExpressionValue(findViewById2, "");
                    findViewById2.setVisibility(0);
                    View view2 = abstractC4191a.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    View findViewById3 = view2.findViewById(2131175486);
                    Intrinsics.checkNotNullExpressionValue(findViewById3, "");
                    View view3 = abstractC4191a.itemView;
                    Intrinsics.checkNotNullExpressionValue(view3, "");
                    Context context = view3.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    ((TextView) findViewById3.findViewById(2131172009)).setTextColor(C116971W2r.LIZ(context.getResources(), 2131628522));
                } else {
                    View view4 = abstractC4191a.itemView;
                    Intrinsics.checkNotNullExpressionValue(view4, "");
                    View findViewById4 = view4.findViewById(2131174313);
                    Intrinsics.checkNotNullExpressionValue(findViewById4, "");
                    findViewById4.setVisibility(8);
                    View view5 = abstractC4191a.itemView;
                    Intrinsics.checkNotNullExpressionValue(view5, "");
                    View findViewById5 = view5.findViewById(2131175486);
                    Intrinsics.checkNotNullExpressionValue(findViewById5, "");
                    findViewById5.setVisibility(0);
                    this.f26221LJ.put(i3, Boolean.FALSE);
                    View view6 = abstractC4191a.itemView;
                    Intrinsics.checkNotNullExpressionValue(view6, "");
                    View findViewById6 = view6.findViewById(2131175486);
                    Intrinsics.checkNotNullExpressionValue(findViewById6, "");
                    View findViewById7 = findViewById6.findViewById(2131168140);
                    Intrinsics.checkNotNullExpressionValue(findViewById7, "");
                    findViewById7.setVisibility(4);
                    View view7 = abstractC4191a.itemView;
                    Intrinsics.checkNotNullExpressionValue(view7, "");
                    View findViewById8 = view7.findViewById(2131175486);
                    Intrinsics.checkNotNullExpressionValue(findViewById8, "");
                    ((TextView) findViewById8.findViewById(2131172009)).setTextColor(CastProtectorUtils.parseColor("#FFFFFF"));
                }
                C2844m icon = this.LIZIZ.get(i3).getIcon();
                if (icon != null) {
                    View view8 = abstractC4191a.itemView;
                    Intrinsics.checkNotNullExpressionValue(view8, "");
                    View findViewById9 = view8.findViewById(2131175486);
                    Intrinsics.checkNotNullExpressionValue(findViewById9, "");
                    M0Q.LIZIZ((ImageView) findViewById9.findViewById(2131178617), new ImageModel(icon.LIZIZ, icon.LIZJ));
                }
                View view9 = abstractC4191a.itemView;
                Intrinsics.checkNotNullExpressionValue(view9, "");
                View findViewById10 = view9.findViewById(2131175486);
                Intrinsics.checkNotNullExpressionValue(findViewById10, "");
                TextView textView = (TextView) findViewById10.findViewById(2131172009);
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setText(this.LIZIZ.get(i3).getName());
                Effect effect = this.LIZIZ.get(i3).getEffect();
                if (effect != null && effect.getEffectType() == 1 && !CollectionUtils.isEmpty(this.LIZIZ.get(i3).getSubStickers())) {
                    z = true;
                } else {
                    z = false;
                }
                if (!C4173o.LJIIJ.LIZ(this.LJIIIIZZ).LJIIIIZZ().LIZ().LIZ(this.LIZIZ.get(i3)) && !z) {
                    View view10 = abstractC4191a.itemView;
                    Intrinsics.checkNotNullExpressionValue(view10, "");
                    ImageView imageView = (ImageView) view10.findViewById(2131165240);
                    Intrinsics.checkNotNullExpressionValue(imageView, "");
                    imageView.setVisibility(0);
                    C86699KEj.LIZ(C4173o.LJIIJ.LIZ(this.LJIIIIZZ).LJIIIIZZ().LIZIZ(), this.LIZIZ.get(i3), true, (n$b) null, 4, (Object) null);
                } else {
                    View view11 = abstractC4191a.itemView;
                    Intrinsics.checkNotNullExpressionValue(view11, "");
                    ImageView imageView2 = (ImageView) view11.findViewById(2131165240);
                    Intrinsics.checkNotNullExpressionValue(imageView2, "");
                    imageView2.setVisibility(8);
                    if (z) {
                        Boolean bool = this.f26221LJ.get(i3, Boolean.FALSE);
                        Intrinsics.checkNotNullExpressionValue(bool, "");
                        if (bool.booleanValue()) {
                            View view12 = abstractC4191a.itemView;
                            Intrinsics.checkNotNullExpressionValue(view12, "");
                            View findViewById11 = view12.findViewById(2131174313);
                            Intrinsics.checkNotNullExpressionValue(findViewById11, "");
                            findViewById11.setVisibility(0);
                            View view13 = abstractC4191a.itemView;
                            Intrinsics.checkNotNullExpressionValue(view13, "");
                            View findViewById12 = view13.findViewById(2131175486);
                            Intrinsics.checkNotNullExpressionValue(findViewById12, "");
                            findViewById12.setVisibility(8);
                            abstractC4191a.LIZ = new C86766KGy(this.LJIIJJI, this.LJIIIIZZ);
                            View view14 = abstractC4191a.itemView;
                            Intrinsics.checkNotNullExpressionValue(view14, "");
                            RecyclerView recyclerView = (RecyclerView) view14.findViewById(2131190969);
                            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                            View view15 = abstractC4191a.itemView;
                            Intrinsics.checkNotNullExpressionValue(view15, "");
                            recyclerView.setLayoutManager(new LinearLayoutManager(view15.getContext(), 0, false));
                            View view16 = abstractC4191a.itemView;
                            Intrinsics.checkNotNullExpressionValue(view16, "");
                            RecyclerView recyclerView2 = (RecyclerView) view16.findViewById(2131190969);
                            Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                            recyclerView2.setAdapter(abstractC4191a.LIZ);
                            int LIZ2 = LIZ(i3);
                            if (LIZ2 >= 0 && (c86766KGy = abstractC4191a.LIZ) != null) {
                                c86766KGy.LIZJ = LIZ2;
                            }
                            C86766KGy c86766KGy2 = abstractC4191a.LIZ;
                            if (c86766KGy2 != null) {
                                List<Sticker> subStickers = this.LIZIZ.get(i3).getSubStickers();
                                if (subStickers == null) {
                                    subStickers = new ArrayList<>();
                                }
                                if (!PatchProxy.proxy(new Object[]{subStickers}, c86766KGy2, C86766KGy.LIZ, false, 6).isSupported) {
                                    C106862S5w.LIZ(subStickers);
                                    c86766KGy2.LIZIZ = subStickers;
                                    c86766KGy2.notifyDataSetChanged();
                                }
                            }
                            C86766KGy c86766KGy3 = abstractC4191a.LIZ;
                            if (c86766KGy3 != null) {
                                C86762KGu c86762KGu = new C86762KGu(this, i3);
                                if (!PatchProxy.proxy(new Object[]{c86762KGu}, c86766KGy3, C86766KGy.LIZ, false, 7).isSupported) {
                                    C106862S5w.LIZ(c86762KGu);
                                    c86766KGy3.LIZLLL = c86762KGu;
                                }
                            }
                            View view17 = abstractC4191a.itemView;
                            Intrinsics.checkNotNullExpressionValue(view17, "");
                            View findViewById13 = view17.findViewById(2131174313);
                            Intrinsics.checkNotNullExpressionValue(findViewById13, "");
                            TextView textView2 = (TextView) findViewById13.findViewById(2131190970);
                            Intrinsics.checkNotNullExpressionValue(textView2, "");
                            textView2.setText(this.LIZIZ.get(i3).getName());
                            View view18 = abstractC4191a.itemView;
                            Intrinsics.checkNotNullExpressionValue(view18, "");
                            View findViewById14 = view18.findViewById(2131174313);
                            Intrinsics.checkNotNullExpressionValue(findViewById14, "");
                            ((ImageView) findViewById14.findViewById(2131190968)).setOnClickListener(new View$OnClickListenerC86761KGt(this, i3, abstractC4191a));
                            List<Sticker> subStickers2 = this.LIZIZ.get(i3).getSubStickers();
                            if (subStickers2 != null) {
                                if (LIZ2 > 0) {
                                    i4 = LIZ2;
                                }
                                Sticker sticker = subStickers2.get(i4);
                                if (sticker != null && (abstractC86763KGv = this.LIZLLL) != null) {
                                    abstractC86763KGv.LIZ(sticker);
                                }
                            }
                            liveSmallItemBeautyAdapter$onBindViewHolder$1.invoke(abstractC4191a, this.LIZIZ.get(i3));
                            abstractC4191a.itemView.setOnClickListener(new View$OnClickListenerC86759KGr(this, abstractC4191a, z, liveSmallItemBeautyAdapter$onBindViewHolder$2));
                            LLY.LIZ(abstractC4191a.itemView, new KQ1(this, i3, abstractC4191a));
                        }
                    }
                }
                View view19 = abstractC4191a.itemView;
                Intrinsics.checkNotNullExpressionValue(view19, "");
                View findViewById15 = view19.findViewById(2131174313);
                Intrinsics.checkNotNullExpressionValue(findViewById15, "");
                findViewById15.setVisibility(8);
                View view20 = abstractC4191a.itemView;
                Intrinsics.checkNotNullExpressionValue(view20, "");
                View findViewById16 = view20.findViewById(2131175486);
                Intrinsics.checkNotNullExpressionValue(findViewById16, "");
                findViewById16.setVisibility(0);
                liveSmallItemBeautyAdapter$onBindViewHolder$1.invoke(abstractC4191a, this.LIZIZ.get(i3));
                abstractC4191a.itemView.setOnClickListener(new View$OnClickListenerC86759KGr(this, abstractC4191a, z, liveSmallItemBeautyAdapter$onBindViewHolder$2));
                LLY.LIZ(abstractC4191a.itemView, new KQ1(this, i3, abstractC4191a));
            }
        } else if (viewHolder instanceof C86764KGw) {
            C86764KGw c86764KGw = (C86764KGw) viewHolder;
            if (!PatchProxy.proxy(new Object[]{c86764KGw}, this, LIZ, false, 6).isSupported) {
                View view21 = c86764KGw.itemView;
                Intrinsics.checkNotNullExpressionValue(view21, "");
                LiveSwitchButton liveSwitchButton = (LiveSwitchButton) view21.findViewById(2131191197);
                Intrinsics.checkNotNullExpressionValue(liveSwitchButton, "");
                liveSwitchButton.setChecked(this.LJIIIZ);
                View view22 = c86764KGw.itemView;
                Intrinsics.checkNotNullExpressionValue(view22, "");
                TextView textView3 = (TextView) view22.findViewById(2131191323);
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                if (this.LJIIIZ) {
                    i2 = 2131583092;
                } else {
                    i2 = 2131583091;
                }
                textView3.setText(LK5.LIZ(i2));
                View view23 = c86764KGw.itemView;
                Intrinsics.checkNotNullExpressionValue(view23, "");
                ((LiveSwitchButton) view23.findViewById(2131191197)).setOnCheckedChangeListener(new C86760KGs(this, c86764KGw));
            }
        }
    }

    public C4190a(int i, int i2, LiveEffectContextFactory.Type type, boolean z) {
        C106862S5w.LIZ(type);
        this.LJIIJ = i;
        this.LJIIJJI = i2;
        this.LJIIIIZZ = type;
        this.LJIIIZ = z;
        if (!this.LJIIIZ) {
            this.LIZJ = -1;
        }
        this.LJII = new C86757KGp(this);
    }
}
