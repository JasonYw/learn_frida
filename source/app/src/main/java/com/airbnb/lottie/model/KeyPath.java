package com.airbnb.lottie.model;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p003X.AbstractC145196eim;

/* loaded from: classes19.dex */
public class KeyPath {
    public final List<String> keys;
    public AbstractC145196eim resolvedElement;

    static {
        Covode.recordClassIndex(4081);
    }

    public AbstractC145196eim getResolvedElement() {
        return this.resolvedElement;
    }

    public String keysToString() {
        return this.keys.toString();
    }

    private boolean endsWithGlobstar() {
        List<String> list = this.keys;
        return list.get(list.size() - 1).equals("**");
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.keys);
        sb.append(",resolved=");
        if (this.resolvedElement != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }

    private boolean isContainer(String str) {
        return "__container".equals(str);
    }

    public KeyPath resolve(AbstractC145196eim abstractC145196eim) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.resolvedElement = abstractC145196eim;
        return keyPath;
    }

    public KeyPath(String... strArr) {
        this.keys = Arrays.asList(strArr);
    }

    public KeyPath addKey(String str) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.keys.add(str);
        return keyPath;
    }

    public KeyPath(KeyPath keyPath) {
        this.keys = new ArrayList(keyPath.keys);
        this.resolvedElement = keyPath.resolvedElement;
    }

    public int incrementDepthBy(String str, int i) {
        if (isContainer(str)) {
            return 0;
        }
        if (!this.keys.get(i).equals("**")) {
            return 1;
        }
        if (i == this.keys.size() - 1 || !this.keys.get(i + 1).equals(str)) {
            return 0;
        }
        return 2;
    }

    public boolean propagateToChildren(String str, int i) {
        if ("__container".equals(str) || i < this.keys.size() - 1 || this.keys.get(i).equals("**")) {
            return true;
        }
        return false;
    }

    public boolean matches(String str, int i) {
        if (isContainer(str)) {
            return true;
        }
        if (i >= this.keys.size()) {
            return false;
        }
        if (this.keys.get(i).equals(str) || this.keys.get(i).equals("**") || this.keys.get(i).equals("*")) {
            return true;
        }
        return false;
    }

    public boolean fullyResolvesTo(String str, int i) {
        boolean z;
        boolean z2;
        if (i >= this.keys.size()) {
            return false;
        }
        if (i == this.keys.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = this.keys.get(i);
        if (!str2.equals("**")) {
            if (!str2.equals(str) && !str2.equals("*")) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((!z && (i != this.keys.size() - 2 || !endsWithGlobstar())) || !z2) {
                return false;
            }
            return true;
        } else if (z) {
            return true;
        } else {
            if (this.keys.get(i + 1).equals(str)) {
                if (i != this.keys.size() - 2 && (i != this.keys.size() - 3 || !endsWithGlobstar())) {
                    return false;
                }
                return true;
            }
            int i2 = i + 1;
            if (i2 < this.keys.size() - 1) {
                return false;
            }
            return this.keys.get(i2).equals(str);
        }
    }
}
