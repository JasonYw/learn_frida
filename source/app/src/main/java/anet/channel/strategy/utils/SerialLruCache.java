package anet.channel.strategy.utils;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class SerialLruCache<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a */
    public int f20807a;

    static {
        Covode.recordClassIndex(2345);
    }

    public boolean entryRemoved(Map.Entry<K, V> entry) {
        return true;
    }

    public SerialLruCache(LinkedHashMap<K, V> linkedHashMap) {
        this(linkedHashMap, 256);
    }

    public SerialLruCache(int i) {
        super(i + 1, 1.0f, true);
        this.f20807a = i;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (size() > this.f20807a) {
            return entryRemoved(entry);
        }
        return false;
    }

    public SerialLruCache(LinkedHashMap<K, V> linkedHashMap, int i) {
        super(linkedHashMap);
        this.f20807a = i;
    }
}
