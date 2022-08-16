package com.android.ttcjpaysdk.base.framework;

import android.app.Activity;
import android.content.Context;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Iterator;
import java.util.Stack;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C135565cD2;
import p003X.C135883cIA;
import p003X.C136524cSV;

/* loaded from: classes17.dex */
public final class CJPayActivityManager {
    public static final CJPayActivityManager INSTANCE = new CJPayActivityManager();
    public static Stack<Activity> activityStack = new Stack<>();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6021);
    }

    public final Activity currentActivity() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (Activity) proxy.result;
        }
        Stack<Activity> stack = activityStack;
        if (stack == null || !(!stack.empty())) {
            return null;
        }
        return stack.peek();
    }

    public final void addActivity(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(activity);
        Stack<Activity> stack = activityStack;
        if (stack != null) {
            stack.add(activity);
        }
    }

    public final void removeActivity(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(activity);
        Stack<Activity> stack = activityStack;
        if (stack != null) {
            stack.remove(activity);
        }
    }

    @JvmStatic
    public static final void allowCaptureScreen(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(activity);
        if (true ^ Intrinsics.areEqual("local_test", CJPayHostInfo.channel)) {
            activity.getWindow().clearFlags(8192);
        }
    }

    @JvmStatic
    public static final void disallowCaptureScreen(Activity activity) {
        MethodCollector.m14708i(357);
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, 11).isSupported) {
            MethodCollector.m14707o(357);
            return;
        }
        C106862S5w.LIZ(activity);
        if (true ^ Intrinsics.areEqual("local_test", CJPayHostInfo.channel)) {
            activity.getWindow().addFlags(8192);
        }
        MethodCollector.m14707o(357);
    }

    public final boolean containActivityClass(Class<?> cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(cls);
        Stack<Activity> stack = activityStack;
        if (stack != null) {
            for (Object obj : stack) {
                if (Intrinsics.areEqual(obj.getClass(), cls)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void finishAll(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 7).isSupported || context == null) {
            return;
        }
        EventManager.INSTANCE.notify(new C136524cSV());
        EventManager.INSTANCE.notify(new C135883cIA());
        EventManager.INSTANCE.notify(new C135565cD2());
    }

    public final void finishAllExceptH5(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 8).isSupported || context == null) {
            return;
        }
        EventManager.INSTANCE.notify(new C135883cIA());
        EventManager.INSTANCE.notify(new C135565cD2());
    }

    public final void finishAllWithOutH5page(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 9).isSupported || context == null) {
            return;
        }
        EventManager.INSTANCE.notify(new C135883cIA());
        EventManager.INSTANCE.notify(new C135565cD2());
    }

    public final void finishBindCard(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 10).isSupported || context == null) {
            return;
        }
        EventManager.INSTANCE.notify(new C135565cD2());
    }

    public final void finishActivityClass(Class<?> cls) {
        if (PatchProxy.proxy(new Object[]{cls}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(cls);
        Stack<Activity> stack = activityStack;
        if (stack == null || stack.size() == 0) {
            return;
        }
        Stack<Activity> stack2 = activityStack;
        Intrinsics.checkNotNull(stack2);
        for (int size = stack2.size(); size >= 0; size--) {
            Stack<Activity> stack3 = activityStack;
            Intrinsics.checkNotNull(stack3);
            if (Intrinsics.areEqual(stack3.get(size).getClass(), cls)) {
                Stack<Activity> stack4 = activityStack;
                Intrinsics.checkNotNull(stack4);
                Activity activity = stack4.get(size);
                Intrinsics.checkNotNullExpressionValue(activity, "");
                if (!activity.isFinishing()) {
                    Stack<Activity> stack5 = activityStack;
                    Intrinsics.checkNotNull(stack5);
                    stack5.get(size).finish();
                    return;
                }
            }
        }
    }

    public final void finishAllActivityClass(Class<?> cls) {
        if (PatchProxy.proxy(new Object[]{cls}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(cls);
        Stack<Activity> stack = activityStack;
        if (stack == null || stack.size() == 0) {
            return;
        }
        Stack<Activity> stack2 = activityStack;
        Intrinsics.checkNotNull(stack2);
        Iterator<Activity> it = stack2.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            Activity next = it.next();
            if (Intrinsics.areEqual(next.getClass(), cls) && !next.isFinishing()) {
                next.finish();
            }
        }
    }
}
