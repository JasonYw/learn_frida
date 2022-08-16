package com.bytedance.android.live.liveinteract.chatroom.chatroom.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.widget.PKRivalsSearchHistoryView;
import com.bytedance.android.live.uikit.layout.WrapLineFlowLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC472394m1;
import p003X.C106862S5w;
import p003X.C116971W2r;

/* loaded from: classes22.dex */
public final class PKRivalsSearchHistoryView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public AbstractC472394m1 LIZIZ;
    public int LIZJ;
    public HashMap LIZLLL;

    static {
        Covode.recordClassIndex(26521);
    }

    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = new HashMap();
        }
        View view = (View) this.LIZLLL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LIZLLL.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getMaxHeight() {
        return this.LIZJ;
    }

    private void LIZ() {
        MethodCollector.m14708i(1780);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1780);
            return;
        }
        LayoutInflater.from(getContext()).inflate(2131700491, this);
        setVisibility(8);
        MethodCollector.m14707o(1780);
    }

    public final void setMaxHeight(int i) {
        this.LIZJ = i;
    }

    public PKRivalsSearchHistoryView(Context context) {
        super(context);
        MethodCollector.m14708i(1782);
        this.LIZJ = -1;
        LIZ();
        MethodCollector.m14707o(1782);
    }

    public final void setCallBack(AbstractC472394m1 abstractC472394m1) {
        if (PatchProxy.proxy(new Object[]{abstractC472394m1}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC472394m1);
        this.LIZIZ = abstractC472394m1;
    }

    public final void setData(List<String> list) {
        boolean z;
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 3).isSupported) {
            return;
        }
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            setVisibility(8);
            TextView textView = (TextView) LIZ(2131172330);
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            ImageView imageView = (ImageView) LIZ(2131178718);
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
        } else {
            setVisibility(0);
            TextView textView2 = (TextView) LIZ(2131172330);
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
            ImageView imageView2 = (ImageView) LIZ(2131178718);
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(0);
            TextView textView3 = (TextView) LIZ(2131193727);
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(8);
            if (!PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 4).isSupported) {
                ((WrapLineFlowLayout) LIZ(2131175328)).removeAllViews();
                for (String str : list) {
                    View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(getContext()), 2131699555, (ViewGroup) LIZ(2131175328), false);
                    TextView textView4 = (TextView) LIZ2.findViewById(2131194347);
                    if (textView4 != null) {
                        textView4.setTag(str);
                        textView4.setText(str);
                        textView4.setOnClickListener(new View.OnClickListener() { // from class: X.4ly
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(26523);
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                                    return;
                                }
                                PKRivalsSearchHistoryView pKRivalsSearchHistoryView = PKRivalsSearchHistoryView.this;
                                Intrinsics.checkNotNullExpressionValue(view, "");
                                Object tag = view.getTag();
                                if (tag != null) {
                                    String str2 = (String) tag;
                                    AbstractC472394m1 abstractC472394m1 = pKRivalsSearchHistoryView.LIZIZ;
                                    if (abstractC472394m1 != null) {
                                        abstractC472394m1.LIZIZ(str2);
                                        return;
                                    }
                                    return;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        });
                    }
                    ((WrapLineFlowLayout) LIZ(2131175328)).addView(LIZ2);
                }
            }
        }
        ((ImageView) LIZ(2131178718)).setOnClickListener(new View.OnClickListener() { // from class: X.4lz
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(26524);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                ImageView imageView3 = (ImageView) PKRivalsSearchHistoryView.this.LIZ(2131178718);
                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                imageView3.setVisibility(8);
                TextView textView5 = (TextView) PKRivalsSearchHistoryView.this.LIZ(2131193727);
                Intrinsics.checkNotNullExpressionValue(textView5, "");
                textView5.setVisibility(0);
            }
        });
        ((TextView) LIZ(2131193727)).setOnClickListener(new View.OnClickListener() { // from class: X.4m0
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(26525);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                PKRivalsSearchHistoryView.this.setVisibility(8);
                AbstractC472394m1 abstractC472394m1 = PKRivalsSearchHistoryView.this.LIZIZ;
                if (abstractC472394m1 != null) {
                    abstractC472394m1.mo15743LJ();
                }
            }
        });
    }

    public PKRivalsSearchHistoryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes;
        MethodCollector.m14708i(1783);
        this.LIZJ = -1;
        if (context != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130772005})) != null) {
            try {
                this.LIZJ = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                MethodCollector.m14707o(1783);
                throw th;
            }
        }
        LIZ();
        MethodCollector.m14707o(1783);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        MethodCollector.m14708i(1781);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 5).isSupported) {
            MethodCollector.m14707o(1781);
            return;
        }
        int i3 = this.LIZJ;
        if (i3 >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        MethodCollector.m14707o(1781);
    }

    public PKRivalsSearchHistoryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        MethodCollector.m14708i(1784);
        this.LIZJ = -1;
        if (context != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130772005})) != null) {
            try {
                this.LIZJ = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                MethodCollector.m14707o(1784);
                throw th;
            }
        }
        LIZ();
        MethodCollector.m14707o(1784);
    }
}
