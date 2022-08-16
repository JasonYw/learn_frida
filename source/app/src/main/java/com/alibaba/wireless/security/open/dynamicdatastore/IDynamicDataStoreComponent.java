package com.alibaba.wireless.security.open.dynamicdatastore;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;
import com.bytedance.covode.number.Covode;

@InterfacePluginInfo(pluginName = "main")
/* loaded from: classes2.dex */
public interface IDynamicDataStoreComponent extends IComponent {
    static {
        Covode.recordClassIndex(4571);
    }

    boolean getBoolean(String str);

    byte[] getByteArray(String str);

    byte[] getByteArrayDDp(String str);

    byte[] getByteArrayDDpEx(String str, int i);

    float getFloat(String str);

    int getInt(String str);

    long getLong(String str);

    String getString(String str);

    String getStringDDp(String str);

    String getStringDDpEx(String str, int i);

    int putBoolean(String str, boolean z);

    int putByteArray(String str, byte[] bArr);

    int putByteArrayDDp(String str, byte[] bArr);

    boolean putByteArrayDDpEx(String str, byte[] bArr, int i);

    int putFloat(String str, float f);

    int putInt(String str, int i);

    int putLong(String str, long j);

    int putString(String str, String str2);

    int putStringDDp(String str, String str2);

    boolean putStringDDpEx(String str, String str2, int i);

    void removeBoolean(String str);

    void removeByteArray(String str);

    void removeByteArrayDDp(String str);

    void removeByteArrayDDpEx(String str, int i);

    void removeFloat(String str);

    void removeInt(String str);

    void removeLong(String str);

    void removeString(String str);

    void removeStringDDp(String str);

    void removeStringDDpEx(String str, int i);
}
