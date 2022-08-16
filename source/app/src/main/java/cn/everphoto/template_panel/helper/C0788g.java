package cn.everphoto.template_panel.helper;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import cn.everphoto.model.EpTemplate;
import cn.everphoto.model.MergedTemplateItem;
import cn.everphoto.model.TemplateResponseItem;
import cn.everphoto.template_panel.model.C0790c;
import cn.everphoto.template_panel.view.AlwaysMarqueeTextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.dmt.p1121ui.widget.DmtTextView;
import com.bytedance.lighten.core.CircleOptions;
import com.bytedance.lighten.core.Lighten;
import com.bytedance.lighten.core.LightenImageRequestBuilder;
import com.bytedance.lighten.core.ScaleType;
import com.bytedance.lighten.loader.SmartImageView;
import com.p1594ss.android.ugc.aweme.base.model.UrlModel;
import com.p1594ss.android.ugc.aweme.feed.model.Video;
import java.util.ArrayList;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC83316IsY;
import p003X.AbstractC83374ItU;
import p003X.AbstractC83378ItY;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C83162Iq4;
import p003X.C83350It6;
import p003X.C83367ItN;
import p003X.C83379ItZ;
import p003X.TJU;

/* renamed from: cn.everphoto.template_panel.helper.g */
/* loaded from: classes4.dex */
public final class C0788g extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static ChangeQuickRedirect LIZ;
    public ArrayList<C0790c> LIZIZ = new ArrayList<>();
    public AbstractC83378ItY LIZJ;
    public AbstractC83374ItU LIZLLL;

    /* renamed from: LJ */
    public AbstractC83316IsY f21071LJ;
    public View LJFF;
    public C0790c LJI;
    public final Context LJII;
    public final C83350It6 LJIIIIZZ;

    static {
        Covode.recordClassIndex(3801);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return this.LIZIZ.size();
    }

    public final int LIZ(C0790c c0790c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c0790c}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C106862S5w.LIZ(c0790c);
        int i = 0;
        int i2 = 0;
        for (Object obj : this.LIZIZ) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            C0790c c0790c2 = (C0790c) obj;
            if (c0790c2.LIZ() == c0790c.LIZ()) {
                c0790c2.LJFF = true;
                notifyItemChanged(i2);
                i = i2;
            } else {
                long LIZ2 = c0790c2.LIZ();
                C0790c c0790c3 = this.LJI;
                if (c0790c3 != null && LIZ2 == c0790c3.LIZ()) {
                    c0790c2.LJFF = false;
                    notifyItemChanged(i2);
                } else if (c0790c2.LJFF) {
                    c0790c2.LJFF = false;
                    notifyItemChanged(i2);
                }
            }
            i2 = i3;
        }
        this.LJI = c0790c;
        return i;
    }

    public C0788g(Context context, C83350It6 c83350It6) {
        C106862S5w.LIZ(context, c83350It6);
        this.LJII = context;
        this.LJIIIIZZ = c83350It6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewGroup, Integer.valueOf(i)}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (RecyclerView.ViewHolder) proxy.result;
        }
        C106862S5w.LIZ(viewGroup);
        View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(this.LJII), 2131691409, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(LIZ2, "");
        return new C0789a(LIZ2, this.LJIIIIZZ.LJIILLIIL);
    }

    /* renamed from: cn.everphoto.template_panel.helper.g$a */
    /* loaded from: classes4.dex */
    public static final class C0789a extends RecyclerView.ViewHolder {
        public static ChangeQuickRedirect LIZ;
        public final float LIZIZ;
        public final float LIZJ;
        public final int LIZLLL;

        /* renamed from: LJ */
        public final int f21072LJ;
        public final int LJFF;
        public final SmartImageView LJI;
        public final View LJII;
        public final View LJIIIIZZ;
        public final View LJIIIZ;
        public final DmtTextView LJIIJ;
        public final AlwaysMarqueeTextView LJIIJJI;
        public final Context LJIIL;
        public final View LJIILIIL;

        static {
            Covode.recordClassIndex(3802);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0789a(View view, boolean z) {
            super(view);
            C106862S5w.LIZ(view);
            this.LJIIL = view.getContext();
            this.LIZIZ = UIUtils.dip2Px(this.LJIIL, 2.0f);
            this.LIZJ = UIUtils.dip2Px(this.LJIIL, 2.0f);
            this.LIZLLL = C116971W2r.LIZ(this.LJIIL, 2131627954);
            this.f21072LJ = (int) UIUtils.dip2Px(this.LJIIL, 86.0f);
            this.LJFF = (int) UIUtils.dip2Px(this.LJIIL, 64.0f);
            View findViewById = view.findViewById(2131191899);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "");
            this.LJI = (SmartImageView) findViewById;
            View findViewById2 = view.findViewById(2131170396);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "");
            this.LJII = findViewById2;
            View findViewById3 = view.findViewById(2131184178);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "");
            this.LJIIIIZZ = findViewById3;
            View findViewById4 = view.findViewById(2131191906);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "");
            this.LJIILIIL = findViewById4;
            View findViewById5 = view.findViewById(2131191916);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "");
            this.LJIIIZ = findViewById5;
            View findViewById6 = view.findViewById(2131191914);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "");
            this.LJIIJ = (DmtTextView) findViewById6;
            View findViewById7 = view.findViewById(2131191915);
            Intrinsics.checkExpressionValueIsNotNull(findViewById7, "");
            this.LJIIJJI = (AlwaysMarqueeTextView) findViewById7;
            if (z) {
                ViewGroup.LayoutParams layoutParams = this.LJIILIIL.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    layoutParams2.topMargin = C83162Iq4.LIZIZ.LIZ(6.0f);
                    this.LJIILIIL.setLayoutParams(layoutParams2);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        MergedTemplateItem mergedTemplateItem;
        TemplateResponseItem templateResponseItem;
        Video video;
        UrlModel urlModel;
        float f;
        CircleOptions LIZ2;
        if (PatchProxy.proxy(new Object[]{viewHolder, Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(viewHolder);
        C0790c c0790c = this.LIZIZ.get(i);
        Intrinsics.checkExpressionValueIsNotNull(c0790c, "");
        C0790c c0790c2 = c0790c;
        C0789a c0789a = (C0789a) viewHolder;
        if (i == 0) {
            this.LJFF = c0789a.LJI;
        }
        boolean z = this.LJIIIIZZ.LJII;
        if (!PatchProxy.proxy(new Object[]{c0790c2, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, c0789a, C0789a.LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(c0790c2);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], c0790c2, C0790c.LIZ, false, 2);
            if (proxy.isSupported) {
                str = (String) proxy.result;
            } else {
                EpTemplate epTemplate = c0790c2.LIZIZ;
                if (epTemplate == null || (mergedTemplateItem = epTemplate.getMergedTemplateItem()) == null || (templateResponseItem = mergedTemplateItem.cutSameInfo) == null || (video = templateResponseItem.video) == null || (urlModel = video.cover) == null || (str = urlModel.getUri()) == null) {
                    str = "";
                }
            }
            LightenImageRequestBuilder load = Lighten.load(str);
            load.LIZ(c0789a.LJFF, c0789a.f21072LJ);
            load.LIZ(Bitmap.Config.RGB_565);
            load.actualImageScaleType(ScaleType.CENTER_CROP);
            load.LIZIZ(2131627919);
            load.into(c0789a.LJI);
            load.LIZIZ();
            SmartImageView smartImageView = c0789a.LJI;
            boolean z2 = c0790c2.LJFF;
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, c0789a, C0789a.LIZ, false, 2);
            if (proxy2.isSupported) {
                LIZ2 = (CircleOptions) proxy2.result;
            } else {
                if (z2) {
                    f = c0789a.LIZJ;
                } else {
                    f = 0.0f;
                }
                TJU LIZ3 = CircleOptions.LIZ();
                LIZ3.LIZIZ(c0789a.LIZIZ);
                LIZ3.LIZ(f);
                LIZ3.LIZ(c0789a.LIZLLL);
                LIZ2 = LIZ3.LIZ();
                Intrinsics.checkExpressionValueIsNotNull(LIZ2, "");
            }
            smartImageView.setCircleOptions(LIZ2);
            c0789a.LJI.setImportantForAccessibility(2);
            if (c0790c2.f21073LJ == 1) {
                c0789a.LJII.setVisibility(8);
                c0789a.LJIIJJI.setVisibility(8);
                c0789a.LJIIIIZZ.setVisibility(0);
                c0789a.LJIIJ.setVisibility(0);
            } else {
                c0789a.LJIIIIZZ.setVisibility(8);
                if (c0790c2.LJFF) {
                    if (z) {
                        c0789a.LJII.setVisibility(0);
                    }
                    c0789a.LJIIJJI.setVisibility(0);
                    c0789a.LJIIJ.setVisibility(8);
                    c0789a.LJIIIZ.setVisibility(8);
                } else {
                    c0789a.LJII.setVisibility(8);
                    c0789a.LJIIJJI.setVisibility(8);
                    c0789a.LJIIJ.setVisibility(0);
                    c0789a.LJIIIZ.setVisibility(0);
                }
            }
            c0789a.LJIIJ.setText(c0790c2.LIZJ);
            c0789a.LJIIJJI.setText(c0790c2.LIZJ);
        }
        c0789a.LJI.setOnClickListener(new C83379ItZ(this, c0789a, c0790c2));
        c0789a.LJII.setOnClickListener(new C83367ItN(this, c0790c2));
        if (!c0790c2.LIZLLL) {
            c0790c2.LIZLLL = true;
            AbstractC83316IsY abstractC83316IsY = this.f21071LJ;
            if (abstractC83316IsY != null) {
                abstractC83316IsY.LIZJ(Long.valueOf(c0790c2.LIZ()));
            }
        }
    }
}
