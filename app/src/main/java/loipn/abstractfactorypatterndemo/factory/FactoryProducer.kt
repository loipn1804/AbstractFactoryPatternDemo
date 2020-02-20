package loipn.abstractfactorypatterndemo.factory

import loipn.abstractfactorypatterndemo.model.Blue
import loipn.abstractfactorypatterndemo.model.Red

/**
 * Copyright (c) 2020, loiphan. All rights reserved.
 *
 * @author loiphan <loipn1804@gmail.com>
 * @since February 21, 2020
 * @version 1.0
 */
object FactoryProducer {

    fun getFactory(type: String): AbstractFactory? {
        return when (type) {
            "SHAPE" -> ShapeFactory()
            "COLOR" -> ColorFactory()
            else -> null
        }
    }
}