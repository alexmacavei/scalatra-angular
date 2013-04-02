import com.dvarelap.base.rest.FirstController
import javax.servlet.ServletContext
import org.scalatra.LifeCycle

class ScalatraBootstrap extends LifeCycle {

    val PREFIX = "/rest/"


    override def init(context: ServletContext) {
        context mount (new FirstController, "/rest/*")
    }

    override def destroy(context: ServletContext) {
    }
}
