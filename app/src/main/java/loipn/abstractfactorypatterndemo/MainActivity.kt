package loipn.abstractfactorypatterndemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import loipn.abstractfactorypatterndemo.factory.AbstractFactory
import loipn.abstractfactorypatterndemo.factory.FactoryProducer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shapeFactory = FactoryProducer.getFactory("SHAPE")
        val rec = shapeFactory?.getShape("RECTANGLE")
        val cir = shapeFactory?.getShape("CIRCLE")

        val colorFactory = FactoryProducer.getFactory("COLOR")
        val red = colorFactory?.getColor("RED")
        val blu = colorFactory?.getColor("BLUE")

        rec?.draw()
        cir?.draw()
        red?.fill()
        blu?.fill()
    }
}
