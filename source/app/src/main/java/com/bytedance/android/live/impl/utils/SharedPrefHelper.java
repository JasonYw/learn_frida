package com.bytedance.android.live.impl.utils;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.QN1;

/* loaded from: classes8.dex */
public final class SharedPrefHelper {
    public static ChangeQuickRedirect LIZ;
    public static final SharedPrefHelper LIZJ = new SharedPrefHelper();
    public static final String LIZIZ = "liveai_feature_manager_sp";
    public static final Lazy LIZLLL = LazyKt__LazyJVMKt.lazy(SharedPrefHelper$spForLiveFeatureManager$2.INSTANCE);

    /* loaded from: classes8.dex */
    public enum Type {
        STRING,
        INTEGER,
        BOOLEAN,
        FLOAT,
        LONG,
        STRING_SET,
        ALL;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(25041);
        }

        public static Type valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (Type) (proxy.isSupported ? proxy.result : Enum.valueOf(Type.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (Type[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    private final SharedPreferences LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (SharedPreferences) (proxy.isSupported ? proxy.result : LIZLLL.mo27335getValue());
    }

    static {
        Covode.recordClassIndex(25040);
    }

    public final int LIZ(String str, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, 0}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C106862S5w.LIZ(str);
        Object LIZ2 = LIZ(str, Type.INTEGER, 0);
        Intrinsics.checkNotNull(LIZ2);
        return ((Number) LIZ2).intValue();
    }

    public final long LIZ(String str, long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, 0L}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        C106862S5w.LIZ(str);
        Object LIZ2 = LIZ(str, Type.LONG, 0L);
        Intrinsics.checkNotNull(LIZ2);
        return ((Number) LIZ2).longValue();
    }

    public final String LIZ(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(str);
        return (String) LIZ(str, Type.STRING, str2);
    }

    public final void LIZ(String str, Object obj) {
        SharedPreferences.Editor editor;
        if (PatchProxy.proxy(new Object[]{str, obj}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, obj);
        SharedPreferences LIZ2 = LIZ();
        if (LIZ2 != null) {
            editor = LIZ2.edit();
        } else {
            editor = null;
        }
        if (obj instanceof String) {
            if (editor != null) {
                editor.putString(str, (String) obj);
            } else {
                return;
            }
        } else if (obj instanceof Integer) {
            if (editor == null) {
                return;
            }
            editor.putInt(str, ((Number) obj).intValue());
        } else if (obj instanceof Boolean) {
            if (editor == null) {
                return;
            }
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            if (editor == null) {
                return;
            }
            editor.putFloat(str, ((Number) obj).floatValue());
        } else if (obj instanceof Long) {
            if (editor == null) {
                return;
            }
            editor.putLong(str, ((Number) obj).longValue());
        } else if (obj instanceof Set) {
            if (editor == null) {
                return;
            }
            editor.putStringSet(str, (Set) obj);
        } else if (editor == null) {
            return;
        } else {
            editor.putString(str, obj.toString());
        }
        editor.apply();
    }

    private final <T> T LIZ(String str, Type type, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, type, obj}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str, type, obj}, this, LIZ, false, 16);
        if (proxy2.isSupported) {
            return (T) proxy2.result;
        }
        switch (QN1.LIZ[type.ordinal()]) {
            case 1:
                SharedPreferences LIZ2 = LIZ();
                if (LIZ2 == null) {
                    return null;
                }
                return (T) LIZ2.getString(str, (String) obj);
            case 2:
                Integer num = (Integer) obj;
                if (num != null) {
                    int intValue = num.intValue();
                    SharedPreferences LIZ3 = LIZJ.LIZ();
                    if (LIZ3 != null) {
                        return (T) Integer.valueOf(LIZ3.getInt(str, intValue));
                    }
                }
                return null;
            case 3:
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    SharedPreferences LIZ4 = LIZJ.LIZ();
                    if (LIZ4 != null) {
                        return (T) Boolean.valueOf(LIZ4.getBoolean(str, booleanValue));
                    }
                }
                return null;
            case 4:
                Float f = (Float) obj;
                if (f != null) {
                    float floatValue = f.floatValue();
                    SharedPreferences LIZ5 = LIZJ.LIZ();
                    if (LIZ5 != null) {
                        return (T) Float.valueOf(LIZ5.getFloat(str, floatValue));
                    }
                }
                return null;
            case 5:
                Long l = (Long) obj;
                if (l != null) {
                    long longValue = l.longValue();
                    SharedPreferences LIZ6 = LIZJ.LIZ();
                    if (LIZ6 != null) {
                        return (T) Long.valueOf(LIZ6.getLong(str, longValue));
                    }
                }
                return null;
            case 6:
                SharedPreferences LIZ7 = LIZ();
                if (LIZ7 == null) {
                    return null;
                }
                return (T) LIZ7.getStringSet(str, (Set) obj);
            case 7:
                SharedPreferences LIZ8 = LIZ();
                if (LIZ8 == null) {
                    return null;
                }
                return (T) LIZ8.getAll();
            default:
                return obj;
        }
    }
}
