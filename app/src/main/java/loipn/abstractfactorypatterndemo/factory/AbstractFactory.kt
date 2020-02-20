package loipn.abstractfactorypatterndemo.factory

import loipn.abstractfactorypatterndemo.model.Color
import loipn.abstractfactorypatterndemo.model.Shape

/**
 * Copyright (c) 2020, loiphan. All rights reserved.
 *
 * @author loiphan <loipn1804@gmail.com>
 * @since February 21, 2020
 * @version 1.0
 */
interface AbstractFactory {

    fun getShape(shape: String): Shape?

    fun getColor(color: String): Color?
}