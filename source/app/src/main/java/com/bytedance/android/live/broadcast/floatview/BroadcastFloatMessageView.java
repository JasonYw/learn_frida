package com.bytedance.android.live.broadcast.floatview;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.android.live.broadcast.floatview.datacontext.BroadcastFloatContext;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.AbstractC9021r;
import com.bytedance.android.livesdk.widget.EdgeTransparentView;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C3Q0;
import p003X.C88868Kzu;
import p003X.INY;
import p003X.L05;
import p003X.L06;
import p003X.L07;
import p003X.LK1;

/* loaded from: classes5.dex */
public final class BroadcastFloatMessageView extends EdgeTransparentView {
    public static ChangeQuickRedirect LIZ;
    public Disposable LIZIZ;
    public L07<AbstractC3013b<AbstractC9021r, L05<AbstractC9021r>>> LIZLLL;
    public AnimatorSet LJI;
    public boolean LJII;
    public final Lazy LJIIIIZZ = LazyKt__LazyJVMKt.lazy(BroadcastFloatMessageView$messageMap$2.INSTANCE);
    public MessagePriority LIZJ = MessagePriority.NONE;
    public final Lazy LJIIIZ = LazyKt__LazyJVMKt.lazy(new BroadcastFloatMessageView$inflater$2(this));

    /* renamed from: LJ */
    public final HashMap<Integer, AbstractC3013b<AbstractC9021r, L05<AbstractC9021r>>> f25827LJ = new HashMap<>();

    static {
        Covode.recordClassIndex(15837);
    }

