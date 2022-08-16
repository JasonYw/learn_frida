package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewConfigurationCompat;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p003X.AbstractC138401cwv;
import p003X.AbstractC138414cx8;
import p003X.AbstractMenuC138417cxB;
import p003X.SubMenuC138412cx6;

/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: classes17.dex */
public class C0199g implements AbstractMenuC138417cxB {
    public static final int[] sCategoryToOrder = {1, 4, 5, 3, 2, 0};
    public AbstractC138401cwv mCallback;
    public final Context mContext;
    public ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    public int mDefaultShowAsAction;
    public C0200i mExpandedItem;
    public Drawable mHeaderIcon;
    public CharSequence mHeaderTitle;
    public View mHeaderView;
    public boolean mIsClosing;
    public boolean mItemsChangedWhileDispatchPrevented;
    public boolean mOptionalIconsVisible;
    public boolean mOverrideVisibleItems;
    public boolean mPreventDispatchingItemsChanged;
    public boolean mQwertyMode;
    public final Resources mResources;
    public boolean mShortcutsVisible;
    public boolean mStructureChangedWhileDispatchPrevented;
    public ArrayList<C0200i> mTempShortcutItemList = new ArrayList<>();
    public CopyOnWriteArrayList<WeakReference<AbstractC0201m>> mPresenters = new CopyOnWriteArrayList<>();
    public boolean mGroupDividerEnabled = false;
    public ArrayList<C0200i> mItems = new ArrayList<>();
    public ArrayList<C0200i> mVisibleItems = new ArrayList<>();
    public boolean mIsVisibleItemsStale = true;
    public ArrayList<C0200i> mActionItems = new ArrayList<>();
    public ArrayList<C0200i> mNonActionItems = new ArrayList<>();
    public boolean mIsActionItemsStale = true;

    public String getActionViewStatesKey() {
        return "android:menu:actionviewstates";
    }

