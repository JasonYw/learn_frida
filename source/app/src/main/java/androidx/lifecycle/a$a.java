package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes23.dex */
public class a$a {
    public final Map<Lifecycle.Event, List<a$b>> LIZ = new HashMap();
    public final Map<a$b, Lifecycle.Event> LIZIZ;

    static {
        Covode.recordClassIndex(1399);
    }

    public a$a(Map<a$b, Lifecycle.Event> map) {
        this.LIZIZ = map;
        for (Map.Entry<a$b, Lifecycle.Event> entry : map.entrySet()) {
            Lifecycle.Event value = entry.getValue();
            List<a$b> list = this.LIZ.get(value);
            if (list == null) {
                list = new ArrayList<>();
                this.LIZ.put(value, list);
            }
            list.add(entry.getKey());
        }
    }

    public static void LIZ(List<a$b> list, LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                list.get(size).LIZ(lifecycleOwner, event, obj);
            }
        }
    }
}
