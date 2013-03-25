import com.dvarelap.base.rest.FirstController
import javax.servlet.ServletContext
import org.scalatra.LifeCycle

class ScalatraBootstrap extends LifeCycle {

    val PREFIX = ""


    override def init(context: ServletContext) {
        context mount (new FirstController, "/*")
    }

    override def destroy(context: ServletContext) {
    }
}
