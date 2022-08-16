package com.bytedance.android.live.effect.beauty.makeups;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.C2844m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p1594ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C86719KFd;
import p003X.KFF;
import p003X.KFP;
import p003X.KQ0;
import p003X.LK5;
import p003X.LLY;
import p003X.M0Q;
import p003X.View$OnClickListenerC86716KFa;

/* renamed from: com.bytedance.android.live.effect.beauty.makeups.b */
/* loaded from: classes5.dex */
public final class C4186b extends RecyclerView.Adapter<C4187a> {
    public static ChangeQuickRedirect LIZ;
    public int LIZJ;
    public KFP LIZLLL;
    public final LiveEffectContextFactory.Type LJFF;
    public final int LJI = 2131699079;
    public final List<Sticker> LIZIZ = new ArrayList();

    /* renamed from: LJ */
    public final KFF f26218LJ = new KFF(this);

    static {
        Covode.recordClassIndex(24391);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return this.LIZIZ.size() + 1;
    }

    public final void LIZ(Sticker sticker) {
        int i = 0;
        if (PatchProxy.proxy(new Object[]{sticker}, this, LIZ, false, 5).isSupported) {
            return;
        }
        int i2 = this.LIZJ;
        Iterator<Sticker> it = this.LIZIZ.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().equals(sticker)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        this.LIZJ = i + 1;
        int i3 = this.LIZJ;
        if (i3 >= 0 && i3 < getItemCount()) {
            notifyItemChanged(i2);
            notifyItemChanged(this.LIZJ);
        }
    }

    /* renamed from: com.bytedance.android.live.effect.beauty.makeups.b$a */
    /* loaded from: classes5.dex */
    public final class C4187a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(24392);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4187a(C4186b c4186b, View view) {
            super(view);
            C106862S5w.LIZ(view);
        }
    }

    public C4186b(int i, LiveEffectContextFactory.Type type) {
        C106862S5w.LIZ(type);
        this.LJFF = type;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ C4187a onCreateViewHolder(ViewGroup viewGroup, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewGroup, Integer.valueOf(i)}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C4187a) proxy.result;
        }
        C106862S5w.LIZ(viewGroup);
        View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(viewGroup.getContext()), this.LJI, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        return new C4187a(this, LIZ2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(C4187a c4187a, int i) {
        C4187a c4187a2 = c4187a;
        if (!PatchProxy.proxy(new Object[]{c4187a2, Integer.valueOf(i)}, this, LIZ, false, 3).isSupported) {
            C106862S5w.LIZ(c4187a2);
            if (this.LIZJ == i) {
                View view = c4187a2.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "");
                View findViewById = view.findViewById(2131168140);
                Intrinsics.checkNotNullExpressionValue(findViewById, "");
                findViewById.setVisibility(0);
                View view2 = c4187a2.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "");
                View view3 = c4187a2.itemView;
                Intrinsics.checkNotNullExpressionValue(view3, "");
                Context context = view3.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ((TextView) view2.findViewById(2131172009)).setTextColor(C116971W2r.LIZ(context.getResources(), 2131628522));
            } else {
                View view4 = c4187a2.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "");
                View findViewById2 = view4.findViewById(2131168140);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "");
                findViewById2.setVisibility(4);
                View view5 = c4187a2.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "");
                ((TextView) view5.findViewById(2131172009)).setTextColor(CastProtectorUtils.parseColor("#FFFFFF"));
            }
            if (i == 0) {
                View view6 = c4187a2.itemView;
                Intrinsics.checkNotNullExpressionValue(view6, "");
                ImageView imageView = (ImageView) view6.findViewById(2131165240);
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(8);
                View view7 = c4187a2.itemView;
                Intrinsics.checkNotNullExpressionValue(view7, "");
                TextView textView = (TextView) view7.findViewById(2131172009);
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setText(LK5.LIZ(2131583086));
                View view8 = c4187a2.itemView;
                Intrinsics.checkNotNullExpressionValue(view8, "");
                ((SimpleDraweeView) view8.findViewById(2131178617)).setImageResource(2130855743);
                View view9 = c4187a2.itemView;
                Intrinsics.checkNotNullExpressionValue(view9, "");
                View findViewById3 = view9.findViewById(2131178267);
                Intrinsics.checkNotNullExpressionValue(findViewById3, "");
                findViewById3.setVisibility(8);
            } else {
                Sticker sticker = this.LIZIZ.get(i - 1);
                C2844m icon = sticker.getIcon();
                if (icon != null) {
                    View view10 = c4187a2.itemView;
                    Intrinsics.checkNotNullExpressionValue(view10, "");
                    M0Q.LIZIZ((ImageView) view10.findViewById(2131178617), new ImageModel(icon.LIZIZ, icon.LIZJ));
                }
                View view11 = c4187a2.itemView;
                Intrinsics.checkNotNullExpressionValue(view11, "");
                TextView textView2 = (TextView) view11.findViewById(2131172009);
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setText(sticker.getName());
                if (C4173o.LJIIJ.LIZ(this.LJFF).LJIIIIZZ().LIZ().LIZ(sticker)) {
                    View view12 = c4187a2.itemView;
                    Intrinsics.checkNotNullExpressionValue(view12, "");
                    ImageView imageView2 = (ImageView) view12.findViewById(2131165240);
                    Intrinsics.checkNotNullExpressionValue(imageView2, "");
                    imageView2.setVisibility(8);
                } else {
                    View view13 = c4187a2.itemView;
                    Intrinsics.checkNotNullExpressionValue(view13, "");
                    ImageView imageView3 = (ImageView) view13.findViewById(2131165240);
                    Intrinsics.checkNotNullExpressionValue(imageView3, "");
                    imageView3.setVisibility(0);
                    C4173o.LJIIJ.LIZ(this.LJFF).LJIIIIZZ().mo15785LJ().LIZ(sticker);
                }
                Effect effect = sticker.getEffect();
                if (effect != null) {
                    C4173o.LJIIJ.LIZ(this.LJFF).LJIIIIZZ().mo15785LJ().LIZ(effect, new C86719KFd(this, c4187a2));
                }
            }
            c4187a2.itemView.setOnClickListener(new View$OnClickListenerC86716KFa(this, c4187a2, i));
            LLY.LIZ(c4187a2.itemView, new KQ0(this, i, c4187a2));
        }
    }
}
