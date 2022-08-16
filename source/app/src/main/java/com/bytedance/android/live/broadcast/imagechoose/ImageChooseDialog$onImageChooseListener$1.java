package com.bytedance.android.live.broadcast.imagechoose;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.model.C2917q;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C447313mf;
import p003X.DialogC89316LHa;
import p003X.LHV;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class ImageChooseDialog$onImageChooseListener$1 extends Lambda implements Function1<LinkedList<C2917q>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC89316LHa this$0;

    static {
        Covode.recordClassIndex(16792);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageChooseDialog$onImageChooseListener$1(DialogC89316LHa dialogC89316LHa) {
        super(1);
        this.this$0 = dialogC89316LHa;
    }

    /* JADX WARN: Type inference failed for: r0v44, types: [kotlin.Unit, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(LinkedList<C2917q> linkedList) {
        int i;
        LinkedList<C2917q> linkedList2 = linkedList;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{linkedList2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (C447313mf.LIZ((Collection) linkedList2)) {
            TextView textView = this.this$0.f8836LJ;
            if (textView != null) {
                textView.setClickable(true);
            }
            TextView textView2 = this.this$0.f8836LJ;
            if (textView2 != null) {
                Object[] objArr = new Object[1];
                if (linkedList2 != null) {
                    i = linkedList2.size();
                } else {
                    i = 0;
                }
                objArr[0] = Integer.valueOf(i);
                textView2.setText(LK5.LIZ(2131583521, objArr));
            }
            TextView textView3 = this.this$0.f8836LJ;
            if (textView3 != null) {
                textView3.setTextColor(CastProtectorUtils.parseColor("#FFFFFF"));
            }
            TextView textView4 = this.this$0.f8836LJ;
            if (textView4 != null) {
                textView4.setBackground(LK5.LIZJ(2130852730));
            }
        } else {
            TextView textView5 = this.this$0.f8836LJ;
            if (textView5 != null) {
                textView5.setClickable(false);
            }
            TextView textView6 = this.this$0.f8836LJ;
            if (textView6 != null) {
                textView6.setText(LK5.LIZ(2131583520));
            }
            TextView textView7 = this.this$0.f8836LJ;
            if (textView7 != null) {
                textView7.setTextColor(CastProtectorUtils.parseColor("#80161823"));
            }
            TextView textView8 = this.this$0.f8836LJ;
            if (textView8 != null) {
                textView8.setBackground(LK5.LIZJ(2130852721));
            }
        }
        DialogC89316LHa dialogC89316LHa = this.this$0;
        dialogC89316LHa.LJIILIIL = linkedList2;
        if (C447313mf.LIZ((Collection) dialogC89316LHa.LJIILIIL)) {
            View view = this.this$0.LJFF;
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            View view2 = this.this$0.LJFF;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        LHV lhv = this.this$0.LJIIIIZZ;
        if (lhv != null) {
            LinkedList<C2917q> linkedList3 = this.this$0.LJIILIIL;
            if (!PatchProxy.proxy(new Object[]{linkedList3}, lhv, LHV.LIZ, false, 6).isSupported) {
                lhv.LIZIZ.clear();
                if (linkedList3 != null) {
                    lhv.LIZIZ.addAll(linkedList3);
                }
                lhv.notifyDataSetChanged();
            }
            return Unit.INSTANCE;
        }
        return null;
    }
}
