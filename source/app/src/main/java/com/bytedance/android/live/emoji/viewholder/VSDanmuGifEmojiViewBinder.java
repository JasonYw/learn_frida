package com.bytedance.android.live.emoji.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.emoji.viewholder.VSDanmuGifEmojiViewBinder;
import com.bytedance.android.livesdkapi.depend.model.live.p774vs.ShowEmojiInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import me.drakeet.multitype.C35036d;
import p003X.AbstractC81336I4c;
import p003X.AbstractC91189LwF;
import p003X.AbstractC91447M0z;
import p003X.C116971W2r;
import p003X.C81918IQm;
import p003X.M0R;

/* loaded from: classes5.dex */
public final class VSDanmuGifEmojiViewBinder extends AbstractC81336I4c<ShowEmojiInfo, VSDanmuGifEmojiViewHolder> {
    public static ChangeQuickRedirect LIZ;
    public AbstractC91189LwF LIZIZ;

    static {
        Covode.recordClassIndex(24874);
    }

    /* loaded from: classes5.dex */
    public static class VSDanmuGifEmojiViewHolder extends RecyclerView.ViewHolder {
        public static ChangeQuickRedirect LIZ;
        public HSImageView LIZIZ;
        public AbstractC91189LwF LIZJ;
        public FrameLayout LIZLLL;

        /* renamed from: LJ */
        public ImageView f26246LJ;
        public ImageView LJFF;
        public View LJI;

        static {
            Covode.recordClassIndex(24876);
        }

        /* loaded from: classes5.dex */
        public enum ImageLoadStatus {
            FIRST_TIME_ERROR,
            RETRY_ERROR,
            PROCESSING,
            SUCCESS;
            
            public static ChangeQuickRedirect changeQuickRedirect;

            /* renamed from: values  reason: to resolve conflict with enum method */
            public static ImageLoadStatus[] valuesCustom() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
                if (proxy.isSupported) {
                    return (ImageLoadStatus[]) proxy.result;
                }
                return (ImageLoadStatus[]) values().clone();
            }

            static {
                Covode.recordClassIndex(24878);
            }

