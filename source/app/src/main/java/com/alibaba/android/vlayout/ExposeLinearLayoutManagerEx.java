package com.alibaba.android.vlayout;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.vlayout.layout.LayoutChunkResult;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes20.dex */
public class ExposeLinearLayoutManagerEx extends LinearLayoutManager {
    public static boolean isLocalTest;
    public static boolean setFix2;
    public static Field vhField;
    public static Method vhSetFlags;
    public Object[] emptyArgs;
    public boolean interceptLayoutChildrenOnce;
    public LayoutChunkResult layoutChunkResultCache;
    public SparseArray<CardLayoutInfo> layoutInfoList;
    public final AnchorInfo mAnchorInfo;
    public final ChildHelperWrapper mChildHelperWrapper;
    public Bundle mCurrentPendingSavedState;
    public int mCurrentPendingScrollPosition;
    public final Method mEnsureLayoutStateMethod;
    public boolean mLastStackFromEnd;
    public LayoutState mLayoutState;
    public OrientationHelperEx mOrientationHelper;
    public int mPendingScrollPositionOffset;
    public RecyclerView mRecyclerView;
    public boolean mShouldReverseLayoutExpose;
    public int recycleOffset;

    static {
        Covode.recordClassIndex(4333);
    }

    /* renamed from: com_alibaba_android_vlayout_ExposeLinearLayoutManagerEx_java_lang_reflect_Method_invoke */
    public static Object m19999x1db6df1e(Method method, Object obj, Object[] objArr) {
        ActionInvokeEntrance.setEventUuid(110000);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_alibaba_android_vlayout_ExposeLinearLayoutManagerEx_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return actionIntercept.second;
        }
        Object invoke = method.invoke(obj, objArr);
        ActionInvokeEntrance.actionInvokeReflection(invoke, method, new Object[]{obj, objArr}, "com_alibaba_android_vlayout_ExposeLinearLayoutManagerEx_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        return invoke;
    }

    public int computeAlignOffset(int i, boolean z, boolean z2) {
        return 0;
    }

    public int computeAlignOffset(View view, boolean z, boolean z2) {
        return 0;
    }

    public boolean isEnableMarginOverLap() {
        return false;
    }

