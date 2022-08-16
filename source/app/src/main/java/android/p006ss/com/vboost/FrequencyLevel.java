package android.p006ss.com.vboost;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: android.ss.com.vboost.FrequencyLevel */
/* loaded from: classes19.dex */
public enum FrequencyLevel {
    LEVEL_0("level_0", 0),
    LEVEL_1("level_1", 1),
    LEVEL_2("level_2", 2),
    LEVEL_3("level_3", 3),
    LEVEL_4("level_4", 4),
    LEVEL_5("level_5", 5),
    LEVEL_6("level_6", 6),
    LEVEL_7("level_7", 7),
    LEVEL_8("level_8", 8),
    LEVEL_9("level_9", 9);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public int index;
    public String name;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static FrequencyLevel[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (FrequencyLevel[]) proxy.result;
        }
        return (FrequencyLevel[]) values().clone();
    }

    static {
        Covode.recordClassIndex(33);
    }

    public static FrequencyLevel valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (FrequencyLevel) proxy.result;
        }
        return (FrequencyLevel) Enum.valueOf(FrequencyLevel.class, str);
    }

    public static FrequencyLevel valueOf(int i) {
        switch (i) {
            case 0:
                return LEVEL_0;
            case 1:
                return LEVEL_1;
            case 2:
                return LEVEL_2;
            case 3:
                return LEVEL_3;
            case 4:
                return LEVEL_4;
            case 5:
                return LEVEL_5;
            case 6:
                return LEVEL_6;
            case 7:
                return LEVEL_7;
            case 8:
                return LEVEL_8;
            case 9:
                return LEVEL_9;
            default:
                return null;
        }
    }

    FrequencyLevel(String str, int i) {
        this.name = str;
        this.index = i;
    }
}