            public static ImageLoadStatus valueOf(String str) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
                if (proxy.isSupported) {
                    return (ImageLoadStatus) proxy.result;
                }
                return (ImageLoadStatus) Enum.valueOf(ImageLoadStatus.class, str);
            }
        }

        /* renamed from: com.bytedance.android.live.emoji.viewholder.VSDanmuGifEmojiViewBinder$VSDanmuGifEmojiViewHolder$1 */
        /* loaded from: classes5.dex */
        public class C42351 implements AbstractC91447M0z {
            public static ChangeQuickRedirect LIZ;
            public final /* synthetic */ ShowEmojiInfo LIZIZ;
            public final /* synthetic */ C35036d LIZJ;

            static {
                Covode.recordClassIndex(24877);
            }

            @Override // p003X.AbstractC91447M0z
            public final void LIZ(ImageModel imageModel) {
                if (PatchProxy.proxy(new Object[]{imageModel}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                VSDanmuGifEmojiViewHolder.this.LIZ(ImageLoadStatus.PROCESSING);
                VSDanmuGifEmojiViewHolder.this.itemView.setOnClickListener(null);
            }

            @Override // p003X.AbstractC91447M0z
            public final void LIZ(ImageModel imageModel, Exception exc) {
                if (PatchProxy.proxy(new Object[]{imageModel, exc}, this, LIZ, false, 3).isSupported) {
                    return;
                }
                View view = VSDanmuGifEmojiViewHolder.this.itemView;
                final C35036d c35036d = this.LIZJ;
                view.setOnClickListener(new View.OnClickListener(this, c35036d) { // from class: X.LwD
                    public static ChangeQuickRedirect LIZ;
                    public final VSDanmuGifEmojiViewBinder.VSDanmuGifEmojiViewHolder.C42351 LIZIZ;
                    public final C35036d LIZJ;

                    static {
                        Covode.recordClassIndex(24891);
                    }

                    {
                        this.LIZIZ = this;
                        this.LIZJ = c35036d;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        if (PatchProxy.proxy(new Object[]{view2}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        VSDanmuGifEmojiViewBinder.VSDanmuGifEmojiViewHolder.C42351 c42351 = this.LIZIZ;
                        C35036d c35036d2 = this.LIZJ;
                        if (PatchProxy.proxy(new Object[]{c35036d2, view2}, c42351, VSDanmuGifEmojiViewBinder.VSDanmuGifEmojiViewHolder.C42351.LIZ, false, 4).isSupported) {
                            return;
                        }
                        c35036d2.notifyItemChanged(VSDanmuGifEmojiViewBinder.VSDanmuGifEmojiViewHolder.this.getAdapterPosition());
                    }
                });
                if (this.LIZIZ.loadedBefore) {
                    VSDanmuGifEmojiViewHolder.this.LIZ(ImageLoadStatus.RETRY_ERROR);
                    return;
                }
                VSDanmuGifEmojiViewHolder.this.LIZ(ImageLoadStatus.FIRST_TIME_ERROR);
                this.LIZIZ.loadedBefore = true;
            }

            public C42351(ShowEmojiInfo showEmojiInfo, C35036d c35036d) {
                this.LIZIZ = showEmojiInfo;
                this.LIZJ = c35036d;
            }

            @Override // p003X.AbstractC91447M0z
            public final void LIZ(ImageModel imageModel, int i, int i2, boolean z) {
                if (PatchProxy.proxy(new Object[]{imageModel, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
                    return;
                }
                VSDanmuGifEmojiViewHolder.this.LIZ(ImageLoadStatus.SUCCESS);
                HSImageView hSImageView = VSDanmuGifEmojiViewHolder.this.LIZIZ;
                final ShowEmojiInfo showEmojiInfo = this.LIZIZ;
                hSImageView.setOnClickListener(new View.OnClickListener(this, showEmojiInfo) { // from class: X.LwE
                    public static ChangeQuickRedirect LIZ;
                    public final VSDanmuGifEmojiViewBinder.VSDanmuGifEmojiViewHolder.C42351 LIZIZ;
                    public final ShowEmojiInfo LIZJ;

                    static {
                        Covode.recordClassIndex(24890);
                    }

                    {
                        this.LIZIZ = this;
                        this.LIZJ = showEmojiInfo;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        VSDanmuGifEmojiViewBinder.VSDanmuGifEmojiViewHolder.C42351 c42351 = this.LIZIZ;
                        ShowEmojiInfo showEmojiInfo2 = this.LIZJ;
                        if (PatchProxy.proxy(new Object[]{showEmojiInfo2, view}, c42351, VSDanmuGifEmojiViewBinder.VSDanmuGifEmojiViewHolder.C42351.LIZ, false, 5).isSupported || VSDanmuGifEmojiViewBinder.VSDanmuGifEmojiViewHolder.this.LIZJ == null) {
                            return;
                        }
                        VSDanmuGifEmojiViewBinder.VSDanmuGifEmojiViewHolder.this.LIZJ.LIZ(showEmojiInfo2);
                    }
                });
                this.LIZIZ.loadedBefore = true;
            }
        }

        public final void LIZ(ImageLoadStatus imageLoadStatus) {
            if (PatchProxy.proxy(new Object[]{imageLoadStatus}, this, LIZ, false, 2).isSupported) {
                return;
            }
            int i = C42341.LIZ[imageLoadStatus.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            this.LIZLLL.setVisibility(8);
                            this.f26246LJ.setVisibility(8);
                            this.LJI.setVisibility(8);
                            this.LJFF.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    this.LIZLLL.setVisibility(0);
                    this.f26246LJ.setVisibility(0);
                    this.LJI.setVisibility(0);
                    this.LJFF.setVisibility(8);
                    this.f26246LJ.setImageResource(2130858222);
                    this.LIZLLL.setBackgroundColor(CastProtectorUtils.parseColor("#0F161823"));
                    return;
                }
                this.LIZLLL.setVisibility(0);
                this.f26246LJ.setVisibility(0);
                this.LJI.setVisibility(8);
                this.LJFF.setVisibility(8);
                this.f26246LJ.setImageResource(2130858223);
                this.LIZLLL.setBackgroundColor(CastProtectorUtils.parseColor("#33ffffff"));
                return;
            }
            this.LIZLLL.setVisibility(0);
            this.f26246LJ.setVisibility(0);
            this.LJI.setVisibility(8);
            this.LJFF.setVisibility(0);
            this.f26246LJ.setImageResource(2130858222);
            this.LIZLLL.setBackgroundColor(CastProtectorUtils.parseColor("#0F161823"));
        }

        public VSDanmuGifEmojiViewHolder(View view, AbstractC91189LwF abstractC91189LwF) {
            super(view);
            this.LIZJ = abstractC91189LwF;
            this.LIZIZ = (HSImageView) view.findViewById(2131193195);
            this.LIZLLL = (FrameLayout) view.findViewById(2131193201);
            this.f26246LJ = (ImageView) view.findViewById(2131193200);
            this.LJFF = (ImageView) view.findViewById(2131193199);
            this.LJI = view.findViewById(2131193202);
        }
    }

    /* renamed from: com.bytedance.android.live.emoji.viewholder.VSDanmuGifEmojiViewBinder$1 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C42341 {
        public static final /* synthetic */ int[] LIZ = new int[VSDanmuGifEmojiViewHolder.ImageLoadStatus.valuesCustom().length];

        static {
            Covode.recordClassIndex(24875);
            try {
                LIZ[VSDanmuGifEmojiViewHolder.ImageLoadStatus.FIRST_TIME_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LIZ[VSDanmuGifEmojiViewHolder.ImageLoadStatus.RETRY_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LIZ[VSDanmuGifEmojiViewHolder.ImageLoadStatus.PROCESSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LIZ[VSDanmuGifEmojiViewHolder.ImageLoadStatus.SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bytedance.android.live.emoji.viewholder.VSDanmuGifEmojiViewBinder$VSDanmuGifEmojiViewHolder] */
    @Override // p003X.AbstractC81336I4c
    public final /* synthetic */ VSDanmuGifEmojiViewHolder LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (RecyclerView.ViewHolder) proxy.result;
        }
        View LIZ2 = C116971W2r.LIZ(layoutInflater, 2131700759, viewGroup, false);
        LIZ2.setLayoutParams(new RecyclerView.LayoutParams(-1, (int) C81918IQm.LIZ(LIZ2.getContext(), 45.0f)));
        return new VSDanmuGifEmojiViewHolder(LIZ2, this.LIZIZ);
    }

    @Override // p003X.AbstractC81336I4c
    public final /* synthetic */ void LIZ(VSDanmuGifEmojiViewHolder vSDanmuGifEmojiViewHolder, ShowEmojiInfo showEmojiInfo) {
        VSDanmuGifEmojiViewHolder vSDanmuGifEmojiViewHolder2 = vSDanmuGifEmojiViewHolder;
        ShowEmojiInfo showEmojiInfo2 = showEmojiInfo;
        if (!PatchProxy.proxy(new Object[]{vSDanmuGifEmojiViewHolder2, showEmojiInfo2}, this, LIZ, false, 2).isSupported) {
            C35036d c35036d = this.LJIIIZ;
            if (!PatchProxy.proxy(new Object[]{showEmojiInfo2, c35036d}, vSDanmuGifEmojiViewHolder2, VSDanmuGifEmojiViewHolder.LIZ, false, 1).isSupported) {
                M0R.LIZ((ImageView) vSDanmuGifEmojiViewHolder2.LIZIZ, showEmojiInfo2.image, vSDanmuGifEmojiViewHolder2.LIZIZ.getMeasuredWidth(), vSDanmuGifEmojiViewHolder2.LIZIZ.getMeasuredHeight(), true, 0, ImageView.ScaleType.CENTER_INSIDE, (AbstractC91447M0z) new VSDanmuGifEmojiViewHolder.C42351(showEmojiInfo2, c35036d));
            }
        }
    }

    public VSDanmuGifEmojiViewBinder(int i, int i2, AbstractC91189LwF abstractC91189LwF) {
        this.LIZIZ = abstractC91189LwF;
    }
}
