/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.frontend.api.symbols

import org.jetbrains.kotlin.idea.frontend.api.symbols.markers.KtSymbolKind
import org.jetbrains.kotlin.idea.frontend.api.symbols.markers.KtSymbolWithKind
import org.jetbrains.kotlin.idea.frontend.api.symbols.pointers.KtSymbolPointer
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.name.FqName


abstract class KtClassLikeSymbol : KtSymbol, KtNamedSymbol, KtSymbolWithKind {
    abstract val classIdIfNonLocal: ClassId?

    abstract override fun createPointer(): KtSymbolPointer<KtClassLikeSymbol>
}

abstract class KtTypeAliasSymbol : KtClassLikeSymbol() {
    abstract override val classIdIfNonLocal: ClassId

    final override val symbolKind: KtSymbolKind get() = KtSymbolKind.TOP_LEVEL
    final override val containingNonLocalClassIdIfMember: ClassId? get() = null

    abstract override val containingPackageFqNameIfTopLevel: FqName

    abstract override fun createPointer(): KtSymbolPointer<KtTypeAliasSymbol>
}

abstract class KtClassOrObjectSymbol : KtClassLikeSymbol(),
    KtSymbolWithTypeParameters,
    KtSymbolWithModality<KtSymbolModality> {
    abstract val classKind: KtClassKind

    abstract override fun createPointer(): KtSymbolPointer<KtClassOrObjectSymbol>
}

enum class KtClassKind {
    CLASS, ENUM_CLASS, ENUM_ENTRY, ANNOTATION_CLASS, OBJECT, COMPANION_OBJECT, INTERFACE
}