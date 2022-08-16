package com.bytedance.android.live.effect.soundeffect;

import android.content.Context;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.C2844m;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.base.setting.LiveEffectSettingKeys;
import com.bytedance.android.livesdk.popup.C9163d;
import com.bytedance.android.livesdkapi.depend.handler.WeakHandler;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.common.utility.Lists;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.effectmanager.effect.listener.AbstractC29868m;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C88440Kt0;
import p003X.KGJ;
import p003X.KGL;
import p003X.KGS;
import p003X.KGT;
import p003X.KGV;
import p003X.KGY;
import p003X.LK5;
import p003X.M0Q;

/* renamed from: com.bytedance.android.live.effect.soundeffect.a */
/* loaded from: classes5.dex */
public final class C4207a extends RecyclerView.Adapter<C4208a> implements b$b, WeakHandler.IHandler {
    public static ChangeQuickRedirect LIZ;
    public Context LIZIZ;
    public final KGJ LIZJ;

    /* renamed from: LJ */
    public int f26230LJ;
    public C9163d LJFF;
    public final LiveEffectContextFactory.Type LJI;
    public Sticker LJIIIIZZ;
    public List<Sticker> LJII = new ArrayList();
    public final int LJIIIZ = 2131699094;
    public final WeakHandler LIZLLL = new WeakHandler(this);

    static {
        Covode.recordClassIndex(24588);
    }

