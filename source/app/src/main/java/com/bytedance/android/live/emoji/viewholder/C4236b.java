package com.bytedance.android.live.emoji.viewholder;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.BaseEmoji;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.emoji.viewholder.C4236b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p002O.C0002O;
import p003X.AbstractC134347btL;
import p003X.LK5;
import p003X.LLY;
import p003X.M0Q;

/* renamed from: com.bytedance.android.live.emoji.viewholder.b */
/* loaded from: classes17.dex */
public final class C4236b extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public AbstractC134347btL LIZIZ;
    public final HSImageView LIZJ;

    static {
        Covode.recordClassIndex(24880);
    }

    public C4236b(View view) {
        super(view);
        this.LIZJ = (HSImageView) view.findViewById(2131173853);
    }

    public final void LIZ(final BaseEmoji baseEmoji) {
        if (PatchProxy.proxy(new Object[]{baseEmoji}, this, LIZ, false, 1).isSupported || baseEmoji == null) {
            return;
        }
        if (baseEmoji.iconId != 0) {
            this.LIZJ.setImageResource(baseEmoji.iconId);
        } else if (baseEmoji.drawable != null) {
            this.LIZJ.setImageDrawable(baseEmoji.drawable);
        } else if (!TextUtils.isEmpty(baseEmoji.localFilePath)) {
            M0Q.LIZ(this.LIZJ, C0002O.m25086C("file://", baseEmoji.localFilePath));
        }
        this.itemView.setOnClickListener(new View.OnClickListener(this, baseEmoji) { // from class: X.btH
            public static ChangeQuickRedirect LIZ;
            public final C4236b LIZIZ;
            public final BaseEmoji LIZJ;

            static {
                Covode.recordClassIndex(24881);
            }

            {
                this.LIZIZ = this;
                this.LIZJ = baseEmoji;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                C4236b c4236b = this.LIZIZ;
                BaseEmoji baseEmoji2 = this.LIZJ;
                if (PatchProxy.proxy(new Object[]{baseEmoji2, view}, c4236b, C4236b.LIZ, false, 2).isSupported || c4236b.LIZIZ == null) {
                    return;
                }
                c4236b.LIZIZ.LIZ(baseEmoji2);
            }
        });
        if (baseEmoji.type == BaseEmoji.Type.DeleteEmoji) {
            LLY.LIZ(this.itemView, LK5.LIZ(2131581785), true);
        } else {
            LLY.LIZ(this.itemView, baseEmoji.description);
        }
    }
}
