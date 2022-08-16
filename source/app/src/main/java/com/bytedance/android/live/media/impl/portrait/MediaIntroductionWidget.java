package com.bytedance.android.live.media.impl.portrait;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GestureDetectorCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.live.media.impl.ParentTouchScrollView;
import com.bytedance.android.live.media.impl.portrait.MediaIntroductionWidget;
import com.bytedance.android.live.media.impl.portrait.MediaIntroductionWidget$setScrollViewBottom$1;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.AbstractC441033cX;
import p003X.AbstractC4569445g;
import p003X.C2HQ;
import p003X.C87010KQi;
import p003X.RunnableC443143fw;

/* loaded from: classes12.dex */
public final class MediaIntroductionWidget extends LiveRecyclableWidget implements View.OnClickListener, AbstractC441033cX, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public ParentTouchScrollView LIZIZ;
    public ValueAnimator LIZJ;
    public TextView LIZLLL;

    /* renamed from: LJ */
    public LinearLayout f26518LJ;
    public final GestureDetectorCompat LJFF;
    public CopyOnWriteArrayList<a$a> LJI = new CopyOnWriteArrayList<>();
    public TextView LJII;
    public TextView LJIIIIZZ;

    static {
        Covode.recordClassIndex(32433);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699998;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a172";
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 12).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public MediaIntroductionWidget() {
        Context context = this.context;
        final MediaIntroductionWidget$gesture$1 mediaIntroductionWidget$gesture$1 = new MediaIntroductionWidget$gesture$1(this);
        this.LJFF = new GestureDetectorCompat(context, new GestureDetector.SimpleOnGestureListener(mediaIntroductionWidget$gesture$1) { // from class: X.3ft
            public static ChangeQuickRedirect LIZ;
            public Function0<Unit> LIZIZ;

            static {
                Covode.recordClassIndex(32434);
            }

            {
                this.LIZIZ = mediaIntroductionWidget$gesture$1;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 1);
                if (proxy.isSupported) {
                    return ((Boolean) proxy.result).booleanValue();
                }
                Function0<Unit> function0 = this.LIZIZ;
                if (function0 != null) {
                    function0.mo30099invoke();
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)}, this, LIZ, false, 2);
                if (proxy.isSupported) {
                    return ((Boolean) proxy.result).booleanValue();
                }
                Function0<Unit> function0 = this.LIZIZ;
                if (function0 != null) {
                    function0.mo30099invoke();
                }
                return true;
            }
        });
    }

    @Override // p003X.AbstractC441033cX
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        LIZ(8);
        C87010KQi.LIZ().LIZ(new C2HQ(false));
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        ValueAnimator valueAnimator = this.LIZJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LJI.clear();
        View view = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setAlpha(1.0f);
    }

    private final void LIZJ() {
        String str;
        String str2;
        String str3;
        String str4;
        User owner;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        String str5 = null;
        Room room = (Room) this.dataCenter.get("data_room", (String) null);
        if (room != null) {
            str = room.getTitle();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            TextView textView = this.LJII;
            if (textView != null) {
                if (room != null && (owner = room.getOwner()) != null) {
                    str4 = owner.getNickName();
                } else {
                    str4 = null;
                }
                textView.setText(str4);
            }
        } else {
            TextView textView2 = this.LJII;
            if (textView2 != null) {
                if (room != null) {
                    str2 = room.getTitle();
                } else {
                    str2 = null;
                }
                textView2.setText(str2);
            }
        }
        if (room != null && (str3 = room.introduction) != null) {
            str5 = StringsKt__StringsJVMKt.replace$default(str3, "\n", "\n\n", false, 4, (Object) null);
        }
        TextView textView3 = this.LJIIIIZZ;
        if (textView3 != null) {
            textView3.setText(str5);
        }
        TextView textView4 = this.LJIIIIZZ;
        if (textView4 != null) {
            textView4.post(new Runnable() { // from class: X.3fv
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(32435);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ParentTouchScrollView parentTouchScrollView;
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    MediaIntroductionWidget mediaIntroductionWidget = MediaIntroductionWidget.this;
                    if (!PatchProxy.proxy(new Object[0], mediaIntroductionWidget, MediaIntroductionWidget.LIZ, false, 11).isSupported && (parentTouchScrollView = mediaIntroductionWidget.LIZIZ) != null) {
                        parentTouchScrollView.setGetContentBottom(new MediaIntroductionWidget$setScrollViewBottom$1(mediaIntroductionWidget));
                    }
                }
            });
        }
    }

    @Override // p003X.AbstractC441033cX
    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        LIZ(0);
        View view = this.contentView;
        if (view != null) {
            view.setAlpha(0.0f);
        }
        this.LIZJ = ValueAnimator.ofFloat(0.0f, 1.0f);
        UIUtils.setViewVisibility(findViewById(2131182799), 4);
        this.contentView.post(new RunnableC443143fw(this));
        C87010KQi.LIZ().LIZ(new C2HQ(true));
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        View view;
        if (!PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 2).isSupported && (view = this.contentView) != null) {
            view.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 5).isSupported && view != null && view.getId() == 2131182799) {
            LIZIZ();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LJII = (TextView) findViewById(2131182804);
        this.LJIIIIZZ = (TextView) findViewById(2131182802);
        this.LIZLLL = (TextView) findViewById(2131182786);
        this.f26518LJ = (LinearLayout) findViewById(2131181577);
        findViewById(2131182799).setOnClickListener(this);
        this.LIZIZ = (ParentTouchScrollView) findViewById(2131182800);
        ParentTouchScrollView parentTouchScrollView = this.LIZIZ;
        if (parentTouchScrollView != null) {
            parentTouchScrollView.setTopFading(0.5f);
        }
    }

    private final void LIZ(int i) {
        MethodCollector.m14708i(2141);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 8).isSupported) {
            MethodCollector.m14707o(2141);
        } else if (this.contentView == null) {
            MethodCollector.m14707o(2141);
        } else {
            View view = this.contentView;
            if (view != null) {
                view.setVisibility(i);
            }
            if (i == 0) {
                ParentTouchScrollView parentTouchScrollView = this.LIZIZ;
                if (parentTouchScrollView == null || parentTouchScrollView.getParent() == null) {
                    View view2 = this.contentView;
                    if (view2 != null) {
                        ((ViewGroup) view2).addView(this.LIZIZ);
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                        MethodCollector.m14707o(2141);
                        throw nullPointerException;
                    }
                }
                View view3 = this.contentView;
                if (view3 != null) {
                    view3.setOnTouchListener(new View.OnTouchListener() { // from class: X.3fu
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(32436);
                        }

                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view4, MotionEvent motionEvent) {
                            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view4, motionEvent}, this, LIZ, false, 1);
                            if (proxy.isSupported) {
                                return ((Boolean) proxy.result).booleanValue();
                            }
                            if (motionEvent != null && motionEvent.getAction() == 0) {
                                C87010KQi.LIZ().LIZ(new Object() { // from class: X.3fz
                                    static {
                                        Covode.recordClassIndex(38494);
                                    }
                                });
                            }
                            MediaIntroductionWidget mediaIntroductionWidget = MediaIntroductionWidget.this;
                            Intrinsics.checkNotNullExpressionValue(motionEvent, "");
                            if (!PatchProxy.proxy(new Object[]{motionEvent}, mediaIntroductionWidget, MediaIntroductionWidget.LIZ, false, 10).isSupported) {
                                mediaIntroductionWidget.LJFF.onTouchEvent(motionEvent);
                            }
                            return true;
                        }
                    });
                }
                LIZJ();
            } else {
                ParentTouchScrollView parentTouchScrollView2 = this.LIZIZ;
                if (parentTouchScrollView2 != null) {
                    parentTouchScrollView2.scrollTo(0, 0);
                }
                View view4 = this.contentView;
                if (view4 != null) {
                    ((ViewGroup) view4).removeView(this.LIZIZ);
                    View view5 = this.contentView;
                    if (view5 != null) {
                        view5.setOnTouchListener(null);
                    }
                } else {
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                    MethodCollector.m14707o(2141);
                    throw nullPointerException2;
                }
            }
            ParentTouchScrollView parentTouchScrollView3 = this.LIZIZ;
            if (parentTouchScrollView3 != null) {
                parentTouchScrollView3.setVisibility(i);
            }
            Iterator<a$a> it = this.LJI.iterator();
            while (it.hasNext()) {
                a$a next = it.next();
                if (i == 0) {
                    if (next != null) {
                        next.LIZIZ();
                    }
                } else if (next != null) {
                    next.LIZJ();
                }
            }
            MethodCollector.m14707o(2141);
        }
    }
}
