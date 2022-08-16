package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdkapi.depend.model.live.BattleRivalTag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C4574547f;
import p003X.LK5;
import p003X.M0Q;
import p003X.RunnableC79579HYn;
import p003X.RunnableC79580HYo;

/* loaded from: classes3.dex */
public final class PkTagsContainerView extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public boolean f26270LJ;
    public String LJFF;
    public Room LJI;
    public HashMap LJII;

    static {
        Covode.recordClassIndex(25635);
    }

    public PkTagsContainerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public PkTagsContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{2131191526}, this, LIZ, false, 12);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJII == null) {
            this.LJII = new HashMap();
        }
        View view = (View) this.LJII.get(2131191526);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(2131191526);
        this.LJII.put(2131191526, findViewById);
        return findViewById;
    }

    public final void LIZ() {
        this.LIZJ = 0;
    }

    public final void setOldTag(boolean z) {
        this.LIZLLL = z;
    }

    public final int LIZ(View view) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C106862S5w.LIZ(view);
        if (view.getWidth() == 0) {
            view.measure(0, 0);
            return view.getMeasuredWidth();
        }
        return view.getWidth();
    }

    private final void LIZ(BattleRivalTag battleRivalTag) {
        if (!PatchProxy.proxy(new Object[]{battleRivalTag}, this, LIZ, false, 7).isSupported && this.f26270LJ) {
            HashMap hashMap = new HashMap();
            Room room = this.LJI;
            if (room != null) {
                hashMap.put("show_user_id", String.valueOf(room.getOwnerUserId()));
            }
            String str = battleRivalTag.LIZLLL;
            Intrinsics.checkNotNullExpressionValue(str, "");
            hashMap.put("content", str);
            hashMap.put("show_from", this.LJFF);
            C4574547f.LIZ().LIZ("livesdk_pk_label_show", hashMap, Room.class);
        }
    }

    private final View LIZIZ(BattleRivalTag battleRivalTag) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{battleRivalTag}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(getContext()), 2131699477, (ViewGroup) LIZ(2131191526), false);
        if (M0Q.m23355LJ(battleRivalTag.LIZJ)) {
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            HSImageView hSImageView = (HSImageView) LIZ2.findViewById(2131177010);
            Intrinsics.checkNotNullExpressionValue(hSImageView, "");
            hSImageView.setVisibility(0);
            M0Q.LIZ((ImageView) LIZ2.findViewById(2131177010), battleRivalTag.LIZJ);
            if (this.LIZLLL) {
                HSImageView hSImageView2 = (HSImageView) LIZ2.findViewById(2131177010);
                Intrinsics.checkNotNullExpressionValue(hSImageView2, "");
                hSImageView2.getLayoutParams().width = LK5.LIZ(8.0f);
                HSImageView hSImageView3 = (HSImageView) LIZ2.findViewById(2131177010);
                Intrinsics.checkNotNullExpressionValue(hSImageView3, "");
                hSImageView3.getLayoutParams().height = LK5.LIZ(10.0f);
            }
        } else {
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            HSImageView hSImageView4 = (HSImageView) LIZ2.findViewById(2131177010);
            Intrinsics.checkNotNullExpressionValue(hSImageView4, "");
            hSImageView4.setVisibility(8);
        }
        if (battleRivalTag.LIZLLL != null) {
            TextView textView = (TextView) LIZ2.findViewById(2131195481);
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            TextView textView2 = (TextView) LIZ2.findViewById(2131195481);
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setText(battleRivalTag.LIZLLL);
        }
        try {
            ((TextView) LIZ2.findViewById(2131195481)).setTextColor(Color.parseColor(battleRivalTag.f28115LJ));
        } catch (Throwable unused) {
        }
        if (M0Q.m23355LJ(battleRivalTag.LIZIZ)) {
            LinearLayout linearLayout = (LinearLayout) LIZ2.findViewById(2131191465);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            ImageModel imageModel = battleRivalTag.LIZIZ;
            Intrinsics.checkNotNullExpressionValue(imageModel, "");
            if (!PatchProxy.proxy(new Object[]{linearLayout, imageModel}, this, LIZ, false, 9).isSupported) {
                linearLayout.post(new RunnableC79579HYn(imageModel, linearLayout));
            }
            if (M0Q.m23355LJ(battleRivalTag.LIZJ)) {
                ((LinearLayout) LIZ2.findViewById(2131191465)).setPadding(0, 0, LK5.LIZ(4.0f), 0);
                if (this.LIZLLL) {
                    ((LinearLayout) LIZ2.findViewById(2131191465)).setPadding(LK5.LIZ(4.0f), 0, LK5.LIZ(4.0f), 0);
                }
                return LIZ2;
            }
            ((LinearLayout) LIZ2.findViewById(2131191465)).setPadding(LK5.LIZ(3.0f), 0, LK5.LIZ(4.0f), 0);
            return LIZ2;
        }
        ((LinearLayout) LIZ2.findViewById(2131191465)).setPadding(0, 0, 0, 0);
        return LIZ2;
    }

    public final void LIZ(BattleRivalTag battleRivalTag, int i) {
        MethodCollector.m14708i(1740);
        if (PatchProxy.proxy(new Object[]{battleRivalTag, Integer.valueOf(i)}, this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(1740);
            return;
        }
        View LIZIZ = LIZIZ(battleRivalTag);
        TextView textView = (TextView) LIZIZ.findViewById(2131195481);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setTextSize(i);
        if (LIZ(LIZIZ) + LK5.LIZ(4.0f) < this.LIZIZ) {
            ((LinearLayout) LIZ(2131191526)).addView(LIZIZ);
            LIZ(battleRivalTag);
            this.LIZIZ -= LIZ(LIZIZ) + LK5.LIZ(4.0f);
        }
        MethodCollector.m14707o(1740);
    }

    public PkTagsContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1742);
        this.LJFF = "";
        LayoutInflater.from(context).inflate(2131699559, this);
        MethodCollector.m14707o(1742);
    }

    public /* synthetic */ PkTagsContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void LIZ(List<? extends BattleRivalTag> list, boolean z, Room room, int i, String str) {
        MethodCollector.m14708i(1739);
        if (PatchProxy.proxy(new Object[]{list, Byte.valueOf(z ? (byte) 1 : (byte) 0), room, 9, str}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1739);
            return;
        }
        C106862S5w.LIZ(str);
        if (list == null) {
            MethodCollector.m14707o(1739);
            return;
        }
        this.f26270LJ = z;
        this.LJI = room;
        this.LJFF = str;
        ((LinearLayout) LIZ(2131191526)).removeAllViews();
        int i2 = this.LIZJ;
        if (i2 == 0) {
            ((LinearLayout) LIZ(2131191526)).post(new RunnableC79580HYo(this, list, 9));
            MethodCollector.m14707o(1739);
            return;
        }
        this.LIZIZ = i2;
        for (BattleRivalTag battleRivalTag : list) {
            LIZ(battleRivalTag, 9);
        }
        MethodCollector.m14707o(1739);
    }

    public final void LIZ(List<? extends BattleRivalTag> list, List<? extends View> list2, boolean z, Room room, int i, String str, Function1<? super Integer, Unit> function1) {
        int i2;
        int LIZ2;
        MethodCollector.m14708i(1741);
        boolean z2 = false;
        if (PatchProxy.proxy(new Object[]{list, list2, (byte) 0, room, 9, str, function1}, this, LIZ, false, 4).isSupported) {
            MethodCollector.m14707o(1741);
            return;
        }
        C106862S5w.LIZ(str);
        if (list == null && list2 == null) {
            MethodCollector.m14707o(1741);
            return;
        }
        this.f26270LJ = false;
        this.LJI = room;
        this.LJFF = str;
        ((LinearLayout) LIZ(2131191526)).removeAllViews();
        if (list != null) {
            i2 = 0;
            for (BattleRivalTag battleRivalTag : list) {
                Object[] objArr = new Object[2];
                char c = z2 ? 1 : 0;
                char c2 = z2 ? 1 : 0;
                objArr[c] = battleRivalTag;
                objArr[1] = 9;
                PatchProxyResult proxy = PatchProxy.proxy(objArr, this, LIZ, z2, 6);
                if (proxy.isSupported) {
                    LIZ2 = ((Integer) proxy.result).intValue();
                } else {
                    View LIZIZ = LIZIZ(battleRivalTag);
                    TextView textView = (TextView) LIZIZ.findViewById(2131195481);
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    textView.setTextSize(9);
                    ((LinearLayout) LIZ(2131191526)).addView(LIZIZ);
                    LIZ(battleRivalTag);
                    LIZ2 = LK5.LIZ(4.0f) + LIZ(LIZIZ);
                }
                i2 += LIZ2;
                z2 = false;
            }
        } else {
            i2 = 0;
        }
        if (list2 != null) {
            for (View view : list2) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof ViewGroup)) {
                    parent = null;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
                ((LinearLayout) LIZ(2131191526)).addView(view);
                int i3 = view.getLayoutParams().width;
                if (i3 <= 0) {
                    i3 = LIZ(view);
                }
                i2 += i3 + LK5.LIZ(4.0f);
            }
        }
        function1.invoke(Integer.valueOf(i2));
        MethodCollector.m14707o(1741);
    }
}
