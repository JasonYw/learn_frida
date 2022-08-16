package cn.ever.cloud.utils.monitor;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public abstract class ModuleConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final HashMap<String, EventEntry> entry;
    public final boolean isForSdk;
    public final String name;

    static {
        Covode.recordClassIndex(3493);
    }

    /* loaded from: classes23.dex */
    public static final class EventEntry {
        public final String[] args;
        public final String name;

        static {
            Covode.recordClassIndex(3494);
        }

        public final String[] getArgs() {
            return this.args;
        }

        public final String getName() {
            return this.name;
        }

        public EventEntry(String str, String... strArr) {
            C106862S5w.LIZ((Object) str, (Object) strArr);
            this.name = str;
            this.args = strArr;
        }
    }

    public final HashMap<String, EventEntry> getEntry() {
        return this.entry;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean isForSdk() {
        return this.isForSdk;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModuleConfig(String str) {
        this(str, false);
        C106862S5w.LIZ(str);
    }

    public ModuleConfig(String str, boolean z) {
        C106862S5w.LIZ(str);
        this.name = str;
        this.isForSdk = z;
        this.entry = new HashMap<>();
    }

    public void register(String str, String... strArr) {
        if (PatchProxy.proxy(new Object[]{str, strArr}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ((Object) str, (Object) strArr);
        this.entry.put(str, new EventEntry(this.name, (String[]) Arrays.copyOf(strArr, strArr.length)));
    }

    public /* synthetic */ ModuleConfig(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }
}
