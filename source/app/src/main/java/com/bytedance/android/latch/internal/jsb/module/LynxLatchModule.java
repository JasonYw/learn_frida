package com.bytedance.android.latch.internal.jsb.module;

import android.content.Context;
import com.bytedance.android.latch.internal.jsb.AttachComponentMethodBase$invoke$1;
import com.bytedance.android.latch.internal.jsb.AttachComponentMethodBase$invoke$2;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.jsbridge.LynxMethod;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.WritableArray;
import com.lynx.react.bridge.WritableMap;
import io.reactivex.AbstractC34975j;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Iterator;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.PR2;
import p003X.T6W;
import p003X.T6X;
import p003X.TRC;

/* loaded from: classes10.dex */
public final class LynxLatchModule extends LynxModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    public T6W attachComponentMethodBase;
    public final T6X params;

    static {
        Covode.recordClassIndex(13746);
    }

    /* renamed from: com.bytedance.android.latch.internal.jsb.module.LynxLatchModule$1 */
    /* loaded from: classes10.dex */
    public static final class C27661 extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(13747);
        }

        public C27661() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Unit mo30099invoke() {
            T6W t6w;
            Disposable disposable;
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (t6w = LynxLatchModule.this.attachComponentMethodBase) != null && !PatchProxy.proxy(new Object[0], t6w, T6W.LIZ, false, 2).isSupported && (disposable = t6w.LIZIZ) != null) {
                disposable.dispose();
            }
            return Unit.INSTANCE;
        }
    }

    @LynxMethod
    public final int getSDKVersion() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (TRC.LIZLLL.LIZ(this.mContext, new String[]{"com/bytedance/android/latch/internal/jsb/module/LynxLatchModule", "getSDKVersion", "()I"}, new Object[0])) {
            return 0;
        }
        int LIZ = PR2.LIZ();
        TRC.LIZLLL.LIZ(Integer.valueOf(LIZ));
        return LIZ;
    }

    @LynxMethod
    public final void attachComponent(Callback callback) {
        if (PatchProxy.proxy(new Object[]{callback}, this, changeQuickRedirect, false, 1).isSupported || TRC.LIZLLL.LIZ(this.mContext, new String[]{"com/bytedance/android/latch/internal/jsb/module/LynxLatchModule", "attachComponent", "(Lcom/lynx/react/bridge/Callback;)V"}, callback)) {
            return;
        }
        C106862S5w.LIZ(callback);
        T6W t6w = new T6W(this.params.LIZ, this.params.LIZIZ, new LynxLatchModule$attachComponent$1(this, callback));
        if (!PatchProxy.proxy(new Object[0], t6w, T6W.LIZ, false, 1).isSupported) {
            AbstractC34975j<JSONObject> LIZIZ = t6w.LIZJ.LIZIZ();
            final AttachComponentMethodBase$invoke$1 attachComponentMethodBase$invoke$1 = new AttachComponentMethodBase$invoke$1(t6w);
            Consumer<? super JSONObject> consumer = new Consumer() { // from class: X.6GL
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(13741);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    Intrinsics.checkExpressionValueIsNotNull(Function1.this.invoke(obj), "");
                }
            };
            final AttachComponentMethodBase$invoke$2 attachComponentMethodBase$invoke$2 = new AttachComponentMethodBase$invoke$2(t6w);
            t6w.LIZIZ = LIZIZ.LIZ(consumer, new Consumer() { // from class: X.6GL
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(13741);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    Intrinsics.checkExpressionValueIsNotNull(Function1.this.invoke(obj), "");
                }
            });
        }
        this.attachComponentMethodBase = t6w;
        TRC.LIZLLL.LIZ((Object) null);
    }

    private final WritableArray toWritableArray(JSONArray jSONArray) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONArray}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (WritableArray) proxy.result;
        }
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object opt = jSONArray.opt(i);
            if (!(opt instanceof Float) && !(opt instanceof Double)) {
                if (opt instanceof Long) {
                    long j = jSONArray.getLong(i);
                    if (j <= 2147483647L && j >= -2147483648L) {
                        javaOnlyArray.pushInt((int) j);
                    } else {
                        javaOnlyArray.pushString(String.valueOf(j));
                    }
                } else if (opt instanceof Number) {
                    javaOnlyArray.pushInt(jSONArray.getInt(i));
                } else if (opt instanceof String) {
                    javaOnlyArray.pushString(jSONArray.getString(i));
                } else if (opt instanceof Boolean) {
                    javaOnlyArray.pushBoolean(jSONArray.getBoolean(i));
                } else if (opt instanceof JSONObject) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    Intrinsics.checkExpressionValueIsNotNull(jSONObject, "");
                    javaOnlyArray.pushMap(toWritableMap(jSONObject));
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                    Intrinsics.checkExpressionValueIsNotNull(jSONArray2, "");
                    javaOnlyArray.pushArray(toWritableArray(jSONArray2));
                } else if (Intrinsics.areEqual(opt, JSONObject.NULL)) {
                    javaOnlyArray.pushNull();
                } else {
                    throw new IllegalStateException(("Failed to convert value " + opt + " of type " + opt.getClass()).toString());
                }
            } else {
                javaOnlyArray.pushDouble(jSONArray.getDouble(i));
            }
        }
        return javaOnlyArray;
    }

    public final WritableMap toWritableMap(JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (WritableMap) proxy.result;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkExpressionValueIsNotNull(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            if (next != null) {
                String str = next;
                Object opt = jSONObject.opt(str);
                if (!(opt instanceof Float) && !(opt instanceof Double)) {
                    if (opt instanceof Long) {
                        long j = jSONObject.getLong(str);
                        if (j <= 2147483647L && j >= -2147483648L) {
                            javaOnlyMap.putInt(str, (int) j);
                        } else {
                            javaOnlyMap.putString(str, String.valueOf(j));
                        }
                    } else if (opt instanceof Number) {
                        javaOnlyMap.putInt(str, jSONObject.getInt(str));
                    } else if (opt instanceof String) {
                        javaOnlyMap.putString(str, jSONObject.getString(str));
                    } else if (opt instanceof Boolean) {
                        javaOnlyMap.putBoolean(str, jSONObject.getBoolean(str));
                    } else if (opt instanceof JSONObject) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                        Intrinsics.checkExpressionValueIsNotNull(jSONObject2, "");
                        javaOnlyMap.putMap(str, toWritableMap(jSONObject2));
                    } else if (opt instanceof JSONArray) {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        Intrinsics.checkExpressionValueIsNotNull(jSONArray, "");
                        javaOnlyMap.putArray(str, toWritableArray(jSONArray));
                    } else if (Intrinsics.areEqual(opt, JSONObject.NULL)) {
                        javaOnlyMap.putNull(str);
                    } else {
                        throw new IllegalStateException(("Failed to convert value " + opt + " of type " + opt.getClass()).toString());
                    }
                } else {
                    javaOnlyMap.putDouble(str, jSONObject.getDouble(str));
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
            }
        }
        return javaOnlyMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxLatchModule(Context context, Object obj) {
        super(context);
        C106862S5w.LIZ(context, obj);
        this.params = (T6X) obj;
        new C27661();
    }
}
