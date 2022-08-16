package androidx.arch.core.internal;

import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p003X.AbstractC144353eV9;
import p003X.C144352eV8;
import p003X.C144355eVB;
import p003X.C144356eVC;

/* loaded from: classes19.dex */
public class SafeIterableMap<K, V> implements Iterable<Map.Entry<K, V>> {
    public C144352eV8<K, V> mEnd;
    public WeakHashMap<AbstractC144353eV9<K, V>, Boolean> mIterators = new WeakHashMap<>();
    public int mSize = 0;
    public C144352eV8<K, V> mStart;

    static {
        Covode.recordClassIndex(761);
    }

    public Map.Entry<K, V> eldest() {
        return this.mStart;
    }

    public Map.Entry<K, V> newest() {
        return this.mEnd;
    }

    public int size() {
        return this.mSize;
    }

    public SafeIterableMap<K, V>.C0220d iteratorWithAdditions() {
        SafeIterableMap<K, V>.C0220d c0220d = new C0220d();
        this.mIterators.put(c0220d, Boolean.FALSE);
        return c0220d;
    }

    /* renamed from: androidx.arch.core.internal.SafeIterableMap$d */
    /* loaded from: classes19.dex */
    public class C0220d implements AbstractC144353eV9<K, V>, Iterator<Map.Entry<K, V>> {
        public C144352eV8<K, V> LIZIZ;
        public boolean LIZJ = true;

        static {
            if (ReDexClinitStringAb.abTest >= 5) {
                Covode.recordClassIndex(765);
            } else {
                Covode.recordClassIndex(765);
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.LIZJ) {
                if (SafeIterableMap.this.mStart != null) {
                    return true;
                }
                return false;
            }
            C144352eV8<K, V> c144352eV8 = this.LIZIZ;
            if (c144352eV8 != null && c144352eV8.LIZJ != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final /* bridge */ /* synthetic */ Object next() {
            C144352eV8<K, V> c144352eV8;
            if (this.LIZJ) {
                this.LIZJ = false;
                c144352eV8 = SafeIterableMap.this.mStart;
            } else {
                C144352eV8<K, V> c144352eV82 = this.LIZIZ;
                if (c144352eV82 != null) {
                    c144352eV8 = c144352eV82.LIZJ;
                } else {
                    c144352eV8 = null;
                }
            }
            this.LIZIZ = c144352eV8;
            return this.LIZIZ;
        }

        public C0220d() {
        }

        @Override // p003X.AbstractC144353eV9
        /* renamed from: a_ */
        public final void mo21193a_(C144352eV8<K, V> c144352eV8) {
            boolean z;
            C144352eV8<K, V> c144352eV82 = this.LIZIZ;
            if (c144352eV8 == c144352eV82) {
                this.LIZIZ = c144352eV82.LIZLLL;
                if (this.LIZIZ == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.LIZJ = z;
            }
        }
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C144356eVC c144356eVC = new C144356eVC(this.mEnd, this.mStart);
        this.mIterators.put(c144356eVC, Boolean.FALSE);
        return c144356eVC;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        C144355eVB c144355eVB = new C144355eVB(this.mStart, this.mEnd);
        this.mIterators.put(c144355eVB, Boolean.FALSE);
        return c144355eVB;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public C144352eV8<K, V> get(K k) {
        C144352eV8<K, V> c144352eV8 = this.mStart;
        while (c144352eV8 != null && !c144352eV8.LIZ.equals(k)) {
            c144352eV8 = c144352eV8.LIZJ;
        }
        return c144352eV8;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafeIterableMap)) {
            return false;
        }
        SafeIterableMap safeIterableMap = (SafeIterableMap) obj;
        if (size() != safeIterableMap.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = safeIterableMap.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if (next == null) {
                if (next2 != null) {
                    return false;
                }
            } else if (!next.equals(next2)) {
                return false;
            }
        }
        if (!it.hasNext() && !it2.hasNext()) {
            return true;
        }
        return false;
    }

    public V remove(K k) {
        C144352eV8<K, V> c144352eV8 = get(k);
        if (c144352eV8 == null) {
            return null;
        }
        this.mSize--;
        if (!this.mIterators.isEmpty()) {
            for (AbstractC144353eV9<K, V> abstractC144353eV9 : this.mIterators.keySet()) {
                abstractC144353eV9.mo21193a_(c144352eV8);
            }
        }
        if (c144352eV8.LIZLLL != null) {
            c144352eV8.LIZLLL.LIZJ = c144352eV8.LIZJ;
        } else {
            this.mStart = c144352eV8.LIZJ;
        }
        if (c144352eV8.LIZJ != null) {
            c144352eV8.LIZJ.LIZLLL = c144352eV8.LIZLLL;
        } else {
            this.mEnd = c144352eV8.LIZLLL;
        }
        c144352eV8.LIZJ = null;
        c144352eV8.LIZLLL = null;
        return c144352eV8.LIZIZ;
    }

    public V putIfAbsent(K k, V v) {
        C144352eV8<K, V> c144352eV8 = get(k);
        if (c144352eV8 != null) {
            return c144352eV8.LIZIZ;
        }
        put(k, v);
        return null;
    }

    public C144352eV8<K, V> put(K k, V v) {
        C144352eV8<K, V> c144352eV8 = new C144352eV8<>(k, v);
        this.mSize++;
        C144352eV8<K, V> c144352eV82 = this.mEnd;
        if (c144352eV82 == null) {
            this.mStart = c144352eV8;
            this.mEnd = this.mStart;
            return c144352eV8;
        }
        c144352eV82.LIZJ = c144352eV8;
        c144352eV8.LIZLLL = c144352eV82;
        this.mEnd = c144352eV8;
        return c144352eV8;
    }
}
