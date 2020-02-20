package loipn.abstractfactorypatterndemo.factory

import loipn.abstractfactorypatterndemo.model.Blue
import loipn.abstractfactorypatterndemo.model.Color
import loipn.abstractfactorypatterndemo.model.Red
import loipn.abstractfactorypatterndemo.model.Shape

/**
 * Copyright (c) 2020, loiphan. All rights reserved.
 *
 * @author loiphan <loipn1804@gmail.com>
 * @since February 21, 2020
 * @version 1.0
 */
class ColorFactory: AbstractFactory() {

    override fun getShape(shape: String): Shape? {
        return null
    }

    override fun getColor(color: String): Color? {
        return when (color) {
            "RED" -> Red()
            "BLUE" -> Blue()
            else -> null
        }
    }
}