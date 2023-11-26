/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.cupcake.data

import com.example.cupcake.R

object DataSource {
    val book_titles = listOf(
        R.string.book_ai,
        R.string.book_algorithms,
        R.string.book_networks,
        R.string.book_coding_universe,
        R.string.book_cyber_security,
        R.string.book_computing_evolution
    )

    val quantityOptions = listOf(
        Pair(R.string.ten_books, 10),
        Pair(R.string.fifty_books, 50),
        Pair(R.string.hundred_books, 100)
    )
}
