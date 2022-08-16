package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.M0Q;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder.am */
/* loaded from: classes12.dex */
public final class C4338am extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public final TextView LIZIZ;
    public final HSImageView LIZJ;
    public final TextView LIZLLL;

    /* renamed from: LJ */
    public final TextView f26280LJ;
    public final HSImageView LJFF;
    public final LinearLayout LJI;
    public final TextView LJII;
    public final HSImageView LJIIIIZZ;

    static {
        Covode.recordClassIndex(26107);
    }

    public final void LIZ(User user) {
        if (PatchProxy.proxy(new Object[]{user}, this, LIZ, false, 2).isSupported) {
            return;
        }
        List<ImageModel> list = user.badgeImageListV2;
        Object obj = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                ImageModel imageModel = (ImageModel) next;
                Intrinsics.checkNotNullExpressionValue(imageModel, "");
                if (imageModel.getImageType() == 23) {
                    obj = next;
                    break;
                }
            }
            ImageModel imageModel2 = (ImageModel) obj;
            if (imageModel2 != null) {
                M0Q.LIZ((ImageView) this.LJIIIIZZ, imageModel2);
                HSImageView hSImageView = this.LJIIIIZZ;
                Intrinsics.checkNotNullExpressionValue(hSImageView, "");
                hSImageView.setVisibility(0);
                return;
            }
        }
        HSImageView hSImageView2 = this.LJIIIIZZ;
        Intrinsics.checkNotNullExpressionValue(hSImageView2, "");
        hSImageView2.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4338am(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        this.LIZIZ = (TextView) view2.findViewById(2131194754);
        View view3 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "");
        this.LIZJ = (HSImageView) view3.findViewById(2131179063);
        View view4 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view4, "");
        this.LIZLLL = (TextView) view4.findViewById(2131172009);
        View view5 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view5, "");
        this.f26280LJ = (TextView) view5.findViewById(2131171823);
        View view6 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view6, "");
        this.LJIIIIZZ = (HSImageView) view6.findViewById(2131179162);
        View view7 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view7, "");
        this.LJFF = (HSImageView) view7.findViewById(2131179076);
        View view8 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view8, "");
        this.LJI = (LinearLayout) view8.findViewById(2131174568);
        View view9 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view9, "");
        this.LJII = (TextView) view9.findViewById(2131194099);
    }
}
