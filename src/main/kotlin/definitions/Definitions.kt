/*
 * Copyright 2010-2018 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package definitions

import tuples.*

infix fun <A, B> A.also(other: B) = Pair(this, other)

infix fun <A, B, C> Pair<A, B>.also(other: C) = Triple(first, second, other)

infix fun <A, B, C, D> Triple<A, B, C>.also(other: D) = Quadruple(first, second, third, other)

infix fun <A, B, C, D, E> Quadruple<A, B, C, D>.also(other: E) = Quintuple(first, second, third, fourth, other)

infix fun <A, B, C, D, E, F> Quintuple<A, B, C, D, E>.also(other: F) = Sextuple(first, second, third, fourth, fifth, other)

infix fun <A, B, C, D, E, F, G> Sextuple<A, B, C, D, E, F>.also(other: G) = Septuple(first, second, third, fourth, fifth, sixth, other)

infix fun <A, B, C, D, E, F, G, H> Septuple<A, B, C, D, E, F, G>.also(other: H) = Octuple(first, second, third, fourth, fifth, sixth, seventh, other)

