package com.bytedance.android.live.effect.sticker.p331ui;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.api.l$a;
import com.bytedance.android.live.effect.base.setting.LiveEffectSettingKeys;
import com.bytedance.android.live.effect.sticker.p331ui.C4223v;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.common.utility.Lists;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p1594ss.android.ugc.effectmanager.effect.listener.AbstractC29868m;
import com.p1594ss.android.ugc.effectmanager.effect.model.Effect;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC86668KDe;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C86604KAs;
import p003X.C86738KFw;
import p003X.C86789KHv;
import p003X.C86791KHx;
import p003X.C87010KQi;
import p003X.C88440Kt0;
import p003X.C88830KzI;
import p003X.KEQ;
import p003X.KI0;
import p003X.KI2;
import p003X.KI4;
import p003X.M0Q;
import p003X.View$OnTouchListenerC87005KQd;

/* renamed from: com.bytedance.android.live.effect.sticker.ui.v */
/* loaded from: classes5.dex */
public final class C4223v extends RecyclerView.Adapter<C4224b> implements l$a {
    public static ChangeQuickRedirect LIZ;
    public final KEQ LIZIZ;
    public Sticker LIZJ;

    /* renamed from: LJ */
    public KI4 f26242LJ;
    public Sticker LJFF;
    public final LiveEffectContextFactory.Type LJIILJJIL;
    public List<Sticker> LIZLLL = new ArrayList();
    public int LJI = -1;
    public boolean LJII = false;
    public int LJIIIIZZ = 0;
    public final Map<Long, Long> LJIIIZ = new HashMap();
    public Boolean LJIIJ = Boolean.FALSE;
    public Integer LJIIJJI = 0;
    public float LJIIL = 1.1f;
    public long LJIILIIL = 100;

    static {
        Covode.recordClassIndex(24755);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return this.LIZLLL.size();
    }

