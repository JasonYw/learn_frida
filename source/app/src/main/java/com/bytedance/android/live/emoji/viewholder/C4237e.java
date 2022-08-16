package com.bytedance.android.live.emoji.viewholder;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.SelfEmoji;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.emoji.viewholder.C4237e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC91160Lvm;
import p003X.M0Q;
import p003X.M0R;

/* renamed from: com.bytedance.android.live.emoji.viewholder.e */
/* loaded from: classes5.dex */
public final class C4237e extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final HSImageView LIZIZ;
    public AbstractC91160Lvm LIZJ;

    static {
        Covode.recordClassIndex(24884);
    }

    public C4237e(View view) {
        super(view);
        this.LIZIZ = (HSImageView) view.findViewById(2131189302);
    }

    public final void LIZ(final SelfEmoji selfEmoji, final int i, final int i2) {
        ImageModel imageModel;
        if (PatchProxy.proxy(new Object[]{selfEmoji, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        if (i2 == 0) {
            M0Q.LIZ(this.LIZIZ, 2130856772);
            this.LIZIZ.setOnClickListener(new View.OnClickListener(this, selfEmoji, i, i2) { // from class: X.Lvk
                public static ChangeQuickRedirect LIZ;
                public final C4237e LIZIZ;
                public final SelfEmoji LIZJ;
                public final int LIZLLL;

                /* renamed from: LJ */
                public final int f9105LJ;

                static {
                    Covode.recordClassIndex(24885);
                }

                {
                    this.LIZIZ = this;
                    this.LIZJ = selfEmoji;
                    this.LIZLLL = i;
                    this.f9105LJ = i2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    C4237e c4237e = this.LIZIZ;
                    SelfEmoji selfEmoji2 = this.LIZJ;
                    int i3 = this.LIZLLL;
                    int i4 = this.f9105LJ;
                    if (PatchProxy.proxy(new Object[]{selfEmoji2, Integer.valueOf(i3), Integer.valueOf(i4), view}, c4237e, C4237e.LIZ, false, 3).isSupported) {
                        return;
                    }
                    c4237e.LIZJ.LIZ(c4237e.LIZIZ, selfEmoji2, i3, i4, null);
                }
            });
        } else if (i2 == 1 && selfEmoji != null) {
            if (selfEmoji.animatedImage != null) {
                imageModel = selfEmoji.animatedImage;
            } else {
                imageModel = selfEmoji.staticImage;
            }
            if (imageModel != null) {
                HSImageView hSImageView = this.LIZIZ;
                M0R.LIZ(hSImageView, imageModel, hSImageView.getMeasuredWidth(), this.LIZIZ.getMeasuredHeight(), true, 2130855232, null);
            }
            this.LIZIZ.setOnTouchListener(new View.OnTouchListener(this, selfEmoji, i, i2) { // from class: X.Lvl
                public static ChangeQuickRedirect LIZ;
                public final C4237e LIZIZ;
                public final SelfEmoji LIZJ;
                public final int LIZLLL;

                /* renamed from: LJ */
                public final int f9106LJ;

                static {
                    Covode.recordClassIndex(24886);
                }

                {
                    this.LIZIZ = this;
                    this.LIZJ = selfEmoji;
                    this.LIZLLL = i;
                    this.f9106LJ = i2;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    Object obj;
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, motionEvent}, this, LIZ, false, 1);
                    if (proxy.isSupported) {
                        obj = proxy.result;
                    } else {
                        C4237e c4237e = this.LIZIZ;
                        SelfEmoji selfEmoji2 = this.LIZJ;
                        int i3 = this.LIZLLL;
                        int i4 = this.f9106LJ;
                        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{selfEmoji2, Integer.valueOf(i3), Integer.valueOf(i4), view, motionEvent}, c4237e, C4237e.LIZ, false, 2);
                        if (!proxy2.isSupported) {
                            c4237e.LIZJ.LIZ(view, selfEmoji2, i3, i4, motionEvent);
                            return true;
                        }
                        obj = proxy2.result;
                    }
                    return ((Boolean) obj).booleanValue();
                }
            });
        }
    }
}
