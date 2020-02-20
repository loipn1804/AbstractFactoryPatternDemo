package loipn.abstractfactorypatterndemo.factory

import loipn.abstractfactorypatterndemo.model.*

/**
 * Copyright (c) 2020, loiphan. All rights reserved.
 *
 * @author loiphan <loipn1804@gmail.com>
 * @since February 21, 2020
 * @version 1.0
 */
class ShapeFactory: AbstractFactory() {

    override fun getShape(shape: String): Shape? {
        return when (shape) {
            "RECTANGLE" -> Rectangle()
            "CIRCLE" -> Circle()
            else -> null
        }
    }

    override fun getColor(color: String): Color? {
        return null
    }
}