    public final int LIZIZ(Sticker sticker) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sticker}, this, LIZ, false, 15);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        for (int i = 0; i < this.LIZLLL.size(); i++) {
            if (Sticker.equals(sticker, this.LIZLLL.get(i))) {
                this.LIZLLL.set(i, sticker);
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onViewDetachedFromWindow(C4224b c4224b) {
        if (!PatchProxy.proxy(new Object[]{c4224b}, this, LIZ, false, 6).isSupported && LiveEffectSettingKeys.LIVE_STICKER_SHOW_LOG_FIX.getValue().booleanValue() && c4224b.getAdapterPosition() >= 0 && c4224b.getAdapterPosition() < this.LIZLLL.size()) {
            Sticker sticker = this.LIZLLL.get(c4224b.getAdapterPosition());
            HashMap<String, C4212af> hashMap = AbstractC86668KDe.LJIILJJIL.LIZ(LiveEffectContextFactory.Type.DEFAULT).get(this.LJIIJJI.intValue());
            if (hashMap != null) {
                hashMap.remove(String.valueOf(sticker.getId()));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onViewAttachedToWindow(C4224b c4224b) {
        if (!PatchProxy.proxy(new Object[]{c4224b}, this, LIZ, false, 5).isSupported && LiveEffectSettingKeys.LIVE_STICKER_SHOW_LOG_FIX.getValue().booleanValue() && !this.LJIIJ.booleanValue()) {
            if (this.LJIIJJI.equals(AbstractC86668KDe.LJIILIIL.LIZ(LiveEffectContextFactory.Type.DEFAULT))) {
                Sticker sticker = this.LIZLLL.get(c4224b.getAdapterPosition());
                Integer valueOf = Integer.valueOf(c4224b.getLayoutPosition() + 1);
                if (!PatchProxy.proxy(new Object[]{sticker, valueOf}, this, LIZ, false, 7).isSupported) {
                    C87010KQi.LIZ().LIZ(new C4211ad(new C4212af(sticker.getId(), sticker.isVideoUsedSticker(), valueOf.intValue())));
                }
            }
            SparseArray<HashMap<String, C4212af>> LIZ2 = AbstractC86668KDe.LJIILJJIL.LIZ(LiveEffectContextFactory.Type.DEFAULT);
            if (LIZ2.get(this.LJIIJJI.intValue()) == null) {
                LIZ2.put(this.LJIIJJI.intValue(), new HashMap<>());
            }
            Sticker sticker2 = this.LIZLLL.get(c4224b.getAdapterPosition());
            if (sticker2 != null && !LIZ2.get(this.LJIIJJI.intValue()).containsKey(String.valueOf(sticker2.getId()))) {
                LIZ2.get(this.LJIIJJI.intValue()).put(String.valueOf(sticker2.getId()), new C4212af(sticker2.getId(), sticker2.isVideoUsedSticker(), c4224b.getLayoutPosition()));
            }
        }
    }

    public final void LIZ(Sticker sticker) {
        int indexOf;
        int indexOf2;
        int indexOf3;
        if (PatchProxy.proxy(new Object[]{sticker}, this, LIZ, false, 1).isSupported) {
            return;
        }
        Sticker sticker2 = this.LIZJ;
        this.LIZJ = sticker;
        if (LiveConfigSettingKeys.LIVE_ANCHOR_USE_NEW_STICKER_DIALOG.getValue().booleanValue()) {
            if (sticker2 != null && this.LIZLLL.contains(sticker2) && sticker2 != this.LIZJ && (indexOf3 = this.LIZLLL.indexOf(sticker2)) >= 0) {
                notifyItemChanged(indexOf3);
            }
            Sticker sticker3 = this.LIZJ;
            if (sticker3 != null && this.LIZLLL.contains(sticker3) && AbstractC86668KDe.LJIILIIL.LIZ(LiveEffectContextFactory.Type.DEFAULT) != this.LJIIJJI && (indexOf2 = this.LIZLLL.indexOf(this.LIZJ)) >= 0) {
                notifyItemChanged(indexOf2);
            }
        } else if (sticker2 != null && this.LIZLLL.contains(sticker2) && (indexOf = this.LIZLLL.indexOf(sticker2)) >= 0) {
            notifyItemChanged(indexOf);
        }
        if (!LiveEffectSettingKeys.LIVE_STICKER_SHOW_LOG_FIX.getValue().booleanValue()) {
            notifyDataSetChanged();
        }
    }

    public final void LIZ(final List<Effect> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 3).isSupported) {
            return;
        }
        if (LiveConfigSettingKeys.LIVE_ANCHOR_USE_NEW_STICKER_DIALOG.getValue().booleanValue()) {
            if (list != null && !this.LJIIJ.booleanValue()) {
                this.LJIIJ = Boolean.TRUE;
                this.LIZLLL.clear();
                Observable.create(new ObservableOnSubscribe(this, list) { // from class: X.KHu
                    public static ChangeQuickRedirect LIZ;
                    public final C4223v LIZIZ;
                    public final List LIZJ;

                    static {
                        Covode.recordClassIndex(24764);
                    }

                    {
                        this.LIZIZ = this;
                        this.LIZJ = list;
                    }

                    @Override // io.reactivex.ObservableOnSubscribe
                    public final void subscribe(ObservableEmitter observableEmitter) {
                        if (PatchProxy.proxy(new Object[]{observableEmitter}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        C4223v c4223v = this.LIZIZ;
                        List<Effect> list2 = this.LIZJ;
                        if (PatchProxy.proxy(new Object[]{list2, observableEmitter}, c4223v, C4223v.LIZ, false, 20).isSupported) {
                            return;
                        }
                        for (Effect effect : list2) {
                            c4223v.LIZLLL.add(C86738KFw.LIZIZ(effect));
                        }
                        observableEmitter.onComplete();
                    }
                }).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C86791KHx(this));
                return;
            }
            return;
        }
        this.LIZLLL.clear();
        if (list == null) {
            return;
        }
        for (Effect effect : list) {
            Sticker LIZIZ = C86738KFw.LIZIZ(effect);
            LIZIZ.setDownloaded(this.LIZIZ.LIZ(LIZIZ));
            this.LIZLLL.add(LIZIZ);
        }
        notifyDataSetChanged();
    }

    @Override // com.bytedance.android.live.effect.api.l$a
    public final void LIZ(String str, Sticker sticker) {
        int LIZIZ;
        if (!PatchProxy.proxy(new Object[]{str, sticker}, this, LIZ, false, 12).isSupported && (LIZIZ = LIZIZ(sticker)) >= 0) {
            notifyItemChanged(LIZIZ);
        }
    }

    /* renamed from: com.bytedance.android.live.effect.sticker.ui.v$b */
    /* loaded from: classes5.dex */
    public class C4224b extends RecyclerView.ViewHolder {
        public ImageView LIZ;
        public View LIZIZ;
        public View LIZJ;
        public View LIZLLL;

        /* renamed from: LJ */
        public View f26243LJ;
        public MarqueeTextView LJFF;

        static {
            Covode.recordClassIndex(24763);
        }

        public C4224b(C4223v c4223v, View view) {
            super(view);
            this.LIZ = (ImageView) view.findViewById(2131167631);
            this.LIZIZ = view.findViewById(2131189196);
            this.LIZJ = view.findViewById(2131172867);
            this.LIZLLL = view.findViewById(2131168840);
            this.f26243LJ = view.findViewById(2131172719);
            this.LJFF = (MarqueeTextView) view.findViewById(2131171295);
        }
    }

    public C4223v(KEQ keq, LiveEffectContextFactory.Type type) {
        this.LIZIZ = keq;
        this.LJIILJJIL = type;
    }

    public void LIZ(Sticker sticker, AbstractC29868m abstractC29868m) {
        if (PatchProxy.proxy(new Object[]{sticker, abstractC29868m}, this, LIZ, false, 16).isSupported) {
            return;
        }
        if (sticker != null && !Lists.isEmpty(sticker.getTags()) && sticker.getTags().contains("new")) {
            this.LIZIZ.LIZ(sticker.getRealId(), sticker.getTagsUpdatedAt(), abstractC29868m);
        } else {
            abstractC29868m.LIZIZ();
        }
    }

    private void LIZ(MarqueeTextView marqueeTextView, Boolean bool) {
        TextUtils.TruncateAt truncateAt;
        int i;
        if (PatchProxy.proxy(new Object[]{marqueeTextView, bool}, this, LIZ, false, 10).isSupported) {
            return;
        }
        marqueeTextView.setMarqueeEnable(bool.booleanValue());
        marqueeTextView.setSelected(bool.booleanValue());
        if (bool.booleanValue()) {
            truncateAt = TextUtils.TruncateAt.MARQUEE;
        } else {
            truncateAt = null;
        }
        marqueeTextView.setEllipsize(truncateAt);
        if (bool.booleanValue()) {
            i = 8388611;
        } else {
            i = 17;
        }
        marqueeTextView.setGravity(i);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bytedance.android.live.effect.sticker.ui.v$b] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ C4224b onCreateViewHolder(ViewGroup viewGroup, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewGroup, Integer.valueOf(i)}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (RecyclerView.ViewHolder) proxy.result;
        }
        if (LiveConfigSettingKeys.LIVE_ANCHOR_USE_NEW_STICKER_DIALOG.getValue().booleanValue()) {
            return new C4224b(this, new C88830KzI(viewGroup.getContext()));
        }
        return new C4224b(this, C116971W2r.LIZ(LayoutInflater.from(viewGroup.getContext()), 2131699095, viewGroup, false));
    }

    @Override // com.bytedance.android.live.effect.api.l$a
    public final void LIZIZ(String str, Sticker sticker) {
        int indexOf;
        Long l;
        if (PatchProxy.proxy(new Object[]{str, sticker}, this, LIZ, false, 14).isSupported) {
            return;
        }
        if (sticker != null && this.LJIIIZ.containsKey(Long.valueOf(sticker.getId())) && (l = this.LJIIIZ.get(Long.valueOf(sticker.getId()))) != null) {
            long longValue = l.longValue();
            int i = this.LJIIIIZZ;
            long id = sticker.getId();
            LiveEffectContextFactory.Type type = this.LJIILJJIL;
            if (!PatchProxy.proxy(new Object[]{new Long(longValue), Integer.valueOf(i), new Long(id), type}, null, C86604KAs.LIZ, true, 27).isSupported) {
                C106862S5w.LIZ(type);
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("is_live", String.valueOf(i));
                hashMap.put("scene", "sticker_download");
                hashMap.put("live_type", "video_live");
                String valueOf = String.valueOf(id);
                Intrinsics.checkNotNullExpressionValue(valueOf, "");
                hashMap.put("effect_id", valueOf);
                hashMap.put("duration", String.valueOf(System.currentTimeMillis() - longValue));
                C4173o.LJIIJ.LIZ(type).LIZIZ().LIZ("livesdk_performance_anchor_bhv_monitor", hashMap);
            }
        }
        if (Sticker.equals(this.LJFF, sticker) && this.f26242LJ != null) {
            Sticker sticker2 = this.LIZJ;
            this.LIZJ = sticker;
            if (sticker2 != null && this.LIZLLL.contains(sticker2) && (indexOf = this.LIZLLL.indexOf(sticker2)) >= 0) {
                notifyItemChanged(indexOf);
            }
            this.f26242LJ.LIZ(this.LIZJ);
        }
        int LIZIZ = LIZIZ(sticker);
        if (LIZIZ >= 0) {
            notifyItemChanged(LIZIZ);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(C4224b c4224b, final int i) {
        final Sticker sticker;
        KEQ keq;
        int i2;
        final C4224b c4224b2 = c4224b;
        int i3 = 0;
        if (!PatchProxy.proxy(new Object[]{c4224b2, Integer.valueOf(i)}, this, LIZ, false, 8).isSupported && (sticker = this.LIZLLL.get(i)) != null) {
            if (LiveConfigSettingKeys.LIVE_ANCHOR_USE_NEW_STICKER_DIALOG.getValue().booleanValue()) {
                if (!sticker.isDownloaded() && this.LIZIZ != null) {
                    Observable.create(new ObservableOnSubscribe(this, sticker) { // from class: X.KHw
                        public static ChangeQuickRedirect LIZ;
                        public final C4223v LIZIZ;
                        public final Sticker LIZJ;

                        static {
                            Covode.recordClassIndex(24765);
                        }

                        {
                            this.LIZIZ = this;
                            this.LIZJ = sticker;
                        }

                        @Override // io.reactivex.ObservableOnSubscribe
                        public final void subscribe(ObservableEmitter observableEmitter) {
                            if (PatchProxy.proxy(new Object[]{observableEmitter}, this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            C4223v c4223v = this.LIZIZ;
                            Sticker sticker2 = this.LIZJ;
                            if (PatchProxy.proxy(new Object[]{sticker2, observableEmitter}, c4223v, C4223v.LIZ, false, 19).isSupported) {
                                return;
                            }
                            observableEmitter.onNext(Boolean.valueOf(c4223v.LIZIZ.LIZ(sticker2)));
                        }
                    }).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C86789KHv(this, sticker, c4224b2));
                }
            } else if (!sticker.isDownloaded() && (keq = this.LIZIZ) != null && keq.LIZ(sticker)) {
                sticker.setDownloading(false);
                sticker.setDownloaded(true);
            }
            M0Q.LIZ(c4224b2.LIZ, sticker.getIcon().LIZ());
            View view = c4224b2.LIZLLL;
            if (sticker.isDownloading()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
            View view2 = c4224b2.LIZJ;
            if (sticker.isDownloaded()) {
                i3 = 8;
            }
            view2.setVisibility(i3);
            boolean equals = Sticker.equals(this.LIZJ, sticker);
            c4224b2.LJFF.setText(sticker.getName());
            LIZ(c4224b2, sticker, Boolean.valueOf(equals));
            LIZ(sticker, new KI2(this, c4224b2));
            if (LiveConfigSettingKeys.LIVE_ANCHOR_USE_NEW_STICKER_DIALOG.getValue().booleanValue()) {
                c4224b2.itemView.setOnTouchListener(new View$OnTouchListenerC87005KQd(this));
            }
            c4224b2.itemView.setOnClickListener(new View.OnClickListener(this, i, c4224b2, sticker) { // from class: X.KHt
                public static ChangeQuickRedirect LIZ;
                public final C4223v LIZIZ;
                public final int LIZJ;
                public final C4223v.C4224b LIZLLL;

                /* renamed from: LJ */
                public final Sticker f8413LJ;

                static {
                    Covode.recordClassIndex(24766);
                }

                {
                    this.LIZIZ = this;
                    this.LIZJ = i;
                    this.LIZLLL = c4224b2;
                    this.f8413LJ = sticker;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int indexOf;
                    int LIZIZ;
                    boolean z = true;
                    if (PatchProxy.proxy(new Object[]{view3}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    C4223v c4223v = this.LIZIZ;
                    int i4 = this.LIZJ;
                    C4223v.C4224b c4224b3 = this.LIZLLL;
                    Sticker sticker2 = this.f8413LJ;
                    if (PatchProxy.proxy(new Object[]{Integer.valueOf(i4), c4224b3, sticker2, view3}, c4223v, C4223v.LIZ, false, 17).isSupported) {
                        return;
                    }
                    Sticker sticker3 = c4223v.LIZLLL.get(i4);
                    c4223v.LIZIZ.LIZ(sticker3.getRealId(), sticker3.getTagsUpdatedAt(), new AbstractC86120Jwg(c4223v, sticker3, c4224b3) { // from class: X.KHz
                        public static ChangeQuickRedirect LIZ;
                        public final C4223v LIZIZ;
                        public final Sticker LIZJ;
                        public final C4223v.C4224b LIZLLL;

                        static {
                            Covode.recordClassIndex(24767);
                        }

                        {
                            this.LIZIZ = c4223v;
                            this.LIZJ = sticker3;
                            this.LIZLLL = c4224b3;
                        }

                        @Override // p003X.AbstractC86120Jwg
                        public final void LIZ() {
                            if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            C4223v c4223v2 = this.LIZIZ;
                            Sticker sticker4 = this.LIZJ;
                            C4223v.C4224b c4224b4 = this.LIZLLL;
                            if (PatchProxy.proxy(new Object[]{sticker4, c4224b4}, c4223v2, C4223v.LIZ, false, 18).isSupported) {
                                return;
                            }
                            c4223v2.LIZ(sticker4, new KI3(c4223v2, c4224b4));
                        }
                    });
                    AbstractC86668KDe.LJIIL.LIZ(LiveEffectContextFactory.Type.DEFAULT, Integer.valueOf(i4 + 1));
                    if (!c4223v.LIZIZ.LIZ(sticker3)) {
                        c4223v.LJIIIZ.put(Long.valueOf(sticker3.getId()), Long.valueOf(System.currentTimeMillis()));
                        c4223v.LJFF = sticker3;
                        c4223v.LIZIZ.LIZ(C86676KDm.LIZLLL, sticker3, c4223v);
                    } else {
                        Sticker sticker4 = c4223v.LIZJ;
                        c4223v.LIZJ = sticker3;
                        if (Sticker.equals(c4223v.LIZJ, sticker4)) {
                            c4223v.LIZJ = null;
                            AbstractC86668KDe.LJIIL.LIZ(LiveEffectContextFactory.Type.DEFAULT, 0);
                        }
                        if (sticker4 != null && c4223v.LIZLLL.contains(sticker4) && (indexOf = c4223v.LIZLLL.indexOf(sticker4)) >= 0) {
                            if (LiveConfigSettingKeys.LIVE_ANCHOR_USE_NEW_STICKER_DIALOG.getValue().booleanValue()) {
                                if (c4223v.LIZJ != null) {
                                    c4223v.notifyItemChanged(indexOf, 1);
                                }
                            } else {
                                c4223v.notifyItemChanged(indexOf);
                            }
                        }
                        if (LiveConfigSettingKeys.LIVE_ANCHOR_USE_NEW_STICKER_DIALOG.getValue().booleanValue()) {
                            Sticker sticker5 = c4223v.LIZJ;
                            if (c4223v.LIZJ == null) {
                                z = false;
                            }
                            c4223v.LIZ(c4224b3, sticker5, Boolean.valueOf(z));
                        }
                        if (c4223v.f26242LJ != null) {
                            c4223v.f26242LJ.LIZ(c4223v.LIZJ);
                        }
                    }
                    if (LiveConfigSettingKeys.LIVE_ANCHOR_USE_NEW_STICKER_DIALOG.getValue().booleanValue() || (LIZIZ = c4223v.LIZIZ(sticker2)) < 0) {
                        return;
                    }
                    c4223v.notifyItemChanged(LIZIZ);
                }
            });
            int i4 = this.LJI;
            if (i4 >= 0 && i == i4 && !this.LJII) {
                this.LJI = -1;
                c4224b2.itemView.post(new KI0(this, c4224b2));
            }
        }
    }

    public void LIZ(C4224b c4224b, Sticker sticker, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{c4224b, sticker, bool}, this, LIZ, false, 9).isSupported) {
            return;
        }
        if (bool.booleanValue() && sticker != null) {
            c4224b.LIZIZ.setVisibility(0);
            if (sticker.getName() != null && sticker.getName().length() > 5) {
                LIZ(c4224b.LJFF, Boolean.TRUE);
                return;
            } else {
                LIZ(c4224b.LJFF, Boolean.FALSE);
                return;
            }
        }
        c4224b.LIZIZ.setVisibility(4);
        LIZ(c4224b.LJFF, Boolean.FALSE);
    }

    @Override // com.bytedance.android.live.effect.api.l$a
    public final void LIZ(String str, Sticker sticker, ExceptionResult exceptionResult) {
        if (PatchProxy.proxy(new Object[]{str, sticker, exceptionResult}, this, LIZ, false, 13).isSupported) {
            return;
        }
        C88440Kt0.LIZ(2131583085);
        int LIZIZ = LIZIZ(sticker);
        if (LIZIZ >= 0) {
            notifyItemChanged(LIZIZ);
        }
    }
}