    public C0199g getRootMenu() {
        return this;
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    public boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    public void changeMenuMode() {
        AbstractC138401cwv abstractC138401cwv = this.mCallback;
        if (abstractC138401cwv != null) {
            abstractC138401cwv.onMenuModeChange(this);
        }
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }

    public ArrayList<C0200i> getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    public ArrayList<C0200i> getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    @Override // android.view.Menu
    public int size() {
        return this.mItems.size();
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }

    public void stopDispatchingItemsChanged() {
        if (!this.mPreventDispatchingItemsChanged) {
            this.mPreventDispatchingItemsChanged = true;
            this.mItemsChangedWhileDispatchPrevented = false;
            this.mStructureChangedWhileDispatchPrevented = false;
        }
    }

    static {
        Covode.recordClassIndex(554);
    }

    @Override // android.view.Menu
    public void clear() {
        C0200i c0200i = this.mExpandedItem;
        if (c0200i != null) {
            collapseItemActionView(c0200i);
        }
        this.mItems.clear();
        onItemsChanged(true);
    }

    public void clearAll() {
        this.mPreventDispatchingItemsChanged = true;
        clear();
        clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        onItemsChanged(true);
    }

    public ArrayList<C0200i> getVisibleItems() {
        if (!this.mIsVisibleItemsStale) {
            return this.mVisibleItems;
        }
        this.mVisibleItems.clear();
        int size = this.mItems.size();
        for (int i = 0; i < size; i++) {
            C0200i c0200i = this.mItems.get(i);
            if (c0200i.isVisible()) {
                this.mVisibleItems.add(c0200i);
            }
        }
        this.mIsVisibleItemsStale = false;
        this.mIsActionItemsStale = true;
        return this.mVisibleItems;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.mItems.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void flagActionItems() {
        ArrayList<C0200i> visibleItems = getVisibleItems();
        if (!this.mIsActionItemsStale) {
            return;
        }
        Iterator<WeakReference<AbstractC0201m>> it = this.mPresenters.iterator();
        boolean z = false;
        while (it.hasNext()) {
            WeakReference<AbstractC0201m> next = it.next();
            AbstractC0201m abstractC0201m = next.get();
            if (abstractC0201m == null) {
                this.mPresenters.remove(next);
            } else {
                z |= abstractC0201m.flagActionItems();
            }
        }
        if (z) {
            this.mActionItems.clear();
            this.mNonActionItems.clear();
            int size = visibleItems.size();
            for (int i = 0; i < size; i++) {
                C0200i c0200i = visibleItems.get(i);
                if (c0200i.LJI()) {
                    this.mActionItems.add(c0200i);
                } else {
                    this.mNonActionItems.add(c0200i);
                }
            }
        } else {
            this.mActionItems.clear();
            this.mNonActionItems.clear();
            this.mNonActionItems.addAll(getVisibleItems());
        }
        this.mIsActionItemsStale = false;
    }

    public void restorePresenterStates(Bundle bundle) {
        dispatchRestoreInstanceState(bundle);
    }

    public void savePresenterStates(Bundle bundle) {
        dispatchSaveInstanceState(bundle);
    }

    public void setCallback(AbstractC138401cwv abstractC138401cwv) {
        this.mCallback = abstractC138401cwv;
    }

    public C0199g setDefaultShowAsAction(int i) {
        this.mDefaultShowAsAction = i;
        return this;
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.mGroupDividerEnabled = z;
    }

    public void addMenuPresenter(AbstractC0201m abstractC0201m) {
        addMenuPresenter(abstractC0201m, this.mContext);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public int findGroupIndex(int i) {
        return findGroupIndex(i, 0);
    }

    public void onItemActionRequestChanged(C0200i c0200i) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemVisibleChanged(C0200i c0200i) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public void removeItemAt(int i) {
        removeItemAtInt(i, true);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.mQwertyMode = z;
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return addInternal(0, 0, 0, this.mResources.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.mResources.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.mItems.get(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        removeItemAtInt(findItemIndex(i), true);
    }

    public C0199g setHeaderIconInt(int i) {
        setHeaderInternal(0, null, i, null, null);
        return this;
    }

    public C0199g setHeaderTitleInt(int i) {
        setHeaderInternal(i, null, 0, null, null);
        return this;
    }

    public C0199g setHeaderViewInt(View view) {
        setHeaderInternal(0, null, 0, null, view);
        return this;
    }

    public void setShortcutsVisible(boolean z) {
        if (this.mShortcutsVisible == z) {
            return;
        }
        setShortcutsVisibleInner(z);
        onItemsChanged(false);
    }

    public static int getOrdering(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = sCategoryToOrder;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void setShortcutsVisibleInner(boolean z) {
        boolean z2 = true;
        if (!z || this.mResources.getConfiguration().keyboard == 1 || !ViewConfigurationCompat.shouldShowMenuShortcutsWhenKeyboardPresent(ViewConfiguration.get(this.mContext), this.mContext)) {
            z2 = false;
        }
        this.mShortcutsVisible = z2;
    }

    public int findItemIndex(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.mItems.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public void onItemsChanged(boolean z) {
        if (!this.mPreventDispatchingItemsChanged) {
            if (z) {
                this.mIsVisibleItemsStale = true;
                this.mIsActionItemsStale = true;
            }
            dispatchPresenterUpdate(z);
            return;
        }
        this.mItemsChangedWhileDispatchPrevented = true;
        if (z) {
            this.mStructureChangedWhileDispatchPrevented = true;
        }
    }

    public C0199g setHeaderIconInt(Drawable drawable) {
        setHeaderInternal(0, null, 0, drawable, null);
        return this;
    }

    public C0199g setHeaderTitleInt(CharSequence charSequence) {
        setHeaderInternal(0, charSequence, 0, null, null);
        return this;
    }

    private void dispatchPresenterUpdate(boolean z) {
        if (this.mPresenters.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        Iterator<WeakReference<AbstractC0201m>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC0201m> next = it.next();
            AbstractC0201m abstractC0201m = next.get();
            if (abstractC0201m == null) {
                this.mPresenters.remove(next);
            } else {
                abstractC0201m.updateMenuView(z);
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    public final void close(boolean z) {
        if (this.mIsClosing) {
            return;
        }
        this.mIsClosing = true;
        Iterator<WeakReference<AbstractC0201m>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC0201m> next = it.next();
            AbstractC0201m abstractC0201m = next.get();
            if (abstractC0201m == null) {
                this.mPresenters.remove(next);
            } else {
                abstractC0201m.onCloseMenu(this, z);
            }
        }
        this.mIsClosing = false;
    }

    public boolean collapseItemActionView(C0200i c0200i) {
        boolean z = false;
        if (!this.mPresenters.isEmpty() && this.mExpandedItem == c0200i) {
            stopDispatchingItemsChanged();
            Iterator<WeakReference<AbstractC0201m>> it = this.mPresenters.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC0201m> next = it.next();
                AbstractC0201m abstractC0201m = next.get();
                if (abstractC0201m == null) {
                    this.mPresenters.remove(next);
                } else {
                    z = abstractC0201m.collapseItemActionView(this, c0200i);
                    if (z) {
                        break;
                    }
                }
            }
            startDispatchingItemsChanged();
            if (z) {
                this.mExpandedItem = null;
            }
        }
        return z;
    }

    public boolean expandItemActionView(C0200i c0200i) {
        boolean z = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        Iterator<WeakReference<AbstractC0201m>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC0201m> next = it.next();
            AbstractC0201m abstractC0201m = next.get();
            if (abstractC0201m == null) {
                this.mPresenters.remove(next);
            } else {
                z = abstractC0201m.expandItemActionView(this, c0200i);
                if (z) {
                    break;
                }
            }
        }
        startDispatchingItemsChanged();
        if (z) {
            this.mExpandedItem = c0200i;
        }
        return z;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0200i c0200i = this.mItems.get(i2);
            if (c0200i.getItemId() == i) {
                return c0200i;
            }
            if (c0200i.hasSubMenu() && (findItem = c0200i.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int findGroupIndex = findGroupIndex(i);
        if (findGroupIndex >= 0) {
            int size = this.mItems.size() - findGroupIndex;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.mItems.get(findGroupIndex).getGroupId() != i) {
                    break;
                }
                removeItemAtInt(findGroupIndex, false);
                i2 = i3;
            }
            onItemsChanged(true);
        }
    }

    public void removeMenuPresenter(AbstractC0201m abstractC0201m) {
        Iterator<WeakReference<AbstractC0201m>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC0201m> next = it.next();
            AbstractC0201m abstractC0201m2 = next.get();
            if (abstractC0201m2 == null || abstractC0201m2 == abstractC0201m) {
                this.mPresenters.remove(next);
            }
        }
    }

    public void setExclusiveItemChecked(MenuItem menuItem) {
        boolean z;
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        stopDispatchingItemsChanged();
        for (int i = 0; i < size; i++) {
            C0200i c0200i = this.mItems.get(i);
            if (c0200i.getGroupId() == groupId && c0200i.LJFF() && c0200i.isCheckable()) {
                if (c0200i == menuItem) {
                    z = true;
                } else {
                    z = false;
                }
                c0200i.LIZIZ(z);
            }
        }
        startDispatchingItemsChanged();
    }

    public C0199g(Context context) {
        this.mContext = context;
        this.mResources = context.getResources();
        setShortcutsVisibleInner(true);
    }

    private void dispatchRestoreInstanceState(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.mPresenters.isEmpty()) {
            Iterator<WeakReference<AbstractC0201m>> it = this.mPresenters.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC0201m> next = it.next();
                AbstractC0201m abstractC0201m = next.get();
                if (abstractC0201m == null) {
                    this.mPresenters.remove(next);
                } else {
                    int id = abstractC0201m.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        abstractC0201m.onRestoreInstanceState(parcelable);
                    }
                }
            }
        }
    }

    private void dispatchSaveInstanceState(Bundle bundle) {
        Parcelable onSaveInstanceState;
        if (this.mPresenters.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<AbstractC0201m>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC0201m> next = it.next();
            AbstractC0201m abstractC0201m = next.get();
            if (abstractC0201m == null) {
                this.mPresenters.remove(next);
            } else {
                int id = abstractC0201m.getId();
                if (id > 0 && (onSaveInstanceState = abstractC0201m.onSaveInstanceState()) != null) {
                    sparseArray.put(id, onSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((C0199g) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 > 0 && (findItem = findItem(i2)) != null) {
            findItem.expandActionView();
        }
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0199g) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public boolean performItemAction(MenuItem menuItem, int i) {
        return performItemAction(menuItem, null, i);
    }

    public boolean dispatchMenuItemSelected(C0199g c0199g, MenuItem menuItem) {
        AbstractC138401cwv abstractC138401cwv = this.mCallback;
        if (abstractC138401cwv != null && abstractC138401cwv.onMenuItemSelected(c0199g, menuItem)) {
            return true;
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        if (findItemWithShortcutForKey(i, keyEvent) != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return performItemAction(findItem(i), i2);
    }

    public static int findInsertIndex(ArrayList<C0200i> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).LIZ <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    private void removeItemAtInt(int i, boolean z) {
        if (i >= 0 && i < this.mItems.size()) {
            this.mItems.remove(i);
            if (z) {
                onItemsChanged(true);
            }
        }
    }

    public void addMenuPresenter(AbstractC0201m abstractC0201m, Context context) {
        this.mPresenters.add(new WeakReference<>(abstractC0201m));
        abstractC0201m.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }

    public int findGroupIndex(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.mItems.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0200i c0200i = this.mItems.get(i2);
            if (c0200i.getGroupId() == i) {
                c0200i.setEnabled(z);
            }
        }
    }

    private boolean dispatchSubMenuSelected(SubMenuC138412cx6 subMenuC138412cx6, AbstractC0201m abstractC0201m) {
        boolean z = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        if (abstractC0201m != null) {
            z = abstractC0201m.onSubMenuSelected(subMenuC138412cx6);
        }
        Iterator<WeakReference<AbstractC0201m>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC0201m> next = it.next();
            AbstractC0201m abstractC0201m2 = next.get();
            if (abstractC0201m2 == null) {
                this.mPresenters.remove(next);
            } else if (!z) {
                z = abstractC0201m2.onSubMenuSelected(subMenuC138412cx6);
            }
        }
        return z;
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.mItems.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0200i c0200i = this.mItems.get(i2);
            if (c0200i.getGroupId() == i && c0200i.LIZJ(z)) {
                z2 = true;
            }
        }
        if (z2) {
            onItemsChanged(true);
        }
    }

    public C0200i findItemWithShortcutForKey(int i, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<C0200i> arrayList = this.mTempShortcutItemList;
        arrayList.clear();
        findItemsWithShortcutForKey(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean isQwertyMode = isQwertyMode();
        for (int i2 = 0; i2 < size; i2++) {
            C0200i c0200i = arrayList.get(i2);
            if (isQwertyMode) {
                numericShortcut = c0200i.getAlphabeticShortcut();
            } else {
                numericShortcut = c0200i.getNumericShortcut();
            }
            if ((numericShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((numericShortcut == keyData.meta[2] && (metaState & 2) != 0) || (isQwertyMode && numericShortcut == '\b' && i == 67))) {
                return c0200i;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        C0200i findItemWithShortcutForKey = findItemWithShortcutForKey(i, keyEvent);
        if (findItemWithShortcutForKey != null) {
            z = performItemAction(findItemWithShortcutForKey, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            close(true);
        }
        return z;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0200i c0200i = this.mItems.get(i2);
            if (c0200i.getGroupId() == i) {
                c0200i.LIZ(z2);
                c0200i.setCheckable(z);
            }
        }
    }

    public void findItemsWithShortcutForKey(List<C0200i> list, int i, KeyEvent keyEvent) {
        char numericShortcut;
        int numericModifiers;
        boolean isQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i != 67) {
            return;
        }
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0200i c0200i = this.mItems.get(i2);
            if (c0200i.hasSubMenu()) {
                ((C0199g) c0200i.getSubMenu()).findItemsWithShortcutForKey(list, i, keyEvent);
            }
            if (isQwertyMode) {
                numericShortcut = c0200i.getAlphabeticShortcut();
                numericModifiers = c0200i.getAlphabeticModifiers();
            } else {
                numericShortcut = c0200i.getNumericShortcut();
                numericModifiers = c0200i.getNumericModifiers();
            }
            if ((modifiers & 69647) == (numericModifiers & 69647) && numericShortcut != 0 && ((numericShortcut == keyData.meta[0] || numericShortcut == keyData.meta[2] || (isQwertyMode && numericShortcut == '\b' && i == 67)) && c0200i.isEnabled())) {
                list.add(c0200i);
            }
        }
    }

    public boolean performItemAction(MenuItem menuItem, AbstractC0201m abstractC0201m, int i) {
        boolean z;
        C0200i c0200i = (C0200i) menuItem;
        if (c0200i == null || !c0200i.isEnabled()) {
            return false;
        }
        boolean LIZIZ = c0200i.LIZIZ();
        AbstractC138414cx8 LIZ = c0200i.LIZ();
        if (LIZ != null && LIZ.hasSubMenu()) {
            z = true;
        } else {
            z = false;
        }
        if (c0200i.LJIIJ()) {
            LIZIZ |= c0200i.expandActionView();
            if (LIZIZ) {
                close(true);
            }
        } else if (!c0200i.hasSubMenu() && !z) {
            if ((i & 1) == 0) {
                close(true);
                return LIZIZ;
            }
        } else {
            if ((i & 4) == 0) {
                close(false);
            }
            if (!c0200i.hasSubMenu()) {
                c0200i.LIZ(new SubMenuC138412cx6(this.mContext, this, c0200i));
            }
            SubMenuC138412cx6 subMenuC138412cx6 = (SubMenuC138412cx6) c0200i.getSubMenu();
            if (z) {
                LIZ.onPrepareSubMenu(subMenuC138412cx6);
            }
            LIZIZ |= dispatchSubMenuSelected(subMenuC138412cx6, abstractC0201m);
            if (!LIZIZ) {
                close(true);
                return LIZIZ;
            }
        }
        return LIZIZ;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return addInternal(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return addInternal(i, i2, i3, this.mResources.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.mResources.getString(i4));
    }

    public MenuItem addInternal(int i, int i2, int i3, CharSequence charSequence) {
        int ordering = getOrdering(i3);
        C0200i createNewMenuItem = createNewMenuItem(i, i2, i3, ordering, charSequence, this.mDefaultShowAsAction);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.mCurrentMenuInfo;
        if (contextMenuInfo != null) {
            createNewMenuItem.LJFF = contextMenuInfo;
        }
        ArrayList<C0200i> arrayList = this.mItems;
        arrayList.add(findInsertIndex(arrayList, ordering), createNewMenuItem);
        onItemsChanged(true);
        return createNewMenuItem;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0200i c0200i = (C0200i) addInternal(i, i2, i3, charSequence);
        SubMenuC138412cx6 subMenuC138412cx6 = new SubMenuC138412cx6(this.mContext, this, c0200i);
        c0200i.LIZ(subMenuC138412cx6);
        return subMenuC138412cx6;
    }

    private void setHeaderInternal(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.mResources;
        if (view != null) {
            this.mHeaderView = view;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        } else {
            if (i > 0) {
                this.mHeaderTitle = resources.getText(i);
            } else if (charSequence != null) {
                this.mHeaderTitle = charSequence;
            }
            if (i2 > 0) {
                this.mHeaderIcon = ContextCompat.getDrawable(this.mContext, i2);
            } else if (drawable != null) {
                this.mHeaderIcon = drawable;
            }
            this.mHeaderView = null;
        }
        onItemsChanged(false);
    }

    private C0200i createNewMenuItem(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0200i(this, i, i2, i3, i4, charSequence, i5);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        PackageManager packageManager = this.mContext.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < i5; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            if (resolveInfo.specificIndex < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[resolveInfo.specificIndex];
            }
            Intent intent3 = new Intent(intent2);
            intent3.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent4;
            }
        }
        return i5;
    }
}
