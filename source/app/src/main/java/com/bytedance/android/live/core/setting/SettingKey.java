package com.bytedance.android.live.core.setting;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.reflect.Type;
import p003X.C1X9;
import p003X.C90787Lpl;

/* loaded from: classes5.dex */
public class SettingKey<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final T debugValue;
    public final T defaultValue;
    public final String description;
    public final String name;
    public final String[] option;
    public final boolean sticky;
    public final Type type;
    public T value;

    static {
        Covode.recordClassIndex(23615);
    }

    public T getDebugValue() {
        return this.debugValue;
    }

    public T getDefaultValue() {
        return this.defaultValue;
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public String[] getOption() {
        return this.option;
    }

    public Type getType() {
        return this.type;
    }

    public SettingKey(String str, String str2, T t, T t2, String... strArr) {
        this(str, t.getClass(), str2, t, t2, false, strArr);
    }

    public SettingKey(String str, String str2, T t, T t2, boolean z, String... strArr) {
        this(str, t.getClass(), str2, t, t2, z, strArr);
    }

    public SettingKey(String str, Type type, T t) {
        this.name = str;
        this.defaultValue = t;
        this.debugValue = t;
        this.type = type;
    }

    public T getSpValue() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        if (C90787Lpl.LIZIZ()) {
            return this.debugValue;
        }
        this.value = (T) C90787Lpl.LIZ("key_ttlive_sdk_setting", this.name, this.type, this.defaultValue, this.value, this.sticky);
        return this.value;
    }

    public T getValue() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        if (C90787Lpl.LIZIZ()) {
            return this.debugValue;
        }
        if (C1X9.LIZIZ(this.name)) {
            this.value = (T) C1X9.LIZ(this.name, this.defaultValue, this.type);
            ALogger.m15797i("LiveStorageHelper", "current key uses keva, key=" + this.name + "value =" + this.value);
        } else {
            this.value = (T) C90787Lpl.LIZ("key_ttlive_sdk_setting", this.name, this.type, this.defaultValue, this.value, this.sticky);
        }
        return this.value;
    }

    public SettingKey(String str, Class<T> cls) {
        this(str, (Class) cls, "");
    }

    public SettingKey(String str, T t) {
        this(str, t, "");
    }

    public SettingKey(String str, T t, String str2) {
        this(str, str2, t, t);
    }

    public SettingKey(String str, Class<T> cls, String str2) {
        this(str, cls, str2, (Object) null, (Object) null);
    }

    public SettingKey(String str, T t, String str2, String... strArr) {
        this(str, str2, t, t, strArr);
    }

    public SettingKey(String str, String str2, T t, T t2) {
        this(str, t.getClass(), str2, t, t2, false, null);
    }

    public SettingKey(String str, Class<T> cls, String str2, T t, T t2) {
        this(str, cls, str2, t, t2, false, null);
    }

    public SettingKey(String str, String str2, T t, T t2, boolean z) {
        this(str, t.getClass(), str2, t, t2, z, null);
    }

    public SettingKey(String str, Class<T> cls, String str2, T t, T t2, boolean z) {
        this(str, cls, str2, t, t2, z, null);
    }

    public SettingKey(String str, Class<T> cls, String str2, T t, T t2, boolean z, String[] strArr) {
        this.name = str;
        this.description = str2;
        this.defaultValue = t;
        this.debugValue = t2;
        this.type = cls;
        this.option = strArr;
        this.sticky = z;
    }
}
