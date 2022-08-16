package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.core.view.ViewCompat;
import com.bytedance.covode.number.Covode;
import com.umeng.commonsdk.vchannel.C33968a;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import org.xmlpull.v1.XmlPullParser;
import p002O.C0002O;
import p003X.AbstractC138549czJ;
import p003X.AbstractC139162d9C;
import p003X.AbstractC139174d9O;
import p003X.C138517cyn;
import p003X.C138552czM;
import p003X.C139133d8j;
import p003X.C139166d9G;
import p003X.C6FV;
import p003X.V9D;

/* loaded from: classes17.dex */
public abstract class Transition implements Cloneable {
    public static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    public static final AbstractC138549czJ STRAIGHT_PATH_MOTION = new AbstractC138549czJ() { // from class: androidx.transition.Transition.1
        static {
            Covode.recordClassIndex(1941);
        }

        @Override // p003X.AbstractC138549czJ
        public final Path LIZ(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    };
    public static ThreadLocal<ArrayMap<Animator, C0428a>> sRunningAnimators = new ThreadLocal<>();
    public ArrayList<C0429ae> mEndValuesList;
    public AbstractC139174d9O mEpicenterCallback;
    public ArrayMap<String, String> mNameOverrides;
    public AbstractC139162d9C mPropagation;
    public ArrayList<C0429ae> mStartValuesList;
    public String mName = getClass().getName();
    public long mStartDelay = -1;
    public long mDuration = -1;
    public TimeInterpolator mInterpolator = null;
    public ArrayList<Integer> mTargetIds = new ArrayList<>();
    public ArrayList<View> mTargets = new ArrayList<>();
    public ArrayList<String> mTargetNames = null;
    public ArrayList<Class> mTargetTypes = null;
    public ArrayList<Integer> mTargetIdExcludes = null;
    public ArrayList<View> mTargetExcludes = null;
    public ArrayList<Class> mTargetTypeExcludes = null;
    public ArrayList<String> mTargetNameExcludes = null;
    public ArrayList<Integer> mTargetIdChildExcludes = null;
    public ArrayList<View> mTargetChildExcludes = null;
    public ArrayList<Class> mTargetTypeChildExcludes = null;
    public C0430af mStartValues = new C0430af();
    public C0430af mEndValues = new C0430af();
    public C139166d9G mParent = null;
    public int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    public ViewGroup mSceneRoot = null;
    public boolean mCanRemoveViews = false;
    public ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    public int mNumInstances = 0;
    public boolean mPaused = false;
    public boolean mEnded = false;
    public ArrayList<TransitionListener> mListeners = null;
    public ArrayList<Animator> mAnimators = new ArrayList<>();
    public AbstractC138549czJ mPathMotion = STRAIGHT_PATH_MOTION;

    /* loaded from: classes17.dex */
    public interface TransitionListener {
        static {
            Covode.recordClassIndex(1944);
        }

        void onTransitionCancel(Transition transition);

        void onTransitionEnd(Transition transition);

        void onTransitionPause(Transition transition);

        void onTransitionResume(Transition transition);

        void onTransitionStart(Transition transition);
    }

    public static boolean isValidMatch(int i) {
        return i > 0 && i <= 4;
    }

    public abstract void captureEndValues(C0429ae c0429ae);

    public abstract void captureStartValues(C0429ae c0429ae);

    public Animator createAnimator(ViewGroup viewGroup, C0429ae c0429ae, C0429ae c0429ae2) {
        return null;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public String toString() {
        return toString("");
    }

    public Rect getEpicenter() {
        AbstractC139174d9O abstractC139174d9O = this.mEpicenterCallback;
        if (abstractC139174d9O == null) {
            return null;
        }
        return abstractC139174d9O.LIZ();
    }

    public static ArrayMap<Animator, C0428a> getRunningAnimators() {
        ArrayMap<Animator, C0428a> arrayMap = sRunningAnimators.get();
        if (arrayMap == null) {
            ArrayMap<Animator, C0428a> arrayMap2 = new ArrayMap<>();
            sRunningAnimators.set(arrayMap2);
            return arrayMap2;
        }
        return arrayMap;
    }

    static {
        Covode.recordClassIndex(1940);
    }

    public void cancel() {
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).cancel();
        }
        ArrayList<TransitionListener> arrayList = this.mListeners;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((TransitionListener) arrayList2.get(i)).onTransitionCancel(this);
            }
        }
    }

    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.mAnimators = new ArrayList<>();
            transition.mStartValues = new C0430af();
            transition.mEndValues = new C0430af();
            transition.mStartValuesList = null;
            transition.mEndValuesList = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public void runAnimators() {
        start();
        ArrayMap<Animator, C0428a> runningAnimators = getRunningAnimators();
        Iterator<Animator> it = this.mAnimators.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (runningAnimators.containsKey(next)) {
                start();
                runAnimator(next, runningAnimators);
            }
        }
        this.mAnimators.clear();
        end();
    }

    public void start() {
        if (this.mNumInstances == 0) {
            ArrayList<TransitionListener> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((TransitionListener) arrayList2.get(i)).onTransitionStart(this);
                }
            }
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public Transition() {
    }

    public void end() {
        this.mNumInstances--;
        if (this.mNumInstances == 0) {
            ArrayList<TransitionListener> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((TransitionListener) arrayList2.get(i)).onTransitionEnd(this);
                }
            }
            for (int i2 = 0; i2 < this.mStartValues.LIZJ.size(); i2++) {
                View valueAt = this.mStartValues.LIZJ.valueAt(i2);
                if (valueAt != null) {
                    ViewCompat.setHasTransientState(valueAt, false);
                }
            }
            for (int i3 = 0; i3 < this.mEndValues.LIZJ.size(); i3++) {
                View valueAt2 = this.mEndValues.LIZJ.valueAt(i3);
                if (valueAt2 != null) {
                    ViewCompat.setHasTransientState(valueAt2, false);
                }
            }
            this.mEnded = true;
        }
    }

    public void setCanRemoveViews(boolean z) {
        this.mCanRemoveViews = z;
    }

    public Transition setDuration(long j) {
        this.mDuration = j;
        return this;
    }

    public void setEpicenterCallback(AbstractC139174d9O abstractC139174d9O) {
        this.mEpicenterCallback = abstractC139174d9O;
    }

    public Transition setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setPropagation(AbstractC139162d9C abstractC139162d9C) {
        this.mPropagation = abstractC139162d9C;
    }

    public Transition setSceneRoot(ViewGroup viewGroup) {
        this.mSceneRoot = viewGroup;
        return this;
    }

    public Transition setStartDelay(long j) {
        this.mStartDelay = j;
        return this;
    }

    public Transition addTarget(View view) {
        this.mTargets.add(view);
        return this;
    }

    public Transition removeTarget(View view) {
        this.mTargets.remove(view);
        return this;
    }

    public Transition addTarget(int i) {
        if (i != 0) {
            this.mTargetIds.add(Integer.valueOf(i));
        }
        return this;
    }

    public Transition removeTarget(int i) {
        if (i != 0) {
            this.mTargetIds.remove(Integer.valueOf(i));
        }
        return this;
    }

    public void setPathMotion(AbstractC138549czJ abstractC138549czJ) {
        if (abstractC138549czJ == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = abstractC138549czJ;
        }
    }

    public Transition addListener(TransitionListener transitionListener) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(transitionListener);
        return this;
    }

    public Transition addTarget(Class cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    public Transition removeListener(TransitionListener transitionListener) {
        ArrayList<TransitionListener> arrayList = this.mListeners;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(transitionListener);
        if (this.mListeners.size() == 0) {
            this.mListeners = null;
        }
        return this;
    }

    public Transition removeTarget(Class cls) {
        ArrayList<Class> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    public Transition addTarget(String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    public void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        long j = this.mDuration;
        if (j >= 0) {
            animator.setDuration(j);
        }
        long j2 = this.mStartDelay;
        if (j2 >= 0) {
            animator.setStartDelay(j2);
        }
        TimeInterpolator timeInterpolator = this.mInterpolator;
        if (timeInterpolator != null) {
            animator.setInterpolator(timeInterpolator);
        }
        animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.transition.Transition.3
            static {
                Covode.recordClassIndex(1943);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator2) {
                Transition.this.end();
                animator2.removeListener(this);
            }
        });
        animator.start();
    }

    public void capturePropagationValues(C0429ae c0429ae) {
        String[] LIZ;
        if (this.mPropagation == null || c0429ae.LIZ.isEmpty() || (LIZ = this.mPropagation.LIZ()) == null) {
            return;
        }
        for (String str : LIZ) {
            if (!c0429ae.LIZ.containsKey(str)) {
                this.mPropagation.LIZ(c0429ae);
                return;
            }
        }
    }

    public void clearValues(boolean z) {
        if (z) {
            this.mStartValues.LIZ.clear();
            this.mStartValues.LIZIZ.clear();
            this.mStartValues.LIZJ.clear();
            return;
        }
        this.mEndValues.LIZ.clear();
        this.mEndValues.LIZIZ.clear();
        this.mEndValues.LIZJ.clear();
    }

    public void forceToEnd(ViewGroup viewGroup) {
        ArrayMap<Animator, C0428a> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        if (viewGroup != null) {
            V9D LIZIZ = C139133d8j.LIZIZ(viewGroup);
            for (int i = size - 1; i >= 0; i--) {
                C0428a valueAt = runningAnimators.valueAt(i);
                if (valueAt.LIZ != null && LIZIZ.equals(valueAt.LIZLLL)) {
                    runningAnimators.keyAt(i).end();
                }
            }
        }
    }

    public Transition removeTarget(String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            for (int i = 0; i < iArr.length; i++) {
                if (isValidMatch(iArr[i])) {
                    if (alreadyContains(iArr, i)) {
                        throw new IllegalArgumentException("matches contains a duplicate value");
                    }
                } else {
                    throw new IllegalArgumentException("matches contains invalid value");
                }
            }
            this.mMatchOrder = (int[]) iArr.clone();
            return;
        }
        this.mMatchOrder = DEFAULT_MATCH_ORDER;
    }

    public static int[] parseMatchOrder(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, Constants.ACCEPT_TIME_SEPARATOR_SP);
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if (C33968a.f42937f.equalsIgnoreCase(trim)) {
                iArr[i] = 3;
            } else if ("instance".equalsIgnoreCase(trim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i] = 2;
            } else if ("itemId".equalsIgnoreCase(trim)) {
                iArr[i] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            } else {
                throw new InflateException(C0002O.m25085C("Unknown match type in matchOrder: '", trim, "'"));
            }
            i++;
        }
        return iArr;
    }

    public void pause(View view) {
        int i;
        if (!this.mEnded) {
            ArrayMap<Animator, C0428a> runningAnimators = getRunningAnimators();
            int size = runningAnimators.size();
            V9D LIZIZ = C139133d8j.LIZIZ(view);
            int i2 = size - 1;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                C0428a valueAt = runningAnimators.valueAt(i2);
                if (valueAt.LIZ != null && LIZIZ.equals(valueAt.LIZLLL)) {
                    int i3 = Build.VERSION.SDK_INT;
                    runningAnimators.keyAt(i2).pause();
                }
                i2--;
            }
            ArrayList<TransitionListener> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size2 = arrayList2.size();
                for (i = 0; i < size2; i++) {
                    ((TransitionListener) arrayList2.get(i)).onTransitionPause(this);
                }
            }
            this.mPaused = true;
        }
    }

    public void playTransition(ViewGroup viewGroup) {
        C0428a c0428a;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        matchStartAndEnd(this.mStartValues, this.mEndValues);
        ArrayMap<Animator, C0428a> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        V9D LIZIZ = C139133d8j.LIZIZ(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator keyAt = runningAnimators.keyAt(i);
            if (keyAt != null && (c0428a = runningAnimators.get(keyAt)) != null && c0428a.LIZ != null && LIZIZ.equals(c0428a.LIZLLL)) {
                C0429ae c0429ae = c0428a.LIZJ;
                View view = c0428a.LIZ;
                C0429ae transitionValues = getTransitionValues(view, true);
                C0429ae matchedTransitionValues = getMatchedTransitionValues(view, true);
                if ((transitionValues != null || matchedTransitionValues != null) && c0428a.f20289LJ.isTransitionRequired(c0429ae, matchedTransitionValues)) {
                    if (!keyAt.isRunning() && !keyAt.isStarted()) {
                        runningAnimators.remove(keyAt);
                    } else {
                        keyAt.cancel();
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        runAnimators();
    }

    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                ArrayMap<Animator, C0428a> runningAnimators = getRunningAnimators();
                int size = runningAnimators.size();
                V9D LIZIZ = C139133d8j.LIZIZ(view);
                for (int i = size - 1; i >= 0; i--) {
                    C0428a valueAt = runningAnimators.valueAt(i);
                    if (valueAt.LIZ != null && LIZIZ.equals(valueAt.LIZLLL)) {
                        int i2 = Build.VERSION.SDK_INT;
                        runningAnimators.keyAt(i).resume();
                    }
                }
                ArrayList<TransitionListener> arrayList = this.mListeners;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((TransitionListener) arrayList2.get(i3)).onTransitionResume(this);
                    }
                }
            }
            this.mPaused = false;
        }
    }

    public boolean isValidTarget(View view) {
        ArrayList<Class> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null && ViewCompat.getTransitionName(view) != null && this.mTargetNameExcludes.contains(ViewCompat.getTransitionName(view))) {
            return false;
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null && arrayList6.contains(ViewCompat.getTransitionName(view))) {
            return true;
        }
        if (this.mTargetTypes != null) {
            for (int i2 = 0; i2 < this.mTargetTypes.size(); i2++) {
                if (this.mTargetTypes.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.mDuration != -1) {
            str2 = str2 + "dur(" + this.mDuration + ") ";
        }
        if (this.mStartDelay != -1) {
            str2 = str2 + "dly(" + this.mStartDelay + ") ";
        }
        if (this.mInterpolator != null) {
            str2 = str2 + "interp(" + this.mInterpolator + ") ";
        }
        if (this.mTargetIds.size() > 0 || this.mTargets.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.mTargetIds.size() > 0) {
                for (int i = 0; i < this.mTargetIds.size(); i++) {
                    if (i > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.mTargetIds.get(i);
                }
            }
            if (this.mTargets.size() > 0) {
                for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                    if (i2 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.mTargets.get(i2);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    public static boolean alreadyContains(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    private void runAnimator(Animator animator, final ArrayMap<Animator, C0428a> arrayMap) {
        if (animator != null) {
            animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.transition.Transition.2
                static {
                    Covode.recordClassIndex(1942);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator2) {
                    Transition.this.mCurrentAnimators.add(animator2);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator2) {
                    arrayMap.remove(animator2);
                    Transition.this.mCurrentAnimators.remove(animator2);
                }
            });
            animate(animator);
        }
    }

    public Transition excludeChildren(int i, boolean z) {
        this.mTargetIdChildExcludes = excludeId(this.mTargetIdChildExcludes, i, z);
        return this;
    }

    public Transition excludeTarget(int i, boolean z) {
        this.mTargetIdExcludes = excludeId(this.mTargetIdExcludes, i, z);
        return this;
    }

    public Transition excludeChildren(View view, boolean z) {
        this.mTargetChildExcludes = excludeView(this.mTargetChildExcludes, view, z);
        return this;
    }

    public Transition excludeTarget(View view, boolean z) {
        this.mTargetExcludes = excludeView(this.mTargetExcludes, view, z);
        return this;
    }

    public C0429ae getTransitionValues(View view, boolean z) {
        C0430af c0430af;
        C139166d9G c139166d9G = this.mParent;
        if (c139166d9G != null) {
            return c139166d9G.getTransitionValues(view, z);
        }
        if (z) {
            c0430af = this.mStartValues;
        } else {
            c0430af = this.mEndValues;
        }
        return c0430af.LIZ.get(view);
    }

    private void matchInstances(ArrayMap<View, C0429ae> arrayMap, ArrayMap<View, C0429ae> arrayMap2) {
        C0429ae remove;
        for (int size = arrayMap.size() - 1; size >= 0; size--) {
            View keyAt = arrayMap.keyAt(size);
            if (keyAt != null && isValidTarget(keyAt) && (remove = arrayMap2.remove(keyAt)) != null && remove.LIZIZ != null && isValidTarget(remove.LIZIZ)) {
                this.mStartValuesList.add(arrayMap.removeAt(size));
                this.mEndValuesList.add(remove);
            }
        }
    }

    public Transition excludeChildren(Class cls, boolean z) {
        this.mTargetTypeChildExcludes = excludeType(this.mTargetTypeChildExcludes, cls, z);
        return this;
    }

    public Transition excludeTarget(Class cls, boolean z) {
        this.mTargetTypeExcludes = excludeType(this.mTargetTypeExcludes, cls, z);
        return this;
    }

    public C0429ae getMatchedTransitionValues(View view, boolean z) {
        ArrayList<C0429ae> arrayList;
        ArrayList<C0429ae> arrayList2;
        C139166d9G c139166d9G = this.mParent;
        if (c139166d9G != null) {
            return c139166d9G.getMatchedTransitionValues(view, z);
        }
        if (z) {
            arrayList = this.mStartValuesList;
        } else {
            arrayList = this.mEndValuesList;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0429ae c0429ae = arrayList.get(i);
            if (c0429ae == null) {
                return null;
            }
            if (c0429ae.LIZIZ == view) {
                if (i < 0) {
                    return null;
                }
                if (z) {
                    arrayList2 = this.mEndValuesList;
                } else {
                    arrayList2 = this.mStartValuesList;
                }
                return arrayList2.get(i);
            }
        }
        return null;
    }

    public boolean isTransitionRequired(C0429ae c0429ae, C0429ae c0429ae2) {
        if (c0429ae != null && c0429ae2 != null) {
            String[] transitionProperties = getTransitionProperties();
            if (transitionProperties != null) {
                for (String str : transitionProperties) {
                    if (isValueChanged(c0429ae, c0429ae2, str)) {
                        return true;
                    }
                }
            } else {
                for (String str2 : c0429ae.LIZ.keySet()) {
                    if (isValueChanged(c0429ae, c0429ae2, str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void addUnmatched(ArrayMap<View, C0429ae> arrayMap, ArrayMap<View, C0429ae> arrayMap2) {
        for (int i = 0; i < arrayMap.size(); i++) {
            C0429ae valueAt = arrayMap.valueAt(i);
            if (isValidTarget(valueAt.LIZIZ)) {
                this.mStartValuesList.add(valueAt);
                this.mEndValuesList.add(null);
            }
        }
        for (int i2 = 0; i2 < arrayMap2.size(); i2++) {
            C0429ae valueAt2 = arrayMap2.valueAt(i2);
            if (isValidTarget(valueAt2.LIZIZ)) {
                this.mEndValuesList.add(valueAt2);
                this.mStartValuesList.add(null);
            }
        }
    }

    private void matchStartAndEnd(C0430af c0430af, C0430af c0430af2) {
        ArrayMap<View, C0429ae> arrayMap = new ArrayMap<>(c0430af.LIZ);
        ArrayMap<View, C0429ae> arrayMap2 = new ArrayMap<>(c0430af2.LIZ);
        int i = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                matchItemIds(arrayMap, arrayMap2, c0430af.LIZJ, c0430af2.LIZJ);
                            }
                        } else {
                            matchIds(arrayMap, arrayMap2, c0430af.LIZIZ, c0430af2.LIZIZ);
                        }
                    } else {
                        matchNames(arrayMap, arrayMap2, c0430af.LIZLLL, c0430af2.LIZLLL);
                    }
                } else {
                    matchInstances(arrayMap, arrayMap2);
                }
                i++;
            } else {
                addUnmatched(arrayMap, arrayMap2);
                return;
            }
        }
    }

    public Transition excludeTarget(String str, boolean z) {
        this.mTargetNameExcludes = excludeObject(this.mTargetNameExcludes, str, z);
        return this;
    }

    public Transition(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C138552czM.LIZIZ);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        long LIZ = C138517cyn.LIZ(obtainStyledAttributes, xmlPullParser, "duration", 1, -1);
        if (LIZ >= 0) {
            setDuration(LIZ);
        }
        long LIZ2 = C138517cyn.LIZ(obtainStyledAttributes, xmlPullParser, "startDelay", 2, -1);
        if (LIZ2 > 0) {
            setStartDelay(LIZ2);
        }
        int LIZJ = C138517cyn.LIZJ(obtainStyledAttributes, xmlPullParser, "interpolator", 0, 0);
        if (LIZJ > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, LIZJ));
        }
        String LIZ3 = C138517cyn.LIZ(obtainStyledAttributes, xmlPullParser, "matchOrder", 3);
        if (LIZ3 != null) {
            setMatchOrder(parseMatchOrder(LIZ3));
        }
        obtainStyledAttributes.recycle();
    }

    private void captureHierarchy(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return;
        }
        ArrayList<View> arrayList2 = this.mTargetExcludes;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return;
        }
        ArrayList<Class> arrayList3 = this.mTargetTypeExcludes;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            C0429ae c0429ae = new C0429ae();
            c0429ae.LIZIZ = view;
            if (z) {
                captureStartValues(c0429ae);
            } else {
                captureEndValues(c0429ae);
            }
            c0429ae.LIZJ.add(this);
            capturePropagationValues(c0429ae);
            if (z) {
                addViewValues(this.mStartValues, view, c0429ae);
            } else {
                addViewValues(this.mEndValues, view, c0429ae);
            }
        }
        if (view instanceof ViewGroup) {
            ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
            if (arrayList4 != null && arrayList4.contains(Integer.valueOf(id))) {
                return;
            }
            ArrayList<View> arrayList5 = this.mTargetChildExcludes;
            if (arrayList5 != null && arrayList5.contains(view)) {
                return;
            }
            ArrayList<Class> arrayList6 = this.mTargetTypeChildExcludes;
            if (arrayList6 != null) {
                int size2 = arrayList6.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (this.mTargetTypeChildExcludes.get(i2).isInstance(view)) {
                        return;
                    }
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                captureHierarchy(viewGroup.getChildAt(i3), z);
            }
        }
    }

    public void captureValues(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class> arrayList2;
        ArrayMap<String, String> arrayMap;
        clearValues(z);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                View findViewById = viewGroup.findViewById(this.mTargetIds.get(i).intValue());
                if (findViewById != null) {
                    C0429ae c0429ae = new C0429ae();
                    c0429ae.LIZIZ = findViewById;
                    if (z) {
                        captureStartValues(c0429ae);
                    } else {
                        captureEndValues(c0429ae);
                    }
                    c0429ae.LIZJ.add(this);
                    capturePropagationValues(c0429ae);
                    if (z) {
                        addViewValues(this.mStartValues, findViewById, c0429ae);
                    } else {
                        addViewValues(this.mEndValues, findViewById, c0429ae);
                    }
                }
            }
            for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                View view = this.mTargets.get(i2);
                C0429ae c0429ae2 = new C0429ae();
                c0429ae2.LIZIZ = view;
                if (z) {
                    captureStartValues(c0429ae2);
                } else {
                    captureEndValues(c0429ae2);
                }
                c0429ae2.LIZJ.add(this);
                capturePropagationValues(c0429ae2);
                if (z) {
                    addViewValues(this.mStartValues, view, c0429ae2);
                } else {
                    addViewValues(this.mEndValues, view, c0429ae2);
                }
            }
        } else {
            captureHierarchy(viewGroup, z);
        }
        if (!z && (arrayMap = this.mNameOverrides) != null) {
            int size = arrayMap.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.mStartValues.LIZLLL.remove(this.mNameOverrides.keyAt(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                Object obj = arrayList3.get(i4);
                if (obj != null) {
                    this.mStartValues.LIZLLL.put(this.mNameOverrides.valueAt(i4), obj);
                }
            }
        }
    }

    public static <T> ArrayList<T> excludeObject(ArrayList<T> arrayList, T t, boolean z) {
        if (t != null) {
            if (z) {
                return C6FV.LIZ(arrayList, t);
            }
            return C6FV.LIZIZ(arrayList, t);
        }
        return arrayList;
    }

    private ArrayList<Class> excludeType(ArrayList<Class> arrayList, Class cls, boolean z) {
        if (cls != null) {
            if (z) {
                return C6FV.LIZ(arrayList, cls);
            }
            return C6FV.LIZIZ(arrayList, cls);
        }
        return arrayList;
    }

    private ArrayList<View> excludeView(ArrayList<View> arrayList, View view, boolean z) {
        if (view != null) {
            if (z) {
                return C6FV.LIZ(arrayList, view);
            }
            return C6FV.LIZIZ(arrayList, view);
        }
        return arrayList;
    }

    private ArrayList<Integer> excludeId(ArrayList<Integer> arrayList, int i, boolean z) {
        if (i > 0) {
            if (z) {
                return C6FV.LIZ(arrayList, Integer.valueOf(i));
            }
            return C6FV.LIZIZ(arrayList, Integer.valueOf(i));
        }
        return arrayList;
    }

    public static boolean isValueChanged(C0429ae c0429ae, C0429ae c0429ae2, String str) {
        Object obj = c0429ae.LIZ.get(str);
        Object obj2 = c0429ae2.LIZ.get(str);
        if (obj == null) {
            if (obj2 == null) {
                return false;
            }
        } else if (obj2 == null || !obj.equals(obj2)) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public static void addViewValues(C0430af c0430af, View view, C0429ae c0429ae) {
        c0430af.LIZ.put(view, c0429ae);
        int id = view.getId();
        if (id >= 0) {
            if (c0430af.LIZIZ.indexOfKey(id) >= 0) {
                c0430af.LIZIZ.put(id, null);
            } else {
                c0430af.LIZIZ.put(id, view);
            }
        }
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            if (c0430af.LIZLLL.containsKey(transitionName)) {
                c0430af.LIZLLL.put(transitionName, null);
            } else {
                c0430af.LIZLLL.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c0430af.LIZJ.indexOfKey(itemIdAtPosition) >= 0) {
                    View view2 = c0430af.LIZJ.get(itemIdAtPosition);
                    if (view2 != null) {
                        ViewCompat.setHasTransientState(view2, false);
                        c0430af.LIZJ.put(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                ViewCompat.setHasTransientState(view, true);
                c0430af.LIZJ.put(itemIdAtPosition, view);
            }
        }
    }

    private void matchIds(ArrayMap<View, C0429ae> arrayMap, ArrayMap<View, C0429ae> arrayMap2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && isValidTarget(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && isValidTarget(view)) {
                C0429ae c0429ae = arrayMap.get(valueAt);
                C0429ae c0429ae2 = arrayMap2.get(view);
                if (c0429ae != null && c0429ae2 != null) {
                    this.mStartValuesList.add(c0429ae);
                    this.mEndValuesList.add(c0429ae2);
                    arrayMap.remove(valueAt);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    private void matchItemIds(ArrayMap<View, C0429ae> arrayMap, ArrayMap<View, C0429ae> arrayMap2, LongSparseArray<View> longSparseArray, LongSparseArray<View> longSparseArray2) {
        View view;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = longSparseArray.valueAt(i);
            if (valueAt != null && isValidTarget(valueAt) && (view = longSparseArray2.get(longSparseArray.keyAt(i))) != null && isValidTarget(view)) {
                C0429ae c0429ae = arrayMap.get(valueAt);
                C0429ae c0429ae2 = arrayMap2.get(view);
                if (c0429ae != null && c0429ae2 != null) {
                    this.mStartValuesList.add(c0429ae);
                    this.mEndValuesList.add(c0429ae2);
                    arrayMap.remove(valueAt);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    private void matchNames(ArrayMap<View, C0429ae> arrayMap, ArrayMap<View, C0429ae> arrayMap2, ArrayMap<String, View> arrayMap3, ArrayMap<String, View> arrayMap4) {
        View view;
        int size = arrayMap3.size();
        for (int i = 0; i < size; i++) {
            View valueAt = arrayMap3.valueAt(i);
            if (valueAt != null && isValidTarget(valueAt) && (view = arrayMap4.get(arrayMap3.keyAt(i))) != null && isValidTarget(view)) {
                C0429ae c0429ae = arrayMap.get(valueAt);
                C0429ae c0429ae2 = arrayMap2.get(view);
                if (c0429ae != null && c0429ae2 != null) {
                    this.mStartValuesList.add(c0429ae);
                    this.mEndValuesList.add(c0429ae2);
                    arrayMap.remove(valueAt);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    /* renamed from: androidx.transition.Transition$a */
    /* loaded from: classes17.dex */
    public static class C0428a {
        public View LIZ;
        public String LIZIZ;
        public C0429ae LIZJ;
        public V9D LIZLLL;

        /* renamed from: LJ */
        public Transition f20289LJ;

        static {
            Covode.recordClassIndex(1945);
        }

        public C0428a(View view, String str, Transition transition, V9D v9d, C0429ae c0429ae) {
            this.LIZ = view;
            this.LIZIZ = str;
            this.LIZJ = c0429ae;
            this.LIZLLL = v9d;
            this.f20289LJ = transition;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void createAnimators(android.view.ViewGroup r26, androidx.transition.C0430af r27, androidx.transition.C0430af r28, java.util.ArrayList<androidx.transition.C0429ae> r29, java.util.ArrayList<androidx.transition.C0429ae> r30) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Transition.createAnimators(android.view.ViewGroup, androidx.transition.af, androidx.transition.af, java.util.ArrayList, java.util.ArrayList):void");
    }
}