    public void onAnchorReady(RecyclerView.State state, AnchorInfo anchorInfo) {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return m20001x7d8a3a06(this, i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return m20000xb096cbd8(this, i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int findFirstVisibleItemPosition() {
        ensureLayoutStateExpose();
        return super.findFirstVisibleItemPosition();
    }

    /* loaded from: classes20.dex */
    public class AnchorInfo {
        public int mCoordinate;
        public boolean mLayoutFromEnd;
        public int mPosition;

        static {
            Covode.recordClassIndex(4334);
        }

        public void reset() {
            this.mPosition = -1;
            this.mCoordinate = Integer.MIN_VALUE;
            this.mLayoutFromEnd = false;
        }

        public void assignCoordinateFromPadding() {
            int startAfterPadding;
            if (this.mLayoutFromEnd) {
                startAfterPadding = ExposeLinearLayoutManagerEx.this.mOrientationHelper.getEndAfterPadding();
            } else {
                startAfterPadding = ExposeLinearLayoutManagerEx.this.mOrientationHelper.getStartAfterPadding();
            }
            this.mCoordinate = startAfterPadding;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.mPosition + ", mCoordinate=" + this.mCoordinate + ", mLayoutFromEnd=" + this.mLayoutFromEnd + '}';
        }

        public AnchorInfo() {
        }

        public void assignFromView(View view) {
            if (this.mLayoutFromEnd) {
                this.mCoordinate = ExposeLinearLayoutManagerEx.this.mOrientationHelper.getDecoratedEnd(view) + ExposeLinearLayoutManagerEx.this.computeAlignOffset(view, this.mLayoutFromEnd, true) + ExposeLinearLayoutManagerEx.this.mOrientationHelper.getTotalSpaceChange();
            } else {
                this.mCoordinate = ExposeLinearLayoutManagerEx.this.mOrientationHelper.getDecoratedStart(view) + ExposeLinearLayoutManagerEx.this.computeAlignOffset(view, this.mLayoutFromEnd, true);
            }
            this.mPosition = ExposeLinearLayoutManagerEx.this.getPosition(view);
        }

        public boolean assignFromViewIfValid(View view, RecyclerView.State state) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (!layoutParams.isItemRemoved() && layoutParams.getViewPosition() >= 0 && layoutParams.getViewPosition() < state.getItemCount()) {
                assignFromView(view);
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes20.dex */
    public static class CardLayoutInfo {
        public int bottom;
        public boolean init;
        public int left;
        public int right;
        public int top;

        static {
            Covode.recordClassIndex(4335);
        }

        public void reset() {
            this.top = 0;
            this.left = 0;
            this.right = 0;
            this.bottom = 0;
            this.init = false;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int findLastVisibleItemPosition() {
        ensureLayoutStateExpose();
        try {
            return super.findLastVisibleItemPosition();
        } catch (Exception e) {
            throw e;
        }
    }

    public void logChildren() {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        if (this.mCurrentPendingSavedState == null && this.mLastStackFromEnd == getStackFromEnd()) {
            return true;
        }
        return false;
    }

    /* loaded from: classes10.dex */
    public static class ViewHolderWrapper {
        public static Method mIsChanged;
        public static Method mIsInvalid;
        public static Method mIsRemoved;
        public static Method mSetFlags;
        public static Method mShouldIgnore;
        public RecyclerView.ViewHolder mHolder;

        /* renamed from: com_alibaba_android_vlayout_ExposeLinearLayoutManagerEx$ViewHolderWrapper_java_lang_reflect_Method_invoke */
        public static Object m19996xbafe7cbc(Method method, Object obj, Object[] objArr) {
            ActionInvokeEntrance.setEventUuid(110000);
            Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_alibaba_android_vlayout_ExposeLinearLayoutManagerEx$ViewHolderWrapper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
            if (((Boolean) actionIntercept.first).booleanValue()) {
                return actionIntercept.second;
            }
            Object invoke = method.invoke(obj, objArr);
            ActionInvokeEntrance.actionInvokeReflection(invoke, method, new Object[]{obj, objArr}, "com_alibaba_android_vlayout_ExposeLinearLayoutManagerEx$ViewHolderWrapper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
            return invoke;
        }

        public boolean isChanged() {
            Method method = mIsChanged;
            if (method == null) {
                return true;
            }
            try {
                return ((Boolean) m19996xbafe7cbc(method, this.mHolder, new Object[0])).booleanValue();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return true;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return true;
            }
        }

        public boolean isInvalid() {
            Method method = mIsInvalid;
            if (method == null) {
                return true;
            }
            try {
                return ((Boolean) m19996xbafe7cbc(method, this.mHolder, new Object[0])).booleanValue();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return true;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return true;
            }
        }

        public boolean isRemoved() {
            Method method = mIsRemoved;
            if (method == null) {
                return true;
            }
            try {
                return ((Boolean) m19996xbafe7cbc(method, this.mHolder, new Object[0])).booleanValue();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return true;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return true;
            }
        }

        public boolean requireUpdated() {
            if (!isInvalid() && !isRemoved() && !isChanged()) {
                return false;
            }
            return true;
        }

        static {
            Covode.recordClassIndex(4338);
            try {
                Method declaredMethod = RecyclerView.ViewHolder.class.getDeclaredMethod("shouldIgnore", new Class[0]);
                mShouldIgnore = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = RecyclerView.ViewHolder.class.getDeclaredMethod("isInvalid", new Class[0]);
                mIsInvalid = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = RecyclerView.ViewHolder.class.getDeclaredMethod("isRemoved", new Class[0]);
                mIsRemoved = declaredMethod3;
                declaredMethod3.setAccessible(true);
                Method declaredMethod4 = RecyclerView.ViewHolder.class.getDeclaredMethod("setFlags", Integer.TYPE, Integer.TYPE);
                mSetFlags = declaredMethod4;
                declaredMethod4.setAccessible(true);
                try {
                    mIsChanged = RecyclerView.ViewHolder.class.getDeclaredMethod("isChanged", new Class[0]);
                } catch (NoSuchMethodException unused) {
                    mIsChanged = RecyclerView.ViewHolder.class.getDeclaredMethod("isUpdated", new Class[0]);
                }
                mIsChanged.setAccessible(true);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        public ViewHolderWrapper(RecyclerView.ViewHolder viewHolder) {
            this.mHolder = viewHolder;
        }

        public void setFlags(int i, int i2) {
            try {
                m19996xbafe7cbc(mSetFlags, this.mHolder, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }

        public static void setFlags(RecyclerView.ViewHolder viewHolder, int i, int i2) {
            try {
                m19996xbafe7cbc(mSetFlags, viewHolder, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    private View getChildClosestToEndExpose() {
        int childCount;
        if (this.mShouldReverseLayoutExpose) {
            childCount = 0;
        } else {
            childCount = getChildCount() - 1;
        }
        return getChildAt(childCount);
    }

    private View getChildClosestToStartExpose() {
        int i;
        if (this.mShouldReverseLayoutExpose) {
            i = getChildCount() - 1;
        } else {
            i = 0;
        }
        return getChildAt(i);
    }

    private void myResolveShouldLayoutReverse() {
        boolean z = true;
        if (getOrientation() != 1 && isLayoutRTL()) {
            if (getReverseLayout()) {
                z = false;
            }
        } else {
            z = getReverseLayout();
        }
        this.mShouldReverseLayoutExpose = z;
    }

    public void resetLayoutInfo() {
        for (int i = 0; i < this.layoutInfoList.size(); i++) {
            this.layoutInfoList.get(i).reset();
        }
    }

    /* loaded from: classes20.dex */
    public static class LayoutState {
        public int mAvailable;
        public int mCurrentPosition;
        public int mExtra;
        public int mFixOffset;
        public boolean mIsPreLayout;
        public int mItemDirection;
        public int mLayoutDirection;
        public int mOffset;
        public boolean mOnRefresLayout;
        public boolean mRecycle = true;
        public List<RecyclerView.ViewHolder> mScrapList;
        public int mScrollingOffset;
        public Method vhIsRemoved;

        static {
            Covode.recordClassIndex(4337);
        }

        /* renamed from: com_alibaba_android_vlayout_ExposeLinearLayoutManagerEx$LayoutState_java_lang_reflect_Method_invoke */
        public static Object m19997x590d4c61(Method method, Object obj, Object[] objArr) {
            ActionInvokeEntrance.setEventUuid(110000);
            Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_alibaba_android_vlayout_ExposeLinearLayoutManagerEx$LayoutState_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
            if (((Boolean) actionIntercept.first).booleanValue()) {
                return actionIntercept.second;
            }
            Object invoke = method.invoke(obj, objArr);
            ActionInvokeEntrance.actionInvokeReflection(invoke, method, new Object[]{obj, objArr}, "com_alibaba_android_vlayout_ExposeLinearLayoutManagerEx$LayoutState_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
            return invoke;
        }

        public void log() {
        }

        public LayoutState() {
            try {
                this.vhIsRemoved = RecyclerView.ViewHolder.class.getDeclaredMethod("isRemoved", new Class[0]);
                this.vhIsRemoved.setAccessible(true);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0052 A[EDGE_INSN: B:13:0x0052->B:14:0x0052 ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x004f A[ADDED_TO_REGION, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x003b A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0049 A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private android.view.View nextFromLimitedList() {
            /*
                r9 = this;
                java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r9.mScrapList
                int r7 = r0.size()
                r8 = 0
                r5 = 0
                r0 = 2147483647(0x7fffffff, float:NaN)
                r3 = r8
                r6 = 0
                r4 = 2147483647(0x7fffffff, float:NaN)
            L10:
                if (r6 >= r7) goto L52
                java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r9.mScrapList
                java.lang.Object r2 = r0.get(r6)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r2
                boolean r0 = r9.mIsPreLayout
                if (r0 != 0) goto L3d
                java.lang.reflect.Method r1 = r9.vhIsRemoved     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L32
                java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L32
                java.lang.Object r0 = m19997x590d4c61(r1, r2, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L32
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L32
                boolean r1 = r0.booleanValue()     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L32
                goto L37
            L2d:
                r0 = move-exception
                r0.printStackTrace()
                goto L36
            L32:
                r0 = move-exception
                r0.printStackTrace()
            L36:
                r1 = 0
            L37:
                boolean r0 = r9.mIsPreLayout
                if (r0 != 0) goto L3d
                if (r1 != 0) goto L4f
            L3d:
                int r1 = r2.getPosition()
                int r0 = r9.mCurrentPosition
                int r1 = r1 - r0
                int r0 = r9.mItemDirection
                int r1 = r1 * r0
                if (r1 < 0) goto L4f
                if (r1 >= r4) goto L4f
                r3 = r2
                if (r1 == 0) goto L52
                r4 = r1
            L4f:
                int r6 = r6 + 1
                goto L10
            L52:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r0 = "layout from scrap. found view:?"
                r1.<init>(r0)
                if (r3 == 0) goto L5c
                r5 = 1
            L5c:
                r1.append(r5)
                if (r3 == 0) goto L6d
                int r1 = r3.getPosition()
                int r0 = r9.mItemDirection
                int r1 = r1 + r0
                r9.mCurrentPosition = r1
                android.view.View r0 = r3.itemView
                return r0
            L6d:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.vlayout.ExposeLinearLayoutManagerEx.LayoutState.nextFromLimitedList():android.view.View");
        }

        public String toString() {
            return "LayoutState{vhIsRemoved=" + this.vhIsRemoved + ", mOnRefresLayout=" + this.mOnRefresLayout + ", mRecycle=" + this.mRecycle + ", mOffset=" + this.mOffset + ", mAvailable=" + this.mAvailable + ", mCurrentPosition=" + this.mCurrentPosition + ", mItemDirection=" + this.mItemDirection + ", mLayoutDirection=" + this.mLayoutDirection + ", mScrollingOffset=" + this.mScrollingOffset + ", mExtra=" + this.mExtra + ", mFixOffset=" + this.mFixOffset + ", mIsPreLayout=" + this.mIsPreLayout + ", mScrapList=" + this.mScrapList + '}';
        }

        public boolean hasMore(RecyclerView.State state) {
            int i = this.mCurrentPosition;
            if (i >= 0 && i < state.getItemCount()) {
                return true;
            }
            return false;
        }

        public View next(RecyclerView.Recycler recycler) {
            if (this.mScrapList != null) {
                return nextFromLimitedList();
            }
            View viewForPosition = recycler.getViewForPosition(this.mCurrentPosition);
            this.mCurrentPosition += this.mItemDirection;
            return viewForPosition;
        }
    }

    public void ensureLayoutStateExpose() {
        if (this.mLayoutState == null) {
            this.mLayoutState = new LayoutState();
        }
        if (this.mOrientationHelper == null) {
            this.mOrientationHelper = OrientationHelperEx.createOrientationHelper(this, getOrientation());
        }
        try {
            m19999x1db6df1e(this.mEnsureLayoutStateMethod, this, this.emptyArgs);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
        }
    }

    public int getScrollDy() {
        if (getItemCount() == 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        CardLayoutInfo cardLayoutInfo = this.layoutInfoList.get(getPosition(childAt));
        if (cardLayoutInfo == null) {
            return 0;
        }
        int decoratedTop = getDecoratedTop(childAt);
        if (childAt.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            decoratedTop -= ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin;
        }
        return decoratedTop - cardLayoutInfo.top;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        Bundle bundle = this.mCurrentPendingSavedState;
        if (bundle != null) {
            return new Bundle(bundle);
        }
        Bundle bundle2 = new Bundle();
        if (getChildCount() > 0) {
            boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayoutExpose;
            bundle2.putBoolean("AnchorLayoutFromEnd", z);
            if (z) {
                View childClosestToEndExpose = getChildClosestToEndExpose();
                bundle2.putInt("AnchorOffset", this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(childClosestToEndExpose));
                bundle2.putInt("AnchorPosition", getPosition(childClosestToEndExpose));
                return bundle2;
            }
            View childClosestToStartExpose = getChildClosestToStartExpose();
            bundle2.putInt("AnchorPosition", getPosition(childClosestToStartExpose));
            bundle2.putInt("AnchorOffset", this.mOrientationHelper.getDecoratedStart(childClosestToStartExpose) - this.mOrientationHelper.getStartAfterPadding());
            return bundle2;
        }
        bundle2.putInt("AnchorPosition", -1);
        return bundle2;
    }

    /* loaded from: classes10.dex */
    public class ChildHelperWrapper {
        public Object[] args = new Object[1];
        public Field mChildHelperField;
        public Method mClearMethod;
        public Method mFindHiddenNonRemovedViewMethod;
        public Method mFindHiddenNonRemovedViewMethod25;
        public Field mHiddenViewField;
        public Method mHideMethod;
        public Object mInnerBucket;
        public Object mInnerChildHelper;
        public List mInnerHiddenView;
        public Method mIsHideMethod;
        public RecyclerView.LayoutManager mLayoutManager;

        static {
            Covode.recordClassIndex(4336);
        }

        /* renamed from: com_alibaba_android_vlayout_ExposeLinearLayoutManagerEx$ChildHelperWrapper_java_lang_reflect_Method_invoke */
        public static Object m19998x4beda11(Method method, Object obj, Object[] objArr) {
            ActionInvokeEntrance.setEventUuid(110000);
            Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_alibaba_android_vlayout_ExposeLinearLayoutManagerEx$ChildHelperWrapper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
            if (((Boolean) actionIntercept.first).booleanValue()) {
                return actionIntercept.second;
            }
            Object invoke = method.invoke(obj, objArr);
            ActionInvokeEntrance.actionInvokeReflection(invoke, method, new Object[]{obj, objArr}, "com_alibaba_android_vlayout_ExposeLinearLayoutManagerEx$ChildHelperWrapper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
            return invoke;
        }

        public void ensureChildHelper() {
            try {
                if (this.mInnerChildHelper == null) {
                    this.mInnerChildHelper = this.mChildHelperField.get(this.mLayoutManager);
                    if (this.mInnerChildHelper == null) {
                        return;
                    }
                    Class<?> cls = this.mInnerChildHelper.getClass();
                    this.mHideMethod = cls.getDeclaredMethod("hide", View.class);
                    this.mHideMethod.setAccessible(true);
                    try {
                        this.mFindHiddenNonRemovedViewMethod = cls.getDeclaredMethod("findHiddenNonRemovedView", Integer.TYPE, Integer.TYPE);
                        this.mFindHiddenNonRemovedViewMethod.setAccessible(true);
                    } catch (NoSuchMethodException unused) {
                        this.mFindHiddenNonRemovedViewMethod25 = cls.getDeclaredMethod("findHiddenNonRemovedView", Integer.TYPE);
                        this.mFindHiddenNonRemovedViewMethod25.setAccessible(true);
                    }
                    this.mIsHideMethod = cls.getDeclaredMethod("isHidden", View.class);
                    this.mIsHideMethod.setAccessible(true);
                    Field declaredField = cls.getDeclaredField("mBucket");
                    declaredField.setAccessible(true);
                    this.mInnerBucket = declaredField.get(this.mInnerChildHelper);
                    this.mClearMethod = this.mInnerBucket.getClass().getDeclaredMethod("clear", Integer.TYPE);
                    this.mClearMethod.setAccessible(true);
                    this.mHiddenViewField = cls.getDeclaredField("mHiddenViews");
                    this.mHiddenViewField.setAccessible(true);
                    this.mInnerHiddenView = (List) this.mHiddenViewField.get(this.mInnerChildHelper);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void hide(View view) {
            try {
                ensureChildHelper();
                if (this.mInnerHiddenView.indexOf(view) < 0) {
                    this.args[0] = view;
                    m19998x4beda11(this.mHideMethod, this.mInnerChildHelper, this.args);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public boolean isHidden(View view) {
            try {
                ensureChildHelper();
                this.args[0] = view;
                return ((Boolean) m19998x4beda11(this.mIsHideMethod, this.mInnerChildHelper, this.args)).booleanValue();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return false;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return false;
            } catch (Exception e3) {
                e3.printStackTrace();
                return false;
            }
        }

        public void show(View view) {
            try {
                ensureChildHelper();
                this.args[0] = Integer.valueOf(ExposeLinearLayoutManagerEx.this.mRecyclerView.indexOfChild(view));
                m19998x4beda11(this.mClearMethod, this.mInnerBucket, this.args);
                if (this.mInnerHiddenView != null) {
                    this.mInnerHiddenView.remove(view);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public ChildHelperWrapper(RecyclerView.LayoutManager layoutManager) {
            this.mLayoutManager = layoutManager;
            try {
                this.mChildHelperField = RecyclerView.LayoutManager.class.getDeclaredField("mChildHelper");
                this.mChildHelperField.setAccessible(true);
                ensureChildHelper();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public View findHiddenNonRemovedView(int i, int i2) {
            try {
                ensureChildHelper();
                if (this.mFindHiddenNonRemovedViewMethod != null) {
                    return (View) m19998x4beda11(this.mFindHiddenNonRemovedViewMethod, this.mInnerChildHelper, new Object[]{Integer.valueOf(i), -1});
                }
                if (this.mFindHiddenNonRemovedViewMethod25 != null) {
                    return (View) m19998x4beda11(this.mFindHiddenNonRemovedViewMethod25, this.mInnerChildHelper, new Object[]{Integer.valueOf(i)});
                }
                return null;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return null;
            } catch (Exception e3) {
                e3.printStackTrace();
                return null;
            }
        }
    }

    public void validateChildOrderExpose() {
        if (getChildCount() <= 0) {
            return;
        }
        boolean z = false;
        int position = getPosition(getChildAt(0));
        int decoratedStart = this.mOrientationHelper.getDecoratedStart(getChildAt(0));
        if (this.mShouldReverseLayoutExpose) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int decoratedStart2 = this.mOrientationHelper.getDecoratedStart(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                    if (decoratedStart2 < decoratedStart) {
                        z = true;
                    }
                    sb.append(z);
                    throw new RuntimeException(sb.toString());
                } else if (decoratedStart2 > decoratedStart) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            int position3 = getPosition(childAt2);
            int decoratedStart3 = this.mOrientationHelper.getDecoratedStart(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                if (decoratedStart3 < decoratedStart) {
                    z = true;
                }
                sb2.append(z);
                throw new RuntimeException(sb2.toString());
            } else if (decoratedStart3 < decoratedStart) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    private void updateCardLayoutInfo() {
        int i;
        if (getItemCount() != 0 && getChildCount() != 0) {
            View childAt = getChildAt(0);
            if (childAt == null) {
                return;
            }
            int position = getPosition(childAt);
            int decoratedTop = getDecoratedTop(getChildAt(0));
            if (childAt.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                decoratedTop -= ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin;
            }
            SparseIntArray sparseIntArray = new SparseIntArray();
            int i2 = position - 1;
            CardLayoutInfo cardLayoutInfo = this.layoutInfoList.get(i2);
            if (position != 0 && (cardLayoutInfo == null || !cardLayoutInfo.init)) {
                for (int i3 = 0; i3 < position; i3++) {
                    CardLayoutInfo cardLayoutInfo2 = this.layoutInfoList.get(i3);
                    if (cardLayoutInfo2 == null || !cardLayoutInfo2.init) {
                        cardLayoutInfo2 = new CardLayoutInfo();
                        cardLayoutInfo2.init = true;
                        this.layoutInfoList.put(i3, cardLayoutInfo2);
                    }
                    int i4 = sparseIntArray.get(cardLayoutInfo2.left);
                    cardLayoutInfo2.top = i4;
                    cardLayoutInfo2.bottom = (cardLayoutInfo2.bottom - cardLayoutInfo2.top) + i4;
                    if (cardLayoutInfo2.bottom > i4) {
                        sparseIntArray.put(cardLayoutInfo2.left, cardLayoutInfo2.bottom);
                    }
                }
            }
            CardLayoutInfo cardLayoutInfo3 = this.layoutInfoList.get(i2);
            if (cardLayoutInfo3 != null) {
                i = cardLayoutInfo3.bottom;
            } else {
                i = 0;
            }
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            int i5 = 0;
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt2 = getChildAt(i6);
                i5 = getPosition(childAt2);
                int decoratedTop2 = getDecoratedTop(childAt2);
                int decoratedLeft = getDecoratedLeft(childAt2);
                int decoratedRight = getDecoratedRight(childAt2);
                int decoratedBottom = getDecoratedBottom(childAt2);
                if (childAt2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    decoratedTop2 -= ((ViewGroup.MarginLayoutParams) childAt2.getLayoutParams()).topMargin;
                    decoratedBottom += ((ViewGroup.MarginLayoutParams) childAt2.getLayoutParams()).bottomMargin;
                }
                CardLayoutInfo cardLayoutInfo4 = this.layoutInfoList.get(i5);
                if (cardLayoutInfo4 == null) {
                    cardLayoutInfo4 = new CardLayoutInfo();
                    cardLayoutInfo4.init = true;
                    this.layoutInfoList.put(i5, cardLayoutInfo4);
                }
                int i7 = decoratedBottom - decoratedTop2;
                int i8 = (decoratedTop2 - decoratedTop) + i;
                int i9 = i8 + i7;
                if (cardLayoutInfo4.bottom != i9 && sparseIntArray.get(decoratedLeft) < decoratedBottom) {
                    sparseIntArray2.put(decoratedLeft, i9 - cardLayoutInfo4.bottom);
                }
                if (sparseIntArray.get(decoratedLeft) < decoratedBottom) {
                    sparseIntArray.put(decoratedLeft, decoratedBottom);
                }
                cardLayoutInfo4.top = i8;
                cardLayoutInfo4.bottom = cardLayoutInfo4.top + i7;
                cardLayoutInfo4.left = decoratedLeft;
                cardLayoutInfo4.right = decoratedRight;
                cardLayoutInfo4.init = true;
            }
            if (sparseIntArray2.size() == 0) {
                return;
            }
            int i10 = i5 + 1;
            CardLayoutInfo cardLayoutInfo5 = this.layoutInfoList.get(i10);
            while (cardLayoutInfo5 != null) {
                int i11 = sparseIntArray2.get(cardLayoutInfo5.left, -1);
                if (i11 != -1) {
                    cardLayoutInfo5.top += i11;
                    cardLayoutInfo5.bottom += i11;
                }
                i10++;
                cardLayoutInfo5 = this.layoutInfoList.get(i10);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void removeViewAt(int i) {
        super.removeViewAt(i);
    }

    public void setRecycleOffset(int i) {
        this.recycleOffset = i;
    }

    public ExposeLinearLayoutManagerEx(Context context) {
        this(context, 1, false);
    }

    private void updateLayoutStateToFillEndExpose(AnchorInfo anchorInfo) {
        updateLayoutStateToFillEndExpose(anchorInfo.mPosition, anchorInfo.mCoordinate);
    }

    private void updateLayoutStateToFillStartExpose(AnchorInfo anchorInfo) {
        updateLayoutStateToFillStartExpose(anchorInfo.mPosition, anchorInfo.mCoordinate);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mCurrentPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public View findHiddenView(int i) {
        return this.mChildHelperWrapper.findHiddenNonRemovedView(i, -1);
    }

    public void hideView(View view) {
        this.mChildHelperWrapper.hide(view);
    }

    public boolean isHidden(View view) {
        return this.mChildHelperWrapper.isHidden(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.mRecyclerView = recyclerView;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        updateCardLayoutInfo();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setOrientation(int i) {
        super.setOrientation(i);
        this.mOrientationHelper = null;
    }

    public void showView(View view) {
        this.mChildHelperWrapper.show(view);
    }

    public static boolean isViewHolderUpdated(RecyclerView.ViewHolder viewHolder) {
        return new ViewHolderWrapper(viewHolder).requireUpdated();
    }

    private View myFindFirstReferenceChild(int i) {
        return findReferenceChildInternal(0, getChildCount(), i);
    }

    private View myFindLastReferenceChild(int i) {
        return findReferenceChildInternal(getChildCount() - 1, -1, i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            this.mCurrentPendingSavedState = (Bundle) parcelable;
            requestLayout();
        }
    }

    private View myFindReferenceChildClosestToEnd(RecyclerView.State state) {
        boolean z = this.mShouldReverseLayoutExpose;
        int itemCount = state.getItemCount();
        if (z) {
            return myFindFirstReferenceChild(itemCount);
        }
        return myFindLastReferenceChild(itemCount);
    }

    private View myFindReferenceChildClosestToStart(RecyclerView.State state) {
        boolean z = this.mShouldReverseLayoutExpose;
        int itemCount = state.getItemCount();
        if (z) {
            return myFindLastReferenceChild(itemCount);
        }
        return myFindFirstReferenceChild(itemCount);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        this.mCurrentPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        Bundle bundle = this.mCurrentPendingSavedState;
        if (bundle != null) {
            bundle.putInt("AnchorPosition", -1);
        }
        requestLayout();
    }

    private int convertFocusDirectionToLayoutDirectionExpose(int i) {
        int orientation = getOrientation();
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130 && orientation == 1) {
                        return 1;
                    }
                    return Integer.MIN_VALUE;
                } else if (orientation == 0) {
                    return 1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (orientation == 1) {
                return -1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (orientation == 0) {
            return -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p003X.AbstractC113806UrA
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < getPosition(getChildAt(0))) {
            z = true;
        }
        if (z != this.mShouldReverseLayoutExpose) {
            i2 = -1;
        }
        if (getOrientation() == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        this.mRecyclerView = null;
    }

    public void addHiddenView(View view, boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = -1;
        }
        addView(view, i);
        this.mChildHelperWrapper.hide(view);
    }

    private void recycleByLayoutStateExpose(RecyclerView.Recycler recycler, LayoutState layoutState) {
        if (!layoutState.mRecycle) {
            return;
        }
        if (layoutState.mLayoutDirection == -1) {
            recycleViewsFromEndExpose(recycler, layoutState.mScrollingOffset);
        } else {
            recycleViewsFromStartExpose(recycler, layoutState.mScrollingOffset);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void scrollToPositionWithOffset(int i, int i2) {
        this.mCurrentPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        Bundle bundle = this.mCurrentPendingSavedState;
        if (bundle != null) {
            bundle.putInt("AnchorPosition", -1);
        }
        requestLayout();
    }

    private void updateAnchorInfoForLayoutExpose(RecyclerView.State state, AnchorInfo anchorInfo) {
        int i;
        if (updateAnchorFromPendingDataExpose(state, anchorInfo) || updateAnchorFromChildrenExpose(state, anchorInfo)) {
            return;
        }
        anchorInfo.assignCoordinateFromPadding();
        if (getStackFromEnd()) {
            i = state.getItemCount() - 1;
        } else {
            i = 0;
        }
        anchorInfo.mPosition = i;
    }

    private void updateLayoutStateToFillEndExpose(int i, int i2) {
        int i3;
        this.mLayoutState.mAvailable = this.mOrientationHelper.getEndAfterPadding() - i2;
        LayoutState layoutState = this.mLayoutState;
        if (this.mShouldReverseLayoutExpose) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        layoutState.mItemDirection = i3;
        LayoutState layoutState2 = this.mLayoutState;
        layoutState2.mCurrentPosition = i;
        layoutState2.mLayoutDirection = 1;
        layoutState2.mOffset = i2;
        layoutState2.mScrollingOffset = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStartExpose(int i, int i2) {
        int i3;
        this.mLayoutState.mAvailable = i2 - this.mOrientationHelper.getStartAfterPadding();
        LayoutState layoutState = this.mLayoutState;
        layoutState.mCurrentPosition = i;
        if (this.mShouldReverseLayoutExpose) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        layoutState.mItemDirection = i3;
        LayoutState layoutState2 = this.mLayoutState;
        layoutState2.mLayoutDirection = -1;
        layoutState2.mOffset = i2;
        layoutState2.mScrollingOffset = Integer.MIN_VALUE;
    }

    public int getCardDistance(int i, int i2) {
        if (getItemCount() == 0 || i == i2 || this.layoutInfoList.get(i) == null || this.layoutInfoList.get(i2) == null) {
            return 0;
        }
        return this.layoutInfoList.get(i2).bottom - this.layoutInfoList.get(i).top;
    }

    public static void attachViewHolder(RecyclerView.LayoutParams layoutParams, RecyclerView.ViewHolder viewHolder) {
        try {
            if (vhField == null) {
                vhField = RecyclerView.LayoutParams.class.getDeclaredField("mViewHolder");
            }
            vhField.setAccessible(true);
            vhField.set(layoutParams, viewHolder);
            if (vhSetFlags == null) {
                Method declaredMethod = RecyclerView.ViewHolder.class.getDeclaredMethod("setFlags", Integer.TYPE, Integer.TYPE);
                vhSetFlags = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            vhSetFlags.invoke(viewHolder, 4, 4);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        }
    }

    private void recycleViewsFromEndExpose(RecyclerView.Recycler recycler, int i) {
        int childCount = getChildCount();
        if (i < 0) {
            return;
        }
        int end = this.mOrientationHelper.getEnd() - i;
        if (this.mShouldReverseLayoutExpose) {
            for (int i2 = 0; i2 < childCount; i2++) {
                if (this.mOrientationHelper.getDecoratedStart(getChildAt(i2)) - this.recycleOffset < end) {
                    recycleChildren(recycler, 0, i2);
                    return;
                }
            }
            return;
        }
        int i3 = childCount - 1;
        for (int i4 = i3; i4 >= 0; i4--) {
            if (this.mOrientationHelper.getDecoratedStart(getChildAt(i4)) - this.recycleOffset < end) {
                recycleChildren(recycler, i3, i4);
                return;
            }
        }
    }

    private void recycleViewsFromStartExpose(RecyclerView.Recycler recycler, int i) {
        if (i < 0) {
            return;
        }
        int childCount = getChildCount();
        if (this.mShouldReverseLayoutExpose) {
            int i2 = childCount - 1;
            for (int i3 = i2; i3 >= 0; i3--) {
                if (this.mOrientationHelper.getDecoratedEnd(getChildAt(i3)) + this.recycleOffset > i) {
                    recycleChildren(recycler, i2, i3);
                    return;
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            if (this.mOrientationHelper.getDecoratedEnd(getChildAt(i4)) + this.recycleOffset > i) {
                recycleChildren(recycler, 0, i4);
                return;
            }
        }
    }

    private boolean updateAnchorFromChildrenExpose(RecyclerView.State state, AnchorInfo anchorInfo) {
        View myFindReferenceChildClosestToStart;
        int startAfterPadding;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && anchorInfo.assignFromViewIfValid(focusedChild, state)) {
            return true;
        }
        if (this.mLastStackFromEnd != getStackFromEnd()) {
            return false;
        }
        myFindReferenceChildClosestToEnd(state);
        myFindReferenceChildClosestToStart(state);
        if (anchorInfo.mLayoutFromEnd) {
            myFindReferenceChildClosestToStart = myFindReferenceChildClosestToEnd(state);
        } else {
            myFindReferenceChildClosestToStart = myFindReferenceChildClosestToStart(state);
        }
        if (myFindReferenceChildClosestToStart == null) {
            return false;
        }
        anchorInfo.assignFromView(myFindReferenceChildClosestToStart);
        if (!state.isPreLayout() && supportsPredictiveItemAnimations() && (this.mOrientationHelper.getDecoratedStart(myFindReferenceChildClosestToStart) >= this.mOrientationHelper.getEndAfterPadding() || this.mOrientationHelper.getDecoratedEnd(myFindReferenceChildClosestToStart) < this.mOrientationHelper.getStartAfterPadding())) {
            if (anchorInfo.mLayoutFromEnd) {
                startAfterPadding = this.mOrientationHelper.getEndAfterPadding();
            } else {
                startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
            }
            anchorInfo.mCoordinate = startAfterPadding;
        }
        return true;
    }

    private boolean updateAnchorFromPendingDataExpose(RecyclerView.State state, AnchorInfo anchorInfo) {
        int i;
        boolean z;
        int decoratedStart;
        boolean z2 = false;
        if (!state.isPreLayout() && (i = this.mCurrentPendingScrollPosition) != -1) {
            if (i >= 0 && i < state.getItemCount()) {
                anchorInfo.mPosition = this.mCurrentPendingScrollPosition;
                Bundle bundle = this.mCurrentPendingSavedState;
                if (bundle != null && bundle.getInt("AnchorPosition") >= 0) {
                    anchorInfo.mLayoutFromEnd = this.mCurrentPendingSavedState.getBoolean("AnchorLayoutFromEnd");
                    if (anchorInfo.mLayoutFromEnd) {
                        anchorInfo.mCoordinate = this.mOrientationHelper.getEndAfterPadding() - this.mCurrentPendingSavedState.getInt("AnchorOffset");
                        return true;
                    }
                    anchorInfo.mCoordinate = this.mOrientationHelper.getStartAfterPadding() + this.mCurrentPendingSavedState.getInt("AnchorOffset");
                    return true;
                } else if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View findViewByPosition = findViewByPosition(this.mCurrentPendingScrollPosition);
                    if (findViewByPosition != null) {
                        if (this.mOrientationHelper.getDecoratedMeasurement(findViewByPosition) > this.mOrientationHelper.getTotalSpace()) {
                            anchorInfo.assignCoordinateFromPadding();
                            return true;
                        } else if (this.mOrientationHelper.getDecoratedStart(findViewByPosition) - this.mOrientationHelper.getStartAfterPadding() < 0) {
                            anchorInfo.mCoordinate = this.mOrientationHelper.getStartAfterPadding();
                            anchorInfo.mLayoutFromEnd = false;
                            return true;
                        } else if (this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(findViewByPosition) < 0) {
                            anchorInfo.mCoordinate = this.mOrientationHelper.getEndAfterPadding();
                            anchorInfo.mLayoutFromEnd = true;
                            return true;
                        } else {
                            if (anchorInfo.mLayoutFromEnd) {
                                decoratedStart = this.mOrientationHelper.getDecoratedEnd(findViewByPosition) + this.mOrientationHelper.getTotalSpaceChange();
                            } else {
                                decoratedStart = this.mOrientationHelper.getDecoratedStart(findViewByPosition);
                            }
                            anchorInfo.mCoordinate = decoratedStart;
                            return true;
                        }
                    }
                    if (getChildCount() > 0) {
                        if (this.mCurrentPendingScrollPosition < getPosition(getChildAt(0))) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z == this.mShouldReverseLayoutExpose) {
                            z2 = true;
                        }
                        anchorInfo.mLayoutFromEnd = z2;
                    }
                    anchorInfo.assignCoordinateFromPadding();
                    return true;
                } else {
                    boolean z3 = this.mShouldReverseLayoutExpose;
                    anchorInfo.mLayoutFromEnd = z3;
                    if (z3) {
                        anchorInfo.mCoordinate = this.mOrientationHelper.getEndAfterPadding() - this.mPendingScrollPositionOffset;
                        return true;
                    }
                    anchorInfo.mCoordinate = this.mOrientationHelper.getStartAfterPadding() + this.mPendingScrollPositionOffset;
                    return true;
                }
            }
            this.mCurrentPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int fixLayoutEndGapExpose;
        int i6;
        View findViewByPosition;
        int decoratedStart;
        int i7;
        if (this.interceptLayoutChildrenOnce && state.isPreLayout()) {
            this.interceptLayoutChildrenOnce = false;
            return;
        }
        Bundle bundle = this.mCurrentPendingSavedState;
        if (bundle != null && bundle.getInt("AnchorPosition") >= 0) {
            this.mCurrentPendingScrollPosition = this.mCurrentPendingSavedState.getInt("AnchorPosition");
        }
        ensureLayoutStateExpose();
        this.mLayoutState.mRecycle = false;
        myResolveShouldLayoutReverse();
        this.mAnchorInfo.reset();
        this.mAnchorInfo.mLayoutFromEnd = this.mShouldReverseLayoutExpose ^ getStackFromEnd();
        updateAnchorInfoForLayoutExpose(state, this.mAnchorInfo);
        int extraLayoutSpace = getExtraLayoutSpace(state);
        if (state.getTargetScrollPosition() < this.mAnchorInfo.mPosition) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.mShouldReverseLayoutExpose) {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        } else {
            i = 0;
        }
        int startAfterPadding = extraLayoutSpace + this.mOrientationHelper.getStartAfterPadding();
        int endPadding = i + this.mOrientationHelper.getEndPadding();
        if (state.isPreLayout() && (i6 = this.mCurrentPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i6)) != null) {
            if (this.mShouldReverseLayoutExpose) {
                i7 = this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(findViewByPosition);
                decoratedStart = this.mPendingScrollPositionOffset;
            } else {
                decoratedStart = this.mOrientationHelper.getDecoratedStart(findViewByPosition) - this.mOrientationHelper.getStartAfterPadding();
                i7 = this.mPendingScrollPositionOffset;
            }
            int i8 = i7 - decoratedStart;
            if (i8 > 0) {
                startAfterPadding += i8;
            } else {
                endPadding -= i8;
            }
        }
        onAnchorReady(state, this.mAnchorInfo);
        detachAndScrapAttachedViews(recycler);
        this.mLayoutState.mIsPreLayout = state.isPreLayout();
        this.mLayoutState.mOnRefresLayout = true;
        if (this.mAnchorInfo.mLayoutFromEnd) {
            updateLayoutStateToFillStartExpose(this.mAnchorInfo);
            LayoutState layoutState = this.mLayoutState;
            layoutState.mExtra = startAfterPadding;
            fill(recycler, layoutState, state, false);
            i3 = this.mLayoutState.mOffset;
            if (this.mLayoutState.mAvailable > 0) {
                endPadding += this.mLayoutState.mAvailable;
            }
            updateLayoutStateToFillEndExpose(this.mAnchorInfo);
            LayoutState layoutState2 = this.mLayoutState;
            layoutState2.mExtra = endPadding;
            layoutState2.mCurrentPosition += this.mLayoutState.mItemDirection;
            fill(recycler, this.mLayoutState, state, false);
            i2 = this.mLayoutState.mOffset;
        } else {
            updateLayoutStateToFillEndExpose(this.mAnchorInfo);
            LayoutState layoutState3 = this.mLayoutState;
            layoutState3.mExtra = endPadding;
            fill(recycler, layoutState3, state, false);
            i2 = this.mLayoutState.mOffset;
            if (this.mLayoutState.mAvailable > 0) {
                startAfterPadding += this.mLayoutState.mAvailable;
            }
            updateLayoutStateToFillStartExpose(this.mAnchorInfo);
            LayoutState layoutState4 = this.mLayoutState;
            layoutState4.mExtra = startAfterPadding;
            layoutState4.mCurrentPosition += this.mLayoutState.mItemDirection;
            fill(recycler, this.mLayoutState, state, false);
            i3 = this.mLayoutState.mOffset;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayoutExpose ^ getStackFromEnd()) {
                int fixLayoutEndGapExpose2 = fixLayoutEndGapExpose(i2, recycler, state, true);
                i4 = i3 + fixLayoutEndGapExpose2;
                i5 = i2 + fixLayoutEndGapExpose2;
                fixLayoutEndGapExpose = fixLayoutStartGapExpose(i4, recycler, state, false);
            } else {
                int fixLayoutStartGapExpose = fixLayoutStartGapExpose(i3, recycler, state, true);
                i4 = i3 + fixLayoutStartGapExpose;
                i5 = i2 + fixLayoutStartGapExpose;
                fixLayoutEndGapExpose = fixLayoutEndGapExpose(i5, recycler, state, false);
            }
            i3 = i4 + fixLayoutEndGapExpose;
            i2 = i5 + fixLayoutEndGapExpose;
        }
        layoutForPredictiveAnimationsExpose(recycler, state, i3, i2);
        if (!state.isPreLayout()) {
            this.mCurrentPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
            this.mOrientationHelper.onLayoutComplete();
        }
        this.mLastStackFromEnd = getStackFromEnd();
        this.mCurrentPendingSavedState = null;
        validateChildOrderExpose();
    }

    /* renamed from: com_alibaba_android_vlayout_ExposeLinearLayoutManagerEx__scrollHorizontallyBy$___twin___ */
    public int m20003x3c18b2aa(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getOrientation() == 1) {
            return 0;
        }
        return scrollInternalBy(i, recycler, state);
    }

    /* renamed from: com_alibaba_android_vlayout_ExposeLinearLayoutManagerEx__scrollVerticallyBy$___twin___ */
    public int m20002x27cf9e98(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getOrientation() == 0) {
            return 0;
        }
        return scrollInternalBy(i, recycler, state);
    }

    public void recycleChildren(RecyclerView.Recycler recycler, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 > i) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                removeAndRecycleViewAt(i3, recycler);
            }
            return;
        }
        while (i > i2) {
            removeAndRecycleViewAt(i, recycler);
            i--;
        }
    }

    public int scrollInternalBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i2;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        this.mLayoutState.mRecycle = true;
        ensureLayoutStateExpose();
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        updateLayoutStateExpose(i2, abs, true, state);
        int i3 = this.mLayoutState.mScrollingOffset;
        LayoutState layoutState = this.mLayoutState;
        layoutState.mOnRefresLayout = false;
        int fill = i3 + fill(recycler, layoutState, state, false);
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i = i2 * fill;
        }
        this.mOrientationHelper.offsetChildren(-i);
        return i;
    }

    public ExposeLinearLayoutManagerEx(Context context, int i, boolean z) {
        super(context, i, z);
        this.mCurrentPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.layoutInfoList = new SparseArray<>(20);
        this.emptyArgs = new Object[0];
        this.layoutChunkResultCache = new LayoutChunkResult();
        this.mAnchorInfo = new AnchorInfo();
        setOrientation(i);
        setReverseLayout(z);
        this.mChildHelperWrapper = new ChildHelperWrapper(this);
        try {
            this.mEnsureLayoutStateMethod = LinearLayoutManager.class.getDeclaredMethod("ensureLayoutState", new Class[0]);
            this.mEnsureLayoutStateMethod.setAccessible(true);
            try {
                Method declaredMethod = RecyclerView.LayoutManager.class.getDeclaredMethod("setItemPrefetchEnabled", Boolean.TYPE);
                if (declaredMethod != null) {
                    declaredMethod.invoke(this, Boolean.FALSE);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private View findReferenceChildInternal(int i, int i2, int i3) {
        int i4;
        ensureLayoutStateExpose();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.mOrientationHelper.getDecoratedStart(childAt) < endAfterPadding && this.mOrientationHelper.getDecoratedEnd(childAt) >= startAfterPadding) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* renamed from: com_alibaba_android_vlayout_ExposeLinearLayoutManagerEx_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_scrollHorizontallyBy */
    public static int m20001x7d8a3a06(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            return exposeLinearLayoutManagerEx.m20003x3c18b2aa(i, recycler, state);
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    /* renamed from: com_alibaba_android_vlayout_ExposeLinearLayoutManagerEx_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_scrollVerticallyBy */
    public static int m20000xb096cbd8(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            return exposeLinearLayoutManagerEx.m20002x27cf9e98(i, recycler, state);
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    private int fixLayoutEndGapExpose(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int endAfterPadding;
        int endAfterPadding2 = this.mOrientationHelper.getEndAfterPadding() - i;
        if (endAfterPadding2 > 0) {
            int i2 = -scrollInternalBy(-endAfterPadding2, recycler, state);
            int i3 = i + i2;
            if (z && (endAfterPadding = this.mOrientationHelper.getEndAfterPadding() - i3) > 0) {
                this.mOrientationHelper.offsetChildren(endAfterPadding);
                return endAfterPadding + i2;
            }
            return i2;
        }
        return 0;
    }

    private int fixLayoutStartGapExpose(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int startAfterPadding;
        int startAfterPadding2 = i - this.mOrientationHelper.getStartAfterPadding();
        if (startAfterPadding2 > 0) {
            int i2 = -scrollInternalBy(startAfterPadding2, recycler, state);
            int i3 = i + i2;
            if (z && (startAfterPadding = i3 - this.mOrientationHelper.getStartAfterPadding()) > 0) {
                this.mOrientationHelper.offsetChildren(-startAfterPadding);
                return i2 - startAfterPadding;
            }
            return i2;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int convertFocusDirectionToLayoutDirectionExpose;
        View myFindReferenceChildClosestToEnd;
        View childClosestToEndExpose;
        myResolveShouldLayoutReverse();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirectionExpose = convertFocusDirectionToLayoutDirectionExpose(i)) == Integer.MIN_VALUE) {
            return null;
        }
        if (convertFocusDirectionToLayoutDirectionExpose == -1) {
            myFindReferenceChildClosestToEnd = myFindReferenceChildClosestToStart(state);
        } else {
            myFindReferenceChildClosestToEnd = myFindReferenceChildClosestToEnd(state);
        }
        if (myFindReferenceChildClosestToEnd == null) {
            return null;
        }
        ensureLayoutStateExpose();
        updateLayoutStateExpose(convertFocusDirectionToLayoutDirectionExpose, (int) (this.mOrientationHelper.getTotalSpace() * 0.33f), false, state);
        LayoutState layoutState = this.mLayoutState;
        layoutState.mScrollingOffset = Integer.MIN_VALUE;
        layoutState.mRecycle = false;
        layoutState.mOnRefresLayout = false;
        fill(recycler, layoutState, state, true);
        if (convertFocusDirectionToLayoutDirectionExpose == -1) {
            childClosestToEndExpose = getChildClosestToStartExpose();
        } else {
            childClosestToEndExpose = getChildClosestToEndExpose();
        }
        if (childClosestToEndExpose == myFindReferenceChildClosestToEnd || !childClosestToEndExpose.isFocusable()) {
            return null;
        }
        return childClosestToEndExpose;
    }

    private void layoutForPredictiveAnimationsExpose(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        if (state.willRunPredictiveAnimations() && getChildCount() != 0 && !state.isPreLayout() && supportsPredictiveItemAnimations()) {
            List<RecyclerView.ViewHolder> scrapList = recycler.getScrapList();
            int size = scrapList.size();
            int position = getPosition(getChildAt(0));
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                i3 = -1;
                if (i5 >= size) {
                    break;
                }
                RecyclerView.ViewHolder viewHolder = scrapList.get(i5);
                if (viewHolder.getPosition() < position) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != this.mShouldReverseLayoutExpose) {
                    i6 += this.mOrientationHelper.getDecoratedMeasurement(viewHolder.itemView);
                } else {
                    i7 += this.mOrientationHelper.getDecoratedMeasurement(viewHolder.itemView);
                }
                i5++;
            }
            this.mLayoutState.mScrapList = scrapList;
            if (i6 > 0) {
                updateLayoutStateToFillStartExpose(getPosition(getChildClosestToStartExpose()), i);
                LayoutState layoutState = this.mLayoutState;
                layoutState.mExtra = i6;
                layoutState.mAvailable = 0;
                int i8 = layoutState.mCurrentPosition;
                if (this.mShouldReverseLayoutExpose) {
                    i4 = 1;
                } else {
                    i4 = -1;
                }
                layoutState.mCurrentPosition = i8 + i4;
                LayoutState layoutState2 = this.mLayoutState;
                layoutState2.mOnRefresLayout = true;
                fill(recycler, layoutState2, state, false);
            }
            if (i7 > 0) {
                updateLayoutStateToFillEndExpose(getPosition(getChildClosestToEndExpose()), i2);
                LayoutState layoutState3 = this.mLayoutState;
                layoutState3.mExtra = i7;
                layoutState3.mAvailable = 0;
                int i9 = layoutState3.mCurrentPosition;
                if (!this.mShouldReverseLayoutExpose) {
                    i3 = 1;
                }
                layoutState3.mCurrentPosition = i9 + i3;
                LayoutState layoutState4 = this.mLayoutState;
                layoutState4.mOnRefresLayout = true;
                fill(recycler, layoutState4, state, false);
            }
            this.mLayoutState.mScrapList = null;
        }
    }

    public int fill(RecyclerView.Recycler recycler, LayoutState layoutState, RecyclerView.State state, boolean z) {
        int i = layoutState.mAvailable;
        if (layoutState.mScrollingOffset != Integer.MIN_VALUE) {
            if (layoutState.mAvailable < 0) {
                layoutState.mScrollingOffset += layoutState.mAvailable;
            }
            recycleByLayoutStateExpose(recycler, layoutState);
        }
        int i2 = layoutState.mAvailable + layoutState.mExtra + this.recycleOffset;
        boolean z2 = false;
        while (i2 > 0 && layoutState.hasMore(state)) {
            this.layoutChunkResultCache.resetInternal();
            layoutChunk(recycler, state, layoutState, this.layoutChunkResultCache);
            if (this.layoutChunkResultCache.mFinished) {
                break;
            }
            layoutState.mOffset += this.layoutChunkResultCache.mConsumed * layoutState.mLayoutDirection;
            if (!this.layoutChunkResultCache.mIgnoreConsumed || this.mLayoutState.mScrapList != null || !state.isPreLayout()) {
                layoutState.mAvailable -= this.layoutChunkResultCache.mConsumed;
                i2 -= this.layoutChunkResultCache.mConsumed;
            }
            if (layoutState.mScrollingOffset != Integer.MIN_VALUE) {
                layoutState.mScrollingOffset += this.layoutChunkResultCache.mConsumed;
                if (layoutState.mAvailable < 0) {
                    layoutState.mScrollingOffset += layoutState.mAvailable;
                }
                recycleByLayoutStateExpose(recycler, layoutState);
            }
            if (z && this.layoutChunkResultCache.mFocusable) {
                break;
            }
            z2 = true;
        }
        validateChildOrderExpose();
        if (z2) {
            updateCardLayoutInfo();
        }
        return i - layoutState.mAvailable;
    }

    public void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutState layoutState, LayoutChunkResult layoutChunkResult) {
        boolean z;
        int paddingTop;
        int decoratedMeasurementInOther;
        int i;
        int i2;
        boolean z2;
        View next = layoutState.next(recycler);
        if (next == null) {
            if (layoutState.mScrapList != null) {
                layoutChunkResult.mFinished = true;
                return;
            }
            throw new RuntimeException("received null view when unexpected");
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) next.getLayoutParams();
        if (layoutState.mScrapList == null) {
            boolean z3 = this.mShouldReverseLayoutExpose;
            if (layoutState.mLayoutDirection == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                addView(next);
            } else {
                addView(next, 0);
            }
        } else {
            boolean z4 = this.mShouldReverseLayoutExpose;
            if (layoutState.mLayoutDirection == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                addDisappearingView(next);
            } else {
                addDisappearingView(next, 0);
            }
        }
        measureChildWithMargins(next, 0, 0);
        layoutChunkResult.mConsumed = this.mOrientationHelper.getDecoratedMeasurement(next);
        if (getOrientation() == 1) {
            if (isLayoutRTL()) {
                i2 = getWidth() - getPaddingRight();
                i = i2 - this.mOrientationHelper.getDecoratedMeasurementInOther(next);
            } else {
                i = getPaddingLeft();
                i2 = this.mOrientationHelper.getDecoratedMeasurementInOther(next) + i;
            }
            if (layoutState.mLayoutDirection == -1) {
                decoratedMeasurementInOther = layoutState.mOffset;
                paddingTop = layoutState.mOffset - layoutChunkResult.mConsumed;
            } else {
                paddingTop = layoutState.mOffset;
                decoratedMeasurementInOther = layoutState.mOffset + layoutChunkResult.mConsumed;
            }
        } else {
            paddingTop = getPaddingTop();
            decoratedMeasurementInOther = this.mOrientationHelper.getDecoratedMeasurementInOther(next) + paddingTop;
            if (layoutState.mLayoutDirection == -1) {
                i2 = layoutState.mOffset;
                i = layoutState.mOffset - layoutChunkResult.mConsumed;
            } else {
                i = layoutState.mOffset;
                i2 = layoutState.mOffset + layoutChunkResult.mConsumed;
            }
        }
        layoutDecorated(next, i + layoutParams.leftMargin, layoutParams.topMargin + paddingTop, i2 - layoutParams.rightMargin, decoratedMeasurementInOther - layoutParams.bottomMargin);
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            layoutChunkResult.mIgnoreConsumed = true;
        }
        layoutChunkResult.mFocusable = next.isFocusable();
    }

    public void updateLayoutStateExpose(int i, int i2, boolean z, RecyclerView.State state) {
        int startAfterPadding;
        this.mLayoutState.mExtra = getExtraLayoutSpace(state);
        LayoutState layoutState = this.mLayoutState;
        layoutState.mLayoutDirection = i;
        int i3 = -1;
        if (i == 1) {
            layoutState.mExtra += this.mOrientationHelper.getEndPadding();
            View childClosestToEndExpose = getChildClosestToEndExpose();
            LayoutState layoutState2 = this.mLayoutState;
            if (!this.mShouldReverseLayoutExpose) {
                i3 = 1;
            }
            layoutState2.mItemDirection = i3;
            this.mLayoutState.mCurrentPosition = getPosition(childClosestToEndExpose) + this.mLayoutState.mItemDirection;
            this.mLayoutState.mOffset = this.mOrientationHelper.getDecoratedEnd(childClosestToEndExpose) + computeAlignOffset(childClosestToEndExpose, true, false);
            startAfterPadding = this.mLayoutState.mOffset - this.mOrientationHelper.getEndAfterPadding();
        } else {
            View childClosestToStartExpose = getChildClosestToStartExpose();
            this.mLayoutState.mExtra += this.mOrientationHelper.getStartAfterPadding();
            LayoutState layoutState3 = this.mLayoutState;
            if (this.mShouldReverseLayoutExpose) {
                i3 = 1;
            }
            layoutState3.mItemDirection = i3;
            this.mLayoutState.mCurrentPosition = getPosition(childClosestToStartExpose) + this.mLayoutState.mItemDirection;
            this.mLayoutState.mOffset = this.mOrientationHelper.getDecoratedStart(childClosestToStartExpose) + computeAlignOffset(childClosestToStartExpose, false, false);
            startAfterPadding = (-this.mLayoutState.mOffset) + this.mOrientationHelper.getStartAfterPadding();
        }
        LayoutState layoutState4 = this.mLayoutState;
        layoutState4.mAvailable = i2;
        if (z) {
            layoutState4.mAvailable -= startAfterPadding;
        }
        this.mLayoutState.mScrollingOffset = startAfterPadding;
    }
}
