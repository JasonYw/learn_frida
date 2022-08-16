package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p347a;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC80011HgL;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C79919Her;
import p003X.C80075HhN;
import p003X.C80080HhS;
import p003X.LK5;
import p003X.View$OnClickListenerC80071HhJ;
import p003X.View$OnClickListenerC80072HhK;
import p003X.View$OnClickListenerC80073HhL;
import p003X.View$OnClickListenerC80074HhM;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.a.a */
/* loaded from: classes3.dex */
public final class C4306a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static ChangeQuickRedirect LIZ;
    public int LIZLLL;
    public final C79919Her LJFF;
    public final AbstractC80011HgL LJI;
    public final Context LJII;
    public int LIZIZ = 1;
    public final List<String> LIZJ = new ArrayList();

    /* renamed from: LJ */
    public String f26271LJ = "";

    static {
        Covode.recordClassIndex(25648);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return this.LIZJ.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.LIZIZ;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewGroup, Integer.valueOf(i)}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (RecyclerView.ViewHolder) proxy.result;
        }
        C106862S5w.LIZ(viewGroup);
        if (i != 1 && i != 2) {
            View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(this.LJII), 2131699556, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            return new C80080HhS(this, LIZ2);
        }
        View LIZ3 = C116971W2r.LIZ(LayoutInflater.from(this.LJII), 2131699554, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
        return new C80075HhN(this, LIZ3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.proxy(new Object[]{viewHolder, Integer.valueOf(i)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(viewHolder);
        if (viewHolder instanceof C80075HhN) {
            C80075HhN c80075HhN = (C80075HhN) viewHolder;
            String str = this.LIZJ.get(i);
            int i2 = this.LIZIZ;
            int i3 = this.LIZLLL;
            if (!PatchProxy.proxy(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}, c80075HhN, C80075HhN.LIZ, false, 1).isSupported) {
                C106862S5w.LIZ(str);
                c80075HhN.LJFF = str;
                c80075HhN.LIZJ.setText(str);
                if (i2 != 0) {
                    if (i2 != 2) {
                        c80075HhN.LIZIZ.setVisibility(0);
                        c80075HhN.LIZLLL.setBackgroundResource(2130856639);
                        c80075HhN.LIZLLL.setOnClickListener(new View$OnClickListenerC80071HhJ(c80075HhN));
                        c80075HhN.LIZJ.setOnClickListener(new View$OnClickListenerC80074HhM(c80075HhN));
                        return;
                    }
                    c80075HhN.LIZIZ.setVisibility(8);
                    ViewGroup.LayoutParams layoutParams = c80075HhN.f6924LJ.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.leftMargin = LK5.LIZ(20.0f);
                        SpannableString spannableString = new SpannableString(c80075HhN.f6924LJ.getText());
                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(LK5.LIZIZ(2131629111));
                        if (spannableString.length() < i3) {
                            i3 = spannableString.length();
                        }
                        C116971W2r.LIZ(spannableString, foregroundColorSpan, 0, i3, 18);
                        c80075HhN.f6924LJ.setText(spannableString);
                        c80075HhN.f6924LJ.setLayoutParams(marginLayoutParams);
                        c80075HhN.LIZLLL.setBackgroundResource(2130856363);
                        c80075HhN.LIZLLL.setOnClickListener(new View$OnClickListenerC80072HhK(c80075HhN));
                        c80075HhN.LIZJ.setOnClickListener(new View$OnClickListenerC80073HhL(c80075HhN));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                c80075HhN.LIZIZ.setVisibility(8);
                c80075HhN.LIZLLL.setOnClickListener(null);
            }
        }
    }

    public C4306a(Context context, C79919Her c79919Her, AbstractC80011HgL abstractC80011HgL) {
        C106862S5w.LIZ(context, c79919Her, abstractC80011HgL);
        this.LJII = context;
        this.LJFF = c79919Her;
        this.LJI = abstractC80011HgL;
    }
}
