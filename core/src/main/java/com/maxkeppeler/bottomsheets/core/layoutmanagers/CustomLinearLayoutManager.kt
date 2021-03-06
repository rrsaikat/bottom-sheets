/*
 *  Copyright (C) 2020. Maximilian Keppeler (https://www.maxkeppeler.com)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.maxkeppeler.bottomsheets.core.layoutmanagers

import android.content.Context
import androidx.annotation.RestrictTo
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
class CustomLinearLayoutManager(
    context: Context,
    private val scrollable: Boolean = false,
    @RecyclerView.Orientation orientation: Int = RecyclerView.VERTICAL,
    reverseLayout: Boolean = false
) : LinearLayoutManager(context, orientation, reverseLayout) {

    override fun canScrollVertically(): Boolean =
        scrollable && super.canScrollVertically()

    override fun canScrollHorizontally(): Boolean =
        scrollable && super.canScrollHorizontally()

}