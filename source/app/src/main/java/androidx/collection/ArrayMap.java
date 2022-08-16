package androidx.collection;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p003X.AbstractC139200d9o;

/* loaded from: classes17.dex */
public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {
    public AbstractC139200d9o<K, V> mCollections;

    static {
        Covode.recordClassIndex(795);
    }

    public ArrayMap() {
    }

    private AbstractC139200d9o<K, V> getCollection() {
        if (this.mCollections == null) {
            this.mCollections = new AbstractC139200d9o<K, V>() { // from class: androidx.collection.ArrayMap.1
                static {
                    Covode.recordClassIndex(796);
                }

                @Override // p003X.AbstractC139200d9o
                public final Map<K, V> LIZIZ() {
                    return ArrayMap.this;
                }

                @Override // p003X.AbstractC139200d9o
                public final int LIZ() {
                    return ArrayMap.this.mSize;
                }

                @Override // p003X.AbstractC139200d9o
                public final void LIZJ() {
                    ArrayMap.this.clear();
                }

                @Override // p003X.AbstractC139200d9o
                public final int LIZIZ(Object obj) {
                    return ArrayMap.this.indexOfValue(obj);
                }

                @Override // p003X.AbstractC139200d9o
                public final int LIZ(Object obj) {
                    return ArrayMap.this.indexOfKey(obj);
                }

                @Override // p003X.AbstractC139200d9o
                public final void LIZ(int i) {
                    ArrayMap.this.removeAt(i);
                }

                @Override // p003X.AbstractC139200d9o
                public final Object LIZ(int i, int i2) {
                    return ArrayMap.this.mArray[(i << 1) + i2];
                }

                @Override // p003X.AbstractC139200d9o
                public final V LIZ(int i, V v) {
                    return ArrayMap.this.setValueAt(i, v);
                }

                @Override // p003X.AbstractC139200d9o
                public final void LIZ(K k, V v) {
                    ArrayMap.this.put(k, v);
                }
            };
        }
        return this.mCollections;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return getCollection().LIZLLL();
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        AbstractC139200d9o<K, V> collection = getCollection();
        if (collection.LIZIZ == null) {
            collection.LIZIZ = new AbstractC139200d9o.C0078b();
        }
        return collection.LIZIZ;
    }

    @Override // java.util.Map
    public Collection<V> values() {
        AbstractC139200d9o<K, V> collection = getCollection();
        if (collection.LIZLLL == null) {
            collection.LIZLLL = new AbstractC139200d9o.C0080e();
        }
        return collection.LIZLLL;
    }

    public ArrayMap(int i) {
        super(i);
    }

    public boolean containsAll(Collection<?> collection) {
        return AbstractC139200d9o.LIZ((Map) this, collection);
    }

    public boolean removeAll(Collection<?> collection) {
        return AbstractC139200d9o.LIZIZ(this, collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return AbstractC139200d9o.LIZJ(this, collection);
    }

    public ArrayMap(SimpleArrayMap simpleArrayMap) {
        super(simpleArrayMap);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        ensureCapacity(this.mSize + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }
}
