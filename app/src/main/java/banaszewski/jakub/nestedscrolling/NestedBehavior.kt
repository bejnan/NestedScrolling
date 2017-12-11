package banaszewski.jakub.nestedscrolling

import android.content.Context
import android.support.design.widget.CoordinatorLayout
import android.support.v4.widget.NestedScrollView
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.view.View

/**
 * Created by Jakub Banaszewski on 11/12/2017.
 */
class NestedBehavior<V : View> : CoordinatorLayout.Behavior<V> {
    constructor() : super()
    constructor(context : Context, attributeSet: AttributeSet ) : super(context, attributeSet)


    override fun onStartNestedScroll(coordinatorLayout: CoordinatorLayout, child: V, directTargetChild: View, target: View, axes: Int, type: Int): Boolean {
        return (child is NestedScrollView && directTargetChild is RecyclerView)
    }

    override fun onNestedPreScroll(coordinatorLayout: CoordinatorLayout, child: V, target: View, dx: Int, dy: Int, consumed: IntArray, type: Int) {
        child.scrollBy(0, dy)
        consumed[1] += dy;
        super.onNestedPreScroll(coordinatorLayout, child, target, dx, dy, consumed, type)
    }
}