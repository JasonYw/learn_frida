package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0293j;
import androidx.transition.Transition;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import p003X.AbstractC139174d9O;
import p003X.C138579czn;
import p003X.C139166d9G;

/* loaded from: classes17.dex */
public class FragmentTransitionSupport extends AbstractC0293j {
    static {
        Covode.recordClassIndex(1925);
    }

    @Override // androidx.fragment.app.AbstractC0293j
    public boolean canHandle(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC0293j
    public Object cloneTransition(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0293j
    public Object wrapTransitionInSet(Object obj) {
        if (obj == null) {
            return null;
        }
        C139166d9G c139166d9G = new C139166d9G();
        c139166d9G.LIZ((Transition) obj);
        return c139166d9G;
    }

    public static boolean hasSimpleTarget(Transition transition) {
        if (AbstractC0293j.isNullOrEmpty(transition.mTargetIds) && AbstractC0293j.isNullOrEmpty(transition.mTargetNames) && AbstractC0293j.isNullOrEmpty(transition.mTargetTypes)) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.AbstractC0293j
    public void addTarget(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0293j
    public void beginDelayedTransition(ViewGroup viewGroup, Object obj) {
        C138579czn.LIZ(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC0293j
    public void removeTarget(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0293j
    public void setEpicenter(Object obj, final Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new AbstractC139174d9O(this) { // from class: androidx.transition.FragmentTransitionSupport.4
                static {
                    Covode.recordClassIndex(1929);
                }

                @Override // p003X.AbstractC139174d9O
                public final Rect LIZ() {
                    Rect rect2 = rect;
                    if (rect2 != null && !rect2.isEmpty()) {
                        return rect;
                    }
                    return null;
                }
            });
        }
    }

    @Override // androidx.fragment.app.AbstractC0293j
    public void setEpicenter(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            getBoundsOnScreen(view, rect);
            ((Transition) obj).setEpicenterCallback(new AbstractC139174d9O(this) { // from class: androidx.transition.FragmentTransitionSupport.1
                static {
                    Covode.recordClassIndex(1926);
                }

                @Override // p003X.AbstractC139174d9O
                public final Rect LIZ() {
                    return rect;
                }
            });
        }
    }

    @Override // androidx.fragment.app.AbstractC0293j
    public void addTargets(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof C139166d9G) {
            C139166d9G c139166d9G = (C139166d9G) transition;
            int LIZ = c139166d9G.LIZ();
            while (i < LIZ) {
                addTargets(c139166d9G.LIZIZ(i), arrayList);
                i++;
            }
        } else if (!hasSimpleTarget(transition) && AbstractC0293j.isNullOrEmpty(transition.mTargets)) {
            int size = arrayList.size();
            while (i < size) {
                transition.addTarget(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0293j
    public void scheduleHideFragmentView(Object obj, final View view, final ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new Transition.TransitionListener(this) { // from class: androidx.transition.FragmentTransitionSupport.2
            static {
                Covode.recordClassIndex(1927);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionCancel(Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionPause(Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionResume(Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                transition.removeListener(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }
        });
    }

    @Override // androidx.fragment.app.AbstractC0293j
    public Object mergeTransitionsTogether(Object obj, Object obj2, Object obj3) {
        C139166d9G c139166d9G = new C139166d9G();
        if (obj != null) {
            c139166d9G.LIZ((Transition) obj);
        }
        if (obj2 != null) {
            c139166d9G.LIZ((Transition) obj2);
        }
        if (obj3 != null) {
            c139166d9G.LIZ((Transition) obj3);
        }
        return c139166d9G;
    }

    @Override // androidx.fragment.app.AbstractC0293j
    public void swapSharedElementTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            transition.mTargets.clear();
            transition.mTargets.addAll(arrayList2);
            replaceTargets(transition, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0293j
    public Object mergeTransitionsInSequence(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        C139166d9G c139166d9G = transition;
        if (transition != null) {
            if (transition2 != null) {
                C139166d9G c139166d9G2 = new C139166d9G();
                c139166d9G2.LIZ(transition);
                C139166d9G c139166d9G3 = c139166d9G2;
                c139166d9G3.LIZ(transition2);
                c139166d9G3.LIZ(1);
                c139166d9G = c139166d9G3;
            }
        } else if (transition2 != null) {
            c139166d9G = transition2;
        } else {
            c139166d9G = null;
        }
        if (transition3 != null) {
            C139166d9G c139166d9G4 = new C139166d9G();
            if (c139166d9G != null) {
                c139166d9G4.LIZ(c139166d9G);
            }
            c139166d9G4.LIZ(transition3);
            return c139166d9G4;
        }
        return c139166d9G;
    }

    @Override // androidx.fragment.app.AbstractC0293j
    public void setSharedElementTargets(Object obj, View view, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        ArrayList<View> arrayList2 = transition.mTargets;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0293j.bfsAddViewChildren(arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        addTargets(transition, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC0293j
    public void replaceTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof C139166d9G) {
            C139166d9G c139166d9G = (C139166d9G) transition;
            int LIZ = c139166d9G.LIZ();
            while (i < LIZ) {
                replaceTargets(c139166d9G.LIZIZ(i), arrayList, arrayList2);
                i++;
            }
        } else if (!hasSimpleTarget(transition)) {
            ArrayList<View> arrayList3 = transition.mTargets;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    while (i < size) {
                        transition.addTarget(arrayList2.get(i));
                        i++;
                    }
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    transition.removeTarget(arrayList.get(size2));
                }
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0293j
    public void scheduleRemoveTargets(Object obj, final Object obj2, final ArrayList<View> arrayList, final Object obj3, final ArrayList<View> arrayList2, final Object obj4, final ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: androidx.transition.FragmentTransitionSupport.3
            static {
                Covode.recordClassIndex(1928);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionCancel(Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionPause(Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionResume(Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition transition) {
                Object obj5 = obj2;
                if (obj5 != null) {
                    FragmentTransitionSupport.this.replaceTargets(obj5, arrayList, null);
                }
                Object obj6 = obj3;
                if (obj6 != null) {
                    FragmentTransitionSupport.this.replaceTargets(obj6, arrayList2, null);
                }
                Object obj7 = obj4;
                if (obj7 != null) {
                    FragmentTransitionSupport.this.replaceTargets(obj7, arrayList3, null);
                }
            }
        });
    }
}