    private final LayoutInflater getInflater() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (LayoutInflater) (proxy.isSupported ? proxy.result : this.LJIIIZ.mo27335getValue());
    }

    private final LinkedHashMap<MessagePriority, LinkedList<L05<AbstractC9021r>>> getMessageMap() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (LinkedHashMap) (proxy.isSupported ? proxy.result : this.LJIIIIZZ.mo27335getValue());
    }

    private final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        LIZ(3, LK1.LIZJ(5));
    }

    private final Pair<MessagePriority, L05<AbstractC9021r>> getNextMessage() {
        LinkedList<L05<AbstractC9021r>> linkedList;
        L05<AbstractC9021r> removeFirst;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (Pair) proxy.result;
        }
        for (MessagePriority messagePriority : getMessageMap().keySet()) {
            LinkedList<L05<AbstractC9021r>> linkedList2 = getMessageMap().get(messagePriority);
            if (linkedList2 != null && (!linkedList2.isEmpty()) && messagePriority.priority > this.LIZJ.priority && (linkedList = getMessageMap().get(messagePriority)) != null && (removeFirst = linkedList.removeFirst()) != null) {
                return new Pair<>(messagePriority, removeFirst);
            }
        }
        return null;
    }

    public final void LIZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported && LIZIZ()) {
            AnimatorSet animatorSet = this.LJI;
            if (animatorSet != null && animatorSet.isRunning()) {
                AnimatorSet animatorSet2 = this.LJI;
                if (animatorSet2 != null) {
                    animatorSet2.end();
                    return;
                }
                return;
            }
            Disposable disposable = this.LIZIZ;
            if (disposable != null && !disposable.isDisposed()) {
                this.LIZJ = MessagePriority.NONE;
                Disposable disposable2 = this.LIZIZ;
                if (disposable2 != null) {
                    disposable2.dispose();
                }
            }
            Pair<MessagePriority, L05<AbstractC9021r>> nextMessage = getNextMessage();
            if (nextMessage == null) {
                return;
            }
            LIZ(nextMessage.component1(), nextMessage.component2());
        }
    }

    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        for (MessagePriority messagePriority : getMessageMap().keySet()) {
            LinkedList<L05<AbstractC9021r>> linkedList = getMessageMap().get(messagePriority);
            if (linkedList != null && (!linkedList.isEmpty()) && messagePriority.priority > this.LIZJ.priority) {
                return true;
            }
        }
        return false;
    }

    public final void setAdapter(L07<AbstractC3013b<AbstractC9021r, L05<AbstractC9021r>>> l07) {
        if (PatchProxy.proxy(new Object[]{l07}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(l07);
        this.LIZLLL = l07;
    }

    public BroadcastFloatMessageView(Context context) {
        super(context);
        LIZJ();
    }

    public final void LIZ(L05<AbstractC9021r> l05) {
        if (PatchProxy.proxy(new Object[]{l05}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(l05);
        MessageType messageType = l05.LIZ.getMessageType();
        if (messageType != null) {
            switch (INY.LIZ[messageType.ordinal()]) {
                case 1:
                case 2:
                    LIZIZ(MessagePriority.MESSAGE_1, l05);
                    break;
                case 3:
                    LIZIZ(MessagePriority.MESSAGE_2, l05);
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    LIZIZ(MessagePriority.MESSAGE_3, l05);
                    break;
                case 8:
                    LIZIZ(MessagePriority.MESSAGE_4, l05);
                    break;
                case 9:
                    LIZIZ(MessagePriority.MESSAGE_6, l05);
                    break;
                case 10:
                    LIZIZ(MessagePriority.MESSAGE_7, l05);
                    break;
            }
        }
        LIZ();
    }

    public final void LIZ(boolean z) {
        int i;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6).isSupported) {
            return;
        }
        this.LJII = z;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            Intrinsics.checkNotNullExpressionValue(childAt, "");
            if (this.LJII) {
                i = 8388611;
            } else {
                i = 8388613;
            }
            C3Q0.LIZJ(childAt, i);
        }
        postInvalidate();
    }

    public BroadcastFloatMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LIZJ();
    }

    private final void LIZIZ(MessagePriority messagePriority, L05<AbstractC9021r> l05) {
        LinkedList<L05<AbstractC9021r>> linkedList;
        int i = 0;
        if (PatchProxy.proxy(new Object[]{messagePriority, l05}, this, LIZ, false, 15).isSupported) {
            return;
        }
        LinkedList<L05<AbstractC9021r>> linkedList2 = getMessageMap().get(messagePriority);
        if (linkedList2 != null) {
            i = linkedList2.size();
        }
        SettingKey<Integer> settingKey = LiveConfigSettingKeys.LIVE_BROADCAST_AUDIO_FLOAT_MESSAGE_MAX_SIZE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Integer value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (i >= value.intValue() && (linkedList = getMessageMap().get(messagePriority)) != null) {
            linkedList.removeFirst();
        }
        LinkedList<L05<AbstractC9021r>> linkedList3 = getMessageMap().get(messagePriority);
        if (linkedList3 != null) {
            linkedList3.add(l05);
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        Disposable disposable;
        if (PatchProxy.proxy(new Object[]{view, Integer.valueOf(i)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            Disposable disposable2 = this.LIZIZ;
            if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.LIZIZ) != null) {
                disposable.dispose();
            }
            removeAllViews();
            Collection<LinkedList<L05<AbstractC9021r>>> values = getMessageMap().values();
            Intrinsics.checkNotNullExpressionValue(values, "");
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                ((LinkedList) it.next()).clear();
            }
            this.f25827LJ.clear();
            this.LIZJ = MessagePriority.NONE;
        }
    }

    private final void LIZ(MessagePriority messagePriority, L05<AbstractC9021r> l05) {
        L07<AbstractC3013b<AbstractC9021r, L05<AbstractC9021r>>> l07;
        AbstractC3013b<AbstractC9021r, L05<AbstractC9021r>> LIZ2;
        AnimatorSet.Builder builder;
        C2WC<MessagePriority> LJI;
        C2WC<HashMap<MessagePriority, Integer>> LJII;
        HashMap<MessagePriority, Integer> LIZ3;
        if (PatchProxy.proxy(new Object[]{messagePriority, l05}, this, LIZ, false, 12).isSupported || (l07 = this.LIZLLL) == null) {
            return;
        }
        if (this.f25827LJ.containsKey(Integer.valueOf(l07.LIZ(l05)))) {
            LIZ2 = this.f25827LJ.remove(Integer.valueOf(l07.LIZ(l05)));
        } else {
            LIZ2 = l07.LIZ(getInflater(), l07.LIZ(l05), l05);
        }
        if (LIZ2 == null) {
            return;
        }
        if (!LIZ2.LIZ((AbstractC3013b<AbstractC9021r, L05<AbstractC9021r>>) l05)) {
            LIZ();
            return;
        }
        AnimatorSet animatorSet = this.LJI;
        if (animatorSet != null && animatorSet.isRunning()) {
            return;
        }
        Disposable disposable = this.LIZIZ;
        if (disposable != null && !disposable.isDisposed()) {
            return;
        }
        BroadcastFloatContext LIZ4 = C88868Kzu.LIZ();
        if (LIZ4 != null && (LJII = LIZ4.LJII()) != null && (LIZ3 = LJII.LIZ()) != null) {
            Integer num = LIZ3.get(messagePriority);
            if (num == null) {
                num = 0;
            }
            Intrinsics.checkNotNullExpressionValue(num, "");
            LIZ3.put(messagePriority, Integer.valueOf(num.intValue() + 1));
        }
        BroadcastFloatContext LIZ5 = C88868Kzu.LIZ();
        if (LIZ5 != null && (LJI = LIZ5.LJI()) != null) {
            LJI.LIZ(messagePriority);
        }
        this.LIZJ = messagePriority;
        View LIZ6 = LIZ2.LIZ();
        LIZ6.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        LIZ(LIZ6, l05, LIZ2);
        this.LJI = new AnimatorSet();
        AnimatorSet animatorSet2 = this.LJI;
        if (animatorSet2 != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(LIZ6, "translationY", LK1.LIZ(60.0f), 0.0f);
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            builder = animatorSet2.play(ofFloat);
        } else {
            builder = null;
        }
        if (getChildCount() >= 2 && builder != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(getChildAt(getChildCount() - 2), "translationY", 0.0f, -LK1.LIZ(60.0f));
            ofFloat2.setDuration(250L);
            ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            builder.with(ofFloat2);
        }
        AnimatorSet animatorSet3 = this.LJI;
        if (animatorSet3 != null) {
            animatorSet3.addListener(new L06(this, LIZ2));
        }
        AnimatorSet animatorSet4 = this.LJI;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
    }

    private final void LIZ(View view, L05<AbstractC9021r> l05, AbstractC3013b<AbstractC9021r, L05<AbstractC9021r>> abstractC3013b) {
        if (PatchProxy.proxy(new Object[]{view, l05, abstractC3013b}, this, LIZ, false, 13).isSupported) {
            return;
        }
        view.setTag(new Pair(l05, abstractC3013b));
        addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int i2;
        if (PatchProxy.proxy(new Object[]{view, Integer.valueOf(i), layoutParams}, this, LIZ, false, 7).isSupported) {
            return;
        }
        if (view != null) {
            if (this.LJII) {
                i2 = 8388611;
            } else {
                i2 = 8388613;
            }
            C3Q0.LIZJ(view, i2);
        }
        super.addView(view, i, layoutParams);
    }

    public BroadcastFloatMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LIZJ();
    }
}