    @Override // com.bytedance.android.live.effect.soundeffect.b$b
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        C88440Kt0.LIZ(2131583063);
        this.LJIIIIZZ = null;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return this.LJII.size();
    }

    public final Sticker LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (Sticker) proxy.result;
        }
        int size = this.LJII.size();
        int i = this.f26230LJ;
        if (i >= 0 && size > i) {
            return this.LJII.get(i);
        }
        ALogger.m15800e("LiveSoundAdapter", "selectIndex illegal, index:" + this.f26230LJ + ",length = " + this.LJII.size());
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.depend.handler.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (!PatchProxy.proxy(new Object[]{message}, this, LIZ, false, 16).isSupported && message != null && message.what == 0) {
            C9163d c9163d = this.LJFF;
            if (c9163d != null) {
                c9163d.LJFF();
            }
            this.LJFF = null;
        }
    }

    /* renamed from: com.bytedance.android.live.effect.soundeffect.a$a */
    /* loaded from: classes5.dex */
    public static final class C4208a extends RecyclerView.ViewHolder {
        public static ChangeQuickRedirect LIZ;
        public ImageView LIZIZ;
        public View LIZJ;
        public View LIZLLL;

        /* renamed from: LJ */
        public View f26231LJ;
        public View LJFF;
        public HollowCircleProgressView LJI;
        public TextView LJII;
        public View LJIIIIZZ;
        public View LJIIIZ;
        public boolean LJIIJ;

        static {
            Covode.recordClassIndex(24589);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4208a(View view) {
            super(view);
            C106862S5w.LIZ(view);
            View findViewById = view.findViewById(2131168088);
            Intrinsics.checkNotNullExpressionValue(findViewById, "");
            this.LIZIZ = (ImageView) findViewById;
            View findViewById2 = view.findViewById(2131177032);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "");
            this.LIZJ = findViewById2;
            View findViewById3 = view.findViewById(2131167963);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "");
            this.LIZLLL = findViewById3;
            View findViewById4 = view.findViewById(2131179196);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "");
            this.f26231LJ = findViewById4;
            View findViewById5 = view.findViewById(2131178869);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "");
            this.LJFF = findViewById5;
            View findViewById6 = view.findViewById(2131168840);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "");
            this.LJI = (HollowCircleProgressView) findViewById6;
            View findViewById7 = view.findViewById(2131195398);
            Intrinsics.checkNotNullExpressionValue(findViewById7, "");
            this.LJII = (TextView) findViewById7;
            View findViewById8 = view.findViewById(2131187551);
            Intrinsics.checkNotNullExpressionValue(findViewById8, "");
            this.LJIIIIZZ = findViewById8;
            View findViewById9 = view.findViewById(2131178355);
            Intrinsics.checkNotNullExpressionValue(findViewById9, "");
            this.LJIIIZ = findViewById9;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void LIZ(boolean z) {
            int i = 0;
            if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 10).isSupported) {
                return;
            }
            if (!PatchProxy.proxy(new Object[]{Byte.valueOf((byte) z)}, this, LIZ, false, 13).isSupported) {
                View view = this.f26231LJ;
                if (z == 0) {
                    i = 8;
                }
                view.setVisibility(i);
                ViewParent parent = this.LJIIIZ.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(z);
                }
            }
            this.LJIIJ = z;
        }
    }

    @Override // com.bytedance.android.live.effect.soundeffect.b$b
    public final void LIZ(Sticker sticker) {
        int i = 0;
        if (PatchProxy.proxy(new Object[]{sticker}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(sticker);
        if (Sticker.Companion.LIZ(sticker, this.LJIIIIZZ)) {
            this.LJIIIIZZ = null;
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sticker}, this, LIZ, false, 12);
        if (proxy.isSupported) {
            i = ((Integer) proxy.result).intValue();
        } else {
            int size = this.LJII.size();
            while (i < size) {
                if (Sticker.Companion.LIZ(sticker, this.LJII.get(i))) {
                    this.LJII.set(i, sticker);
                } else {
                    i++;
                }
            }
            i = -1;
            ALogger.m15800e("LiveSoundAdapter", "soundItemList:ArrayIndexOutOfBounds,length = " + this.LJII.size() + ", index = " + i + ", stickerId = " + sticker.getId());
        }
        if (i >= 0) {
            notifyItemChanged(i);
            LIZ(this.LJII.get(i), true);
            return;
        }
        ALogger.m15800e("LiveSoundAdapter", "soundItemList:ArrayIndexOutOfBounds,length = " + this.LJII.size() + ", index = " + i + ", stickerId = " + sticker.getId());
    }

    public C4207a(KGJ kgj, LiveEffectContextFactory.Type type) {
        C106862S5w.LIZ(type);
        this.LJI = type;
        this.LIZJ = kgj;
    }

    @Override // com.bytedance.android.live.effect.soundeffect.b$b
    public final void LIZ(int i, C4208a c4208a) {
        HollowCircleProgressView hollowCircleProgressView;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), c4208a}, this, LIZ, false, 9).isSupported && c4208a != null && (hollowCircleProgressView = c4208a.LJI) != null) {
            hollowCircleProgressView.setProgress(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ C4208a onCreateViewHolder(ViewGroup viewGroup, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewGroup, Integer.valueOf(i)}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (C4208a) proxy.result;
        }
        C106862S5w.LIZ(viewGroup);
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.LIZIZ = context;
        View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(viewGroup.getContext()), this.LJIIIZ, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        return new C4208a(LIZ2);
    }

    public final void LIZ(Sticker sticker, AbstractC29868m abstractC29868m) {
        if (PatchProxy.proxy(new Object[]{sticker, abstractC29868m}, this, LIZ, false, 15).isSupported) {
            return;
        }
        if (sticker != null && !Lists.isEmpty(sticker.getTags())) {
            List<String> tags = sticker.getTags();
            Intrinsics.checkNotNull(tags);
            if (tags.contains("new")) {
                C4173o.LJIIJ.LIZ(this.LJI).LJIIIIZZ().LIZ().LIZ(sticker.getRealId(), sticker.getTagsUpdatedAt(), abstractC29868m);
                return;
            }
        }
        abstractC29868m.LIZIZ();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [byte, boolean] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(C4208a c4208a, int i) {
        int i2;
        C4208a c4208a2 = c4208a;
        if (!PatchProxy.proxy(new Object[]{c4208a2, Integer.valueOf(i)}, this, LIZ, false, 3).isSupported) {
            C106862S5w.LIZ(c4208a2);
            Sticker sticker = this.LJII.get(i);
            C2844m icon = sticker.getIcon();
            if (icon != null) {
                M0Q.LIZ(c4208a2.LIZIZ, icon.LIZ());
            }
            LiveEffectContextFactory.Type type = this.LJI;
            if (!PatchProxy.proxy(new Object[]{sticker, type}, null, KGL.LIZ, true, 9).isSupported) {
                C106862S5w.LIZ(sticker, type);
                KGL.LIZ(KGL.LIZJ, sticker, "live_take_voice_show", type, null, 8, null);
            }
            c4208a2.LJII.setText(sticker.getName());
            int i3 = 8;
            if (sticker.isDownloaded()) {
                c4208a2.LJFF.setVisibility(8);
                c4208a2.LJI.setVisibility(8);
            } else {
                c4208a2.LJFF.setVisibility(0);
            }
            KGJ kgj = this.LIZJ;
            if (kgj != null && kgj.LIZ(sticker)) {
                c4208a2.LJFF.setVisibility(8);
                c4208a2.LJI.setVisibility(8);
            }
            ?? LIZ2 = Sticker.Companion.LIZ(LIZ(), sticker);
            if (!PatchProxy.proxy(new Object[]{Byte.valueOf(LIZ2 == true ? (byte) 1 : (byte) 0)}, c4208a2, C4208a.LIZ, false, 11).isSupported && !PatchProxy.proxy(new Object[]{Byte.valueOf((byte) LIZ2)}, c4208a2, C4208a.LIZ, false, 12).isSupported) {
                TextView textView = c4208a2.LJII;
                if (LIZ2 != 0) {
                    i2 = 2131629321;
                } else {
                    i2 = 2131629372;
                }
                textView.setTextColor(LK5.LIZIZ(i2));
                View view = c4208a2.LIZLLL;
                if (LIZ2 != 0) {
                    i3 = 0;
                }
                view.setVisibility(i3);
            }
            LIZ(sticker, new KGY(c4208a2));
            c4208a2.LIZJ.setOnClickListener(new KGV(this, c4208a2, sticker));
            c4208a2.LIZJ.setOnLongClickListener(new KGS(this, c4208a2));
            c4208a2.LIZJ.setOnTouchListener(new KGT(this, c4208a2));
            c4208a2.setIsRecyclable(false);
        }
    }

    public final void LIZ(Sticker sticker, boolean z) {
        if (PatchProxy.proxy(new Object[]{sticker, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 13).isSupported) {
            return;
        }
        KGJ kgj = this.LIZJ;
        if (kgj != null) {
            kgj.LIZ(sticker, z);
        }
        if (z) {
            notifyDataSetChanged();
        }
    }

    public final void LIZ(List<Sticker> list, AtomicBoolean atomicBoolean) {
        if (!PatchProxy.proxy(new Object[]{list, atomicBoolean}, this, LIZ, false, 5).isSupported && list != null && atomicBoolean != null) {
            this.LJII = list;
            notifyDataSetChanged();
            if (atomicBoolean.get()) {
                SettingKey<Boolean> settingKey = LiveEffectSettingKeys.LIVE_SOUND_EFFECT_REMEMBER;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue() && LIZ() != null) {
                    Sticker LIZ2 = LIZ();
                    Intrinsics.checkNotNull(LIZ2);
                    LIZ(LIZ2, true);
                    atomicBoolean.set(false);
                    return;
                }
            }
            if (atomicBoolean.get()) {
                this.f26230LJ = 0;
                Sticker LIZ3 = LIZ();
                Intrinsics.checkNotNull(LIZ3);
                LIZ(LIZ3, true);
                atomicBoolean.set(false);
            }
        }
    }
}
