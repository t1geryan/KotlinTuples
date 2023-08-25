/*
 * Copyright 2010-2018 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package tuples

import java.io.Serializable

data class Quadruple<out A, out B, out C, out D>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
) : Serializable {

    override fun toString() = "($first, $second, $third, $fourth)"
}

fun <T> Quadruple<T, T, T, T>.toList() = listOf(first, second, third, fourth)

data class Quintuple<out A, out B, out C, out D, out E>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E,
) : Serializable {

    override fun toString() = "($first, $second, $third, $fourth, $fifth)"
}

fun <T> Quintuple<T, T, T, T, T>.toList() = listOf(first, second, third, fourth, fifth)

data class Sextuple<out A, out B, out C, out D, out E, out F>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E,
    val sixth: F,
) : Serializable {

    override fun toString() = "($first, $second, $third, $fourth, $fifth, $sixth)"
}

fun <T> Sextuple<T, T, T, T, T, T>.toList() = listOf(first, second, third, fourth, fifth, sixth)

data class Septuple<out A, out B, out C, out D, out E, out F, out G>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E,
    val sixth: F,
    val seventh: G,
) : Serializable {

    override fun toString() = "($first, $second, $third, $fourth, $fifth, $sixth, $seventh)"
}

fun <T> Septuple<T, T, T, T, T, T, T>.toList() = listOf(first, second, third, fourth, fifth, sixth, seventh)

data class Octuple<out A, out B, out C, out D, out E, out F, out G, out H>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E,
    val sixth: F,
    val seventh: G,
    val eighth: H,
) : Serializable {

    override fun toString() = "($first, $second, $third, $fourth, $fifth, $sixth, $seventh, $eighth)"
}

fun <T> Octuple<T, T, T, T, T, T, T, T>.toList() = listOf(first, second, third, fourth, fifth, sixth, seventh, eighth)